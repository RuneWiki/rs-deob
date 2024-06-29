import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class57 extends class287 {

    @OriginalMember(owner = "client!qk", name = "A", descriptor = "Lmh;")
    public class128 field1096;

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "Lmh;")
    public static class128 field1088 = class22.method156(125, "leuchten1:");

    @OriginalMember(owner = "client!qk", name = "v", descriptor = "Lmh;")
    public static class128 field1091 = class22.method156(127, "Abbrechen");

    @OriginalMember(owner = "client!qk", name = "z", descriptor = "Lmh;")
    public static class128 field1095 = class22.method156(127, "overlay2");

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "I")
    public static int field1089 = 0;

    @OriginalMember(owner = "client!qk", name = "B", descriptor = "Z")
    public static boolean field1097 = false;

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "I")
    public static int field1087 = 0;

    @OriginalMember(owner = "client!qk", name = "E", descriptor = "Lmh;")
    public static class128 field1100 = class22.method156(127, "sch-Utteln:");

    @OriginalMember(owner = "client!qk", name = "F", descriptor = "I")
    public static int field1101 = 0;

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!qk", name = "w", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!qk", name = "x", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!qk", name = "C", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!qk", name = "D", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!qk", name = "y", descriptor = "Ldj;")
    public static class314 field1094;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIBIII)V", line = 5)
    public static final void method378(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field1092++;
        if (class193.field3335 <= arg0 && class43.field875 >= arg1 && class70.field1315 <= arg5 && arg4 <= class181.field3173) {
            class159.method1048(false, arg0, arg1, arg4, arg3, arg5);
        } else {
            class198.method1378(arg4, arg3, arg5, arg0, (byte) 112, arg1);
        }
        int var6 = 93 / ((arg2 + 10) / 55);
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)V", line = 28)
    public static final void method379(byte arg0) {
        field1098++;
        if (class51.field1000 && arg0 >= 48) {
            class275.field4772 = null;
            class147.field2534 = null;
            class51.field1000 = false;
        }
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(B)V", line = 46)
    public static void method380(byte arg0) {
        field1100 = null;
        if (arg0 >= -99) {
            field1090 = 2;
        }
        field1094 = null;
        field1088 = null;
        field1091 = null;
        field1095 = null;
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V", line = 78)
    public class57() {
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lmh;)V", line = 80)
    public class57(class128 arg0) {
        this.field1096 = arg0;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIII)V", line = 94)
    public static final void method381(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class96 var7 = new class96();
        var7.field1622 = arg1 / 128;
        var7.field1620 = arg2 / 128;
        var7.field1635 = arg3 / 128;
        var7.field1628 = arg4 / 128;
        var7.field1614 = arg0;
        var7.field1618 = arg1;
        var7.field1633 = arg2;
        var7.field1619 = arg3;
        var7.field1625 = arg4;
        var7.field1623 = arg5;
        var7.field1616 = arg6;
        class266.field4612[class240.field4094++] = var7;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IZ)V", line = 115)
    public static final void method382(int arg0, boolean arg1) {
        field1093++;
        class303.field5129 = arg1;
        if (class303.field5129) {
            int var15 = class54.field1051.method1331(28057);
            int var16 = class54.field1051.method1308(-68);
            int var17 = class54.field1051.method1331(28057);
            class54.field1051.method567(8);
            for (int var18 = 0; var18 < 4; var18++) {
                for (int var19 = 0; var19 < 13; var19++) {
                    for (int var20 = 0; var20 < 13; var20++) {
                        int var21 = class54.field1051.method564((byte) -104, 1);
                        if (var21 == 1) {
                            class175.field3095[var18][var19][var20] = class54.field1051.method564((byte) -123, 26);
                        } else {
                            class175.field3095[var18][var19][var20] = -1;
                        }
                    }
                }
            }
            class54.field1051.method562(0);
            int var22 = (class102.field1749 - class54.field1051.field3380) / 16;
            class144.field2461 = new int[var22][4];
            for (int var23 = 0; var23 < var22; var23++) {
                for (int var24 = 0; var24 < 4; var24++) {
                    class144.field2461[var23][var24] = class54.field1051.method1320(255);
                }
            }
            int var25 = class54.field1051.method1331(28057);
            int var26 = class54.field1051.method1322(-31669);
            class189.field3283 = new int[var22];
            class77.field1422 = new byte[var22][];
            class128.field2177 = new int[var22];
            class8.field183 = new byte[var22][];
            class175.field3099 = new int[var22];
            class34.field733 = (byte[][]) null;
            class285.field4890 = null;
            class226.field3949 = new int[var22];
            class38.field810 = new byte[var22][];
            class56.field1079 = new int[var22];
            class52.field1025 = new byte[var22][];
            int var27 = 0;
            for (int var28 = 0; var28 < 4; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    for (int var30 = 0; var30 < 13; var30++) {
                        int var31 = class175.field3095[var28][var29][var30];
                        if (var31 != -1) {
                            int var32 = var31 >> 14 & 0x3FF;
                            int var33 = (var31 & 0x3FFB) >> 3;
                            int var34 = (var32 / 8 << 8) + var33 / 8;
                            for (int var35 = 0; var35 < var27; var35++) {
                                if (class226.field3949[var35] == var34) {
                                    var34 = -1;
                                    break;
                                }
                            }
                            if (var34 != -1) {
                                int var36 = (var34 & 0xFFBE) >> 8;
                                class226.field3949[var27] = var34;
                                int var37 = var34 & 0xFF;
                                class175.field3099[var27] = class288.field4924.method2142(1, class28.method177((byte) -66, new class128[] { class266.field4617, class257.method1811(var36, (byte) 24), class170.field2957, class257.method1811(var37, (byte) 125) }));
                                class56.field1079[var27] = class288.field4924.method2142(1, class28.method177((byte) -113, new class128[] { class261.field4524, class257.method1811(var36, (byte) -118), class170.field2957, class257.method1811(var37, (byte) -128) }));
                                class189.field3283[var27] = class288.field4924.method2142(1, class28.method177((byte) -115, new class128[] { class253.field4369, class257.method1811(var36, (byte) 69), class170.field2957, class257.method1811(var37, (byte) 92) }));
                                class128.field2177[var27] = class288.field4924.method2142(1, class28.method177((byte) -115, new class128[] { class181.field3178, class257.method1811(var36, (byte) 73), class170.field2957, class257.method1811(var37, (byte) 117) }));
                                var27++;
                            }
                        }
                    }
                }
            }
            class171.method1148(var15, var25, var26, 74, var17, var16, false);
        } else {
            int var2 = class54.field1051.method1325(7627);
            int var3 = class54.field1051.method1308(-100);
            int var4 = class54.field1051.method1330(true);
            int var5 = class54.field1051.method1335(8574);
            int var6 = (class102.field1749 - class54.field1051.field3380) / 16;
            class144.field2461 = new int[var6][4];
            for (int var7 = 0; var7 < var6; var7++) {
                for (int var8 = 0; var8 < 4; var8++) {
                    class144.field2461[var7][var8] = class54.field1051.method1350(false);
                }
            }
            boolean var9 = false;
            int var10 = class54.field1051.method1308(-35);
            class56.field1079 = new int[var6];
            class34.field733 = (byte[][]) null;
            class175.field3099 = new int[var6];
            class285.field4890 = null;
            class128.field2177 = new int[var6];
            class8.field183 = new byte[var6][];
            class189.field3283 = new int[var6];
            class38.field810 = new byte[var6][];
            if (((var3 / 8) == 48 || var3 / 8 == 49) && (var10 / 8) == 48) {
                var9 = true;
            }
            class226.field3949 = new int[var6];
            class52.field1025 = new byte[var6][];
            class77.field1422 = new byte[var6][];
            if ((var3 / 8) == 48 && var10 / 8 == 148) {
                var9 = true;
            }
            int var11 = 0;
            for (int var12 = (var3 - 6) / 8; var12 <= ((var3 + 6) / 8); var12++) {
                for (int var13 = (var10 - 6) / 8; var13 <= ((var10 + 6) / 8); var13++) {
                    int var14 = (var12 << 8) + var13;
                    if (var9 && var13 == 49 || var13 == 149 || var13 == 147 || var12 == 50 || !(var12 != 49 || var13 != 47)) {
                        class226.field3949[var11] = var14;
                        class175.field3099[var11] = -1;
                        class56.field1079[var11] = -1;
                        class189.field3283[var11] = -1;
                        class128.field2177[var11] = -1;
                    } else {
                        class226.field3949[var11] = var14;
                        class175.field3099[var11] = class288.field4924.method2142(1, class28.method177((byte) -57, new class128[] { class266.field4617, class257.method1811(var12, (byte) -128), class170.field2957, class257.method1811(var13, (byte) 100) }));
                        class56.field1079[var11] = class288.field4924.method2142(1, class28.method177((byte) -102, new class128[] { class261.field4524, class257.method1811(var12, (byte) 39), class170.field2957, class257.method1811(var13, (byte) -128) }));
                        class189.field3283[var11] = class288.field4924.method2142(1, class28.method177((byte) -64, new class128[] { class253.field4369, class257.method1811(var12, (byte) 109), class170.field2957, class257.method1811(var13, (byte) -126) }));
                        class128.field2177[var11] = class288.field4924.method2142(1, class28.method177((byte) -66, new class128[] { class181.field3178, class257.method1811(var12, (byte) 22), class170.field2957, class257.method1811(var13, (byte) -123) }));
                    }
                    var11++;
                }
            }
            class171.method1148(var5, var4, var2, 71, var3, var10, false);
        }
        int var38 = 99 / ((arg0 + 14) / 36);
    }
}
