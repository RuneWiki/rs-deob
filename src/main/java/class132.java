import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class132 {

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public int field2592;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public int field2595;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
    public int field2606;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    public int field2599;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "[I")
    public static int[] field2594 = new int[4096];

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "[Lud;")
    public static class235[] field2598 = new class235[27];

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "Lsg;")
    private static class30 field2596 = class167.method1221((byte) 33, "green:");

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "[I")
    public static int[] field2603 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
    public static int field2602 = 0;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "Lsg;")
    public static class30 field2604 = field2596;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "Lsg;")
    public static class30 field2593 = field2596;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "Llk;")
    public static class232 field2600 = new class232(200);

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
    public static int field2607 = 0;

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "[I")
    public static int[] field2609 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "Lmc;")
    public static class151 field2608;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "[[I")
    public static int[][] field2597;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
    public static void method1000(int arg0) {
        field2608 = null;
        field2600 = null;
        field2598 = null;
        if (arg0 != 2) {
            field2605 = -112;
        }
        field2603 = null;
        field2593 = null;
        field2597 = null;
        field2604 = null;
        field2596 = null;
        field2594 = null;
        field2609 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)V")
    public static final void method1001(int arg0, int arg1, int arg2) {
        field2591++;
        class48 var3 = class103.field2078[class159.field2998][arg1][arg2];
        if (arg0 != 5640) {
            method1001(38, -67, -124);
        }
        if (var3 == null) {
            class225.method1611(class159.field2998, arg1, arg2);
            return;
        }
        int var4 = -99999999;
        class97 var5 = (class97) var3.method478(0);
        class97 var6 = null;
        while (var5 != null) {
            class168 var13 = class201.method1425(51, var5.field1972.field49);
            int var14 = var13.field3137;
            if (var13.field3097 == 1) {
                var14 = (var5.field1972.field50 + 1) * var14;
            }
            if (var4 < var14) {
                var4 = var14;
                var6 = var5;
            }
            var5 = (class97) var3.method476((byte) 13);
        }
        if (var6 == null) {
            class225.method1611(class159.field2998, arg1, arg2);
            return;
        }
        var3.method475(var6, true);
        class3 var7 = null;
        class3 var8 = null;
        for (class97 var9 = (class97) var3.method478(0); var9 != null; var9 = (class97) var3.method476((byte) 13)) {
            class3 var12 = var9.field1972;
            if (var6.field1972.field49 != var12.field49) {
                if (var7 == null) {
                    var7 = var12;
                }
                if (var7.field49 != var12.field49 && var8 == null) {
                    var8 = var12;
                }
            }
        }
        long var10 = (long) (arg1 + (arg2 << 7) + 1610612736);
        class227.method1621(class159.field2998, arg1, arg2, class31.method303(arg1 * 128 + 64, arg2 * 128 + 64, class159.field2998, arg0 - 5644), var6.field1972, var10, var7, var8);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/awt/Component;III)Lhc;")
    public static final class144 method1002(Component arg0, int arg1, int arg2, int arg3) {
        field2601++;
        try {
            Class var4 = Class.forName("fj");
            if (arg1 > -104) {
                field2602 = 80;
            }
            class144 var5 = (class144) var4.getDeclaredConstructor().newInstance();
            var5.method33(arg2, arg3, (byte) 118, arg0);
            return var5;
        } catch (Throwable var7) {
            class6 var6 = new class6();
            var6.method33(arg2, arg3, (byte) -116, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
    public class132() {
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lng;)V")
    public class132(class132 arg0) {
        this.field2592 = arg0.field2592;
        this.field2595 = arg0.field2595;
        this.field2606 = arg0.field2606;
        this.field2599 = arg0.field2599;
    }
}
