import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public class class356 {

    @OriginalMember(owner = "client!bga", name = "c", descriptor = "I")
    public static int field4557 = 0;

    @OriginalMember(owner = "client!bga", name = "d", descriptor = "F")
    public static float field4558;

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(I[ILnv;I[II)Lgga;", line = 9)
    public static final class291 method2095(int arg0, int[] arg1, class417 arg2, int arg3, int[] arg4, int arg5) {
        field4556++;
        byte[] var6 = new byte[arg3 * arg5];
        int var7 = 0;
        if (arg0 < 116) {
            field4557 = -68;
        }
        while (arg3 > var7) {
            int var8 = arg5 * var7 + arg4[var7];
            for (int var9 = 0; var9 < arg1[var7]; var9++) {
                var6[var8++] = -1;
            }
            var7++;
        }
        return new class291(arg2, arg5, arg3, var6);
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(I)V", line = 45)
    public static final void method2096(int arg0) {
        field4555++;
        if (class498.field7026) {
            return;
        }
        if (arg0 != 0) {
            method2096(-75);
        }
        class217.field2521 = true;
        class498.field7026 = true;
        class319.field4068 += (-12.0F - class319.field4068) / 2.0F;
    }
}
