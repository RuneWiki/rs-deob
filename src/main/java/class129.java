import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class129 extends class4 {

    @OriginalMember(owner = "client!qi", name = "A", descriptor = "[Lcg;")
    public class166[] field2081;

    @OriginalMember(owner = "client!qi", name = "D", descriptor = "[I")
    public static int[] field2083 = new int[2];

    @OriginalMember(owner = "client!qi", name = "C", descriptor = "[I")
    public static int[] field2082 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!qi", name = "M", descriptor = "I")
    public static int field2090 = -1;

    @OriginalMember(owner = "client!qi", name = "J", descriptor = "[I")
    public static int[] field2088 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!qi", name = "x", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!qi", name = "y", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!qi", name = "z", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!qi", name = "E", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!qi", name = "F", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!qi", name = "G", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!qi", name = "H", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!qi", name = "K", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!qi", name = "N", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!qi", name = "O", descriptor = "[Ld;")
    public static class238[] field2092;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(II)Z")
    public final boolean method913(int arg0, int arg1) {
        field2079++;
        return arg0 > -82 ? false : this.field2081[arg1].field2643;
    }

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "(I)V")
    public static void method914(int arg0) {
        field2083 = null;
        field2088 = null;
        field2092 = null;
        field2082 = null;
        if (arg0 != 15914854) {
            field2082 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILog;)Ldl;")
    public static final class123 method915(int arg0, class221 arg1) {
        field2087++;
        if (arg0 > -89) {
            field2090 = -91;
        }
        return new class123(arg1.method1550(38), arg1.method1550(-125), arg1.method1550(62), arg1.method1550(122), arg1.method1531(65280), arg1.method1531(65280), arg1.method1517((byte) -96));
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method916(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2080++;
        if (class228.method1606(-1, arg6)) {
            class158.method1104(arg3, arg0, arg2, arg7, arg1, arg4 ^ arg4, class136.field2250[arg6], arg5, -1, arg8);
        } else if (arg7 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class275.field4352[var9] = true;
            }
        } else {
            class275.field4352[arg7] = true;
        }
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lqh;Lqh;IZ)V")
    public class129(class201 arg0, class201 arg1, int arg2, boolean arg3) {
        class115 var5 = new class115();
        int var6 = arg0.method1361(arg2, -106);
        this.field2081 = new class166[var6];
        int[] var7 = arg0.method1360(1, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1357(var7[var8], arg2, -1);
            class215 var10 = null;
            int var11 = var9[0] & 0xFF << 8 | var9[1] & 0xFF;
            for (class215 var12 = (class215) var5.method843(81); var12 != null; var12 = (class215) var5.method852((byte) 123)) {
                if (var12.field3509 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1372(var11, 0, -401709663);
                } else {
                    var13 = arg1.method1372(0, var11, -401709663);
                }
                var10 = new class215(var11, var13);
                var5.method855(false, var10);
            }
            this.field2081[var7[var8]] = new class166(var9, var10);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IB)Laa;")
    public static final class169 method917(int arg0, byte arg1) {
        field2085++;
        class169 var2 = (class169) class29.field466.method480((long) arg0, arg1 + 176);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class48.field854.method1357(arg0, 3, arg1 + 59);
        class169 var4 = new class169();
        if (arg1 != -60) {
            field2082 = null;
        }
        if (var3 != null) {
            var4.method1162(0, new class221(var3));
        }
        class29.field466.method474((long) arg0, (byte) 74, var4);
        return var4;
    }

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "(I)V")
    public static final void method918(int arg0) {
        if (class74.field1203 != null) {
            class74.field1203.method1196(1);
        }
        if (class13.field243 != null) {
            class13.field243.method1196(1);
        }
        field2089++;
        class1.method3(22050, (byte) -75, class260.field4139, 2);
        class74.field1203 = class231.method1615(class155.field2511, class105.field1684, 0, 22050, -100);
        class74.field1203.method1194(client.field2518, 0);
        class13.field243 = class231.method1615(class155.field2511, class105.field1684, 1, 2048, 109);
        if (arg0 == -1990) {
            class13.field243.method1194(class195.field3123, 0);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IILqh;I)[Lea;")
    public static final class37[] method919(int arg0, int arg1, class201 arg2, int arg3) {
        if (arg1 != 10072) {
            field2084 = -1;
        }
        field2091++;
        return class239.method1657(arg3, 95, arg0, arg2) ? class19.method189(true) : null;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(IB)Z")
    public final boolean method920(int arg0, byte arg1) {
        field2086++;
        return arg1 <= 85 ? true : this.field2081[arg0].field2631;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lnb;I)V")
    public static final void method921(class207 arg0, int arg1) {
        if (arg1 != 8182) {
            method914(-80);
        }
        field2078++;
        if (class222.field3682 == arg0.field3339 || arg0.field3378 == -1 || arg0.field3406 != 0 || arg0.field3354 + 1 > class49.method384(arg0.field3378, 52).field2836[arg0.field3386]) {
            int var2 = arg0.field3339 - arg0.field3373;
            int var3 = class222.field3682 - arg0.field3373;
            int var4 = arg0.field3357 * 128 + arg0.method278(0) * 64;
            int var5 = arg0.field3370 * 128 + (arg0.method278(0) * 64);
            int var6 = arg0.field3316 * 128 + (arg0.method278(0) * 64);
            int var7 = arg0.field3359 * 128 + arg0.method278(0) * 64;
            arg0.field3389 = ((var2 - var3) * var4 + (var3 * var6)) / var2;
            arg0.field3341 = ((var2 - var3) * var5 + var3 * var7) / var2;
        }
        arg0.field3337 = 0;
        if (arg0.field3375 == 0) {
            arg0.field3322 = 1024;
        }
        if (arg0.field3375 == 1) {
            arg0.field3322 = 1536;
        }
        if (arg0.field3375 == 2) {
            arg0.field3322 = 0;
        }
        if (arg0.field3375 == 3) {
            arg0.field3322 = 512;
        }
        arg0.field3320 = arg0.field3322;
    }
}
