import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class148 extends class181 {

    @OriginalMember(owner = "client!rk", name = "N", descriptor = "I")
    public static int field2789 = 0;

    @OriginalMember(owner = "client!rk", name = "Z", descriptor = "I")
    public static int field2800 = 0;

    @OriginalMember(owner = "client!rk", name = "J", descriptor = "Lgf;")
    public static class7 field2785 = new class7(64);

    @OriginalMember(owner = "client!rk", name = "eb", descriptor = "I")
    public static int field2805 = -1;

    @OriginalMember(owner = "client!rk", name = "gb", descriptor = "I")
    public static volatile int field2807 = 0;

    @OriginalMember(owner = "client!rk", name = "fb", descriptor = "I")
    public static int field2806 = 0;

    @OriginalMember(owner = "client!rk", name = "hb", descriptor = "I")
    public static int field2808 = 0;

    @OriginalMember(owner = "client!rk", name = "I", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!rk", name = "K", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!rk", name = "L", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!rk", name = "M", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!rk", name = "Q", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!rk", name = "S", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!rk", name = "U", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!rk", name = "V", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!rk", name = "X", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!rk", name = "cb", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!rk", name = "db", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!rk", name = "P", descriptor = "Lmh;")
    public static class114 field2791;

    @OriginalMember(owner = "client!rk", name = "W", descriptor = "Lli;")
    public class185 field2797;

    @OriginalMember(owner = "client!rk", name = "ab", descriptor = "Lhi;")
    public static class250 field2801;

    @OriginalMember(owner = "client!rk", name = "O", descriptor = "[I")
    public int[] field2790;

    @OriginalMember(owner = "client!rk", name = "T", descriptor = "[I")
    public int[] field2794;

    @OriginalMember(owner = "client!rk", name = "Y", descriptor = "[I")
    public int[] field2799;

    @OriginalMember(owner = "client!rk", name = "bb", descriptor = "[I")
    public int[] field2802;

    @OriginalMember(owner = "client!rk", name = "ib", descriptor = "[Lda;")
    public static class101[] field2809;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "(I)V")
    public final void method1048(int arg0) {
        if (this.field2799 != null) {
            for (int var2 = 0; var2 < this.field2799.length; var2++) {
                this.field2799[var2] = class21.method150(this.field2799[var2], 32768);
            }
        }
        field2788++;
        int var3 = 64 / ((arg0 + 45) / 35);
        if (this.field2794 != null) {
            for (int var4 = 0; var4 < this.field2794.length; var4++) {
                this.field2794[var4] = class21.method150(this.field2794[var4], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)Z")
    public static final boolean method1049(int arg0, int arg1) {
        field2792++;
        if (arg1 == -1) {
            return ((arg0 & 0x212017B3) >> 29) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "(I)V")
    public static void method1050(int arg0) {
        field2801 = null;
        field2809 = null;
        field2785 = null;
        int var1 = -127 % ((arg0 + 35) / 46);
        field2791 = null;
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(II)I")
    public final int method1051(int arg0, int arg1) {
        field2804++;
        if (this.field2794 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field2794.length; var3++) {
            if (this.field2790[var3] == arg1) {
                return this.field2794[var3];
            }
        }
        if (arg0 != -1) {
            method1050(37);
        }
        return -1;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1052(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2786++;
        int var7 = class42.method260(class113.field2040, class216.field3964, (byte) 98, arg1);
        if (arg3 != 0) {
            method1050(127);
        }
        int var8 = class42.method260(class113.field2040, class216.field3964, (byte) 98, arg0);
        int var9 = class42.method260(class66.field1163, class207.field3810, (byte) 98, arg4);
        int var10 = class42.method260(class66.field1163, class207.field3810, (byte) 98, arg2);
        int var11 = class42.method260(class113.field2040, class216.field3964, (byte) 98, arg1 + arg6);
        int var12 = class42.method260(class113.field2040, class216.field3964, (byte) 98, arg0 - arg6);
        for (int var13 = var7; var13 < var11; var13++) {
            class157.method1116(arg5, var9, var10, class145.field2757[var13], -108);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class157.method1116(arg5, var9, var10, class145.field2757[var14], -121);
        }
        int var15 = class42.method260(class66.field1163, class207.field3810, (byte) 98, arg4 + arg6);
        int var16 = class42.method260(class66.field1163, class207.field3810, (byte) 98, arg2 - arg6);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class145.field2757[var17];
            class157.method1116(arg5, var9, var15, var18, arg3 ^ 0xFFFFFFCF);
            class157.method1116(arg5, var16, var10, var18, -93);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BI)I")
    public final int method1053(byte arg0, int arg1) {
        if (arg0 <= 76) {
            method1050(76);
        }
        field2795++;
        if (this.field2799 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field2799.length; var3++) {
            if (this.field2802[var3] == arg1) {
                return this.field2799[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IILjd;)V")
    private final void method1054(int arg0, int arg1, class118 arg2) {
        field2793++;
        if (arg1 != -28148) {
            method1050(-124);
        }
        if (arg0 == 1) {
            this.field2797 = arg2.method865(9199);
        } else if (arg0 == 2) {
            int var7 = arg2.method867(false);
            this.field2794 = new int[var7];
            this.field2790 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2794[var8] = arg2.method827(arg1 + 28403);
                int var9 = arg2.method867(false);
                if (var9 == 0) {
                    this.field2790[var8] = -1;
                } else {
                    this.field2790[var8] = var9;
                }
            }
        } else if (arg0 == 3) {
            int var4 = arg2.method867(false);
            this.field2802 = new int[var4];
            this.field2799 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2799[var5] = arg2.method827(255);
                int var6 = arg2.method867(false);
                if (var6 == 0) {
                    this.field2802[var5] = -1;
                } else {
                    this.field2802[var5] = var6;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILjd;)V")
    public final void method1055(int arg0, class118 arg1) {
        field2787++;
        while (true) {
            int var3 = arg1.method867(false);
            if (var3 == 0) {
                int var4 = 29 % ((arg0 + 22) / 44);
                return;
            }
            this.method1054(var3, -28148, arg1);
        }
    }
}
