import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class232 extends class192 {

    @OriginalMember(owner = "client!qd", name = "I", descriptor = "Lsm;")
    public class44 field4024;

    @OriginalMember(owner = "client!qd", name = "E", descriptor = "Loh;")
    public static class258 field4020 = class153.method1046("um", 95);

    @OriginalMember(owner = "client!qd", name = "K", descriptor = "Z")
    public static boolean field4026 = false;

    @OriginalMember(owner = "client!qd", name = "O", descriptor = "Loh;")
    public static class258 field4030 = class153.method1046("Starte 3D)2Softwarebibliothek)3", 127);

    @OriginalMember(owner = "client!qd", name = "N", descriptor = "Loh;")
    private static class258 field4029 = class153.method1046("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3", 86);

    @OriginalMember(owner = "client!qd", name = "C", descriptor = "I")
    public static int field4018 = 0;

    @OriginalMember(owner = "client!qd", name = "D", descriptor = "Loh;")
    public static class258 field4019 = field4029;

    @OriginalMember(owner = "client!qd", name = "P", descriptor = "Loh;")
    public static class258 field4031 = class153.method1046("gleiten:", 126);

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!qd", name = "F", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!qd", name = "G", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!qd", name = "H", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!qd", name = "J", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!qd", name = "L", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!qd", name = "M", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!qd", name = "Q", descriptor = "[[Z")
    public static boolean[][] field4032;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIII)I", line = 15)
    public static final int method1549(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class266.field4634[class89.method668(arg3, arg2)];
        if (arg1 >= -47) {
            return -59;
        }
        if (arg0 > 0) {
            int var5 = class266.field4643.method192(0, arg0 & 0xFFFF);
            if (var5 != 0) {
                int var6;
                if (arg2 < 0) {
                    var6 = 0;
                } else if (arg2 <= 127) {
                    var6 = arg2 * 131586;
                } else {
                    var6 = 16777215;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var7 = 256 - var5;
                    var4 = ((var4 & 0xFF00) * var7 + (var6 & 0xFF00) * var5 & 0xFF0000) + ((var4 & 0xFF00FF) * var7 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) >> 8;
                }
            }
            int var9 = class266.field4643.method193(5296, arg0 & 0xFFFF);
            if (var9 != 0) {
                var9 += 256;
                int var10 = ((var4 & 0xFF0000) >> 16) * var9;
                int var11 = ((var4 & 0xFF00) >> 8) * var9;
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
                var4 = (var12 >> 8) + ((var10 & 0xBB00FF00) << 8) + (var11 & 0xFF00);
            }
        }
        field4021++;
        return var4;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILgb;Lmd;Lgb;Lgb;)Z", line = 101)
    public static final boolean method1550(int arg0, class213 arg1, class114 arg2, class213 arg3, class213 arg4) {
        if (arg0 > -63) {
            field4019 = (class258) null;
        }
        class56.field882 = arg1;
        class99.field1762 = arg4;
        field4027++;
        class224.field3844 = arg2;
        class259.field4515 = arg3;
        return true;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BI)Loh;", line = 118)
    public static final class258 method1551(byte arg0, int arg1) {
        field4023++;
        if (arg1 >= 999999999) {
            return arg0 == 41 ? class171.field3031 : (class258) null;
        } else {
            return class218.method1481(107, arg1);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZI)V", line = 157)
    public static final void method1552(boolean arg0, int arg1) {
        if (arg1 != -12695) {
            method1551((byte) -25, -48);
        }
        field4022++;
        byte var2;
        byte[][] var3;
        if (class257.field4390 && arg0) {
            var2 = 1;
            var3 = class132.field2302;
        } else {
            var2 = 4;
            var3 = class191.field3383;
        }
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = (class231.field3990[var5] >> 8) * 64 - class229.field3955;
            int var7 = (class231.field3990[var5] & 0xFF) * 64 - class311.field5271;
            byte[] var8 = var3[var5];
            if (var8 != null) {
                class172.method1164(77);
                class71.method533((class264.field4598 - 6) * 8, arg0, var8, class165.field2797 * 8 - 48, class243.field4216, (byte) 2, var6, var7);
            }
        }
        for (int var9 = 0; var9 < var4; var9++) {
            int var10 = (class231.field3990[var9] >> 8) * 64 - class229.field3955;
            int var11 = (class231.field3990[var9] & 0xFF) * 64 - class311.field5271;
            byte[] var12 = var3[var9];
            if (var12 == null && class165.field2797 < 800) {
                class172.method1164(121);
                for (int var13 = 0; var13 < var2; var13++) {
                    class242.method1649(var10, true, var13, var11, 64, 64);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lsm;)V", line = 228)
    public class232(class44 arg0) {
        this.field4024 = arg0;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)V", line = 249)
    public static final void method1553(int arg0, int arg1, int arg2) {
        field4028++;
        class227.field3917[arg2] = arg0;
        class93 var3 = (class93) class103.field1875.method986((long) arg2, 0);
        if (var3 == null) {
            class93 var4 = new class93(class25.method197(-3418) + 500L);
            class103.field1875.method984((byte) -89, var4, (long) arg2);
        } else {
            var3.field1641 = class25.method197(-3418) + 500L;
        }
        if (arg1 != 16711680) {
            method1550(-42, (class213) null, (class114) null, (class213) null, (class213) null);
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)Lwf;", line = 272)
    public static final class218 method1554(int arg0, int arg1) {
        field4017++;
        class218 var2 = (class218) class301.field5148.method1159((byte) 127, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class95.field1662.method1453(arg1, (byte) -107, arg0);
        class218 var4 = new class218();
        if (var3 != null) {
            var4.method1479(-1, new class235(var3));
        }
        class301.field5148.method1163(var4, -1, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V", line = 297)
    public static void method1555(int arg0) {
        field4032 = (boolean[][]) null;
        field4029 = null;
        field4030 = null;
        field4031 = null;
        field4020 = null;
        if (arg0 != -16711936) {
            field4019 = (class258) null;
        }
        field4019 = null;
    }
}
