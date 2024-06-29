import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class138 {

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "[I")
    public static int[] field3078 = new int[25];

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "Lic;")
    public static class59 field3076 = class59.method433(0, "Sichtbare Karte vorbereitet)3");

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "[I")
    public static int[] field3084 = new int[500];

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    public static int field3086 = 0;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "Lic;")
    public static class59 field3077 = class59.method433(0, "p11_full");

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public int field3073;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public int field3075;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public int field3079;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
    public int field3082;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    public int field3085;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
    public int field3087;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "I")
    public int field3088;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "Lt;")
    public static class132 field3083;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "[B")
    public byte[] field3074;

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "[B")
    public byte[] field3089;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ldd;BLdd;Ljava/awt/Component;)V")
    public static final void method1050(class26 arg0, byte arg1, class26 arg2, Component arg3) {
        field3080++;
        if (class83.field2067) {
            return;
        }
        class129.method982();
        byte[] var4 = arg2.method203(class131.field2951, -102, class90.field2294);
        class147.field3200 = new class132(var4, arg3);
        class131.field2941 = class147.field3200.method1017();
        class84.field2121 = class95.method785(arg1 ^ 0xFFFFFFEE, class17.field338, arg0, class90.field2294);
        class64.field1634 = class95.method785(arg1 + 210, class38.field982, arg0, class90.field2294);
        class82.field2050 = class95.method785(112, class158.field3518, arg0, class90.field2294);
        class136.field3027 = class79.method645(class90.field2294, (byte) 124, arg0, class81.field2020);
        class53.field1319 = class79.method645(class90.field2294, (byte) 76, arg0, class30.field772);
        class26.field665 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            class26.field665[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            class26.field665[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            class26.field665[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            class26.field665[var8 + 192] = 16777215;
        }
        class130.field2916 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            class130.field2916[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            class130.field2916[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            class130.field2916[var11 + 128] = var11 * 262144 + 65535;
        }
        int var12 = 0;
        if (arg1 != -98) {
            method1051((byte) -95);
        }
        while (var12 < 64) {
            class130.field2916[var12 + 192] = 16777215;
            var12++;
        }
        class30.field770 = new int[256];
        for (int var13 = 0; var13 < 64; var13++) {
            class30.field770[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class30.field770[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            class30.field770[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class30.field770[var16 + 192] = 16777215;
        }
        class75.field1858 = new int[32768];
        class89.field2254 = new int[32768];
        class155.field3370 = new int[256];
        class75.method625(null, (byte) 0);
        class16.field305 = 0;
        class118.field2745 = new int[32768];
        class90.field2290 = class90.field2294;
        if (class49.field1242 == 0) {
            class90.field2289 = true;
        } else {
            class90.field2289 = false;
        }
        class90.field2295 = class90.field2294;
        class100.field2464 = new int[32768];
        class136.field3021 = false;
        if (class90.field2289) {
            class56.method415(2, 1);
        } else {
            class1.method7(-51, false, class73.field1832, class90.field2274, class90.field2294, 255, 2);
        }
        class49.method382(false, (byte) -115);
        class83.field2067 = true;
        class147.field3200.method1020(0, 0);
        class131.field2941.method1020(382, 0);
        class84.field2121.method111(382 - class84.field2121.field440 / 2, 18);
        class88.field2223 = new class132(128, 254);
        field3083 = new class132(128, 254);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
    public static void method1051(byte arg0) {
        int var1 = 23 % ((81 - arg0) / 44);
        field3077 = null;
        field3083 = null;
        field3078 = null;
        field3076 = null;
        field3084 = null;
    }
}
