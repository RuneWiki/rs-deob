import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class71 {

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field1029 = 0;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field1028 = 0;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "[I")
    public static int[] field1025 = new int[256];

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZI)V")
    public static final void method470(boolean arg0, int arg1) {
        if (arg1 > -118) {
            return;
        }
        field1024++;
        class195.field2997 = arg0;
        if (!class195.field2997) {
            int var26 = class131.field1830.method1353((byte) 120);
            boolean var27 = class297.method2000(class131.field1830.method1366(255), 50);
            int var28 = class131.field1830.method1353((byte) 77);
            int var29 = class131.field1830.method1374((byte) -60);
            int var30 = class131.field1830.method1353((byte) 48);
            int var31 = class131.field1830.method1379(-72);
            int var32 = (class114.field1632 - class131.field1830.field3280) / 16;
            class275.field4364 = new int[var32][4];
            for (int var33 = 0; var33 < var32; var33++) {
                for (int var39 = 0; var39 < 4; var39++) {
                    class275.field4364[var33][var39] = class131.field1830.method1348((byte) -75);
                }
            }
            class37.field571 = new int[var32];
            class213.field3218 = new int[var32];
            class117.field1685 = new byte[var32][];
            class267.field4285 = new int[var32];
            class110.field1583 = new byte[var32][];
            class240.field3705 = null;
            class34.field510 = new int[var32];
            class225.field3525 = null;
            class261.field4205 = new int[var32];
            boolean var34 = false;
            int var35 = 0;
            if ((var28 / 8 == 48 || var28 / 8 == 49) && var31 / 8 == 48) {
                var34 = true;
            }
            if ((var28 / 8) == 48 && var31 / 8 == 148) {
                var34 = true;
            }
            for (int var36 = (var28 - 6) / 8; var36 <= ((var28 + 6) / 8); var36++) {
                for (int var37 = (var31 - 6) / 8; var37 <= ((var31 + 6) / 8); var37++) {
                    int var38 = (var36 << 8) + var37;
                    if (var34 && var37 == 49 || var37 == 149 || var37 == 147 || var36 == 50 || !(var36 != 49 || var37 != 47)) {
                        class213.field3218[var35] = var38;
                        class261.field4205[var35] = -1;
                        class267.field4285[var35] = -1;
                        class37.field571[var35] = -1;
                        class34.field510[var35] = -1;
                    } else {
                        class213.field3218[var35] = var38;
                        class261.field4205[var35] = class307.field4932.method2081(-128, "m" + var36 + "_" + var37);
                        class267.field4285[var35] = class307.field4932.method2081(-128, "l" + var36 + "_" + var37);
                        class37.field571[var35] = class307.field4932.method2081(-126, "um" + var36 + "_" + var37);
                        class34.field510[var35] = class307.field4932.method2081(-125, "ul" + var36 + "_" + var37);
                    }
                    var35++;
                }
            }
            class126.method812(var29, var26, var30, (byte) -109, var31, false, var28, var27);
            return;
        }
        boolean var2 = class297.method2000(class131.field1830.method1377(25190), 62);
        int var3 = class131.field1830.method1380((byte) 45);
        int var4 = class131.field1830.method1390(28203);
        int var5 = class131.field1830.method1379(-113);
        int var6 = class131.field1830.method1380((byte) 45);
        class131.field1830.method804(false);
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var23 = 0; var23 < 13; var23++) {
                for (int var24 = 0; var24 < 13; var24++) {
                    int var25 = class131.field1830.method805(1, (byte) 6);
                    if (var25 == 1) {
                        class45.field665[var7][var23][var24] = class131.field1830.method805(26, (byte) -113);
                    } else {
                        class45.field665[var7][var23][var24] = -1;
                    }
                }
            }
        }
        class131.field1830.method810(-92);
        int var8 = (class114.field1632 - class131.field1830.field3280) / 16;
        class275.field4364 = new int[var8][4];
        for (int var9 = 0; var9 < var8; var9++) {
            for (int var22 = 0; var22 < 4; var22++) {
                class275.field4364[var9][var22] = class131.field1830.method1387(0);
            }
        }
        int var10 = class131.field1830.method1379(-126);
        class261.field4205 = new int[var8];
        class110.field1583 = new byte[var8][];
        class213.field3218 = new int[var8];
        class34.field510 = new int[var8];
        class225.field3525 = null;
        class117.field1685 = new byte[var8][];
        class37.field571 = new int[var8];
        class240.field3705 = null;
        class267.field4285 = new int[var8];
        int var11 = 0;
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 13; var13++) {
                for (int var14 = 0; var14 < 13; var14++) {
                    int var15 = class45.field665[var12][var13][var14];
                    if (var15 != -1) {
                        int var16 = (var15 & 0xFFE120) >> 14;
                        int var17 = (var15 & 0x3FFA) >> 3;
                        int var18 = (var16 / 8 << 8) + (var17 / 8);
                        for (int var19 = 0; var19 < var11; var19++) {
                            if (class213.field3218[var19] == var18) {
                                var18 = -1;
                                break;
                            }
                        }
                        if (var18 != -1) {
                            int var20 = (var18 & 0xFF81) >> 8;
                            class213.field3218[var11] = var18;
                            int var21 = var18 & 0xFF;
                            class261.field4205[var11] = class307.field4932.method2081(-125, "m" + var20 + "_" + var21);
                            class267.field4285[var11] = class307.field4932.method2081(-127, "l" + var20 + "_" + var21);
                            class37.field571[var11] = class307.field4932.method2081(-125, "um" + var20 + "_" + var21);
                            class34.field510[var11] = class307.field4932.method2081(-128, "ul" + var20 + "_" + var21);
                            var11++;
                        }
                    }
                }
            }
        }
        class126.method812(var4, var5, var10, (byte) -102, var6, false, var3, var2);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
    public static void method471(int arg0) {
        field1025 = null;
        if (arg0 != -32342) {
            field1025 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method472(Throwable arg0, int arg1) throws IOException {
        field1027++;
        String var3;
        if (arg0 instanceof class18) {
            class18 var2 = (class18) arg0;
            var3 = var2.field315 + " | ";
            arg0 = var2.field311;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        if (arg1 < 1) {
            method471(54);
        }
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var3 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var3 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var3 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)V")
    public static final void method473(int arg0, int arg1) {
        class91 var2 = class246.field3856[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class91 var4 = class246.field3856[var3][arg0][arg1] = class246.field3856[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field1338--;
                for (int var5 = 0; var5 < var4.field1343; var5++) {
                    class160 var6 = var4.field1339[var5];
                    if ((var6.field2225 >> 29 & 0x3L) == 2L && var6.field2234 == arg0 && var6.field2229 == arg1) {
                        var6.field2221--;
                    }
                }
            }
        }
        if (class246.field3856[0][arg0][arg1] == null) {
            class246.field3856[0][arg0][arg1] = new class91(0, arg0, arg1);
        }
        class246.field3856[0][arg0][arg1].field1326 = var2;
        class246.field3856[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V")
    public static final void method474(int arg0) {
        field1032++;
        class292.method1965(5, 1);
        class163.method1037(5, arg0 - 29762);
        class30.method190(126, 5);
        class192.method1218(-212, 5);
        class250.method1626(5, (byte) -98);
        class136.method859(5, 3);
        if (arg0 != 29890) {
            method471(-1);
        }
        class209.method1300(4096, 5);
        class16.method114(5, 1522296816);
        class180.method1147(5, true);
        class17.method119(4, 5);
        class82.method527(5, true);
        class233.method1533(5, (byte) 87);
        class232.method1525(0, 5);
        class90.method585(5, 97);
        class205.method1282(5, 119);
        client.method2026(5, (byte) 96);
        class228.method1510(-5008, 5);
        class175.method1102((byte) 93, 5);
        class200.method1258(0, 50);
        class170.method1084(-24680, 5);
        class279.method1809(5, (byte) -119);
        class82.field1126.method943(5, true);
        class83.field1154.method943(5, true);
        class295.field4708.method943(5, true);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZIIIIII)V")
    public static final void method475(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class83.field1140 = arg3;
        field1031++;
        if (arg4 != -15588) {
            return;
        }
        class23.field370 = arg6;
        class180.field2739 = arg2;
        class142.field1944 = arg1;
        class38.field577 = arg5;
        if (arg0 && class180.field2739 >= 100) {
            class178.field2603 = class142.field1944 * 128 + 64;
            class188.field2848 = class23.field370 * 128 + 64;
            class27.field423 = class58.method360(class188.field2848, class178.field2603, false, class166.field2364) - class83.field1140;
        }
        class12.field203 = 2;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1025[var0] = var1;
        }
        field1033 = 0;
    }
}
