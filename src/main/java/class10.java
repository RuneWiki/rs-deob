import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class10 {

    @OriginalMember(owner = "client!hba", name = "d", descriptor = "[Ljava/lang/String;")
    public String[] field142 = new String[5];

    @OriginalMember(owner = "client!hba", name = "C", descriptor = "Z")
    public boolean field167 = false;

    @OriginalMember(owner = "client!hba", name = "H", descriptor = "I")
    private int field172 = 128;

    @OriginalMember(owner = "client!hba", name = "g", descriptor = "B")
    private byte field145 = 0;

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "I")
    public int field141 = 256;

    @OriginalMember(owner = "client!hba", name = "G", descriptor = "Z")
    public boolean field171 = false;

    @OriginalMember(owner = "client!hba", name = "k", descriptor = "Ljava/lang/String;")
    public String field149 = "null";

    @OriginalMember(owner = "client!hba", name = "j", descriptor = "I")
    public int field148 = -1;

    @OriginalMember(owner = "client!hba", name = "n", descriptor = "I")
    public int field152 = 255;

    @OriginalMember(owner = "client!hba", name = "z", descriptor = "I")
    private int field164 = 0;

    @OriginalMember(owner = "client!hba", name = "E", descriptor = "[I")
    private int[] field169 = null;

    @OriginalMember(owner = "client!hba", name = "t", descriptor = "Z")
    public boolean field158 = false;

    @OriginalMember(owner = "client!hba", name = "v", descriptor = "I")
    public int field160 = 0;

    @OriginalMember(owner = "client!hba", name = "V", descriptor = "Z")
    public boolean field186 = false;

    @OriginalMember(owner = "client!hba", name = "l", descriptor = "I")
    public int field150 = 0;

    @OriginalMember(owner = "client!hba", name = "jb", descriptor = "I")
    public int field200 = 960;

    @OriginalMember(owner = "client!hba", name = "pb", descriptor = "I")
    private int field206 = 0;

    @OriginalMember(owner = "client!hba", name = "r", descriptor = "Z")
    public boolean field156 = false;

    @OriginalMember(owner = "client!hba", name = "eb", descriptor = "I")
    public int field195 = -1;

    @OriginalMember(owner = "client!hba", name = "nb", descriptor = "I")
    public int field204 = -1;

    @OriginalMember(owner = "client!hba", name = "I", descriptor = "I")
    public int field173 = 0;

    @OriginalMember(owner = "client!hba", name = "q", descriptor = "I")
    public int field155 = 64;

    @OriginalMember(owner = "client!hba", name = "y", descriptor = "I")
    public int field163 = 0;

    @OriginalMember(owner = "client!hba", name = "R", descriptor = "I")
    public int field182 = 0;

    @OriginalMember(owner = "client!hba", name = "vb", descriptor = "[I")
    public int[] field212 = null;

    @OriginalMember(owner = "client!hba", name = "h", descriptor = "Z")
    public boolean field146 = false;

    @OriginalMember(owner = "client!hba", name = "Q", descriptor = "I")
    private int field181 = 0;

    @OriginalMember(owner = "client!hba", name = "qb", descriptor = "I")
    public int field207 = -1;

    @OriginalMember(owner = "client!hba", name = "sb", descriptor = "I")
    public int field209 = -1;

    @OriginalMember(owner = "client!hba", name = "M", descriptor = "Z")
    public boolean field177 = true;

    @OriginalMember(owner = "client!hba", name = "P", descriptor = "I")
    public int field180 = -1;

    @OriginalMember(owner = "client!hba", name = "ob", descriptor = "I")
    private int field205 = 0;

    @OriginalMember(owner = "client!hba", name = "w", descriptor = "Z")
    public boolean field161 = true;

    @OriginalMember(owner = "client!hba", name = "tb", descriptor = "I")
    private int field210 = 0;

    @OriginalMember(owner = "client!hba", name = "T", descriptor = "B")
    private byte field184 = 0;

    @OriginalMember(owner = "client!hba", name = "Eb", descriptor = "I")
    private int field221 = 128;

    @OriginalMember(owner = "client!hba", name = "mb", descriptor = "I")
    public int field203 = -1;

    @OriginalMember(owner = "client!hba", name = "xb", descriptor = "Z")
    public boolean field214 = true;

    @OriginalMember(owner = "client!hba", name = "Lb", descriptor = "I")
    public int field228 = 2;

    @OriginalMember(owner = "client!hba", name = "Z", descriptor = "I")
    public int field190 = -1;

    @OriginalMember(owner = "client!hba", name = "i", descriptor = "Z")
    public boolean field147 = false;

    @OriginalMember(owner = "client!hba", name = "F", descriptor = "Z")
    public boolean field170 = false;

    @OriginalMember(owner = "client!hba", name = "ub", descriptor = "I")
    public int field211 = 0;

    @OriginalMember(owner = "client!hba", name = "L", descriptor = "I")
    private int field176 = 128;

    @OriginalMember(owner = "client!hba", name = "Bb", descriptor = "Z")
    public boolean field218 = false;

    @OriginalMember(owner = "client!hba", name = "Gb", descriptor = "I")
    public int field223 = -1;

    @OriginalMember(owner = "client!hba", name = "db", descriptor = "I")
    public int field194 = 256;

    @OriginalMember(owner = "client!hba", name = "W", descriptor = "Z")
    public boolean field187 = false;

    @OriginalMember(owner = "client!hba", name = "cb", descriptor = "Z")
    public boolean field193 = true;

    @OriginalMember(owner = "client!hba", name = "Hb", descriptor = "Z")
    public boolean field224 = false;

    @OriginalMember(owner = "client!hba", name = "Ib", descriptor = "I")
    public int field225 = 1;

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "I")
    private int field140 = 0;

    @OriginalMember(owner = "client!hba", name = "Nb", descriptor = "I")
    public int field230 = 1;

    @OriginalMember(owner = "client!hba", name = "Ob", descriptor = "I")
    public int field231 = -1;

    @OriginalMember(owner = "client!hba", name = "Db", descriptor = "I")
    private int field220 = 0;

    @OriginalMember(owner = "client!hba", name = "e", descriptor = "I")
    public int field143 = -1;

    @OriginalMember(owner = "client!hba", name = "bb", descriptor = "I")
    private int field192 = 0;

    @OriginalMember(owner = "client!hba", name = "Rb", descriptor = "I")
    private int field234 = 0;

    @OriginalMember(owner = "client!hba", name = "f", descriptor = "I")
    private int field144 = -1;

    @OriginalMember(owner = "client!hba", name = "Pb", descriptor = "I")
    public int field232 = 0;

    @OriginalMember(owner = "client!hba", name = "X", descriptor = "I")
    private int field188 = -1;

    @OriginalMember(owner = "client!hba", name = "Kb", descriptor = "I")
    private int field227 = -1;

    @OriginalMember(owner = "client!hba", name = "Ab", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field217 = new BigInteger("b7007eba1e05bce0a1bc631f72a729f2e73f80df87b2adc86866534fd85022e9e94c50c38bc0a649a05dc5ce86d65cc85cb3a9eed097f9564f81e0bcfdb41de9355a157a8480305a74962a5adbf12a4025dff4da32db332195b1eec7e72f5a9f1a84c54332f6c9f633133a9b6c19b63999ab2efe9d78060dd920a94b7f98c879abcf1dd27f2c6f8f4a9e9098e0ca59625cab379368146355f98998e6cac835f5dc946e231d85efb49e7b59482685d3dd6d37fabe0a0216f74713a405b4502ebbd31da8f1e7fb57d19be26f0fdfd03bdf4e6e06cce70ccc1d9fa92376b4ecb8c32a7a6b26795fedffbd4eddc889810dd0b3375d84272bc657645333bfc33d7ed7bb206db9e46845a10cacfb27d35ed458afd76990e179d6260fecd4588c718e2a53b69d970c2aa02da0ec22038c4b77f0ee00609da566d259beedce169a72a2c9fa03a3f1ff370d85768a6ace470932f48b8568beda5b41a51333bf24c1d3a1a47e87204e9e5622deff340065349d178a642a70e825af6ebb011fd8ef3c2ca0e679483247d013894833ce57966400023239cba6c2936027f973359cd0c4d209fd644798a8eb9b291bb61ff31e6fee41e33da65a3c7f7f2bf013823fad5a225176503aeff1b660c69739cee01b187c54bcba033bc223259c4c8d7bbaebb84d605cd93e5c490c3d55eb26356c9a6db3a8f81ea10ac513bf701ef3f440f81a289f71", 16);

    @OriginalMember(owner = "client!hba", name = "Vb", descriptor = "I")
    public static int field238 = 0;

    @OriginalMember(owner = "client!hba", name = "Sb", descriptor = "Ljb;")
    public static class493 field235 = null;

    @OriginalMember(owner = "client!hba", name = "o", descriptor = "B")
    private byte field153;

    @OriginalMember(owner = "client!hba", name = "p", descriptor = "B")
    private byte field154;

    @OriginalMember(owner = "client!hba", name = "Fb", descriptor = "B")
    private byte field222;

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!hba", name = "m", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!hba", name = "u", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!hba", name = "x", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!hba", name = "A", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!hba", name = "D", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!hba", name = "K", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!hba", name = "N", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!hba", name = "S", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!hba", name = "Y", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!hba", name = "fb", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!hba", name = "gb", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!hba", name = "rb", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!hba", name = "wb", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!hba", name = "yb", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!hba", name = "zb", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!hba", name = "Mb", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!hba", name = "Qb", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!hba", name = "Tb", descriptor = "I")
    public int field236;

    @OriginalMember(owner = "client!hba", name = "Ub", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!hba", name = "hb", descriptor = "Lkk;")
    private class188 field198;

    @OriginalMember(owner = "client!hba", name = "s", descriptor = "Lqh;")
    public class67 field157;

    @OriginalMember(owner = "client!hba", name = "B", descriptor = "[B")
    private byte[] field166;

    @OriginalMember(owner = "client!hba", name = "ib", descriptor = "[B")
    private byte[] field199;

    @OriginalMember(owner = "client!hba", name = "J", descriptor = "[I")
    public int[] field174;

    @OriginalMember(owner = "client!hba", name = "Cb", descriptor = "[I")
    public int[] field219;

    @OriginalMember(owner = "client!hba", name = "Jb", descriptor = "[I")
    public int[] field226;

    @OriginalMember(owner = "client!hba", name = "O", descriptor = "[S")
    private short[] field179;

    @OriginalMember(owner = "client!hba", name = "U", descriptor = "[S")
    private short[] field185;

    @OriginalMember(owner = "client!hba", name = "ab", descriptor = "[S")
    private short[] field191;

    @OriginalMember(owner = "client!hba", name = "lb", descriptor = "[S")
    private short[] field202;

    @OriginalMember(owner = "client!hba", name = "kb", descriptor = "[[I")
    private int[][] field201;

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(IB)Z")
    public final boolean method58(int arg0, byte arg1) {
        field165++;
        if (arg0 == -1) {
            return false;
        }
        if (arg1 < 78) {
            method66(29);
        }
        if (this.field231 == arg0) {
            return true;
        }
        if (this.field212 != null) {
            for (int var3 = 0; var3 < this.field212.length; var3++) {
                if (this.field212[var3] == arg0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(Ljava/lang/String;IB)Ljava/lang/String;")
    public final String method59(String arg0, int arg1, byte arg2) {
        field197++;
        if (this.field198 == null) {
            return arg0;
        } else if (arg2 <= 19) {
            return null;
        } else {
            class427 var4 = (class427) this.field198.method1180((byte) 26, (long) arg1);
            return var4 == null ? arg0 : var4.field5991;
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(ZI)Z")
    public final boolean method60(boolean arg0, int arg1) {
        field183++;
        if (this.field201 == null) {
            return true;
        }
        class323 var3 = this.field157.field811;
        synchronized (this.field157.field811) {
            if (!arg0) {
                this.method74(null, (byte) 55, 80, 12, 14);
            }
            for (int var4 = 0; var4 < this.field199.length; var4++) {
                if (this.field199[var4] == arg1) {
                    for (int var5 = 0; var5 < this.field201[var4].length; var5++) {
                        if (!this.field157.field811.method2097((byte) -107, this.field201[var4][var5], 0)) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(III)I")
    public final int method61(int arg0, int arg1, int arg2) {
        field178++;
        if (this.field198 == null) {
            return arg2;
        }
        class756 var4 = (class756) this.field198.method1180((byte) 26, (long) arg0);
        if (var4 == null) {
            return arg2;
        } else {
            if (arg1 <= 28) {
                field175 = -72;
            }
            return var4.field10518;
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(B)Z")
    public final boolean method62(byte arg0) {
        field196++;
        if (this.field226 == null) {
            return this.field223 != -1 || this.field174 != null;
        }
        for (int var2 = 0; var2 < this.field226.length; var2++) {
            if (this.field226[var2] != -1) {
                class10 var3 = this.field157.method558((byte) -116, this.field226[var2]);
                if (var3.field223 != -1 || var3.field174 != null) {
                    return true;
                }
            }
        }
        if (arg0 != 114) {
            this.field150 = 67;
        }
        return false;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(ILha;I)Lqm;")
    public static final class143 method63(int arg0, class58 arg1, int arg2) {
        int var3 = 30 % ((arg0 - 21) / 62);
        field151++;
        class655 var4 = class296.method1922(arg1, arg2, true, (byte) -22);
        return var4 == null ? null : var4.field8990;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(I)Z")
    public final boolean method64(int arg0) {
        field189++;
        if (this.field201 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 > -68) {
            method72(-40, 108L);
        }
        class323 var3 = this.field157.field811;
        synchronized (this.field157.field811) {
            for (int var4 = 0; var4 < this.field201.length; var4++) {
                for (int var5 = 0; var5 < this.field201[var4].length; var5++) {
                    var2 &= this.field157.field811.method2097((byte) -105, this.field201[var4][var5], 0);
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lee;B)V")
    public final void method65(class675 arg0, byte arg1) {
        if (arg1 > -6) {
            return;
        }
        field215++;
        while (true) {
            int var3 = arg0.method3750((byte) 35);
            if (var3 == 0) {
                return;
            }
            this.method76(10, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "(I)V")
    public static void method66(int arg0) {
        int var1 = -20 / ((arg0 - 23) / 43);
        field235 = null;
        field217 = null;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lte;I)Lhba;")
    public final class10 method67(class613 arg0, int arg1) {
        field159++;
        int var3 = -1;
        if (~this.field144 != arg1) {
            var3 = arg0.method1990(this.field144, arg1 ^ 0x6947);
        } else if (this.field188 != -1) {
            var3 = arg0.method1992(-1, this.field188);
        }
        if (var3 < 0 || var3 >= (this.field226.length - 1) || this.field226[var3] == -1) {
            int var4 = this.field226[this.field226.length - 1];
            return var4 == -1 ? null : this.field157.method558((byte) -117, var4);
        } else {
            return this.field157.method558((byte) 27, this.field226[var3]);
        }
    }

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "(I)I")
    public final int method68(int arg0) {
        if (arg0 <= 9) {
            return -91;
        }
        field139++;
        if (this.field212 == null) {
            return -1;
        }
        int var2 = (int) ((double) this.field234 * Math.random());
        int var3;
        for (var3 = 0; var2 >= this.field169[var3]; var3++) {
            var2 -= this.field169[var3];
        }
        return this.field212[var3];
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "([BIILjava/io/File;)V")
    public static final void method69(byte[] arg0, int arg1, int arg2, File arg3) throws IOException {
        field213++;
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg3)));
        try {
            var4.readFully(arg0, 0, arg1);
        } catch (EOFException var5) {
        }
        if (arg2 != -21895) {
            method72(1, 112L);
        }
        var4.close();
    }

    @OriginalMember(owner = "client!hba", name = "d", descriptor = "(I)V")
    public final void method70(int arg0) {
        if (arg0 != 5) {
            this.field149 = null;
        }
        field162++;
        if (this.field207 == -1) {
            this.field207 = 0;
            if (this.field199 != null && this.field199.length == 1 && this.field199[0] == 10) {
                this.field207 = 1;
            }
            for (int var2 = 0; var2 < 5; var2++) {
                if (this.field142[var2] != null) {
                    this.field207 = 1;
                    break;
                }
            }
        }
        if (this.field203 == -1) {
            this.field203 = this.field228 == 0 ? 0 : 1;
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(IILs;Ls;ZIIILha;II)Lqha;")
    public final class102 method71(int arg0, int arg1, class278 arg2, class278 arg3, boolean arg4, int arg5, int arg6, int arg7, class58 arg8, int arg9, int arg10) {
        field208++;
        if (class364.method2322(arg10, (byte) -88)) {
            arg10 = 4;
        }
        long var12 = (long) ((this.field236 << 10) - (-(arg10 << 3) - arg5));
        long var14 = var12 | (long) (arg8.field700 << 29);
        int var16 = arg9;
        if (this.field184 == 3) {
            var16 = arg9 | 0x7;
        } else {
            if (this.field184 != 0 || this.field205 != 0) {
                var16 = arg9 | 0x2;
            }
            if (this.field164 != 0) {
                var16 |= 0x1;
            }
            if (this.field140 != 0) {
                var16 |= 0x4;
            }
        }
        if (arg4) {
            var16 |= 0x40000;
        }
        class714 var17 = this.field157.field827;
        class102 var19;
        synchronized (this.field157.field827) {
            if (arg0 > -63) {
                return null;
            }
            var19 = (class102) this.field157.field827.method4022(var14, (byte) -101);
        }
        class471 var20 = var19 == null ? null : var19.field1213;
        class180 var21 = null;
        class471 var22;
        if (var20 != null && arg8.method466(var20.method228(), var16) == 0) {
            var22 = var19.field1213;
            var21 = var19.field1214;
            if (arg4 && var21 == null) {
                var21 = var19.field1214 = var22.method217(null);
            }
        } else {
            if (var20 != null) {
                var16 = arg8.method479(var16, var20.method228());
            }
            int var23 = var16;
            if (arg10 == 10 && arg5 > 3) {
                var23 = var16 | 0x5;
            }
            var22 = this.method74(arg8, (byte) 109, arg5, var23, arg10);
            if (var22 == null) {
                return null;
            }
            if (arg10 == 10 && arg5 > 3) {
                var22.method231(2048);
            }
            if (arg4) {
                var21 = var22.method217(null);
            }
            var22.method242(var16);
            class102 var24 = new class102();
            var24.field1213 = var22;
            var24.field1214 = var21;
            class714 var25 = this.field157.field827;
            synchronized (this.field157.field827) {
                this.field157.field827.method4018((byte) 126, var24, var14);
            }
        }
        boolean var26 = this.field184 != 0 && (arg2 != null || arg3 != null);
        boolean var27 = this.field164 != 0 || this.field205 != 0 || this.field140 != 0;
        class471 var28;
        if (var26 || var27) {
            var28 = var22.method226((byte) 0, var16, true);
            if (var26) {
                var28.method244(this.field184, this.field227, arg2, arg3, arg6, arg1, arg7);
            }
            if (var27) {
                var28.method235(this.field164, this.field205, this.field140);
            }
            var28.method242(arg9);
        } else {
            var28 = var22.method226((byte) 0, arg9, true);
        }
        class625.field8692.field1213 = var28;
        class625.field8692.field1214 = var21;
        return class625.field8692;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method72(int arg0, long arg1) {
        field233++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                char var9 = class138.field2006[(int) (var7 - (arg1 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var9 = ' ';
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            if (arg0 <= 14) {
                field238 = -68;
            }
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lee;I)V")
    private final void method73(class675 arg0, int arg1) {
        field216++;
        int var3 = arg0.method3750((byte) 35);
        if (arg1 <= 95) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0.field9146++;
            int var5 = arg0.method3750((byte) 35);
            arg0.field9146 += var5 * 2;
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lha;BIII)Lka;")
    private final class471 method74(class58 arg0, byte arg1, int arg2, int arg3, int arg4) {
        field237++;
        int var6 = this.field181 + 64;
        int var7 = this.field206 + 850;
        int var8 = arg3;
        boolean var9 = this.field187 || arg4 == 2 && arg2 > 3;
        if (var9) {
            arg3 |= 0x10;
        }
        if (arg2 == 0) {
            if (this.field172 != 128 || this.field220 != 0) {
                arg3 |= 0x1;
            }
            if (this.field176 != 128 || this.field210 != 0) {
                arg3 |= 0x4;
            }
        } else {
            arg3 |= 0xD;
        }
        if (this.field221 != 128 || this.field192 != 0) {
            arg3 |= 0x2;
        }
        if (this.field202 != null) {
            arg3 |= 0x4000;
        }
        if (this.field179 != null) {
            arg3 |= 0x8000;
        }
        if (this.field145 != 0) {
            arg3 |= 0x80000;
        }
        class471 var10 = null;
        if (this.field199 == null) {
            return null;
        }
        int var11 = -1;
        for (int var12 = 0; var12 < this.field199.length; var12++) {
            if (this.field199[var12] == arg4) {
                var11 = var12;
                break;
            }
        }
        if (var11 == -1) {
            return null;
        }
        int var13 = this.field201[var11].length;
        if (var13 > 0) {
            long var14 = (long) arg0.field700;
            for (int var16 = 0; var16 < var13; var16++) {
                var14 = var14 * 67783L + (long) this.field201[var11][var16];
            }
            class714 var17 = this.field157.field826;
            synchronized (this.field157.field826) {
                var10 = (class471) this.field157.field826.method4022(var14, (byte) -73);
            }
            if (var10 != null) {
                if (var10.method236() != var6) {
                    arg3 |= 0x1000;
                }
                if (var10.method265() != var7) {
                    arg3 |= 0x2000;
                }
            }
            if (var10 == null || arg0.method466(var10.method228(), arg3) != 0) {
                int var18 = arg3 | 0x1F01F;
                if (var10 != null) {
                    var18 = arg0.method479(var18, var10.method228());
                }
                class6 var19 = null;
                class6[] var20 = class152.field2148;
                synchronized (class152.field2148) {
                    for (int var21 = 0; var21 < var13; var21++) {
                        class323 var22 = this.field157.field811;
                        synchronized (this.field157.field811) {
                            var19 = class393.method2470(0, this.field157.field811, this.field201[var11][var21] & 0xFFFF, 0);
                        }
                        if (var19 == null) {
                            return null;
                        }
                        if (var19.field62 < 13) {
                            var19.method33(2, true);
                        }
                        if (var13 > 1) {
                            class152.field2148[var21] = var19;
                        }
                    }
                    if (var13 > 1) {
                        var19 = new class6(class152.field2148, var13);
                    }
                }
                var10 = arg0.method397(var19, var18, this.field157.field829, var6, var7);
                class714 var24 = this.field157.field826;
                synchronized (this.field157.field826) {
                    this.field157.field826.method4018((byte) 126, var10, var14);
                }
            }
        }
        class471 var25 = var10.method226((byte) 0, arg3, true);
        if (var6 != var10.method236()) {
            var25.method223(var6);
        }
        if (var7 != var10.method265()) {
            var25.method250(var7);
        }
        if (var9) {
            var25.method263();
        }
        if (arg4 == 4 && arg2 > 3) {
            var25.method252(2048);
            var25.method235(180, 0, -180);
        }
        int var26 = arg2 & 0x3;
        if (var26 == 1) {
            var25.method252(4096);
        } else if (var26 == 2) {
            var25.method252(8192);
        } else if (var26 == 3) {
            var25.method252(12288);
        }
        if (this.field202 != null) {
            for (int var27 = 0; var27 < this.field202.length; var27++) {
                if (this.field166 == null || this.field166.length <= var27) {
                    var25.method261(this.field202[var27], this.field185[var27]);
                } else {
                    var25.method261(this.field202[var27], class187.field2518[this.field166[var27] & 0xFF]);
                }
            }
        }
        if (this.field179 != null) {
            for (int var28 = 0; var28 < this.field179.length; var28++) {
                var25.method255(this.field179[var28], this.field191[var28]);
            }
        }
        if (arg1 <= 67) {
            this.method68(-118);
        }
        if (this.field145 != 0) {
            var25.method225(this.field154, this.field153, this.field222, this.field145 & 0xFF);
        }
        if (this.field172 != 128 || this.field221 != 128 || this.field176 != 128) {
            var25.method258(this.field172, this.field221, this.field176);
        }
        if (this.field220 != 0 || this.field192 != 0 || this.field210 != 0) {
            var25.method235(this.field220, this.field192, this.field210);
        }
        var25.method242(var8);
        return var25;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(IILha;IILs;IIIILmga;ILs;I)Lka;")
    public final class471 method75(int arg0, int arg1, class58 arg2, int arg3, int arg4, class278 arg5, int arg6, int arg7, int arg8, int arg9, class709 arg10, int arg11, class278 arg12, int arg13) {
        if (class364.method2322(arg11, (byte) -88)) {
            arg11 = 4;
        }
        field229++;
        long var15 = (long) ((this.field236 << 10) + (arg11 << 3) + arg8);
        int var17 = arg1;
        long var18 = var15 | (long) (arg2.field700 << 29);
        if (arg10 != null) {
            arg1 |= arg10.method3980(arg9, 1024, false, arg6);
        }
        if (this.field184 == 3) {
            arg1 |= 0x7;
        } else {
            if (this.field184 != 0 || this.field205 != 0) {
                arg1 |= 0x2;
            }
            if (this.field164 != 0) {
                arg1 |= 0x1;
            }
            if (this.field140 != 0) {
                arg1 |= 0x4;
            }
        }
        if (arg11 == 10 && arg8 > 3) {
            arg1 |= 0x5;
        }
        class714 var20 = this.field157.field828;
        class471 var21;
        synchronized (this.field157.field828) {
            var21 = (class471) this.field157.field828.method4022(var18, (byte) -75);
        }
        if (var21 == null || arg2.method466(var21.method228(), arg1) != 0) {
            if (var21 != null) {
                arg1 = arg2.method479(arg1, var21.method228());
            }
            var21 = this.method74(arg2, (byte) 116, arg8, arg1, arg11);
            if (var21 == null) {
                return null;
            }
            class714 var22 = this.field157.field828;
            synchronized (this.field157.field828) {
                this.field157.field828.method4018((byte) 127, var21, var18);
            }
        }
        boolean var23 = false;
        if (arg10 != null) {
            var23 = true;
            var21 = arg10.method3974((byte) 1, arg1, 256, arg6, arg0, var21, arg8 & 0x3, arg9);
        }
        if (arg11 == 10 && arg8 > 3) {
            if (!var23) {
                var21 = var21.method226((byte) 3, arg1, true);
                var23 = true;
            }
            var21.method231(2048);
        }
        if (this.field184 != 0) {
            if (!var23) {
                var21 = var21.method226((byte) 3, arg1, true);
                var23 = true;
            }
            var21.method244(this.field184, this.field227, arg5, arg12, arg13, arg3, arg4);
        }
        if (this.field164 != arg7 || this.field205 != 0 || this.field140 != 0) {
            if (!var23) {
                var21 = var21.method226((byte) 3, arg1, true);
                var23 = true;
            }
            var21.method235(this.field164, this.field205, this.field140);
        }
        if (var23) {
            var21.method242(var17);
        }
        return var21;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(ILee;I)V")
    private final void method76(int arg0, class675 arg1, int arg2) {
        if (arg0 != 10) {
            return;
        }
        field168++;
        if (arg2 == 1 || arg2 == 5) {
            if (arg2 == 5 && this.field157.field824) {
                this.method73(arg1, arg0 ^ 0x67);
            }
            int var26 = arg1.method3750((byte) 35);
            this.field201 = new int[var26][];
            this.field199 = new byte[var26];
            for (int var27 = 0; var27 < var26; var27++) {
                this.field199[var27] = arg1.method3719(class286.method1875(arg0, 1854307130));
                int var28 = arg1.method3750((byte) 35);
                this.field201[var27] = new int[var28];
                for (int var29 = 0; var29 < var28; var29++) {
                    this.field201[var27][var29] = arg1.method3757((byte) -65);
                }
            }
            if (arg2 == 5 && !this.field157.field824) {
                this.method73(arg1, arg0 + 89);
            }
        } else if (arg2 == 2) {
            this.field149 = arg1.method3697(-1);
        } else if (arg2 == 14) {
            this.field225 = arg1.method3750((byte) 35);
        } else if (arg2 == 15) {
            this.field230 = arg1.method3750((byte) 35);
        } else if (arg2 == 17) {
            this.field228 = 0;
            this.field161 = false;
        } else if (arg2 == 18) {
            this.field161 = false;
        } else if (arg2 == 19) {
            this.field207 = arg1.method3750((byte) 35);
        } else if (arg2 == 21) {
            this.field184 = 1;
        } else if (arg2 == 22) {
            this.field224 = true;
        } else if (arg2 == 23) {
            this.field195 = 1;
        } else if (arg2 == 24) {
            this.field231 = arg1.method3757((byte) -65);
            if (this.field231 == 65535) {
                this.field231 = -1;
                return;
            }
        } else if (arg2 == 27) {
            this.field228 = 1;
            return;
        } else if (arg2 == 28) {
            this.field155 = arg1.method3750((byte) 35) << 2;
            return;
        } else if (arg2 == 29) {
            this.field181 = arg1.method3719(arg0 + 1854307110);
            return;
        } else if (arg2 == 39) {
            this.field206 = arg1.method3719(1854307120) * 5;
            return;
        } else if (arg2 < 30 || arg2 >= 35) {
            if (arg2 != 40) {
                if (arg2 != 41) {
                    if (arg2 == 42) {
                        int var4 = arg1.method3750((byte) 35);
                        this.field166 = new byte[var4];
                        for (int var5 = 0; var5 < var4; var5++) {
                            this.field166[var5] = arg1.method3719(class286.method1875(arg0, 1854307130));
                        }
                        return;
                    }
                    if (arg2 != 62) {
                        if (arg2 == 64) {
                            this.field214 = false;
                            return;
                        }
                        if (arg2 == 65) {
                            this.field172 = arg1.method3757((byte) -65);
                            return;
                        }
                        if (arg2 == 66) {
                            this.field221 = arg1.method3757((byte) -65);
                            return;
                        }
                        if (arg2 != 67) {
                            if (arg2 == 69) {
                                this.field182 = arg1.method3750((byte) 35);
                                return;
                            }
                            if (arg2 != 70) {
                                if (arg2 == 71) {
                                    this.field192 = arg1.method3706((byte) 53) << 2;
                                    return;
                                }
                                if (arg2 != 72) {
                                    if (arg2 == 73) {
                                        this.field147 = true;
                                        return;
                                    }
                                    if (arg2 == 74) {
                                        this.field167 = true;
                                        return;
                                    }
                                    if (arg2 == 75) {
                                        this.field203 = arg1.method3750((byte) 35);
                                        return;
                                    }
                                    if (arg2 != 77 && arg2 != 92) {
                                        if (arg2 == 78) {
                                            this.field223 = arg1.method3757((byte) -65);
                                            this.field232 = arg1.method3750((byte) 35);
                                            return;
                                        }
                                        if (arg2 == 79) {
                                            this.field160 = arg1.method3757((byte) -65);
                                            this.field211 = arg1.method3757((byte) -65);
                                            this.field232 = arg1.method3750((byte) 35);
                                            int var6 = arg1.method3750((byte) 35);
                                            this.field174 = new int[var6];
                                            for (int var7 = 0; var7 < var6; var7++) {
                                                this.field174[var7] = arg1.method3757((byte) -65);
                                            }
                                            return;
                                        }
                                        if (arg2 == 81) {
                                            this.field184 = 2;
                                            this.field227 = arg1.method3750((byte) 35) * 256;
                                            return;
                                        }
                                        if (arg2 != 82) {
                                            if (arg2 == 88) {
                                                this.field177 = false;
                                                return;
                                            }
                                            if (arg2 != 89) {
                                                if (arg2 == 91) {
                                                    this.field218 = true;
                                                    return;
                                                }
                                                if (arg2 != 93) {
                                                    if (arg2 == 94) {
                                                        this.field184 = 4;
                                                        return;
                                                    }
                                                    if (arg2 == 95) {
                                                        this.field184 = 5;
                                                        this.field227 = arg1.method3706((byte) 37);
                                                        return;
                                                    }
                                                    if (arg2 == 97) {
                                                        this.field170 = true;
                                                        return;
                                                    }
                                                    if (arg2 != 98) {
                                                        if (arg2 == 99) {
                                                            this.field148 = arg1.method3750((byte) 35);
                                                            this.field209 = arg1.method3757((byte) -65);
                                                            return;
                                                        }
                                                        if (arg2 == 100) {
                                                            this.field204 = arg1.method3750((byte) 35);
                                                            this.field190 = arg1.method3757((byte) -65);
                                                            return;
                                                        }
                                                        if (arg2 == 101) {
                                                            this.field163 = arg1.method3750((byte) 35);
                                                            return;
                                                        }
                                                        if (arg2 == 102) {
                                                            this.field143 = arg1.method3757((byte) -65);
                                                            return;
                                                        }
                                                        if (arg2 == 103) {
                                                            this.field195 = 0;
                                                            return;
                                                        }
                                                        if (arg2 == 104) {
                                                            this.field152 = arg1.method3750((byte) 35);
                                                            return;
                                                        }
                                                        if (arg2 == 105) {
                                                            this.field171 = true;
                                                            return;
                                                        }
                                                        if (arg2 == 106) {
                                                            int var8 = arg1.method3750((byte) 35);
                                                            this.field169 = new int[var8];
                                                            this.field212 = new int[var8];
                                                            for (int var9 = 0; var9 < var8; var9++) {
                                                                this.field212[var9] = arg1.method3757((byte) -65);
                                                                int var10 = arg1.method3750((byte) 35);
                                                                this.field169[var9] = var10;
                                                                this.field234 += var10;
                                                            }
                                                            return;
                                                        }
                                                        if (arg2 == 107) {
                                                            this.field180 = arg1.method3757((byte) -65);
                                                        } else if (arg2 >= 150 && arg2 < 155) {
                                                            this.field142[arg2 - 150] = arg1.method3697(-1);
                                                            if (!this.field157.field818) {
                                                                this.field142[arg2 - 150] = null;
                                                                return;
                                                            }
                                                        } else if (arg2 == 160) {
                                                            int var17 = arg1.method3750((byte) 35);
                                                            this.field219 = new int[var17];
                                                            for (int var18 = 0; var18 < var17; var18++) {
                                                                this.field219[var18] = arg1.method3757((byte) -65);
                                                            }
                                                            return;
                                                        } else if (arg2 == 162) {
                                                            this.field184 = 3;
                                                            this.field227 = arg1.method3703(arg0 ^ 0x65);
                                                            return;
                                                        } else if (arg2 == 163) {
                                                            this.field154 = arg1.method3719(arg0 ^ 0x6E867B3A);
                                                            this.field153 = arg1.method3719(1854307120);
                                                            this.field222 = arg1.method3719(arg0 ^ 0x6E867B3A);
                                                            this.field145 = arg1.method3719(arg0 + 1854307110);
                                                            return;
                                                        } else if (arg2 == 164) {
                                                            this.field164 = arg1.method3706((byte) -123);
                                                            return;
                                                        } else if (arg2 == 165) {
                                                            this.field205 = arg1.method3706((byte) 112);
                                                            return;
                                                        } else if (arg2 == 166) {
                                                            this.field140 = arg1.method3706((byte) -107);
                                                            return;
                                                        } else if (arg2 == 167) {
                                                            this.field150 = arg1.method3757((byte) -65);
                                                            return;
                                                        } else if (arg2 == 168) {
                                                            this.field156 = true;
                                                            return;
                                                        } else {
                                                            if (arg2 == 169) {
                                                                this.field146 = true;
                                                            } else if (arg2 == 170) {
                                                                this.field200 = arg1.method3693(117);
                                                                return;
                                                            } else if (arg2 == 171) {
                                                                this.field173 = arg1.method3693(-1);
                                                                return;
                                                            } else if (arg2 == 173) {
                                                                this.field194 = arg1.method3757((byte) -65);
                                                                this.field141 = arg1.method3757((byte) -65);
                                                                return;
                                                            } else if (arg2 == 249) {
                                                                int var11 = arg1.method3750((byte) 35);
                                                                if (this.field198 == null) {
                                                                    int var12 = class123.method837(118, var11);
                                                                    this.field198 = new class188(var12);
                                                                }
                                                                for (int var13 = 0; var13 < var11; var13++) {
                                                                    boolean var14 = arg1.method3750((byte) 35) == 1;
                                                                    int var15 = arg1.method3756(false);
                                                                    class189 var16;
                                                                    if (var14) {
                                                                        var16 = new class427(arg1.method3697(-1));
                                                                    } else {
                                                                        var16 = new class756(arg1.method3703(108));
                                                                    }
                                                                    this.field198.method1179((long) var15, var16, (byte) -26);
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    this.field158 = true;
                                                    return;
                                                }
                                                this.field184 = 3;
                                                this.field227 = arg1.method3757((byte) -65);
                                                return;
                                            }
                                            this.field193 = false;
                                            return;
                                        }
                                        this.field186 = true;
                                        return;
                                    }
                                    this.field144 = arg1.method3757((byte) -65);
                                    if (this.field144 == 65535) {
                                        this.field144 = -1;
                                    }
                                    this.field188 = arg1.method3757((byte) -65);
                                    if (this.field188 == 65535) {
                                        this.field188 = -1;
                                    }
                                    int var19 = -1;
                                    if (arg2 == 92) {
                                        var19 = arg1.method3757((byte) -65);
                                        if (var19 == 65535) {
                                            var19 = -1;
                                        }
                                    }
                                    int var20 = arg1.method3750((byte) 35);
                                    this.field226 = new int[var20 + 2];
                                    for (int var21 = 0; var21 <= var20; var21++) {
                                        this.field226[var21] = arg1.method3757((byte) -65);
                                        if (this.field226[var21] == 65535) {
                                            this.field226[var21] = -1;
                                        }
                                    }
                                    this.field226[var20 + 1] = var19;
                                    return;
                                }
                                this.field210 = arg1.method3706((byte) -118) << 2;
                                return;
                            }
                            this.field220 = arg1.method3706((byte) -95) << 2;
                            return;
                        }
                        this.field176 = arg1.method3757((byte) -65);
                        return;
                    }
                    this.field187 = true;
                    return;
                }
                int var22 = arg1.method3750((byte) 35);
                this.field179 = new short[var22];
                this.field191 = new short[var22];
                for (int var23 = 0; var23 < var22; var23++) {
                    this.field179[var23] = (short) arg1.method3757((byte) -65);
                    this.field191[var23] = (short) arg1.method3757((byte) -65);
                }
                return;
            }
            int var24 = arg1.method3750((byte) 35);
            this.field202 = new short[var24];
            this.field185 = new short[var24];
            for (int var25 = 0; var25 < var24; var25++) {
                this.field202[var25] = (short) arg1.method3757((byte) -65);
                this.field185[var25] = (short) arg1.method3757((byte) -65);
            }
            return;
        } else {
            this.field142[arg2 - 30] = arg1.method3697(-1);
            return;
        }
    }
}
