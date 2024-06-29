import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public abstract class class35 extends class138 implements Runnable {

    @OriginalMember(owner = "client!f", name = "r", descriptor = "I")
    private int field844 = 0;

    @OriginalMember(owner = "client!f", name = "t", descriptor = "I")
    private int field846 = 0;

    @OriginalMember(owner = "client!f", name = "v", descriptor = "Z")
    private boolean field848 = false;

    @OriginalMember(owner = "client!f", name = "z", descriptor = "J")
    private long field852 = 0L;

    @OriginalMember(owner = "client!f", name = "A", descriptor = "[I")
    private int[] field853 = new int[512];

    @OriginalMember(owner = "client!f", name = "C", descriptor = "I")
    private int field855 = 0;

    @OriginalMember(owner = "client!f", name = "x", descriptor = "I")
    private int field850 = 0;

    @OriginalMember(owner = "client!f", name = "D", descriptor = "I")
    private int field856 = 256;

    @OriginalMember(owner = "client!f", name = "s", descriptor = "I")
    private int field845;

    @OriginalMember(owner = "client!f", name = "u", descriptor = "I")
    private int field847;

    @OriginalMember(owner = "client!f", name = "B", descriptor = "I")
    private int field854;

    @OriginalMember(owner = "client!f", name = "w", descriptor = "J")
    private long field849;

    @OriginalMember(owner = "client!f", name = "y", descriptor = "J")
    private long field851;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "[I")
    public static int[] field843;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lc;I)V", line = 4)
    public final void method294(class15 arg0, int arg1) throws Exception {
        this.field847 = arg1;
        this.method301(class82.method644(0));
        arg0.method130(10, this, -10870);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(J)V", line = 12)
    public final synchronized void method295(long arg0) {
        this.method304(arg0);
        if (this.field849 < arg0) {
            this.field849 = arg0;
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V", line = 20)
    private final void method296(int arg0) {
        int var2 = arg0 - this.field856;
        int var3 = this.field853[this.field855];
        this.field853[this.field855] = var2;
        this.field844 += var2 - var3;
        int var4 = this.field855 + 1 & 0x1FF;
        if (var2 > this.field850) {
            this.field850 = var2;
        }
        if (var2 < this.field846) {
            this.field846 = var2;
        }
        if (this.field850 == var3) {
            int var5 = var2;
            for (int var6 = var4; this.field855 != var6 && var5 < this.field850; var6 = var6 + 1 & 0x1FF) {
                int var7 = this.field853[var6];
                if (var7 > var5) {
                    var5 = var7;
                }
            }
            this.field850 = var5;
        }
        if (this.field846 == var3) {
            int var8 = var2;
            for (int var9 = var4; this.field855 != var9 && var8 > this.field846; var9 = var9 + 1 & 0x1FF) {
                int var10 = this.field853[var9];
                if (var10 < var8) {
                    var8 = var10;
                }
            }
            this.field846 = var8;
        }
        this.field855 = var4;
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "()V", line = 83)
    public static void method298() {
        field843 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "()V", line = 86)
    public final void method299() {
        synchronized (this) {
            this.field848 = true;
        }
        while (true) {
            synchronized (this) {
                if (!this.field848) {
                    break;
                }
            }
            class84.method653(50L, (byte) 124);
        }
        field843 = null;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V", line = 307)
    public class35() {
        int var1 = 256;
        if (class45.field1098) {
            var1 <<= 0x1;
        }
        field843 = new int[var1];
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(J)V", line = 108)
    private final void method301(long arg0) throws Exception {
        this.method300(this.field847);
        while (true) {
            int var3 = this.method293();
            if (var3 < this.field856) {
                this.field854 = 0;
                this.field845 = 0;
                this.field849 = arg0;
                this.field851 = arg0;
                return;
            }
            this.method297();
        }
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(J)V", line = 143)
    private final void method304(long arg0) {
        if (this.field852 != 0L) {
            while (true) {
                if (this.field849 >= arg0) {
                    if (arg0 < this.field852) {
                        return;
                    }
                    try {
                        this.method301(arg0);
                    } catch (Exception var8) {
                        this.method302();
                        this.field852 += 5000L;
                        return;
                    }
                    this.field852 = 0L;
                    break;
                }
                class138.method1067(256, true);
                this.field849 += 256000 / class4.field55;
            }
        }
        while (this.field849 < arg0) {
            this.field849 += 250880 / class4.field55;
            int var3;
            try {
                var3 = this.method293();
            } catch (Exception var6) {
                this.method302();
                this.field852 = arg0;
                return;
            }
            this.method296(var3);
            int var4 = this.field844 * 3 / 512 - this.field846 * 2;
            if (var4 < 0) {
                var4 = 0;
            } else if (var4 > this.field850) {
                var4 = this.field850;
            }
            this.field856 = this.field847 - var4 - 256;
            if (this.field856 < 256) {
                this.field856 = 256;
            }
            if (this.field847 < 16384) {
                if (var3 >= this.field847) {
                    this.field854 += 5;
                    if (this.field854 >= 100) {
                        this.method302();
                        this.field847 += 2048;
                        this.field852 = arg0;
                        return;
                    }
                } else if (this.field845 != var3 && this.field854 > 0) {
                    this.field854--;
                }
            }
            this.field845 = var3;
            if (var3 < this.field856) {
                break;
            }
            class138.method1069(field843, 256);
            try {
                this.method297();
            } catch (Exception var7) {
                this.method302();
                this.field852 = arg0;
                return;
            }
            this.field851 = arg0;
            this.field845 -= 256;
        }
        if (arg0 < this.field851 + 5000L) {
            return;
        }
        this.method302();
        this.field852 = arg0;
        for (int var5 = 0; var5 < 512; var5++) {
            this.field853[var5] = 0;
        }
        this.field846 = this.field850 = this.field844 = 0;
    }

    @OriginalMember(owner = "client!f", name = "run", descriptor = "()V", line = 269)
    public final void run() {
        try {
            while (true) {
                synchronized (this) {
                    if (this.field848) {
                        if (this.field852 == 0L) {
                            this.method302();
                        }
                        this.field848 = false;
                        return;
                    }
                    this.method295(class82.method644(0));
                }
                class84.method653(5L, (byte) 124);
            }
        } catch (Exception var6) {
            class109.method832(87, var6, null);
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "()I")
    public abstract int method293() throws Exception;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "()V")
    public abstract void method297() throws Exception;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V")
    public abstract void method300(int arg0) throws Exception;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "()V")
    public abstract void method302();

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/awt/Component;IZ)V")
    public abstract void method303(Component arg0, int arg1, boolean arg2) throws Exception;
}
