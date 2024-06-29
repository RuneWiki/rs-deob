import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bja")
public class class31 extends class656 {

    @OriginalMember(owner = "client!bja", name = "i", descriptor = "J")
    public long field487;

    @OriginalMember(owner = "client!bja", name = "j", descriptor = "Lkaa;")
    public static class47 field488 = new class47(76, -1);

    @OriginalMember(owner = "client!bja", name = "k", descriptor = "I")
    public static int field489 = -2;

    @OriginalMember(owner = "client!bja", name = "n", descriptor = "Ljava/lang/String;")
    public static String field492 = null;

    @OriginalMember(owner = "client!bja", name = "l", descriptor = "[I")
    public static int[] field490 = new int[2048];

    @OriginalMember(owner = "client!bja", name = "m", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(I)V", line = 3)
    public static final void method270(int arg0) {
        class379.field5278 = arg0;
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(B)V", line = 6)
    public static void method271(byte arg0) {
        field490 = null;
        field488 = null;
        int var1 = -63 % ((arg0 - 50) / 42);
        field492 = null;
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;I)V", line = 19)
    public static final void method272(String arg0, String arg1, String arg2, int arg3, int arg4, int arg5, String arg6, String arg7, int arg8) {
        field491++;
        class654 var9 = class739.field10205[99];
        for (int var10 = 99; var10 > 0; var10--) {
            class739.field10205[var10] = class739.field10205[var10 - 1];
        }
        if (arg4 <= 61) {
            method270(41);
        }
        if (var9 == null) {
            var9 = new class654(arg5, arg3, arg7, arg6, arg2, arg0, arg8, arg1);
        } else {
            var9.method3559(arg0, arg8, arg3, arg5, arg2, 1350, arg1, arg7, arg6);
        }
        class225.field3199 = class691.field9630;
        class269.field3759++;
        class739.field10205[0] = var9;
    }

    @OriginalMember(owner = "client!bja", name = "<init>", descriptor = "()V", line = 56)
    public class31() {
    }

    @OriginalMember(owner = "client!bja", name = "<init>", descriptor = "(J)V", line = 62)
    public class31(long arg0) {
        this.field487 = arg0;
    }
}
