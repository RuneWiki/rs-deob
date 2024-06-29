import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class44 extends class51 {

    @OriginalMember(owner = "client!ga", name = "jb", descriptor = "Lic;")
    public class59 field1136 = class54.field1326;

    @OriginalMember(owner = "client!ga", name = "kb", descriptor = "I")
    public int field1137 = 0;

    @OriginalMember(owner = "client!ga", name = "cb", descriptor = "I")
    public static int field1129 = -1;

    @OriginalMember(owner = "client!ga", name = "fb", descriptor = "Lic;")
    public static class59 field1132 = class59.method433(0, "scrollen:");

    @OriginalMember(owner = "client!ga", name = "ib", descriptor = "I")
    public static int field1135 = 0;

    @OriginalMember(owner = "client!ga", name = "eb", descriptor = "Lm;")
    public static class83 field1131 = new class83();

    @OriginalMember(owner = "client!ga", name = "qb", descriptor = "Lic;")
    public static class59 field1143 = class59.method433(0, "headicons_hint");

    @OriginalMember(owner = "client!ga", name = "rb", descriptor = "I")
    public static int field1144 = 0;

    @OriginalMember(owner = "client!ga", name = "U", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!ga", name = "W", descriptor = "I")
    public int field1123;

    @OriginalMember(owner = "client!ga", name = "Z", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!ga", name = "ab", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!ga", name = "db", descriptor = "I")
    public int field1130;

    @OriginalMember(owner = "client!ga", name = "gb", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!ga", name = "hb", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!ga", name = "lb", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!ga", name = "nb", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!ga", name = "ob", descriptor = "I")
    public int field1141;

    @OriginalMember(owner = "client!ga", name = "pb", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!ga", name = "V", descriptor = "J")
    public static long field1122;

    @OriginalMember(owner = "client!ga", name = "X", descriptor = "Ldd;")
    public static class26 field1124;

    @OriginalMember(owner = "client!ga", name = "T", descriptor = "[I")
    public static int[] field1120;

    @OriginalMember(owner = "client!ga", name = "Y", descriptor = "[I")
    public int[] field1125;

    @OriginalMember(owner = "client!ga", name = "bb", descriptor = "[I")
    public int[] field1128;

    @OriginalMember(owner = "client!ga", name = "mb", descriptor = "[Lic;")
    public class59[] field1139;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIII)V")
    public static final void method333(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1121++;
        if (class96.field2426 == 0 && !class34.field907) {
            class62.field1594++;
            class79.method651(0, class38.field1000, arg1 - arg0, class59.field1457, (byte) 74, 45, arg4 - arg3);
        }
        int var5 = -1;
        for (int var6 = 0; var6 < class92.field2383; var6++) {
            int var7 = class92.field2388[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 29 & 0x3;
            int var10 = var7 >> 7 & 0x7F;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var9 == 2 && class3.field58.method868(field1127, var8, var10, var7) >= 0) {
                    class19 var12 = class53.method397(var11, 13415);
                    if (var12.field379 != null) {
                        var12 = var12.method102(-19992);
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (class96.field2426 == 1) {
                        class84.field2109++;
                        class79.method651(var7, class46.method358(new class59[] { class96.field2431, class95.field2418, var12.field408 }, (byte) -75), var8, class24.field589, (byte) 74, 38, var10);
                    } else if (!class34.field907) {
                        class155.field3357++;
                        class59[] var13 = var12.field426;
                        if (class62.field1575) {
                            var13 = class134.method1038(var13, false);
                        }
                        if (var13 != null) {
                            for (int var14 = 4; var14 >= 0; var14--) {
                                if (var13[var14] != null) {
                                    short var15 = 0;
                                    if (var14 == 0) {
                                        var15 = 47;
                                    }
                                    if (var14 == 1) {
                                        var15 = 4;
                                    }
                                    if (var14 == 2) {
                                        var15 = 13;
                                    }
                                    if (var14 == 3) {
                                        var15 = 22;
                                    }
                                    if (var14 == 4) {
                                        var15 = 1003;
                                    }
                                    class79.method651(var7, class46.method358(new class59[] { class76.field1866, var12.field408 }, (byte) -75), var8, var13[var14], (byte) 74, var15, var10);
                                    class149.field3253++;
                                }
                            }
                        }
                        class79.method651(var12.field415 << 14, class46.method358(new class59[] { class76.field1866, var12.field408 }, (byte) -75), var8, client.field500, (byte) 74, 1002, var10);
                    } else if ((class143.field3147 & 0x4) == 4) {
                        class134.field2965++;
                        class79.method651(var7, class46.method358(new class59[] { class143.field3139, class95.field2418, var12.field408 }, (byte) -75), var8, class52.field1298, (byte) 74, 21, var10);
                    }
                }
                if (var9 == 1) {
                    class90 var16 = class47.field1210[var11];
                    if (var16.field2276.field2817 == 1 && (var16.field1730 & 0x7F) == 64 && (var16.field1751 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < class103.field2510; var17++) {
                            class90 var20 = class47.field1210[class53.field1309[var17]];
                            if (var20 != null && var16 != var20 && var20.field2276.field2817 == 1 && var16.field1730 == var20.field1730 && var16.field1751 == var20.field1751) {
                                class21.method122(var10, var8, class53.field1309[var17], (byte) 72, var20.field2276);
                            }
                        }
                        for (int var18 = 0; var18 < class43.field1092; var18++) {
                            class49 var19 = class91.field2323[class31.field842[var18]];
                            if (var19 != null && var16.field1730 == var19.field1730 && var16.field1751 == var19.field1751) {
                                class157.method1213(-51, class31.field842[var18], var19, var8, var10);
                            }
                        }
                    }
                    class21.method122(var10, var8, var11, (byte) 49, var16.field2276);
                }
                if (var9 == 0) {
                    class49 var21 = class91.field2323[var11];
                    if ((var21.field1730 & 0x7F) == 64 && (var21.field1751 & 0x7F) == 64) {
                        for (int var22 = 0; var22 < class103.field2510; var22++) {
                            class90 var25 = class47.field1210[class53.field1309[var22]];
                            if (var25 != null && var25.field2276.field2817 == 1 && var21.field1730 == var25.field1730 && var21.field1751 == var25.field1751) {
                                class21.method122(var10, var8, class53.field1309[var22], (byte) 13, var25.field2276);
                            }
                        }
                        for (int var23 = 0; var23 < class43.field1092; var23++) {
                            class49 var24 = class91.field2323[class31.field842[var23]];
                            if (var24 != null && var21 != var24 && var21.field1730 == var24.field1730 && var21.field1751 == var24.field1751) {
                                class157.method1213(-110, class31.field842[var23], var24, var8, var10);
                            }
                        }
                    }
                    class157.method1213(73, var11, var21, var8, var10);
                }
                if (var9 == 3) {
                    class83 var26 = class23.field563[field1127][var8][var10];
                    if (var26 != null) {
                        for (class15 var27 = (class15) var26.method687((byte) 124); var27 != null; var27 = (class15) var26.method688(23497)) {
                            class79 var28 = class7.method39(30996, var27.field303);
                            if (class96.field2426 == 1) {
                                class79.method651(var27.field303, class46.method358(new class59[] { class96.field2431, class21.field469, var28.field1936 }, (byte) -75), var8, class24.field589, (byte) 74, 17, var10);
                                class41.field1048++;
                            } else if (!class34.field907) {
                                class59[] var29 = var28.field1966;
                                if (class62.field1575) {
                                    var29 = class134.method1038(var29, false);
                                }
                                for (int var30 = 4; var30 >= 0; var30--) {
                                    if (var29 != null && var29[var30] != null) {
                                        class40.field1034++;
                                        byte var31 = 0;
                                        if (var30 == 0) {
                                            var31 = 14;
                                        }
                                        if (var30 == 1) {
                                            var31 = 7;
                                        }
                                        if (var30 == 2) {
                                            var31 = 20;
                                        }
                                        if (var30 == 3) {
                                            var31 = 44;
                                        }
                                        if (var30 == 4) {
                                            var31 = 6;
                                        }
                                        class79.method651(var27.field303, class46.method358(new class59[] { class130.field2924, var28.field1936 }, (byte) -75), var8, var29[var30], (byte) 74, var31, var10);
                                    } else if (var30 == 2) {
                                        class79.method651(var27.field303, class46.method358(new class59[] { class130.field2924, var28.field1936 }, (byte) -75), var8, class136.field3024, (byte) 74, 20, var10);
                                        class17.field342++;
                                    }
                                }
                                class6.field122++;
                                class79.method651(var27.field303, class46.method358(new class59[] { class130.field2924, var28.field1936 }, (byte) -75), var8, client.field500, (byte) 74, 1005, var10);
                            } else if ((class143.field3147 & 0x1) == 1) {
                                class79.method651(var27.field303, class46.method358(new class59[] { class143.field3139, class21.field469, var28.field1936 }, (byte) -75), var8, class52.field1298, (byte) 74, 9, var10);
                                class22.field519++;
                            }
                        }
                    }
                }
            }
        }
        if (arg2 < 41) {
            method337((byte) -4);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILwd;B)V")
    private final void method334(int arg0, class157 arg1, byte arg2) {
        if (arg2 != -81) {
            field1122 = -49L;
        }
        field1142++;
        if (arg0 == 1) {
            this.field1141 = arg1.method1194(false);
        } else if (arg0 == 2) {
            this.field1123 = arg1.method1194(false);
        } else if (arg0 == 3) {
            this.field1136 = arg1.method1214((byte) -46);
        } else if (arg0 == 4) {
            this.field1130 = arg1.method1175((byte) -111);
        } else if (arg0 == 5) {
            this.field1137 = arg1.method1161((byte) 60);
            this.field1139 = new class59[this.field1137];
            this.field1128 = new int[this.field1137];
            for (int var5 = 0; var5 < this.field1137; var5++) {
                this.field1128[var5] = arg1.method1175((byte) -118);
                this.field1139[var5] = arg1.method1214((byte) -46);
            }
        } else if (arg0 == 6) {
            this.field1137 = arg1.method1161((byte) 60);
            this.field1128 = new int[this.field1137];
            this.field1125 = new int[this.field1137];
            for (int var4 = 0; var4 < this.field1137; var4++) {
                this.field1128[var4] = arg1.method1175((byte) -99);
                this.field1125[var4] = arg1.method1175((byte) -109);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ldd;ILdd;Ldd;)V")
    public static final void method335(class26 arg0, int arg1, class26 arg2, class26 arg3) {
        class29.field766 = arg3;
        class131.field2948 = arg2;
        if (arg1 >= -80) {
            method337((byte) -31);
        }
        field1138++;
        class41.field1058 = arg0;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BI)Z")
    public static final boolean method336(byte arg0, int arg1) {
        field1134++;
        int var2 = 7 % ((arg0 + 8) / 34);
        if (arg1 < 32) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else {
            return arg1 < 129 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(B)V")
    public static void method337(byte arg0) {
        field1131 = null;
        field1132 = null;
        int var1 = 86 / ((arg0 + 87) / 38);
        field1120 = null;
        field1124 = null;
        field1143 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILwd;)V")
    public final void method338(int arg0, class157 arg1) {
        field1133++;
        if (arg0 != 2) {
            return;
        }
        while (true) {
            int var3 = arg1.method1194(false);
            if (var3 == 0) {
                return;
            }
            this.method334(var3, arg1, (byte) -81);
        }
    }
}
