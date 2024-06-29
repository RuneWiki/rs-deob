import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class116 extends class288 {

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
    public int field1605 = 0;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "[C")
    public static char[] field1598 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "[I")
    public static int[] field1599 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!ra", name = "A", descriptor = "I")
    public static int field1613 = 0;

    @OriginalMember(owner = "client!ra", name = "R", descriptor = "I")
    public static int field1629 = 2;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
    public int field1603;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "I")
    public int field1607;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!ra", name = "y", descriptor = "I")
    public int field1611;

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "I")
    public int field1612;

    @OriginalMember(owner = "client!ra", name = "B", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!ra", name = "C", descriptor = "I")
    public int field1615;

    @OriginalMember(owner = "client!ra", name = "D", descriptor = "I")
    public int field1616;

    @OriginalMember(owner = "client!ra", name = "F", descriptor = "I")
    public int field1618;

    @OriginalMember(owner = "client!ra", name = "H", descriptor = "I")
    public int field1620;

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "I")
    public int field1621;

    @OriginalMember(owner = "client!ra", name = "L", descriptor = "I")
    public int field1623;

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "I")
    public int field1624;

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!ra", name = "E", descriptor = "Ltl;")
    public class240 field1617;

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "Lgl;")
    public class273 field1630;

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "Lqe;")
    public class278 field1610;

    @OriginalMember(owner = "client!ra", name = "K", descriptor = "Lqe;")
    public class278 field1622;

    @OriginalMember(owner = "client!ra", name = "G", descriptor = "Lbc;")
    public static class282 field1619;

    @OriginalMember(owner = "client!ra", name = "Q", descriptor = "Lbc;")
    public static class282 field1628;

    @OriginalMember(owner = "client!ra", name = "P", descriptor = "Loe;")
    public class54 field1627;

    @OriginalMember(owner = "client!ra", name = "O", descriptor = "Z")
    public boolean field1626;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "[I")
    public int[] field1609;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIBII)V")
    public static final void method743(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        int var9 = arg2 + 1;
        class76.method463(arg4, 0, arg5, arg1, class268.field3919[arg2]);
        if (arg3 != 28) {
            method751(-107);
        }
        field1602++;
        int var8 = arg0 - 1;
        class76.method463(arg4, 0, arg5, arg1, class268.field3919[arg0]);
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class268.field3919[var6];
            var7[arg4] = var7[arg1] = arg5;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method744(int arg0, int arg1) {
        field1614++;
        if (arg1 < 65) {
            field1628 = null;
        }
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class202.field2867 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class246.field3582 + "</col>";
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILtl;)I")
    public static final int method745(int arg0, class240 arg1) {
        if (arg0 != 0) {
            method747((byte) 86, (class160) null);
        }
        int var2 = arg1.field3498;
        class285 var3 = arg1.method1949(-1);
        if (arg1.field4579 == var3.field4376) {
            var2 = arg1.field3490;
        } else if (arg1.field4579 == var3.field4403 || arg1.field4579 == var3.field4410 || arg1.field4579 == var3.field4384 || arg1.field4579 == var3.field4378) {
            var2 = arg1.field3476;
        } else if (arg1.field4579 == var3.field4385 || arg1.field4579 == var3.field4396 || arg1.field4579 == var3.field4388 || arg1.field4579 == var3.field4394) {
            var2 = arg1.field3474;
        }
        field1601++;
        return var2;
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)V")
    public static final void method746(int arg0) {
        for (int var1 = arg0; var1 < 100; var1++) {
            class129.field1862[var1] = true;
        }
        field1606++;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLic;)V")
    public static final void method747(byte arg0, class160 arg1) {
        field1608++;
        if (arg0 > -108) {
            field1629 = -21;
        }
        arg1.field2314 = false;
        if (arg1.field2313 != null) {
            arg1.field2313.field2759 = 0;
        }
        for (class160 var2 = arg1.method196(); var2 != null; var2 = arg1.method195()) {
            method747((byte) -126, var2);
        }
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)V")
    public static final void method748(int arg0) {
        class274.field4099.method71(-77);
        class277.field4211.method71(-97);
        field1600++;
        if (arg0 > -123) {
            field1629 = -24;
        }
    }

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "(I)Lpg;")
    public static final class187 method749(int arg0) {
        field1625++;
        int var1 = class91.field1236[0] * class296.field4677[0];
        byte[] var2 = class277.field4210[arg0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class165.field2367[class5.method26(255, var2[var4])];
        }
        class187 var5 = new class187(class238.field3435, class118.field1660, class233.field3367[0], class273.field4041[0], class296.field4677[0], class91.field1236[0], var3);
        class294.method1965(true);
        return var5;
    }

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "(I)V")
    public final void method750(int arg0) {
        field1604++;
        int var2 = this.field1612;
        if (arg0 != 101) {
            method743(-114, -74, 123, (byte) -20, -120, 78);
        }
        if (this.field1630 != null) {
            class273 var3 = this.field1630.method1751(-23199);
            if (var3 == null) {
                this.field1609 = null;
                this.field1620 = 0;
                this.field1621 = 0;
                this.field1616 = 0;
                this.field1618 = 0;
                this.field1612 = -1;
            } else {
                this.field1618 = var3.field4007;
                this.field1621 = var3.field4025 * 128;
                this.field1616 = var3.field4054;
                this.field1609 = var3.field4018;
                this.field1612 = var3.field4067;
                this.field1620 = var3.field4056;
            }
        } else if (this.field1627 != null) {
            int var4 = class290.method1943(-1, this.field1627);
            if (var2 != var4) {
                this.field1612 = var4;
                class267 var5 = this.field1627.field636;
                if (var5.field3884 != null) {
                    var5 = var5.method1707(-1);
                }
                if (var5 == null) {
                    this.field1616 = this.field1621 = 0;
                } else {
                    this.field1621 = var5.field3875 * 128;
                    this.field1616 = var5.field3889;
                }
            }
        } else if (this.field1617 != null) {
            this.field1612 = method745(0, this.field1617);
            this.field1616 = this.field1617.field3491;
            this.field1621 = this.field1617.field3475 * 128;
        }
        if (this.field1612 != var2 && this.field1610 != null) {
            class14.field178.method189(this.field1610);
            this.field1610 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "(I)V")
    public static void method751(int arg0) {
        field1599 = null;
        if (arg0 >= -85) {
            field1629 = 65;
        }
        field1619 = null;
        field1628 = null;
        field1598 = null;
    }
}
