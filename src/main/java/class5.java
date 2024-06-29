import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 {

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public int field109 = 0;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public int field105 = 0;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "Lsg;")
    private static class169 field104 = class165.method1060("button near the top of that page)3", 1536);

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "Lsg;")
    public static class169 field110 = field104;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "Lsg;")
    public static class169 field112 = class165.method1060("leuchten1:", 1536);

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public int field100;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public int field101;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public int field102;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public int field107;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public int field111;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "Lsh;")
    public static class170 field113;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "Lac;")
    public class4 field103;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "Lac;")
    public class4 field99;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)V")
    public static final void method32(int arg0, int arg1) {
        class200.field3912 += arg1 * 128;
        if (arg0 > -28) {
            return;
        }
        short var2 = 256;
        field97++;
        if (class200.field3912 > class151.field2919.length) {
            class200.field3912 -= class151.field2919.length;
            int var3 = (int) (Math.random() * 12.0D);
            class145.method958(class4.field87[var3], 124);
        }
        int var4 = 0;
        int var5 = arg1 * 128;
        int var6 = (var2 - arg1) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var27 = class17.field347[var4 + var5] - class151.field2919[class151.field2919.length - 1 & class200.field3912 + var4] * arg1 / 6;
            if (var27 < 0) {
                var27 = 0;
            }
            class17.field347[var4++] = var27;
        }
        for (int var8 = var2 - arg1; var8 < var2; var8++) {
            int var24 = var8 * 128;
            for (int var25 = 0; var25 < 128; var25++) {
                int var26 = (int) (Math.random() * 100.0D);
                if (var26 < 50 && var25 > 10 && var25 < 118) {
                    class17.field347[var24 + var25] = 255;
                } else {
                    class17.field347[var25 + var24] = 0;
                }
            }
        }
        if (class156.field2988 > 0) {
            class156.field2988 -= arg1 * 4;
        }
        if (class180.field3514 > 0) {
            class180.field3514 -= arg1 * 4;
        }
        if (class180.field3514 == 0 && class156.field2988 == 0) {
            int var9 = (int) ((double) (2000 / arg1) * Math.random());
            if (var9 == 0) {
                class180.field3514 = 1024;
            }
            if (var9 == 1) {
                class156.field2988 = 1024;
            }
        }
        for (int var10 = 0; var10 < var2 - arg1; var10++) {
            class193.field3811[var10] = class193.field3811[arg1 + var10];
        }
        for (int var11 = var2 - arg1; var11 < var2; var11++) {
            class193.field3811[var11] = (int) (Math.sin((double) class37.field721 / 14.0D) * 16.0D + Math.sin((double) class37.field721 / 15.0D) * 14.0D + Math.sin((double) class37.field721 / 16.0D) * 12.0D);
            class37.field721++;
        }
        class140.field2601 += arg1;
        int var12 = ((class162.field3107 & 0x1) + arg1) / 2;
        if (var12 <= 0) {
            return;
        }
        for (int var13 = 0; var13 < class140.field2601 * 100; var13++) {
            int var22 = (int) (Math.random() * 124.0D) + 2;
            int var23 = (int) (Math.random() * 128.0D) + 128;
            class17.field347[var22 + (var23 << 7)] = 192;
        }
        class140.field2601 = 0;
        for (int var14 = 0; var14 < var2; var14++) {
            int var19 = var14 * 128;
            int var20 = 0;
            for (int var21 = -var12; var21 < 128; var21++) {
                if (var12 + var21 < 128) {
                    var20 += class17.field347[var12 + var19 + var21];
                }
                if (var21 - var12 - 1 >= 0) {
                    var20 -= class17.field347[var19 + var21 - var12 - 1];
                }
                if (var21 >= 0) {
                    class1.field12[var19 + var21] = var20 / (var12 * 2 + 1);
                }
            }
        }
        for (int var15 = 0; var15 < 128; var15++) {
            int var16 = 0;
            for (int var17 = -var12; var17 < var2; var17++) {
                int var18 = var17 * 128;
                if (var12 + var17 < var2) {
                    var16 += class1.field12[var12 * 128 + var15 + var18];
                }
                if (var17 - var12 - 1 >= 0) {
                    var16 -= class1.field12[var15 + var18 - (var12 + 1) * 128];
                }
                if (var17 >= 0) {
                    class17.field347[var15 + var18] = var16 / (var12 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(II)Z")
    public static final boolean method33(int arg0, int arg1) {
        int var2 = -51 / ((42 - arg1) / 56);
        field108++;
        return (arg0 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)V")
    public static final void method34(int arg0, int arg1, int arg2) {
        field106++;
        long var3 = (long) ((arg0 << 16) + arg2);
        if (arg1 != -129) {
            field110 = null;
        }
        class13 var5 = (class13) class46.field855.method1045(var3, (byte) -77);
        if (var5 != null) {
            class197.field3879.method1240(16, var5);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIZII)V")
    public static final void method35(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class201.field3930; var5++) {
            if (arg3 < class63.field1164[var5] + class107.field1952[var5] && arg1 + arg3 > class63.field1164[var5] && class85.field1570[var5] + class112.field2055[var5] > arg4 && arg0 + arg4 > class85.field1570[var5]) {
                class118.field2201[var5] = true;
            }
        }
        field98++;
        if (!arg2) {
            method36(-111);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public static void method36(int arg0) {
        if (arg0 == -1) {
            field113 = null;
            field112 = null;
            field104 = null;
            field110 = null;
        }
    }
}
