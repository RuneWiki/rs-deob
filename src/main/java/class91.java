import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public class class91 {

    @OriginalMember(owner = "client!iga", name = "b", descriptor = "I")
    public static int field1063 = 0;

    @OriginalMember(owner = "client!iga", name = "d", descriptor = "Z")
    public static boolean field1065 = false;

    @OriginalMember(owner = "client!iga", name = "c", descriptor = "Z")
    public static boolean field1064 = false;

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!iga", name = "e", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!iga", name = "f", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!iga", name = "toString", descriptor = "()Ljava/lang/String;", line = 16)
    public final String toString() {
        field1067++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!iga", name = "<init>", descriptor = "(II)V", line = 30)
    public class91(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(II[BIIB[BII)V", line = 44)
    public static final void method666(int arg0, int arg1, byte[] arg2, int arg3, int arg4, byte arg5, byte[] arg6, int arg7, int arg8) {
        field1062++;
        if (arg5 != -68) {
            field1063 = 116;
        }
        int var9 = -(arg0 >> 2);
        int var10 = -(arg0 & 0x3);
        for (int var11 = -arg8; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg4++;
                arg6[var10001] = (byte) (arg6[var10001] - arg2[arg7++]);
                int var14 = arg4++;
                arg6[var14] = (byte) (arg6[var14] - arg2[arg7++]);
                int var15 = arg4++;
                arg6[var15] = (byte) (arg6[var15] - arg2[arg7++]);
                int var16 = arg4++;
                arg6[var16] = (byte) (arg6[var16] - arg2[arg7++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg4++;
                arg6[var10001] = (byte) (arg6[var10001] - arg2[arg7++]);
            }
            arg7 += arg3;
            arg4 += arg1;
        }
    }
}
