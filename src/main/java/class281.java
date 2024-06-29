import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class281 extends class83 {

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "[Lgk;")
    public static class259[] field4470 = new class259[14];

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
    public int field4472;

    @OriginalMember(owner = "client!sj", name = "w", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!sj", name = "y", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "I")
    public int field4477;

    @OriginalMember(owner = "client!sj", name = "A", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!sj", name = "B", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!sj", name = "C", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!sj", name = "D", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "[I")
    public int[] field4465;

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "[I")
    public int[] field4469;

    @OriginalMember(owner = "client!sj", name = "v", descriptor = "[I")
    public int[] field4473;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "[Llk;")
    public class174[] field4467;

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "[Llk;")
    public class174[] field4468;

    @OriginalMember(owner = "client!sj", name = "x", descriptor = "[[[B")
    public byte[][][] field4475;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILeh;)Lek;")
    public static final class239 method1829(int arg0, class101 arg1) {
        int var2 = -122 / ((13 - arg0) / 55);
        field4478++;
        class239 var3 = new class239();
        var3.field3923 = arg1.method677(false);
        var3.field3922 = class113.method795(var3.field3923, 237);
        return var3;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)V")
    public static final void method1830(int arg0, int arg1) {
        field4481++;
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            class77.method471(27);
        } else if (arg1 == 2) {
            class90.method585(-1);
        } else if (arg1 == 3) {
            class14.method84(32);
        } else {
            throw new RuntimeException();
        }
        if (arg0 < 23) {
            field4470 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V")
    public static final void method1831(byte arg0) {
        class195.method1282((byte) -84);
        field4476++;
        class24.method171(arg0 ^ 0x65);
        class262.method1738((byte) -127);
        class118.method813(false);
        class22.method150(arg0 - 65);
        class195.method1279(104);
        class208.method1397((byte) 84);
        class227.method1524(arg0 ^ 0xFFFFFFC7);
        class97.method615(false);
        class93.method599(0);
        class263.method1743((byte) -78);
        class268.method1763((byte) -71);
        class1.method8((byte) -118);
        class93.method601(false);
        class165.method1108((byte) 127);
        class269.method1770((byte) -79);
        class31.method206(-125);
        class157.method1078(arg0 + 16860);
        class258.method1707(0);
        if (arg0 != 101) {
            method1835(81, 58, -89, -26, 57, (byte[][][]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, -4, (byte) 100, -10, -116);
        }
        class126.method864(false);
        class151.field2525.method53(true);
        class51.field882.method53(true);
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)V")
    public static final void method1832(int arg0) {
        field4471++;
        if (arg0 < 71) {
            return;
        }
        int var1 = class220.field3686.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class220.field3686[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class187.field3029; var4++) {
                    if (class47.field826[var4] == class276.field4405[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class47.field826[class187.field3029] = class276.field4405[var2];
                    var3 = class187.field3029++;
                }
                class101 var5 = new class101(class220.field3686[var2]);
                int var6 = 0;
                while (class220.field3686[var2].length > var5.field1762 && var6 < 511) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method677(false);
                    int var9 = var8 & 0x3F;
                    int var10 = var8 >> 14;
                    int var11 = (var8 & 0x1FE9) >> 7;
                    int var12 = (class276.field4405[var2] >> 8) * 64 + var11 - class126.field2206;
                    int var13 = (class276.field4405[var2] & 0xFF) * 64 + var9 - class255.field4162;
                    class208 var14 = class12.method73((byte) 57, var5.method677(false));
                    if (class42.field625[var7] == null && (var14.field3485 & 0x1) > 0 && class145.field2476 == var10 && var12 >= 0 && var14.field3537 + var12 < 104 && var13 >= 0 && (var14.field3537 + var13) < 104) {
                        class42.field625[var7] = new class141();
                        class141 var15 = class42.field625[var7];
                        class292.field4668[class187.field3037++] = var7;
                        var15.field1406 = class266.field4301;
                        var15.method989(var14, (byte) -81);
                        var15.method529((byte) 116, var15.field2421.field3537);
                        var15.field1389 = var15.field1413 = class141.field2420[var15.field2421.field3501];
                        var15.field1471 = var15.field2421.field3505;
                        var15.field1443 = var15.field2421.field3484;
                        if (var15.field1443 == 0) {
                            var15.field1413 = 0;
                        }
                        var15.method524(var15.method528(-28), var12, true, var13, 92);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)V")
    public static void method1833(byte arg0) {
        field4470 = null;
        if (arg0 <= 119) {
            method1830(106, -76);
        }
    }

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "(I)V")
    public static final void method1834(int arg0) {
        class168.field2778.method199(112, arg0 + 20453);
        if (arg0 != -20476) {
            field4470 = null;
        }
        class159.field2661++;
        field4474++;
        class168.field2778.method640(21691, 0L);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method1835(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class191.field3084 * 128) {
            arg0 = class191.field3084 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class277.field4439 * 128) {
            arg2 = class277.field4439 * 128 - 1;
        }
        class84.field1526 = class287.field4567[arg3];
        class98.field1692 = class287.field4562[arg3];
        class264.field4290 = class287.field4567[arg4];
        class183.field2977 = class287.field4562[arg4];
        class50.field854 = arg0;
        class210.field3554 = arg1;
        class199.field3272 = arg2;
        class184.field2994 = arg0 / 128;
        class102.field1795 = arg2 / 128;
        class90.field1601 = class184.field2994 - class151.field2536;
        if (class90.field1601 < 0) {
            class90.field1601 = 0;
        }
        class153.field2564 = class102.field1795 - class151.field2536;
        if (class153.field2564 < 0) {
            class153.field2564 = 0;
        }
        class37.field546 = class184.field2994 + class151.field2536;
        if (class37.field546 > class191.field3084) {
            class37.field546 = class191.field3084;
        }
        class229.field3860 = class151.field2536 + class102.field1795;
        if (class229.field3860 > class277.field4439) {
            class229.field3860 = class277.field4439;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class151.field2536 + class151.field2536 + 2; var16++) {
            for (int var19 = 0; var19 < class151.field2536 + class151.field2536 + 2; var19++) {
                int var20 = (var16 - class151.field2536 << 7) - (class50.field854 & 0x7F);
                int var21 = (var19 - class151.field2536 << 7) - (class199.field3272 & 0x7F);
                int var22 = class184.field2994 + var16 - class151.field2536;
                int var23 = class102.field1795 + var19 - class151.field2536;
                if (var22 >= 0 && var23 >= 0 && var22 < class191.field3084 && var23 < class277.field4439) {
                    int var24;
                    if (class31.field464 == null) {
                        var24 = class78.field1342[0][var22][var23] + 128 - class210.field3554;
                    } else {
                        var24 = class31.field464[0][var22][var23] + 128 - class210.field3554;
                    }
                    int var25 = class78.field1342[3][var22][var23] - class210.field3554 - 1000;
                    class75.field1235[var16][var19] = class288.method1953(var20, var25, var24, var21, var15);
                } else {
                    class75.field1235[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class151.field2536 + class151.field2536 + 1; var17++) {
            for (int var18 = 0; var18 < class151.field2536 + class151.field2536 + 1; var18++) {
                class176.field2892[var17][var18] = class75.field1235[var17][var18] || class75.field1235[var17 + 1][var18] || class75.field1235[var17][var18 + 1] || class75.field1235[var17 + 1][var18 + 1];
            }
        }
        class56.field980 = arg6;
        class56.field975 = arg7;
        class198.field3207 = arg8;
        class11.field155 = arg9;
        class239.field3936 = arg10;
        class7.method42();
        if (class72.field1185 != null) {
            class240.method1584(true);
            class211.method1412(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            class240.method1584(false);
        }
        class211.method1412(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }
}
