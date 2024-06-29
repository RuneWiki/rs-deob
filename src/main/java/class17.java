import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public abstract class class17 extends class14 implements Runnable {

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    private int field329 = 0;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "I")
    private int field333 = 0;

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "Z")
    private boolean field336 = false;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "I")
    private int field332 = 0;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    private int field330 = 0;

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "I")
    private int field340 = 256;

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "J")
    private long field339 = 0L;

    @OriginalMember(owner = "client!cd", name = "D", descriptor = "[I")
    private int[] field342 = new int[512];

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "[I")
    public static int[] field334 = new int[256];

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
    private int field331;

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "I")
    private int field337;

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "I")
    private int field338;

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "J")
    private long field335;

    @OriginalMember(owner = "client!cd", name = "C", descriptor = "J")
    private long field341;

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(I)V", line = 12)
    public class17(int arg0) throws Exception {
        super(arg0);
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "()V", line = 7)
    public static void method115() {
        field334 = null;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(J)V", line = 16)
    private final void method116(long arg0) throws Exception {
        this.method82(this.field337);
        while (true) {
            int var3 = this.method83();
            if (var3 < this.field340) {
                this.field331 = 0;
                this.field338 = 0;
                this.field341 = arg0;
                this.field335 = arg0;
                return;
            }
            this.method81();
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljb;I)V", line = 38)
    public final void method117(class56 arg0, int arg1) throws Exception {
        this.field337 = arg1;
        this.method116(System.currentTimeMillis());
        arg0.method524(10, this, (byte) 43);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(J)V", line = 54)
    public final synchronized void method95(long arg0) {
        this.method119(arg0);
        if (this.field341 < arg0) {
            this.field341 = arg0;
        }
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)V", line = 61)
    private final void method118(int arg0) {
        int var2 = arg0 - this.field340;
        int var3 = this.field342[this.field333];
        this.field342[this.field333] = var2;
        this.field330 += var2 - var3;
        int var4 = this.field333 + 1 & 0x1FF;
        if (var2 > this.field332) {
            this.field332 = var2;
        }
        if (var2 < this.field329) {
            this.field329 = var2;
        }
        if (this.field332 == var3) {
            int var5 = var2;
            for (int var6 = var4; this.field333 != var6 && var5 < this.field332; var6 = var6 + 1 & 0x1FF) {
                int var7 = this.field342[var6];
                if (var7 > var5) {
                    var5 = var7;
                }
            }
            this.field332 = var5;
        }
        if (this.field329 == var3) {
            int var8 = var2;
            for (int var9 = var4; this.field333 != var9 && var8 > this.field329; var9 = var9 + 1 & 0x1FF) {
                int var10 = this.field342[var9];
                if (var10 < var8) {
                    var8 = var10;
                }
            }
            this.field329 = var8;
        }
        this.field333 = var4;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "()V", line = 117)
    public final void method101() {
        synchronized (this) {
            this.field336 = true;
        }
        while (true) {
            synchronized (this) {
                if (!this.field336) {
                    return;
                }
            }
            class47.method447((byte) -56, 50L);
        }
    }

    @OriginalMember(owner = "client!cd", name = "run", descriptor = "()V", line = 157)
    public final void run() {
        try {
            while (true) {
                synchronized (this) {
                    if (this.field336) {
                        if (this.field339 == 0L) {
                            this.method85();
                        }
                        this.field336 = false;
                        return;
                    }
                    this.method95(System.currentTimeMillis());
                }
                class47.method447((byte) -75, 5L);
            }
        } catch (Exception var6) {
            client.method132(null, var6, (byte) 68);
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(J)V", line = 182)
    private final void method119(long arg0) {
        if (this.field339 != 0L) {
            while (true) {
                if (this.field341 >= arg0) {
                    if (arg0 < this.field339) {
                        return;
                    }
                    try {
                        this.method116(arg0);
                    } catch (Exception var8) {
                        this.method85();
                        this.field339 += 5000L;
                        return;
                    }
                    this.field339 = 0L;
                    break;
                }
                class14.method93(256, (byte) 125);
                this.field341 += 256000 / class94.field2391;
            }
        }
        while (this.field341 < arg0) {
            this.field341 += 250880 / class94.field2391;
            int var3;
            try {
                var3 = this.method83();
            } catch (Exception var6) {
                this.method85();
                this.field339 = arg0;
                return;
            }
            this.method118(var3);
            int var4 = this.field330 * 3 / 512 - this.field329 * 2;
            if (var4 < 0) {
                var4 = 0;
            } else if (var4 > this.field332) {
                var4 = this.field332;
            }
            this.field340 = this.field337 - var4 - 256;
            if (this.field340 < 256) {
                this.field340 = 256;
            }
            if (this.field337 < 16384) {
                if (var3 >= this.field337) {
                    this.field331 += 5;
                    if (this.field331 >= 100) {
                        this.method85();
                        this.field337 += 2048;
                        this.field339 = arg0;
                        return;
                    }
                } else if (this.field338 != var3 && this.field331 > 0) {
                    this.field331--;
                }
            }
            this.field338 = var3;
            if (var3 < this.field340) {
                break;
            }
            class14.method97(field334, 256);
            try {
                this.method81();
            } catch (Exception var7) {
                this.method85();
                this.field339 = arg0;
                return;
            }
            this.field335 = arg0;
            this.field338 -= 256;
        }
        if (arg0 < this.field335 + 5000L) {
            return;
        }
        this.method85();
        this.field339 = arg0;
        for (int var5 = 0; var5 < 512; var5++) {
            this.field342[var5] = 0;
        }
        this.field329 = this.field332 = this.field330 = 0;
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)V")
    public abstract void method82(int arg0) throws Exception;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "()I")
    public abstract int method83() throws Exception;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "()V")
    public abstract void method85();

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "()V")
    public abstract void method81() throws Exception;
}
