import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class236 extends class215 {

    @OriginalMember(owner = "client!ai", name = "U", descriptor = "I")
    private int field3898 = -1;

    @OriginalMember(owner = "client!ai", name = "O", descriptor = "Z")
    public static boolean field3893 = false;

    @OriginalMember(owner = "client!ai", name = "eb", descriptor = "Lte;")
    public static class244 field3908 = new class244(5);

    @OriginalMember(owner = "client!ai", name = "gb", descriptor = "I")
    public static int field3910 = -1;

    @OriginalMember(owner = "client!ai", name = "ib", descriptor = "Z")
    public static boolean field3912 = false;

    @OriginalMember(owner = "client!ai", name = "jb", descriptor = "I")
    public static int field3913 = -1;

    @OriginalMember(owner = "client!ai", name = "N", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!ai", name = "Q", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!ai", name = "R", descriptor = "I")
    public int field3896;

    @OriginalMember(owner = "client!ai", name = "S", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!ai", name = "V", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!ai", name = "W", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!ai", name = "X", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!ai", name = "Z", descriptor = "I")
    public int field3903;

    @OriginalMember(owner = "client!ai", name = "ab", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!ai", name = "bb", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!ai", name = "cb", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!ai", name = "db", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!ai", name = "fb", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!ai", name = "hb", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!ai", name = "Y", descriptor = "[I")
    public int[] field3902;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(I)V")
    public final void method1417(int arg0) {
        super.method1417(arg0);
        if (arg0 != 128) {
            this.method45(44, -66, (class96) null);
        }
        this.field3902 = null;
        ++field3907;
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(B)V")
    public static final void method1667(byte arg0) {
        ++field3904;
        for (class210 var1 = (class210) class224.field3608.method1802(43); var1 != null; var1 = (class210) class224.field3608.method1815(0)) {
            if (var1.field3360) {
                var1.method1480((byte) -64);
            }
        }
        if (arg0 != -59) {
            method1667((byte) 27);
        }
        for (class210 var2 = (class210) class21.field280.method1802(43); var2 != null; var2 = (class210) class21.field280.method1815(0)) {
            if (var2.field3360) {
                var2.method1480((byte) -115);
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "(B)Lnf;")
    public static final class227 method1668(byte arg0) {
        ++field3897;
        byte[] var1 = class293.field4645[0];
        int var2 = class172.field2726[0] * class103.field1387[0];
        class227 var6;
        if (class179.field2850[0]) {
            byte[] var3 = class238.field3936[0];
            int[] var4 = new int[var2];
            for (int var5 = 0; ~var5 > ~var2; ++var5) {
                var4[var5] = class154.method1048(class173.method1186(var3[var5] << 24, -16777216), class172.field2729[class173.method1186(var1[var5], 255)]);
            }
            var6 = new class65(class286.field4562, class245.field4018, class40.field493[0], class129.field2072[0], class103.field1387[0], class172.field2726[0], var4);
        } else {
            int[] var7 = new int[var2];
            for (int var8 = 0; var2 > var8; ++var8) {
                var7[var8] = class172.field2729[class173.method1186(255, var1[var8])];
            }
            var6 = new class227(class286.field4562, class245.field4018, class40.field493[0], class129.field2072[0], class103.field1387[0], class172.field2726[0], var7);
        }
        class24.method135(-119);
        return arg0 < 31 ? null : var6;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILpd;)V")
    public final void method45(int arg0, int arg1, class96 arg2) {
        ++field3901;
        if (arg0 != 1521146348) {
            method1668((byte) 25);
        }
        if (~arg1 == -1) {
            this.field3898 = arg2.method549(255);
        }
    }

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "(I)Z")
    public final boolean method1669(int arg0) {
        if (arg0 != -709346716) {
            return false;
        } else {
            ++field3905;
            if (this.field3902 != null) {
                return true;
            } else if (this.field3898 >= 0) {
                class227 var2 = class94.field1188 >= 0 ? class18.method97(class150.field2341, class94.field1188, this.field3898, true) : class179.method1244(class150.field2341, 0, this.field3898);
                var2.method1616();
                this.field3896 = var2.field719;
                this.field3902 = var2.field3640;
                this.field3903 = var2.field720;
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "(I)V")
    public static void method1670(int arg0) {
        if (arg0 != -8648) {
            field3893 = false;
        }
        field3908 = null;
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(B)I")
    public final int method1509(byte arg0) {
        ++field3892;
        if (arg0 != 121) {
            field3912 = false;
        }
        return this.field3898;
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(II)[[I")
    public int[][] method46(int arg0, int arg1) {
        int[][] var3 = super.field3461.method1126(1, arg1);
        if (super.field3461.field2591 && this.method1669(-709346716)) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int var6 = (~class80.field998 != ~this.field3896 ? this.field3896 * arg1 / class80.field998 : arg1) * this.field3903;
            int[] var7 = var3[1];
            if (~class244.field4015 == ~this.field3903) {
                for (int var8 = 0; ~class244.field4015 < ~var8; ++var8) {
                    int var9 = this.field3902[var6++];
                    var5[var8] = class173.method1186(var9 << 4, 4080);
                    var7[var8] = class173.method1186(4080, var9 >> 4);
                    var4[var8] = class173.method1186(4080, var9 >> 12);
                }
            } else {
                for (int var10 = 0; var10 < class244.field4015; ++var10) {
                    int var11 = this.field3903 * var10 / class244.field4015;
                    int var12 = this.field3902[var6 + var11];
                    var5[var10] = class173.method1186(255, var12) << 4;
                    var7[var10] = class173.method1186(65280, var12) >> 4;
                    var4[var10] = class173.method1186(var12, 16711680) >> 12;
                }
            }
        }
        ++field3900;
        return arg0 != -1 ? null : var3;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
    public class236() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "(I)[Lib;")
    public static final class56[] method1671(int arg0) {
        ++field3899;
        class56[] var1 = new class56[class154.field2407];
        for (int var2 = arg0; var2 < class154.field2407; ++var2) {
            byte[] var3 = class293.field4645[var2];
            int var4 = class172.field2726[var2] * class103.field1387[var2];
            if (class179.field2850[var2]) {
                byte[] var5 = class238.field3936[var2];
                int[] var6 = new int[var4];
                for (int var7 = 0; ~var7 > ~var4; ++var7) {
                    var6[var7] = class154.method1048(class172.field2729[class173.method1186(255, var3[var7])], class173.method1186(var5[var7], 255) << 24);
                }
                var1[var2] = new class65(class286.field4562, class245.field4018, class40.field493[var2], class129.field2072[var2], class103.field1387[var2], class172.field2726[var2], var6);
            } else {
                int[] var8 = new int[var4];
                for (int var9 = 0; var9 < var4; ++var9) {
                    var8[var9] = class172.field2729[class173.method1186(var3[var9], 255)];
                }
                var1[var2] = new class227(class286.field4562, class245.field4018, class40.field493[var2], class129.field2072[var2], class103.field1387[var2], class172.field2726[var2], var8);
            }
        }
        class24.method135(-113);
        return var1;
    }
}
