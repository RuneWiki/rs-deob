import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public class class414 {

    @OriginalMember(owner = "client!hca", name = "i", descriptor = "I")
    public int field5377 = -1;

    @OriginalMember(owner = "client!hca", name = "k", descriptor = "I")
    private int field5379 = 0;

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "Z")
    public boolean field5370 = true;

    @OriginalMember(owner = "client!hca", name = "n", descriptor = "I")
    public int field5382 = 128;

    @OriginalMember(owner = "client!hca", name = "g", descriptor = "[Ljava/awt/Color;")
    public static Color[] field5375 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!hca", name = "j", descriptor = "Ljava/lang/String;")
    public static String field5378 = null;

    @OriginalMember(owner = "client!hca", name = "o", descriptor = "[S")
    public static short[] field5383 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!hca", name = "r", descriptor = "Lcea;")
    public static class180 field5386 = new class180("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "I")
    public int field5369;

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "I")
    public int field5371;

    @OriginalMember(owner = "client!hca", name = "d", descriptor = "I")
    public int field5372;

    @OriginalMember(owner = "client!hca", name = "e", descriptor = "I")
    public static int field5373;

    @OriginalMember(owner = "client!hca", name = "f", descriptor = "I")
    public static int field5374;

    @OriginalMember(owner = "client!hca", name = "h", descriptor = "I")
    public int field5376;

    @OriginalMember(owner = "client!hca", name = "l", descriptor = "I")
    public static int field5380;

    @OriginalMember(owner = "client!hca", name = "m", descriptor = "I")
    public static int field5381;

    @OriginalMember(owner = "client!hca", name = "p", descriptor = "I")
    public static int field5384;

    @OriginalMember(owner = "client!hca", name = "q", descriptor = "I")
    public static int field5385;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(BLos;)V", line = 9)
    public final void method2360(byte arg0, class374 arg1) {
        while (true) {
            int var3 = arg1.method2129(-73);
            if (var3 == 0) {
                int var4 = -95 / ((arg0 + 24) / 47);
                field5380++;
                return;
            }
            this.method2362(var3, -116, arg1);
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Z)V", line = 44)
    public static void method2361(boolean arg0) {
        field5378 = null;
        field5386 = null;
        field5375 = null;
        if (arg0) {
            method2361(false);
        }
        field5383 = null;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(IILos;)V", line = 59)
    private final void method2362(int arg0, int arg1, class374 arg2) {
        field5374++;
        if (arg1 > -106) {
            return;
        }
        if (arg0 == 1) {
            this.field5379 = arg2.method2128(true);
            this.method2364(this.field5379, (byte) 108);
        } else if (arg0 == 2) {
            this.field5377 = arg2.method2136(false);
            if (this.field5377 == 65535) {
                this.field5377 = -1;
                return;
            }
        } else if (arg0 == 3) {
            this.field5382 = arg2.method2136(false) << 0;
            return;
        } else if (arg0 == 4) {
            this.field5370 = false;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(II[[[Ldg;BIZ)Z", line = 95)
    public static final boolean method2363(int arg0, int arg1, class349[][][] arg2, byte arg3, int arg4, boolean arg5) {
        field5381++;
        byte var6 = arg5 ? 1 : (byte) (class631.field9087 & 0xFF);
        if (class250.field3223[class442.field6099][arg1][arg0] == var6) {
            return false;
        } else if ((class330.field4304[class442.field6099][arg1][arg0] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class552.field8129[var7] = arg1;
            int var8 = 0;
            int var35 = var7 + 1;
            class286.field3733[var7] = arg0;
            if (arg3 < 26) {
                field5378 = null;
            }
            class250.field3223[class442.field6099][arg1][arg0] = var6;
            while (var35 != var8) {
                int var9 = class552.field8129[var8] & 0xFFFF;
                int var10 = (class552.field8129[var8] & 0xFF396E) >> 16;
                int var11 = class552.field8129[var8] >> 24 & 0xFF;
                int var12 = class286.field3733[var8] & 0xFFFF;
                int var13 = (class286.field3733[var8] & 0xFFD18F) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class330.field4304[class442.field6099][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class442.field6099 + 1; var16 <= 3; var16++) {
                    if ((class330.field4304[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg2[var16][var9][var12] != null) {
                            if (arg2[var16][var9][var12].field4496 != null) {
                                int var20 = class160.method876(var10, 2);
                                if (arg2[var16][var9][var12].field4496.field3006 == var20 || arg2[var16][var9][var12].field4497 != null && arg2[var16][var9][var12].field4497.field3006 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class160.method876(var11, 2);
                                    if (arg2[var16][var9][var12].field4496.field3006 == var21 || arg2[var16][var9][var12].field4497 != null && arg2[var16][var9][var12].field4497.field3006 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class160.method876(var13, 2);
                                    if (arg2[var16][var9][var12].field4496.field3006 == var22 || arg2[var16][var9][var12].field4497 != null && arg2[var16][var9][var12].field4497.field3006 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class349 var23 = arg2[var16][var9][var12];
                            if (var23.field4499 != null) {
                                for (class61 var24 = var23.field4499; var24 != null; var24 = var24.field595) {
                                    class598 var25 = var24.field589;
                                    if (var25 instanceof class269) {
                                        class269 var26 = (class269) var25;
                                        int var27 = var26.method337(true);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var28 = var26.method333((byte) 70);
                                        int var29 = var27 | var28 << 6;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class349 var30 = arg2[var16][var9][var12];
                        if (var30 != null && var30.field4499 != null) {
                            for (class61 var31 = var30.field4499; var31 != null; var31 = var31.field595) {
                                class598 var32 = var31.field589;
                                if (var32.field8663 != var32.field8653 || var32.field8654 != var32.field8650) {
                                    for (int var33 = var32.field8653; var33 <= var32.field8663; var33++) {
                                        for (int var34 = var32.field8650; var34 <= var32.field8654; var34++) {
                                            class250.field3223[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class250.field3223[var16][var9][var12] = var6;
                        var15 = true;
                    }
                }
                if (var15) {
                    int var17 = class128.field1574[class442.field6099 + 1].method855(var9, var12);
                    if (class7.field60[arg4] < var17) {
                        class7.field60[arg4] = var17;
                    }
                    int var18 = var9 << 7;
                    int var19 = var12 << 7;
                    if (var18 < class462.field6375[arg4]) {
                        class462.field6375[arg4] = var18;
                    } else if (class318.field4053[arg4] < var18) {
                        class318.field4053[arg4] = var18;
                    }
                    if (class194.field2351[arg4] > var19) {
                        class194.field2351[arg4] = var19;
                    } else if (class329.field4301[arg4] < var19) {
                        class329.field4301[arg4] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class250.field3223[class442.field6099][var9 - 1][var12] != var6) {
                        class552.field8129[var35] = class42.method223(-754974720, class42.method223(1179648, var9 - 1));
                        class286.field3733[var35] = class42.method223(1245184, var12);
                        class250.field3223[class442.field6099][var9 - 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12++;
                    if (var12 < class422.field5452) {
                        if ((var9 - 1) >= 0 && class250.field3223[class442.field6099][var9 - 1][var12] != var6 && (class330.field4304[class442.field6099][var9][var12] & 0x4) == 0 && (class330.field4304[class442.field6099][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class552.field8129[var35] = class42.method223(1375731712, class42.method223(var9 - 1, 1179648));
                            class286.field3733[var35] = class42.method223(var12, 1245184);
                            class250.field3223[class442.field6099][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class250.field3223[class442.field6099][var9][var12] != var6) {
                            class552.field8129[var35] = class42.method223(class42.method223(5373952, var9), 318767104);
                            class286.field3733[var35] = class42.method223(5439488, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class250.field3223[class442.field6099][var9][var12] = var6;
                        }
                        if (class106.field1289 > var9 + 1 && class250.field3223[class442.field6099][var9 + 1][var12] != var6 && (class330.field4304[class442.field6099][var9][var12] & 0x4) == 0 && (class330.field4304[class442.field6099][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class552.field8129[var35] = class42.method223(-1845493760, class42.method223(5373952, var9 + 1));
                            class286.field3733[var35] = class42.method223(5439488, var12);
                            class250.field3223[class442.field6099][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                    var12--;
                    if (class106.field1289 > (var9 + 1) && class250.field3223[class442.field6099][var9 + 1][var12] != var6) {
                        class552.field8129[var35] = class42.method223(class42.method223(var9 + 1, 9568256), 1392508928);
                        class286.field3733[var35] = class42.method223(var12, 9633792);
                        class250.field3223[class442.field6099][var9 + 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class250.field3223[class442.field6099][var9 - 1][var12] != var6 && (class330.field4304[class442.field6099][var9][var12] & 0x4) == 0 && (class330.field4304[class442.field6099][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class552.field8129[var35] = class42.method223(class42.method223(13762560, var9 - 1), 301989888);
                            class286.field3733[var35] = class42.method223(var12, 13828096);
                            class250.field3223[class442.field6099][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class250.field3223[class442.field6099][var9][var12] != var6) {
                            class552.field8129[var35] = class42.method223(-1828716544, class42.method223(var9, 13762560));
                            class286.field3733[var35] = class42.method223(var12, 13828096);
                            class250.field3223[class442.field6099][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < class106.field1289 && class250.field3223[class442.field6099][var9 + 1][var12] != var6 && (class330.field4304[class442.field6099][var9][var12] & 0x4) == 0 && (class330.field4304[class442.field6099][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class552.field8129[var35] = class42.method223(-771751936, class42.method223(var9 + 1, 9568256));
                            class286.field3733[var35] = class42.method223(var12, 9633792);
                            var35 = var35 + 1 & 0xFFF;
                            class250.field3223[class442.field6099][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class7.field60[arg4] != -1000000) {
                class7.field60[arg4] += 10;
                class462.field6375[arg4] -= 50;
                class318.field4053[arg4] += 50;
                class329.field4301[arg4] += 50;
                class194.field2351[arg4] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(IB)V", line = 422)
    private final void method2364(int arg0, byte arg1) {
        field5373++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field5369 = (int) (var17 * 256.0D);
        double var19 = var13 / 6.0D;
        this.field5371 = (int) (var15 * 256.0D);
        if (arg1 <= 49) {
            method2361(false);
        }
        if (this.field5369 < 0) {
            this.field5369 = 0;
        } else if (this.field5369 > 255) {
            this.field5369 = 255;
        }
        if (var17 > 0.5D) {
            this.field5376 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field5376 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field5371 < 0) {
            this.field5371 = 0;
        } else if (this.field5371 > 255) {
            this.field5371 = 255;
        }
        if (this.field5376 < 1) {
            this.field5376 = 1;
        }
        this.field5372 = (int) ((double) this.field5376 * var19);
    }
}
