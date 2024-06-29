import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public abstract class class86 extends class111 implements Runnable {

    @OriginalMember(owner = "client!ob", name = "F", descriptor = "I")
    private int field2046 = 0;

    @OriginalMember(owner = "client!ob", name = "E", descriptor = "I")
    private int field2045 = 0;

    @OriginalMember(owner = "client!ob", name = "I", descriptor = "J")
    private long field2049 = 0L;

    @OriginalMember(owner = "client!ob", name = "K", descriptor = "I")
    private int field2051 = 0;

    @OriginalMember(owner = "client!ob", name = "M", descriptor = "[I")
    private int[] field2053 = new int[512];

    @OriginalMember(owner = "client!ob", name = "P", descriptor = "Z")
    private boolean field2056 = false;

    @OriginalMember(owner = "client!ob", name = "D", descriptor = "I")
    private int field2044 = 256;

    @OriginalMember(owner = "client!ob", name = "C", descriptor = "I")
    private int field2043 = 0;

    @OriginalMember(owner = "client!ob", name = "N", descriptor = "[I")
    public static int[] field2054 = new int[256];

    @OriginalMember(owner = "client!ob", name = "J", descriptor = "I")
    private int field2050;

    @OriginalMember(owner = "client!ob", name = "L", descriptor = "I")
    private int field2052;

    @OriginalMember(owner = "client!ob", name = "O", descriptor = "I")
    private int field2055;

    @OriginalMember(owner = "client!ob", name = "G", descriptor = "J")
    private long field2047;

    @OriginalMember(owner = "client!ob", name = "H", descriptor = "J")
    private long field2048;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(J)V", line = 6)
    private final void method644(long arg0) throws Exception {
        this.method474(this.field2050);
        while (true) {
            int var3 = this.method475();
            if (var3 < this.field2044) {
                this.field2052 = 0;
                this.field2055 = 0;
                this.field2047 = arg0;
                this.field2048 = arg0;
                return;
            }
            this.method472();
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "()V", line = 29)
    public final void method573() {
        synchronized (this) {
            this.field2056 = true;
        }
        while (true) {
            synchronized (this) {
                if (!this.field2056) {
                    return;
                }
            }
            class37.method375(-1, 50L);
        }
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "()V", line = 48)
    public static void method645() {
        field2054 = null;
    }

    @OriginalMember(owner = "client!ob", name = "run", descriptor = "()V", line = 51)
    public final void run() {
        try {
            while (true) {
                synchronized (this) {
                    if (this.field2056) {
                        if (this.field2049 == 0L) {
                            this.method473();
                        }
                        this.field2056 = false;
                        return;
                    }
                    this.method649(class90.method668(false));
                }
                class37.method375(-1, 5L);
            }
        } catch (Exception var6) {
            class33.method264(null, var6, (byte) 15);
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(I)V", line = 218)
    public class86(int arg0) throws Exception {
        super(arg0);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lsb;I)V", line = 81)
    public final void method646(class110 arg0, int arg1) throws Exception {
        this.field2050 = arg1;
        this.method644(class90.method668(false));
        arg0.method842(this, (byte) 76, 10);
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(J)V", line = 100)
    private final void method647(long arg0) {
        if (this.field2049 != 0L) {
            while (true) {
                if (this.field2047 >= arg0) {
                    if (arg0 < this.field2049) {
                        return;
                    }
                    try {
                        this.method644(arg0);
                    } catch (Exception var8) {
                        this.method473();
                        this.field2049 += 5000L;
                        return;
                    }
                    this.field2049 = 0L;
                    break;
                }
                class111.method850(256, (byte) -101);
                this.field2047 += 256000 / class48.field1298;
            }
        }
        while (this.field2047 < arg0) {
            this.field2047 += 250880 / class48.field1298;
            int var3;
            try {
                var3 = this.method475();
            } catch (Exception var6) {
                this.method473();
                this.field2049 = arg0;
                return;
            }
            this.method648(var3);
            int var4 = this.field2051 * 3 / 512 - this.field2046 * 2;
            if (var4 < 0) {
                var4 = 0;
            } else if (var4 > this.field2043) {
                var4 = this.field2043;
            }
            this.field2044 = this.field2050 - var4 - 256;
            if (this.field2044 < 256) {
                this.field2044 = 256;
            }
            if (this.field2050 < 16384) {
                if (var3 >= this.field2050) {
                    this.field2052 += 5;
                    if (this.field2052 >= 100) {
                        this.method473();
                        this.field2050 += 2048;
                        this.field2049 = arg0;
                        return;
                    }
                } else if (this.field2055 != var3 && this.field2052 > 0) {
                    this.field2052--;
                }
            }
            this.field2055 = var3;
            if (var3 < this.field2044) {
                break;
            }
            class111.method853(field2054, 256);
            try {
                this.method472();
            } catch (Exception var7) {
                this.method473();
                this.field2049 = arg0;
                return;
            }
            this.field2048 = arg0;
            this.field2055 -= 256;
        }
        if (arg0 < this.field2048 + 5000L) {
            return;
        }
        this.method473();
        this.field2049 = arg0;
        for (int var5 = 0; var5 < 512; var5++) {
            this.field2053[var5] = 0;
        }
        this.field2046 = this.field2043 = this.field2051 = 0;
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V", line = 230)
    private final void method648(int arg0) {
        int var2 = arg0 - this.field2044;
        int var3 = this.field2053[this.field2045];
        this.field2053[this.field2045] = var2;
        this.field2051 += var2 - var3;
        int var4 = this.field2045 + 1 & 0x1FF;
        if (var2 > this.field2043) {
            this.field2043 = var2;
        }
        if (var2 < this.field2046) {
            this.field2046 = var2;
        }
        if (this.field2043 == var3) {
            int var5 = var2;
            for (int var6 = var4; this.field2045 != var6 && var5 < this.field2043; var6 = var6 + 1 & 0x1FF) {
                int var7 = this.field2053[var6];
                if (var7 > var5) {
                    var5 = var7;
                }
            }
            this.field2043 = var5;
        }
        if (this.field2046 == var3) {
            int var8 = var2;
            for (int var9 = var4; this.field2045 != var9 && var8 > this.field2046; var9 = var9 + 1 & 0x1FF) {
                int var10 = this.field2053[var9];
                if (var10 < var8) {
                    var8 = var10;
                }
            }
            this.field2046 = var8;
        }
        this.field2045 = var4;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(J)V", line = 296)
    public final synchronized void method649(long arg0) {
        this.method647(arg0);
        if (this.field2047 < arg0) {
            this.field2047 = arg0;
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "()V")
    public abstract void method472() throws Exception;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "()V")
    public abstract void method473();

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
    public abstract void method474(int arg0) throws Exception;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "()I")
    public abstract int method475() throws Exception;
}
