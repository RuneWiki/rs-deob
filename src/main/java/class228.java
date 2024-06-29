import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class228 extends class154 {

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "I")
    public int field3922 = 0;

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "[I")
    public int[] field3926 = new int[5];

    @OriginalMember(owner = "client!lf", name = "D", descriptor = "[Lfb;")
    public class219[] field3932 = new class219[5];

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "I")
    public int field3921;

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "I")
    public int field3941;

    @OriginalMember(owner = "client!lf", name = "A", descriptor = "I")
    public int field3930;

    @OriginalMember(owner = "client!lf", name = "y", descriptor = "I")
    public int field3928;

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "Loh;")
    public static class258 field3919 = class153.method1046("loginscreen", 100);

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "Loh;")
    public static class258 field3925 = class153.method1046("<col=40ff00>", 114);

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "[S")
    public static short[] field3944 = new short[] { 20, 43, 16, 19, 39, 5, 42, 1 };

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "Loh;")
    public static class258 field3924 = class125.method912(0, 160);

    @OriginalMember(owner = "client!lf", name = "T", descriptor = "[I")
    public static int[] field3948 = new int[1000];

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "I")
    public int field3929;

    @OriginalMember(owner = "client!lf", name = "F", descriptor = "I")
    public int field3934;

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!lf", name = "H", descriptor = "I")
    public int field3936;

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "I")
    public int field3940;

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!lf", name = "R", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!lf", name = "U", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!lf", name = "V", descriptor = "I")
    public int field3950;

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "Llf;")
    public class228 field3937;

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "Lp;")
    public class23 field3923;

    @OriginalMember(owner = "client!lf", name = "C", descriptor = "Llk;")
    public class250 field3931;

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "Lta;")
    public class263 field3939;

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "Loi;")
    public class26 field3945;

    @OriginalMember(owner = "client!lf", name = "E", descriptor = "Lcf;")
    public class67 field3933;

    @OriginalMember(owner = "client!lf", name = "S", descriptor = "Lqc;")
    public class90 field3947;

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "Z")
    public boolean field3927;

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "Z")
    public boolean field3938;

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "Z")
    public boolean field3943;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZIIII)V", line = 9)
    public static final void method1521(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field3918++;
        int var5 = arg1;
        int var6 = -arg1;
        class19.method126(7, arg4, class154.field2638[arg2], arg3 - arg1, arg3 - -arg1);
        if (!arg0) {
            method1521(true, 56, 54, -23, 72);
        }
        int var7 = -1;
        int var8 = 0;
        while (var8 < var5) {
            var8++;
            var7 += 2;
            var6 += var7;
            if (var6 >= 0) {
                var5--;
                int[] var9 = class154.field2638[arg2 - var5];
                var6 -= var5 << 1;
                int[] var10 = class154.field2638[arg2 + var5];
                int var11 = arg3 + var8;
                int var12 = arg3 - var8;
                class19.method126(7, arg4, var10, var12, var11);
                class19.method126(7, arg4, var9, var12, var11);
            }
            int[] var13 = class154.field2638[arg2 + var8];
            int var14 = arg3 + var5;
            int[] var15 = class154.field2638[arg2 - var8];
            int var16 = arg3 - var5;
            class19.method126(7, arg4, var13, var16, var14);
            class19.method126(7, arg4, var15, var16, var14);
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(III)V", line = 67)
    public class228(int arg0, int arg1, int arg2) {
        this.field3921 = arg2;
        this.field3930 = this.field3941 = arg0;
        this.field3928 = arg1;
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(B)V", line = 101)
    public static void method1522(byte arg0) {
        if (arg0 < 46) {
            return;
        }
        field3919 = null;
        field3925 = null;
        field3924 = null;
        field3944 = null;
        field3948 = null;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(IIIII)V", line = 124)
    public static final void method1523(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class241.field4189 = arg1;
        field3935++;
        if (arg3 != 746471655) {
            method1524(112, -127, (class258) null);
        }
        class94.field1654 = arg0;
        class206.field3562 = arg4;
        class75.field1314 = arg2;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IILoh;)V", line = 143)
    public static final void method1524(int arg0, int arg1, class258 arg2) {
        class191.field3371++;
        class159.field2710.method885(33, -110);
        field3920++;
        class159.field2710.method1607((byte) -90, arg1);
        int var3 = 15 % ((arg0 + 56) / 62);
        class159.field2710.method1567((byte) 125, arg2.method1769(16));
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZIII)I", line = 161)
    public static final int method1525(boolean arg0, int arg1, int arg2, int arg3) {
        field3942++;
        if (class201.field3482 == null) {
            return 0;
        }
        int var4 = arg2 >> 7;
        int var5 = arg3 >> 7;
        if (var5 < 0 || var4 < 0 || var5 > 103 || var4 > 103) {
            return 0;
        }
        int var6 = arg3 & 0x7F;
        int var7 = arg1;
        if (!arg0) {
            return -110;
        }
        if (arg1 < 3 && (class94.field1653[1][var5][var4] & 0x2) == 2) {
            var7 = arg1 + 1;
        }
        int var8 = (128 - var6) * class201.field3482[var7][var5][var4 + 1] + class201.field3482[var7][var5 + 1][var4 + 1] * var6 >> 7;
        int var9 = (128 - var6) * class201.field3482[var7][var5][var4] + class201.field3482[var7][var5 + 1][var4] * var6 >> 7;
        int var10 = arg2 & 0x7F;
        return (128 - var10) * var9 + var8 * var10 >> 7;
    }
}
