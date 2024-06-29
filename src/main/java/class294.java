import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class294 extends class132 {

    @OriginalMember(owner = "client!ep", name = "B", descriptor = "Ljava/lang/Object;")
    private Object field4287;

    @OriginalMember(owner = "client!ep", name = "E", descriptor = "Lla;")
    public static class319 field4290 = new class319(102, 4);

    @OriginalMember(owner = "client!ep", name = "I", descriptor = "Llp;")
    public static class272 field4294 = new class272(32);

    @OriginalMember(owner = "client!ep", name = "J", descriptor = "[[Z")
    public static boolean[][] field4295 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!ep", name = "A", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!ep", name = "C", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!ep", name = "D", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!ep", name = "F", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!ep", name = "G", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!ep", name = "H", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "(I)V")
    public static void method1878(int arg0) {
        int var1 = -7 / ((arg0 + 80) / 45);
        field4295 = null;
        field4290 = null;
        field4294 = null;
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class294(Object arg0, int arg1) {
        super(arg1);
        this.field4287 = arg0;
    }

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(B)Z")
    public final boolean method651(byte arg0) {
        int var2 = -82 / ((61 - arg0) / 38);
        field4291++;
        return false;
    }

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public final Object method652(int arg0) {
        if (arg0 >= -33) {
            this.field4287 = null;
        }
        field4293++;
        return this.field4287;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILwj;IILwj;IIIII)V")
    public static final void method1879(int arg0, class275 arg1, int arg2, int arg3, class275 arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4289++;
        int var10 = arg1.method177(false);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class341 var12 = (class341) class317.field4604.method2133((long) var10, (byte) 73);
        if (var12 == null) {
            class252[] var13 = class252.method1638(class266.field3709, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class400.field6090.method774(var13[0], true);
            class317.field4604.method2131(var12, (long) var10, false);
        }
        class362.method2311(arg2 * arg4.method637((byte) -128), 0, arg5 >> 1, arg3, arg4.field1867, true, arg6, arg7 >> 1, arg4.field1862, arg4.field1866);
        int var14 = arg0 - (18 - class247.field3449[0]);
        int var15 = arg9 + class247.field3449[1] - 70;
        int var16 = arg8 / 4 * 18 + var14;
        int var17 = arg8 % 4 * 18 + var15;
        var12.method2201(var16, var17);
        if (arg1 == arg4) {
            class400.field6090.method1128(var16 - 1, 18, -256, -4, 18, var17 - 1);
        }
        class318 var18 = class502.method3006((byte) -7);
        var18.field4614 = var17;
        var18.field4611 = arg1;
        var18.field4609 = var17 + 16;
        var18.field4613 = var16;
        var18.field4610 = var16 + 16;
        class347.field5356.method3045(var18, arg2 - 4);
    }

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "(I)I")
    public static final int method1880(int arg0) {
        if (arg0 == -9087) {
            field4286++;
            return class538.field7897;
        } else {
            return 118;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(II)I")
    public static final int method1881(int arg0, int arg1) {
        field4288++;
        if (arg1 > -99) {
            field4295 = null;
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIII)V")
    public static final void method1882(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class77.field1116 = arg4;
        class529.field7747 = arg3;
        field4292++;
        class473.field7037 = arg1;
        class409.field6215 = arg2;
        int var5 = -79 / ((arg0 - 13) / 41);
    }
}
