import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class512 {

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "Lpk;")
    public static class104 field6950 = new class104("WTI", 5);

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "[I")
    public static int[] field6957 = new int[1];

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "[I")
    public static int[] field6956 = new int[8];

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public static int field6946;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public static int field6947;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field6948;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    public static int field6949;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public static int field6951;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
    public static int field6952;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "Lth;")
    public static class286 field6955;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "Lpl;")
    public static class612 field6953;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "[[Z")
    public static boolean[][] field6954;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)I")
    public static final int method2761(int arg0) {
        field6947++;
        if (arg0 != -1) {
            field6953 = null;
        }
        return 19;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(III)Z")
    public static final boolean method2762(int arg0, int arg1, int arg2) {
        field6946++;
        if (class695.method3920(2048, arg2, arg0)) {
            if (arg1 != 55) {
                method2767((byte) 1, -125, -116);
            }
            return (arg0 & 0xB000) != 0 | class570.method3149(arg0, arg2, 14031) | class627.method3446(arg2, arg0, 0) ? true : (arg2 & 0x37) == 0 & (class491.method2644(arg2, 116, arg0) | class680.method3829(arg2, arg1 + 10, arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIIZII)V")
    public static final void method2763(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        if (class263.field3294 <= arg0 && class314.field4052 >= arg1 && arg3 >= class289.field3595 && arg4 <= class159.field2063) {
            class355.method1946(arg1, arg3, arg6, arg4, arg7, (byte) 100, arg2, arg0);
        } else {
            class213.method1262(arg2, arg4, 28443, arg1, arg7, arg0, arg6, arg3);
        }
        field6949++;
        if (arg5) {
            method2765((byte) -29, -2, 9, -105, 67);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V")
    public static void method2764(byte arg0) {
        field6953 = null;
        field6957 = null;
        field6950 = null;
        field6956 = null;
        field6954 = null;
        field6955 = null;
        if (arg0 < 40) {
            method2763(54, 16, -22, 124, 101, false, -27, 14);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BIIII)V")
    public static final void method2765(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field6952++;
        class592 var5 = class61.method371(10, arg3, (byte) -109);
        var5.method3256((byte) 11);
        if (arg0 != -119) {
            field6957 = null;
        }
        var5.field8319 = arg1;
        var5.field8312 = arg2;
        var5.field8314 = arg4;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V")
    public static final void method2766(int arg0) {
        if (arg0 >= -96) {
            method2766(27);
        }
        field6951++;
        int var1 = class301.field3698.method143(-111, class651.field9191);
        if (var1 == 0) {
            class569.field7970 = null;
            class664.method3739(1000, 0);
        } else if (var1 == 1) {
            class404.method2153(4319, (byte) 0);
            class664.method3739(1000, 512);
            if (class10.field190 != null) {
                class347.method1924((byte) -47);
            }
        } else {
            class404.method2153(4319, (byte) (class673.field9473 - 4 & 0xFF));
            class664.method3739(1000, 2);
        }
        class56.field798 = class476.field6039;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BII)Z")
    public static final boolean method2767(byte arg0, int arg1, int arg2) {
        if (arg0 != 46) {
            field6953 = null;
        }
        field6948++;
        return (arg2 & 0x84080) != 0;
    }
}
