import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class158 {

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "Z")
    public boolean field2685 = false;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "I")
    public int field2681 = -1;

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "[I")
    private int[] field2687 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "[C")
    public static char[] field2670 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
    public static int field2679 = 1;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2680 = "Loaded wordpack";

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "[I")
    private int[] field2669;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "[S")
    private short[] field2674;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "[S")
    private short[] field2682;

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "[S")
    private short[] field2684;

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "[S")
    private short[] field2688;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)Z", line = 13)
    public final boolean method1133(int arg0) {
        field2677++;
        if (this.field2669 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field2669.length; var3++) {
            if (!class140.field2363.method1421(this.field2669[var3], 0, -26)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I[Lwl;)V", line = 40)
    public static final void method1134(int arg0, class102[] arg1) {
        class197.field3294[arg0] = arg1;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)Ltc;", line = 44)
    public final class48 method1135(int arg0) {
        field2683++;
        int var2 = 0;
        class48[] var3 = new class48[5];
        if (arg0 != 22334) {
            return (class48) null;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field2687[var4] != -1) {
                var3[var2++] = class48.method401(class140.field2363, this.field2687[var4], 0);
            }
        }
        class48 var5 = new class48(var3, var2);
        if (this.field2684 != null) {
            for (int var6 = 0; var6 < this.field2684.length; var6++) {
                var5.method410(this.field2684[var6], this.field2682[var6]);
            }
        }
        if (this.field2688 != null) {
            for (int var7 = 0; var7 < this.field2688.length; var7++) {
                var5.method400(this.field2688[var7], this.field2674[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIBI)V", line = 103)
    public static final void method1136(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field2686++;
        int var7 = arg3 - arg6;
        int var8 = arg2 + arg6;
        if (arg5 != 97) {
            method1134(102, (class102[]) null);
        }
        int var9 = arg0 + arg6;
        for (int var10 = arg2; var10 < var8; var10++) {
            class344.method2417(class232.field3799[var10], arg0, arg4, arg1, (byte) -122);
        }
        int var11 = arg4 - arg6;
        for (int var12 = arg3; var12 > var7; var12--) {
            class344.method2417(class232.field3799[var12], arg0, arg4, arg1, (byte) -125);
        }
        for (int var13 = var8; var13 <= var7; var13++) {
            int[] var14 = class232.field3799[var13];
            class344.method2417(var14, arg0, var9, arg1, (byte) -124);
            class344.method2417(var14, var11, arg4, arg1, (byte) -124);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)V", line = 147)
    public static void method1137(boolean arg0) {
        if (!arg0) {
            field2670 = null;
            field2680 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V", line = 158)
    public static final void method1138(byte arg0) {
        class173.field2874.method895(128);
        if (arg0 > 88) {
            class235.field3846.method895(128);
            field2678++;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLoe;I)V", line = 172)
    private final void method1139(byte arg0, class146 arg1, int arg2) {
        if (arg0 != -100) {
            return;
        }
        if (arg2 == 1) {
            this.field2681 = arg1.method1005((byte) 122);
        } else if (arg2 == 2) {
            int var8 = arg1.method1005((byte) 122);
            this.field2669 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2669[var9] = arg1.method989(100);
            }
        } else if (arg2 == 3) {
            this.field2685 = true;
        } else if (arg2 == 40) {
            int var6 = arg1.method1005((byte) 122);
            this.field2684 = new short[var6];
            this.field2682 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2684[var7] = (short) arg1.method989(116);
                this.field2682[var7] = (short) arg1.method989(90);
            }
        } else if (arg2 == 41) {
            int var4 = arg1.method1005((byte) 122);
            this.field2674 = new short[var4];
            this.field2688 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2688[var5] = (short) arg1.method989(95);
                this.field2674[var5] = (short) arg1.method989(102);
            }
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field2687[arg2 - 60] = arg1.method989(arg0 + 169);
        }
        field2672++;
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)Ltc;", line = 257)
    public final class48 method1140(int arg0) {
        field2676++;
        if (this.field2669 == null) {
            return null;
        }
        class48[] var2 = new class48[this.field2669.length];
        for (int var3 = 0; var3 < this.field2669.length; var3++) {
            var2[var3] = class48.method401(class140.field2363, this.field2669[var3], 0);
        }
        if (arg0 <= 90) {
            return (class48) null;
        }
        class48 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class48(var2, var2.length);
        }
        if (this.field2684 != null) {
            for (int var5 = 0; var5 < this.field2684.length; var5++) {
                var4.method410(this.field2684[var5], this.field2682[var5]);
            }
        }
        if (this.field2688 != null) {
            for (int var6 = 0; var6 < this.field2688.length; var6++) {
                var4.method400(this.field2688[var6], this.field2674[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIII)V", line = 314)
    public static final void method1141(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2673++;
        if (arg1 != -9590) {
            return;
        }
        class199 var5 = class173.method1231(false, 4, arg4);
        var5.method1367((byte) 106);
        var5.field3338 = arg3;
        var5.field3340 = arg0;
        var5.field3343 = arg2;
    }

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "(I)Z", line = 335)
    public final boolean method1142(int arg0) {
        field2671++;
        if (arg0 != 97) {
            field2680 = (String) null;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2687[var3] != -1 && !class140.field2363.method1421(this.field2687[var3], 0, arg0 - 204)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Loe;I)V", line = 361)
    public final void method1143(class146 arg0, int arg1) {
        if (arg1 != 1039) {
            method1136(-82, 85, 104, 125, 88, (byte) 41, -128);
        }
        while (true) {
            int var3 = arg0.method1005((byte) 122);
            if (var3 == 0) {
                field2675++;
                return;
            }
            this.method1139((byte) -100, arg0, var3);
        }
    }
}
