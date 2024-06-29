import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public abstract class class71 extends class88 implements Runnable {

    @OriginalMember(owner = "client!le", name = "z", descriptor = "I")
    private int field1577 = 0;

    @OriginalMember(owner = "client!le", name = "G", descriptor = "I")
    private int field1584 = 0;

    @OriginalMember(owner = "client!le", name = "B", descriptor = "[I")
    private int[] field1579 = new int[512];

    @OriginalMember(owner = "client!le", name = "K", descriptor = "J")
    private long field1588 = 0L;

    @OriginalMember(owner = "client!le", name = "C", descriptor = "Z")
    private boolean field1580 = false;

    @OriginalMember(owner = "client!le", name = "I", descriptor = "I")
    private int field1586 = 0;

    @OriginalMember(owner = "client!le", name = "F", descriptor = "I")
    private int field1583 = 256;

    @OriginalMember(owner = "client!le", name = "M", descriptor = "I")
    private int field1590 = 0;

    @OriginalMember(owner = "client!le", name = "E", descriptor = "[I")
    public static int[] field1582 = new int[256];

    @OriginalMember(owner = "client!le", name = "A", descriptor = "I")
    private int field1578;

    @OriginalMember(owner = "client!le", name = "D", descriptor = "I")
    private int field1581;

    @OriginalMember(owner = "client!le", name = "H", descriptor = "I")
    private int field1585;

    @OriginalMember(owner = "client!le", name = "J", descriptor = "J")
    private long field1587;

    @OriginalMember(owner = "client!le", name = "L", descriptor = "J")
    private long field1589;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    private final void method552(int arg0) {
        int var2 = arg0 - this.field1583;
        int var3 = this.field1579[this.field1577];
        this.field1579[this.field1577] = var2;
        this.field1586 += var2 - var3;
        int var4 = this.field1577 + 1 & 0x1FF;
        if (var2 > this.field1590) {
            this.field1590 = var2;
        }
        if (var2 < this.field1584) {
            this.field1584 = var2;
        }
        if (this.field1590 == var3) {
            int var5 = var2;
            for (int var6 = var4; this.field1577 != var6 && var5 < this.field1590; var6 = var6 + 1 & 0x1FF) {
                int var7 = this.field1579[var6];
                if (var7 > var5) {
                    var5 = var7;
                }
            }
            this.field1590 = var5;
        }
        if (this.field1584 == var3) {
            int var8 = var2;
            for (int var9 = var4; this.field1577 != var9 && var8 > this.field1584; var9 = var9 + 1 & 0x1FF) {
                int var10 = this.field1579[var9];
                if (var10 < var8) {
                    var8 = var10;
                }
            }
            this.field1584 = var8;
        }
        this.field1577 = var4;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
    public abstract void method553(int arg0) throws Exception;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lnd;I)V")
    public final void method554(class82 arg0, int arg1) throws Exception {
        this.field1578 = arg1;
        this.method562(System.currentTimeMillis());
        arg0.method617(this, -10172, 10);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(J)V")
    public final synchronized void method555(long arg0) {
        this.method559(arg0);
        if (this.field1587 < arg0) {
            this.field1587 = arg0;
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "()V")
    public static void method556() {
        field1582 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "()V")
    public final void method557() {
        synchronized (this) {
            this.field1580 = true;
        }
        while (true) {
            synchronized (this) {
                if (!this.field1580) {
                    return;
                }
            }
            class31.method247(50L, (byte) 123);
        }
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "()V")
    public abstract void method558();

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(I)V")
    public class71(int arg0) throws Exception {
        super(arg0);
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(J)V")
    private final void method559(long arg0) {
        if (this.field1588 != 0L) {
            while (true) {
                if (this.field1587 >= arg0) {
                    if (arg0 < this.field1588) {
                        return;
                    }
                    try {
                        this.method562(arg0);
                    } catch (Exception var8) {
                        this.method558();
                        this.field1588 += 5000L;
                        return;
                    }
                    this.field1588 = 0L;
                    break;
                }
                class88.method651((byte) -108, 256);
                this.field1587 += 256000 / class114.field2442;
            }
        }
        while (this.field1587 < arg0) {
            this.field1587 += 250880 / class114.field2442;
            int var3;
            try {
                var3 = this.method560();
            } catch (Exception var6) {
                this.method558();
                this.field1588 = arg0;
                return;
            }
            this.method552(var3);
            int var4 = this.field1586 * 3 / 512 - this.field1584 * 2;
            if (var4 < 0) {
                var4 = 0;
            } else if (var4 > this.field1590) {
                var4 = this.field1590;
            }
            this.field1583 = this.field1578 - var4 - 256;
            if (this.field1583 < 256) {
                this.field1583 = 256;
            }
            if (this.field1578 < 16384) {
                if (var3 >= this.field1578) {
                    this.field1581 += 5;
                    if (this.field1581 >= 100) {
                        this.method558();
                        this.field1578 += 2048;
                        this.field1588 = arg0;
                        return;
                    }
                } else if (this.field1585 != var3 && this.field1581 > 0) {
                    this.field1581--;
                }
            }
            this.field1585 = var3;
            if (var3 < this.field1583) {
                break;
            }
            class88.method648(field1582, 256);
            try {
                this.method561();
            } catch (Exception var7) {
                this.method558();
                this.field1588 = arg0;
                return;
            }
            this.field1589 = arg0;
            this.field1585 -= 256;
        }
        if (arg0 < this.field1589 + 5000L) {
            return;
        }
        this.method558();
        this.field1588 = arg0;
        for (int var5 = 0; var5 < 512; var5++) {
            this.field1579[var5] = 0;
        }
        this.field1584 = this.field1590 = this.field1586 = 0;
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "()I")
    public abstract int method560() throws Exception;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "()V")
    public abstract void method561() throws Exception;

    @OriginalMember(owner = "client!le", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                synchronized (this) {
                    if (this.field1580) {
                        if (this.field1588 == 0L) {
                            this.method558();
                        }
                        this.field1580 = false;
                        return;
                    }
                    this.method555(System.currentTimeMillis());
                }
                class31.method247(5L, (byte) 123);
            }
        } catch (Exception var6) {
            class119.method884(32, var6, null);
        }
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(J)V")
    private final void method562(long arg0) throws Exception {
        this.method553(this.field1578);
        while (true) {
            int var3 = this.method560();
            if (var3 < this.field1583) {
                this.field1581 = 0;
                this.field1585 = 0;
                this.field1587 = arg0;
                this.field1589 = arg0;
                return;
            }
            this.method561();
        }
    }
}
