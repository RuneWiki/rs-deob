import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class267 {

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "Lke;")
    public static class256 field4560 = class316.method2202("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", 27626);

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field4556 = 0;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "Lke;")
    public static class256 field4570 = class316.method2202("hint_mapedge", 27626);

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "Lke;")
    public static class256 field4569 = class316.method2202("Liste des serveurs charg-Be", 27626);

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "Lke;")
    private static class256 field4563 = class316.method2202("yellow:", 27626);

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "Lke;")
    public static class256 field4557 = field4563;

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "Lke;")
    public static class256 field4568 = field4563;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "Lke;")
    private static class256 field4559 = class316.method2202("flash1:", 27626);

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "Lke;")
    public static class256 field4573 = field4559;

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "Lke;")
    public static class256 field4566 = field4559;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "Lng;")
    public static class138 field4564;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIBIII)V", line = 4)
    public static final void method1851(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field4555++;
        int var7 = arg4 - arg1;
        int var8 = arg6 + arg1;
        int var9 = arg5 - arg1;
        int var10 = arg1 + arg2;
        for (int var11 = arg6; var11 < var8; var11++) {
            class73.method550(arg3 - 29987, class308.field5329[var11], arg5, arg2, arg0);
        }
        for (int var12 = arg4; var12 > var7; var12--) {
            class73.method550(-29903, class308.field5329[var12], arg5, arg2, arg0);
        }
        if (arg3 != 84) {
            method1852((byte) 27);
        }
        for (int var13 = var8; var13 <= var7; var13++) {
            int[] var14 = class308.field5329[var13];
            class73.method550(-29903, var14, var10, arg2, arg0);
            class73.method550(-29903, var14, arg5, var9, arg0);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V", line = 48)
    public static final void method1852(byte arg0) {
        field4572++;
        class148.method1082(false, 10);
        if (arg0 < 112) {
            field4559 = (class256) null;
        }
        System.gc();
        class11.method67((byte) 74, 25);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)V", line = 81)
    public static final void method1853(int arg0, int arg1) {
        if (arg1 != 65535) {
            return;
        }
        for (class163 var2 = class36.field643.method1743(true); var2 != null; var2 = class36.field643.method1742((byte) 90)) {
            if (((long) arg0) == (var2.field2895 >> 48 & 0xFFFFL)) {
                var2.method1199(21966);
            }
        }
        field4561++;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IBIIII)V", line = 111)
    public static final void method1854(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field4565++;
        int var6 = class101.method731(class274.field4748, arg5, class105.field1887, true);
        int var7 = class101.method731(class274.field4748, arg3, class105.field1887, true);
        int var8 = class101.method731(class175.field3106, arg2, class244.field4161, true);
        int var9 = class101.method731(class175.field3106, arg4, class244.field4161, true);
        for (int var10 = var6; var10 <= var7; var10++) {
            class73.method550(-29903, class308.field5329[var10], var9, var8, arg0);
        }
        int var11 = -61 % ((arg1 + 41) / 54);
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(II)V", line = 137)
    public static final void method1855(int arg0, int arg1) {
        field4558++;
        class308.field5297 = -1;
        class93.field1682 = arg0;
        class180.field3190 = -1;
        class137.field2391 = null;
        class121.field2129 = arg1;
        class83.field1518 = 1;
        class99.field1771 = false;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V", line = 156)
    public static void method1856(int arg0) {
        field4566 = null;
        field4568 = null;
        field4559 = null;
        field4569 = null;
        field4560 = null;
        if (arg0 > -126) {
            method1854(114, (byte) 119, 119, -61, -5, -42);
        }
        field4570 = null;
        field4564 = null;
        field4573 = null;
        field4557 = null;
        field4563 = null;
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(II)Z", line = 188)
    public static final boolean method1857(int arg0, int arg1) {
        if (arg0 != 0) {
            method1854(7, (byte) 81, -80, -3, -2, -47);
        }
        field4562++;
        return (-arg1 & arg1) == arg1;
    }
}
