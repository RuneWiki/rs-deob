import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class163 implements class13 {

    @OriginalMember(owner = "client!hg", name = "N", descriptor = "I")
    private int field2814 = 50;

    @OriginalMember(owner = "client!hg", name = "y", descriptor = "Z")
    private boolean field2800 = false;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "Ldj;")
    private class314 field2781;

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "Ldj;")
    private class314 field2790;

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "Ltb;")
    private class210 field2793;

    @OriginalMember(owner = "client!hg", name = "G", descriptor = "Ltb;")
    private class210 field2808;

    @OriginalMember(owner = "client!hg", name = "P", descriptor = "[Z")
    private boolean[] field2816;

    @OriginalMember(owner = "client!hg", name = "v", descriptor = "[B")
    private byte[] field2797;

    @OriginalMember(owner = "client!hg", name = "H", descriptor = "[Z")
    private boolean[] field2809;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "[Z")
    private boolean[] field2788;

    @OriginalMember(owner = "client!hg", name = "O", descriptor = "[Z")
    private boolean[] field2815;

    @OriginalMember(owner = "client!hg", name = "F", descriptor = "[B")
    private byte[] field2807;

    @OriginalMember(owner = "client!hg", name = "t", descriptor = "[S")
    private short[] field2795;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "[B")
    private byte[] field2787;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "[B")
    private byte[] field2778;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "[Z")
    private boolean[] field2780;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "[Lmh;")
    public static class128[] field2777 = new class128[100];

    @OriginalMember(owner = "client!hg", name = "w", descriptor = "Ls;")
    public static class261 field2798 = new class261(500);

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!hg", name = "x", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!hg", name = "A", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!hg", name = "B", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!hg", name = "C", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!hg", name = "D", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!hg", name = "E", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!hg", name = "I", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!hg", name = "J", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!hg", name = "L", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!hg", name = "M", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!hg", name = "Q", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!hg", name = "u", descriptor = "Lcf;")
    public static class123 field2796;

    @OriginalMember(owner = "client!hg", name = "z", descriptor = "Ljava/lang/String;")
    public static String field2801;

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "(II)Lha;", line = 12)
    private final class291 method1069(int arg0, int arg1) {
        field2784++;
        class291 var3 = (class291) this.field2808.method1443((long) arg0, false);
        if (var3 == null) {
            class291 var4 = new class291(this.field2795[arg0] & arg1);
            this.field2808.method1442(-1, (long) arg0, var4);
            return var4;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BI)Z", line = 27)
    public final boolean method103(byte arg0, int arg1) {
        class147 var3 = this.method1071(arg1, 123);
        field2817++;
        if (var3 == null) {
            return false;
        } else {
            int var4 = -30 % ((68 - arg0) / 56);
            return var3.method988(this, this.field2790, (byte) 114);
        }
    }

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "(II)I", line = 51)
    public final int method101(int arg0, int arg1) {
        field2794++;
        int var3 = 34 / ((40 - arg1) / 56);
        return this.field2807[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)I", line = 73)
    public final int method96(int arg0, int arg1) {
        field2783++;
        if (arg0 != 255) {
            this.field2808 = (class210) null;
        }
        return this.field2787[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lmh;I)I", line = 84)
    public static final int method1070(class128 arg0, int arg1) {
        field2782++;
        if (class144.field2465 == null || arg0.method865((byte) -87) == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < class144.field2465.field1047; var2++) {
            if (class144.field2465.field1049[var2].method842(class207.field3635, 0, class54.field1054).method822(12806, arg0)) {
                return var2;
            }
        }
        if (arg1 != -1) {
            method1072((byte) 54, 62, -76, (class314) null);
        }
        return -1;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IFB)[I", line = 110)
    public final int[] method94(int arg0, float arg1, byte arg2) {
        field2810++;
        if (arg2 != -53) {
            this.field2808 = (class210) null;
        }
        class147 var4 = this.method1071(arg0, 118);
        if (var4 == null) {
            return null;
        } else {
            var4.field2533 = true;
            return var4.method986(this.field2800 || this.field2815[arg0], this.field2790, -21028, this, arg1);
        }
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(IB)Z", line = 129)
    public final boolean method105(int arg0, byte arg1) {
        if (arg1 <= 13) {
            this.field2788 = (boolean[]) null;
        }
        field2789++;
        return this.field2780[arg0];
    }

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "(II)Lll;", line = 142)
    private final class147 method1071(int arg0, int arg1) {
        field2811++;
        class147 var3 = (class147) this.field2793.method1443((long) arg0, false);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field2781.method2155(0, arg0, (byte) 70);
        if (arg1 <= 109) {
            this.method98(67, -2);
        }
        if (var4 == null) {
            return null;
        } else {
            class194 var5 = new class194(var4);
            class147 var6 = new class147(var5);
            this.field2793.method1442(-1, (long) arg0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BIILdj;)Lvd;", line = 168)
    public static final class127 method1072(byte arg0, int arg1, int arg2, class314 arg3) {
        field2804++;
        if (class118.method708(-2, arg1, arg3, arg2)) {
            if (arg0 != -22) {
                method1077((class314) null, 24, -117, 54);
            }
            return class116.method699(5);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IB)Z", line = 188)
    public final boolean method95(int arg0, byte arg1) {
        field2803++;
        int var3 = -20 % ((67 - arg1) / 54);
        return this.field2816[arg0];
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZI)V", line = 203)
    public final void method1073(boolean arg0, int arg1) {
        field2792++;
        this.field2800 = arg0;
        this.method1076((byte) -97);
        if (arg1 != 0) {
            this.field2790 = (class314) null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(II)Z", line = 216)
    public final boolean method100(int arg0, int arg1) {
        field2813++;
        return arg0 == 0 ? this.field2788[arg1] : false;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(II)I", line = 228)
    public final int method97(int arg0, int arg1) {
        field2791++;
        return arg1 == 0 ? this.field2795[arg0] & 0xFFFF : 26;
    }

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "(II)V", line = 239)
    public final void method1074(int arg0, int arg1) {
        field2799++;
        if (arg1 != 0) {
            this.field2816 = (boolean[]) null;
        }
        for (class147 var3 = (class147) this.field2793.method1450(true); var3 != null; var3 = (class147) this.field2793.method1449(0)) {
            if (var3.field2533) {
                var3.method987((byte) 84, arg0);
                var3.field2533 = false;
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(II)Z", line = 264)
    public final boolean method98(int arg0, int arg1) {
        field2779++;
        if (this.field2800 || this.field2815[arg1]) {
            return true;
        } else {
            if (arg0 != 0) {
                method1077((class314) null, -97, 78, 5);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V", line = 279)
    public static void method1075(int arg0) {
        field2796 = null;
        if (arg0 != 1) {
            method1070((class128) null, 54);
        }
        field2801 = null;
        field2777 = null;
        field2798 = null;
    }

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "(II)I", line = 293)
    public final int method104(int arg0, int arg1) {
        field2806++;
        int var3 = 33 % ((arg0 + 8) / 37);
        return this.field2797[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V", line = 303)
    public final void method1076(byte arg0) {
        this.field2793.method1451(20650);
        if (this.field2808 != null) {
            this.field2808.method1451(20650);
        }
        field2812++;
        int var2 = 25 / ((-arg0 - 47) / 49);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ldj;III)Lqg;", line = 318)
    public static final class231 method1077(class314 arg0, int arg1, int arg2, int arg3) {
        field2802++;
        if (class118.method708(-2, arg1, arg0, arg3)) {
            return arg2 == -1 ? class210.method1448((byte) -67) : (class231) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(IB)V", line = 333)
    public final void method99(int arg0, byte arg1) {
        boolean var3 = false;
        field2805++;
        class217.method1498((byte) -29, this.field2787[arg0] & 0xFF, this.field2807[arg0] & 0xFF);
        class147 var4 = this.method1071(arg0, 123);
        if (var4 != null) {
            var3 = var4.method990(1, this.field2800 || this.field2815[arg0], this, this.field2790);
        }
        if (!var3) {
            class291 var5 = this.method1069(arg0, 65535);
            var5.method2004(1);
        }
        int var6 = 91 / ((arg1 - 40) / 45);
    }

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "(II)I", line = 364)
    public final int method102(int arg0, int arg1) {
        field2785++;
        if (arg1 != -24769) {
            this.method1069(-4, -91);
        }
        return this.field2778[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Ldj;Ldj;Ldj;IZ)V", line = 427)
    public class163(class314 arg0, class314 arg1, class314 arg2, int arg3, boolean arg4) {
        this.field2781 = arg0;
        this.field2790 = arg2;
        this.field2814 = arg3;
        this.field2800 = arg4;
        this.field2793 = new class210(this.field2814);
        if (class247.field4247) {
            this.field2808 = new class210(this.field2814);
        } else {
            this.field2808 = null;
        }
        class194 var6 = new class194(arg1.method2155(0, 0, (byte) 70));
        int var7 = var6.method1308(-51);
        this.field2816 = new boolean[var7];
        this.field2797 = new byte[var7];
        this.field2809 = new boolean[var7];
        this.field2788 = new boolean[var7];
        this.field2815 = new boolean[var7];
        this.field2807 = new byte[var7];
        this.field2795 = new short[var7];
        this.field2787 = new byte[var7];
        this.field2778 = new byte[var7];
        this.field2780 = new boolean[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field2809[var8] = var6.method1325(7627) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field2809[var9]) {
                this.field2780[var9] = var6.method1325(7627) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field2809[var10]) {
                this.field2788[var10] = var6.method1325(7627) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field2809[var11]) {
                this.field2815[var11] = var6.method1325(7627) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field2809[var12]) {
                this.field2816[var12] = var6.method1325(7627) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field2809[var13]) {
                this.field2778[var13] = var6.method1326((byte) 94);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field2809[var14]) {
                this.field2797[var14] = var6.method1326((byte) 92);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field2809[var15]) {
                this.field2807[var15] = var6.method1326((byte) 113);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field2809[var16]) {
                this.field2787[var16] = var6.method1326((byte) 126);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field2809[var17]) {
                this.field2795[var17] = (short) var6.method1308(-79);
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(BI)V", line = 384)
    public final void method1078(byte arg0, int arg1) {
        field2776++;
        this.field2814 = arg1;
        if (arg0 != -91) {
            this.field2788 = (boolean[]) null;
        }
        this.field2793 = new class210(this.field2814);
        if (class247.field4247) {
            this.field2808 = new class210(this.field2814);
        } else {
            this.field2808 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "(II)[I", line = 401)
    public final int[] method106(int arg0, int arg1) {
        field2786++;
        if (arg1 == 3578) {
            class147 var3 = this.method1071(arg0, arg1 - 3464);
            return var3 == null ? null : var3.method992(this.field2790, -5609, this, this.field2800 || this.field2815[arg0]);
        } else {
            return (int[]) null;
        }
    }
}
