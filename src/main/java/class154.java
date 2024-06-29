import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class154 {

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "[I")
    private int[] field2919 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "Z")
    public boolean field2913 = false;

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "I")
    public int field2925 = -1;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "Lli;")
    public static class185 field2921 = class245.method1649("::", -35);

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "I")
    public static int field2923 = -1;

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "I")
    public static int field2927 = -1;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "Lli;")
    public static class185 field2909 = class245.method1649("Titelbild geladen)3", -80);

    @OriginalMember(owner = "client!pj", name = "y", descriptor = "Lli;")
    public static class185 field2929 = class245.method1649("Fermer", 122);

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "Lli;")
    public static class185 field2922 = class245.method1649("Monde de jeu cr-B-B", 126);

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "[I")
    private int[] field2915;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "[Ldd;")
    public static class211[] field2905;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "[S")
    private short[] field2910;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "[S")
    private short[] field2917;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "[S")
    private short[] field2918;

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "[S")
    private short[] field2928;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIIIIBI)V")
    public static final void method1090(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        if (arg8 != 95) {
            field2905 = null;
        }
        if (arg3 >= class207.field3810 && arg3 <= class66.field1163 && class207.field3810 <= arg4 && arg4 <= class66.field1163 && class207.field3810 <= arg1 && class66.field1163 >= arg1 && class207.field3810 <= arg6 && arg6 <= class66.field1163 && arg2 >= class216.field3964 && arg2 <= class113.field2040 && class216.field3964 <= arg7 && class113.field2040 >= arg7 && arg9 >= class216.field3964 && arg9 <= class113.field2040 && arg5 >= class216.field3964 && arg5 <= class113.field2040) {
            class197.method1413((byte) 49, arg6, arg7, arg9, arg5, arg2, arg1, arg3, arg4, arg0);
        } else {
            class73.method478(arg3, arg2, arg5, arg6, arg1, arg4, arg9, arg0, arg8 ^ 0xFFFFFFCE, arg7);
        }
        field2920++;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)Lqc;")
    public final class4 method1091(int arg0) {
        field2914++;
        if (this.field2915 == null) {
            return null;
        }
        class4[] var2 = new class4[this.field2915.length];
        for (int var3 = 0; var3 < this.field2915.length; var3++) {
            var2[var3] = class4.method68(class199.field3650, this.field2915[var3], 0);
        }
        class4 var4;
        if (~var2.length == arg0) {
            var4 = var2[0];
        } else {
            var4 = new class4(var2, var2.length);
        }
        if (this.field2928 != null) {
            for (int var5 = 0; var5 < this.field2928.length; var5++) {
                var4.method56(this.field2928[var5], this.field2917[var5]);
            }
        }
        if (this.field2910 != null) {
            for (int var6 = 0; var6 < this.field2910.length; var6++) {
                var4.method49(this.field2910[var6], this.field2918[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)Z")
    public final boolean method1092(boolean arg0) {
        field2924++;
        boolean var2 = arg0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2919[var3] != -1 && !class199.field3650.method1687(5, 0, this.field2919[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)Lqc;")
    public final class4 method1093(int arg0) {
        field2916++;
        class4[] var2 = new class4[5];
        int var3 = arg0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field2919[var4] != -1) {
                var2[var3++] = class4.method68(class199.field3650, this.field2919[var4], 0);
            }
        }
        class4 var5 = new class4(var2, var3);
        if (this.field2928 != null) {
            for (int var6 = 0; var6 < this.field2928.length; var6++) {
                var5.method56(this.field2928[var6], this.field2917[var6]);
            }
        }
        if (this.field2910 != null) {
            for (int var7 = 0; var7 < this.field2910.length; var7++) {
                var5.method49(this.field2910[var7], this.field2918[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)V")
    public static final void method1094(int arg0, int arg1) {
        field2906++;
        if (arg1 == -1 || !class127.method912(arg1, (byte) -110)) {
            return;
        }
        if (arg0 != 3) {
            field2921 = null;
        }
        class82[] var2 = class136.field2557[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class82 var4 = var2[var3];
            if (var4.field1485 != null) {
                class121 var5 = new class121();
                var5.field2198 = var4.field1485;
                var5.field2196 = var4;
                class54.method374(arg0 ^ 0x3, 2000000, var5);
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(Z)Z")
    public final boolean method1095(boolean arg0) {
        field2911++;
        if (this.field2915 == null) {
            return true;
        }
        boolean var2 = arg0;
        for (int var3 = 0; var3 < this.field2915.length; var3++) {
            if (!class199.field3650.method1687(5, 0, this.field2915[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLli;)V")
    public static final void method1096(byte arg0, class185 arg1) {
        field2907++;
        int var2 = class76.method497(arg1, (byte) 0);
        if (var2 != -1) {
            if (arg0 > -17) {
                field2922 = null;
            }
            class40.method253(-13103, class215.field3955.field3132[var2], class215.field3955.field3142[var2]);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
    public static void method1097(byte arg0) {
        if (arg0 >= -83) {
            field2929 = null;
        }
        field2909 = null;
        field2921 = null;
        field2922 = null;
        field2929 = null;
        field2905 = null;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljd;Z)V")
    public final void method1098(class118 arg0, boolean arg1) {
        if (arg1) {
            this.method1098((class118) null, true);
        }
        while (true) {
            int var3 = arg0.method867(false);
            if (var3 == 0) {
                field2908++;
                return;
            }
            this.method1099(arg0, (byte) -50, var3);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljd;BI)V")
    private final void method1099(class118 arg0, byte arg1, int arg2) {
        if (arg1 != -50) {
            method1097((byte) 17);
        }
        if (arg2 == 1) {
            this.field2925 = arg0.method867(false);
        } else if (arg2 == 2) {
            int var8 = arg0.method867(false);
            this.field2915 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2915[var9] = arg0.method827(255);
            }
        } else if (arg2 == 3) {
            this.field2913 = true;
        } else if (arg2 == 40) {
            int var4 = arg0.method867(false);
            this.field2928 = new short[var4];
            this.field2917 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2928[var5] = (short) arg0.method827(255);
                this.field2917[var5] = (short) arg0.method827(255);
            }
        } else if (arg2 == 41) {
            int var6 = arg0.method867(false);
            this.field2918 = new short[var6];
            this.field2910 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2910[var7] = (short) arg0.method827(arg1 + 305);
                this.field2918[var7] = (short) arg0.method827(class260.method1766(arg1, -207));
            }
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field2919[arg2 - 60] = arg0.method827(255);
        }
        field2912++;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIILbb;Lbb;IIIIJ)V")
    public static final void method1100(int arg0, int arg1, int arg2, int arg3, class75 arg4, class75 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class38 var12 = new class38();
        var12.field597 = arg10;
        var12.field592 = arg1 * 128 + 64;
        var12.field596 = arg2 * 128 + 64;
        var12.field600 = arg3;
        var12.field595 = arg4;
        var12.field594 = arg5;
        var12.field601 = arg6;
        var12.field610 = arg7;
        var12.field609 = arg8;
        var12.field603 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class153.field2896[var13][arg1][arg2] == null) {
                class153.field2896[var13][arg1][arg2] = new class198(var13, arg1, arg2);
            }
        }
        class153.field2896[arg0][arg1][arg2].field3636 = var12;
    }
}
