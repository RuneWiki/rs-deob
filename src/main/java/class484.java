import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class484 {

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "F")
    public float field6791 = 1.0F;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "F")
    public float field6801 = 0.25F;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "F")
    public float field6802 = 1.0F;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public int field6789;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "F")
    public float field6794;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "F")
    public float field6798;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "Las;")
    public class15 field6803;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
    public int field6796;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "I")
    public int field6805;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
    public int field6799;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "F")
    public float field6784;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public int field6790;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public int field6783;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "[[I")
    public static int[][] field6792 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "[I")
    public static int[] field6787 = new int[200];

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field6785;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field6786;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public static int field6788;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public static int field6793;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    public static int field6795;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    public static int field6800;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "Lbm;")
    public static class204 field6804;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "Lui;")
    public static class451 field6797;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILre;)V")
    public final void method2828(int arg0, class446 arg1) {
        field6785++;
        this.field6791 = (float) (arg1.method2628(49152) * 8) / 255.0F;
        this.field6801 = (float) (arg1.method2628(49152) * 8) / 255.0F;
        this.field6802 = (float) (arg1.method2628(49152) * 8) / 255.0F;
        int var3 = 47 % ((arg0 - 70) / 48);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILjava/lang/String;JZZILjava/lang/String;IZBI)V")
    public static final void method2829(int arg0, String arg1, long arg2, boolean arg3, boolean arg4, int arg5, String arg6, int arg7, boolean arg8, byte arg9, int arg10) {
        field6788++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class446 var14 = new class446(128);
        var14.method2619((byte) -123, 10);
        var14.method2592((arg4 ? 4 : 0) | (arg3 ? 1 : 0) | (arg8 ? 2 : 0), (byte) -120);
        var14.method2581(-1973283408, arg2);
        var14.method2596((byte) 3, var12[0]);
        var14.method2597(arg1, (byte) -84);
        var14.method2596((byte) -19, var12[1]);
        var14.method2592(class64.field891, (byte) -115);
        var14.method2619((byte) 63, arg0);
        var14.method2619((byte) -123, arg10);
        var14.method2596((byte) 111, var12[2]);
        var14.method2592(arg5, (byte) -109);
        var14.method2592(arg7, (byte) -127);
        var14.method2596((byte) 119, var12[3]);
        var14.method2584(class266.field3940, class486.field6829, (byte) 85);
        class446 var15 = new class446(350);
        var15.method2597(arg6, (byte) -121);
        int var16 = 8 - class330.method2021((byte) 112, arg6) % 8;
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method2619((byte) -124, (int) (Math.random() * 255.0D));
        }
        var15.method2629(1403216196, var12);
        if (arg9 > -124) {
            return;
        }
        class230.field3390.field6315 = 0;
        class230.field3390.method2619((byte) -128, class109.field1544.field2407);
        class230.field3390.method2592(var14.field6315 + var15.field6315 + 2, (byte) -120);
        class230.field3390.method2592(575, (byte) -110);
        class230.field3390.method2606(0, var14.field6315, var14.field6316, (byte) 0);
        class230.field3390.method2606(0, var15.field6315, var15.field6316, (byte) 0);
        class412.field5947 = 0;
        class78.field1095 = 1;
        class6.field95 = 0;
        class309.field4619 = -3;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
    public static void method2830(int arg0) {
        if (arg0 == 0) {
            field6792 = null;
            field6797 = null;
            field6787 = null;
            field6804 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILnd;)Z")
    public final boolean method2831(int arg0, class484 arg1) {
        field6795++;
        if (arg0 != -1) {
            this.method2828(74, (class446) null);
        }
        return this.field6796 == arg1.field6796 && this.field6784 == arg1.field6784 && this.field6794 == arg1.field6794 && this.field6798 == arg1.field6798 && this.field6801 == arg1.field6801 && this.field6791 == arg1.field6791 && this.field6802 == arg1.field6802 && this.field6805 == arg1.field6805 && this.field6790 == arg1.field6790 && this.field6803 == arg1.field6803;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)I")
    public static final int method2832(int arg0, int arg1) {
        field6800++;
        return arg1 == -1951 ? arg0 >>> 8 : -93;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIII)I")
    public static final int method2833(int arg0, int arg1, int arg2, int arg3) {
        field6793++;
        if (arg1 == arg2) {
            return arg1;
        }
        int var4 = arg0 - arg3;
        int var5 = (arg1 & 0x7F) * var4 + (arg2 & 0x7F) * arg3 >> 7;
        int var6 = (arg1 & 0x380) * var4 + (arg2 & 0x380) * arg3 >> 7;
        int var7 = (arg1 & 0xFC00) * var4 + (arg2 & 0xFC00) * arg3 >> 7;
        return var5 & 0x7F | var7 & 0xFC00 | var6 & 0x380;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
    public class484() {
        this.field6789 = -60;
        this.field6794 = 0.69921875F;
        this.field6798 = 1.2F;
        this.field6803 = class473.field6633;
        this.field6796 = class14.field200;
        this.field6805 = class85.field1221;
        this.field6799 = -50;
        this.field6784 = 1.1523438F;
        this.field6790 = 0;
        this.field6783 = -50;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lre;)V")
    public class484(class446 arg0) {
        int var2 = arg0.method2628(49152);
        if (class337.field5038.field3957 && class336.field5036.method524() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field6796 = class14.field200;
            } else {
                this.field6796 = arg0.method2604(68);
            }
            if ((var2 & 0x2) == 0) {
                this.field6784 = 1.1523438F;
            } else {
                this.field6784 = (float) arg0.method2631(2530) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field6794 = 0.69921875F;
            } else {
                this.field6794 = (float) arg0.method2631(2530) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field6798 = 1.2F;
            } else {
                this.field6798 = (float) arg0.method2631(2530) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method2604(27);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method2631(2530);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method2631(2530);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method2631(2530);
            }
            this.field6798 = 1.2F;
            this.field6784 = 1.1523438F;
            this.field6796 = class14.field200;
            this.field6794 = 0.69921875F;
        }
        if ((var2 & 0x10) == 0) {
            this.field6783 = -50;
            this.field6789 = -60;
            this.field6799 = -50;
        } else {
            this.field6783 = arg0.method2634(-92);
            this.field6789 = arg0.method2634(-36);
            this.field6799 = arg0.method2634(-128);
        }
        if ((var2 & 0x20) == 0) {
            this.field6805 = class85.field1221;
        } else {
            this.field6805 = arg0.method2604(-109);
        }
        if ((var2 & 0x40) == 0) {
            this.field6790 = 0;
        } else {
            this.field6790 = arg0.method2631(2530);
        }
        if ((var2 & 0x80) == 0) {
            this.field6803 = class473.field6633;
        } else {
            this.field6803 = class466.method2736(arg0.method2631(2530), arg0.method2631(2530), 115, arg0.method2631(2530), arg0.method2631(2530), arg0.method2631(2530), arg0.method2631(2530));
        }
    }
}
