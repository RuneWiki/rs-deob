import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pf")
public class class145 extends class85 {

    @OriginalMember(owner = "pf", name = "eb", descriptor = "I")
    public static int field2801 = 0;

    @OriginalMember(owner = "pf", name = "cb", descriptor = "Llf;")
    private static class109 field2799 = class35.method275("The server is being updated)3", 2);

    @OriginalMember(owner = "pf", name = "Z", descriptor = "Llf;")
    public static class109 field2796 = class35.method275("Lade Benutzeroberfl-=che )2 ", 2);

    @OriginalMember(owner = "pf", name = "W", descriptor = "Llf;")
    public static class109 field2793 = field2799;

    @OriginalMember(owner = "pf", name = "lb", descriptor = "I")
    public static int field2808 = 0;

    @OriginalMember(owner = "pf", name = "Y", descriptor = "Llf;")
    public static class109 field2795 = class35.method275("", 2);

    @OriginalMember(owner = "pf", name = "Q", descriptor = "Llf;")
    public static class109 field2787 = field2795;

    @OriginalMember(owner = "pf", name = "fb", descriptor = "Llf;")
    public static class109 field2802 = class35.method275("oder ung-Ultiges Passwort)3", 2);

    @OriginalMember(owner = "pf", name = "ib", descriptor = "Llf;")
    public static class109 field2805 = field2795;

    @OriginalMember(owner = "pf", name = "X", descriptor = "Llf;")
    public static class109 field2794 = field2795;

    @OriginalMember(owner = "pf", name = "jb", descriptor = "Llf;")
    public static class109 field2806 = field2795;

    @OriginalMember(owner = "pf", name = "kb", descriptor = "Llf;")
    public static class109 field2807 = field2795;

    @OriginalMember(owner = "pf", name = "qb", descriptor = "Llf;")
    private static class109 field2813 = class35.method275("Members only world", 2);

    @OriginalMember(owner = "pf", name = "S", descriptor = "Llf;")
    public static class109 field2789 = field2813;

    @OriginalMember(owner = "pf", name = "nb", descriptor = "Llf;")
    private static class109 field2810 = class35.method275("FULL", 2);

    @OriginalMember(owner = "pf", name = "hb", descriptor = "Llf;")
    public static class109 field2804 = class35.method275("Fps:", 2);

    @OriginalMember(owner = "pf", name = "ab", descriptor = "Llf;")
    public static class109 field2797 = field2795;

    @OriginalMember(owner = "pf", name = "mb", descriptor = "Llf;")
    public static class109 field2809 = field2810;

    @OriginalMember(owner = "pf", name = "T", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "pf", name = "U", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "pf", name = "db", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "pf", name = "gb", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "pf", name = "ob", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "pf", name = "pb", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "pf", name = "R", descriptor = "Ljava/awt/Image;")
    public static Image field2788;

    @OriginalMember(owner = "pf", name = "V", descriptor = "[Lvg;")
    public static class200[] field2792;

    @OriginalMember(owner = "pf", name = "bb", descriptor = "[Ldf;")
    public static class37[] field2798;

    @OriginalMember(owner = "pf", name = "e", descriptor = "(I)V")
    public static final void method1017(int arg0) {
        ++field2791;
        class200.field3850.method1339((byte) 122, 122);
        if (arg0 < 100) {
            field2788 = null;
        }
        for (class60 var1 = (class60) class113.field2236.method338((byte) 89); var1 != null; var1 = (class60) class113.field2236.method335(1)) {
            if (~var1.field1184 == -1) {
                class157.method1071(true, (byte) 121, var1);
            }
        }
        ++class194.field3703;
        if (class159.field2980 != null) {
            class115.method851(class159.field2980, -23101);
            class159.field2980 = null;
        }
    }

    @OriginalMember(owner = "pf", name = "f", descriptor = "(I)V")
    public static void method1018(int arg0) {
        field2792 = null;
        field2807 = null;
        field2805 = null;
        field2810 = null;
        field2788 = null;
        field2804 = null;
        field2813 = null;
        field2787 = null;
        field2802 = null;
        if (arg0 > -76) {
            method1017(50);
        }
        field2797 = null;
        field2794 = null;
        field2789 = null;
        field2806 = null;
        field2793 = null;
        field2799 = null;
        field2795 = null;
        field2798 = null;
        field2796 = null;
        field2809 = null;
    }

    @OriginalMember(owner = "pf", name = "<init>", descriptor = "()V")
    public class145() {
        super(3, false);
    }

    @OriginalMember(owner = "pf", name = "a", descriptor = "(II)[I")
    public final int[] method87(int arg0, int arg1) {
        if (arg0 >= -49) {
            return null;
        } else {
            int[] var3 = super.field1736.method835(-314, arg1);
            if (super.field1736.field2253) {
                int[] var4 = this.method540(arg1, 126, 0);
                int[] var5 = this.method540(arg1, 127, 1);
                int[] var6 = this.method540(arg1, -128, 2);
                for (int var7 = 0; var7 < class57.field1152; ++var7) {
                    int var8 = var6[var7];
                    if (~var8 == -4097) {
                        var3[var7] = var4[var7];
                    } else if (~var8 != -1) {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    } else {
                        var3[var7] = var5[var7];
                    }
                }
            }
            ++field2812;
            return var3;
        }
    }

    @OriginalMember(owner = "pf", name = "a", descriptor = "(BILja;)V")
    public final void method31(byte arg0, int arg1, class86 arg2) {
        if (arg0 >= -120) {
            method1017(-51);
        }
        if (arg1 == 0) {
            super.field1726 = arg2.method598((byte) 120) == 1;
        }
        ++field2800;
    }

    @OriginalMember(owner = "pf", name = "b", descriptor = "(II)[[I")
    public final int[][] method29(int arg0, int arg1) {
        ++field2790;
        if (arg1 != 2177) {
            field2808 = 31;
        }
        int[][] var3 = super.field1719.method673((byte) -127, arg0);
        if (super.field1719.field1926) {
            int[] var4 = this.method540(arg0, -125, 2);
            int[][] var5 = this.method544(false, arg0, 0);
            int[][] var6 = this.method544(false, arg0, 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var5[0];
            int[] var10 = var5[2];
            int[] var11 = var5[1];
            int[] var12 = var3[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~var16 > ~class57.field1152; ++var16) {
                int var17 = var4[var16];
                if (~var17 == -4097) {
                    var7[var16] = var9[var16];
                    var8[var16] = var11[var16];
                    var12[var16] = var10[var16];
                } else if (~var17 != -1) {
                    int var18 = -var17 + 4096;
                    var7[var16] = var9[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                    var12[var16] = var10[var16] * var17 + var15[var16] * var18 >> 12;
                } else {
                    var7[var16] = var13[var16];
                    var8[var16] = var14[var16];
                    var12[var16] = var15[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "pf", name = "g", descriptor = "(I)Luf;")
    public static final class190 method1019(int arg0) {
        if (arg0 != 31379) {
            return null;
        } else {
            ++field2811;
            try {
                return (class190) Class.forName("class188").newInstance();
            } catch (Throwable var1) {
                return new class121();
            }
        }
    }
}
