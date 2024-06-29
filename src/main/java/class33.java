import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class33 {

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "J")
    public long field581 = 0L;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "Ldj;")
    public static class44 field572 = class89.method650(255, "underlay)3dat");

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "Ldj;")
    private static class44 field571 = class89.method650(255, "flash1:");

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "Ldj;")
    public static class44 field574 = field571;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "Ldj;")
    public static class44 field575 = class89.method650(255, "labels)3dat");

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "[I")
    public static int[] field584 = new int[25];

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "Ldj;")
    public static class44 field588 = class89.method650(255, "; version=1; path=)4; domain=");

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "Z")
    public static boolean field583 = false;

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "Ldj;")
    public static class44 field587 = field571;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public int field573;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
    public int field577;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
    public int field579;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "I")
    public int field582;

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "I")
    public int field586;

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "Lwd;")
    public class234 field576;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "Lwd;")
    public class234 field578;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLve;Lve;)V")
    public static final void method222(byte arg0, class225 arg1, class225 arg2) {
        if (arg0 == 85) {
            class211.field3773 = arg1;
            field589++;
            class29.field514 = arg2;
            class62.field1162 = class29.field514.method1473(20756, 3);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
    public static void method223(int arg0) {
        field588 = null;
        field571 = null;
        field575 = null;
        field587 = null;
        field574 = null;
        if (arg0 < 45) {
            method225(10, 58, -2, -101);
        }
        field572 = null;
        field584 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLve;Lve;Ljava/awt/Component;)V")
    public static final void method224(byte arg0, class225 arg1, class225 arg2, Component arg3) {
        field590++;
        if (class181.field3135) {
            return;
        }
        class99.method692();
        byte[] var4 = arg1.method1466(class160.field2763, 0, (byte) -123);
        class210.field3757 = new class155(var4, arg3);
        class62.field1166 = class210.field3757.method1007();
        class71.field1351 = class111.method787((byte) 45, class140.field2517, arg2);
        class103.field1878 = class111.method787((byte) 45, class60.field1127, arg2);
        class196.field3468 = class111.method787((byte) 45, class128.field2283, arg2);
        class72.field1377 = class2.method11(arg2, (byte) 100, class123.field2184);
        class53.field956 = class2.method11(arg2, (byte) 123, class221.field4006);
        class181.field3152 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            class181.field3152[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            class181.field3152[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            class181.field3152[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            class181.field3152[var8 + 192] = 16777215;
        }
        class151.field2636 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            class151.field2636[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            class151.field2636[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            class151.field2636[var11 + 128] = var11 * 262144 + 65535;
        }
        if (arg0 < 121) {
            return;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class151.field2636[var12 + 192] = 16777215;
        }
        class152.field2648 = new int[256];
        for (int var13 = 0; var13 < 64; var13++) {
            class152.field2648[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class152.field2648[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            class152.field2648[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class152.field2648[var16 + 192] = 16777215;
        }
        class166.field2849 = new int[32768];
        class57.field1072 = new int[256];
        class84.field1639 = new int[32768];
        class187.method1160((byte) -34, null);
        class136.field2439 = false;
        class182.field3177 = class182.field3174;
        class182.field3167 = class182.field3174;
        if (class87.field1667 == 0) {
            class102.field1871 = true;
        } else {
            class102.field1871 = false;
        }
        class94.field1737 = new int[32768];
        class118.field2103 = 0;
        class70.field1324 = new int[32768];
        if (class102.field1871) {
            class136.method914(2, 117);
        } else {
            class133.method901(class211.field3797, 2, (byte) 121, false, 0, class180.field3114, 255);
        }
        class173.method1102(false, (byte) -90);
        class181.field3135 = true;
        class14.method122(0);
        class207.field3722 = new class155(128, 254);
        class80.field1545 = new class155(128, 254);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIII)Ljf;")
    public static final class104 method225(int arg0, int arg1, int arg2, int arg3) {
        field570++;
        class104 var4 = new class104();
        var4.field1893 = arg2;
        var4.field1892 = arg1;
        class129.field2294.method830(var4, (long) arg0, 1);
        class28.method199(arg2, false);
        class223 var5 = class213.method1379(arg0, -10051);
        if (var5 != null) {
            class225.method1457(87, var5);
        }
        int var6 = 102 % ((-arg3 - 8) / 44);
        if (class10.field215 != null) {
            class225.method1457(113, class10.field215);
            class10.field215 = null;
        }
        class58.field1086 = false;
        class179.field3071 = 0;
        class42.method285(class7.field150, class122.field2176, 0, class10.field212, class121.field2157);
        if (var5 != null) {
            class116.method818((byte) 96, var5);
        }
        class165.method1057(arg2, 10225);
        if (class201.field3575 != -1) {
            class5.method36(class201.field3575, true, 1);
        }
        return var4;
    }
}
