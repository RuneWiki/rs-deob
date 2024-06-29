import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class611 implements class762 {

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "Lup;")
    private class292 field8308;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "Lkv;")
    private class284 field8305;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "Lmga;")
    public static class739 field8304 = new class739(83, 0);

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "Ljw;")
    public static class581 field8306 = new class581(119, 2);

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "Z")
    public static boolean field8307 = false;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
    public static int field8298;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
    public static int field8299;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    public static int field8300;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
    public static int field8301;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    public static int field8302;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    public static int field8303;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)Z")
    public final boolean method15(int arg0) {
        if (arg0 != 20662) {
            method3378(true);
        }
        field8303++;
        return this.field8308.method1850((byte) 108);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lda;IBIILjava/lang/String;)I")
    private final int method3377(class66 arg0, int arg1, byte arg2, int arg3, int arg4, String arg5) {
        if (arg2 > -53) {
            method3378(false);
        }
        field8299++;
        return arg0.method574(arg5, 0, 0, null, arg1 + arg4, -1, this.field8305.field4204, 0, this.field8305.field4195 - (arg4 * 2), -(arg4 * 2) + this.field8305.field4193, 0, 0, this.field8305.field4201, null, null, arg3 + arg4);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V")
    public final void method16(int arg0) {
        field8298++;
        if (arg0 <= 36) {
            field8306 = null;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)V")
    public static void method3378(boolean arg0) {
        field8306 = null;
        field8304 = null;
        if (!arg0) {
            field8307 = false;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)I")
    public static final int method3379(byte arg0) {
        field8302++;
        return arg0 == 33 ? class728.field10115++ : 79;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z[I[I)V")
    public static final void method3380(boolean arg0, int[] arg1, int[] arg2) {
        field8301++;
        if (arg2 == null || arg1 == null) {
            class524.field7180 = null;
            class670.field9423 = null;
            class671.field9438 = null;
            return;
        }
        class670.field9423 = arg2;
        if (!arg0) {
            method3378(true);
        }
        class524.field7180 = new int[arg2.length];
        class671.field9438 = new byte[arg2.length][][];
        for (int var3 = 0; var3 < class670.field9423.length; var3++) {
            class671.field9438[var3] = new byte[arg1[var3]][];
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IZ)V")
    public final void method1500(int arg0, boolean arg1) {
        field8300++;
        if (arg0 > -93) {
            field8307 = false;
        }
        class307 var3 = this.field8308.method1849(true, this.field8305.field4196);
        if (var3 == null) {
            return;
        }
        int var4 = this.field8305.field4191.method3160(this.field8305.field4195, class124.field1786, (byte) -91) + this.field8305.field4194;
        int var5 = this.field8305.field4198.method3543(0, class710.field9945, this.field8305.field4193) + this.field8305.field4203;
        if (this.field8305.field4199) {
            class379.field5542.method538(var4, var5, this.field8305.field4195, this.field8305.field4193, this.field8305.field4190, 0);
        }
        int var6 = var5 + this.method3377(class251.field3716, var4, (byte) -61, var5, 5, var3.field4440) * 12;
        int var9 = var6 + 8;
        if (this.field8305.field4199) {
            class379.field5542.method559(var4, var9, var4 + this.field8305.field4195 - 1, var9, this.field8305.field4190, 0);
        }
        var6 = var9 + 1;
        int var7 = var6 + this.method3377(class251.field3716, var4, (byte) -127, var6, 5, var3.field4442) * 12;
        int var10 = var7 + 5;
        int var10000 = var10 + this.method3377(class251.field3716, var4, (byte) -81, var10, 5, var3.field4441) * 12;
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lup;Lkv;)V")
    public class611(class292 arg0, class284 arg1) {
        this.field8308 = arg0;
        this.field8305 = arg1;
    }
}
