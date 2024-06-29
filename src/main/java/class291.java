import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class291 extends class301 {

    @OriginalMember(owner = "client!vg", name = "B", descriptor = "I")
    public int field4719 = 0;

    @OriginalMember(owner = "client!vg", name = "z", descriptor = "[I")
    public static int[] field4717 = new int[14];

    @OriginalMember(owner = "client!vg", name = "D", descriptor = "Z")
    public static boolean field4720 = false;

    @OriginalMember(owner = "client!vg", name = "F", descriptor = "[J")
    public static long[] field4722 = new long[32];

    @OriginalMember(owner = "client!vg", name = "v", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!vg", name = "w", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!vg", name = "x", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!vg", name = "y", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!vg", name = "A", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!vg", name = "E", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIIIII)V", line = 7)
    public static final void method2064(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = arg3 - arg6;
        int var9 = arg2 + arg6;
        int var10 = arg5 + arg6;
        field4716++;
        if (arg1 != -1) {
            field4720 = false;
        }
        int var11 = arg7 - arg6;
        for (int var12 = arg2; var12 < var9; var12++) {
            class344.method2417(class232.field3799[var12], arg5, arg7, arg0, (byte) -126);
        }
        for (int var13 = arg3; var13 > var8; var13--) {
            class344.method2417(class232.field3799[var13], arg5, arg7, arg0, (byte) -118);
        }
        for (int var14 = var9; var14 <= var8; var14++) {
            int[] var15 = class232.field3799[var14];
            class344.method2417(var15, arg5, var10, arg0, (byte) -123);
            class344.method2417(var15, var10, var11, arg4, (byte) -124);
            class344.method2417(var15, var11, arg7, arg0, (byte) -128);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZLoe;)V", line = 56)
    private final void method2065(int arg0, boolean arg1, class146 arg2) {
        if (!arg1) {
            if (arg0 == 2) {
                this.field4719 = arg2.method989(103);
            }
            field4718++;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lek;Lek;I)V", line = 76)
    public static final void method2066(class206 arg0, class206 arg1, int arg2) {
        if (arg2 != 12) {
            field4717 = (int[]) null;
        }
        field4721++;
        class124.field2173 = arg1;
        class274.field4467 = arg0;
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(B)V", line = 96)
    public static void method2067(byte arg0) {
        field4722 = null;
        field4717 = null;
        if (arg0 != -87) {
            method2064(80, 44, 11, -62, -6, -16, -114, -85);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)V", line = 108)
    public static final void method2068(int arg0, int arg1, int arg2) {
        class199 var3 = class173.method1231(false, 12, arg1);
        field4715++;
        var3.method1367((byte) -84);
        var3.field3338 = arg2;
        if (arg0 != -4825) {
            method2066((class206) null, (class206) null, -105);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Loe;I)V", line = 138)
    public final void method2069(class146 arg0, int arg1) {
        if (arg1 != 32) {
            method2066((class206) null, (class206) null, -52);
        }
        while (true) {
            int var3 = arg0.method1005((byte) 122);
            if (var3 == 0) {
                field4714++;
                return;
            }
            this.method2065(var3, false, arg0);
        }
    }
}
