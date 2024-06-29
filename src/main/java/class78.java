import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class78 {

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "[I")
    public static int[] field1718 = new int[100];

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public static int field1720 = 0;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "[I")
    public static int[] field1722 = new int[5];

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public static int field1724 = 0;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "Lkh;")
    public static class97 field1719;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
    public static void method537(int arg0) {
        field1722 = null;
        field1719 = null;
        field1718 = null;
        if (arg0 != 20) {
            field1719 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIII)V")
    public static final void method538(int arg0, int arg1, int arg2, int arg3) {
        class175.method1097(true);
        field1723++;
        class196.method1278(arg1, arg0, class168.field3357.field2706 + arg1, arg0 - -class168.field3357.field2701);
        if (arg2 != 5) {
            field1720 = 96;
        }
        if (class124.field2547 == 2 || class124.field2547 == 5) {
            class196.method1275(arg1 + 25, arg0 - -5, 0, class79.field1728, class104.field2207);
        } else {
            int var4 = class134.field2790.field215 / 32 + 48;
            int var5 = class67.field1580 + class48.field1155 & 0x7FF;
            int var6 = 464 - class134.field2790.field277 / 32;
            class143.field2932.method305(arg1 + 25, arg0 + 5, 146, 151, var4, var6, var5, class107.field2292 + 256, class79.field1728, class104.field2207);
            for (int var7 = 0; var7 < class143.field2935; var7++) {
                int var37 = class61.field1423[var7] * 4 + 2 - class134.field2790.field215 / 32;
                int var38 = class176.field3502[var7] * 4 + 2 - class134.field2790.field277 / 32;
                class107.method697(var37, (byte) -25, var38, class94.field1993[var7], arg1, arg0);
            }
            for (int var8 = 0; var8 < 104; var8++) {
                for (int var33 = 0; var33 < 104; var33++) {
                    class25 var34 = class150.field3006[class59.field1385][var8][var33];
                    if (var34 != null) {
                        int var35 = var8 * 4 + 2 - class134.field2790.field215 / 32;
                        int var36 = var33 * 4 + 2 - class134.field2790.field277 / 32;
                        class107.method697(var35, (byte) -25, var36, class107.field2288[0], arg1, arg0);
                    }
                }
            }
            for (int var9 = 0; var9 < class67.field1583; var9++) {
                class182 var29 = class91.field1944[class8.field161[var9]];
                if (var29 != null && var29.method69(true)) {
                    class4 var30 = var29.field3595;
                    if (var30 != null && var30.field59 != null) {
                        var30 = var30.method26((byte) 5);
                    }
                    if (var30 != null && var30.field57 && var30.field70) {
                        int var31 = var29.field215 / 32 - class134.field2790.field215 / 32;
                        int var32 = var29.field277 / 32 - class134.field2790.field277 / 32;
                        class107.method697(var31, (byte) -25, var32, class107.field2288[1], arg1, arg0);
                    }
                }
            }
            for (int var10 = 0; var10 < class57.field1348; var10++) {
                class57 var21 = class95.field2007[class69.field1622[var10]];
                if (var21 != null && var21.method69(true)) {
                    int var22 = var21.field215 / 32 - class134.field2790.field215 / 32;
                    int var23 = var21.field277 / 32 - class134.field2790.field277 / 32;
                    long var24 = var21.field1345.method166((byte) -128);
                    boolean var26 = false;
                    for (int var27 = 0; var27 < class82.field1780; var27++) {
                        if (class17.field364[var27] == var24 && class74.field1680[var27] != 0) {
                            var26 = true;
                            break;
                        }
                    }
                    boolean var28 = false;
                    if (class134.field2790.field1335 != 0 && var21.field1335 != 0 && class134.field2790.field1335 == var21.field1335) {
                        var28 = true;
                    }
                    if (var26) {
                        class107.method697(var22, (byte) -25, var23, class107.field2288[3], arg1, arg0);
                    } else if (var28) {
                        class107.method697(var22, (byte) -25, var23, class107.field2288[4], arg1, arg0);
                    } else {
                        class107.method697(var22, (byte) -25, var23, class107.field2288[2], arg1, arg0);
                    }
                }
            }
            if (class113.field2380 != 0 && class15.field339 % 20 < 10) {
                if (class113.field2380 == 1 && class56.field1315 >= 0 && class91.field1944.length > class56.field1315) {
                    class182 var11 = class91.field1944[class56.field1315];
                    if (var11 != null) {
                        int var12 = var11.field215 / 32 - class134.field2790.field215 / 32;
                        int var13 = var11.field277 / 32 - class134.field2790.field277 / 32;
                        class154.method948(class105.field2282[1], var13, var12, arg1, arg0, (byte) -8);
                    }
                }
                if (class113.field2380 == 2) {
                    int var14 = (class68.field1612 - class155.field3099) * 4 + 2 - class134.field2790.field215 / 32;
                    int var15 = (class29.field645 - class94.field1989) * 4 + 2 - class134.field2790.field277 / 32;
                    class154.method948(class105.field2282[1], var15, var14, arg1, arg0, (byte) -8);
                }
                if (class113.field2380 == 10 && class189.field3715 >= 0 && class95.field2007.length > class189.field3715) {
                    class57 var16 = class95.field2007[class189.field3715];
                    if (var16 != null) {
                        int var17 = var16.field215 / 32 - class134.field2790.field215 / 32;
                        int var18 = var16.field277 / 32 - class134.field2790.field277 / 32;
                        class154.method948(class105.field2282[1], var18, var17, arg1, arg0, (byte) -8);
                    }
                }
            }
            if (class121.field2517 != 0) {
                int var19 = class121.field2517 * 4 + 2 - class134.field2790.field215 / 32;
                int var20 = class43.field915 * 4 + 2 - class134.field2790.field277 / 32;
                class107.method697(var19, (byte) -25, var20, class105.field2282[0], arg1, arg0);
            }
            class196.method1281(arg1 + 93 + 4, arg0 + 82 - 4, 3, 3, 16777215);
        }
        if (class124.field2547 >= 3) {
            class196.method1275(arg1, arg0, 0, class35.field709, class34.field701);
        } else {
            class64.field1515.method305(arg1, arg0, 33, 33, 25, 25, class48.field1155, 256, class35.field709, class34.field701);
        }
        if (class204.field4024[arg3]) {
            class168.field3357.method836(arg1, arg0);
        }
        class193.field3821[arg3] = true;
    }
}
