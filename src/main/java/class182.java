import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class182 {

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public static int field2484 = 0;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "Lva;")
    public static class288 field2485 = new class288(16);

    @OriginalMember(owner = "client!b", name = "c", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
    public static void method1224(int arg0) {
        field2485 = null;
        if (arg0 != -17938) {
            field2485 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIZI)V")
    public static final void method1225(int arg0, int arg1, boolean arg2, int arg3) {
        class399.field5699 = new byte[arg3][arg1][arg0];
        field2487++;
        if (!arg2) {
            method1224(6);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIBII)I")
    public static final int method1226(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field2488++;
        if (arg3 != -74) {
            return -10;
        } else if (class161.field2122 == null) {
            return 0;
        } else {
            if (arg4 < 3) {
                int var6 = arg5 >> 7;
                int var7 = arg2 >> 7;
                if (arg1 < 0 || arg0 < 0 || class176.field2403 - 1 < arg1 || arg0 > class383.field5395 - 1) {
                    return 0;
                }
                if (var6 < 1 || var7 < 1 || (class176.field2403 - 1) < var6 || class383.field5395 - 1 < var7) {
                    return 0;
                }
                boolean var8 = (class399.field5699[1][arg5 >> 7][arg2 >> 7] & 0x2) != 0;
                if ((arg5 & 0x7F) == 0) {
                    boolean var9 = (class399.field5699[1][var6 - 1][arg2 >> 7] & 0x2) != 0;
                    boolean var10 = (class399.field5699[1][var6][arg2 >> 7] & 0x2) != 0;
                    if (var10 != var9) {
                        var8 = (class399.field5699[1][arg1][arg0] & 0x2) != 0;
                    }
                }
                if ((arg2 & 0x7F) == 0) {
                    boolean var11 = (class399.field5699[1][arg5 >> 7][var7 - 1] & 0x2) != 0;
                    boolean var12 = (class399.field5699[1][arg5 >> 7][var7] & 0x2) != 0;
                    if (var11 != var12) {
                        var8 = (class399.field5699[1][arg1][arg0] & 0x2) != 0;
                    }
                }
                if (var8) {
                    arg4++;
                }
            }
            return class161.field2122[arg4].method342(arg5, arg2);
        }
    }
}
