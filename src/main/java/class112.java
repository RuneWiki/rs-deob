import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public abstract class class112 extends class27 implements Runnable {

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "J")
    private long field2484 = 0L;

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "Z")
    private boolean field2488 = false;

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "I")
    private int field2487 = 0;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
    private int field2485 = 0;

    @OriginalMember(owner = "client!tb", name = "E", descriptor = "I")
    private int field2494 = 0;

    @OriginalMember(owner = "client!tb", name = "C", descriptor = "[I")
    private int[] field2492 = new int[512];

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "I")
    private int field2486 = 0;

    @OriginalMember(owner = "client!tb", name = "G", descriptor = "I")
    private int field2496 = 256;

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "[I")
    public static int[] field2490 = new int[256];

    @OriginalMember(owner = "client!tb", name = "B", descriptor = "I")
    private int field2491;

    @OriginalMember(owner = "client!tb", name = "F", descriptor = "I")
    private int field2495;

    @OriginalMember(owner = "client!tb", name = "H", descriptor = "I")
    private int field2497;

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "J")
    private long field2489;

    @OriginalMember(owner = "client!tb", name = "D", descriptor = "J")
    private long field2493;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(J)V", line = 7)
    private final void method812(long arg0) throws Exception {
        this.method631(this.field2497);
        while (true) {
            int var3 = this.method629();
            if (var3 < this.field2496) {
                this.field2495 = 0;
                this.field2491 = 0;
                this.field2493 = arg0;
                this.field2489 = arg0;
                return;
            }
            this.method632();
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(I)V", line = 194)
    public class112(int arg0) throws Exception {
        super(arg0);
    }

    @OriginalMember(owner = "client!tb", name = "run", descriptor = "()V", line = 36)
    public final void run() {
        try {
            while (true) {
                synchronized (this) {
                    if (this.field2488) {
                        if (this.field2484 == 0L) {
                            this.method630();
                        }
                        this.field2488 = false;
                        return;
                    }
                    this.method214(System.currentTimeMillis());
                }
                class113.method833(5L, true);
            }
        } catch (Exception var6) {
            class119.method920(true, null, var6);
        }
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "()V", line = 78)
    public static void method813() {
        field2490 = null;
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(J)V", line = 81)
    private final void method814(long arg0) {
        if (this.field2484 != 0L) {
            while (true) {
                if (this.field2493 >= arg0) {
                    if (arg0 < this.field2484) {
                        return;
                    }
                    try {
                        this.method812(arg0);
                    } catch (Exception var8) {
                        this.method630();
                        this.field2484 += 5000L;
                        return;
                    }
                    this.field2484 = 0L;
                    break;
                }
                class27.method218(256, 3328);
                this.field2493 += 256000 / class35.field836;
            }
        }
        while (this.field2493 < arg0) {
            this.field2493 += 250880 / class35.field836;
            int var3;
            try {
                var3 = this.method629();
            } catch (Exception var6) {
                this.method630();
                this.field2484 = arg0;
                return;
            }
            this.method815(var3);
            int var4 = this.field2487 * 3 / 512 - this.field2485 * 2;
            if (var4 < 0) {
                var4 = 0;
            } else if (var4 > this.field2486) {
                var4 = this.field2486;
            }
            this.field2496 = this.field2497 - var4 - 256;
            if (this.field2496 < 256) {
                this.field2496 = 256;
            }
            if (this.field2497 < 16384) {
                if (var3 >= this.field2497) {
                    this.field2495 += 5;
                    if (this.field2495 >= 100) {
                        this.method630();
                        this.field2497 += 2048;
                        this.field2484 = arg0;
                        return;
                    }
                } else if (this.field2491 != var3 && this.field2495 > 0) {
                    this.field2495--;
                }
            }
            this.field2491 = var3;
            if (var3 < this.field2496) {
                break;
            }
            class27.method211(field2490, 256);
            try {
                this.method632();
            } catch (Exception var7) {
                this.method630();
                this.field2484 = arg0;
                return;
            }
            this.field2489 = arg0;
            this.field2491 -= 256;
        }
        if (arg0 < this.field2489 + 5000L) {
            return;
        }
        this.method630();
        this.field2484 = arg0;
        for (int var5 = 0; var5 < 512; var5++) {
            this.field2492[var5] = 0;
        }
        this.field2485 = this.field2486 = this.field2487 = 0;
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)V", line = 202)
    private final void method815(int arg0) {
        int var2 = arg0 - this.field2496;
        int var3 = this.field2492[this.field2494];
        this.field2492[this.field2494] = var2;
        this.field2487 += var2 - var3;
        int var4 = this.field2494 + 1 & 0x1FF;
        if (var2 > this.field2486) {
            this.field2486 = var2;
        }
        if (var2 < this.field2485) {
            this.field2485 = var2;
        }
        if (this.field2486 == var3) {
            int var5 = var2;
            for (int var6 = var4; this.field2494 != var6 && var5 < this.field2486; var6 = var6 + 1 & 0x1FF) {
                int var7 = this.field2492[var6];
                if (var7 > var5) {
                    var5 = var7;
                }
            }
            this.field2486 = var5;
        }
        if (this.field2485 == var3) {
            int var8 = var2;
            for (int var9 = var4; this.field2494 != var9 && var8 > this.field2485; var9 = var9 + 1 & 0x1FF) {
                int var10 = this.field2492[var9];
                if (var10 < var8) {
                    var8 = var10;
                }
            }
            this.field2485 = var8;
        }
        this.field2494 = var4;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "()V", line = 267)
    public final void method216() {
        synchronized (this) {
            this.field2488 = true;
        }
        while (true) {
            synchronized (this) {
                if (!this.field2488) {
                    return;
                }
            }
            class113.method833(50L, true);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(J)V", line = 287)
    public final synchronized void method214(long arg0) {
        this.method814(arg0);
        if (this.field2493 < arg0) {
            this.field2493 = arg0;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ls;I)V", line = 293)
    public final void method816(class105 arg0, int arg1) throws Exception {
        this.field2497 = arg1;
        this.method812(System.currentTimeMillis());
        arg0.method780(this, 0, 10);
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V")
    public abstract void method631(int arg0) throws Exception;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "()V")
    public abstract void method630();

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "()V")
    public abstract void method632() throws Exception;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "()I")
    public abstract int method629() throws Exception;
}
