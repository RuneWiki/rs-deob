import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class480 extends class569 {

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "Lbaa;")
    public static class593 field6381 = new class593(15, 0, 1, 0);

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "Lrga;")
    public static class280 field6384 = new class280(0, 7);

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    public int field6376;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
    public int field6377;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
    public static int field6378;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "I")
    public static int field6379;

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "I")
    public int field6382;

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "I")
    public int field6383;

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "I")
    public static int field6385;

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "I")
    public static int field6388;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "Lbfa;")
    public static class145 field6386;

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "Lch;")
    public static class218 field6387;

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "Lni;")
    public class687 field6380;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Log;I)V")
    public static final void method2611(class101 arg0, int arg1) {
        arg0.field1364 = null;
        field6379++;
        int var2 = arg0.field1361.length;
        for (int var3 = arg1; var3 < var2; var3++) {
            arg0.field1361[var3].field1930 = false;
        }
        class139[] var4 = class588.field8267;
        synchronized (class588.field8267) {
            if (class588.field8267.length > var2 && class300.field3690[var2] < 200) {
                class588.field8267[var2].method801(arg0, arg1 + 125);
                int var10002 = class300.field3690[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIILev;Lev;)V")
    public static final void method2612(int arg0, int arg1, int arg2, class597 arg3, class597 arg4) {
        class75 var5 = class128.method683(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field1030 = arg3;
        var5.field1026 = arg4;
        int var6 = class699.field9887 == class491.field6485 ? 1 : 0;
        if (!arg3.method68((byte) 120)) {
            class252.field3090[var6][class469.field5960[var6]++] = arg3;
        } else if (arg3.method83((byte) 23)) {
            class337.field4341[var6][class173.field2256[var6]++] = arg3;
        } else {
            class102.field1375[var6][class593.field8335[var6]++] = arg3;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method68((byte) 124)) {
            if (arg4.method83((byte) 23)) {
                class337.field4341[var6][class173.field2256[var6]++] = arg4;
                return;
            }
            class102.field1375[var6][class593.field8335[var6]++] = arg4;
            return;
        }
        class252.field3090[var6][class469.field5960[var6]++] = arg4;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
    public static void method2613(int arg0) {
        if (arg0 != 0) {
            method2612(101, 40, 20, null, null);
        }
        field6387 = null;
        field6381 = null;
        field6386 = null;
        field6384 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BLes;)Ljq;")
    public static final class490 method2614(byte arg0, class630 arg1) {
        field6385++;
        class192 var2 = class590.method3245(arg1, -66);
        int var3 = arg1.method3524((byte) -67);
        int var4 = -84 % ((36 - arg0) / 35);
        return new class490(var2.field2389, var2.field2388, var2.field2391, var2.field2394, var2.field2393, var3);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(III)Llca;")
    public static final class137 method2615(int arg0, int arg1, int arg2) {
        class75 var3 = class270.field3423[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1022;
    }
}
