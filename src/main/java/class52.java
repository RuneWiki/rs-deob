import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public abstract class class52 extends class113 {

    @OriginalMember(owner = "client!vg", name = "N", descriptor = "I")
    public int field878 = 256;

    @OriginalMember(owner = "client!vg", name = "T", descriptor = "I")
    public int field884 = 0;

    @OriginalMember(owner = "client!vg", name = "V", descriptor = "Z")
    public boolean field886 = false;

    @OriginalMember(owner = "client!vg", name = "Z", descriptor = "I")
    public int field890 = 0;

    @OriginalMember(owner = "client!vg", name = "db", descriptor = "[I")
    public int[] field894 = new int[4];

    @OriginalMember(owner = "client!vg", name = "qb", descriptor = "I")
    public int field907 = -1;

    @OriginalMember(owner = "client!vg", name = "ub", descriptor = "I")
    public int field911 = 0;

    @OriginalMember(owner = "client!vg", name = "U", descriptor = "[I")
    public int[] field885 = null;

    @OriginalMember(owner = "client!vg", name = "R", descriptor = "I")
    public int field882 = 0;

    @OriginalMember(owner = "client!vg", name = "Y", descriptor = "I")
    public int field889 = 0;

    @OriginalMember(owner = "client!vg", name = "bb", descriptor = "Z")
    public boolean field892 = true;

    @OriginalMember(owner = "client!vg", name = "nb", descriptor = "I")
    public int field904 = 0;

    @OriginalMember(owner = "client!vg", name = "tb", descriptor = "I")
    public int field910 = -1;

    @OriginalMember(owner = "client!vg", name = "xb", descriptor = "I")
    public int field914 = -1;

    @OriginalMember(owner = "client!vg", name = "Qb", descriptor = "I")
    public int field933 = 0;

    @OriginalMember(owner = "client!vg", name = "Gb", descriptor = "I")
    public int field923 = -1;

    @OriginalMember(owner = "client!vg", name = "W", descriptor = "B")
    public byte field887 = 0;

    @OriginalMember(owner = "client!vg", name = "Ub", descriptor = "[Llfa;")
    public class114[] field937 = new class114[12];

    @OriginalMember(owner = "client!vg", name = "Fb", descriptor = "I")
    public int field922 = -1;

    @OriginalMember(owner = "client!vg", name = "pb", descriptor = "I")
    public int field906 = 0;

    @OriginalMember(owner = "client!vg", name = "Yb", descriptor = "I")
    private int field941 = 1;

    @OriginalMember(owner = "client!vg", name = "Wb", descriptor = "I")
    public int field939 = -1;

    @OriginalMember(owner = "client!vg", name = "Lb", descriptor = "Ljava/lang/String;")
    public String field928 = null;

    @OriginalMember(owner = "client!vg", name = "jc", descriptor = "I")
    public int field952 = 0;

    @OriginalMember(owner = "client!vg", name = "Bb", descriptor = "I")
    public int field918 = -32768;

    @OriginalMember(owner = "client!vg", name = "Hb", descriptor = "[I")
    public int[] field924 = new int[4];

    @OriginalMember(owner = "client!vg", name = "kc", descriptor = "I")
    public int field953 = 0;

    @OriginalMember(owner = "client!vg", name = "nc", descriptor = "I")
    public int field956 = 0;

    @OriginalMember(owner = "client!vg", name = "cc", descriptor = "I")
    public int field945 = 0;

    @OriginalMember(owner = "client!vg", name = "P", descriptor = "I")
    public int field880 = 0;

    @OriginalMember(owner = "client!vg", name = "Xb", descriptor = "I")
    public int field940 = -1;

    @OriginalMember(owner = "client!vg", name = "ac", descriptor = "I")
    public int field943 = 0;

    @OriginalMember(owner = "client!vg", name = "zb", descriptor = "[I")
    public int[] field916 = new int[4];

    @OriginalMember(owner = "client!vg", name = "oc", descriptor = "I")
    public int field957 = -1;

    @OriginalMember(owner = "client!vg", name = "rb", descriptor = "I")
    public int field908 = -1;

    @OriginalMember(owner = "client!vg", name = "fb", descriptor = "I")
    public int field896 = -1;

    @OriginalMember(owner = "client!vg", name = "hc", descriptor = "I")
    public int field950 = 0;

    @OriginalMember(owner = "client!vg", name = "pc", descriptor = "I")
    public int field958 = -1;

    @OriginalMember(owner = "client!vg", name = "lc", descriptor = "I")
    public int field954 = -1000;

    @OriginalMember(owner = "client!vg", name = "Kb", descriptor = "I")
    public int field927 = 0;

    @OriginalMember(owner = "client!vg", name = "wb", descriptor = "I")
    public int field913 = -1;

    @OriginalMember(owner = "client!vg", name = "vc", descriptor = "I")
    public int field964 = -1000;

    @OriginalMember(owner = "client!vg", name = "bc", descriptor = "I")
    public int field944 = -1;

    @OriginalMember(owner = "client!vg", name = "Rb", descriptor = "I")
    public int field934 = 100;

    @OriginalMember(owner = "client!vg", name = "Bc", descriptor = "I")
    public int field970 = 0;

    @OriginalMember(owner = "client!vg", name = "Ac", descriptor = "I")
    public int field969 = 0;

    @OriginalMember(owner = "client!vg", name = "sc", descriptor = "Z")
    public boolean field961 = false;

    @OriginalMember(owner = "client!vg", name = "yc", descriptor = "I")
    public int field967 = -1;

    @OriginalMember(owner = "client!vg", name = "wc", descriptor = "I")
    public int field965 = 0;

    @OriginalMember(owner = "client!vg", name = "Jc", descriptor = "I")
    public int field978 = 0;

    @OriginalMember(owner = "client!vg", name = "X", descriptor = "Leaa;")
    public class498 field888 = new class498();

    @OriginalMember(owner = "client!vg", name = "Oc", descriptor = "Leaa;")
    private class498 field983 = new class498();

    @OriginalMember(owner = "client!vg", name = "Pc", descriptor = "Leaa;")
    private class498 field984 = new class498();

    @OriginalMember(owner = "client!vg", name = "Qc", descriptor = "Z")
    public boolean field985 = false;

    @OriginalMember(owner = "client!vg", name = "Sc", descriptor = "I")
    public int field987 = 0;

    @OriginalMember(owner = "client!vg", name = "Rc", descriptor = "[B")
    public byte[] field986 = new byte[10];

    @OriginalMember(owner = "client!vg", name = "Vc", descriptor = "[Lka;")
    public class469[] field990 = new class469[3];

    @OriginalMember(owner = "client!vg", name = "Tc", descriptor = "I")
    public int field988 = 0;

    @OriginalMember(owner = "client!vg", name = "Xc", descriptor = "I")
    public int field992 = 0;

    @OriginalMember(owner = "client!vg", name = "Uc", descriptor = "I")
    public int field989 = 0;

    @OriginalMember(owner = "client!vg", name = "Zc", descriptor = "Z")
    public boolean field994 = false;

    @OriginalMember(owner = "client!vg", name = "Wc", descriptor = "[I")
    public int[] field991 = new int[10];

    @OriginalMember(owner = "client!vg", name = "ad", descriptor = "[I")
    public int[] field995 = new int[10];

    @OriginalMember(owner = "client!vg", name = "dc", descriptor = "Lqe;")
    public static class465 field946 = new class465(3, 6);

    @OriginalMember(owner = "client!vg", name = "Lc", descriptor = "I")
    public static int field980 = -1;

    @OriginalMember(owner = "client!vg", name = "Jb", descriptor = "B")
    public byte field926;

    @OriginalMember(owner = "client!vg", name = "Mb", descriptor = "B")
    public byte field929;

    @OriginalMember(owner = "client!vg", name = "Fc", descriptor = "B")
    public byte field974;

    @OriginalMember(owner = "client!vg", name = "O", descriptor = "I")
    public int field879;

    @OriginalMember(owner = "client!vg", name = "Q", descriptor = "I")
    public int field881;

    @OriginalMember(owner = "client!vg", name = "S", descriptor = "I")
    public int field883;

    @OriginalMember(owner = "client!vg", name = "ab", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!vg", name = "cb", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!vg", name = "eb", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!vg", name = "gb", descriptor = "I")
    public int field897;

    @OriginalMember(owner = "client!vg", name = "hb", descriptor = "I")
    public int field898;

    @OriginalMember(owner = "client!vg", name = "ib", descriptor = "I")
    public int field899;

    @OriginalMember(owner = "client!vg", name = "jb", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!vg", name = "kb", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!vg", name = "lb", descriptor = "I")
    public int field902;

    @OriginalMember(owner = "client!vg", name = "mb", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!vg", name = "ob", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!vg", name = "sb", descriptor = "I")
    public int field909;

    @OriginalMember(owner = "client!vg", name = "vb", descriptor = "I")
    public int field912;

    @OriginalMember(owner = "client!vg", name = "yb", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!vg", name = "Ab", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!vg", name = "Cb", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!vg", name = "Db", descriptor = "I")
    public int field920;

    @OriginalMember(owner = "client!vg", name = "Eb", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!vg", name = "Ib", descriptor = "I")
    public int field925;

    @OriginalMember(owner = "client!vg", name = "Ob", descriptor = "I")
    public int field931;

    @OriginalMember(owner = "client!vg", name = "Pb", descriptor = "I")
    public int field932;

    @OriginalMember(owner = "client!vg", name = "Sb", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!vg", name = "Tb", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!vg", name = "Vb", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!vg", name = "Zb", descriptor = "I")
    public int field942;

    @OriginalMember(owner = "client!vg", name = "ec", descriptor = "I")
    public int field947;

    @OriginalMember(owner = "client!vg", name = "fc", descriptor = "I")
    public int field948;

    @OriginalMember(owner = "client!vg", name = "gc", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!vg", name = "ic", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!vg", name = "mc", descriptor = "I")
    public int field955;

    @OriginalMember(owner = "client!vg", name = "qc", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!vg", name = "rc", descriptor = "I")
    public int field960;

    @OriginalMember(owner = "client!vg", name = "tc", descriptor = "I")
    public int field962;

    @OriginalMember(owner = "client!vg", name = "uc", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!vg", name = "zc", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!vg", name = "Cc", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!vg", name = "Dc", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!vg", name = "Ec", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!vg", name = "Gc", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!vg", name = "Hc", descriptor = "I")
    public int field976;

    @OriginalMember(owner = "client!vg", name = "Ic", descriptor = "I")
    public int field977;

    @OriginalMember(owner = "client!vg", name = "Kc", descriptor = "I")
    public int field979;

    @OriginalMember(owner = "client!vg", name = "Mc", descriptor = "I")
    public int field981;

    @OriginalMember(owner = "client!vg", name = "Nc", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!vg", name = "Yc", descriptor = "Lf;")
    public class753 field993;

    @OriginalMember(owner = "client!vg", name = "Nb", descriptor = "[I")
    public int[] field930;

    @OriginalMember(owner = "client!vg", name = "xc", descriptor = "[I")
    public int[] field966;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(IZI)V")
    public final void method462(int arg0, boolean arg1, int arg2) {
        ++field971;
        class500 var4 = this.method464((byte) 127);
        if (arg1 || ~var4.field7132 != -1 || ~this.field878 != -1) {
            this.field920 = 16383 & arg0;
            if (arg2 == -1) {
                this.field888.method2995(arg2 + -25628, this.field920);
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIZII)V")
    public final void method463(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        ++field949;
        int var7 = arg3 ? this.field908 : this.field957;
        if (~arg1 != 0 && ~var7 != 0) {
            if (arg1 != var7) {
                class164 var8 = class638.field9104.method3753(-37, arg1);
                class164 var9 = class638.field9104.method3753(-95, var7);
                if (~var8.field2427 != 0 && ~var9.field2427 != 0) {
                    class718 var10 = class698.field9806.method851(var8.field2427, -2);
                    class718 var11 = class698.field9806.method851(var9.field2427, -2);
                    if (var11.field10064 > var10.field10064) {
                        return;
                    }
                }
            } else {
                class164 var12 = class638.field9104.method3753(98, arg1);
                if (var12.field2412 && ~var12.field2427 != 0) {
                    class718 var13 = class698.field9806.method851(var12.field2427, -2);
                    int var14 = var13.field10061;
                    if (var14 == 0) {
                        return;
                    }
                    if (var14 == 2) {
                        if (arg3) {
                            this.field956 = 0;
                            return;
                        }
                        this.field945 = 0;
                        return;
                    }
                }
            }
        }
        int var15 = class605.field8787;
        if (arg4 >= -104) {
            this.field884 = 95;
        }
        if (!arg3) {
            this.field922 = arg2;
            this.field890 = 0;
            this.field906 = 0;
            this.field909 = arg0;
            this.field957 = arg1;
            this.field955 = arg5 >> 16;
            this.field940 = 1;
            this.field960 = (arg5 & 65535) + var15;
            if (var15 < this.field960) {
                this.field890 = -1;
            }
            if (this.field957 != -1 && ~this.field960 == ~var15) {
                int var16 = class638.field9104.method3753(-85, this.field957).field2427;
                if (var16 != -1) {
                    class718 var17 = class698.field9806.method851(var16, -2);
                    if (var17 != null && var17.field10053 != null && !this.field892) {
                        class749.method4165(0, (byte) 103, var17, this);
                        return;
                    }
                }
            }
        } else {
            this.field899 = var15 - -(arg5 & 65535);
            this.field925 = arg5 >> 16;
            this.field908 = arg1;
            this.field932 = arg0;
            this.field910 = 1;
            this.field896 = arg2;
            this.field880 = 0;
            this.field882 = 0;
            if (~this.field899 < ~var15) {
                this.field880 = -1;
            }
            if (~this.field908 != 0 && ~this.field899 == ~var15) {
                int var18 = class638.field9104.method3753(-87, this.field908).field2427;
                if (var18 != -1) {
                    class718 var19 = class698.field9806.method851(var18, -2);
                    if (var19 != null && var19.field10053 != null && !this.field892) {
                        class749.method4165(0, (byte) 119, var19, this);
                        return;
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "(B)I")
    public final int method393(byte arg0) {
        if (arg0 != -83) {
            method471(-128);
        }
        ++field919;
        return this.field889;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)Lis;")
    public final class500 method464(byte arg0) {
        ++field893;
        int var2 = 37 % ((arg0 - 72) / 54);
        int var3 = this.method472(126);
        return var3 == -1 ? class224.field3199 : class675.field9475.method1251(var3, -108);
    }

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "(B)Z")
    public final boolean method395(byte arg0) {
        ++field895;
        if (arg0 != 84) {
            this.field978 = -30;
        }
        return false;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(B)V")
    public static void method465(byte arg0) {
        field946 = null;
        if (arg0 < 1) {
            method471(92);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)Z")
    public final boolean method466(int arg0, int arg1, int arg2) {
        ++field972;
        if (this.field966 == null) {
            if (~arg0 == 0) {
                return true;
            }
            this.field966 = new int[12];
            for (int var4 = 0; ~var4 > -13; ++var4) {
                this.field966[var4] = -1;
            }
        }
        class500 var5 = this.method464((byte) -91);
        int var6 = 256;
        if (var5.field7150 != null && ~var5.field7150[arg2] < -1) {
            var6 = var5.field7150[arg2];
        }
        if (arg1 != -18877) {
            return false;
        } else if (~arg0 == 0) {
            if (this.field966[arg2] == -1) {
                return true;
            } else {
                int var7 = this.field888.method2999(arg1 + 35260);
                int var8 = this.field966[arg2];
                int var9 = var7 - var8;
                if (var9 >= -var6 && ~var9 >= ~var6) {
                    this.field966[arg2] = -1;
                    for (int var10 = 0; ~var10 > -13; ++var10) {
                        if (this.field966[var10] != -1) {
                            return true;
                        }
                    }
                    this.field966 = null;
                    return true;
                } else {
                    if ((~var9 >= -1 || var9 > 8192) && ~var9 < 8191) {
                        this.field966[arg2] = class555.method3246(16383, -var6 + var8);
                    } else {
                        this.field966[arg2] = class555.method3246(var6 + var8, 16383);
                    }
                    return false;
                }
            }
        } else {
            if (this.field966[arg2] == -1) {
                this.field966[arg2] = this.field888.method2999(16383);
            }
            int var11 = this.field966[arg2];
            int var12 = arg0 - var11;
            if (var12 >= -var6 && ~var12 >= ~var6) {
                this.field966[arg2] = arg0;
                return true;
            } else {
                if ((var12 <= 0 || var12 > 8192) && var12 > -8192) {
                    this.field966[arg2] = class555.method3246(16383, -var6 + var11);
                } else {
                    this.field966[arg2] = class555.method3246(16383, var11 - -var6);
                }
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lkd;B[Lka;Lha;Z)V")
    public final void method467(class280 arg0, byte arg1, class469[] arg2, class58 arg3, boolean arg4) {
        if (!arg4) {
            class469 var6 = arg2[0];
            class469 var7 = arg2[1];
            class469 var8 = arg2[2];
            if (var6 != null) {
                var6.method354(arg0);
                int var9 = 0;
                int var10 = 0;
                int var11 = 0;
                int var12 = 0;
                class675[] var13 = var6.method334();
                class206[] var14 = var6.method336();
                if (var14 != null) {
                    var11 += var14.length;
                    ++var12;
                }
                if (var13 != null) {
                    var9 += var13.length;
                    ++var10;
                }
                class675[] var15 = null;
                class206[] var16 = null;
                if (var7 != null) {
                    var7.method354(arg0);
                    var15 = var7.method334();
                    var16 = var7.method336();
                }
                if (var16 != null) {
                    ++var12;
                    var11 += var16.length;
                }
                if (var15 != null) {
                    var9 += var15.length;
                    ++var10;
                }
                class675[] var17 = null;
                class206[] var18 = null;
                if (var8 != null) {
                    var8.method354(arg0);
                    var17 = var8.method334();
                    var18 = var8.method336();
                }
                if (var17 != null) {
                    var9 += var17.length;
                    ++var10;
                }
                if (var18 != null) {
                    var11 += var18.length;
                    ++var12;
                }
                if ((this.field993 == null || this.field993.field10494) && (~var10 < -1 || ~var12 < -1)) {
                    this.field993 = class753.method4187(class605.field8787, true);
                }
                if (this.field993 != null) {
                    Object var19 = null;
                    class675[] var20;
                    if (var10 == 1) {
                        if (var15 != null) {
                            var20 = var15;
                        } else if (var17 == null) {
                            var20 = var13;
                        } else {
                            var20 = var17;
                        }
                    } else {
                        var20 = new class675[var9];
                        int var21 = 0;
                        if (var13 != null) {
                            class622.method3594(var13, 0, var20, var21, var13.length);
                            var21 += var13.length;
                        }
                        if (var15 != null) {
                            class622.method3594(var15, 0, var20, var21, var15.length);
                            var21 += var15.length;
                        }
                        if (var17 != null) {
                            class622.method3594(var17, 0, var20, var21, var17.length);
                        }
                    }
                    Object var22 = null;
                    class206[] var23;
                    if (var12 != 1) {
                        var23 = new class206[var11];
                        int var24 = 0;
                        if (var14 != null) {
                            class622.method3594(var14, 0, var23, var24, var14.length);
                            var24 += var14.length;
                        }
                        if (var16 != null) {
                            class622.method3594(var16, 0, var23, var24, var16.length);
                            var24 += var16.length;
                        }
                        if (var18 != null) {
                            class622.method3594(var18, 0, var23, var24, var18.length);
                        }
                    } else if (var16 == null) {
                        if (var18 != null) {
                            var23 = var18;
                        } else {
                            var23 = var14;
                        }
                    } else {
                        var23 = var16;
                    }
                    this.field993.method4183(arg3, (long) class605.field8787, var20, var23, false);
                }
                this.field994 = true;
            }
        } else if (this.field993 != null) {
            this.field993.method4173((long) class605.field8787);
        }
        if (arg1 <= -19) {
            ++field938;
            if (this.field993 != null) {
                this.field993.method4176(super.field649, super.field1814, super.field1818, super.field1820, super.field1810);
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIILha;IIII)V")
    public static final void method468(int arg0, int arg1, int arg2, class58 arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 107 % ((arg5 - -23) / 58);
        arg3.method542(arg0, arg1, 3854, arg6, arg2, arg7);
        ++field903;
        arg3.method542(16, arg1 + -2, 3854, arg4, arg2 + 1, arg7 + 1);
        arg3.method586(arg4, arg2 - -18, 12, arg0 + -19, arg1 - 2, arg7 - -1);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIBI)V")
    public final void method469(int arg0, int arg1, byte arg2, int arg3) {
        ++field900;
        if (arg2 >= 79) {
            for (int var5 = 0; ~var5 > -5; ++var5) {
                if (arg1 >= this.field894[var5]) {
                    this.field924[var5] = arg3;
                    this.field916[var5] = arg0;
                    this.field894[var5] = arg1 + 70;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(II)V")
    public final void method470(int arg0, int arg1) {
        ++field982;
        if (arg1 != 0) {
            this.method395((byte) -35);
        }
        this.field941 = arg0;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
    public static final void method471(int arg0) {
        int var1 = 49 % ((arg0 - -40) / 36);
        ++field905;
        class510 var2 = class620.field8954;
        synchronized (class620.field8954) {
            class620.field8954.method3050(false);
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)I")
    public abstract int method472(int arg0);

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lka;I)V")
    public final void method473(class469 arg0, int arg1) {
        ++field963;
        int var3 = this.field983.field7100;
        if (arg1 != 0) {
            this.field976 = 59;
        }
        int var4 = this.field984.field7100;
        if (~var3 != -1 || var4 != 0) {
            int var5 = arg0.method338() / 2;
            arg0.method349(0, -var5, 0);
            arg0.method310(16383 & var3);
            arg0.method344(16383 & var4);
            arg0.method349(0, var5, 0);
        }
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(II)V")
    public final void method474(int arg0, int arg1) {
        if (arg0 == -1) {
            ++field915;
            class500 var3 = this.method464((byte) -28);
            if (var3.field7132 != 0 || ~this.field878 != -1) {
                this.field888.method2998(16383);
                int var4 = -this.field888.field7100 + arg1 & 16383;
                if (var4 > 8192) {
                    this.field920 = this.field888.field7100 + var4 + -16384;
                } else {
                    this.field920 = this.field888.field7100 + var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIII)V")
    public final void method475(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field959;
        int var7 = super.field1818 + super.field1814 >> 1;
        int var8 = super.field1820 + super.field1810 >> 1;
        int var9 = class316.field4487[arg1];
        int var10 = class316.field4490[arg1];
        int var11 = -arg2 / 2;
        int var12 = -arg0 / 2;
        int var13 = var9 * var12 + var10 * var11 >> 14;
        int var14 = var10 * var12 + -(var9 * var11) >> 14;
        int var15 = class69.method714((byte) -87, var8, super.field648 + var14, var7, super.field644 + var13, super.field649);
        int var16 = arg2 / 2;
        int var17 = -arg0 / 2;
        int var18 = var9 * var17 - -(var10 * var16) >> 14;
        int var19 = var10 * var17 + -(var9 * var16) >> 14;
        int var20 = class69.method714((byte) -123, var8, super.field648 - -var19, var7, super.field644 + var18, super.field649);
        int var21 = 2 / ((46 - arg5) / 50);
        int var22 = -arg2 / 2;
        int var23 = arg0 / 2;
        int var24 = var9 * var23 + var10 * var22 >> 14;
        int var25 = var10 * var23 + -(var9 * var22) >> 14;
        int var26 = class69.method714((byte) -96, var8, super.field648 - -var25, var7, super.field644 + var24, super.field649);
        int var27 = arg2 / 2;
        int var28 = arg0 / 2;
        int var29 = var9 * var28 + var10 * var27 >> 14;
        int var30 = var10 * var28 + -(var9 * var27) >> 14;
        int var31 = class69.method714((byte) -122, var8, super.field648 - -var30, var7, super.field644 + var29, super.field649);
        int var32 = ~var20 < ~var15 ? var15 : var20;
        int var33 = var26 < var31 ? var26 : var31;
        int var34 = ~var31 >= ~var20 ? var31 : var20;
        this.field912 = 16383 & (int) (Math.atan2((double) (-var33 + var32), (double) arg0) * 2607.5945876176133D);
        int var35 = ~var15 <= ~var26 ? var26 : var15;
        this.field942 = 16383 & (int) (2607.5945876176133D * Math.atan2((double) (-var34 + var35), (double) arg2));
        if (~this.field912 != -1 && arg4 != 0) {
            int var36 = -arg4 + 16384;
            if (this.field912 <= 8192) {
                if (~arg4 > ~this.field912) {
                    this.field912 = arg4;
                }
            } else if (var36 > this.field912) {
                this.field912 = var36;
            }
        }
        this.field902 = var15 + var31;
        if (this.field942 != 0 && ~arg3 != -1) {
            int var37 = -arg3 + 16384;
            if (this.field942 <= 8192) {
                if (~arg3 > ~this.field942) {
                    this.field942 = arg3;
                }
            } else if (this.field942 < var37) {
                this.field942 = var37;
            }
        }
        if (~this.field902 < ~(var20 + var26)) {
            this.field902 = var20 - -var26;
        }
        this.field902 = (this.field902 >> 1) + -super.field651;
    }

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "(I)V")
    public final void method476(int arg0) {
        ++field936;
        int var2 = (this.field941 + -1 << 8) + 240;
        super.field1818 = (short) (super.field644 + var2 >> 9);
        if (arg0 <= 100) {
            this.field924 = null;
        }
        super.field1820 = (short) (-var2 + super.field648 >> 9);
        super.field1810 = (short) (super.field648 + var2 >> 9);
        super.field1814 = (short) (-var2 + super.field644 >> 9);
    }

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "(I)I")
    public final int method477(int arg0) {
        ++field935;
        class500 var2 = this.method464((byte) 10);
        int var3 = this.field888.field7100;
        if (arg0 != -28675) {
            method468(-14, -88, -80, (class58) null, 101, -55, -121, 84);
        }
        boolean var4;
        if (~var2.field7132 != -1) {
            var4 = this.field888.method2997(var2.field7115, var2.field7132, this.field920, -4674);
        } else {
            var4 = this.field888.method2997(this.field878, this.field878, this.field920, arg0 + 24001);
        }
        int var5 = this.field888.field7100 - var3;
        if (~var5 != -1) {
            ++this.field978;
        } else {
            this.field978 = 0;
            this.field888.method2995(arg0 ^ 5150, this.field920);
        }
        if (!var4) {
            if (~var2.field7130 != -1) {
                this.field983.method2997(var2.field7109, var2.field7130, 0, -4674);
            } else {
                this.field983.method2995(-25629, 0);
            }
            if (var2.field7117 != 0) {
                this.field984.method2997(var2.field7121, var2.field7117, 0, -4674);
            } else {
                this.field984.method2995(arg0 + 3046, 0);
            }
        } else {
            if (var2.field7130 != 0) {
                if (~var5 < -1) {
                    this.field983.method2997(var2.field7109, var2.field7130, var2.field7128, -4674);
                } else {
                    this.field983.method2997(var2.field7109, var2.field7130, -var2.field7128, -4674);
                }
            }
            if (~var2.field7117 != -1) {
                this.field984.method2997(var2.field7121, var2.field7117, var2.field7133, -4674);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "(I)Z")
    public static final boolean method478(int arg0) {
        ++field968;
        Hashtable var1 = new Hashtable();
        Enumeration var2 = class54.field1029.keys();
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, class54.field1029.get(var3));
        }
        try {
            Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
            Class var5 = Class.forName("java.lang.ClassLoader");
            if (arg0 != 5308) {
                return true;
            }
            Field var6 = var5.getDeclaredField("nativeLibraries");
            Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var7.invoke(var6, Boolean.TRUE);
            try {
                Enumeration var8 = class54.field1029.keys();
                while (var8.hasMoreElements()) {
                    String var9 = (String) var8.nextElement();
                    try {
                        File var10 = (File) class13.field158.get(var9);
                        Class var11 = (Class) class54.field1029.get(var9);
                        Vector var12 = (Vector) var6.get(var11.getClassLoader());
                        for (int var13 = 0; ~var13 > ~var12.size(); ++var13) {
                            try {
                                Object var14 = var12.elementAt(var13);
                                Field var15 = var14.getClass().getDeclaredField("name");
                                var7.invoke(var15, Boolean.TRUE);
                                try {
                                    String var16 = (String) var15.get(var14);
                                    if (var16 != null && var16.equalsIgnoreCase(var10.getCanonicalPath())) {
                                        Field var17 = var14.getClass().getDeclaredField("handle");
                                        Method var18 = var14.getClass().getDeclaredMethod("finalize");
                                        var7.invoke(var17, Boolean.TRUE);
                                        var7.invoke(var18, Boolean.TRUE);
                                        try {
                                            var18.invoke(var14);
                                            var17.set(var14, new Integer(0));
                                            var1.remove(var9);
                                        } catch (Throwable var19) {
                                        }
                                        var7.invoke(var18, Boolean.FALSE);
                                        var7.invoke(var17, Boolean.FALSE);
                                    }
                                } catch (Throwable var20) {
                                }
                                var7.invoke(var15, Boolean.FALSE);
                            } catch (Throwable var21) {
                            }
                        }
                    } catch (Throwable var22) {
                    }
                }
            } catch (Throwable var23) {
            }
            var7.invoke(var6, Boolean.FALSE);
        } catch (Throwable var24) {
        }
        class54.field1029 = var1;
        return class54.field1029.isEmpty();
    }

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "(I)I")
    public abstract int method479(int arg0);

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "(I)I")
    public int method480(int arg0) {
        ++field951;
        if (arg0 != 18131) {
            this.method483(true, (int[]) null, (int[]) null);
        }
        class500 var2 = this.method464((byte) 127);
        if (var2.field7144 != -1) {
            return var2.field7144;
        } else {
            return this.field918 == -32768 ? 200 : -this.field918;
        }
    }

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "(I)V")
    public final void method481(int arg0) {
        this.field992 = 0;
        ++field917;
        int var2 = 11 % ((34 - arg0) / 62);
        this.field988 = 0;
    }

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "(B)Z")
    public final boolean method399(byte arg0) {
        if (arg0 != 38) {
            this.method482(true);
        }
        ++field973;
        return this.field985;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)I")
    public int method482(boolean arg0) {
        ++field975;
        return arg0 ? 77 : this.field941;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z[I[I)V")
    public final void method483(boolean arg0, int[] arg1, int[] arg2) {
        ++field891;
        if (this.field930 == null && arg1 != null) {
            this.field930 = new int[12];
        } else if (arg1 == null) {
            this.field930 = null;
            return;
        }
        int var4 = 0;
        if (arg0) {
            while (~this.field930.length < ~var4) {
                this.field930[var4] = -1;
                ++var4;
            }
            for (int var5 = 0; ~var5 > ~arg1.length; ++var5) {
                int var6 = arg2[var5];
                int var7 = 0;
                while (var7 < this.field930.length) {
                    if ((1 & var6) != 0) {
                        this.field930[var7] = arg1[var5];
                    }
                    ++var7;
                    var6 >>= 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V")
    public class52() {
        super(0, 0, 0, 0, 0, 0, 0, 0, 0, false, (byte) 0);
    }

    @OriginalMember(owner = "client!vg", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field993 != null) {
            this.field993.method4179();
        }
        ++field921;
    }

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "(I)I")
    public final int method404(int arg0) {
        ++field901;
        if (arg0 != 65535) {
            this.method462(59, true, -8);
        }
        return ~this.field918 == 32767 ? 0 : this.field918;
    }
}
