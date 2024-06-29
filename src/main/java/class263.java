import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public abstract class class263 extends class235 {

    @OriginalMember(owner = "client!qq", name = "C", descriptor = "[C")
    public static char[] field3829 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!qq", name = "E", descriptor = "Z")
    public static boolean field3831 = true;

    @OriginalMember(owner = "client!qq", name = "A", descriptor = "I")
    public static int field3827 = 0;

    @OriginalMember(owner = "client!qq", name = "D", descriptor = "Lsk;")
    public static class169 field3830 = new class169(0, 0);

    @OriginalMember(owner = "client!qq", name = "H", descriptor = "I")
    public static int field3834 = -1;

    @OriginalMember(owner = "client!qq", name = "I", descriptor = "I")
    public static int field3835 = 0;

    @OriginalMember(owner = "client!qq", name = "B", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!qq", name = "F", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!qq", name = "G", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!qq", name = "J", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!qq", name = "K", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IBILvp;)V", line = 13)
    public static final void method1647(int arg0, byte arg1, int arg2, class194 arg3) {
        int var4 = -91 / ((-arg1 - 54) / 56);
        if (arg3.field222 == arg0 && arg0 != -1) {
            class15 var5 = class391.method2551(arg0, (byte) -88);
            int var6 = var5.field166;
            if (var6 == 1) {
                arg3.field231 = arg2;
                arg3.field223 = 0;
                arg3.field212 = 0;
                arg3.field282 = 0;
                arg3.field233 = 1;
                class277.method1770(arg3.field5284, 21155, class100.field1350 == arg3, arg3.field223, arg3.field5298, var5);
            }
            if (var6 == 2) {
                arg3.field282 = 0;
            }
        } else if (arg0 == -1 || arg3.field222 == -1 || class391.method2551(arg0, (byte) -94).field153 >= class391.method2551(arg3.field222, (byte) -121).field153) {
            arg3.field231 = arg2;
            arg3.field233 = 1;
            arg3.field282 = 0;
            arg3.field223 = 0;
            arg3.field222 = arg0;
            arg3.field305 = arg3.field309;
            arg3.field212 = 0;
            if (arg3.field222 != -1) {
                class277.method1770(arg3.field5284, 21155, class100.field1350 == arg3, arg3.field223, arg3.field5298, class391.method2551(arg3.field222, (byte) -97));
            }
        }
        field3836++;
    }

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "(B)V", line = 63)
    public static final void method1648(byte arg0) {
        class28.field494++;
        field3833++;
        if (arg0 >= -14) {
            field3829 = null;
        }
        class232.field3279.method756(0, 36);
        class232.field3279.method1707(-108, 0);
    }

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "(I)V", line = 100)
    public static void method1649(int arg0) {
        field3829 = null;
        if (arg0 != 732) {
            method1649(79);
        }
        field3830 = null;
    }

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method447(int arg0);

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "(I)Z")
    public abstract boolean method451(int arg0);
}
