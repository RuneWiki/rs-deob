import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class229 extends class346 {

    @OriginalMember(owner = "client!og", name = "x", descriptor = "I")
    public static int field3756 = -1;

    @OriginalMember(owner = "client!og", name = "w", descriptor = "Lsf;")
    public static class124 field3755 = new class124(64);

    @OriginalMember(owner = "client!og", name = "z", descriptor = "[Ljava/lang/String;")
    public static String[] field3758 = new String[100];

    @OriginalMember(owner = "client!og", name = "A", descriptor = "Ljava/lang/String;")
    public static String field3759 = "Loading wordpack - ";

    @OriginalMember(owner = "client!og", name = "t", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!og", name = "u", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!og", name = "v", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!og", name = "y", descriptor = "Lek;")
    public static class206 field3757;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIII)I", line = 9)
    public static final int method1589(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & arg1;
        field3753++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 1023 - arg0;
        } else {
            return 1023 - arg3;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Len;III)V", line = 34)
    public static final void method1590(class49 arg0, int arg1, int arg2, int arg3) {
        class82.field1425.method440(-45);
        field3752++;
        if (class9.field280 || arg3 != -1305) {
            return;
        }
        for (class127 var4 = (class127) arg0.method431(0); var4 != null; var4 = (class127) arg0.method439(arg3 ^ 0x6A47)) {
            class1 var5 = class125.method901(var4.field2219, (byte) -29);
            if (class140.method970(var5, arg3 ^ 0xFFFFFA9B)) {
                class182.method1289(arg2, arg1, var5, var4, 69);
                if (var4.field2215) {
                    class35.method252(arg3 ^ 0xFFFFFABF, var4, var5);
                }
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(Z)V", line = 66)
    public static void method1591(boolean arg0) {
        field3755 = null;
        if (arg0) {
            method1589(-101, -108, -30, -123);
        }
        field3759 = null;
        field3758 = null;
        field3757 = null;
    }
}
