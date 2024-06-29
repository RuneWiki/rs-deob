import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public abstract class class94 extends class14 implements Runnable {

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "I")
    private int field2346 = 0;

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "J")
    private long field2342 = 0L;

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "I")
    private int field2348 = 256;

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "Z")
    private boolean field2341 = false;

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "I")
    private int field2349 = 0;

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "I")
    private int field2343 = 0;

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "I")
    private int field2345 = 0;

    @OriginalMember(owner = "client!pd", name = "S", descriptor = "[I")
    private int[] field2354 = new int[512];

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "[I")
    public static int[] field2350 = new int[256];

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "I")
    private int field2344;

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "I")
    private int field2351;

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "I")
    private int field2352;

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "J")
    private long field2347;

    @OriginalMember(owner = "client!pd", name = "R", descriptor = "J")
    private long field2353;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(J)V", line = 6)
    private final void method818(long arg0) throws Exception {
        this.method434(this.field2352);
        while (true) {
            int var3 = this.method435();
            if (var3 < this.field2348) {
                this.field2344 = 0;
                this.field2351 = 0;
                this.field2353 = arg0;
                this.field2347 = arg0;
                return;
            }
            this.method437();
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "()V", line = 30)
    public static void method819() {
        field2350 = null;
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(J)V", line = 35)
    private final void method820(long arg0) {
        if (this.field2342 != 0L) {
            while (true) {
                if (this.field2353 >= arg0) {
                    if (arg0 < this.field2342) {
                        return;
                    }
                    try {
                        this.method818(arg0);
                    } catch (Exception var8) {
                        this.method436();
                        this.field2342 += 5000L;
                        return;
                    }
                    this.field2342 = 0L;
                    break;
                }
                class14.method261(256, (byte) 58);
                this.field2353 += 256000 / class5.field193;
            }
        }
        while (this.field2353 < arg0) {
            this.field2353 += 250880 / class5.field193;
            int var3;
            try {
                var3 = this.method435();
            } catch (Exception var6) {
                this.method436();
                this.field2342 = arg0;
                return;
            }
            this.method822(var3);
            int var4 = this.field2349 * 3 / 512 - this.field2343 * 2;
            if (var4 < 0) {
                var4 = 0;
            } else if (var4 > this.field2345) {
                var4 = this.field2345;
            }
            this.field2348 = this.field2352 - var4 - 256;
            if (this.field2348 < 256) {
                this.field2348 = 256;
            }
            if (this.field2352 < 16384) {
                if (var3 >= this.field2352) {
                    this.field2344 += 5;
                    if (this.field2344 >= 100) {
                        this.method436();
                        this.field2352 += 2048;
                        this.field2342 = arg0;
                        return;
                    }
                } else if (this.field2351 != var3 && this.field2344 > 0) {
                    this.field2344--;
                }
            }
            this.field2351 = var3;
            if (var3 < this.field2348) {
                break;
            }
            class14.method259(field2350, 256);
            try {
                this.method437();
            } catch (Exception var7) {
                this.method436();
                this.field2342 = arg0;
                return;
            }
            this.field2347 = arg0;
            this.field2351 -= 256;
        }
        if (arg0 < this.field2347 + 5000L) {
            return;
        }
        this.method436();
        this.field2342 = arg0;
        for (int var5 = 0; var5 < 512; var5++) {
            this.field2354[var5] = 0;
        }
        this.field2343 = this.field2345 = this.field2349 = 0;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(I)V", line = 224)
    public class94(int arg0) throws Exception {
        super(arg0);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Llc;I)V", line = 156)
    public final void method821(class69 arg0, int arg1) throws Exception {
        this.field2352 = arg1;
        this.method818(class103.method872(1));
        arg0.method659(10, 0, this);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "()V", line = 161)
    public final void method257() {
        synchronized (this) {
            this.field2341 = true;
        }
        while (true) {
            synchronized (this) {
                if (!this.field2341) {
                    return;
                }
            }
            class86.method756(50L, 48);
        }
    }

    @OriginalMember(owner = "client!pd", name = "run", descriptor = "()V", line = 180)
    public final void run() {
        try {
            while (true) {
                synchronized (this) {
                    if (this.field2341) {
                        if (this.field2342 == 0L) {
                            this.method436();
                        }
                        this.field2341 = false;
                        return;
                    }
                    this.method256(class103.method872(1));
                }
                class86.method756(5L, -86);
            }
        } catch (Exception var6) {
            class11.method215(null, (byte) -123, var6);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(J)V", line = 229)
    public final synchronized void method256(long arg0) {
        this.method820(arg0);
        if (this.field2353 < arg0) {
            this.field2353 = arg0;
        }
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)V", line = 239)
    private final void method822(int arg0) {
        int var2 = arg0 - this.field2348;
        int var3 = this.field2354[this.field2346];
        this.field2354[this.field2346] = var2;
        this.field2349 += var2 - var3;
        int var4 = this.field2346 + 1 & 0x1FF;
        if (var2 > this.field2345) {
            this.field2345 = var2;
        }
        if (var2 < this.field2343) {
            this.field2343 = var2;
        }
        if (this.field2345 == var3) {
            int var5 = var2;
            for (int var6 = var4; this.field2346 != var6 && var5 < this.field2345; var6 = var6 + 1 & 0x1FF) {
                int var7 = this.field2354[var6];
                if (var7 > var5) {
                    var5 = var7;
                }
            }
            this.field2345 = var5;
        }
        if (this.field2343 == var3) {
            int var8 = var2;
            for (int var9 = var4; this.field2346 != var9 && var8 > this.field2343; var9 = var9 + 1 & 0x1FF) {
                int var10 = this.field2354[var9];
                if (var10 < var8) {
                    var8 = var10;
                }
            }
            this.field2343 = var8;
        }
        this.field2346 = var4;
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "()V")
    public abstract void method437() throws Exception;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "()I")
    public abstract int method435() throws Exception;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "()V")
    public abstract void method436();

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)V")
    public abstract void method434(int arg0) throws Exception;
}
