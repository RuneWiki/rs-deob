import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public abstract class class171 extends class128 {

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "I")
    public static int field2968 = -1;

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "Lul;")
    public static class51 field2962 = new class51(64);

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "I")
    public int field2957;

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "I")
    public int field2958;

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "I")
    public int field2964;

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "I")
    public int field2965;

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "I")
    public int field2967;

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "I")
    public int field2969;

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "Lcg;")
    public static class49 field2960;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljava/lang/String;II)I", line = 8)
    public static final int method1347(String arg0, int arg1, int arg2) {
        if (arg2 < 123) {
            method1348(45);
        }
        field2966++;
        return class198.method1494(87, arg0, arg1, true);
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V", line = 19)
    public static final void method1348(int arg0) {
        class92.field1445.method470(12);
        if (arg0 > 30) {
            class56.field861.method470(12);
            field2959++;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIBI)V", line = 51)
    public final void method1349(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 <= 71) {
            method1348(105);
        }
        int var6 = this.field2957 << 3;
        field2961++;
        int var7 = (arg2 << 4) + (var6 & 0xF);
        int var8 = this.field2969 << 3;
        int var9 = (arg0 << 4) + (var8 & 0xF);
        this.method1257(var6, var8, var7, var9, arg4, arg1);
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)V", line = 70)
    public static void method1350(int arg0) {
        field2962 = null;
        field2960 = null;
        int var1 = -70 % ((arg0 - 23) / 53);
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(II)V")
    public abstract void method1249(int arg0, int arg1);

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(IIII)V")
    public abstract void method1251(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIII)V")
    public abstract void method1257(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(II)V")
    public abstract void method1254(int arg0, int arg1);

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIII)V")
    public abstract void method1260(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(II)V")
    public abstract void method1248(int arg0, int arg1);

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)V")
    public abstract void method1259(int arg0, int arg1, int arg2);
}
