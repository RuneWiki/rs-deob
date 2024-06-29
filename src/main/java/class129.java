import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public abstract class class129 {

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public abstract void method782(Component arg0, boolean arg1);

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method784(byte arg0, Component arg1);

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)I")
    public abstract int method783(int arg0);

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZFILp;I[BFFIIFFII)V")
    public static final void method930(boolean arg0, float arg1, int arg2, class185 arg3, int arg4, byte[] arg5, float arg6, float arg7, int arg8, int arg9, float arg10, float arg11, int arg12, int arg13) {
        field1987++;
        int var14 = arg2 * arg13;
        float[] var15 = new float[var14];
        for (int var16 = 0; var16 < arg4; var16++) {
            int var19 = arg12;
            arg3.method259(arg2, var15, arg10 / (float) arg2, arg8, true, arg11 / (float) arg8, 0, arg13, arg6 / (float) arg13, arg7 * 127.0F, arg9);
            arg6 *= 2.0F;
            arg10 *= 2.0F;
            arg11 *= 2.0F;
            for (int var20 = 0; var20 < var14; var20++) {
                arg5[var19] = (byte) ((int) ((float) arg5[var19] + var15[var20]));
                var19++;
            }
            arg7 = arg1 * arg7;
        }
        if (!arg0) {
            method931(-96, null, 56, -128);
        }
        int var17 = arg12;
        for (int var18 = 0; var18 < var14; var18++) {
            arg5[var17] -= -127;
            var17++;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILat;II)V")
    public static final void method931(int arg0, class444 arg1, int arg2, int arg3) {
        field1988++;
        if (class294.field3967 != null || class526.field7677 || arg1 == null || class436.method2581(false, arg1) == null) {
            return;
        }
        class294.field3967 = arg1;
        class250.field3411 = class436.method2581(false, arg1);
        class399.field5728 = arg0;
        class75.field1058 = false;
        class105.field1718 = arg3;
        class108.field1755 = arg2;
    }
}
