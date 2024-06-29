import java.awt.Component;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class4 extends class127 {

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "I")
    public int field88;

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "I")
    private int field98;

    @OriginalMember(owner = "client!ac", name = "H", descriptor = "[[I")
    public int[][] field97;

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "[I")
    public int[] field91;

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "I")
    public static int field94 = 0;

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "Lfc;")
    public static class34 field99 = new class34(260);

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "Lhb;")
    public static class44 field101 = class102.method810("Bitte versuchen Sie)1", -28606);

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "Lhb;")
    public static class44 field100 = class102.method810("Side panel redrawn", -28606);

    @OriginalMember(owner = "client!ac", name = "S", descriptor = "Lhb;")
    private static class44 field108 = class102.method810("Enter your username (V password)3", -28606);

    @OriginalMember(owner = "client!ac", name = "Q", descriptor = "Lhb;")
    public static class44 field106 = field108;

    @OriginalMember(owner = "client!ac", name = "V", descriptor = "I")
    public static volatile int field111 = -1;

    @OriginalMember(owner = "client!ac", name = "U", descriptor = "I")
    public static int field110 = 0;

    @OriginalMember(owner = "client!ac", name = "X", descriptor = "Lhb;")
    private static class44 field113 = class102.method810("Off", -28606);

    @OriginalMember(owner = "client!ac", name = "T", descriptor = "Lhb;")
    public static class44 field109 = field113;

    @OriginalMember(owner = "client!ac", name = "W", descriptor = "Lhb;")
    private static class44 field112 = class102.method810("World", -28606);

    @OriginalMember(owner = "client!ac", name = "O", descriptor = "Lhb;")
    public static class44 field104 = field112;

    @OriginalMember(owner = "client!ac", name = "Y", descriptor = "Lhb;")
    private static class44 field114 = class102.method810("Loading textures )2 ", -28606);

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "Lhb;")
    public static class44 field102 = field114;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!ac", name = "R", descriptor = "Lhc;")
    public static class45 field107;

    @OriginalMember(owner = "client!ac", name = "N", descriptor = "Ljava/awt/Image;")
    public static Image field103;

    @OriginalMember(owner = "client!ac", name = "P", descriptor = "[I")
    public static int[] field105;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V", line = 15)
    public static void method32(int arg0) {
        field107 = null;
        field100 = null;
        field101 = null;
        field112 = null;
        field114 = null;
        field104 = null;
        if (arg0 >= -38) {
            method35(-101, 89);
        }
        field108 = null;
        field113 = null;
        field102 = null;
        field103 = null;
        field106 = null;
        field99 = null;
        field109 = null;
        field105 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)Lhb;", line = 39)
    public static final class44 method33(int arg0, int arg1) {
        if (arg0 != 265) {
            field108 = null;
        }
        field92++;
        return class117.method903(new class44[] { class116.method893(arg0 - 255, arg1 >> 24 & 0xFF), class5.field115, class116.method893(10, arg1 >> 16 & 0xFF), class5.field115, class116.method893(10, arg1 >> 8 & 0xFF), class5.field115, class116.method893(10, arg1 & 0xFF) }, false);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ltd;Ltd;ILjava/awt/Component;)V", line = 50)
    public static final void method34(class116 arg0, class116 arg1, int arg2, Component arg3) {
        field95++;
        if (class118.field2914) {
            return;
        }
        class11.field204 = class11.method80((byte) 73, arg3, 128, 265);
        class112.method854();
        class47.field1158 = class11.method80((byte) -47, arg3, 128, 265);
        class112.method854();
        class131.field3130 = class11.method80((byte) -120, arg3, 509, 171);
        class112.method854();
        class85.field2172 = class11.method80((byte) -81, arg3, 360, 132);
        class112.method854();
        class71.field1748 = class11.method80((byte) 87, arg3, 360, 200);
        class112.method854();
        class41.field932 = class11.method80((byte) -128, arg3, 202, 238);
        class112.method854();
        class44.field1125 = class11.method80((byte) -111, arg3, 203, 238);
        class112.method854();
        class47.field1173 = class11.method80((byte) 114, arg3, 74, 94);
        class112.method854();
        class53.field1322 = class11.method80((byte) -62, arg3, 75, 94);
        class112.method854();
        byte[] var4 = arg1.method876(29, class89.field2286, class95.field2414);
        class45 var5 = new class45(var4, arg3);
        class11.field204.method747(17);
        var5.method420(0, 0);
        class47.field1158.method747(17);
        var5.method420(-637, 0);
        class131.field3130.method747(17);
        var5.method420(-128, 0);
        class85.field2172.method747(17);
        var5.method420(-202, -371);
        class71.field1748.method747(17);
        var5.method420(-202, -171);
        if (arg2 >= -116) {
            method37(24);
        }
        class41.field932.method747(17);
        var5.method420(0, -265);
        class44.field1125.method747(17);
        var5.method420(-562, -265);
        class47.field1173.method747(17);
        var5.method420(-128, -171);
        class53.field1322.method747(17);
        var5.method420(-562, -171);
        int[] var6 = new int[var5.field1128];
        for (int var7 = 0; var7 < var5.field1127; var7++) {
            for (int var23 = 0; var23 < var5.field1128; var23++) {
                var6[var23] = var5.field1131[var5.field1128 * var7 + var5.field1128 - var23 - 1];
            }
            for (int var24 = 0; var24 < var5.field1128; var24++) {
                var5.field1131[var24 + var5.field1128 * var7] = var6[var24];
            }
        }
        class11.field204.method747(17);
        var5.method420(382, 0);
        class47.field1158.method747(17);
        var5.method420(-255, 0);
        class131.field3130.method747(17);
        var5.method420(254, 0);
        class85.field2172.method747(17);
        var5.method420(180, -371);
        class71.field1748.method747(17);
        var5.method420(180, -171);
        class41.field932.method747(17);
        var5.method420(382, -265);
        class44.field1125.method747(17);
        var5.method420(-180, -265);
        class47.field1173.method747(17);
        var5.method420(254, -171);
        class53.field1322.method747(17);
        var5.method420(-180, -171);
        class45 var8 = class31.method314(class116.field2847, arg0, class89.field2286, false);
        class131.field3130.method747(17);
        var8.method428(382 - var8.field1128 / 2 - 128, 18);
        class16.field308 = class117.method899(class66.field1651, arg0, 125, class89.field2286);
        class84.field2143 = class117.method899(class15.field292, arg0, 126, class89.field2286);
        class102.field2601 = class100.method789(class125.field3019, (byte) 2, arg0, class89.field2286);
        class77.field1924 = new class45(128, 265);
        class34.field824 = new class45(128, 265);
        for (int var9 = 0; var9 < 33920; var9++) {
            class77.field1924.field1131[var9] = class11.field204.field2353[var9];
        }
        for (int var10 = 0; var10 < 33920; var10++) {
            class34.field824.field1131[var10] = class47.field1158.field2353[var10];
        }
        class43.field996 = new int[256];
        for (int var11 = 0; var11 < 64; var11++) {
            class43.field996[var11] = var11 * 262144;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class43.field996[var12 + 64] = var12 * 1024 + 16711680;
        }
        for (int var13 = 0; var13 < 64; var13++) {
            class43.field996[var13 + 128] = var13 * 4 + 16776960;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class43.field996[var14 + 192] = 16777215;
        }
        class64.field1619 = new int[256];
        for (int var15 = 0; var15 < 64; var15++) {
            class64.field1619[var15] = var15 * 1024;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class64.field1619[var16 + 64] = var16 * 4 + 65280;
        }
        for (int var17 = 0; var17 < 64; var17++) {
            class64.field1619[var17 + 128] = var17 * 262144 + 65535;
        }
        for (int var18 = 0; var18 < 64; var18++) {
            class64.field1619[var18 + 192] = 16777215;
        }
        class81.field2069 = new int[256];
        for (int var19 = 0; var19 < 64; var19++) {
            class81.field2069[var19] = var19 * 4;
        }
        for (int var20 = 0; var20 < 64; var20++) {
            class81.field2069[var20 + 64] = var20 * 262144 + 255;
        }
        for (int var21 = 0; var21 < 64; var21++) {
            class81.field2069[var21 + 128] = var21 * 1024 + 16711935;
        }
        for (int var22 = 0; var22 < 64; var22++) {
            class81.field2069[var22 + 192] = 16777215;
        }
        class118.field2904 = new int[256];
        class39.field875 = new int[32768];
        class69.field1707 = new int[32768];
        class42.method357(null, (byte) 84);
        class9.field185 = new int[32768];
        class89.field2285 = class89.field2286;
        class98.field2503 = new int[32768];
        class75.field1915 = 0;
        class89.field2282 = class89.field2286;
        if (class82.field2119 == 0 || class81.field2085) {
            class1.method6(0, 10);
        } else {
            class1.method2(class82.field2119, false, 0, 10, true, class104.field2664, class94.field2398, class89.field2286);
        }
        class48.method455(false, false);
        class118.field2914 = true;
        class104.field2665 = true;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)V", line = 281)
    public static final void method35(int arg0, int arg1) {
        field96++;
        if (arg1 != 64) {
            method36(-68, (byte) -2, null, -3);
        }
        if (!class127.method950(-29360)) {
            return;
        }
        if (class117.field2859) {
            class92.field2340 = arg0;
        } else {
            class86.method698((byte) 127, arg0);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBLtd;I)Lne;", line = 312)
    public static final class83 method36(int arg0, byte arg1, class116 arg2, int arg3) {
        field89++;
        if (arg1 != -83) {
            method33(22, 111);
        }
        return class74.method629(-12890, arg0, arg2, arg3) ? class130.method968(arg1 ^ 0xFFFFDC77) : null;
    }

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "(I)V", line = 327)
    public static final void method37(int arg0) {
        client.field368.method335((byte) -127);
        field90++;
        class31.field765.method335((byte) -125);
        if (arg0 != 0) {
            method37(-49);
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(I[B)V", line = 339)
    public class4(int arg0, byte[] arg1) {
        this.field88 = arg0;
        class131 var3 = new class131(arg1);
        this.field98 = var3.method971(true);
        this.field97 = new int[this.field98][];
        this.field91 = new int[this.field98];
        for (int var4 = 0; var4 < this.field98; var4++) {
            this.field91[var4] = var3.method971(true);
        }
        for (int var5 = 0; var5 < this.field98; var5++) {
            this.field97[var5] = new int[var3.method971(true)];
        }
        for (int var6 = 0; var6 < this.field98; var6++) {
            for (int var7 = 0; var7 < this.field97[var6].length; var7++) {
                this.field97[var6][var7] = var3.method971(true);
            }
        }
    }
}
