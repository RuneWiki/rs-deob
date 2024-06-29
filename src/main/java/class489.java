import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class489 {

    @OriginalMember(owner = "client!vq", name = "l", descriptor = "I")
    public int field6778 = 5;

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "I")
    public int field6768 = -1;

    @OriginalMember(owner = "client!vq", name = "k", descriptor = "Z")
    public boolean field6777 = false;

    @OriginalMember(owner = "client!vq", name = "p", descriptor = "Z")
    public boolean field6782 = false;

    @OriginalMember(owner = "client!vq", name = "t", descriptor = "I")
    public int field6786 = 2;

    @OriginalMember(owner = "client!vq", name = "j", descriptor = "I")
    public int field6776 = -1;

    @OriginalMember(owner = "client!vq", name = "s", descriptor = "I")
    public int field6785 = 99;

    @OriginalMember(owner = "client!vq", name = "w", descriptor = "I")
    public int field6789 = -1;

    @OriginalMember(owner = "client!vq", name = "z", descriptor = "Z")
    public boolean field6792 = false;

    @OriginalMember(owner = "client!vq", name = "D", descriptor = "Z")
    public boolean field6795 = false;

    @OriginalMember(owner = "client!vq", name = "u", descriptor = "I")
    public int field6787 = -1;

    @OriginalMember(owner = "client!vq", name = "F", descriptor = "I")
    public int field6797 = -1;

    @OriginalMember(owner = "client!vq", name = "q", descriptor = "[I")
    public static int[] field6783 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!vq", name = "n", descriptor = "I")
    public static int field6780 = 0;

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "I")
    public static int field6769;

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "I")
    public static int field6770;

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "I")
    public static int field6772;

    @OriginalMember(owner = "client!vq", name = "o", descriptor = "I")
    public static int field6781;

    @OriginalMember(owner = "client!vq", name = "r", descriptor = "I")
    public int field6784;

    @OriginalMember(owner = "client!vq", name = "x", descriptor = "I")
    public static int field6790;

    @OriginalMember(owner = "client!vq", name = "y", descriptor = "I")
    public static int field6791;

    @OriginalMember(owner = "client!vq", name = "C", descriptor = "I")
    public static int field6794;

    @OriginalMember(owner = "client!vq", name = "h", descriptor = "Luaa;")
    public class127 field6774;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "[I")
    private int[] field6767;

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "[I")
    public int[] field6771;

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "[I")
    public int[] field6773;

    @OriginalMember(owner = "client!vq", name = "i", descriptor = "[I")
    public int[] field6775;

    @OriginalMember(owner = "client!vq", name = "v", descriptor = "[I")
    public int[] field6788;

    @OriginalMember(owner = "client!vq", name = "B", descriptor = "[I")
    public int[] field6793;

    @OriginalMember(owner = "client!vq", name = "E", descriptor = "[Z")
    public boolean[] field6796;

    @OriginalMember(owner = "client!vq", name = "m", descriptor = "[[I")
    public int[][] field6779;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(ILjp;I)V")
    private final void method2840(int arg0, class376 arg1, int arg2) {
        field6772++;
        if (arg0 == 1) {
            int var16 = arg1.method2359(-1);
            this.field6773 = new int[var16];
            for (int var17 = 0; var17 < var16; var17++) {
                this.field6773[var17] = arg1.method2359(-1);
            }
            this.field6775 = new int[var16];
            for (int var18 = 0; var18 < var16; var18++) {
                this.field6775[var18] = arg1.method2359(-1);
            }
            for (int var19 = 0; var19 < var16; var19++) {
                this.field6775[var19] += arg1.method2359(-1) << 16;
            }
        } else if (arg0 == 2) {
            this.field6789 = arg1.method2359(-1);
        } else if (arg0 == 3) {
            this.field6796 = new boolean[256];
            int var14 = arg1.method2398(-1372747256);
            for (int var15 = 0; var15 < var14; var15++) {
                this.field6796[arg1.method2398(-1372747256)] = true;
            }
        } else if (arg0 == 5) {
            this.field6778 = arg1.method2398(-1372747256);
        } else if (arg0 == 6) {
            this.field6787 = arg1.method2359(-1);
        } else if (arg0 == 7) {
            this.field6776 = arg1.method2359(-1);
        } else if (arg0 == 8) {
            this.field6785 = arg1.method2398(-1372747256);
        } else if (arg0 == 9) {
            this.field6768 = arg1.method2398(-1372747256);
        } else if (arg0 == 10) {
            this.field6797 = arg1.method2398(-1372747256);
        } else if (arg0 == 11) {
            this.field6786 = arg1.method2398(-1372747256);
        } else if (arg0 == 12) {
            int var4 = arg1.method2398(-1372747256);
            this.field6767 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field6767[var5] = arg1.method2359(-1);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                this.field6767[var6] += arg1.method2359(-1) << 16;
            }
        } else if (arg0 == 13) {
            int var7 = arg1.method2359(-1);
            this.field6779 = new int[var7][];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = arg1.method2398(-1372747256);
                if (var9 > 0) {
                    this.field6779[var8] = new int[var9];
                    this.field6779[var8][0] = arg1.method2373(1223262424);
                    for (int var10 = 1; var10 < var9; var10++) {
                        this.field6779[var8][var10] = arg1.method2359(-1);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field6795 = true;
        } else if (arg0 == 15) {
            this.field6792 = true;
        } else if (arg0 == 16) {
            this.field6777 = true;
        } else if (arg0 == 18) {
            this.field6782 = true;
        } else if (arg0 == 19) {
            if (this.field6788 == null) {
                this.field6788 = new int[this.field6779.length];
                for (int var13 = 0; var13 < this.field6779.length; var13++) {
                    this.field6788[var13] = 255;
                }
            }
            this.field6788[arg1.method2398(-1372747256)] = arg1.method2398(-1372747256);
        } else if (arg0 == 20) {
            if (this.field6793 == null || this.field6771 == null) {
                this.field6793 = new int[this.field6779.length];
                this.field6771 = new int[this.field6779.length];
                for (int var11 = 0; var11 < this.field6779.length; var11++) {
                    this.field6793[var11] = 256;
                    this.field6771[var11] = 256;
                }
            }
            int var12 = arg1.method2398(-1372747256);
            this.field6793[var12] = arg1.method2359(-1);
            this.field6771[var12] = arg1.method2359(-1);
        }
        int var20 = 9 / ((6 - arg2) / 47);
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Ljp;I)V")
    public final void method2841(class376 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2398(-1372747256);
            if (var3 == 0) {
                field6794++;
                if (arg1 > -22) {
                    method2844(null, 86, 58, true);
                    return;
                }
                return;
            }
            this.method2840(var3, arg0, -55);
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIBLka;III)Lka;")
    public final class500 method2842(int arg0, int arg1, int arg2, byte arg3, class500 arg4, int arg5, int arg6, int arg7) {
        field6769++;
        int var9 = this.field6773[arg7];
        int var10 = this.field6775[arg7];
        class717 var11 = this.field6774.method1030(-4849, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg4.method298(arg3, arg0, true);
        }
        class717 var13 = null;
        if ((this.field6792 || class423.field6046) && arg1 != -1 && this.field6775.length > arg1) {
            int var14 = this.field6775[arg1];
            var13 = this.field6774.method1030(-4849, var14 >> 16);
            arg1 = var14 & 0xFFFF;
        }
        if (this.field6795) {
            arg0 |= 0x200;
        }
        if (var11.method4006((byte) -114, var12)) {
            arg0 |= 0x80;
        }
        if (var11.method4007(false, var12)) {
            arg0 |= 0x100;
        }
        if (var11.method4005(var12, -1)) {
            arg0 |= 0x400;
        }
        if (arg5 != 256) {
            this.method2843(false, 99, -41, -57);
        }
        if (var13 != null) {
            if (var13.method4006((byte) -114, arg1)) {
                arg0 |= 0x80;
            }
            if (var13.method4007(false, arg1)) {
                arg0 |= 0x100;
            }
            if (var13.method4005(arg1, arg5 ^ 0xFFFFFEFF)) {
                arg0 |= 0x400;
            }
        }
        int var15 = arg0 | 0x20;
        class500 var16 = arg4.method298(arg3, var15, true);
        var16.method2889(arg6, var12, arg2 - 1, this.field6795, var11, arg1, var9, (byte) -44, var13);
        return var16;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZIII)I")
    public final int method2843(boolean arg0, int arg1, int arg2, int arg3) {
        field6770++;
        int var5 = 0;
        int var6 = 0;
        if (arg2 != 27123) {
            this.method2842(-31, 74, 118, (byte) 8, null, -102, 81, -76);
        }
        int var7 = this.field6775[arg3];
        class717 var8 = null;
        class717 var9 = this.field6774.method1030(arg2 ^ 0xFFFF84FC, var7 >> 16);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field6792 || class423.field6046) && arg1 != -1 && arg1 < this.field6775.length) {
            int var11 = this.field6775[arg1];
            var8 = this.field6774.method1030(-4849, var11 >> 16);
            var6 = var11 & 0xFFFF;
        }
        if (this.field6795) {
            var5 |= 0x200;
        }
        if (var9.method4006((byte) -114, var10)) {
            var5 |= 0x80;
        }
        if (var9.method4007(false, var10)) {
            var5 |= 0x100;
        }
        if (var9.method4005(var10, arg2 - 27124)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method4006((byte) -114, var6)) {
                var5 |= 0x80;
            }
            if (var8.method4007(false, var6)) {
                var5 |= 0x100;
            }
            if (var8.method4005(var6, -1)) {
                var5 |= 0x400;
            }
        }
        if (this.field6767 != null && arg0) {
            if (arg3 < this.field6767.length) {
                int var12 = this.field6767[arg3];
                if (var12 != 65535) {
                    class717 var13 = this.field6774.method1030(-4849, var12 >> 16);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method4006((byte) -114, var14)) {
                            var5 |= 0x80;
                        }
                        if (var13.method4007(false, var14)) {
                            var5 |= 0x100;
                        }
                        if (var13.method4005(var14, -1)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field6792 || class423.field6046) && arg1 != -1 && this.field6767.length > arg1) {
                int var15 = this.field6767[arg1];
                if (var15 != 65535) {
                    class717 var16 = this.field6774.method1030(-4849, var15 >> 16);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method4006((byte) -114, var17)) {
                            var5 |= 0x80;
                        }
                        if (var16.method4007(false, var17)) {
                            var5 |= 0x100;
                        }
                        if (var16.method4005(var17, -1)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Ljava/lang/String;IIZ)V")
    public static final void method2844(String arg0, int arg1, int arg2, boolean arg3) {
        class26.method200(8);
        field6781++;
        if (arg2 == 0) {
            class379.field5542 = class11.method89(0, class482.field6667, class691.field9695, (byte) -83, class712.field9959.field1271.method2880(47) * 2, class706.field9894);
            if (arg0 != null) {
                class379.field5542.method458(0);
                class255 var13 = class564.method3157(0, class781.field10716, class229.field3121, (byte) 44);
                class66 var14 = class379.field5542.method545(var13, class508.method2946(class643.field8927, class229.field3121, 0), true);
                class59.method415(true);
                class660.method3653(var14, class379.field5542, var13, true, -125, arg0);
            }
        } else {
            class65 var4 = null;
            if (arg0 != null) {
                var4 = class11.method89(0, class482.field6667, class691.field9695, (byte) -83, 0, class706.field9894);
                var4.method458(0);
                class255 var5 = class564.method3157(0, class781.field10716, class229.field3121, (byte) 44);
                class66 var6 = var4.method545(var5, class508.method2946(class643.field8927, class229.field3121, 0), true);
                class59.method415(true);
                class660.method3653(var6, var4, var5, true, -118, arg0);
            }
            boolean var25 = false;
            label216: {
                try {
                    var25 = true;
                    class379.field5542 = class11.method89(arg2, class482.field6667, class691.field9695, (byte) -83, class712.field9959.field1271.method2880(75) * 2, class706.field9894);
                    if (arg0 != null) {
                        var4.method458(0);
                        class255 var7 = class564.method3157(0, class781.field10716, class229.field3121, (byte) 44);
                        class66 var8 = var4.method545(var7, class508.method2946(class643.field8927, class229.field3121, 0), true);
                        class59.method415(true);
                        class660.method3653(var8, var4, var7, true, -121, arg0);
                    }
                    if (class379.field5542.method491()) {
                        boolean var9 = true;
                        try {
                            var9 = class693.field9717.field550 > 256;
                        } catch (Throwable var29) {
                        }
                        class437 var10;
                        if (var9) {
                            var10 = class379.field5542.method482(146800640);
                        } else {
                            var10 = class379.field5542.method482(104857600);
                        }
                        class379.field5542.method449(var10);
                        var25 = false;
                    } else {
                        var25 = false;
                    }
                    break label216;
                } catch (Throwable var30) {
                    int var11 = class712.field9959.field1270.method4293(48);
                    if (var11 == 2) {
                        class648.field9005 = true;
                    }
                    class712.field9959.method735(0, class712.field9959.field1270, 80);
                    method2844(arg0, 100, var11, arg3);
                    Object var10000 = null;
                    var25 = false;
                } finally {
                    if (var25) {
                        Object var18 = null;
                        if (var4 != null) {
                            try {
                                var4.method470((byte) -87);
                            } catch (Throwable var26) {
                            }
                        }
                    }
                }
                if (var4 != null) {
                    try {
                        var4.method470((byte) -87);
                    } catch (Throwable var27) {
                    }
                }
                return;
            }
            Object var17 = null;
            if (var4 != null) {
                try {
                    var4.method470((byte) -87);
                } catch (Throwable var28) {
                }
            }
        }
        class712.field9959.field1270.method4289(!arg3, -23343);
        class712.field9959.method735(arg2, class712.field9959.field1270, 118);
        class291.method1843(56);
        class379.field5542.method459(10000);
        class379.field5542.method481(32);
        class334.field4865 = class379.field5542.method472();
        class176.field2342 = class379.field5542.method472();
        int var15 = 67 % ((arg1 + 21) / 39);
        class560.method3149((byte) -109);
        class379.field5542.method531(class712.field9959.field1298.method1051(24) == 1);
        if (class379.field5542.method478()) {
            class688.method3821((byte) -35, class712.field9959.field1312.method2681(15) == 1);
        }
        class403.method2510(class597.field8132 >> 3, 0, class628.field8800 >> 3, class379.field5542);
        class596.method3322((byte) 63);
        class92.field1310 = true;
        class29.field423 = null;
        class747.field10301 = false;
        class332.method2082(22);
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
    public final void method2845(int arg0) {
        if (this.field6768 == -1) {
            if (this.field6796 == null) {
                this.field6768 = 0;
            } else {
                this.field6768 = 2;
            }
        }
        if (this.field6797 == -1) {
            if (this.field6796 == null) {
                this.field6797 = 0;
            } else {
                this.field6797 = 2;
            }
        }
        if (arg0 != -29692) {
            this.field6786 = 77;
        }
        field6791++;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(ILka;ZIII)Lka;")
    public final class500 method2846(int arg0, class500 arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field6790++;
        int var7 = this.field6773[arg5];
        int var8 = this.field6775[arg5];
        class717 var9 = this.field6774.method1030(-4849, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg1.method298((byte) 1, arg4, true);
        }
        class717 var11 = null;
        if ((this.field6792 || class423.field6046) && arg3 != -1 && arg3 < this.field6775.length) {
            int var12 = this.field6775[arg3];
            var11 = this.field6774.method1030(-4849, var12 >> 16);
            arg3 = var12 & 0xFFFF;
        }
        class717 var13 = null;
        class717 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field6767 != null) {
            if (this.field6767.length > arg5) {
                var15 = this.field6767[arg5];
                if (var15 != 65535) {
                    var13 = this.field6774.method1030(-4849, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field6792 || class423.field6046) && arg3 != -1 && this.field6767.length > arg3) {
                var16 = this.field6767[arg3];
                if (var16 != 65535) {
                    var14 = this.field6774.method1030(-4849, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field6795) {
            arg4 |= 0x200;
        }
        if (var9.method4006((byte) -114, var10)) {
            arg4 |= 0x80;
        }
        if (var9.method4007(arg2, var10)) {
            arg4 |= 0x100;
        }
        if (var9.method4005(var10, -1)) {
            arg4 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method4006((byte) -114, var15)) {
                arg4 |= 0x80;
            }
            if (var13.method4007(false, var15)) {
                arg4 |= 0x100;
            }
            if (var13.method4005(var15, -1)) {
                arg4 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method4006((byte) -114, arg3)) {
                arg4 |= 0x80;
            }
            if (var11.method4007(arg2, arg3)) {
                arg4 |= 0x100;
            }
            if (var11.method4005(arg3, -1)) {
                arg4 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method4006((byte) -114, var16)) {
                arg4 |= 0x80;
            }
            if (var14.method4007(arg2, var16)) {
                arg4 |= 0x100;
            }
            if (var14.method4005(var16, -1)) {
                arg4 |= 0x400;
            }
        }
        int var17 = arg4 | 0x20;
        class500 var18 = arg1.method298((byte) 1, var17, true);
        var18.method2889(0, var10, arg0 - 1, this.field6795, var9, arg3, var7, (byte) -51, var11);
        if (var13 != null) {
            var18.method2889(0, var15, arg0 - 1, this.field6795, var13, var16, var7, (byte) -123, var14);
        }
        return var18;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V")
    public static void method2847(byte arg0) {
        int var1 = 24 % ((arg0 - 10) / 56);
        field6783 = null;
    }
}
