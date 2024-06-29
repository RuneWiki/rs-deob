import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class25 {

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public int field360 = 443;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
    public int field362 = 43594;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "Z")
    public boolean field367 = false;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public static int field358 = 0;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public static int field361 = -2;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "[Lcm;")
    public static class513[] field365 = new class513[14];

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "Lcq;")
    public static class328 field368 = new class328("", 13);

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "[I")
    public static int[] field370 = new int[1];

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public int field355;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "Ljava/lang/String;")
    public String field363;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V")
    public static void method201(byte arg0) {
        if (arg0 != 23) {
            field358 = 111;
        }
        field370 = null;
        field368 = null;
        field365 = null;
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(B)I")
    public final int method202(byte arg0) {
        field364++;
        if (arg0 >= -84) {
            method208(null, -125, 80, null, -21, -112, -7, null, null, null, null, null, null, 120, (byte) -23, 59, -128, true);
        }
        return this.field367 ? this.field360 : this.field362;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIB)V")
    public static final void method203(int arg0, int arg1, byte arg2) {
        field359++;
        if (arg2 > -93) {
            field370 = null;
        }
        class153 var3 = class75.method656(13, 255, arg1);
        var3.method1003((byte) 98);
        var3.field1933 = arg0;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/lang/String;ILug;I)Lti;")
    public static final class306 method204(String arg0, int arg1, class395 arg2, int arg3) {
        field357++;
        if (arg3 > -19) {
            return null;
        }
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg1, var4);
        OpenGL.glProgramStringARB(arg1, 34933, arg0);
        OpenGL.glGetIntegerv(34379, class460.field6583, 0);
        if (class460.field6583[0] == -1) {
            OpenGL.glBindProgramARB(arg1, 0);
            return new class306(arg2, arg1, var4);
        } else {
            OpenGL.glBindProgramARB(arg1, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(IIB)Z")
    public static final boolean method205(int arg0, int arg1, byte arg2) {
        if (arg2 != -21) {
            field365 = null;
        }
        field366++;
        return (arg1 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
    public static final void method206(int arg0) {
        field356++;
        class387.field5108 = 0;
        int var1 = 92 / ((arg0 + 13) / 34);
        int var2 = class513.field7443.method2772((byte) 125);
        int var3 = class513.field7443.method2743(false);
        int var4 = class513.field7443.method2758((byte) 99);
        boolean var5 = class513.field7443.method2742((byte) -86) == 1;
        class309.method1803(var3, -30493);
        int var6 = (class312.field3986 - class513.field7443.field6631) / 16;
        class268.field3391 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var11 = 0; var11 < 4; var11++) {
                class268.field3391[var7][var11] = class513.field7443.method2727(-119);
            }
        }
        class523.field7708 = new int[var6];
        class450.field6476 = new byte[var6][];
        class502.field7256 = new int[var6];
        class433.field6138 = null;
        class42.field521 = new byte[var6][];
        class296.field3805 = new int[var6];
        class189.field2476 = new byte[var6][];
        class79.field1025 = new int[var6];
        class141.field1826 = new byte[var6][];
        class53.field709 = new int[var6];
        class166.field2121 = null;
        int var8 = 0;
        for (int var9 = (var2 - (class452.field6526 >> 4)) / 8; var9 <= (((class452.field6526 >> 4) + var2) / 8); var9++) {
            for (int var10 = (var4 - (class440.field6307 >> 4)) / 8; var10 <= ((class440.field6307 >> 4) + var4) / 8; var10++) {
                class79.field1025[var8] = (var9 << 8) + var10;
                class296.field3805[var8] = class351.field4507.method488("m" + var9 + "_" + var10, 103);
                class523.field7708[var8] = class351.field4507.method488("l" + var9 + "_" + var10, 115);
                class502.field7256[var8] = class351.field4507.method488("um" + var9 + "_" + var10, 86);
                class53.field709[var8] = class351.field4507.method488("ul" + var9 + "_" + var10, 94);
                var8++;
            }
        }
        class400.method2371(10, var5, var4, false, var2);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)V")
    public static final void method207(int arg0, int arg1, int arg2) {
        field371++;
        class153 var3 = class75.method656(15, 255, arg2);
        var3.method1003((byte) -38);
        var3.field1933 = arg0;
        var3.field1930 = arg1;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lya;IILc;III[[[B[I[I[I[I[IIBIIZ)V")
    public static final void method208(class38 arg0, int arg1, int arg2, class123 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class481.field7025 = arg0;
        class3.field32 = arg1;
        class443.field6354 = arg3;
        class467.field6749 = class481.field7025.method314() > 0;
        class255.field3246 = arg4 >> class94.field1144;
        class139.field1797 = arg6 >> class94.field1144;
        class309.field3954 = arg4;
        class211.field2718 = arg6;
        class370.field4780 = arg5;
        class253.field3235 = class255.field3246 - class230.field2929;
        if (class253.field3235 < 0) {
            class89.field1096 = -class253.field3235;
            class253.field3235 = 0;
        } else {
            class89.field1096 = 0;
        }
        class205.field2680 = class139.field1797 - class230.field2929;
        if (class205.field2680 < 0) {
            class277.field3497 = -class205.field2680;
            class205.field2680 = 0;
        } else {
            class277.field3497 = 0;
        }
        class469.field6812 = class255.field3246 + class230.field2929;
        if (class469.field6812 > class470.field6825) {
            class469.field6812 = class470.field6825;
        }
        class316.field4043 = class230.field2929 + class139.field1797;
        if (class316.field4043 > class105.field1336) {
            class316.field4043 = class105.field1336;
        }
        for (int var18 = 0; var18 < class230.field2929 + class230.field2929 + 2; var18++) {
            for (int var23 = 0; var23 < class230.field2929 + class230.field2929 + 2; var23++) {
                int var24 = class255.field3246 + var18 - class230.field2929;
                int var25 = class139.field1797 + var23 - class230.field2929;
                if (var24 >= 0 && var25 >= 0 && var24 < class470.field6825 && var25 < class105.field1336) {
                    int var26 = var24 << class94.field1144;
                    int var27 = var25 << class94.field1144;
                    int var28 = class531.field7811[class531.field7811.length - 1].method399(var24, var25) - (0x3E8 << class94.field1144 - 7);
                    int var29 = class140.field1808 == null ? class531.field7811[0].method399(var24, var25) + class376.field4951 : class140.field1808[0].method399(var24, var25) + class376.field4951;
                    class473.field6847[var18][var23] = class481.field7025.method353(var26, var28, var27, var26, var29, var27);
                } else {
                    class473.field6847[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class230.field2929 + class230.field2929 + 1; var19++) {
            for (int var22 = 0; var22 < class230.field2929 + class230.field2929 + 1; var22++) {
                class38.field501[var19][var22] = class473.field6847[var19][var22] || class473.field6847[var19 + 1][var22] || class473.field6847[var19][var22 + 1] || class473.field6847[var19 + 1][var22 + 1];
            }
        }
        class133.field1729 = arg8;
        class280.field3574 = arg9;
        class411.field5870 = arg10;
        class350.field4499 = arg11;
        class479.field7009 = arg12;
        class172.method1094();
        class38.method320((byte) 106);
        for (class531 var20 = (class531) class170.field2183.method2097((byte) 86); var20 != null; var20 = (class531) class170.field2183.method2091(-1)) {
            var20.method603(0);
            class223.method1360(-201, var20);
        }
        if (class467.field6749) {
            for (int var21 = 0; var21 < class180.field2382; var21++) {
                class187.field2441[var21].method1133(arg1, arg17, -85);
            }
        }
        if (arg2 > 1) {
            class481.field7025.method285(0);
            if (class523.field7719 == null || class523.field7719 instanceof class236) {
                class523.field7719 = new class514();
            }
        } else if (class523.field7719 == null || class523.field7719 instanceof class514) {
            class523.field7719 = new class236();
        }
        class523.field7719.method1416((byte) 54, arg2);
        class523.field7719.method1422(255);
        if (class159.field2027 != null) {
            class119.method857(true);
            class523.field7719.method1421(5000, 22);
            class197.method1218(arg2, null, 0, (byte) 0, arg15, arg16);
            class523.field7719.method1422(255);
            class523.field7719.method1421(5000, 23);
            class119.method857(false);
        }
        class197.method1218(arg2, arg7, arg13, arg14, arg15, arg16);
        class523.field7719.method1422(255);
        class523.field7719.method1420((byte) 92);
        class523.field7719.method1422(255);
        if (arg2 > 1) {
            class481.field7025.method279(0);
        }
        class481.field7025.method311(0, null);
    }
}
