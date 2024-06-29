import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class15 {

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
    public static int field226 = 0;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "[I")
    public static int[] field225 = new int[100];

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "Ljava/lang/String;")
    public static String field232 = "Loading title screen - ";

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "[I")
    public static int[] field231 = new int[100];

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "Ljava/lang/String;")
    public static String field235 = "Connection lost.";

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "[I")
    public static int[] field233;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V", line = 7)
    public static final void method151(int arg0) {
        class104.field1743 = null;
        class191.field3205 = (byte[][]) null;
        field234++;
        if (arg0 == 0) {
            class39.field585 = null;
            class123.field2138 = null;
            class352.field5575 = null;
            class40.field600 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IILcg;I)[Lta;", line = 24)
    public static final class217[] method152(int arg0, int arg1, class49 arg2, int arg3) {
        field228++;
        int var4 = 4 % ((arg1 + 57) / 46);
        return class325.method2262(arg3, (byte) 81, arg2, arg0) ? class265.method1824(9192) : null;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)V", line = 38)
    public static void method153(int arg0) {
        field231 = null;
        field235 = null;
        field225 = null;
        if (arg0 != 11095) {
            method154(-68, (byte) 0, 64);
        }
        field232 = null;
        field233 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IBI)I", line = 66)
    public static final int method154(int arg0, byte arg1, int arg2) {
        if (arg1 != -83) {
            field233 = (int[]) null;
        }
        int var3 = 0;
        while (arg2 > 0) {
            arg2--;
            var3 = var3 << 1 | arg0 & 0x1;
            arg0 >>>= 0x1;
        }
        field229++;
        return var3;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IBIIIIIII)V", line = 99)
    public static final void method155(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field227++;
        if (arg1 != -44) {
            return;
        }
        int var9 = arg0 - arg5;
        int var10 = arg3 - arg4;
        int var11 = (arg8 - arg7 << 16) / var10;
        int var12 = (arg6 - arg2 << 16) / var9;
        class13.method128(arg4, var12, arg0, 110, arg5, 0, arg3, arg7, arg2, var11, 0);
    }
}
