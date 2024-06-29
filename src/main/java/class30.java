import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class30 {

    @OriginalMember(owner = "client!u", name = "g", descriptor = "Ljava/lang/String;")
    public static String field500 = "flash3:";

    @OriginalMember(owner = "client!u", name = "h", descriptor = "Ljava/lang/String;")
    public static String field501 = "Loaded config";

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public static int field503 = 1;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public int field502;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "Lde;")
    public class270 field495;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "[I")
    public int[] field496;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IC)Z")
    public static final boolean method188(int arg0, char arg1) {
        field499++;
        if (Character.isISOControl(arg1)) {
            return false;
        } else if (class267.method1883((byte) -117, arg1)) {
            return true;
        } else {
            char[] var2 = class22.field392;
            if (arg0 != -14360) {
                method190(false, -23, (class174[][][]) null, -77, 113, (byte) -58);
            }
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg1 == var7) {
                    return true;
                }
            }
            char[] var4 = class79.field1330;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg1 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
    public static void method189(byte arg0) {
        if (arg0 != -12) {
            method189((byte) -106);
        }
        field500 = null;
        field501 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZI[[[Lmc;IIB)Z")
    public static final boolean method190(boolean arg0, int arg1, class174[][][] arg2, int arg3, int arg4, byte arg5) {
        field494++;
        byte var6 = arg0 ? 1 : (byte) (class147.field2427 & 0xFF);
        if (class161.field2621[class182.field2898][arg3][arg4] == var6) {
            return false;
        } else if ((class67.field1132[class182.field2898][arg3][arg4] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class15.field311[var7] = arg3;
            int var8 = 0;
            int var31 = var7 + 1;
            class69.field1155[var7] = arg4;
            class161.field2621[class182.field2898][arg3][arg4] = var6;
            while (var31 != var8) {
                int var9 = class15.field311[var8] & 0xFFFF;
                int var10 = class15.field311[var8] >> 24 & 0xFF;
                int var11 = class15.field311[var8] >> 16 & 0xFF;
                int var12 = class69.field1155[var8] & 0xFFFF;
                boolean var13 = false;
                boolean var14 = false;
                int var15 = (class69.field1155[var8] & 0xFFCF99) >> 16;
                if ((class67.field1132[class182.field2898][var9][var12] & 0x4) == 0) {
                    var13 = true;
                }
                var8 = var8 + 1 & 0xFFF;
                label229: for (int var16 = class182.field2898 + 1; var16 <= 3; var16++) {
                    if ((class67.field1132[var16][var9][var12] & 0x8) == 0) {
                        if (var13 && arg2[var16][var9][var12] != null) {
                            if (arg2[var16][var9][var12].field2800 != null) {
                                int var19 = class279.method1954(var11, (byte) -86);
                                if (arg2[var16][var9][var12].field2800.field2933 == var19 || arg2[var16][var9][var12].field2800.field2944 == var19) {
                                    continue;
                                }
                                if (var10 != 0) {
                                    int var20 = class279.method1954(var10, (byte) -48);
                                    if (arg2[var16][var9][var12].field2800.field2933 == var20 || arg2[var16][var9][var12].field2800.field2944 == var20) {
                                        continue;
                                    }
                                }
                                if (var15 != 0) {
                                    int var21 = class279.method1954(var15, (byte) -80);
                                    if (arg2[var16][var9][var12].field2800.field2933 == var21 || arg2[var16][var9][var12].field2800.field2944 == var21) {
                                        continue;
                                    }
                                }
                            }
                            if (arg2[var16][var9][var12].field2812 != null) {
                                for (int var22 = 0; var22 < arg2[var16][var9][var12].field2814; var22++) {
                                    int var23 = (int) (arg2[var16][var9][var12].field2812[var22].field1278 >> 14 & 0x3FL);
                                    int var24 = (int) (arg2[var16][var9][var12].field2812[var22].field1278 >> 20 & 0x3L);
                                    if (var23 == 21) {
                                        var23 = 19;
                                    }
                                    int var25 = var24 << 6 | var23;
                                    if (var11 == var25 || var10 != 0 && var10 == var25 || var15 != 0 && var15 == var25) {
                                        continue label229;
                                    }
                                }
                            }
                        }
                        var14 = true;
                        class174 var26 = arg2[var16][var9][var12];
                        if (var26 != null && var26.field2814 > 0) {
                            for (int var27 = 0; var27 < var26.field2814; var27++) {
                                class73 var28 = var26.field2812[var27];
                                if (var28.field1270 != var28.field1269 || var28.field1276 != var28.field1266) {
                                    for (int var29 = var28.field1270; var29 <= var28.field1269; var29++) {
                                        for (int var30 = var28.field1266; var30 <= var28.field1276; var30++) {
                                            class161.field2621[var16][var29][var30] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class161.field2621[var16][var9][var12] = var6;
                    }
                }
                if (var14) {
                    if (class286.field4737[arg1] < class245.field4123[class182.field2898 + 1][var9][var12]) {
                        class286.field4737[arg1] = class245.field4123[class182.field2898 + 1][var9][var12];
                    }
                    int var17 = var12 << 7;
                    int var18 = var9 << 7;
                    if (var18 < class28.field480[arg1]) {
                        class28.field480[arg1] = var18;
                    } else if (var18 > class149.field2462[arg1]) {
                        class149.field2462[arg1] = var18;
                    }
                    if (var17 < class94.field1536[arg1]) {
                        class94.field1536[arg1] = var17;
                    } else if (class25.field454[arg1] < var17) {
                        class25.field454[arg1] = var17;
                    }
                }
                if (!var13) {
                    if (var9 >= 1 && class161.field2621[class182.field2898][var9 - 1][var12] != var6) {
                        class15.field311[var31] = class312.method2107(-754974720, class312.method2107(var9 - 1, 1179648));
                        class69.field1155[var31] = class312.method2107(1245184, var12);
                        class161.field2621[class182.field2898][var9 - 1][var12] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var12++;
                    if (var12 < 104) {
                        if ((var9 - 1) >= 0 && class161.field2621[class182.field2898][var9 - 1][var12] != var6 && (class67.field1132[class182.field2898][var9][var12] & 0x4) == 0 && (class67.field1132[class182.field2898][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class15.field311[var31] = class312.method2107(1375731712, class312.method2107(1179648, var9 - 1));
                            class69.field1155[var31] = class312.method2107(var12, 1245184);
                            class161.field2621[class182.field2898][var9 - 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class161.field2621[class182.field2898][var9][var12] != var6) {
                            class15.field311[var31] = class312.method2107(class312.method2107(var9, 5373952), 318767104);
                            class69.field1155[var31] = class312.method2107(5439488, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class161.field2621[class182.field2898][var9][var12] = var6;
                        }
                        if ((var9 + 1) < 104 && class161.field2621[class182.field2898][var9 + 1][var12] != var6 && (class67.field1132[class182.field2898][var9][var12] & 0x4) == 0 && (class67.field1132[class182.field2898][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class15.field311[var31] = class312.method2107(-1845493760, class312.method2107(var9 + 1, 5373952));
                            class69.field1155[var31] = class312.method2107(var12, 5439488);
                            class161.field2621[class182.field2898][var9 + 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                    var12--;
                    if (var9 + 1 < 104 && class161.field2621[class182.field2898][var9 + 1][var12] != var6) {
                        class15.field311[var31] = class312.method2107(1392508928, class312.method2107(9568256, var9 + 1));
                        class69.field1155[var31] = class312.method2107(var12, 9633792);
                        class161.field2621[class182.field2898][var9 + 1][var12] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class161.field2621[class182.field2898][var9 - 1][var12] != var6 && (class67.field1132[class182.field2898][var9][var12] & 0x4) == 0 && (class67.field1132[class182.field2898][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class15.field311[var31] = class312.method2107(class312.method2107(var9 - 1, 13762560), 301989888);
                            class69.field1155[var31] = class312.method2107(13828096, var12);
                            class161.field2621[class182.field2898][var9 - 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class161.field2621[class182.field2898][var9][var12] != var6) {
                            class15.field311[var31] = class312.method2107(class312.method2107(var9, 13762560), -1828716544);
                            class69.field1155[var31] = class312.method2107(13828096, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class161.field2621[class182.field2898][var9][var12] = var6;
                        }
                        if (var9 + 1 < 104 && class161.field2621[class182.field2898][var9 + 1][var12] != var6 && (class67.field1132[class182.field2898][var9][var12] & 0x4) == 0 && (class67.field1132[class182.field2898][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class15.field311[var31] = class312.method2107(class312.method2107(9568256, var9 + 1), -771751936);
                            class69.field1155[var31] = class312.method2107(var12, 9633792);
                            class161.field2621[class182.field2898][var9 + 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (arg5 < 99) {
                return false;
            }
            if (class286.field4737[arg1] != -1000000) {
                class286.field4737[arg1] += 10;
                class28.field480[arg1] -= 50;
                class149.field2462[arg1] += 50;
                class25.field454[arg1] += 50;
                class94.field1536[arg1] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIILda;Lda;IIIIJ)V")
    public static final void method191(int arg0, int arg1, int arg2, int arg3, class312 arg4, class312 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class251 var12 = new class251();
        var12.field4256 = arg10;
        var12.field4248 = arg1 * 128 + 64;
        var12.field4247 = arg2 * 128 + 64;
        var12.field4246 = arg3;
        var12.field4255 = arg4;
        var12.field4244 = arg5;
        var12.field4241 = arg6;
        var12.field4240 = arg7;
        var12.field4249 = arg8;
        var12.field4243 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class90.field1498[var13][arg1][arg2] == null) {
                class90.field1498[var13][arg1][arg2] = new class174(var13, arg1, arg2);
            }
        }
        class90.field1498[arg0][arg1][arg2].field2817 = var12;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Ljava/awt/Component;Lci;III)Lva;")
    public static final class239 method192(Component arg0, class83 arg1, int arg2, int arg3, int arg4) {
        field504++;
        if (class142.field2343 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg4 < 256) {
                arg4 = 256;
            }
            try {
                int var5 = 23 % ((arg3 - 3) / 45);
                class239 var6 = (class239) Class.forName("gm").getDeclaredConstructor().newInstance();
                var6.field4045 = arg4;
                var6.field4037 = new int[(class54.field970 ? 2 : 1) * 256];
                var6.method1168(arg0);
                var6.field4041 = (arg4 & 0xFFFFFC00) + 1024;
                if (var6.field4041 > 16384) {
                    var6.field4041 = 16384;
                }
                var6.method1164(var6.field4041);
                if (class276.field4608 > 0 && class24.field437 == null) {
                    class24.field437 = new class127();
                    class24.field437.field2113 = arg1;
                    arg1.method583((byte) -106, class24.field437, class276.field4608);
                }
                if (class24.field437 != null) {
                    if (class24.field437.field2112[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    class24.field437.field2112[arg2] = var6;
                }
                return var6;
            } catch (Throwable var9) {
                try {
                    class262 var7 = new class262(arg1, arg2);
                    var7.field4037 = new int[(class54.field970 ? 2 : 1) * 256];
                    var7.field4045 = arg4;
                    var7.method1168(arg0);
                    var7.field4041 = 16384;
                    var7.method1164(var7.field4041);
                    if (class276.field4608 > 0 && class24.field437 == null) {
                        class24.field437 = new class127();
                        class24.field437.field2113 = arg1;
                        arg1.method583((byte) -70, class24.field437, class276.field4608);
                    }
                    if (class24.field437 != null) {
                        if (class24.field437.field2112[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class24.field437.field2112[arg2] = var7;
                    }
                    return var7;
                } catch (Throwable var8) {
                    return new class239();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
