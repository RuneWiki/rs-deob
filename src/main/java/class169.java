import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class169 extends class161 {

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "Lhh;")
    private static class163 field3087 = class137.method1065("http:)4)4advert)3runescape)3com)4banner)3ws?size=729", 17);

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "Lhh;")
    public static class163 field3091 = field3087;

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "Lqc;")
    public static class258 field3093 = new class258(16);

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "Lhh;")
    public static class163 field3095 = class137.method1065(": ", 17);

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "Loj;")
    public static class17 field3096 = new class17(260);

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "Lhh;")
    public static class163 field3097 = class137.method1065("sl_stars", 17);

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "Ljava/lang/Object;")
    public static Object field3098 = new Object();

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "Lpc;")
    public static class166 field3090;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIILhh;I)V")
    public static final void method1260(int arg0, int arg1, int arg2, class163 arg3, int arg4) {
        field3088++;
        class69 var5 = class137.method1062(arg0, 1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field1212 != null) {
            class225 var6 = new class225();
            var6.field4076 = var5;
            var6.field4082 = arg3;
            var6.field4071 = arg1;
            var6.field4079 = var5.field1212;
            class192.method1406(var6, (byte) 118);
        }
        boolean var7 = true;
        if (var5.field1217 > 0) {
            var7 = class237.method1643(var5, 0);
        }
        if (!var7 || !class197.method1420(client.method826(var5), arg1 - 1, (byte) -94)) {
            return;
        }
        if (arg1 == 1) {
            class149.field2803++;
            class191.field3499.method75(199, 69);
            class191.field3499.method604(arg2, 1543219568);
            class191.field3499.method631(arg0, arg4 - 11902);
        }
        if (arg1 == 2) {
            class94.field1777++;
            class191.field3499.method75(29, 94);
            class191.field3499.method604(arg2, arg4 + 1543207667);
            class191.field3499.method631(arg0, -1);
        }
        if (arg1 == 3) {
            class191.field3499.method75(44, 77);
            class153.field2865++;
            class191.field3499.method604(arg2, arg4 + 1543207667);
            class191.field3499.method631(arg0, -1);
        }
        if (arg1 == 4) {
            class191.field3499.method75(159, 67);
            class90.field1655++;
            class191.field3499.method604(arg2, 1543219568);
            class191.field3499.method631(arg0, -1);
        }
        if (arg1 == 5) {
            class73.field1361++;
            class191.field3499.method75(108, arg4 ^ 0x2E54);
            class191.field3499.method604(arg2, 1543219568);
            class191.field3499.method631(arg0, -1);
        }
        if (arg1 == 6) {
            class157.field2892++;
            class191.field3499.method75(212, arg4 ^ 0x2E2A);
            class191.field3499.method604(arg2, arg4 ^ 0x5BFB870D);
            class191.field3499.method631(arg0, -1);
        }
        if (arg1 == 7) {
            class52.field868++;
            class191.field3499.method75(48, arg4 - 11788);
            class191.field3499.method604(arg2, 1543219568);
            class191.field3499.method631(arg0, -1);
        }
        if (arg4 != 11901) {
            field3093 = null;
        }
        if (arg1 == 8) {
            class145.field2774++;
            class191.field3499.method75(185, 64);
            class191.field3499.method604(arg2, 1543219568);
            class191.field3499.method631(arg0, -1);
        }
        if (arg1 == 9) {
            class31.field484++;
            class191.field3499.method75(4, 107);
            class191.field3499.method604(arg2, 1543219568);
            class191.field3499.method631(arg0, -1);
        }
        if (arg1 == 10) {
            class226.field4087++;
            class191.field3499.method75(62, arg4 ^ 0x2E49);
            class191.field3499.method604(arg2, 1543219568);
            class191.field3499.method631(arg0, -1);
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
    public static void method1261(int arg0) {
        field3096 = null;
        if (arg0 != 31790) {
            return;
        }
        field3098 = null;
        field3090 = null;
        field3097 = null;
        field3093 = null;
        field3095 = null;
        field3091 = null;
        field3087 = null;
    }
}
