import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class590 {

    @OriginalMember(owner = "client!nda", name = "d", descriptor = "Lki;")
    public static class320 field8284 = new class320();

    @OriginalMember(owner = "client!nda", name = "h", descriptor = "Lec;")
    public static class146 field8288 = new class146(4);

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "I")
    public static int field8281;

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "I")
    public static int field8282;

    @OriginalMember(owner = "client!nda", name = "e", descriptor = "I")
    public static int field8285;

    @OriginalMember(owner = "client!nda", name = "f", descriptor = "I")
    public static int field8286;

    @OriginalMember(owner = "client!nda", name = "g", descriptor = "I")
    public static int field8287;

    @OriginalMember(owner = "client!nda", name = "k", descriptor = "Lr;")
    public static class566 field8291;

    @OriginalMember(owner = "client!nda", name = "c", descriptor = "Lpl;")
    public static class612 field8283;

    @OriginalMember(owner = "client!nda", name = "i", descriptor = "Lrj;")
    public static class648 field8289;

    @OriginalMember(owner = "client!nda", name = "j", descriptor = "[I")
    public static int[] field8290;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(B)V", line = 5)
    public static void method3243(byte arg0) {
        if (arg0 <= 24) {
            field8287 = -16;
        }
        field8290 = null;
        field8289 = null;
        field8283 = null;
        field8284 = null;
        field8288 = null;
        field8291 = null;
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(I)V", line = 20)
    public static final void method3244(int arg0) {
        field8281++;
        class360.field4584 = 0;
        boolean var1 = class298.field3671.method3501(-9268) == 1;
        int var2 = class298.field3671.method3482(true);
        int var3 = class298.field3671.method3467((byte) -80);
        int var4 = class298.field3671.method3499(arg0 - 2072317725);
        class632.method3540(arg0 - 2072317609);
        class592.method3251(arg0 ^ 0x7B850E9A, var4);
        int var5 = (class8.field162 - class298.field3671.field8812) / 16;
        class500.field6598 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class500.field6598[var6][var10] = class298.field3671.method3483(63);
            }
        }
        class137.field1782 = new byte[var5][];
        if (arg0 != 2072317608) {
            field8287 = -74;
        }
        class565.field7887 = null;
        class442.field5599 = new int[var5];
        class277.field3474 = null;
        class638.field8956 = new int[var5];
        class209.field2635 = new byte[var5][];
        class633.field8884 = new int[var5];
        class564.field7842 = new int[var5];
        class511.field6945 = new int[var5];
        class169.field2212 = new byte[var5][];
        class496.field6546 = new byte[var5][];
        int var7 = 0;
        for (int var8 = (var3 - (class431.field5395 >> 4)) / 8; var8 <= (var3 + (class431.field5395 >> 4)) / 8; var8++) {
            for (int var9 = (var2 - (class452.field5802 >> 4)) / 8; var9 <= ((class452.field5802 >> 4) + var2) / 8; var9++) {
                class564.field7842[var7] = (var8 << 8) + var9;
                class442.field5599[var7] = class600.field8416.method3341("m" + var8 + "_" + var9, arg0 - 2072317670);
                class511.field6945[var7] = class600.field8416.method3341("l" + var8 + "_" + var9, -102);
                class633.field8884[var7] = class600.field8416.method3341("um" + var8 + "_" + var9, class688.method3877(arg0, 2072317572));
                class638.field8956[var7] = class600.field8416.method3341("ul" + var8 + "_" + var9, 119);
                var7++;
            }
        }
        class560.method3075(11, 512, var1, var3, var2);
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(Les;I)Lqga;", line = 97)
    public static final class192 method3245(class630 arg0, int arg1) {
        field8285++;
        int var2 = arg0.method3470(13111);
        class414 var3 = class349.method1929((byte) 87)[arg0.method3501(-9268)];
        class29 var4 = class20.method132(103)[arg0.method3501(-9268)];
        int var5 = -63 / ((44 - arg1) / 60);
        int var6 = arg0.method3510(51);
        int var7 = arg0.method3510(106);
        return new class192(var2, var3, var4, var6, var7);
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIIBIIIII)V", line = 123)
    public static final void method3246(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field8286++;
        if (arg3 != 68) {
            field8283 = null;
        }
        if (arg4 < 1 || arg5 < 1 || class431.field5395 - 2 < arg4 || (class452.field5802 - 2) < arg5) {
            return;
        }
        int var9 = arg7;
        if (arg7 < 3 && class3.method22(arg5, arg4, 5706)) {
            var9 = arg7 + 1;
        }
        if (!class301.field3698.method135(class651.field9191, 113) && !class367.method2011(var9, class667.field9402, arg4, (byte) 108, arg5)) {
            return;
        }
        if (class270.field3423 == null) {
            return;
        }
        class392.field4940.method3606(arg4, class154.field1991[arg7], 99, arg7, arg0, arg5, class32.field452);
        if (arg8 < 0) {
            return;
        }
        boolean var10 = class301.field3698.field6646;
        class301.field3698.field6646 = true;
        class392.field4940.method3613(arg2, class154.field1991[arg7], arg6, class32.field452, arg1, var9, -12, arg8, arg5, arg7, arg4);
        class301.field3698.field6646 = var10;
        return;
    }

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "(B)V", line = 166)
    public static final void method3247(byte arg0) {
        if (arg0 != -78) {
            method3247((byte) 6);
        }
        for (int var1 = 0; var1 < class281.field3526; var1++) {
            int var2 = class456.field5831[var1];
            class307 var3 = ((class206) class180.field2318.method399(-32748, (long) var2)).field2618;
            int var4 = class298.field3671.method3501(-9268);
            if ((var4 & 0x80) != 0) {
                var4 += class298.field3671.method3501(-9268) << 8;
            }
            if ((var4 & 0x200) != 0) {
                int var5 = class298.field3671.method3482(true);
                var3.field9720 = class298.field3671.method3498(255);
                var3.field9670 = class298.field3671.method3498(arg0 + 333);
                var3.field9717 = var5 & 0x7FFF;
                var3.field9675 = (var5 & 0x8000) != 0;
                var3.field9663 = class133.field1735 + var3.field9720 + var3.field9717;
            }
            if ((var4 & 0x10) != 0) {
                int var6 = class298.field3671.method3504(-13829);
                int var7 = class298.field3671.method3514((byte) -18);
                var3.method3864(class133.field1735, var7, var6, arg0 + 199);
                var3.field9735 = class133.field1735 + 300;
                var3.field9695 = class298.field3671.method3499(arg0 ^ 0x39);
            }
            if ((var4 & 0x2) != 0) {
                if (var3.field3902.method3230((byte) 126)) {
                    class361.method1986(var3, (byte) -114);
                }
                var3.method1781(class287.field3581.method1490(class298.field3671.method3467((byte) -80), (byte) -121), 0);
                var3.method3863(var3.field3902.field8210, 0);
                var3.field9716 = var3.field3902.field8214 << 3;
                if (var3.field3902.method3230((byte) -13)) {
                    class57.method364(-120, null, null, 0, var3, var3.field9758[0], var3.field9754[0], var3.field6470);
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field9650 = class298.field3671.method3467((byte) -80);
                if (var3.field9650 == 65535) {
                    var3.field9650 = -1;
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field3899 = class298.field3671.method3470(13111);
                var3.field3909 = class298.field3671.method3482(true);
            }
            if ((var4 & 0x800) != 0) {
                var3.field9651 = class298.field3671.method3520(16436);
                var3.field9722 = class298.field3671.method3495(false);
                var3.field9715 = class298.field3671.method3485((byte) -51);
                var3.field9694 = class298.field3671.method3480(-20933);
                var3.field9740 = class298.field3671.method3467((byte) -80) + class133.field1735;
                var3.field9665 = class298.field3671.method3467((byte) -80) + class133.field1735;
                var3.field9685 = class298.field3671.method3498(255);
                var3.field9722 += var3.field9754[0];
                var3.field9756 = 1;
                var3.field9651 += var3.field9758[0];
                var3.field9715 += var3.field9758[0];
                var3.field9694 += var3.field9754[0];
                var3.field9753 = 0;
            }
            if ((var4 & 0x1000) != 0) {
                int var8 = class298.field3671.method3504(-13829);
                int var9 = class298.field3671.method3514((byte) -18);
                var3.method3864(class133.field1735, var9, var8, 123);
            }
            if ((var4 & 0x100) != 0) {
                int var10 = class298.field3671.method3519((byte) 104);
                int var11 = class298.field3671.method3483(arg0 ^ 0xFFFFFF8B);
                if (var10 == 65535) {
                    var10 = -1;
                }
                int var12 = class298.field3671.method3514((byte) -18);
                var3.method3865(var11, var10, (byte) 97, var12, true);
            }
            if ((var4 & 0x1) != 0) {
                int var13 = class298.field3671.method3467((byte) -80);
                int var14 = class298.field3671.method3486(-71);
                if (var13 == 65535) {
                    var13 = -1;
                }
                int var15 = class298.field3671.method3501(arg0 - 9190);
                var3.method3865(var14, var13, (byte) 37, var15, false);
            }
            if ((var4 & 0x400) != 0) {
                var3.field9686 = class298.field3671.method3485((byte) -51);
                var3.field9703 = class298.field3671.method3520(16436);
                var3.field9710 = class298.field3671.method3495(false);
                var3.field9714 = (byte) class298.field3671.method3501(-9268);
                var3.field9742 = class133.field1735 + class298.field3671.method3482(true);
                var3.field9693 = class133.field1735 + class298.field3671.method3482(true);
            }
            if ((var4 & 0x2000) != 0) {
                int var16 = class298.field3671.method3499(arg0 - 39);
                int[] var17 = new int[var16];
                int[] var18 = new int[var16];
                int[] var19 = new int[var16];
                for (int var20 = 0; var20 < var16; var20++) {
                    int var21 = class298.field3671.method3467((byte) -80);
                    if (var21 == 65535) {
                        var21 = -1;
                    }
                    var17[var20] = var21;
                    var18[var20] = class298.field3671.method3499(-106);
                    var19[var20] = class298.field3671.method3482(true);
                }
                class165.method940(var17, var18, (byte) -94, var3, var19);
            }
            if ((var4 & 0x4) != 0) {
                int[] var22 = new int[4];
                for (int var23 = 0; var23 < 4; var23++) {
                    var22[var23] = class298.field3671.method3470(13111);
                    if (var22[var23] == 65535) {
                        var22[var23] = -1;
                    }
                }
                int var24 = class298.field3671.method3499(-122);
                class373.method2033(var22, (byte) -122, var3, var24);
            }
            if ((var4 & 0x8) != 0) {
                var3.field9667 = class298.field3671.method3500((byte) 125);
                var3.field9655 = 100;
            }
        }
        field8282++;
    }
}
