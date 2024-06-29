import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class177 {

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "J")
    public static long field3024 = 0L;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "Ljd;")
    public static class85 field3026 = class221.method1499(")4g", (byte) -49);

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field3028 = 0;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "Ljd;")
    public static class85 field3030 = class221.method1499(":clanreq:", (byte) 114);

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field3032 = 0;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "Ljd;")
    public static class85 field3036 = class221.method1499("weiss:", (byte) -83);

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "Ljb;")
    public static class255 field3035 = null;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "Lhc;")
    public static class219 field3023;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "Lhc;")
    public static class219 field3025;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "[[S")
    public static short[][] field3034;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
    public static void method1193(byte arg0) {
        field3026 = null;
        field3023 = null;
        if (arg0 <= 72) {
            method1194(-109, (class85) null, (class85) null, false);
        }
        field3030 = null;
        field3035 = null;
        field3025 = null;
        field3034 = null;
        field3036 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILjd;Ljd;Z)V")
    public static final void method1194(int arg0, class85 arg1, class85 arg2, boolean arg3) {
        field3031++;
        class35.field540 = 0;
        class253.field4363 = arg0;
        class100.field1790 = arg2;
        class54.field960 = arg3;
        class100.field1796 = arg1;
        if (class100.field1796.method612((byte) 120, class100.field1795) || class100.field1790.method612((byte) 109, class100.field1795)) {
            class254.field4383 = 0;
            class205.field3580 = 3;
        } else {
            class205.field3580 = -3;
            class271.field4799 = 0;
            class254.field4383 = 1;
            class111.field1943 = 0;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1195(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3033++;
        if (arg7 == arg8 && arg2 == arg9 && arg0 == arg3 && arg5 == arg6) {
            class198.method1351((byte) -92, arg8, arg2, arg6, arg1, arg0);
        } else {
            int var10 = arg8;
            int var11 = arg8 * 3;
            int var12 = arg2;
            int var13 = arg7 * 3;
            int var14 = arg2 * 3;
            int var15 = arg9 * 3;
            int var16 = arg3 * 3;
            int var17 = arg5 * 3;
            int var18 = var13 + arg0 - arg8 - var16;
            int var19 = arg6 + var15 - var17 - arg2;
            int var20 = var16 + var11 - var13 - var13;
            int var21 = var17 - var15 - (var15 - var14);
            int var22 = var15 - var14;
            int var23 = var13 - var11;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var26 = var24 * var24 >> 12;
                int var27 = var24 * var26 >> 12;
                int var28 = var18 * var27;
                int var29 = var19 * var27;
                int var30 = var20 * var26;
                int var31 = var21 * var26;
                int var32 = var23 * var24;
                int var33 = var22 * var24;
                int var34 = (var28 + var30 + var32 >> 12) + arg8;
                int var35 = (var29 + var33 + var31 >> 12) + arg2;
                class198.method1351((byte) -124, var10, var12, var35, arg1, var34);
                var12 = var35;
                var10 = var34;
            }
        }
        int var25 = -71 % ((arg4 + 44) / 56);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static final void method1196(int arg0) {
        field3029++;
        if (class204.field3576 != null || field3035 != null || arg0 != -1) {
            return;
        }
        int var1 = class75.field1393;
        if (class52.field902) {
            if (var1 != 1) {
                int var6 = class245.field4195;
                int var7 = class106.field1851;
                if ((class102.field1812 - 10) > var6 || class102.field1812 + class134.field2334 + 10 < var6 || var7 < class230.field3978 - 10 || var7 > (class230.field3978 + class150.field2544 + 10)) {
                    class52.field902 = false;
                    class252.method1745(class230.field3978, class102.field1812, (byte) 115, class134.field2334, class150.field2544);
                }
            }
            if (var1 != 1) {
                return;
            }
            int var8 = class102.field1812;
            int var9 = class230.field3978;
            int var10 = class134.field2334;
            int var11 = class99.field1784;
            int var12 = class175.field3008;
            int var13 = -1;
            for (int var14 = 0; var14 < class115.field2058; var14++) {
                int var15 = var9 + ((-var14 + class115.field2058 - 1) * 15) + 31;
                if (var11 > var8 && (var8 + var10) > var11 && (var15 - 13) < var12 && var12 < var15 + 3) {
                    var13 = var14;
                }
            }
            if (var13 != -1) {
                class153.method1006(-70, var13);
            }
            class52.field902 = false;
            class252.method1745(class230.field3978, class102.field1812, (byte) 110, class134.field2334, class150.field2544);
            return;
        }
        if (var1 == 1 && class115.field2058 > 0) {
            short var2 = class90.field1659[class115.field2058 - 1];
            if (var2 == 15 || var2 == 46 || var2 == 9 || var2 == 13 || var2 == 44 || var2 == 20 || var2 == 1 || var2 == 33 || var2 == 26 || var2 == 6 || var2 == 34 || var2 == 1005) {
                int var3 = class251.field4313[class115.field2058 - 1];
                int var4 = class193.field3292[class115.field2058 - 1];
                class255 var5 = class72.method506(var4, 0);
                if (class101.method701(client.method987(var5), 481760156) || class211.method1449(3, client.method987(var5))) {
                    class20.field285 = 0;
                    class36.field563 = false;
                    if (class204.field3576 != null) {
                        class16.method120((byte) -95, class204.field3576);
                    }
                    class204.field3576 = class72.method506(var4, 0);
                    class195.field3344 = class175.field3008;
                    class4.field40 = var3;
                    class202.field3519 = class99.field1784;
                    class16.method120((byte) -76, class204.field3576);
                    return;
                }
            }
        }
        if (var1 == 1 && (class150.field2543 == 1 && class115.field2058 > 2 || class142.method930(-3115, class115.field2058 - 1))) {
            var1 = 2;
        }
        if (var1 == 2 && class115.field2058 > 0 || class203.field3541 == 1) {
            class107.method741(-15179);
        }
        if (var1 == 1 && class115.field2058 > 0 || class203.field3541 == 2) {
            class54.method363((byte) -37);
            return;
        }
    }
}
