import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class126 extends class124 {

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "[I")
    private int[] field2872 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "I")
    public int field2879 = -1;

    @OriginalMember(owner = "client!sa", name = "lb", descriptor = "Z")
    public boolean field2893 = false;

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "Lr;")
    private static class118 field2870 = class153.method1136(111, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!sa", name = "U", descriptor = "[Lr;")
    public static class118[] field2876 = new class118[500];

    @OriginalMember(owner = "client!sa", name = "gb", descriptor = "Lr;")
    private static class118 field2888 = class153.method1136(102, "Bad session id)3");

    @OriginalMember(owner = "client!sa", name = "hb", descriptor = "I")
    private static int field2889 = -1;

    @OriginalMember(owner = "client!sa", name = "ab", descriptor = "Lr;")
    public static class118 field2882 = class153.method1136(83, "null");

    @OriginalMember(owner = "client!sa", name = "W", descriptor = "[I")
    public static int[] field2878 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!sa", name = "fb", descriptor = "I")
    public static int field2887 = 0;

    @OriginalMember(owner = "client!sa", name = "nb", descriptor = "Lr;")
    public static class118 field2895 = field2888;

    @OriginalMember(owner = "client!sa", name = "Y", descriptor = "Lr;")
    public static class118 field2880 = field2870;

    @OriginalMember(owner = "client!sa", name = "T", descriptor = "I")
    public static volatile int field2875 = 0;

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!sa", name = "bb", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!sa", name = "cb", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!sa", name = "eb", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!sa", name = "ib", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!sa", name = "jb", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!sa", name = "mb", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!sa", name = "ob", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!sa", name = "pb", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!sa", name = "rb", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!sa", name = "P", descriptor = "Lsb;")
    public static class127 field2871;

    @OriginalMember(owner = "client!sa", name = "V", descriptor = "[I")
    private int[] field2877;

    @OriginalMember(owner = "client!sa", name = "db", descriptor = "[I")
    public static int[] field2885;

    @OriginalMember(owner = "client!sa", name = "S", descriptor = "[S")
    private short[] field2874;

    @OriginalMember(owner = "client!sa", name = "Z", descriptor = "[S")
    private short[] field2881;

    @OriginalMember(owner = "client!sa", name = "kb", descriptor = "[S")
    private short[] field2892;

    @OriginalMember(owner = "client!sa", name = "qb", descriptor = "[S")
    private short[] field2898;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(I)Z")
    public final boolean method975(int arg0) {
        field2873++;
        boolean var2 = true;
        if (arg0 < 40) {
            this.method978(112, 46, null);
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2872[var3] != -1 && !class157.field3613.method353(this.field2872[var3], -1, 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "(I)V")
    public static void method976(int arg0) {
        field2871 = null;
        if (arg0 != 0) {
            field2878 = null;
        }
        field2878 = null;
        field2880 = null;
        field2895 = null;
        field2888 = null;
        field2870 = null;
        field2876 = null;
        field2885 = null;
        field2882 = null;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(Z)Z")
    public final boolean method977(boolean arg0) {
        field2891++;
        if (this.field2877 == null) {
            return true;
        }
        boolean var2 = arg0;
        for (int var3 = 0; var3 < this.field2877.length; var3++) {
            if (!class157.field3613.method353(this.field2877[var3], -1, 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILpa;)V")
    private final void method978(int arg0, int arg1, class105 arg2) {
        if (arg0 != 19747) {
            this.method980(null, -64);
        }
        field2890++;
        if (arg1 == 1) {
            this.field2879 = arg2.method831((byte) 76);
        } else if (arg1 == 2) {
            int var4 = arg2.method831((byte) 76);
            this.field2877 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2877[var5] = arg2.method838((byte) 5);
            }
            return;
        } else if (arg1 == 3) {
            this.field2893 = true;
            return;
        } else if (arg1 == 40) {
            int var6 = arg2.method831((byte) 76);
            this.field2892 = new short[var6];
            this.field2898 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2898[var7] = (short) arg2.method838((byte) 5);
                this.field2892[var7] = (short) arg2.method838((byte) 5);
            }
            return;
        } else if (arg1 == 41) {
            int var8 = arg2.method831((byte) 76);
            this.field2881 = new short[var8];
            this.field2874 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2874[var9] = (short) arg2.method838((byte) 5);
                this.field2881[var9] = (short) arg2.method838((byte) 5);
            }
            return;
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field2872[arg1 - 60] = arg2.method838((byte) 5);
            return;
        }
    }

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "(I)Lcb;")
    public final class17 method979(int arg0) {
        if (arg0 != 256) {
            return null;
        }
        field2886++;
        int var2 = 0;
        class17[] var3 = new class17[5];
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field2872[var4] != -1) {
                var3[var2++] = class17.method167(class157.field3613, this.field2872[var4], 0);
            }
        }
        class17 var5 = new class17(var3, var2);
        if (this.field2898 != null) {
            for (int var6 = 0; var6 < this.field2898.length; var6++) {
                var5.method155(this.field2898[var6], this.field2892[var6]);
            }
        }
        if (this.field2874 != null) {
            for (int var7 = 0; var7 < this.field2874.length; var7++) {
                var5.method169(this.field2874[var7], this.field2881[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lpa;I)V")
    public final void method980(class105 arg0, int arg1) {
        if (arg1 < 59) {
            return;
        }
        while (true) {
            int var3 = arg0.method831((byte) 76);
            if (var3 == 0) {
                field2883++;
                return;
            }
            this.method978(19747, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "(I)Lcb;")
    public final class17 method981(int arg0) {
        field2884++;
        if (this.field2877 == null) {
            return null;
        }
        class17[] var2 = new class17[this.field2877.length];
        for (int var3 = 0; var3 < this.field2877.length; var3++) {
            var2[var3] = class17.method167(class157.field3613, this.field2877[var3], 0);
        }
        class17 var4;
        if (~var2.length == arg0) {
            var4 = var2[0];
        } else {
            var4 = new class17(var2, var2.length);
        }
        if (this.field2898 != null) {
            for (int var5 = 0; var5 < this.field2898.length; var5++) {
                var4.method155(this.field2898[var5], this.field2892[var5]);
            }
        }
        if (this.field2874 != null) {
            for (int var6 = 0; var6 < this.field2874.length; var6++) {
                var4.method169(this.field2874[var6], this.field2881[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "(I)Z")
    public static final boolean method982(int arg0) {
        field2894++;
        if (class65.field1486 == 0) {
            if (arg0 != 0) {
                method976(-108);
            }
            return class131.field2991.method104((byte) 26);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(Lke;I)V")
    public static final void method983(class74 arg0, int arg1) {
        field2899++;
        int var2 = arg0.field1731;
        if (var2 == 324) {
            if (class45.field1089 == -1) {
                class45.field1089 = arg0.field1774;
                field2889 = arg0.field1754;
            }
            if (class130.field2970.field1409) {
                arg0.field1774 = class45.field1089;
            } else {
                arg0.field1774 = field2889;
            }
        } else if (var2 == 325) {
            if (class45.field1089 == -1) {
                field2889 = arg0.field1754;
                class45.field1089 = arg0.field1774;
            }
            if (class130.field2970.field1409) {
                arg0.field1774 = field2889;
            } else {
                arg0.field1774 = class45.field1089;
            }
        } else if (var2 == 327) {
            arg0.field1770 = 150;
            arg0.field1809 = (int) (Math.sin((double) class65.field1479 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field1826 = 0;
            arg0.field1772 = 5;
        } else {
            if (arg1 != 8) {
                field2888 = null;
            }
            if (var2 == 328) {
                arg0.field1770 = 150;
                arg0.field1809 = (int) (Math.sin((double) class65.field1479 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field1772 = 5;
                arg0.field1826 = 1;
            }
        }
    }
}
