import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class112 extends class362 implements class21 {

    @OriginalMember(owner = "client!jh", name = "L", descriptor = "B")
    private byte field1521;

    @OriginalMember(owner = "client!jh", name = "E", descriptor = "B")
    private byte field1515;

    @OriginalMember(owner = "client!jh", name = "B", descriptor = "B")
    private byte field1512;

    @OriginalMember(owner = "client!jh", name = "Q", descriptor = "Z")
    private boolean field1525;

    @OriginalMember(owner = "client!jh", name = "G", descriptor = "S")
    private short field1517;

    @OriginalMember(owner = "client!jh", name = "M", descriptor = "Z")
    private boolean field1522;

    @OriginalMember(owner = "client!jh", name = "V", descriptor = "Z")
    private boolean field1530;

    @OriginalMember(owner = "client!jh", name = "K", descriptor = "Le;")
    private class377 field1520;

    @OriginalMember(owner = "client!jh", name = "H", descriptor = "Li;")
    private class31 field1518;

    @OriginalMember(owner = "client!jh", name = "x", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!jh", name = "y", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!jh", name = "z", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!jh", name = "A", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!jh", name = "C", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!jh", name = "D", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!jh", name = "F", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!jh", name = "I", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!jh", name = "P", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!jh", name = "R", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!jh", name = "S", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!jh", name = "T", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!jh", name = "U", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!jh", name = "W", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!jh", name = "X", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!jh", name = "O", descriptor = "[[I")
    public static int[][] field1523;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)I")
    public final int method110(byte arg0) {
        if (arg0 <= 100) {
            return -98;
        } else {
            ++field1516;
            return 65535 & this.field1517;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILza;I)Le;")
    public final class377 method116(int arg0, class290 arg1, int arg2) {
        if (arg0 != 13439) {
            return null;
        } else {
            ++field1528;
            return this.method760(-105, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "(I)V")
    public static void method756(int arg0) {
        if (arg0 != 0) {
            field1523 = null;
        }
        field1523 = null;
    }

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "(I)V")
    public static final void method757(int arg0) {
        ++field1531;
        class322.field4640.method1095(arg0 ^ 1);
        class188.field2699.method1095(arg0 ^ arg0);
        class362.field5182.method1095(0);
        class293.field4289.method1095(arg0 + -1);
        class62.field783.method1095(0);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lza;ZIZ)Lqr;")
    private final class48 method758(class290 arg0, boolean arg1, int arg2, boolean arg3) {
        ++field1513;
        class270 var5 = class377.field5338.method1901(50, this.field1517 & 65535);
        if (arg3) {
            this.field1515 = -30;
        }
        class38 var6;
        class38 var7;
        if (!this.field1525) {
            var6 = class68.field858[this.field1512];
            if (~this.field1512 > -4) {
                var7 = class68.field858[this.field1512 + 1];
            } else {
                var7 = null;
            }
        } else {
            var7 = class68.field858[0];
            var6 = class60.field743[this.field1512];
        }
        return var5.method1697(arg0, this.field1521, arg2, this.field1515, super.field5171, super.field5167, (byte) 120, arg1, var6, super.field5174, var7);
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)Z")
    public final boolean method113(int arg0) {
        if (arg0 != 31692) {
            this.method759(63);
        }
        ++field1508;
        return this.field1530;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IILza;I)Z")
    public final boolean method129(int arg0, int arg1, class290 arg2, int arg3) {
        ++field1514;
        if (arg0 != 3) {
            return false;
        } else {
            class377 var5 = this.method760(-118, 131072, arg2);
            if (var5 != null) {
                class125 var6 = arg2.method368();
                var6.method825(super.field5167, super.field5174, super.field5171);
                return var5.method1586(arg1, arg3, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lza;I)V")
    public final void method130(class290 arg0, int arg1) {
        ++field1529;
        if (arg1 != 0) {
            this.method126((class290) null, (byte) 105);
        }
    }

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "(I)I")
    public final int method759(int arg0) {
        ++field1532;
        if (arg0 != -20767) {
            this.field1518 = null;
        }
        return this.field1520 != null ? this.field1520.method1568() : 0;
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)I")
    public final int method114(int arg0) {
        ++field1509;
        return arg0 != -9772 ? -116 : this.field1515;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(Lza;B)Lkf;")
    public final class170 method126(class290 arg0, byte arg1) {
        ++field1526;
        if (this.field1520 == null) {
            return null;
        } else {
            class125 var3 = arg0.method368();
            if (arg1 >= -86) {
                field1523 = null;
            }
            var3.method825(super.field5175 + super.field5167, super.field5174, super.field5171 + super.field5169);
            class170 var4 = null;
            if (this.field1522) {
                var4 = class423.method2509(0, 1);
            }
            this.field1520.method1566(var3, var4 != null ? var4.field2475[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IILza;)Le;")
    private final class377 method760(int arg0, int arg1, class290 arg2) {
        ++field1527;
        if (this.field1520 != null && arg2.method324(this.field1520.method1605(), arg1) == 0) {
            return this.field1520;
        } else {
            class48 var4 = this.method758(arg2, false, arg1, false);
            if (arg0 > -66) {
                this.method110((byte) 38);
            }
            return var4 == null ? null : var4.field555;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lza;B)V")
    public final void method117(class290 arg0, byte arg1) {
        ++field1519;
        Object var3 = null;
        class31 var5;
        if (this.field1518 == null && this.field1530) {
            class48 var4 = this.method758(arg0, true, 262144, false);
            var5 = var4 != null ? var4.field556 : null;
        } else {
            var5 = this.field1518;
            this.field1518 = null;
        }
        if (var5 != null) {
            class265.method1681(var5, this.field1512, super.field5167, super.field5171, (boolean[]) null);
        }
        if (arg1 != -38) {
            this.field1521 = 48;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILza;)V")
    public final void method111(int arg0, class290 arg1) {
        ++field1510;
        if (arg0 != -38) {
            this.field1530 = true;
        }
        Object var3 = null;
        class31 var5;
        if (this.field1518 == null && this.field1530) {
            class48 var4 = this.method758(arg1, true, 262144, false);
            var5 = var4 == null ? null : var4.field556;
        } else {
            var5 = this.field1518;
            this.field1518 = null;
        }
        if (var5 != null) {
            class264.method1680(var5, this.field1512, super.field5167, super.field5171, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)I")
    public final int method112(int arg0) {
        ++field1524;
        int var2 = 81 / ((arg0 - -5) / 55);
        return this.field1521;
    }

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(I)V")
    public final void method115(int arg0) {
        if (this.field1520 != null) {
            this.field1520.method1587();
        }
        if (arg0 != 16372) {
            method756(-94);
        }
        ++field1511;
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lza;Lfu;IIIIZIIIII)V")
    public class112(class290 arg0, class270 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class79.method602(arg11, false, arg10));
        this.field1521 = (byte) arg10;
        this.field1515 = (byte) arg11;
        this.field1512 = (byte) arg2;
        this.field1525 = arg6;
        super.field5167 = arg3;
        this.field1517 = (short) arg1.field3952;
        super.field5171 = arg5;
        this.field1522 = arg1.field3957 != 0 && !arg6;
        this.field1530 = arg0.method339() && arg1.field3975 && !this.field1525 && class4.field81.method726(class405.field5737, 123) != 0;
        class48 var13 = this.method758(arg0, this.field1530, 2048, false);
        if (var13 != null) {
            this.field1520 = var13.field555;
            this.field1518 = var13.field556;
        }
    }
}
