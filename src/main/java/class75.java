import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class75 {

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "F")
    public float field1145 = 0.25F;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "F")
    public float field1160 = 1.0F;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "F")
    public float field1163 = 1.0F;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    public int field1162;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "F")
    public float field1147;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public int field1149;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public int field1150;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    public int field1161;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "F")
    public float field1154;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "F")
    public float field1159;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "I")
    public int field1164;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public int field1148;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "Lbn;")
    public class72 field1152;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    public static int field1156 = -2;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "S")
    public static short field1155 = 1;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field1146 = -1;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "[I")
    public static int[] field1165 = new int[32];

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/lang/String;Z)I", line = 8)
    public static final int method591(String arg0, boolean arg1) {
        field1157++;
        if (class62.field903 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < class62.field903.field1782; var2++) {
            if (class220.method1603(" ", (byte) 5, "<br>", class62.field903.field1775[var2]).equals(arg0)) {
                return var2;
            }
        }
        if (!arg1) {
            field1156 = 54;
        }
        return -1;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V", line = 1219)
    public class75() {
        this.field1162 = class261.field3886;
        this.field1147 = 0.69921875F;
        this.field1149 = 0;
        this.field1150 = -60;
        this.field1161 = -50;
        this.field1154 = 1.2F;
        this.field1159 = 1.1523438F;
        this.field1164 = -50;
        this.field1148 = class261.field3887;
        if (class36.field532 != null) {
            this.field1152 = class72.method578(class36.field532[0], class36.field532[1], class36.field532[2], class36.field532[3], class36.field532[4], class36.field532[5]);
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Laj;)V", line = 1237)
    public class75(class1 arg0) {
        int var2 = arg0.method15((byte) -118);
        if ((var2 & 0x1) == 0) {
            this.field1148 = class261.field3887;
        } else {
            this.field1148 = arg0.method33(false);
        }
        if ((var2 & 0x2) == 0) {
            this.field1159 = 1.1523438F;
        } else {
            this.field1159 = (float) arg0.method56(19612) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field1147 = 0.69921875F;
        } else {
            this.field1147 = (float) arg0.method56(19612) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field1154 = 1.2F;
        } else {
            this.field1154 = (float) arg0.method56(19612) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field1161 = -50;
            this.field1164 = -50;
            this.field1150 = -60;
        } else {
            this.field1164 = arg0.method41((byte) -66);
            this.field1150 = arg0.method41((byte) -66);
            this.field1161 = arg0.method41((byte) -66);
        }
        if ((var2 & 0x20) == 0) {
            this.field1162 = class261.field3886;
        } else {
            this.field1162 = arg0.method33(false);
        }
        if ((var2 & 0x40) == 0) {
            this.field1149 = 0;
        } else {
            this.field1149 = arg0.method56(19612);
        }
        if ((var2 & 0x80) != 0) {
            this.field1152 = class72.method578(arg0.method56(19612), arg0.method56(19612), arg0.method56(19612), arg0.method56(19612), arg0.method56(19612), arg0.method56(19612));
        } else if (class36.field532 != null) {
            this.field1152 = class72.method578(class36.field532[0], class36.field532[1], class36.field532[2], class36.field532[3], class36.field532[4], class36.field532[5]);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lpk;II)Z", line = 38)
    public static final boolean method592(class120 arg0, int arg1, int arg2) {
        field1158++;
        byte[] var3 = arg0.method950(-1516, arg2);
        if (var3 == null) {
            return false;
        }
        if (arg1 >= -69) {
            method594(49);
        }
        class176.method1297(79, var3);
        return true;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILaj;)V", line = 58)
    public final void method593(int arg0, class1 arg1) {
        field1151++;
        this.field1163 = (float) (arg1.method15((byte) 66) * 8) / 255.0F;
        this.field1145 = (float) (arg1.method15((byte) 117) * 8) / 255.0F;
        this.field1160 = (float) (arg1.method15((byte) 70) * 8) / 255.0F;
        int var3 = -97 % ((arg0 - 11) / 40);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V", line = 73)
    public static void method594(int arg0) {
        if (arg0 == 17349) {
            field1165 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lsg;Z)V", line = 82)
    public static final void method595(class42 arg0, boolean arg1) {
        class68.field1032.method277(arg0, (byte) -119);
        while (true) {
            class42 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class42[][] var7;
            class42 var78;
            do {
                class42 var77;
                do {
                    class42 var76;
                    do {
                        class42 var75;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class42) class68.field1032.method275(-1);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field648);
                                            var3 = var2.field656;
                                            var4 = var2.field652;
                                            var5 = var2.field658;
                                            var6 = var2.field668;
                                            var7 = class34.field521[var5];
                                            float var8 = 0.0F;
                                            if (class162.field2623) {
                                                if (class85.field1374 == class337.field5214) {
                                                    int var9 = class241.field3608[var3][var4];
                                                    int var10 = var9 & 0xFFFFFF;
                                                    if (class126.field2017 != var10) {
                                                        class126.field2017 = var10;
                                                        class191.method1375((byte) -11, var10);
                                                        class261.method1817(class204.method1466(125));
                                                    }
                                                    int var11 = var9 >>> 24 << 3;
                                                    if (class4.field116 != var11) {
                                                        class4.field116 = var11;
                                                        class80.method627(var11, 1864);
                                                    }
                                                    int var12 = class9.field220[0][var3 + 1][var4] + class9.field220[0][var3][var4] + class9.field220[0][var3][var4 + 1] + class9.field220[0][var3 + 1][var4 + 1] >> 2;
                                                    class102.method830(3, 14804, -var12);
                                                    var8 = 201.5F;
                                                    class162.method1190(var8);
                                                } else {
                                                    var8 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                    class162.method1190(var8);
                                                }
                                            }
                                            if (!var2.field653) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class42 var13 = class34.field521[var5 - 1][var3][var4];
                                                    if (var13 != null && var13.field648) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class50.field762 && var3 > class345.field5356) {
                                                    class42 var14 = var7[var3 - 1][var4];
                                                    if (var14 != null && var14.field648 && (var14.field653 || (var2.field657 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class50.field762 && var3 < class191.field2986 - 1) {
                                                    class42 var15 = var7[var3 + 1][var4];
                                                    if (var15 != null && var15.field648 && (var15.field653 || (var2.field657 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class122.field1992 && var4 > class151.field2492) {
                                                    class42 var16 = var7[var3][var4 - 1];
                                                    if (var16 != null && var16.field648 && (var16.field653 || (var2.field657 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class122.field1992 && var4 < class6.field130 - 1) {
                                                    class42 var17 = var7[var3][var4 + 1];
                                                    if (var17 != null && var17.field648 && (var17.field653 || (var2.field657 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field653 = false;
                                            if (var2.field670 != null) {
                                                class42 var18 = var2.field670;
                                                if (class162.field2623) {
                                                    class162.method1190(201.5F - (float) (var18.field668 + 1) * 50.0F);
                                                }
                                                if (var18.field674 == null) {
                                                    if (var18.field669 != null) {
                                                        if (class284.method1988(0, var3, var4)) {
                                                            class44.method387(var18.field669, class289.field4557, class74.field1137, class255.field3758, class291.field4569, var3, var4, true);
                                                        } else {
                                                            class44.method387(var18.field669, class289.field4557, class74.field1137, class255.field3758, class291.field4569, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class284.method1988(0, var3, var4)) {
                                                    class88.method702(var18.field674, 0, class289.field4557, class74.field1137, class255.field3758, class291.field4569, var3, var4, true);
                                                } else {
                                                    class88.method702(var18.field674, 0, class289.field4557, class74.field1137, class255.field3758, class291.field4569, var3, var4, false);
                                                }
                                                class105 var19 = var18.field665;
                                                if (var19 != null) {
                                                    if (class162.field2623) {
                                                        if ((var19.field1722 & var2.field654) == 0) {
                                                            class219.method1592(class104.field1720, class237.field3561, class339.field5231, var5, var3, var4);
                                                        } else {
                                                            class219.method1598(var19.field1722, class104.field1720, class237.field3561, class339.field5231, var6, var3, var4);
                                                        }
                                                    }
                                                    var19.field1723.method117(0, class289.field4557, class74.field1137, class255.field3758, class291.field4569, var19.field1727 - class104.field1720, var19.field1726 - class237.field3561, var19.field1725 - class339.field5231, var19.field1721, var5, (class236) null);
                                                }
                                                for (int var20 = 0; var20 < var18.field672; var20++) {
                                                    class144 var21 = var18.field659[var20];
                                                    if (var21 != null) {
                                                        if (class162.field2623) {
                                                            class219.method1592(class104.field1720, class237.field3561, class339.field5231, var5, var3, var4);
                                                        }
                                                        var21.field2346.method117(var21.field2338, class289.field4557, class74.field1137, class255.field3758, class291.field4569, var21.field2327 - class104.field1720, var21.field2324 - class237.field3561, var21.field2335 - class339.field5231, var21.field2344, var5, (class236) null);
                                                    }
                                                }
                                                if (class162.field2623) {
                                                    class162.method1190(var8);
                                                }
                                            }
                                            boolean var22 = false;
                                            if (var2.field674 == null) {
                                                if (var2.field669 != null) {
                                                    if (class284.method1988(var6, var3, var4)) {
                                                        class44.method387(var2.field669, class289.field4557, class74.field1137, class255.field3758, class291.field4569, var3, var4, true);
                                                    } else {
                                                        var22 = true;
                                                        class44.method387(var2.field669, class289.field4557, class74.field1137, class255.field3758, class291.field4569, var3, var4, false);
                                                    }
                                                }
                                            } else if (class284.method1988(var6, var3, var4)) {
                                                class88.method702(var2.field674, var6, class289.field4557, class74.field1137, class255.field3758, class291.field4569, var3, var4, true);
                                            } else {
                                                var22 = true;
                                                if (var2.field674.field1744 != 12345678 || class30.field480 && var5 <= class258.field3837) {
                                                    class88.method702(var2.field674, var6, class289.field4557, class74.field1137, class255.field3758, class291.field4569, var3, var4, false);
                                                }
                                            }
                                            if (var22) {
                                                class241 var23 = var2.field655;
                                                if (var23 != null && (var23.field3605 & 0x80000000L) != 0L) {
                                                    if (class162.field2623 && var23.field3604) {
                                                        class162.method1190(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class162.field2623) {
                                                        class219.method1592(class104.field1720, class237.field3561, class339.field5231, var5, var3, var4);
                                                    }
                                                    var23.field3609.method117(0, class289.field4557, class74.field1137, class255.field3758, class291.field4569, var23.field3603 - class104.field1720, var23.field3611 - class237.field3561, var23.field3613 - class339.field5231, var23.field3605, var5, (class236) null);
                                                    if (class162.field2623 && var23.field3604) {
                                                        class162.method1190(var8);
                                                    }
                                                }
                                            }
                                            int var24 = 0;
                                            int var25 = 0;
                                            class105 var26 = var2.field665;
                                            class293 var27 = var2.field666;
                                            if (var26 != null || var27 != null) {
                                                if (class50.field762 == var3) {
                                                    var24++;
                                                } else if (class50.field762 < var3) {
                                                    var24 += 2;
                                                }
                                                if (class122.field1992 == var4) {
                                                    var24 += 3;
                                                } else if (class122.field1992 > var4) {
                                                    var24 += 6;
                                                }
                                                var25 = class170.field2741[var24];
                                                var2.field654 = class243.field3636[var24];
                                            }
                                            if (var26 != null) {
                                                if ((var26.field1722 & class52.field780[var24]) == 0) {
                                                    var2.field662 = 0;
                                                } else if (var26.field1722 == 16) {
                                                    var2.field662 = 3;
                                                    var2.field649 = class9.field211[var24];
                                                    var2.field671 = 3 - var2.field649;
                                                } else if (var26.field1722 == 32) {
                                                    var2.field662 = 6;
                                                    var2.field649 = class67.field1015[var24];
                                                    var2.field671 = 6 - var2.field649;
                                                } else if (var26.field1722 == 64) {
                                                    var2.field662 = 12;
                                                    var2.field649 = class89.field1432[var24];
                                                    var2.field671 = 12 - var2.field649;
                                                } else {
                                                    var2.field662 = 9;
                                                    var2.field649 = class103.field1693[var24];
                                                    var2.field671 = 9 - var2.field649;
                                                }
                                                if ((var26.field1722 & var25) != 0 && !class9.method148(var6, var3, var4, var26.field1722)) {
                                                    if (class162.field2623) {
                                                        class219.method1592(class104.field1720, class237.field3561, class339.field5231, var5, var3, var4);
                                                    }
                                                    var26.field1723.method117(0, class289.field4557, class74.field1137, class255.field3758, class291.field4569, var26.field1727 - class104.field1720, var26.field1726 - class237.field3561, var26.field1725 - class339.field5231, var26.field1721, var5, (class236) null);
                                                }
                                                if ((var26.field1730 & var25) != 0 && !class9.method148(var6, var3, var4, var26.field1730)) {
                                                    if (class162.field2623) {
                                                        class219.method1592(class104.field1720, class237.field3561, class339.field5231, var5, var3, var4);
                                                    }
                                                    var26.field1724.method117(0, class289.field4557, class74.field1137, class255.field3758, class291.field4569, var26.field1727 - class104.field1720, var26.field1726 - class237.field3561, var26.field1725 - class339.field5231, var26.field1721, var5, (class236) null);
                                                }
                                            }
                                            if (var27 != null && !class147.method1116(var6, var3, var4, var27.field4593.method137())) {
                                                if (class162.field2623) {
                                                    class162.method1190(var8 - 0.5F);
                                                }
                                                if ((var27.field4605 & var25) != 0) {
                                                    if (class162.field2623) {
                                                        class219.method1592(class104.field1720, class237.field3561, class339.field5231, var5, var3, var4);
                                                    }
                                                    var27.field4593.method117(0, class289.field4557, class74.field1137, class255.field3758, class291.field4569, var27.field4598 + var27.field4601 - class104.field1720, var27.field4606 - class237.field3561, var27.field4600 + var27.field4592 - class339.field5231, var27.field4596, var5, (class236) null);
                                                } else if (var27.field4605 == 256) {
                                                    int var28 = var27.field4598 - class104.field1720;
                                                    int var29 = var27.field4606 - class237.field3561;
                                                    int var30 = var27.field4600 - class339.field5231;
                                                    int var31 = var27.field4603;
                                                    int var32;
                                                    if (var31 == 1 || var31 == 2) {
                                                        var32 = -var28;
                                                    } else {
                                                        var32 = var28;
                                                    }
                                                    int var33;
                                                    if (var31 == 2 || var31 == 3) {
                                                        var33 = -var30;
                                                    } else {
                                                        var33 = var30;
                                                    }
                                                    if (var33 < var32) {
                                                        if (class162.field2623) {
                                                            class219.method1592(class104.field1720, class237.field3561, class339.field5231, var5, var3, var4);
                                                        }
                                                        var27.field4593.method117(0, class289.field4557, class74.field1137, class255.field3758, class291.field4569, var27.field4601 + var28, var29, var27.field4592 + var30, var27.field4596, var5, (class236) null);
                                                    } else if (var27.field4595 != null) {
                                                        if (class162.field2623) {
                                                            class219.method1592(class104.field1720, class237.field3561, class339.field5231, var5, var3, var4);
                                                        }
                                                        var27.field4595.method117(0, class289.field4557, class74.field1137, class255.field3758, class291.field4569, var28, var29, var30, var27.field4596, var5, (class236) null);
                                                    }
                                                }
                                                if (class162.field2623) {
                                                    class162.method1190(var8);
                                                }
                                            }
                                            if (var22) {
                                                class241 var34 = var2.field655;
                                                if (var34 != null && (var34.field3605 & 0x80000000L) == 0L) {
                                                    if (class162.field2623 && var34.field3604) {
                                                        class162.method1190(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class162.field2623) {
                                                        class219.method1592(class104.field1720, class237.field3561, class339.field5231, var5, var3, var4);
                                                    }
                                                    var34.field3609.method117(0, class289.field4557, class74.field1137, class255.field3758, class291.field4569, var34.field3603 - class104.field1720, var34.field3611 - class237.field3561, var34.field3613 - class339.field5231, var34.field3605, var5, (class236) null);
                                                    if (class162.field2623 && var34.field3604) {
                                                        class162.method1190(var8);
                                                    }
                                                }
                                                class188 var35 = var2.field664;
                                                if (var35 != null && var35.field2948 == 0) {
                                                    if (class162.field2623) {
                                                        class219.method1592(class104.field1720, class237.field3561, class339.field5231, var5, var3, var4);
                                                    }
                                                    if (var35.field2945 != null) {
                                                        var35.field2945.method117(0, class289.field4557, class74.field1137, class255.field3758, class291.field4569, var35.field2951 - class104.field1720, var35.field2956 - class237.field3561, var35.field2954 - class339.field5231, var35.field2958, var5, (class236) null);
                                                    }
                                                    if (var35.field2952 != null) {
                                                        var35.field2952.method117(0, class289.field4557, class74.field1137, class255.field3758, class291.field4569, var35.field2951 - class104.field1720, var35.field2956 - class237.field3561, var35.field2954 - class339.field5231, var35.field2958, var5, (class236) null);
                                                    }
                                                    if (var35.field2950 != null) {
                                                        var35.field2950.method117(0, class289.field4557, class74.field1137, class255.field3758, class291.field4569, var35.field2951 - class104.field1720, var35.field2956 - class237.field3561, var35.field2954 - class339.field5231, var35.field2958, var5, (class236) null);
                                                    }
                                                }
                                            }
                                            int var36 = var2.field657;
                                            if (var36 != 0) {
                                                if (var3 < class50.field762 && (var36 & 0x4) != 0) {
                                                    class42 var37 = var7[var3 + 1][var4];
                                                    if (var37 != null && var37.field648) {
                                                        class68.field1032.method277(var37, (byte) -119);
                                                    }
                                                }
                                                if (var4 < class122.field1992 && (var36 & 0x2) != 0) {
                                                    class42 var38 = var7[var3][var4 + 1];
                                                    if (var38 != null && var38.field648) {
                                                        class68.field1032.method277(var38, (byte) -119);
                                                    }
                                                }
                                                if (var3 > class50.field762 && (var36 & 0x1) != 0) {
                                                    class42 var39 = var7[var3 - 1][var4];
                                                    if (var39 != null && var39.field648) {
                                                        class68.field1032.method277(var39, (byte) -119);
                                                    }
                                                }
                                                if (var4 > class122.field1992 && (var36 & 0x8) != 0) {
                                                    class42 var40 = var7[var3][var4 - 1];
                                                    if (var40 != null && var40.field648) {
                                                        class68.field1032.method277(var40, (byte) -119);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field662 != 0) {
                                            boolean var41 = true;
                                            for (int var42 = 0; var42 < var2.field672; var42++) {
                                                if (class266.field4024 != var2.field659[var42].field2332 && (var2.field673[var42] & var2.field662) == var2.field649) {
                                                    var41 = false;
                                                    break;
                                                }
                                            }
                                            if (var41) {
                                                class105 var43 = var2.field665;
                                                if (!class9.method148(var6, var3, var4, var43.field1722)) {
                                                    if (class162.field2623) {
                                                        label882: {
                                                            if ((var43.field1721 & 0xFC000L) == 16384L) {
                                                                int var44 = var43.field1727 - class104.field1720;
                                                                int var45 = var43.field1725 - class339.field5231;
                                                                int var46 = (int) (var43.field1721 >> 20 & 0x3L);
                                                                if (var46 == 0) {
                                                                    var44 -= 64;
                                                                    var45 += 64;
                                                                    if (var45 < var44 && var3 > 0 && var4 < class327.field5110 - 1) {
                                                                        class219.method1592(class104.field1720, class237.field3561, class339.field5231, var5, var3 - 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 1) {
                                                                    var44 += 64;
                                                                    var45 += 64;
                                                                    if (var45 < -var44 && var3 < class91.field1449 - 1 && var4 < class327.field5110 - 1) {
                                                                        class219.method1592(class104.field1720, class237.field3561, class339.field5231, var5, var3 + 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 2) {
                                                                    var44 += 64;
                                                                    var45 -= 64;
                                                                    if (var45 > var44 && var3 < class91.field1449 - 1 && var4 > 0) {
                                                                        class219.method1592(class104.field1720, class237.field3561, class339.field5231, var5, var3 + 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 3) {
                                                                    var44 -= 64;
                                                                    var45 -= 64;
                                                                    if (var45 > -var44 && var3 > 0 && var4 > 0) {
                                                                        class219.method1592(class104.field1720, class237.field3561, class339.field5231, var5, var3 - 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                }
                                                            }
                                                            class219.method1592(class104.field1720, class237.field3561, class339.field5231, var5, var3, var4);
                                                        }
                                                    }
                                                    var43.field1723.method117(0, class289.field4557, class74.field1137, class255.field3758, class291.field4569, var43.field1727 - class104.field1720, var43.field1726 - class237.field3561, var43.field1725 - class339.field5231, var43.field1721, var5, (class236) null);
                                                }
                                                var2.field662 = 0;
                                            }
                                        }
                                        if (!var2.field667) {
                                            break;
                                        }
                                        try {
                                            int var47 = var2.field672;
                                            var2.field667 = false;
                                            int var48 = 0;
                                            label767: for (int var49 = 0; var49 < var47; var49++) {
                                                class144 var50 = var2.field659[var49];
                                                if (class266.field4024 != var50.field2332) {
                                                    for (int var51 = var50.field2345; var51 <= var50.field2334; var51++) {
                                                        for (int var52 = var50.field2339; var52 <= var50.field2337; var52++) {
                                                            class42 var53 = var7[var51][var52];
                                                            if (var53.field653) {
                                                                var2.field667 = true;
                                                                continue label767;
                                                            }
                                                            if (var53.field662 != 0) {
                                                                int var54 = 0;
                                                                if (var51 > var50.field2345) {
                                                                    var54++;
                                                                }
                                                                if (var51 < var50.field2334) {
                                                                    var54 += 4;
                                                                }
                                                                if (var52 > var50.field2339) {
                                                                    var54 += 8;
                                                                }
                                                                if (var52 < var50.field2337) {
                                                                    var54 += 2;
                                                                }
                                                                if ((var54 & var53.field662) == var2.field671) {
                                                                    var2.field667 = true;
                                                                    continue label767;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class3.field97[var48++] = var50;
                                                    int var55 = class50.field762 - var50.field2345;
                                                    int var56 = var50.field2334 - class50.field762;
                                                    if (var56 > var55) {
                                                        var55 = var56;
                                                    }
                                                    int var57 = class122.field1992 - var50.field2339;
                                                    int var58 = var50.field2337 - class122.field1992;
                                                    if (var58 > var57) {
                                                        var50.field2336 = var55 + var58;
                                                    } else {
                                                        var50.field2336 = var55 + var57;
                                                    }
                                                }
                                            }
                                            while (var48 > 0) {
                                                int var59 = -50;
                                                int var60 = -1;
                                                for (int var61 = 0; var61 < var48; var61++) {
                                                    class144 var62 = class3.field97[var61];
                                                    if (class266.field4024 != var62.field2332) {
                                                        if (var62.field2336 > var59) {
                                                            var59 = var62.field2336;
                                                            var60 = var61;
                                                        } else if (var62.field2336 == var59) {
                                                            int var63 = var62.field2327 - class104.field1720;
                                                            int var64 = var62.field2335 - class339.field5231;
                                                            int var65 = class3.field97[var60].field2327 - class104.field1720;
                                                            int var66 = class3.field97[var60].field2335 - class339.field5231;
                                                            if (var63 * var63 + var64 * var64 > var65 * var65 + var66 * var66) {
                                                                var60 = var61;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var60 == -1) {
                                                    break;
                                                }
                                                class144 var67 = class3.field97[var60];
                                                var67.field2332 = class266.field4024;
                                                if (!class101.method816(var6, var67.field2345, var67.field2334, var67.field2339, var67.field2337, var67.field2346.method137())) {
                                                    if (class162.field2623) {
                                                        if ((var67.field2344 & 0xFC000L) == 147456L) {
                                                            class219.method1592(class104.field1720, class237.field3561, class339.field5231, var5, var3, var4);
                                                            int var68 = var67.field2327 - class104.field1720;
                                                            int var69 = var67.field2335 - class339.field5231;
                                                            int var70 = (int) (var67.field2344 >> 20 & 0x3L);
                                                            if (var70 == 1 || var70 == 3) {
                                                                if (var69 > -var68) {
                                                                    class219.method1594(var5, var3, var4 - 1, var3 - 1, var4);
                                                                } else {
                                                                    class219.method1594(var5, var3, var4 + 1, var3 + 1, var4);
                                                                }
                                                            } else if (var69 > var68) {
                                                                class219.method1594(var5, var3, var4 - 1, var3 + 1, var4);
                                                            } else {
                                                                class219.method1594(var5, var3, var4 + 1, var3 - 1, var4);
                                                            }
                                                        } else {
                                                            class219.method1590(class104.field1720, class237.field3561, class339.field5231, var5, var67.field2345, var67.field2339, var67.field2334, var67.field2337);
                                                        }
                                                    }
                                                    var67.field2346.method117(var67.field2338, class289.field4557, class74.field1137, class255.field3758, class291.field4569, var67.field2327 - class104.field1720, var67.field2324 - class237.field3561, var67.field2335 - class339.field5231, var67.field2344, var5, (class236) null);
                                                }
                                                for (int var71 = var67.field2345; var71 <= var67.field2334; var71++) {
                                                    for (int var72 = var67.field2339; var72 <= var67.field2337; var72++) {
                                                        class42 var73 = var7[var71][var72];
                                                        if (var73.field662 != 0) {
                                                            class68.field1032.method277(var73, (byte) -119);
                                                        } else if ((var3 != var71 || var4 != var72) && var73.field648) {
                                                            class68.field1032.method277(var73, (byte) -119);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field667) {
                                                break;
                                            }
                                        } catch (Exception var93) {
                                            var2.field667 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field648);
                            } while (var2.field662 != 0);
                            if (var3 > class50.field762 || var3 <= class345.field5356) {
                                break;
                            }
                            var75 = var7[var3 - 1][var4];
                        } while (var75 != null && var75.field648);
                        if (var3 < class50.field762 || var3 >= class191.field2986 - 1) {
                            break;
                        }
                        var76 = var7[var3 + 1][var4];
                    } while (var76 != null && var76.field648);
                    if (var4 > class122.field1992 || var4 <= class151.field2492) {
                        break;
                    }
                    var77 = var7[var3][var4 - 1];
                } while (var77 != null && var77.field648);
                if (var4 < class122.field1992 || var4 >= class6.field130 - 1) {
                    break;
                }
                var78 = var7[var3][var4 + 1];
            } while (var78 != null && var78.field648);
            var2.field648 = false;
            class26.field432--;
            class188 var79 = var2.field664;
            if (var79 != null && var79.field2948 != 0) {
                if (class162.field2623) {
                    class219.method1592(class104.field1720, class237.field3561, class339.field5231, var5, var3, var4);
                }
                if (var79.field2945 != null) {
                    var79.field2945.method117(0, class289.field4557, class74.field1137, class255.field3758, class291.field4569, var79.field2951 - class104.field1720, var79.field2956 - class237.field3561 - var79.field2948, var79.field2954 - class339.field5231, var79.field2958, var5, (class236) null);
                }
                if (var79.field2952 != null) {
                    var79.field2952.method117(0, class289.field4557, class74.field1137, class255.field3758, class291.field4569, var79.field2951 - class104.field1720, var79.field2956 - class237.field3561 - var79.field2948, var79.field2954 - class339.field5231, var79.field2958, var5, (class236) null);
                }
                if (var79.field2950 != null) {
                    var79.field2950.method117(0, class289.field4557, class74.field1137, class255.field3758, class291.field4569, var79.field2951 - class104.field1720, var79.field2956 - class237.field3561 - var79.field2948, var79.field2954 - class339.field5231, var79.field2958, var5, (class236) null);
                }
            }
            if (var2.field654 != 0) {
                class293 var80 = var2.field666;
                if (var80 != null && !class147.method1116(var6, var3, var4, var80.field4593.method137())) {
                    if ((var80.field4605 & var2.field654) != 0) {
                        if (class162.field2623) {
                            class219.method1592(class104.field1720, class237.field3561, class339.field5231, var5, var3, var4);
                        }
                        var80.field4593.method117(0, class289.field4557, class74.field1137, class255.field3758, class291.field4569, var80.field4598 + var80.field4601 - class104.field1720, var80.field4606 - class237.field3561, var80.field4600 + var80.field4592 - class339.field5231, var80.field4596, var5, (class236) null);
                    } else if (var80.field4605 == 256) {
                        int var81 = var80.field4598 - class104.field1720;
                        int var82 = var80.field4606 - class237.field3561;
                        int var83 = var80.field4600 - class339.field5231;
                        int var84 = var80.field4603;
                        int var85;
                        if (var84 == 1 || var84 == 2) {
                            var85 = -var81;
                        } else {
                            var85 = var81;
                        }
                        int var86;
                        if (var84 == 2 || var84 == 3) {
                            var86 = -var83;
                        } else {
                            var86 = var83;
                        }
                        if (var86 >= var85) {
                            if (class162.field2623) {
                                class219.method1592(class104.field1720, class237.field3561, class339.field5231, var5, var3, var4);
                            }
                            var80.field4593.method117(0, class289.field4557, class74.field1137, class255.field3758, class291.field4569, var80.field4601 + var81, var82, var80.field4592 + var83, var80.field4596, var5, (class236) null);
                        } else if (var80.field4595 != null) {
                            if (class162.field2623) {
                                class219.method1592(class104.field1720, class237.field3561, class339.field5231, var5, var3, var4);
                            }
                            var80.field4595.method117(0, class289.field4557, class74.field1137, class255.field3758, class291.field4569, var81, var82, var83, var80.field4596, var5, (class236) null);
                        }
                    }
                }
                class105 var87 = var2.field665;
                if (var87 != null) {
                    if ((var87.field1730 & var2.field654) != 0 && !class9.method148(var6, var3, var4, var87.field1730)) {
                        if (class162.field2623) {
                            class219.method1598(var87.field1730, class104.field1720, class237.field3561, class339.field5231, var6, var3, var4);
                        }
                        var87.field1724.method117(0, class289.field4557, class74.field1137, class255.field3758, class291.field4569, var87.field1727 - class104.field1720, var87.field1726 - class237.field3561, var87.field1725 - class339.field5231, var87.field1721, var5, (class236) null);
                    }
                    if ((var87.field1722 & var2.field654) != 0 && !class9.method148(var6, var3, var4, var87.field1722)) {
                        if (class162.field2623) {
                            class219.method1598(var87.field1722, class104.field1720, class237.field3561, class339.field5231, var6, var3, var4);
                        }
                        var87.field1723.method117(0, class289.field4557, class74.field1137, class255.field3758, class291.field4569, var87.field1727 - class104.field1720, var87.field1726 - class237.field3561, var87.field1725 - class339.field5231, var87.field1721, var5, (class236) null);
                    }
                }
            }
            if (var5 < class343.field5331 - 1) {
                class42 var88 = class34.field521[var5 + 1][var3][var4];
                if (var88 != null && var88.field648) {
                    class68.field1032.method277(var88, (byte) -119);
                }
            }
            if (var3 < class50.field762) {
                class42 var89 = var7[var3 + 1][var4];
                if (var89 != null && var89.field648) {
                    class68.field1032.method277(var89, (byte) -119);
                }
            }
            if (var4 < class122.field1992) {
                class42 var90 = var7[var3][var4 + 1];
                if (var90 != null && var90.field648) {
                    class68.field1032.method277(var90, (byte) -119);
                }
            }
            if (var3 > class50.field762) {
                class42 var91 = var7[var3 - 1][var4];
                if (var91 != null && var91.field648) {
                    class68.field1032.method277(var91, (byte) -119);
                }
            }
            if (var4 > class122.field1992) {
                class42 var92 = var7[var3][var4 - 1];
                if (var92 != null && var92.field648) {
                    class68.field1032.method277(var92, (byte) -119);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIIIILeh;IZJ)Z", line = 1070)
    public static final boolean method596(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class179 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class85.field1374 == class337.field5214;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class91.field1449 || var16 >= class327.field5110) {
                    return false;
                }
                class42 var17 = class34.field521[arg0][var15][var16];
                if (var17 != null && var17.field672 >= 5) {
                    return false;
                }
            }
        }
        class144 var18 = new class144();
        var18.field2344 = arg11;
        var18.field2333 = arg0;
        var18.field2327 = arg5;
        var18.field2335 = arg6;
        var18.field2324 = arg7;
        var18.field2346 = arg8;
        var18.field2338 = arg9;
        var18.field2345 = arg1;
        var18.field2339 = arg2;
        var18.field2334 = arg1 + arg3 - 1;
        var18.field2337 = arg2 + arg4 - 1;
        for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var19 > arg1) {
                    var21++;
                }
                if (var19 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class34.field521[var22][var19][var20] == null) {
                        class34.field521[var22][var19][var20] = new class42(var22, var19, var20);
                    }
                }
                class42 var23 = class34.field521[arg0][var19][var20];
                var23.field659[var23.field672] = var18;
                var23.field673[var23.field672] = var21;
                var23.field657 |= var21;
                var23.field672++;
                if (var13 && class241.field3608[var19][var20] != 0) {
                    var14 = class241.field3608[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (class241.field3608[var24][var25] == 0) {
                        class241.field3608[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class124.field2008[class11.field252++] = var18;
        }
        return true;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[Ltd;)V", line = 1200)
    public static final void method597(int arg0, class256[] arg1) {
        class22.field403[arg0] = arg1;
    }
}
