import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class class113 extends class38 implements Runnable {

    @OriginalMember(owner = "client!ta", name = "B", descriptor = "I")
    private int field2855 = 0;

    @OriginalMember(owner = "client!ta", name = "C", descriptor = "I")
    private int field2856 = 256;

    @OriginalMember(owner = "client!ta", name = "D", descriptor = "[I")
    private int[] field2857 = new int[512];

    @OriginalMember(owner = "client!ta", name = "I", descriptor = "I")
    private int field2862 = 0;

    @OriginalMember(owner = "client!ta", name = "M", descriptor = "J")
    private long field2866 = 0L;

    @OriginalMember(owner = "client!ta", name = "K", descriptor = "I")
    private int field2864 = 0;

    @OriginalMember(owner = "client!ta", name = "G", descriptor = "Z")
    private boolean field2860 = false;

    @OriginalMember(owner = "client!ta", name = "J", descriptor = "I")
    private int field2863 = 0;

    @OriginalMember(owner = "client!ta", name = "z", descriptor = "[I")
    public static int[] field2853 = new int[256];

    @OriginalMember(owner = "client!ta", name = "A", descriptor = "I")
    private int field2854;

    @OriginalMember(owner = "client!ta", name = "E", descriptor = "I")
    private int field2858;

    @OriginalMember(owner = "client!ta", name = "H", descriptor = "I")
    private int field2861;

    @OriginalMember(owner = "client!ta", name = "F", descriptor = "J")
    private long field2859;

    @OriginalMember(owner = "client!ta", name = "L", descriptor = "J")
    private long field2865;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "()V", line = 12)
    public final void method291() {
        synchronized (this) {
            this.field2860 = true;
        }
        while (true) {
            synchronized (this) {
                if (!this.field2860) {
                    return;
                }
            }
            class13.method86(50L, 1);
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(I)V", line = 55)
    public class113(int arg0) throws Exception {
        super(arg0);
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(J)V", line = 35)
    private final void method911(long arg0) throws Exception {
        this.method91(this.field2861);
        while (true) {
            int var3 = this.method92();
            if (var3 < this.field2856) {
                this.field2858 = 0;
                this.field2854 = 0;
                this.field2859 = arg0;
                this.field2865 = arg0;
                return;
            }
            this.method90();
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(J)V", line = 58)
    public final synchronized void method296(long arg0) {
        this.method913(arg0);
        if (this.field2859 < arg0) {
            this.field2859 = arg0;
        }
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "()V", line = 65)
    public static void method912() {
        field2853 = null;
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(J)V", line = 71)
    private final void method913(long arg0) {
        if (this.field2866 != 0L) {
            while (true) {
                if (this.field2859 >= arg0) {
                    if (arg0 < this.field2866) {
                        return;
                    }
                    try {
                        this.method911(arg0);
                    } catch (Exception var8) {
                        this.method89();
                        this.field2866 += 5000L;
                        return;
                    }
                    this.field2866 = 0L;
                    break;
                }
                class38.method297(31311, 256);
                this.field2859 += 256000 / class10.field221;
            }
        }
        while (this.field2859 < arg0) {
            this.field2859 += 250880 / class10.field221;
            int var3;
            try {
                var3 = this.method92();
            } catch (Exception var6) {
                this.method89();
                this.field2866 = arg0;
                return;
            }
            this.method914(var3);
            int var4 = this.field2864 * 3 / 512 - this.field2863 * 2;
            if (var4 < 0) {
                var4 = 0;
            } else if (var4 > this.field2862) {
                var4 = this.field2862;
            }
            this.field2856 = this.field2861 - var4 - 256;
            if (this.field2856 < 256) {
                this.field2856 = 256;
            }
            if (this.field2861 < 16384) {
                if (var3 >= this.field2861) {
                    this.field2858 += 5;
                    if (this.field2858 >= 100) {
                        this.method89();
                        this.field2861 += 2048;
                        this.field2866 = arg0;
                        return;
                    }
                } else if (this.field2854 != var3 && this.field2858 > 0) {
                    this.field2858--;
                }
            }
            this.field2854 = var3;
            if (var3 < this.field2856) {
                break;
            }
            class38.method299(field2853, 256);
            try {
                this.method90();
            } catch (Exception var7) {
                this.method89();
                this.field2866 = arg0;
                return;
            }
            this.field2865 = arg0;
            this.field2854 -= 256;
        }
        if (arg0 < this.field2865 + 5000L) {
            return;
        }
        this.method89();
        this.field2866 = arg0;
        for (int var5 = 0; var5 < 512; var5++) {
            this.field2857[var5] = 0;
        }
        this.field2863 = this.field2862 = this.field2864 = 0;
    }

    @OriginalMember(owner = "client!ta", name = "run", descriptor = "()V", line = 194)
    public final void run() {
        try {
            while (true) {
                synchronized (this) {
                    if (this.field2860) {
                        if (this.field2866 == 0L) {
                            this.method89();
                        }
                        this.field2860 = false;
                        return;
                    }
                    this.method296(System.currentTimeMillis());
                }
                class13.method86(5L, 1);
            }
        } catch (Exception var6) {
            class114.method918(12541, null, var6);
        }
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "(I)V", line = 220)
    private final void method914(int arg0) {
        int var2 = arg0 - this.field2856;
        int var3 = this.field2857[this.field2855];
        this.field2857[this.field2855] = var2;
        this.field2864 += var2 - var3;
        int var4 = this.field2855 + 1 & 0x1FF;
        if (var2 > this.field2862) {
            this.field2862 = var2;
        }
        if (var2 < this.field2863) {
            this.field2863 = var2;
        }
        if (this.field2862 == var3) {
            int var5 = var2;
            for (int var6 = var4; this.field2855 != var6 && var5 < this.field2862; var6 = var6 + 1 & 0x1FF) {
                int var7 = this.field2857[var6];
                if (var7 > var5) {
                    var5 = var7;
                }
            }
            this.field2862 = var5;
        }
        if (this.field2863 == var3) {
            int var8 = var2;
            for (int var9 = var4; this.field2855 != var9 && var8 > this.field2863; var9 = var9 + 1 & 0x1FF) {
                int var10 = this.field2857[var9];
                if (var10 < var8) {
                    var8 = var10;
                }
            }
            this.field2863 = var8;
        }
        this.field2855 = var4;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lvb;I)V", line = 279)
    public final void method915(class124 arg0, int arg1) throws Exception {
        this.field2861 = arg1;
        this.method911(System.currentTimeMillis());
        arg0.method986(0, this, 10);
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "()V")
    public abstract void method89();

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "()V")
    public abstract void method90() throws Exception;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)V")
    public abstract void method91(int arg0) throws Exception;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "()I")
    public abstract int method92() throws Exception;
}
