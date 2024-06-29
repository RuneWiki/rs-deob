import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class50 extends class146 {

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "[B")
    public byte[] field1146;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "Lec;")
    public static class32 field1149 = null;

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "[I")
    public static int[] field1160 = new int[25];

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "Lec;")
    public static class32 field1153 = class73.method594("<img=0>", true);

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "Lf;")
    public static class36 field1159 = null;

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "Lec;")
    public static class32 field1156 = class73.method594("p11_full", true);

    @OriginalMember(owner = "client!ha", name = "G", descriptor = "I")
    public static int field1161 = 0;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "Lja;")
    public static class63 field1147 = new class63(128);

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "Lec;")
    public static class32 field1163 = class73.method594("mapmarker", true);

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "Lf;")
    public static class36 field1164;

    @OriginalMember(owner = "client!ha", name = "D", descriptor = "Lgf;")
    public static class48 field1158;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
    public static void method392(byte arg0) {
        field1149 = null;
        field1164 = null;
        field1147 = null;
        field1159 = null;
        field1153 = null;
        if (arg0 >= 102) {
            field1158 = null;
            field1156 = null;
            field1163 = null;
            field1160 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)I")
    public static final int method393(int arg0) {
        if (arg0 != -21211) {
            method393(91);
        }
        field1152++;
        int var1 = class83.method654(-5736, class43.field990, class105.field2496, class48.field1127);
        return var1 - class73.field1720 >= 800 || (class3.field50[class43.field990][class105.field2496 >> 7][class48.field1127 >> 7] & 0x4) == 0 ? 3 : class43.field990;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lnf;ZLnf;)V")
    public static final void method394(class96 arg0, boolean arg1, class96 arg2) {
        field1151++;
        if (class70.field1652 == null) {
            class70.field1652 = class62.method475(class71.field1689, class30.field572, true, class74.field1749);
        }
        if (class54.field1265 == null) {
            class54.field1265 = class56.method444(class74.field1749, class65.field1506, -11, class30.field572);
        }
        if (class41.field959 == null) {
            class41.field959 = class56.method444(class74.field1749, class63.field1456, -11, class30.field572);
        }
        if (class156.field3558 == null) {
            class156.field3558 = class56.method444(class74.field1749, class111.field2609, -11, class30.field572);
        }
        class141.method1055(0, 23, 765, 480, 0);
        class141.method1061(0, 0, 125, 23, 12425273, 9135624);
        class141.method1061(125, 0, 640, 23, 5197647, 2697513);
        arg0.method795(class4.field65, 62, 15, 0, -1);
        if (class156.field3558 != null) {
            class156.field3558[1].method400(140, 1);
            arg2.method793(class105.field2486, 152, 10, 16777215, -1);
            class156.field3558[0].method400(140, 12);
            arg2.method793(class32.field628, 152, 21, 16777215, -1);
        }
        if (class41.field959 != null) {
            short var3 = 280;
            if (class154.field3512[0] == 0 && class98.field2266[0] == 0) {
                class41.field959[2].method400(var3, 4);
            } else {
                class41.field959[0].method400(var3, 4);
            }
            if (class154.field3512[0] == 0 && class98.field2266[0] == 1) {
                class41.field959[3].method400(var3 + 15, 4);
            } else {
                class41.field959[1].method400(var3 + 15, 4);
            }
            arg0.method793(class15.field292, var3 + 32, 17, 16777215, -1);
            short var4 = 390;
            if (class154.field3512[0] == 1 && class98.field2266[0] == 0) {
                class41.field959[2].method400(var4, 4);
            } else {
                class41.field959[0].method400(var4, 4);
            }
            short var5 = 500;
            short var6 = 610;
            if (class154.field3512[0] == 1 && class98.field2266[0] == 1) {
                class41.field959[3].method400(var4 + 15, 4);
            } else {
                class41.field959[1].method400(var4 + 15, 4);
            }
            arg0.method793(class91.field2094, var4 + 32, 17, 16777215, -1);
            if (class154.field3512[0] == 2 && class98.field2266[0] == 0) {
                class41.field959[2].method400(var5, 4);
            } else {
                class41.field959[0].method400(var5, 4);
            }
            if (class154.field3512[0] == 2 && class98.field2266[0] == 1) {
                class41.field959[3].method400(var5 + 15, 4);
            } else {
                class41.field959[1].method400(var5 + 15, 4);
            }
            arg0.method793(class34.field722, var5 + 32, 17, 16777215, -1);
            if (class154.field3512[0] == 3 && class98.field2266[0] == 0) {
                class41.field959[2].method400(var6, 4);
            } else {
                class41.field959[0].method400(var6, 4);
            }
            if (class154.field3512[0] == 3 && class98.field2266[0] == 1) {
                class41.field959[3].method400(var6 + 15, 4);
            } else {
                class41.field959[1].method400(var6 + 15, 4);
            }
            arg0.method793(class112.field2622, var6 + 32, 17, 16777215, -1);
        }
        class141.method1055(708, 4, 50, 16, 0);
        arg2.method795(class92.field2116, 733, 16, 16777215, -1);
        class137.field3193 = -1;
        if (class70.field1652 != null) {
            byte var7 = 88;
            byte var8 = 19;
            int var9 = 765 / (var7 + 1);
            int var10 = 480 / (var8 + 1);
            int var11;
            int var12;
            do {
                var11 = var10;
                var12 = var9;
                if ((var9 - 1) * var10 >= class75.field1759) {
                    var9--;
                }
                if (class75.field1759 <= (var10 - 1) * var9) {
                    var10--;
                }
                if (class75.field1759 <= (var10 - 1) * var9) {
                    var10--;
                }
            } while (var10 != var11 || var9 != var12);
            int var13 = (480 - var8 * var10) / (var10 + 1);
            if (var13 > 5) {
                var13 = 5;
            }
            int var14 = (765 - var7 * var9) / (var9 + 1);
            if (var14 > 5) {
                var14 = 5;
            }
            int var15 = (765 - (var9 - 1) * var14 - var7 * var9) / 2;
            int var16 = (480 - var8 * var10 - (var10 + -1) * var13) / 2;
            int var17 = var16 + 23;
            int var18 = var15;
            int var19 = 0;
            for (int var20 = 0; var20 < class75.field1759; var20++) {
                class102 var21 = class97.field2237[var20];
                boolean var22 = true;
                class32 var23 = class159.method1230(var21.field2392, 0);
                if (var21.field2392 == -1) {
                    var23 = class34.field716;
                    var22 = false;
                } else if (var21.field2392 > 1980) {
                    var23 = class124.field2891;
                    var22 = false;
                }
                if (var18 <= class86.field2002 && class140.field3218 >= var17 && var7 + var18 > class86.field2002 && class140.field3218 < var8 + var17 && var22) {
                    class137.field3193 = var20;
                    class70.field1652[var21.field2395 ? 1 : 0].method387(var18, var17, 128, 16777215);
                } else {
                    class70.field1652[var21.field2395 ? 1 : 0].method388(var18, var17);
                }
                if (class54.field1265 != null) {
                    class54.field1265[(var21.field2395 ? 8 : 0) + var21.field2389].method400(var18 + 29, var17);
                }
                arg0.method795(class159.method1230(var21.field2398, 0), var18 + 15, var8 / 2 + var17 + 5, 0, -1);
                arg2.method795(var23, var18 + 60, var8 / 2 + var17 + 5, 268435455, -1);
                var17 += var8 + var13;
                var19++;
                if (var10 <= var19) {
                    var17 = var16 + 23;
                    var19 = 0;
                    var18 += var14 + var7;
                }
            }
        }
        try {
            Graphics var24 = class107.field2541.getGraphics();
            field1158.method122(var24, 29504, 0, 0);
            if (arg1) {
                method392((byte) 97);
                return;
            }
        } catch (Exception var25) {
            class107.field2541.repaint();
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[II[I[Loe;)V")
    public static final void method395(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, class102[] arg5) {
        field1162++;
        if (arg0 < arg1) {
            int var6 = arg1 + 1;
            int var7 = (arg0 + arg1) / 2;
            class102 var8 = arg5[var7];
            arg5[var7] = arg5[arg0];
            int var9 = arg0 - 1;
            arg5[arg0] = var8;
            while (var9 < var6) {
                boolean var10 = true;
                do {
                    var6--;
                    for (int var11 = 0; var11 < 4; var11++) {
                        int var12;
                        int var13;
                        if (arg4[var11] == 2) {
                            var13 = var8.field2400;
                            var12 = arg5[var6].field2400;
                        } else if (arg4[var11] == 1) {
                            var12 = arg5[var6].field2392;
                            var13 = var8.field2392;
                            if (var12 == -1 && arg2[var11] == 1) {
                                var12 = 2001;
                            }
                            if (var13 == -1 && arg2[var11] == 1) {
                                var13 = 2001;
                            }
                        } else if (arg4[var11] == 3) {
                            var12 = arg5[var6].field2395 ? 1 : 0;
                            var13 = var8.field2395 ? 1 : 0;
                        } else {
                            var13 = var8.field2398;
                            var12 = arg5[var6].field2398;
                        }
                        if (var12 != var13) {
                            if ((arg2[var11] != 1 || var12 <= var13) && (arg2[var11] != 0 || var13 <= var12)) {
                                var10 = false;
                            }
                            break;
                        }
                        if (var11 == 3) {
                            var10 = false;
                        }
                    }
                } while (var10);
                boolean var14 = true;
                do {
                    var9++;
                    for (int var15 = 0; var15 < 4; var15++) {
                        int var16;
                        int var17;
                        if (arg4[var15] == 2) {
                            var16 = var8.field2400;
                            var17 = arg5[var9].field2400;
                        } else if (arg4[var15] == 1) {
                            var16 = var8.field2392;
                            if (var16 == -1 && arg2[var15] == 1) {
                                var16 = 2001;
                            }
                            var17 = arg5[var9].field2392;
                            if (var17 == -1 && arg2[var15] == 1) {
                                var17 = 2001;
                            }
                        } else if (arg4[var15] == 3) {
                            var17 = arg5[var9].field2395 ? 1 : 0;
                            var16 = var8.field2395 ? 1 : 0;
                        } else {
                            var16 = var8.field2398;
                            var17 = arg5[var9].field2398;
                        }
                        if (var16 != var17) {
                            if ((arg2[var15] != 1 || var16 <= var17) && (arg2[var15] != 0 || var16 >= var17)) {
                                var14 = false;
                            }
                            break;
                        }
                        if (var15 == 3) {
                            var14 = false;
                        }
                    }
                } while (var14);
                if (var9 < var6) {
                    class102 var18 = arg5[var9];
                    arg5[var9] = arg5[var6];
                    arg5[var6] = var18;
                }
            }
            method395(arg0, var6, arg2, 79, arg4, arg5);
            method395(var6 + 1, arg1, arg2, 56, arg4, arg5);
        }
        if (arg3 <= 36) {
            field1153 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)I")
    public static final int method396(int arg0, int arg1) {
        if (arg1 < 58) {
            method394(null, false, null);
        }
        field1150++;
        return arg0 >> 17 & 0x7;
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)Lia;")
    public static final class57 method397(int arg0, int arg1) {
        field1148++;
        class57 var2 = (class57) class5.field105.method486(arg0 - 28829, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class4.field56.method206(arg0, arg1, arg0 ^ 0xFFFFFFB1);
        class57 var4 = new class57();
        if (var3 != null) {
            var4.method448(-28563, new class66(var3), arg1);
        }
        var4.method447(124);
        class5.field105.method485((long) arg1, (byte) -122, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "([B)V")
    public class50(byte[] arg0) {
        this.field1146 = arg0;
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
    public static final void method398(int arg0) {
        for (int var1 = -1; var1 < class62.field1405; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class137.field3189[var1];
            }
            class70 var6 = class52.field1176[var5];
            if (var6 != null && var6.field2708 > 0) {
                var6.field2708--;
                if (var6.field2708 == 0) {
                    var6.field2723 = null;
                }
            }
        }
        field1157++;
        for (int var2 = 0; var2 < class102.field2399; var2++) {
            int var3 = class15.field313[var2];
            class111 var4 = class14.field230[var3];
            if (var4 != null && var4.field2708 > 0) {
                var4.field2708--;
                if (var4.field2708 == 0) {
                    var4.field2723 = null;
                }
            }
        }
        if (arg0 != -17471) {
            method393(65);
        }
    }
}
