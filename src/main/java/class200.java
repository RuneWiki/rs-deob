import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class200 extends class139 {

    @OriginalMember(owner = "client!cl", name = "J", descriptor = "I")
    public int field3216 = 0;

    @OriginalMember(owner = "client!cl", name = "G", descriptor = "[I")
    public static int[] field3213 = new int[14];

    @OriginalMember(owner = "client!cl", name = "y", descriptor = "I")
    public static int field3205 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!cl", name = "E", descriptor = "I")
    public static int field3211 = 1;

    @OriginalMember(owner = "client!cl", name = "x", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!cl", name = "A", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!cl", name = "B", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!cl", name = "C", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!cl", name = "D", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!cl", name = "F", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!cl", name = "I", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!cl", name = "K", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!cl", name = "H", descriptor = "[[B")
    public static byte[][] field3214;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "(I)V")
    public static void method1468(int arg0) {
        field3213 = null;
        field3214 = null;
        if (arg0 != -32654) {
            method1470(-102);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIII)V")
    public static final void method1469(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 <= class228.field3657 && arg2 >= class207.field3328) {
            boolean var6;
            if (class272.field4374 > arg0) {
                arg0 = class272.field4374;
                var6 = false;
            } else if (class211.field3386 >= arg0) {
                var6 = true;
            } else {
                arg0 = class211.field3386;
                var6 = false;
            }
            boolean var7;
            if (class272.field4374 > arg3) {
                var7 = false;
                arg3 = class272.field4374;
            } else if (class211.field3386 < arg3) {
                arg3 = class211.field3386;
                var7 = false;
            } else {
                var7 = true;
            }
            if (arg4 >= class207.field3328) {
                class177.method1330(class240.field3831[arg4++], arg0, arg1, 32232, arg3);
            } else {
                arg4 = class207.field3328;
            }
            if (class228.field3657 >= arg2) {
                class177.method1330(class240.field3831[arg2--], arg0, arg1, 32232, arg3);
            } else {
                arg2 = class228.field3657;
            }
            if (var6 && var7) {
                for (int var8 = arg4; var8 <= arg2; var8++) {
                    int[] var9 = class240.field3831[var8];
                    var9[arg0] = var9[arg3] = arg1;
                }
            } else if (var6) {
                for (int var11 = arg4; var11 <= arg2; var11++) {
                    class240.field3831[var11][arg0] = arg1;
                }
            } else if (var7) {
                for (int var10 = arg4; var10 <= arg2; var10++) {
                    class240.field3831[var10][arg3] = arg1;
                }
            }
        }
        field3210++;
        if (arg5 != 1) {
            method1472(false, 4, (class86) null, (class86) null, (class35) null);
        }
    }

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "(I)V")
    public static final void method1470(int arg0) {
        class78.field1133.method1556((byte) 82);
        if (arg0 <= -90) {
            field3208++;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILv;I)V")
    private final void method1471(int arg0, class152 arg1, int arg2) {
        field3204++;
        if (arg2 == 2) {
            this.field3216 = arg1.method1126(false);
        }
        if (arg0 <= 74) {
            field3209 = 53;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZILlc;Llc;Lva;)V")
    public static final void method1472(boolean arg0, int arg1, class86 arg2, class86 arg3, class35 arg4) {
        field3217++;
        class196.field3185 = arg3;
        class293.field4660 = arg2;
        class266.field4309 = arg0;
        int var5 = class196.field3185.method631(-127) - 1;
        class19.field213 = var5 * 256 + class196.field3185.method617((byte) 28, var5);
        class180.field2907 = arg4;
        class117.field1675 = new String[] { null, null, null, null, class134.field2205 };
        class269.field4339 = new String[] { null, null, class226.field3634, null, null };
        if (arg1 != 10634) {
            field3205 = 127;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lv;I)V")
    public final void method1473(class152 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1111(255);
            if (var3 == 0) {
                field3215++;
                if (arg1 != -1) {
                    field3211 = -32;
                    return;
                }
                return;
            }
            this.method1471(81, arg0, var3);
        }
    }
}
