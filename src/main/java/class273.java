import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class273 {

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "Z")
    public boolean field4094 = false;

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "I")
    public int field4096 = -1;

    @OriginalMember(owner = "client!dr", name = "h", descriptor = "I")
    public int field4101 = -1;

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "I")
    public int field4100 = -1;

    @OriginalMember(owner = "client!dr", name = "t", descriptor = "I")
    public int field4113 = -1;

    @OriginalMember(owner = "client!dr", name = "z", descriptor = "Z")
    public boolean field4119 = false;

    @OriginalMember(owner = "client!dr", name = "p", descriptor = "I")
    public int field4109 = -1;

    @OriginalMember(owner = "client!dr", name = "y", descriptor = "Z")
    public boolean field4118 = true;

    @OriginalMember(owner = "client!dr", name = "k", descriptor = "I")
    public int field4104 = -1;

    @OriginalMember(owner = "client!dr", name = "o", descriptor = "I")
    public int field4108 = -1;

    @OriginalMember(owner = "client!dr", name = "v", descriptor = "I")
    private int field4115 = 0;

    @OriginalMember(owner = "client!dr", name = "D", descriptor = "I")
    public int field4123 = -1;

    @OriginalMember(owner = "client!dr", name = "A", descriptor = "I")
    private int field4120 = 0;

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "B")
    public byte field4098 = -16;

    @OriginalMember(owner = "client!dr", name = "x", descriptor = "I")
    public int field4117 = -1;

    @OriginalMember(owner = "client!dr", name = "T", descriptor = "I")
    private int field4139 = 128;

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "I")
    public int field4097 = -1;

    @OriginalMember(owner = "client!dr", name = "N", descriptor = "S")
    public short field4133 = 0;

    @OriginalMember(owner = "client!dr", name = "l", descriptor = "Z")
    public boolean field4105 = true;

    @OriginalMember(owner = "client!dr", name = "L", descriptor = "I")
    public int field4131 = 32;

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "I")
    private int field4095 = -1;

    @OriginalMember(owner = "client!dr", name = "R", descriptor = "Z")
    public boolean field4137 = true;

    @OriginalMember(owner = "client!dr", name = "bb", descriptor = "I")
    public int field4147 = 1;

    @OriginalMember(owner = "client!dr", name = "C", descriptor = "[Ljava/lang/String;")
    public String[] field4122 = new String[5];

    @OriginalMember(owner = "client!dr", name = "E", descriptor = "I")
    private int field4124 = 128;

    @OriginalMember(owner = "client!dr", name = "ab", descriptor = "I")
    public int field4146 = -1;

    @OriginalMember(owner = "client!dr", name = "eb", descriptor = "I")
    public int field4150 = -1;

    @OriginalMember(owner = "client!dr", name = "ib", descriptor = "Z")
    public boolean field4154 = true;

    @OriginalMember(owner = "client!dr", name = "P", descriptor = "I")
    public int field4135 = -1;

    @OriginalMember(owner = "client!dr", name = "s", descriptor = "I")
    private int field4112 = -1;

    @OriginalMember(owner = "client!dr", name = "mb", descriptor = "I")
    public int field4158 = 255;

    @OriginalMember(owner = "client!dr", name = "U", descriptor = "B")
    public byte field4140 = 0;

    @OriginalMember(owner = "client!dr", name = "S", descriptor = "Ljava/lang/String;")
    public String field4138 = "null";

    @OriginalMember(owner = "client!dr", name = "cb", descriptor = "I")
    public int field4148 = -1;

    @OriginalMember(owner = "client!dr", name = "Z", descriptor = "B")
    public byte field4145 = 4;

    @OriginalMember(owner = "client!dr", name = "pb", descriptor = "Z")
    public boolean field4161 = false;

    @OriginalMember(owner = "client!dr", name = "kb", descriptor = "S")
    public short field4156 = 0;

    @OriginalMember(owner = "client!dr", name = "V", descriptor = "B")
    public byte field4141 = -96;

    @OriginalMember(owner = "client!dr", name = "H", descriptor = "I")
    public int field4127 = -1;

    @OriginalMember(owner = "client!dr", name = "rb", descriptor = "I")
    public int field4163 = -1;

    @OriginalMember(owner = "client!dr", name = "tb", descriptor = "I")
    public int field4165 = -1;

    @OriginalMember(owner = "client!dr", name = "fb", descriptor = "I")
    public int field4151 = 0;

    @OriginalMember(owner = "client!dr", name = "r", descriptor = "Ljava/lang/String;")
    public static String field4111 = "";

    @OriginalMember(owner = "client!dr", name = "u", descriptor = "Ltl;")
    public static class400 field4114 = new class400(4);

    @OriginalMember(owner = "client!dr", name = "qb", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!dr", name = "j", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!dr", name = "F", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!dr", name = "G", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!dr", name = "I", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!dr", name = "J", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!dr", name = "M", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!dr", name = "Y", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!dr", name = "db", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!dr", name = "gb", descriptor = "I")
    public int field4152;

    @OriginalMember(owner = "client!dr", name = "hb", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!dr", name = "nb", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!dr", name = "sb", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!dr", name = "ob", descriptor = "Ldp;")
    public static class319 field4160;

    @OriginalMember(owner = "client!dr", name = "O", descriptor = "Lfa;")
    private class371 field4134;

    @OriginalMember(owner = "client!dr", name = "i", descriptor = "Lqs;")
    public class45 field4102;

    @OriginalMember(owner = "client!dr", name = "X", descriptor = "Lsh;")
    public static class472 field4143;

    @OriginalMember(owner = "client!dr", name = "jb", descriptor = "[B")
    private byte[] field4155;

    @OriginalMember(owner = "client!dr", name = "n", descriptor = "[I")
    public int[] field4107;

    @OriginalMember(owner = "client!dr", name = "w", descriptor = "[I")
    private int[] field4116;

    @OriginalMember(owner = "client!dr", name = "W", descriptor = "[I")
    public int[] field4142;

    @OriginalMember(owner = "client!dr", name = "lb", descriptor = "[I")
    private int[] field4157;

    @OriginalMember(owner = "client!dr", name = "q", descriptor = "[S")
    private short[] field4110;

    @OriginalMember(owner = "client!dr", name = "B", descriptor = "[S")
    private short[] field4121;

    @OriginalMember(owner = "client!dr", name = "K", descriptor = "[S")
    private short[] field4130;

    @OriginalMember(owner = "client!dr", name = "ub", descriptor = "[S")
    private short[] field4166;

    @OriginalMember(owner = "client!dr", name = "m", descriptor = "[[I")
    private int[][] field4106;

    @OriginalMember(owner = "client!dr", name = "Q", descriptor = "[[I")
    private int[][] field4136;

    static {
        new class332("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
        field4162 = 0;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILre;I)V", line = 18)
    private final void method1775(int arg0, class446 arg1, int arg2) {
        if (arg2 != 8931) {
            this.method1780(-61, 23, 101);
        }
        if (arg0 == 1) {
            int var4 = arg1.method2628(49152);
            this.field4116 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4116[var5] = arg1.method2631(class76.method648(arg2, 11009));
                if (this.field4116[var5] == 65535) {
                    this.field4116[var5] = -1;
                }
            }
        } else if (arg0 == 2) {
            this.field4138 = arg1.method2582((byte) -112);
        } else if (arg0 == 12) {
            this.field4147 = arg1.method2628(49152);
        } else if (arg0 >= 30 && arg0 < 35) {
            this.field4122[arg0 - 30] = arg1.method2582((byte) -95);
        } else if (arg0 == 40) {
            int var6 = arg1.method2628(49152);
            this.field4121 = new short[var6];
            this.field4110 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4110[var7] = (short) arg1.method2631(2530);
                this.field4121[var7] = (short) arg1.method2631(class76.method648(arg2, 11009));
            }
        } else if (arg0 == 41) {
            int var8 = arg1.method2628(49152);
            this.field4130 = new short[var8];
            this.field4166 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4130[var9] = (short) arg1.method2631(2530);
                this.field4166[var9] = (short) arg1.method2631(2530);
            }
        } else if (arg0 == 42) {
            int var10 = arg1.method2628(49152);
            this.field4155 = new byte[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field4155[var11] = arg1.method2642(true);
            }
        } else if (arg0 == 60) {
            int var12 = arg1.method2628(49152);
            this.field4157 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field4157[var13] = arg1.method2631(2530);
            }
        } else if (arg0 == 93) {
            this.field4137 = false;
        } else if (arg0 == 95) {
            this.field4104 = arg1.method2631(2530);
        } else if (arg0 == 97) {
            this.field4139 = arg1.method2631(2530);
        } else if (arg0 == 98) {
            this.field4124 = arg1.method2631(2530);
        } else if (arg0 == 99) {
            this.field4119 = true;
        } else if (arg0 == 100) {
            this.field4115 = arg1.method2642(true);
        } else if (arg0 == 101) {
            this.field4120 = arg1.method2642(true) * 5;
        } else if (arg0 == 102) {
            this.field4165 = arg1.method2631(2530);
        } else if (arg0 == 103) {
            this.field4131 = arg1.method2631(arg2 - 6401);
        } else if (arg0 == 106 || arg0 == 118) {
            this.field4112 = arg1.method2631(2530);
            if (this.field4112 == 65535) {
                this.field4112 = -1;
            }
            this.field4095 = arg1.method2631(2530);
            if (this.field4095 == 65535) {
                this.field4095 = -1;
            }
            int var26 = -1;
            if (arg0 == 118) {
                var26 = arg1.method2631(2530);
                if (var26 == 65535) {
                    var26 = -1;
                }
            }
            int var27 = arg1.method2628(arg2 + 40221);
            this.field4107 = new int[var27 + 2];
            for (int var28 = 0; var28 <= var27; var28++) {
                this.field4107[var28] = arg1.method2631(2530);
                if (this.field4107[var28] == 65535) {
                    this.field4107[var28] = -1;
                }
            }
            this.field4107[var27 + 1] = var26;
        } else if (arg0 == 107) {
            this.field4118 = false;
        } else if (arg0 == 109) {
            this.field4105 = false;
        } else if (arg0 == 111) {
            this.field4154 = false;
        } else if (arg0 == 113) {
            this.field4133 = (short) arg1.method2631(2530);
            this.field4156 = (short) arg1.method2631(arg2 ^ 0x2B01);
        } else if (arg0 == 114) {
            this.field4141 = arg1.method2642(true);
            this.field4098 = arg1.method2642(true);
        } else if (arg0 == 115) {
            arg1.method2628(49152);
            arg1.method2628(arg2 + 40221);
        } else if (arg0 == 119) {
            this.field4140 = arg1.method2642(true);
        } else if (arg0 == 121) {
            this.field4136 = new int[this.field4116.length][];
            int var22 = arg1.method2628(arg2 + 40221);
            for (int var23 = 0; var23 < var22; var23++) {
                int var24 = arg1.method2628(49152);
                int[] var25 = this.field4136[var24] = new int[3];
                var25[0] = arg1.method2642(true);
                var25[1] = arg1.method2642(true);
                var25[2] = arg1.method2642(true);
            }
        } else if (arg0 == 122) {
            this.field4123 = arg1.method2631(2530);
        } else if (arg0 == 123) {
            this.field4096 = arg1.method2631(2530);
        } else if (arg0 == 125) {
            this.field4145 = arg1.method2642(true);
        } else if (arg0 == 127) {
            this.field4135 = arg1.method2631(2530);
        } else if (arg0 == 128) {
            arg1.method2628(49152);
        } else if (arg0 == 134) {
            this.field4100 = arg1.method2631(2530);
            if (this.field4100 == 65535) {
                this.field4100 = -1;
            }
            this.field4097 = arg1.method2631(arg2 - 6401);
            if (this.field4097 == 65535) {
                this.field4097 = -1;
            }
            this.field4109 = arg1.method2631(2530);
            if (this.field4109 == 65535) {
                this.field4109 = -1;
            }
            this.field4108 = arg1.method2631(2530);
            if (this.field4108 == 65535) {
                this.field4108 = -1;
            }
            this.field4151 = arg1.method2628(arg2 ^ 0xE2E3);
        } else if (arg0 == 135) {
            this.field4150 = arg1.method2628(49152);
            this.field4127 = arg1.method2631(2530);
        } else if (arg0 == 136) {
            this.field4117 = arg1.method2628(arg2 ^ 0xE2E3);
            this.field4101 = arg1.method2631(2530);
        } else if (arg0 == 137) {
            this.field4113 = arg1.method2631(2530);
        } else if (arg0 == 138) {
            this.field4163 = arg1.method2631(2530);
        } else if (arg0 == 139) {
            this.field4146 = arg1.method2631(2530);
        } else if (arg0 == 140) {
            this.field4158 = arg1.method2628(49152);
        } else if (arg0 == 141) {
            this.field4161 = true;
        } else if (arg0 == 142) {
            this.field4148 = arg1.method2631(2530);
        } else if (arg0 == 143) {
            this.field4094 = true;
        } else if (arg0 >= 150 && arg0 < 155) {
            this.field4122[arg0 - 150] = arg1.method2582((byte) -45);
            if (!this.field4102.field651) {
                this.field4122[arg0 - 150] = null;
            }
        } else if (arg0 == 160) {
            int var20 = arg1.method2628(49152);
            this.field4142 = new int[var20];
            for (int var21 = 0; var21 < var20; var21++) {
                this.field4142[var21] = arg1.method2631(2530);
            }
        } else if (arg0 == 249) {
            int var14 = arg1.method2628(49152);
            if (this.field4134 == null) {
                int var15 = class158.method1078((byte) -89, var14);
                this.field4134 = new class371(var15);
            }
            for (int var16 = 0; var16 < var14; var16++) {
                boolean var17 = arg1.method2628(49152) == 1;
                int var18 = arg1.method2613(-25778);
                class35 var19;
                if (var17) {
                    var19 = new class81(arg1.method2582((byte) -89));
                } else {
                    var19 = new class145(arg1.method2604(arg2 - 8915));
                }
                this.field4134.method2307((long) var18, var19, (byte) -60);
            }
        }
        field4159++;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIILpp;Lei;Lg;Ltq;I)Lns;", line = 438)
    public final class57 method1776(int arg0, int arg1, int arg2, int arg3, class356 arg4, class247 arg5, class393 arg6, class63 arg7, int arg8) {
        field4153++;
        if (this.field4107 != null) {
            class273 var10 = this.method1781(arg6, true);
            return var10 == null ? null : var10.method1776(arg0, 14285, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        } else if (this.field4157 == null) {
            return null;
        } else {
            int var11 = arg3;
            if (arg4 != null && arg2 != -1) {
                var11 = arg3 | arg4.method2194((byte) -128, arg2, arg0, true);
            }
            class400 var12 = this.field4102.field653;
            class57 var13;
            synchronized (this.field4102.field653) {
                var13 = (class57) this.field4102.field653.method2393(-119, (long) (arg7.field870 << 16 | this.field4152));
                if (arg1 != 14285) {
                    this.method1778((class63) null, (class247) null, -125, -104, -67, (class393) null, 56, (class414[]) null, (class356) null, -73, 105, (class356) null, 75, -49, (class286) null);
                }
            }
            if (var13 == null || var11 != (var13.method402() & var11)) {
                if (var13 != null) {
                    var11 |= var13.method402();
                }
                int var14 = var11;
                boolean var15 = false;
                class451 var16 = this.field4102.field644;
                synchronized (this.field4102.field644) {
                    for (int var17 = 0; var17 < this.field4157.length; var17++) {
                        if (!this.field4102.field644.method2680(0, this.field4157[var17], true)) {
                            var15 = true;
                        }
                    }
                }
                if (var15) {
                    return null;
                }
                class246[] var18 = new class246[this.field4157.length];
                class451 var19 = this.field4102.field644;
                synchronized (this.field4102.field644) {
                    for (int var20 = 0; var20 < this.field4157.length; var20++) {
                        var18[var20] = class340.method2085((byte) 77, this.field4157[var20], this.field4102.field644, 0);
                    }
                }
                class246 var21;
                if (var18.length == 1) {
                    var21 = var18[0];
                } else {
                    var21 = new class246(var18, var18.length);
                }
                if (this.field4110 != null) {
                    var14 = var11 | 0x2000;
                }
                if (this.field4130 != null) {
                    var14 |= 0x4000;
                }
                var13 = arg7.method555(var21, var14, this.field4102.field655, 64, 768);
                if (this.field4110 != null) {
                    for (int var22 = 0; var22 < this.field4110.length; var22++) {
                        if (this.field4155 == null || var22 >= this.field4155.length) {
                            var13.method420(this.field4110[var22], this.field4121[var22]);
                        } else {
                            var13.method420(this.field4110[var22], class398.field5830[this.field4155[var22] & 0xFF]);
                        }
                    }
                }
                if (this.field4130 != null) {
                    for (int var23 = 0; var23 < this.field4130.length; var23++) {
                        var13.method415(this.field4130[var23], this.field4166[var23]);
                    }
                }
                var13.method441(var11);
                class400 var24 = this.field4102.field653;
                synchronized (this.field4102.field653) {
                    this.field4102.field653.method2395(0, var13, (long) (this.field4152 | arg7.field870 << 16));
                }
            }
            if (arg4 != null && arg2 != -1) {
                var13 = arg4.method2191(var11, arg2, arg8, arg0, var13, -65536);
            }
            var13.method441(arg3);
            return var13;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)V", line = 600)
    public static final void method1777(byte arg0) {
        field4149++;
        if (class390.field5726 == 0 || arg0 != 119) {
            return;
        }
        try {
            if ((++class225.field3268) > 1500) {
                if (class27.field335 != null) {
                    class27.field335.method998((byte) -13);
                    class27.field335 = null;
                }
                if (class73.field981 >= 1) {
                    class6.field107 = -5;
                    class390.field5726 = 0;
                    return;
                }
                if (class84.field1192 == class461.field6509) {
                    class461.field6509 = class82.field1158;
                } else {
                    class461.field6509 = class84.field1192;
                }
                class73.field981++;
                class225.field3268 = 0;
                class390.field5726 = 1;
            }
            if (class390.field5726 == 1) {
                class320.field4787 = class21.field261.method1051(class461.field6509, -4655, class226.field3315);
                class390.field5726 = 2;
            }
            if (class390.field5726 == 2) {
                if (class320.field4787.field5822 == 2) {
                    throw new IOException();
                }
                if (class320.field4787.field5822 != 1) {
                    return;
                }
                class27.field335 = new class147((Socket) class320.field4787.field5823, class21.field261);
                class320.field4787 = null;
                class27.field335.method1000(arg0 ^ 0x7547, 0, class230.field3390.field6315, class230.field3390.field6316);
                if (class395.field5816 != null) {
                    class395.field5816.method2228(arg0 ^ 0x77);
                }
                if (class398.field5829 != null) {
                    class398.field5829.method2228(0);
                }
                int var1 = class27.field335.method1002((byte) -122);
                if (class395.field5816 != null) {
                    class395.field5816.method2228(0);
                }
                if (class398.field5829 != null) {
                    class398.field5829.method2228(0);
                }
                if (var1 != 101) {
                    class390.field5726 = 0;
                    class6.field107 = var1;
                    class27.field335.method998((byte) -13);
                    class27.field335 = null;
                    return;
                }
                class390.field5726 = 3;
            }
            if (class390.field5726 == 3 && class27.field335.method1005(5000) >= 2) {
                int var2 = class27.field335.method1002((byte) 91) << 8 | class27.field335.method1002((byte) 126);
                class334.method2051(var2, (byte) 124);
                if (class212.field3196 == -1) {
                    class390.field5726 = 0;
                    class6.field107 = 6;
                    class27.field335.method998((byte) -13);
                    class27.field335 = null;
                } else {
                    class390.field5726 = 0;
                    class27.field335.method998((byte) -13);
                    class27.field335 = null;
                    class286.method1828(-3);
                }
            }
        } catch (IOException var3) {
            if (class27.field335 != null) {
                class27.field335.method998((byte) -13);
                class27.field335 = null;
            }
            if (class73.field981 >= 1) {
                class6.field107 = -4;
                class390.field5726 = 0;
            } else {
                class73.field981++;
                if (class84.field1192 == class461.field6509) {
                    class461.field6509 = class82.field1158;
                } else {
                    class461.field6509 = class84.field1192;
                }
                class225.field3268 = 0;
                class390.field5726 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ltq;Lei;IIILg;I[Lhs;Lpp;IILpp;IILnk;)Lns;", line = 748)
    public final class57 method1778(class63 arg0, class247 arg1, int arg2, int arg3, int arg4, class393 arg5, int arg6, class414[] arg7, class356 arg8, int arg9, int arg10, class356 arg11, int arg12, int arg13, class286 arg14) {
        field4164++;
        if (this.field4107 != null) {
            class273 var16 = this.method1781(arg5, true);
            return var16 == null ? null : var16.method1778(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, 16384, arg11, arg12, arg13, arg14);
        }
        int var17 = arg13;
        if (this.field4124 != 128) {
            var17 = arg13 | 0x2;
        }
        if (this.field4139 != 128) {
            var17 |= 0x5;
        }
        boolean var18 = arg8 != null || arg11 != null;
        boolean var19 = false;
        boolean var20 = false;
        boolean var21 = false;
        int var22 = arg7 == null ? 0 : arg7.length;
        for (int var23 = 0; var23 < var22; var23++) {
            class362.field5505[var23] = null;
            if (arg7[var23] != null) {
                class356 var24 = arg1.method1586(arg7[var23].field5974, (byte) 36);
                if (var24.field5389 != null) {
                    var18 = true;
                    class391.field5765[var23] = var24;
                    int var25 = arg7[var23].field5973;
                    int var26 = arg7[var23].field5966;
                    int var27 = var24.field5389[var25];
                    class362.field5505[var23] = arg1.method1580(arg10 - 16383, var27 >>> 16);
                    int var28 = var27 & 0xFFFF;
                    class157.field2194[var23] = var28;
                    if (class362.field5505[var23] != null) {
                        var20 |= class362.field5505[var23].method808(113, var28);
                        var19 |= class362.field5505[var23].method807(true, var28);
                        var21 |= var24.field5398;
                    }
                    if ((var24.field5396 || class155.field2162) && var26 != -1 && var26 < var24.field5389.length) {
                        class170.field2428[var23] = var24.field5421[var25];
                        class44.field630[var23] = arg7[var23].field5969;
                        int var29 = var24.field5389[var26];
                        class386.field5701[var23] = arg1.method1580(1, var29 >>> 16);
                        int var30 = var29 & 0xFFFF;
                        class313.field4718[var23] = var30;
                        if (class386.field5701[var23] != null) {
                            var20 |= class386.field5701[var23].method808(-114, var30);
                            var19 |= class386.field5701[var23].method807(true, var30);
                        }
                    } else {
                        class170.field2428[var23] = 0;
                        class44.field630[var23] = 0;
                        class386.field5701[var23] = null;
                        class313.field4718[var23] = -1;
                    }
                }
            }
        }
        int var31 = -1;
        int var32 = -1;
        int var33 = 0;
        class110 var34 = null;
        class110 var35 = null;
        int var36 = -1;
        int var37 = -1;
        int var38 = 0;
        class110 var39 = null;
        class110 var40 = null;
        if (var18) {
            var17 |= 0x20;
            if (arg8 != null) {
                int var41 = arg8.field5389[arg4];
                int var42 = var41 >>> 16;
                var34 = arg1.method1580(arg10 ^ 0x4001, var42);
                var31 = var41 & 0xFFFF;
                if (var34 != null) {
                    var20 |= var34.method808(arg10 - 16459, var31);
                    var19 |= var34.method807(true, var31);
                    var21 |= arg8.field5398;
                }
                if ((arg8.field5396 || class155.field2162) && arg12 != -1 && arg12 < arg8.field5389.length) {
                    int var43 = arg8.field5389[arg12];
                    var33 = arg8.field5421[arg4];
                    int var44 = var43 >>> 16;
                    if (var42 == var44) {
                        var35 = var34;
                    } else {
                        var35 = arg1.method1580(arg10 - 16383, var44);
                    }
                    var32 = var43 & 0xFFFF;
                    if (var35 != null) {
                        var20 |= var35.method808(-65, var32);
                        var19 |= var35.method807(true, var32);
                    }
                }
            }
            if (arg11 != null) {
                int var45 = arg11.field5389[arg9];
                int var46 = var45 >>> 16;
                var36 = var45 & 0xFFFF;
                var39 = arg1.method1580(1, var46);
                if (var39 != null) {
                    var20 |= var39.method808(121, var36);
                    var19 |= var39.method807(true, var36);
                    var21 |= arg11.field5398;
                }
                if ((arg11.field5396 || class155.field2162) && arg6 != -1 && arg11.field5389.length > arg6) {
                    int var47 = arg11.field5389[arg6];
                    var38 = arg11.field5421[arg9];
                    int var48 = var47 >>> 16;
                    if (var46 == var48) {
                        var40 = var39;
                    } else {
                        var40 = arg1.method1580(arg10 - 16383, var48);
                    }
                    var37 = var47 & 0xFFFF;
                    if (var40 != null) {
                        var20 |= var40.method808(105, var37);
                        var19 |= var40.method807(true, var37);
                    }
                }
            }
            if (var20) {
                var17 |= 0x80;
            }
            if (var19) {
                var17 |= 0x100;
            }
            if (var21) {
                var17 |= 0x200;
            }
        }
        class400 var49 = this.field4102.field652;
        class57 var50;
        synchronized (this.field4102.field652) {
            var50 = (class57) this.field4102.field652.method2393(-120, (long) (arg0.field870 << 16 | this.field4152));
        }
        if (var50 == null || (var17 & var50.method402()) != var17) {
            if (var50 != null) {
                var17 |= var50.method402();
            }
            int var51 = var17;
            boolean var52 = false;
            class451 var53 = this.field4102.field644;
            synchronized (this.field4102.field644) {
                int var54 = 0;
                while (true) {
                    if (var54 >= this.field4116.length) {
                        break;
                    }
                    if (this.field4116[var54] != -1 && !this.field4102.field644.method2680(0, this.field4116[var54], true)) {
                        var52 = true;
                    }
                    var54++;
                }
            }
            if (var52) {
                return null;
            }
            class246[] var55 = new class246[this.field4116.length];
            for (int var56 = 0; var56 < this.field4116.length; var56++) {
                if (this.field4116[var56] != -1) {
                    class451 var57 = this.field4102.field644;
                    synchronized (this.field4102.field644) {
                        var55[var56] = class340.method2085((byte) 77, this.field4116[var56], this.field4102.field644, 0);
                    }
                    if (this.field4136 != null && this.field4136[var56] != null && var55[var56] != null) {
                        var55[var56].method1569(0, this.field4136[var56][1], this.field4136[var56][0], this.field4136[var56][2]);
                    }
                }
            }
            class322 var58 = null;
            if (this.field4135 != -1) {
                var58 = arg14.method1829(this.field4135, (byte) -99);
            }
            if (var58 != null && var58.field4818 != null) {
                for (int var59 = 0; var59 < var58.field4818.length; var59++) {
                    if (var58.field4818[var59] != null && var59 < var55.length && var55[var59] != null) {
                        int var60 = var58.field4818[var59][0];
                        int var61 = var58.field4818[var59][1];
                        int var62 = var58.field4818[var59][2];
                        int var63 = var58.field4818[var59][3] << 3;
                        int var64 = var58.field4818[var59][4] << 3;
                        int var65 = var58.field4818[var59][5] << 3;
                        if (this.field4106 == null) {
                            this.field4106 = new int[var58.field4818.length][];
                        }
                        if (this.field4106[var59] == null) {
                            int[] var66 = this.field4106[var59] = new int[15];
                            if (var63 == 0 && var64 == 0 && var65 == 0) {
                                var66[14] = -var62;
                                var66[12] = -var60;
                                var66[0] = var66[4] = var66[8] = 32768;
                                var66[13] = -var61;
                            } else {
                                int var67 = class172.field2456[var63];
                                int var68 = class172.field2450[var63];
                                int var69 = class172.field2456[var64];
                                int var70 = class172.field2450[var64];
                                int var71 = class172.field2456[var65];
                                int var72 = class172.field2450[var65];
                                int var73 = var68 * var71 + 16384 >> 15;
                                int var74 = var68 * var72 + 16384 >> 15;
                                var66[5] = -var68;
                                var66[2] = var67 * var70 + 16384 >> 15;
                                var66[7] = -var70 * -var72 + var69 * var73 + 16384 >> 15;
                                var66[1] = -var72 * var69 + var70 * var73 + 16384 >> 15;
                                var66[0] = var69 * var71 + var70 * var74 + 16384 >> 15;
                                var66[8] = var67 * var69 + 16384 >> 15;
                                var66[3] = var67 * var72 + 16384 >> 15;
                                var66[4] = var67 * var71 + 16384 >> 15;
                                var66[6] = -var70 * var71 + var69 * var74 + 16384 >> 15;
                                var66[12] = var66[3] * -var61 + var66[0] * -var60 - (-(var66[6] * -var62) + -16384) >> 15;
                                var66[13] = var66[1] * -var60 + var66[4] * -var61 + (var66[7] * -var62) + 16384 >> 15;
                                var66[14] = var66[5] * -var61 + var66[2] * -var60 - (-(var66[8] * -var62) - 16384) >> 15;
                            }
                            var66[10] = var61;
                            var66[9] = var60;
                            var66[11] = var62;
                        }
                        if (var63 != 0 || var64 != 0 || var65 != 0) {
                            var55[var59].method1571(-15354, var64, var63, var65);
                        }
                        if (var60 != 0 || var61 != 0 || var62 != 0) {
                            var55[var59].method1569(0, var61, var60, var62);
                        }
                    }
                }
            }
            class246 var75;
            if (var55.length == 1) {
                var75 = var55[0];
            } else {
                var75 = new class246(var55, var55.length);
            }
            if (this.field4110 != null) {
                var51 = var17 | 0x2000;
            }
            if (this.field4130 != null) {
                var51 |= 0x4000;
            }
            var50 = arg0.method555(var75, var51, this.field4102.field655, this.field4115 + 64, this.field4120 + 850);
            if (this.field4110 != null) {
                for (int var76 = 0; var76 < this.field4110.length; var76++) {
                    if (this.field4155 == null || this.field4155.length <= var76) {
                        var50.method420(this.field4110[var76], this.field4121[var76]);
                    } else {
                        var50.method420(this.field4110[var76], class398.field5830[this.field4155[var76] & 0xFF]);
                    }
                }
            }
            if (this.field4130 != null) {
                for (int var77 = 0; var77 < this.field4130.length; var77++) {
                    var50.method415(this.field4130[var77], this.field4166[var77]);
                }
            }
            var50.method441(var17);
            class400 var78 = this.field4102.field652;
            synchronized (this.field4102.field652) {
                this.field4102.field652.method2395(0, var50, (long) (arg0.field870 << 16 | this.field4152));
            }
        }
        class57 var79 = var50.method437((byte) 4, var17, true);
        if (!var18) {
            return var79;
        }
        int var80 = 0;
        int var81 = 1;
        while (var22 > var80) {
            if (class362.field5505[var80] != null) {
                var79.method427(class386.field5701[var80], class157.field2194[var80], this.field4106[var80], class391.field5765[var80].field5398, var81, 0, (byte) 112, class313.field4718[var80], class44.field630[var80] - 1, class170.field2428[var80], class362.field5505[var80]);
            }
            var81 <<= 0x1;
            var80++;
        }
        if (var34 != null && var39 != null) {
            var79.method440(var34, arg8.field5393, var31, var40, var33, var38, var37, var36, var39, arg11.field5398 | arg8.field5398, var32, var35, arg2 - 1, arg3 - 1, 65535);
        } else if (var34 != null) {
            var79.method410(var34, 0, var35, var32, arg10 - 20606, arg8.field5398, var31, var33, arg3 - 1);
        } else if (var39 != null) {
            var79.method410(var39, 0, var40, var37, -4222, arg11.field5398, var36, var38, arg2 - 1);
        }
        if (arg10 != 16384) {
            return null;
        }
        for (int var82 = 0; var82 < var22; var82++) {
            class362.field5505[var82] = null;
            class386.field5701[var82] = null;
            class391.field5765[var82] = null;
        }
        if (this.field4139 != 128 || this.field4124 != 128) {
            var79.method446(this.field4139, this.field4124, this.field4139);
        }
        var79.method441(arg13);
        return var79;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)Z", line = 1204)
    public final boolean method1779(int arg0) {
        if (arg0 <= 71) {
            return true;
        }
        field4132++;
        if (this.field4107 == null) {
            return this.field4100 != -1 || this.field4109 != -1 || this.field4108 != -1;
        }
        for (int var2 = 0; var2 < this.field4107.length; var2++) {
            if (this.field4107[var2] != -1) {
                class273 var3 = this.field4102.method334(this.field4107[var2], (byte) 104);
                if (var3.field4100 != -1 || var3.field4109 != -1 || var3.field4108 != -1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(III)I", line = 1254)
    public final int method1780(int arg0, int arg1, int arg2) {
        field4099++;
        if (arg1 != 15) {
            this.method1786(31);
        }
        if (this.field4134 == null) {
            return arg0;
        } else {
            class145 var4 = (class145) this.field4134.method2305((long) arg2, (byte) 115);
            return var4 == null ? arg0 : var4.field2054;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lg;Z)Ldr;", line = 1275)
    public final class273 method1781(class393 arg0, boolean arg1) {
        field4125++;
        int var3 = -1;
        if (this.field4112 != -1) {
            var3 = arg0.method28(5, this.field4112);
        } else if (this.field4095 != -1) {
            var3 = arg0.method19(-91, this.field4095);
        }
        if (!arg1) {
            return null;
        } else if (var3 < 0 || var3 >= this.field4107.length - 1 || this.field4107[var3] == -1) {
            int var4 = this.field4107[this.field4107.length - 1];
            return var4 == -1 ? null : this.field4102.method334(var4, (byte) 104);
        } else {
            return this.field4102.method334(this.field4107[var3], (byte) 104);
        }
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(B)V", line = 1306)
    public static void method1782(byte arg0) {
        if (arg0 == -16) {
            field4143 = null;
            field4114 = null;
            field4111 = null;
            field4160 = null;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(BLre;)V", line = 1336)
    public final void method1783(byte arg0, class446 arg1) {
        while (true) {
            int var3 = arg1.method2628(49152);
            if (var3 == 0) {
                if (arg0 <= 12) {
                    this.field4147 = -76;
                }
                field4128++;
                return;
            }
            this.method1775(var3, arg1, 8931);
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ltd;B)V", line = 1364)
    public static final void method1784(class351 arg0, byte arg1) {
        if (arg1 <= -70) {
            field4144++;
            class174.field2471 = arg0;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILjava/lang/String;B)Ljava/lang/String;", line = 1416)
    public final String method1785(int arg0, String arg1, byte arg2) {
        if (arg2 > -31) {
            return null;
        }
        field4129++;
        if (this.field4134 == null) {
            return arg1;
        } else {
            class81 var4 = (class81) this.field4134.method2305((long) arg0, (byte) 50);
            return var4 == null ? arg1 : var4.field1141;
        }
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(I)V", line = 1437)
    public final void method1786(int arg0) {
        if (arg0 != 0) {
            this.method1780(23, -89, -78);
        }
        field4103++;
        if (this.field4116 == null) {
            this.field4116 = new int[0];
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(BLg;)Z", line = 1450)
    public final boolean method1787(byte arg0, class393 arg1) {
        field4126++;
        if (this.field4107 == null) {
            return true;
        } else if (arg0 == 28) {
            int var3 = -1;
            if (this.field4112 != -1) {
                var3 = arg1.method28(5, this.field4112);
            } else if (this.field4095 != -1) {
                var3 = arg1.method19(-101, this.field4095);
            }
            if (var3 < 0 || this.field4107.length - 1 <= var3 || this.field4107[var3] == -1) {
                int var4 = this.field4107[this.field4107.length - 1];
                return var4 != -1;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }
}
