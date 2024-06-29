import java.awt.Frame;
import java.awt.Image;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class232 extends class279 {

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "I")
    private int field3806 = 2000;

    @OriginalMember(owner = "client!wb", name = "V", descriptor = "I")
    private int field3821 = 16;

    @OriginalMember(owner = "client!wb", name = "W", descriptor = "I")
    private int field3822 = 4096;

    @OriginalMember(owner = "client!wb", name = "ab", descriptor = "I")
    private int field3826 = 0;

    @OriginalMember(owner = "client!wb", name = "cb", descriptor = "I")
    private int field3828 = 0;

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "Ltl;")
    private static class59 field3810 = class85.method639("Loaded title screen", 9588);

    @OriginalMember(owner = "client!wb", name = "R", descriptor = "[I")
    public static int[] field3817 = new int[50];

    @OriginalMember(owner = "client!wb", name = "M", descriptor = "I")
    public static int field3812 = 0;

    @OriginalMember(owner = "client!wb", name = "S", descriptor = "Z")
    public static boolean field3818 = false;

    @OriginalMember(owner = "client!wb", name = "O", descriptor = "[Ltl;")
    public static class59[] field3814 = new class59[100];

    @OriginalMember(owner = "client!wb", name = "T", descriptor = "Ltl;")
    public static class59 field3819 = class85.method639("Fps:", 9588);

    @OriginalMember(owner = "client!wb", name = "P", descriptor = "Ltl;")
    public static class59 field3815 = class85.method639("RuneScape wird geladen )2 bitte warten)3)3)3", 9588);

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "Ltl;")
    public static class59 field3807 = field3810;

    @OriginalMember(owner = "client!wb", name = "Y", descriptor = "[I")
    public static int[] field3824 = new int[2];

    @OriginalMember(owner = "client!wb", name = "Q", descriptor = "[I")
    public static int[] field3816 = new int[32768];

    @OriginalMember(owner = "client!wb", name = "U", descriptor = "Ltl;")
    public static class59 field3820 = class85.method639("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0", 9588);

    @OriginalMember(owner = "client!wb", name = "db", descriptor = "Ltl;")
    public static class59 field3829 = class85.method639("weiss:", 9588);

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!wb", name = "N", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!wb", name = "Z", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!wb", name = "bb", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "Lof;")
    public static class194 field3809;

    @OriginalMember(owner = "client!wb", name = "L", descriptor = "Ljava/awt/Frame;")
    public static Frame field3811;

    @OriginalMember(owner = "client!wb", name = "X", descriptor = "Ljava/awt/Image;")
    public static Image field3823;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V", line = 8)
    public final void method319(byte arg0) {
        class162.method1155(0);
        field3808++;
        if (arg0 >= -9) {
            field3818 = true;
        }
    }

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "(I)V", line = 20)
    public static void method1617(int arg0) {
        field3811 = null;
        field3819 = null;
        field3809 = null;
        field3810 = null;
        if (arg0 != -1) {
            field3817 = (int[]) null;
        }
        field3817 = null;
        field3816 = null;
        field3815 = null;
        field3814 = null;
        field3820 = null;
        field3824 = null;
        field3823 = null;
        field3829 = null;
        field3807 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILs;)V", line = 59)
    public final void method51(int arg0, int arg1, class170 arg2) {
        if (arg1 == 0) {
            this.field3828 = arg2.method1221(118);
        } else if (arg1 == 1) {
            this.field3806 = arg2.method1214(-18254);
        } else if (arg1 == 2) {
            this.field3821 = arg2.method1221(76);
        } else if (arg1 == 3) {
            this.field3826 = arg2.method1214(-18254);
        } else if (arg1 == 4) {
            this.field3822 = arg2.method1214(-18254);
        }
        if (arg0 >= -125) {
            field3817 = (int[]) null;
        }
        field3825++;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZI)[I", line = 133)
    public final int[] method44(boolean arg0, int arg1) {
        field3827++;
        if (arg0) {
            method1618(82, -128, (byte[]) null);
        }
        int[] var3 = this.field4781.method165(arg1, (byte) -11);
        if (this.field4781.field354) {
            int var4 = this.field3822 >> 1;
            int[][] var5 = this.field4781.method172(-4532);
            Random var6 = new Random((long) this.field3828);
            for (int var7 = 0; var7 < this.field3806; var7++) {
                int var8 = this.field3822 <= 0 ? this.field3826 : this.field3826 + class215.method1496(var6, 11, this.field3822) - var4;
                int var9 = class215.method1496(var6, 124, class56.field835);
                int var10 = (var8 & 0xFFB) >> 4;
                int var11 = class215.method1496(var6, -119, class284.field4887);
                int var12 = (class53.field787[var10] * this.field3821 >> 12) + var11;
                int var13 = var9 + (class243.field4064[var10] * this.field3821 >> 12);
                int var14 = var12 - var11;
                int var15 = var13 - var9;
                if (var15 != 0 || var14 != 0) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = var15 < var14;
                    if (var16) {
                        int var17 = var9;
                        int var18 = var13;
                        var9 = var11;
                        var11 = var17;
                        var13 = var12;
                        var12 = var18;
                    }
                    if (var13 < var9) {
                        int var19 = var9;
                        var9 = var13;
                        int var20 = var11;
                        var13 = var19;
                        var11 = var12;
                        var12 = var20;
                    }
                    int var21 = var11;
                    int var22 = var13 - var9;
                    int var23 = var12 - var11;
                    int var24 = -var22 / 2;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var25 = 2048 / var22;
                    int var26 = 1024 - (class215.method1496(var6, 116, 4096) >> 2);
                    int var27 = var11 >= var12 ? -1 : 1;
                    for (int var28 = var9; var28 < var13; var28++) {
                        var24 += var23;
                        int var29 = (var28 - var9) * var25 + (var26 + 1024);
                        int var30 = var21 & class132.field2197;
                        if (var24 > 0) {
                            var24 += -var22;
                            var21 -= -var27;
                        }
                        int var31 = class310.field5270 & var28;
                        if (var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[B)I", line = 269)
    public static final int method1618(int arg0, int arg1, byte[] arg2) {
        field3813++;
        return arg0 == -1255 ? class213.method1492(-1, 0, arg2, arg1) : -38;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V", line = 296)
    public class232() {
        super(0, true);
    }
}
