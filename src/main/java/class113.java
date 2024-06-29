import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class113 {

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field1843 = 0;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "[[I")
    public static int[][] field1846 = new int[5][5000];

    @OriginalMember(owner = "client!th", name = "f", descriptor = "Loh;")
    public static class281 field1847 = new class281(64);

    @OriginalMember(owner = "client!th", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1851 = "Examine";

    @OriginalMember(owner = "client!th", name = "h", descriptor = "Ljava/util/Random;")
    public static Random field1849 = new Random();

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    public static int field1853 = 7759444;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "[[[B")
    public static byte[][][] field1852;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V")
    public static final void method800(byte arg0) {
        class6.field122.method37((byte) -96);
        if (arg0 >= -30) {
            field1846 = null;
        }
        class253.field4061 = 1;
        field1844++;
        class205.field3198 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
    public static final void method801(int arg0) {
        field1845++;
        if (class33.field497 == -1 || class160.field2477 == -1) {
            return;
        }
        int var1 = class87.field1465 + ((class274.field4375 - class87.field1465) * class77.field1266 >> 16);
        class77.field1266 += var1;
        int var2 = class206.field3212 * 2;
        float[] var3 = new float[3];
        if (class77.field1266 < 65535) {
            class44.field629 = false;
            class136.field2104 = false;
        } else {
            class77.field1266 = 65535;
            if (class136.field2104) {
                class44.field629 = false;
            } else {
                class44.field629 = true;
            }
            class136.field2104 = true;
        }
        float var4 = (float) class77.field1266 / 65535.0F;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class36.field516[class33.field497][var2 + 1][var5] * 3;
            int var22 = (class36.field516[class33.field497][var2 + 2][var5] + class36.field516[class33.field497][var2 + 2][var5] - class36.field516[class33.field497][var2 + 3][var5]) * 3;
            int var23 = class36.field516[class33.field497][var2][var5] * 3;
            int var24 = class36.field516[class33.field497][var2][var5];
            int var25 = var22 + var23 - (var21 * 2);
            int var26 = var21 - var23;
            int var27 = var21 + class36.field516[class33.field497][var2 + 2][var5] - var24 - var22;
            var3[var5] = (((float) var27 * var4 + (float) var25) * var4 + (float) var26) * var4 + (float) var24;
        }
        class170.field2653 = (int) var3[1] * -1;
        class219.field3375 = (int) var3[0] - (class46.field656 * arg0);
        float[] var6 = new float[3];
        int var7 = class241.field3911 * 2;
        class293.field4624 = (int) var3[2] - (class260.field4162 * 128);
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class36.field516[class160.field2477][var7][var8] * 3;
            int var15 = class36.field516[class160.field2477][var7 + 1][var8] * 3;
            int var16 = class36.field516[class160.field2477][var7][var8];
            int var17 = var15 - var14;
            int var18 = (class36.field516[class160.field2477][var7 + 2][var8] - (class36.field516[class160.field2477][var7 + 3][var8] - class36.field516[class160.field2477][var7 + 2][var8])) * 3;
            int var19 = var14 + var18 - (var15 * 2);
            int var20 = class36.field516[class160.field2477][var7 + 2][var8] - (var16 - var15) - var18;
            var6[var8] = (((float) var20 * var4 + (float) var19) * var4 + (float) var17) * var4 + (float) var16;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class88.field1475 = (float) Math.atan2((double) var10, var12);
        class244.field3977 = -((float) Math.atan2((double) var9, (double) var11));
        class62.field1066 = (int) ((double) class88.field1475 * 325.949D) & 0x7FF;
        class83.field1408 = (int) ((double) class244.field3977 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZI)I")
    public static final int method802(boolean arg0, int arg1) {
        field1842++;
        int var2 = -47 % ((34 - arg1) / 40);
        long var3 = class134.method924(false);
        for (class70 var5 = arg0 ? (class70) class183.field2842.method287(-128) : (class70) class183.field2842.method291((byte) -69); var5 != null; var5 = (class70) class183.field2842.method291((byte) -108)) {
            if ((var5.field1120 & 0x3FFFFFFFFFFFFFFFL) < var3) {
                if ((var5.field1120 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field2603;
                    class31.field462[var6] = class240.field3910[var6];
                    var5.method1123(0);
                    return var6;
                }
                var5.method1123(0);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(III)V")
    public static final void method803(int arg0, int arg1, int arg2) {
        field1850++;
        class180 var3 = class222.field3411[class240.field3892][arg1][arg0];
        if (var3 == null) {
            class275.method1848(class240.field3892, arg1, arg0);
            return;
        }
        int var4 = -99999999;
        class258 var5 = null;
        for (class258 var6 = (class258) var3.method1221(125); var6 != null; var6 = (class258) var3.method1227(-10626)) {
            class72 var13 = class85.method602(false, var6.field4119.field1746);
            int var14 = var13.field1212;
            if (var13.field1201 == 1) {
                var14 = (var6.field4119.field1741 + 1) * var14;
            }
            if (var14 > var4) {
                var4 = var14;
                var5 = var6;
            }
        }
        if (var5 == null) {
            class275.method1848(class240.field3892, arg1, arg0);
            return;
        }
        var3.method1222(100, var5);
        class258 var7 = (class258) var3.method1221(120);
        if (arg2 < 102) {
            method804((byte) 66);
        }
        class105 var8 = null;
        class105 var9 = null;
        while (var7 != null) {
            class105 var12 = var7.field4119;
            if (var5.field4119.field1746 != var12.field1746) {
                if (var8 == null) {
                    var8 = var12;
                }
                if (var8.field1746 != var12.field1746 && var9 == null) {
                    var9 = var12;
                }
            }
            var7 = (class258) var3.method1227(-10626);
        }
        long var10 = (long) ((arg0 << 7) + arg1 + 1610612736);
        class128.method888(class240.field3892, arg1, arg0, class34.method269(class240.field3892, arg0 * 128 + 64, arg1 * 128 + 64, 103), var5.field4119, var10, var8, var9);
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(B)V")
    public static void method804(byte arg0) {
        field1847 = null;
        field1849 = null;
        if (arg0 != 124) {
            method804((byte) 73);
        }
        field1852 = null;
        field1851 = null;
        field1846 = null;
    }
}
