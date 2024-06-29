import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public abstract class class85 {

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field1369 = 0;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "[Z")
    public static boolean[] field1371 = new boolean[8];

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "Lpk;")
    public static class120 field1370;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "[[[I")
    public static int[][][] field1374;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIIII)Z", line = 3)
    public static final boolean method674(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "()V", line = 32)
    public static final void method676() {
        class111.field1807 = 0;
        label194: for (int var0 = 0; var0 < class55.field844; var0++) {
            class47 var1 = class118.field1909[var0];
            if (class120.field1928 != null) {
                for (int var2 = 0; var2 < class120.field1928.length; var2++) {
                    if (class120.field1928[var2] != -1000000 && (var1.field724 <= class120.field1928[var2] || var1.field728 <= class120.field1928[var2]) && (var1.field713 <= class82.field1268[var2] || var1.field717 <= class82.field1268[var2]) && (var1.field713 >= class326.field5105[var2] || var1.field717 >= class326.field5105[var2]) && (var1.field723 <= class319.field5001[var2] || var1.field735 <= class319.field5001[var2]) && (var1.field723 >= class131.field2091[var2] || var1.field735 >= class131.field2091[var2])) {
                        continue label194;
                    }
                }
            }
            if (var1.field730 == 1) {
                int var3 = var1.field718 + class77.field1214 - class50.field762;
                if (var3 >= 0 && var3 <= class77.field1214 + class77.field1214) {
                    int var4 = var1.field732 + class77.field1214 - class122.field1992;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field715 + class77.field1214 - class122.field1992;
                    if (var5 > class77.field1214 + class77.field1214) {
                        var5 = class77.field1214 + class77.field1214;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class142.field2296[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class104.field1720 - var1.field713;
                        if (var7 > 32) {
                            var1.field734 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field734 = 2;
                            var7 = -var7;
                        }
                        var1.field720 = (var1.field723 - class339.field5231 << 8) / var7;
                        var1.field716 = (var1.field735 - class339.field5231 << 8) / var7;
                        var1.field736 = (var1.field724 - class237.field3561 << 8) / var7;
                        var1.field731 = (var1.field728 - class237.field3561 << 8) / var7;
                        class86.field1386[class111.field1807++] = var1;
                    }
                }
            } else if (var1.field730 == 2) {
                int var8 = var1.field732 + class77.field1214 - class122.field1992;
                if (var8 >= 0 && var8 <= class77.field1214 + class77.field1214) {
                    int var9 = var1.field718 + class77.field1214 - class50.field762;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field721 + class77.field1214 - class50.field762;
                    if (var10 > class77.field1214 + class77.field1214) {
                        var10 = class77.field1214 + class77.field1214;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class142.field2296[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class339.field5231 - var1.field723;
                        if (var12 > 32) {
                            var1.field734 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field734 = 4;
                            var12 = -var12;
                        }
                        var1.field722 = (var1.field713 - class104.field1720 << 8) / var12;
                        var1.field726 = (var1.field717 - class104.field1720 << 8) / var12;
                        var1.field736 = (var1.field724 - class237.field3561 << 8) / var12;
                        var1.field731 = (var1.field728 - class237.field3561 << 8) / var12;
                        class86.field1386[class111.field1807++] = var1;
                    }
                }
            } else if (var1.field730 == 4) {
                int var13 = var1.field724 - class237.field3561;
                if (var13 > 128) {
                    int var14 = var1.field732 + class77.field1214 - class122.field1992;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field715 + class77.field1214 - class122.field1992;
                    if (var15 > class77.field1214 + class77.field1214) {
                        var15 = class77.field1214 + class77.field1214;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field718 + class77.field1214 - class50.field762;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field721 + class77.field1214 - class50.field762;
                        if (var17 > class77.field1214 + class77.field1214) {
                            var17 = class77.field1214 + class77.field1214;
                        }
                        boolean var18 = false;
                        label166: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class142.field2296[var19][var20]) {
                                    var18 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var18) {
                            var1.field734 = 5;
                            var1.field722 = (var1.field713 - class104.field1720 << 8) / var13;
                            var1.field726 = (var1.field717 - class104.field1720 << 8) / var13;
                            var1.field720 = (var1.field723 - class339.field5231 << 8) / var13;
                            var1.field716 = (var1.field735 - class339.field5231 << 8) / var13;
                            class86.field1386[class111.field1807++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)I", line = 262)
    public static int method677(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)I", line = 274)
    public static final int method678(int arg0) {
        field1375++;
        if (class179.field2849) {
            return 0;
        }
        int var1 = -91 % ((27 - arg0) / 49);
        if (class53.method450(2)) {
            return class1.field70 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V", line = 294)
    public static void method679(int arg0) {
        if (arg0 != 32) {
            method679(-53);
        }
        field1374 = (int[][][]) null;
        field1370 = null;
        field1371 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BLsl;)Lsl;")
    public abstract class107 method675(byte arg0, class107 arg1);
}
