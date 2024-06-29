import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class40 extends class166 {

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "I")
    private int field808 = 0;

    @OriginalMember(owner = "client!wd", name = "L", descriptor = "Z")
    private boolean field821 = false;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
    private int field803 = 0;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
    private int field809 = -32768;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
    private int field796;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "I")
    public int field802;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
    private int field800;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    private int field795;

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "I")
    public int field806;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "I")
    public int field805;

    @OriginalMember(owner = "client!wd", name = "I", descriptor = "I")
    private int field818;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
    private int field804;

    @OriginalMember(owner = "client!wd", name = "N", descriptor = "I")
    private int field823;

    @OriginalMember(owner = "client!wd", name = "F", descriptor = "I")
    public int field815;

    @OriginalMember(owner = "client!wd", name = "H", descriptor = "I")
    public int field817;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "Lfc;")
    private class31 field801;

    @OriginalMember(owner = "client!wd", name = "R", descriptor = "Lwi;")
    public static class131 field827 = new class131(5000);

    @OriginalMember(owner = "client!wd", name = "S", descriptor = "Lia;")
    public static class257 field828 = class28.method234(118, "unzap");

    @OriginalMember(owner = "client!wd", name = "T", descriptor = "Lie;")
    public static class117 field829 = new class117(30);

    @OriginalMember(owner = "client!wd", name = "W", descriptor = "[I")
    public static int[] field832 = new int[50];

    @OriginalMember(owner = "client!wd", name = "ab", descriptor = "Lia;")
    private static class257 field836 = class28.method234(-39, "Hidden");

    @OriginalMember(owner = "client!wd", name = "X", descriptor = "Lia;")
    public static class257 field833 = field836;

    @OriginalMember(owner = "client!wd", name = "Y", descriptor = "I")
    public static int field834 = 0;

    @OriginalMember(owner = "client!wd", name = "bb", descriptor = "Lia;")
    public static class257 field837 = class28.method234(76, "welle2:");

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "D")
    private double field799;

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "D")
    private double field810;

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "D")
    public double field811;

    @OriginalMember(owner = "client!wd", name = "J", descriptor = "D")
    private double field819;

    @OriginalMember(owner = "client!wd", name = "M", descriptor = "D")
    public double field822;

    @OriginalMember(owner = "client!wd", name = "O", descriptor = "D")
    private double field824;

    @OriginalMember(owner = "client!wd", name = "P", descriptor = "D")
    public double field825;

    @OriginalMember(owner = "client!wd", name = "U", descriptor = "D")
    private double field830;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!wd", name = "E", descriptor = "I")
    public int field814;

    @OriginalMember(owner = "client!wd", name = "G", descriptor = "I")
    private int field816;

    @OriginalMember(owner = "client!wd", name = "K", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!wd", name = "Q", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!wd", name = "V", descriptor = "Lvb;")
    public static class226 field831;

    @OriginalMember(owner = "client!wd", name = "Z", descriptor = "Lbh;")
    public static class2 field835;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
    public static final void method324(byte arg0) {
        field812++;
        class183.field3192 = 0;
        if (arg0 != 10) {
            method324((byte) 77);
        }
        class212.field3628 = 0;
        class128.method887(-91);
        class9.method115((byte) -70);
        class102.method743((byte) 98);
        for (int var1 = 0; var1 < class183.field3192; var1++) {
            int var3 = class125.field2241[var1];
            if (class7.field153 != class92.field1758[var3].field4180) {
                if (class92.field1758[var3].field3322.method1333(false)) {
                    class257.method1690(class92.field1758[var3], 63);
                }
                class92.field1758[var3].field3322 = null;
                class92.field1758[var3] = null;
            }
        }
        if (class209.field3582 != field827.field2677) {
            throw new RuntimeException("gnp1 pos:" + field827.field2677 + " psize:" + class209.field3582);
        }
        for (int var2 = 0; var2 < class140.field2487; var2++) {
            if (class92.field1758[class199.field3412[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class140.field2487);
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIB)V")
    public final void method325(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (!this.field821) {
            double var6 = (double) (arg2 - this.field804);
            double var8 = (double) (arg3 - this.field796);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field811 = (double) this.field795 * var8 / var10 + (double) this.field796;
            this.field822 = (double) this.field823;
            this.field825 = (double) this.field795 * var6 / var10 + (double) this.field804;
        }
        field807++;
        if (arg4 != -60) {
            this.method325(-72, 85, -118, 22, (byte) 34);
        }
        double var12 = (double) (this.field805 + 1 - arg1);
        this.field799 = ((double) arg3 - this.field811) / var12;
        this.field824 = ((double) arg2 - this.field825) / var12;
        this.field819 = Math.sqrt(this.field824 * this.field824 + this.field799 * this.field799);
        if (!this.field821) {
            this.field810 = -this.field819 * Math.tan((double) this.field818 * 0.02454369D);
        }
        this.field830 = ((double) arg0 - this.field822 - this.field810 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)Lei;")
    private final class168 method326(boolean arg0) {
        field798++;
        class219 var2 = class152.method1059(this.field800, arg0);
        class168 var3 = var2.method1447(72, this.field803);
        if (var3 == null) {
            return null;
        } else {
            var3.method1143(this.field816);
            return var3;
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(III)J")
    public static final long method327(int arg0, int arg1, int arg2) {
        class177 var3 = class75.field1463[arg0][arg1][arg2];
        return var3 == null || var3.field3024 == null ? 0L : var3.field3024.field170;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V")
    public static void method328(int arg0) {
        field831 = null;
        field837 = null;
        field828 = null;
        field833 = null;
        field832 = null;
        int var1 = -84 / ((47 - arg0) / 55);
        field835 = null;
        field829 = null;
        field836 = null;
        field827 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)V")
    public final void method329(int arg0, int arg1) {
        this.field821 = true;
        field820++;
        this.field825 += (double) arg0 * this.field824;
        this.field822 += this.field830 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field810;
        this.field811 += (double) arg0 * this.field799;
        if (arg1 != 16124) {
            return;
        }
        this.field810 += (double) arg0 * this.field830;
        this.field814 = (int) (Math.atan2(this.field824, this.field799) * 325.949D) + 1024 & 0x7FF;
        this.field816 = (int) (Math.atan2(this.field810, this.field819) * 325.949D) & 0x7FF;
        if (this.field801 == null) {
            return;
        }
        this.field808 += arg0;
        while (true) {
            do {
                do {
                    if (this.field801.field603[this.field803] >= this.field808) {
                        return;
                    }
                    this.field808 -= this.field801.field603[this.field803];
                    this.field803++;
                } while (this.field803 < this.field801.field589.length);
                this.field803 -= this.field801.field586;
            } while (this.field803 >= 0 && this.field803 < this.field801.field589.length);
            this.field803 = 0;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method3(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class168 var11 = this.method326(true);
        field813++;
        if (var11 != null) {
            var11.method3(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field809 = var11.method2();
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "()I")
    public final int method2() {
        field826++;
        return this.field809;
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class40(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field796 = arg3;
        this.field821 = false;
        this.field802 = arg9;
        this.field800 = arg0;
        this.field795 = arg8;
        this.field806 = arg10;
        this.field805 = arg6;
        this.field818 = arg7;
        this.field804 = arg2;
        this.field823 = arg4;
        this.field815 = arg5;
        this.field817 = arg1;
        int var12 = class152.method1059(this.field800, true).field3713;
        if (var12 == -1) {
            this.field801 = null;
        } else {
            this.field801 = class186.method1263(0, var12);
        }
    }
}
