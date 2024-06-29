import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class307 {

    @OriginalMember(owner = "client!bm", name = "l", descriptor = "Lvb;")
    private class176 field4645 = null;

    @OriginalMember(owner = "client!bm", name = "n", descriptor = "Z")
    private boolean field4647;

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "Lkc;")
    private class28 field4639;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "Z")
    private boolean field4637;

    @OriginalMember(owner = "client!bm", name = "m", descriptor = "Ljava/lang/String;")
    public static String field4646 = "Please wait...";

    @OriginalMember(owner = "client!bm", name = "r", descriptor = "I")
    public static int field4651 = 0;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
    public static int field4634 = 0;

    @OriginalMember(owner = "client!bm", name = "q", descriptor = "Lme;")
    public static class322 field4650 = new class322();

    @OriginalMember(owner = "client!bm", name = "T", descriptor = "J")
    public static long field4678 = 0L;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!bm", name = "k", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!bm", name = "o", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!bm", name = "p", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!bm", name = "s", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!bm", name = "t", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!bm", name = "u", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!bm", name = "v", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!bm", name = "x", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!bm", name = "z", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!bm", name = "A", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!bm", name = "C", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!bm", name = "D", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!bm", name = "E", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!bm", name = "F", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!bm", name = "G", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!bm", name = "H", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!bm", name = "I", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!bm", name = "J", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!bm", name = "K", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!bm", name = "L", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!bm", name = "M", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!bm", name = "N", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!bm", name = "O", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!bm", name = "P", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!bm", name = "R", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!bm", name = "S", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!bm", name = "w", descriptor = "Lmk;")
    public static class162 field4656;

    @OriginalMember(owner = "client!bm", name = "Q", descriptor = "Lbm;")
    public static class307 field4675;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "[Ljava/lang/Object;")
    private Object[] field4640;

    @OriginalMember(owner = "client!bm", name = "y", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field4658;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ljava/lang/String;Z)I", line = 6)
    public final int method2028(String arg0, boolean arg1) {
        if (!arg1) {
            return 102;
        }
        field4643++;
        if (this.method2050((byte) -30)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field4645.field2831.method1702(class131.method865(var3, 99), -1);
            return this.method2057((byte) -38, var4);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z", line = 24)
    public final boolean method2029(String arg0, byte arg1, String arg2) {
        field4661++;
        if (!this.method2050((byte) -30)) {
            return false;
        }
        if (arg1 != 41) {
            this.method2033(true);
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field4645.field2831.method1702(class131.method865(var4, 102), arg1 ^ 0xFFFFFFD6);
        if (this.method2043(-8827, var6)) {
            int var7 = this.field4645.field2828[var6].method1702(class131.method865(var5, -104), arg1 ^ 0xFFFFFFD6);
            return this.method2044((byte) 75, var6, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IB)V", line = 48)
    private final void method2030(int arg0, byte arg1) {
        if (arg1 != -42) {
            return;
        }
        if (this.field4647) {
            this.field4640[arg0] = this.field4639.method233(true, arg0);
        } else {
            this.field4640[arg0] = class21.method180(this.field4639.method233(true, arg0), 136, false);
        }
        field4641++;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(III)Z", line = 64)
    private final boolean method2031(int arg0, int arg1, int arg2) {
        field4660++;
        if (!this.method2050((byte) -30)) {
            return false;
        } else if (arg0 <= arg2 && arg1 >= 0 && arg2 < this.field4645.field2827.length && this.field4645.field2827[arg2] > arg1) {
            return true;
        } else if (class151.field2465) {
            throw new IllegalArgumentException(arg2 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(III)[B", line = 86)
    public final byte[] method2032(int arg0, int arg1, int arg2) {
        field4663++;
        if (!this.method2031(0, arg0, arg2)) {
            return null;
        }
        if (arg1 < 76) {
            this.method2040(-90, (byte) -66, (int[]) null);
        }
        if (this.field4658[arg2] == null || this.field4658[arg2][arg0] == null) {
            boolean var4 = this.method2040(arg2, (byte) 83, (int[]) null);
            if (!var4) {
                this.method2030(arg2, (byte) -42);
                boolean var5 = this.method2040(arg2, (byte) 118, (int[]) null);
                if (!var5) {
                    return null;
                }
            }
        }
        return class23.method193(this.field4658[arg2][arg0], 8944, false);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Z)I", line = 120)
    public final int method2033(boolean arg0) {
        if (arg0) {
            field4674 = 6;
        }
        field4676++;
        if (!this.method2050((byte) -30)) {
            throw new IllegalStateException("");
        }
        return this.field4645.field2843;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 136)
    public final boolean method2034(String arg0, int arg1) {
        field4648++;
        if (this.method2050((byte) -30)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field4645.field2831.method1702(class131.method865(var3, 95), -1);
            int var5 = 40 / ((-arg1 - 72) / 35);
            return var4 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 156)
    public final void method2035(boolean arg0, String arg1) {
        field4635++;
        if (!this.method2050((byte) -30)) {
            return;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field4645.field2831.method1702(class131.method865(var3, 100), -1);
        this.method2058(var4, -68);
        if (!arg0) {
            field4634 = 55;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIB)[B", line = 177)
    public final byte[] method2036(int arg0, int arg1, byte arg2) {
        if (arg2 <= 22) {
            return (byte[]) null;
        } else {
            field4657++;
            return this.method2046(arg1, (byte) -127, (int[]) null, arg0);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)Z", line = 193)
    public final boolean method2037(int arg0, int arg1) {
        field4673++;
        if (!this.method2043(-8827, arg0)) {
            return false;
        } else if (this.field4640[arg0] != null) {
            return true;
        } else if (arg1 == -1) {
            this.method2030(arg0, (byte) -42);
            return this.field4640[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(Z)V", line = 215)
    public static void method2038(boolean arg0) {
        if (arg0) {
            field4656 = null;
            field4675 = null;
            field4650 = null;
            field4646 = null;
        }
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(II)V", line = 230)
    public final void method2039(int arg0, int arg1) {
        if (arg0 >= 3) {
            field4670++;
            if (this.method2043(-8827, arg1) && this.field4658 != null) {
                this.field4658[arg1] = null;
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IB[I)Z", line = 252)
    private final boolean method2040(int arg0, byte arg1, int[] arg2) {
        int var4 = -22 % ((arg1) / 54);
        field4668++;
        if (!this.method2043(-8827, arg0)) {
            return false;
        } else if (this.field4640[arg0] == null) {
            return false;
        } else {
            int var5 = this.field4645.field2825[arg0];
            int[] var6 = this.field4645.field2835[arg0];
            boolean var7 = true;
            if (this.field4658[arg0] == null) {
                this.field4658[arg0] = new Object[this.field4645.field2827[arg0]];
            }
            Object[] var8 = this.field4658[arg0];
            for (int var9 = 0; var9 < var5; var9++) {
                int var10;
                if (var6 == null) {
                    var10 = var9;
                } else {
                    var10 = var6[var9];
                }
                if (var8[var10] == null) {
                    var7 = false;
                    break;
                }
            }
            if (var7) {
                return true;
            }
            byte[] var11;
            if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
                var11 = class23.method193(this.field4640[arg0], 8944, false);
            } else {
                var11 = class23.method193(this.field4640[arg0], 8944, true);
                class202 var12 = new class202(var11);
                var12.method1331(arg2, -128, 5, var12.field3273.length);
            }
            byte[] var13;
            try {
                var13 = class267.method1774(false, var11);
            } catch (RuntimeException var32) {
                throw class27.method223(var32, "T3 - " + (arg2 != null) + "," + arg0 + "," + var11.length + "," + class8.method70(var11, (byte) -98, var11.length) + "," + class8.method70(var11, (byte) -107, var11.length - 2) + "," + this.field4645.field2826[arg0] + "," + this.field4645.field2843);
            }
            if (this.field4647) {
                this.field4640[arg0] = null;
            }
            if (var5 <= 1) {
                int var15;
                if (var6 == null) {
                    var15 = 0;
                } else {
                    var15 = var6[0];
                }
                if (this.field4637) {
                    var8[var15] = var13;
                } else {
                    var8[var15] = class21.method180(var13, 136, false);
                }
            } else {
                int var16 = var13.length;
                int var33 = var16 - 1;
                int var17 = var13[var33] & 0xFF;
                class202 var18 = new class202(var13);
                int var19 = var33 - var17 * 4 * var5;
                int[] var20 = new int[var5];
                var18.field3249 = var19;
                for (int var21 = 0; var21 < var17; var21++) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < var5; var23++) {
                        var22 += var18.method1346(110);
                        var20[var23] += var22;
                        if (var6 == null) {
                        }
                    }
                }
                byte[][] var24 = new byte[var5][];
                for (int var25 = 0; var25 < var5; var25++) {
                    var24[var25] = new byte[var20[var25]];
                    var20[var25] = 0;
                }
                var18.field3249 = var19;
                int var26 = 0;
                for (int var27 = 0; var27 < var17; var27++) {
                    int var28 = 0;
                    for (int var29 = 0; var29 < var5; var29++) {
                        var28 += var18.method1346(102);
                        class129.method851(var13, var26, var24[var29], var20[var29], var28);
                        var20[var29] += var28;
                        var26 += var28;
                    }
                }
                for (int var30 = 0; var30 < var5; var30++) {
                    int var31;
                    if (var6 == null) {
                        var31 = var30;
                    } else {
                        var31 = var6[var30];
                    }
                    if (this.field4637) {
                        var8[var31] = var24[var30];
                    } else {
                        var8[var31] = class21.method180(var24[var30], 136, false);
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V", line = 446)
    public final void method2041(int arg0) {
        if (arg0 != 8711) {
            this.method2030(31, (byte) -86);
        }
        if (this.field4658 != null) {
            for (int var2 = 0; var2 < this.field4658.length; var2++) {
                this.field4658[var2] = null;
            }
        }
        field4653++;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)I", line = 469)
    public final int method2042(byte arg0) {
        field4666++;
        if (!this.method2050((byte) -30)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field4640.length; var4++) {
            if (this.field4645.field2825[var4] > 0) {
                var2 += 100;
                var3 += this.method2057((byte) -38, var4);
            }
        }
        if (arg0 != 11) {
            field4674 = -18;
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lkc;ZZ)V", line = 806)
    public class307(class28 arg0, boolean arg1, boolean arg2) {
        this.field4647 = arg1;
        this.field4639 = arg0;
        this.field4637 = arg2;
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(II)Z", line = 520)
    private final boolean method2043(int arg0, int arg1) {
        field4654++;
        if (!this.method2050((byte) -30)) {
            return false;
        }
        if (arg0 != -8827) {
            field4678 = 121L;
        }
        if (arg1 >= 0 && this.field4645.field2827.length > arg1 && this.field4645.field2827[arg1] != 0) {
            return true;
        } else if (class151.field2465) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(BII)Z", line = 545)
    public final boolean method2044(byte arg0, int arg1, int arg2) {
        field4665++;
        if (!this.method2031(0, arg2, arg1)) {
            return false;
        } else if (this.field4658[arg1] != null && this.field4658[arg1][arg2] != null) {
            return true;
        } else if (this.field4640[arg1] == null) {
            this.method2030(arg1, (byte) -42);
            if (arg0 <= 5) {
                field4675 = (class307) null;
            }
            return this.field4640[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "(II)[B", line = 575)
    public final byte[] method2045(int arg0, int arg1) {
        field4636++;
        if (!this.method2050((byte) -30)) {
            return null;
        } else if (this.field4645.field2827.length == 1) {
            return this.method2036(0, arg1, (byte) 68);
        } else if (!this.method2043(-8827, arg1)) {
            return null;
        } else if (this.field4645.field2827[arg1] == 1) {
            return this.method2036(arg1, 0, (byte) 109);
        } else if (arg0 == 0) {
            throw new RuntimeException();
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IB[II)[B", line = 606)
    public final byte[] method2046(int arg0, byte arg1, int[] arg2, int arg3) {
        field4659++;
        if (!this.method2031(0, arg0, arg3)) {
            return null;
        }
        if (arg1 > -94) {
            this.method2041(-35);
        }
        if (this.field4658[arg3] == null || this.field4658[arg3][arg0] == null) {
            boolean var5 = this.method2040(arg3, (byte) -55, arg2);
            if (!var5) {
                this.method2030(arg3, (byte) -42);
                boolean var6 = this.method2040(arg3, (byte) -99, arg2);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class23.method193(this.field4658[arg3][arg0], 8944, false);
        if (this.field4637) {
            this.field4658[arg3][arg0] = null;
            if (this.field4645.field2827[arg3] == 1) {
                this.field4658[arg3] = null;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(BCLjava/lang/String;)I", line = 647)
    public static final int method2047(byte arg0, char arg1, String arg2) {
        if (arg0 != -60) {
            return 105;
        }
        field4638++;
        int var3 = arg2.length();
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            if (arg2.charAt(var5) == arg1) {
                var4++;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)Z", line = 678)
    public final boolean method2048(int arg0) {
        field4672++;
        if (arg0 != -6833) {
            this.method2053((byte) -51);
        }
        if (!this.method2050((byte) -30)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field4645.field2823.length; var3++) {
            int var4 = this.field4645.field2823[var3];
            if (this.field4640[var4] == null) {
                this.method2030(var4, (byte) -42);
                if (this.field4640[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(Ljava/lang/String;I)Z", line = 714)
    public final boolean method2049(String arg0, int arg1) {
        field4649++;
        if (!this.method2050((byte) -30)) {
            return false;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 != 4) {
            this.field4640 = (Object[]) null;
        }
        int var4 = this.field4645.field2831.method1702(class131.method865(var3, -37), -1);
        return this.method2037(var4, arg1 - 5);
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(B)Z", line = 734)
    private final boolean method2050(byte arg0) {
        field4652++;
        if (this.field4645 == null) {
            this.field4645 = this.field4639.method232(arg0 ^ 0x15);
            if (this.field4645 == null) {
                return false;
            }
            this.field4640 = new Object[this.field4645.field2842];
            this.field4658 = new Object[this.field4645.field2842][];
        }
        if (arg0 != -30) {
            this.method2058(-18, -102);
        }
        return true;
    }

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "(II)Z", line = 758)
    public final boolean method2051(int arg0, int arg1) {
        field4642++;
        int var3 = 33 / ((arg0 + 38) / 60);
        if (!this.method2050((byte) -30)) {
            return false;
        } else if (this.field4645.field2827.length == 1) {
            return this.method2044((byte) 76, 0, arg1);
        } else if (!this.method2043(-8827, arg1)) {
            return false;
        } else if (this.field4645.field2827[arg1] == 1) {
            return this.method2044((byte) 101, arg1, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(Ljava/lang/String;Z)I", line = 786)
    public final int method2052(String arg0, boolean arg1) {
        field4662++;
        if (!this.method2050((byte) -30)) {
            return -1;
        }
        if (!arg1) {
            this.method2056(-40, -73);
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field4645.field2831.method1702(class131.method865(var3, -53), -1);
        return this.method2043(-8827, var4) ? var4 : -1;
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(B)I", line = 817)
    public final int method2053(byte arg0) {
        if (arg0 != -9) {
            this.field4639 = (class28) null;
        }
        field4664++;
        return this.method2050((byte) -30) ? this.field4645.field2827.length : -1;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZBZ)V", line = 837)
    public final void method2054(boolean arg0, byte arg1, boolean arg2) {
        if (arg1 <= 120) {
            this.method2059(false, (String) null, (String) null);
        }
        field4671++;
        if (!this.method2050((byte) -30)) {
            return;
        }
        if (arg0) {
            this.field4645.field2834 = null;
            this.field4645.field2831 = null;
        }
        if (arg2) {
            this.field4645.field2824 = (int[][]) null;
            this.field4645.field2828 = null;
        }
    }

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "(II)[I", line = 873)
    public final int[] method2055(int arg0, int arg1) {
        field4644++;
        if (!this.method2043(-8827, arg0)) {
            return null;
        }
        if (arg1 != 0) {
            this.method2040(-41, (byte) -72, (int[]) null);
        }
        int[] var3 = this.field4645.field2835[arg0];
        if (var3 == null) {
            var3 = new int[this.field4645.field2825[arg0]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "(II)I", line = 903)
    public final int method2056(int arg0, int arg1) {
        field4677++;
        if (this.method2043(-8827, arg0)) {
            if (arg1 > -91) {
                method2047((byte) 54, '_', (String) null);
            }
            return this.field4645.field2827[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(BI)I", line = 918)
    private final int method2057(byte arg0, int arg1) {
        if (arg0 != -38) {
            return 120;
        }
        field4655++;
        if (this.method2043(-8827, arg1)) {
            return this.field4640[arg1] == null ? this.field4639.method231(arg1, -96) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "(II)V", line = 940)
    private final void method2058(int arg0, int arg1) {
        field4667++;
        int var3 = -18 / ((arg1 + 7) / 33);
        this.field4639.method226(arg0, (byte) 66);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;)[B", line = 951)
    public final byte[] method2059(boolean arg0, String arg1, String arg2) {
        field4669++;
        if (!this.method2050((byte) -30)) {
            return null;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg2.toLowerCase();
        if (!arg0) {
            return (byte[]) null;
        }
        int var6 = this.field4645.field2831.method1702(class131.method865(var4, 99), -1);
        if (this.method2043(-8827, var6)) {
            int var7 = this.field4645.field2828[var6].method1702(class131.method865(var5, -113), -1);
            return this.method2036(var6, var7, (byte) 38);
        } else {
            return null;
        }
    }
}
