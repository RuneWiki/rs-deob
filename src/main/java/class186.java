import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class186 extends class69 {

    @OriginalMember(owner = "client!mi", name = "E", descriptor = "I")
    private final int field3121;

    @OriginalMember(owner = "client!mi", name = "J", descriptor = "I")
    private final int field3126;

    @OriginalMember(owner = "client!mi", name = "L", descriptor = "I")
    private final int field3128;

    @OriginalMember(owner = "client!mi", name = "M", descriptor = "I")
    private final int field3129;

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "I")
    public static int field3114 = (int) (33.0D * Math.random()) - 16;

    @OriginalMember(owner = "client!mi", name = "G", descriptor = "I")
    public static int field3123 = 0;

    @OriginalMember(owner = "client!mi", name = "y", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!mi", name = "A", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!mi", name = "B", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!mi", name = "C", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!mi", name = "F", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!mi", name = "H", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!mi", name = "I", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!mi", name = "K", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!mi", name = "N", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!mi", name = "D", descriptor = "[[[B")
    public static byte[][][] field3120;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(III)V")
    public final void method418(int arg0, int arg1, int arg2) {
        if (arg1 != 28440) {
            method1240((byte) 55);
        }
        ++field3117;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(III)V")
    public final void method416(int arg0, int arg1, int arg2) {
        if (arg0 >= -49) {
            field3122 = -34;
        }
        ++field3115;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(B)V")
    public static void method1240(byte arg0) {
        field3120 = null;
        if (arg0 != 80) {
            method1240((byte) 104);
        }
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(B)V")
    public static final void method1241(byte arg0) {
        ++field3125;
        class89.field1405.method1403(45);
        if (arg0 != -83) {
            field3123 = 65;
        }
        class98.field1523.method1403(45);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)V")
    public final void method414(int arg0, int arg1, int arg2) {
        ++field3130;
        int var4 = this.field3129 * arg0 >> 12;
        int var5 = this.field3121 * arg0 >> 12;
        int var6 = this.field3126 * arg1 >> 12;
        int var7 = this.field3128 * arg1 >> 12;
        class174.method1168(var7, var4, -535405712, var5, super.field1110, var6);
        if (arg2 != 31712) {
            this.method418(77, 20, 68);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)Lie;")
    public static final class2 method1242(int arg0, int arg1) {
        if (arg0 != 0) {
            field3122 = -5;
        }
        ++field3116;
        class2 var2 = (class2) class89.field1405.method1411(-15, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class93.field1459.method666(class72.method488(arg1, (byte) -49), class271.method1817(-682921625, arg1), (byte) -51);
            class2 var4 = new class2();
            if (var3 != null) {
                var4.method17(new class187(var3), (byte) 119);
            }
            var4.method18(true);
            class89.field1405.method1404((long) arg1, false, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1243(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 33) {
            field3120 = null;
        }
        int var8 = arg2 - -arg0;
        int var9 = arg7 - -arg0;
        int var10 = -arg0 + arg3;
        ++field3127;
        int var11 = -arg0 + arg4;
        for (int var12 = arg2; var12 < var8; ++var12) {
            class145.method1010(arg4, arg7, -25086, arg5, class210.field3617[var12]);
        }
        for (int var13 = arg3; var13 > var10; --var13) {
            class145.method1010(arg4, arg7, -25086, arg5, class210.field3617[var13]);
        }
        for (int var14 = var8; ~var14 >= ~var10; ++var14) {
            int[] var15 = class210.field3617[var14];
            class145.method1010(var9, arg7, arg6 + -25119, arg5, var15);
            class145.method1010(var11, var9, -25086, arg1, var15);
            class145.method1010(arg4, var11, arg6 ^ -25053, arg5, var15);
        }
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(IIIIII)V")
    public class186(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field3121 = arg0;
        this.field3126 = arg1;
        this.field3128 = arg3;
        this.field3129 = arg2;
    }
}
