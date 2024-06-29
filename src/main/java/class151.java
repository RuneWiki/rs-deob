import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class151 {

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "Lof;")
    private class232 field2576 = new class232();

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field2564 = 0;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
    public static int field2574 = 0;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "Lof;")
    private class232 field2577;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "Lclient;")
    public static client field2569;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)I", line = 10)
    public final int method1191(byte arg0) {
        field2570++;
        if (arg0 >= -49) {
            return -100;
        }
        class232 var2 = this.field2576.field3871;
        int var3 = 0;
        while (this.field2576 != var2) {
            var3++;
            var2 = var2.field3871;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V", line = 39)
    public static void method1192(int arg0) {
        field2569 = null;
        if (arg0 != -2828) {
            method1200((byte[]) null, false);
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)Z", line = 50)
    public static final boolean method1193(int arg0) {
        field2566++;
        if (arg0 < 64) {
            field2569 = (client) null;
        }
        return class223.field3718 == 0 ? class215.field3560.method898(116) : true;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)Lof;", line = 69)
    public final class232 method1194(boolean arg0) {
        class232 var2 = this.field2576.field3871;
        if (arg0) {
            this.method1196((byte) 93);
        }
        field2563++;
        if (this.field2576 == var2) {
            return null;
        } else {
            var2.method1703((byte) 127);
            return var2;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BLof;)V", line = 88)
    public final void method1195(byte arg0, class232 arg1) {
        if (arg1.field3869 != null) {
            arg1.method1703((byte) 74);
        }
        arg1.field3869 = this.field2576.field3869;
        if (arg0 != -93) {
            this.field2576 = (class232) null;
        }
        arg1.field3871 = this.field2576;
        field2568++;
        arg1.field3869.field3871 = arg1;
        arg1.field3871.field3869 = arg1;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)V", line = 112)
    public final void method1196(byte arg0) {
        while (true) {
            class232 var2 = this.field2576.field3871;
            if (this.field2576 == var2) {
                this.field2577 = null;
                if (arg0 != 82) {
                    method1200((byte[]) null, true);
                }
                field2567++;
                return;
            }
            var2.method1703((byte) 84);
        }
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)Lof;", line = 141)
    public final class232 method1197(int arg0) {
        class232 var2 = this.field2576.field3871;
        if (arg0 != 17181) {
            method1192(-56);
        }
        field2571++;
        if (this.field2576 == var2) {
            this.field2577 = null;
            return null;
        } else {
            this.field2577 = var2.field3871;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(B)Lof;", line = 167)
    public final class232 method1198(byte arg0) {
        class232 var2 = this.field2577;
        if (arg0 > -124) {
            method1193(-8);
        }
        field2565++;
        if (this.field2576 == var2) {
            this.field2577 = null;
            return null;
        } else {
            this.field2577 = var2.field3871;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIII)I", line = 188)
    public static final int method1199(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 > -75) {
            method1200((byte[]) null, false);
        }
        field2573++;
        int var4 = class109.field1746[class220.method1625(arg1, arg2)];
        if (arg0 > 0) {
            int var5 = class109.field1747.method835(arg0 & 0xFFFF, true);
            if (var5 != 0) {
                int var6;
                if (arg2 < 0) {
                    var6 = 0;
                } else if (arg2 > 127) {
                    var6 = 16777215;
                } else {
                    var6 = arg2 * 131586;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var7 = 256 - var5;
                    var4 = ((var4 & 0xFF00) * var7 + (var6 & 0xFF00) * var5 & 0xFF0000) + ((var4 & 0xFF00FF) * var7 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) >> 8;
                }
            }
            int var9 = class109.field1747.method828(-12560, arg0 & 0xFFFF);
            if (var9 != 0) {
                var9 += 256;
                int var10 = ((var4 & 0xFF00) >> 8) * var9;
                int var11 = (var4 >> 16 & 0xFF) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = (var4 & 0xFF) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                if (var10 > 65535) {
                    var10 = 65535;
                }
                var4 = (var12 >> 8) + ((var11 & 0xB700FF00) << 8) + (var10 & 0xFF00);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "([BZ)[B", line = 258)
    public static final byte[] method1200(byte[] arg0, boolean arg1) {
        field2575++;
        class47 var2 = new class47(arg0);
        int var3 = var2.method368(103);
        if (arg1) {
            method1199(-90, 119, -105, 116);
        }
        int var4 = var2.method373((byte) 36);
        if (var4 < 0 || !(class205.field3418 == 0 || var4 <= class205.field3418)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method363(!arg1, var5, 0, var4);
            return var5;
        } else {
            int var6 = var2.method373((byte) 36);
            if (var6 < 0 || !(class205.field3418 == 0 || class205.field3418 >= var6)) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class38.method268(var7, var6, arg0, var4, 9);
            } else {
                class11.field216.method1404(-40, var2, var7);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V", line = 320)
    public class151() {
        this.field2576.field3871 = this.field2576;
        this.field2576.field3869 = this.field2576;
    }
}
