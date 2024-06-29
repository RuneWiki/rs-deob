import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class202 {

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public int field3639 = -1;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "[I")
    private int[] field3652 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "Z")
    public boolean field3653 = false;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "Z")
    public static boolean field3655 = true;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "Ljd;")
    public static class86 field3649 = class122.method868("Clientscript error )2 check log for details", true);

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "Z")
    public static boolean field3659 = false;

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "Ljd;")
    private static class86 field3657 = class122.method868("Connected to update server", true);

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "Ljd;")
    public static class86 field3656 = field3657;

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "F")
    public static float field3658;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!lf", name = "y", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "[I")
    private int[] field3646;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "[S")
    private short[] field3645;

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "[S")
    private short[] field3651;

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "[S")
    private short[] field3660;

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "[S")
    private short[] field3662;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(JB)Ljd;")
    public static final class86 method1440(long arg0, byte arg1) {
        field3663++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        }
        if (arg1 < 45) {
            method1450(88, (byte) 116);
        }
        if (arg0 % 37L == 0L) {
            return null;
        }
        int var3 = 0;
        for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
            var3++;
        }
        byte[] var6 = new byte[var3];
        while (arg0 != 0L) {
            long var8 = arg0;
            arg0 /= 37L;
            var3--;
            var6[var3] = class143.field2716[(int) (var8 - (arg0 * 37L))];
        }
        class86 var7 = new class86();
        var7.field1670 = var6;
        var7.field1704 = var6.length;
        return var7;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILbj;)V")
    public static final void method1441(int arg0, class151 arg1) {
        class153.field2886 = arg1;
        if (arg0 == 0) {
            field3654++;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)Z")
    public static final boolean method1442(int arg0, int arg1) {
        if (arg0 == 223) {
            field3648++;
            return arg1 == 198 || arg1 == 230 || arg1 == 156 || arg1 == 140 || arg1 == 223;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILqk;)V")
    public final void method1443(int arg0, class200 arg1) {
        if (arg0 >= -2) {
            this.method1445((byte) 43);
        }
        while (true) {
            int var3 = arg1.method1408((byte) -87);
            if (var3 == 0) {
                field3647++;
                return;
            }
            this.method1444(arg1, false, var3);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lqk;ZI)V")
    private final void method1444(class200 arg0, boolean arg1, int arg2) {
        field3643++;
        if (arg1) {
            field3659 = true;
        }
        if (arg2 == 1) {
            this.field3639 = arg0.method1408((byte) -23);
        } else if (arg2 == 2) {
            int var4 = arg0.method1408((byte) -91);
            this.field3646 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3646[var5] = arg0.method1410(-94);
            }
        } else if (arg2 == 3) {
            this.field3653 = true;
        } else if (arg2 == 40) {
            int var6 = arg0.method1408((byte) -37);
            this.field3660 = new short[var6];
            this.field3662 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3660[var7] = (short) arg0.method1410(-81);
                this.field3662[var7] = (short) arg0.method1410(-124);
            }
        } else if (arg2 == 41) {
            int var8 = arg0.method1408((byte) -66);
            this.field3651 = new short[var8];
            this.field3645 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3651[var9] = (short) arg0.method1410(-54);
                this.field3645[var9] = (short) arg0.method1410(-95);
            }
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field3652[arg2 - 60] = arg0.method1410(-121);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)Lsi;")
    public final class192 method1445(byte arg0) {
        field3650++;
        if (this.field3646 == null) {
            return null;
        }
        class192[] var2 = new class192[this.field3646.length];
        for (int var3 = 0; var3 < this.field3646.length; var3++) {
            var2[var3] = class192.method1339(class46.field1020, this.field3646[var3], 0);
        }
        int var4 = 7 / ((-arg0 - 43) / 56);
        class192 var5;
        if (var2.length == 1) {
            var5 = var2[0];
        } else {
            var5 = new class192(var2, var2.length);
        }
        if (this.field3660 != null) {
            for (int var6 = 0; var6 < this.field3660.length; var6++) {
                var5.method1318(this.field3660[var6], this.field3662[var6]);
            }
        }
        if (this.field3651 != null) {
            for (int var7 = 0; var7 < this.field3651.length; var7++) {
                var5.method1342(this.field3651[var7], this.field3645[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)Lsi;")
    public final class192 method1446(int arg0) {
        field3661++;
        class192[] var2 = new class192[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field3652[var4] != -1) {
                var2[var3++] = class192.method1339(class46.field1020, this.field3652[var4], 0);
            }
        }
        class192 var5 = new class192(var2, var3);
        if (arg0 != 18269) {
            method1440(-46L, (byte) -53);
        }
        if (this.field3660 != null) {
            for (int var6 = 0; var6 < this.field3660.length; var6++) {
                var5.method1318(this.field3660[var6], this.field3662[var6]);
            }
        }
        if (this.field3651 != null) {
            for (int var7 = 0; var7 < this.field3651.length; var7++) {
                var5.method1342(this.field3651[var7], this.field3645[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)Z")
    public final boolean method1447(int arg0) {
        field3641++;
        boolean var2 = true;
        for (int var3 = arg0; var3 < 5; var3++) {
            if (this.field3652[var3] != -1 && !class46.field1020.method1076(0, this.field3652[var3], true)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)V")
    public static void method1448(int arg0) {
        if (arg0 != -141) {
            field3658 = -0.90355426F;
        }
        field3656 = null;
        field3649 = null;
        field3657 = null;
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)Z")
    public final boolean method1449(int arg0) {
        field3640++;
        if (this.field3646 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field3646.length; var3++) {
            if (!class46.field1020.method1076(0, this.field3646[var3], true)) {
                var2 = false;
            }
        }
        if (arg0 != -42) {
            field3659 = true;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)Z")
    public static final boolean method1450(int arg0, byte arg1) {
        field3644++;
        if (arg1 < 70) {
            method1450(-120, (byte) -71);
        }
        return (arg0 >> 21 & 0x1) != 0;
    }
}
