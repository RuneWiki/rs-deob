import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class133 {

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "[J")
    public static long[] field3250 = new long[32];

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field3245 = 0;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public int field3247;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public int field3248;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public int field3254;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
    public int field3257;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V", line = 16)
    public static final void method1050(int arg0) {
        field3252++;
        if (class97.field2478 < 2 && class126.field3178 == 0 && class31.field882 == 0) {
            return;
        }
        class94 var1;
        if (class126.field3178 == 1 && class97.field2478 < 2) {
            var1 = class4.method20(new class94[] { class99.field2492, class73.field1783, class113.field2848, class102.field2568 }, true);
        } else if (class31.field882 == 1 && class97.field2478 < 2) {
            var1 = class4.method20(new class94[] { class19.field526, class73.field1783, class66.field1632, class102.field2568 }, true);
        } else {
            var1 = class39.field1008[class97.field2478 - 1];
        }
        if (class97.field2478 > 2) {
            var1 = class4.method20(new class94[] { var1, class74.field1815, class51.method403(class97.field2478 - 2, true), class101.field2547 }, true);
        }
        if (arg0 != 2088) {
            method1050(108);
        }
        class115.field2913.method104(var1, 4, 15, 16777215, true, class26.field699 / 1000);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILbb;)V", line = 46)
    public static final void method1051(int arg0, int arg1, class8 arg2) {
        class63.method474((byte) 121, arg2.field177, arg2.field222, arg1);
        field3255++;
        if (arg0 != 0) {
            method1053(-123);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lec;ZIIII)V", line = 61)
    public static final void method1052(class27 arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field3246++;
        class29 var6 = new class29();
        int var7 = arg0.field771;
        var6.field825 = arg0.field754;
        var6.field816 = arg5 * 128;
        var6.field824 = arg3;
        var6.field841 = arg0.field758 * 128;
        var6.field820 = arg0.field720;
        var6.field831 = arg0.field717;
        var6.field817 = arg0.field769;
        var6.field828 = arg4 * 128;
        if (!arg1) {
            return;
        }
        int var8 = arg0.field715;
        if (arg2 == 1 || arg2 == 3) {
            var7 = arg0.field715;
            var8 = arg0.field771;
        }
        var6.field830 = (arg4 + var8) * 128;
        var6.field819 = (arg5 + var7) * 128;
        if (arg0.field764 != null) {
            var6.field822 = arg0;
            var6.method255(true);
        }
        class21.field573.method894(12800, var6);
        if (var6.field820 != null) {
            var6.field823 = var6.field825 + (int) ((double) (var6.field831 - var6.field825) * Math.random());
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V", line = 112)
    public static void method1053(int arg0) {
        if (arg0 == 12488) {
            field3250 = null;
        }
    }
}
