import java.awt.Canvas;
import java.awt.Graphics;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class151 {

    @OriginalMember(owner = "client!o", name = "a", descriptor = "[I")
    public static int[] field2622 = new int[128];

    @OriginalMember(owner = "client!o", name = "l", descriptor = "Ldj;")
    private static class44 field2633 = class89.method650(255, "You are standing in a members)2only area)3");

    @OriginalMember(owner = "client!o", name = "p", descriptor = "Ldj;")
    public static class44 field2637 = field2633;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "Ldj;")
    public static class44 field2631 = class89.method650(255, "Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public int field2628;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "J")
    public static long field2627;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "Lfa;")
    public class57 field2635;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "[I")
    public int[] field2623;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "[I")
    public static int[] field2636;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IB)I")
    public static final int method975(int arg0, byte arg1) {
        field2630++;
        int var2 = -127 % ((arg1 + 56) / 40);
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZBLdj;)V")
    public static final void method976(boolean arg0, byte arg1, class44 arg2) {
        if (arg1 < 105) {
            method978((byte) -32);
        }
        byte var3 = 4;
        field2626++;
        int var4 = var3 + 6;
        int var5 = class74.field1424.method416(arg2, 250);
        int var6 = var3 + 6;
        int var7 = class74.field1424.method410(arg2, 250) * 13;
        class99.method688(var6 - var3, var4 - var3, var3 + var5 + var3, var3 + var7 + var3, 0);
        class99.method696(var6 - var3, var4 - var3, var3 + var5 + var3, var3 + var7 + var3, 16777215);
        class74.field1424.method403(arg2, var6, var4, var5, var7, 16777215, -1, 1, 1, 0);
        class42.method285(var3 + var3 + var7, -var3 + var4, 0, var6 - var3, var3 + var5 + var3);
        if (!arg0) {
            class122.method838(var5, (byte) -35, var7, var4, var6);
            return;
        }
        Canvas var8 = class8.field172;
        try {
            Graphics var9 = var8.getGraphics();
            class28.field493.method97(var9, 0, (byte) 119, 0);
        } catch (Exception var10) {
            var8.repaint();
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)V")
    public static void method977(boolean arg0) {
        field2637 = null;
        field2633 = null;
        field2631 = null;
        field2636 = null;
        field2622 = null;
        if (arg0) {
            field2634 = -108;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
    public static final void method978(byte arg0) {
        field2632++;
        if (arg0 != -15) {
            method977(true);
        }
        if (!class202.field3614) {
            return;
        }
        class223 var1 = class96.method678(true, class33.field585, class41.field773);
        if (var1 != null && var1.field4097 != null) {
            class140 var2 = new class140();
            var2.field2507 = var1;
            var2.field2506 = var1.field4097;
            class150.method972(var2, (byte) -127);
        }
        class202.field3614 = false;
        class225.method1457(104, var1);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IILjava/util/Random;)I")
    public static final int method979(int arg0, int arg1, Random arg2) {
        field2629++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        }
        if (arg0 != -1) {
            field2631 = null;
        }
        if (class197.method1279(arg0 - 65, arg1)) {
            return (int) ((long) arg1 * ((long) arg2.nextInt() & 0xFFFFFFFFL) >> 32);
        }
        int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
        int var4;
        do {
            var4 = arg2.nextInt();
        } while (var4 >= var3);
        return class208.method1356(var4, (byte) -77, arg1);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public static final void method980(int arg0) {
        field2624++;
        class39.field744.method1179((byte) -94);
        if (arg0 != 23517) {
            field2633 = null;
        }
        class163.field2818.method676(0);
        class123.field2181.method1179((byte) -64);
    }
}
