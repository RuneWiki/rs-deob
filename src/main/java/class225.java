import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class225 {

    @OriginalMember(owner = "client!df", name = "f", descriptor = "[I")
    public static int[] field3243 = new int[500];

    @OriginalMember(owner = "client!df", name = "h", descriptor = "Lap;")
    public static class310 field3245 = new class310(48, 4);

    @OriginalMember(owner = "client!df", name = "i", descriptor = "Z")
    public static boolean field3246 = false;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "Lch;")
    public static class151 field3247 = new class151("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

    @OriginalMember(owner = "client!df", name = "k", descriptor = "Lrc;")
    public static class108 field3248 = new class108(3, 2);

    @OriginalMember(owner = "client!df", name = "l", descriptor = "Lmo;")
    public static class336 field3249 = new class336(4);

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIII[BLjava/lang/String;)I", line = 11)
    public static final int method1530(int arg0, int arg1, int arg2, int arg3, byte[] arg4, String arg5) {
        field3239++;
        int var6 = arg3 - arg0;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg5.charAt(arg0 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg4[arg1 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg4[arg1 + var7] = -128;
            } else if (var8 == '‚') {
                arg4[arg1 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg4[arg1 + var7] = -125;
            } else if (var8 == '„') {
                arg4[arg1 + var7] = -124;
            } else if (var8 == '…') {
                arg4[arg1 + var7] = -123;
            } else if (var8 == '†') {
                arg4[arg1 + var7] = -122;
            } else if (var8 == '‡') {
                arg4[arg1 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg4[arg1 + var7] = -120;
            } else if (var8 == '‰') {
                arg4[arg1 + var7] = -119;
            } else if (var8 == 'Š') {
                arg4[arg1 + var7] = -118;
            } else if (var8 == '‹') {
                arg4[arg1 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg4[arg1 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg4[arg1 + var7] = -114;
            } else if (var8 == '‘') {
                arg4[arg1 + var7] = -111;
            } else if (var8 == '’') {
                arg4[arg1 + var7] = -110;
            } else if (var8 == '“') {
                arg4[arg1 + var7] = -109;
            } else if (var8 == '”') {
                arg4[arg1 + var7] = -108;
            } else if (var8 == '•') {
                arg4[arg1 + var7] = -107;
            } else if (var8 == '–') {
                arg4[arg1 + var7] = -106;
            } else if (var8 == '—') {
                arg4[arg1 + var7] = -105;
            } else if (var8 == '˜') {
                arg4[arg1 + var7] = -104;
            } else if (var8 == '™') {
                arg4[arg1 + var7] = -103;
            } else if (var8 == 'š') {
                arg4[arg1 + var7] = -102;
            } else if (var8 == '›') {
                arg4[arg1 + var7] = -101;
            } else if (var8 == 'œ') {
                arg4[arg1 + var7] = -100;
            } else if (var8 == 'ž') {
                arg4[arg1 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg4[arg1 + var7] = -97;
            } else {
                arg4[arg1 + var7] = 63;
            }
        }
        if (arg2 != -30646) {
            field3245 = null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V", line = 147)
    public static void method1531(int arg0) {
        field3248 = null;
        field3249 = null;
        if (arg0 <= 7) {
            method1530(124, 89, -62, -85, (byte[]) null, (String) null);
        }
        field3247 = null;
        field3245 = null;
        field3243 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIBZII)V", line = 161)
    public static final void method1532(int arg0, int arg1, byte arg2, boolean arg3, int arg4, int arg5) {
        field3244++;
        long var6 = (long) (arg5 | (arg3 ? Integer.MIN_VALUE : 0));
        class48 var8 = (class48) class389.field5383.method1104(-127, var6);
        if (var8 == null) {
            var8 = new class48();
            class389.field5383.method1100(var8, -116, var6);
        }
        if (var8.field723.length <= arg1) {
            int[] var9 = new int[arg1 + 1];
            int[] var10 = new int[arg1 + 1];
            for (int var11 = 0; var11 < var8.field723.length; var11++) {
                var9[var11] = var8.field723[var11];
                var10[var11] = var8.field725[var11];
            }
            for (int var12 = var8.field723.length; var12 < arg1; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field725 = var10;
            var8.field723 = var9;
        }
        var8.field723[arg1] = arg0;
        int var13 = -116 / ((arg2 + 42) / 40);
        var8.field725[arg1] = arg4;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III)V", line = 214)
    public static final void method1533(int arg0, int arg1, int arg2) {
        if (arg0 == 16) {
            field3241++;
            if (class369.method2261(0, arg2)) {
                class68.method637(class263.field3787[arg2], arg1, (byte) -6);
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V", line = 229)
    public static final void method1534(int arg0) {
        field3238++;
        if (class243.field3527.length() == 0) {
            return;
        }
        class94.method790("--> " + class243.field3527, -30123);
        class353.method2176(false, 84, class243.field3527);
        class454.field6438 = 0;
        class206.field3014 = 0;
        class243.field3527 = "";
        if (arg0 < 17) {
            field3249 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BLvc;)V", line = 247)
    public static final void method1535(byte arg0, class89 arg1) {
        field3242++;
        if (!(class303.field4310 >= 2 || class450.field6405) || class464.field6538 != null) {
            return;
        }
        String var2;
        if (class450.field6405 && class303.field4310 < 2) {
            var2 = class347.field4784 + class114.field1598.method1078(class66.field967, 100) + class352.field4842 + " ->";
        } else if (class243.field3533 && class162.field2363.method1820((byte) -96, 81) && class303.field4310 > 2) {
            var2 = class25.method173(31230, (class73) class6.field38.field1299.field6388.field6388);
        } else {
            class73 var3 = (class73) class6.field38.field1299.field6388;
            var2 = class25.method173(31230, var3);
            int[] var4 = null;
            if (class367.method2243((byte) -59, var3.field1048)) {
                var4 = class373.field5128.method1644((int) var3.field1055, 116).field2158;
            } else if (var3.field1047 != -1) {
                var4 = class373.field5128.method1644(var3.field1047, 84).field2158;
            } else if (class480.method2835(var3.field1048, -99)) {
                class361 var5 = class163.field2377[(int) var3.field1055];
                if (var5 != null) {
                    class37 var6 = var5.field4952;
                    if (var6.field434 != null) {
                        var6 = var6.method232(class416.field5691, -1);
                    }
                    if (var6 != null) {
                        var4 = var6.field416;
                    }
                }
            } else if (class264.method1784((byte) 126, var3.field1048)) {
                Object var7 = null;
                class267 var8;
                if (var3.field1048 == 1001) {
                    var8 = class468.field6599.method506(-118, (int) var3.field1055);
                } else {
                    var8 = class468.field6599.method506(-124, (int) (var3.field1055 >>> 32 & 0x7FFFFFFFL));
                }
                if (var8.field3846 != null) {
                    var8 = var8.method1799(class416.field5691, (byte) -111);
                }
                if (var8 != null) {
                    var4 = var8.field3864;
                }
            }
            if (var4 != null) {
                var2 = var2 + class401.method2415(var4, 947);
            }
        }
        if (class303.field4310 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class303.field4310 - 2) + class209.field3063.method1078(class66.field967, 100);
        }
        int var9 = 84 % ((arg0 + 41) / 53);
        if (class296.field4184 != null) {
            class199 var11 = class296.field4184.method1245(arg1, (byte) 98);
            if (var11 == null) {
                var11 = class408.field5584;
            }
            var11.method1377(class296.field4184.field2579, class387.field5303, class68.field993, class296.field4184.field2626, class184.field2781, class296.field4184.field2482, class296.field4184.field2467, class296.field4184.field2529, class2.field17, class217.field3142, var2, false, class150.field2078, class296.field4184.field2554, class301.field4256);
            class69.method638(class68.field993[3], class68.field993[2], class68.field993[0], (byte) 63, class68.field993[1]);
        } else if (class151.field2082 != null && class6.field42 == class35.field378) {
            int var10 = class408.field5584.method1374(16777215, var2, class296.field4175 + 4, 1671, class184.field2781, class217.field3142, class361.field4979 + 16, class387.field5303, class2.field17, 0);
            class69.method638(16, var10 + class402.field5516.method1354((byte) -89, var2), class296.field4175 + 4, (byte) 52, class361.field4979);
            return;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(III)I", line = 351)
    public static final int method1536(int arg0, int arg1, int arg2) {
        field3240++;
        if (arg2 <= 120) {
            return 17;
        } else if (arg1 == 1 || arg1 == 3) {
            return class285.field4078[arg0 & 0x3];
        } else {
            return class117.field1630[arg0 & 0x3];
        }
    }
}
