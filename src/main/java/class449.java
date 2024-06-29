import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ika")
public class class449 extends class406 {

    @OriginalMember(owner = "client!ika", name = "p", descriptor = "[I")
    public static int[] field6154 = new int[250];

    @OriginalMember(owner = "client!ika", name = "l", descriptor = "B")
    private byte field6150;

    @OriginalMember(owner = "client!ika", name = "u", descriptor = "B")
    private byte field6159;

    @OriginalMember(owner = "client!ika", name = "o", descriptor = "I")
    public static int field6153;

    @OriginalMember(owner = "client!ika", name = "q", descriptor = "I")
    public static int field6155;

    @OriginalMember(owner = "client!ika", name = "r", descriptor = "I")
    public static int field6156;

    @OriginalMember(owner = "client!ika", name = "t", descriptor = "I")
    public static int field6158;

    @OriginalMember(owner = "client!ika", name = "v", descriptor = "I")
    public static int field6160;

    @OriginalMember(owner = "client!ika", name = "m", descriptor = "Llv;")
    public static class470 field6151;

    @OriginalMember(owner = "client!ika", name = "n", descriptor = "Ljava/lang/String;")
    private String field6152;

    @OriginalMember(owner = "client!ika", name = "s", descriptor = "[I")
    public static int[] field6157;

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "(Lfca;Z)V")
    public final void method1292(class93 arg0, boolean arg1) {
        field6153++;
        this.field6152 = arg0.method802(arg1);
        if (this.field6152 != null) {
            arg0.method793((byte) 64);
            this.field6150 = arg0.method766((byte) 122);
            this.field6159 = arg0.method766((byte) 122);
        }
    }

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "(ZLgca;)V")
    public final void method1291(boolean arg0, class265 arg1) {
        if (!arg0) {
            method2607(false, 73, 33, true, 36, (byte) 35, -16);
        }
        arg1.field3728 = this.field6152;
        field6158++;
        if (this.field6152 != null) {
            arg1.field3727 = this.field6159;
            arg1.field3741 = this.field6150;
        }
    }

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "(I)V")
    public static final void method2605(int arg0) {
        class118.field2169.method273(-91);
        field6160++;
        if (arg0 != 1) {
            method2606((byte) -125);
        }
    }

    @OriginalMember(owner = "client!ika", name = "c", descriptor = "(B)V")
    public static void method2606(byte arg0) {
        field6157 = null;
        field6154 = null;
        if (arg0 != 55) {
            method2605(122);
        }
        field6151 = null;
    }

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "(ZIIZIBI)V")
    public static final void method2607(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, byte arg5, int arg6) {
        if (arg2 < arg6) {
            int var7 = (arg2 + arg6) / 2;
            int var8 = arg2;
            class732 var9 = class18.field426[var7];
            class18.field426[var7] = class18.field426[arg6];
            class18.field426[arg6] = var9;
            for (int var10 = arg2; var10 < arg6; var10++) {
                if (class563.method3257(arg4, var9, arg3, false, class18.field426[var10], arg1, arg0) <= 0) {
                    class732 var11 = class18.field426[var10];
                    class18.field426[var10] = class18.field426[var8];
                    class18.field426[var8++] = var11;
                }
            }
            class18.field426[arg6] = class18.field426[var8];
            class18.field426[var8] = var9;
            method2607(arg0, arg1, arg2, arg3, arg4, (byte) 64, var8 - 1);
            method2607(arg0, arg1, var8 + 1, arg3, arg4, (byte) 50, arg6);
        }
        field6156++;
        if (arg5 <= 15) {
            method2606((byte) 97);
        }
    }
}
