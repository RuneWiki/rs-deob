import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class245 extends class203 {

    @OriginalMember(owner = "client!wa", name = "y", descriptor = "I")
    private final int field4184;

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "I")
    private final int field4181;

    @OriginalMember(owner = "client!wa", name = "L", descriptor = "I")
    private final int field4196;

    @OriginalMember(owner = "client!wa", name = "E", descriptor = "I")
    private final int field4189;

    @OriginalMember(owner = "client!wa", name = "F", descriptor = "I")
    private final int field4190;

    @OriginalMember(owner = "client!wa", name = "J", descriptor = "I")
    private final int field4194;

    @OriginalMember(owner = "client!wa", name = "x", descriptor = "I")
    private final int field4183;

    @OriginalMember(owner = "client!wa", name = "D", descriptor = "I")
    private final int field4188;

    @OriginalMember(owner = "client!wa", name = "B", descriptor = "Ljd;")
    public static class85 field4187 = class221.method1499("rot:", (byte) 86);

    @OriginalMember(owner = "client!wa", name = "G", descriptor = "I")
    public static int field4191 = 0;

    @OriginalMember(owner = "client!wa", name = "K", descriptor = "I")
    public static int field4195 = 0;

    @OriginalMember(owner = "client!wa", name = "z", descriptor = "Z")
    public static boolean field4185 = false;

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!wa", name = "H", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!wa", name = "M", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!wa", name = "N", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!wa", name = "A", descriptor = "Lfg;")
    public static class12 field4186;

    @OriginalMember(owner = "client!wa", name = "I", descriptor = "[[[I")
    public static int[][][] field4193;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)V")
    public final void method739(int arg0, int arg1, int arg2) {
        ++field4198;
        int var4 = this.field4190 * arg1 >> 12;
        int var5 = this.field4181 * arg1 >> 12;
        int var6 = this.field4194 * arg2 >> 12;
        if (arg0 == 20241) {
            int var7 = this.field4189 * arg2 >> 12;
            int var8 = this.field4188 * arg1 >> 12;
            int var9 = this.field4196 * arg2 >> 12;
            int var10 = this.field4183 * arg1 >> 12;
            int var11 = this.field4184 * arg2 >> 12;
            class135.method900(var5, super.field3539, var7, var8, var6, var10, var11, var4, true, var9);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZ)V")
    public static final void method1656(int arg0, boolean arg1) {
        ++field4197;
        if (!arg1) {
            class171 var2 = class85.method579(12, 0, arg0);
            var2.method1141(-6456);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZII)V")
    public final void method744(boolean arg0, int arg1, int arg2) {
        ++field4180;
        if (!arg0) {
            this.method742(-44, (byte) -20, 7);
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(B)V")
    public static void method1657(byte arg0) {
        if (arg0 <= -87) {
            field4187 = null;
            field4186 = null;
            field4193 = null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class245(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field4184 = arg7;
        this.field4181 = arg2;
        this.field4196 = arg5;
        this.field4189 = arg3;
        this.field4190 = arg0;
        this.field4194 = arg1;
        this.field4183 = arg6;
        this.field4188 = arg4;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZZIZ)Lge;")
    public static final class68 method1658(int arg0, boolean arg1, boolean arg2, int arg3, boolean arg4) {
        if (arg3 > -28) {
            field4187 = null;
        }
        ++field4182;
        class38 var5 = null;
        if (class93.field1705 != null) {
            var5 = new class38(arg0, class93.field1705, class183.field3138[arg0], 1000000);
        }
        class4.field43[arg0] = class133.field2317.method1410(arg0, 0, var5, class150.field2530);
        if (arg4) {
            class4.field43[arg0].method1327((byte) 20);
        }
        return new class68(class4.field43[arg0], arg2, arg1);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IBI)V")
    public final void method742(int arg0, byte arg1, int arg2) {
        if (arg1 != -53) {
            field4187 = null;
        }
        ++field4192;
    }
}
