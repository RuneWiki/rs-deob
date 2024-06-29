import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class124 extends class313 {

    @OriginalMember(owner = "client!te", name = "d", descriptor = "Llm;")
    public class374 field1533;

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lic;II[B)V")
    private class124(class246 arg0, int arg1, int arg2, byte[] arg3) {
        this.field1533 = class374.method2259(6406, arg1, (byte) -70, arg3, arg0, false, 6406, arg2);
        this.field1533.method733(false, false);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIILic;[I[I)Lte;")
    public static final class124 method595(int arg0, int arg1, int arg2, class246 arg3, int[] arg4, int[] arg5) {
        byte[] var6 = new byte[arg0 * arg2];
        for (int var7 = arg1; var7 < arg0; var7++) {
            int var8 = arg2 * var7 + arg4[var7];
            for (int var9 = 0; var9 < arg5[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class124(arg3, arg2, arg0, var6);
    }
}
