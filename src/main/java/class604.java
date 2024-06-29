import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class604 extends class717 {

    @OriginalMember(owner = "client!qs", name = "D", descriptor = "Ltm;")
    public static class334 field8540 = new class334(109, -1);

    @OriginalMember(owner = "client!qs", name = "J", descriptor = "[B")
    public static byte[] field8543 = new byte[2048];

    @OriginalMember(owner = "client!qs", name = "K", descriptor = "Z")
    public static boolean field8544 = false;

    @OriginalMember(owner = "client!qs", name = "A", descriptor = "I")
    public static int field8539;

    @OriginalMember(owner = "client!qs", name = "H", descriptor = "I")
    public static int field8541;

    @OriginalMember(owner = "client!qs", name = "I", descriptor = "I")
    public static int field8542;

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lla;Lla;Lge;)V")
    public class604(class422 arg0, class422 arg1, class405 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "(I)V")
    public static final void method3459(int arg0) {
        ++field8542;
        class292.field4496.method76(80);
        if (arg0 != 0) {
            field8540 = null;
        }
        class577.field8175.method76(arg0 + -95);
        class688.field9772.method76(arg0 ^ 107);
        class279.field4264.method76(arg0 + -128);
    }

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "(B)V")
    public static void method3460(byte arg0) {
        field8540 = null;
        if (arg0 != 49) {
            field8543 = null;
        }
        field8543 = null;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIII)V")
    public final void method3461(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 27656) {
            field8544 = false;
        }
        ++field8539;
        int var6 = super.field10068.method177();
        int var7 = ((class405) super.field3638).field5999 * class236.method1627(1) / 10 % var6;
        super.field10068.method188(-var6 + arg2 + var7, arg4, arg1 + var6 + -var7, arg3);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method3462(int arg0, byte[] arg1) {
        ++field8541;
        int var2 = arg1.length;
        if (arg0 != -21039) {
            method3462(101, (byte[]) null);
        }
        byte[] var3 = new byte[var2];
        class571.method3313(arg1, 0, var3, 0, var2);
        return var3;
    }
}
