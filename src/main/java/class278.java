import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class278 extends class413 {

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "Z")
    public static boolean field3940 = false;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    public int field3933;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
    public int field3934;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "I")
    public int field3935;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "I")
    public int field3936;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "Lfj;")
    public class396 field3937;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;", line = 6)
    public static final String[] method1831(String[] arg0, int arg1) {
        field3938++;
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        if (arg1 != 339) {
            field3940 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljava/lang/String;B)[B", line = 33)
    public static final byte[] method1832(String arg0, byte arg1) {
        field3943++;
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        if (arg1 >= -31) {
            method1831((String[]) null, -57);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BLae;)V", line = 175)
    public static final void method1833(byte arg0, class134 arg1) {
        if (class435.field6270) {
            class211.method1432(100, arg1);
        } else {
            class248.method1691(arg1, false);
        }
        if (arg0 >= -27) {
            method1835(112, -75, 48, 62, 38, -27);
        }
        field3942++;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lrd;B)V", line = 194)
    public static final void method1834(class185 arg0, byte arg1) {
        field3932++;
        class287 var2 = null;
        if (arg1 < 74) {
            return;
        }
        try {
            class315 var3 = arg0.method1256((byte) -93);
            while (var3.field4498 == 0) {
                class150.method907(1L, (byte) -32);
            }
            if (var3.field4498 == 1) {
                var2 = (class287) var3.field4497;
                class236 var4 = method1836((byte) -26);
                var2.method1873(var4.field3364, var4.field3320, -16644, 0);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method1877(0);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIII)Z", line = 233)
    public static final boolean method1835(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class389.field5494[arg0][var8][var14] == -class396.field5655) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class161.field2122[arg0].method328(arg1, arg3) + arg5;
            if (!class331.method2131(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class331.method2131(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class331.method2131(var9, var11, var13)) {
                return false;
            } else if (class331.method2131(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class261.method1746(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class331.method2131(var6 + 1, class161.field2122[arg0].method328(arg1, arg3) + arg5, var7 + 1) && class331.method2131(var6 + 128 - 1, class161.field2122[arg0].method328(arg1 + 1, arg3) + arg5, var7 + 1) && class331.method2131(var6 + 128 - 1, class161.field2122[arg0].method328(arg1 + 1, arg3 + 1) + arg5, var7 + 128 - 1) && class331.method2131(var6 + 1, class161.field2122[arg0].method328(arg1, arg3 + 1) + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)Ldg;", line = 297)
    private static final class236 method1836(byte arg0) {
        field3944++;
        class236 var1 = new class236(38);
        var1.method1583(15, (byte) -76);
        if (arg0 != -26) {
            field3940 = false;
        }
        var1.method1583(class23.field289, (byte) -98);
        var1.method1583(class210.field2997 ? 1 : 0, (byte) -124);
        var1.method1583(class286.field4013 ? 1 : 0, (byte) -94);
        var1.method1583(class332.field4706 ? 1 : 0, (byte) -109);
        var1.method1583(class271.field3838 ? 1 : 0, (byte) -103);
        var1.method1583(0, (byte) -63);
        var1.method1583(class414.field5947 ? 1 : 0, (byte) -102);
        var1.method1583(class20.field265 ? 1 : 0, (byte) -110);
        var1.method1583(class33.field381 ? 1 : 0, (byte) -94);
        var1.method1583(class141.field1739, (byte) -79);
        var1.method1583(class272.field3859 ? 1 : 0, (byte) -57);
        var1.method1583(class254.field3656 ? 1 : 0, (byte) -96);
        var1.method1583(class18.field210 ? 1 : 0, (byte) -71);
        var1.method1583(class148.field1815, (byte) -86);
        var1.method1583(class94.field1134 ? 1 : 0, (byte) -101);
        var1.method1583(class401.field5730, (byte) -60);
        var1.method1583(class334.field4729, (byte) -56);
        var1.method1583(class355.field4999, (byte) -101);
        var1.method1605(class374.field5256, false);
        var1.method1605(class388.field5479, false);
        var1.method1583(class246.method1674((byte) 83), (byte) -59);
        var1.method1603(class140.field1735, arg0 + 897);
        var1.method1583(class249.field3558, (byte) -77);
        var1.method1583(class77.field906 ? 1 : 0, (byte) -100);
        var1.method1583(class374.field5254 ? 1 : 0, (byte) -107);
        var1.method1583(class433.field6227, (byte) -54);
        var1.method1583(class212.field3020 ? 1 : 0, (byte) -58);
        var1.method1583(class156.field1916 ? 1 : 0, (byte) -112);
        var1.method1583(class347.field4921, (byte) -83);
        var1.method1583(class222.field3117 ? 1 : 0, (byte) -101);
        var1.method1583(class140.field1736, (byte) -77);
        var1.method1583(class223.field3135, (byte) -74);
        return var1;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)V", line = 343)
    public static final void method1837(byte arg0) {
        class441.field6334.method2204(-62);
        field3939++;
        if (arg0 != -105) {
            field3941 = 64;
        }
        class306.field4306.method33(6);
        if (class24.field302 != null) {
            class24.field302.method1426(-29615, class402.field5767);
        }
        class382.field5381.method2479(false);
        class402.field5767.setBackground(Color.black);
        class299.field4189 = -1;
        class441.field6334 = class291.method1927(106, class402.field5767);
        class306.field4306 = class48.method279((byte) -114, true, class402.field5767);
        if (class24.field302 != null) {
            class24.field302.method1424(class402.field5767, (byte) -128);
        }
    }
}
