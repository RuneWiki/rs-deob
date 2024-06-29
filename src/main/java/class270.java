import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tia")
public class class270 extends class55 {

    @OriginalMember(owner = "client!tia", name = "o", descriptor = "Lkba;")
    public class108 field3567 = new class108();

    @OriginalMember(owner = "client!tia", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field3568 = new String[100];

    @OriginalMember(owner = "client!tia", name = "n", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3566 = new BigInteger("87d2c867cb1ce29ac740deea9b15092fe92b9bb7daa489ad025ea95852070fac17ae66144119f134f0ae13236b003a8399f8ff59e9c857b81c4ef765ee48b7d7", 16);

    @OriginalMember(owner = "client!tia", name = "q", descriptor = "Llga;")
    public static class712 field3569 = new class712(33, 3);

    @OriginalMember(owner = "client!tia", name = "r", descriptor = "[I")
    public static int[] field3570 = new int[32];

    @OriginalMember(owner = "client!tia", name = "s", descriptor = "[[I")
    public static int[][] field3571 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!tia", name = "k", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!tia", name = "l", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!tia", name = "m", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(I)V", line = 4)
    public static void method1613(int arg0) {
        field3568 = null;
        field3566 = null;
        field3570 = null;
        field3571 = null;
        if (arg0 != 5) {
            method1615(-23, 5);
        }
        field3569 = null;
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(Lsba;Z)V", line = 22)
    public static final void method1614(class218 arg0, boolean arg1) {
        field3563++;
        class218 var2 = class463.method2580(arg1, arg0);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class512.field6932;
            var4 = class546.field7710;
        } else {
            var3 = var2.field2718;
            var4 = var2.field2781;
        }
        class531.method2939(var3, var4, 1375731712, arg0, false);
        class42.method254(var4, var3, arg0, 115);
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(II)Lfp;", line = 47)
    public static final class327 method1615(int arg0, int arg1) {
        field3565++;
        if (arg1 != 14883) {
            field3570 = null;
        }
        class327 var2 = (class327) class358.field4752.method1571(-126, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class495.field6741.method2885(arg0, 0, false);
        class327 var4 = new class327();
        if (var3 != null) {
            var4.method1945(-62, new class611(var3));
        }
        var4.method1948((byte) 115);
        class358.field4752.method1574((long) arg0, var4, (byte) -80);
        return var4;
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(BILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 89)
    public static final void method1616(byte arg0, int arg1, String arg2, int arg3, String arg4, String arg5, String arg6) {
        field3564++;
        class291.method1735(arg6, arg1, arg5, arg2, -1, null, (byte) -99, arg3, arg4);
        int var7 = -101 / ((-arg0 - 33) / 63);
    }
}
