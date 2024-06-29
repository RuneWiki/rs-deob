import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class38 extends class133 {

    @OriginalMember(owner = "client!lj", name = "D", descriptor = "I")
    private int field413 = -1;

    @OriginalMember(owner = "client!lj", name = "E", descriptor = "I")
    private int field414 = 0;

    @OriginalMember(owner = "client!lj", name = "db", descriptor = "Z")
    private boolean field438 = false;

    @OriginalMember(owner = "client!lj", name = "N", descriptor = "I")
    private int field423 = -32768;

    @OriginalMember(owner = "client!lj", name = "jb", descriptor = "I")
    private int field444 = 0;

    @OriginalMember(owner = "client!lj", name = "eb", descriptor = "I")
    public int field439;

    @OriginalMember(owner = "client!lj", name = "ib", descriptor = "I")
    private int field443;

    @OriginalMember(owner = "client!lj", name = "U", descriptor = "I")
    private int field429;

    @OriginalMember(owner = "client!lj", name = "fb", descriptor = "I")
    private int field440;

    @OriginalMember(owner = "client!lj", name = "S", descriptor = "I")
    public int field427;

    @OriginalMember(owner = "client!lj", name = "I", descriptor = "I")
    public int field418;

    @OriginalMember(owner = "client!lj", name = "Z", descriptor = "I")
    public int field434;

    @OriginalMember(owner = "client!lj", name = "G", descriptor = "Lbo;")
    private class156 field416;

    @OriginalMember(owner = "client!lj", name = "lb", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!lj", name = "sb", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!lj", name = "L", descriptor = "D")
    private double field421;

    @OriginalMember(owner = "client!lj", name = "M", descriptor = "D")
    private double field422;

    @OriginalMember(owner = "client!lj", name = "X", descriptor = "D")
    private double field432;

    @OriginalMember(owner = "client!lj", name = "ab", descriptor = "D")
    private double field435;

    @OriginalMember(owner = "client!lj", name = "bb", descriptor = "D")
    private double field436;

    @OriginalMember(owner = "client!lj", name = "nb", descriptor = "D")
    private double field448;

    @OriginalMember(owner = "client!lj", name = "ob", descriptor = "D")
    private double field449;

    @OriginalMember(owner = "client!lj", name = "qb", descriptor = "D")
    private double field451;

    @OriginalMember(owner = "client!lj", name = "F", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!lj", name = "H", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!lj", name = "J", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!lj", name = "K", descriptor = "I")
    private int field420;

    @OriginalMember(owner = "client!lj", name = "O", descriptor = "I")
    private int field424;

    @OriginalMember(owner = "client!lj", name = "P", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!lj", name = "Q", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!lj", name = "T", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!lj", name = "V", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!lj", name = "W", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!lj", name = "Y", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!lj", name = "cb", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!lj", name = "gb", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!lj", name = "hb", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!lj", name = "kb", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!lj", name = "pb", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!lj", name = "rb", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!lj", name = "mb", descriptor = "Lkq;")
    private class69 field447;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(B)V")
    public final void method240(byte arg0) {
        ++field415;
        super.field1512 = super.field1510 = (short) ((int) (this.field432 / 128.0D));
        if (arg0 == -59) {
            super.field1518 = super.field1517 = (short) ((int) (this.field449 / 128.0D));
        }
    }

    @OriginalMember(owner = "client!lj", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field447 != null) {
            this.field447.method405();
        }
        ++field441;
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(I)Z")
    public final boolean method129(int arg0) {
        ++field433;
        if (arg0 != 3652) {
            this.method241(20);
        }
        return false;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Luo;IIIZBLpc;)V")
    public final void method137(class118 arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5, class22 arg6) {
        ++field437;
        if (arg5 <= -115) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
    public final void method241(int arg0) {
        if (arg0 != 0) {
            this.method243(112, (byte) 50, -7, 111, 77);
        }
        ++field452;
        if (this.field447 != null) {
            this.field447.method405();
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Luo;IIZ)Z")
    public final boolean method134(class118 arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            return false;
        } else {
            ++field425;
            return false;
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(ZI)V")
    public final void method242(boolean arg0, int arg1) {
        if (~this.field443 != 0) {
            this.field435 += this.field422 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field451;
            this.field451 += (double) arg1 * this.field422;
        } else {
            this.field435 += (double) arg1 * this.field451;
        }
        ++field442;
        this.field432 += (double) arg1 * this.field448;
        this.field449 += (double) arg1 * this.field421;
        this.field438 = true;
        this.field420 = 8192 + (int) (2607.5945876176133D * Math.atan2(this.field448, this.field421)) & 16383;
        if (!arg0) {
            this.field424 = 16383 & (int) (Math.atan2(this.field451, this.field436) * 2607.5945876176133D);
            if (this.field416 != null) {
                this.field444 += arg1;
                while (true) {
                    do {
                        do {
                            if (this.field444 <= this.field416.field1817[this.field414]) {
                                return;
                            }
                            this.field444 -= this.field416.field1817[this.field414];
                            ++this.field414;
                            if (~this.field414 <= ~this.field416.field1821.length) {
                                this.field414 -= this.field416.field1801;
                                if (this.field414 < 0 || this.field416.field1821.length <= this.field414) {
                                    this.field414 = 0;
                                }
                            }
                            this.field413 = this.field414 + 1;
                        } while (this.field413 < this.field416.field1821.length);
                        this.field413 -= this.field416.field1801;
                    } while (~this.field413 <= -1 && this.field413 < this.field416.field1821.length);
                    this.field413 = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class38(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg1, arg2, arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
        this.field439 = arg10;
        this.field438 = false;
        this.field443 = arg7;
        this.field429 = arg0;
        this.field440 = arg8;
        this.field427 = arg5;
        this.field418 = arg9;
        this.field434 = arg6;
        int var12 = class179.method1124((byte) -42, this.field429).field1935;
        if (var12 == -1) {
            this.field416 = null;
        } else {
            this.field416 = class430.method2621((byte) -81, var12);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IBIII)V")
    public final void method243(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (!this.field438) {
            double var6 = (double) (-super.field1516 + arg2);
            double var8 = (double) (arg3 - super.field1514);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field449 = (double) this.field440 * var8 / var10 + (double) super.field1514;
            this.field432 = (double) this.field440 * var6 / var10 + (double) super.field1516;
            this.field435 = (double) super.field1521;
        }
        ++field419;
        if (arg1 <= -95) {
            double var12 = (double) (this.field434 + 1 + -arg0);
            this.field421 = ((double) arg3 - this.field449) / var12;
            this.field448 = ((double) arg2 + -this.field432) / var12;
            this.field436 = Math.sqrt(this.field448 * this.field448 + this.field421 * this.field421);
            if (~this.field443 != 0) {
                if (!this.field438) {
                    this.field451 = -this.field436 * Math.tan((double) this.field443 * 0.02454369D);
                }
                this.field422 = ((double) arg4 - this.field435 + -(this.field451 * var12)) * 2.0D / (var12 * var12);
            } else {
                this.field451 = ((double) arg4 + -this.field435) / var12;
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILge;Luo;)V")
    private final void method244(int arg0, class386 arg1, class118 arg2) {
        if (arg0 < 76) {
            this.field414 = -71;
        }
        ++field431;
        class103[] var4 = arg1.method1443();
        class345[] var5 = arg1.method1475();
        if ((this.field447 == null || this.field447.field828) && (var4 != null || var5 != null)) {
            this.field447 = new class69(class106.field1273);
        }
        if (this.field447 != null) {
            this.field447.method396(arg2, (long) class106.field1273, var4, var5, false);
            this.field447.method406(super.field1528, super.field1512, super.field1510, super.field1518, super.field1517);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Luo;BI)Lge;")
    private final class386 method245(class118 arg0, byte arg1, int arg2) {
        if (arg1 < 96) {
            this.method245((class118) null, (byte) -15, -29);
        }
        ++field445;
        class167 var4 = class179.method1124((byte) -42, this.field429);
        return var4.method1062(this.field444, 128, arg2, this.field413, this.field414, arg0);
    }

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "(I)V")
    public final void method140(int arg0) {
        ++field417;
        if (arg0 > -24) {
            this.field424 = 62;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(B)I")
    public final int method246(byte arg0) {
        if (arg0 != 110) {
            return -31;
        } else {
            ++field450;
            return this.field423;
        }
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(Luo;B)Lkj;")
    public final class175 method130(class118 arg0, byte arg1) {
        ++field426;
        class386 var3 = this.method245(arg0, (byte) 113, 1024);
        if (var3 == null) {
            return null;
        } else {
            class450 var4 = arg0.method742();
            var4.method932(this.field424);
            var4.method934(this.field420);
            var4.method933((int) this.field432, (int) this.field435, (int) this.field449);
            if (this.field447 != null) {
                class291 var5 = this.field447.method404();
                arg0.method729(var3, var5, var4, (class34) null, 0);
            } else {
                var3.method1441(var4, (class34) null, 0);
            }
            int var6 = 45 % ((11 - arg1) / 37);
            this.field423 = var3.method1458();
            this.method244(122, var3, arg0);
            return null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLuo;)V")
    public final void method138(byte arg0, class118 arg1) {
        ++field430;
        class386 var3 = this.method245(arg1, (byte) 121, 0);
        if (var3 != null) {
            if (arg0 > 78) {
                class450 var4 = arg1.method742();
                var4.method932(this.field424);
                var4.method934(this.field420);
                var4.method933((int) this.field432, (int) this.field435, (int) this.field449);
                this.field423 = var3.method1458();
                this.method244(111, var3, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IJ[II)Ljava/lang/String;")
    public static final String method247(int arg0, long arg1, int[] arg2, int arg3) {
        if (arg0 != -1) {
            field453 = -32;
        }
        ++field428;
        if (class167.field1955 != null) {
            String var5 = class167.field1955.method1614(arg3, arg2, (byte) -125, arg1);
            if (var5 != null) {
                return var5;
            }
        }
        return Long.toString(arg1);
    }

    static {
        new class72("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
        field446 = -1;
        field453 = 0;
    }
}
