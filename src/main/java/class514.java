import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class514 extends class629 {

    @OriginalMember(owner = "client!eca", name = "Q", descriptor = "I")
    private int field6970 = 0;

    @OriginalMember(owner = "client!eca", name = "V", descriptor = "I")
    private int field6975 = 0;

    @OriginalMember(owner = "client!eca", name = "B", descriptor = "I")
    private int field6955 = 0;

    @OriginalMember(owner = "client!eca", name = "A", descriptor = "Z")
    private boolean field6954 = true;

    @OriginalMember(owner = "client!eca", name = "X", descriptor = "I")
    private int field6977 = 0;

    @OriginalMember(owner = "client!eca", name = "eb", descriptor = "Z")
    private boolean field6984 = false;

    @OriginalMember(owner = "client!eca", name = "W", descriptor = "I")
    private int field6976 = 0;

    @OriginalMember(owner = "client!eca", name = "Vb", descriptor = "Lpea;")
    private class641 field7027;

    @OriginalMember(owner = "client!eca", name = "cc", descriptor = "Lcm;")
    private class158 field7034;

    @OriginalMember(owner = "client!eca", name = "Fb", descriptor = "Lcm;")
    private class158 field7011;

    @OriginalMember(owner = "client!eca", name = "Xb", descriptor = "Lcm;")
    private class158 field7029;

    @OriginalMember(owner = "client!eca", name = "Ib", descriptor = "Lcm;")
    private class158 field7014;

    @OriginalMember(owner = "client!eca", name = "pb", descriptor = "Lvaa;")
    private class199 field6995;

    @OriginalMember(owner = "client!eca", name = "y", descriptor = "I")
    private int field6952;

    @OriginalMember(owner = "client!eca", name = "fc", descriptor = "I")
    private int field7037;

    @OriginalMember(owner = "client!eca", name = "mb", descriptor = "[I")
    private int[] field6992;

    @OriginalMember(owner = "client!eca", name = "w", descriptor = "[S")
    private short[] field6950;

    @OriginalMember(owner = "client!eca", name = "Sb", descriptor = "[I")
    private int[] field7024;

    @OriginalMember(owner = "client!eca", name = "Nb", descriptor = "[I")
    private int[] field7019;

    @OriginalMember(owner = "client!eca", name = "Kb", descriptor = "[I")
    private int[] field7016;

    @OriginalMember(owner = "client!eca", name = "yb", descriptor = "[Lpp;")
    private class190[] field7004;

    @OriginalMember(owner = "client!eca", name = "P", descriptor = "[Ljq;")
    private class594[] field6969;

    @OriginalMember(owner = "client!eca", name = "rc", descriptor = "I")
    private int field7049;

    @OriginalMember(owner = "client!eca", name = "Eb", descriptor = "[Lvfa;")
    private class614[] field7010;

    @OriginalMember(owner = "client!eca", name = "vb", descriptor = "[Lqv;")
    private class638[] field7001;

    @OriginalMember(owner = "client!eca", name = "nc", descriptor = "[S")
    private short[] field7045;

    @OriginalMember(owner = "client!eca", name = "u", descriptor = "[F")
    private float[] field6948;

    @OriginalMember(owner = "client!eca", name = "Rb", descriptor = "[B")
    private byte[] field7023;

    @OriginalMember(owner = "client!eca", name = "N", descriptor = "[S")
    private short[] field6967;

    @OriginalMember(owner = "client!eca", name = "K", descriptor = "[S")
    private short[] field6964;

    @OriginalMember(owner = "client!eca", name = "ab", descriptor = "[S")
    private short[] field6980;

    @OriginalMember(owner = "client!eca", name = "zb", descriptor = "[S")
    private short[] field7005;

    @OriginalMember(owner = "client!eca", name = "oc", descriptor = "[S")
    private short[] field7046;

    @OriginalMember(owner = "client!eca", name = "Zb", descriptor = "S")
    private short field7031;

    @OriginalMember(owner = "client!eca", name = "tb", descriptor = "[S")
    private short[] field6999;

    @OriginalMember(owner = "client!eca", name = "mc", descriptor = "S")
    private short field7044;

    @OriginalMember(owner = "client!eca", name = "R", descriptor = "[S")
    private short[] field6971;

    @OriginalMember(owner = "client!eca", name = "cb", descriptor = "[B")
    private byte[] field6982;

    @OriginalMember(owner = "client!eca", name = "E", descriptor = "[S")
    private short[] field6958;

    @OriginalMember(owner = "client!eca", name = "hc", descriptor = "[S")
    private short[] field7039;

    @OriginalMember(owner = "client!eca", name = "jb", descriptor = "[F")
    private float[] field6989;

    @OriginalMember(owner = "client!eca", name = "Ub", descriptor = "[I")
    private int[] field7026;

    @OriginalMember(owner = "client!eca", name = "lb", descriptor = "[[I")
    private int[][] field6991;

    @OriginalMember(owner = "client!eca", name = "o", descriptor = "[[I")
    private int[][] field6942;

    @OriginalMember(owner = "client!eca", name = "C", descriptor = "[[I")
    private int[][] field6956;

    @OriginalMember(owner = "client!eca", name = "Ab", descriptor = "I")
    public static int field7006 = 0;

    @OriginalMember(owner = "client!eca", name = "ec", descriptor = "B")
    private byte field7036;

    @OriginalMember(owner = "client!eca", name = "p", descriptor = "I")
    public static int field6943;

    @OriginalMember(owner = "client!eca", name = "r", descriptor = "I")
    public static int field6945;

    @OriginalMember(owner = "client!eca", name = "s", descriptor = "I")
    public static int field6946;

    @OriginalMember(owner = "client!eca", name = "t", descriptor = "I")
    public static int field6947;

    @OriginalMember(owner = "client!eca", name = "v", descriptor = "I")
    public static int field6949;

    @OriginalMember(owner = "client!eca", name = "x", descriptor = "I")
    public static int field6951;

    @OriginalMember(owner = "client!eca", name = "z", descriptor = "I")
    public static int field6953;

    @OriginalMember(owner = "client!eca", name = "D", descriptor = "I")
    public static int field6957;

    @OriginalMember(owner = "client!eca", name = "F", descriptor = "I")
    public static int field6959;

    @OriginalMember(owner = "client!eca", name = "G", descriptor = "I")
    public static int field6960;

    @OriginalMember(owner = "client!eca", name = "H", descriptor = "I")
    public static int field6961;

    @OriginalMember(owner = "client!eca", name = "I", descriptor = "I")
    public static int field6962;

    @OriginalMember(owner = "client!eca", name = "J", descriptor = "I")
    public static int field6963;

    @OriginalMember(owner = "client!eca", name = "L", descriptor = "I")
    public static int field6965;

    @OriginalMember(owner = "client!eca", name = "M", descriptor = "I")
    public static int field6966;

    @OriginalMember(owner = "client!eca", name = "O", descriptor = "I")
    public static int field6968;

    @OriginalMember(owner = "client!eca", name = "S", descriptor = "I")
    public static int field6972;

    @OriginalMember(owner = "client!eca", name = "T", descriptor = "I")
    public static int field6973;

    @OriginalMember(owner = "client!eca", name = "U", descriptor = "I")
    public static int field6974;

    @OriginalMember(owner = "client!eca", name = "Y", descriptor = "I")
    public static int field6978;

    @OriginalMember(owner = "client!eca", name = "Z", descriptor = "I")
    public static int field6979;

    @OriginalMember(owner = "client!eca", name = "bb", descriptor = "I")
    public static int field6981;

    @OriginalMember(owner = "client!eca", name = "db", descriptor = "I")
    public static int field6983;

    @OriginalMember(owner = "client!eca", name = "fb", descriptor = "I")
    public static int field6985;

    @OriginalMember(owner = "client!eca", name = "gb", descriptor = "I")
    public static int field6986;

    @OriginalMember(owner = "client!eca", name = "hb", descriptor = "I")
    public static int field6987;

    @OriginalMember(owner = "client!eca", name = "ib", descriptor = "I")
    public static int field6988;

    @OriginalMember(owner = "client!eca", name = "kb", descriptor = "I")
    public static int field6990;

    @OriginalMember(owner = "client!eca", name = "nb", descriptor = "I")
    public static int field6993;

    @OriginalMember(owner = "client!eca", name = "ob", descriptor = "I")
    public static int field6994;

    @OriginalMember(owner = "client!eca", name = "qb", descriptor = "I")
    public static int field6996;

    @OriginalMember(owner = "client!eca", name = "sb", descriptor = "I")
    public static int field6998;

    @OriginalMember(owner = "client!eca", name = "ub", descriptor = "I")
    public static int field7000;

    @OriginalMember(owner = "client!eca", name = "wb", descriptor = "I")
    public static int field7002;

    @OriginalMember(owner = "client!eca", name = "Bb", descriptor = "I")
    public static int field7007;

    @OriginalMember(owner = "client!eca", name = "Db", descriptor = "I")
    public static int field7009;

    @OriginalMember(owner = "client!eca", name = "Hb", descriptor = "I")
    public static int field7013;

    @OriginalMember(owner = "client!eca", name = "Mb", descriptor = "I")
    public static int field7018;

    @OriginalMember(owner = "client!eca", name = "Ob", descriptor = "I")
    public static int field7020;

    @OriginalMember(owner = "client!eca", name = "Pb", descriptor = "I")
    public static int field7021;

    @OriginalMember(owner = "client!eca", name = "Qb", descriptor = "I")
    public static int field7022;

    @OriginalMember(owner = "client!eca", name = "Wb", descriptor = "I")
    public static int field7028;

    @OriginalMember(owner = "client!eca", name = "Yb", descriptor = "I")
    public static int field7030;

    @OriginalMember(owner = "client!eca", name = "ac", descriptor = "I")
    public static int field7032;

    @OriginalMember(owner = "client!eca", name = "bc", descriptor = "I")
    public static int field7033;

    @OriginalMember(owner = "client!eca", name = "gc", descriptor = "I")
    public static int field7038;

    @OriginalMember(owner = "client!eca", name = "ic", descriptor = "I")
    public static int field7040;

    @OriginalMember(owner = "client!eca", name = "jc", descriptor = "I")
    public static int field7041;

    @OriginalMember(owner = "client!eca", name = "lc", descriptor = "I")
    public static int field7043;

    @OriginalMember(owner = "client!eca", name = "pc", descriptor = "I")
    public static int field7047;

    @OriginalMember(owner = "client!eca", name = "qc", descriptor = "I")
    public static int field7048;

    @OriginalMember(owner = "client!eca", name = "sc", descriptor = "I")
    public static int field7050;

    @OriginalMember(owner = "client!eca", name = "dc", descriptor = "Lrm;")
    private class359 field7035;

    @OriginalMember(owner = "client!eca", name = "Lb", descriptor = "Lav;")
    private class437 field7017;

    @OriginalMember(owner = "client!eca", name = "xb", descriptor = "Lfr;")
    private class43 field7003;

    @OriginalMember(owner = "client!eca", name = "q", descriptor = "S")
    private short field6944;

    @OriginalMember(owner = "client!eca", name = "rb", descriptor = "S")
    private short field6997;

    @OriginalMember(owner = "client!eca", name = "Cb", descriptor = "S")
    private short field7008;

    @OriginalMember(owner = "client!eca", name = "Gb", descriptor = "S")
    private short field7012;

    @OriginalMember(owner = "client!eca", name = "Jb", descriptor = "S")
    private short field7015;

    @OriginalMember(owner = "client!eca", name = "Tb", descriptor = "S")
    private short field7025;

    @OriginalMember(owner = "client!eca", name = "kc", descriptor = "S")
    private short field7042;

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(ZZLeca;IILeca;)Lba;", line = 6)
    private final class629 method2913(boolean arg0, boolean arg1, class514 arg2, int arg3, int arg4, class514 arg5) {
        arg5.field7044 = this.field7044;
        arg5.field7036 = 0;
        field7022++;
        arg5.field7031 = this.field7031;
        arg5.field6952 = arg3;
        arg5.field6976 = this.field6976;
        arg5.field6955 = this.field6955;
        arg5.field6977 = this.field6977;
        arg5.field7049 = this.field7049;
        arg5.field7037 = this.field7037;
        arg5.field6970 = this.field6970;
        arg5.field6975 = this.field6975;
        boolean var7 = class61.method382(arg3, 106, this.field7037);
        boolean var8 = class410.method2404(arg4 ^ arg4, this.field7037, arg3);
        boolean var9 = class660.method3654(arg3, this.field7037, 52);
        boolean var10 = var7 | var8 | var9;
        if (var10) {
            if (!var7) {
                arg5.field7024 = this.field7024;
            } else if (arg2.field7024 == null || arg2.field7024.length < this.field6977) {
                arg5.field7024 = arg2.field7024 = new int[this.field6977];
            } else {
                arg5.field7024 = arg2.field7024;
            }
            if (!var8) {
                arg5.field7019 = this.field7019;
            } else if (arg2.field7019 == null || this.field6977 > arg2.field7019.length) {
                arg5.field7019 = arg2.field7019 = new int[this.field6977];
            } else {
                arg5.field7019 = arg2.field7019;
            }
            if (!var9) {
                arg5.field7016 = this.field7016;
            } else if (arg2.field7016 == null || arg2.field7016.length < this.field6977) {
                arg5.field7016 = arg2.field7016 = new int[this.field6977];
            } else {
                arg5.field7016 = arg2.field7016;
            }
            for (int var11 = 0; var11 < this.field6977; var11++) {
                if (var7) {
                    arg5.field7024[var11] = this.field7024[var11];
                }
                if (var8) {
                    arg5.field7019[var11] = this.field7019[var11];
                }
                if (var9) {
                    arg5.field7016[var11] = this.field7016[var11];
                }
            }
        } else {
            arg5.field7016 = this.field7016;
            arg5.field7024 = this.field7024;
            arg5.field7019 = this.field7019;
        }
        if (class629.method3441(arg3, this.field7037, (byte) -98)) {
            arg5.field7034 = arg2.field7034;
            if (arg1) {
                arg5.field7036 = (byte) (arg5.field7036 | 0x1);
            }
            arg5.field7034.field1981 = this.field7034.field1981;
            arg5.field7034.field1979 = this.field7034.field1979;
        } else if (class297.method1775(this.field7037, arg3, (byte) -92)) {
            arg5.field7034 = this.field7034;
        } else {
            arg5.field7034 = null;
        }
        if (class644.method3585((byte) 122, arg3, this.field7037)) {
            if (arg2.field7039 == null || this.field6975 > arg2.field7039.length) {
                arg5.field7039 = arg2.field7039 = new short[this.field6975];
            } else {
                arg5.field7039 = arg2.field7039;
            }
            for (int var12 = 0; var12 < this.field6975; var12++) {
                arg5.field7039[var12] = this.field7039[var12];
            }
        } else {
            arg5.field7039 = this.field7039;
        }
        if (class216.method1336(this.field7037, arg3, (byte) -56)) {
            if (arg2.field6982 == null || arg2.field6982.length < this.field6975) {
                arg5.field6982 = arg2.field6982 = new byte[this.field6975];
            } else {
                arg5.field6982 = arg2.field6982;
            }
            for (int var13 = 0; var13 < this.field6975; var13++) {
                arg5.field6982[var13] = this.field6982[var13];
            }
        } else {
            arg5.field6982 = this.field6982;
        }
        if (class4.method25(-1, this.field7037, arg3)) {
            arg5.field7014 = arg2.field7014;
            if (arg1) {
                arg5.field7036 = (byte) (arg5.field7036 | 0x2);
            }
            arg5.field7014.field1979 = this.field7014.field1979;
            arg5.field7014.field1981 = this.field7014.field1981;
        } else if (class91.method505(arg3, (byte) 84, this.field7037)) {
            arg5.field7014 = this.field7014;
        } else {
            arg5.field7014 = null;
        }
        if (class558.method3121(this.field7037, arg3, true)) {
            if (arg2.field7005 == null || this.field6976 > arg2.field7005.length) {
                int var14 = this.field6976;
                arg5.field6967 = arg2.field6967 = new short[var14];
                arg5.field7005 = arg2.field7005 = new short[var14];
                arg5.field6971 = arg2.field6971 = new short[var14];
            } else {
                arg5.field6971 = arg2.field6971;
                arg5.field6967 = arg2.field6967;
                arg5.field7005 = arg2.field7005;
            }
            if (this.field7003 == null) {
                for (int var15 = 0; var15 < this.field6976; var15++) {
                    arg5.field7005[var15] = this.field7005[var15];
                    arg5.field6971[var15] = this.field6971[var15];
                    arg5.field6967[var15] = this.field6967[var15];
                }
            } else {
                if (arg2.field7003 == null) {
                    arg2.field7003 = new class43();
                }
                class43 var16 = arg5.field7003 = arg2.field7003;
                if (var16.field560 == null || var16.field560.length < this.field6976) {
                    int var17 = this.field6976;
                    var16.field560 = new short[var17];
                    var16.field552 = new byte[var17];
                    var16.field553 = new short[var17];
                    var16.field556 = new short[var17];
                }
                for (int var18 = 0; var18 < this.field6976; var18++) {
                    arg5.field7005[var18] = this.field7005[var18];
                    arg5.field6971[var18] = this.field6971[var18];
                    arg5.field6967[var18] = this.field6967[var18];
                    var16.field560[var18] = this.field7003.field560[var18];
                    var16.field556[var18] = this.field7003.field556[var18];
                    var16.field553[var18] = this.field7003.field553[var18];
                    var16.field552[var18] = this.field7003.field552[var18];
                }
            }
            arg5.field7023 = this.field7023;
        } else {
            arg5.field7005 = this.field7005;
            arg5.field7023 = this.field7023;
            arg5.field6967 = this.field6967;
            arg5.field7003 = this.field7003;
            arg5.field6971 = this.field6971;
        }
        if (class179.method1177(this.field7037, arg3, (byte) 127)) {
            if (arg1) {
                arg5.field7036 = (byte) (arg5.field7036 | 0x4);
            }
            arg5.field7029 = arg2.field7029;
            arg5.field7029.field1979 = this.field7029.field1979;
            arg5.field7029.field1981 = this.field7029.field1981;
        } else if (class495.method2794(this.field7037, 4965, arg3)) {
            arg5.field7029 = this.field7029;
        } else {
            arg5.field7029 = null;
        }
        if (class169.method1124((byte) -121, arg3, this.field7037)) {
            if (arg2.field6948 == null || arg2.field6948.length < this.field6975) {
                int var19 = this.field6976;
                arg5.field6989 = arg2.field6989 = new float[var19];
                arg5.field6948 = arg2.field6948 = new float[var19];
            } else {
                arg5.field6948 = arg2.field6948;
                arg5.field6989 = arg2.field6989;
            }
            for (int var20 = 0; var20 < this.field6976; var20++) {
                arg5.field6948[var20] = this.field6948[var20];
                arg5.field6989[var20] = this.field6989[var20];
            }
        } else {
            arg5.field6989 = this.field6989;
            arg5.field6948 = this.field6948;
        }
        if (class648.method3599(false, arg3, this.field7037)) {
            arg5.field7011 = arg2.field7011;
            if (arg1) {
                arg5.field7036 = (byte) (arg5.field7036 | 0x8);
            }
            arg5.field7011.field1981 = this.field7011.field1981;
            arg5.field7011.field1979 = this.field7011.field1979;
        } else if (class227.method1394(arg3, -1, this.field7037)) {
            arg5.field7011 = this.field7011;
        } else {
            arg5.field7011 = null;
        }
        if (class524.method2990(arg3, this.field7037, (byte) 79)) {
            if (arg2.field7045 == null || this.field6975 > arg2.field7045.length) {
                int var21 = this.field6975;
                arg5.field6964 = arg2.field6964 = new short[var21];
                arg5.field7046 = arg2.field7046 = new short[var21];
                arg5.field7045 = arg2.field7045 = new short[var21];
            } else {
                arg5.field6964 = arg2.field6964;
                arg5.field7045 = arg2.field7045;
                arg5.field7046 = arg2.field7046;
            }
            for (int var22 = 0; var22 < this.field6975; var22++) {
                arg5.field7045[var22] = this.field7045[var22];
                arg5.field6964[var22] = this.field6964[var22];
                arg5.field7046[var22] = this.field7046[var22];
            }
        } else {
            arg5.field7046 = this.field7046;
            arg5.field7045 = this.field7045;
            arg5.field6964 = this.field6964;
        }
        if (class68.method408(this.field7037, (byte) 41, arg3)) {
            arg5.field6995 = arg2.field6995;
            if (arg1) {
                arg5.field7036 = (byte) (arg5.field7036 | 0x10);
            }
            arg5.field6995.field2626 = this.field6995.field2626;
        } else if (class227.method1390(arg3, (byte) -127, this.field7037)) {
            arg5.field6995 = this.field6995;
        } else {
            arg5.field6995 = null;
        }
        if (class582.method3266(this.field7037, -1, arg3)) {
            if (arg2.field6980 == null || this.field6975 > arg2.field6980.length) {
                int var23 = this.field6975;
                arg5.field6980 = arg2.field6980 = new short[var23];
            } else {
                arg5.field6980 = arg2.field6980;
            }
            for (int var24 = 0; var24 < this.field6975; var24++) {
                arg5.field6980[var24] = this.field6980[var24];
            }
        } else {
            arg5.field6980 = this.field6980;
        }
        if (!class123.method753(this.field7037, -18310, arg3)) {
            arg5.field7010 = this.field7010;
        } else if (arg2.field7010 == null || this.field7049 > arg2.field7010.length) {
            int var26 = this.field7049;
            arg5.field7010 = arg2.field7010 = new class614[var26];
            for (int var27 = 0; var27 < this.field7049; var27++) {
                arg5.field7010[var27] = this.field7010[var27].method3378(0);
            }
        } else {
            arg5.field7010 = arg2.field7010;
            for (int var25 = 0; var25 < this.field7049; var25++) {
                arg5.field7010[var25].method3375(128, this.field7010[var25]);
            }
        }
        arg5.field6956 = this.field6956;
        arg5.field6999 = this.field6999;
        arg5.field6950 = this.field6950;
        arg5.field6992 = this.field6992;
        arg5.field6969 = this.field6969;
        arg5.field6942 = this.field6942;
        arg5.field7026 = this.field7026;
        arg5.field6991 = this.field6991;
        arg5.field7001 = this.field7001;
        if (this.field6984) {
            arg5.field7008 = this.field7008;
            arg5.field7025 = this.field7025;
            arg5.field6997 = this.field6997;
            arg5.field7015 = this.field7015;
            arg5.field7042 = this.field7042;
            arg5.field6944 = this.field6944;
            arg5.field6984 = true;
            arg5.field7012 = this.field7012;
        } else {
            arg5.field6984 = false;
        }
        arg5.field6958 = this.field6958;
        arg5.field7004 = this.field7004;
        return arg5;
    }

    @OriginalMember(owner = "client!eca", name = "OA", descriptor = "(IILd;Ld;III)V", line = 468)
    public final void method674(int arg0, int arg1, class176 arg2, class176 arg3, int arg4, int arg5, int arg6) {
        field7020++;
        if (!this.field6984) {
            this.method2917(70);
        }
        int var8 = this.field7008 + arg4;
        int var9 = this.field7015 + arg4;
        int var10 = this.field7012 + arg6;
        int var11 = this.field6944 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field2214 <= (arg2.field2210 + var9 >> arg2.field2212) || var10 < 0 || arg2.field2210 + var11 >> arg2.field2212 >= arg2.field2215) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field2214 <= (var9 + arg3.field2210 >> arg3.field2212) || var10 < 0 || (arg3.field2210 + var11 >> arg3.field2212) >= arg3.field2215) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field2212;
            int var13 = arg2.field2210 + var9 - 1 >> arg2.field2212;
            int var14 = var10 >> arg2.field2212;
            int var15 = -(-arg2.field2210 - var11) - 1 >> arg2.field2212;
            if (arg2.method150(var12, var14) == arg5 && arg5 == arg2.method150(var13, var14) && arg2.method150(var12, var15) == arg5 && arg5 == arg2.method150(var13, var15)) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field6955; var16++) {
                this.field7019[var16] = this.field7019[var16] + arg2.method159(this.field7024[var16] + arg4, this.field7016[var16] + arg6) - arg5;
            }
        } else if (arg0 == 2) {
            short var30 = this.field7042;
            if (var30 == 0) {
                return;
            }
            for (int var31 = 0; var31 < this.field6955; var31++) {
                int var32 = (this.field7019[var31] << 16) / var30;
                if (var32 < arg1) {
                    this.field7019[var31] += (arg2.method159(this.field7024[var31] + arg4, this.field7016[var31] + arg6) - arg5) * (arg1 - var32) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var17 = (arg1 & 0xFF) * 4;
            int var18 = (arg1 >> 8 & 0xFF) * 4;
            int var19 = (arg1 >> 16 & 0xFF) << 6;
            int var20 = arg1 >> 24 & 0xFF << 6;
            if (arg4 - (var17 >> 1) < 0 || ((var17 >> 1) + arg4 + arg2.field2210) >= (arg2.field2214 << arg2.field2212) || arg6 - (var18 >> 1) < 0 || (arg6 - (-(var18 >> 1) - arg2.field2210)) >= (arg2.field2215 << arg2.field2212)) {
                return;
            }
            this.method3435(var17, var20, var18, (byte) -48, arg4, var19, arg5, arg6, arg2);
        } else if (arg0 == 4) {
            int var21 = this.field7025 - this.field7042;
            for (int var22 = 0; var22 < this.field6955; var22++) {
                this.field7019[var22] = this.field7019[var22] + arg3.method159(this.field7024[var22] + arg4, this.field7016[var22] + arg6) + var21 - arg5;
            }
        } else if (arg0 == 5) {
            int var23 = this.field7025 - this.field7042;
            for (int var24 = 0; var24 < this.field6955; var24++) {
                int var25 = this.field7024[var24] + arg4;
                int var26 = this.field7016[var24] + arg6;
                int var27 = arg2.method159(var25, var26);
                int var28 = arg3.method159(var25, var26);
                int var29 = var27 - var28 - arg1;
                this.field7019[var24] = ((this.field7019[var24] << 8) / var23 * var29 >> 8) + (var27 - arg5);
            }
        }
        this.field6984 = false;
        if (this.field7034 != null) {
            this.field7034.field1981 = null;
        }
    }

    @OriginalMember(owner = "client!eca", name = "F", descriptor = "()I", line = 620)
    public final int method684() {
        field6959++;
        return this.field7031;
    }

    @OriginalMember(owner = "client!eca", name = "LA", descriptor = "()I", line = 634)
    public final int method679() {
        field7047++;
        if (!this.field6984) {
            this.method2917(48);
        }
        return this.field7012;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(B)V", line = 646)
    private final void method2914(byte arg0) {
        field6947++;
        if (arg0 != 79) {
            this.field7025 = -47;
        }
        if (this.field7001 == null) {
            return;
        }
        class367 var2 = this.field7027.field8937;
        float var3 = this.field7027.method3514();
        float var4 = this.field7027.method3562();
        this.field7027.method3486(arg0 ^ 0x92A6C507);
        this.field7027.method1798(false);
        this.field7027.method3520((byte) -123, false);
        this.field7027.method3567(null, 0, this.field7027.field9063, this.field7027.field9059, null);
        for (int var5 = 0; var5 < this.field7049; var5++) {
            class638 var6 = this.field7001[var5];
            class614 var7 = this.field7010[var5];
            if (!var6.field8712 || !this.field7027.method811()) {
                float var8 = (float) (this.field7024[var6.field8707] - (-this.field7024[var6.field8715] - this.field7024[var6.field8714])) * 0.3333333F;
                float var9 = (float) (this.field7019[var6.field8715] + this.field7019[var6.field8707] + this.field7019[var6.field8714]) * 0.3333333F;
                float var10 = (float) (this.field7016[var6.field8715] + this.field7016[var6.field8707] + this.field7016[var6.field8714]) * 0.3333333F;
                float var11 = class662.field9391 * var10 + class626.field8523 * var9 + class461.field6285 * var8 + class251.field3385;
                float var12 = class641.field8759 * var10 + class640.field8731 * var9 + class438.field6055 * var8 + class537.field7372;
                float var13 = class625.field8499 * var10 + class596.field8166 * var9 + class484.field6546 * var8 + class548.field7493;
                var2.method2258((byte) 124, var6.field8705 * var7.field8384 >> 7, (float) var7.field8387 + var11, (float) var7.field8379 + -var12, -var13, var6.field8710 * var7.field8381 >> 7, var7.field8386);
                this.field7027.method3552(var2, (byte) -117);
                this.field7027.method1957(var4, var3 - (float) var6.field8708 * 1.5F);
                int var14 = var7.field8385;
                OpenGL.glColor4ub((byte) (var14 >> 16), (byte) (var14 >> 8), (byte) var14, (byte) (var14 >> 24));
                this.field7027.method3530(var6.field8711, arg0 ^ 0xFFFFFFFE);
                this.field7027.method3547(var6.field8709, true);
                this.field7027.method3507(0, 4, 0, 7);
            }
        }
        this.field7027.method1957(var4, var3);
        this.field7027.method1798(true);
        this.field7027.method3502(452832144);
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIII)V", line = 711)
    public final void method678(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field6975; var5++) {
            int var9 = this.field7039[var5] & 0xFFFF;
            int var10 = var9 >> 10 & 0x3F;
            int var11 = (var9 & 0x397) >> 7;
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            int var12 = var9 & 0x7F;
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field7039[var5] = (short) class288.method1722(var12, class288.method1722(var11 << 7, var10 << 10));
        }
        field6993++;
        if (this.field7001 != null) {
            for (int var6 = 0; var6 < this.field7049; var6++) {
                class638 var7 = this.field7001[var6];
                class614 var8 = this.field7010[var6];
                var8.field8385 = class91.field1112[this.field7039[var7.field8713] & 0xFFFF] & 0xFFFFFF | var8.field8385 & 0xFF000000;
            }
        }
        if (this.field7014 != null) {
            this.field7014.field1981 = null;
        }
    }

    @OriginalMember(owner = "client!eca", name = "da", descriptor = "(I[IIIIZI[I)V", line = 770)
    public final void method701(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field6986++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg4 << 4;
            int var11 = arg3 << 4;
            int var12 = arg2 << 4;
            class49.field659 = 0;
            int var13 = 0;
            class659.field9297 = 0;
            class356.field5174 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (this.field6991.length > var15) {
                    int[] var16 = this.field6991[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field6950 == null || (this.field6950[var18] & arg6) != 0) {
                            class356.field5174 += this.field7024[var18];
                            class659.field9297 += this.field7019[var18];
                            class49.field659 += this.field7016[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 <= 0) {
                class356.field5174 = var12;
                class49.field659 = var10;
                class659.field9297 = var11;
            } else {
                class659.field9297 = class659.field9297 / var13 + var11;
                class651.field9217 = true;
                class356.field5174 = class356.field5174 / var13 + var12;
                class49.field659 = class49.field659 / var13 + var10;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[1] * arg3 + arg7[0] * arg2 + (arg7[2] * arg4) + 8192 >> 14;
                int var20 = arg7[5] * arg4 + arg7[4] * arg3 + arg7[3] * arg2 + 8192 >> 14;
                int var21 = arg7[8] * arg4 + arg7[7] * arg3 + arg7[6] * arg2 + 8192 >> 14;
                arg4 = var21;
                arg2 = var19;
                arg3 = var20;
            }
            int var22 = arg2 << 4;
            int var23 = arg3 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field6991.length) {
                    int[] var27 = this.field6991[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field6950 == null || (arg6 & this.field6950[var29]) != 0) {
                            this.field7024[var29] += var22;
                            this.field7019[var29] += var23;
                            this.field7016[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var109 = arg1[var90];
                    if (this.field6991.length > var109) {
                        int[] var110 = this.field6991[var109];
                        for (int var111 = 0; var111 < var110.length; var111++) {
                            int var112 = var110[var111];
                            if (this.field6950 == null || (this.field6950[var112] & arg6) != 0) {
                                this.field7024[var112] -= class356.field5174;
                                this.field7019[var112] -= class659.field9297;
                                this.field7016[var112] -= class49.field659;
                                if (arg4 != 0) {
                                    int var113 = class654.field9259[arg4];
                                    int var114 = class654.field9260[arg4];
                                    int var115 = this.field7024[var112] * var114 + this.field7019[var112] * var113 + 16383 >> 14;
                                    this.field7019[var112] = this.field7019[var112] * var114 + 16383 - (this.field7024[var112] * var113) >> 14;
                                    this.field7024[var112] = var115;
                                }
                                if (arg2 != 0) {
                                    int var116 = class654.field9259[arg2];
                                    int var117 = class654.field9260[arg2];
                                    int var118 = this.field7019[var112] * var117 + 16383 - (this.field7016[var112] * var116) >> 14;
                                    this.field7016[var112] = this.field7019[var112] * var116 + (this.field7016[var112] * var117) + 16383 >> 14;
                                    this.field7019[var112] = var118;
                                }
                                if (arg3 != 0) {
                                    int var119 = class654.field9259[arg3];
                                    int var120 = class654.field9260[arg3];
                                    int var121 = this.field7016[var112] * var119 + (this.field7024[var112] * var120) + 16383 >> 14;
                                    this.field7016[var112] = this.field7016[var112] * var120 + 16383 - (this.field7024[var112] * var119) >> 14;
                                    this.field7024[var112] = var121;
                                }
                                this.field7024[var112] += class356.field5174;
                                this.field7019[var112] += class659.field9297;
                                this.field7016[var112] += class49.field659;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var91 = 0; var91 < var9; var91++) {
                        int var92 = arg1[var91];
                        if (var92 < this.field6991.length) {
                            int[] var93 = this.field6991[var92];
                            for (int var94 = 0; var94 < var93.length; var94++) {
                                int var95 = var93[var94];
                                if (this.field6950 == null || (this.field6950[var95] & arg6) != 0) {
                                    int var96 = this.field6992[var95];
                                    int var97 = this.field6992[var95 + 1];
                                    for (int var98 = var96; var98 < var97; var98++) {
                                        int var99 = this.field6999[var98] - 1;
                                        if (var99 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var100 = class654.field9259[arg4];
                                            int var101 = class654.field9260[arg4];
                                            int var102 = this.field6971[var99] * var100 + (this.field7005[var99] * var101) + 16383 >> 14;
                                            this.field6971[var99] = (short) (this.field6971[var99] * var101 + 16383 - (this.field7005[var99] * var100) >> 14);
                                            this.field7005[var99] = (short) var102;
                                        }
                                        if (arg2 != 0) {
                                            int var103 = class654.field9259[arg2];
                                            int var104 = class654.field9260[arg2];
                                            int var105 = this.field6971[var99] * var104 - (this.field6967[var99] * var103 - 16383) >> 14;
                                            this.field6967[var99] = (short) (this.field6971[var99] * var103 + this.field6967[var99] * var104 + 16383 >> 14);
                                            this.field6971[var99] = (short) var105;
                                        }
                                        if (arg3 != 0) {
                                            int var106 = class654.field9259[arg3];
                                            int var107 = class654.field9260[arg3];
                                            int var108 = this.field7005[var99] * var107 + this.field6967[var99] * var106 + 16383 >> 14;
                                            this.field6967[var99] = (short) (this.field6967[var99] * var107 + 16383 - (this.field7005[var99] * var106) >> 14);
                                            this.field7005[var99] = (short) var108;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field7029 == null && this.field7014 != null) {
                        this.field7014.field1981 = null;
                    }
                    if (this.field7029 != null) {
                        this.field7029.field1981 = null;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (class651.field9217) {
                    int var36 = arg7[6] * class49.field659 + arg7[3] * class659.field9297 + arg7[0] * class356.field5174 + 8192 >> 14;
                    int var37 = arg7[7] * class49.field659 + arg7[1] * class356.field5174 + (arg7[4] * class659.field9297 - -8192) >> 14;
                    int var38 = arg7[2] * class356.field5174 + 8192 - (-(arg7[5] * class659.field9297) - (arg7[8] * class49.field659)) >> 14;
                    int var39 = var33 + var36;
                    int var40 = var34 + var37;
                    class356.field5174 = var39;
                    class659.field9297 = var40;
                    int var41 = var35 + var38;
                    class651.field9217 = false;
                    class49.field659 = var41;
                }
                int[] var42 = new int[9];
                int var43 = class654.field9260[arg2];
                int var44 = class654.field9259[arg2];
                int var45 = class654.field9260[arg3];
                int var46 = class654.field9259[arg3];
                int var47 = class654.field9260[arg4];
                int var48 = class654.field9259[arg4];
                int var49 = var44 * var47 + 8192 >> 14;
                int var50 = var44 * var48 + 8192 >> 14;
                var42[3] = var43 * var48 + 8192 >> 14;
                var42[8] = var43 * var45 + 8192 >> 14;
                var42[2] = var43 * var46 + 8192 >> 14;
                var42[4] = var43 * var47 + 8192 >> 14;
                var42[7] = var45 * var49 + var46 * var48 + 8192 >> 14;
                var42[1] = -var45 * var48 + var46 * var49 + 8192 >> 14;
                var42[6] = -var46 * var47 + (var45 * var50) + 8192 >> 14;
                var42[5] = -var44;
                var42[0] = var45 * var47 + var46 * var50 + 8192 >> 14;
                int var51 = var42[2] * -class49.field659 + var42[0] * -class356.field5174 - (-(var42[1] * -class659.field9297) - 8192) >> 14;
                int var52 = var42[3] * -class356.field5174 + var42[5] * -class49.field659 + var42[4] * -class659.field9297 + 8192 >> 14;
                int var53 = var42[8] * -class49.field659 + (var42[6] * -class356.field5174 + (var42[7] * -class659.field9297)) + 8192 >> 14;
                int var54 = var51 + class356.field5174;
                int var55 = class659.field9297 + var52;
                int var56 = class49.field659 + var53;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var87 = 0; var87 < 3; var87++) {
                        int var88 = 0;
                        for (int var89 = 0; var89 < 3; var89++) {
                            var88 += var42[var58 * 3 + var89] * arg7[var87 * 3 + var89];
                        }
                        var57[var58 * 3 + var87] = var88 + 8192 >> 14;
                    }
                }
                int var59 = var42[1] * var34 + var42[2] * var35 + var42[0] * var33 + 8192 >> 14;
                int var60 = var42[5] * var35 + (var42[3] * var33 + (var42[4] * var34) + 8192) >> 14;
                int var61 = var55 + var60;
                int var62 = var42[8] * var35 + var42[6] * var33 - (-(var42[7] * var34) + -8192) >> 14;
                int var63 = var54 + var59;
                int var64 = var56 + var62;
                int[] var65 = new int[9];
                for (int var66 = 0; var66 < 3; var66++) {
                    for (int var84 = 0; var84 < 3; var84++) {
                        int var85 = 0;
                        for (int var86 = 0; var86 < 3; var86++) {
                            var85 += arg7[var66 * 3 + var86] * var57[var86 * 3 + var84];
                        }
                        var65[var66 * 3 + var84] = var85 + 8192 >> 14;
                    }
                }
                int var67 = arg7[0] * var63 + arg7[1] * var61 + (arg7[2] * var64) + 8192 >> 14;
                int var68 = arg7[4] * var61 + arg7[5] * var64 + arg7[3] * var63 + 8192 >> 14;
                int var69 = var31 + var68;
                int var70 = arg7[6] * var63 + (arg7[7] * var61) + (arg7[8] * var64 - -8192) >> 14;
                int var71 = var30 + var67;
                int var72 = var32 + var70;
                for (int var73 = 0; var73 < var9; var73++) {
                    int var74 = arg1[var73];
                    if (this.field6991.length > var74) {
                        int[] var75 = this.field6991[var74];
                        for (int var76 = 0; var76 < var75.length; var76++) {
                            int var77 = var75[var76];
                            if (this.field6950 == null || (arg6 & this.field6950[var77]) != 0) {
                                int var78 = this.field7024[var77] * var65[0] + this.field7016[var77] * var65[2] - (-(this.field7019[var77] * var65[1]) + -8192) >> 14;
                                int var79 = this.field7016[var77] * var65[5] + (this.field7024[var77] * var65[3] - (-(this.field7019[var77] * var65[4]) - 8192)) >> 14;
                                int var80 = var71 + var78;
                                int var81 = this.field7016[var77] * var65[8] + this.field7019[var77] * var65[7] + (this.field7024[var77] * var65[6] - -8192) >> 14;
                                int var82 = var69 + var79;
                                this.field7024[var77] = var80;
                                int var83 = var72 + var81;
                                this.field7019[var77] = var82;
                                this.field7016[var77] = var83;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var122 = 0; var122 < var9; var122++) {
                    int var123 = arg1[var122];
                    if (this.field6991.length > var123) {
                        int[] var124 = this.field6991[var123];
                        for (int var125 = 0; var125 < var124.length; var125++) {
                            int var126 = var124[var125];
                            if (this.field6950 == null || (arg6 & this.field6950[var126]) != 0) {
                                this.field7024[var126] -= class356.field5174;
                                this.field7019[var126] -= class659.field9297;
                                this.field7016[var126] -= class49.field659;
                                this.field7024[var126] = this.field7024[var126] * arg2 >> 7;
                                this.field7019[var126] = this.field7019[var126] * arg3 >> 7;
                                this.field7016[var126] = this.field7016[var126] * arg4 >> 7;
                                this.field7024[var126] += class356.field5174;
                                this.field7019[var126] += class659.field9297;
                                this.field7016[var126] += class49.field659;
                            }
                        }
                    }
                }
            } else {
                int var127 = arg7[9] << 4;
                int var128 = arg7[10] << 4;
                int var129 = arg7[11] << 4;
                int var130 = arg7[12] << 4;
                int var131 = arg7[13] << 4;
                int var132 = arg7[14] << 4;
                if (class651.field9217) {
                    int var133 = arg7[0] * class356.field5174 + arg7[3] * class659.field9297 + (arg7[6] * class49.field659) + 8192 >> 14;
                    int var134 = arg7[1] * class356.field5174 + arg7[4] * class659.field9297 + arg7[7] * class49.field659 + 8192 >> 14;
                    int var135 = var131 + var134;
                    int var136 = var130 + var133;
                    int var137 = arg7[8] * class49.field659 + (arg7[2] * class356.field5174 + (arg7[5] * class659.field9297)) + 8192 >> 14;
                    class356.field5174 = var136;
                    int var138 = var132 + var137;
                    class659.field9297 = var135;
                    class49.field659 = var138;
                    class651.field9217 = false;
                }
                int var139 = arg2 << 15 >> 7;
                int var140 = arg3 << 15 >> 7;
                int var141 = arg4 << 15 >> 7;
                int var142 = -class356.field5174 * var139 + 8192 >> 14;
                int var143 = -class659.field9297 * var140 + 8192 >> 14;
                int var144 = -class49.field659 * var141 + 8192 >> 14;
                int var145 = class356.field5174 + var142;
                int var146 = class659.field9297 + var143;
                int var147 = class49.field659 + var144;
                int[] var148 = new int[] { arg7[0] * var139 + 8192 >> 14, arg7[3] * var139 + 8192 >> 14, arg7[6] * var139 + 8192 >> 14, arg7[1] * var140 + 8192 >> 14, arg7[4] * var140 + 8192 >> 14, arg7[7] * var140 + 8192 >> 14, arg7[2] * var141 + 8192 >> 14, arg7[5] * var141 + 8192 >> 14, arg7[8] * var141 + 8192 >> 14 };
                int var149 = var130 * var139 + 8192 >> 14;
                int var150 = var131 * var140 + 8192 >> 14;
                int var151 = var132 * var141 + 8192 >> 14;
                int var152 = var146 + var150;
                int var153 = var145 + var149;
                int var154 = var147 + var151;
                int[] var155 = new int[9];
                for (int var156 = 0; var156 < 3; var156++) {
                    for (int var174 = 0; var174 < 3; var174++) {
                        int var175 = 0;
                        for (int var176 = 0; var176 < 3; var176++) {
                            var175 += var148[var174 + (var176 * 3)] * arg7[var156 * 3 + var176];
                        }
                        var155[var156 * 3 + var174] = var175 + 8192 >> 14;
                    }
                }
                int var157 = arg7[2] * var154 + arg7[1] * var152 + arg7[0] * var153 + 8192 >> 14;
                int var158 = arg7[5] * var154 + arg7[3] * var153 + arg7[4] * var152 + 8192 >> 14;
                int var159 = arg7[6] * var153 + 8192 - (-(arg7[7] * var152) - arg7[8] * var154) >> 14;
                int var160 = var128 + var158;
                int var161 = var127 + var157;
                int var162 = var129 + var159;
                for (int var163 = 0; var163 < var9; var163++) {
                    int var164 = arg1[var163];
                    if (this.field6991.length > var164) {
                        int[] var165 = this.field6991[var164];
                        for (int var166 = 0; var166 < var165.length; var166++) {
                            int var167 = var165[var166];
                            if (this.field6950 == null || (this.field6950[var167] & arg6) != 0) {
                                int var168 = this.field7024[var167] * var155[0] + this.field7016[var167] * var155[2] + this.field7019[var167] * var155[1] + 8192 >> 14;
                                int var169 = this.field7019[var167] * var155[4] + this.field7024[var167] * var155[3] + this.field7016[var167] * var155[5] + 8192 >> 14;
                                int var170 = var160 + var169;
                                int var171 = var161 + var168;
                                int var172 = this.field7016[var167] * var155[8] + this.field7024[var167] * var155[6] + this.field7019[var167] * var155[7] + 8192 >> 14;
                                int var173 = var162 + var172;
                                this.field7024[var167] = var171;
                                this.field7019[var167] = var170;
                                this.field7016[var167] = var173;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field6956 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (var181 < this.field6956.length) {
                        int[] var182 = this.field6956[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field6958 == null || (this.field6958[var184] & arg6) != 0) {
                                int var185 = (this.field6982[var184] & 0xFF) + (arg2 * 8);
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field6982[var184] = (byte) var185;
                                if (this.field7014 != null) {
                                    this.field7014.field1981 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field7001 != null) {
                    for (int var178 = 0; var178 < this.field7049; var178++) {
                        class638 var179 = this.field7001[var178];
                        class614 var180 = this.field7010[var178];
                        var180.field8385 = var180.field8385 & 0xFFFFFF | 255 - (this.field6982[var179.field8713] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field6956 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (var190 < this.field6956.length) {
                        int[] var191 = this.field6956[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field6958 == null || (this.field6958[var193] & arg6) != 0) {
                                int var194 = this.field7039[var193] & 0xFFFF;
                                int var195 = (var194 & 0xFCD1) >> 10;
                                int var196 = (var194 & 0x3E8) >> 7;
                                int var197 = var194 & 0x7F;
                                int var198 = arg2 + var195 & 0x3F;
                                int var199 = arg3 / 4 + var196;
                                if (var199 < 0) {
                                    var199 = 0;
                                } else if (var199 > 7) {
                                    var199 = 7;
                                }
                                int var200 = arg4 + var197;
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field7039[var193] = (short) class288.method1722(var200, class288.method1722(var199 << 7, var198 << 10));
                                if (this.field7014 != null) {
                                    this.field7014.field1981 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field7001 != null) {
                    for (int var187 = 0; var187 < this.field7049; var187++) {
                        class638 var188 = this.field7001[var187];
                        class614 var189 = this.field7010[var187];
                        var189.field8385 = class91.field1112[this.field7039[var188.field8713] & 0xFFFF] & 0xFFFFFF | var189.field8385 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field6942 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (this.field6942.length > var202) {
                        int[] var203 = this.field6942[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class614 var205 = this.field7010[var203[var204]];
                            var205.field8379 += arg3;
                            var205.field8387 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field6942 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (var207 < this.field6942.length) {
                        int[] var208 = this.field6942[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class614 var210 = this.field7010[var208[var209]];
                            var210.field8381 = var210.field8381 * arg2 >> 7;
                            var210.field8384 = var210.field8384 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field6942 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (this.field6942.length > var212) {
                    int[] var213 = this.field6942[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class614 var215 = this.field7010[var213[var214]];
                        var215.field8386 = var215.field8386 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eca", name = "UA", descriptor = "(SS)V", line = 1764)
    public final void method668(short arg0, short arg1) {
        field6968++;
        for (int var3 = 0; var3 < this.field6975; var3++) {
            if (this.field7039[var3] == arg0) {
                this.field7039[var3] = arg1;
            }
        }
        if (this.field7001 != null) {
            for (int var4 = 0; var4 < this.field7049; var4++) {
                class638 var5 = this.field7001[var4];
                class614 var6 = this.field7010[var4];
                var6.field8385 = var6.field8385 & 0xFF000000 | class91.field1112[this.field7039[var5.field8713] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field7014 != null) {
            this.field7014.field1981 = null;
        }
    }

    @OriginalMember(owner = "client!eca", name = "h", descriptor = "()I", line = 1818)
    public final int method688() {
        field6978++;
        return this.field6952;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(I)V", line = 1827)
    private final void method2915(int arg0) {
        field6965++;
        if (this.field6970 == 0) {
            return;
        }
        int var2 = -70 / ((arg0 + 13) / 57);
        if (this.field7036 != 0) {
            this.method2923(-2, true);
        }
        this.method2923(-2, false);
        if (this.field6995 != null) {
            if (this.field6995.field2626 == null) {
                this.method2916(-1694, ~(this.field7036 & 0x10) != -1);
            }
            if (this.field6995.field2626 != null) {
                this.field7027.method3520((byte) 33, this.field7029 != null);
                this.field7027.method3567(this.field7029, 0, this.field7011, this.field7034, this.field7014);
                int var3 = this.field7026.length - 1;
                for (int var4 = 0; var4 < var3; var4++) {
                    int var5 = this.field7026[var4];
                    int var6 = this.field7026[var4 + 1];
                    int var7 = this.field6980[var5] & 0xFFFF;
                    if (var7 == 65535) {
                        var7 = -1;
                    }
                    this.field7027.method3532(this.field7029 != null, var7, 1);
                    this.field7027.method3497(110, (var6 - var5) * 3, 4, var5 * 3, this.field6995.field2626);
                }
            }
        }
        this.method2918((byte) -46);
    }

    @OriginalMember(owner = "client!eca", name = "V", descriptor = "(I)V", line = 1883)
    public final void method680(int arg0) {
        field6979++;
        int var2 = class654.field9259[arg0];
        int var3 = class654.field9260[arg0];
        for (int var4 = 0; var4 < this.field6955; var4++) {
            int var7 = this.field7016[var4] * var2 + (this.field7024[var4] * var3) >> 14;
            this.field7016[var4] = this.field7016[var4] * var3 - this.field7024[var4] * var2 >> 14;
            this.field7024[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field6976; var5++) {
            int var6 = this.field7005[var5] * var3 + this.field6967[var5] * var2 >> 14;
            this.field6967[var5] = (short) (this.field6967[var5] * var3 - (this.field7005[var5] * var2) >> 14);
            this.field7005[var5] = (short) var6;
        }
        if (this.field7029 == null && this.field7014 != null) {
            this.field7014.field1981 = null;
        }
        if (this.field7029 != null) {
            this.field7029.field1981 = null;
        }
        this.field6984 = false;
        if (this.field7034 != null) {
            this.field7034.field1981 = null;
        }
    }

    @OriginalMember(owner = "client!eca", name = "E", descriptor = "(I[IIIIIZ)V", line = 1933)
    public final void method640(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field6998++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg2 << 4;
            int var10 = arg4 << 4;
            int var11 = arg3 << 4;
            class49.field659 = 0;
            int var12 = 0;
            class659.field9297 = 0;
            class356.field5174 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (this.field6991.length > var14) {
                    int[] var15 = this.field6991[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class356.field5174 += this.field7024[var17];
                        class659.field9297 += this.field7019[var17];
                        var12++;
                        class49.field659 += this.field7016[var17];
                    }
                }
            }
            if (var12 <= 0) {
                class659.field9297 = var11;
                class49.field659 = var10;
                class356.field5174 = var9;
            } else {
                class659.field9297 = class659.field9297 / var12 + var11;
                class49.field659 = class49.field659 / var12 + var10;
                class356.field5174 = class356.field5174 / var12 + var9;
            }
        } else if (arg0 == 1) {
            int var18 = arg2 << 4;
            int var19 = arg4 << 4;
            int var20 = arg3 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (this.field6991.length > var22) {
                    int[] var23 = this.field6991[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field7024[var25] += var18;
                        this.field7019[var25] += var20;
                        this.field7016[var25] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (var45 < this.field6991.length) {
                    int[] var46 = this.field6991[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field7024[var59] -= class356.field5174;
                            this.field7019[var59] -= class659.field9297;
                            this.field7016[var59] -= class49.field659;
                            if (arg4 != 0) {
                                int var60 = class654.field9259[arg4];
                                int var61 = class654.field9260[arg4];
                                int var62 = this.field7024[var59] * var61 + this.field7019[var59] * var60 + 16383 >> 14;
                                this.field7019[var59] = this.field7019[var59] * var61 + 16383 - (this.field7024[var59] * var60) >> 14;
                                this.field7024[var59] = var62;
                            }
                            if (arg2 != 0) {
                                int var63 = class654.field9259[arg2];
                                int var64 = class654.field9260[arg2];
                                int var65 = this.field7019[var59] * var64 + 16383 - (this.field7016[var59] * var63) >> 14;
                                this.field7016[var59] = this.field7019[var59] * var63 + this.field7016[var59] * var64 + 16383 >> 14;
                                this.field7019[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class654.field9259[arg3];
                                int var67 = class654.field9260[arg3];
                                int var68 = this.field7024[var59] * var67 + (this.field7016[var59] * var66 + 16383) >> 14;
                                this.field7016[var59] = this.field7016[var59] * var67 + 16383 - this.field7024[var59] * var66 >> 14;
                                this.field7024[var59] = var68;
                            }
                            this.field7024[var59] += class356.field5174;
                            this.field7019[var59] += class659.field9297;
                            this.field7016[var59] += class49.field659;
                        }
                    } else {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field7024[var48] -= class356.field5174;
                            this.field7019[var48] -= class659.field9297;
                            this.field7016[var48] -= class49.field659;
                            if (arg2 != 0) {
                                int var49 = class654.field9259[arg2];
                                int var50 = class654.field9260[arg2];
                                int var51 = this.field7019[var48] * var50 + 16383 - (this.field7016[var48] * var49) >> 14;
                                this.field7016[var48] = this.field7019[var48] * var49 + this.field7016[var48] * var50 + 16383 >> 14;
                                this.field7019[var48] = var51;
                            }
                            if (arg4 != 0) {
                                int var52 = class654.field9259[arg4];
                                int var53 = class654.field9260[arg4];
                                int var54 = this.field7019[var48] * var52 + (this.field7024[var48] * var53) + 16383 >> 14;
                                this.field7019[var48] = this.field7019[var48] * var53 + 16383 - (this.field7024[var48] * var52) >> 14;
                                this.field7024[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class654.field9259[arg3];
                                int var56 = class654.field9260[arg3];
                                int var57 = this.field7016[var48] * var55 + (this.field7024[var48] * var56 + 16383) >> 14;
                                this.field7016[var48] = this.field7016[var48] * var56 + 16383 - (this.field7024[var48] * var55) >> 14;
                                this.field7024[var48] = var57;
                            }
                            this.field7024[var48] += class356.field5174;
                            this.field7019[var48] += class659.field9297;
                            this.field7016[var48] += class49.field659;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field6991.length) {
                        int[] var29 = this.field6991[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field6992[var31];
                            int var33 = this.field6992[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field6999[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class654.field9259[arg4];
                                    int var37 = class654.field9260[arg4];
                                    int var38 = this.field7005[var35] * var37 + this.field6971[var35] * var36 + 16383 >> 14;
                                    this.field6971[var35] = (short) (this.field6971[var35] * var37 + 16383 - (this.field7005[var35] * var36) >> 14);
                                    this.field7005[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class654.field9259[arg2];
                                    int var40 = class654.field9260[arg2];
                                    int var41 = this.field6971[var35] * var40 + 16383 - (this.field6967[var35] * var39) >> 14;
                                    this.field6967[var35] = (short) (this.field6967[var35] * var40 + this.field6971[var35] * var39 + 16383 >> 14);
                                    this.field6971[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class654.field9259[arg3];
                                    int var43 = class654.field9260[arg3];
                                    int var44 = this.field6967[var35] * var42 + this.field7005[var35] * var43 + 16383 >> 14;
                                    this.field6967[var35] = (short) (this.field6967[var35] * var43 + 16383 - (this.field7005[var35] * var42) >> 14);
                                    this.field7005[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field7029 == null && this.field7014 != null) {
                    this.field7014.field1981 = null;
                }
                if (this.field7029 != null) {
                    this.field7029.field1981 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field6991.length) {
                    int[] var71 = this.field6991[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field7024[var73] -= class356.field5174;
                        this.field7019[var73] -= class659.field9297;
                        this.field7016[var73] -= class49.field659;
                        this.field7024[var73] = this.field7024[var73] * arg2 >> 7;
                        this.field7019[var73] = this.field7019[var73] * arg3 >> 7;
                        this.field7016[var73] = this.field7016[var73] * arg4 >> 7;
                        this.field7024[var73] += class356.field5174;
                        this.field7019[var73] += class659.field9297;
                        this.field7016[var73] += class49.field659;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field6956 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (this.field6956.length > var78) {
                        int[] var79 = this.field6956[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field6982[var81] & 0xFF) + (arg2 * 8);
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field6982[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field7014 != null) {
                            this.field7014.field1981 = null;
                        }
                    }
                }
                if (this.field7001 != null) {
                    for (int var75 = 0; var75 < this.field7049; var75++) {
                        class638 var76 = this.field7001[var75];
                        class614 var77 = this.field7010[var75];
                        var77.field8385 = 255 - (this.field6982[var76.field8713] & 0xFF) << 24 | var77.field8385 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field6956 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (var87 < this.field6956.length) {
                        int[] var88 = this.field6956[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field7039[var90] & 0xFFFF;
                            int var92 = (var91 & 0xFF85) >> 10;
                            int var93 = (var91 & 0x397) >> 7;
                            int var94 = var91 & 0x7F;
                            int var95 = var92 + arg2 & 0x3F;
                            int var96 = arg3 / 4 + var93;
                            int var97 = arg4 + var94;
                            if (var96 < 0) {
                                var96 = 0;
                            } else if (var96 > 7) {
                                var96 = 7;
                            }
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field7039[var90] = (short) class288.method1722(class288.method1722(var95 << 10, var96 << 7), var97);
                        }
                        if (var88.length > 0 && this.field7014 != null) {
                            this.field7014.field1981 = null;
                        }
                    }
                }
                if (this.field7001 != null) {
                    for (int var84 = 0; var84 < this.field7049; var84++) {
                        class638 var85 = this.field7001[var84];
                        class614 var86 = this.field7010[var84];
                        var86.field8385 = var86.field8385 & 0xFF000000 | class91.field1112[this.field7039[var85.field8713] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field6942 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (this.field6942.length > var99) {
                        int[] var100 = this.field6942[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class614 var102 = this.field7010[var100[var101]];
                            var102.field8387 += arg2;
                            var102.field8379 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field6942 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (var104 < this.field6942.length) {
                        int[] var105 = this.field6942[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class614 var107 = this.field7010[var105[var106]];
                            var107.field8384 = var107.field8384 * arg3 >> 7;
                            var107.field8381 = var107.field8381 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field6942 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (this.field6942.length > var109) {
                    int[] var110 = this.field6942[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class614 var112 = this.field7010[var110[var111]];
                        var112.field8386 = var112.field8386 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lq;Lqn;I)V", line = 2586)
    public final void method665(class111 arg0, class455 arg1, int arg2) {
        field7007++;
        if (this.field6976 == 0) {
            return;
        }
        class367 var4 = this.field7027.field9011;
        if (!this.field6984) {
            this.method2917(115);
        }
        class367 var5 = (class367) arg0;
        class548.field7493 = var4.field5267 * var5.field5279 + var4.field5270 * var5.field5269 + var4.field5258 * var5.field5259 + var4.field5279;
        class596.field8166 = var4.field5267 * var5.field5258 + var4.field5270 * var5.field5276 + var4.field5258 * var5.field5264;
        float var6 = (float) this.field7042 * class596.field8166 + class548.field7493;
        float var7 = (float) this.field7025 * class596.field8166 + class548.field7493;
        float var8;
        float var9;
        if ((var7 < var6)) {
            var9 = (float) this.field6997 + var6;
            var8 = var7 - (float) this.field6997;
        } else {
            var8 = var6 - (float) this.field6997;
            var9 = (float) this.field6997 + var7;
        }
        if ((this.field7027.field8981 <= var8) || (var9 <= (float) this.field7027.field9051)) {
            return;
        }
        class626.field8523 = var4.field5262 * var5.field5258 + var4.field5286 * var5.field5276 + var4.field5276 * var5.field5264;
        class251.field3385 = var4.field5262 * var5.field5279 + var4.field5286 * var5.field5269 + var4.field5276 * var5.field5259 + var4.field5269;
        float var10 = (float) this.field7042 * class626.field8523 + class251.field3385;
        float var11 = (float) this.field7025 * class626.field8523 + class251.field3385;
        float var12;
        float var13;
        if (var11 < var10) {
            var12 = ((float) this.field6997 + var10) * (float) this.field7027.field9001;
            var13 = ((float) (-this.field6997) + var11) * (float) this.field7027.field9001;
        } else {
            var13 = (var10 - (float) this.field6997) * (float) this.field7027.field9001;
            var12 = ((float) this.field6997 + var11) * (float) this.field7027.field9001;
        }
        if ((var13 / var9 >= this.field7027.field9067) || (var12 / var9 <= this.field7027.field9072)) {
            return;
        }
        class537.field7372 = var4.field5266 * var5.field5279 + var4.field5291 * var5.field5269 + var4.field5264 * var5.field5259 + var4.field5259;
        class640.field8731 = var4.field5266 * var5.field5258 + var4.field5291 * var5.field5276 + var4.field5264 * var5.field5264;
        float var14 = (float) this.field7042 * class640.field8731 + class537.field7372;
        float var15 = (float) this.field7025 * class640.field8731 + class537.field7372;
        float var16;
        float var17;
        if ((var14 > var15)) {
            var17 = (var15 - (float) this.field6997) * (float) this.field7027.field9037;
            var16 = ((float) this.field6997 + var14) * (float) this.field7027.field9037;
        } else {
            var16 = ((float) this.field6997 + var15) * (float) this.field7027.field9037;
            var17 = (var14 - (float) this.field6997) * (float) this.field7027.field9037;
        }
        if ((this.field7027.field9021 <= var17 / var9) || (var16 / var9 <= this.field7027.field9002)) {
            return;
        }
        if (arg1 != null || this.field7001 != null) {
            class662.field9391 = var4.field5262 * var5.field5267 + var4.field5286 * var5.field5262 + var4.field5276 * var5.field5266;
            class484.field6546 = var4.field5267 * var5.field5270 + var4.field5270 * var5.field5286 + var4.field5258 * var5.field5291;
            class438.field6055 = var4.field5266 * var5.field5270 + var4.field5291 * var5.field5286 + var4.field5264 * var5.field5291;
            class461.field6285 = var4.field5262 * var5.field5270 + var4.field5286 * var5.field5286 + var4.field5276 * var5.field5291;
            class641.field8759 = var4.field5266 * var5.field5267 + var4.field5291 * var5.field5262 + var4.field5264 * var5.field5266;
            class625.field8499 = var4.field5267 * var5.field5267 + var4.field5270 * var5.field5262 + var4.field5258 * var5.field5266;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field7015 + this.field7008 >> 1;
            int var21 = this.field7012 + this.field6944 >> 1;
            int var22 = (int) ((float) var21 * class662.field9391 + (float) this.field7042 * class626.field8523 + (float) var20 * class461.field6285 + class251.field3385);
            int var23 = (int) ((float) var21 * class641.field8759 + (float) this.field7042 * class640.field8731 + (float) var20 * class438.field6055 + class537.field7372);
            int var24 = (int) ((float) var21 * class625.field8499 + (float) this.field7042 * class596.field8166 + (float) var20 * class484.field6546 + class548.field7493);
            if (var24 < this.field7027.field9051) {
                var18 = true;
            } else {
                arg1.field6204 = this.field7027.field9070 + (this.field7027.field9001 * var22 / var24);
                arg1.field6203 = this.field7027.field9037 * var23 / var24 + this.field7027.field9080;
            }
            int var25 = (int) ((float) var21 * class662.field9391 + (float) this.field7025 * class626.field8523 + (float) var20 * class461.field6285 + class251.field3385);
            int var26 = (int) ((float) var21 * class641.field8759 + (float) this.field7025 * class640.field8731 + (float) var20 * class438.field6055 + class537.field7372);
            int var27 = (int) ((float) var21 * class625.field8499 + (float) this.field7025 * class596.field8166 + (float) var20 * class484.field6546 + class548.field7493);
            if (this.field7027.field9051 > var27) {
                var18 = true;
            } else {
                arg1.field6206 = this.field7027.field9001 * var25 / var27 + this.field7027.field9070;
                arg1.field6201 = this.field7027.field9037 * var26 / var27 + this.field7027.field9080;
            }
            if (var18) {
                if (var24 < this.field7027.field9051 && var27 < this.field7027.field9051) {
                    var19 = false;
                } else if (var24 < this.field7027.field9051) {
                    int var28 = (var27 - this.field7027.field9051 << 16) / (var27 - var24);
                    int var29 = ((var25 - var22) * var28 >> 16) + var25;
                    arg1.field6204 = this.field7027.field9070 + (this.field7027.field9001 * var29 / this.field7027.field9051);
                    int var30 = ((var26 - var23) * var28 >> 16) + var26;
                    arg1.field6203 = this.field7027.field9037 * var30 / this.field7027.field9051 + this.field7027.field9080;
                } else if (var27 < this.field7027.field9051) {
                    int var31 = (var24 - this.field7027.field9051 << 16) / (var24 - var27);
                    int var32 = ((var22 - var25) * var31 >> 16) + var22;
                    arg1.field6204 = this.field7027.field9001 * var32 / this.field7027.field9051 + this.field7027.field9070;
                    int var33 = ((var23 - var26) * var31 >> 16) + var23;
                    arg1.field6203 = this.field7027.field9037 * var33 / this.field7027.field9051 + this.field7027.field9080;
                }
            }
            if (var19) {
                arg1.field6202 = true;
                if (var27 >= var24) {
                    arg1.field6205 = (this.field6997 + var25) * this.field7027.field9001 / var27 + this.field7027.field9070 - arg1.field6206;
                } else {
                    arg1.field6205 = (this.field6997 + var22) * this.field7027.field9001 / var24 + this.field7027.field9070 - arg1.field6204;
                }
            }
        }
        this.field7027.method3533((byte) 112);
        this.field7027.method3508((byte) -110, var5);
        this.method2915(75);
        this.field7027.method3502(452832144);
        this.method2914((byte) 79);
    }

    @OriginalMember(owner = "client!eca", name = "ZA", descriptor = "()I", line = 2792)
    public final int method683() {
        if (!this.field6984) {
            this.method2917(102);
        }
        field7000++;
        return this.field6997;
    }

    @OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lpea;)V", line = 5077)
    public class514(class641 arg0) {
        this.field7027 = arg0;
        this.field7034 = new class158(null, 5126, 3, 0);
        this.field7011 = new class158(null, 5126, 2, 0);
        this.field7029 = new class158(null, 5126, 3, 0);
        this.field7014 = new class158(null, 5121, 4, 0);
        this.field6995 = new class199();
    }

    @OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lpea;Lrf;IIII)V", line = 5614)
    public class514(class641 arg0, class238 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6952 = arg2;
        this.field7027 = arg0;
        this.field7037 = arg5;
        if (class297.method1775(arg5, arg2, (byte) -109)) {
            this.field7034 = new class158(null, 5126, 3, 0);
        }
        if (class227.method1394(arg2, -1, arg5)) {
            this.field7011 = new class158(null, 5126, 2, 0);
        }
        if (class495.method2794(arg5, 4965, arg2)) {
            this.field7029 = new class158(null, 5126, 3, 0);
        }
        if (class91.method505(arg2, (byte) 112, arg5)) {
            this.field7014 = new class158(null, 5121, 4, 0);
        }
        if (class227.method1390(arg2, (byte) -69, arg5)) {
            this.field6995 = new class199();
        }
        class479 var7 = arg0.field9731;
        this.field6992 = new int[arg1.field3117 + 1];
        int[] var8 = new int[arg1.field3107];
        for (int var9 = 0; var9 < arg1.field3107; var9++) {
            if ((arg1.field3089 == null || arg1.field3089[var9] != 2) && (arg1.field3138 == null || arg1.field3138[var9] == -1 || !var7.method1728(-100, arg1.field3138[var9] & 0xFFFF).field7865)) {
                var8[this.field6975++] = var9;
                this.field6992[arg1.field3090[var9]]++;
                this.field6992[arg1.field3115[var9]]++;
                this.field6992[arg1.field3106[var9]]++;
            }
        }
        this.field6970 = this.field6975;
        long[] var10 = new long[this.field6975];
        boolean var11 = (this.field6952 & 0x100) != 0;
        label501: for (int var12 = 0; var12 < this.field6975; var12++) {
            int var180 = var8[var12];
            class568 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field3125 != null) {
                for (int var186 = 0; var186 < arg1.field3125.length; var186++) {
                    class552 var187 = arg1.field3125[var186];
                    if (var187.field7558 == var180) {
                        class77 var188 = class266.method1640(var187.field7553, (byte) 122);
                        if (var188.field964) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field6970--;
                            continue label501;
                        }
                    }
                }
            }
            short var189 = -1;
            if (arg1.field3138 != null) {
                var189 = arg1.field3138[var180];
                if (var189 != -1) {
                    var181 = var7.method1728(-102, var189 & 0xFFFF);
                    var184 = var181.field7870;
                    var185 = var181.field7866;
                }
            }
            boolean var190 = arg1.field3121 != null && arg1.field3121[var180] != 0 || var181 != null && !var181.field7864 | var181.field7868;
            if ((var11 || var190) && arg1.field3100 != null) {
                var182 += arg1.field3100[var180] << 17;
            }
            if (var190) {
                var182 += 65536;
            }
            int var191 = ((var184 & 0xFF) << 8) + var182;
            int var192 = ((var189 & 0xFFFF) << 16) + var183;
            int var193 = (var185 & 0xFF) + var191;
            int var194 = (var12 & 0xFFFF) + var192;
            var10[var12] = ((long) var193 << 32) + (long) var194;
        }
        class204.method1278(var10, var8, (byte) -109);
        this.field6950 = arg1.field3133;
        this.field7024 = arg1.field3134;
        this.field6977 = arg1.field3140;
        this.field6955 = arg1.field3117;
        this.field7019 = arg1.field3101;
        this.field7016 = arg1.field3103;
        class180[] var13 = new class180[this.field6955];
        this.field7004 = arg1.field3139;
        this.field6969 = arg1.field3135;
        if (arg1.field3125 != null) {
            this.field7049 = arg1.field3125.length;
            this.field7010 = new class614[this.field7049];
            this.field7001 = new class638[this.field7049];
            for (int var14 = 0; var14 < this.field7049; var14++) {
                class552 var15 = arg1.field3125[var14];
                class77 var16 = class266.method1640(var15.field7553, (byte) 84);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field6975; var18++) {
                    if (var8[var18] == var15.field7558) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class91.field1112[arg1.field3116[var15.field7558] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field3121 == null ? 0 : arg1.field3121[var15.field7558]) << 24;
                this.field7001[var14] = new class638(var17, arg1.field3090[var15.field7558], arg1.field3115[var15.field7558], arg1.field3106[var15.field7558], var16.field958, var16.field959, var16.field967, var16.field957, var16.field956, var16.field964, var16.field966, var15.field7556);
                this.field7010[var14] = new class614(var20);
            }
        }
        int var21 = this.field6975 * 3;
        this.field7045 = new short[this.field6975];
        this.field6948 = new float[var21];
        this.field7023 = new byte[var21];
        this.field6967 = new short[var21];
        this.field6964 = new short[this.field6975];
        this.field6980 = new short[this.field6975];
        this.field7005 = new short[var21];
        this.field7046 = new short[this.field6975];
        class274.field3708 = new long[var21];
        this.field7031 = (short) arg4;
        this.field6999 = new short[var21];
        this.field7044 = (short) arg3;
        this.field6971 = new short[var21];
        this.field6982 = new byte[this.field6975];
        if (arg1.field3122 != null) {
            this.field6958 = new short[this.field6975];
        }
        this.field7039 = new short[this.field6975];
        this.field6989 = new float[var21];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field3117; var23++) {
            int var179 = this.field6992[var23];
            this.field6992[var23] = var22;
            var13[var23] = new class180();
            var22 += var179;
        }
        this.field6992[arg1.field3117] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field3129 != null) {
            int var28 = arg1.field3095;
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            int[] var32 = new int[var28];
            int[] var33 = new int[var28];
            int[] var34 = new int[var28];
            for (int var35 = 0; var35 < var28; var35++) {
                var29[var35] = Integer.MAX_VALUE;
                var30[var35] = -2147483647;
                var31[var35] = Integer.MAX_VALUE;
                var32[var35] = -2147483647;
                var33[var35] = Integer.MAX_VALUE;
                var34[var35] = -2147483647;
            }
            for (int var36 = 0; var36 < this.field6975; var36++) {
                int var43 = var8[var36];
                if (arg1.field3129[var43] != -1) {
                    int var44 = arg1.field3129[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field3090[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field3115[var43];
                        } else {
                            var46 = arg1.field3106[var43];
                        }
                        int var47 = arg1.field3134[var46];
                        int var48 = arg1.field3101[var46];
                        int var49 = arg1.field3103[var46];
                        if (var29[var44] > var47) {
                            var29[var44] = var47;
                        }
                        if (var47 > var30[var44]) {
                            var30[var44] = var47;
                        }
                        if (var31[var44] > var48) {
                            var31[var44] = var48;
                        }
                        if (var32[var44] < var48) {
                            var32[var44] = var48;
                        }
                        if (var49 < var33[var44]) {
                            var33[var44] = var49;
                        }
                        if (var49 > var34[var44]) {
                            var34[var44] = var49;
                        }
                    }
                }
            }
            var24 = new int[var28];
            var25 = new int[var28];
            var27 = new float[var28][];
            var26 = new int[var28];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field3097[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var39;
                    float var40;
                    float var41;
                    if (var38 == 1) {
                        int var42 = arg1.field3119[var37];
                        if (var42 == 0) {
                            var39 = 1.0F;
                            var40 = 1.0F;
                        } else if (var42 > 0) {
                            var39 = 1.0F;
                            var40 = (float) var42 / 1024.0F;
                        } else {
                            var40 = 1.0F;
                            var39 = (float) (-var42) / 1024.0F;
                        }
                        var41 = 64.0F / (float) arg1.field3127[var37];
                    } else if (var38 == 2) {
                        var39 = 64.0F / (float) arg1.field3119[var37];
                        var40 = 64.0F / (float) arg1.field3104[var37];
                        var41 = 64.0F / (float) arg1.field3127[var37];
                    } else {
                        var39 = (float) arg1.field3119[var37] / 1024.0F;
                        var40 = (float) arg1.field3104[var37] / 1024.0F;
                        var41 = (float) arg1.field3127[var37] / 1024.0F;
                    }
                    var27[var37] = class476.method2665(var41, 5, var40, arg1.field3092[var37], var39, class230.method1424(255, arg1.field3096[var37]), arg1.field3128[var37], arg1.field3091[var37]);
                }
            }
        }
        class274[] var50 = new class274[arg1.field3107];
        for (int var51 = 0; var51 < arg1.field3107; var51++) {
            short var158 = arg1.field3090[var51];
            short var159 = arg1.field3115[var51];
            short var160 = arg1.field3106[var51];
            int var161 = this.field7024[var159] - this.field7024[var158];
            int var162 = this.field7019[var159] - this.field7019[var158];
            int var163 = this.field7016[var159] - this.field7016[var158];
            int var164 = this.field7024[var160] - this.field7024[var158];
            int var165 = this.field7019[var160] - this.field7019[var158];
            int var166 = this.field7016[var160] - this.field7016[var158];
            int var167 = var162 * var166 - var163 * var165;
            int var168 = var163 * var164 - (var161 * var166);
            int var169 = var161 * var165 - var162 * var164;
            while (var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192) {
                var167 >>= 0x1;
                var169 >>= 0x1;
                var168 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var169 * var169 + (var167 * var167 + (var168 * var168))));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var167 * 256 / var170;
            int var172 = var168 * 256 / var170;
            int var173 = var169 * 256 / var170;
            byte var174 = arg1.field3089 == null ? 0 : arg1.field3089[var51];
            if (var174 == 0) {
                class180 var176 = var13[var158];
                var176.field2248++;
                var176.field2245 += var172;
                var176.field2244 += var173;
                var176.field2243 += var171;
                class180 var177 = var13[var159];
                var177.field2248++;
                var177.field2244 += var173;
                var177.field2243 += var171;
                var177.field2245 += var172;
                class180 var178 = var13[var160];
                var178.field2245 += var172;
                var178.field2244 += var173;
                var178.field2243 += var171;
                var178.field2248++;
            } else if (var174 == 1) {
                class274 var175 = var50[var51] = new class274();
                var175.field3713 = var172;
                var175.field3709 = var173;
                var175.field3714 = var171;
            }
        }
        for (int var52 = 0; var52 < this.field6975; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field3116[var68] & 0xFFFF;
            short var70;
            if (arg1.field3138 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field3138[var68];
            }
            int var71;
            if (arg1.field3129 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field3129[var68];
            }
            int var72;
            if (arg1.field3121 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field3121[var68] & 0xFF;
            }
            float var73 = 0.0F;
            float var74 = 0.0F;
            float var75 = 0.0F;
            float var76 = 0.0F;
            float var77 = 0.0F;
            float var78 = 0.0F;
            byte var79 = 0;
            byte var80 = 0;
            int var81 = 0;
            if (var70 != -1) {
                if (var71 == -1) {
                    var77 = 0.0F;
                    var73 = 0.0F;
                    var76 = 1.0F;
                    var74 = 1.0F;
                    var78 = 0.0F;
                    var80 = 2;
                    var79 = 1;
                    var75 = 1.0F;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field3097[var71];
                    if (var82 == 0) {
                        short var83 = arg1.field3090[var68];
                        short var84 = arg1.field3115[var68];
                        short var85 = arg1.field3106[var68];
                        short var86 = arg1.field3091[var71];
                        short var87 = arg1.field3128[var71];
                        short var88 = arg1.field3092[var71];
                        float var89 = (float) arg1.field3134[var86];
                        float var90 = (float) arg1.field3101[var86];
                        float var91 = (float) arg1.field3103[var86];
                        float var92 = (float) arg1.field3134[var87] - var89;
                        float var93 = (float) arg1.field3101[var87] - var90;
                        float var94 = (float) arg1.field3103[var87] - var91;
                        float var95 = (float) arg1.field3134[var88] - var89;
                        float var96 = (float) arg1.field3101[var88] - var90;
                        float var97 = (float) arg1.field3103[var88] - var91;
                        float var98 = (float) arg1.field3134[var83] - var89;
                        float var99 = (float) arg1.field3101[var83] - var90;
                        float var100 = (float) arg1.field3103[var83] - var91;
                        float var101 = (float) arg1.field3134[var84] - var89;
                        float var102 = (float) arg1.field3101[var84] - var90;
                        float var103 = (float) arg1.field3103[var84] - var91;
                        float var104 = (float) arg1.field3134[var85] - var89;
                        float var105 = (float) arg1.field3101[var85] - var90;
                        float var106 = (float) arg1.field3103[var85] - var91;
                        float var107 = var93 * var97 - (var94 * var96);
                        float var108 = var94 * var95 - (var92 * var97);
                        float var109 = var92 * var96 - (var93 * var95);
                        float var110 = var96 * var109 - (var97 * var108);
                        float var111 = var97 * var107 - var95 * var109;
                        float var112 = var95 * var108 - (var96 * var107);
                        float var113 = 1.0F / (var94 * var112 + var92 * var110 + var93 * var111);
                        var73 = (var100 * var112 + var98 * var110 + var99 * var111) * var113;
                        var75 = (var103 * var112 + var101 * var110 + var102 * var111) * var113;
                        var77 = (var106 * var112 + var104 * var110 + var105 * var111) * var113;
                        float var114 = var92 * var108 - (var93 * var107);
                        float var115 = var94 * var107 - var92 * var109;
                        float var116 = var93 * var109 - var94 * var108;
                        float var117 = 1.0F / (var97 * var114 + var95 * var116 + var96 * var115);
                        var74 = (var100 * var114 + var98 * var116 + var99 * var115) * var117;
                        var78 = (var106 * var114 + var104 * var116 + var105 * var115) * var117;
                        var76 = (var103 * var114 + var101 * var116 + var102 * var115) * var117;
                    } else {
                        short var118 = arg1.field3090[var68];
                        short var119 = arg1.field3115[var68];
                        short var120 = arg1.field3106[var68];
                        int var121 = var24[var71];
                        int var122 = var25[var71];
                        int var123 = var26[var71];
                        float[] var124 = var27[var71];
                        byte var125 = arg1.field3131[var71];
                        float var126 = (float) arg1.field3105[var71] / 256.0F;
                        if (var82 == 1) {
                            float var127 = (float) arg1.field3104[var71] / 1024.0F;
                            class347.method2174(var127, arg1.field3134[var118], var123, var122, 4825, var121, arg1.field3103[var118], arg1.field3101[var118], var124, var126, var125);
                            var74 = class353.field5157;
                            var73 = class680.field9670;
                            class347.method2174(var127, arg1.field3134[var119], var123, var122, 4825, var121, arg1.field3103[var119], arg1.field3101[var119], var124, var126, var125);
                            var75 = class680.field9670;
                            var76 = class353.field5157;
                            class347.method2174(var127, arg1.field3134[var120], var123, var122, 4825, var121, arg1.field3103[var120], arg1.field3101[var120], var124, var126, var125);
                            var78 = class353.field5157;
                            var77 = class680.field9670;
                            float var128 = var127 / 2.0F;
                            if ((var125 & 0x1) == 0) {
                                if (var128 < var77 - var73) {
                                    var80 = 1;
                                    var77 -= var127;
                                } else if (var73 - var77 > var128) {
                                    var80 = 2;
                                    var77 += var127;
                                }
                                if ((var128 < var75 - var73)) {
                                    var79 = 1;
                                    var75 -= var127;
                                } else if (var128 < var73 - var75) {
                                    var75 += var127;
                                    var79 = 2;
                                }
                            } else {
                                if (var76 - var74 > var128) {
                                    var76 -= var127;
                                    var79 = 1;
                                } else if (var74 - var76 > var128) {
                                    var76 += var127;
                                    var79 = 2;
                                }
                                if ((var78 - var74 > var128)) {
                                    var80 = 1;
                                    var78 -= var127;
                                } else if (var74 - var78 > var128) {
                                    var78 += var127;
                                    var80 = 2;
                                }
                            }
                        } else if (var82 == 2) {
                            float var129 = (float) arg1.field3143[var71] / 256.0F;
                            float var130 = (float) arg1.field3102[var71] / 256.0F;
                            int var131 = arg1.field3134[var119] - arg1.field3134[var118];
                            int var132 = arg1.field3101[var119] - arg1.field3101[var118];
                            int var133 = arg1.field3103[var119] - arg1.field3103[var118];
                            int var134 = arg1.field3134[var120] - arg1.field3134[var118];
                            int var135 = arg1.field3101[var120] - arg1.field3101[var118];
                            int var136 = arg1.field3103[var120] - arg1.field3103[var118];
                            int var137 = var132 * var136 - var133 * var135;
                            int var138 = var133 * var134 - var131 * var136;
                            int var139 = var131 * var135 - (var132 * var134);
                            float var140 = 64.0F / (float) arg1.field3119[var71];
                            float var141 = 64.0F / (float) arg1.field3127[var71];
                            float var142 = 64.0F / (float) arg1.field3104[var71];
                            float var143 = (var124[2] * (float) var139 + var124[0] * (float) var137 + var124[1] * (float) var138) / var140;
                            float var144 = (var124[5] * (float) var139 + var124[4] * (float) var138 + var124[3] * (float) var137) / var141;
                            float var145 = (var124[8] * (float) var139 + var124[7] * (float) var138 + var124[6] * (float) var137) / var142;
                            var81 = class445.method2555((byte) -32, var143, var144, var145);
                            class138.method902(var126, var129, 0, arg1.field3134[var118], var124, var121, var130, var122, var123, arg1.field3103[var118], var81, var125, arg1.field3101[var118]);
                            var73 = class674.field9550;
                            var74 = class111.field1337;
                            class138.method902(var126, var129, 0, arg1.field3134[var119], var124, var121, var130, var122, var123, arg1.field3103[var119], var81, var125, arg1.field3101[var119]);
                            var75 = class674.field9550;
                            var76 = class111.field1337;
                            class138.method902(var126, var129, 0, arg1.field3134[var120], var124, var121, var130, var122, var123, arg1.field3103[var120], var81, var125, arg1.field3101[var120]);
                            var78 = class111.field1337;
                            var77 = class674.field9550;
                        } else if (var82 == 3) {
                            class147.method995(arg1.field3101[var118], var122, (byte) 62, arg1.field3134[var118], var121, var124, var125, arg1.field3103[var118], var126, var123);
                            var74 = class2.field9;
                            var73 = class381.field5482;
                            class147.method995(arg1.field3101[var119], var122, (byte) 62, arg1.field3134[var119], var121, var124, var125, arg1.field3103[var119], var126, var123);
                            var75 = class381.field5482;
                            var76 = class2.field9;
                            class147.method995(arg1.field3101[var120], var122, (byte) 62, arg1.field3134[var120], var121, var124, var125, arg1.field3103[var120], var126, var123);
                            var78 = class2.field9;
                            var77 = class381.field5482;
                            if ((var125 & 0x1) == 0) {
                                if (var75 - var73 > 0.5F) {
                                    var79 = 1;
                                    var75--;
                                } else if (var73 - var75 > 0.5F) {
                                    var75++;
                                    var79 = 2;
                                }
                                if ((var77 - var73 > 0.5F)) {
                                    var77--;
                                    var80 = 1;
                                } else if (var73 - var77 > 0.5F) {
                                    var80 = 2;
                                    var77++;
                                }
                            } else {
                                if (var78 - var74 > 0.5F) {
                                    var80 = 1;
                                    var78--;
                                } else if (var74 - var78 > 0.5F) {
                                    var80 = 2;
                                    var78++;
                                }
                                if (var76 - var74 > 0.5F) {
                                    var79 = 1;
                                    var76--;
                                } else if (var74 - var76 > 0.5F) {
                                    var76++;
                                    var79 = 2;
                                }
                            }
                        }
                    }
                }
            }
            byte var146;
            if (arg1.field3089 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field3089[var68];
            }
            if (var146 == 0) {
                long var147 = ((long) (var69 << 8) + (long) (var81 << 24) + (long) var72 << 32) + (long) (var71 << 2);
                short var149 = arg1.field3090[var68];
                short var150 = arg1.field3115[var68];
                short var151 = arg1.field3106[var68];
                class180 var152 = var13[var149];
                this.field7045[var52] = this.method2920(var147, var152.field2244, var74, (byte) -27, var152.field2248, var152.field2243, arg1, var149, var152.field2245, var73);
                class180 var153 = var13[var150];
                this.field6964[var52] = this.method2920((long) var79 + var147, var153.field2244, var76, (byte) -27, var153.field2248, var153.field2243, arg1, var150, var153.field2245, var75);
                class180 var154 = var13[var151];
                this.field7046[var52] = this.method2920((long) var80 + var147, var154.field2244, var78, (byte) -27, var154.field2248, var154.field2243, arg1, var151, var154.field2245, var77);
            } else if (var146 == 1) {
                class274 var155 = var50[var68];
                long var156 = (long) ((var155.field3713 + 256 << 12) + (var155.field3709 + 256 << 22) + (var155.field3714 <= 0 ? 2048 : 1024) + (var71 << 2)) + ((long) (var69 << 8) + (long) var72 + (long) (var81 << 24) << 32);
                this.field7045[var52] = this.method2920(var156, var155.field3709, var74, (byte) -27, 0, var155.field3714, arg1, arg1.field3090[var68], var155.field3713, var73);
                this.field6964[var52] = this.method2920((long) var79 + var156, var155.field3709, var76, (byte) -27, 0, var155.field3714, arg1, arg1.field3115[var68], var155.field3713, var75);
                this.field7046[var52] = this.method2920((long) var80 + var156, var155.field3709, var78, (byte) -27, 0, var155.field3714, arg1, arg1.field3106[var68], var155.field3713, var77);
            }
            if (arg1.field3138 == null) {
                this.field6980[var52] = -1;
            } else {
                this.field6980[var52] = arg1.field3138[var68];
            }
            if (arg1.field3121 != null) {
                this.field6982[var52] = arg1.field3121[var68];
            }
            if (arg1.field3122 != null) {
                this.field6958[var52] = arg1.field3122[var68];
            }
            this.field7039[var52] = arg1.field3116[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field6970; var55++) {
            short var67 = this.field6980[var55];
            if (var54 != var67) {
                var54 = var67;
                var53++;
            }
        }
        this.field7026 = new int[var53 + 1];
        int var56 = 0;
        short var57 = -10000;
        for (int var58 = 0; var58 < this.field6970; var58++) {
            short var66 = this.field6980[var58];
            if (var57 != var66) {
                var57 = var66;
                this.field7026[var56++] = var58;
            }
        }
        this.field7026[var56] = this.field6970;
        class274.field3708 = null;
        this.field7005 = class484.method2700(17064, this.field6976, this.field7005);
        this.field6971 = class484.method2700(17064, this.field6976, this.field6971);
        this.field6967 = class484.method2700(17064, this.field6976, this.field6967);
        this.field7023 = class353.method2202(this.field7023, this.field6976, -109);
        this.field6948 = class176.method1165(0, this.field6976, this.field6948);
        this.field6989 = class176.method1165(0, this.field6976, this.field6989);
        if (arg1.field3110 != null && class147.method998(this.field7037, arg2, true)) {
            this.field6991 = arg1.method1470(-109, false);
        }
        if (arg1.field3125 != null && class524.method2988(this.field7037, arg2, -29)) {
            this.field6942 = arg1.method1479(1);
        }
        if (arg1.field3113 != null && class217.method1342(this.field7037, arg2, 384)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field6975; var61++) {
                int var65 = arg1.field3113[var8[var61]];
                if (var65 >= 0) {
                    if (var65 > var59) {
                        var59 = var65;
                    }
                    int var10002 = var60[var65]++;
                }
            }
            this.field6956 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field6956[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field6975; var63++) {
                int var64 = arg1.field3113[var8[var63]];
                if (var64 >= 0) {
                    this.field6956[var64][var60[var64]++] = var63;
                }
            }
        }
    }

    @OriginalMember(owner = "client!eca", name = "Z", descriptor = "(Lw;)Lw;", line = 2808)
    public final class451 method692(class451 arg0) {
        field6987++;
        if (this.field6976 == 0) {
            return null;
        }
        if (!this.field6984) {
            this.method2917(92);
        }
        int var2;
        int var3;
        if (this.field7027.field9016 > 0) {
            var2 = this.field7008 - (this.field7027.field9016 * this.field7025 >> 8) >> this.field7027.field8939;
            var3 = this.field7015 - (this.field7027.field9016 * this.field7042 >> 8) >> this.field7027.field8939;
        } else {
            var2 = this.field7008 - (this.field7027.field9016 * this.field7042 >> 8) >> this.field7027.field8939;
            var3 = this.field7015 - (this.field7027.field9016 * this.field7025 >> 8) >> this.field7027.field8939;
        }
        int var4;
        int var5;
        if (this.field7027.field8971 <= 0) {
            var4 = this.field7012 - (this.field7027.field8971 * this.field7042 >> 8) >> this.field7027.field8939;
            var5 = this.field6944 - (this.field7027.field8971 * this.field7025 >> 8) >> this.field7027.field8939;
        } else {
            var4 = this.field7012 - (this.field7027.field8971 * this.field7025 >> 8) >> this.field7027.field8939;
            var5 = this.field6944 - (this.field7027.field8971 * this.field7042 >> 8) >> this.field7027.field8939;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class441 var8 = (class441) arg0;
        class441 var9;
        if (var8 != null && var8.method2532(var6, 127, var7)) {
            var9 = var8;
            var8.method2531(-830803984);
        } else {
            var9 = new class441(this.field7027, var6, var7);
        }
        var9.method2527(var4, var3, 112, var2, var5);
        this.method2921(true, var9);
        return var9;
    }

    @OriginalMember(owner = "client!eca", name = "Q", descriptor = "()Z", line = 2871)
    public final boolean method671() {
        field7009++;
        if (this.field6991 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field6977; var1++) {
            this.field7024[var1] <<= 0x4;
            this.field7019[var1] <<= 0x4;
            this.field7016[var1] <<= 0x4;
        }
        class659.field9297 = 0;
        class49.field659 = 0;
        class356.field5174 = 0;
        return true;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(IZ)V", line = 2899)
    private final void method2916(int arg0, boolean arg1) {
        if ((this.field6970 * 6) <= this.field7027.field9078.field1712.length) {
            this.field7027.field9078.field1745 = 0;
        } else {
            this.field7027.field9078 = new class457(this.field6970 * 6 + 600);
        }
        field6953++;
        class457 var3 = this.field7027.field9078;
        if (this.field7027.field8968) {
            for (int var4 = 0; var4 < this.field6970; var4++) {
                var3.method915(this.field7045[var4], 1502242504);
                var3.method915(this.field6964[var4], 1502242504);
                var3.method915(this.field7046[var4], 1502242504);
            }
        } else {
            for (int var5 = 0; var5 < this.field6970; var5++) {
                var3.method954(this.field7045[var5], -72);
                var3.method954(this.field6964[var5], -61);
                var3.method954(this.field7046[var5], -60);
            }
        }
        if (var3.field1745 == 0) {
            return;
        }
        if (arg1) {
            if (this.field7035 == null) {
                this.field7035 = this.field7027.method3498(var3.field1745, true, var3.field1712, 5123, arg0 - 22008);
            } else {
                this.field7035.method1109(var3.field1712, 5123, 49, var3.field1745);
            }
            this.field6995.field2626 = this.field7035;
        } else {
            this.field6995.field2626 = this.field7027.method3498(var3.field1745, false, var3.field1712, 5123, -23702);
        }
        if (!arg1) {
            this.field6954 = true;
        }
        if (arg0 != -1694) {
            this.field7034 = null;
        }
    }

    @OriginalMember(owner = "client!eca", name = "DA", descriptor = "()I", line = 2969)
    public final int method686() {
        if (!this.field6984) {
            this.method2917(99);
        }
        field7032++;
        return this.field7042;
    }

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "(I)V", line = 2982)
    private final void method2917(int arg0) {
        field6960++;
        if (arg0 <= 3) {
            field7006 = 58;
        }
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field6955; var10++) {
            int var11 = this.field7024[var10];
            int var12 = this.field7019[var10];
            if (var5 < var11) {
                var5 = var11;
            }
            if (var2 > var11) {
                var2 = var11;
            }
            int var13 = this.field7016[var10];
            if (var12 > var6) {
                var6 = var12;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var13 > var7) {
                var7 = var13;
            }
            if (var4 > var13) {
                var4 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var14 > var8) {
                var8 = var14;
            }
            int var15 = var11 * var11 + var12 * var12 + var13 * var13;
            if (var9 < var15) {
                var9 = var15;
            }
        }
        this.field7012 = (short) var4;
        this.field7015 = (short) var5;
        this.field7042 = (short) var3;
        this.field7008 = (short) var2;
        this.field7025 = (short) var6;
        this.field6944 = (short) var7;
        this.field6997 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        Math.sqrt((double) var9);
        this.field6984 = true;
    }

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "(B)V", line = 3067)
    private final void method2918(byte arg0) {
        field7030++;
        if (!this.field6954) {
            return;
        }
        this.field6954 = false;
        if (this.field6969 == null && this.field7004 == null && this.field7001 == null) {
            if (this.field7024 != null && !class107.method577((byte) -60, this.field7037, this.field6952)) {
                if (this.field7034 != null && this.field7034.field1981 == null) {
                    this.field6954 = true;
                } else {
                    if (!this.field6984) {
                        this.method2917(96);
                    }
                    this.field7024 = null;
                }
            }
            if (this.field7019 != null && !class427.method2461(this.field7037, (byte) -127, this.field6952)) {
                if (this.field7034 != null && this.field7034.field1981 == null) {
                    this.field6954 = true;
                } else {
                    if (!this.field6984) {
                        this.method2917(85);
                    }
                    this.field7019 = null;
                }
            }
            if (this.field7016 != null && !class498.method2805(this.field6952, this.field7037, (byte) -46)) {
                if (this.field7034 != null && this.field7034.field1981 == null) {
                    this.field6954 = true;
                } else {
                    if (!this.field6984) {
                        this.method2917(57);
                    }
                    this.field7016 = null;
                }
            }
        }
        if (this.field6999 != null && this.field7024 == null && this.field7019 == null && this.field7016 == null) {
            this.field6999 = null;
            this.field6992 = null;
        }
        if (this.field7023 != null && !class631.method3445(this.field7037, this.field6952, (byte) 84)) {
            if (this.field7029 == null) {
                if (this.field7014 != null && this.field7014.field1981 == null) {
                    this.field6954 = true;
                } else {
                    this.field7023 = null;
                    this.field7005 = this.field6971 = this.field6967 = null;
                }
            } else if (this.field7029.field1981 == null) {
                this.field6954 = true;
            } else {
                this.field7005 = this.field6971 = this.field6967 = null;
                this.field7023 = null;
            }
        }
        if (this.field7039 != null && !class227.method1393(this.field6952, this.field7037, arg0 + 110)) {
            if (this.field7014 != null && this.field7014.field1981 == null) {
                this.field6954 = true;
            } else {
                this.field7039 = null;
            }
        }
        if (this.field6982 != null && !class228.method1395(this.field7037, arg0 ^ 0xFFFFFFD2, this.field6952)) {
            if (this.field7014 != null && this.field7014.field1981 == null) {
                this.field6954 = true;
            } else {
                this.field6982 = null;
            }
        }
        if (this.field6948 != null && !class320.method2075(this.field7037, (byte) -113, this.field6952)) {
            if (this.field7011 != null && this.field7011.field1981 == null) {
                this.field6954 = true;
            } else {
                this.field6948 = this.field6989 = null;
            }
        }
        if (this.field6980 != null && !class489.method2720(this.field6952, 127, this.field7037)) {
            if (this.field7014 != null && this.field7014.field1981 == null) {
                this.field6954 = true;
            } else {
                this.field6980 = null;
            }
        }
        if (this.field7045 != null && !class158.method1055(this.field6952, this.field7037, (byte) -53)) {
            if ((this.field6995 == null || this.field6995.field2626 != null) && (this.field7014 == null || this.field7014.field1981 != null)) {
                this.field7045 = this.field6964 = this.field7046 = null;
            } else {
                this.field6954 = true;
            }
        }
        if (this.field6956 != null && !class217.method1342(this.field7037, this.field6952, 384)) {
            this.field6956 = null;
            this.field6958 = null;
        }
        if (arg0 != -46) {
            this.method665(null, null, -105);
        }
        if (this.field6991 != null && !class147.method998(this.field7037, this.field6952, true)) {
            this.field6991 = null;
            this.field6950 = null;
        }
        if (this.field6942 != null && !class524.method2988(this.field7037, this.field6952, -105)) {
            this.field6942 = null;
        }
        if (this.field7026 != null && (this.field6952 & 0x800) == 0 && (this.field6952 & 0x40000) == 0) {
            this.field7026 = null;
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIIBS)I", line = 3246)
    private final int method2919(int arg0, int arg1, int arg2, byte arg3, short arg4) {
        field6962++;
        int var6 = class91.field1112[class88.method494(arg2, arg1, -109)];
        if (arg0 != 16711935) {
            this.method694();
        }
        if (arg4 != -1) {
            class568 var7 = this.field7027.field9731.method1728(-123, arg4 & 0xFFFF);
            int var8 = var7.field7869 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg2 < 0) {
                    var9 = 0;
                } else if (arg2 > 127) {
                    var9 = 16777215;
                } else {
                    var9 = arg2 * 131586;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var9 & 0xFF00) * var8 + ((var6 & 0xFF00) * var11) & 0xFF0000) + ((var9 & 0xFF00FF) * var8 + ((var6 & 0xFF00FF) * var11) & 0xFF00FF00) >> 8;
                }
            }
            int var12 = var7.field7863 & 0xFF;
            if (var12 != 0) {
                var12 += 256;
                int var13 = ((var6 & 0xFF0000) >> 16) * var12;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (var6 >> 8 & 0xFF) * var12;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                int var15 = (var6 & 0xFF) * var12;
                if (var15 > 65535) {
                    var15 = 65535;
                }
                var6 = (var15 >> 8) + ((var13 & 0x3000FF00) << 8) + (var14 & 0xFF00);
            }
        }
        return (var6 << 8) + 255 - (arg3 & 0xFF);
    }

    @OriginalMember(owner = "client!eca", name = "ua", descriptor = "(IIII)V", line = 3321)
    public final void method639(int arg0, int arg1, int arg2, int arg3) {
        field6996++;
        if (arg0 == 0) {
            class659.field9297 = 0;
            int var5 = 0;
            class49.field659 = 0;
            class356.field5174 = 0;
            for (int var6 = 0; var6 < this.field6955; var6++) {
                class356.field5174 += this.field7024[var6];
                class659.field9297 += this.field7019[var6];
                var5++;
                class49.field659 += this.field7016[var6];
            }
            if (var5 > 0) {
                class356.field5174 = class356.field5174 / var5 + arg1;
                class659.field9297 = class659.field9297 / var5 + arg2;
                class49.field659 = class49.field659 / var5 + arg3;
            } else {
                class356.field5174 = arg1;
                class49.field659 = arg3;
                class659.field9297 = arg2;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field6955; var7++) {
                this.field7024[var7] += arg1;
                this.field7019[var7] += arg2;
                this.field7016[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field6955; var8++) {
                this.field7024[var8] -= class356.field5174;
                this.field7019[var8] -= class659.field9297;
                this.field7016[var8] -= class49.field659;
                if (arg3 != 0) {
                    int var9 = class654.field9259[arg3];
                    int var10 = class654.field9260[arg3];
                    int var11 = this.field7019[var8] * var9 + this.field7024[var8] * var10 + 16383 >> 14;
                    this.field7019[var8] = this.field7019[var8] * var10 + 16383 - (this.field7024[var8] * var9) >> 14;
                    this.field7024[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class654.field9259[arg1];
                    int var13 = class654.field9260[arg1];
                    int var14 = this.field7019[var8] * var13 - (this.field7016[var8] * var12 - 16383) >> 14;
                    this.field7016[var8] = this.field7019[var8] * var12 + this.field7016[var8] * var13 + 16383 >> 14;
                    this.field7019[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class654.field9259[arg2];
                    int var16 = class654.field9260[arg2];
                    int var17 = this.field7016[var8] * var15 + (this.field7024[var8] * var16) + 16383 >> 14;
                    this.field7016[var8] = this.field7016[var8] * var16 - (this.field7024[var8] * var15 - 16383) >> 14;
                    this.field7024[var8] = var17;
                }
                this.field7024[var8] += class356.field5174;
                this.field7019[var8] += class659.field9297;
                this.field7016[var8] += class49.field659;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field6955; var18++) {
                this.field7024[var18] -= class356.field5174;
                this.field7019[var18] -= class659.field9297;
                this.field7016[var18] -= class49.field659;
                this.field7024[var18] = this.field7024[var18] * arg1 / 128;
                this.field7019[var18] = this.field7019[var18] * arg2 / 128;
                this.field7016[var18] = this.field7016[var18] * arg3 / 128;
                this.field7024[var18] += class356.field5174;
                this.field7019[var18] += class659.field9297;
                this.field7016[var18] += class49.field659;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field6975; var19++) {
                int var23 = (this.field6982[var19] & 0xFF) + (arg1 * 8);
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field6982[var19] = (byte) var23;
            }
            if (this.field7014 != null) {
                this.field7014.field1981 = null;
            }
            if (this.field7001 != null) {
                for (int var20 = 0; var20 < this.field7049; var20++) {
                    class638 var21 = this.field7001[var20];
                    class614 var22 = this.field7010[var20];
                    var22.field8385 = var22.field8385 & 0xFFFFFF | 255 - (this.field6982[var21.field8713] & 0xFF) << 24;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field6975; var24++) {
                int var28 = this.field7039[var24] & 0xFFFF;
                int var29 = (var28 & 0xFEA2) >> 10;
                int var30 = var28 >> 7 & 0x7;
                int var31 = arg1 + var29 & 0x3F;
                int var32 = arg2 / 4 + var30;
                int var33 = var28 & 0x7F;
                int var34 = arg3 + var33;
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 7) {
                    var32 = 7;
                }
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field7039[var24] = (short) class288.method1722(class288.method1722(var31 << 10, var32 << 7), var34);
            }
            if (this.field7014 != null) {
                this.field7014.field1981 = null;
            }
            if (this.field7001 != null) {
                for (int var25 = 0; var25 < this.field7049; var25++) {
                    class638 var26 = this.field7001[var25];
                    class614 var27 = this.field7010[var25];
                    var27.field8385 = var27.field8385 & 0xFF000000 | class91.field1112[this.field7039[var26.field8713] & 0xFFFF] & 0xFFFFFF;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field7049; var35++) {
                class614 var36 = this.field7010[var35];
                var36.field8379 += arg2;
                var36.field8387 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field7049; var37++) {
                class614 var38 = this.field7010[var37];
                var38.field8381 = var38.field8381 * arg1 >> 7;
                var38.field8384 = var38.field8384 * arg2 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field7049; var39++) {
                class614 var40 = this.field7010[var39];
                var40.field8386 = var40.field8386 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!eca", name = "ha", descriptor = "()I", line = 3634)
    public final int method641() {
        field7048++;
        if (!this.field6984) {
            this.method2917(72);
        }
        return this.field7008;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(IILq;Z)Z", line = 3653)
    public final boolean method695(int arg0, int arg1, class111 arg2, boolean arg3) {
        field6961++;
        class367 var5 = (class367) arg2;
        class367 var6 = this.field7027.field9011;
        float var7 = var5.field5279 * var6.field5262 + var5.field5269 * var6.field5286 + var5.field5259 * var6.field5276 + var6.field5269;
        float var8 = var5.field5279 * var6.field5266 + var5.field5269 * var6.field5291 + var5.field5259 * var6.field5264 + var6.field5259;
        class640.field8731 = var5.field5258 * var6.field5266 + var5.field5276 * var6.field5291 + var5.field5264 * var6.field5264;
        class641.field8759 = var5.field5267 * var6.field5266 + var5.field5266 * var6.field5264 + var5.field5262 * var6.field5291;
        class625.field8499 = var5.field5267 * var6.field5267 + var5.field5266 * var6.field5258 + var5.field5262 * var6.field5270;
        class438.field6055 = var5.field5270 * var6.field5266 + var5.field5291 * var6.field5264 + var5.field5286 * var6.field5291;
        float var9 = var5.field5279 * var6.field5267 + var5.field5269 * var6.field5270 + var5.field5259 * var6.field5258 + var6.field5279;
        class461.field6285 = var5.field5270 * var6.field5262 + var5.field5291 * var6.field5276 + var5.field5286 * var6.field5286;
        class484.field6546 = var5.field5270 * var6.field5267 + var5.field5291 * var6.field5258 + var5.field5286 * var6.field5270;
        class662.field9391 = var5.field5267 * var6.field5262 + var5.field5266 * var6.field5276 + var5.field5262 * var6.field5286;
        class626.field8523 = var5.field5258 * var6.field5262 + var5.field5276 * var6.field5286 + var5.field5264 * var6.field5276;
        class596.field8166 = var5.field5258 * var6.field5267 + var5.field5276 * var6.field5270 + var5.field5264 * var6.field5258;
        boolean var10 = false;
        float var11 = Float.MAX_VALUE;
        float var12 = -3.4028235E38F;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        int var15 = this.field7027.field9001;
        int var16 = this.field7027.field9037;
        if (!this.field6984) {
            this.method2917(97);
        }
        class257.field3575[0] = this.field7008;
        class273.field3699[0] = this.field7042;
        class257.field3575[1] = this.field7015;
        class323.field4730[0] = this.field7012;
        class273.field3699[1] = this.field7042;
        class323.field4730[1] = this.field7012;
        class257.field3575[2] = this.field7008;
        class273.field3699[2] = this.field7025;
        class323.field4730[2] = this.field7012;
        class257.field3575[3] = this.field7015;
        class273.field3699[3] = this.field7025;
        class257.field3575[4] = this.field7008;
        class323.field4730[3] = this.field7012;
        class273.field3699[4] = this.field7042;
        class257.field3575[5] = this.field7015;
        class323.field4730[4] = this.field6944;
        class273.field3699[5] = this.field7042;
        class323.field4730[5] = this.field6944;
        class257.field3575[6] = this.field7008;
        class273.field3699[6] = this.field7025;
        class323.field4730[6] = this.field6944;
        class257.field3575[7] = this.field7015;
        class273.field3699[7] = this.field7025;
        class323.field4730[7] = this.field6944;
        for (int var17 = 0; var17 < 8; var17++) {
            float var38 = (float) class273.field3699[var17];
            float var39 = (float) class323.field4730[var17];
            float var40 = (float) class257.field3575[var17];
            float var41 = class625.field8499 * var39 + class596.field8166 * var38 + class484.field6546 * var40 + var9;
            float var42 = class662.field9391 * var39 + class626.field8523 * var38 + class461.field6285 * var40 + var7;
            float var43 = class641.field8759 * var39 + class640.field8731 * var38 + class438.field6055 * var40 + var8;
            if (var41 >= (float) this.field7027.field9051) {
                float var44 = (float) var15 * var42 / var41 + (float) this.field7027.field9070;
                if (var44 > var12) {
                    var12 = var44;
                }
                float var45 = (float) var16 * var43 / var41 + (float) this.field7027.field9080;
                if (var44 < var11) {
                    var11 = var44;
                }
                var10 = true;
                if (var13 > var45) {
                    var13 = var45;
                }
                if (var14 < var45) {
                    var14 = var45;
                }
            }
        }
        if (var10 && var11 < (float) arg0 && (float) arg0 < var12 && (float) arg1 > var13 && var14 > (float) arg1) {
            if (arg3) {
                return true;
            }
            if (this.field6976 > this.field7027.field9088.length) {
                this.field7027.field9088 = new int[this.field6976];
                this.field7027.field9087 = new int[this.field6976];
            }
            int[] var18 = this.field7027.field9088;
            int[] var19 = this.field7027.field9087;
            for (int var20 = 0; var20 < this.field6955; var20++) {
                float var22 = (float) this.field7016[var20];
                float var23 = (float) this.field7019[var20];
                float var24 = (float) this.field7024[var20];
                float var25 = class625.field8499 * var22 + class596.field8166 * var23 + class484.field6546 * var24 + var9;
                float var26 = class641.field8759 * var22 + class640.field8731 * var23 + class438.field6055 * var24 + var8;
                float var27 = class662.field9391 * var22 + class626.field8523 * var23 + class461.field6285 * var24 + var7;
                if (((float) this.field7027.field9051 <= var25)) {
                    int var32 = (int) ((float) var15 * var27 / var25 + (float) this.field7027.field9070);
                    int var33 = (int) ((float) var16 * var26 / var25 + (float) this.field7027.field9080);
                    int var34 = this.field6992[var20];
                    int var35 = this.field6992[var20 + 1];
                    for (int var36 = var34; var36 < var35; var36++) {
                        int var37 = this.field6999[var36] - 1;
                        if (var37 == -1) {
                            break;
                        }
                        var18[var37] = var32;
                        var19[var37] = var33;
                    }
                } else {
                    int var28 = this.field6992[var20];
                    int var29 = this.field6992[var20 + 1];
                    for (int var30 = var28; var30 < var29; var30++) {
                        int var31 = this.field6999[var30] - 1;
                        if (var31 == -1) {
                            break;
                        }
                        var18[this.field6999[var30] - 1] = -999999;
                    }
                }
            }
            for (int var21 = 0; var21 < this.field6975; var21++) {
                if (var18[this.field7045[var21]] != -999999 && var18[this.field6964[var21]] != -999999 && var18[this.field7046[var21]] != -999999 && this.method2922(var19[this.field6964[var21]], arg1, var19[this.field7045[var21]], var18[this.field7046[var21]], var18[this.field7045[var21]], arg0, var19[this.field7046[var21]], (byte) -67, var18[this.field6964[var21]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lq;Lqn;II)V", line = 3867)
    public final void method672(class111 arg0, class455 arg1, int arg2, int arg3) {
        field7018++;
        if (this.field6976 == 0) {
            return;
        }
        class367 var5 = this.field7027.field9011;
        class367 var6 = (class367) arg0;
        if (!this.field6984) {
            this.method2917(46);
        }
        class548.field7493 = var5.field5267 * var6.field5279 + var5.field5270 * var6.field5269 + var5.field5258 * var6.field5259 + var5.field5279;
        class596.field8166 = var5.field5267 * var6.field5258 + var5.field5270 * var6.field5276 + var5.field5258 * var6.field5264;
        float var7 = (float) this.field7042 * class596.field8166 + class548.field7493;
        float var8 = (float) this.field7025 * class596.field8166 + class548.field7493;
        float var9;
        float var10;
        if (var8 < var7) {
            var9 = (float) this.field6997 + var7;
            var10 = var8 - (float) this.field6997;
        } else {
            var9 = (float) this.field6997 + var8;
            var10 = (float) (-this.field6997) + var7;
        }
        if ((this.field7027.field8996 <= var10) || ((float) this.field7027.field9051 >= var9)) {
            return;
        }
        class251.field3385 = var5.field5262 * var6.field5279 + var5.field5286 * var6.field5269 + var5.field5276 * var6.field5259 + var5.field5269;
        class626.field8523 = var5.field5262 * var6.field5258 + var5.field5286 * var6.field5276 + var5.field5276 * var6.field5264;
        float var11 = (float) this.field7042 * class626.field8523 + class251.field3385;
        float var12 = (float) this.field7025 * class626.field8523 + class251.field3385;
        float var13;
        float var14;
        if ((var11 > var12)) {
            var13 = ((float) this.field6997 + var11) * (float) this.field7027.field9001;
            var14 = (var12 - (float) this.field6997) * (float) this.field7027.field9001;
        } else {
            var13 = ((float) this.field6997 + var12) * (float) this.field7027.field9001;
            var14 = (var11 - (float) this.field6997) * (float) this.field7027.field9001;
        }
        if ((this.field7027.field9067 <= var14 / (float) arg2) || (var13 / (float) arg2 <= this.field7027.field9072)) {
            return;
        }
        class640.field8731 = var5.field5266 * var6.field5258 + var5.field5291 * var6.field5276 + var5.field5264 * var6.field5264;
        class537.field7372 = var5.field5266 * var6.field5279 + var5.field5291 * var6.field5269 + var5.field5264 * var6.field5259 + var5.field5259;
        float var15 = (float) this.field7042 * class640.field8731 + class537.field7372;
        float var16 = (float) this.field7025 * class640.field8731 + class537.field7372;
        float var17;
        float var18;
        if (var15 > var16) {
            var17 = (var16 - (float) this.field6997) * (float) this.field7027.field9037;
            var18 = ((float) this.field6997 + var15) * (float) this.field7027.field9037;
        } else {
            var18 = ((float) this.field6997 + var16) * (float) this.field7027.field9037;
            var17 = ((float) (-this.field6997) + var15) * (float) this.field7027.field9037;
        }
        if ((this.field7027.field9021 <= var17 / (float) arg2) || (var18 / (float) arg2 <= this.field7027.field9002)) {
            return;
        }
        if (arg1 != null || this.field7001 != null) {
            class662.field9391 = var5.field5262 * var6.field5267 + var5.field5286 * var6.field5262 + var5.field5276 * var6.field5266;
            class484.field6546 = var5.field5267 * var6.field5270 + var5.field5270 * var6.field5286 + var5.field5258 * var6.field5291;
            class461.field6285 = var5.field5262 * var6.field5270 + var5.field5286 * var6.field5286 + var5.field5276 * var6.field5291;
            class438.field6055 = var5.field5266 * var6.field5270 + var5.field5291 * var6.field5286 + var5.field5264 * var6.field5291;
            class641.field8759 = var5.field5266 * var6.field5267 + var5.field5291 * var6.field5262 + var5.field5264 * var6.field5266;
            class625.field8499 = var5.field5267 * var6.field5267 + var5.field5270 * var6.field5262 + var5.field5258 * var6.field5266;
        }
        if (arg1 != null) {
            int var19 = this.field7015 + this.field7008 >> 1;
            int var20 = this.field7012 + this.field6944 >> 1;
            int var21 = (int) ((float) var20 * class662.field9391 + (float) this.field7042 * class626.field8523 + (float) var19 * class461.field6285 + class251.field3385);
            int var22 = (int) ((float) var20 * class641.field8759 + (float) this.field7042 * class640.field8731 + (float) var19 * class438.field6055 + class537.field7372);
            int var23 = (int) ((float) var20 * class625.field8499 + (float) this.field7042 * class596.field8166 + (float) var19 * class484.field6546 + class548.field7493);
            int var24 = (int) ((float) var20 * class662.field9391 + (float) this.field7025 * class626.field8523 + (float) var19 * class461.field6285 + class251.field3385);
            int var25 = (int) ((float) var20 * class641.field8759 + (float) this.field7025 * class640.field8731 + (float) var19 * class438.field6055 + class537.field7372);
            arg1.field6203 = this.field7027.field9080 + (this.field7027.field9037 * var22 / arg2);
            int var26 = (int) ((float) var20 * class625.field8499 + (float) this.field7025 * class596.field8166 + (float) var19 * class484.field6546 + class548.field7493);
            arg1.field6206 = this.field7027.field9001 * var24 / arg2 + this.field7027.field9070;
            arg1.field6204 = this.field7027.field9001 * var21 / arg2 + this.field7027.field9070;
            arg1.field6201 = this.field7027.field9080 + (this.field7027.field9037 * var25 / arg2);
            if (var23 < this.field7027.field9051 && var26 < this.field7027.field9051) {
                arg1.field6205 = (this.field6997 + var21) * this.field7027.field9001 / arg2 + this.field7027.field9070 - arg1.field6204;
                arg1.field6202 = true;
            }
        }
        this.field7027.method3496((float) arg2, 31);
        this.field7027.method3527(false);
        this.field7027.method3508((byte) 127, var6);
        this.method2915(85);
        this.field7027.method3502(452832144);
        this.method2914((byte) 79);
    }

    @OriginalMember(owner = "client!eca", name = "AA", descriptor = "(I)V", line = 4018)
    public final void method650(int arg0) {
        field7043++;
        int var2 = class654.field9259[arg0];
        int var3 = class654.field9260[arg0];
        for (int var4 = 0; var4 < this.field6955; var4++) {
            int var5 = this.field7019[var4] * var3 - (this.field7016[var4] * var2) >> 14;
            this.field7016[var4] = this.field7019[var4] * var2 + this.field7016[var4] * var3 >> 14;
            this.field7019[var4] = var5;
        }
        if (this.field7034 != null) {
            this.field7034.field1981 = null;
        }
        this.field6984 = false;
    }

    @OriginalMember(owner = "client!eca", name = "EA", descriptor = "()I", line = 4051)
    public final int method660() {
        field6985++;
        if (!this.field6984) {
            this.method2917(102);
        }
        return this.field7025;
    }

    @OriginalMember(owner = "client!eca", name = "ia", descriptor = "(I)V", line = 4065)
    public final void method655(int arg0) {
        this.field6952 = arg0;
        field6943++;
        if (this.field7003 != null && (this.field6952 & 0x10000) == 0) {
            this.field6967 = this.field7003.field553;
            this.field7023 = this.field7003.field552;
            this.field6971 = this.field7003.field556;
            this.field7005 = this.field7003.field560;
            this.field7003 = null;
        }
        this.field6954 = true;
        this.method2918((byte) -46);
    }

    @OriginalMember(owner = "client!eca", name = "u", descriptor = "()I", line = 4087)
    public final int method700() {
        field6957++;
        return this.field7044;
    }

    @OriginalMember(owner = "client!eca", name = "Y", descriptor = "()V", line = 4107)
    public final void method687() {
        for (int var1 = 0; var1 < this.field6977; var1++) {
            this.field7024[var1] = this.field7024[var1] + 7 >> 4;
            this.field7019[var1] = this.field7019[var1] + 7 >> 4;
            this.field7016[var1] = this.field7016[var1] + 7 >> 4;
        }
        field7013++;
        if (this.field7034 != null) {
            this.field7034.field1981 = null;
        }
        this.field6984 = false;
    }

    @OriginalMember(owner = "client!eca", name = "ka", descriptor = "(SS)V", line = 4141)
    public final void method657(short arg0, short arg1) {
        field7038++;
        class479 var3 = this.field7027.field9731;
        for (int var4 = 0; var4 < this.field6975; var4++) {
            if (this.field6980[var4] == arg0) {
                this.field6980[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class568 var7 = var3.method1728(-123, arg0 & 0xFFFF);
            var6 = var7.field7863;
            var5 = var7.field7869;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class568 var10 = var3.method1728(-118, arg1 & 0xFFFF);
            var9 = var10.field7863;
            var8 = var10.field7869;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field7001 != null) {
            for (int var11 = 0; var11 < this.field7049; var11++) {
                class638 var12 = this.field7001[var11];
                class614 var13 = this.field7010[var11];
                var13.field8385 = var13.field8385 & 0xFF000000 | class91.field1112[this.field7039[var12.field8713] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field7014 != null) {
            this.field7014.field1981 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!eca", name = "va", descriptor = "(I)V", line = 4214)
    public final void method676(int arg0) {
        this.field7031 = (short) arg0;
        if (this.field7014 != null) {
            this.field7014.field1981 = null;
        }
        field7021++;
        if (this.field7029 != null) {
            this.field7029.field1981 = null;
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lba;IIIZ)V", line = 4234)
    public final void method646(class629 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field6990++;
        class514 var6 = (class514) arg0;
        if (this.field6975 == 0 || var6.field6975 == 0) {
            return;
        }
        int var7 = var6.field6955;
        int[] var8 = var6.field7024;
        int[] var9 = var6.field7019;
        int[] var10 = var6.field7016;
        short[] var11 = var6.field7005;
        short[] var12 = var6.field6971;
        short[] var13 = var6.field6967;
        byte[] var14 = var6.field7023;
        byte[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field7003 == null) {
            var16 = null;
            var18 = null;
            var15 = null;
            var17 = null;
        } else {
            var15 = this.field7003.field552;
            var16 = this.field7003.field560;
            var17 = this.field7003.field553;
            var18 = this.field7003.field556;
        }
        short[] var19;
        short[] var20;
        byte[] var21;
        short[] var22;
        if (var6.field7003 == null) {
            var21 = null;
            var20 = null;
            var22 = null;
            var19 = null;
        } else {
            var19 = var6.field7003.field556;
            var20 = var6.field7003.field560;
            var21 = var6.field7003.field552;
            var22 = var6.field7003.field553;
        }
        int[] var23 = var6.field6992;
        short[] var24 = var6.field6999;
        if (!var6.field6984) {
            var6.method2917(59);
        }
        short var25 = var6.field7042;
        short var26 = var6.field7025;
        short var27 = var6.field7008;
        short var28 = var6.field7015;
        short var29 = var6.field7012;
        short var30 = var6.field6944;
        for (int var31 = 0; var31 < this.field6955; var31++) {
            int var32 = this.field7019[var31] - arg2;
            if (var25 <= var32 && var26 >= var32) {
                int var33 = this.field7024[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field7016[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field6992[var31];
                        int var37 = this.field6992[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field6999[var38] - 1;
                            if (var35 == -1 || this.field7023[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = var23[var39 + 1];
                                    int var41 = var23[var39];
                                    int var42 = -1;
                                    for (int var43 = var41; var43 < var40; var43++) {
                                        var42 = var24[var43] - 1;
                                        if (var42 == -1 || var14[var42] != 0) {
                                            break;
                                        }
                                    }
                                    if (var42 != -1) {
                                        if (var16 == null) {
                                            this.field7003 = new class43();
                                            var16 = this.field7003.field560 = class511.method2890(this.field7005, false);
                                            var18 = this.field7003.field556 = class511.method2890(this.field6971, false);
                                            var17 = this.field7003.field553 = class511.method2890(this.field6967, false);
                                            var15 = this.field7003.field552 = class172.method1148((byte) 0, this.field7023);
                                        }
                                        if (var20 == null) {
                                            class43 var44 = var6.field7003 = new class43();
                                            var20 = var44.field560 = class511.method2890(var11, false);
                                            var19 = var44.field556 = class511.method2890(var12, false);
                                            var22 = var44.field553 = class511.method2890(var13, false);
                                            var21 = var44.field552 = class172.method1148((byte) 0, var14);
                                        }
                                        short var45 = this.field7005[var35];
                                        short var46 = this.field6971[var35];
                                        short var47 = this.field6967[var35];
                                        byte var48 = this.field7023[var35];
                                        int var49 = var23[var39];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var49; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var21[var52] != 0) {
                                                var20[var52] += var45;
                                                var19[var52] += var46;
                                                var22[var52] += var47;
                                                var21[var52] += var48;
                                            }
                                        }
                                        int var53 = this.field6992[var31 + 1];
                                        int var54 = this.field6992[var31];
                                        short var55 = var13[var42];
                                        short var56 = var12[var42];
                                        short var57 = var11[var42];
                                        byte var58 = var14[var42];
                                        for (int var59 = var54; var59 < var53; var59++) {
                                            int var60 = this.field6999[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var15[var60] != 0) {
                                                var16[var60] += var57;
                                                var18[var60] += var56;
                                                var17[var60] += var55;
                                                var15[var60] += var58;
                                            }
                                        }
                                        if (this.field7029 == null && this.field7014 != null) {
                                            this.field7014.field1981 = null;
                                        }
                                        if (this.field7029 != null) {
                                            this.field7029.field1981 = null;
                                        }
                                        if (var6.field7029 == null && var6.field7014 != null) {
                                            var6.field7014.field1981 = null;
                                        }
                                        if (var6.field7029 != null) {
                                            var6.field7029.field1981 = null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eca", name = "d", descriptor = "()Z", line = 4506)
    public final boolean method642() {
        field6946++;
        if (this.field6980 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field6980.length; var1++) {
            if (this.field6980[var1] != -1 && !this.field7027.field9731.method1732(this.field6980[var1], 54)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "()[Lpp;", line = 4530)
    public final class190[] method694() {
        field6945++;
        return this.field7004;
    }

    @OriginalMember(owner = "client!eca", name = "I", descriptor = "(I)V", line = 4540)
    public final void method691(int arg0) {
        field6981++;
        int var2 = class654.field9259[arg0];
        int var3 = class654.field9260[arg0];
        for (int var4 = 0; var4 < this.field6955; var4++) {
            int var5 = this.field7024[var4] * var3 + this.field7016[var4] * var2 >> 14;
            this.field7016[var4] = this.field7016[var4] * var3 - (this.field7024[var4] * var2) >> 14;
            this.field7024[var4] = var5;
        }
        this.field6984 = false;
        if (this.field7034 != null) {
            this.field7034.field1981 = null;
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lq;)V", line = 4570)
    public final void method656(class111 arg0) {
        field6994++;
        class367 var2 = (class367) arg0;
        if (this.field6969 != null) {
            for (int var3 = 0; var3 < this.field6969.length; var3++) {
                class594 var4 = this.field6969[var3];
                class594 var5 = var4;
                if (var4.field8143 != null) {
                    var5 = var4.field8143;
                }
                var5.field8160 = (int) ((float) this.field7016[var4.field8156] * var2.field5262 + (float) this.field7024[var4.field8156] * var2.field5286 + (float) this.field7019[var4.field8156] * var2.field5276 + var2.field5269);
                var5.field8142 = (int) ((float) this.field7016[var4.field8156] * var2.field5266 + (float) this.field7024[var4.field8156] * var2.field5291 + (float) this.field7019[var4.field8156] * var2.field5264 + var2.field5259);
                var5.field8154 = (int) ((float) this.field7016[var4.field8156] * var2.field5267 + (float) this.field7024[var4.field8156] * var2.field5270 + (float) this.field7019[var4.field8156] * var2.field5258 + var2.field5279);
                var5.field8146 = (int) ((float) this.field7016[var4.field8151] * var2.field5262 + (float) this.field7024[var4.field8151] * var2.field5286 + (float) this.field7019[var4.field8151] * var2.field5276 + var2.field5269);
                var5.field8161 = (int) ((float) this.field7016[var4.field8151] * var2.field5266 + (float) this.field7024[var4.field8151] * var2.field5291 + (float) this.field7019[var4.field8151] * var2.field5264 + var2.field5259);
                var5.field8148 = (int) ((float) this.field7016[var4.field8151] * var2.field5267 + (float) this.field7024[var4.field8151] * var2.field5270 + (float) this.field7019[var4.field8151] * var2.field5258 + var2.field5279);
                var5.field8150 = (int) ((float) this.field7016[var4.field8152] * var2.field5262 + (float) this.field7024[var4.field8152] * var2.field5286 + (float) this.field7019[var4.field8152] * var2.field5276 + var2.field5269);
                var5.field8149 = (int) ((float) this.field7016[var4.field8152] * var2.field5266 + (float) this.field7024[var4.field8152] * var2.field5291 + (float) this.field7019[var4.field8152] * var2.field5264 + var2.field5259);
                var5.field8155 = (int) ((float) this.field7016[var4.field8152] * var2.field5267 + (float) this.field7024[var4.field8152] * var2.field5270 + (float) this.field7019[var4.field8152] * var2.field5258 + var2.field5279);
            }
        }
        if (this.field7004 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field7004.length; var6++) {
            class190 var7 = this.field7004[var6];
            class190 var8 = var7;
            if (var7.field2474 != null) {
                var8 = var7.field2474;
            }
            if (var7.field2471 == null) {
                var7.field2471 = var2.method596();
            } else {
                var7.field2471.method597(var2);
            }
            var8.field2480 = (int) ((float) this.field7016[var7.field2477] * var2.field5262 + (float) this.field7024[var7.field2477] * var2.field5286 + (float) this.field7019[var7.field2477] * var2.field5276 + var2.field5269);
            var8.field2476 = (int) ((float) this.field7016[var7.field2477] * var2.field5266 + (float) this.field7024[var7.field2477] * var2.field5291 + (float) this.field7019[var7.field2477] * var2.field5264 + var2.field5259);
            var8.field2475 = (int) ((float) this.field7016[var7.field2477] * var2.field5267 + (float) this.field7024[var7.field2477] * var2.field5270 + (float) this.field7019[var7.field2477] * var2.field5258 + var2.field5279);
        }
    }

    @OriginalMember(owner = "client!eca", name = "m", descriptor = "(III)V", line = 4640)
    public final void method693(int arg0, int arg1, int arg2) {
        field6972++;
        for (int var4 = 0; var4 < this.field6955; var4++) {
            if (arg0 != 0) {
                this.field7024[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field7019[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field7016[var4] += arg2;
            }
        }
        if (this.field7034 != null) {
            this.field7034.field1981 = null;
        }
        this.field6984 = false;
    }

    @OriginalMember(owner = "client!eca", name = "l", descriptor = "(III)V", line = 4672)
    public final void method670(int arg0, int arg1, int arg2) {
        field6949++;
        for (int var4 = 0; var4 < this.field6955; var4++) {
            if (arg0 != 128) {
                this.field7024[var4] = this.field7024[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field7019[var4] = this.field7019[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field7016[var4] = this.field7016[var4] * arg2 >> 7;
            }
        }
        if (this.field7034 != null) {
            this.field7034.field1981 = null;
        }
        this.field6984 = false;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(JIFBIILrf;IIF)S", line = 4706)
    private final short method2920(long arg0, int arg1, float arg2, byte arg3, int arg4, int arg5, class238 arg6, int arg7, int arg8, float arg9) {
        field6973++;
        if (arg3 != -27) {
            this.method653();
        }
        int var12 = this.field6992[arg7];
        int var13 = this.field6992[arg7 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field6999[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class274.field3708[var15] == arg0) {
                return (short) (var16 - 1);
            }
        }
        this.field6999[var14] = (short) (this.field6976 + 1);
        class274.field3708[var14] = arg0;
        this.field7005[this.field6976] = (short) arg5;
        this.field6971[this.field6976] = (short) arg8;
        this.field6967[this.field6976] = (short) arg1;
        this.field7023[this.field6976] = (byte) arg4;
        this.field6948[this.field6976] = arg9;
        this.field6989[this.field6976] = arg2;
        return (short) (this.field6976++);
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(ZLuh;)V", line = 4755)
    private final void method2921(boolean arg0, class441 arg1) {
        if (this.field6976 > this.field7027.field9088.length) {
            this.field7027.field9087 = new int[this.field6976];
            this.field7027.field9088 = new int[this.field6976];
        }
        field7033++;
        int[] var3 = this.field7027.field9088;
        int[] var4 = this.field7027.field9087;
        if (!arg0) {
            this.field6964 = null;
        }
        for (int var5 = 0; var5 < this.field6955; var5++) {
            int var16 = (this.field7024[var5] - (this.field7019[var5] * this.field7027.field9016 >> 8) >> this.field7027.field8939) - arg1.field6076;
            int var17 = (this.field7016[var5] - (this.field7019[var5] * this.field7027.field8971 >> 8) >> this.field7027.field8939) - arg1.field6068;
            int var18 = this.field6992[var5];
            int var19 = this.field6992[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field6999[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        for (int var6 = 0; var6 < this.field6970; var6++) {
            if (this.field6982 == null || this.field6982[var6] <= 128) {
                short var7 = this.field7045[var6];
                short var8 = this.field6964[var6];
                short var9 = this.field7046[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if ((var10 - var11) * (var14 - var15) - ((var14 - var13) * (var12 - var11)) > 0) {
                    arg1.method2530(var10, var12, var13, -18765, var15, var11, var14);
                }
            }
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIIIIIIBI)Z", line = 4844)
    private final boolean method2922(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        int var10 = 4 % ((-arg7 - 15) / 45);
        field7041++;
        if (arg1 < arg2 && arg0 > arg1 && arg6 > arg1) {
            return false;
        } else if (arg1 > arg2 && arg0 < arg1 && arg1 > arg6) {
            return false;
        } else if (arg4 > arg5 && arg5 < arg8 && arg5 < arg3) {
            return false;
        } else {
            return arg5 <= arg4 || arg8 >= arg5 || arg5 <= arg3;
        }
    }

    @OriginalMember(owner = "client!eca", name = "P", descriptor = "()V", line = 4872)
    public final void method651() {
        for (int var1 = 0; var1 < this.field6955; var1++) {
            this.field7016[var1] = -this.field7016[var1];
        }
        field6963++;
        for (int var2 = 0; var2 < this.field6976; var2++) {
            this.field6967[var2] = (short) (-this.field6967[var2]);
        }
        for (int var3 = 0; var3 < this.field6975; var3++) {
            short var4 = this.field7045[var3];
            this.field7045[var3] = this.field7046[var3];
            this.field7046[var3] = var4;
        }
        if (this.field7029 == null && this.field7014 != null) {
            this.field7014.field1981 = null;
        }
        if (this.field7029 != null) {
            this.field7029.field1981 = null;
        }
        if (this.field7034 != null) {
            this.field7034.field1981 = null;
        }
        this.field6984 = false;
        if (this.field6995 != null) {
            this.field6995.field2626 = null;
        }
    }

    @OriginalMember(owner = "client!eca", name = "v", descriptor = "(I)V", line = 4924)
    public final void method645(int arg0) {
        field7040++;
        int var2 = class654.field9259[arg0];
        int var3 = class654.field9260[arg0];
        for (int var4 = 0; var4 < this.field6955; var4++) {
            int var5 = this.field7019[var4] * var2 + (this.field7024[var4] * var3) >> 14;
            this.field7019[var4] = this.field7019[var4] * var3 - (this.field7024[var4] * var2) >> 14;
            this.field7024[var4] = var5;
        }
        this.field6984 = false;
        if (this.field7034 != null) {
            this.field7034.field1981 = null;
        }
    }

    @OriginalMember(owner = "client!eca", name = "M", descriptor = "()I", line = 4953)
    public final int method662() {
        field7050++;
        if (!this.field6984) {
            this.method2917(15);
        }
        return this.field7015;
    }

    @OriginalMember(owner = "client!eca", name = "c", descriptor = "()[Ljq;", line = 4971)
    public final class594[] method653() {
        field6983++;
        return this.field6969;
    }

    @OriginalMember(owner = "client!eca", name = "K", descriptor = "()I", line = 4981)
    public final int method690() {
        field6951++;
        if (!this.field6984) {
            this.method2917(93);
        }
        return this.field6944;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(BIZ)Lba;", line = 4997)
    public final class629 method659(byte arg0, int arg1, boolean arg2) {
        field6966++;
        class514 var4;
        class514 var5;
        if (arg0 == 1) {
            var4 = this.field7027.field9038;
            var5 = this.field7027.field9056;
        } else if (arg0 == 2) {
            var5 = this.field7027.field8982;
            var4 = this.field7027.field9008;
        } else if (arg0 == 3) {
            var4 = this.field7027.field9049;
            var5 = this.field7027.field9017;
        } else if (arg0 == 4) {
            var5 = this.field7027.field9055;
            var4 = this.field7027.field9058;
        } else if (arg0 == 5) {
            var5 = this.field7027.field8992;
            var4 = this.field7027.field9079;
        } else {
            var4 = var5 = new class514(this.field7027);
        }
        return this.method2913(arg2, arg0 != 0, var5, arg1, 0, var4);
    }

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "()V", line = 5045)
    public final void method647() {
        field6988++;
        if (this.field6976 <= 0 || this.field6970 <= 0) {
            return;
        }
        this.method2923(-2, false);
        if ((this.field7036 & 0x10) == 0 && this.field6995.field2626 == null) {
            this.method2916(-1694, false);
        }
        this.method2918((byte) -46);
    }

    @OriginalMember(owner = "client!eca", name = "D", descriptor = "(I)V", line = 5065)
    public final void method667(int arg0) {
        if (this.field7014 != null) {
            this.field7014.field1981 = null;
        }
        this.field7044 = (short) arg0;
        field6974++;
    }

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "(IZ)V", line = 5090)
    private final void method2923(int arg0, boolean arg1) {
        field7028++;
        boolean var3 = this.field7014 != null && this.field7014.field1981 == null;
        boolean var4 = this.field7029 != null && this.field7029.field1981 == null;
        boolean var5 = this.field7034 != null && this.field7034.field1981 == null;
        boolean var6 = this.field7011 != null && this.field7011.field1981 == null;
        if (arg1) {
            var4 &= (this.field7036 & 0x4) != 0;
            var6 &= (this.field7036 & 0x8) != 0;
            var3 &= (this.field7036 & 0x2) != 0;
            var5 &= (this.field7036 & 0x1) != 0;
        }
        byte var7 = 0;
        byte var8 = 0;
        byte var9 = 0;
        byte var10 = 0;
        byte var11 = 0;
        if (var5) {
            var8 = var7;
            var7 = (byte) (var7 + 12);
        }
        if (var3) {
            var9 = var7;
            var7 = (byte) (var7 + 4);
        }
        if (var4) {
            var10 = var7;
            var7 = (byte) (var7 + 12);
        }
        if (var6) {
            var11 = var7;
            var7 = (byte) (var7 + 8);
        }
        if (var7 == 0) {
            return;
        }
        if (arg0 != -2) {
            this.field6989 = null;
        }
        if (this.field7027.field9078.field1712.length < this.field6976 * var7) {
            this.field7027.field9078 = new class457((this.field6976 + 100) * var7);
        } else {
            this.field7027.field9078.field1745 = 0;
        }
        class457 var12 = this.field7027.field9078;
        if (var5) {
            if (this.field7027.field8968) {
                for (int var21 = 0; var21 < this.field6955; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field7024[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field7019[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field7016[var21]);
                    int var25 = this.field6992[var21];
                    int var26 = this.field6992[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field6999[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field1745 = var7 * var28;
                        var12.method906(-1, var22);
                        var12.method906(-1, var23);
                        var12.method906(-1, var24);
                    }
                }
            } else {
                for (int var13 = 0; var13 < this.field6955; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field7024[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field7019[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field7016[var13]);
                    int var17 = this.field6992[var13];
                    int var18 = this.field6992[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field6999[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field1745 = var7 * var20;
                        var12.method947(-1996448152, var14);
                        var12.method947(-1996448152, var15);
                        var12.method947(arg0 ^ 0x76FF6196, var16);
                    }
                }
            }
        }
        if (var3) {
            if (this.field7029 == null) {
                short[] var31;
                short[] var32;
                short[] var33;
                byte[] var34;
                if (this.field7003 == null) {
                    var34 = this.field7023;
                    var32 = this.field7005;
                    var33 = this.field6971;
                    var31 = this.field6967;
                } else {
                    var31 = this.field7003.field553;
                    var32 = this.field7003.field560;
                    var33 = this.field7003.field556;
                    var34 = this.field7003.field552;
                }
                float var35 = this.field7027.field8989[0];
                float var36 = this.field7027.field8989[1];
                float var37 = this.field7027.field8989[2];
                float var38 = this.field7027.field9004;
                float var39 = this.field7027.field9000 * 768.0F / (float) this.field7031;
                float var40 = this.field7027.field9048 * 768.0F / (float) this.field7031;
                for (int var41 = 0; var41 < this.field6975; var41++) {
                    int var42 = this.method2919(16711935, this.field7039[var41], this.field7044, this.field6982[var41], this.field6980[var41]);
                    float var43 = (float) ((var42 & 0xFFDC78) >> 16) * this.field7027.field8975;
                    float var44 = (float) ((var42 & 0xFFEB) >> 8) * this.field7027.field9061;
                    short var45 = this.field7045[var41];
                    float var46 = (float) (var42 >>> 24) * this.field7027.field9052;
                    short var47 = (short) var34[var45];
                    float var48;
                    if (var47 == 0) {
                        var48 = ((float) var31[var45] * var37 + (float) var32[var45] * var35 + (float) var33[var45] * var36) * 0.0026041667F;
                    } else {
                        var48 = ((float) var31[var45] * var37 + (float) var32[var45] * var35 + (float) var33[var45] * var36) / (float) (var47 * 256);
                    }
                    float var49 = (var48 < 0.0F ? var40 : var39) * var48 + var38;
                    int var50 = (int) (var46 * var49);
                    int var51 = (int) (var43 * var49);
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    int var52 = (int) (var44 * var49);
                    if (var51 < 0) {
                        var51 = 0;
                    } else if (var51 > 255) {
                        var51 = 255;
                    }
                    if (var52 < 0) {
                        var52 = 0;
                    } else if (var52 > 255) {
                        var52 = 255;
                    }
                    var12.field1745 = var7 * var45 + var9;
                    var12.method951((byte) -82, var50);
                    var12.method951((byte) -82, var51);
                    var12.method951((byte) -82, var52);
                    var12.method951((byte) -82, 255 - (this.field6982[var41] & 0xFF));
                    short var53 = this.field6964[var41];
                    short var54 = (short) var34[var53];
                    float var55;
                    if (var54 == 0) {
                        var55 = ((float) var31[var53] * var37 + (float) var32[var53] * var35 + (float) var33[var53] * var36) * 0.0026041667F;
                    } else {
                        var55 = ((float) var31[var53] * var37 + (float) var32[var53] * var35 + (float) var33[var53] * var36) / (float) (var54 * 256);
                    }
                    float var56 = var38 + (var55 < 0.0F ? var40 : var39) * var55;
                    int var57 = (int) (var46 * var56);
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    int var58 = (int) (var43 * var56);
                    int var59 = (int) (var44 * var56);
                    if (var58 < 0) {
                        var58 = 0;
                    } else if (var58 > 255) {
                        var58 = 255;
                    }
                    if (var59 < 0) {
                        var59 = 0;
                    } else if (var59 > 255) {
                        var59 = 255;
                    }
                    var12.field1745 = var7 * var53 + var9;
                    var12.method951((byte) -82, var57);
                    var12.method951((byte) -82, var58);
                    var12.method951((byte) -82, var59);
                    var12.method951((byte) -82, 255 - (this.field6982[var41] & 0xFF));
                    short var60 = this.field7046[var41];
                    short var61 = (short) var34[var60];
                    float var62;
                    if (var61 == 0) {
                        var62 = ((float) var31[var60] * var37 + (float) var32[var60] * var35 + (float) var33[var60] * var36) * 0.0026041667F;
                    } else {
                        var62 = ((float) var31[var60] * var37 + (float) var32[var60] * var35 + (float) var33[var60] * var36) / (float) (var61 * 256);
                    }
                    float var63 = var38 + (var62 < 0.0F ? var40 : var39) * var62;
                    int var64 = (int) (var46 * var63);
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    int var65 = (int) (var43 * var63);
                    if (var65 < 0) {
                        var65 = 0;
                    } else if (var65 > 255) {
                        var65 = 255;
                    }
                    int var66 = (int) (var44 * var63);
                    if (var66 < 0) {
                        var66 = 0;
                    } else if (var66 > 255) {
                        var66 = 255;
                    }
                    var12.field1745 = var9 + (var7 * var60);
                    var12.method951((byte) -82, var64);
                    var12.method951((byte) -82, var65);
                    var12.method951((byte) -82, var66);
                    var12.method951((byte) -82, 255 - (this.field6982[var41] & 0xFF));
                }
            } else {
                for (int var29 = 0; var29 < this.field6975; var29++) {
                    int var30 = this.method2919(16711935, this.field7039[var29], this.field7044, this.field6982[var29], this.field6980[var29]);
                    var12.field1745 = var9 + (this.field7045[var29] * var7);
                    var12.method906(arg0 + 1, var30);
                    var12.field1745 = this.field6964[var29] * var7 + var9;
                    var12.method906(-1, var30);
                    var12.field1745 = this.field7046[var29] * var7 + var9;
                    var12.method906(-1, var30);
                }
            }
        }
        if (var4) {
            byte[] var67;
            short[] var68;
            short[] var69;
            short[] var70;
            if (this.field7003 == null) {
                var68 = this.field7005;
                var67 = this.field7023;
                var69 = this.field6971;
                var70 = this.field6967;
            } else {
                var67 = this.field7003.field552;
                var68 = this.field7003.field560;
                var69 = this.field7003.field556;
                var70 = this.field7003.field553;
            }
            float var71 = 3.0F / (float) this.field7031;
            float var72 = 3.0F / (float) (this.field7031 / 2 + this.field7031);
            var12.field1745 = var10;
            if (this.field7027.field8968) {
                for (int var76 = 0; var76 < this.field6976; var76++) {
                    int var77 = var67[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method2587((float) var68[var76] * var72, -11186);
                        var12.method2587((float) var69[var76] * var72, arg0 - 11184);
                        var12.method2587((float) var70[var76] * var72, -11186);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method2587((float) var68[var76] * var78, -11186);
                        var12.method2587((float) var69[var76] * var78, -11186);
                        var12.method2587((float) var70[var76] * var78, -11186);
                    }
                    var12.field1745 += var7 - 12;
                }
            } else {
                for (int var73 = 0; var73 < this.field6976; var73++) {
                    int var74 = var67[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method2586(-26561, (float) var68[var73] * var72);
                        var12.method2586(arg0 ^ 0x67C1, (float) var69[var73] * var72);
                        var12.method2586(-26561, (float) var70[var73] * var72);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method2586(-26561, (float) var68[var73] * var75);
                        var12.method2586(-26561, (float) var69[var73] * var75);
                        var12.method2586(arg0 ^ 0x67C1, (float) var70[var73] * var75);
                    }
                    var12.field1745 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field1745 = var11;
            if (this.field7027.field8968) {
                for (int var79 = 0; var79 < this.field6976; var79++) {
                    var12.method2587(this.field6948[var79], -11186);
                    var12.method2587(this.field6989[var79], -11186);
                    var12.field1745 += var7 - 8;
                }
            } else {
                for (int var80 = 0; var80 < this.field6976; var80++) {
                    var12.method2586(-26561, this.field6948[var80]);
                    var12.method2586(-26561, this.field6989[var80]);
                    var12.field1745 += var7 - 8;
                }
            }
        }
        var12.field1745 = this.field6976 * var7;
        class437 var81;
        if (arg1) {
            if (this.field7017 == null) {
                this.field7017 = this.field7027.method3494(true, var12.field1712, var7, 4609, var12.field1745);
            } else {
                this.field7017.method2513(var12.field1745, var12.field1712, var7, (byte) -108);
            }
            var81 = this.field7017;
            this.field7036 = 0;
        } else {
            var81 = this.field7027.method3494(false, var12.field1712, var7, 4609, var12.field1745);
            this.field6954 = true;
        }
        if (var5) {
            this.field7034.field1979 = var8;
            this.field7034.field1981 = var81;
        }
        if (var6) {
            this.field7011.field1979 = var11;
            this.field7011.field1981 = var81;
        }
        if (var3) {
            this.field7014.field1981 = var81;
            this.field7014.field1979 = var9;
        }
        if (var4) {
            this.field7029.field1981 = var81;
            this.field7029.field1979 = var10;
        }
    }
}
