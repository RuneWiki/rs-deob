import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public class class276 {

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "I")
    public int field3680;

    @OriginalMember(owner = "client!vea", name = "c", descriptor = "I")
    public int field3682;

    @OriginalMember(owner = "client!vea", name = "i", descriptor = "I")
    public int field3688;

    @OriginalMember(owner = "client!vea", name = "g", descriptor = "I")
    public int field3686;

    @OriginalMember(owner = "client!vea", name = "e", descriptor = "Lea;")
    public static class547 field3684 = new class547(19, 2);

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!vea", name = "d", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!vea", name = "f", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!vea", name = "h", descriptor = "Z")
    public static boolean field3687;

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(IIIIZZB)V", line = 10)
    public static final void method1644(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, byte arg6) {
        field3681++;
        if (arg1 < arg2) {
            int var7 = (arg1 + arg2) / 2;
            int var8 = arg1;
            class695 var9 = class688.field9635[var7];
            class688.field9635[var7] = class688.field9635[arg2];
            class688.field9635[arg2] = var9;
            for (int var10 = arg1; var10 < arg2; var10++) {
                if (class412.method2377(class688.field9635[var10], 17, arg4, var9, arg5, arg3, arg0) <= 0) {
                    class695 var11 = class688.field9635[var10];
                    class688.field9635[var10] = class688.field9635[var8];
                    class688.field9635[var8++] = var11;
                }
            }
            class688.field9635[arg2] = class688.field9635[var8];
            class688.field9635[var8] = var9;
            method1644(arg0, arg1, var8 - 1, arg3, arg4, arg5, (byte) 93);
            method1644(arg0, var8 + 1, arg2, arg3, arg4, arg5, (byte) 53);
        }
        if (arg6 <= 52) {
            field3687 = false;
        }
    }

    @OriginalMember(owner = "client!vea", name = "toString", descriptor = "()Ljava/lang/String;", line = 54)
    public final String toString() {
        field3685++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(I)V", line = 62)
    public static void method1645(int arg0) {
        field3684 = null;
        if (arg0 != 2) {
            field3687 = false;
        }
    }

    @OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(IIII)V", line = 80)
    public class276(int arg0, int arg1, int arg2, int arg3) {
        this.field3680 = arg0;
        this.field3682 = arg2;
        this.field3688 = arg3;
        this.field3686 = arg1;
    }
}
