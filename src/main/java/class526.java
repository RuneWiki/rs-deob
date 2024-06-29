import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class526 extends class423 {

    @OriginalMember(owner = "client!fv", name = "C", descriptor = "B")
    public byte field7684 = 5;

    @OriginalMember(owner = "client!fv", name = "E", descriptor = "F")
    public static float field7686 = 0.0F;

    @OriginalMember(owner = "client!fv", name = "z", descriptor = "I")
    public static int field7681 = 0;

    @OriginalMember(owner = "client!fv", name = "v", descriptor = "Z")
    public static boolean field7677 = false;

    @OriginalMember(owner = "client!fv", name = "u", descriptor = "I")
    public int field7676;

    @OriginalMember(owner = "client!fv", name = "w", descriptor = "I")
    public int field7678;

    @OriginalMember(owner = "client!fv", name = "x", descriptor = "I")
    public int field7679;

    @OriginalMember(owner = "client!fv", name = "y", descriptor = "I")
    public int field7680;

    @OriginalMember(owner = "client!fv", name = "A", descriptor = "I")
    public int field7682;

    @OriginalMember(owner = "client!fv", name = "B", descriptor = "I")
    public int field7683;

    @OriginalMember(owner = "client!fv", name = "F", descriptor = "I")
    public static int field7687;

    @OriginalMember(owner = "client!fv", name = "t", descriptor = "Lo;")
    public static class359 field7675;

    @OriginalMember(owner = "client!fv", name = "D", descriptor = "Z")
    public boolean field7685;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(BLza;Ltf;)I", line = 10)
    public static final int method3118(byte arg0, class295 arg1, class534 arg2) {
        field7687++;
        int var3 = -41 % ((arg0 + 21) / 47);
        if (arg2.field7856 != -1) {
            return arg2.field7856;
        }
        if (arg2.field7853 != -1) {
            class249 var4 = arg1.field3988.method914(false, arg1.method551() ? arg2.field7853 : arg2.field7863);
            if (!var4.field3391) {
                return var4.field3377;
            }
        }
        return arg2.field7857;
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)V", line = 38)
    public static void method3119(int arg0) {
        field7675 = null;
        if (arg0 != 0) {
            field7675 = null;
        }
    }
}
