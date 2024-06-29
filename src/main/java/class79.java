import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public abstract class class79 extends class22 implements Runnable {

    @OriginalMember(owner = "client!na", name = "C", descriptor = "Z")
    private boolean field2075 = false;

    @OriginalMember(owner = "client!na", name = "D", descriptor = "I")
    private int field2076 = 0;

    @OriginalMember(owner = "client!na", name = "A", descriptor = "I")
    private int field2073 = 0;

    @OriginalMember(owner = "client!na", name = "z", descriptor = "I")
    private int field2072 = 256;

    @OriginalMember(owner = "client!na", name = "H", descriptor = "J")
    private long field2080 = 0L;

    @OriginalMember(owner = "client!na", name = "F", descriptor = "I")
    private int field2078 = 0;

    @OriginalMember(owner = "client!na", name = "I", descriptor = "[I")
    private int[] field2081 = new int[512];

    @OriginalMember(owner = "client!na", name = "G", descriptor = "I")
    private int field2079 = 0;

    @OriginalMember(owner = "client!na", name = "w", descriptor = "[I")
    public static int[] field2069 = new int[256];

    @OriginalMember(owner = "client!na", name = "y", descriptor = "I")
    private int field2071;

    @OriginalMember(owner = "client!na", name = "B", descriptor = "I")
    private int field2074;

    @OriginalMember(owner = "client!na", name = "J", descriptor = "I")
    private int field2082;

    @OriginalMember(owner = "client!na", name = "x", descriptor = "J")
    private long field2070;

    @OriginalMember(owner = "client!na", name = "E", descriptor = "J")
    private long field2077;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(I)V", line = 8)
    private final void method658(int arg0) {
        int var2 = arg0 - this.field2072;
        int var3 = this.field2081[this.field2073];
        this.field2081[this.field2073] = var2;
        this.field2079 += var2 - var3;
        int var4 = this.field2073 + 1 & 0x1FF;
        if (var2 > this.field2078) {
            this.field2078 = var2;
        }
        if (var2 < this.field2076) {
            this.field2076 = var2;
        }
        if (this.field2078 == var3) {
            int var5 = var2;
            for (int var6 = var4; this.field2073 != var6 && var5 < this.field2078; var6 = var6 + 1 & 0x1FF) {
                int var7 = this.field2081[var6];
                if (var7 > var5) {
                    var5 = var7;
                }
            }
            this.field2078 = var5;
        }
        if (this.field2076 == var3) {
            int var8 = var2;
            for (int var9 = var4; this.field2073 != var9 && var8 > this.field2076; var9 = var9 + 1 & 0x1FF) {
                int var10 = this.field2081[var9];
                if (var10 < var8) {
                    var8 = var10;
                }
            }
            this.field2076 = var8;
        }
        this.field2073 = var4;
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "()V", line = 64)
    public static void method659() {
        field2069 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljc;I)V", line = 67)
    public final void method660(class57 arg0, int arg1) throws Exception {
        this.field2074 = arg1;
        this.method662(System.currentTimeMillis());
        arg0.method442(10, this, false);
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(I)V", line = 74)
    public class79(int arg0) throws Exception {
        super(arg0);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "()V", line = 78)
    public final void method229() {
        synchronized (this) {
            this.field2075 = true;
        }
        while (true) {
            synchronized (this) {
                if (!this.field2075) {
                    return;
                }
            }
            class30.method282((byte) -81, 50L);
        }
    }

    @OriginalMember(owner = "client!na", name = "run", descriptor = "()V", line = 104)
    public final void run() {
        try {
            while (true) {
                synchronized (this) {
                    if (this.field2075) {
                        if (this.field2080 == 0L) {
                            this.method582();
                        }
                        this.field2075 = false;
                        return;
                    }
                    this.method234(System.currentTimeMillis());
                }
                class30.method282((byte) -103, 5L);
            }
        } catch (Exception var6) {
            class84.method678(null, var6, 1);
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(J)V", line = 139)
    private final void method661(long arg0) {
        if (this.field2080 != 0L) {
            while (true) {
                if (this.field2070 >= arg0) {
                    if (arg0 < this.field2080) {
                        return;
                    }
                    try {
                        this.method662(arg0);
                    } catch (Exception var8) {
                        this.method582();
                        this.field2080 += 5000L;
                        return;
                    }
                    this.field2080 = 0L;
                    break;
                }
                class22.method232(256, (byte) 53);
                this.field2070 += 256000 / client.field447;
            }
        }
        while (this.field2070 < arg0) {
            this.field2070 += 250880 / client.field447;
            int var3;
            try {
                var3 = this.method579();
            } catch (Exception var6) {
                this.method582();
                this.field2080 = arg0;
                return;
            }
            this.method658(var3);
            int var4 = this.field2079 * 3 / 512 - this.field2076 * 2;
            if (var4 < 0) {
                var4 = 0;
            } else if (var4 > this.field2078) {
                var4 = this.field2078;
            }
            this.field2072 = this.field2074 - var4 - 256;
            if (this.field2072 < 256) {
                this.field2072 = 256;
            }
            if (this.field2074 < 16384) {
                if (var3 >= this.field2074) {
                    this.field2082 += 5;
                    if (this.field2082 >= 100) {
                        this.method582();
                        this.field2074 += 2048;
                        this.field2080 = arg0;
                        return;
                    }
                } else if (this.field2071 != var3 && this.field2082 > 0) {
                    this.field2082--;
                }
            }
            this.field2071 = var3;
            if (var3 < this.field2072) {
                break;
            }
            class22.method230(field2069, 256);
            try {
                this.method580();
            } catch (Exception var7) {
                this.method582();
                this.field2080 = arg0;
                return;
            }
            this.field2077 = arg0;
            this.field2071 -= 256;
        }
        if (arg0 < this.field2077 + 5000L) {
            return;
        }
        this.method582();
        this.field2080 = arg0;
        for (int var5 = 0; var5 < 512; var5++) {
            this.field2081[var5] = 0;
        }
        this.field2076 = this.field2078 = this.field2079 = 0;
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(J)V", line = 257)
    private final void method662(long arg0) throws Exception {
        this.method583(this.field2074);
        while (true) {
            int var3 = this.method579();
            if (var3 < this.field2072) {
                this.field2082 = 0;
                this.field2071 = 0;
                this.field2070 = arg0;
                this.field2077 = arg0;
                return;
            }
            this.method580();
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(J)V", line = 278)
    public final synchronized void method234(long arg0) {
        this.method661(arg0);
        if (this.field2070 < arg0) {
            this.field2070 = arg0;
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "()V")
    public abstract void method580() throws Exception;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "()I")
    public abstract int method579() throws Exception;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "(I)V")
    public abstract void method583(int arg0) throws Exception;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "()V")
    public abstract void method582();
}
