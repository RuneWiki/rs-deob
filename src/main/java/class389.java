import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class389 extends class304 {

    @OriginalMember(owner = "client!th", name = "M", descriptor = "I")
    private int field5525 = -32768;

    @OriginalMember(owner = "client!th", name = "L", descriptor = "I")
    private int field5524 = -1;

    @OriginalMember(owner = "client!th", name = "Y", descriptor = "Z")
    private boolean field5536 = false;

    @OriginalMember(owner = "client!th", name = "U", descriptor = "I")
    private int field5533 = 0;

    @OriginalMember(owner = "client!th", name = "mb", descriptor = "I")
    private int field5550 = 0;

    @OriginalMember(owner = "client!th", name = "qb", descriptor = "I")
    private int field5554;

    @OriginalMember(owner = "client!th", name = "hb", descriptor = "I")
    public int field5545;

    @OriginalMember(owner = "client!th", name = "F", descriptor = "I")
    public int field5519;

    @OriginalMember(owner = "client!th", name = "W", descriptor = "I")
    public int field5534;

    @OriginalMember(owner = "client!th", name = "T", descriptor = "I")
    private int field5532;

    @OriginalMember(owner = "client!th", name = "J", descriptor = "I")
    private int field5522;

    @OriginalMember(owner = "client!th", name = "P", descriptor = "I")
    public int field5528;

    @OriginalMember(owner = "client!th", name = "N", descriptor = "Lok;")
    private class153 field5526;

    @OriginalMember(owner = "client!th", name = "I", descriptor = "Lcp;")
    public static class470 field5521 = new class470(16);

    @OriginalMember(owner = "client!th", name = "pb", descriptor = "Ldk;")
    public static class326 field5553 = new class326("K", "T", "K", "K");

    @OriginalMember(owner = "client!th", name = "y", descriptor = "D")
    private double field5513;

    @OriginalMember(owner = "client!th", name = "A", descriptor = "D")
    private double field5515;

    @OriginalMember(owner = "client!th", name = "D", descriptor = "D")
    private double field5517;

    @OriginalMember(owner = "client!th", name = "O", descriptor = "D")
    private double field5527;

    @OriginalMember(owner = "client!th", name = "X", descriptor = "D")
    private double field5535;

    @OriginalMember(owner = "client!th", name = "bb", descriptor = "D")
    private double field5539;

    @OriginalMember(owner = "client!th", name = "fb", descriptor = "D")
    private double field5543;

    @OriginalMember(owner = "client!th", name = "ob", descriptor = "D")
    private double field5552;

    @OriginalMember(owner = "client!th", name = "z", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!th", name = "B", descriptor = "I")
    public static int field5516;

    @OriginalMember(owner = "client!th", name = "E", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!th", name = "H", descriptor = "I")
    private int field5520;

    @OriginalMember(owner = "client!th", name = "K", descriptor = "I")
    public static int field5523;

    @OriginalMember(owner = "client!th", name = "Q", descriptor = "I")
    public static int field5529;

    @OriginalMember(owner = "client!th", name = "R", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!th", name = "S", descriptor = "I")
    public static int field5531;

    @OriginalMember(owner = "client!th", name = "Z", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!th", name = "ab", descriptor = "I")
    public static int field5538;

    @OriginalMember(owner = "client!th", name = "cb", descriptor = "I")
    public static int field5540;

    @OriginalMember(owner = "client!th", name = "db", descriptor = "I")
    public static int field5541;

    @OriginalMember(owner = "client!th", name = "eb", descriptor = "I")
    public static int field5542;

    @OriginalMember(owner = "client!th", name = "gb", descriptor = "I")
    public static int field5544;

    @OriginalMember(owner = "client!th", name = "jb", descriptor = "I")
    public static int field5547;

    @OriginalMember(owner = "client!th", name = "kb", descriptor = "I")
    private int field5548;

    @OriginalMember(owner = "client!th", name = "lb", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!th", name = "nb", descriptor = "I")
    public static int field5551;

    @OriginalMember(owner = "client!th", name = "ib", descriptor = "Lg;")
    private class97 field5546;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(ILnp;)Lql;")
    public final class477 method120(int arg0, class313 arg1) {
        ++field5540;
        class491 var3 = this.method2336(arg1, 1024, 26);
        if (var3 == null) {
            return null;
        } else {
            class282 var4 = arg1.method601();
            var4.method1015(this.field5520);
            var4.method1020(this.field5548);
            var4.method1012((int) this.field5527, (int) this.field5515, (int) this.field5535);
            if (this.field5546 != null) {
                class207 var5 = this.field5546.method552();
                arg1.method646(var3, var5, var4, (class98) null, 0);
            } else {
                var3.method1323(var4, (class98) null, 0);
            }
            this.field5525 = var3.method1289();
            this.method2339(var3, arg0, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lnp;B)V")
    public final void method103(class313 arg0, byte arg1) {
        if (arg1 < -95) {
            ++field5542;
            class491 var3 = this.method2336(arg0, 0, -99);
            if (var3 != null) {
                class282 var4 = arg0.method601();
                var4.method1015(this.field5520);
                var4.method1020(this.field5548);
                var4.method1012((int) this.field5527, (int) this.field5515, (int) this.field5535);
                this.field5525 = var3.method1289();
                this.method2339(var3, 0, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V")
    public final void method2335(byte arg0) {
        if (this.field5546 != null) {
            this.field5546.method554();
        }
        if (arg0 != -30) {
            this.field5554 = -67;
        }
        ++field5531;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lnp;II)Lf;")
    private final class491 method2336(class313 arg0, int arg1, int arg2) {
        ++field5516;
        class327 var4 = class324.field4674.method1279(this.field5522, -2);
        int var5 = -28 / ((-17 - arg2) / 42);
        return var4.method2074(0, class64.field836, this.field5550, arg0, this.field5524, this.field5533, arg1);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)V")
    public final void method2337(int arg0, int arg1) {
        ++field5549;
        if (~this.field5532 != 0) {
            this.field5515 += this.field5513 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field5552;
            this.field5552 += (double) arg0 * this.field5513;
        } else {
            this.field5515 += (double) arg0 * this.field5552;
        }
        this.field5527 += (double) arg0 * this.field5517;
        this.field5535 += (double) arg0 * this.field5543;
        if (arg1 != -1) {
            field5521 = null;
        }
        this.field5536 = true;
        this.field5548 = (int) (2607.5945876176133D * Math.atan2(this.field5517, this.field5543)) - -8192 & 16383;
        this.field5520 = 16383 & (int) (2607.5945876176133D * Math.atan2(this.field5552, this.field5539));
        if (this.field5526 != null) {
            this.field5550 += arg0;
            while (true) {
                do {
                    do {
                        if (~this.field5550 >= ~this.field5526.field2275[this.field5533]) {
                            return;
                        }
                        this.field5550 -= this.field5526.field2275[this.field5533];
                        ++this.field5533;
                        if (~this.field5526.field2254.length >= ~this.field5533) {
                            this.field5533 -= this.field5526.field2255;
                            if (~this.field5533 > -1 || this.field5526.field2254.length <= this.field5533) {
                                this.field5533 = 0;
                            }
                        }
                        this.field5524 = this.field5533 + 1;
                    } while (~this.field5526.field2254.length < ~this.field5524);
                    this.field5524 -= this.field5526.field2255;
                } while (~this.field5524 <= -1 && ~this.field5524 > ~this.field5526.field2254.length);
                this.field5524 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "h", descriptor = "(I)V")
    public final void method922(int arg0) {
        if (arg0 != 200) {
            this.field5539 = 1.777707224638755D;
        }
        super.field4330 = super.field4328 = (short) ((int) (this.field5527 / 128.0D));
        ++field5523;
        super.field4324 = super.field4334 = (short) ((int) (this.field5535 / 128.0D));
    }

    @OriginalMember(owner = "client!th", name = "j", descriptor = "(I)I")
    public final int method323(int arg0) {
        ++field5551;
        if (arg0 != 0) {
            field5521 = null;
        }
        return this.field5525;
    }

    @OriginalMember(owner = "client!th", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field5537;
        if (this.field5546 != null) {
            this.field5546.method554();
        }
    }

    @OriginalMember(owner = "client!th", name = "e", descriptor = "(I)Z")
    public final boolean method249(int arg0) {
        if (arg0 > -105) {
            this.method2336((class313) null, -95, -77);
        }
        ++field5541;
        return false;
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class389(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg1, arg2, arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
        this.field5554 = arg8;
        this.field5545 = arg5;
        this.field5519 = arg10;
        this.field5534 = arg9;
        this.field5532 = arg7;
        this.field5522 = arg0;
        this.field5536 = false;
        this.field5528 = arg6;
        int var12 = class324.field4674.method1279(this.field5522, -2).field4714;
        if (~var12 != 0) {
            this.field5526 = class64.field836.method2081(var12, 0);
        } else {
            this.field5526 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
    public static final Class method2338(String arg0, byte arg1) throws ClassNotFoundException {
        ++field5538;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else {
            if (arg1 != 66) {
                field5553 = null;
            }
            if (arg0.equals("I")) {
                return Integer.TYPE;
            } else if (arg0.equals("S")) {
                return Short.TYPE;
            } else if (arg0.equals("J")) {
                return Long.TYPE;
            } else if (arg0.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg0.equals("F")) {
                return Float.TYPE;
            } else if (arg0.equals("D")) {
                return Double.TYPE;
            } else {
                return arg0.equals("C") ? Character.TYPE : Class.forName(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lf;ILnp;)V")
    private final void method2339(class491 arg0, int arg1, class313 arg2) {
        ++field5518;
        if (arg1 == 0) {
            class295[] var4 = arg0.method1300();
            class168[] var5 = arg0.method1286();
            if ((this.field5546 == null || this.field5546.field1244) && (var4 != null || var5 != null)) {
                this.field5546 = new class97(class353.field5090);
            }
            if (this.field5546 != null) {
                this.field5546.method558(arg2, (long) class353.field5090, var4, var5, false);
                this.field5546.method548(super.field4319, super.field4330, super.field4328, super.field4324, super.field4334);
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
    public static void method2340(int arg0) {
        field5521 = null;
        if (arg0 != -11351) {
            field5521 = null;
        }
        field5553 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIBI)V")
    public final void method2341(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field5514;
        if (!this.field5536) {
            double var6 = (double) (-super.field4331 + arg0);
            double var8 = (double) (-super.field4317 + arg1);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field5515 = (double) super.field4322;
            this.field5535 = (double) this.field5554 * var8 / var10 + (double) super.field4317;
            this.field5527 = (double) this.field5554 * var6 / var10 + (double) super.field4331;
        }
        if (arg3 != 81) {
            this.method249(11);
        }
        double var12 = (double) (this.field5528 + 1 + -arg2);
        this.field5517 = ((double) arg0 - this.field5527) / var12;
        this.field5543 = ((double) arg1 + -this.field5535) / var12;
        this.field5539 = Math.sqrt(this.field5543 * this.field5543 + this.field5517 * this.field5517);
        if (this.field5532 == -1) {
            this.field5552 = ((double) arg4 + -this.field5515) / var12;
        } else {
            if (!this.field5536) {
                this.field5552 = -this.field5539 * Math.tan((double) this.field5532 * 0.02454369D);
            }
            this.field5513 = ((double) arg4 - this.field5515 - this.field5552 * var12) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(I)V")
    public final void method246(int arg0) {
        ++field5547;
        if (arg0 == -1) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIILnp;)Z")
    public final boolean method113(int arg0, int arg1, int arg2, class313 arg3) {
        if (arg1 <= 16) {
            this.field5543 = 0.6642066108636812D;
        }
        ++field5544;
        return false;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V")
    public static final void method2342(int arg0) {
        ++field5530;
        int var1 = class37.field491;
        int[] var2 = class348.field5033;
        for (int var3 = 0; ~var1 < ~var3; ++var3) {
            class452 var4 = class124.field1559[var2[var3]];
            if (var4 != null) {
                class485.method2836(var4.method918(false), true, var4);
            }
        }
        if (arg0 != -27511) {
            method2340(-80);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILin;ILnp;BZI)V")
    public final void method247(int arg0, class54 arg1, int arg2, class313 arg3, byte arg4, boolean arg5, int arg6) {
        int var8 = -118 % ((arg4 - 20) / 38);
        ++field5529;
        throw new IllegalStateException();
    }
}
