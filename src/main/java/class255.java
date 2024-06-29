import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class255 {

    @OriginalMember(owner = "client!fj", name = "n", descriptor = "Z")
    public boolean field3763 = false;

    @OriginalMember(owner = "client!fj", name = "r", descriptor = "[I")
    private int[] field3767 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!fj", name = "v", descriptor = "I")
    public int field3771 = -1;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "[J")
    public static long[] field3760 = new long[1000];

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "[I")
    public static int[] field3755 = new int[14];

    @OriginalMember(owner = "client!fj", name = "s", descriptor = "[I")
    public static int[] field3768 = new int[14];

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!fj", name = "q", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!fj", name = "t", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!fj", name = "w", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!fj", name = "p", descriptor = "Lnb;")
    public static class331 field3765;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3753;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "[I")
    private int[] field3757;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "[S")
    private short[] field3754;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "[S")
    private short[] field3761;

    @OriginalMember(owner = "client!fj", name = "o", descriptor = "[S")
    private short[] field3764;

    @OriginalMember(owner = "client!fj", name = "u", descriptor = "[S")
    private short[] field3770;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)Z", line = 8)
    public final boolean method1759(byte arg0) {
        field3756++;
        if (arg0 != -32) {
            this.method1764(-127);
        }
        if (this.field3757 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field3757.length; var3++) {
            if (!class207.field3278.method953(0, this.field3757[var3], true)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Laj;II)V", line = 46)
    private final void method1760(class1 arg0, int arg1, int arg2) {
        field3750++;
        if (arg1 == 1) {
            this.field3771 = arg0.method15((byte) -72);
        } else if (arg1 == 2) {
            int var8 = arg0.method15((byte) 63);
            this.field3757 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3757[var9] = arg0.method56(19612);
            }
        } else if (arg1 == 3) {
            this.field3763 = true;
        } else if (arg1 == 40) {
            int var6 = arg0.method15((byte) 98);
            this.field3761 = new short[var6];
            this.field3770 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3770[var7] = (short) arg0.method56(arg2 + 19612);
                this.field3761[var7] = (short) arg0.method56(class85.method677(arg2, 19612));
            }
        } else if (arg1 == 41) {
            int var4 = arg0.method15((byte) 61);
            this.field3754 = new short[var4];
            this.field3764 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3764[var5] = (short) arg0.method56(19612);
                this.field3754[var5] = (short) arg0.method56(19612);
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3767[arg1 - 60] = arg0.method56(arg2 + 19612);
        }
        if (arg2 != 0) {
            this.field3754 = (short[]) null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)V", line = 125)
    public static final void method1761(int arg0, int arg1) {
        if (arg1 != -1) {
            field3765 = (class331) null;
        }
        class225.field3481.method2285(arg0, (byte) -6);
        field3772++;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V", line = 137)
    public static void method1762(int arg0) {
        if (arg0 != 1000) {
            return;
        }
        field3755 = null;
        field3760 = null;
        field3753 = null;
        field3765 = null;
        field3768 = null;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZLaj;)V", line = 155)
    public final void method1763(boolean arg0, class1 arg1) {
        field3762++;
        if (!arg0) {
            field3755 = (int[]) null;
        }
        while (true) {
            int var3 = arg1.method15((byte) -14);
            if (var3 == 0) {
                return;
            }
            this.method1760(arg1, var3, 0);
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)Lvi;", line = 181)
    public final class7 method1764(int arg0) {
        field3769++;
        if (this.field3757 == null) {
            return null;
        }
        class7[] var2 = new class7[this.field3757.length];
        for (int var3 = arg0; var3 < this.field3757.length; var3++) {
            var2[var3] = class7.method130(class207.field3278, this.field3757[var3], 0);
        }
        class7 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class7(var2, var2.length);
        }
        if (this.field3770 != null) {
            for (int var5 = 0; var5 < this.field3770.length; var5++) {
                var4.method128(this.field3770[var5], this.field3761[var5]);
            }
        }
        if (this.field3764 != null) {
            for (int var6 = 0; var6 < this.field3764.length; var6++) {
                var4.method107(this.field3764[var6], this.field3754[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(I)Z", line = 243)
    public final boolean method1765(int arg0) {
        field3759++;
        int var2 = -93 % ((-arg0 - 11) / 54);
        boolean var3 = true;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field3767[var4] != -1 && !class207.field3278.method953(0, this.field3767[var4], true)) {
                var3 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(I)Lvi;", line = 271)
    public final class7 method1766(int arg0) {
        if (arg0 != -26417) {
            return (class7) null;
        }
        class7[] var2 = new class7[5];
        field3751++;
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field3767[var4] != -1) {
                var2[var3++] = class7.method130(class207.field3278, this.field3767[var4], 0);
            }
        }
        class7 var5 = new class7(var2, var3);
        if (this.field3770 != null) {
            for (int var6 = 0; var6 < this.field3770.length; var6++) {
                var5.method128(this.field3770[var6], this.field3761[var6]);
            }
        }
        if (this.field3764 != null) {
            for (int var7 = 0; var7 < this.field3764.length; var7++) {
                var5.method107(this.field3764[var7], this.field3754[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)Lbi;", line = 338)
    public static final class91 method1767(int arg0, int arg1, int arg2) {
        field3766++;
        if (arg1 != -1) {
            field3753 = (String) null;
        }
        for (class91 var3 = (class91) class243.field3641.method71((byte) -93); var3 != null; var3 = (class91) class243.field3641.method84(1)) {
            if (var3.field1471 && var3.method718(arg1 - 89, arg0, arg2)) {
                return var3;
            }
        }
        return null;
    }
}
