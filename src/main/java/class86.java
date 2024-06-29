import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public abstract class class86 extends class19 implements Runnable {

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "I")
    private int field2068 = 0;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "I")
    private int field2069 = 0;

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "I")
    private int field2075 = 0;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "I")
    private int field2066 = 0;

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "J")
    private long field2073 = 0L;

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "Z")
    private boolean field2076 = false;

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "[I")
    private int[] field2077 = new int[512];

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "I")
    private int field2079 = 256;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "I")
    private int field2070;

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "I")
    private int field2071;

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "I")
    private int field2078;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "J")
    private long field2067;

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "J")
    private long field2074;

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "[I")
    public static int[] field2072;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V", line = 4)
    private final void method732(int arg0) {
        int var2 = arg0 - this.field2079;
        int var3 = this.field2077[this.field2069];
        this.field2077[this.field2069] = var2;
        this.field2075 += var2 - var3;
        int var4 = this.field2069 + 1 & 0x1FF;
        if (var2 > this.field2068) {
            this.field2068 = var2;
        }
        if (var2 < this.field2066) {
            this.field2066 = var2;
        }
        if (this.field2068 == var3) {
            int var5 = var2;
            for (int var6 = var4; this.field2069 != var6 && var5 < this.field2068; var6 = var6 + 1 & 0x1FF) {
                int var7 = this.field2077[var6];
                if (var7 > var5) {
                    var5 = var7;
                }
            }
            this.field2068 = var5;
        }
        if (this.field2066 == var3) {
            int var8 = var2;
            for (int var9 = var4; this.field2069 != var9 && var8 > this.field2066; var9 = var9 + 1 & 0x1FF) {
                int var10 = this.field2077[var9];
                if (var10 < var8) {
                    var8 = var10;
                }
            }
            this.field2066 = var8;
        }
        this.field2069 = var4;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(J)V", line = 62)
    private final void method733(long arg0) {
        if (this.field2073 != 0L) {
            while (true) {
                if (this.field2067 >= arg0) {
                    if (arg0 < this.field2073) {
                        return;
                    }
                    try {
                        this.method736(arg0);
                    } catch (Exception var8) {
                        this.method323();
                        this.field2073 += 5000L;
                        return;
                    }
                    this.field2073 = 0L;
                    break;
                }
                class19.method187(7, 256);
                this.field2067 += 256000 / class24.field603;
            }
        }
        while (this.field2067 < arg0) {
            this.field2067 += 250880 / class24.field603;
            int var3;
            try {
                var3 = this.method320();
            } catch (Exception var6) {
                this.method323();
                this.field2073 = arg0;
                return;
            }
            this.method732(var3);
            int var4 = this.field2075 * 3 / 512 - this.field2066 * 2;
            if (var4 < 0) {
                var4 = 0;
            } else if (var4 > this.field2068) {
                var4 = this.field2068;
            }
            this.field2079 = this.field2071 - var4 - 256;
            if (this.field2079 < 256) {
                this.field2079 = 256;
            }
            if (this.field2071 < 16384) {
                if (var3 >= this.field2071) {
                    this.field2070 += 5;
                    if (this.field2070 >= 100) {
                        this.method323();
                        this.field2071 += 2048;
                        this.field2073 = arg0;
                        return;
                    }
                } else if (this.field2078 != var3 && this.field2070 > 0) {
                    this.field2070--;
                }
            }
            this.field2078 = var3;
            if (var3 < this.field2079) {
                break;
            }
            class19.method183(field2072, 256);
            try {
                this.method321();
            } catch (Exception var7) {
                this.method323();
                this.field2073 = arg0;
                return;
            }
            this.field2074 = arg0;
            this.field2078 -= 256;
        }
        if (arg0 < this.field2074 + 5000L) {
            return;
        }
        this.method323();
        this.field2073 = arg0;
        for (int var5 = 0; var5 < 512; var5++) {
            this.field2077[var5] = 0;
        }
        this.field2066 = this.field2068 = this.field2075 = 0;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Led;I)V", line = 182)
    public final void method734(class31 arg0, int arg1) throws Exception {
        this.field2071 = arg1;
        this.method736(class5.method22(33));
        arg0.method280(62, this, 10);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()V", line = 190)
    public static void method735() {
        field2072 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()V", line = 199)
    public final void method180() {
        synchronized (this) {
            this.field2076 = true;
        }
        while (true) {
            synchronized (this) {
                if (!this.field2076) {
                    break;
                }
            }
            class82.method696(3, 50L);
        }
        field2072 = null;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V", line = 307)
    public class86() {
        int var1 = 256;
        if (class126.field3090) {
            var1 <<= 0x1;
        }
        field2072 = new int[var1];
    }

    @OriginalMember(owner = "client!oa", name = "run", descriptor = "()V", line = 227)
    public final void run() {
        try {
            while (true) {
                synchronized (this) {
                    if (this.field2076) {
                        if (this.field2073 == 0L) {
                            this.method323();
                        }
                        this.field2076 = false;
                        return;
                    }
                    this.method186(class5.method22(49));
                }
                class82.method696(3, 5L);
            }
        } catch (Exception var6) {
            class78.method675(var6, 64, null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(J)V", line = 258)
    private final void method736(long arg0) throws Exception {
        this.method322(this.field2071);
        while (true) {
            int var3 = this.method320();
            if (var3 < this.field2079) {
                this.field2070 = 0;
                this.field2078 = 0;
                this.field2067 = arg0;
                this.field2074 = arg0;
                return;
            }
            this.method321();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(J)V", line = 277)
    public final synchronized void method186(long arg0) {
        this.method733(arg0);
        if (this.field2067 < arg0) {
            this.field2067 = arg0;
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "()V")
    public abstract void method321() throws Exception;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
    public abstract void method322(int arg0) throws Exception;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()I")
    public abstract int method320() throws Exception;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Component;IZ)V")
    public abstract void method319(Component arg0, int arg1, boolean arg2) throws Exception;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "()V")
    public abstract void method323();
}
