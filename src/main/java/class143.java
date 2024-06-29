import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class143 {

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "[Llk;")
    public static class84[] field2093 = new class84[6];

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2091 = "Loading world list data";

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2099 = "Loaded world list data";

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "Lpf;")
    public static class294 field2090;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "Lpf;")
    public static class294 field2092;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "[Lpj;")
    public static class255[] field2101;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "[[[I")
    public static int[][][] field2097;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "[[[I")
    public static int[][][] field2102;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIII)V")
    public static final void method874(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class111.method716(arg1, arg0, arg1 + arg3, arg0 + arg2);
        class111.method702(arg1, arg0, arg3, arg2, 0);
        field2095++;
        if (class188.field2889 < 100) {
            return;
        }
        if (class132.field1936 == null || class132.field1936.field3473 != arg3 || class132.field1936.field3464 != arg2) {
            class201 var5 = new class201(arg3, arg2);
            class111.method708(var5.field3047, arg3, arg2);
            class113.method729(0, class106.field1616, 0, 0, 245221232, 0, class99.field1564, arg3, arg2);
            class132.field1936 = var5;
            class273.field4109.method1077(-72);
        }
        class132.field1936.method1264(arg1, arg0);
        int var6 = class270.field4061 * arg2 / class99.field1564 + arg0;
        int var7 = class134.field1956 * arg3 / class106.field1616 + arg1;
        int var8 = class265.field3997 * arg2 / class99.field1564;
        int var9 = class25.field305 * arg3 / class106.field1616;
        int var10 = 16711680;
        if (class166.field2554 == 1) {
            var10 = 16777215;
        }
        class111.method715(var7, var6, var9, var8, var10, 128);
        int var11 = -83 % ((-arg4 - 7) / 54);
        class111.method701(var7, var6, var9, var8, var10);
        if (field2096 <= 0) {
            return;
        }
        int var12;
        if (class123.field1859 > 10) {
            var12 = 500 - class123.field1859 * 25;
        } else {
            var12 = class123.field1859 * 25;
        }
        for (class18 var13 = (class18) class226.field3394.method983(7); var13 != null; var13 = (class18) class226.field3394.method985((byte) 97)) {
            if (class129.field1927 == var13.field218) {
                int var14 = var13.field225 * arg3 / class106.field1616 + arg1;
                int var15 = var13.field214 * arg2 / class99.field1564 + arg0;
                class111.method715(var14 - 2, var15 - 2, 4, 4, 16776960, var12);
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V")
    public static void method875(boolean arg0) {
        field2093 = null;
        field2097 = null;
        field2092 = null;
        field2099 = null;
        field2091 = null;
        field2101 = null;
        if (arg0) {
            method874(-61, -112, -122, 36, -70);
        }
        field2090 = null;
        field2102 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IBII)I")
    public static final int method876(int arg0, byte arg1, int arg2, int arg3) {
        field2094++;
        if (arg2 > 243) {
            arg0 >>= 0x4;
        } else if (arg2 > 217) {
            arg0 >>= 0x3;
        } else if (arg2 > 192) {
            arg0 >>= 0x2;
        } else if (arg2 > 179) {
            arg0 >>= 0x1;
        }
        if (arg1 != -119) {
            method877(-37, -81);
        }
        return (arg3 >> 2 << 10) + (arg0 >> 5 << 7) + (arg2 >> 1);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)I")
    public static final int method877(int arg0, int arg1) {
        field2098++;
        int var2 = (arg1 >>> 1 & 0x55555555) + (arg1 & 0x55555555);
        int var3 = ((var2 & 0xCCCCCCCF) >>> 2) + (var2 & 0x33333333);
        if (arg0 != -26835) {
            field2090 = null;
        }
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }
}
