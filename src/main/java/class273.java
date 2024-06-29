import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public abstract class class273 extends class155 {

    @OriginalMember(owner = "client!md", name = "K", descriptor = "[I")
    public static int[] field4572 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!md", name = "E", descriptor = "I")
    public static int field4566 = 0;

    @OriginalMember(owner = "client!md", name = "N", descriptor = "Z")
    public static boolean field4575 = false;

    @OriginalMember(owner = "client!md", name = "O", descriptor = "I")
    public static int field4576 = 0;

    @OriginalMember(owner = "client!md", name = "B", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!md", name = "C", descriptor = "I")
    public int field4564;

    @OriginalMember(owner = "client!md", name = "D", descriptor = "I")
    public int field4565;

    @OriginalMember(owner = "client!md", name = "F", descriptor = "I")
    public int field4567;

    @OriginalMember(owner = "client!md", name = "G", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!md", name = "H", descriptor = "I")
    public int field4569;

    @OriginalMember(owner = "client!md", name = "I", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!md", name = "J", descriptor = "I")
    public int field4571;

    @OriginalMember(owner = "client!md", name = "L", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!md", name = "M", descriptor = "I")
    public int field4574;

    @OriginalMember(owner = "client!md", name = "P", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!md", name = "A", descriptor = "Laj;")
    public static class151 field4562;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIB)V")
    public static final void method1923(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 > -32) {
            field4572 = null;
        }
        if (class268.field4455 == 1) {
            class205.field3299[class81.field1352 / 100].method652(class5.field132 - 8, class216.field3650 + -8);
        }
        field4577++;
        if (class268.field4455 == 2) {
            class205.field3299[class81.field1352 / 100 + 4].method652(class5.field132 - 8, class216.field3650 + -8);
        }
        class151.method1137(-1);
    }

    @OriginalMember(owner = "client!md", name = "i", descriptor = "(I)V")
    public static void method1924(int arg0) {
        field4562 = null;
        if (arg0 != -11780) {
            field4576 = 74;
        }
        field4572 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(III)V")
    public abstract void method642(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIII)V")
    public abstract void method657(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BLaj;Laj;)I")
    public static final int method1925(byte arg0, class151 arg1, class151 arg2) {
        field4573++;
        int var3 = 0;
        if (arg2.method1118((byte) 50, class21.field380)) {
            var3++;
        }
        if (arg2.method1118((byte) 40, class50.field848)) {
            var3++;
        }
        if (arg2.method1118((byte) 118, class110.field1805)) {
            var3++;
        }
        if (arg0 != 78) {
            field4562 = null;
        }
        if (arg1.method1118((byte) 86, class21.field380)) {
            var3++;
        }
        if (arg1.method1118((byte) 100, class50.field848)) {
            var3++;
        }
        if (arg1.method1118((byte) 27, class110.field1805)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(II)V")
    public abstract void method652(int arg0, int arg1);

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(II)V")
    public abstract void method660(int arg0, int arg1);

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIII)V")
    public abstract void method661(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIILda;JZ)V")
    public static final void method1926(int arg0, int arg1, int arg2, int arg3, class312 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class23 var8 = new class23();
        var8.field425 = arg4;
        var8.field421 = arg1 * 128 + 64;
        var8.field429 = arg2 * 128 + 64;
        var8.field417 = arg3;
        var8.field428 = arg5;
        if (class90.field1498[arg0][arg1][arg2] == null) {
            class90.field1498[arg0][arg1][arg2] = new class174(arg0, arg1, arg2);
        }
        class90.field1498[arg0][arg1][arg2].field2805 = var8;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(IIIII)V")
    public abstract void method659(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(II)V")
    public abstract void method647(int arg0, int arg1);

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(IIIII)V")
    public final void method1927(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4563++;
        int var6 = this.field4565 << 3;
        int var7 = (arg3 << 4) + (var6 & 0xF);
        if (arg0 >= -13) {
            this.method652(55, 18);
        }
        int var8 = this.field4567 << 3;
        int var9 = (arg4 << 4) + (var8 & 0xF);
        this.method657(var6, var8, var7, var9, arg2, arg1);
    }
}
