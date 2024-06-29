import java.awt.Component;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public abstract class class19 {

    @OriginalMember(owner = "client!d", name = "d", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field553 = new CRC32();

    @OriginalMember(owner = "client!d", name = "g", descriptor = "I")
    public static int field556 = 0;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "[I")
    public static int[] field557 = new int[99];

    @OriginalMember(owner = "client!d", name = "j", descriptor = "[J")
    public static long[] field559 = new long[100];

    @OriginalMember(owner = "client!d", name = "l", descriptor = "Lwb;")
    private static class130 field561 = class26.method212("Enter name of friend to add to list", -32376);

    @OriginalMember(owner = "client!d", name = "k", descriptor = "Lwb;")
    public static class130 field560 = field561;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "[Z")
    public static boolean[] field563;

    @OriginalMember(owner = "client!d", name = "o", descriptor = "Lwb;")
    public static class130 field564;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!d", name = "s", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!d", name = "v", descriptor = "Lwb;")
    private static class130 field571;

    @OriginalMember(owner = "client!d", name = "u", descriptor = "[I")
    public static int[] field570;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "Lwb;")
    public static class130 field565;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!d", name = "x", descriptor = "Lwb;")
    private static class130 field573;

    @OriginalMember(owner = "client!d", name = "w", descriptor = "Lwb;")
    public static class130 field572;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "Lgb;")
    public static class39 field558;

    @OriginalMember(owner = "client!d", name = "t", descriptor = "Lmc;")
    public static class75 field569;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field557[var1] = var0 / 4;
        }
        field563 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, false, false };
        field564 = class26.method212(")3000", -32376);
        field566 = 50;
        field568 = 0;
        field571 = class26.method212("Invalid username or password)3", -32376);
        field570 = new int[25];
        field565 = field571;
        field567 = 0;
        field573 = class26.method212("Loading wordpack )2 ", -32376);
        field572 = field573;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IILjava/awt/Component;I)Lda;", line = 8)
    public static final class20 method173(int arg0, int arg1, Component arg2, int arg3) {
        field551++;
        try {
            Class var4 = Class.forName("ld");
            class20 var5 = (class20) var4.getDeclaredConstructor().newInstance();
            var5.method188(arg3, arg2, 122, arg0);
            return arg1 == 4 ? var5 : null;
        } catch (Throwable var7) {
            class72 var6 = new class72();
            var6.method188(arg3, arg2, arg1 + 103, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lk;ILk;Ljava/awt/Component;)V", line = 31)
    public static final void method174(class60 arg0, int arg1, class60 arg2, Component arg3) {
        field550++;
        if (class132.field3194) {
            return;
        }
        class67.field1740 = method173(265, 4, arg3, 128);
        class49.method433();
        class56.field1439 = method173(265, arg1 ^ 0x7931, arg3, 128);
        class49.method433();
        class130.field3068 = method173(171, 4, arg3, 509);
        class49.method433();
        class51.field1354 = method173(132, 4, arg3, 360);
        class49.method433();
        class112.field2749 = method173(200, 4, arg3, 360);
        class49.method433();
        class108.field2616 = method173(238, 4, arg3, 202);
        class49.method433();
        class101.field2447 = method173(238, arg1 - 31025, arg3, 203);
        class49.method433();
        class109.field2624 = method173(94, 4, arg3, 74);
        class49.method433();
        class43.field1190 = method173(94, 4, arg3, 75);
        class49.method433();
        byte[] var4 = arg2.method496(class119.field2913, class124.field3010, 16421);
        class28 var5 = new class28(var4, arg3);
        class67.field1740.method181(14664);
        var5.method235(0, 0);
        class56.field1439.method181(14664);
        var5.method235(-637, 0);
        class130.field3068.method181(14664);
        var5.method235(-128, 0);
        class51.field1354.method181(14664);
        var5.method235(-202, -371);
        class112.field2749.method181(14664);
        var5.method235(-202, -171);
        class108.field2616.method181(14664);
        var5.method235(0, -265);
        class101.field2447.method181(arg1 - 16365);
        var5.method235(-562, -265);
        if (arg1 != 31029) {
            return;
        }
        class109.field2624.method181(14664);
        var5.method235(-128, -171);
        class43.field1190.method181(arg1 - 16365);
        var5.method235(-562, -171);
        int[] var6 = new int[var5.field797];
        for (int var7 = 0; var7 < var5.field791; var7++) {
            for (int var23 = 0; var23 < var5.field797; var23++) {
                var6[var23] = var5.field796[var5.field797 + var5.field797 * var7 - var23 - 1];
            }
            for (int var24 = 0; var24 < var5.field797; var24++) {
                var5.field796[var5.field797 * var7 + var24] = var6[var24];
            }
        }
        class67.field1740.method181(arg1 - 16365);
        var5.method235(382, 0);
        class56.field1439.method181(14664);
        var5.method235(-255, 0);
        class130.field3068.method181(14664);
        var5.method235(254, 0);
        class51.field1354.method181(14664);
        var5.method235(180, -371);
        class112.field2749.method181(14664);
        var5.method235(180, -171);
        class108.field2616.method181(14664);
        var5.method235(382, -265);
        class101.field2447.method181(14664);
        var5.method235(-180, -265);
        class109.field2624.method181(14664);
        var5.method235(254, -171);
        class43.field1190.method181(14664);
        var5.method235(-180, -171);
        class28 var8 = class42.method408(arg0, class124.field3010, class48.field1284, (byte) -108);
        class130.field3068.method181(arg1 ^ 0x407D);
        var8.method233(382 - var8.field797 / 2 - 128, 18);
        class26.field767 = class24.method206(class124.field3010, class111.field2743, 258, arg0);
        class1.field17 = class24.method206(class124.field3010, class84.field2007, arg1 - 30771, arg0);
        class32.field888 = class106.method803(class85.field2022, -17910, class124.field3010, arg0);
        class43.field1194 = new class28(128, 265);
        class111.field2742 = new class28(128, 265);
        for (int var9 = 0; var9 < 33920; var9++) {
            class43.field1194.field796[var9] = class67.field1740.field593[var9];
        }
        for (int var10 = 0; var10 < 33920; var10++) {
            class111.field2742.field796[var10] = class56.field1439.field593[var10];
        }
        class117.field2890 = new int[256];
        for (int var11 = 0; var11 < 64; var11++) {
            class117.field2890[var11] = var11 * 262144;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class117.field2890[var12 + 64] = var12 * 1024 + 16711680;
        }
        for (int var13 = 0; var13 < 64; var13++) {
            class117.field2890[var13 + 128] = var13 * 4 + 16776960;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class117.field2890[var14 + 192] = 16777215;
        }
        class83.field1959 = new int[256];
        for (int var15 = 0; var15 < 64; var15++) {
            class83.field1959[var15] = var15 * 1024;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class83.field1959[var16 + 64] = var16 * 4 + 65280;
        }
        for (int var17 = 0; var17 < 64; var17++) {
            class83.field1959[var17 + 128] = var17 * 262144 + 65535;
        }
        for (int var18 = 0; var18 < 64; var18++) {
            class83.field1959[var18 + 192] = 16777215;
        }
        class106.field2567 = new int[256];
        for (int var19 = 0; var19 < 64; var19++) {
            class106.field2567[var19] = var19 * 4;
        }
        for (int var20 = 0; var20 < 64; var20++) {
            class106.field2567[var20 + 64] = var20 * 262144 + 255;
        }
        for (int var21 = 0; var21 < 64; var21++) {
            class106.field2567[var21 + 128] = var21 * 1024 + 16711935;
        }
        for (int var22 = 0; var22 < 64; var22++) {
            class106.field2567[var22 + 192] = 16777215;
        }
        class109.field2649 = new int[32768];
        class92.field2206 = new int[32768];
        class47.field1260 = new int[256];
        class112.method860(null, (byte) 107);
        class119.field2922 = 0;
        class124.field3002 = class124.field3010;
        class124.field3012 = class124.field3010;
        class42.field1184 = new int[32768];
        class98.field2376 = new int[32768];
        if (class113.field2804 == 0 || class4.field189) {
            class65.method531(10, (byte) -123);
        } else {
            class65.method535(0, class124.field3010, false, -1, class113.field2804, 10, class29.field802, class106.field2564);
        }
        class99.method736(-112, false);
        class43.field1191 = true;
        class132.field3194 = true;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)V", line = 254)
    public static final void method175(int arg0, int arg1) {
        field554++;
        for (class59.field1480 += arg0; class59.field1480 >= class48.field1298; class59.field1480 -= class48.field1298) {
            class109.field2650 -= class109.field2650 >> 2;
        }
        if (arg1 != 0) {
            method180(-22);
        }
        class109.field2650 -= arg0 * 1000;
        if (class109.field2650 < 0) {
            class109.field2650 = 0;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)V", line = 289)
    public static final void method178(boolean arg0) {
        if (!arg0) {
            method180(114);
        }
        field555++;
        if (class130.field3065 == 2) {
            class21.method192((class63.field1611 - class129.field3045 << 7) + class121.field2962, (-class42.field1172 + class92.field2216 << 7) + class61.field1578, -1, class60.field1553 * 2);
            if (class115.field2826 > -1 && class130.field3128 % 20 < 10) {
                class120.field2938[0].method233(class115.field2826 - 12, client.field523 - 28);
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V", line = 321)
    public static void method180(int arg0) {
        field570 = null;
        field565 = null;
        field561 = null;
        field569 = null;
        field553 = null;
        field563 = null;
        field571 = null;
        field573 = null;
        field558 = null;
        field560 = null;
        field557 = null;
        field572 = null;
        field559 = null;
        if (arg0 != -371) {
            method175(95, -94);
        }
        field564 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
    public abstract void method170(byte arg0);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III)V")
    public abstract void method171(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public abstract void method172(int arg0);

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
    public abstract void method176(int arg0);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "([BZIZ)V")
    public abstract void method177(byte[] arg0, boolean arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BI)V")
    public abstract void method179(byte arg0, int arg1);
}
