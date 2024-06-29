import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class248 {

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public int field3668 = -1;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "Z")
    public boolean field3673 = false;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "Z")
    public boolean field3669 = false;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
    public int field3676 = -1;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public int field3666 = 5;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
    public int field3677 = -1;

    @OriginalMember(owner = "client!tc", name = "A", descriptor = "I")
    public int field3691 = 2;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "Z")
    public boolean field3681 = false;

    @OriginalMember(owner = "client!tc", name = "B", descriptor = "I")
    public int field3692 = -1;

    @OriginalMember(owner = "client!tc", name = "F", descriptor = "I")
    public int field3696 = -1;

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "I")
    public int field3683 = 99;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "Z")
    public boolean field3678 = false;

    @OriginalMember(owner = "client!tc", name = "x", descriptor = "Lth;")
    public static class57 field3688 = new class57(30);

    @OriginalMember(owner = "client!tc", name = "H", descriptor = "[I")
    public static int[] field3698 = new int[1000];

    @OriginalMember(owner = "client!tc", name = "E", descriptor = "[I")
    public static int[] field3695 = new int[256];

    @OriginalMember(owner = "client!tc", name = "I", descriptor = "[I")
    public static int[] field3699 = new int[14];

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public int field3674;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!tc", name = "w", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!tc", name = "y", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!tc", name = "z", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!tc", name = "G", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "[I")
    public int[] field3667;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "[I")
    private int[] field3679;

    @OriginalMember(owner = "client!tc", name = "D", descriptor = "[I")
    public int[] field3694;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "[Z")
    public boolean[] field3682;

    @OriginalMember(owner = "client!tc", name = "C", descriptor = "[[I")
    public int[][] field3693;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lhc;IIIZ)Lhc;", line = 5)
    public final class151 method1818(class151 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3686++;
        int var6 = this.field3694[arg2];
        if (!arg4) {
            return (class151) null;
        }
        int var7 = this.field3667[arg2];
        class209 var8 = class116.method867(false, var7 >> 16);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg0.method1083(true, true, true);
        }
        class209 var10 = null;
        if ((this.field3678 || class22.field335) && arg1 != -1 && arg1 < this.field3667.length) {
            int var11 = this.field3667[arg1];
            var10 = class116.method867(false, var11 >> 16);
            arg1 = var11 & 0xFFFF;
        }
        class209 var12 = null;
        class209 var13 = null;
        int var14 = 0;
        int var15 = 0;
        if (this.field3679 != null) {
            if (arg2 < this.field3679.length) {
                var14 = this.field3679[arg2];
                if (var14 != 65535) {
                    var12 = class116.method867(false, var14 >> 16);
                    var14 &= 0xFFFF;
                }
            }
            if ((this.field3678 || class22.field335) && arg1 != -1 && arg1 < this.field3679.length) {
                var15 = this.field3679[arg1];
                if (var15 != 65535) {
                    var13 = class116.method867(false, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method1524(21474, var9);
        boolean var17 = !var8.method1526(var9, (byte) 67);
        if (var12 != null) {
            var16 &= !var12.method1524(21474, var14);
            var17 &= !var12.method1526(var14, (byte) 67);
        }
        if (var10 != null) {
            var16 &= !var10.method1524(21474, arg1);
            var17 &= !var10.method1526(arg1, (byte) 67);
        }
        if (var13 != null) {
            var16 &= !var13.method1524(21474, var15);
            var17 &= !var13.method1526(var15, (byte) 67);
        }
        class151 var18 = arg0.method1083(var16, var17, !this.field3673);
        var18.method1066(var8, var9, var10, arg1, arg3 - 1, var6, this.field3673);
        if (var12 != null) {
            var18.method1066(var12, var14, var13, var15, arg3 - 1, var6, this.field3673);
        }
        return var18;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILsb;B)V", line = 109)
    private final void method1819(int arg0, class190 arg1, byte arg2) {
        if (arg0 == 1) {
            int var4 = arg1.method1317((byte) 40);
            this.field3694 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3694[var5] = arg1.method1317((byte) 110);
            }
            this.field3667 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field3667[var6] = arg1.method1317((byte) 53);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field3667[var7] = (arg1.method1317((byte) 25) << 16) + this.field3667[var7];
            }
        } else if (arg0 == 2) {
            this.field3677 = arg1.method1317((byte) 103);
        } else if (arg0 == 3) {
            this.field3682 = new boolean[256];
            int var15 = arg1.method1319(255);
            for (int var16 = 0; var16 < var15; var16++) {
                this.field3682[arg1.method1319(255)] = true;
            }
        } else if (arg0 == 4) {
            this.field3669 = true;
        } else if (arg0 == 5) {
            this.field3666 = arg1.method1319(255);
        } else if (arg0 == 6) {
            this.field3696 = arg1.method1317((byte) 80);
        } else if (arg0 == 7) {
            this.field3692 = arg1.method1317((byte) 101);
        } else if (arg0 == 8) {
            this.field3683 = arg1.method1319(255);
        } else if (arg0 == 9) {
            this.field3676 = arg1.method1319(255);
        } else if (arg0 == 10) {
            this.field3668 = arg1.method1319(255);
        } else if (arg0 == 11) {
            this.field3691 = arg1.method1319(255);
        } else if (arg0 == 12) {
            int var8 = arg1.method1319(255);
            this.field3679 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3679[var9] = arg1.method1317((byte) 3);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field3679[var10] += arg1.method1317((byte) 3) << 16;
            }
        } else if (arg0 == 13) {
            int var11 = arg1.method1317((byte) 82);
            this.field3693 = new int[var11][];
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = arg1.method1319(255);
                if (var13 > 0) {
                    this.field3693[var12] = new int[var13];
                    this.field3693[var12][0] = arg1.method1312(115);
                    for (int var14 = 1; var14 < var13; var14++) {
                        this.field3693[var12][var14] = arg1.method1317((byte) 23);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field3673 = true;
        } else if (arg0 == 15) {
            this.field3678 = true;
        } else if (arg0 == 16) {
            this.field3681 = true;
        }
        field3684++;
        if (arg2 >= -44) {
            this.method1829(93, -6, -99, 22, 66, (class151) null);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lhc;IIIBI)Lhc;", line = 269)
    public final class151 method1820(class151 arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field3670++;
        int var7 = this.field3694[arg1];
        int var8 = this.field3667[arg1];
        class209 var9 = class116.method867(false, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (arg4 != 120) {
            this.field3694 = (int[]) null;
        }
        if (var9 == null) {
            return arg0.method1083(true, true, true);
        }
        int var11 = arg5 & 0x3;
        class209 var12 = null;
        if ((this.field3678 || class22.field335) && arg3 != -1 && this.field3667.length > arg3) {
            int var13 = this.field3667[arg3];
            var12 = class116.method867(false, var13 >> 16);
            arg3 = var13 & 0xFFFF;
        }
        class151 var14;
        if (var12 == null) {
            var14 = arg0.method1083(!var9.method1524(21474, var10), !var9.method1526(var10, (byte) 67), !this.field3673);
        } else {
            var14 = arg0.method1083(!var9.method1524(arg4 ^ 0x539A, var10) & !var12.method1524(21474, arg3), !var9.method1526(var10, (byte) 67) & !var12.method1526(arg3, (byte) 67), !this.field3673);
        }
        if (this.field3673 && class141.field2031) {
            if (var11 == 1) {
                ((class218) var14).method1578();
            } else if (var11 == 2) {
                ((class218) var14).method1568();
            } else if (var11 == 3) {
                ((class218) var14).method1579();
            }
        } else if (var11 == 1) {
            var14.method1070();
        } else if (var11 == 2) {
            var14.method1069();
        } else if (var11 == 3) {
            var14.method1092();
        }
        var14.method1066(var9, var10, var12, arg3, arg2 - 1, var7, this.field3673);
        if (this.field3673 && class141.field2031) {
            if (var11 == 1) {
                ((class218) var14).method1579();
            } else if (var11 == 2) {
                ((class218) var14).method1568();
            } else if (var11 == 3) {
                ((class218) var14).method1578();
            }
        } else if (var11 == 1) {
            var14.method1092();
        } else if (var11 == 2) {
            var14.method1069();
        } else if (var11 == 3) {
            var14.method1070();
        }
        return var14;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V", line = 366)
    public static final void method1821(int arg0) {
        field3697++;
        if (class289.field4378 == 5) {
            class289.field4378 = arg0;
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V", line = 377)
    public final void method1822(int arg0) {
        if (this.field3676 == -1) {
            if (this.field3682 == null) {
                this.field3676 = 0;
            } else {
                this.field3676 = 2;
            }
        }
        field3665++;
        if (arg0 != -14432) {
            method1826((class359) null, (byte) 113);
        }
        if (this.field3668 != -1) {
            return;
        }
        if (this.field3682 == null) {
            this.field3668 = 0;
        } else {
            this.field3668 = 2;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZLsb;)V", line = 426)
    public final void method1823(boolean arg0, class190 arg1) {
        if (arg0) {
            method1827(false, (String) null);
        }
        field3671++;
        while (true) {
            int var3 = arg1.method1319(255);
            if (var3 == 0) {
                return;
            }
            this.method1819(var3, arg1, (byte) -91);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IILhc;II)Lhc;", line = 456)
    public final class151 method1824(int arg0, int arg1, class151 arg2, int arg3, int arg4) {
        field3680++;
        int var6 = this.field3694[arg1];
        int var7 = this.field3667[arg1];
        class209 var8 = class116.method867(false, var7 >> 16);
        if (arg3 != 8354) {
            this.method1829(45, 124, -98, -4, 39, (class151) null);
        }
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg2.method1082(true, true, true);
        }
        class209 var10 = null;
        if ((this.field3678 || class22.field335) && arg4 != -1 && this.field3667.length > arg4) {
            int var11 = this.field3667[arg4];
            var10 = class116.method867(false, var11 >> 16);
            arg4 = var11 & 0xFFFF;
        }
        class151 var12;
        if (var10 == null) {
            var12 = arg2.method1082(!var8.method1524(21474, var9), !var8.method1526(var9, (byte) 67), !this.field3673);
        } else {
            var12 = arg2.method1082(!var8.method1524(21474, var9) & !var10.method1524(arg3 ^ 0x7340, arg4), !var8.method1526(var9, (byte) 67) & !var10.method1526(arg4, (byte) 67), !this.field3673);
        }
        var12.method1066(var8, var9, var10, arg4, arg0 - 1, var6, this.field3673);
        return var12;
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)V", line = 502)
    public static void method1825(int arg0) {
        field3688 = null;
        field3699 = null;
        field3698 = null;
        if (arg0 != -1) {
            field3695 = (int[]) null;
        }
        field3695 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lqf;B)Lqf;", line = 516)
    public static final class359 method1826(class359 arg0, byte arg1) {
        class359 var2 = client.method348(arg0);
        int var3 = 117 / ((-arg1 - 55) / 41);
        if (var2 == null) {
            var2 = arg0.field5568;
        }
        field3689++;
        return var2;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZLjava/lang/String;)J", line = 544)
    public static final long method1827(boolean arg0, String arg1) {
        long var2 = 0L;
        field3685++;
        if (arg0) {
            field3688 = (class57) null;
        }
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIB)V", line = 586)
    public static final void method1828(int arg0, int arg1, int arg2, byte arg3) {
        field3675++;
        if (arg3 > 52) {
            String var4 = "::tele " + arg1 + "," + (arg2 >> 6) + "," + (arg0 >> 6) + "," + (arg2 & 0x3F) + "," + (arg0 & 0x3F);
            System.out.println(var4);
            class98.method772(-69, var4);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIILhc;)Lhc;", line = 602)
    public final class151 method1829(int arg0, int arg1, int arg2, int arg3, int arg4, class151 arg5) {
        field3687++;
        int var7 = this.field3694[arg1];
        int var8 = this.field3667[arg1];
        class209 var9 = class116.method867(false, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg5.method1077(true, true, true);
        }
        int var11 = arg4 & 0x3;
        if (arg0 != 2) {
            this.field3692 = -115;
        }
        class209 var12 = null;
        if ((this.field3678 || class22.field335) && arg2 != -1 && arg2 < this.field3667.length) {
            int var13 = this.field3667[arg2];
            var12 = class116.method867(false, var13 >> 16);
            arg2 = var13 & 0xFFFF;
        }
        class151 var14;
        if (var12 == null) {
            var14 = arg5.method1077(!var9.method1524(arg0 ^ 0x53E0, var10), !var9.method1526(var10, (byte) 67), !this.field3673);
        } else {
            var14 = arg5.method1077(!var9.method1524(21474, var10) & !var12.method1524(arg0 ^ 0x53E0, arg2), !var9.method1526(var10, (byte) 67) & !var12.method1526(arg2, (byte) 67), !this.field3673);
        }
        if (class141.field2031 && this.field3673) {
            if (var11 == 1) {
                ((class218) var14).method1578();
            } else if (var11 == 2) {
                ((class218) var14).method1568();
            } else if (var11 == 3) {
                ((class218) var14).method1579();
            }
        } else if (var11 == 1) {
            var14.method1070();
        } else if (var11 == 2) {
            var14.method1069();
        } else if (var11 == 3) {
            var14.method1092();
        }
        var14.method1066(var9, var10, var12, arg2, arg3 - 1, var7, this.field3673);
        if (class141.field2031 && this.field3673) {
            if (var11 == 1) {
                ((class218) var14).method1579();
            } else if (var11 == 2) {
                ((class218) var14).method1568();
            } else if (var11 == 3) {
                ((class218) var14).method1578();
            }
        } else if (var11 == 1) {
            var14.method1092();
        } else if (var11 == 2) {
            var14.method1069();
        } else if (var11 == 3) {
            var14.method1070();
        }
        return var14;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)V", line = 709)
    public static final void method1830(int arg0, int arg1, int arg2) {
        field3690++;
        class309 var3 = class185.method1286(false, arg1);
        int var4 = var3.field4623;
        int var5 = var3.field4621;
        int var6 = var3.field4622;
        int var7 = class267.field4067[var6 - var5];
        if (arg0 > arg2 || arg2 > var7) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        class186.method1291(class227.field3423[var4] & ~var8 | var8 & arg2 << var5, (byte) 32, var4);
    }
}
