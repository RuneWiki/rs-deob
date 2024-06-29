import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class66 {

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    private int field923 = 0;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "Z")
    public boolean field925 = false;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public int field929 = -1;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    private int field937 = 128;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    private int field939 = 0;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    private int field933 = 128;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    private int field932 = 0;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "Z")
    public boolean field927 = false;

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "[Z")
    public static boolean[] field944 = new boolean[5];

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public int field930;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
    private int field940;

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "Ljj;")
    public static class134 field934;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "[I")
    public static int[] field931;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "[S")
    private short[] field926;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "[S")
    private short[] field935;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "[S")
    private short[] field941;

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "[S")
    private short[] field942;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BLhi;)V")
    public final void method524(byte arg0, class264 arg1) {
        field924++;
        int var3 = -9 % ((71 - arg0) / 35);
        while (true) {
            int var4 = arg1.method1779(-126);
            if (var4 == 0) {
                return;
            }
            this.method528(4935, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIILli;Lli;IIIIJ)V")
    public static final void method525(int arg0, int arg1, int arg2, int arg3, class197 arg4, class197 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class195 var12 = new class195();
        var12.field3157 = arg10;
        var12.field3152 = arg1 * 128 + 64;
        var12.field3148 = arg2 * 128 + 64;
        var12.field3154 = arg3;
        var12.field3149 = arg4;
        var12.field3159 = arg5;
        var12.field3153 = arg6;
        var12.field3156 = arg7;
        var12.field3147 = arg8;
        var12.field3151 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class273.field4415[var13][arg1][arg2] == null) {
                class273.field4415[var13][arg1][arg2] = new class99(var13, arg1, arg2);
            }
        }
        class273.field4415[arg0][arg1][arg2].field1494 = var12;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIZI)Lue;")
    public final class13 method526(int arg0, int arg1, boolean arg2, int arg3) {
        class13 var5 = (class13) class25.field310.method1839((byte) 64, (long) this.field930);
        field922++;
        if (var5 == null) {
            class158 var6 = class158.method1076(class238.field3805, this.field940, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field935 != null) {
                for (int var7 = 0; var7 < this.field935.length; var7++) {
                    var6.method1089(this.field935[var7], this.field926[var7]);
                }
            }
            if (this.field942 != null) {
                for (int var8 = 0; var8 < this.field942.length; var8++) {
                    var6.method1065(this.field942[var8], this.field941[var8]);
                }
            }
            var5 = var6.method1090(this.field932 + 64, 850 - -this.field939, -30, -50, -30);
            class25.field310.method1830((long) this.field930, -54, var5);
        }
        if (arg2) {
            this.field940 = -27;
        }
        class13 var9;
        if (this.field929 == -1 || arg0 == -1) {
            var9 = var5.method96(true, true, true);
        } else {
            var9 = class267.method1812((byte) 89, this.field929).method142(arg3, var5, arg0, 54, arg1);
        }
        if (this.field933 != 128 || this.field937 != 128) {
            var9.method81(this.field933, this.field937, this.field933);
        }
        if (this.field923 != 0) {
            if (this.field923 == 90) {
                var9.method90();
            }
            if (this.field923 == 180) {
                var9.method97();
            }
            if (this.field923 == 270) {
                var9.method92();
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
    public static void method527(byte arg0) {
        field944 = null;
        if (arg0 >= 19) {
            field934 = null;
            field931 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILhi;I)V")
    private final void method528(int arg0, class264 arg1, int arg2) {
        if (arg2 == 1) {
            this.field940 = arg1.method1777(-79);
        } else if (arg2 == 2) {
            this.field929 = arg1.method1777(-52);
        } else if (arg2 == 4) {
            this.field933 = arg1.method1777(-91);
        } else if (arg2 == 5) {
            this.field937 = arg1.method1777(-52);
        } else if (arg2 == 6) {
            this.field923 = arg1.method1777(-49);
        } else if (arg2 == 7) {
            this.field932 = arg1.method1779(-108);
        } else if (arg2 == 8) {
            this.field939 = arg1.method1779(-73);
        } else if (arg2 == 9) {
            this.field927 = true;
        } else if (arg2 == 10) {
            this.field925 = true;
        } else if (arg2 == 40) {
            int var4 = arg1.method1779(-84);
            this.field935 = new short[var4];
            this.field926 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field935[var5] = (short) arg1.method1777(-113);
                this.field926[var5] = (short) arg1.method1777(-123);
            }
        } else if (arg2 == 41) {
            int var6 = arg1.method1779(-102);
            this.field941 = new short[var6];
            this.field942 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field942[var7] = (short) arg1.method1777(-113);
                this.field941[var7] = (short) arg1.method1777(arg0 - 5032);
            }
        }
        field928++;
        if (arg0 != 4935) {
            this.method528(-75, (class264) null, -50);
        }
    }
}
