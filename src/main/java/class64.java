import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class64 extends class151 {

    @OriginalMember(owner = "client!ij", name = "B", descriptor = "I")
    public int field1001 = 0;

    @OriginalMember(owner = "client!ij", name = "J", descriptor = "Z")
    public static boolean field1008 = false;

    @OriginalMember(owner = "client!ij", name = "W", descriptor = "Lbd;")
    public static class162 field1020 = class17.method142(0, ")1o");

    @OriginalMember(owner = "client!ij", name = "A", descriptor = "Lbd;")
    private static class162 field1000 = class17.method142(0, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!ij", name = "y", descriptor = "Lbd;")
    public static class162 field998 = field1000;

    @OriginalMember(owner = "client!ij", name = "C", descriptor = "I")
    public int field1002;

    @OriginalMember(owner = "client!ij", name = "F", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!ij", name = "G", descriptor = "I")
    public int field1006;

    @OriginalMember(owner = "client!ij", name = "I", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!ij", name = "K", descriptor = "I")
    public int field1009;

    @OriginalMember(owner = "client!ij", name = "L", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!ij", name = "M", descriptor = "I")
    public int field1011;

    @OriginalMember(owner = "client!ij", name = "N", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!ij", name = "P", descriptor = "I")
    public int field1013;

    @OriginalMember(owner = "client!ij", name = "Q", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!ij", name = "R", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!ij", name = "U", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!ij", name = "V", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!ij", name = "X", descriptor = "I")
    public int field1021;

    @OriginalMember(owner = "client!ij", name = "Z", descriptor = "I")
    public int field1023;

    @OriginalMember(owner = "client!ij", name = "ab", descriptor = "I")
    public int field1024;

    @OriginalMember(owner = "client!ij", name = "s", descriptor = "I")
    public int field992;

    @OriginalMember(owner = "client!ij", name = "u", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!ij", name = "x", descriptor = "I")
    public int field997;

    @OriginalMember(owner = "client!ij", name = "t", descriptor = "Lda;")
    public static class143 field993;

    @OriginalMember(owner = "client!ij", name = "z", descriptor = "Ldh;")
    public static class177 field999;

    @OriginalMember(owner = "client!ij", name = "T", descriptor = "Lsi;")
    public class311 field1017;

    @OriginalMember(owner = "client!ij", name = "w", descriptor = "Ldj;")
    public class39 field996;

    @OriginalMember(owner = "client!ij", name = "v", descriptor = "Llb;")
    public class60 field995;

    @OriginalMember(owner = "client!ij", name = "D", descriptor = "Lnd;")
    public class76 field1003;

    @OriginalMember(owner = "client!ij", name = "S", descriptor = "Lnd;")
    public class76 field1016;

    @OriginalMember(owner = "client!ij", name = "Y", descriptor = "Z")
    public boolean field1022;

    @OriginalMember(owner = "client!ij", name = "E", descriptor = "[I")
    public int[] field1004;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V", line = 9)
    public static void method436(int arg0) {
        int var1 = -22 % ((-arg0 - 81) / 33);
        field1000 = null;
        field998 = null;
        field999 = null;
        field993 = null;
        field1020 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZLaf;Laf;ZI)I", line = 22)
    public static final int method437(boolean arg0, class223 arg1, class223 arg2, boolean arg3, int arg4) {
        field1007++;
        if (arg4 == 1) {
            int var5 = arg1.field15;
            int var6 = arg2.field15;
            if (!arg3) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg4 == 2) {
            return arg1.method1617(-124).field920.method1279(arg2.method1617(-126).field920, (byte) -6);
        } else if (arg4 == 3) {
            if (arg1.field3731.method1248(class46.field736, (byte) -34)) {
                if (arg2.field3731.method1248(class46.field736, (byte) -124)) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg2.field3731.method1248(class46.field736, (byte) -76)) {
                return arg3 ? 1 : -1;
            } else {
                return arg1.field3731.method1279(arg2.field3731, (byte) -6);
            }
        } else if (arg4 == 4) {
            return arg1.method4(127) ? (arg2.method4(-18) ? 0 : 1) : (arg2.method4(127) ? -1 : 0);
        } else if (arg4 == 5) {
            return arg1.method8((byte) -52) ? (arg2.method8((byte) -52) ? 0 : 1) : (arg2.method8((byte) -52) ? -1 : 0);
        } else {
            if (arg0) {
                method438(true, (class301) null);
            }
            if (arg4 == 6) {
                return arg1.method9((byte) 122) ? (arg2.method9((byte) 121) ? 0 : 1) : (arg2.method9((byte) 120) ? -1 : 0);
            } else if (arg4 == 7) {
                return arg1.method3(0) ? (arg2.method3(0) ? 0 : 1) : (arg2.method3(0) ? -1 : 0);
            } else {
                return arg1.field3721 - arg2.field3721;
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZLrg;)V", line = 97)
    public static final void method438(boolean arg0, class301 arg1) {
        field1018++;
        if (arg1.field5030 == 0) {
            return;
        }
        if (arg1.field5019 != -1 && arg1.field5019 < 32768) {
            class60 var2 = class204.field3446[arg1.field5019];
            if (var2 != null) {
                int var3 = arg1.field5013 - var2.field5013;
                int var4 = arg1.field5047 - var2.field5047;
                if (var3 != 0 || var4 != 0) {
                    arg1.field5025 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field5019 >= 32768) {
            int var5 = arg1.field5019 - 32768;
            if (class263.field4390 == var5) {
                var5 = 2047;
            }
            class39 var6 = class270.field4520[var5];
            if (var6 != null) {
                int var7 = arg1.field5013 - var6.field5013;
                int var8 = arg1.field5047 - var6.field5047;
                if (var7 != 0 || var8 != 0) {
                    arg1.field5025 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field5007 != 0 || arg1.field5059 != 0) && (arg1.field5006 == 0 || arg1.field5060 > 0)) {
            int var9 = arg1.field5013 - (((arg1.field5007 - class178.field3052 - class178.field3052) * 64) - ((arg1.method293((byte) 25) - 1) * 64));
            int var10 = arg1.field5047 + (arg1.method293((byte) 25) - 1) * 64 - ((-class258.field4294 + arg1.field5059 - class258.field4294) * 64);
            if (var9 != 0 || var10 != 0) {
                arg1.field5025 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field5007 = 0;
            arg1.field5059 = 0;
        }
        int var11 = arg1.field5025 - arg1.field5018 & 0x7FF;
        if (var11 == 0) {
            arg1.field5008 = 0;
        } else {
            arg1.field5008++;
            if (var11 > 1024) {
                arg1.field5018 -= arg1.field5030;
                boolean var12 = true;
                if (var11 < arg1.field5030 || var11 > (2048 - arg1.field5030)) {
                    arg1.field5018 = arg1.field5025;
                    var12 = false;
                }
                if (arg1.field5068 == arg1.field5064 && (arg1.field5008 > 25 || var12)) {
                    if (arg1.field5037 == -1) {
                        arg1.field5064 = arg1.field5042;
                    } else {
                        arg1.field5064 = arg1.field5037;
                    }
                }
            } else {
                boolean var13 = true;
                arg1.field5018 += arg1.field5030;
                if (var11 < arg1.field5030 || var11 > 2048 - arg1.field5030) {
                    arg1.field5018 = arg1.field5025;
                    var13 = false;
                }
                if (arg1.field5068 == arg1.field5064 && (arg1.field5008 > 25 || var13)) {
                    if (arg1.field5053 == -1) {
                        arg1.field5064 = arg1.field5042;
                    } else {
                        arg1.field5064 = arg1.field5053;
                    }
                }
            }
            arg1.field5018 &= 0x7FF;
        }
        if (!arg0) {
            method439(-20);
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)V", line = 230)
    public static final void method439(int arg0) {
        field1019++;
        class40.field651 = new class235(32);
        if (arg0 != -871) {
            field999 = (class177) null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)I", line = 243)
    public static final int method440(int arg0, int arg1) {
        field1005++;
        int var2 = 0;
        if (arg0 != 6367) {
            return -26;
        }
        if (arg1 < 0 || arg1 >= 65536) {
            var2 += 16;
            arg1 >>>= 0x10;
        }
        if (arg1 >= 256) {
            arg1 >>>= 0x8;
            var2 += 8;
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var2 += 2;
        }
        if (arg1 >= 1) {
            var2++;
            arg1 >>>= 0x1;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)V", line = 301)
    public static final void method441(int arg0) {
        class93.field1648 = (int[][][]) null;
        if (arg0 != 16) {
            field1008 = true;
        }
        class289.field4860 = null;
        class274.field4559 = (byte[][][]) null;
        class102.field1861 = null;
        class302.field5075 = (byte[][][]) null;
        class138.field2467 = null;
        field994++;
        class311.field5211 = (byte[][][]) null;
        class129.field2337 = null;
        class135.field2418 = (byte[][][]) null;
        class317.field5341 = (byte[][][]) null;
        class297.field4977 = null;
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(B)V", line = 333)
    public final void method442(byte arg0) {
        field1012++;
        int var2 = this.field992;
        if (this.field1017 != null) {
            class311 var5 = this.field1017.method2105((byte) -128);
            if (var5 == null) {
                this.field992 = -1;
                this.field1004 = null;
                this.field997 = 0;
                this.field1002 = 0;
                this.field1024 = 0;
            } else {
                this.field992 = var5.field5215;
                this.field1004 = var5.field5206;
                this.field1002 = var5.field5202 * 128;
                this.field1024 = var5.field5213;
                this.field997 = var5.field5249;
            }
        } else if (this.field995 != null) {
            int var3 = class84.method649(false, this.field995);
            if (var2 != var3) {
                class83 var4 = this.field995.field926;
                this.field992 = var3;
                if (var4.field1502 != null) {
                    var4 = var4.method643(true);
                }
                if (var4 == null) {
                    this.field1002 = 0;
                } else {
                    this.field1002 = var4.field1451 * 128;
                }
            }
        } else if (this.field996 != null) {
            this.field992 = class119.method973(this.field996, true);
            this.field1002 = this.field996.field609 * 128;
        }
        if (arg0 == -119 && this.field992 != var2 && this.field1003 != null) {
            class313.field5290.method449(this.field1003);
            this.field1003 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lda;I)V", line = 409)
    public static final void method443(class143 arg0, int arg1) {
        if (arg1 != 22897) {
            method438(true, (class301) null);
        }
        field1015++;
        class187.field3217 = arg0;
        class279.field4705 = class187.field3217.method1121(16, (byte) -112);
    }

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "(B)V", line = 430)
    public static final void method444(byte arg0) {
        class12.field190.method1533(true);
        if (arg0 == 46) {
            field1010++;
        }
    }
}
