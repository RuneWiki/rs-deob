import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public abstract class class29 {

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "Li;")
    private static class88 field477 = class208.method1425(105, "Account locked as we suspect it has been stolen)3");

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field481 = 1;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field479 = 0;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "Li;")
    public static class88 field480 = field477;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "Li;")
    private static class88 field491 = class208.method1425(105, "yellow:");

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "Z")
    public static boolean field487 = false;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "Li;")
    public static class88 field490 = class208.method1425(105, "gleiten:");

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "Li;")
    public static class88 field488 = field491;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "Li;")
    public static class88 field485 = field491;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "Li;")
    private static class88 field486 = class208.method1425(105, "No response from server)3");

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "Li;")
    public static class88 field478 = field486;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "Li;")
    public static class88 field493 = class208.method1425(105, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "[I")
    public static int[] field482;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "[[[Leg;")
    public static class52[][][] field489;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method173(int arg0, Component arg1);

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static final void method174(int arg0) {
        class146.field2749.method30((byte) -75, 24);
        class71.field1329++;
        class168 var1 = (class168) class128.field2397.method1049(0);
        if (arg0 > -2) {
            field493 = null;
        }
        while (var1 != null) {
            if (var1.field3235 == 0) {
                class93.method673((byte) -128, var1, true);
            }
            var1 = (class168) class128.field2397.method1050((byte) -73);
        }
        if (class53.field967 != null) {
            class200.method1373(65280, class53.field967);
            class53.field967 = null;
        }
        field492++;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)V")
    public static final void method175(int arg0, int arg1, int arg2) {
        field484++;
        class248 var3 = class134.field2499[class149.field2909][arg1][arg2];
        if (var3 == null) {
            class27.method168(class149.field2909, arg1, arg2);
            return;
        }
        int var4 = -99999999;
        class227 var5 = null;
        if (arg0 != 21280) {
            method174(68);
        }
        for (class227 var6 = (class227) var3.method1612(false); var6 != null; var6 = (class227) var3.method1621(82)) {
            class149 var13 = class71.method472(var6.field4260.field2032, (byte) -128);
            int var14 = var13.field2856;
            if (var13.field2854 == 1) {
                var14 = (var6.field4260.field2031 + 1) * var14;
            }
            if (var14 > var4) {
                var5 = var6;
                var4 = var14;
            }
        }
        if (var5 == null) {
            class27.method168(class149.field2909, arg1, arg2);
            return;
        }
        class111 var7 = null;
        var3.method1617(24290, var5);
        class111 var8 = null;
        for (class227 var9 = (class227) var3.method1612(false); var9 != null; var9 = (class227) var3.method1621(82)) {
            class111 var12 = var9.field4260;
            if (var5.field4260.field2032 != var12.field2032) {
                if (var7 == null) {
                    var7 = var12;
                }
                if (var7.field2032 != var12.field2032 && var8 == null) {
                    var8 = var12;
                }
            }
        }
        long var10 = (long) ((arg2 << 7) + arg1 + 1610612736);
        class94.method676(class149.field2909, arg1, arg2, class239.method1586(arg1 * 128 + 64, arg2 * 128 - -64, 2, class149.field2909), var5.field4260, var10, var7, var8);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)I")
    public abstract int method176(byte arg0);

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method177(int arg0, Component arg1);

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
    public static void method178(int arg0) {
        if (arg0 != -16036) {
            field479 = 52;
        }
        field478 = null;
        field477 = null;
        field485 = null;
        field493 = null;
        field491 = null;
        field490 = null;
        field480 = null;
        field486 = null;
        field488 = null;
        field489 = null;
        field482 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)Lvh;")
    public static final class237 method179(int arg0, int arg1) {
        class237 var2 = (class237) class236.field4404.method666((long) arg1, 0);
        field483++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class31.field506.method941((byte) 56, arg1, 1);
        if (arg0 != 24) {
            field487 = false;
        }
        class237 var4 = new class237();
        if (var3 != null) {
            var4.method1574(arg1, new class46(var3), -1);
        }
        class236.field4404.method664((long) arg1, var4, false);
        return var4;
    }
}
