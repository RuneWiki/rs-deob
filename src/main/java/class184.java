import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class184 extends class130 {

    @OriginalMember(owner = "client!ud", name = "N", descriptor = "I")
    public int field3727 = -1;

    @OriginalMember(owner = "client!ud", name = "S", descriptor = "[I")
    private int[] field3732 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ud", name = "X", descriptor = "Z")
    public boolean field3737 = false;

    @OriginalMember(owner = "client!ud", name = "K", descriptor = "Lgg;")
    public static class63 field3724 = class116.method911(43, "bevor Sie den Vorgang wiederholen)3");

    @OriginalMember(owner = "client!ud", name = "Z", descriptor = "Lgg;")
    public static class63 field3739 = class116.method911(43, "rot:");

    @OriginalMember(owner = "client!ud", name = "P", descriptor = "I")
    public static int field3729 = 0;

    @OriginalMember(owner = "client!ud", name = "J", descriptor = "I")
    public static int field3723 = 50;

    @OriginalMember(owner = "client!ud", name = "U", descriptor = "[I")
    public static int[] field3734 = new int[field3723];

    @OriginalMember(owner = "client!ud", name = "T", descriptor = "[I")
    public static int[] field3733 = new int[field3723];

    @OriginalMember(owner = "client!ud", name = "I", descriptor = "[I")
    public static int[] field3722 = new int[field3723];

    @OriginalMember(owner = "client!ud", name = "W", descriptor = "[I")
    public static int[] field3736 = new int[field3723];

    @OriginalMember(owner = "client!ud", name = "Q", descriptor = "[I")
    public static int[] field3730 = new int[field3723];

    @OriginalMember(owner = "client!ud", name = "fb", descriptor = "[Lgg;")
    public static class63[] field3745 = new class63[field3723];

    @OriginalMember(owner = "client!ud", name = "eb", descriptor = "[I")
    public static int[] field3744 = new int[field3723];

    @OriginalMember(owner = "client!ud", name = "Y", descriptor = "[I")
    public static int[] field3738 = new int[field3723];

    @OriginalMember(owner = "client!ud", name = "bb", descriptor = "Lch;")
    public static class29 field3741 = new class29(50);

    @OriginalMember(owner = "client!ud", name = "E", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!ud", name = "G", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!ud", name = "H", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!ud", name = "L", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!ud", name = "V", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!ud", name = "ab", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!ud", name = "cb", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!ud", name = "db", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!ud", name = "gb", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!ud", name = "F", descriptor = "[I")
    private int[] field3719;

    @OriginalMember(owner = "client!ud", name = "M", descriptor = "[S")
    private short[] field3726;

    @OriginalMember(owner = "client!ud", name = "O", descriptor = "[S")
    private short[] field3728;

    @OriginalMember(owner = "client!ud", name = "R", descriptor = "[S")
    private short[] field3731;

    @OriginalMember(owner = "client!ud", name = "hb", descriptor = "[S")
    private short[] field3747;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lab;B)V")
    public final void method1210(class3 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method64(31790);
            if (var3 == 0) {
                field3746++;
                int var4 = 52 / ((arg1 - 36) / 35);
                return;
            }
            this.method1218(var3, (byte) 12, arg0);
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)Z")
    public final boolean method1211(byte arg0) {
        field3720++;
        if (arg0 >= -120) {
            field3734 = null;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3732[var3] != -1 && !class103.field2383.method757(0, this.field3732[var3], 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(B)Lfg;")
    public static final class55 method1212(byte arg0) {
        if (class154.field3232 == null) {
            class154.field3232 = new class55();
        }
        int var1 = -23 % ((56 - arg0) / 44);
        field3735++;
        return class154.field3232;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
    public static final void method1213(int arg0) {
        field3740++;
        if (arg0 > -120) {
            method1213(-78);
        }
        for (class15 var1 = (class15) class84.field1993.method1033(0); var1 != null; var1 = (class15) class84.field1993.method1035(0)) {
            if (var1.field355 != null) {
                var1.method168((byte) 26);
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)Lmh;")
    public static final class116 method1214(int arg0, int arg1, int arg2) {
        class96 var3 = class148.field3117[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2277;
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(B)V")
    public static final void method1215(byte arg0) {
        if (arg0 < 22) {
            method1214(-21, 53, 23);
        }
        if (class63.field1589 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (class63.field1589 > 768) {
                    class158.field3271[var1] = class138.method999(1024 - class63.field1589, (byte) -105, class127.field2802[var1], class34.field814[var1]);
                } else if (class63.field1589 > 256) {
                    class158.field3271[var1] = class127.field2802[var1];
                } else {
                    class158.field3271[var1] = class138.method999(256 - class63.field1589, (byte) -105, class34.field814[var1], class127.field2802[var1]);
                }
            }
        } else if (class103.field2381 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (class103.field2381 > 768) {
                    class158.field3271[var2] = class138.method999(1024 - class103.field2381, (byte) -105, class26.field601[var2], class34.field814[var2]);
                } else if (class103.field2381 <= 256) {
                    class158.field3271[var2] = class138.method999(256 - class103.field2381, (byte) -105, class34.field814[var2], class26.field601[var2]);
                } else {
                    class158.field3271[var2] = class26.field601[var2];
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                class158.field3271[var3] = class34.field814[var3];
            }
        }
        field3725++;
        short var4 = 256;
        int var5 = 0;
        int var6 = class114.field2549.field3988 * 9;
        int var7 = 0;
        for (int var8 = 1; var8 < var4 - 1; var8++) {
            int var21 = (var4 - var8) * class77.field1882[var8] / var4 + 22;
            if (var21 < 0) {
                var21 = 0;
            }
            var5 += var21;
            for (int var22 = var21; var22 < 128; var22++) {
                int var24 = class48.field1183[var5++];
                int var25 = class114.field2549.field3994[var6++];
                if (var24 == 0) {
                    class91.field2129.field3994[var7++] = var25;
                } else {
                    int var26 = 256 - var24;
                    int var28 = class158.field3271[var24];
                    class91.field2129.field3994[var7++] = class110.method881(var24 * class110.method881(65280, var28) + class110.method881(var25, 65280) * var26, 16711680) + class110.method881(-16711936, class110.method881(16711935, var25) * var26 + var24 * class110.method881(var28, 16711935)) >> 8;
                }
            }
            for (int var23 = 0; var23 < var21; var23++) {
                class91.field2129.field3994[var7++] = class114.field2549.field3994[var6++];
            }
            var6 += class114.field2549.field3988 - 128;
        }
        int var9 = 0;
        class91.field2129.method1314(0, 9);
        int var10 = 0;
        int var11 = class114.field2549.field3988 * 9 + 128;
        for (int var12 = 1; var12 < var4 - 1; var12++) {
            int var13 = (var4 - var12) * class77.field1882[var12] / var4 + 22;
            if (var13 < 0) {
                var13 = 0;
            }
            for (int var14 = 0; var14 < var13; var14++) {
                int var10001 = var9++;
                var11--;
                class73.field1810.field3994[var10001] = class114.field2549.field3994[var11];
            }
            for (int var15 = var13; var15 < 128; var15++) {
                int var16 = class48.field1183[var10++];
                var11--;
                int var17 = class114.field2549.field3994[var11];
                if (var16 == 0) {
                    class73.field1810.field3994[var9++] = var17;
                } else {
                    int var19 = 256 - var16;
                    int var20 = class158.field3271[var16];
                    class73.field1810.field3994[var9++] = class110.method881(class110.method881(var17, 65280) * var19 + var16 * class110.method881(var20, 65280), 16711680) + class110.method881(-16711936, var19 * class110.method881(var17, 16711935) + class110.method881(var20, 16711935) * var16) >> 8;
                }
            }
            var10 += var13;
            var11 += class114.field2549.field3988 + 128;
        }
        class73.field1810.method1314(637, 9);
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(Z)Z")
    public final boolean method1216(boolean arg0) {
        field3718++;
        if (this.field3719 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0) {
            field3734 = null;
        }
        for (int var3 = 0; var3 < this.field3719.length; var3++) {
            if (!class103.field2383.method757(0, this.field3719[var3], 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "(B)Lka;")
    public final class92 method1217(byte arg0) {
        field3742++;
        if (this.field3719 == null) {
            return null;
        }
        class92[] var2 = new class92[this.field3719.length];
        for (int var3 = 0; var3 < this.field3719.length; var3++) {
            var2[var3] = class92.method784(class103.field2383, this.field3719[var3], 0);
        }
        if (arg0 <= 126) {
            this.method1211((byte) 59);
        }
        class92 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class92(var2, var2.length);
        }
        if (this.field3731 != null) {
            for (int var5 = 0; var5 < this.field3731.length; var5++) {
                var4.method785(this.field3731[var5], this.field3726[var5]);
            }
        }
        if (this.field3747 != null) {
            for (int var6 = 0; var6 < this.field3747.length; var6++) {
                var4.method791(this.field3747[var6], this.field3728[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IBLab;)V")
    private final void method1218(int arg0, byte arg1, class3 arg2) {
        field3721++;
        if (arg1 != 12) {
            return;
        }
        if (arg0 == 1) {
            this.field3727 = arg2.method64(arg1 ^ 0x7C22);
        } else if (arg0 == 2) {
            int var4 = arg2.method64(31790);
            this.field3719 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3719[var5] = arg2.method46((byte) 65);
            }
        } else if (arg0 == 3) {
            this.field3737 = true;
        } else if (arg0 == 40) {
            int var6 = arg2.method64(31790);
            this.field3726 = new short[var6];
            this.field3731 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3731[var7] = (short) arg2.method46((byte) 65);
                this.field3726[var7] = (short) arg2.method46((byte) 65);
            }
        } else if (arg0 == 41) {
            int var8 = arg2.method64(31790);
            this.field3728 = new short[var8];
            this.field3747 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3747[var9] = (short) arg2.method46((byte) 65);
                this.field3728[var9] = (short) arg2.method46((byte) 65);
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field3732[arg0 - 60] = arg2.method46((byte) 65);
            return;
        }
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)Lka;")
    public final class92 method1219(int arg0) {
        int var2 = 0;
        class92[] var3 = new class92[5];
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field3732[var4] != -1) {
                var3[var2++] = class92.method784(class103.field2383, this.field3732[var4], 0);
            }
        }
        field3743++;
        class92 var5 = new class92(var3, var2);
        if (this.field3731 != null) {
            for (int var6 = 0; var6 < this.field3731.length; var6++) {
                var5.method785(this.field3731[var6], this.field3726[var6]);
            }
        }
        if (arg0 <= 11) {
            return null;
        }
        if (this.field3747 != null) {
            for (int var7 = 0; var7 < this.field3747.length; var7++) {
                var5.method791(this.field3747[var7], this.field3728[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)V")
    public static void method1220(int arg0) {
        field3734 = null;
        field3724 = null;
        field3745 = null;
        field3744 = null;
        field3736 = null;
        field3738 = null;
        field3733 = null;
        field3730 = null;
        field3739 = null;
        field3741 = null;
        field3722 = null;
        if (arg0 != -10333) {
            field3741 = null;
        }
    }
}
