import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class277 {

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "J")
    public static volatile long field4766 = 0L;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "Lmi;")
    public static class12 field4769 = new class12();

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "Loh;")
    public static class258 field4771 = class153.method1046(" loggt sich ein)3", 124);

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "Loh;")
    public static class258 field4772 = class153.method1046("details", 120);

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIII)V", line = 9)
    public static final void method1941(int arg0, int arg1, int arg2, int arg3) {
        class171 var4 = class10.method65(arg2, false, arg3);
        if (var4 != null && var4.field2959 != null) {
            class42 var5 = new class42();
            var5.field598 = var4;
            var5.field600 = var4.field2959;
            class193.method1303(200000, var5);
        }
        class247.field4280 = arg3;
        class42.field581 = arg0;
        class130.field2293 = true;
        field4767++;
        class23.field286 = arg2;
        int var6 = 54 / ((arg1 + 39) / 52);
        class165.method1099((byte) 125, var4);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V", line = 46)
    public static final void method1942(byte arg0) {
        class242.field4202 = 0;
        class86.field1456 = -1;
        class140.field2386 = 1;
        field4768++;
        class265.field4608 = -3;
        class114.field2019 = 0;
        class128.field2278 = 0;
        if (arg0 != 118) {
            field4766 = 72L;
        }
        class36.field475 = false;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIB)V", line = 64)
    public static final void method1943(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 > -56) {
            field4772 = (class258) null;
        }
        if (class75.field1314 <= arg2 - arg3 && (arg2 + arg3) <= class206.field3562 && class241.field4189 <= arg0 - arg3 && class94.field1654 >= (arg0 + arg3)) {
            class228.method1521(true, arg3, arg0, arg2, arg1);
        } else {
            class154.method1052(arg0, arg1, 0, arg3, arg2);
        }
        field4770++;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V", line = 111)
    public static void method1944(int arg0) {
        field4772 = null;
        field4771 = null;
        field4769 = null;
        if (arg0 < 60) {
            field4772 = (class258) null;
        }
    }
}
