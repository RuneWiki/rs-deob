import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class159 extends OutputStream {

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2377 = "Loaded world list data";

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "[I")
    public static int[] field2376;

    @OriginalMember(owner = "client!bj", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field2378++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
    public static void method1139(int arg0) {
        if (arg0 == 1) {
            field2377 = null;
            field2376 = null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIII)V")
    public static final void method1140(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2380++;
        if (arg2 != -26514) {
            return;
        }
        for (int var5 = 0; var5 < class126.field1895; var5++) {
            if (class86.field1281[var5] + class185.field2917[var5] > arg1 && class86.field1281[var5] < (arg1 + arg3) && arg4 < (class281.field4437[var5] + class108.field1680[var5]) && class108.field1680[var5] < arg4 + arg0) {
                class112.field1729[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IBZII[[[Lpc;)Z")
    public static final boolean method1141(int arg0, byte arg1, boolean arg2, int arg3, int arg4, class22[][][] arg5) {
        field2372++;
        byte var6 = arg2 ? 1 : (byte) (class33.field588 & 0xFF);
        if (class141.field2108[class130.field1941][arg4][arg0] == var6) {
            return false;
        } else if ((client.field2390[class130.field1941][arg4][arg0] & 0x4) == 0) {
            return false;
        } else {
            int var7 = 0;
            byte var8 = 0;
            class156.field2322[var8] = arg4;
            int var31 = var8 + 1;
            class5.field77[var8] = arg0;
            class141.field2108[class130.field1941][arg4][arg0] = var6;
            while (var7 != var31) {
                int var9 = class156.field2322[var7] & 0xFFFF;
                int var10 = (class156.field2322[var7] & 0xFFA836) >> 16;
                int var11 = class156.field2322[var7] >> 24 & 0xFF;
                int var12 = class5.field77[var7] & 0xFFFF;
                int var13 = class5.field77[var7] >> 16 & 0xFF;
                var7 = var7 + 1 & 0xFFF;
                boolean var14 = false;
                boolean var15 = false;
                if ((client.field2390[class130.field1941][var9][var12] & 0x4) == 0) {
                    var15 = true;
                }
                label229: for (int var16 = class130.field1941 + 1; var16 <= 3; var16++) {
                    if ((client.field2390[var16][var9][var12] & 0x8) == 0) {
                        if (var15 && arg5[var16][var9][var12] != null) {
                            if (arg5[var16][var9][var12].field375 != null) {
                                int var19 = class47.method399(2, var10);
                                if (arg5[var16][var9][var12].field375.field2460 == var19 || arg5[var16][var9][var12].field375.field2447 == var19) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var20 = class47.method399(2, var11);
                                    if (arg5[var16][var9][var12].field375.field2460 == var20 || arg5[var16][var9][var12].field375.field2447 == var20) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var21 = class47.method399(2, var13);
                                    if (arg5[var16][var9][var12].field375.field2460 == var21 || arg5[var16][var9][var12].field375.field2447 == var21) {
                                        continue;
                                    }
                                }
                            }
                            if (arg5[var16][var9][var12].field355 != null) {
                                for (int var22 = 0; var22 < arg5[var16][var9][var12].field371; var22++) {
                                    int var23 = (int) (arg5[var16][var9][var12].field355[var22].field267 >> 14 & 0x3FL);
                                    int var24 = (int) (arg5[var16][var9][var12].field355[var22].field267 >> 20 & 0x3L);
                                    if (var23 == 21) {
                                        var23 = 19;
                                    }
                                    int var25 = var23 | var24 << 6;
                                    if (var10 == var25 || var11 != 0 && var11 == var25 || var13 != 0 && var13 == var25) {
                                        continue label229;
                                    }
                                }
                            }
                        }
                        var14 = true;
                        class22 var26 = arg5[var16][var9][var12];
                        if (var26 != null && var26.field371 > 0) {
                            for (int var27 = 0; var27 < var26.field371; var27++) {
                                class19 var28 = var26.field355[var27];
                                if (var28.field261 != var28.field255 || var28.field260 != var28.field258) {
                                    for (int var29 = var28.field255; var29 <= var28.field261; var29++) {
                                        for (int var30 = var28.field258; var30 <= var28.field260; var30++) {
                                            class141.field2108[var16][var29][var30] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class141.field2108[var16][var9][var12] = var6;
                    }
                }
                if (var14) {
                    if (class163.field2454[arg3] < class233.field3684[class130.field1941 + 1][var9][var12]) {
                        class163.field2454[arg3] = class233.field3684[class130.field1941 + 1][var9][var12];
                    }
                    int var17 = var9 << 7;
                    if (var17 < class250.field3999[arg3]) {
                        class250.field3999[arg3] = var17;
                    } else if (class79.field1206[arg3] < var17) {
                        class79.field1206[arg3] = var17;
                    }
                    int var18 = var12 << 7;
                    if (var18 < class294.field4569[arg3]) {
                        class294.field4569[arg3] = var18;
                    } else if (var18 > class203.field3127[arg3]) {
                        class203.field3127[arg3] = var18;
                    }
                }
                if (!var15) {
                    if (var9 >= 1 && class141.field2108[class130.field1941][var9 - 1][var12] != var6) {
                        class156.field2322[var31] = class44.method377(class44.method377(var9 - 1, 1179648), -754974720);
                        class5.field77[var31] = class44.method377(var12, 1245184);
                        var31 = var31 + 1 & 0xFFF;
                        class141.field2108[class130.field1941][var9 - 1][var12] = var6;
                    }
                    var12++;
                    if (var12 < 104) {
                        if (var9 - 1 >= 0 && class141.field2108[class130.field1941][var9 - 1][var12] != var6 && (client.field2390[class130.field1941][var9][var12] & 0x4) == 0 && (client.field2390[class130.field1941][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class156.field2322[var31] = class44.method377(class44.method377(var9 - 1, 1179648), 1375731712);
                            class5.field77[var31] = class44.method377(1245184, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class141.field2108[class130.field1941][var9 - 1][var12] = var6;
                        }
                        if (class141.field2108[class130.field1941][var9][var12] != var6) {
                            class156.field2322[var31] = class44.method377(class44.method377(var9, 5373952), 318767104);
                            class5.field77[var31] = class44.method377(5439488, var12);
                            class141.field2108[class130.field1941][var9][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < 104 && class141.field2108[class130.field1941][var9 + 1][var12] != var6 && (client.field2390[class130.field1941][var9][var12] & 0x4) == 0 && (client.field2390[class130.field1941][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class156.field2322[var31] = class44.method377(-1845493760, class44.method377(5373952, var9 + 1));
                            class5.field77[var31] = class44.method377(var12, 5439488);
                            class141.field2108[class130.field1941][var9 + 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                    var12--;
                    if (var9 + 1 < 104 && class141.field2108[class130.field1941][var9 + 1][var12] != var6) {
                        class156.field2322[var31] = class44.method377(class44.method377(9568256, var9 + 1), 1392508928);
                        class5.field77[var31] = class44.method377(var12, 9633792);
                        class141.field2108[class130.field1941][var9 + 1][var12] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var9 - 1) >= 0 && class141.field2108[class130.field1941][var9 - 1][var12] != var6 && (client.field2390[class130.field1941][var9][var12] & 0x4) == 0 && (client.field2390[class130.field1941][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class156.field2322[var31] = class44.method377(301989888, class44.method377(var9 - 1, 13762560));
                            class5.field77[var31] = class44.method377(13828096, var12);
                            class141.field2108[class130.field1941][var9 - 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class141.field2108[class130.field1941][var9][var12] != var6) {
                            class156.field2322[var31] = class44.method377(class44.method377(13762560, var9), -1828716544);
                            class5.field77[var31] = class44.method377(var12, 13828096);
                            class141.field2108[class130.field1941][var9][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (var9 + 1 < 104 && class141.field2108[class130.field1941][var9 + 1][var12] != var6 && (client.field2390[class130.field1941][var9][var12] & 0x4) == 0 && (client.field2390[class130.field1941][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class156.field2322[var31] = class44.method377(class44.method377(var9 + 1, 9568256), -771751936);
                            class5.field77[var31] = class44.method377(var12, 9633792);
                            var31 = var31 + 1 & 0xFFF;
                            class141.field2108[class130.field1941][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class163.field2454[arg3] != -1000000) {
                class163.field2454[arg3] += 10;
                class250.field3999[arg3] -= 50;
                class79.field1206[arg3] += 50;
                class203.field3127[arg3] += 50;
                class294.field4569[arg3] -= 50;
            }
            if (arg1 > -83) {
                field2379 = 70;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method1142(String arg0, int arg1, int arg2) {
        String var3 = class30.method248(arg2 + 14120, class282.method1907((byte) -71, arg0));
        field2374++;
        boolean var4 = false;
        for (int var5 = 0; var5 < class259.field4112; var5++) {
            class136 var6 = class233.field3682[class26.field455[var5]];
            if (var6 != null && var6.field2064 != null && var6.field2064.equalsIgnoreCase(var3)) {
                var4 = true;
                if (arg1 == 1) {
                    class173.field2666++;
                    class240.field3826.method1762(66, true);
                    class240.field3826.method311((byte) -101, 0);
                    class240.field3826.method274(27071, class26.field455[var5]);
                } else if (arg1 == 4) {
                    class240.field3826.method1762(104, true);
                    class134.field2012++;
                    class240.field3826.method301(128, class26.field455[var5]);
                    class240.field3826.method311((byte) -105, 0);
                } else if (arg1 == 5) {
                    class240.field3826.method1762(99, true);
                    class163.field2465++;
                    class240.field3826.method307(0, -129);
                    class240.field3826.method264(-106, class26.field455[var5]);
                } else if (arg1 == 6) {
                    class62.field969++;
                    class240.field3826.method1762(93, true);
                    class240.field3826.method264(-110, class26.field455[var5]);
                    class240.field3826.method311((byte) -124, 0);
                } else if (arg1 == 7) {
                    class240.field3826.method1762(73, true);
                    class240.field3826.method311((byte) -121, 0);
                    class240.field3826.method281((byte) -128, class26.field455[var5]);
                    class200.field3101++;
                }
                break;
            }
        }
        if (arg2 != -13995) {
            field2377 = null;
        }
        if (!var4) {
            class247.method1671(0, class30.field493 + var3, -1, "");
        }
    }
}
