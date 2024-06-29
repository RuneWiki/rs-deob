import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class270 extends class86 {

    @OriginalMember(owner = "client!tj", name = "w", descriptor = "Lda;")
    private static class275 field4690 = class255.method1672(97, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!tj", name = "z", descriptor = "I")
    public static int field4693 = 3353893;

    @OriginalMember(owner = "client!tj", name = "D", descriptor = "I")
    public static int field4697 = 0;

    @OriginalMember(owner = "client!tj", name = "H", descriptor = "[I")
    public static int[] field4701 = new int[50];

    @OriginalMember(owner = "client!tj", name = "K", descriptor = "[I")
    public static int[] field4704 = new int[100];

    @OriginalMember(owner = "client!tj", name = "F", descriptor = "Lda;")
    public static class275 field4699 = field4690;

    @OriginalMember(owner = "client!tj", name = "C", descriptor = "F")
    public static float field4696;

    @OriginalMember(owner = "client!tj", name = "v", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!tj", name = "x", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!tj", name = "A", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!tj", name = "E", descriptor = "I")
    public int field4698;

    @OriginalMember(owner = "client!tj", name = "G", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!tj", name = "J", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!tj", name = "I", descriptor = "Lma;")
    public static class105 field4702;

    @OriginalMember(owner = "client!tj", name = "y", descriptor = "Lda;")
    public class275 field4692;

    @OriginalMember(owner = "client!tj", name = "L", descriptor = "Lda;")
    public class275 field4705;

    @OriginalMember(owner = "client!tj", name = "B", descriptor = "[I")
    public static int[] field4695;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(I)V")
    public static void method1778(int arg0) {
        field4695 = null;
        field4699 = null;
        field4701 = null;
        field4690 = null;
        if (arg0 != 24893) {
            field4696 = 0.3743992F;
        }
        field4704 = null;
        field4702 = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lda;I)V")
    public static final void method1779(class275 arg0, int arg1) {
        ++field4689;
        if (arg1 != -30559) {
            method1778(-60);
        }
        class168.method1153((byte) 108);
        class159.method1112(arg0, -1);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BI)V")
    public static final void method1780(byte arg0, int arg1) {
        int var2 = -120 / ((-12 - arg0) / 60);
        ++field4703;
        class184 var3 = class147.method1044(2, (byte) 79, arg1);
        var3.method1230(1000);
    }

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "(I)Lsh;")
    public final class205 method1781(int arg0) {
        ++field4691;
        return arg0 != 5595 ? null : class106.field1844[super.field1455];
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)I")
    public static final int method1782(int arg0, int arg1) {
        ++field4700;
        if ((~arg1 > -66 || arg1 > 90) && (arg1 < 192 || ~arg1 < -223 || arg1 == 215)) {
            if (arg1 == 159) {
                return 255;
            } else if (arg1 == 140) {
                return 156;
            } else {
                if (arg0 > -3) {
                    field4693 = -66;
                }
                return arg1;
            }
        } else {
            return arg1 + 32;
        }
    }
}
