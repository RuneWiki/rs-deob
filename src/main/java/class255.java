import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class255 {

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "Z")
    public static boolean field4134 = false;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field4140 = new String[1000];

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field4139 = 0;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public int field4136;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public int field4137;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public int field4138;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZ)V")
    public static final void method1744(int arg0, boolean arg1) {
        class161.field2566.method1695(arg0, 0);
        if (arg1) {
            field4140 = null;
        }
        field4135++;
        class118.field1677.method1695(arg0, 0);
        class235.field3879.method1695(arg0, 0);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V")
    public static void method1745(byte arg0) {
        if (arg0 != 42) {
            field4140 = null;
        }
        field4140 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIIIIILpb;IZJ)Z")
    public static final boolean method1746(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class264 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class172.field2739 == class17.field209;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var24 = arg2; var24 < arg2 + arg4; var24++) {
                if (var15 < 0 || var24 < 0 || var15 >= class88.field1076 || var24 >= class59.field752) {
                    return false;
                }
                class246 var25 = class46.field585[arg0][var15][var24];
                if (var25 != null && var25.field4044 >= 5) {
                    return false;
                }
            }
        }
        class19 var16 = new class19();
        var16.field244 = arg11;
        var16.field246 = arg0;
        var16.field228 = arg5;
        var16.field241 = arg6;
        var16.field230 = arg7;
        var16.field234 = arg8;
        var16.field242 = arg9;
        var16.field240 = arg1;
        var16.field235 = arg2;
        var16.field239 = arg1 + arg3 - 1;
        var16.field233 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; var17++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var17 > arg1) {
                    var21++;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class46.field585[var22][var17][var20] == null) {
                        class46.field585[var22][var17][var20] = new class246(var22, var17, var20);
                    }
                }
                class246 var23 = class46.field585[arg0][var17][var20];
                var23.field4038[var23.field4044] = var16;
                var23.field4037[var23.field4044] = var21;
                var23.field4057 |= var21;
                var23.field4044++;
                if (var13 && class2.field15[var17][var20] != 0) {
                    var14 = class2.field15[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; var18++) {
                for (int var19 = arg2; var19 < arg2 + arg4; var19++) {
                    if (class2.field15[var18][var19] == 0) {
                        class2.field15[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class247.field4069[class152.field2362++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)V")
    public static final void method1747(byte arg0) {
        field4141++;
        int var1 = class96.field1283.method1919(8, 5);
        if (var1 < class77.field970) {
            for (int var2 = var1; var2 < class77.field970; var2++) {
                class265.field4274[class234.field3876++] = class27.field385[var2];
            }
        }
        if (var1 > class77.field970) {
            throw new RuntimeException("gppov1");
        }
        class77.field970 = 0;
        if (arg0 < 85) {
            return;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class27.field385[var3];
            class259 var5 = class89.field1113[var4];
            int var6 = class96.field1283.method1919(1, 5);
            if (var6 == 0) {
                class27.field385[class77.field970++] = var4;
                var5.field3797 = class73.field924;
            } else {
                int var7 = class96.field1283.method1919(2, 5);
                if (var7 == 0) {
                    class27.field385[class77.field970++] = var4;
                    var5.field3797 = class73.field924;
                    class178.field2832[class126.field2027++] = var4;
                } else if (var7 == 1) {
                    class27.field385[class77.field970++] = var4;
                    var5.field3797 = class73.field924;
                    int var8 = class96.field1283.method1919(3, 5);
                    var5.method1643(false, 1, var8);
                    int var9 = class96.field1283.method1919(1, 5);
                    if (var9 == 1) {
                        class178.field2832[class126.field2027++] = var4;
                    }
                } else if (var7 == 2) {
                    class27.field385[class77.field970++] = var4;
                    var5.field3797 = class73.field924;
                    if (class96.field1283.method1919(1, 5) == 1) {
                        int var11 = class96.field1283.method1919(3, 5);
                        var5.method1643(false, 2, var11);
                        int var12 = class96.field1283.method1919(3, 5);
                        var5.method1643(false, 2, var12);
                    } else {
                        int var10 = class96.field1283.method1919(3, 5);
                        var5.method1643(false, 0, var10);
                    }
                    int var13 = class96.field1283.method1919(1, 5);
                    if (var13 == 1) {
                        class178.field2832[class126.field2027++] = var4;
                    }
                } else if (var7 == 3) {
                    class265.field4274[class234.field3876++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Leh;I)V")
    public static final void method1748(class137 arg0, int arg1) {
        class287.field4584 = arg0.method929((byte) 121, "p11_full");
        class76.field951 = arg0.method929((byte) 120, "p12_full");
        field4142++;
        class207.field3315 = arg0.method929((byte) 127, "b12_full");
        class222.field3578 = arg0.method929((byte) -22, "mapfunction");
        class80.field993 = arg0.method929((byte) 4, "hitmarks");
        class240.field3957 = arg0.method929((byte) 120, "hitbar_default");
        class155.field2489 = arg0.method929((byte) 125, "headicons_pk");
        class79.field987 = arg0.method929((byte) -83, "headicons_prayer");
        class156.field2521 = arg0.method929((byte) -27, "hint_headicons");
        class215.field3463 = arg0.method929((byte) 126, "hint_mapmarkers");
        class90.field1129 = arg0.method929((byte) 33, "mapflag");
        class42.field523 = arg0.method929((byte) 125, "cross");
        class106.field1429 = arg0.method929((byte) 122, "mapdots");
        class45.field578 = arg0.method929((byte) 125, "scrollbar");
        class25.field347 = arg0.method929((byte) -36, "name_icons");
        class231.field3848 = arg0.method929((byte) -42, "floorshadows");
        class70.field872 = arg0.method929((byte) -45, "compass");
        if (arg1 != 0) {
            method1748((class137) null, 104);
        }
        class136.field2152 = arg0.method929((byte) 124, "hint_mapedge");
    }
}
