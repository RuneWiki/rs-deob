import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class539 {

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "Z")
    public static boolean field7752 = false;

    @OriginalMember(owner = "client!vs", name = "f", descriptor = "[Lul;")
    public static class523[] field7756 = new class523[34];

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "[Lam;")
    public static class576[] field7754 = new class576[14];

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "Lkfa;")
    public static class549 field7753 = new class549(16, 8);

    @OriginalMember(owner = "client!vs", name = "i", descriptor = "Lfv;")
    public static class108 field7759 = new class108(9, 0, 4, 1);

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "I")
    public static int field7751;

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "I")
    public static int field7755;

    @OriginalMember(owner = "client!vs", name = "g", descriptor = "I")
    public static int field7757;

    @OriginalMember(owner = "client!vs", name = "h", descriptor = "Ljo;")
    public static class303 field7758;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IZI)V", line = 4)
    public static final void method3069(int arg0, boolean arg1, int arg2) {
        field7757++;
        class530 var3 = class242.method1402(-83, 5, arg2);
        if (arg1) {
            method3072(3);
        }
        var3.method3025((byte) -69);
        var3.field7593 = arg0;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(ZLjo;Ljava/lang/String;I)Lkh;", line = 24)
    public static final class15 method3070(boolean arg0, class303 arg1, String arg2, int arg3) {
        field7751++;
        int var4 = arg1.method1716(true, arg2);
        if (var4 == -1) {
            return new class15(0);
        }
        int[] var5 = arg1.method1708(var4, (byte) -99);
        class15 var6 = new class15(var5.length);
        int var7 = 0;
        int var8 = 0;
        if (arg3 != 7974) {
            return null;
        }
        while (true) {
            while (var6.field137 > var7) {
                class452 var9 = new class452(arg1.method1719(var5[var8++], var4, 4));
                int var10 = var9.method2575((byte) -48);
                int var11 = var9.method2574(arg3 - 1758468222);
                int var12 = var9.method2541(arg3 - 7917);
                if (!arg0 && var12 == 1) {
                    var6.field137--;
                } else {
                    var6.field139[var7] = var10;
                    var6.field138[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IB)V", line = 71)
    public static final void method3071(int arg0, byte arg1) {
        if (arg1 >= -47) {
            field7758 = null;
        }
        if (class19.field176 == 1) {
            class323.field4204 = arg0;
        } else if (class19.field176 == 2 || class19.field176 == 3) {
            class98.field1083 = arg0;
        }
        field7755++;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V", line = 89)
    public static void method3072(int arg0) {
        field7759 = null;
        field7754 = null;
        field7756 = null;
        field7758 = null;
        field7753 = null;
        if (arg0 != 1) {
            field7756 = null;
        }
    }
}
