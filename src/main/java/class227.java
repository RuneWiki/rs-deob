import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class227 extends class205 implements class41 {

    @OriginalMember(owner = "client!cs", name = "y", descriptor = "S")
    private short field2880;

    @OriginalMember(owner = "client!cs", name = "G", descriptor = "B")
    private byte field2888;

    @OriginalMember(owner = "client!cs", name = "X", descriptor = "B")
    private byte field2905;

    @OriginalMember(owner = "client!cs", name = "Z", descriptor = "Z")
    private boolean field2907;

    @OriginalMember(owner = "client!cs", name = "S", descriptor = "Z")
    private boolean field2900;

    @OriginalMember(owner = "client!cs", name = "eb", descriptor = "B")
    private byte field2912;

    @OriginalMember(owner = "client!cs", name = "bb", descriptor = "Z")
    private boolean field2909;

    @OriginalMember(owner = "client!cs", name = "M", descriptor = "Z")
    private boolean field2894;

    @OriginalMember(owner = "client!cs", name = "B", descriptor = "Lt;")
    public class474 field2883;

    @OriginalMember(owner = "client!cs", name = "R", descriptor = "Lba;")
    private class264 field2899;

    @OriginalMember(owner = "client!cs", name = "K", descriptor = "Ldq;")
    public static class493 field2892 = new class493(84, -1);

    @OriginalMember(owner = "client!cs", name = "Y", descriptor = "Lud;")
    public static class27 field2906 = new class27(15, 0, 1, 0);

    @OriginalMember(owner = "client!cs", name = "z", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!cs", name = "A", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!cs", name = "C", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!cs", name = "D", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!cs", name = "E", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!cs", name = "F", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!cs", name = "H", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!cs", name = "I", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!cs", name = "J", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!cs", name = "L", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!cs", name = "N", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!cs", name = "O", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!cs", name = "P", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!cs", name = "Q", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!cs", name = "T", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!cs", name = "U", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!cs", name = "V", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!cs", name = "W", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!cs", name = "ab", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!cs", name = "cb", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!cs", name = "db", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!cs", name = "fb", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!cs", name = "gb", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!cs", name = "hb", descriptor = "Lga;")
    public static class278 field2915;

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(B)V")
    public final void method180(byte arg0) {
        if (arg0 != -2) {
            this.method180((byte) 3);
        }
        ++field2911;
        this.field2909 = false;
        if (this.field2883 != null) {
            this.field2883.method442(-65537 & this.field2883.method422());
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)Z")
    public final boolean method182(int arg0) {
        if (arg0 != -2286) {
            return false;
        } else {
            ++field2887;
            return this.field2894;
        }
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(ILya;)V")
    public final void method185(int arg0, class38 arg1) {
        if (arg0 != 15397) {
            this.field2888 = 79;
        }
        ++field2901;
        Object var3 = null;
        class264 var5;
        if (this.field2899 == null && this.field2894) {
            class3 var4 = this.method1383(262144, true, arg1, -124);
            var5 = var4 != null ? var4.field28 : null;
        } else {
            var5 = this.field2899;
            this.field2899 = null;
        }
        if (var5 != null) {
            class481.method2933(var5, this.field2905, super.field2666, super.field2677, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILya;II)Z")
    public final boolean method186(int arg0, class38 arg1, int arg2, int arg3) {
        if (arg0 < 66) {
            field2910 = 82;
        }
        ++field2895;
        class474 var5 = this.method1381(arg1, 131072, (byte) -38);
        if (var5 != null) {
            class123 var6 = arg1.method369();
            var6.method229(super.field2666, super.field2672, super.field2677);
            return var5.method412(arg2, arg3, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Ljava/awt/Canvas;B)Lng;")
    public static final class228 method1378(Canvas arg0, byte arg1) {
        ++field2882;
        try {
            Class var2 = Class.forName("oj");
            if (arg1 != -116) {
                field2906 = null;
            }
            class228 var3 = (class228) var2.newInstance();
            var3.method1387(arg0, 0);
            return var3;
        } catch (Throwable var5) {
            class391 var4 = new class391();
            var4.method1387(arg0, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(BII)Z")
    public static final boolean method1379(byte arg0, int arg1, int arg2) {
        ++field2898;
        if (!class122.field1646) {
            return false;
        } else {
            int var3 = -97 % ((arg0 - -90) / 34);
            int var4 = arg1 >> 16;
            int var5 = 65535 & arg1;
            if (class293.field3725[var4] != null && class293.field3725[var4][var5] != null) {
                class523 var6 = class293.field3725[var4][var5];
                if (~arg2 == 0 && var6.field7632 == 0) {
                    for (class520 var7 = (class520) class201.field2616.method153(0); var7 != null; var7 = (class520) class201.field2616.method161(-45)) {
                        if (~var7.field7508 == -59 || ~var7.field7508 == -1013 || var7.field7508 == 12 || ~var7.field7508 == -48 || ~var7.field7508 == -5) {
                            for (class523 var8 = class310.method1810(var7.field7511, 1182823664); var8 != null; var8 = class262.method1568(var8, -80)) {
                                if (~var6.field7723 == ~var8.field7723) {
                                    return true;
                                }
                            }
                        }
                    }
                } else {
                    for (class520 var9 = (class520) class201.field2616.method153(0); var9 != null; var9 = (class520) class201.field2616.method161(-48)) {
                        if (var9.field7507 == arg2 && var6.field7723 == var9.field7511 && (var9.field7508 == 58 || ~var9.field7508 == -1013 || ~var9.field7508 == -13 || var9.field7508 == 47 || ~var9.field7508 == -5)) {
                            return true;
                        }
                    }
                }
                return false;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "(B)V")
    public static void method1380(byte arg0) {
        field2892 = null;
        if (arg0 <= -35) {
            field2915 = null;
            field2906 = null;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ZLya;)Llo;")
    public final class531 method181(boolean arg0, class38 arg1) {
        ++field2897;
        if (this.field2883 == null) {
            return null;
        } else {
            class123 var3 = arg1.method369();
            var3.method229(super.field2666, super.field2672, super.field2677);
            class531 var4 = null;
            if (this.field2900) {
                var4 = class119.method850(1, 21);
            }
            this.field2883.method415(var3, var4 != null ? var4.field7810[0] : null, 0);
            if (!arg0) {
                this.field2894 = true;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "(I)V")
    public final void method191(int arg0) {
        ++field2902;
        if (this.field2883 != null) {
            this.field2883.method439();
        }
        if (arg0 != 27223) {
            this.field2909 = true;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lya;I)V")
    public final void method192(class38 arg0, int arg1) {
        ++field2884;
        if (arg1 != 1) {
            this.field2888 = -127;
        }
    }

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "(I)I")
    public final int method733(int arg0) {
        ++field2914;
        if (arg0 != -29382) {
            return -3;
        } else {
            return this.field2883 != null ? this.field2883.method418() : 0;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)Z")
    public final boolean method194(byte arg0) {
        if (arg0 >= -72) {
            field2906 = null;
        }
        ++field2896;
        return this.field2909;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lya;IB)Lt;")
    private final class474 method1381(class38 arg0, int arg1, byte arg2) {
        if (arg2 != -38) {
            this.method1383(53, false, (class38) null, 20);
        }
        ++field2881;
        if (this.field2883 != null && ~arg0.method307(this.field2883.method422(), arg1) == -1) {
            return this.field2883;
        } else {
            class3 var4 = this.method1383(arg1, false, arg0, -109);
            return var4 != null ? var4.field26 : null;
        }
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lya;Lho;IIIIIZIIIIIIZ)V")
    public class227(class38 arg0, class102 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field1276 == -2, class404.method2388(126, arg13, arg12));
        this.field2880 = (short) arg1.field1316;
        this.field2888 = (byte) arg13;
        this.field2905 = (byte) arg3;
        this.field2907 = arg7;
        this.field2900 = ~arg1.field1305 != -1 && !arg7;
        this.field2912 = (byte) arg12;
        this.field2909 = arg14;
        this.field2894 = arg0.method281() && arg1.field1312 && !this.field2907 && class407.field5817.method1681(class377.field4959, -28198) != 0;
        int var16 = 2048;
        if (this.field2909) {
            var16 |= 65536;
        }
        class3 var17 = this.method1383(var16, this.field2894, arg0, -124);
        if (var17 != null) {
            this.field2883 = var17.field26;
            this.field2899 = var17.field28;
            if (this.field2909) {
                this.field2883 = this.field2883.method416((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(III)I")
    public static final int method1382(int arg0, int arg1, int arg2) {
        ++field2904;
        if (arg2 != -2) {
            return -43;
        } else {
            int var3 = arg1 >>> 24;
            int var4 = -var3 + 255;
            int var5 = ((arg1 & 16711935) * var3 & -16711936 | 16711680 & (arg1 & 65280) * var3) >>> 8;
            return (((65280 & arg0) * var4 & 16711680 | -16711936 & (arg0 & 16711935) * var4) >>> 8) + var5;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Z)I")
    public final int method178(boolean arg0) {
        ++field2891;
        if (!arg0) {
            field2910 = -96;
        }
        return this.field2888;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IZLya;I)Ldp;")
    private final class3 method1383(int arg0, boolean arg1, class38 arg2, int arg3) {
        ++field2886;
        class102 var5 = class315.field4017.method1958(-10091, 65535 & this.field2880);
        class143 var6;
        class143 var7;
        if (!this.field2907) {
            var6 = class531.field7811[this.field2905];
            if (~this.field2905 <= -4) {
                var7 = null;
            } else {
                var7 = class531.field7811[this.field2905 + 1];
            }
        } else {
            var7 = class531.field7811[0];
            var6 = class140.field1808[this.field2905];
        }
        int var8 = -107 % ((arg3 - -16) / 58);
        return var5.method770(super.field2666, super.field2672, arg1, var7, ~this.field2912 != -12 ? this.field2912 : 10, arg2, arg0, 125, var6, super.field2677, ~this.field2912 != -12 ? this.field2888 : 4 - -this.field2888);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILya;)V")
    public final void method184(int arg0, class38 arg1) {
        ++field2890;
        Object var3 = null;
        if (arg0 != -5534) {
            this.method178(false);
        }
        class264 var5;
        if (this.field2899 == null && this.field2894) {
            class3 var4 = this.method1383(262144, true, arg1, arg0 ^ 5615);
            var5 = var4 != null ? var4.field28 : null;
        } else {
            var5 = this.field2899;
            this.field2899 = null;
        }
        if (var5 != null) {
            class125.method880(var5, this.field2905, super.field2666, super.field2677, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "(Z)I")
    public final int method1384(boolean arg0) {
        ++field2903;
        if (!arg0) {
            return 59;
        } else {
            return this.field2883 != null ? this.field2883.method424() / 4 : 15;
        }
    }

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "(I)I")
    public final int method189(int arg0) {
        if (arg0 != 32725) {
            return -59;
        } else {
            ++field2885;
            return this.field2912;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IILya;)Lt;")
    public final class474 method179(int arg0, int arg1, class38 arg2) {
        if (arg1 < 72) {
            return null;
        } else {
            ++field2908;
            return this.method1381(arg2, arg0, (byte) -38);
        }
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)I")
    public final int method187(int arg0) {
        if (arg0 != 21067) {
            this.field2905 = 105;
        }
        ++field2889;
        return 65535 & this.field2880;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lgg;IZIIILya;)V")
    public final void method193(class117 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class38 arg6) {
        int var8 = 80 / ((arg5 - 27) / 40);
        ++field2913;
        if (!(arg0 instanceof class482)) {
            if (arg0 instanceof class227) {
                class227 var9 = (class227) arg0;
                if (this.field2883 != null && var9.field2883 != null) {
                    this.field2883.method435(var9.field2883, arg1, arg4, arg3, arg2);
                    return;
                }
            }
        } else {
            class482 var10 = (class482) arg0;
            if (this.field2883 == null || var10.field7038 == null) {
                return;
            }
            this.field2883.method435(var10.field7038, arg1, arg4, arg3, arg2);
        }
    }
}
