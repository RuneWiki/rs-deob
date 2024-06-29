import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class374 extends class519 {

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    private int field5413 = 0;

    @OriginalMember(owner = "client!la", name = "I", descriptor = "I")
    private int field5432 = 0;

    @OriginalMember(owner = "client!la", name = "O", descriptor = "I")
    private int field5438 = 0;

    @OriginalMember(owner = "client!la", name = "ob", descriptor = "Z")
    private boolean field5464 = false;

    @OriginalMember(owner = "client!la", name = "ac", descriptor = "Z")
    private boolean field5502 = true;

    @OriginalMember(owner = "client!la", name = "db", descriptor = "I")
    private int field5453 = 0;

    @OriginalMember(owner = "client!la", name = "kc", descriptor = "I")
    private int field5512 = 0;

    @OriginalMember(owner = "client!la", name = "cc", descriptor = "Ljj;")
    private class66 field5504;

    @OriginalMember(owner = "client!la", name = "nb", descriptor = "Las;")
    private class25 field5463;

    @OriginalMember(owner = "client!la", name = "yb", descriptor = "Las;")
    private class25 field5474;

    @OriginalMember(owner = "client!la", name = "G", descriptor = "Las;")
    private class25 field5430;

    @OriginalMember(owner = "client!la", name = "dc", descriptor = "Las;")
    private class25 field5505;

    @OriginalMember(owner = "client!la", name = "ab", descriptor = "Ljaa;")
    private class62 field5450;

    @OriginalMember(owner = "client!la", name = "zb", descriptor = "I")
    private int field5475;

    @OriginalMember(owner = "client!la", name = "qc", descriptor = "I")
    private int field5518;

    @OriginalMember(owner = "client!la", name = "R", descriptor = "[I")
    private int[] field5441;

    @OriginalMember(owner = "client!la", name = "mb", descriptor = "[I")
    private int[] field5462;

    @OriginalMember(owner = "client!la", name = "ec", descriptor = "[I")
    private int[] field5506;

    @OriginalMember(owner = "client!la", name = "jc", descriptor = "[I")
    private int[] field5511;

    @OriginalMember(owner = "client!la", name = "Qb", descriptor = "[S")
    private short[] field5492;

    @OriginalMember(owner = "client!la", name = "Nb", descriptor = "[Lon;")
    private class595[] field5489;

    @OriginalMember(owner = "client!la", name = "L", descriptor = "[Ltf;")
    private class643[] field5435;

    @OriginalMember(owner = "client!la", name = "fb", descriptor = "I")
    private int field5455;

    @OriginalMember(owner = "client!la", name = "cb", descriptor = "[Ldh;")
    private class319[] field5452;

    @OriginalMember(owner = "client!la", name = "Db", descriptor = "[Lwt;")
    private class24[] field5479;

    @OriginalMember(owner = "client!la", name = "Y", descriptor = "[S")
    private short[] field5448;

    @OriginalMember(owner = "client!la", name = "W", descriptor = "[S")
    private short[] field5446;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "[S")
    private short[] field5409;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "[S")
    private short[] field5420;

    @OriginalMember(owner = "client!la", name = "V", descriptor = "S")
    private short field5445;

    @OriginalMember(owner = "client!la", name = "Vb", descriptor = "S")
    private short field5497;

    @OriginalMember(owner = "client!la", name = "Xb", descriptor = "[S")
    private short[] field5499;

    @OriginalMember(owner = "client!la", name = "hc", descriptor = "[S")
    private short[] field5509;

    @OriginalMember(owner = "client!la", name = "Wb", descriptor = "[B")
    private byte[] field5498;

    @OriginalMember(owner = "client!la", name = "nc", descriptor = "[F")
    private float[] field5515;

    @OriginalMember(owner = "client!la", name = "y", descriptor = "[S")
    private short[] field5422;

    @OriginalMember(owner = "client!la", name = "Mb", descriptor = "[S")
    private short[] field5488;

    @OriginalMember(owner = "client!la", name = "xb", descriptor = "[F")
    private float[] field5473;

    @OriginalMember(owner = "client!la", name = "ub", descriptor = "[S")
    private short[] field5470;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "[S")
    private short[] field5411;

    @OriginalMember(owner = "client!la", name = "T", descriptor = "[B")
    private byte[] field5443;

    @OriginalMember(owner = "client!la", name = "Eb", descriptor = "[I")
    private int[] field5480;

    @OriginalMember(owner = "client!la", name = "ic", descriptor = "[[I")
    private int[][] field5510;

    @OriginalMember(owner = "client!la", name = "sb", descriptor = "[[I")
    private int[][] field5468;

    @OriginalMember(owner = "client!la", name = "K", descriptor = "[[I")
    private int[][] field5434;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "Z")
    public static boolean field5416 = false;

    @OriginalMember(owner = "client!la", name = "bc", descriptor = "[I")
    public static int[] field5503 = new int[4096];

    @OriginalMember(owner = "client!la", name = "Fb", descriptor = "B")
    private byte field5481;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public static int field5410;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field5414;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    public static int field5417;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    public static int field5418;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "I")
    public static int field5419;

    @OriginalMember(owner = "client!la", name = "x", descriptor = "I")
    public static int field5421;

    @OriginalMember(owner = "client!la", name = "A", descriptor = "I")
    public static int field5424;

    @OriginalMember(owner = "client!la", name = "B", descriptor = "I")
    public static int field5425;

    @OriginalMember(owner = "client!la", name = "C", descriptor = "I")
    public static int field5426;

    @OriginalMember(owner = "client!la", name = "D", descriptor = "I")
    public static int field5427;

    @OriginalMember(owner = "client!la", name = "F", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!la", name = "H", descriptor = "I")
    public static int field5431;

    @OriginalMember(owner = "client!la", name = "M", descriptor = "I")
    public static int field5436;

    @OriginalMember(owner = "client!la", name = "P", descriptor = "I")
    public static int field5439;

    @OriginalMember(owner = "client!la", name = "Q", descriptor = "I")
    public static int field5440;

    @OriginalMember(owner = "client!la", name = "U", descriptor = "I")
    public static int field5444;

    @OriginalMember(owner = "client!la", name = "X", descriptor = "I")
    public static int field5447;

    @OriginalMember(owner = "client!la", name = "Z", descriptor = "I")
    public static int field5449;

    @OriginalMember(owner = "client!la", name = "bb", descriptor = "I")
    public static int field5451;

    @OriginalMember(owner = "client!la", name = "eb", descriptor = "I")
    public static int field5454;

    @OriginalMember(owner = "client!la", name = "gb", descriptor = "I")
    public static int field5456;

    @OriginalMember(owner = "client!la", name = "hb", descriptor = "I")
    public static int field5457;

    @OriginalMember(owner = "client!la", name = "ib", descriptor = "I")
    public static int field5458;

    @OriginalMember(owner = "client!la", name = "jb", descriptor = "I")
    public static int field5459;

    @OriginalMember(owner = "client!la", name = "kb", descriptor = "I")
    public static int field5460;

    @OriginalMember(owner = "client!la", name = "lb", descriptor = "I")
    public static int field5461;

    @OriginalMember(owner = "client!la", name = "pb", descriptor = "I")
    public static int field5465;

    @OriginalMember(owner = "client!la", name = "rb", descriptor = "I")
    public static int field5467;

    @OriginalMember(owner = "client!la", name = "tb", descriptor = "I")
    public static int field5469;

    @OriginalMember(owner = "client!la", name = "vb", descriptor = "I")
    public static int field5471;

    @OriginalMember(owner = "client!la", name = "wb", descriptor = "I")
    public static int field5472;

    @OriginalMember(owner = "client!la", name = "Ab", descriptor = "I")
    public static int field5476;

    @OriginalMember(owner = "client!la", name = "Bb", descriptor = "I")
    public static int field5477;

    @OriginalMember(owner = "client!la", name = "Cb", descriptor = "I")
    public static int field5478;

    @OriginalMember(owner = "client!la", name = "Gb", descriptor = "I")
    public static int field5482;

    @OriginalMember(owner = "client!la", name = "Hb", descriptor = "I")
    public static int field5483;

    @OriginalMember(owner = "client!la", name = "Ib", descriptor = "I")
    public static int field5484;

    @OriginalMember(owner = "client!la", name = "Jb", descriptor = "I")
    public static int field5485;

    @OriginalMember(owner = "client!la", name = "Lb", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!la", name = "Pb", descriptor = "I")
    public static int field5491;

    @OriginalMember(owner = "client!la", name = "Rb", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!la", name = "Sb", descriptor = "I")
    public static int field5494;

    @OriginalMember(owner = "client!la", name = "Ub", descriptor = "I")
    public static int field5496;

    @OriginalMember(owner = "client!la", name = "Yb", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!la", name = "fc", descriptor = "I")
    public static int field5507;

    @OriginalMember(owner = "client!la", name = "gc", descriptor = "I")
    public static int field5508;

    @OriginalMember(owner = "client!la", name = "lc", descriptor = "I")
    public static int field5513;

    @OriginalMember(owner = "client!la", name = "mc", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!la", name = "oc", descriptor = "I")
    public static int field5516;

    @OriginalMember(owner = "client!la", name = "pc", descriptor = "I")
    public static int field5517;

    @OriginalMember(owner = "client!la", name = "rc", descriptor = "I")
    public static int field5519;

    @OriginalMember(owner = "client!la", name = "Kb", descriptor = "Lgw;")
    private class140 field5486;

    @OriginalMember(owner = "client!la", name = "Ob", descriptor = "Lip;")
    public static class392 field5490;

    @OriginalMember(owner = "client!la", name = "J", descriptor = "Lpi;")
    private class423 field5433;

    @OriginalMember(owner = "client!la", name = "z", descriptor = "Ljh;")
    private class554 field5423;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "S")
    private short field5412;

    @OriginalMember(owner = "client!la", name = "E", descriptor = "S")
    private short field5428;

    @OriginalMember(owner = "client!la", name = "N", descriptor = "S")
    private short field5437;

    @OriginalMember(owner = "client!la", name = "S", descriptor = "S")
    private short field5442;

    @OriginalMember(owner = "client!la", name = "qb", descriptor = "S")
    private short field5466;

    @OriginalMember(owner = "client!la", name = "Tb", descriptor = "S")
    private short field5495;

    @OriginalMember(owner = "client!la", name = "Zb", descriptor = "S")
    private short field5501;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIIBII)Z", line = 9)
    private final boolean method2267(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        field5507++;
        if (arg2 < arg4 && arg7 > arg2 && arg2 < arg8) {
            return false;
        } else if (arg4 < arg2 && arg2 > arg7 && arg8 < arg2) {
            return false;
        } else {
            if (arg6 > -75) {
                this.field5509 = null;
            }
            if (arg0 < arg1 && arg0 < arg5 && arg3 > arg0) {
                return false;
            } else {
                return arg1 >= arg0 || arg5 >= arg0 || arg3 >= arg0;
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "()Z", line = 37)
    public final boolean method1388() {
        field5491++;
        if (this.field5499 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field5499.length; var1++) {
            if (this.field5499[var1] != -1 && !this.field5504.field2443.method2389(-55, this.field5499[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII)V", line = 59)
    public final void method1381(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field5453; var5++) {
            int var9 = this.field5488[var5] & 0xFFFF;
            int var10 = var9 >> 10 & 0x3F;
            int var11 = (var9 & 0x3DA) >> 7;
            int var12 = var9 & 0x7F;
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            if (arg2 != -1) {
                var12 -= -((arg2 - var12) * arg3 >> 7);
            }
            this.field5488[var5] = (short) class188.method1258(var12, class188.method1258(var10 << 10, var11 << 7));
        }
        field5516++;
        if (this.field5479 != null) {
            for (int var6 = 0; var6 < this.field5455; var6++) {
                class24 var7 = this.field5479[var6];
                class319 var8 = this.field5452[var6];
                var8.field4627 = class220.field3297[this.field5488[var7.field338] & 0xFFFF] & 0xFFFFFF | var8.field4627 & 0xFF000000;
            }
        }
        if (this.field5505 != null) {
            this.field5505.field345 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BLec;)V", line = 117)
    private final void method2268(byte arg0, class141 arg1) {
        if (this.field5504.field1282.length < this.field5413) {
            this.field5504.field1281 = new int[this.field5413];
            this.field5504.field1282 = new int[this.field5413];
        }
        field5425++;
        int[] var3 = this.field5504.field1282;
        int[] var4 = this.field5504.field1281;
        if (arg0 != 31) {
            this.method2271((byte) -1);
        }
        for (int var5 = 0; var5 < this.field5438; var5++) {
            int var16 = (this.field5462[var5] - (this.field5511[var5] * this.field5504.field1266 >> 8) >> this.field5504.field1134) - arg1.field2205;
            int var17 = (this.field5506[var5] - (this.field5511[var5] * this.field5504.field1200 >> 8) >> this.field5504.field1134) - arg1.field2203;
            int var18 = this.field5441[var5];
            int var19 = this.field5441[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field5446[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        for (int var6 = 0; var6 < this.field5512; var6++) {
            if (this.field5443 == null || this.field5443[var6] <= 128) {
                short var7 = this.field5409[var6];
                short var8 = this.field5509[var6];
                short var9 = this.field5420[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if ((var10 - var11) * (var14 - var15) - ((var12 - var11) * (var14 - var13)) > 0) {
                    arg1.method1050(var11, var10, var14, var15, var12, 1639, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(I)V", line = 203)
    public static void method2269(int arg0) {
        field5503 = null;
        if (arg0 == -19972) {
            field5490 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "ga", descriptor = "()I", line = 221)
    public final int method1394() {
        field5431++;
        return this.field5445;
    }

    @OriginalMember(owner = "client!la", name = "EA", descriptor = "(Lk;)Lk;", line = 235)
    public final class88 method1403(class88 arg0) {
        field5419++;
        if (this.field5413 == 0) {
            return null;
        }
        if (!this.field5464) {
            this.method2271((byte) -113);
        }
        int var2;
        int var3;
        if (this.field5504.field1266 > 0) {
            var2 = this.field5428 - (this.field5504.field1266 * this.field5466 >> 8) >> this.field5504.field1134;
            var3 = this.field5501 - (this.field5504.field1266 * this.field5412 >> 8) >> this.field5504.field1134;
        } else {
            var2 = this.field5428 - (this.field5504.field1266 * this.field5412 >> 8) >> this.field5504.field1134;
            var3 = this.field5501 - (this.field5504.field1266 * this.field5466 >> 8) >> this.field5504.field1134;
        }
        int var4;
        int var5;
        if (this.field5504.field1200 <= 0) {
            var4 = this.field5495 - (this.field5504.field1200 * this.field5412 >> 8) >> this.field5504.field1134;
            var5 = this.field5437 - (this.field5504.field1200 * this.field5466 >> 8) >> this.field5504.field1134;
        } else {
            var4 = this.field5495 - (this.field5504.field1200 * this.field5466 >> 8) >> this.field5504.field1134;
            var5 = this.field5437 - (this.field5504.field1200 * this.field5412 >> 8) >> this.field5504.field1134;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class141 var8 = (class141) arg0;
        class141 var9;
        if (var8 != null && var8.method1048(var7, (byte) 4, var6)) {
            var9 = var8;
            var8.method1049((byte) -126);
        } else {
            var9 = new class141(this.field5504, var6, var7);
        }
        var9.method1047(var2, var3, 0, var5, var4);
        this.method2268((byte) 31, var9);
        return var9;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BIZ)Lr;", line = 302)
    public final class519 method765(byte arg0, int arg1, boolean arg2) {
        field5426++;
        class374 var4;
        class374 var5;
        if (arg0 == 1) {
            var4 = this.field5504.field1226;
            var5 = this.field5504.field1170;
        } else if (arg0 == 2) {
            var5 = this.field5504.field1166;
            var4 = this.field5504.field1174;
        } else if (arg0 == 3) {
            var5 = this.field5504.field1268;
            var4 = this.field5504.field1221;
        } else if (arg0 == 4) {
            var4 = this.field5504.field1213;
            var5 = this.field5504.field1269;
        } else if (arg0 == 5) {
            var5 = this.field5504.field1260;
            var4 = this.field5504.field1165;
        } else {
            var5 = var4 = new class374(this.field5504);
        }
        return this.method2275(arg2, arg1, (byte) -50, arg0 != 0, var4, var5);
    }

    @OriginalMember(owner = "client!la", name = "e", descriptor = "()I", line = 350)
    public final int method1382() {
        field5436++;
        if (!this.field5464) {
            this.method2271((byte) -113);
        }
        return this.field5442;
    }

    @OriginalMember(owner = "client!la", name = "M", descriptor = "()I", line = 362)
    public final int method1386() {
        field5472++;
        return this.field5497;
    }

    @OriginalMember(owner = "client!la", name = "OA", descriptor = "(I)V", line = 380)
    public final void method1367(int arg0) {
        field5439++;
        int var2 = class285.field4154[arg0];
        int var3 = class285.field4152[arg0];
        for (int var4 = 0; var4 < this.field5438; var4++) {
            int var5 = this.field5506[var4] * var2 + this.field5462[var4] * var3 >> 15;
            this.field5506[var4] = this.field5506[var4] * var3 - (this.field5462[var4] * var2) >> 15;
            this.field5462[var4] = var5;
        }
        this.field5464 = false;
        if (this.field5463 != null) {
            this.field5463.field345 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(I)V", line = 413)
    private final void method2270(int arg0) {
        int var2 = -114 % ((arg0 - 37) / 44);
        field5519++;
        if (this.field5479 == null) {
            return;
        }
        class249 var3 = this.field5504.field1132;
        float var4 = this.field5504.method613();
        float var5 = this.field5504.method542();
        this.field5504.method610(-126);
        this.field5504.method621(false);
        this.field5504.method578(125, false);
        this.field5504.method636(this.field5504.field1169, false, null, null, this.field5504.field1184);
        for (int var6 = 0; var6 < this.field5455; var6++) {
            class24 var7 = this.field5479[var6];
            class319 var8 = this.field5452[var6];
            if (!var7.field326 || !this.field5504.method157()) {
                float var9 = (float) (this.field5462[var7.field343] + this.field5462[var7.field341] + this.field5462[var7.field334]) * 0.3333333F;
                float var10 = (float) (this.field5511[var7.field341] - (-this.field5511[var7.field343] - this.field5511[var7.field334])) * 0.3333333F;
                float var11 = (float) (this.field5506[var7.field341] + this.field5506[var7.field334] + this.field5506[var7.field343]) * 0.3333333F;
                float var12 = class347.field4963 * var11 + class93.field1645 * var9 + class419.field6169 * var10 + class552.field7826;
                float var13 = class321.field4654 * var11 + class85.field1563 * var9 + class484.field6850 * var10 + class195.field2801;
                float var14 = class498.field6982 * var11 + class32.field439 * var10 + class299.field4328 * var9 + class331.field4756;
                var3.method1579(var8.field4632, 18243, var7.field342 * var8.field4634 >> 7, var7.field325 * var8.field4626 >> 7, (float) var8.field4624 + var12, (float) var8.field4623 + -var13, -var14);
                this.field5504.method622(363, var3);
                this.field5504.method517(var5, var4 - (float) var7.field336 * 1.5F);
                int var15 = var8.field4627;
                OpenGL.glColor4ub((byte) (var15 >> 16), (byte) (var15 >> 8), (byte) var15, (byte) (var15 >> 24));
                this.field5504.method514(var7.field332, true);
                this.field5504.method598(var7.field337, (byte) -126);
                this.field5504.method634(75, var7.field331);
                this.field5504.method550(0, 7, 4, (byte) 103);
            }
        }
        this.field5504.method517(var5, var4);
        this.field5504.method621(true);
        this.field5504.method551((byte) 121);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V", line = 478)
    private final void method2271(byte arg0) {
        field5500++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field5438; var10++) {
            int var11 = this.field5462[var10];
            int var12 = this.field5511[var10];
            if (var2 > var11) {
                var2 = var11;
            }
            int var13 = this.field5506[var10];
            if (var5 < var11) {
                var5 = var11;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var4 > var13) {
                var4 = var13;
            }
            if (var7 < var13) {
                var7 = var13;
            }
            int var14 = var11 * var11 + (var13 * var13);
            if (var14 > var8) {
                var8 = var14;
            }
            int var15 = var12 * var12 + var11 * var11 + var13 * var13;
            if (var9 < var15) {
                var9 = var15;
            }
        }
        this.field5466 = (short) var6;
        this.field5428 = (short) var2;
        this.field5501 = (short) var5;
        if (arg0 != -113) {
            this.method1400(18);
        }
        this.field5495 = (short) var4;
        this.field5437 = (short) var7;
        this.field5412 = (short) var3;
        this.field5442 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        Math.sqrt((double) var9);
        this.field5464 = true;
    }

    @OriginalMember(owner = "client!la", name = "U", descriptor = "()I", line = 559)
    public final int method1362() {
        if (!this.field5464) {
            this.method2271((byte) -113);
        }
        field5465++;
        return this.field5437;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "()[Lon;", line = 570)
    public final class595[] method1375() {
        field5496++;
        return this.field5489;
    }

    @OriginalMember(owner = "client!la", name = "ea", descriptor = "(I[IIIIIZ)V", line = 583)
    public final void method1354(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field5467++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg2 << 4;
            int var10 = arg3 << 4;
            int var11 = arg4 << 4;
            class325.field4684 = 0;
            int var12 = 0;
            class155.field2340 = 0;
            class512.field7088 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field5510.length) {
                    int[] var15 = this.field5510[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class512.field7088 += this.field5462[var17];
                        class325.field4684 += this.field5511[var17];
                        var12++;
                        class155.field2340 += this.field5506[var17];
                    }
                }
            }
            if (var12 <= 0) {
                class325.field4684 = var10;
                class512.field7088 = var9;
                class155.field2340 = var11;
            } else {
                class155.field2340 = class155.field2340 / var12 + var11;
                class512.field7088 = class512.field7088 / var12 + var9;
                class325.field4684 = class325.field4684 / var12 + var10;
            }
        } else if (arg0 == 1) {
            int var18 = arg2 << 4;
            int var19 = arg4 << 4;
            int var20 = arg3 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (var22 < this.field5510.length) {
                    int[] var23 = this.field5510[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field5462[var25] += var18;
                        this.field5511[var25] += var20;
                        this.field5506[var25] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (this.field5510.length > var45) {
                    int[] var46 = this.field5510[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field5462[var59] -= class512.field7088;
                            this.field5511[var59] -= class325.field4684;
                            this.field5506[var59] -= class155.field2340;
                            if (arg4 != 0) {
                                int var60 = class285.field4154[arg4];
                                int var61 = class285.field4152[arg4];
                                int var62 = this.field5511[var59] * var60 + (this.field5462[var59] * var61 + 32767) >> 15;
                                this.field5511[var59] = this.field5511[var59] * var61 + 32767 - (this.field5462[var59] * var60) >> 15;
                                this.field5462[var59] = var62;
                            }
                            if (arg2 != 0) {
                                int var63 = class285.field4154[arg2];
                                int var64 = class285.field4152[arg2];
                                int var65 = this.field5511[var59] * var64 + 32767 - this.field5506[var59] * var63 >> 15;
                                this.field5506[var59] = this.field5511[var59] * var63 + this.field5506[var59] * var64 + 32767 >> 15;
                                this.field5511[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class285.field4154[arg3];
                                int var67 = class285.field4152[arg3];
                                int var68 = this.field5506[var59] * var66 - (-(this.field5462[var59] * var67) - 32767) >> 15;
                                this.field5506[var59] = this.field5506[var59] * var67 + 32767 - this.field5462[var59] * var66 >> 15;
                                this.field5462[var59] = var68;
                            }
                            this.field5462[var59] += class512.field7088;
                            this.field5511[var59] += class325.field4684;
                            this.field5506[var59] += class155.field2340;
                        }
                    } else {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field5462[var48] -= class512.field7088;
                            this.field5511[var48] -= class325.field4684;
                            this.field5506[var48] -= class155.field2340;
                            if (arg2 != 0) {
                                int var49 = class285.field4154[arg2];
                                int var50 = class285.field4152[arg2];
                                int var51 = this.field5511[var48] * var50 + 32767 - (this.field5506[var48] * var49) >> 15;
                                this.field5506[var48] = this.field5506[var48] * var50 + (this.field5511[var48] * var49 + 32767) >> 15;
                                this.field5511[var48] = var51;
                            }
                            if (arg4 != 0) {
                                int var52 = class285.field4154[arg4];
                                int var53 = class285.field4152[arg4];
                                int var54 = this.field5511[var48] * var52 + (this.field5462[var48] * var53) + 32767 >> 15;
                                this.field5511[var48] = this.field5511[var48] * var53 + 32767 - (this.field5462[var48] * var52) >> 15;
                                this.field5462[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class285.field4154[arg3];
                                int var56 = class285.field4152[arg3];
                                int var57 = this.field5506[var48] * var55 + (this.field5462[var48] * var56 + 32767) >> 15;
                                this.field5506[var48] = this.field5506[var48] * var56 - (this.field5462[var48] * var55 - 32767) >> 15;
                                this.field5462[var48] = var57;
                            }
                            this.field5462[var48] += class512.field7088;
                            this.field5511[var48] += class325.field4684;
                            this.field5506[var48] += class155.field2340;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (this.field5510.length > var28) {
                        int[] var29 = this.field5510[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field5441[var31];
                            int var33 = this.field5441[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field5446[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class285.field4154[arg4];
                                    int var37 = class285.field4152[arg4];
                                    int var38 = this.field5448[var35] * var36 + this.field5411[var35] * var37 + 32767 >> 15;
                                    this.field5448[var35] = (short) (this.field5448[var35] * var37 + 32767 - (this.field5411[var35] * var36) >> 15);
                                    this.field5411[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class285.field4154[arg2];
                                    int var40 = class285.field4152[arg2];
                                    int var41 = this.field5448[var35] * var40 + 32767 - (this.field5470[var35] * var39) >> 15;
                                    this.field5470[var35] = (short) (this.field5470[var35] * var40 + this.field5448[var35] * var39 + 32767 >> 15);
                                    this.field5448[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class285.field4154[arg3];
                                    int var43 = class285.field4152[arg3];
                                    int var44 = this.field5470[var35] * var42 - (-(this.field5411[var35] * var43) - 32767) >> 15;
                                    this.field5470[var35] = (short) (this.field5470[var35] * var43 + 32767 - (this.field5411[var35] * var42) >> 15);
                                    this.field5411[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field5430 == null && this.field5505 != null) {
                    this.field5505.field345 = null;
                }
                if (this.field5430 != null) {
                    this.field5430.field345 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field5510.length) {
                    int[] var71 = this.field5510[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field5462[var73] -= class512.field7088;
                        this.field5511[var73] -= class325.field4684;
                        this.field5506[var73] -= class155.field2340;
                        this.field5462[var73] = this.field5462[var73] * arg2 >> 7;
                        this.field5511[var73] = this.field5511[var73] * arg3 >> 7;
                        this.field5506[var73] = this.field5506[var73] * arg4 >> 7;
                        this.field5462[var73] += class512.field7088;
                        this.field5511[var73] += class325.field4684;
                        this.field5506[var73] += class155.field2340;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field5434 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (this.field5434.length > var78) {
                        int[] var79 = this.field5434[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field5443[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field5443[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field5505 != null) {
                            this.field5505.field345 = null;
                        }
                    }
                }
                if (this.field5479 != null) {
                    for (int var75 = 0; var75 < this.field5455; var75++) {
                        class24 var76 = this.field5479[var75];
                        class319 var77 = this.field5452[var75];
                        var77.field4627 = var77.field4627 & 0xFFFFFF | 255 - (this.field5443[var76.field338] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field5434 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (var87 < this.field5434.length) {
                        int[] var88 = this.field5434[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field5488[var90] & 0xFFFF;
                            int var92 = (var91 & 0xFC20) >> 10;
                            int var93 = (var91 & 0x3C6) >> 7;
                            int var94 = var91 & 0x7F;
                            int var95 = var92 + arg2 & 0x3F;
                            int var96 = arg3 / 4 + var93;
                            if (var96 < 0) {
                                var96 = 0;
                            } else if (var96 > 7) {
                                var96 = 7;
                            }
                            int var97 = arg4 + var94;
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field5488[var90] = (short) class188.method1258(class188.method1258(var96 << 7, var95 << 10), var97);
                        }
                        if (var88.length > 0 && this.field5505 != null) {
                            this.field5505.field345 = null;
                        }
                    }
                }
                if (this.field5479 != null) {
                    for (int var84 = 0; var84 < this.field5455; var84++) {
                        class24 var85 = this.field5479[var84];
                        class319 var86 = this.field5452[var84];
                        var86.field4627 = var86.field4627 & 0xFF000000 | class220.field3297[this.field5488[var85.field338] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field5468 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (this.field5468.length > var99) {
                        int[] var100 = this.field5468[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class319 var102 = this.field5452[var100[var101]];
                            var102.field4623 += arg3;
                            var102.field4624 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field5468 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (this.field5468.length > var104) {
                        int[] var105 = this.field5468[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class319 var107 = this.field5452[var105[var106]];
                            var107.field4634 = var107.field4634 * arg3 >> 7;
                            var107.field4626 = var107.field4626 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field5468 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (this.field5468.length > var109) {
                    int[] var110 = this.field5468[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class319 var112 = this.field5452[var110[var111]];
                        var112.field4632 = var112.field4632 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Ljj;)V", line = 5459)
    public class374(class66 arg0) {
        this.field5504 = arg0;
        this.field5463 = new class25(null, 5126, 3, 0);
        this.field5474 = new class25(null, 5126, 2, 0);
        this.field5430 = new class25(null, 5126, 3, 0);
        this.field5505 = new class25(null, 5121, 4, 0);
        this.field5450 = new class62();
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Ljj;Lld;IIII)V", line = 5471)
    public class374(class66 arg0, class560 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5475 = arg2;
        this.field5504 = arg0;
        this.field5518 = arg5;
        if (class284.method1807(arg2, -24291, arg5)) {
            this.field5463 = new class25(null, 5126, 3, 0);
        }
        if (class408.method2477(arg2, arg5, (byte) 116)) {
            this.field5474 = new class25(null, 5126, 2, 0);
        }
        if (class224.method1495(55, arg5, arg2)) {
            this.field5430 = new class25(null, 5126, 3, 0);
        }
        if (class448.method2654(arg5, arg2, (byte) -120)) {
            this.field5505 = new class25(null, 5121, 4, 0);
        }
        if (class595.method3399(arg2, 0, arg5)) {
            this.field5450 = new class62();
        }
        class472 var7 = arg0.field2443;
        int[] var8 = new int[arg1.field7951];
        this.field5441 = new int[arg1.field7942 + 1];
        for (int var9 = 0; var9 < arg1.field7951; var9++) {
            if ((arg1.field7963 == null || arg1.field7963[var9] != 2) && (arg1.field7962 == null || arg1.field7962[var9] == -1 || !var7.method2387((byte) 127, arg1.field7962[var9] & 0xFFFF).field8204)) {
                var8[this.field5453++] = var9;
                this.field5441[arg1.field7959[var9]]++;
                this.field5441[arg1.field7940[var9]]++;
                this.field5441[arg1.field7941[var9]]++;
            }
        }
        this.field5512 = this.field5453;
        long[] var10 = new long[this.field5453];
        boolean var11 = (this.field5475 & 0x100) != 0;
        label499: for (int var12 = 0; var12 < this.field5453; var12++) {
            int var180 = var8[var12];
            class576 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field7949 != null) {
                for (int var186 = 0; var186 < arg1.field7949.length; var186++) {
                    class540 var187 = arg1.field7949[var186];
                    if (var187.field7523 == var180) {
                        class352 var188 = class573.method3279(var187.field7522, (byte) 118);
                        if (var188.field5023) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field5512--;
                            continue label499;
                        }
                    }
                }
            }
            short var189 = -1;
            if (arg1.field7962 != null) {
                var189 = arg1.field7962[var180];
                if (var189 != -1) {
                    var181 = var7.method2387((byte) 127, var189 & 0xFFFF);
                    var185 = var181.field8206;
                    var184 = var181.field8203;
                }
            }
            boolean var190 = arg1.field7974 != null && arg1.field7974[var180] != 0 || var181 != null && var181.field8217 | !var181.field8213;
            if ((var11 || var190) && arg1.field7939 != null) {
                var182 += arg1.field7939[var180] << 17;
            }
            if (var190) {
                var182 += 65536;
            }
            int var191 = (var184 & 0xFF << 8) + var182;
            int var192 = ((var189 & 0xFFFF) << 16) + var183;
            int var193 = (var185 & 0xFF) + var191;
            int var194 = (var12 & 0xFFFF) + var192;
            var10[var12] = ((long) var193 << 32) + (long) var194;
        }
        class63.method501(var8, var10, -100);
        this.field5462 = arg1.field7955;
        this.field5506 = arg1.field7980;
        this.field5511 = arg1.field7944;
        this.field5492 = arg1.field7961;
        this.field5432 = arg1.field7938;
        this.field5438 = arg1.field7942;
        this.field5489 = arg1.field7950;
        this.field5435 = arg1.field7937;
        class41[] var13 = new class41[this.field5438];
        if (arg1.field7949 != null) {
            this.field5455 = arg1.field7949.length;
            this.field5452 = new class319[this.field5455];
            this.field5479 = new class24[this.field5455];
            for (int var14 = 0; var14 < this.field5455; var14++) {
                class540 var15 = arg1.field7949[var14];
                class352 var16 = class573.method3279(var15.field7522, (byte) 118);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field5453; var18++) {
                    if (var8[var18] == var15.field7523) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class220.field3297[arg1.field7933[var15.field7523] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field7974 == null ? 0 : arg1.field7974[var15.field7523]) << 24;
                this.field5479[var14] = new class24(var17, arg1.field7959[var15.field7523], arg1.field7940[var15.field7523], arg1.field7941[var15.field7523], var16.field5022, var16.field5026, var16.field5021, var16.field5014, var16.field5024, var16.field5023, var16.field5013, var15.field7515);
                this.field5452[var14] = new class319(var20);
            }
        }
        int var21 = this.field5453 * 3;
        this.field5448 = new short[var21];
        class240.field3491 = new long[var21];
        this.field5446 = new short[var21];
        this.field5409 = new short[this.field5453];
        this.field5420 = new short[this.field5453];
        this.field5445 = (short) arg4;
        this.field5497 = (short) arg3;
        this.field5499 = new short[this.field5453];
        this.field5509 = new short[this.field5453];
        this.field5498 = new byte[var21];
        this.field5515 = new float[var21];
        if (arg1.field7964 != null) {
            this.field5422 = new short[this.field5453];
        }
        this.field5488 = new short[this.field5453];
        this.field5473 = new float[var21];
        this.field5470 = new short[var21];
        this.field5411 = new short[var21];
        this.field5443 = new byte[this.field5453];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field7942; var23++) {
            int var179 = this.field5441[var23];
            this.field5441[var23] = var22;
            var13[var23] = new class41();
            var22 += var179;
        }
        this.field5441[arg1.field7942] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field7954 != null) {
            int var28 = arg1.field7971;
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
            var25 = new int[var28];
            for (int var36 = 0; var36 < this.field5453; var36++) {
                int var43 = var8[var36];
                if (arg1.field7954[var43] != -1) {
                    int var44 = arg1.field7954[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field7959[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field7940[var43];
                        } else {
                            var46 = arg1.field7941[var43];
                        }
                        int var47 = arg1.field7955[var46];
                        int var48 = arg1.field7944[var46];
                        int var49 = arg1.field7980[var46];
                        if (var47 < var29[var44]) {
                            var29[var44] = var47;
                        }
                        if (var30[var44] < var47) {
                            var30[var44] = var47;
                        }
                        if (var48 < var31[var44]) {
                            var31[var44] = var48;
                        }
                        if (var32[var44] < var48) {
                            var32[var44] = var48;
                        }
                        if (var33[var44] > var49) {
                            var33[var44] = var49;
                        }
                        if (var49 > var34[var44]) {
                            var34[var44] = var49;
                        }
                    }
                }
            }
            var27 = new float[var28][];
            var26 = new int[var28];
            var24 = new int[var28];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field7932[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var39;
                    float var40;
                    float var41;
                    if (var38 == 1) {
                        int var42 = arg1.field7968[var37];
                        if (var42 == 0) {
                            var40 = 1.0F;
                            var39 = 1.0F;
                        } else if (var42 > 0) {
                            var40 = 1.0F;
                            var39 = (float) var42 / 1024.0F;
                        } else {
                            var39 = 1.0F;
                            var40 = (float) (-var42) / 1024.0F;
                        }
                        var41 = 64.0F / (float) arg1.field7952[var37];
                    } else if (var38 == 2) {
                        var39 = 64.0F / (float) arg1.field7978[var37];
                        var40 = 64.0F / (float) arg1.field7968[var37];
                        var41 = 64.0F / (float) arg1.field7952[var37];
                    } else {
                        var41 = (float) arg1.field7952[var37] / 1024.0F;
                        var40 = (float) arg1.field7968[var37] / 1024.0F;
                        var39 = (float) arg1.field7978[var37] / 1024.0F;
                    }
                    var27[var37] = class605.method3450(arg1.field7969[var37], arg1.field7945[var37], class424.method2540(arg1.field7953[var37], 255), var39, var40, arg1.field7947[var37], false, var41);
                }
            }
        }
        class234[] var50 = new class234[arg1.field7951];
        for (int var51 = 0; var51 < arg1.field7951; var51++) {
            short var158 = arg1.field7959[var51];
            short var159 = arg1.field7940[var51];
            short var160 = arg1.field7941[var51];
            int var161 = this.field5462[var159] - this.field5462[var158];
            int var162 = this.field5511[var159] - this.field5511[var158];
            int var163 = this.field5506[var159] - this.field5506[var158];
            int var164 = this.field5462[var160] - this.field5462[var158];
            int var165 = this.field5511[var160] - this.field5511[var158];
            int var166 = this.field5506[var160] - this.field5506[var158];
            int var167 = var162 * var166 - (var163 * var165);
            int var168 = var163 * var164 - (var161 * var166);
            int var169 = var161 * var165 - (var162 * var164);
            while (var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192) {
                var169 >>= 0x1;
                var167 >>= 0x1;
                var168 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var169 * var169 + var167 * var167 + var168 * var168));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var169 * 256 / var170;
            int var172 = var168 * 256 / var170;
            int var173 = var167 * 256 / var170;
            byte var174 = arg1.field7963 == null ? 0 : arg1.field7963[var51];
            if (var174 == 0) {
                class41 var176 = var13[var158];
                var176.field573 += var173;
                var176.field569 += var171;
                var176.field570 += var172;
                var176.field574++;
                class41 var177 = var13[var159];
                var177.field573 += var173;
                var177.field570 += var172;
                var177.field574++;
                var177.field569 += var171;
                class41 var178 = var13[var160];
                var178.field569 += var171;
                var178.field573 += var173;
                var178.field574++;
                var178.field570 += var172;
            } else if (var174 == 1) {
                class234 var175 = var50[var51] = new class234();
                var175.field3440 = var172;
                var175.field3441 = var171;
                var175.field3438 = var173;
            }
        }
        for (int var52 = 0; var52 < this.field5453; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field7933[var68] & 0xFFFF;
            short var70;
            if (arg1.field7962 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field7962[var68];
            }
            int var71;
            if (arg1.field7954 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field7954[var68];
            }
            int var72;
            if (arg1.field7974 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field7974[var68] & 0xFF;
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
                    var76 = 1.0F;
                    var75 = 1.0F;
                    var78 = 0.0F;
                    var74 = 1.0F;
                    var79 = 1;
                    var73 = 0.0F;
                    var80 = 2;
                    var77 = 0.0F;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field7932[var71];
                    if (var82 == 0) {
                        short var111 = arg1.field7959[var68];
                        short var112 = arg1.field7940[var68];
                        short var113 = arg1.field7941[var68];
                        short var114 = arg1.field7947[var71];
                        short var115 = arg1.field7945[var71];
                        short var116 = arg1.field7969[var71];
                        float var117 = (float) arg1.field7955[var114];
                        float var118 = (float) arg1.field7944[var114];
                        float var119 = (float) arg1.field7980[var114];
                        float var120 = (float) arg1.field7955[var115] - var117;
                        float var121 = (float) arg1.field7944[var115] - var118;
                        float var122 = (float) arg1.field7980[var115] - var119;
                        float var123 = (float) arg1.field7955[var116] - var117;
                        float var124 = (float) arg1.field7944[var116] - var118;
                        float var125 = (float) arg1.field7980[var116] - var119;
                        float var126 = (float) arg1.field7955[var111] - var117;
                        float var127 = (float) arg1.field7944[var111] - var118;
                        float var128 = (float) arg1.field7980[var111] - var119;
                        float var129 = (float) arg1.field7955[var112] - var117;
                        float var130 = (float) arg1.field7944[var112] - var118;
                        float var131 = (float) arg1.field7980[var112] - var119;
                        float var132 = (float) arg1.field7955[var113] - var117;
                        float var133 = (float) arg1.field7944[var113] - var118;
                        float var134 = (float) arg1.field7980[var113] - var119;
                        float var135 = var121 * var125 - var122 * var124;
                        float var136 = var122 * var123 - (var120 * var125);
                        float var137 = var120 * var124 - (var121 * var123);
                        float var138 = var124 * var137 - (var125 * var136);
                        float var139 = var125 * var135 - (var123 * var137);
                        float var140 = var123 * var136 - var124 * var135;
                        float var141 = 1.0F / (var122 * var140 + var120 * var138 + var121 * var139);
                        var77 = (var134 * var140 + var132 * var138 + var133 * var139) * var141;
                        var73 = (var128 * var140 + var126 * var138 + var127 * var139) * var141;
                        var75 = (var131 * var140 + var129 * var138 + var130 * var139) * var141;
                        float var142 = var120 * var136 - (var121 * var135);
                        float var143 = var122 * var135 - (var120 * var137);
                        float var144 = var121 * var137 - (var122 * var136);
                        float var145 = 1.0F / (var125 * var142 + var123 * var144 + var124 * var143);
                        var76 = (var131 * var142 + var129 * var144 + var130 * var143) * var145;
                        var78 = (var134 * var142 + var132 * var144 + var133 * var143) * var145;
                        var74 = (var128 * var142 + var126 * var144 + var127 * var143) * var145;
                    } else {
                        short var83 = arg1.field7959[var68];
                        short var84 = arg1.field7940[var68];
                        short var85 = arg1.field7941[var68];
                        int var86 = var24[var71];
                        int var87 = var25[var71];
                        int var88 = var26[var71];
                        float[] var89 = var27[var71];
                        byte var90 = arg1.field7956[var71];
                        float var91 = (float) arg1.field7975[var71] / 256.0F;
                        if (var82 == 1) {
                            float var109 = (float) arg1.field7978[var71] / 1024.0F;
                            class325.method2016(var87, var91, var109, var86, arg1.field7980[var83], arg1.field7944[var83], arg1.field7955[var83], (byte) 121, var90, var89, var88);
                            var74 = class442.field6465;
                            var73 = class21.field305;
                            class325.method2016(var87, var91, var109, var86, arg1.field7980[var84], arg1.field7944[var84], arg1.field7955[var84], (byte) 116, var90, var89, var88);
                            var75 = class21.field305;
                            var76 = class442.field6465;
                            class325.method2016(var87, var91, var109, var86, arg1.field7980[var85], arg1.field7944[var85], arg1.field7955[var85], (byte) 113, var90, var89, var88);
                            var78 = class442.field6465;
                            var77 = class21.field305;
                            float var110 = var109 / 2.0F;
                            if ((var90 & 0x1) == 0) {
                                if ((var75 - var73 > var110)) {
                                    var75 -= var109;
                                    var79 = 1;
                                } else if (var73 - var75 > var110) {
                                    var75 += var109;
                                    var79 = 2;
                                }
                                if (var77 - var73 > var110) {
                                    var80 = 1;
                                    var77 -= var109;
                                } else if (var73 - var77 > var110) {
                                    var80 = 2;
                                    var77 += var109;
                                }
                            } else {
                                if ((var76 - var74 > var110)) {
                                    var79 = 1;
                                    var76 -= var109;
                                } else if (var110 < var74 - var76) {
                                    var76 += var109;
                                    var79 = 2;
                                }
                                if ((var78 - var74 > var110)) {
                                    var78 -= var109;
                                    var80 = 1;
                                } else if (var110 < var74 - var78) {
                                    var78 += var109;
                                    var80 = 2;
                                }
                            }
                        } else if (var82 == 2) {
                            float var92 = (float) arg1.field7972[var71] / 256.0F;
                            float var93 = (float) arg1.field7958[var71] / 256.0F;
                            int var94 = arg1.field7955[var84] - arg1.field7955[var83];
                            int var95 = arg1.field7944[var84] - arg1.field7944[var83];
                            int var96 = arg1.field7980[var84] - arg1.field7980[var83];
                            int var97 = arg1.field7955[var85] - arg1.field7955[var83];
                            int var98 = arg1.field7944[var85] - arg1.field7944[var83];
                            int var99 = arg1.field7980[var85] - arg1.field7980[var83];
                            int var100 = var95 * var99 - (var96 * var98);
                            int var101 = var96 * var97 - (var94 * var99);
                            int var102 = var94 * var98 - (var95 * var97);
                            float var103 = 64.0F / (float) arg1.field7968[var71];
                            float var104 = 64.0F / (float) arg1.field7952[var71];
                            float var105 = 64.0F / (float) arg1.field7978[var71];
                            float var106 = (var89[2] * (float) var102 + var89[0] * (float) var100 + var89[1] * (float) var101) / var103;
                            float var107 = (var89[5] * (float) var102 + var89[4] * (float) var101 + var89[3] * (float) var100) / var104;
                            float var108 = (var89[8] * (float) var102 + var89[7] * (float) var101 + var89[6] * (float) var100) / var105;
                            var81 = class131.method1020(var108, 1, var106, var107);
                            class526.method2968(var89, var93, var86, var87, var91, arg1.field7955[var83], arg1.field7944[var83], var88, var90, arg1.field7980[var83], var81, var92, 2);
                            var73 = class275.field4026;
                            var74 = class23.field321;
                            class526.method2968(var89, var93, var86, var87, var91, arg1.field7955[var84], arg1.field7944[var84], var88, var90, arg1.field7980[var84], var81, var92, 2);
                            var76 = class23.field321;
                            var75 = class275.field4026;
                            class526.method2968(var89, var93, var86, var87, var91, arg1.field7955[var85], arg1.field7944[var85], var88, var90, arg1.field7980[var85], var81, var92, 2);
                            var78 = class23.field321;
                            var77 = class275.field4026;
                        } else if (var82 == 3) {
                            class510.method2864(arg1.field7980[var83], arg1.field7944[var83], var88, var91, var86, var89, arg1.field7955[var83], var87, 3094, var90);
                            var73 = class311.field4556;
                            var74 = class524.field7285;
                            class510.method2864(arg1.field7980[var84], arg1.field7944[var84], var88, var91, var86, var89, arg1.field7955[var84], var87, 3094, var90);
                            var75 = class311.field4556;
                            var76 = class524.field7285;
                            class510.method2864(arg1.field7980[var85], arg1.field7944[var85], var88, var91, var86, var89, arg1.field7955[var85], var87, 3094, var90);
                            var78 = class524.field7285;
                            var77 = class311.field4556;
                            if ((var90 & 0x1) == 0) {
                                if ((var77 - var73 > 0.5F)) {
                                    var77--;
                                    var80 = 1;
                                } else if (var73 - var77 > 0.5F) {
                                    var77++;
                                    var80 = 2;
                                }
                                if (var75 - var73 > 0.5F) {
                                    var75--;
                                    var79 = 1;
                                } else if (var73 - var75 > 0.5F) {
                                    var75++;
                                    var79 = 2;
                                }
                            } else {
                                if ((var78 - var74 > 0.5F)) {
                                    var78--;
                                    var80 = 1;
                                } else if (var74 - var78 > 0.5F) {
                                    var78++;
                                    var80 = 2;
                                }
                                if ((var76 - var74 > 0.5F)) {
                                    var76--;
                                    var79 = 1;
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
            if (arg1.field7963 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field7963[var68];
            }
            if (var146 == 0) {
                long var150 = ((long) (var69 << 8) + (long) (var81 << 24) + (long) var72 << 32) + (long) (var71 << 2);
                short var152 = arg1.field7959[var68];
                short var153 = arg1.field7940[var68];
                short var154 = arg1.field7941[var68];
                class41 var155 = var13[var152];
                this.field5409[var52] = this.method2277(var155.field573, true, arg1, var152, var150, var155.field574, var73, var74, var155.field570, var155.field569);
                class41 var156 = var13[var153];
                this.field5509[var52] = this.method2277(var156.field573, true, arg1, var153, (long) var79 + var150, var156.field574, var75, var76, var156.field570, var156.field569);
                class41 var157 = var13[var154];
                this.field5420[var52] = this.method2277(var157.field573, true, arg1, var154, (long) var80 + var150, var157.field574, var77, var78, var157.field570, var157.field569);
            } else if (var146 == 1) {
                class234 var147 = var50[var68];
                long var148 = (long) ((var147.field3441 + 256 << 22) + ((var71 << 2) + (var147.field3438 > 0 ? 1024 : 2048)) + (var147.field3440 + 256 << 12)) + ((long) (var81 << 24) + ((long) var72) + (long) (var69 << 8) << 32);
                this.field5409[var52] = this.method2277(var147.field3438, true, arg1, arg1.field7959[var68], var148, 0, var73, var74, var147.field3440, var147.field3441);
                this.field5509[var52] = this.method2277(var147.field3438, true, arg1, arg1.field7940[var68], (long) var79 + var148, 0, var75, var76, var147.field3440, var147.field3441);
                this.field5420[var52] = this.method2277(var147.field3438, true, arg1, arg1.field7941[var68], (long) var80 + var148, 0, var77, var78, var147.field3440, var147.field3441);
            }
            if (arg1.field7962 == null) {
                this.field5499[var52] = -1;
            } else {
                this.field5499[var52] = arg1.field7962[var68];
            }
            if (arg1.field7974 != null) {
                this.field5443[var52] = arg1.field7974[var68];
            }
            if (arg1.field7964 != null) {
                this.field5422[var52] = arg1.field7964[var68];
            }
            this.field5488[var52] = arg1.field7933[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field5512; var55++) {
            short var67 = this.field5499[var55];
            if (var54 != var67) {
                var54 = var67;
                var53++;
            }
        }
        this.field5480 = new int[var53 + 1];
        int var56 = 0;
        short var57 = -10000;
        for (int var58 = 0; var58 < this.field5512; var58++) {
            short var66 = this.field5499[var58];
            if (var57 != var66) {
                this.field5480[var56++] = var58;
                var57 = var66;
            }
        }
        this.field5480[var56] = this.field5512;
        class240.field3491 = null;
        this.field5411 = class284.method1809((byte) -63, this.field5413, this.field5411);
        this.field5448 = class284.method1809((byte) 126, this.field5413, this.field5448);
        this.field5470 = class284.method1809((byte) 112, this.field5413, this.field5470);
        this.field5498 = class637.method3680(this.field5413, this.field5498, -124);
        this.field5515 = class643.method3708(true, this.field5515, this.field5413);
        this.field5473 = class643.method3708(true, this.field5473, this.field5413);
        if (arg1.field7936 != null && class424.method2542(arg2, this.field5518, 31878)) {
            this.field5510 = arg1.method3154(false, 10018);
        }
        if (arg1.field7949 != null && class142.method1054(arg2, (byte) -92, this.field5518)) {
            this.field5468 = arg1.method3158(-1);
        }
        if (arg1.field7957 != null && class41.method374(this.field5518, arg2, -1)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field5453; var61++) {
                int var65 = arg1.field7957[var8[var61]];
                if (var65 >= 0) {
                    int var10002 = var60[var65]++;
                    if (var59 < var65) {
                        var59 = var65;
                    }
                }
            }
            this.field5434 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field5434[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field5453; var63++) {
                int var64 = arg1.field7957[var8[var63]];
                if (var64 >= 0) {
                    this.field5434[var64][var60[var64]++] = var63;
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZI)V", line = 1238)
    private final void method2272(boolean arg0, int arg1) {
        field5444++;
        boolean var3 = this.field5505 != null && this.field5505.field345 == null;
        boolean var4 = this.field5430 != null && this.field5430.field345 == null;
        boolean var5 = this.field5463 != null && this.field5463.field345 == null;
        boolean var6 = this.field5474 != null && this.field5474.field345 == null;
        if (arg0) {
            var4 &= (this.field5481 & 0x4) != 0;
            var3 &= (this.field5481 & 0x2) != 0;
            var6 &= (this.field5481 & 0x8) != 0;
            var5 &= (this.field5481 & 0x1) != 0;
        }
        byte var7 = 0;
        byte var8 = 0;
        byte var9 = 0;
        byte var10 = 0;
        if (var5) {
            var8 = var7;
            var7 = (byte) (var7 + 12);
        }
        byte var11 = 0;
        if (arg1 != 2) {
            return;
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
        if (this.field5504.field1220.field3952.length >= this.field5413 * var7) {
            this.field5504.field1220.field3913 = 0;
        } else {
            this.field5504.field1220 = new class583((this.field5413 + 100) * var7);
        }
        class583 var12 = this.field5504.field1220;
        if (var5) {
            if (this.field5504.field1187) {
                for (int var21 = 0; var21 < this.field5438; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field5462[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field5511[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field5506[var21]);
                    int var25 = this.field5441[var21];
                    int var26 = this.field5441[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field5446[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field3913 = var7 * var28;
                        var12.method1702(var22, false);
                        var12.method1702(var23, false);
                        var12.method1702(var24, false);
                    }
                }
            } else {
                for (int var13 = 0; var13 < this.field5438; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field5462[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field5511[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field5506[var13]);
                    int var17 = this.field5441[var13];
                    int var18 = this.field5441[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field5446[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field3913 = var7 * var20;
                        var12.method1709((byte) -103, var14);
                        var12.method1709((byte) -18, var15);
                        var12.method1709((byte) -127, var16);
                    }
                }
            }
        }
        if (var3) {
            if (this.field5430 == null) {
                short[] var29;
                byte[] var30;
                short[] var31;
                short[] var32;
                if (this.field5423 == null) {
                    var29 = this.field5470;
                    var30 = this.field5498;
                    var31 = this.field5411;
                    var32 = this.field5448;
                } else {
                    var32 = this.field5423.field7836;
                    var30 = this.field5423.field7838;
                    var29 = this.field5423.field7833;
                    var31 = this.field5423.field7837;
                }
                float var33 = this.field5504.field1247[0];
                float var34 = this.field5504.field1247[1];
                float var35 = this.field5504.field1247[2];
                float var36 = this.field5504.field1209;
                float var37 = this.field5504.field1272 * 768.0F / (float) this.field5445;
                float var38 = this.field5504.field1248 * 768.0F / (float) this.field5445;
                for (int var39 = 0; var39 < this.field5453; var39++) {
                    int var40 = this.method2278(false, this.field5499[var39], this.field5488[var39], this.field5497, this.field5443[var39]);
                    float var41 = (float) ((var40 & 0xFFEB) >> 8) * this.field5504.field1208;
                    float var42 = (float) (var40 >> 16 & 0xFF) * this.field5504.field1161;
                    short var43 = this.field5409[var39];
                    float var44 = (float) (var40 >>> 24) * this.field5504.field1262;
                    short var45 = (short) var30[var43];
                    float var46;
                    if (var45 == 0) {
                        var46 = ((float) var29[var43] * var35 + (float) var31[var43] * var33 + (float) var32[var43] * var34) * 0.0026041667F;
                    } else {
                        var46 = ((float) var29[var43] * var35 + (float) var31[var43] * var33 + (float) var32[var43] * var34) / (float) (var45 * 256);
                    }
                    float var47 = (var46 < 0.0F ? var38 : var37) * var46 + var36;
                    int var48 = (int) (var44 * var47);
                    if (var48 < 0) {
                        var48 = 0;
                    } else if (var48 > 255) {
                        var48 = 255;
                    }
                    int var49 = (int) (var42 * var47);
                    if (var49 < 0) {
                        var49 = 0;
                    } else if (var49 > 255) {
                        var49 = 255;
                    }
                    int var50 = (int) (var41 * var47);
                    var12.field3913 = var7 * var43 + var9;
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    var12.method1710(var48, 77);
                    var12.method1710(var49, 92);
                    var12.method1710(var50, 81);
                    var12.method1710(255 - (this.field5443[var39] & 0xFF), 118);
                    short var51 = this.field5509[var39];
                    short var52 = (short) var30[var51];
                    float var53;
                    if (var52 == 0) {
                        var53 = ((float) var29[var51] * var35 + (float) var31[var51] * var33 + (float) var32[var51] * var34) * 0.0026041667F;
                    } else {
                        var53 = ((float) var29[var51] * var35 + (float) var31[var51] * var33 + (float) var32[var51] * var34) / (float) (var52 * 256);
                    }
                    float var54 = ((var53 < 0.0F) ? var38 : var37) * var53 + var36;
                    int var55 = (int) (var44 * var54);
                    int var56 = (int) (var42 * var54);
                    if (var55 < 0) {
                        var55 = 0;
                    } else if (var55 > 255) {
                        var55 = 255;
                    }
                    int var57 = (int) (var41 * var54);
                    if (var56 < 0) {
                        var56 = 0;
                    } else if (var56 > 255) {
                        var56 = 255;
                    }
                    var12.field3913 = var7 * var51 + var9;
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    var12.method1710(var55, 47);
                    var12.method1710(var56, 32);
                    var12.method1710(var57, arg1 ^ 0x4A);
                    var12.method1710(255 - (this.field5443[var39] & 0xFF), arg1 + 21);
                    short var58 = this.field5420[var39];
                    short var59 = (short) var30[var58];
                    float var60;
                    if (var59 == 0) {
                        var60 = ((float) var29[var58] * var35 + (float) var31[var58] * var33 + (float) var32[var58] * var34) * 0.0026041667F;
                    } else {
                        var60 = ((float) var29[var58] * var35 + (float) var31[var58] * var33 + (float) var32[var58] * var34) / (float) (var59 * 256);
                    }
                    float var61 = (var60 < 0.0F ? var38 : var37) * var60 + var36;
                    int var62 = (int) (var44 * var61);
                    int var63 = (int) (var42 * var61);
                    if (var62 < 0) {
                        var62 = 0;
                    } else if (var62 > 255) {
                        var62 = 255;
                    }
                    int var64 = (int) (var41 * var61);
                    if (var63 < 0) {
                        var63 = 0;
                    } else if (var63 > 255) {
                        var63 = 255;
                    }
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    var12.field3913 = var7 * var58 + var9;
                    var12.method1710(var62, 95);
                    var12.method1710(var63, 24);
                    var12.method1710(var64, 35);
                    var12.method1710(255 - (this.field5443[var39] & 0xFF), arg1 + 17);
                }
            } else {
                for (int var65 = 0; var65 < this.field5453; var65++) {
                    int var66 = this.method2278(false, this.field5499[var65], this.field5488[var65], this.field5497, this.field5443[var65]);
                    var12.field3913 = this.field5409[var65] * var7 + var9;
                    var12.method1702(var66, false);
                    var12.field3913 = var9 + (this.field5509[var65] * var7);
                    var12.method1702(var66, false);
                    var12.field3913 = var9 + (this.field5420[var65] * var7);
                    var12.method1702(var66, false);
                }
            }
        }
        if (var4) {
            short[] var67;
            short[] var68;
            short[] var69;
            byte[] var70;
            if (this.field5423 == null) {
                var70 = this.field5498;
                var69 = this.field5411;
                var68 = this.field5448;
                var67 = this.field5470;
            } else {
                var67 = this.field5423.field7833;
                var68 = this.field5423.field7836;
                var69 = this.field5423.field7837;
                var70 = this.field5423.field7838;
            }
            float var71 = 3.0F / (float) this.field5445;
            var12.field3913 = var10;
            float var72 = 3.0F / (float) (this.field5445 / 2 + this.field5445);
            if (this.field5504.field1187) {
                for (int var76 = 0; var76 < this.field5413; var76++) {
                    int var77 = var70[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method3339((float) var69[var76] * var72, -9720);
                        var12.method3339((float) var68[var76] * var72, -9720);
                        var12.method3339((float) var67[var76] * var72, -9720);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method3339((float) var69[var76] * var78, -9720);
                        var12.method3339((float) var68[var76] * var78, -9720);
                        var12.method3339((float) var67[var76] * var78, -9720);
                    }
                    var12.field3913 += var7 - 12;
                }
            } else {
                for (int var73 = 0; var73 < this.field5413; var73++) {
                    int var74 = var70[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method3338(arg1 - 1325457554, (float) var69[var73] * var72);
                        var12.method3338(-1325457552, (float) var68[var73] * var72);
                        var12.method3338(-1325457552, (float) var67[var73] * var72);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method3338(-1325457552, (float) var69[var73] * var75);
                        var12.method3338(-1325457552, (float) var68[var73] * var75);
                        var12.method3338(-1325457552, (float) var67[var73] * var75);
                    }
                    var12.field3913 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field3913 = var11;
            if (this.field5504.field1187) {
                for (int var80 = 0; var80 < this.field5413; var80++) {
                    var12.method3339(this.field5515[var80], -9720);
                    var12.method3339(this.field5473[var80], -9720);
                    var12.field3913 += var7 - 8;
                }
            } else {
                for (int var79 = 0; var79 < this.field5413; var79++) {
                    var12.method3338(arg1 - 1325457554, this.field5515[var79]);
                    var12.method3338(-1325457552, this.field5473[var79]);
                    var12.field3913 += var7 - 8;
                }
            }
        }
        var12.field3913 = this.field5413 * var7;
        class423 var81;
        if (arg0) {
            if (this.field5433 == null) {
                this.field5433 = this.field5504.method570(var12.field3952, 1, true, var7, var12.field3913);
            } else {
                this.field5433.method1556(var7, var12.field3952, (byte) 88, var12.field3913);
            }
            var81 = this.field5433;
            this.field5481 = 0;
        } else {
            var81 = this.field5504.method570(var12.field3952, 1, false, var7, var12.field3913);
            this.field5502 = true;
        }
        if (var5) {
            this.field5463.field345 = var81;
            this.field5463.field347 = var8;
        }
        if (var6) {
            this.field5474.field345 = var81;
            this.field5474.field347 = var11;
        }
        if (var3) {
            this.field5505.field345 = var81;
            this.field5505.field347 = var9;
        }
        if (var4) {
            this.field5430.field347 = var10;
            this.field5430.field345 = var81;
        }
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "()[Ltf;", line = 1761)
    public final class643[] method1372() {
        field5424++;
        return this.field5435;
    }

    @OriginalMember(owner = "client!la", name = "D", descriptor = "(I)V", line = 1769)
    public final void method1383(int arg0) {
        field5410++;
        int var2 = class285.field4154[arg0];
        int var3 = class285.field4152[arg0];
        for (int var4 = 0; var4 < this.field5438; var4++) {
            int var5 = this.field5511[var4] * var3 - (this.field5506[var4] * var2) >> 15;
            this.field5506[var4] = this.field5511[var4] * var2 + this.field5506[var4] * var3 >> 15;
            this.field5511[var4] = var5;
        }
        this.field5464 = false;
        if (this.field5463 != null) {
            this.field5463.field345 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "X", descriptor = "()V", line = 1798)
    public final void method1351() {
        for (int var1 = 0; var1 < this.field5438; var1++) {
            this.field5506[var1] = -this.field5506[var1];
        }
        field5513++;
        for (int var2 = 0; var2 < this.field5413; var2++) {
            this.field5470[var2] = (short) (-this.field5470[var2]);
        }
        for (int var3 = 0; var3 < this.field5453; var3++) {
            short var4 = this.field5409[var3];
            this.field5409[var3] = this.field5420[var3];
            this.field5420[var3] = var4;
        }
        if (this.field5430 == null && this.field5505 != null) {
            this.field5505.field345 = null;
        }
        if (this.field5430 != null) {
            this.field5430.field345 = null;
        }
        if (this.field5463 != null) {
            this.field5463.field345 = null;
        }
        this.field5464 = false;
        if (this.field5450 != null) {
            this.field5450.field855 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "()V", line = 1849)
    public final void method1357() {
        field5451++;
        if (this.field5413 <= 0 || this.field5512 <= 0) {
            return;
        }
        this.method2272(false, 2);
        if ((this.field5481 & 0x10) == 0 && this.field5450.field855 == null) {
            this.method2276(152175503, false);
        }
        this.method2280((byte) -80);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lr;IIIZ)V", line = 1869)
    public final void method1363(class519 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field5418++;
        class374 var6 = (class374) arg0;
        if (this.field5453 == 0 || var6.field5453 == 0) {
            return;
        }
        int var7 = var6.field5438;
        int[] var8 = var6.field5462;
        int[] var9 = var6.field5511;
        int[] var10 = var6.field5506;
        short[] var11 = var6.field5411;
        short[] var12 = var6.field5448;
        short[] var13 = var6.field5470;
        byte[] var14 = var6.field5498;
        byte[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field5423 == null) {
            var17 = null;
            var16 = null;
            var15 = null;
            var18 = null;
        } else {
            var15 = this.field5423.field7838;
            var16 = this.field5423.field7837;
            var17 = this.field5423.field7833;
            var18 = this.field5423.field7836;
        }
        byte[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field5423 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field5423.field7838;
            var22 = var6.field5423.field7837;
            var21 = var6.field5423.field7836;
            var20 = var6.field5423.field7833;
        }
        int[] var23 = var6.field5441;
        short[] var24 = var6.field5446;
        if (!var6.field5464) {
            var6.method2271((byte) -113);
        }
        short var25 = var6.field5412;
        short var26 = var6.field5466;
        short var27 = var6.field5428;
        short var28 = var6.field5501;
        short var29 = var6.field5495;
        short var30 = var6.field5437;
        for (int var31 = 0; var31 < this.field5438; var31++) {
            int var32 = this.field5511[var31] - arg2;
            if (var32 >= var25 && var26 >= var32) {
                int var33 = this.field5462[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field5506[var31] - arg3;
                    if (var29 <= var34 && var30 >= var34) {
                        int var35 = -1;
                        int var36 = this.field5441[var31];
                        int var37 = this.field5441[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field5446[var38] - 1;
                            if (var35 == -1 || this.field5498[var35] != 0) {
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
                                            this.field5423 = new class554();
                                            var16 = this.field5423.field7837 = class416.method2510(this.field5411, false);
                                            var18 = this.field5423.field7836 = class416.method2510(this.field5448, false);
                                            var17 = this.field5423.field7833 = class416.method2510(this.field5470, false);
                                            var15 = this.field5423.field7838 = class410.method2491(-3, this.field5498);
                                        }
                                        if (var22 == null) {
                                            class554 var44 = var6.field5423 = new class554();
                                            var22 = var44.field7837 = class416.method2510(var11, false);
                                            var21 = var44.field7836 = class416.method2510(var12, false);
                                            var20 = var44.field7833 = class416.method2510(var13, false);
                                            var19 = var44.field7838 = class410.method2491(-115, var14);
                                        }
                                        short var45 = this.field5411[var35];
                                        short var46 = this.field5448[var35];
                                        short var47 = this.field5470[var35];
                                        byte var48 = this.field5498[var35];
                                        int var49 = var23[var39];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var49; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var19[var52] != 0) {
                                                var22[var52] += var45;
                                                var21[var52] += var46;
                                                var20[var52] += var47;
                                                var19[var52] += var48;
                                            }
                                        }
                                        short var53 = var11[var42];
                                        byte var54 = var14[var42];
                                        short var55 = var13[var42];
                                        int var56 = this.field5441[var31];
                                        int var57 = this.field5441[var31 + 1];
                                        short var58 = var12[var42];
                                        for (int var59 = var56; var59 < var57; var59++) {
                                            int var60 = this.field5446[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var15[var60] != 0) {
                                                var16[var60] += var53;
                                                var18[var60] += var58;
                                                var17[var60] += var55;
                                                var15[var60] += var54;
                                            }
                                        }
                                        if (this.field5430 == null && this.field5505 != null) {
                                            this.field5505.field345 = null;
                                        }
                                        if (this.field5430 != null) {
                                            this.field5430.field345 = null;
                                        }
                                        if (var6.field5430 == null && var6.field5505 != null) {
                                            var6.field5505.field345 = null;
                                        }
                                        if (var6.field5430 != null) {
                                            var6.field5430.field345 = null;
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

    @OriginalMember(owner = "client!la", name = "l", descriptor = "(IIII)V", line = 2147)
    public final void method1402(int arg0, int arg1, int arg2, int arg3) {
        field5487++;
        if (arg0 == 0) {
            int var5 = 0;
            class325.field4684 = 0;
            class155.field2340 = 0;
            class512.field7088 = 0;
            for (int var6 = 0; var6 < this.field5438; var6++) {
                class512.field7088 += this.field5462[var6];
                class325.field4684 += this.field5511[var6];
                var5++;
                class155.field2340 += this.field5506[var6];
            }
            if (var5 > 0) {
                class325.field4684 = class325.field4684 / var5 + arg2;
                class512.field7088 = class512.field7088 / var5 + arg1;
                class155.field2340 = class155.field2340 / var5 + arg3;
            } else {
                class325.field4684 = arg2;
                class155.field2340 = arg3;
                class512.field7088 = arg1;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field5438; var7++) {
                this.field5462[var7] += arg1;
                this.field5511[var7] += arg2;
                this.field5506[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field5438; var8++) {
                this.field5462[var8] -= class512.field7088;
                this.field5511[var8] -= class325.field4684;
                this.field5506[var8] -= class155.field2340;
                if (arg3 != 0) {
                    int var9 = class285.field4154[arg3];
                    int var10 = class285.field4152[arg3];
                    int var11 = this.field5462[var8] * var10 + this.field5511[var8] * var9 + 32767 >> 15;
                    this.field5511[var8] = this.field5511[var8] * var10 + 32767 - (this.field5462[var8] * var9) >> 15;
                    this.field5462[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class285.field4154[arg1];
                    int var13 = class285.field4152[arg1];
                    int var14 = this.field5511[var8] * var13 + 32767 - this.field5506[var8] * var12 >> 15;
                    this.field5506[var8] = this.field5511[var8] * var12 + this.field5506[var8] * var13 + 32767 >> 15;
                    this.field5511[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class285.field4154[arg2];
                    int var16 = class285.field4152[arg2];
                    int var17 = this.field5506[var8] * var15 + this.field5462[var8] * var16 + 32767 >> 15;
                    this.field5506[var8] = this.field5506[var8] * var16 + 32767 - (this.field5462[var8] * var15) >> 15;
                    this.field5462[var8] = var17;
                }
                this.field5462[var8] += class512.field7088;
                this.field5511[var8] += class325.field4684;
                this.field5506[var8] += class155.field2340;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field5438; var18++) {
                this.field5462[var18] -= class512.field7088;
                this.field5511[var18] -= class325.field4684;
                this.field5506[var18] -= class155.field2340;
                this.field5462[var18] = this.field5462[var18] * arg1 / 128;
                this.field5511[var18] = this.field5511[var18] * arg2 / 128;
                this.field5506[var18] = this.field5506[var18] * arg3 / 128;
                this.field5462[var18] += class512.field7088;
                this.field5511[var18] += class325.field4684;
                this.field5506[var18] += class155.field2340;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field5453; var19++) {
                int var23 = (this.field5443[var19] & 0xFF) + (arg1 * 8);
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field5443[var19] = (byte) var23;
            }
            if (this.field5505 != null) {
                this.field5505.field345 = null;
            }
            if (this.field5479 != null) {
                for (int var20 = 0; var20 < this.field5455; var20++) {
                    class24 var21 = this.field5479[var20];
                    class319 var22 = this.field5452[var20];
                    var22.field4627 = var22.field4627 & 0xFFFFFF | 255 - (this.field5443[var21.field338] & 0xFF) << 24;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field5453; var24++) {
                int var28 = this.field5488[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = var28 >> 7 & 0x7;
                int var31 = arg2 / 4 + var30;
                int var32 = var29 + arg1 & 0x3F;
                int var33 = var28 & 0x7F;
                int var34 = arg3 + var33;
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 7) {
                    var31 = 7;
                }
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field5488[var24] = (short) class188.method1258(var34, class188.method1258(var32 << 10, var31 << 7));
            }
            if (this.field5505 != null) {
                this.field5505.field345 = null;
            }
            if (this.field5479 != null) {
                for (int var25 = 0; var25 < this.field5455; var25++) {
                    class24 var26 = this.field5479[var25];
                    class319 var27 = this.field5452[var25];
                    var27.field4627 = var27.field4627 & 0xFF000000 | class220.field3297[this.field5488[var26.field338] & 0xFFFF] & 0xFFFFFF;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field5455; var35++) {
                class319 var36 = this.field5452[var35];
                var36.field4623 += arg2;
                var36.field4624 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field5455; var37++) {
                class319 var38 = this.field5452[var37];
                var38.field4626 = var38.field4626 * arg1 >> 7;
                var38.field4634 = var38.field4634 * arg2 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field5455; var39++) {
                class319 var40 = this.field5452[var39];
                var40.field4632 = var40.field4632 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lol;Z)V", line = 2455)
    private final void method2273(class249 arg0, boolean arg1) {
        if (!arg1) {
            this.method1382();
        }
        field5460++;
        if (this.field5489 != null) {
            for (int var3 = 0; var3 < this.field5489.length; var3++) {
                class595 var4 = this.field5489[var3];
                class595 var5 = var4;
                if (var4.field8473 != null) {
                    var5 = var4.field8473;
                }
                var5.field8460 = (int) ((float) this.field5506[var4.field8471] * arg0.field3648 + (float) this.field5511[var4.field8471] * arg0.field3643 + (float) this.field5462[var4.field8471] * arg0.field3630 + arg0.field3629);
                var5.field8475 = (int) ((float) this.field5506[var4.field8471] * arg0.field3622 + (float) this.field5511[var4.field8471] * arg0.field3627 + (float) this.field5462[var4.field8471] * arg0.field3624 + arg0.field3619);
                var5.field8470 = (int) ((float) this.field5506[var4.field8471] * arg0.field3632 + (float) this.field5511[var4.field8471] * arg0.field3638 + (float) this.field5462[var4.field8471] * arg0.field3633 + arg0.field3628);
                var5.field8478 = (int) ((float) this.field5506[var4.field8465] * arg0.field3648 + (float) this.field5511[var4.field8465] * arg0.field3643 + (float) this.field5462[var4.field8465] * arg0.field3630 + arg0.field3629);
                var5.field8479 = (int) ((float) this.field5506[var4.field8465] * arg0.field3622 + (float) this.field5511[var4.field8465] * arg0.field3627 + (float) this.field5462[var4.field8465] * arg0.field3624 + arg0.field3619);
                var5.field8461 = (int) ((float) this.field5506[var4.field8465] * arg0.field3632 + (float) this.field5511[var4.field8465] * arg0.field3638 + (float) this.field5462[var4.field8465] * arg0.field3633 + arg0.field3628);
                var5.field8477 = (int) ((float) this.field5506[var4.field8481] * arg0.field3648 + (float) this.field5511[var4.field8481] * arg0.field3643 + (float) this.field5462[var4.field8481] * arg0.field3630 + arg0.field3629);
                var5.field8472 = (int) ((float) this.field5506[var4.field8481] * arg0.field3622 + (float) this.field5511[var4.field8481] * arg0.field3627 + (float) this.field5462[var4.field8481] * arg0.field3624 + arg0.field3619);
                var5.field8462 = (int) ((float) this.field5506[var4.field8481] * arg0.field3632 + (float) this.field5511[var4.field8481] * arg0.field3638 + (float) this.field5462[var4.field8481] * arg0.field3633 + arg0.field3628);
            }
        }
        if (this.field5435 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field5435.length; var6++) {
            class643 var7 = this.field5435[var6];
            class643 var8 = var7;
            if (var7.field9350 != null) {
                var8 = var7.field9350;
            }
            if (var7.field9344 == null) {
                var7.field9344 = arg0.method879();
            } else {
                var7.field9344.method878(arg0);
            }
            var8.field9353 = (int) ((float) this.field5506[var7.field9355] * arg0.field3648 + (float) this.field5511[var7.field9355] * arg0.field3643 + (float) this.field5462[var7.field9355] * arg0.field3630 + arg0.field3629);
            var8.field9345 = (int) ((float) this.field5506[var7.field9355] * arg0.field3622 + (float) this.field5511[var7.field9355] * arg0.field3627 + (float) this.field5462[var7.field9355] * arg0.field3624 + arg0.field3619);
            var8.field9347 = (int) ((float) this.field5506[var7.field9355] * arg0.field3632 + (float) this.field5511[var7.field9355] * arg0.field3638 + (float) this.field5462[var7.field9355] * arg0.field3633 + arg0.field3628);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V", line = 2525)
    public static final void method2274(boolean arg0) {
        field5482++;
        int[] var1 = new int[class611.field8684.field3736];
        int var2 = 0;
        if (arg0) {
            method2274(true);
        }
        for (int var3 = 0; var3 < class611.field8684.field3736; var3++) {
            class381 var5 = class611.field8684.method1621((byte) 64, var3);
            if (var5.field5608 >= 0 || var5.field5652 >= 0) {
                var1[var2++] = var3;
            }
        }
        class624.field8809 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class624.field8809[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZIBZLla;Lla;)Lr;", line = 2563)
    private final class519 method2275(boolean arg0, int arg1, byte arg2, boolean arg3, class374 arg4, class374 arg5) {
        arg5.field5497 = this.field5497;
        arg5.field5438 = this.field5438;
        arg5.field5455 = this.field5455;
        arg5.field5445 = this.field5445;
        arg5.field5481 = 0;
        arg5.field5413 = this.field5413;
        arg5.field5512 = this.field5512;
        arg5.field5475 = arg1;
        arg5.field5432 = this.field5432;
        field5469++;
        arg5.field5453 = this.field5453;
        if (arg2 != -50) {
            this.method1376();
        }
        arg5.field5518 = this.field5518;
        boolean var7 = class272.method1765((byte) -17, arg1, this.field5518);
        boolean var8 = class513.method2875(this.field5518, arg1, 34);
        boolean var9 = class252.method1593((byte) 125, this.field5518, arg1);
        boolean var10 = var9 | var8 | var7;
        if (var10) {
            if (!var7) {
                arg5.field5462 = this.field5462;
            } else if (arg4.field5462 == null || this.field5432 > arg4.field5462.length) {
                arg5.field5462 = arg4.field5462 = new int[this.field5432];
            } else {
                arg5.field5462 = arg4.field5462;
            }
            if (!var8) {
                arg5.field5511 = this.field5511;
            } else if (arg4.field5511 == null || arg4.field5511.length < this.field5432) {
                arg5.field5511 = arg4.field5511 = new int[this.field5432];
            } else {
                arg5.field5511 = arg4.field5511;
            }
            if (!var9) {
                arg5.field5506 = this.field5506;
            } else if (arg4.field5506 == null || this.field5432 > arg4.field5506.length) {
                arg5.field5506 = arg4.field5506 = new int[this.field5432];
            } else {
                arg5.field5506 = arg4.field5506;
            }
            for (int var11 = 0; var11 < this.field5432; var11++) {
                if (var7) {
                    arg5.field5462[var11] = this.field5462[var11];
                }
                if (var8) {
                    arg5.field5511[var11] = this.field5511[var11];
                }
                if (var9) {
                    arg5.field5506[var11] = this.field5506[var11];
                }
            }
        } else {
            arg5.field5462 = this.field5462;
            arg5.field5506 = this.field5506;
            arg5.field5511 = this.field5511;
        }
        if (class511.method2866(this.field5518, arg1, arg2 + 96)) {
            if (arg3) {
                arg5.field5481 = (byte) (arg5.field5481 | 0x1);
            }
            arg5.field5463 = arg4.field5463;
            arg5.field5463.field347 = this.field5463.field347;
            arg5.field5463.field345 = this.field5463.field345;
        } else if (class284.method1807(arg1, -24291, this.field5518)) {
            arg5.field5463 = this.field5463;
        } else {
            arg5.field5463 = null;
        }
        if (class399.method2438(this.field5518, arg1, arg2 + 540850)) {
            if (arg4.field5488 == null || this.field5453 > arg4.field5488.length) {
                arg5.field5488 = arg4.field5488 = new short[this.field5453];
            } else {
                arg5.field5488 = arg4.field5488;
            }
            for (int var12 = 0; var12 < this.field5453; var12++) {
                arg5.field5488[var12] = this.field5488[var12];
            }
        } else {
            arg5.field5488 = this.field5488;
        }
        if (class33.method301(arg1, this.field5518, (byte) -99)) {
            if (arg4.field5443 == null || this.field5453 > arg4.field5443.length) {
                arg5.field5443 = arg4.field5443 = new byte[this.field5453];
            } else {
                arg5.field5443 = arg4.field5443;
            }
            for (int var13 = 0; var13 < this.field5453; var13++) {
                arg5.field5443[var13] = this.field5443[var13];
            }
        } else {
            arg5.field5443 = this.field5443;
        }
        if (class586.method3358(55, this.field5518, arg1)) {
            arg5.field5505 = arg4.field5505;
            if (arg3) {
                arg5.field5481 = (byte) (arg5.field5481 | 0x2);
            }
            arg5.field5505.field345 = this.field5505.field345;
            arg5.field5505.field347 = this.field5505.field347;
        } else if (class448.method2654(this.field5518, arg1, (byte) -105)) {
            arg5.field5505 = this.field5505;
        } else {
            arg5.field5505 = null;
        }
        if (class219.method1469((byte) 67, arg1, this.field5518)) {
            if (arg4.field5411 == null || arg4.field5411.length < this.field5413) {
                int var14 = this.field5413;
                arg5.field5448 = arg4.field5448 = new short[var14];
                arg5.field5411 = arg4.field5411 = new short[var14];
                arg5.field5470 = arg4.field5470 = new short[var14];
            } else {
                arg5.field5470 = arg4.field5470;
                arg5.field5411 = arg4.field5411;
                arg5.field5448 = arg4.field5448;
            }
            if (this.field5423 == null) {
                for (int var15 = 0; var15 < this.field5413; var15++) {
                    arg5.field5411[var15] = this.field5411[var15];
                    arg5.field5448[var15] = this.field5448[var15];
                    arg5.field5470[var15] = this.field5470[var15];
                }
            } else {
                if (arg4.field5423 == null) {
                    arg4.field5423 = new class554();
                }
                class554 var16 = arg5.field5423 = arg4.field5423;
                if (var16.field7837 == null || var16.field7837.length < this.field5413) {
                    int var17 = this.field5413;
                    var16.field7837 = new short[var17];
                    var16.field7833 = new short[var17];
                    var16.field7836 = new short[var17];
                    var16.field7838 = new byte[var17];
                }
                for (int var18 = 0; var18 < this.field5413; var18++) {
                    arg5.field5411[var18] = this.field5411[var18];
                    arg5.field5448[var18] = this.field5448[var18];
                    arg5.field5470[var18] = this.field5470[var18];
                    var16.field7837[var18] = this.field5423.field7837[var18];
                    var16.field7836[var18] = this.field5423.field7836[var18];
                    var16.field7833[var18] = this.field5423.field7833[var18];
                    var16.field7838[var18] = this.field5423.field7838[var18];
                }
            }
            arg5.field5498 = this.field5498;
        } else {
            arg5.field5411 = this.field5411;
            arg5.field5448 = this.field5448;
            arg5.field5423 = this.field5423;
            arg5.field5470 = this.field5470;
            arg5.field5498 = this.field5498;
        }
        if (class441.method2611(-87, arg1, this.field5518)) {
            if (arg3) {
                arg5.field5481 = (byte) (arg5.field5481 | 0x4);
            }
            arg5.field5430 = arg4.field5430;
            arg5.field5430.field345 = this.field5430.field345;
            arg5.field5430.field347 = this.field5430.field347;
        } else if (class224.method1495(55, this.field5518, arg1)) {
            arg5.field5430 = this.field5430;
        } else {
            arg5.field5430 = null;
        }
        if (class563.method3210(arg1, -74, this.field5518)) {
            if (arg4.field5515 == null || this.field5453 > arg4.field5515.length) {
                int var19 = this.field5413;
                arg5.field5473 = arg4.field5473 = new float[var19];
                arg5.field5515 = arg4.field5515 = new float[var19];
            } else {
                arg5.field5473 = arg4.field5473;
                arg5.field5515 = arg4.field5515;
            }
            for (int var20 = 0; var20 < this.field5413; var20++) {
                arg5.field5515[var20] = this.field5515[var20];
                arg5.field5473[var20] = this.field5473[var20];
            }
        } else {
            arg5.field5473 = this.field5473;
            arg5.field5515 = this.field5515;
        }
        if (class435.method2588(this.field5518, arg1, -91)) {
            arg5.field5474 = arg4.field5474;
            if (arg3) {
                arg5.field5481 = (byte) (arg5.field5481 | 0x8);
            }
            arg5.field5474.field347 = this.field5474.field347;
            arg5.field5474.field345 = this.field5474.field345;
        } else if (class408.method2477(arg1, this.field5518, (byte) 114)) {
            arg5.field5474 = this.field5474;
        } else {
            arg5.field5474 = null;
        }
        if (class55.method453(arg1, true, this.field5518)) {
            if (arg4.field5409 == null || arg4.field5409.length < this.field5453) {
                int var21 = this.field5453;
                arg5.field5420 = arg4.field5420 = new short[var21];
                arg5.field5509 = arg4.field5509 = new short[var21];
                arg5.field5409 = arg4.field5409 = new short[var21];
            } else {
                arg5.field5409 = arg4.field5409;
                arg5.field5509 = arg4.field5509;
                arg5.field5420 = arg4.field5420;
            }
            for (int var22 = 0; var22 < this.field5453; var22++) {
                arg5.field5409[var22] = this.field5409[var22];
                arg5.field5509[var22] = this.field5509[var22];
                arg5.field5420[var22] = this.field5420[var22];
            }
        } else {
            arg5.field5509 = this.field5509;
            arg5.field5420 = this.field5420;
            arg5.field5409 = this.field5409;
        }
        if (class105.method889(this.field5518, arg1, 117)) {
            arg5.field5450 = arg4.field5450;
            if (arg3) {
                arg5.field5481 = (byte) (arg5.field5481 | 0x10);
            }
            arg5.field5450.field855 = this.field5450.field855;
        } else if (class595.method3399(arg1, 0, this.field5518)) {
            arg5.field5450 = this.field5450;
        } else {
            arg5.field5450 = null;
        }
        if (class191.method1264(arg1, -78, this.field5518)) {
            if (arg4.field5499 == null || arg4.field5499.length < this.field5453) {
                int var23 = this.field5453;
                arg5.field5499 = arg4.field5499 = new short[var23];
            } else {
                arg5.field5499 = arg4.field5499;
            }
            for (int var24 = 0; var24 < this.field5453; var24++) {
                arg5.field5499[var24] = this.field5499[var24];
            }
        } else {
            arg5.field5499 = this.field5499;
        }
        if (!class384.method2338(this.field5518, arg1, 1408)) {
            arg5.field5452 = this.field5452;
        } else if (arg4.field5452 == null || arg4.field5452.length < this.field5455) {
            int var26 = this.field5455;
            arg5.field5452 = arg4.field5452 = new class319[var26];
            for (int var27 = 0; var27 < this.field5455; var27++) {
                arg5.field5452[var27] = this.field5452[var27].method1956(128);
            }
        } else {
            arg5.field5452 = arg4.field5452;
            for (int var25 = 0; var25 < this.field5455; var25++) {
                arg5.field5452[var25].method1958(true, this.field5452[var25]);
            }
        }
        arg5.field5468 = this.field5468;
        arg5.field5441 = this.field5441;
        arg5.field5434 = this.field5434;
        arg5.field5492 = this.field5492;
        if (this.field5464) {
            arg5.field5428 = this.field5428;
            arg5.field5437 = this.field5437;
            arg5.field5412 = this.field5412;
            arg5.field5464 = true;
            arg5.field5495 = this.field5495;
            arg5.field5442 = this.field5442;
            arg5.field5501 = this.field5501;
            arg5.field5466 = this.field5466;
        } else {
            arg5.field5464 = false;
        }
        arg5.field5510 = this.field5510;
        arg5.field5446 = this.field5446;
        arg5.field5435 = this.field5435;
        arg5.field5489 = this.field5489;
        arg5.field5479 = this.field5479;
        arg5.field5422 = this.field5422;
        arg5.field5480 = this.field5480;
        return arg5;
    }

    @OriginalMember(owner = "client!la", name = "TA", descriptor = "()I", line = 3028)
    public final int method1390() {
        if (!this.field5464) {
            this.method2271((byte) -113);
        }
        field5454++;
        return this.field5412;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZ)V", line = 3041)
    private final void method2276(int arg0, boolean arg1) {
        if (arg0 != 152175503) {
            return;
        }
        field5457++;
        if ((this.field5512 * 6) > this.field5504.field1220.field3952.length) {
            this.field5504.field1220 = new class583((this.field5512 + 100) * 6);
        } else {
            this.field5504.field1220.field3913 = 0;
        }
        class583 var3 = this.field5504.field1220;
        if (this.field5504.field1187) {
            for (int var5 = 0; var5 < this.field5512; var5++) {
                var3.method1699(true, this.field5409[var5]);
                var3.method1699(true, this.field5509[var5]);
                var3.method1699(true, this.field5420[var5]);
            }
        } else {
            for (int var4 = 0; var4 < this.field5512; var4++) {
                var3.method1713((byte) -41, this.field5409[var4]);
                var3.method1713((byte) 106, this.field5509[var4]);
                var3.method1713((byte) -73, this.field5420[var4]);
            }
        }
        if (var3.field3913 == 0) {
            return;
        }
        if (arg1) {
            if (this.field5486 == null) {
                this.field5486 = this.field5504.method545(5123, var3.field3952, true, var3.field3913, (byte) -1);
            } else {
                this.field5486.method310((byte) 53, 5123, var3.field3913, var3.field3952);
            }
            this.field5450.field855 = this.field5486;
        } else {
            this.field5450.field855 = this.field5504.method545(5123, var3.field3952, false, var3.field3913, (byte) -1);
        }
        if (!arg1) {
            this.field5502 = true;
        }
    }

    @OriginalMember(owner = "client!la", name = "L", descriptor = "(SS)V", line = 3107)
    public final void method1407(short arg0, short arg1) {
        field5517++;
        class472 var3 = this.field5504.field2443;
        for (int var4 = 0; var4 < this.field5453; var4++) {
            if (this.field5499[var4] == arg0) {
                this.field5499[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class576 var7 = var3.method2387((byte) 127, arg0 & 0xFFFF);
            var5 = var7.field8212;
            var6 = var7.field8216;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class576 var10 = var3.method2387((byte) 127, arg1 & 0xFFFF);
            var9 = var10.field8216;
            var8 = var10.field8212;
        }
        if (!var6 != var9 | var5 != var8) {
            return;
        }
        if (this.field5479 != null) {
            for (int var11 = 0; var11 < this.field5455; var11++) {
                class24 var12 = this.field5479[var11];
                class319 var13 = this.field5452[var11];
                var13.field4627 = var13.field4627 & 0xFF000000 | class220.field3297[this.field5488[var12.field338] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field5505 != null) {
            this.field5505.field345 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!la", name = "pa", descriptor = "(SS)V", line = 3186)
    public final void method1387(short arg0, short arg1) {
        field5421++;
        for (int var3 = 0; var3 < this.field5453; var3++) {
            if (this.field5488[var3] == arg0) {
                this.field5488[var3] = arg1;
            }
        }
        if (this.field5479 != null) {
            for (int var4 = 0; var4 < this.field5455; var4++) {
                class24 var5 = this.field5479[var4];
                class319 var6 = this.field5452[var4];
                var6.field4627 = class220.field3297[this.field5488[var5.field338] & 0xFFFF] & 0xFFFFFF | var6.field4627 & 0xFF000000;
            }
        }
        if (this.field5505 != null) {
            this.field5505.field345 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lm;Lpaa;I)V", line = 3231)
    public final void method1379(class105 arg0, class315 arg1, int arg2) {
        field5471++;
        if (this.field5413 == 0) {
            return;
        }
        class249 var4 = this.field5504.field1274;
        class249 var5 = (class249) arg0;
        if (!this.field5464) {
            this.method2271((byte) -113);
        }
        this.method2273(var5, true);
        class32.field439 = var4.field3632 * var5.field3638 + var4.field3638 * var5.field3627 + var4.field3633 * var5.field3643;
        class331.field4756 = var4.field3632 * var5.field3628 + var4.field3638 * var5.field3619 + var4.field3633 * var5.field3629 + var4.field3628;
        float var6 = (float) this.field5412 * class32.field439 + class331.field4756;
        float var7 = (float) this.field5466 * class32.field439 + class331.field4756;
        float var8;
        float var9;
        if ((var6 > var7)) {
            var8 = (float) (-this.field5442) + var7;
            var9 = (float) this.field5442 + var6;
        } else {
            var8 = var6 - (float) this.field5442;
            var9 = (float) this.field5442 + var7;
        }
        if ((var8 >= this.field5504.field1222) || (var9 <= (float) this.field5504.field1237)) {
            return;
        }
        class552.field7826 = var4.field3648 * var5.field3628 + var4.field3643 * var5.field3619 + var4.field3630 * var5.field3629 + var4.field3629;
        class419.field6169 = var4.field3648 * var5.field3638 + var4.field3643 * var5.field3627 + var4.field3630 * var5.field3643;
        float var10 = (float) this.field5412 * class419.field6169 + class552.field7826;
        float var11 = (float) this.field5466 * class419.field6169 + class552.field7826;
        float var12;
        float var13;
        if (var10 > var11) {
            var12 = ((float) this.field5442 + var10) * (float) this.field5504.field1228;
            var13 = ((float) (-this.field5442) + var11) * (float) this.field5504.field1228;
        } else {
            var13 = (var10 - (float) this.field5442) * (float) this.field5504.field1228;
            var12 = ((float) this.field5442 + var11) * (float) this.field5504.field1228;
        }
        if ((this.field5504.field1273 <= var13 / var9) || (this.field5504.field1245 >= var12 / var9)) {
            return;
        }
        class484.field6850 = var4.field3622 * var5.field3638 + var4.field3627 * var5.field3627 + var4.field3624 * var5.field3643;
        class195.field2801 = var4.field3622 * var5.field3628 + var4.field3627 * var5.field3619 + var4.field3624 * var5.field3629 + var4.field3619;
        float var14 = (float) this.field5412 * class484.field6850 + class195.field2801;
        float var15 = (float) this.field5466 * class484.field6850 + class195.field2801;
        float var16;
        float var17;
        if (var14 > var15) {
            var16 = (var15 - (float) this.field5442) * (float) this.field5504.field1277;
            var17 = ((float) this.field5442 + var14) * (float) this.field5504.field1277;
        } else {
            var16 = ((float) (-this.field5442) + var14) * (float) this.field5504.field1277;
            var17 = ((float) this.field5442 + var15) * (float) this.field5504.field1277;
        }
        if ((this.field5504.field1234 <= var16 / var9) || (this.field5504.field1244 >= var17 / var9)) {
            return;
        }
        if (arg1 != null || this.field5479 != null) {
            class347.field4963 = var4.field3648 * var5.field3632 + var4.field3643 * var5.field3622 + var4.field3630 * var5.field3648;
            class93.field1645 = var4.field3648 * var5.field3633 + var4.field3643 * var5.field3624 + var4.field3630 * var5.field3630;
            class321.field4654 = var4.field3622 * var5.field3632 + var4.field3627 * var5.field3622 + var4.field3624 * var5.field3648;
            class85.field1563 = var4.field3622 * var5.field3633 + var4.field3627 * var5.field3624 + var4.field3624 * var5.field3630;
            class299.field4328 = var4.field3632 * var5.field3633 + var4.field3638 * var5.field3624 + var4.field3633 * var5.field3630;
            class498.field6982 = var4.field3632 * var5.field3632 + var4.field3638 * var5.field3622 + var4.field3633 * var5.field3648;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field5501 + this.field5428 >> 1;
            int var21 = this.field5495 + this.field5437 >> 1;
            int var22 = (int) ((float) var21 * class347.field4963 + (float) this.field5412 * class419.field6169 + (float) var20 * class93.field1645 + class552.field7826);
            int var23 = (int) ((float) var21 * class321.field4654 + (float) this.field5412 * class484.field6850 + (float) var20 * class85.field1563 + class195.field2801);
            int var24 = (int) ((float) var21 * class498.field6982 + (float) this.field5412 * class32.field439 + (float) var20 * class299.field4328 + class331.field4756);
            if (this.field5504.field1237 <= var24) {
                arg1.field4600 = this.field5504.field1277 * var23 / var24 + this.field5504.field1205;
                arg1.field4597 = this.field5504.field1228 * var22 / var24 + this.field5504.field1276;
            } else {
                var18 = true;
            }
            int var25 = (int) ((float) var21 * class347.field4963 + (float) this.field5466 * class419.field6169 + (float) var20 * class93.field1645 + class552.field7826);
            int var26 = (int) ((float) var21 * class321.field4654 + (float) this.field5466 * class484.field6850 + (float) var20 * class85.field1563 + class195.field2801);
            int var27 = (int) ((float) var21 * class498.field6982 + (float) this.field5466 * class32.field439 + (float) var20 * class299.field4328 + class331.field4756);
            if (var27 >= this.field5504.field1237) {
                arg1.field4598 = this.field5504.field1277 * var26 / var27 + this.field5504.field1205;
                arg1.field4599 = this.field5504.field1228 * var25 / var27 + this.field5504.field1276;
            } else {
                var18 = true;
            }
            if (var18) {
                if (this.field5504.field1237 > var24 && this.field5504.field1237 > var27) {
                    var19 = false;
                } else if (var24 < this.field5504.field1237) {
                    int var31 = (var27 - this.field5504.field1237 << 16) / (var27 - var24);
                    int var32 = var25 + ((var25 - var22) * var31 >> 16);
                    int var33 = ((var26 - var23) * var31 >> 16) + var26;
                    arg1.field4597 = this.field5504.field1228 * var32 / this.field5504.field1237 + this.field5504.field1276;
                    arg1.field4600 = this.field5504.field1277 * var33 / this.field5504.field1237 + this.field5504.field1205;
                } else if (var27 < this.field5504.field1237) {
                    int var28 = (var24 - this.field5504.field1237 << 16) / (var24 - var27);
                    int var29 = ((var22 - var25) * var28 >> 16) + var22;
                    arg1.field4597 = this.field5504.field1228 * var29 / this.field5504.field1237 + this.field5504.field1276;
                    int var30 = ((var23 - var26) * var28 >> 16) + var23;
                    arg1.field4600 = this.field5504.field1277 * var30 / this.field5504.field1237 + this.field5504.field1205;
                }
            }
            if (var19) {
                arg1.field4595 = true;
                if (var27 >= var24) {
                    arg1.field4596 = (var25 + this.field5442) * this.field5504.field1228 / var27 + this.field5504.field1276 - arg1.field4599;
                } else {
                    arg1.field4596 = (this.field5442 + var22) * this.field5504.field1228 / var24 + this.field5504.field1276 - arg1.field4597;
                }
            }
        }
        this.field5504.method575((byte) -79);
        this.field5504.method647(-5, var5);
        this.method2279(false);
        this.field5504.method551((byte) 125);
        this.method2270(-51);
    }

    @OriginalMember(owner = "client!la", name = "q", descriptor = "(I)V", line = 3436)
    public final void method1401(int arg0) {
        field5483++;
        int var2 = class285.field4154[arg0];
        int var3 = class285.field4152[arg0];
        for (int var4 = 0; var4 < this.field5438; var4++) {
            int var7 = this.field5506[var4] * var2 + this.field5462[var4] * var3 >> 15;
            this.field5506[var4] = this.field5506[var4] * var3 - (this.field5462[var4] * var2) >> 15;
            this.field5462[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field5413; var5++) {
            int var6 = this.field5470[var5] * var2 + this.field5411[var5] * var3 >> 15;
            this.field5470[var5] = (short) (this.field5470[var5] * var3 - (this.field5411[var5] * var2) >> 15);
            this.field5411[var5] = (short) var6;
        }
        if (this.field5430 == null && this.field5505 != null) {
            this.field5505.field345 = null;
        }
        if (this.field5430 != null) {
            this.field5430.field345 = null;
        }
        this.field5464 = false;
        if (this.field5463 != null) {
            this.field5463.field345 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "ca", descriptor = "(III)V", line = 3490)
    public final void method1368(int arg0, int arg1, int arg2) {
        field5449++;
        for (int var4 = 0; var4 < this.field5438; var4++) {
            if (arg0 != 0) {
                this.field5462[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field5511[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field5506[var4] += arg2;
            }
        }
        if (this.field5463 != null) {
            this.field5463.field345 = null;
        }
        this.field5464 = false;
    }

    @OriginalMember(owner = "client!la", name = "g", descriptor = "(I)V", line = 3522)
    public final void method1366(int arg0) {
        if (this.field5505 != null) {
            this.field5505.field345 = null;
        }
        field5414++;
        this.field5497 = (short) arg0;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lm;Lpaa;II)V", line = 3535)
    public final void method1374(class105 arg0, class315 arg1, int arg2, int arg3) {
        field5478++;
        if (this.field5413 == 0) {
            return;
        }
        class249 var5 = this.field5504.field1274;
        if (!this.field5464) {
            this.method2271((byte) -113);
        }
        class249 var6 = (class249) arg0;
        class32.field439 = var5.field3632 * var6.field3638 + var5.field3638 * var6.field3627 + var5.field3633 * var6.field3643;
        class331.field4756 = var5.field3632 * var6.field3628 + var5.field3638 * var6.field3619 + var5.field3633 * var6.field3629 + var5.field3628;
        float var7 = (float) this.field5412 * class32.field439 + class331.field4756;
        float var8 = (float) this.field5466 * class32.field439 + class331.field4756;
        float var9;
        float var10;
        if ((var7 > var8)) {
            var9 = (float) (-this.field5442) + var8;
            var10 = (float) this.field5442 + var7;
        } else {
            var9 = (float) (-this.field5442) + var7;
            var10 = (float) this.field5442 + var8;
        }
        if ((this.field5504.field1183 <= var9) || ((float) this.field5504.field1237 >= var10)) {
            return;
        }
        class419.field6169 = var5.field3648 * var6.field3638 + var5.field3643 * var6.field3627 + var5.field3630 * var6.field3643;
        class552.field7826 = var5.field3648 * var6.field3628 + var5.field3643 * var6.field3619 + var5.field3630 * var6.field3629 + var5.field3629;
        float var11 = (float) this.field5412 * class419.field6169 + class552.field7826;
        float var12 = (float) this.field5466 * class419.field6169 + class552.field7826;
        float var13;
        float var14;
        if ((var12 < var11)) {
            var13 = ((float) (-this.field5442) + var12) * (float) this.field5504.field1228;
            var14 = ((float) this.field5442 + var11) * (float) this.field5504.field1228;
        } else {
            var13 = (var11 - (float) this.field5442) * (float) this.field5504.field1228;
            var14 = ((float) this.field5442 + var12) * (float) this.field5504.field1228;
        }
        if ((var13 / (float) arg2 >= this.field5504.field1273) || (var14 / (float) arg2 <= this.field5504.field1245)) {
            return;
        }
        class195.field2801 = var5.field3622 * var6.field3628 + var5.field3627 * var6.field3619 + var5.field3624 * var6.field3629 + var5.field3619;
        class484.field6850 = var5.field3622 * var6.field3638 + var5.field3627 * var6.field3627 + var5.field3624 * var6.field3643;
        float var15 = (float) this.field5412 * class484.field6850 + class195.field2801;
        float var16 = (float) this.field5466 * class484.field6850 + class195.field2801;
        float var17;
        float var18;
        if ((var16 < var15)) {
            var18 = (var16 - (float) this.field5442) * (float) this.field5504.field1277;
            var17 = ((float) this.field5442 + var15) * (float) this.field5504.field1277;
        } else {
            var17 = ((float) this.field5442 + var16) * (float) this.field5504.field1277;
            var18 = ((float) (-this.field5442) + var15) * (float) this.field5504.field1277;
        }
        if ((this.field5504.field1234 <= var18 / (float) arg2) || (this.field5504.field1244 >= var17 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field5479 != null) {
            class321.field4654 = var5.field3622 * var6.field3632 + var5.field3627 * var6.field3622 + var5.field3624 * var6.field3648;
            class93.field1645 = var5.field3648 * var6.field3633 + var5.field3643 * var6.field3624 + var5.field3630 * var6.field3630;
            class299.field4328 = var5.field3632 * var6.field3633 + var5.field3638 * var6.field3624 + var5.field3633 * var6.field3630;
            class85.field1563 = var5.field3622 * var6.field3633 + var5.field3627 * var6.field3624 + var5.field3624 * var6.field3630;
            class347.field4963 = var5.field3648 * var6.field3632 + var5.field3643 * var6.field3622 + var5.field3630 * var6.field3648;
            class498.field6982 = var5.field3632 * var6.field3632 + var5.field3638 * var6.field3622 + var5.field3633 * var6.field3648;
        }
        if (arg1 != null) {
            int var19 = this.field5501 + this.field5428 >> 1;
            int var20 = this.field5495 + this.field5437 >> 1;
            int var21 = (int) ((float) var20 * class347.field4963 + (float) this.field5412 * class419.field6169 + (float) var19 * class93.field1645 + class552.field7826);
            int var22 = (int) ((float) var20 * class321.field4654 + (float) this.field5412 * class484.field6850 + (float) var19 * class85.field1563 + class195.field2801);
            int var23 = (int) ((float) var20 * class498.field6982 + (float) this.field5412 * class32.field439 + (float) var19 * class299.field4328 + class331.field4756);
            int var24 = (int) ((float) var20 * class347.field4963 + (float) this.field5466 * class419.field6169 + (float) var19 * class93.field1645 + class552.field7826);
            int var25 = (int) ((float) var20 * class321.field4654 + (float) this.field5466 * class484.field6850 + (float) var19 * class85.field1563 + class195.field2801);
            arg1.field4599 = this.field5504.field1228 * var24 / arg2 + this.field5504.field1276;
            arg1.field4600 = this.field5504.field1277 * var22 / arg2 + this.field5504.field1205;
            arg1.field4598 = this.field5504.field1277 * var25 / arg2 + this.field5504.field1205;
            int var26 = (int) ((float) var20 * class498.field6982 + (float) this.field5466 * class32.field439 + (float) var19 * class299.field4328 + class331.field4756);
            arg1.field4597 = this.field5504.field1228 * var21 / arg2 + this.field5504.field1276;
            if (var23 < this.field5504.field1237 && var26 < this.field5504.field1237) {
                arg1.field4595 = true;
                arg1.field4596 = (this.field5442 + var21) * this.field5504.field1228 / arg2 + this.field5504.field1276 - arg1.field4597;
            }
        }
        this.field5504.method571((float) arg2, (byte) 12);
        this.field5504.method603(-47);
        this.field5504.method647(-117, var6);
        this.method2279(false);
        this.field5504.method551((byte) 126);
        this.method2270(-115);
    }

    @OriginalMember(owner = "client!la", name = "va", descriptor = "()I", line = 3684)
    public final int method1376() {
        field5459++;
        if (!this.field5464) {
            this.method2271((byte) -113);
        }
        return this.field5501;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILm;Z)Z", line = 3699)
    public final boolean method1399(int arg0, int arg1, class105 arg2, boolean arg3) {
        field5484++;
        class249 var5 = (class249) arg2;
        class249 var6 = this.field5504.field1274;
        float var7 = var5.field3628 * var6.field3648 + var5.field3629 * var6.field3630 + var5.field3619 * var6.field3643 + var6.field3629;
        float var8 = var5.field3628 * var6.field3622 + var5.field3629 * var6.field3624 + var5.field3619 * var6.field3627 + var6.field3619;
        class347.field4963 = var5.field3632 * var6.field3648 + var5.field3648 * var6.field3630 + var5.field3622 * var6.field3643;
        class321.field4654 = var5.field3632 * var6.field3622 + var5.field3648 * var6.field3624 + var5.field3622 * var6.field3627;
        class484.field6850 = var5.field3638 * var6.field3622 + var5.field3643 * var6.field3624 + var5.field3627 * var6.field3627;
        class299.field4328 = var5.field3633 * var6.field3632 + var5.field3630 * var6.field3633 + var5.field3624 * var6.field3638;
        class32.field439 = var5.field3638 * var6.field3632 + var5.field3643 * var6.field3633 + var5.field3627 * var6.field3638;
        class85.field1563 = var5.field3633 * var6.field3622 + var5.field3630 * var6.field3624 + var5.field3624 * var6.field3627;
        class419.field6169 = var5.field3638 * var6.field3648 + var5.field3643 * var6.field3630 + var5.field3627 * var6.field3643;
        class93.field1645 = var5.field3633 * var6.field3648 + var5.field3630 * var6.field3630 + var5.field3624 * var6.field3643;
        class498.field6982 = var5.field3632 * var6.field3632 + var5.field3648 * var6.field3633 + var5.field3622 * var6.field3638;
        float var9 = var5.field3628 * var6.field3632 + var5.field3629 * var6.field3633 + var5.field3619 * var6.field3638 + var6.field3628;
        boolean var10 = false;
        float var11 = Float.MAX_VALUE;
        float var12 = -3.4028235E38F;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        int var15 = this.field5504.field1228;
        int var16 = this.field5504.field1277;
        if (!this.field5464) {
            this.method2271((byte) -113);
        }
        class548.field7621[0] = this.field5428;
        class552.field7825[0] = this.field5412;
        class548.field7621[1] = this.field5501;
        class522.field7248[0] = this.field5495;
        class552.field7825[1] = this.field5412;
        class548.field7621[2] = this.field5428;
        class522.field7248[1] = this.field5495;
        class552.field7825[2] = this.field5466;
        class548.field7621[3] = this.field5501;
        class522.field7248[2] = this.field5495;
        class552.field7825[3] = this.field5466;
        class548.field7621[4] = this.field5428;
        class522.field7248[3] = this.field5495;
        class552.field7825[4] = this.field5412;
        class548.field7621[5] = this.field5501;
        class522.field7248[4] = this.field5437;
        class552.field7825[5] = this.field5412;
        class548.field7621[6] = this.field5428;
        class522.field7248[5] = this.field5437;
        class552.field7825[6] = this.field5466;
        class548.field7621[7] = this.field5501;
        class522.field7248[6] = this.field5437;
        class552.field7825[7] = this.field5466;
        class522.field7248[7] = this.field5437;
        for (int var17 = 0; var17 < 8; var17++) {
            float var38 = (float) class548.field7621[var17];
            float var39 = (float) class552.field7825[var17];
            float var40 = (float) class522.field7248[var17];
            float var41 = class321.field4654 * var40 + class85.field1563 * var38 + class484.field6850 * var39 + var8;
            float var42 = class347.field4963 * var40 + class93.field1645 * var38 + class419.field6169 * var39 + var7;
            float var43 = class498.field6982 * var40 + class32.field439 * var39 + class299.field4328 * var38 + var9;
            if ((float) this.field5504.field1237 <= var43) {
                float var44 = (float) var15 * var42 / var43 + (float) this.field5504.field1276;
                float var45 = (float) var16 * var41 / var43 + (float) this.field5504.field1205;
                if (var44 < var11) {
                    var11 = var44;
                }
                if (var44 > var12) {
                    var12 = var44;
                }
                var10 = true;
                if (var45 < var13) {
                    var13 = var45;
                }
                if (var45 > var14) {
                    var14 = var45;
                }
            }
        }
        if (var10 && var11 < (float) arg0 && (float) arg0 < var12 && (float) arg1 > var13 && var14 > (float) arg1) {
            if (arg3) {
                return true;
            }
            if (this.field5413 > this.field5504.field1282.length) {
                this.field5504.field1281 = new int[this.field5413];
                this.field5504.field1282 = new int[this.field5413];
            }
            int[] var18 = this.field5504.field1282;
            int[] var19 = this.field5504.field1281;
            for (int var20 = 0; var20 < this.field5438; var20++) {
                float var22 = (float) this.field5511[var20];
                float var23 = (float) this.field5506[var20];
                float var24 = (float) this.field5462[var20];
                float var25 = class347.field4963 * var23 + class93.field1645 * var24 + class419.field6169 * var22 + var7;
                float var26 = class321.field4654 * var23 + class85.field1563 * var24 + class484.field6850 * var22 + var8;
                float var27 = class498.field6982 * var23 + class32.field439 * var22 + class299.field4328 * var24 + var9;
                if ((var27 >= (float) this.field5504.field1237)) {
                    int var32 = (int) ((float) var15 * var25 / var27 + (float) this.field5504.field1276);
                    int var33 = (int) ((float) var16 * var26 / var27 + (float) this.field5504.field1205);
                    int var34 = this.field5441[var20];
                    int var35 = this.field5441[var20 + 1];
                    for (int var36 = var34; var36 < var35; var36++) {
                        int var37 = this.field5446[var36] - 1;
                        if (var37 == -1) {
                            break;
                        }
                        var18[var37] = var32;
                        var19[var37] = var33;
                    }
                } else {
                    int var28 = this.field5441[var20];
                    int var29 = this.field5441[var20 + 1];
                    for (int var30 = var28; var30 < var29; var30++) {
                        int var31 = this.field5446[var30] - 1;
                        if (var31 == -1) {
                            break;
                        }
                        var18[this.field5446[var30] - 1] = -999999;
                    }
                }
            }
            for (int var21 = 0; var21 < this.field5453; var21++) {
                if (var18[this.field5409[var21]] != -999999 && var18[this.field5509[var21]] != -999999 && var18[this.field5420[var21]] != -999999 && this.method2267(arg0, var18[this.field5409[var21]], arg1, var18[this.field5420[var21]], var19[this.field5409[var21]], var18[this.field5509[var21]], (byte) -89, var19[this.field5509[var21]], var19[this.field5420[var21]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!la", name = "V", descriptor = "(III)V", line = 3910)
    public final void method1349(int arg0, int arg1, int arg2) {
        field5429++;
        for (int var4 = 0; var4 < this.field5438; var4++) {
            if (arg0 != 128) {
                this.field5462[var4] = this.field5462[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field5511[var4] = this.field5511[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field5506[var4] = this.field5506[var4] * arg2 >> 7;
            }
        }
        this.field5464 = false;
        if (this.field5463 != null) {
            this.field5463.field345 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZLld;IJIFFII)S", line = 3942)
    private final short method2277(int arg0, boolean arg1, class560 arg2, int arg3, long arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        field5477++;
        int var12 = this.field5441[arg3];
        int var13 = this.field5441[arg3 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field5446[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class240.field3491[var15] == arg4) {
                return (short) (var16 - 1);
            }
        }
        this.field5446[var14] = (short) (this.field5413 + 1);
        class240.field3491[var14] = arg4;
        this.field5411[this.field5413] = (short) arg0;
        if (!arg1) {
            return 5;
        }
        this.field5448[this.field5413] = (short) arg8;
        this.field5470[this.field5413] = (short) arg9;
        this.field5498[this.field5413] = (byte) arg5;
        this.field5515[this.field5413] = arg6;
        this.field5473[this.field5413] = arg7;
        return (short) (this.field5413++);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZSIIB)I", line = 3988)
    private final int method2278(boolean arg0, short arg1, int arg2, int arg3, byte arg4) {
        field5447++;
        int var6 = class220.field3297[class207.method1330(arg0, arg3, arg2)];
        if (arg1 != -1) {
            class576 var7 = this.field5504.field2443.method2387((byte) 127, arg1 & 0xFFFF);
            int var8 = var7.field8212 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg3 < 0) {
                    var9 = 0;
                } else if (arg3 > 127) {
                    var9 = 16777215;
                } else {
                    var9 = arg3 * 131586;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) + ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) >> 8;
                }
            }
            int var12 = var7.field8216 & 0xFF;
            if (var12 != 0) {
                var12 += 256;
                int var13 = (var6 >> 16 & 0xFF) * var12;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = ((var6 & 0xFF00) >> 8) * var12;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                int var15 = (var6 & 0xFF) * var12;
                if (var15 > 65535) {
                    var15 = 65535;
                }
                var6 = (var15 >> 8) + (var13 << 8 & 0xFF00CB) + (var14 & 0xFF00);
            }
        }
        return (var6 << 8) + 255 - (arg4 & 0xFF);
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V", line = 4057)
    public final void method1400(int arg0) {
        field5485++;
        int var2 = class285.field4154[arg0];
        int var3 = class285.field4152[arg0];
        for (int var4 = 0; var4 < this.field5438; var4++) {
            int var5 = this.field5511[var4] * var2 + this.field5462[var4] * var3 >> 15;
            this.field5511[var4] = this.field5511[var4] * var3 - (this.field5462[var4] * var2) >> 15;
            this.field5462[var4] = var5;
        }
        this.field5464 = false;
        if (this.field5463 != null) {
            this.field5463.field345 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "I", descriptor = "(I)V", line = 4086)
    public final void method1391(int arg0) {
        if (this.field5505 != null) {
            this.field5505.field345 = null;
        }
        field5493++;
        this.field5445 = (short) arg0;
        if (this.field5430 != null) {
            this.field5430.field345 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "wa", descriptor = "()I", line = 4109)
    public final int method1392() {
        if (!this.field5464) {
            this.method2271((byte) -113);
        }
        field5476++;
        return this.field5428;
    }

    @OriginalMember(owner = "client!la", name = "RA", descriptor = "(IILsa;Lsa;III)V", line = 4126)
    public final void method1395(int arg0, int arg1, class542 arg2, class542 arg3, int arg4, int arg5, int arg6) {
        if (!this.field5464) {
            this.method2271((byte) -113);
        }
        field5417++;
        int var8 = arg4 + this.field5428;
        int var9 = this.field5501 + arg4;
        int var10 = arg6 + this.field5495;
        int var11 = this.field5437 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field7541 <= (arg2.field7544 + var9 >> arg2.field7537) || var10 < 0 || (arg2.field7544 + var11 >> arg2.field7537) >= arg2.field7539) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || (arg3.field7544 + var9 >> arg3.field7537) >= arg3.field7541 || var10 < 0 || arg3.field7544 + var11 >> arg3.field7537 >= arg3.field7539) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field7537;
            int var13 = arg2.field7544 + var9 - 1 >> arg2.field7537;
            int var14 = var10 >> arg2.field7537;
            int var15 = var11 + arg2.field7544 - 1 >> arg2.field7537;
            if (arg5 == arg2.method694(var12, var14) && arg2.method694(var13, var14) == arg5 && arg2.method694(var12, var15) == arg5 && arg2.method694(var13, var15) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var32 = 0; var32 < this.field5438; var32++) {
                this.field5511[var32] = this.field5511[var32] + arg2.method695(this.field5462[var32] + arg4, this.field5506[var32] + arg6) - arg5;
            }
        } else if (arg0 == 2) {
            short var16 = this.field5412;
            if (var16 == 0) {
                return;
            }
            for (int var17 = 0; var17 < this.field5438; var17++) {
                int var18 = (this.field5511[var17] << 16) / var16;
                if (arg1 > var18) {
                    this.field5511[var17] += (arg1 - var18) * (arg2.method695(this.field5462[var17] + arg4, this.field5506[var17] + arg6) - arg5) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var28 = (arg1 & 0xFF) * 4;
            int var29 = ((arg1 & 0xFFC9) >> 8) * 4;
            int var30 = arg1 >> 16 & 0xFF << 6;
            int var31 = arg1 >> 24 & 0xFF << 6;
            if ((arg4 - (var28 >> 1)) < 0 || ((var28 >> 1) + arg4 + arg2.field7544) >= (arg2.field7541 << arg2.field7537) || (arg6 - (var29 >> 1)) < 0 || (arg2.field7539 << arg2.field7537) <= ((var29 >> 1) + arg6 + arg2.field7544)) {
                return;
            }
            this.method2938(var31, arg6, arg4, var29, -1, arg2, var30, arg5, var28);
        } else if (arg0 == 4) {
            int var19 = this.field5466 - this.field5412;
            for (int var20 = 0; var20 < this.field5438; var20++) {
                this.field5511[var20] = this.field5511[var20] + var19 + arg3.method695(this.field5462[var20] - -arg4, this.field5506[var20] + arg6) - arg5;
            }
        } else if (arg0 == 5) {
            int var21 = this.field5466 - this.field5412;
            for (int var22 = 0; var22 < this.field5438; var22++) {
                int var23 = this.field5462[var22] + arg4;
                int var24 = this.field5506[var22] + arg6;
                int var25 = arg2.method695(var23, var24);
                int var26 = arg3.method695(var23, var24);
                int var27 = var25 - (var26 + arg1);
                this.field5511[var22] = ((this.field5511[var22] << 8) / var21 * var27 >> 8) - (arg5 - var25);
            }
        }
        if (this.field5463 != null) {
            this.field5463.field345 = null;
        }
        this.field5464 = false;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(Z)V", line = 4289)
    private final void method2279(boolean arg0) {
        field5440++;
        if (this.field5512 == 0) {
            return;
        }
        if (this.field5481 != 0) {
            this.method2272(true, 2);
        }
        this.method2272(arg0, 2);
        if (this.field5450 != null) {
            if (this.field5450.field855 == null) {
                this.method2276(152175503, (this.field5481 & 0x10) != 0);
            }
            if (this.field5450.field855 != null) {
                this.field5504.method578(16, this.field5430 != null);
                this.field5504.method636(this.field5474, false, this.field5430, this.field5505, this.field5463);
                int var2 = this.field5480.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field5480[var3];
                    int var5 = this.field5480[var3 + 1];
                    int var6 = this.field5499[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field5504.method541(this.field5430 != null, 127, var6);
                    this.field5504.method523((byte) 61, this.field5450.field855, 4, var4 * 3, (var5 - var4) * 3);
                }
            }
        }
        this.method2280((byte) -61);
    }

    @OriginalMember(owner = "client!la", name = "ba", descriptor = "()I", line = 4350)
    public final int method1373() {
        field5494++;
        return this.field5475;
    }

    @OriginalMember(owner = "client!la", name = "BA", descriptor = "(I[IIIIZI[I)V", line = 4361)
    public final void method1398(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field5514++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = arg4 << 4;
            class512.field7088 = 0;
            int var13 = 0;
            class325.field4684 = 0;
            class155.field2340 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field5510.length) {
                    int[] var16 = this.field5510[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field5492 == null || (arg6 & this.field5492[var18]) != 0) {
                            class512.field7088 += this.field5462[var18];
                            class325.field4684 += this.field5511[var18];
                            class155.field2340 += this.field5506[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                class155.field2340 = class155.field2340 / var13 + var12;
                class325.field4684 = class325.field4684 / var13 + var11;
                class319.field4633 = true;
                class512.field7088 = class512.field7088 / var13 + var10;
            } else {
                class325.field4684 = var11;
                class155.field2340 = var12;
                class512.field7088 = var10;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[1] * arg3 + arg7[0] * arg2 + (arg7[2] * arg4) + 16384 >> 15;
                int var20 = arg7[5] * arg4 + arg7[4] * arg3 + arg7[3] * arg2 + 16384 >> 15;
                int var21 = arg7[7] * arg3 + arg7[6] * arg2 + (arg7[8] * arg4) + 16384 >> 15;
                arg2 = var19;
                arg3 = var20;
                arg4 = var21;
            }
            int var22 = arg3 << 4;
            int var23 = arg2 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (this.field5510.length > var26) {
                    int[] var27 = this.field5510[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field5492 == null || (arg6 & this.field5492[var29]) != 0) {
                            this.field5462[var29] += var23;
                            this.field5511[var29] += var22;
                            this.field5506[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var30 = 0; var30 < var9; var30++) {
                    int var49 = arg1[var30];
                    if (this.field5510.length > var49) {
                        int[] var50 = this.field5510[var49];
                        for (int var51 = 0; var51 < var50.length; var51++) {
                            int var52 = var50[var51];
                            if (this.field5492 == null || (this.field5492[var52] & arg6) != 0) {
                                this.field5462[var52] -= class512.field7088;
                                this.field5511[var52] -= class325.field4684;
                                this.field5506[var52] -= class155.field2340;
                                if (arg4 != 0) {
                                    int var53 = class285.field4154[arg4];
                                    int var54 = class285.field4152[arg4];
                                    int var55 = this.field5511[var52] * var53 - (-(this.field5462[var52] * var54) - 32767) >> 15;
                                    this.field5511[var52] = this.field5511[var52] * var54 + 32767 - this.field5462[var52] * var53 >> 15;
                                    this.field5462[var52] = var55;
                                }
                                if (arg2 != 0) {
                                    int var56 = class285.field4154[arg2];
                                    int var57 = class285.field4152[arg2];
                                    int var58 = this.field5511[var52] * var57 + 32767 - (this.field5506[var52] * var56) >> 15;
                                    this.field5506[var52] = this.field5511[var52] * var56 + this.field5506[var52] * var57 + 32767 >> 15;
                                    this.field5511[var52] = var58;
                                }
                                if (arg3 != 0) {
                                    int var59 = class285.field4154[arg3];
                                    int var60 = class285.field4152[arg3];
                                    int var61 = this.field5462[var52] * var60 + this.field5506[var52] * var59 + 32767 >> 15;
                                    this.field5506[var52] = this.field5506[var52] * var60 + 32767 - (this.field5462[var52] * var59) >> 15;
                                    this.field5462[var52] = var61;
                                }
                                this.field5462[var52] += class512.field7088;
                                this.field5511[var52] += class325.field4684;
                                this.field5506[var52] += class155.field2340;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var31 = 0; var31 < var9; var31++) {
                        int var32 = arg1[var31];
                        if (this.field5510.length > var32) {
                            int[] var33 = this.field5510[var32];
                            for (int var34 = 0; var34 < var33.length; var34++) {
                                int var35 = var33[var34];
                                if (this.field5492 == null || (this.field5492[var35] & arg6) != 0) {
                                    int var36 = this.field5441[var35];
                                    int var37 = this.field5441[var35 + 1];
                                    for (int var38 = var36; var38 < var37; var38++) {
                                        int var39 = this.field5446[var38] - 1;
                                        if (var39 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var40 = class285.field4154[arg4];
                                            int var41 = class285.field4152[arg4];
                                            int var42 = this.field5411[var39] * var41 + this.field5448[var39] * var40 + 32767 >> 15;
                                            this.field5448[var39] = (short) (this.field5448[var39] * var41 + 32767 - (this.field5411[var39] * var40) >> 15);
                                            this.field5411[var39] = (short) var42;
                                        }
                                        if (arg2 != 0) {
                                            int var43 = class285.field4154[arg2];
                                            int var44 = class285.field4152[arg2];
                                            int var45 = this.field5448[var39] * var44 + 32767 - (this.field5470[var39] * var43) >> 15;
                                            this.field5470[var39] = (short) (this.field5448[var39] * var43 + this.field5470[var39] * var44 + 32767 >> 15);
                                            this.field5448[var39] = (short) var45;
                                        }
                                        if (arg3 != 0) {
                                            int var46 = class285.field4154[arg3];
                                            int var47 = class285.field4152[arg3];
                                            int var48 = this.field5470[var39] * var46 + this.field5411[var39] * var47 + 32767 >> 15;
                                            this.field5470[var39] = (short) (this.field5470[var39] * var47 + 32767 - (this.field5411[var39] * var46) >> 15);
                                            this.field5411[var39] = (short) var48;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field5430 == null && this.field5505 != null) {
                        this.field5505.field345 = null;
                    }
                    if (this.field5430 != null) {
                        this.field5430.field345 = null;
                        return;
                    }
                }
            } else {
                int var62 = arg7[9] << 4;
                int var63 = arg7[10] << 4;
                int var64 = arg7[11] << 4;
                int var65 = arg7[12] << 4;
                int var66 = arg7[13] << 4;
                int var67 = arg7[14] << 4;
                if (class319.field4633) {
                    int var68 = arg7[0] * class512.field7088 + arg7[3] * class325.field4684 + arg7[6] * class155.field2340 + 16384 >> 15;
                    int var69 = arg7[7] * class155.field2340 + arg7[1] * class512.field7088 + (arg7[4] * class325.field4684) + 16384 >> 15;
                    int var70 = var66 + var69;
                    int var71 = var65 + var68;
                    int var72 = arg7[5] * class325.field4684 + (arg7[2] * class512.field7088 + (arg7[8] * class155.field2340)) + 16384 >> 15;
                    int var73 = var67 + var72;
                    class325.field4684 = var70;
                    class512.field7088 = var71;
                    class155.field2340 = var73;
                    class319.field4633 = false;
                }
                int[] var74 = new int[9];
                int var75 = class285.field4152[arg2];
                int var76 = class285.field4154[arg2];
                int var77 = class285.field4152[arg3];
                int var78 = class285.field4154[arg3];
                int var79 = class285.field4152[arg4];
                int var80 = class285.field4154[arg4];
                int var81 = var76 * var79 + 16384 >> 15;
                int var82 = var76 * var80 + 16384 >> 15;
                var74[3] = var75 * var80 + 16384 >> 15;
                var74[4] = var75 * var79 + 16384 >> 15;
                var74[2] = var75 * var78 + 16384 >> 15;
                var74[5] = -var76;
                var74[8] = var75 * var77 + 16384 >> 15;
                var74[1] = -var77 * var80 + var78 * var81 + 16384 >> 15;
                var74[6] = -var78 * var79 + var77 * var82 + 16384 >> 15;
                var74[0] = var77 * var79 + (var78 * var82) + 16384 >> 15;
                var74[7] = var78 * var80 + var77 * var81 + 16384 >> 15;
                int var83 = var74[0] * -class512.field7088 + (var74[2] * -class155.field2340) + var74[1] * -class325.field4684 + 16384 >> 15;
                int var84 = var74[3] * -class512.field7088 + var74[4] * -class325.field4684 + (var74[5] * -class155.field2340) + 16384 >> 15;
                int var85 = var74[8] * -class155.field2340 + (var74[6] * -class512.field7088 + (var74[7] * -class325.field4684)) + 16384 >> 15;
                int var86 = class512.field7088 + var83;
                int var87 = class325.field4684 + var84;
                int var88 = class155.field2340 + var85;
                int[] var89 = new int[9];
                for (int var90 = 0; var90 < 3; var90++) {
                    for (int var119 = 0; var119 < 3; var119++) {
                        int var120 = 0;
                        for (int var121 = 0; var121 < 3; var121++) {
                            var120 += var74[var90 * 3 + var121] * arg7[var119 * 3 + var121];
                        }
                        var89[var90 * 3 + var119] = var120 + 16384 >> 15;
                    }
                }
                int var91 = var74[0] * var65 + var74[2] * var67 + var74[1] * var66 + 16384 >> 15;
                int var92 = var74[4] * var66 + var74[5] * var67 + var74[3] * var65 + 16384 >> 15;
                int var93 = var87 + var92;
                int var94 = var86 + var91;
                int var95 = var74[8] * var67 + (var74[6] * var65 + var74[7] * var66 + 16384) >> 15;
                int var96 = var88 + var95;
                int[] var97 = new int[9];
                for (int var98 = 0; var98 < 3; var98++) {
                    for (int var116 = 0; var116 < 3; var116++) {
                        int var117 = 0;
                        for (int var118 = 0; var118 < 3; var118++) {
                            var117 += arg7[var98 * 3 + var118] * var89[var118 * 3 + var116];
                        }
                        var97[var98 * 3 + var116] = var117 + 16384 >> 15;
                    }
                }
                int var99 = arg7[1] * var93 + arg7[2] * var96 + arg7[0] * var94 + 16384 >> 15;
                int var100 = arg7[4] * var93 + arg7[3] * var94 + (arg7[5] * var96) + 16384 >> 15;
                int var101 = arg7[7] * var93 + (arg7[6] * var94 + arg7[8] * var96 + 16384) >> 15;
                int var102 = var62 + var99;
                int var103 = var63 + var100;
                int var104 = var64 + var101;
                for (int var105 = 0; var105 < var9; var105++) {
                    int var106 = arg1[var105];
                    if (this.field5510.length > var106) {
                        int[] var107 = this.field5510[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            int var109 = var107[var108];
                            if (this.field5492 == null || (this.field5492[var109] & arg6) != 0) {
                                int var110 = this.field5506[var109] * var97[2] + (this.field5511[var109] * var97[1] + this.field5462[var109] * var97[0] + 16384) >> 15;
                                int var111 = this.field5511[var109] * var97[4] + this.field5462[var109] * var97[3] + (this.field5506[var109] * var97[5]) + 16384 >> 15;
                                int var112 = var102 + var110;
                                int var113 = var103 + var111;
                                int var114 = this.field5506[var109] * var97[8] + (this.field5462[var109] * var97[6] + (this.field5511[var109] * var97[7])) + 16384 >> 15;
                                this.field5462[var109] = var112;
                                int var115 = var104 + var114;
                                this.field5511[var109] = var113;
                                this.field5506[var109] = var115;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (this.field5510.length > var173) {
                        int[] var174 = this.field5510[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field5492 == null || (arg6 & this.field5492[var176]) != 0) {
                                this.field5462[var176] -= class512.field7088;
                                this.field5511[var176] -= class325.field4684;
                                this.field5506[var176] -= class155.field2340;
                                this.field5462[var176] = this.field5462[var176] * arg2 >> 7;
                                this.field5511[var176] = this.field5511[var176] * arg3 >> 7;
                                this.field5506[var176] = this.field5506[var176] * arg4 >> 7;
                                this.field5462[var176] += class512.field7088;
                                this.field5511[var176] += class325.field4684;
                                this.field5506[var176] += class155.field2340;
                            }
                        }
                    }
                }
            } else {
                int var122 = arg7[9] << 4;
                int var123 = arg7[10] << 4;
                int var124 = arg7[11] << 4;
                int var125 = arg7[12] << 4;
                int var126 = arg7[13] << 4;
                int var127 = arg7[14] << 4;
                if (class319.field4633) {
                    int var128 = arg7[0] * class512.field7088 + (arg7[3] * class325.field4684) - (-(arg7[6] * class155.field2340) + -16384) >> 15;
                    int var129 = arg7[4] * class325.field4684 + (arg7[1] * class512.field7088 + arg7[7] * class155.field2340 + 16384) >> 15;
                    int var130 = var126 + var129;
                    int var131 = var125 + var128;
                    int var132 = arg7[5] * class325.field4684 + (arg7[2] * class512.field7088 + (arg7[8] * class155.field2340)) + 16384 >> 15;
                    class512.field7088 = var131;
                    int var133 = var127 + var132;
                    class325.field4684 = var130;
                    class155.field2340 = var133;
                    class319.field4633 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -class512.field7088 * var134 + 16384 >> 15;
                int var138 = -class325.field4684 * var135 + 16384 >> 15;
                int var139 = -class155.field2340 * var136 + 16384 >> 15;
                int var140 = var137 + class512.field7088;
                int var141 = class325.field4684 + var138;
                int var142 = class155.field2340 + var139;
                int[] var143 = new int[] { arg7[0] * var134 + 16384 >> 15, arg7[3] * var134 + 16384 >> 15, arg7[6] * var134 + 16384 >> 15, arg7[1] * var135 + 16384 >> 15, arg7[4] * var135 + 16384 >> 15, arg7[7] * var135 + 16384 >> 15, arg7[2] * var136 + 16384 >> 15, arg7[5] * var136 + 16384 >> 15, arg7[8] * var136 + 16384 >> 15 };
                int var144 = var125 * var134 + 16384 >> 15;
                int var145 = var126 * var135 + 16384 >> 15;
                int var146 = var141 + var145;
                int var147 = var140 + var144;
                int var148 = var127 * var136 + 16384 >> 15;
                int var149 = var142 + var148;
                int[] var150 = new int[9];
                for (int var151 = 0; var151 < 3; var151++) {
                    for (int var169 = 0; var169 < 3; var169++) {
                        int var170 = 0;
                        for (int var171 = 0; var171 < 3; var171++) {
                            var170 += arg7[var151 * 3 + var171] * var143[var171 * 3 + var169];
                        }
                        var150[var151 * 3 + var169] = var170 + 16384 >> 15;
                    }
                }
                int var152 = arg7[2] * var149 + arg7[1] * var146 + arg7[0] * var147 + 16384 >> 15;
                int var153 = arg7[3] * var147 + arg7[4] * var146 + (arg7[5] * var149) + 16384 >> 15;
                int var154 = var123 + var153;
                int var155 = var122 + var152;
                int var156 = arg7[6] * var147 + 16384 - (-(arg7[7] * var146) - (arg7[8] * var149)) >> 15;
                int var157 = var124 + var156;
                for (int var158 = 0; var158 < var9; var158++) {
                    int var159 = arg1[var158];
                    if (var159 < this.field5510.length) {
                        int[] var160 = this.field5510[var159];
                        for (int var161 = 0; var161 < var160.length; var161++) {
                            int var162 = var160[var161];
                            if (this.field5492 == null || (arg6 & this.field5492[var162]) != 0) {
                                int var163 = this.field5462[var162] * var150[0] + (this.field5511[var162] * var150[1]) + (this.field5506[var162] * var150[2]) + 16384 >> 15;
                                int var164 = this.field5462[var162] * var150[3] + this.field5506[var162] * var150[5] + (this.field5511[var162] * var150[4]) + 16384 >> 15;
                                int var165 = this.field5506[var162] * var150[8] + this.field5511[var162] * var150[7] + this.field5462[var162] * var150[6] + 16384 >> 15;
                                int var166 = var154 + var164;
                                int var167 = var155 + var163;
                                int var168 = var157 + var165;
                                this.field5462[var162] = var167;
                                this.field5511[var162] = var166;
                                this.field5506[var162] = var168;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field5434 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (this.field5434.length > var181) {
                        int[] var182 = this.field5434[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field5422 == null || (this.field5422[var184] & arg6) != 0) {
                                int var185 = (this.field5443[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field5443[var184] = (byte) var185;
                                if (this.field5505 != null) {
                                    this.field5505.field345 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field5479 != null) {
                    for (int var178 = 0; var178 < this.field5455; var178++) {
                        class24 var179 = this.field5479[var178];
                        class319 var180 = this.field5452[var178];
                        var180.field4627 = var180.field4627 & 0xFFFFFF | 255 - (this.field5443[var179.field338] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field5434 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (var190 < this.field5434.length) {
                        int[] var191 = this.field5434[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field5422 == null || (this.field5422[var193] & arg6) != 0) {
                                int var194 = this.field5488[var193] & 0xFFFF;
                                int var195 = (var194 & 0xFFAF) >> 10;
                                int var196 = var194 >> 7 & 0x7;
                                int var197 = var194 & 0x7F;
                                int var198 = var195 + arg2 & 0x3F;
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
                                this.field5488[var193] = (short) class188.method1258(var200, class188.method1258(var198 << 10, var199 << 7));
                                if (this.field5505 != null) {
                                    this.field5505.field345 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field5479 != null) {
                    for (int var187 = 0; var187 < this.field5455; var187++) {
                        class24 var188 = this.field5479[var187];
                        class319 var189 = this.field5452[var187];
                        var189.field4627 = var189.field4627 & 0xFF000000 | class220.field3297[this.field5488[var188.field338] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field5468 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (this.field5468.length > var202) {
                        int[] var203 = this.field5468[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class319 var205 = this.field5452[var203[var204]];
                            var205.field4623 += arg3;
                            var205.field4624 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field5468 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (this.field5468.length > var207) {
                        int[] var208 = this.field5468[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class319 var210 = this.field5452[var208[var209]];
                            var210.field4634 = var210.field4634 * arg3 >> 7;
                            var210.field4626 = var210.field4626 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field5468 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (var212 < this.field5468.length) {
                    int[] var213 = this.field5468[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class319 var215 = this.field5452[var213[var214]];
                        var215.field4632 = var215.field4632 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "sa", descriptor = "()Z", line = 5345)
    public final boolean method1404() {
        field5458++;
        if (this.field5510 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field5432; var1++) {
            this.field5462[var1] <<= 0x4;
            this.field5511[var1] <<= 0x4;
            this.field5506[var1] <<= 0x4;
        }
        class512.field7088 = 0;
        class155.field2340 = 0;
        class325.field4684 = 0;
        return true;
    }

    @OriginalMember(owner = "client!la", name = "n", descriptor = "()I", line = 5380)
    public final int method1406() {
        if (!this.field5464) {
            this.method2271((byte) -113);
        }
        field5456++;
        return this.field5466;
    }

    @OriginalMember(owner = "client!la", name = "MA", descriptor = "()V", line = 5396)
    public final void method1358() {
        for (int var1 = 0; var1 < this.field5432; var1++) {
            this.field5462[var1] = this.field5462[var1] + 7 >> 4;
            this.field5511[var1] = this.field5511[var1] + 7 >> 4;
            this.field5506[var1] = this.field5506[var1] + 7 >> 4;
        }
        field5415++;
        if (this.field5463 != null) {
            this.field5463.field345 = null;
        }
        this.field5464 = false;
    }

    @OriginalMember(owner = "client!la", name = "Q", descriptor = "()I", line = 5418)
    public final int method1378() {
        field5427++;
        if (!this.field5464) {
            this.method2271((byte) -113);
        }
        return this.field5495;
    }

    @OriginalMember(owner = "client!la", name = "m", descriptor = "(I)V", line = 5432)
    public final void method1405(int arg0) {
        this.field5475 = arg0;
        field5508++;
        this.field5502 = true;
        if (this.field5423 != null && (this.field5475 & 0x10000) == 0) {
            this.field5498 = this.field5423.field7838;
            this.field5470 = this.field5423.field7833;
            this.field5411 = this.field5423.field7837;
            this.field5448 = this.field5423.field7836;
            this.field5423 = null;
        }
        this.method2280((byte) -77);
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(B)V", line = 6481)
    private final void method2280(byte arg0) {
        field5461++;
        if (!this.field5502) {
            return;
        }
        this.field5502 = false;
        if (this.field5489 == null && this.field5435 == null && this.field5479 == null) {
            if (this.field5462 != null && !class14.method78(this.field5518, this.field5475, 417020716)) {
                if (this.field5463 != null && this.field5463.field345 == null) {
                    this.field5502 = true;
                } else {
                    if (!this.field5464) {
                        this.method2271((byte) -113);
                    }
                    this.field5462 = null;
                }
            }
            if (this.field5511 != null && !class440.method2603(this.field5518, true, this.field5475)) {
                if (this.field5463 != null && this.field5463.field345 == null) {
                    this.field5502 = true;
                } else {
                    if (!this.field5464) {
                        this.method2271((byte) -113);
                    }
                    this.field5511 = null;
                }
            }
            if (this.field5506 != null && !class214.method1451(this.field5475, this.field5518, 103)) {
                if (this.field5463 != null && this.field5463.field345 == null) {
                    this.field5502 = true;
                } else {
                    if (!this.field5464) {
                        this.method2271((byte) -113);
                    }
                    this.field5506 = null;
                }
            }
        }
        if (this.field5446 != null && this.field5462 == null && this.field5511 == null && this.field5506 == null) {
            this.field5441 = null;
            this.field5446 = null;
        }
        if (this.field5498 != null && !class395.method2401(true, this.field5518, this.field5475)) {
            if (this.field5430 == null) {
                if (this.field5505 != null && this.field5505.field345 == null) {
                    this.field5502 = true;
                } else {
                    this.field5411 = this.field5448 = this.field5470 = null;
                    this.field5498 = null;
                }
            } else if (this.field5430.field345 == null) {
                this.field5502 = true;
            } else {
                this.field5498 = null;
                this.field5411 = this.field5448 = this.field5470 = null;
            }
        }
        if (arg0 >= -17) {
            return;
        }
        if (this.field5488 != null && !class73.method708(this.field5518, (byte) 108, this.field5475)) {
            if (this.field5505 != null && this.field5505.field345 == null) {
                this.field5502 = true;
            } else {
                this.field5488 = null;
            }
        }
        if (this.field5443 != null && !class471.method2734(this.field5518, -20470, this.field5475)) {
            if (this.field5505 != null && this.field5505.field345 == null) {
                this.field5502 = true;
            } else {
                this.field5443 = null;
            }
        }
        if (this.field5515 != null && !class476.method2754((byte) -67, this.field5475, this.field5518)) {
            if (this.field5474 != null && this.field5474.field345 == null) {
                this.field5502 = true;
            } else {
                this.field5515 = this.field5473 = null;
            }
        }
        if (this.field5499 != null && !class191.method1267(this.field5475, (byte) -84, this.field5518)) {
            if (this.field5505 != null && this.field5505.field345 == null) {
                this.field5502 = true;
            } else {
                this.field5499 = null;
            }
        }
        if (this.field5409 != null && !class261.method1666(this.field5518, (byte) -79, this.field5475)) {
            if ((this.field5450 == null || this.field5450.field855 != null) && (this.field5505 == null || this.field5505.field345 != null)) {
                this.field5409 = this.field5509 = this.field5420 = null;
            } else {
                this.field5502 = true;
            }
        }
        if (this.field5434 != null && !class41.method374(this.field5518, this.field5475, -1)) {
            this.field5422 = null;
            this.field5434 = null;
        }
        if (this.field5510 != null && !class424.method2542(this.field5475, this.field5518, 31878)) {
            this.field5492 = null;
            this.field5510 = null;
        }
        if (this.field5468 != null && !class142.method1054(this.field5475, (byte) 56, this.field5518)) {
            this.field5468 = null;
        }
        if (this.field5480 != null && (this.field5475 & 0x800) == 0 && (this.field5475 & 0x40000) == 0) {
            this.field5480 = null;
        }
    }
}
