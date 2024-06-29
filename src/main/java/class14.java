import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class14 {

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "Le;")
    public static class86 field325 = new class86();

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
    public static int field332 = 1;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
    public static int field331 = -1;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "[Ljd;")
    public static class85[] field330;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILda;)V")
    public static final void method106(int arg0, class22 arg1) {
        field328++;
        class41.field758 = arg1.method186(54, class232.field3895);
        class217.field3640 = arg1.method186(arg0 + 36, class82.field1494);
        class170.field2852 = arg1.method186(arg0 ^ 0x22, class144.field2508);
        class100.field1848 = arg1.method186(arg0 ^ 0x69, class80.field1457);
        if (arg0 != 1) {
            method108(5, 12, false, 87, 103, -45, -16, -99);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
    public static final void method107(int arg0) {
        class161.field2767.method763(0);
        field329++;
        if (arg0 != 1) {
            field332 = 44;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIZIIIII)V")
    public static final void method108(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2) {
            return;
        }
        field327++;
        if (arg7 >= class177.field2953 && arg0 <= class224.field3773 && class100.field1855 <= arg6 && arg1 <= class97.field1816) {
            class75.method565(arg6, arg7, arg0, arg4, -2541, arg5, arg1, arg3);
        } else {
            class29.method260(arg1, (byte) -110, arg7, arg0, arg5, arg3, arg4, arg6);
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V")
    public static void method109(int arg0) {
        field330 = null;
        if (arg0 != 3628) {
            method109(65);
        }
        field325 = null;
    }
}
