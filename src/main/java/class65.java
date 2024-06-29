import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public abstract class class65 extends class85 implements Runnable {

    @OriginalMember(owner = "client!ke", name = "D", descriptor = "[I")
    private int[] field1600 = new int[512];

    @OriginalMember(owner = "client!ke", name = "G", descriptor = "I")
    private int field1603 = 0;

    @OriginalMember(owner = "client!ke", name = "H", descriptor = "I")
    private int field1604 = 256;

    @OriginalMember(owner = "client!ke", name = "E", descriptor = "Z")
    private boolean field1601 = false;

    @OriginalMember(owner = "client!ke", name = "J", descriptor = "J")
    private long field1606 = 0L;

    @OriginalMember(owner = "client!ke", name = "L", descriptor = "I")
    private int field1608 = 0;

    @OriginalMember(owner = "client!ke", name = "N", descriptor = "I")
    private int field1610 = 0;

    @OriginalMember(owner = "client!ke", name = "O", descriptor = "I")
    private int field1611 = 0;

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "[I")
    public static int[] field1599 = new int[256];

    @OriginalMember(owner = "client!ke", name = "F", descriptor = "I")
    private int field1602;

    @OriginalMember(owner = "client!ke", name = "I", descriptor = "I")
    private int field1605;

    @OriginalMember(owner = "client!ke", name = "M", descriptor = "I")
    private int field1609;

    @OriginalMember(owner = "client!ke", name = "B", descriptor = "J")
    private long field1598;

    @OriginalMember(owner = "client!ke", name = "K", descriptor = "J")
    private long field1607;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V", line = 7)
    private final void method484(int arg0) {
        int var2 = arg0 - this.field1604;
        int var3 = this.field1600[this.field1611];
        this.field1600[this.field1611] = var2;
        this.field1608 += var2 - var3;
        int var4 = this.field1611 + 1 & 0x1FF;
        if (var2 > this.field1603) {
            this.field1603 = var2;
        }
        if (var2 < this.field1610) {
            this.field1610 = var2;
        }
        if (this.field1603 == var3) {
            int var5 = var2;
            for (int var6 = var4; this.field1611 != var6 && var5 < this.field1603; var6 = var6 + 1 & 0x1FF) {
                int var7 = this.field1600[var6];
                if (var7 > var5) {
                    var5 = var7;
                }
            }
            this.field1603 = var5;
        }
        if (this.field1610 == var3) {
            int var8 = var2;
            for (int var9 = var4; this.field1611 != var9 && var8 > this.field1610; var9 = var9 + 1 & 0x1FF) {
                int var10 = this.field1600[var9];
                if (var10 < var8) {
                    var8 = var10;
                }
            }
            this.field1610 = var8;
        }
        this.field1611 = var4;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(J)V", line = 67)
    public final synchronized void method486(long arg0) {
        this.method487(arg0);
        if (this.field1607 < arg0) {
            this.field1607 = arg0;
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(J)V", line = 77)
    private final void method487(long arg0) {
        if (this.field1606 != 0L) {
            while (true) {
                if (this.field1607 >= arg0) {
                    if (arg0 < this.field1606) {
                        return;
                    }
                    try {
                        this.method489(arg0);
                    } catch (Exception var8) {
                        this.method493();
                        this.field1606 += 5000L;
                        return;
                    }
                    this.field1606 = 0L;
                    break;
                }
                class85.method622(-115, 256);
                this.field1607 += 256000 / class43.field1083;
            }
        }
        while (this.field1607 < arg0) {
            this.field1607 += 250880 / class43.field1083;
            int var3;
            try {
                var3 = this.method488();
            } catch (Exception var6) {
                this.method493();
                this.field1606 = arg0;
                return;
            }
            this.method484(var3);
            int var4 = this.field1608 * 3 / 512 - this.field1610 * 2;
            if (var4 < 0) {
                var4 = 0;
            } else if (var4 > this.field1603) {
                var4 = this.field1603;
            }
            this.field1604 = this.field1602 - var4 - 256;
            if (this.field1604 < 256) {
                this.field1604 = 256;
            }
            if (this.field1602 < 16384) {
                if (var3 >= this.field1602) {
                    this.field1605 += 5;
                    if (this.field1605 >= 100) {
                        this.method493();
                        this.field1602 += 2048;
                        this.field1606 = arg0;
                        return;
                    }
                } else if (this.field1609 != var3 && this.field1605 > 0) {
                    this.field1605--;
                }
            }
            this.field1609 = var3;
            if (var3 < this.field1604) {
                break;
            }
            class85.method617(field1599, 256);
            try {
                this.method483();
            } catch (Exception var7) {
                this.method493();
                this.field1606 = arg0;
                return;
            }
            this.field1598 = arg0;
            this.field1609 -= 256;
        }
        if (arg0 < this.field1598 + 5000L) {
            return;
        }
        this.method493();
        this.field1606 = arg0;
        for (int var5 = 0; var5 < 512; var5++) {
            this.field1600[var5] = 0;
        }
        this.field1610 = this.field1603 = this.field1608 = 0;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(I)V", line = 202)
    public class65(int arg0) throws Exception {
        super(arg0);
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(J)V", line = 211)
    private final void method489(long arg0) throws Exception {
        this.method485(this.field1602);
        while (true) {
            int var3 = this.method488();
            if (var3 < this.field1604) {
                this.field1605 = 0;
                this.field1609 = 0;
                this.field1607 = arg0;
                this.field1598 = arg0;
                return;
            }
            this.method483();
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "()V", line = 249)
    public final void method490() {
        synchronized (this) {
            this.field1601 = true;
        }
        while (true) {
            synchronized (this) {
                if (!this.field1601) {
                    return;
                }
            }
            class127.method1004(50L, 116);
        }
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "()V", line = 268)
    public static void method491() {
        field1599 = null;
    }

    @OriginalMember(owner = "client!ke", name = "run", descriptor = "()V", line = 271)
    public final void run() {
        try {
            while (true) {
                synchronized (this) {
                    if (this.field1601) {
                        if (this.field1606 == 0L) {
                            this.method493();
                        }
                        this.field1601 = false;
                        return;
                    }
                    this.method486(class115.method856(true));
                }
                class127.method1004(5L, -107);
            }
        } catch (Exception var6) {
            class81.method607(null, var6, (byte) 29);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lbd;I)V", line = 297)
    public final void method492(class11 arg0, int arg1) throws Exception {
        this.field1602 = arg1;
        this.method489(class115.method856(true));
        arg0.method74(10, this, (byte) 2);
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "()V")
    public abstract void method483() throws Exception;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)V")
    public abstract void method485(int arg0) throws Exception;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "()I")
    public abstract int method488() throws Exception;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "()V")
    public abstract void method493();
}
