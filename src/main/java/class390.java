import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class390 {

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "Z")
    public static boolean field5847 = false;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    public static int field5851 = 0;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "Ljava/lang/String;")
    public static String field5852 = "slide:";

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public static int field5844;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field5845;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field5846;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    public static int field5848;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "Lj;")
    public static class269 field5849;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field5850;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
    public static void method2546(int arg0) {
        if (arg0 != 65459) {
            method2549((class238) null, 96, (class238) null);
        }
        field5852 = null;
        field5849 = null;
        field5850 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)V")
    public static final void method2547(int arg0, byte arg1) {
        if (arg1 < 5) {
            field5851 = 21;
        }
        class367.field5457.method215(0, arg0);
        field5844++;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V")
    public static final void method2548(byte arg0) {
        for (class279 var1 = (class279) class175.field2291.method976((byte) 42); var1 != null; var1 = (class279) class175.field2291.method979(74)) {
            var1.method1792();
        }
        field5848++;
        if (arg0 >= -74) {
            method2549((class238) null, 108, (class238) null);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lqj;ILqj;)V")
    public static final void method2549(class238 arg0, int arg1, class238 arg2) {
        class411.field6155 = arg0;
        field5845++;
        class272.field3988 = arg2;
        if (arg1 < -21) {
            class170.field2247 = class411.field6155.method1476(3, (byte) -72);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIILs;)V")
    public static final void method2550(int arg0, int arg1, int arg2, class381 arg3) {
        if (class343.field5032[arg0][arg1][arg2] == null) {
            class433.method2749(arg0, arg1, arg2);
        }
        class343.field5032[arg0][arg1][arg2].field124 = arg3;
    }
}
