import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class162 extends class161 {

    @OriginalMember(owner = "client!sg", name = "z", descriptor = "I")
    public int field2840 = 0;

    @OriginalMember(owner = "client!sg", name = "F", descriptor = "[Ll;")
    public class160[] field2845 = new class160[5];

    @OriginalMember(owner = "client!sg", name = "G", descriptor = "[I")
    public int[] field2846 = new int[5];

    @OriginalMember(owner = "client!sg", name = "I", descriptor = "I")
    public int field2848;

    @OriginalMember(owner = "client!sg", name = "E", descriptor = "I")
    public int field2844;

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "I")
    public int field2834;

    @OriginalMember(owner = "client!sg", name = "L", descriptor = "I")
    public int field2851;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "Lp;")
    public static class280 field2830 = class18.method140((byte) -126, ")4l=");

    @OriginalMember(owner = "client!sg", name = "Q", descriptor = "Lsb;")
    public static class221 field2856 = new class221(5);

    @OriginalMember(owner = "client!sg", name = "S", descriptor = "I")
    public static int field2858 = 0;

    @OriginalMember(owner = "client!sg", name = "R", descriptor = "I")
    public static int field2857 = 0;

    @OriginalMember(owner = "client!sg", name = "T", descriptor = "Lp;")
    public static class280 field2859 = class18.method140((byte) -127, "<img=0>");

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "I")
    public int field2836;

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "I")
    public int field2838;

    @OriginalMember(owner = "client!sg", name = "A", descriptor = "I")
    public int field2841;

    @OriginalMember(owner = "client!sg", name = "K", descriptor = "I")
    public int field2850;

    @OriginalMember(owner = "client!sg", name = "O", descriptor = "I")
    public int field2854;

    @OriginalMember(owner = "client!sg", name = "C", descriptor = "Lsg;")
    public class162 field2842;

    @OriginalMember(owner = "client!sg", name = "J", descriptor = "Lek;")
    public class163 field2849;

    @OriginalMember(owner = "client!sg", name = "H", descriptor = "Lae;")
    public class169 field2847;

    @OriginalMember(owner = "client!sg", name = "D", descriptor = "Lt;")
    public class196 field2843;

    @OriginalMember(owner = "client!sg", name = "y", descriptor = "Lsc;")
    public class245 field2839;

    @OriginalMember(owner = "client!sg", name = "M", descriptor = "Lsj;")
    public class49 field2852;

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "Lqc;")
    public class63 field2837;

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "Z")
    public boolean field2835;

    @OriginalMember(owner = "client!sg", name = "N", descriptor = "Z")
    public boolean field2853;

    @OriginalMember(owner = "client!sg", name = "P", descriptor = "Z")
    public boolean field2855;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "(I)V")
    public static void method1149(int arg0) {
        field2859 = null;
        field2856 = null;
        if (arg0 == 5) {
            field2830 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZZ)V")
    public static final void method1150(boolean arg0, boolean arg1) {
        int var2 = class90.field1472.length;
        field2832++;
        byte[][] var3 = class89.field1438;
        int var4 = 0;
        if (arg0) {
            method1149(-31);
        }
        while (var4 < var2) {
            byte[] var5 = var3[var4];
            if (var5 != null) {
                int var6 = (class3.field93[var4] >> 8) * 64 - class49.field806;
                int var7 = (class3.field93[var4] & 0xFF) * 64 - class91.field1480;
                class128.method884(-19552);
                class233.method1568(4083, class183.field3211, var6, var5, arg1, var7);
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIII[I)V")
    public static final void method1151(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        arg3--;
        field2833++;
        int var5 = -95 % ((arg2 - 61) / 33);
        int var7 = arg0 - 1;
        int var6 = var7 - 7;
        while (arg3 < var6) {
            int var8 = arg3 + 1;
            arg4[var8] = arg1;
            int var9 = var8 + 1;
            arg4[var9] = arg1;
            int var10 = var9 + 1;
            arg4[var10] = arg1;
            int var11 = var10 + 1;
            arg4[var11] = arg1;
            int var12 = var11 + 1;
            arg4[var12] = arg1;
            int var13 = var12 + 1;
            arg4[var13] = arg1;
            int var14 = var13 + 1;
            arg4[var14] = arg1;
            arg3 = var14 + 1;
            arg4[arg3] = arg1;
        }
        while (var7 > arg3) {
            arg3++;
            arg4[arg3] = arg1;
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(III)V")
    public class162(int arg0, int arg1, int arg2) {
        this.field2848 = arg1;
        this.field2844 = arg2;
        this.field2851 = this.field2834 = arg0;
    }
}
