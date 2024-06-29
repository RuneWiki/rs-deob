import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public abstract class class217 {

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public int field3679;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public int field3671;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public int field3672;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public static int field3677 = 0;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "Lbe;")
    public static class283 field3683 = class153.method941(127, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "Lbe;")
    public static class283 field3684 = class153.method941(126, "zap");

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
    public static int field3682 = 0;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    public static int field3681 = 0;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "Ltf;")
    public static class242 field3678 = new class242(4);

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
    public static int field3686 = 0;

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "Lbe;")
    private static class283 field3687 = class153.method941(-69, "white:");

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "Lbe;")
    public static class283 field3688 = field3687;

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "Lbe;")
    public static class283 field3685 = field3687;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "Lcm;")
    public static class181 field3673;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "[Lnh;")
    public static class107[] field3680;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "[[Z")
    public static boolean[][] field3675;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZIIIIIII)V", line = 32)
    public static final void method1430(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3674++;
        if (!arg1) {
            method1430(65, true, -27, 86, 110, 86, 70, -33, -46);
        }
        if (class92.method588(arg7, -36)) {
            class190.field3251 = null;
            class298.method2018(arg0, class122.field2036[arg7], arg2, -1, arg8, arg3, arg6, arg5, arg4, -1);
            if (class190.field3251 != null) {
                class298.method2018(arg0, class190.field3251, arg2, -1412584499, arg8, arg3, class115.field1921, class68.field971, arg4, -1);
                class190.field3251 = null;
            }
        } else if (arg8 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class201.field3434[var9] = true;
            }
        } else {
            class201.field3434[arg8] = true;
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(III)V", line = 67)
    public class217(int arg0, int arg1, int arg2) {
        this.field3679 = arg0;
        this.field3671 = arg1;
        this.field3672 = arg2;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILek;II)[Lgi;", line = 78)
    public static final class204[] method1431(int arg0, class172 arg1, int arg2, int arg3) {
        field3676++;
        if (class26.method183(true, arg1, arg3, arg0)) {
            if (arg2 != 0) {
                method1433((byte) 10);
            }
            return class27.method187(-10562);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)V", line = 97)
    public static final void method1432(boolean arg0) {
        class262.field4462.method624(arg0);
        field3670++;
        int var1 = class262.field4462.method617((byte) -21, 1);
        if (var1 == 0) {
            return;
        }
        int var2 = class262.field4462.method617((byte) -21, 2);
        if (var2 == 0) {
            class26.field393[class69.field1015++] = 2047;
        } else if (var2 == 1) {
            int var10 = class262.field4462.method617((byte) -21, 3);
            class213.field3624.method461(false, 121, var10);
            int var11 = class262.field4462.method617((byte) -21, 1);
            if (var11 == 1) {
                class26.field393[class69.field1015++] = 2047;
            }
        } else if (var2 == 2) {
            int var3 = class262.field4462.method617((byte) -21, 3);
            class213.field3624.method461(true, -61, var3);
            int var4 = class262.field4462.method617((byte) -21, 3);
            class213.field3624.method461(true, 115, var4);
            int var5 = class262.field4462.method617((byte) -21, 1);
            if (var5 == 1) {
                class26.field393[class69.field1015++] = 2047;
            }
        } else if (var2 == 3) {
            int var6 = class262.field4462.method617((byte) -21, 1);
            if (var6 == 1) {
                class26.field393[class69.field1015++] = 2047;
            }
            int var7 = class262.field4462.method617((byte) -21, 1);
            int var8 = class262.field4462.method617((byte) -21, 7);
            int var9 = class262.field4462.method617((byte) -21, 7);
            class61.field850 = class262.field4462.method617((byte) -21, 2);
            class213.field3624.method1241((byte) -124, var7 == 1, var9, var8);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V", line = 183)
    public static void method1433(byte arg0) {
        field3684 = null;
        field3675 = (boolean[][]) null;
        field3678 = null;
        field3688 = null;
        if (arg0 != -7) {
            field3678 = (class242) null;
        }
        field3673 = null;
        field3687 = null;
        field3683 = null;
        field3680 = null;
        field3685 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)V")
    public abstract void method68(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(III)V")
    public abstract void method67(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZII)V")
    public abstract void method66(boolean arg0, int arg1, int arg2);
}
