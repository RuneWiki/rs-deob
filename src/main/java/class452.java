import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class452 extends class121 {

    @OriginalMember(owner = "client!or", name = "p", descriptor = "I")
    private int field6512 = 0;

    @OriginalMember(owner = "client!or", name = "X", descriptor = "Z")
    private boolean field6546 = false;

    @OriginalMember(owner = "client!or", name = "mb", descriptor = "Z")
    private boolean field6561 = true;

    @OriginalMember(owner = "client!or", name = "rb", descriptor = "I")
    private int field6566 = 0;

    @OriginalMember(owner = "client!or", name = "bb", descriptor = "I")
    private int field6550 = 0;

    @OriginalMember(owner = "client!or", name = "Ob", descriptor = "I")
    private int field6589 = 0;

    @OriginalMember(owner = "client!or", name = "kc", descriptor = "I")
    private int field6611 = 0;

    @OriginalMember(owner = "client!or", name = "Gb", descriptor = "Lht;")
    private class410 field6581;

    @OriginalMember(owner = "client!or", name = "xb", descriptor = "Lds;")
    private class12 field6572;

    @OriginalMember(owner = "client!or", name = "v", descriptor = "Lds;")
    private class12 field6518;

    @OriginalMember(owner = "client!or", name = "y", descriptor = "Lds;")
    private class12 field6521;

    @OriginalMember(owner = "client!or", name = "fc", descriptor = "Lds;")
    private class12 field6606;

    @OriginalMember(owner = "client!or", name = "Jb", descriptor = "Lre;")
    private class426 field6584;

    @OriginalMember(owner = "client!or", name = "Pb", descriptor = "I")
    private int field6590;

    @OriginalMember(owner = "client!or", name = "Rb", descriptor = "I")
    private int field6592;

    @OriginalMember(owner = "client!or", name = "m", descriptor = "[I")
    private int[] field6509;

    @OriginalMember(owner = "client!or", name = "wb", descriptor = "[I")
    private int[] field6571;

    @OriginalMember(owner = "client!or", name = "Xb", descriptor = "[I")
    private int[] field6598;

    @OriginalMember(owner = "client!or", name = "S", descriptor = "[I")
    private int[] field6541;

    @OriginalMember(owner = "client!or", name = "Hb", descriptor = "[S")
    private short[] field6582;

    @OriginalMember(owner = "client!or", name = "W", descriptor = "[Lit;")
    private class456[] field6545;

    @OriginalMember(owner = "client!or", name = "Vb", descriptor = "[Lvj;")
    private class304[] field6596;

    @OriginalMember(owner = "client!or", name = "O", descriptor = "I")
    private int field6537;

    @OriginalMember(owner = "client!or", name = "Ub", descriptor = "[Lod;")
    private class349[] field6595;

    @OriginalMember(owner = "client!or", name = "U", descriptor = "[Lmk;")
    private class39[] field6543;

    @OriginalMember(owner = "client!or", name = "Kb", descriptor = "[F")
    private float[] field6585;

    @OriginalMember(owner = "client!or", name = "nb", descriptor = "[S")
    private short[] field6562;

    @OriginalMember(owner = "client!or", name = "ub", descriptor = "[S")
    private short[] field6569;

    @OriginalMember(owner = "client!or", name = "Fb", descriptor = "[B")
    private byte[] field6580;

    @OriginalMember(owner = "client!or", name = "db", descriptor = "S")
    private short field6552;

    @OriginalMember(owner = "client!or", name = "V", descriptor = "S")
    private short field6544;

    @OriginalMember(owner = "client!or", name = "ec", descriptor = "[S")
    private short[] field6605;

    @OriginalMember(owner = "client!or", name = "jb", descriptor = "[S")
    private short[] field6558;

    @OriginalMember(owner = "client!or", name = "u", descriptor = "[S")
    private short[] field6517;

    @OriginalMember(owner = "client!or", name = "ab", descriptor = "[F")
    private float[] field6549;

    @OriginalMember(owner = "client!or", name = "N", descriptor = "[S")
    private short[] field6536;

    @OriginalMember(owner = "client!or", name = "lc", descriptor = "[B")
    private byte[] field6612;

    @OriginalMember(owner = "client!or", name = "x", descriptor = "[S")
    private short[] field6520;

    @OriginalMember(owner = "client!or", name = "jc", descriptor = "[S")
    private short[] field6610;

    @OriginalMember(owner = "client!or", name = "R", descriptor = "[S")
    private short[] field6540;

    @OriginalMember(owner = "client!or", name = "E", descriptor = "[S")
    private short[] field6527;

    @OriginalMember(owner = "client!or", name = "tb", descriptor = "[I")
    private int[] field6568;

    @OriginalMember(owner = "client!or", name = "gb", descriptor = "[[I")
    private int[][] field6555;

    @OriginalMember(owner = "client!or", name = "w", descriptor = "[[I")
    private int[][] field6519;

    @OriginalMember(owner = "client!or", name = "D", descriptor = "[[I")
    private int[][] field6526;

    @OriginalMember(owner = "client!or", name = "B", descriptor = "Lss;")
    public static class295 field6524 = null;

    @OriginalMember(owner = "client!or", name = "pb", descriptor = "Ljava/lang/String;")
    public static String field6564 = "";

    @OriginalMember(owner = "client!or", name = "Lb", descriptor = "I")
    public static int field6586 = 0;

    @OriginalMember(owner = "client!or", name = "sc", descriptor = "Ljm;")
    public static class485 field6619 = new class485(69, 7);

    @OriginalMember(owner = "client!or", name = "nc", descriptor = "B")
    private byte field6614;

    @OriginalMember(owner = "client!or", name = "l", descriptor = "I")
    public static int field6508;

    @OriginalMember(owner = "client!or", name = "n", descriptor = "I")
    public static int field6510;

    @OriginalMember(owner = "client!or", name = "o", descriptor = "I")
    public static int field6511;

    @OriginalMember(owner = "client!or", name = "r", descriptor = "I")
    public static int field6514;

    @OriginalMember(owner = "client!or", name = "s", descriptor = "I")
    public static int field6515;

    @OriginalMember(owner = "client!or", name = "t", descriptor = "I")
    public static int field6516;

    @OriginalMember(owner = "client!or", name = "z", descriptor = "I")
    public static int field6522;

    @OriginalMember(owner = "client!or", name = "A", descriptor = "I")
    public static int field6523;

    @OriginalMember(owner = "client!or", name = "C", descriptor = "I")
    public static int field6525;

    @OriginalMember(owner = "client!or", name = "F", descriptor = "I")
    public static int field6528;

    @OriginalMember(owner = "client!or", name = "G", descriptor = "I")
    public static int field6529;

    @OriginalMember(owner = "client!or", name = "H", descriptor = "I")
    public static int field6530;

    @OriginalMember(owner = "client!or", name = "I", descriptor = "I")
    public static int field6531;

    @OriginalMember(owner = "client!or", name = "J", descriptor = "I")
    public static int field6532;

    @OriginalMember(owner = "client!or", name = "K", descriptor = "I")
    public static int field6533;

    @OriginalMember(owner = "client!or", name = "L", descriptor = "I")
    public static int field6534;

    @OriginalMember(owner = "client!or", name = "P", descriptor = "I")
    public static int field6538;

    @OriginalMember(owner = "client!or", name = "Q", descriptor = "I")
    public static int field6539;

    @OriginalMember(owner = "client!or", name = "T", descriptor = "I")
    public static int field6542;

    @OriginalMember(owner = "client!or", name = "Y", descriptor = "I")
    public static int field6547;

    @OriginalMember(owner = "client!or", name = "Z", descriptor = "I")
    public static int field6548;

    @OriginalMember(owner = "client!or", name = "cb", descriptor = "I")
    public static int field6551;

    @OriginalMember(owner = "client!or", name = "eb", descriptor = "I")
    public static int field6553;

    @OriginalMember(owner = "client!or", name = "fb", descriptor = "I")
    public static int field6554;

    @OriginalMember(owner = "client!or", name = "hb", descriptor = "I")
    public static int field6556;

    @OriginalMember(owner = "client!or", name = "ib", descriptor = "I")
    public static int field6557;

    @OriginalMember(owner = "client!or", name = "kb", descriptor = "I")
    public static int field6559;

    @OriginalMember(owner = "client!or", name = "lb", descriptor = "I")
    public static int field6560;

    @OriginalMember(owner = "client!or", name = "ob", descriptor = "I")
    public static int field6563;

    @OriginalMember(owner = "client!or", name = "qb", descriptor = "I")
    public static int field6565;

    @OriginalMember(owner = "client!or", name = "sb", descriptor = "I")
    public static int field6567;

    @OriginalMember(owner = "client!or", name = "vb", descriptor = "I")
    public static int field6570;

    @OriginalMember(owner = "client!or", name = "zb", descriptor = "I")
    public static int field6574;

    @OriginalMember(owner = "client!or", name = "Bb", descriptor = "I")
    public static int field6576;

    @OriginalMember(owner = "client!or", name = "Cb", descriptor = "I")
    public static int field6577;

    @OriginalMember(owner = "client!or", name = "Eb", descriptor = "I")
    public static int field6579;

    @OriginalMember(owner = "client!or", name = "Ib", descriptor = "I")
    public static int field6583;

    @OriginalMember(owner = "client!or", name = "Tb", descriptor = "I")
    public static int field6594;

    @OriginalMember(owner = "client!or", name = "Wb", descriptor = "I")
    public static int field6597;

    @OriginalMember(owner = "client!or", name = "Yb", descriptor = "I")
    public static int field6599;

    @OriginalMember(owner = "client!or", name = "Zb", descriptor = "I")
    public static int field6600;

    @OriginalMember(owner = "client!or", name = "ac", descriptor = "I")
    public static int field6601;

    @OriginalMember(owner = "client!or", name = "bc", descriptor = "I")
    public static int field6602;

    @OriginalMember(owner = "client!or", name = "cc", descriptor = "I")
    public static int field6603;

    @OriginalMember(owner = "client!or", name = "dc", descriptor = "I")
    public static int field6604;

    @OriginalMember(owner = "client!or", name = "gc", descriptor = "I")
    public static int field6607;

    @OriginalMember(owner = "client!or", name = "hc", descriptor = "I")
    public static int field6608;

    @OriginalMember(owner = "client!or", name = "ic", descriptor = "I")
    public static int field6609;

    @OriginalMember(owner = "client!or", name = "oc", descriptor = "I")
    public static int field6615;

    @OriginalMember(owner = "client!or", name = "pc", descriptor = "I")
    public static int field6616;

    @OriginalMember(owner = "client!or", name = "qc", descriptor = "I")
    public static int field6617;

    @OriginalMember(owner = "client!or", name = "rc", descriptor = "I")
    public static int field6618;

    @OriginalMember(owner = "client!or", name = "Mb", descriptor = "Lbu;")
    private class17 field6587;

    @OriginalMember(owner = "client!or", name = "Qb", descriptor = "Lnk;")
    private class502 field6591;

    @OriginalMember(owner = "client!or", name = "Nb", descriptor = "Lbm;")
    private class74 field6588;

    @OriginalMember(owner = "client!or", name = "q", descriptor = "S")
    private short field6513;

    @OriginalMember(owner = "client!or", name = "M", descriptor = "S")
    private short field6535;

    @OriginalMember(owner = "client!or", name = "yb", descriptor = "S")
    private short field6573;

    @OriginalMember(owner = "client!or", name = "Ab", descriptor = "S")
    private short field6575;

    @OriginalMember(owner = "client!or", name = "Db", descriptor = "S")
    private short field6578;

    @OriginalMember(owner = "client!or", name = "Sb", descriptor = "S")
    private short field6593;

    @OriginalMember(owner = "client!or", name = "mc", descriptor = "S")
    private short field6613;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "()[Lvj;", line = 3)
    public final class304[] method770() {
        field6616++;
        return this.field6596;
    }

    @OriginalMember(owner = "client!or", name = "C", descriptor = "()I", line = 12)
    public final int method765() {
        if (!this.field6546) {
            this.method2669((byte) 26);
        }
        field6522++;
        return this.field6513;
    }

    @OriginalMember(owner = "client!or", name = "ia", descriptor = "(I)V", line = 25)
    public final void method782(int arg0) {
        field6559++;
        int var2 = class377.field5316[arg0];
        int var3 = class377.field5315[arg0];
        for (int var4 = 0; var4 < this.field6611; var4++) {
            int var7 = this.field6598[var4] * var2 + (this.field6571[var4] * var3) >> 15;
            this.field6598[var4] = this.field6598[var4] * var3 - (this.field6571[var4] * var2) >> 15;
            this.field6571[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field6589; var5++) {
            int var6 = this.field6520[var5] * var2 + (this.field6536[var5] * var3) >> 15;
            this.field6520[var5] = (short) (this.field6520[var5] * var3 - (this.field6536[var5] * var2) >> 15);
            this.field6536[var5] = (short) var6;
        }
        if (this.field6521 == null && this.field6606 != null) {
            this.field6606.field142 = null;
        }
        if (this.field6521 != null) {
            this.field6521.field142 = null;
        }
        this.field6546 = false;
        if (this.field6572 != null) {
            this.field6572.field142 = null;
        }
    }

    @OriginalMember(owner = "client!or", name = "ra", descriptor = "()I", line = 74)
    public final int method807() {
        if (!this.field6546) {
            this.method2669((byte) 26);
        }
        field6547++;
        return this.field6578;
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(I)V", line = 87)
    public static void method2660(int arg0) {
        field6619 = null;
        if (arg0 <= 34) {
            method2667(46, 10, null, null, null, 121, -85, -40, null, -102, null, -49);
        }
        field6524 = null;
        field6564 = null;
    }

    @OriginalMember(owner = "client!or", name = "FA", descriptor = "()Z", line = 99)
    public final boolean method784() {
        field6570++;
        if (this.field6555 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field6550; var1++) {
            this.field6571[var1] <<= 0x4;
            this.field6541[var1] <<= 0x4;
            this.field6598[var1] <<= 0x4;
        }
        class193.field2754 = 0;
        class319.field4410 = 0;
        class354.field4826 = 0;
        return true;
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lht;)V", line = 4887)
    public class452(class410 arg0) {
        this.field6581 = arg0;
        this.field6572 = new class12(this.field6581, null, 5126, 3, 0);
        this.field6518 = new class12(this.field6581, null, 5126, 2, 0);
        this.field6521 = new class12(this.field6581, null, 5126, 3, 0);
        this.field6606 = new class12(this.field6581, null, 5121, 4, 0);
        this.field6584 = new class426();
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lht;Lwk;IIII)V", line = 4899)
    public class452(class410 arg0, class94 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6590 = arg2;
        this.field6581 = arg0;
        this.field6592 = arg5;
        if (class1.method1(arg2, -70, arg5)) {
            this.field6572 = new class12(this.field6581, null, 5126, 3, 0);
        }
        if (class402.method2330(arg2, arg5, -122)) {
            this.field6518 = new class12(this.field6581, null, 5126, 2, 0);
        }
        if (class200.method1234(-104, arg5, arg2)) {
            this.field6521 = new class12(this.field6581, null, 5126, 3, 0);
        }
        if (class180.method1095(arg2, (byte) -108, arg5)) {
            this.field6606 = new class12(this.field6581, null, 5121, 4, 0);
        }
        if (class186.method1117(2048, arg2, arg5)) {
            this.field6584 = new class426();
        }
        class126 var7 = arg0.field2312;
        int[] var8 = new int[arg1.field1280];
        this.field6509 = new int[arg1.field1278 + 1];
        for (int var9 = 0; var9 < arg1.field1280; var9++) {
            if ((arg1.field1289 == null || arg1.field1289[var9] != 2) && (arg1.field1271 == null || arg1.field1271[var9] == -1 || !var7.method830(arg1.field1271[var9] & 0xFFFF, (byte) 71).field7363)) {
                var8[this.field6566++] = var9;
                this.field6509[arg1.field1292[var9]]++;
                this.field6509[arg1.field1275[var9]]++;
                this.field6509[arg1.field1250[var9]]++;
            }
        }
        this.field6512 = this.field6566;
        long[] var10 = new long[this.field6566];
        boolean var11 = (this.field6590 & 0x100) != 0;
        label492: for (int var12 = 0; var12 < this.field6566; var12++) {
            int var180 = var8[var12];
            class501 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field1284 != null) {
                for (int var186 = 0; var186 < arg1.field1284.length; var186++) {
                    class307 var187 = arg1.field1284[var186];
                    if (var187.field4207 == var180) {
                        class190 var188 = class115.method736((byte) -124, var187.field4208);
                        if (var188.field2635) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field6512--;
                            continue label492;
                        }
                    }
                }
            }
            short var189 = -1;
            if (arg1.field1271 != null) {
                var189 = arg1.field1271[var180];
                if (var189 != -1) {
                    var181 = var7.method830(var189 & 0xFFFF, (byte) 71);
                    var185 = var181.field7383;
                    var184 = var181.field7366;
                }
            }
            boolean var190 = arg1.field1291 != null && arg1.field1291[var180] != 0 || var181 != null && !var181.field7381;
            if ((var11 || var190) && arg1.field1298 != null) {
                var182 += arg1.field1298[var180] << 17;
            }
            if (var190) {
                var182 += 65536;
            }
            int var191 = ((var184 & 0xFF) << 8) + var182;
            int var192 = (var185 & 0xFF) + var191;
            int var193 = ((var189 & 0xFFFF) << 16) + var183;
            int var194 = (var12 & 0xFFFF) + var193;
            var10[var12] = ((long) var192 << 32) + (long) var194;
        }
        class283.method1621((byte) 106, var10, var8);
        this.field6611 = arg1.field1278;
        this.field6571 = arg1.field1286;
        this.field6598 = arg1.field1282;
        this.field6541 = arg1.field1252;
        this.field6582 = arg1.field1269;
        this.field6550 = arg1.field1262;
        this.field6545 = arg1.field1259;
        this.field6596 = arg1.field1277;
        class446[] var13 = new class446[this.field6611];
        if (arg1.field1284 != null) {
            this.field6537 = arg1.field1284.length;
            this.field6595 = new class349[this.field6537];
            this.field6543 = new class39[this.field6537];
            for (int var14 = 0; var14 < this.field6537; var14++) {
                class307 var15 = arg1.field1284[var14];
                class190 var16 = class115.method736((byte) -120, var15.field4208);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field6566; var18++) {
                    if (var8[var18] == var15.field4207) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class437.field6373[arg1.field1299[var15.field4207] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field1291 == null ? 0 : arg1.field1291[var15.field4207]) << 24;
                this.field6543[var14] = new class39(var17, arg1.field1292[var15.field4207], arg1.field1275[var15.field4207], arg1.field1250[var15.field4207], var16.field2629, var16.field2637, var16.field2633, var16.field2640, var16.field2631, var16.field2635, var16.field2632, var15.field4205);
                this.field6595[var14] = new class349(var20);
            }
        }
        int var21 = this.field6566 * 3;
        this.field6585 = new float[var21];
        this.field6562 = new short[this.field6566];
        this.field6569 = new short[var21];
        this.field6580 = new byte[this.field6566];
        this.field6552 = (short) arg4;
        this.field6544 = (short) arg3;
        this.field6605 = new short[this.field6566];
        this.field6558 = new short[this.field6566];
        this.field6517 = new short[this.field6566];
        this.field6549 = new float[var21];
        this.field6536 = new short[var21];
        this.field6612 = new byte[var21];
        this.field6520 = new short[var21];
        this.field6610 = new short[this.field6566];
        class479.field6993 = new long[var21];
        if (arg1.field1263 != null) {
            this.field6540 = new short[this.field6566];
        }
        this.field6527 = new short[var21];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field1278; var23++) {
            int var179 = this.field6509[var23];
            this.field6509[var23] = var22;
            var13[var23] = new class446();
            var22 += var179;
        }
        this.field6509[arg1.field1278] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field1281 != null) {
            int var28 = arg1.field1302;
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
            var24 = new int[var28];
            for (int var36 = 0; var36 < this.field6566; var36++) {
                int var43 = var8[var36];
                if (arg1.field1281[var43] != -1) {
                    int var44 = arg1.field1281[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field1292[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field1275[var43];
                        } else {
                            var46 = arg1.field1250[var43];
                        }
                        int var47 = arg1.field1286[var46];
                        int var48 = arg1.field1252[var46];
                        int var49 = arg1.field1282[var46];
                        if (var29[var44] > var47) {
                            var29[var44] = var47;
                        }
                        if (var47 > var30[var44]) {
                            var30[var44] = var47;
                        }
                        if (var48 < var31[var44]) {
                            var31[var44] = var48;
                        }
                        if (var32[var44] < var48) {
                            var32[var44] = var48;
                        }
                        if (var49 < var33[var44]) {
                            var33[var44] = var49;
                        }
                        if (var34[var44] < var49) {
                            var34[var44] = var49;
                        }
                    }
                }
            }
            var27 = new float[var28][];
            var25 = new int[var28];
            var26 = new int[var28];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field1300[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var39;
                    float var40;
                    float var41;
                    if (var38 == 1) {
                        int var42 = arg1.field1297[var37];
                        var41 = 64.0F / (float) arg1.field1266[var37];
                        if (var42 == 0) {
                            var39 = 1.0F;
                            var40 = 1.0F;
                        } else if (var42 > 0) {
                            var40 = 1.0F;
                            var39 = (float) var42 / 1024.0F;
                        } else {
                            var40 = (float) (-var42) / 1024.0F;
                            var39 = 1.0F;
                        }
                    } else if (var38 == 2) {
                        var41 = 64.0F / (float) arg1.field1266[var37];
                        var40 = 64.0F / (float) arg1.field1297[var37];
                        var39 = 64.0F / (float) arg1.field1279[var37];
                    } else {
                        var39 = (float) arg1.field1279[var37] / 1024.0F;
                        var40 = (float) arg1.field1297[var37] / 1024.0F;
                        var41 = (float) arg1.field1266[var37] / 1024.0F;
                    }
                    var27[var37] = class29.method199(arg1.field1294[var37], arg1.field1257[var37], 2, arg1.field1272[var37], class118.method750(255, arg1.field1296[var37]), var39, var41, var40);
                }
            }
        }
        class279[] var50 = new class279[arg1.field1280];
        for (int var51 = 0; var51 < arg1.field1280; var51++) {
            short var158 = arg1.field1292[var51];
            short var159 = arg1.field1275[var51];
            short var160 = arg1.field1250[var51];
            int var161 = this.field6571[var159] - this.field6571[var158];
            int var162 = this.field6541[var159] - this.field6541[var158];
            int var163 = this.field6598[var159] - this.field6598[var158];
            int var164 = this.field6571[var160] - this.field6571[var158];
            int var165 = this.field6541[var160] - this.field6541[var158];
            int var166 = this.field6598[var160] - this.field6598[var158];
            int var167 = var162 * var166 - var163 * var165;
            int var168 = var163 * var164 - (var161 * var166);
            int var169;
            for (var169 = var161 * var165 - (var162 * var164); var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192; var169 >>= 0x1) {
                var168 >>= 0x1;
                var167 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var167 * var167 + var168 * var168 + var169 * var169));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var169 * 256 / var170;
            int var172 = var167 * 256 / var170;
            int var173 = var168 * 256 / var170;
            byte var174 = arg1.field1289 == null ? 0 : arg1.field1289[var51];
            if (var174 == 0) {
                class446 var175 = var13[var158];
                var175.field6468 += var171;
                var175.field6463 += var173;
                var175.field6466++;
                var175.field6465 += var172;
                class446 var176 = var13[var159];
                var176.field6466++;
                var176.field6468 += var171;
                var176.field6463 += var173;
                var176.field6465 += var172;
                class446 var177 = var13[var160];
                var177.field6463 += var173;
                var177.field6466++;
                var177.field6468 += var171;
                var177.field6465 += var172;
            } else if (var174 == 1) {
                class279 var178 = var50[var51] = new class279();
                var178.field3767 = var172;
                var178.field3764 = var173;
                var178.field3765 = var171;
            }
        }
        for (int var52 = 0; var52 < this.field6566; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field1299[var68] & 0xFFFF;
            short var70;
            if (arg1.field1271 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field1271[var68];
            }
            int var71;
            if (arg1.field1281 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field1281[var68];
            }
            int var72;
            if (arg1.field1291 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field1291[var68] & 0xFF;
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
                    var79 = 1;
                    var80 = 2;
                    var75 = 1.0F;
                    var73 = 0.0F;
                    var74 = 1.0F;
                    var78 = 0.0F;
                    var76 = 1.0F;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field1300[var71];
                    if (var82 == 0) {
                        short var83 = arg1.field1292[var68];
                        short var84 = arg1.field1275[var68];
                        short var85 = arg1.field1250[var68];
                        short var86 = arg1.field1272[var71];
                        short var87 = arg1.field1294[var71];
                        short var88 = arg1.field1257[var71];
                        float var89 = (float) arg1.field1286[var86];
                        float var90 = (float) arg1.field1252[var86];
                        float var91 = (float) arg1.field1282[var86];
                        float var92 = (float) arg1.field1286[var87] - var89;
                        float var93 = (float) arg1.field1252[var87] - var90;
                        float var94 = (float) arg1.field1282[var87] - var91;
                        float var95 = (float) arg1.field1286[var88] - var89;
                        float var96 = (float) arg1.field1252[var88] - var90;
                        float var97 = (float) arg1.field1282[var88] - var91;
                        float var98 = (float) arg1.field1286[var83] - var89;
                        float var99 = (float) arg1.field1252[var83] - var90;
                        float var100 = (float) arg1.field1282[var83] - var91;
                        float var101 = (float) arg1.field1286[var84] - var89;
                        float var102 = (float) arg1.field1252[var84] - var90;
                        float var103 = (float) arg1.field1282[var84] - var91;
                        float var104 = (float) arg1.field1286[var85] - var89;
                        float var105 = (float) arg1.field1252[var85] - var90;
                        float var106 = (float) arg1.field1282[var85] - var91;
                        float var107 = var93 * var97 - var94 * var96;
                        float var108 = var94 * var95 - var92 * var97;
                        float var109 = var92 * var96 - var93 * var95;
                        float var110 = var96 * var109 - var97 * var108;
                        float var111 = var97 * var107 - var95 * var109;
                        float var112 = var95 * var108 - (var96 * var107);
                        float var113 = 1.0F / (var94 * var112 + var92 * var110 + var93 * var111);
                        var77 = (var106 * var112 + var104 * var110 + var105 * var111) * var113;
                        var75 = (var103 * var112 + var101 * var110 + var102 * var111) * var113;
                        var73 = (var100 * var112 + var98 * var110 + var99 * var111) * var113;
                        float var114 = var93 * var109 - var94 * var108;
                        float var115 = var94 * var107 - (var92 * var109);
                        float var116 = var92 * var108 - (var93 * var107);
                        float var117 = 1.0F / (var97 * var116 + var95 * var114 + var96 * var115);
                        var74 = (var100 * var116 + var98 * var114 + var99 * var115) * var117;
                        var78 = (var106 * var116 + var104 * var114 + var105 * var115) * var117;
                        var76 = (var103 * var116 + var101 * var114 + var102 * var115) * var117;
                    } else {
                        short var118 = arg1.field1292[var68];
                        short var119 = arg1.field1275[var68];
                        short var120 = arg1.field1250[var68];
                        int var121 = var24[var71];
                        int var122 = var25[var71];
                        int var123 = var26[var71];
                        float[] var124 = var27[var71];
                        byte var125 = arg1.field1274[var71];
                        float var126 = (float) arg1.field1287[var71] / 256.0F;
                        if (var82 == 1) {
                            float var127 = (float) arg1.field1279[var71] / 1024.0F;
                            class13.method113(true, var126, arg1.field1286[var118], var123, var124, var125, arg1.field1282[var118], var121, arg1.field1252[var118], var127, var122);
                            var73 = class81.field1149;
                            var74 = class249.field3462;
                            class13.method113(true, var126, arg1.field1286[var119], var123, var124, var125, arg1.field1282[var119], var121, arg1.field1252[var119], var127, var122);
                            var75 = class81.field1149;
                            var76 = class249.field3462;
                            class13.method113(true, var126, arg1.field1286[var120], var123, var124, var125, arg1.field1282[var120], var121, arg1.field1252[var120], var127, var122);
                            var78 = class249.field3462;
                            var77 = class81.field1149;
                            float var128 = var127 / 2.0F;
                            if ((var125 & 0x1) == 0) {
                                if (var128 < var77 - var73) {
                                    var80 = 1;
                                    var77 -= var127;
                                } else if (var73 - var77 > var128) {
                                    var80 = 2;
                                    var77 += var127;
                                }
                                if ((var75 - var73 > var128)) {
                                    var75 -= var127;
                                    var79 = 1;
                                } else if (var128 < var73 - var75) {
                                    var75 += var127;
                                    var79 = 2;
                                }
                            } else {
                                if ((var76 - var74 > var128)) {
                                    var76 -= var127;
                                    var79 = 1;
                                } else if (var74 - var76 > var128) {
                                    var79 = 2;
                                    var76 += var127;
                                }
                                if ((var78 - var74 > var128)) {
                                    var78 -= var127;
                                    var80 = 1;
                                } else if (var74 - var78 > var128) {
                                    var80 = 2;
                                    var78 += var127;
                                }
                            }
                        } else if (var82 == 2) {
                            float var129 = (float) arg1.field1267[var71] / 256.0F;
                            float var130 = (float) arg1.field1293[var71] / 256.0F;
                            int var131 = arg1.field1286[var119] - arg1.field1286[var118];
                            int var132 = arg1.field1252[var119] - arg1.field1252[var118];
                            int var133 = arg1.field1282[var119] - arg1.field1282[var118];
                            int var134 = arg1.field1286[var120] - arg1.field1286[var118];
                            int var135 = arg1.field1252[var120] - arg1.field1252[var118];
                            int var136 = arg1.field1282[var120] - arg1.field1282[var118];
                            int var137 = var132 * var136 - (var133 * var135);
                            int var138 = var133 * var134 - (var131 * var136);
                            int var139 = var131 * var135 - var132 * var134;
                            float var140 = 64.0F / (float) arg1.field1297[var71];
                            float var141 = 64.0F / (float) arg1.field1266[var71];
                            float var142 = 64.0F / (float) arg1.field1279[var71];
                            float var143 = (var124[2] * (float) var139 + var124[0] * (float) var137 + var124[1] * (float) var138) / var140;
                            float var144 = (var124[5] * (float) var139 + var124[4] * (float) var138 + var124[3] * (float) var137) / var141;
                            float var145 = (var124[8] * (float) var139 + var124[6] * (float) var137 + var124[7] * (float) var138) / var142;
                            var81 = class391.method2241(0, var143, var144, var145);
                            class505.method2970(var121, (byte) 28, var123, var126, var124, arg1.field1282[var118], arg1.field1286[var118], var122, var130, var125, arg1.field1252[var118], var81, var129);
                            var73 = class205.field2907;
                            var74 = class304.field4171;
                            class505.method2970(var121, (byte) 28, var123, var126, var124, arg1.field1282[var119], arg1.field1286[var119], var122, var130, var125, arg1.field1252[var119], var81, var129);
                            var76 = class304.field4171;
                            var75 = class205.field2907;
                            class505.method2970(var121, (byte) 28, var123, var126, var124, arg1.field1282[var120], arg1.field1286[var120], var122, var130, var125, arg1.field1252[var120], var81, var129);
                            var77 = class205.field2907;
                            var78 = class304.field4171;
                        } else if (var82 == 3) {
                            class93.method624(arg1.field1282[var118], var126, var124, arg1.field1252[var118], (byte) -112, var122, var125, var123, var121, arg1.field1286[var118]);
                            var73 = class166.field2350;
                            var74 = class238.field3269;
                            class93.method624(arg1.field1282[var119], var126, var124, arg1.field1252[var119], (byte) -128, var122, var125, var123, var121, arg1.field1286[var119]);
                            var76 = class238.field3269;
                            var75 = class166.field2350;
                            class93.method624(arg1.field1282[var120], var126, var124, arg1.field1252[var120], (byte) 38, var122, var125, var123, var121, arg1.field1286[var120]);
                            var77 = class166.field2350;
                            var78 = class238.field3269;
                            if ((var125 & 0x1) == 0) {
                                if (var75 - var73 > 0.5F) {
                                    var75--;
                                    var79 = 1;
                                } else if (var73 - var75 > 0.5F) {
                                    var79 = 2;
                                    var75++;
                                }
                                if ((var77 - var73 > 0.5F)) {
                                    var80 = 1;
                                    var77--;
                                } else if (var73 - var77 > 0.5F) {
                                    var80 = 2;
                                    var77++;
                                }
                            } else {
                                if ((var78 - var74 > 0.5F)) {
                                    var78--;
                                    var80 = 1;
                                } else if (var74 - var78 > 0.5F) {
                                    var80 = 2;
                                    var78++;
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
            if (arg1.field1289 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field1289[var68];
            }
            if (var146 == 0) {
                long var150 = ((long) (var69 << 8) + (long) (var81 << 24) + (long) var72 << 32) + (long) (var71 << 2);
                short var152 = arg1.field1292[var68];
                short var153 = arg1.field1275[var68];
                short var154 = arg1.field1250[var68];
                class446 var155 = var13[var152];
                this.field6562[var52] = this.method2673(var74, var73, var150, arg1, (byte) -102, var155.field6466, var155.field6468, var155.field6465, var155.field6463, var152);
                class446 var156 = var13[var153];
                this.field6558[var52] = this.method2673(var76, var75, (long) var79 + var150, arg1, (byte) -36, var156.field6466, var156.field6468, var156.field6465, var156.field6463, var153);
                class446 var157 = var13[var154];
                this.field6517[var52] = this.method2673(var78, var77, (long) var80 + var150, arg1, (byte) -100, var157.field6466, var157.field6468, var157.field6465, var157.field6463, var154);
            } else if (var146 == 1) {
                class279 var147 = var50[var68];
                long var148 = ((long) (var69 << 8) + (long) (var81 << 24) + (long) var72 << 32) + (long) ((var147.field3765 + 256 << 22) + (var147.field3764 + 256 << 12) + (var147.field3767 <= 0 ? 2048 : 1024) + (var71 << 2));
                this.field6562[var52] = this.method2673(var74, var73, var148, arg1, (byte) -108, 0, var147.field3765, var147.field3767, var147.field3764, arg1.field1292[var68]);
                this.field6558[var52] = this.method2673(var76, var75, (long) var79 + var148, arg1, (byte) -66, 0, var147.field3765, var147.field3767, var147.field3764, arg1.field1275[var68]);
                this.field6517[var52] = this.method2673(var78, var77, (long) var80 + var148, arg1, (byte) -36, 0, var147.field3765, var147.field3767, var147.field3764, arg1.field1250[var68]);
            }
            if (arg1.field1271 == null) {
                this.field6605[var52] = -1;
            } else {
                this.field6605[var52] = arg1.field1271[var68];
            }
            if (arg1.field1291 != null) {
                this.field6580[var52] = arg1.field1291[var68];
            }
            if (arg1.field1263 != null) {
                this.field6540[var52] = arg1.field1263[var68];
            }
            this.field6610[var52] = arg1.field1299[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field6512; var55++) {
            short var67 = this.field6605[var55];
            if (var54 != var67) {
                var53++;
                var54 = var67;
            }
        }
        this.field6568 = new int[var53 + 1];
        short var56 = -10000;
        int var57 = 0;
        for (int var58 = 0; var58 < this.field6512; var58++) {
            short var66 = this.field6605[var58];
            if (var56 != var66) {
                this.field6568[var57++] = var58;
                var56 = var66;
            }
        }
        this.field6568[var57] = this.field6512;
        class479.field6993 = null;
        this.field6536 = class113.method729(this.field6536, (byte) -124, this.field6589);
        this.field6527 = class113.method729(this.field6527, (byte) -121, this.field6589);
        this.field6520 = class113.method729(this.field6520, (byte) -122, this.field6589);
        this.field6612 = class297.method1704((byte) 102, this.field6612, this.field6589);
        this.field6549 = class274.method1555(this.field6549, this.field6589, (byte) 12);
        this.field6585 = class274.method1555(this.field6585, this.field6589, (byte) 12);
        if (arg1.field1303 != null && class527.method3091(656, this.field6592, arg2)) {
            this.field6555 = arg1.method634(21);
        }
        if (arg1.field1284 != null && class279.method1574(this.field6592, 84, arg2)) {
            this.field6519 = arg1.method627(true);
        }
        if (arg1.field1268 != null && class193.method1171(this.field6592, false, arg2)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field6566; var61++) {
                int var65 = arg1.field1268[var8[var61]];
                if (var65 >= 0) {
                    int var10002 = var60[var65]++;
                    if (var59 < var65) {
                        var59 = var65;
                    }
                }
            }
            this.field6526 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field6526[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field6566; var63++) {
                int var64 = arg1.field1268[var8[var63]];
                if (var64 >= 0) {
                    this.field6526[var64][var60[var64]++] = var63;
                }
            }
        }
    }

    @OriginalMember(owner = "client!or", name = "ua", descriptor = "(Lj;)Lj;", line = 140)
    public final class378 method785(class378 arg0) {
        field6607++;
        if (this.field6589 == 0) {
            return null;
        }
        if (!this.field6546) {
            this.method2669((byte) 26);
        }
        int var2;
        int var3;
        if (this.field6581.field5945 <= 0) {
            var2 = this.field6613 - (this.field6581.field5945 * this.field6593 >> 8) >> this.field6581.field5866;
            var3 = this.field6535 - (this.field6581.field5945 * this.field6573 >> 8) >> this.field6581.field5866;
        } else {
            var2 = this.field6613 - (this.field6581.field5945 * this.field6573 >> 8) >> this.field6581.field5866;
            var3 = this.field6535 - (this.field6581.field5945 * this.field6593 >> 8) >> this.field6581.field5866;
        }
        int var4;
        int var5;
        if (this.field6581.field5937 <= 0) {
            var4 = this.field6575 - (this.field6581.field5937 * this.field6593 >> 8) >> this.field6581.field5866;
            var5 = this.field6513 - (this.field6581.field5937 * this.field6573 >> 8) >> this.field6581.field5866;
        } else {
            var4 = this.field6575 - (this.field6581.field5937 * this.field6573 >> 8) >> this.field6581.field5866;
            var5 = this.field6513 - (this.field6581.field5937 * this.field6593 >> 8) >> this.field6581.field5866;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class418 var8 = (class418) arg0;
        class418 var9;
        if (var8 != null && var8.method2506((byte) -65, var7, var6)) {
            var9 = var8;
            var8.method2504((byte) -6);
        } else {
            var9 = new class418(this.field6581, var6, var7);
        }
        var9.method2507(var4, var5, var2, var3, (byte) -43);
        this.method2672(66, var9);
        return var9;
    }

    @OriginalMember(owner = "client!or", name = "YA", descriptor = "(SS)V", line = 202)
    public final void method808(short arg0, short arg1) {
        field6538++;
        class126 var3 = this.field6581.field2312;
        for (int var4 = 0; var4 < this.field6566; var4++) {
            if (this.field6605[var4] == arg0) {
                this.field6605[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class501 var7 = var3.method830(arg0 & 0xFFFF, (byte) 71);
            var5 = var7.field7375;
            var6 = var7.field7362;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class501 var10 = var3.method830(arg1 & 0xFFFF, (byte) 71);
            var8 = var10.field7375;
            var9 = var10.field7362;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field6543 != null) {
            for (int var11 = 0; var11 < this.field6537; var11++) {
                class39 var12 = this.field6543[var11];
                class349 var13 = this.field6595[var11];
                var13.field4776 = var13.field4776 & 0xFF000000 | class437.field6373[this.field6610[var12.field526] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field6606 != null) {
            this.field6606.field142 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!or", name = "ja", descriptor = "(III)V", line = 279)
    public final void method797(int arg0, int arg1, int arg2) {
        field6529++;
        for (int var4 = 0; var4 < this.field6611; var4++) {
            if (arg0 != 0) {
                this.field6571[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field6541[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field6598[var4] += arg2;
            }
        }
        this.field6546 = false;
        if (this.field6572 != null) {
            this.field6572.field142 = null;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IIIIIIZII)Z", line = 313)
    private final boolean method2661(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        field6579++;
        if (arg6) {
            return true;
        } else if (arg4 < arg3 && arg5 > arg4 && arg0 > arg4) {
            return false;
        } else if (arg4 > arg3 && arg5 < arg4 && arg4 > arg0) {
            return false;
        } else if (arg1 > arg7 && arg8 > arg7 && arg7 < arg2) {
            return false;
        } else {
            return arg1 >= arg7 || arg7 <= arg8 || arg7 <= arg2;
        }
    }

    @OriginalMember(owner = "client!or", name = "XA", descriptor = "(III)V", line = 341)
    public final void method769(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field6611; var4++) {
            if (arg0 != 128) {
                this.field6571[var4] = this.field6571[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field6541[var4] = this.field6541[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field6598[var4] = this.field6598[var4] * arg2 >> 7;
            }
        }
        field6601++;
        if (this.field6572 != null) {
            this.field6572.field142 = null;
        }
        this.field6546 = false;
    }

    @OriginalMember(owner = "client!or", name = "n", descriptor = "()I", line = 379)
    public final int method775() {
        field6528++;
        return this.field6590;
    }

    @OriginalMember(owner = "client!or", name = "d", descriptor = "()V", line = 390)
    public final void method796() {
        field6563++;
        if (this.field6589 <= 0 || this.field6512 <= 0) {
            return;
        }
        this.method2674(true, false);
        if ((this.field6614 & 0x10) == 0 && this.field6584.field6231 == null) {
            this.method2670((byte) 1, false);
        }
        this.method2662(716);
    }

    @OriginalMember(owner = "client!or", name = "ea", descriptor = "(IILna;Lna;III)V", line = 410)
    public final void method774(int arg0, int arg1, class35 arg2, class35 arg3, int arg4, int arg5, int arg6) {
        if (!this.field6546) {
            this.method2669((byte) 26);
        }
        field6600++;
        int var8 = arg4 + this.field6613;
        int var9 = arg4 + this.field6535;
        int var10 = this.field6575 + arg6;
        int var11 = this.field6513 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field495 <= arg2.field494 + var9 >> arg2.field492 || var10 < 0 || (arg2.field494 + var11 >> arg2.field492) >= arg2.field497) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field494 + var9 >> arg3.field492 >= arg3.field495 || var10 < 0 || var11 + arg3.field494 >> arg3.field492 >= arg3.field497) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field492;
            int var13 = arg2.field494 + var9 - 1 >> arg2.field492;
            int var14 = var10 >> arg2.field492;
            int var15 = var11 - (1 - arg2.field494) >> arg2.field492;
            if (arg2.method221(var12, var14) == arg5 && arg2.method221(var13, var14) == arg5 && arg2.method221(var12, var15) == arg5 && arg5 == arg2.method221(var13, var15)) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field6611; var16++) {
                this.field6541[var16] = (this.field6541[var16] + arg2.method232(this.field6571[var16] + arg4, this.field6598[var16] + arg6)) - arg5;
            }
        } else if (arg0 == 2) {
            short var17 = this.field6593;
            if (var17 == 0) {
                return;
            }
            for (int var18 = 0; var18 < this.field6611; var18++) {
                int var19 = (this.field6541[var18] << 16) / var17;
                if (var19 < arg1) {
                    this.field6541[var18] -= -((arg1 - var19) * (arg2.method232(this.field6571[var18] + arg4, this.field6598[var18] - -arg6) - arg5) / arg1);
                }
            }
        } else if (arg0 == 3) {
            int var29 = (arg1 & 0xFF) * 4;
            int var30 = (arg1 >> 8 & 0xFF) * 4;
            int var31 = arg1 >> 16 & 0xFF << 6;
            int var32 = (arg1 >> 24 & 0xFF) << 6;
            if (arg4 - (var29 >> 1) < 0 || arg2.field495 << arg2.field492 <= (var29 >> 1) + arg4 + arg2.field494 || arg6 - (var30 >> 1) < 0 || (arg2.field497 << arg2.field492) <= ((var30 >> 1) + arg2.field494 + arg6)) {
                return;
            }
            this.method792(arg5, var31, var30, var29, var32, arg4, arg2, (byte) -28, arg6);
        } else if (arg0 == 4) {
            int var20 = this.field6573 - this.field6593;
            for (int var21 = 0; var21 < this.field6611; var21++) {
                this.field6541[var21] = this.field6541[var21] + arg3.method232(this.field6571[var21] + arg4, this.field6598[var21] + arg6) + var20 - arg5;
            }
        } else if (arg0 == 5) {
            int var22 = this.field6573 - this.field6593;
            for (int var23 = 0; var23 < this.field6611; var23++) {
                int var24 = this.field6571[var23] + arg4;
                int var25 = this.field6598[var23] + arg6;
                int var26 = arg2.method232(var24, var25);
                int var27 = arg3.method232(var24, var25);
                int var28 = var26 - var27;
                this.field6541[var23] = ((this.field6541[var23] << 8) / var22 * var28 >> 8) + (var26 - arg5);
            }
        }
        this.field6546 = false;
        if (this.field6572 != null) {
            this.field6572.field142 = null;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(BIZ)Lc;", line = 565)
    public final class121 method761(byte arg0, int arg1, boolean arg2) {
        field6560++;
        class452 var4;
        class452 var5;
        if (arg0 == 1) {
            var5 = this.field6581.field6004;
            var4 = this.field6581.field5886;
        } else if (arg0 == 2) {
            var4 = this.field6581.field6000;
            var5 = this.field6581.field5975;
        } else if (arg0 == 3) {
            var4 = this.field6581.field5993;
            var5 = this.field6581.field5924;
        } else if (arg0 == 4) {
            var4 = this.field6581.field5973;
            var5 = this.field6581.field5947;
        } else if (arg0 == 5) {
            var4 = this.field6581.field5943;
            var5 = this.field6581.field5926;
        } else {
            var4 = var5 = new class452(this.field6581);
        }
        return this.method2671(arg2, false, var4, arg1, var5, arg0 != 0);
    }

    @OriginalMember(owner = "client!or", name = "c", descriptor = "(I)V", line = 614)
    private final void method2662(int arg0) {
        if (arg0 != 716) {
            return;
        }
        field6532++;
        if (!this.field6561) {
            return;
        }
        this.field6561 = false;
        if (this.field6596 == null && this.field6545 == null && this.field6543 == null) {
            if (this.field6571 != null && !class471.method2777(this.field6592, this.field6590, 76)) {
                if (this.field6572 != null && this.field6572.field142 == null) {
                    this.field6561 = true;
                } else {
                    if (!this.field6546) {
                        this.method2669((byte) 26);
                    }
                    this.field6571 = null;
                }
            }
            if (this.field6541 != null && !class163.method1012(this.field6590, this.field6592, (byte) -93)) {
                if (this.field6572 != null && this.field6572.field142 == null) {
                    this.field6561 = true;
                } else {
                    if (!this.field6546) {
                        this.method2669((byte) 26);
                    }
                    this.field6541 = null;
                }
            }
            if (this.field6598 != null && !class105.method687(124, this.field6592, this.field6590)) {
                if (this.field6572 != null && this.field6572.field142 == null) {
                    this.field6561 = true;
                } else {
                    if (!this.field6546) {
                        this.method2669((byte) 26);
                    }
                    this.field6598 = null;
                }
            }
        }
        if (this.field6569 != null && this.field6571 == null && this.field6541 == null && this.field6598 == null) {
            this.field6509 = null;
            this.field6569 = null;
        }
        if (this.field6612 != null && !class272.method1547((byte) 59, this.field6592, this.field6590)) {
            if (this.field6521 == null) {
                if (this.field6606 != null && this.field6606.field142 == null) {
                    this.field6561 = true;
                } else {
                    this.field6612 = null;
                    this.field6536 = this.field6527 = this.field6520 = null;
                }
            } else if (this.field6521.field142 == null) {
                this.field6561 = true;
            } else {
                this.field6612 = null;
                this.field6536 = this.field6527 = this.field6520 = null;
            }
        }
        if (this.field6610 != null && !class426.method2557(this.field6590, -47, this.field6592)) {
            if (this.field6606 != null && this.field6606.field142 == null) {
                this.field6561 = true;
            } else {
                this.field6610 = null;
            }
        }
        if (this.field6580 != null && !class229.method1343(this.field6590, this.field6592, 1)) {
            if (this.field6606 != null && this.field6606.field142 == null) {
                this.field6561 = true;
            } else {
                this.field6580 = null;
            }
        }
        if (this.field6549 != null && !class307.method1741(this.field6590, this.field6592, 40)) {
            if (this.field6518 != null && this.field6518.field142 == null) {
                this.field6561 = true;
            } else {
                this.field6549 = this.field6585 = null;
            }
        }
        if (this.field6605 != null && !class132.method869(95, this.field6592, this.field6590)) {
            if (this.field6606 != null && this.field6606.field142 == null) {
                this.field6561 = true;
            } else {
                this.field6605 = null;
            }
        }
        if (this.field6562 != null && !class310.method1757(this.field6590, -123, this.field6592)) {
            if ((this.field6584 == null || this.field6584.field6231 != null) && (this.field6606 == null || this.field6606.field142 != null)) {
                this.field6562 = this.field6558 = this.field6517 = null;
            } else {
                this.field6561 = true;
            }
        }
        if (this.field6526 != null && !class193.method1171(this.field6592, false, this.field6590)) {
            this.field6540 = null;
            this.field6526 = null;
        }
        if (this.field6555 != null && !class527.method3091(656, this.field6592, this.field6590)) {
            this.field6582 = null;
            this.field6555 = null;
        }
        if (this.field6519 != null && !class279.method1574(this.field6592, 74, this.field6590)) {
            this.field6519 = null;
        }
        if (this.field6568 != null && (this.field6590 & 0x800) == 0 && (this.field6590 & 0x40000) == 0) {
            this.field6568 = null;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lia;Lnh;I)V", line = 789)
    public final void method781(class415 arg0, class525 arg1, int arg2) {
        field6609++;
        if (this.field6589 == 0) {
            return;
        }
        class53 var4 = this.field6581.field5917;
        if (!this.field6546) {
            this.method2669((byte) 26);
        }
        class53 var5 = (class53) arg0;
        this.method2666(-66, var5);
        class360.field4940 = var4.field730 * var5.field723 + var4.field727 * var5.field707 + var4.field721 * var5.field718 + var4.field723;
        class374.field5225 = var4.field730 * var5.field721 + var4.field727 * var5.field738 + var4.field721 * var5.field732;
        float var6 = (float) this.field6593 * class374.field5225 + class360.field4940;
        float var7 = (float) this.field6573 * class374.field5225 + class360.field4940;
        float var8;
        float var9;
        if (var7 < var6) {
            var8 = var7 - (float) this.field6578;
            var9 = (float) this.field6578 + var6;
        } else {
            var9 = (float) this.field6578 + var7;
            var8 = var6 - (float) this.field6578;
        }
        if ((var8 >= this.field6581.field5889) || (var9 <= (float) this.field6581.field5909)) {
            return;
        }
        class339.field4670 = var4.field729 * var5.field721 + var4.field738 * var5.field732 + var4.field709 * var5.field738;
        class386.field5431 = var4.field729 * var5.field723 + var4.field738 * var5.field718 + var4.field709 * var5.field707 + var4.field707;
        float var10 = (float) this.field6593 * class339.field4670 + class386.field5431;
        float var11 = (float) this.field6573 * class339.field4670 + class386.field5431;
        float var12;
        float var13;
        if ((var11 < var10)) {
            var13 = ((float) this.field6578 + var10) * (float) this.field6581.field5899;
            var12 = (var11 - (float) this.field6578) * (float) this.field6581.field5899;
        } else {
            var12 = (var10 - (float) this.field6578) * (float) this.field6581.field5899;
            var13 = ((float) this.field6578 + var11) * (float) this.field6581.field5899;
        }
        if ((this.field6581.field5915 <= var12 / var9) || (var13 / var9 <= this.field6581.field5894)) {
            return;
        }
        class399.field5556 = var4.field735 * var5.field723 + var4.field732 * var5.field718 + var4.field731 * var5.field707 + var4.field718;
        class197.field2842 = var4.field735 * var5.field721 + var4.field732 * var5.field732 + var4.field731 * var5.field738;
        float var14 = (float) this.field6593 * class197.field2842 + class399.field5556;
        float var15 = (float) this.field6573 * class197.field2842 + class399.field5556;
        float var16;
        float var17;
        if ((var14 > var15)) {
            var17 = ((float) (-this.field6578) + var15) * (float) this.field6581.field5913;
            var16 = ((float) this.field6578 + var14) * (float) this.field6581.field5913;
        } else {
            var16 = ((float) this.field6578 + var15) * (float) this.field6581.field5913;
            var17 = ((float) (-this.field6578) + var14) * (float) this.field6581.field5913;
        }
        if ((var17 / var9 >= this.field6581.field5895) || (var16 / var9 <= this.field6581.field5980)) {
            return;
        }
        if (arg1 != null || this.field6543 != null) {
            class71.field1072 = var4.field730 * var5.field727 + var4.field727 * var5.field709 + var4.field721 * var5.field731;
            class311.field4257 = var4.field735 * var5.field727 + var4.field732 * var5.field731 + var4.field731 * var5.field709;
            class314.field4303 = var4.field729 * var5.field727 + var4.field738 * var5.field731 + var4.field709 * var5.field709;
            class43.field598 = var4.field730 * var5.field730 + var4.field727 * var5.field729 + var4.field721 * var5.field735;
            class288.field3864 = var4.field735 * var5.field730 + var4.field732 * var5.field735 + var4.field731 * var5.field729;
            class233.field3233 = var4.field729 * var5.field730 + var4.field738 * var5.field735 + var4.field709 * var5.field729;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field6613 + this.field6535 >> 1;
            int var21 = this.field6575 + this.field6513 >> 1;
            int var22 = (int) ((float) var21 * class233.field3233 + (float) this.field6593 * class339.field4670 + (float) var20 * class314.field4303 + class386.field5431);
            int var23 = (int) ((float) var21 * class288.field3864 + (float) this.field6593 * class197.field2842 + (float) var20 * class311.field4257 + class399.field5556);
            int var24 = (int) ((float) var21 * class43.field598 + (float) this.field6593 * class374.field5225 + (float) var20 * class71.field1072 + class360.field4940);
            if (this.field6581.field5909 <= var24) {
                arg1.field7713 = this.field6581.field5899 * var22 / var24 + this.field6581.field5981;
                arg1.field7716 = this.field6581.field5913 * var23 / var24 + this.field6581.field5984;
            } else {
                var18 = true;
            }
            int var25 = (int) ((float) var21 * class233.field3233 + (float) this.field6573 * class339.field4670 + (float) var20 * class314.field4303 + class386.field5431);
            int var26 = (int) ((float) var21 * class288.field3864 + (float) this.field6573 * class197.field2842 + (float) var20 * class311.field4257 + class399.field5556);
            int var27 = (int) ((float) var21 * class43.field598 + (float) this.field6573 * class374.field5225 + (float) var20 * class71.field1072 + class360.field4940);
            if (this.field6581.field5909 <= var27) {
                arg1.field7711 = this.field6581.field5899 * var25 / var27 + this.field6581.field5981;
                arg1.field7714 = this.field6581.field5913 * var26 / var27 + this.field6581.field5984;
            } else {
                var18 = true;
            }
            if (var18) {
                if (var24 < this.field6581.field5909 && this.field6581.field5909 > var27) {
                    var19 = false;
                } else if (var24 < this.field6581.field5909) {
                    int var28 = (var27 - this.field6581.field5909 << 16) / (var27 - var24);
                    int var29 = ((var25 - var22) * var28 >> 16) + var25;
                    arg1.field7713 = this.field6581.field5899 * var29 / this.field6581.field5909 + this.field6581.field5981;
                    int var30 = var26 + ((var26 - var23) * var28 >> 16);
                    arg1.field7716 = this.field6581.field5913 * var30 / this.field6581.field5909 + this.field6581.field5984;
                } else if (var27 < this.field6581.field5909) {
                    int var31 = (var24 - this.field6581.field5909 << 16) / (var24 - var27);
                    int var32 = ((var22 - var25) * var31 >> 16) + var22;
                    arg1.field7713 = this.field6581.field5981 + (this.field6581.field5899 * var32 / this.field6581.field5909);
                    int var33 = ((var23 - var26) * var31 >> 16) + var23;
                    arg1.field7716 = this.field6581.field5913 * var33 / this.field6581.field5909 + this.field6581.field5984;
                }
            }
            if (var19) {
                if (var27 < var24) {
                    arg1.field7715 = (var22 + this.field6578) * this.field6581.field5899 / var24 + this.field6581.field5981 - arg1.field7713;
                } else {
                    arg1.field7715 = (var25 + this.field6578) * this.field6581.field5899 / var27 + this.field6581.field5981 - arg1.field7711;
                }
                arg1.field7712 = true;
            }
        }
        this.field6581.method2388(-7174);
        this.field6581.method2378(var5, 126);
        this.method2665(0);
        this.field6581.method2375((byte) 123);
        this.method2668(-90);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IIIBS)I", line = 990)
    private final int method2663(int arg0, int arg1, int arg2, byte arg3, short arg4) {
        field6539++;
        if (arg0 != 32767) {
            return 9;
        }
        int var6 = class437.field6373[class344.method1917(arg1, arg2, -111)];
        if (arg4 != -1) {
            class501 var7 = this.field6581.field2312.method830(arg4 & 0xFFFF, (byte) 71);
            int var8 = var7.field7375 & 0xFF;
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
                    var6 = ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) + ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) >> 8;
                }
            }
            int var12 = var7.field7362 & 0xFF;
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
                var6 = ((var13 & 0xD600FF00) << 8) + (var15 >> 8) + (var14 & 0xFF00);
            }
        }
        return (var6 << 8) + 255 - (arg3 & 0xFF);
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(IIII)V", line = 1069)
    public static final void method2664(int arg0, int arg1, int arg2, int arg3) {
        class61 var4 = class385.field5410[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class463 var5 = var4.field825;
        class463 var6 = var4.field816;
        if (var5 != null) {
            var5.field6719 = var5.field6719 * arg3 / (0x10 << class34.field484 - 7);
            var5.field6731 = var5.field6731 * arg3 / (0x10 << class34.field484 - 7);
        }
        if (var6 != null) {
            var6.field6719 = var6.field6719 * arg3 / (0x10 << class34.field484 - 7);
            var6.field6731 = var6.field6731 * arg3 / (0x10 << class34.field484 - 7);
        }
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "()I", line = 1105)
    public final int method771() {
        field6530++;
        if (!this.field6546) {
            this.method2669((byte) 26);
        }
        return this.field6593;
    }

    @OriginalMember(owner = "client!or", name = "oa", descriptor = "(I)V", line = 1116)
    public final void method793(int arg0) {
        this.field6552 = (short) arg0;
        field6565++;
        if (this.field6606 != null) {
            this.field6606.field142 = null;
        }
        if (this.field6521 != null) {
            this.field6521.field142 = null;
        }
    }

    @OriginalMember(owner = "client!or", name = "d", descriptor = "(I)V", line = 1133)
    private final void method2665(int arg0) {
        field6556++;
        if (this.field6512 == 0) {
            return;
        }
        if (this.field6614 != arg0) {
            this.method2674(true, true);
        }
        this.method2674(true, false);
        if (this.field6584 != null) {
            if (this.field6584.field6231 == null) {
                this.method2670((byte) 1, (this.field6614 & 0x10) != 0);
            }
            if (this.field6584.field6231 != null) {
                this.field6581.method2433(this.field6521 != null, (byte) -44);
                this.field6581.method2439(this.field6518, (byte) -25, this.field6572, this.field6606, this.field6521);
                int var2 = this.field6568.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field6568[var3];
                    int var5 = this.field6568[var3 + 1];
                    int var6 = this.field6605[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field6581.method2417(35, var6, this.field6521 != null);
                    this.field6581.method2420(var4 * 3, (var5 - var4) * 3, 87, this.field6584.field6231, 4);
                }
            }
        }
        this.method2662(716);
    }

    @OriginalMember(owner = "client!or", name = "WA", descriptor = "(I)V", line = 1190)
    public final void method773(int arg0) {
        field6602++;
        int var2 = class377.field5316[arg0];
        int var3 = class377.field5315[arg0];
        for (int var4 = 0; var4 < this.field6611; var4++) {
            int var5 = this.field6541[var4] * var3 - this.field6598[var4] * var2 >> 15;
            this.field6598[var4] = this.field6598[var4] * var3 + this.field6541[var4] * var2 >> 15;
            this.field6541[var4] = var5;
        }
        if (this.field6572 != null) {
            this.field6572.field142 = null;
        }
        this.field6546 = false;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ILaw;)V", line = 1220)
    private final void method2666(int arg0, class53 arg1) {
        if (this.field6596 != null) {
            for (int var3 = 0; var3 < this.field6596.length; var3++) {
                class304 var4 = this.field6596[var3];
                class304 var5 = var4;
                if (var4.field4161 != null) {
                    var5 = var4.field4161;
                }
                var5.field4166 = (int) ((float) this.field6598[var4.field4158] * arg1.field729 + (float) this.field6571[var4.field4158] * arg1.field709 + (float) this.field6541[var4.field4158] * arg1.field738 + arg1.field707);
                var5.field4154 = (int) ((float) this.field6598[var4.field4158] * arg1.field735 + (float) this.field6571[var4.field4158] * arg1.field731 + (float) this.field6541[var4.field4158] * arg1.field732 + arg1.field718);
                var5.field4156 = (int) ((float) this.field6598[var4.field4158] * arg1.field730 + (float) this.field6571[var4.field4158] * arg1.field727 + (float) this.field6541[var4.field4158] * arg1.field721 + arg1.field723);
                var5.field4149 = (int) ((float) this.field6598[var4.field4157] * arg1.field729 + (float) this.field6571[var4.field4157] * arg1.field709 + (float) this.field6541[var4.field4157] * arg1.field738 + arg1.field707);
                var5.field4164 = (int) ((float) this.field6598[var4.field4157] * arg1.field735 + (float) this.field6571[var4.field4157] * arg1.field731 + (float) this.field6541[var4.field4157] * arg1.field732 + arg1.field718);
                var5.field4162 = (int) ((float) this.field6598[var4.field4157] * arg1.field730 + (float) this.field6571[var4.field4157] * arg1.field727 + (float) this.field6541[var4.field4157] * arg1.field721 + arg1.field723);
                var5.field4159 = (int) ((float) this.field6598[var4.field4168] * arg1.field729 + (float) this.field6571[var4.field4168] * arg1.field709 + (float) this.field6541[var4.field4168] * arg1.field738 + arg1.field707);
                var5.field4155 = (int) ((float) this.field6598[var4.field4168] * arg1.field735 + (float) this.field6571[var4.field4168] * arg1.field731 + (float) this.field6541[var4.field4168] * arg1.field732 + arg1.field718);
                var5.field4151 = (int) ((float) this.field6598[var4.field4168] * arg1.field730 + (float) this.field6571[var4.field4168] * arg1.field727 + (float) this.field6541[var4.field4168] * arg1.field721 + arg1.field723);
            }
        }
        field6618++;
        if (arg0 >= -47 || this.field6545 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field6545.length; var6++) {
            class456 var7 = this.field6545[var6];
            class456 var8 = var7;
            if (var7.field6671 != null) {
                var8 = var7.field6671;
            }
            if (var7.field6670 == null) {
                var7.field6670 = arg1.method346();
            } else {
                var7.field6670.method342(arg1);
            }
            var8.field6676 = (int) ((float) this.field6598[var7.field6665] * arg1.field729 + (float) this.field6571[var7.field6665] * arg1.field709 + (float) this.field6541[var7.field6665] * arg1.field738 + arg1.field707);
            var8.field6663 = (int) ((float) this.field6598[var7.field6665] * arg1.field735 + (float) this.field6571[var7.field6665] * arg1.field731 + (float) this.field6541[var7.field6665] * arg1.field732 + arg1.field718);
            var8.field6662 = (int) ((float) this.field6598[var7.field6665] * arg1.field730 + (float) this.field6571[var7.field6665] * arg1.field727 + (float) this.field6541[var7.field6665] * arg1.field721 + arg1.field723);
        }
    }

    @OriginalMember(owner = "client!or", name = "xa", descriptor = "(I[IIIIIZ)V", line = 1294)
    public final void method809(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field6576++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = arg2 << 4;
            class354.field4826 = 0;
            class193.field2754 = 0;
            class319.field4410 = 0;
            int var12 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field6555.length) {
                    int[] var15 = this.field6555[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class193.field2754 += this.field6571[var17];
                        class319.field4410 += this.field6541[var17];
                        class354.field4826 += this.field6598[var17];
                        var12++;
                    }
                }
            }
            if (var12 <= 0) {
                class354.field4826 = var10;
                class193.field2754 = var11;
                class319.field4410 = var9;
            } else {
                class354.field4826 = class354.field4826 / var12 + var10;
                class319.field4410 = class319.field4410 / var12 + var9;
                class193.field2754 = class193.field2754 / var12 + var11;
            }
        } else if (arg0 == 1) {
            int var18 = arg4 << 4;
            int var19 = arg2 << 4;
            int var20 = arg3 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (var22 < this.field6555.length) {
                    int[] var23 = this.field6555[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field6571[var25] += var19;
                        this.field6541[var25] += var20;
                        this.field6598[var25] += var18;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (this.field6555.length > var45) {
                    int[] var46 = this.field6555[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field6571[var59] -= class193.field2754;
                            this.field6541[var59] -= class319.field4410;
                            this.field6598[var59] -= class354.field4826;
                            if (arg4 != 0) {
                                int var60 = class377.field5316[arg4];
                                int var61 = class377.field5315[arg4];
                                int var62 = this.field6541[var59] * var60 + (this.field6571[var59] * var61) + 32767 >> 15;
                                this.field6541[var59] = this.field6541[var59] * var61 + 32767 - (this.field6571[var59] * var60) >> 15;
                                this.field6571[var59] = var62;
                            }
                            if (arg2 != 0) {
                                int var63 = class377.field5316[arg2];
                                int var64 = class377.field5315[arg2];
                                int var65 = this.field6541[var59] * var64 + 32767 - (this.field6598[var59] * var63) >> 15;
                                this.field6598[var59] = this.field6598[var59] * var64 + this.field6541[var59] * var63 + 32767 >> 15;
                                this.field6541[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class377.field5316[arg3];
                                int var67 = class377.field5315[arg3];
                                int var68 = this.field6598[var59] * var66 + this.field6571[var59] * var67 + 32767 >> 15;
                                this.field6598[var59] = this.field6598[var59] * var67 + 32767 - (this.field6571[var59] * var66) >> 15;
                                this.field6571[var59] = var68;
                            }
                            this.field6571[var59] += class193.field2754;
                            this.field6541[var59] += class319.field4410;
                            this.field6598[var59] += class354.field4826;
                        }
                    } else {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field6571[var48] -= class193.field2754;
                            this.field6541[var48] -= class319.field4410;
                            this.field6598[var48] -= class354.field4826;
                            if (arg2 != 0) {
                                int var49 = class377.field5316[arg2];
                                int var50 = class377.field5315[arg2];
                                int var51 = this.field6541[var48] * var50 - (this.field6598[var48] * var49 - 32767) >> 15;
                                this.field6598[var48] = this.field6598[var48] * var50 + this.field6541[var48] * var49 + 32767 >> 15;
                                this.field6541[var48] = var51;
                            }
                            if (arg4 != 0) {
                                int var52 = class377.field5316[arg4];
                                int var53 = class377.field5315[arg4];
                                int var54 = this.field6571[var48] * var53 + this.field6541[var48] * var52 + 32767 >> 15;
                                this.field6541[var48] = this.field6541[var48] * var53 + 32767 - (this.field6571[var48] * var52) >> 15;
                                this.field6571[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class377.field5316[arg3];
                                int var56 = class377.field5315[arg3];
                                int var57 = this.field6571[var48] * var56 + (this.field6598[var48] * var55 + 32767) >> 15;
                                this.field6598[var48] = this.field6598[var48] * var56 + 32767 - (this.field6571[var48] * var55) >> 15;
                                this.field6571[var48] = var57;
                            }
                            this.field6571[var48] += class193.field2754;
                            this.field6541[var48] += class319.field4410;
                            this.field6598[var48] += class354.field4826;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field6555.length) {
                        int[] var29 = this.field6555[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field6509[var31];
                            int var33 = this.field6509[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field6569[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class377.field5316[arg4];
                                    int var37 = class377.field5315[arg4];
                                    int var38 = this.field6536[var35] * var37 + this.field6527[var35] * var36 + 32767 >> 15;
                                    this.field6527[var35] = (short) (this.field6527[var35] * var37 + 32767 - (this.field6536[var35] * var36) >> 15);
                                    this.field6536[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class377.field5316[arg2];
                                    int var40 = class377.field5315[arg2];
                                    int var41 = this.field6527[var35] * var40 + 32767 - (this.field6520[var35] * var39) >> 15;
                                    this.field6520[var35] = (short) (this.field6527[var35] * var39 + (this.field6520[var35] * var40 + 32767) >> 15);
                                    this.field6527[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class377.field5316[arg3];
                                    int var43 = class377.field5315[arg3];
                                    int var44 = this.field6536[var35] * var43 + this.field6520[var35] * var42 + 32767 >> 15;
                                    this.field6520[var35] = (short) (this.field6520[var35] * var43 + 32767 - (this.field6536[var35] * var42) >> 15);
                                    this.field6536[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field6521 == null && this.field6606 != null) {
                    this.field6606.field142 = null;
                }
                if (this.field6521 != null) {
                    this.field6521.field142 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field6555.length) {
                    int[] var71 = this.field6555[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field6571[var73] -= class193.field2754;
                        this.field6541[var73] -= class319.field4410;
                        this.field6598[var73] -= class354.field4826;
                        this.field6571[var73] = this.field6571[var73] * arg2 >> 7;
                        this.field6541[var73] = this.field6541[var73] * arg3 >> 7;
                        this.field6598[var73] = this.field6598[var73] * arg4 >> 7;
                        this.field6571[var73] += class193.field2754;
                        this.field6541[var73] += class319.field4410;
                        this.field6598[var73] += class354.field4826;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field6526 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (this.field6526.length > var78) {
                        int[] var79 = this.field6526[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field6580[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field6580[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field6606 != null) {
                            this.field6606.field142 = null;
                        }
                    }
                }
                if (this.field6543 != null) {
                    for (int var75 = 0; var75 < this.field6537; var75++) {
                        class39 var76 = this.field6543[var75];
                        class349 var77 = this.field6595[var75];
                        var77.field4776 = 255 - (this.field6580[var76.field526] & 0xFF) << 24 | var77.field4776 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field6526 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (this.field6526.length > var87) {
                        int[] var88 = this.field6526[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field6610[var90] & 0xFFFF;
                            int var92 = (var91 & 0xFD90) >> 10;
                            int var93 = (var91 & 0x396) >> 7;
                            int var94 = arg2 + var92 & 0x3F;
                            int var95 = arg3 / 4 + var93;
                            int var96 = var91 & 0x7F;
                            if (var95 < 0) {
                                var95 = 0;
                            } else if (var95 > 7) {
                                var95 = 7;
                            }
                            int var97 = arg4 + var96;
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field6610[var90] = (short) class25.method183(class25.method183(var94 << 10, var95 << 7), var97);
                        }
                        if (var88.length > 0 && this.field6606 != null) {
                            this.field6606.field142 = null;
                        }
                    }
                }
                if (this.field6543 != null) {
                    for (int var84 = 0; var84 < this.field6537; var84++) {
                        class39 var85 = this.field6543[var84];
                        class349 var86 = this.field6595[var84];
                        var86.field4776 = class437.field6373[this.field6610[var85.field526] & 0xFFFF] & 0xFFFFFF | var86.field4776 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field6519 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (this.field6519.length > var99) {
                        int[] var100 = this.field6519[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class349 var102 = this.field6595[var100[var101]];
                            var102.field4777 += arg3;
                            var102.field4780 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field6519 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (this.field6519.length > var104) {
                        int[] var105 = this.field6519[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class349 var107 = this.field6595[var105[var106]];
                            var107.field4781 = var107.field4781 * arg3 >> 7;
                            var107.field4779 = var107.field4779 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field6519 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (var109 < this.field6519.length) {
                    int[] var110 = this.field6519[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class349 var112 = this.field6595[var110[var111]];
                        var112.field4778 = var112.field4778 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!or", name = "W", descriptor = "()V", line = 1949)
    public final void method786() {
        field6548++;
        for (int var1 = 0; var1 < this.field6550; var1++) {
            this.field6571[var1] = this.field6571[var1] + 7 >> 4;
            this.field6541[var1] = this.field6541[var1] + 7 >> 4;
            this.field6598[var1] = this.field6598[var1] + 7 >> 4;
        }
        if (this.field6572 != null) {
            this.field6572.field142 = null;
        }
        this.field6546 = false;
    }

    @OriginalMember(owner = "client!or", name = "X", descriptor = "()I", line = 1973)
    public final int method799() {
        field6577++;
        if (!this.field6546) {
            this.method2669((byte) 26);
        }
        return this.field6575;
    }

    @OriginalMember(owner = "client!or", name = "c", descriptor = "()[Lit;", line = 1994)
    public final class456[] method789() {
        field6599++;
        return this.field6545;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IILea;Loa;Ljava/lang/String;IIILgv;ILss;I)V", line = 2007)
    public static final void method2667(int arg0, int arg1, class382 arg2, class490 arg3, String arg4, int arg5, int arg6, int arg7, class56 arg8, int arg9, class295 arg10, int arg11) {
        field6617++;
        int var12;
        if (class128.field1742 == 4) {
            var12 = (int) class40.field553 & 0x3FFF;
        } else {
            var12 = (int) class40.field553 + class22.field349 & 0x3FFF;
        }
        int var13 = Math.max(arg10.field4022 / 2, arg10.field3960 / 2) + 10;
        int var14 = arg1 * arg1 + arg7 * arg7;
        if (var13 * var13 < var14) {
            return;
        }
        if (arg9 != -19498) {
            field6586 = -47;
        }
        int var15 = class377.field5316[var12];
        int var16 = class377.field5315[var12];
        if (class128.field1742 != 4) {
            var16 = var16 * 256 / (class482.field7072 + 256);
            var15 = var15 * 256 / (class482.field7072 + 256);
        }
        int var17 = arg1 * var16 + arg7 * var15 >> 15;
        int var18 = arg7 * var16 - (arg1 * var15) >> 15;
        int var19 = arg8.method372(1, null, 100, arg4);
        int var20 = arg8.method371(arg4, null, 0, 100, 0);
        int var21 = var17 - var19 / 2;
        if (-arg10.field4022 <= var21 && var21 <= arg10.field4022 && -arg10.field3960 <= var18 && var18 <= arg10.field3960) {
            arg3.method2886(arg11, arg2, (byte) 126, 0, null, 50, 1, arg0, arg10.field4022 / 2 + arg0 + var21, null, 0, 0, arg5, arg4, var19, arg10.field3960 / 2 + arg5 - (var18 - -var20) - arg6);
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IIII)V", line = 2056)
    public final void method763(int arg0, int arg1, int arg2, int arg3) {
        field6597++;
        for (int var5 = 0; var5 < this.field6566; var5++) {
            int var9 = this.field6610[var5] & 0xFFFF;
            int var10 = var9 >> 10 & 0x3F;
            int var11 = var9 >> 7 & 0x7;
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            int var12 = var9 & 0x7F;
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field6610[var5] = (short) class25.method183(var12, class25.method183(var10 << 10, var11 << 7));
        }
        if (this.field6543 != null) {
            for (int var6 = 0; var6 < this.field6537; var6++) {
                class39 var7 = this.field6543[var6];
                class349 var8 = this.field6595[var6];
                var8.field4776 = class437.field6373[this.field6610[var7.field526] & 0xFFFF] & 0xFFFFFF | var8.field4776 & 0xFF000000;
            }
        }
        if (this.field6606 != null) {
            this.field6606.field142 = null;
        }
    }

    @OriginalMember(owner = "client!or", name = "e", descriptor = "()Z", line = 2124)
    public final boolean method801() {
        field6567++;
        if (this.field6605 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field6605.length; var1++) {
            if (this.field6605[var1] != -1 && !this.field6581.field2312.method831(this.field6605[var1], 121)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!or", name = "e", descriptor = "(I)V", line = 2146)
    private final void method2668(int arg0) {
        field6533++;
        if (this.field6543 != null) {
            class53 var2 = this.field6581.field5859;
            float var3 = this.field6581.method439();
            float var4 = this.field6581.method499();
            this.field6581.method2393(23741);
            this.field6581.method469(false);
            this.field6581.method2433(false, (byte) 89);
            this.field6581.method2439(this.field6581.field6003, (byte) -120, this.field6581.field5976, null, null);
            for (int var5 = 0; var5 < this.field6537; var5++) {
                class39 var6 = this.field6543[var5];
                class349 var7 = this.field6595[var5];
                if (!var6.field527 || !this.field6581.method474()) {
                    float var8 = (float) (this.field6571[var6.field531] + this.field6571[var6.field530] + this.field6571[var6.field524]) * 0.3333333F;
                    float var9 = (float) (this.field6541[var6.field524] - (-this.field6541[var6.field530] - this.field6541[var6.field531])) * 0.3333333F;
                    float var10 = (float) (this.field6598[var6.field531] + this.field6598[var6.field524] + this.field6598[var6.field530]) * 0.3333333F;
                    float var11 = class233.field3233 * var10 + class339.field4670 * var9 + class314.field4303 * var8 + class386.field5431;
                    float var12 = class288.field3864 * var10 + class311.field4257 * var8 + class197.field2842 * var9 + class399.field5556;
                    float var13 = class43.field598 * var10 + class71.field1072 * var8 + class374.field5225 * var9 + class360.field4940;
                    var2.method337((byte) -116, (float) var7.field4777 - var12, -var13, var7.field4778, var6.field521 * var7.field4781 >> 7, (float) var7.field4780 + var11, var6.field534 * var7.field4779 >> 7);
                    this.field6581.method2440(26, var2);
                    this.field6581.method440(var4, var3 - (float) var6.field522 * 1.5F);
                    int var14 = var7.field4776;
                    OpenGL.glColor4ub((byte) (var14 >> 16), (byte) (var14 >> 8), (byte) var14, (byte) (var14 >> 24));
                    this.field6581.method2366(var6.field532, 1874);
                    this.field6581.method2356((byte) -21, var6.field535);
                    this.field6581.method2365(true, var6.field525);
                    this.field6581.method2401(7, 0, 4, (byte) 74);
                }
            }
            this.field6581.method440(var4, var3);
            this.field6581.method469(true);
            this.field6581.method2375((byte) 123);
        }
        if (arg0 > -80) {
            this.method784();
        }
    }

    @OriginalMember(owner = "client!or", name = "sa", descriptor = "()V", line = 2212)
    public final void method779() {
        for (int var1 = 0; var1 < this.field6611; var1++) {
            this.field6598[var1] = -this.field6598[var1];
        }
        field6523++;
        for (int var2 = 0; var2 < this.field6589; var2++) {
            this.field6520[var2] = (short) (-this.field6520[var2]);
        }
        for (int var3 = 0; var3 < this.field6566; var3++) {
            short var4 = this.field6562[var3];
            this.field6562[var3] = this.field6517[var3];
            this.field6517[var3] = var4;
        }
        if (this.field6521 == null && this.field6606 != null) {
            this.field6606.field142 = null;
        }
        if (this.field6521 != null) {
            this.field6521.field142 = null;
        }
        if (this.field6572 != null) {
            this.field6572.field142 = null;
        }
        if (this.field6584 != null) {
            this.field6584.field6231 = null;
        }
        this.field6546 = false;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V", line = 2261)
    private final void method2669(byte arg0) {
        field6557++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field6611; var10++) {
            int var11 = this.field6571[var10];
            int var12 = this.field6541[var10];
            if (var6 < var12) {
                var6 = var12;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var2 > var11) {
                var2 = var11;
            }
            int var13 = this.field6598[var10];
            if (var7 < var13) {
                var7 = var13;
            }
            if (var13 < var4) {
                var4 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var14 > var8) {
                var8 = var14;
            }
            int var15 = var12 * var12 + var11 * var11 + var13 * var13;
            if (var15 > var9) {
                var9 = var15;
            }
        }
        this.field6575 = (short) var4;
        this.field6513 = (short) var7;
        this.field6593 = (short) var3;
        this.field6573 = (short) var6;
        this.field6535 = (short) var5;
        this.field6613 = (short) var2;
        this.field6578 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        Math.sqrt((double) var9);
        this.field6546 = true;
        if (arg0 != 26) {
            this.field6545 = null;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(BZ)V", line = 2349)
    private final void method2670(byte arg0, boolean arg1) {
        field6514++;
        if (arg0 != 1) {
            return;
        }
        if ((this.field6512 * 6) <= class290.field3891.field5073.length) {
            class290.field3891.field5069 = 0;
        } else {
            class290.field3891 = new class251(this.field6512 * 6 + 600);
        }
        if (this.field6581.field5931) {
            for (int var3 = 0; var3 < this.field6512; var3++) {
                class290.field3891.method2070(81954016, this.field6562[var3]);
                class290.field3891.method2070(81954016, this.field6558[var3]);
                class290.field3891.method2070(81954016, this.field6517[var3]);
            }
        } else {
            for (int var4 = 0; var4 < this.field6512; var4++) {
                class290.field3891.method2115((byte) 47, this.field6562[var4]);
                class290.field3891.method2115((byte) 70, this.field6558[var4]);
                class290.field3891.method2115((byte) 18, this.field6517[var4]);
            }
        }
        if (class290.field3891.field5069 == 0) {
            return;
        }
        if (arg1) {
            if (this.field6591 == null) {
                this.field6591 = this.field6581.method2402(1, class290.field3891.field5069, class290.field3891.field5073, true, 5123);
            } else {
                this.field6591.method1911(class290.field3891.field5073, 5123, 108, class290.field3891.field5069);
            }
            this.field6584.field6231 = this.field6591;
        } else {
            this.field6584.field6231 = this.field6581.method2402(1, class290.field3891.field5069, class290.field3891.field5073, false, 5123);
        }
        if (!arg1) {
            this.field6561 = true;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ZZLor;ILor;Z)Lc;", line = 2412)
    private final class121 method2671(boolean arg0, boolean arg1, class452 arg2, int arg3, class452 arg4, boolean arg5) {
        arg2.field6592 = this.field6592;
        arg2.field6614 = 0;
        arg2.field6589 = this.field6589;
        arg2.field6512 = this.field6512;
        arg2.field6611 = this.field6611;
        arg2.field6552 = this.field6552;
        field6534++;
        arg2.field6590 = arg3;
        arg2.field6550 = this.field6550;
        arg2.field6566 = this.field6566;
        arg2.field6544 = this.field6544;
        arg2.field6537 = this.field6537;
        boolean var7 = class9.method66(-5595, arg3, this.field6592);
        boolean var8 = class249.method1470((byte) 113, arg3, this.field6592);
        boolean var9 = class230.method1345(arg3, 0, this.field6592);
        boolean var10 = var7 | var8 | var9;
        if (arg1) {
            this.method799();
        }
        if (var10) {
            if (!var7) {
                arg2.field6571 = this.field6571;
            } else if (arg4.field6571 == null || arg4.field6571.length < this.field6550) {
                arg2.field6571 = arg4.field6571 = new int[this.field6550];
            } else {
                arg2.field6571 = arg4.field6571;
            }
            if (!var8) {
                arg2.field6541 = this.field6541;
            } else if (arg4.field6541 == null || this.field6550 > arg4.field6541.length) {
                arg2.field6541 = arg4.field6541 = new int[this.field6550];
            } else {
                arg2.field6541 = arg4.field6541;
            }
            if (!var9) {
                arg2.field6598 = this.field6598;
            } else if (arg4.field6598 == null || this.field6550 > arg4.field6598.length) {
                arg2.field6598 = arg4.field6598 = new int[this.field6550];
            } else {
                arg2.field6598 = arg4.field6598;
            }
            for (int var11 = 0; var11 < this.field6550; var11++) {
                if (var7) {
                    arg2.field6571[var11] = this.field6571[var11];
                }
                if (var8) {
                    arg2.field6541[var11] = this.field6541[var11];
                }
                if (var9) {
                    arg2.field6598[var11] = this.field6598[var11];
                }
            }
        } else {
            arg2.field6598 = this.field6598;
            arg2.field6541 = this.field6541;
            arg2.field6571 = this.field6571;
        }
        if (class87.method607((byte) 108, arg3, this.field6592)) {
            if (arg5) {
                arg2.field6614 = (byte) (arg2.field6614 | 0x1);
            }
            arg2.field6572 = arg4.field6572;
            arg2.field6572.field137 = this.field6572.field137;
            arg2.field6572.field142 = this.field6572.field142;
        } else if (class1.method1(arg3, -127, this.field6592)) {
            arg2.field6572 = this.field6572;
        } else {
            arg2.field6572 = null;
        }
        if (class385.method2215(this.field6592, arg3, 540800)) {
            if (arg4.field6610 == null || this.field6566 > arg4.field6610.length) {
                arg2.field6610 = arg4.field6610 = new short[this.field6566];
            } else {
                arg2.field6610 = arg4.field6610;
            }
            for (int var12 = 0; var12 < this.field6566; var12++) {
                arg2.field6610[var12] = this.field6610[var12];
            }
        } else {
            arg2.field6610 = this.field6610;
        }
        if (class329.method1832(1000, arg3, this.field6592)) {
            if (arg4.field6580 == null || arg4.field6580.length < this.field6566) {
                arg2.field6580 = arg4.field6580 = new byte[this.field6566];
            } else {
                arg2.field6580 = arg4.field6580;
            }
            for (int var13 = 0; var13 < this.field6566; var13++) {
                arg2.field6580[var13] = this.field6580[var13];
            }
        } else {
            arg2.field6580 = this.field6580;
        }
        if (class213.method1280(arg3, this.field6592, arg1)) {
            if (arg5) {
                arg2.field6614 = (byte) (arg2.field6614 | 0x2);
            }
            arg2.field6606 = arg4.field6606;
            arg2.field6606.field142 = this.field6606.field142;
            arg2.field6606.field137 = this.field6606.field137;
        } else if (class180.method1095(arg3, (byte) -108, this.field6592)) {
            arg2.field6606 = this.field6606;
        } else {
            arg2.field6606 = null;
        }
        if (class435.method2594(arg3, -93, this.field6592)) {
            if (arg4.field6536 == null || arg4.field6536.length < this.field6589) {
                int var14 = this.field6589;
                arg2.field6527 = arg4.field6527 = new short[var14];
                arg2.field6536 = arg4.field6536 = new short[var14];
                arg2.field6520 = arg4.field6520 = new short[var14];
            } else {
                arg2.field6527 = arg4.field6527;
                arg2.field6520 = arg4.field6520;
                arg2.field6536 = arg4.field6536;
            }
            if (this.field6587 == null) {
                for (int var18 = 0; var18 < this.field6589; var18++) {
                    arg2.field6536[var18] = this.field6536[var18];
                    arg2.field6527[var18] = this.field6527[var18];
                    arg2.field6520[var18] = this.field6520[var18];
                }
            } else {
                if (arg4.field6587 == null) {
                    arg4.field6587 = new class17();
                }
                class17 var15 = arg2.field6587 = arg4.field6587;
                if (var15.field182 == null || var15.field182.length < this.field6589) {
                    int var16 = this.field6589;
                    var15.field185 = new short[var16];
                    var15.field176 = new byte[var16];
                    var15.field177 = new short[var16];
                    var15.field182 = new short[var16];
                }
                for (int var17 = 0; var17 < this.field6589; var17++) {
                    arg2.field6536[var17] = this.field6536[var17];
                    arg2.field6527[var17] = this.field6527[var17];
                    arg2.field6520[var17] = this.field6520[var17];
                    var15.field182[var17] = this.field6587.field182[var17];
                    var15.field177[var17] = this.field6587.field177[var17];
                    var15.field185[var17] = this.field6587.field185[var17];
                    var15.field176[var17] = this.field6587.field176[var17];
                }
            }
            arg2.field6612 = this.field6612;
        } else {
            arg2.field6612 = this.field6612;
            arg2.field6527 = this.field6527;
            arg2.field6536 = this.field6536;
            arg2.field6587 = this.field6587;
            arg2.field6520 = this.field6520;
        }
        if (class174.method1074(8192, arg3, this.field6592)) {
            arg2.field6521 = arg4.field6521;
            if (arg5) {
                arg2.field6614 = (byte) (arg2.field6614 | 0x4);
            }
            arg2.field6521.field142 = this.field6521.field142;
            arg2.field6521.field137 = this.field6521.field137;
        } else if (class200.method1234(106, this.field6592, arg3)) {
            arg2.field6521 = this.field6521;
        } else {
            arg2.field6521 = null;
        }
        if (class203.method1240(arg3, this.field6592, 7041)) {
            if (arg4.field6549 == null || arg4.field6549.length < this.field6566) {
                int var19 = this.field6589;
                arg2.field6585 = arg4.field6585 = new float[var19];
                arg2.field6549 = arg4.field6549 = new float[var19];
            } else {
                arg2.field6585 = arg4.field6585;
                arg2.field6549 = arg4.field6549;
            }
            for (int var20 = 0; var20 < this.field6589; var20++) {
                arg2.field6549[var20] = this.field6549[var20];
                arg2.field6585[var20] = this.field6585[var20];
            }
        } else {
            arg2.field6549 = this.field6549;
            arg2.field6585 = this.field6585;
        }
        if (class168.method1042(arg3, this.field6592, false)) {
            arg2.field6518 = arg4.field6518;
            if (arg5) {
                arg2.field6614 = (byte) (arg2.field6614 | 0x8);
            }
            arg2.field6518.field137 = this.field6518.field137;
            arg2.field6518.field142 = this.field6518.field142;
        } else if (class402.method2330(arg3, this.field6592, -116)) {
            arg2.field6518 = this.field6518;
        } else {
            arg2.field6518 = null;
        }
        if (class425.method2539(this.field6592, arg3, -30001)) {
            if (arg4.field6562 == null || this.field6566 > arg4.field6562.length) {
                int var21 = this.field6566;
                arg2.field6517 = arg4.field6517 = new short[var21];
                arg2.field6558 = arg4.field6558 = new short[var21];
                arg2.field6562 = arg4.field6562 = new short[var21];
            } else {
                arg2.field6562 = arg4.field6562;
                arg2.field6558 = arg4.field6558;
                arg2.field6517 = arg4.field6517;
            }
            for (int var22 = 0; var22 < this.field6566; var22++) {
                arg2.field6562[var22] = this.field6562[var22];
                arg2.field6558[var22] = this.field6558[var22];
                arg2.field6517[var22] = this.field6517[var22];
            }
        } else {
            arg2.field6517 = this.field6517;
            arg2.field6558 = this.field6558;
            arg2.field6562 = this.field6562;
        }
        if (class203.method1239(arg3, this.field6592, 122)) {
            if (arg5) {
                arg2.field6614 = (byte) (arg2.field6614 | 0x10);
            }
            arg2.field6584 = arg4.field6584;
            arg2.field6584.field6231 = this.field6584.field6231;
        } else if (class186.method1117(2048, arg3, this.field6592)) {
            arg2.field6584 = this.field6584;
        } else {
            arg2.field6584 = null;
        }
        if (class52.method323(106, arg3, this.field6592)) {
            if (arg4.field6605 == null || arg4.field6605.length < this.field6566) {
                int var23 = this.field6566;
                arg2.field6605 = arg4.field6605 = new short[var23];
            } else {
                arg2.field6605 = arg4.field6605;
            }
            for (int var24 = 0; var24 < this.field6566; var24++) {
                arg2.field6605[var24] = this.field6605[var24];
            }
        } else {
            arg2.field6605 = this.field6605;
        }
        if (!class436.method2600(this.field6592, (byte) -127, arg3)) {
            arg2.field6595 = this.field6595;
        } else if (arg4.field6595 == null || this.field6537 > arg4.field6595.length) {
            int var26 = this.field6537;
            arg2.field6595 = arg4.field6595 = new class349[var26];
            for (int var27 = 0; var27 < this.field6537; var27++) {
                arg2.field6595[var27] = this.field6595[var27].method1934(!arg1);
            }
        } else {
            arg2.field6595 = arg4.field6595;
            for (int var25 = 0; var25 < this.field6537; var25++) {
                arg2.field6595[var25].method1936(this.field6595[var25], 74);
            }
        }
        if (this.field6546) {
            arg2.field6573 = this.field6573;
            arg2.field6546 = true;
            arg2.field6575 = this.field6575;
            arg2.field6513 = this.field6513;
            arg2.field6613 = this.field6613;
            arg2.field6593 = this.field6593;
            arg2.field6578 = this.field6578;
            arg2.field6535 = this.field6535;
        } else {
            arg2.field6546 = false;
        }
        arg2.field6596 = this.field6596;
        arg2.field6540 = this.field6540;
        arg2.field6568 = this.field6568;
        arg2.field6519 = this.field6519;
        arg2.field6545 = this.field6545;
        arg2.field6509 = this.field6509;
        arg2.field6543 = this.field6543;
        arg2.field6582 = this.field6582;
        arg2.field6569 = this.field6569;
        arg2.field6555 = this.field6555;
        arg2.field6526 = this.field6526;
        return arg2;
    }

    @OriginalMember(owner = "client!or", name = "VA", descriptor = "()I", line = 2877)
    public final int method783() {
        if (!this.field6546) {
            this.method2669((byte) 26);
        }
        field6516++;
        return this.field6535;
    }

    @OriginalMember(owner = "client!or", name = "fa", descriptor = "()I", line = 2891)
    public final int method762() {
        field6594++;
        return this.field6544;
    }

    @OriginalMember(owner = "client!or", name = "va", descriptor = "(I[IIIIZI[I)V", line = 2901)
    public final void method767(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field6542++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg4 << 4;
            int var11 = arg2 << 4;
            int var12 = arg3 << 4;
            class319.field4410 = 0;
            class193.field2754 = 0;
            int var13 = 0;
            class354.field4826 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field6555.length) {
                    int[] var16 = this.field6555[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field6582 == null || (arg6 & this.field6582[var18]) != 0) {
                            class193.field2754 += this.field6571[var18];
                            class319.field4410 += this.field6541[var18];
                            class354.field4826 += this.field6598[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 <= 0) {
                class354.field4826 = var10;
                class319.field4410 = var12;
                class193.field2754 = var11;
            } else {
                class342.field4716 = true;
                class354.field4826 = class354.field4826 / var13 + var10;
                class319.field4410 = class319.field4410 / var13 + var12;
                class193.field2754 = class193.field2754 / var13 + var11;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[0] * arg2 + (arg7[1] * arg3 - -16384) >> 15;
                int var20 = arg7[3] * arg2 - (-(arg7[4] * arg3) - (arg7[5] * arg4 + 16384)) >> 15;
                int var21 = arg7[8] * arg4 + arg7[6] * arg2 + arg7[7] * arg3 + 16384 >> 15;
                arg4 = var21;
                arg3 = var20;
                arg2 = var19;
            }
            int var22 = arg2 << 4;
            int var23 = arg4 << 4;
            int var24 = arg3 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (this.field6555.length > var26) {
                    int[] var27 = this.field6555[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field6582 == null || (this.field6582[var29] & arg6) != 0) {
                            this.field6571[var29] += var22;
                            this.field6541[var29] += var24;
                            this.field6598[var29] += var23;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var109 = arg1[var90];
                    if (var109 < this.field6555.length) {
                        int[] var110 = this.field6555[var109];
                        for (int var111 = 0; var111 < var110.length; var111++) {
                            int var112 = var110[var111];
                            if (this.field6582 == null || (arg6 & this.field6582[var112]) != 0) {
                                this.field6571[var112] -= class193.field2754;
                                this.field6541[var112] -= class319.field4410;
                                this.field6598[var112] -= class354.field4826;
                                if (arg4 != 0) {
                                    int var113 = class377.field5316[arg4];
                                    int var114 = class377.field5315[arg4];
                                    int var115 = this.field6541[var112] * var113 + this.field6571[var112] * var114 + 32767 >> 15;
                                    this.field6541[var112] = this.field6541[var112] * var114 + 32767 - (this.field6571[var112] * var113) >> 15;
                                    this.field6571[var112] = var115;
                                }
                                if (arg2 != 0) {
                                    int var116 = class377.field5316[arg2];
                                    int var117 = class377.field5315[arg2];
                                    int var118 = this.field6541[var112] * var117 - (this.field6598[var112] * var116 - 32767) >> 15;
                                    this.field6598[var112] = this.field6598[var112] * var117 + this.field6541[var112] * var116 + 32767 >> 15;
                                    this.field6541[var112] = var118;
                                }
                                if (arg3 != 0) {
                                    int var119 = class377.field5316[arg3];
                                    int var120 = class377.field5315[arg3];
                                    int var121 = this.field6598[var112] * var119 + (this.field6571[var112] * var120) + 32767 >> 15;
                                    this.field6598[var112] = this.field6598[var112] * var120 + 32767 - this.field6571[var112] * var119 >> 15;
                                    this.field6571[var112] = var121;
                                }
                                this.field6571[var112] += class193.field2754;
                                this.field6541[var112] += class319.field4410;
                                this.field6598[var112] += class354.field4826;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var91 = 0; var91 < var9; var91++) {
                        int var92 = arg1[var91];
                        if (var92 < this.field6555.length) {
                            int[] var93 = this.field6555[var92];
                            for (int var94 = 0; var94 < var93.length; var94++) {
                                int var95 = var93[var94];
                                if (this.field6582 == null || (arg6 & this.field6582[var95]) != 0) {
                                    int var96 = this.field6509[var95];
                                    int var97 = this.field6509[var95 + 1];
                                    for (int var98 = var96; var98 < var97; var98++) {
                                        int var99 = this.field6569[var98] - 1;
                                        if (var99 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var100 = class377.field5316[arg4];
                                            int var101 = class377.field5315[arg4];
                                            int var102 = this.field6527[var99] * var100 - (-(this.field6536[var99] * var101) - 32767) >> 15;
                                            this.field6527[var99] = (short) (this.field6527[var99] * var101 + 32767 - (this.field6536[var99] * var100) >> 15);
                                            this.field6536[var99] = (short) var102;
                                        }
                                        if (arg2 != 0) {
                                            int var103 = class377.field5316[arg2];
                                            int var104 = class377.field5315[arg2];
                                            int var105 = this.field6527[var99] * var104 + 32767 - (this.field6520[var99] * var103) >> 15;
                                            this.field6520[var99] = (short) (this.field6527[var99] * var103 + this.field6520[var99] * var104 + 32767 >> 15);
                                            this.field6527[var99] = (short) var105;
                                        }
                                        if (arg3 != 0) {
                                            int var106 = class377.field5316[arg3];
                                            int var107 = class377.field5315[arg3];
                                            int var108 = this.field6536[var99] * var107 + (this.field6520[var99] * var106 + 32767) >> 15;
                                            this.field6520[var99] = (short) (this.field6520[var99] * var107 + 32767 - (this.field6536[var99] * var106) >> 15);
                                            this.field6536[var99] = (short) var108;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field6521 == null && this.field6606 != null) {
                        this.field6606.field142 = null;
                    }
                    if (this.field6521 != null) {
                        this.field6521.field142 = null;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (class342.field4716) {
                    int var36 = arg7[6] * class354.field4826 + arg7[3] * class319.field4410 + arg7[0] * class193.field2754 + 16384 >> 15;
                    int var37 = arg7[7] * class354.field4826 + arg7[4] * class319.field4410 + arg7[1] * class193.field2754 + 16384 >> 15;
                    int var38 = var34 + var37;
                    int var39 = arg7[8] * class354.field4826 + arg7[5] * class319.field4410 + arg7[2] * class193.field2754 + 16384 >> 15;
                    int var40 = var33 + var36;
                    int var41 = var35 + var39;
                    class319.field4410 = var38;
                    class193.field2754 = var40;
                    class354.field4826 = var41;
                    class342.field4716 = false;
                }
                int[] var42 = new int[9];
                int var43 = class377.field5315[arg2];
                int var44 = class377.field5316[arg2];
                int var45 = class377.field5315[arg3];
                int var46 = class377.field5316[arg3];
                int var47 = class377.field5315[arg4];
                int var48 = class377.field5316[arg4];
                int var49 = var44 * var47 + 16384 >> 15;
                int var50 = var44 * var48 + 16384 >> 15;
                var42[4] = var43 * var47 + 16384 >> 15;
                var42[1] = -var45 * var48 + (var46 * var49) + 16384 >> 15;
                var42[5] = -var44;
                var42[2] = var43 * var46 + 16384 >> 15;
                var42[0] = var46 * var50 + (var45 * var47 + 16384) >> 15;
                var42[3] = var43 * var48 + 16384 >> 15;
                var42[8] = var43 * var45 + 16384 >> 15;
                var42[7] = var45 * var49 + var46 * var48 + 16384 >> 15;
                var42[6] = -var46 * var47 + (var45 * var50) + 16384 >> 15;
                int var51 = var42[0] * -class193.field2754 + (var42[1] * -class319.field4410 + (var42[2] * -class354.field4826)) + 16384 >> 15;
                int var52 = var42[3] * -class193.field2754 + var42[4] * -class319.field4410 + (var42[5] * -class354.field4826) + 16384 >> 15;
                int var53 = var42[7] * -class319.field4410 + var42[8] * -class354.field4826 + var42[6] * -class193.field2754 + 16384 >> 15;
                int var54 = var51 + class193.field2754;
                int var55 = class319.field4410 + var52;
                int var56 = class354.field4826 + var53;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var87 = 0; var87 < 3; var87++) {
                        int var88 = 0;
                        for (int var89 = 0; var89 < 3; var89++) {
                            var88 += var42[var58 * 3 + var89] * arg7[var87 * 3 + var89];
                        }
                        var57[var58 * 3 + var87] = var88 + 16384 >> 15;
                    }
                }
                int var59 = var42[2] * var35 + var42[0] * var33 - (-(var42[1] * var34) + -16384) >> 15;
                int var60 = var42[5] * var35 + var42[4] * var34 + var42[3] * var33 + 16384 >> 15;
                int var61 = var42[8] * var35 + var42[7] * var34 + var42[6] * var33 + 16384 >> 15;
                int var62 = var55 + var60;
                int var63 = var54 + var59;
                int var64 = var56 + var61;
                int[] var65 = new int[9];
                for (int var66 = 0; var66 < 3; var66++) {
                    for (int var84 = 0; var84 < 3; var84++) {
                        int var85 = 0;
                        for (int var86 = 0; var86 < 3; var86++) {
                            var85 += arg7[var66 * 3 + var86] * var57[var86 * 3 + var84];
                        }
                        var65[var66 * 3 + var84] = var85 + 16384 >> 15;
                    }
                }
                int var67 = arg7[2] * var64 + arg7[0] * var63 + arg7[1] * var62 + 16384 >> 15;
                int var68 = arg7[3] * var63 + arg7[4] * var62 + arg7[5] * var64 + 16384 >> 15;
                int var69 = var31 + var68;
                int var70 = var30 + var67;
                int var71 = arg7[8] * var64 + arg7[7] * var62 + arg7[6] * var63 + 16384 >> 15;
                int var72 = var32 + var71;
                for (int var73 = 0; var73 < var9; var73++) {
                    int var74 = arg1[var73];
                    if (this.field6555.length > var74) {
                        int[] var75 = this.field6555[var74];
                        for (int var76 = 0; var76 < var75.length; var76++) {
                            int var77 = var75[var76];
                            if (this.field6582 == null || (arg6 & this.field6582[var77]) != 0) {
                                int var78 = this.field6598[var77] * var65[2] + this.field6571[var77] * var65[0] + this.field6541[var77] * var65[1] + 16384 >> 15;
                                int var79 = this.field6571[var77] * var65[3] - (-(this.field6598[var77] * var65[5]) - (this.field6541[var77] * var65[4]) - 16384) >> 15;
                                int var80 = var70 + var78;
                                int var81 = this.field6541[var77] * var65[7] + this.field6598[var77] * var65[8] + this.field6571[var77] * var65[6] + 16384 >> 15;
                                int var82 = var69 + var79;
                                this.field6571[var77] = var80;
                                int var83 = var72 + var81;
                                this.field6541[var77] = var82;
                                this.field6598[var77] = var83;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field6555.length) {
                        int[] var174 = this.field6555[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field6582 == null || (this.field6582[var176] & arg6) != 0) {
                                this.field6571[var176] -= class193.field2754;
                                this.field6541[var176] -= class319.field4410;
                                this.field6598[var176] -= class354.field4826;
                                this.field6571[var176] = this.field6571[var176] * arg2 >> 7;
                                this.field6541[var176] = this.field6541[var176] * arg3 >> 7;
                                this.field6598[var176] = this.field6598[var176] * arg4 >> 7;
                                this.field6571[var176] += class193.field2754;
                                this.field6541[var176] += class319.field4410;
                                this.field6598[var176] += class354.field4826;
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
                if (class342.field4716) {
                    int var128 = arg7[6] * class354.field4826 + arg7[0] * class193.field2754 + arg7[3] * class319.field4410 + 16384 >> 15;
                    int var129 = arg7[7] * class354.field4826 + arg7[1] * class193.field2754 + arg7[4] * class319.field4410 + 16384 >> 15;
                    int var130 = arg7[5] * class319.field4410 + (arg7[2] * class193.field2754 - (-(arg7[8] * class354.field4826) - 16384)) >> 15;
                    int var131 = var126 + var129;
                    int var132 = var125 + var128;
                    class193.field2754 = var132;
                    int var133 = var127 + var130;
                    class319.field4410 = var131;
                    class342.field4716 = false;
                    class354.field4826 = var133;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -class193.field2754 * var134 + 16384 >> 15;
                int var138 = -class319.field4410 * var135 + 16384 >> 15;
                int var139 = -class354.field4826 * var136 + 16384 >> 15;
                int var140 = class193.field2754 + var137;
                int var141 = class319.field4410 + var138;
                int var142 = class354.field4826 + var139;
                int[] var143 = new int[] { arg7[0] * var134 + 16384 >> 15, arg7[3] * var134 + 16384 >> 15, arg7[6] * var134 + 16384 >> 15, arg7[1] * var135 + 16384 >> 15, arg7[4] * var135 + 16384 >> 15, arg7[7] * var135 + 16384 >> 15, arg7[2] * var136 + 16384 >> 15, arg7[5] * var136 + 16384 >> 15, arg7[8] * var136 + 16384 >> 15 };
                int var144 = var125 * var134 + 16384 >> 15;
                int var145 = var126 * var135 + 16384 >> 15;
                int var146 = var140 + var144;
                int var147 = var127 * var136 + 16384 >> 15;
                int var148 = var141 + var145;
                int var149 = var142 + var147;
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
                int var152 = arg7[2] * var149 + (arg7[0] * var146 + (arg7[1] * var148)) + 16384 >> 15;
                int var153 = arg7[3] * var146 + (arg7[4] * var148 + (arg7[5] * var149) + 16384) >> 15;
                int var154 = var123 + var153;
                int var155 = arg7[6] * var146 + arg7[8] * var149 + arg7[7] * var148 + 16384 >> 15;
                int var156 = var122 + var152;
                int var157 = var124 + var155;
                for (int var158 = 0; var158 < var9; var158++) {
                    int var159 = arg1[var158];
                    if (var159 < this.field6555.length) {
                        int[] var160 = this.field6555[var159];
                        for (int var161 = 0; var161 < var160.length; var161++) {
                            int var162 = var160[var161];
                            if (this.field6582 == null || (arg6 & this.field6582[var162]) != 0) {
                                int var163 = this.field6541[var162] * var150[1] + this.field6598[var162] * var150[2] + this.field6571[var162] * var150[0] + 16384 >> 15;
                                int var164 = this.field6598[var162] * var150[5] + this.field6571[var162] * var150[3] + this.field6541[var162] * var150[4] + 16384 >> 15;
                                int var165 = this.field6571[var162] * var150[6] + (this.field6541[var162] * var150[7]) + this.field6598[var162] * var150[8] + 16384 >> 15;
                                int var166 = var154 + var164;
                                int var167 = var156 + var163;
                                this.field6571[var162] = var167;
                                int var168 = var157 + var165;
                                this.field6541[var162] = var166;
                                this.field6598[var162] = var168;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field6526 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (this.field6526.length > var181) {
                        int[] var182 = this.field6526[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field6540 == null || (this.field6540[var184] & arg6) != 0) {
                                int var185 = (this.field6580[var184] & 0xFF) + (arg2 * 8);
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field6580[var184] = (byte) var185;
                                if (this.field6606 != null) {
                                    this.field6606.field142 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field6543 != null) {
                    for (int var178 = 0; var178 < this.field6537; var178++) {
                        class39 var179 = this.field6543[var178];
                        class349 var180 = this.field6595[var178];
                        var180.field4776 = 255 - (this.field6580[var179.field526] & 0xFF) << 24 | var180.field4776 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field6526 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (var190 < this.field6526.length) {
                        int[] var191 = this.field6526[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field6540 == null || (this.field6540[var193] & arg6) != 0) {
                                int var194 = this.field6610[var193] & 0xFFFF;
                                int var195 = var194 >> 10 & 0x3F;
                                int var196 = var194 >> 7 & 0x7;
                                int var197 = var194 & 0x7F;
                                int var198 = arg3 / 4 + var196;
                                int var199 = arg2 + var195 & 0x3F;
                                if (var198 < 0) {
                                    var198 = 0;
                                } else if (var198 > 7) {
                                    var198 = 7;
                                }
                                int var200 = arg4 + var197;
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field6610[var193] = (short) class25.method183(class25.method183(var198 << 7, var199 << 10), var200);
                                if (this.field6606 != null) {
                                    this.field6606.field142 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field6543 != null) {
                    for (int var187 = 0; var187 < this.field6537; var187++) {
                        class39 var188 = this.field6543[var187];
                        class349 var189 = this.field6595[var187];
                        var189.field4776 = class437.field6373[this.field6610[var188.field526] & 0xFFFF] & 0xFFFFFF | var189.field4776 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field6519 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (var202 < this.field6519.length) {
                        int[] var203 = this.field6519[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class349 var205 = this.field6595[var203[var204]];
                            var205.field4777 += arg3;
                            var205.field4780 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field6519 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (this.field6519.length > var207) {
                        int[] var208 = this.field6519[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class349 var210 = this.field6595[var208[var209]];
                            var210.field4781 = var210.field4781 * arg3 >> 7;
                            var210.field4779 = var210.field4779 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field6519 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (var212 < this.field6519.length) {
                    int[] var213 = this.field6519[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class349 var215 = this.field6595[var213[var214]];
                        var215.field4778 = var215.field4778 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!or", name = "o", descriptor = "(I)V", line = 3884)
    public final void method805(int arg0) {
        field6525++;
        int var2 = class377.field5316[arg0];
        int var3 = class377.field5315[arg0];
        for (int var4 = 0; var4 < this.field6611; var4++) {
            int var5 = this.field6571[var4] * var3 + this.field6541[var4] * var2 >> 15;
            this.field6541[var4] = this.field6541[var4] * var3 - (this.field6571[var4] * var2) >> 15;
            this.field6571[var4] = var5;
        }
        this.field6546 = false;
        if (this.field6572 != null) {
            this.field6572.field142 = null;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lc;IIIZ)V", line = 3914)
    public final void method800(class121 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field6608++;
        class452 var6 = (class452) arg0;
        if (this.field6566 == 0 || var6.field6566 == 0) {
            return;
        }
        int var7 = var6.field6611;
        int[] var8 = var6.field6571;
        int[] var9 = var6.field6541;
        int[] var10 = var6.field6598;
        short[] var11 = var6.field6536;
        short[] var12 = var6.field6527;
        short[] var13 = var6.field6520;
        byte[] var14 = var6.field6612;
        short[] var15;
        short[] var16;
        byte[] var17;
        short[] var18;
        if (this.field6587 == null) {
            var15 = null;
            var16 = null;
            var18 = null;
            var17 = null;
        } else {
            var15 = this.field6587.field177;
            var16 = this.field6587.field182;
            var17 = this.field6587.field176;
            var18 = this.field6587.field185;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        byte[] var22;
        if (var6.field6587 == null) {
            var21 = null;
            var19 = null;
            var20 = null;
            var22 = null;
        } else {
            var19 = var6.field6587.field182;
            var20 = var6.field6587.field177;
            var21 = var6.field6587.field185;
            var22 = var6.field6587.field176;
        }
        int[] var23 = var6.field6509;
        short[] var24 = var6.field6569;
        if (!var6.field6546) {
            var6.method2669((byte) 26);
        }
        short var25 = var6.field6593;
        short var26 = var6.field6573;
        short var27 = var6.field6613;
        short var28 = var6.field6535;
        short var29 = var6.field6575;
        short var30 = var6.field6513;
        for (int var31 = 0; var31 < this.field6611; var31++) {
            int var32 = this.field6541[var31] - arg2;
            if (var25 <= var32 && var32 <= var26) {
                int var33 = this.field6571[var31] - arg1;
                if (var33 >= var27 && var28 >= var33) {
                    int var34 = this.field6598[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field6509[var31];
                        int var37 = this.field6509[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field6569[var38] - 1;
                            if (var35 == -1 || this.field6612[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = -1;
                                    int var41 = var23[var39];
                                    int var42 = var23[var39 + 1];
                                    for (int var43 = var41; var43 < var42; var43++) {
                                        var40 = var24[var43] - 1;
                                        if (var40 == -1 || var14[var40] != 0) {
                                            break;
                                        }
                                    }
                                    if (var40 != -1) {
                                        if (var16 == null) {
                                            this.field6587 = new class17();
                                            var16 = this.field6587.field182 = class428.method2565(this.field6536, 13139);
                                            var15 = this.field6587.field177 = class428.method2565(this.field6527, 13139);
                                            var18 = this.field6587.field185 = class428.method2565(this.field6520, 13139);
                                            var17 = this.field6587.field176 = class49.method311(this.field6612, (byte) 56);
                                        }
                                        if (var19 == null) {
                                            class17 var44 = var6.field6587 = new class17();
                                            var19 = var44.field182 = class428.method2565(var11, 13139);
                                            var20 = var44.field177 = class428.method2565(var12, 13139);
                                            var21 = var44.field185 = class428.method2565(var13, 13139);
                                            var22 = var44.field176 = class49.method311(var14, (byte) 85);
                                        }
                                        short var45 = this.field6536[var35];
                                        short var46 = this.field6527[var35];
                                        short var47 = this.field6520[var35];
                                        int var48 = var23[var39 + 1];
                                        int var49 = var23[var39];
                                        byte var50 = this.field6612[var35];
                                        for (int var51 = var49; var51 < var48; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var22[var52] != 0) {
                                                var19[var52] += var45;
                                                var20[var52] += var46;
                                                var21[var52] += var47;
                                                var22[var52] += var50;
                                            }
                                        }
                                        short var53 = var11[var40];
                                        byte var54 = var14[var40];
                                        short var55 = var13[var40];
                                        int var56 = this.field6509[var31];
                                        int var57 = this.field6509[var31 + 1];
                                        short var58 = var12[var40];
                                        for (int var59 = var56; var59 < var57; var59++) {
                                            int var60 = this.field6569[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var17[var60] != 0) {
                                                var16[var60] += var53;
                                                var15[var60] += var58;
                                                var18[var60] += var55;
                                                var17[var60] += var54;
                                            }
                                        }
                                        if (this.field6521 == null && this.field6606 != null) {
                                            this.field6606.field142 = null;
                                        }
                                        if (this.field6521 != null) {
                                            this.field6521.field142 = null;
                                        }
                                        if (var6.field6521 == null && var6.field6606 != null) {
                                            var6.field6606.field142 = null;
                                        }
                                        if (var6.field6521 != null) {
                                            var6.field6521.field142 = null;
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

    @OriginalMember(owner = "client!or", name = "k", descriptor = "(I)V", line = 4180)
    public final void method798(int arg0) {
        field6531++;
        int var2 = class377.field5316[arg0];
        int var3 = class377.field5315[arg0];
        for (int var4 = 0; var4 < this.field6611; var4++) {
            int var5 = this.field6598[var4] * var2 + this.field6571[var4] * var3 >> 15;
            this.field6598[var4] = this.field6598[var4] * var3 - (this.field6571[var4] * var2) >> 15;
            this.field6571[var4] = var5;
        }
        this.field6546 = false;
        if (this.field6572 != null) {
            this.field6572.field142 = null;
        }
    }

    @OriginalMember(owner = "client!or", name = "E", descriptor = "()I", line = 4210)
    public final int method806() {
        if (!this.field6546) {
            this.method2669((byte) 26);
        }
        field6551++;
        return this.field6573;
    }

    @OriginalMember(owner = "client!or", name = "u", descriptor = "(I)V", line = 4222)
    public final void method787(int arg0) {
        this.field6590 = arg0;
        field6615++;
        if (this.field6587 != null && (this.field6590 & 0x10000) == 0) {
            this.field6527 = this.field6587.field177;
            this.field6520 = this.field6587.field185;
            this.field6612 = this.field6587.field176;
            this.field6536 = this.field6587.field182;
            this.field6587 = null;
        }
        this.field6561 = true;
        this.method2662(716);
    }

    @OriginalMember(owner = "client!or", name = "la", descriptor = "()I", line = 4253)
    public final int method778() {
        field6603++;
        if (!this.field6546) {
            this.method2669((byte) 26);
        }
        return this.field6613;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lia;Lnh;II)V", line = 4265)
    public final void method764(class415 arg0, class525 arg1, int arg2, int arg3) {
        field6574++;
        if (this.field6589 == 0) {
            return;
        }
        class53 var5 = this.field6581.field5917;
        class53 var6 = (class53) arg0;
        if (!this.field6546) {
            this.method2669((byte) 26);
        }
        class374.field5225 = var5.field730 * var6.field721 + var5.field727 * var6.field738 + var5.field721 * var6.field732;
        class360.field4940 = var5.field730 * var6.field723 + var5.field727 * var6.field707 + var5.field721 * var6.field718 + var5.field723;
        float var7 = (float) this.field6593 * class374.field5225 + class360.field4940;
        float var8 = (float) this.field6573 * class374.field5225 + class360.field4940;
        float var9;
        float var10;
        if (var7 > var8) {
            var9 = var8 - (float) this.field6578;
            var10 = (float) this.field6578 + var7;
        } else {
            var9 = var7 - (float) this.field6578;
            var10 = (float) this.field6578 + var8;
        }
        if ((this.field6581.field5922 <= var9) || ((float) this.field6581.field5909 >= var10)) {
            return;
        }
        class386.field5431 = var5.field729 * var6.field723 + var5.field738 * var6.field718 + var5.field709 * var6.field707 + var5.field707;
        class339.field4670 = var5.field729 * var6.field721 + var5.field738 * var6.field732 + var5.field709 * var6.field738;
        float var11 = (float) this.field6593 * class339.field4670 + class386.field5431;
        float var12 = (float) this.field6573 * class339.field4670 + class386.field5431;
        float var13;
        float var14;
        if (var11 > var12) {
            var13 = ((float) (-this.field6578) + var12) * (float) this.field6581.field5899;
            var14 = ((float) this.field6578 + var11) * (float) this.field6581.field5899;
        } else {
            var14 = ((float) this.field6578 + var12) * (float) this.field6581.field5899;
            var13 = (var11 - (float) this.field6578) * (float) this.field6581.field5899;
        }
        if ((var13 / (float) arg2 >= this.field6581.field5915) || (var14 / (float) arg2 <= this.field6581.field5894)) {
            return;
        }
        class197.field2842 = var5.field735 * var6.field721 + var5.field732 * var6.field732 + var5.field731 * var6.field738;
        class399.field5556 = var5.field735 * var6.field723 + var5.field732 * var6.field718 + var5.field731 * var6.field707 + var5.field718;
        float var15 = (float) this.field6593 * class197.field2842 + class399.field5556;
        float var16 = (float) this.field6573 * class197.field2842 + class399.field5556;
        float var17;
        float var18;
        if (var16 < var15) {
            var17 = ((float) this.field6578 + var15) * (float) this.field6581.field5913;
            var18 = ((float) (-this.field6578) + var16) * (float) this.field6581.field5913;
        } else {
            var17 = ((float) this.field6578 + var16) * (float) this.field6581.field5913;
            var18 = (var15 - (float) this.field6578) * (float) this.field6581.field5913;
        }
        if ((this.field6581.field5895 <= var18 / (float) arg2) || (var17 / (float) arg2 <= this.field6581.field5980)) {
            return;
        }
        if (arg1 != null || this.field6543 != null) {
            class233.field3233 = var5.field729 * var6.field730 + var5.field738 * var6.field735 + var5.field709 * var6.field729;
            class43.field598 = var5.field730 * var6.field730 + var5.field727 * var6.field729 + var5.field721 * var6.field735;
            class288.field3864 = var5.field735 * var6.field730 + var5.field732 * var6.field735 + var5.field731 * var6.field729;
            class314.field4303 = var5.field729 * var6.field727 + var5.field738 * var6.field731 + var5.field709 * var6.field709;
            class311.field4257 = var5.field735 * var6.field727 + var5.field732 * var6.field731 + var5.field731 * var6.field709;
            class71.field1072 = var5.field730 * var6.field727 + var5.field727 * var6.field709 + var5.field721 * var6.field731;
        }
        if (arg1 != null) {
            int var19 = this.field6613 + this.field6535 >> 1;
            int var20 = this.field6575 + this.field6513 >> 1;
            int var21 = (int) ((float) var20 * class233.field3233 + (float) this.field6593 * class339.field4670 + (float) var19 * class314.field4303 + class386.field5431);
            int var22 = (int) ((float) var20 * class288.field3864 + (float) this.field6593 * class197.field2842 + (float) var19 * class311.field4257 + class399.field5556);
            int var23 = (int) ((float) var20 * class43.field598 + (float) this.field6593 * class374.field5225 + (float) var19 * class71.field1072 + class360.field4940);
            int var24 = (int) ((float) var20 * class233.field3233 + (float) this.field6573 * class339.field4670 + (float) var19 * class314.field4303 + class386.field5431);
            int var25 = (int) ((float) var20 * class288.field3864 + (float) this.field6573 * class197.field2842 + (float) var19 * class311.field4257 + class399.field5556);
            arg1.field7713 = this.field6581.field5899 * var21 / arg2 + this.field6581.field5981;
            int var26 = (int) ((float) var20 * class43.field598 + (float) this.field6573 * class374.field5225 + (float) var19 * class71.field1072 + class360.field4940);
            arg1.field7711 = this.field6581.field5899 * var24 / arg2 + this.field6581.field5981;
            arg1.field7716 = this.field6581.field5984 + (this.field6581.field5913 * var22 / arg2);
            arg1.field7714 = this.field6581.field5913 * var25 / arg2 + this.field6581.field5984;
            if (this.field6581.field5909 > var23 && var26 < this.field6581.field5909) {
                arg1.field7712 = true;
                arg1.field7715 = this.field6581.field5981 - (arg1.field7713 - ((this.field6578 + var21) * this.field6581.field5899 / arg2));
            }
        }
        this.field6581.method2371((float) arg2, 106);
        this.field6581.method2403(0);
        this.field6581.method2378(var6, 127);
        this.method2665(0);
        this.field6581.method2375((byte) 123);
        this.method2668(-113);
    }

    @OriginalMember(owner = "client!or", name = "K", descriptor = "(IIII)V", line = 4420)
    public final void method803(int arg0, int arg1, int arg2, int arg3) {
        field6553++;
        if (arg0 == 0) {
            int var5 = 0;
            class354.field4826 = 0;
            class193.field2754 = 0;
            class319.field4410 = 0;
            for (int var6 = 0; var6 < this.field6611; var6++) {
                class193.field2754 += this.field6571[var6];
                class319.field4410 += this.field6541[var6];
                class354.field4826 += this.field6598[var6];
                var5++;
            }
            if (var5 <= 0) {
                class354.field4826 = arg3;
                class319.field4410 = arg2;
                class193.field2754 = arg1;
            } else {
                class354.field4826 = class354.field4826 / var5 + arg3;
                class193.field2754 = class193.field2754 / var5 + arg1;
                class319.field4410 = class319.field4410 / var5 + arg2;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field6611; var7++) {
                this.field6571[var7] += arg1;
                this.field6541[var7] += arg2;
                this.field6598[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field6611; var8++) {
                this.field6571[var8] -= class193.field2754;
                this.field6541[var8] -= class319.field4410;
                this.field6598[var8] -= class354.field4826;
                if (arg3 != 0) {
                    int var9 = class377.field5316[arg3];
                    int var10 = class377.field5315[arg3];
                    int var11 = this.field6571[var8] * var10 + this.field6541[var8] * var9 + 32767 >> 15;
                    this.field6541[var8] = this.field6541[var8] * var10 + 32767 - (this.field6571[var8] * var9) >> 15;
                    this.field6571[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class377.field5316[arg1];
                    int var13 = class377.field5315[arg1];
                    int var14 = this.field6541[var8] * var13 + 32767 - (this.field6598[var8] * var12) >> 15;
                    this.field6598[var8] = this.field6598[var8] * var13 + this.field6541[var8] * var12 + 32767 >> 15;
                    this.field6541[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class377.field5316[arg2];
                    int var16 = class377.field5315[arg2];
                    int var17 = this.field6598[var8] * var15 - (-(this.field6571[var8] * var16) - 32767) >> 15;
                    this.field6598[var8] = this.field6598[var8] * var16 + 32767 - this.field6571[var8] * var15 >> 15;
                    this.field6571[var8] = var17;
                }
                this.field6571[var8] += class193.field2754;
                this.field6541[var8] += class319.field4410;
                this.field6598[var8] += class354.field4826;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field6611; var18++) {
                this.field6571[var18] -= class193.field2754;
                this.field6541[var18] -= class319.field4410;
                this.field6598[var18] -= class354.field4826;
                this.field6571[var18] = this.field6571[var18] * arg1 / 128;
                this.field6541[var18] = this.field6541[var18] * arg2 / 128;
                this.field6598[var18] = this.field6598[var18] * arg3 / 128;
                this.field6571[var18] += class193.field2754;
                this.field6541[var18] += class319.field4410;
                this.field6598[var18] += class354.field4826;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field6566; var19++) {
                int var23 = (this.field6580[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field6580[var19] = (byte) var23;
            }
            if (this.field6606 != null) {
                this.field6606.field142 = null;
            }
            if (this.field6543 != null) {
                for (int var20 = 0; var20 < this.field6537; var20++) {
                    class39 var21 = this.field6543[var20];
                    class349 var22 = this.field6595[var20];
                    var22.field4776 = var22.field4776 & 0xFFFFFF | 255 - (this.field6580[var21.field526] & 0xFF) << 24;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field6566; var24++) {
                int var28 = this.field6610[var24] & 0xFFFF;
                int var29 = (var28 & 0xFC48) >> 10;
                int var30 = var28 >> 7 & 0x7;
                int var31 = arg2 / 4 + var30;
                int var32 = arg1 + var29 & 0x3F;
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
                this.field6610[var24] = (short) class25.method183(class25.method183(var31 << 7, var32 << 10), var34);
            }
            if (this.field6606 != null) {
                this.field6606.field142 = null;
            }
            if (this.field6543 != null) {
                for (int var25 = 0; var25 < this.field6537; var25++) {
                    class39 var26 = this.field6543[var25];
                    class349 var27 = this.field6595[var25];
                    var27.field4776 = class437.field6373[this.field6610[var26.field526] & 0xFFFF] & 0xFFFFFF | var27.field4776 & 0xFF000000;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field6537; var35++) {
                class349 var36 = this.field6595[var35];
                var36.field4777 += arg2;
                var36.field4780 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field6537; var37++) {
                class349 var38 = this.field6595[var37];
                var38.field4781 = var38.field4781 * arg2 >> 7;
                var38.field4779 = var38.field4779 * arg1 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field6537; var39++) {
                class349 var40 = this.field6595[var39];
                var40.field4778 = var40.field4778 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!or", name = "ZA", descriptor = "(I)V", line = 4726)
    public final void method795(int arg0) {
        if (this.field6606 != null) {
            this.field6606.field142 = null;
        }
        field6604++;
        this.field6544 = (short) arg0;
    }

    @OriginalMember(owner = "client!or", name = "Q", descriptor = "()I", line = 4740)
    public final int method766() {
        field6508++;
        return this.field6552;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ILnu;)V", line = 4750)
    private final void method2672(int arg0, class418 arg1) {
        if (class368.field5166.length < this.field6589) {
            class368.field5166 = new int[this.field6589];
            class366.field5139 = new int[this.field6589];
        }
        if (arg0 < 31) {
            this.field6561 = true;
        }
        field6554++;
        for (int var3 = 0; var3 < this.field6611; var3++) {
            int var14 = (this.field6571[var3] - (this.field6541[var3] * this.field6581.field5945 >> 8) >> this.field6581.field5866) - arg1.field6108;
            int var15 = (this.field6598[var3] - (this.field6541[var3] * this.field6581.field5937 >> 8) >> this.field6581.field5866) - arg1.field6105;
            int var16 = this.field6509[var3];
            int var17 = this.field6509[var3 + 1];
            for (int var18 = var16; var18 < var17; var18++) {
                int var19 = this.field6569[var18] - 1;
                if (var19 == -1) {
                    break;
                }
                class368.field5166[var19] = var14;
                class366.field5139[var19] = var15;
            }
        }
        for (int var4 = 0; var4 < this.field6512; var4++) {
            if (this.field6580 == null || this.field6580[var4] <= 128) {
                short var5 = this.field6562[var4];
                short var6 = this.field6558[var4];
                short var7 = this.field6517[var4];
                int var8 = class368.field5166[var5];
                int var9 = class368.field5166[var6];
                int var10 = class368.field5166[var7];
                int var11 = class366.field5139[var5];
                int var12 = class366.field5139[var6];
                int var13 = class366.field5139[var7];
                if ((var8 - var9) * (var12 - var13) - ((var12 - var11) * (var10 - var9)) > 0) {
                    arg1.method2503(var10, var11, false, var12, var8, var9, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(FFJLwk;BIIIII)S", line = 4843)
    private final short method2673(float arg0, float arg1, long arg2, class94 arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field6511++;
        int var12 = this.field6509[arg9];
        int var13 = this.field6509[arg9 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field6569[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class479.field6993[var15] == arg2) {
                return (short) (var16 - 1);
            }
        }
        this.field6569[var14] = (short) (this.field6589 + 1);
        class479.field6993[var14] = arg2;
        this.field6536[this.field6589] = (short) arg7;
        this.field6527[this.field6589] = (short) arg8;
        this.field6520[this.field6589] = (short) arg6;
        this.field6612[this.field6589] = (byte) arg5;
        this.field6549[this.field6589] = arg1;
        if (arg4 > -25) {
            this.method762();
        }
        this.field6585[this.field6589] = arg0;
        return (short) (this.field6589++);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ZZ)V", line = 5911)
    private final void method2674(boolean arg0, boolean arg1) {
        field6583++;
        boolean var3 = this.field6606 != null && this.field6606.field142 == null;
        boolean var4 = this.field6521 != null && this.field6521.field142 == null;
        boolean var5 = this.field6572 != null && this.field6572.field142 == null;
        boolean var6 = this.field6518 != null && this.field6518.field142 == null;
        if (arg1) {
            var5 &= (this.field6614 & 0x1) != 0;
            var3 &= (this.field6614 & 0x2) != 0;
            var6 &= (this.field6614 & 0x8) != 0;
            var4 &= (this.field6614 & 0x4) != 0;
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
        if (this.field6589 * var7 <= class290.field3891.field5073.length) {
            class290.field3891.field5069 = 0;
        } else {
            class290.field3891 = new class251((this.field6589 + 100) * var7);
        }
        if (var5) {
            if (this.field6581.field5931) {
                for (int var20 = 0; var20 < this.field6611; var20++) {
                    int var21 = NativeStream.floatToRawIntBits((float) this.field6571[var20]);
                    int var22 = NativeStream.floatToRawIntBits((float) this.field6541[var20]);
                    int var23 = NativeStream.floatToRawIntBits((float) this.field6598[var20]);
                    int var24 = this.field6509[var20];
                    int var25 = this.field6509[var20 + 1];
                    for (int var26 = var24; var26 < var25; var26++) {
                        int var27 = this.field6569[var26] - 1;
                        if (var27 == -1) {
                            break;
                        }
                        class290.field3891.field5069 = var7 * var27;
                        class290.field3891.method2074(false, var21);
                        class290.field3891.method2074(!arg0, var22);
                        class290.field3891.method2074(false, var23);
                    }
                }
            } else {
                for (int var12 = 0; var12 < this.field6611; var12++) {
                    int var13 = NativeStream.floatToRawIntBits((float) this.field6571[var12]);
                    int var14 = NativeStream.floatToRawIntBits((float) this.field6541[var12]);
                    int var15 = NativeStream.floatToRawIntBits((float) this.field6598[var12]);
                    int var16 = this.field6509[var12];
                    int var17 = this.field6509[var12 + 1];
                    for (int var18 = var16; var18 < var17; var18++) {
                        int var19 = this.field6569[var18] - 1;
                        if (var19 == -1) {
                            break;
                        }
                        class290.field3891.field5069 = var7 * var19;
                        class290.field3891.method2075(var13, false);
                        class290.field3891.method2075(var14, false);
                        class290.field3891.method2075(var15, false);
                    }
                }
            }
        }
        if (!arg0) {
            this.field6572 = null;
        }
        if (var3) {
            if (this.field6521 == null) {
                byte[] var28;
                short[] var29;
                short[] var30;
                short[] var31;
                if (this.field6587 == null) {
                    var28 = this.field6612;
                    var29 = this.field6520;
                    var31 = this.field6527;
                    var30 = this.field6536;
                } else {
                    var28 = this.field6587.field176;
                    var29 = this.field6587.field185;
                    var30 = this.field6587.field182;
                    var31 = this.field6587.field177;
                }
                float var32 = this.field6581.field5940[0];
                float var33 = this.field6581.field5940[1];
                float var34 = this.field6581.field5940[2];
                float var35 = this.field6581.field5960;
                float var36 = this.field6581.field5892 * 768.0F / (float) this.field6552;
                float var37 = this.field6581.field5920 * 768.0F / (float) this.field6552;
                for (int var38 = 0; var38 < this.field6566; var38++) {
                    int var39 = this.method2663(32767, this.field6610[var38], this.field6544, this.field6580[var38], this.field6605[var38]);
                    float var40 = (float) (var39 >>> 24) * this.field6581.field5959;
                    float var41 = (float) ((var39 & 0xFF57) >> 8) * this.field6581.field5997;
                    float var42 = (float) ((var39 & 0xFF6DEC) >> 16) * this.field6581.field5906;
                    short var43 = this.field6562[var38];
                    short var44 = (short) var28[var43];
                    float var45;
                    if (var44 == 0) {
                        var45 = ((float) var29[var43] * var34 + (float) var30[var43] * var32 + (float) var31[var43] * var33) * 0.0026041667F;
                    } else {
                        var45 = ((float) var29[var43] * var34 + (float) var30[var43] * var32 + (float) var31[var43] * var33) / (float) (var44 * 256);
                    }
                    float var46 = (var45 < 0.0F ? var37 : var36) * var45 + var35;
                    int var47 = (int) (var40 * var46);
                    if (var47 < 0) {
                        var47 = 0;
                    } else if (var47 > 255) {
                        var47 = 255;
                    }
                    int var48 = (int) (var42 * var46);
                    int var49 = (int) (var41 * var46);
                    if (var48 < 0) {
                        var48 = 0;
                    } else if (var48 > 255) {
                        var48 = 255;
                    }
                    if (var49 < 0) {
                        var49 = 0;
                    } else if (var49 > 255) {
                        var49 = 255;
                    }
                    class290.field3891.field5069 = var7 * var43 + var9;
                    class290.field3891.method2084(var47, false);
                    class290.field3891.method2084(var48, false);
                    class290.field3891.method2084(var49, false);
                    class290.field3891.method2084(255 - (this.field6580[var38] & 0xFF), !arg0);
                    short var50 = this.field6558[var38];
                    short var51 = (short) var28[var50];
                    float var52;
                    if (var51 == 0) {
                        var52 = ((float) var29[var50] * var34 + (float) var30[var50] * var32 + (float) var31[var50] * var33) * 0.0026041667F;
                    } else {
                        var52 = ((float) var29[var50] * var34 + (float) var30[var50] * var32 + (float) var31[var50] * var33) / (float) (var51 * 256);
                    }
                    float var53 = var35 + (var52 < 0.0F ? var37 : var36) * var52;
                    int var54 = (int) (var40 * var53);
                    int var55 = (int) (var42 * var53);
                    if (var54 < 0) {
                        var54 = 0;
                    } else if (var54 > 255) {
                        var54 = 255;
                    }
                    int var56 = (int) (var41 * var53);
                    if (var55 < 0) {
                        var55 = 0;
                    } else if (var55 > 255) {
                        var55 = 255;
                    }
                    if (var56 < 0) {
                        var56 = 0;
                    } else if (var56 > 255) {
                        var56 = 255;
                    }
                    class290.field3891.field5069 = var7 * var50 + var9;
                    class290.field3891.method2084(var54, false);
                    class290.field3891.method2084(var55, !arg0);
                    class290.field3891.method2084(var56, !arg0);
                    class290.field3891.method2084(255 - (this.field6580[var38] & 0xFF), false);
                    short var57 = this.field6517[var38];
                    short var58 = (short) var28[var57];
                    float var59;
                    if (var58 == 0) {
                        var59 = ((float) var29[var57] * var34 + (float) var30[var57] * var32 + (float) var31[var57] * var33) * 0.0026041667F;
                    } else {
                        var59 = ((float) var29[var57] * var34 + (float) var30[var57] * var32 + (float) var31[var57] * var33) / (float) (var58 * 256);
                    }
                    float var60 = var59 * ((var59 < 0.0F) ? var37 : var36) + var35;
                    int var61 = (int) (var40 * var60);
                    int var62 = (int) (var42 * var60);
                    if (var61 < 0) {
                        var61 = 0;
                    } else if (var61 > 255) {
                        var61 = 255;
                    }
                    if (var62 < 0) {
                        var62 = 0;
                    } else if (var62 > 255) {
                        var62 = 255;
                    }
                    int var63 = (int) (var41 * var60);
                    if (var63 < 0) {
                        var63 = 0;
                    } else if (var63 > 255) {
                        var63 = 255;
                    }
                    class290.field3891.field5069 = var7 * var57 + var9;
                    class290.field3891.method2084(var61, false);
                    class290.field3891.method2084(var62, false);
                    class290.field3891.method2084(var63, false);
                    class290.field3891.method2084(255 - (this.field6580[var38] & 0xFF), false);
                }
            } else {
                for (int var64 = 0; var64 < this.field6566; var64++) {
                    int var65 = this.method2663(32767, this.field6610[var64], this.field6544, this.field6580[var64], this.field6605[var64]);
                    class290.field3891.field5069 = this.field6562[var64] * var7 + var9;
                    class290.field3891.method2074(false, var65);
                    class290.field3891.field5069 = this.field6558[var64] * var7 + var9;
                    class290.field3891.method2074(false, var65);
                    class290.field3891.field5069 = this.field6517[var64] * var7 + var9;
                    class290.field3891.method2074(!arg0, var65);
                }
            }
        }
        if (var4) {
            byte[] var66;
            short[] var67;
            short[] var68;
            short[] var69;
            if (this.field6587 == null) {
                var66 = this.field6612;
                var69 = this.field6520;
                var68 = this.field6527;
                var67 = this.field6536;
            } else {
                var66 = this.field6587.field176;
                var67 = this.field6587.field182;
                var68 = this.field6587.field177;
                var69 = this.field6587.field185;
            }
            float var70 = 3.0F / (float) this.field6552;
            class290.field3891.field5069 = var10;
            float var71 = 3.0F / (float) (this.field6552 + (this.field6552 / 2));
            if (this.field6581.field5931) {
                for (int var75 = 0; var75 < this.field6589; var75++) {
                    int var76 = var66[var75] & 0xFF;
                    if (var76 == 0) {
                        class290.field3891.method1477((float) var67[var75] * var71, (byte) -14);
                        class290.field3891.method1477((float) var68[var75] * var71, (byte) -11);
                        class290.field3891.method1477((float) var69[var75] * var71, (byte) 122);
                    } else {
                        float var77 = var70 / (float) var76;
                        class290.field3891.method1477((float) var67[var75] * var77, (byte) 126);
                        class290.field3891.method1477((float) var68[var75] * var77, (byte) -100);
                        class290.field3891.method1477((float) var69[var75] * var77, (byte) -17);
                    }
                    class290.field3891.field5069 += var7 - 12;
                }
            } else {
                for (int var72 = 0; var72 < this.field6589; var72++) {
                    int var73 = var66[var72] & 0xFF;
                    if (var73 == 0) {
                        class290.field3891.method1476(-128, (float) var67[var72] * var71);
                        class290.field3891.method1476(96, (float) var68[var72] * var71);
                        class290.field3891.method1476(-105, (float) var69[var72] * var71);
                    } else {
                        float var74 = var70 / (float) var73;
                        class290.field3891.method1476(-107, (float) var67[var72] * var74);
                        class290.field3891.method1476(-125, (float) var68[var72] * var74);
                        class290.field3891.method1476(101, (float) var69[var72] * var74);
                    }
                    class290.field3891.field5069 += var7 - 12;
                }
            }
        }
        if (var6) {
            class290.field3891.field5069 = var11;
            if (this.field6581.field5931) {
                for (int var78 = 0; var78 < this.field6589; var78++) {
                    class290.field3891.method1477(this.field6549[var78], (byte) 1);
                    class290.field3891.method1477(this.field6585[var78], (byte) 125);
                    class290.field3891.field5069 += var7 - 8;
                }
            } else {
                for (int var79 = 0; var79 < this.field6589; var79++) {
                    class290.field3891.method1476(-121, this.field6549[var79]);
                    class290.field3891.method1476(-111, this.field6585[var79]);
                    class290.field3891.field5069 += var7 - 8;
                }
            }
        }
        class290.field3891.field5069 = this.field6589 * var7;
        class74 var80;
        if (arg1) {
            if (this.field6588 == null) {
                this.field6588 = this.field6581.method2389(true, var7, class290.field3891.field5073, 1145, class290.field3891.field5069);
            } else {
                this.field6588.method554((byte) 80, class290.field3891.field5073, var7, class290.field3891.field5069);
            }
            this.field6614 = 0;
            var80 = this.field6588;
        } else {
            var80 = this.field6581.method2389(false, var7, class290.field3891.field5073, 1145, class290.field3891.field5069);
            this.field6561 = true;
        }
        if (var5) {
            this.field6572.field137 = var8;
            this.field6572.field142 = var80;
        }
        if (var6) {
            this.field6518.field137 = var11;
            this.field6518.field142 = var80;
        }
        if (var3) {
            this.field6606.field137 = var9;
            this.field6606.field142 = var80;
        }
        if (var4) {
            this.field6521.field142 = var80;
            this.field6521.field137 = var10;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IILia;Z)Z", line = 6424)
    public final boolean method777(int arg0, int arg1, class415 arg2, boolean arg3) {
        field6510++;
        class53 var5 = (class53) arg2;
        class53 var6 = this.field6581.field5917;
        float var7 = var5.field723 * var6.field729 + var5.field718 * var6.field738 + var5.field707 * var6.field709 + var6.field707;
        float var8 = var5.field723 * var6.field735 + var5.field718 * var6.field732 + var5.field707 * var6.field731 + var6.field718;
        class71.field1072 = var5.field727 * var6.field730 + var5.field731 * var6.field721 + var5.field709 * var6.field727;
        class197.field2842 = var5.field721 * var6.field735 + var5.field738 * var6.field731 + var5.field732 * var6.field732;
        class311.field4257 = var5.field727 * var6.field735 + var5.field731 * var6.field732 + var5.field709 * var6.field731;
        float var9 = var5.field723 * var6.field730 + var5.field718 * var6.field721 + var5.field707 * var6.field727 + var6.field723;
        class233.field3233 = var5.field730 * var6.field729 + var5.field735 * var6.field738 + var5.field729 * var6.field709;
        class339.field4670 = var5.field721 * var6.field729 + var5.field738 * var6.field709 + var5.field732 * var6.field738;
        class374.field5225 = var5.field721 * var6.field730 + var5.field738 * var6.field727 + var5.field732 * var6.field721;
        class314.field4303 = var5.field727 * var6.field729 + var5.field731 * var6.field738 + var5.field709 * var6.field709;
        class288.field3864 = var5.field730 * var6.field735 + var5.field735 * var6.field732 + var5.field729 * var6.field731;
        class43.field598 = var5.field730 * var6.field730 + var5.field735 * var6.field721 + var5.field729 * var6.field727;
        boolean var10 = false;
        float var11 = Float.MAX_VALUE;
        float var12 = -3.4028235E38F;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        int var15 = this.field6581.field5899;
        int var16 = this.field6581.field5913;
        if (!this.field6546) {
            this.method2669((byte) 26);
        }
        class492.field7280[0] = this.field6613;
        class201.field2875[0] = this.field6593;
        class492.field7280[1] = this.field6535;
        class12.field144[0] = this.field6575;
        class201.field2875[1] = this.field6593;
        class492.field7280[2] = this.field6613;
        class12.field144[1] = this.field6575;
        class201.field2875[2] = this.field6573;
        class492.field7280[3] = this.field6535;
        class12.field144[2] = this.field6575;
        class201.field2875[3] = this.field6573;
        class12.field144[3] = this.field6575;
        class492.field7280[4] = this.field6613;
        class201.field2875[4] = this.field6593;
        class12.field144[4] = this.field6513;
        class492.field7280[5] = this.field6535;
        class201.field2875[5] = this.field6593;
        class12.field144[5] = this.field6513;
        class492.field7280[6] = this.field6613;
        class201.field2875[6] = this.field6573;
        class492.field7280[7] = this.field6535;
        class12.field144[6] = this.field6513;
        class201.field2875[7] = this.field6573;
        class12.field144[7] = this.field6513;
        for (int var17 = 0; var17 < 8; var17++) {
            float var36 = (float) class492.field7280[var17];
            float var37 = (float) class201.field2875[var17];
            float var38 = (float) class12.field144[var17];
            float var39 = class233.field3233 * var38 + class339.field4670 * var37 + class314.field4303 * var36 + var7;
            float var40 = class288.field3864 * var38 + class311.field4257 * var36 + class197.field2842 * var37 + var8;
            float var41 = class43.field598 * var38 + class71.field1072 * var36 + class374.field5225 * var37 + var9;
            if (var41 >= (float) this.field6581.field5909) {
                float var42 = (float) var15 * var39 / var41 + (float) this.field6581.field5981;
                float var43 = (float) var16 * var40 / var41 + (float) this.field6581.field5984;
                if (var11 > var42) {
                    var11 = var42;
                }
                if (var42 > var12) {
                    var12 = var42;
                }
                if (var14 < var43) {
                    var14 = var43;
                }
                var10 = true;
                if (var13 > var43) {
                    var13 = var43;
                }
            }
        }
        if (var10 && (float) arg0 > var11 && var12 > (float) arg0 && (float) arg1 > var13 && (float) arg1 < var14) {
            if (arg3) {
                return true;
            }
            if (this.field6589 > class368.field5166.length) {
                class366.field5139 = new int[this.field6589];
                class368.field5166 = new int[this.field6589];
            }
            for (int var18 = 0; var18 < this.field6611; var18++) {
                float var20 = (float) this.field6541[var18];
                float var21 = (float) this.field6598[var18];
                float var22 = (float) this.field6571[var18];
                float var23 = class233.field3233 * var21 + class339.field4670 * var20 + class314.field4303 * var22 + var7;
                float var24 = class288.field3864 * var21 + class311.field4257 * var22 + class197.field2842 * var20 + var8;
                float var25 = class43.field598 * var21 + class71.field1072 * var22 + class374.field5225 * var20 + var9;
                if (((float) this.field6581.field5909 <= var25)) {
                    int var30 = (int) ((float) var15 * var23 / var25 + (float) this.field6581.field5981);
                    int var31 = (int) ((float) var16 * var24 / var25 + (float) this.field6581.field5984);
                    int var32 = this.field6509[var18];
                    int var33 = this.field6509[var18 + 1];
                    for (int var34 = var32; var34 < var33; var34++) {
                        int var35 = this.field6569[var34] - 1;
                        if (var35 == -1) {
                            break;
                        }
                        class368.field5166[var35] = var30;
                        class366.field5139[var35] = var31;
                    }
                } else {
                    int var26 = this.field6509[var18];
                    int var27 = this.field6509[var18 + 1];
                    for (int var28 = var26; var28 < var27; var28++) {
                        int var29 = this.field6569[var28] - 1;
                        if (var29 == -1) {
                            break;
                        }
                        class368.field5166[this.field6569[var28] - 1] = -999999;
                    }
                }
            }
            for (int var19 = 0; var19 < this.field6566; var19++) {
                if (class368.field5166[this.field6562[var19]] != -999999 && class368.field5166[this.field6558[var19]] != -999999 && class368.field5166[this.field6517[var19]] != -999999 && this.method2661(class366.field5139[this.field6517[var19]], class368.field5166[this.field6562[var19]], class368.field5166[this.field6517[var19]], class366.field5139[this.field6562[var19]], arg1, class366.field5139[this.field6558[var19]], false, arg0, class368.field5166[this.field6558[var19]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!or", name = "N", descriptor = "(SS)V", line = 6628)
    public final void method791(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field6566; var3++) {
            if (this.field6610[var3] == arg0) {
                this.field6610[var3] = arg1;
            }
        }
        field6515++;
        if (this.field6543 != null) {
            for (int var4 = 0; var4 < this.field6537; var4++) {
                class39 var5 = this.field6543[var4];
                class349 var6 = this.field6595[var4];
                var6.field4776 = var6.field4776 & 0xFF000000 | class437.field6373[this.field6610[var5.field526] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field6606 != null) {
            this.field6606.field142 = null;
        }
    }
}
