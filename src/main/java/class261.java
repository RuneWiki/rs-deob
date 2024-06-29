import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public abstract class class261 {

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "Lpe;")
    public static class615 field3511;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V", line = 3)
    public static void method1623(int arg0) {
        field3511 = null;
        int var1 = -29 % ((55 - arg0) / 56);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILji;[IB[II)Lna;", line = 14)
    public static final class273 method1624(int arg0, class622 arg1, int[] arg2, byte arg3, int[] arg4, int arg5) {
        field3512++;
        byte[] var6 = new byte[arg0 * arg5];
        if (arg3 >= -92) {
            method1623(-16);
        }
        for (int var7 = 0; var7 < arg0; var7++) {
            int var8 = arg5 * var7 + arg4[var7];
            for (int var9 = 0; var9 < arg2[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class273(arg1, arg5, arg0, var6);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILjda;)Ljda;")
    public abstract class77 method1042(int arg0, class77 arg1);
}
