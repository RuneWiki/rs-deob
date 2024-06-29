import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public abstract class class617 {

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field8594;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field8595;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field8597;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "Lbga;")
    public static class324 field8596;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static void method3424(int arg0) {
        if (arg0 != 0) {
            method3425(26, null);
        }
        field8596 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static final long method3425(int arg0, String arg1) {
        field8595++;
        int var2 = -77 / ((10 - arg0) / 58);
        int var3 = arg1.length();
        long var4 = 0L;
        for (int var6 = 0; var6 < var3; var6++) {
            var4 = (long) arg1.charAt(var6) + (var4 << 5) - var4;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "([III[ILok;I)Llda;")
    public static final class448 method3426(int[] arg0, int arg1, int arg2, int[] arg3, class228 arg4, int arg5) {
        field8594++;
        byte[] var6 = new byte[arg2 * arg5];
        for (int var7 = arg1; var7 < arg2; var7++) {
            int var8 = arg5 * var7 + arg0[var7];
            for (int var9 = 0; var9 < arg3[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class448(arg4, arg5, arg2, var6);
    }
}
