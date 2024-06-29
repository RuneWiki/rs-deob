import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class229 extends class137 {

    @OriginalMember(owner = "client!jc", name = "H", descriptor = "I")
    private final int field4160;

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "I")
    private final int field4153;

    @OriginalMember(owner = "client!jc", name = "D", descriptor = "I")
    private final int field4156;

    @OriginalMember(owner = "client!jc", name = "E", descriptor = "I")
    private final int field4157;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "I")
    private final int field4145;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "I")
    private final int field4152;

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "I")
    private final int field4155;

    @OriginalMember(owner = "client!jc", name = "G", descriptor = "I")
    private final int field4159;

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "Z")
    public static boolean field4149 = false;

    @OriginalMember(owner = "client!jc", name = "B", descriptor = "I")
    public static int field4154 = -1;

    @OriginalMember(owner = "client!jc", name = "F", descriptor = "Lrk;")
    public static class257 field4158 = new class257();

    @OriginalMember(owner = "client!jc", name = "O", descriptor = "Ljd;")
    private static class86 field4167 = class122.method868("Loaded update list", true);

    @OriginalMember(owner = "client!jc", name = "M", descriptor = "[I")
    public static int[] field4165 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!jc", name = "K", descriptor = "Ljd;")
    public static class86 field4163 = field4167;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!jc", name = "L", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "Lwj;")
    public static class6 field4162;

    @OriginalMember(owner = "client!jc", name = "N", descriptor = "[Lmk;")
    public static class101[] field4166;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(III[Ljd;)Ljd;")
    public static final class86 method1593(int arg0, int arg1, int arg2, class86[] arg3) {
        int var4 = 0;
        ++field4148;
        for (int var5 = arg0; ~arg1 < ~var5; ++var5) {
            if (arg3[arg2 + var5] == null) {
                arg3[arg2 - -var5] = class134.field2540;
            }
            var4 += arg3[arg2 + var5].field1704;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; ~arg1 < ~var8; ++var8) {
            class86 var10 = arg3[arg2 - -var8];
            class250.method1687(var10.field1670, 0, var6, var7, var10.field1704);
            var7 += var10.field1704;
        }
        class86 var9 = new class86();
        var9.field1704 = var4;
        var9.field1670 = var6;
        return var9;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class229(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field4160 = arg3;
        this.field4153 = arg0;
        this.field4156 = arg1;
        this.field4157 = arg5;
        this.field4145 = arg6;
        this.field4152 = arg2;
        this.field4155 = arg7;
        this.field4159 = arg4;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZ)I")
    public static final int method1594(int arg0, boolean arg1) {
        ++field4164;
        if (arg1) {
            field4165 = null;
        }
        return arg0 & 255;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)V")
    public static void method1595(byte arg0) {
        field4158 = null;
        field4167 = null;
        int var1 = -77 / ((-68 - arg0) / 33);
        field4166 = null;
        field4165 = null;
        field4163 = null;
        field4162 = null;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(III)V")
    public final void method468(int arg0, int arg1, int arg2) {
        ++field4151;
        if (arg1 != 500) {
            method1593(-78, -102, 33, (class86[]) null);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIB)V")
    public final void method467(int arg0, int arg1, byte arg2) {
        int var4 = this.field4153 * arg0 >> 12;
        ++field4161;
        int var5 = this.field4156 * arg1 >> 12;
        int var6 = 111 / ((arg2 - 77) / 46);
        int var7 = this.field4152 * arg0 >> 12;
        int var8 = this.field4160 * arg1 >> 12;
        int var9 = this.field4159 * arg0 >> 12;
        int var10 = this.field4157 * arg1 >> 12;
        int var11 = this.field4145 * arg0 >> 12;
        int var12 = this.field4155 * arg1 >> 12;
        class12.method97(var11, var12, var5, var8, var7, var10, var4, var9, 106, super.field2619);
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(IIB)Lwj;")
    public static final class6 method1596(int arg0, int arg1, byte arg2) {
        ++field4146;
        class6 var3 = class25.method178(91, arg1);
        if (arg0 == -1) {
            return var3;
        } else {
            if (arg2 != -27) {
                method1593(-69, 127, 4, (class86[]) null);
            }
            return var3 != null && var3.field216 != null && ~var3.field216.length < ~arg0 ? var3.field216[arg0] : null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
    public final void method471(int arg0, int arg1, int arg2) {
        ++field4150;
        if (arg1 != 9) {
            field4163 = null;
        }
    }
}
