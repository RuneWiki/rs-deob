import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class76 extends class136 {

    @OriginalMember(owner = "client!gj", name = "u", descriptor = "I")
    public int field1261 = 0;

    @OriginalMember(owner = "client!gj", name = "J", descriptor = "B")
    public byte field1276 = 0;

    @OriginalMember(owner = "client!gj", name = "w", descriptor = "Z")
    private boolean field1263 = false;

    @OriginalMember(owner = "client!gj", name = "B", descriptor = "I")
    public int field1268 = 0;

    @OriginalMember(owner = "client!gj", name = "O", descriptor = "I")
    public int field1281;

    @OriginalMember(owner = "client!gj", name = "jb", descriptor = "[I")
    public int[] field1302;

    @OriginalMember(owner = "client!gj", name = "Y", descriptor = "[I")
    public int[] field1291;

    @OriginalMember(owner = "client!gj", name = "hb", descriptor = "[I")
    public int[] field1300;

    @OriginalMember(owner = "client!gj", name = "U", descriptor = "[I")
    private int[] field1287;

    @OriginalMember(owner = "client!gj", name = "C", descriptor = "[I")
    public int[] field1269;

    @OriginalMember(owner = "client!gj", name = "M", descriptor = "[I")
    public int[] field1279;

    @OriginalMember(owner = "client!gj", name = "t", descriptor = "[I")
    public int[] field1260;

    @OriginalMember(owner = "client!gj", name = "I", descriptor = "[B")
    public byte[] field1275;

    @OriginalMember(owner = "client!gj", name = "V", descriptor = "[B")
    public byte[] field1288;

    @OriginalMember(owner = "client!gj", name = "ib", descriptor = "[B")
    public byte[] field1301;

    @OriginalMember(owner = "client!gj", name = "W", descriptor = "[I")
    private int[] field1289;

    @OriginalMember(owner = "client!gj", name = "ab", descriptor = "[S")
    public short[] field1293;

    @OriginalMember(owner = "client!gj", name = "v", descriptor = "[B")
    public byte[] field1262;

    @OriginalMember(owner = "client!gj", name = "ob", descriptor = "[S")
    public short[] field1307;

    @OriginalMember(owner = "client!gj", name = "R", descriptor = "[B")
    public byte[] field1284;

    @OriginalMember(owner = "client!gj", name = "db", descriptor = "[S")
    public short[] field1296;

    @OriginalMember(owner = "client!gj", name = "H", descriptor = "[S")
    public short[] field1274;

    @OriginalMember(owner = "client!gj", name = "cb", descriptor = "[S")
    public short[] field1295;

    @OriginalMember(owner = "client!gj", name = "gb", descriptor = "[S")
    private short[] field1299;

    @OriginalMember(owner = "client!gj", name = "nb", descriptor = "[S")
    private short[] field1306;

    @OriginalMember(owner = "client!gj", name = "eb", descriptor = "[S")
    private short[] field1297;

    @OriginalMember(owner = "client!gj", name = "lb", descriptor = "[B")
    private byte[] field1304;

    @OriginalMember(owner = "client!gj", name = "K", descriptor = "[B")
    private byte[] field1277;

    @OriginalMember(owner = "client!gj", name = "F", descriptor = "[B")
    private byte[] field1272;

    @OriginalMember(owner = "client!gj", name = "kb", descriptor = "[B")
    private byte[] field1303;

    @OriginalMember(owner = "client!gj", name = "L", descriptor = "[B")
    private byte[] field1278;

    @OriginalMember(owner = "client!gj", name = "y", descriptor = "[[I")
    public int[][] field1265;

    @OriginalMember(owner = "client!gj", name = "A", descriptor = "[[I")
    public int[][] field1267;

    @OriginalMember(owner = "client!gj", name = "X", descriptor = "[Lni;")
    public class150[] field1290;

    @OriginalMember(owner = "client!gj", name = "x", descriptor = "[Lac;")
    public class4[] field1264;

    @OriginalMember(owner = "client!gj", name = "T", descriptor = "[Lni;")
    public class150[] field1286;

    @OriginalMember(owner = "client!gj", name = "S", descriptor = "S")
    public short field1285;

    @OriginalMember(owner = "client!gj", name = "Z", descriptor = "S")
    public short field1292;

    @OriginalMember(owner = "client!gj", name = "P", descriptor = "[I")
    private static int[] field1282 = new int[10000];

    @OriginalMember(owner = "client!gj", name = "D", descriptor = "I")
    private static int field1270 = 0;

    @OriginalMember(owner = "client!gj", name = "bb", descriptor = "[I")
    private static int[] field1294 = class50.field851;

    @OriginalMember(owner = "client!gj", name = "fb", descriptor = "[I")
    private static int[] field1298 = new int[10000];

    @OriginalMember(owner = "client!gj", name = "Q", descriptor = "[I")
    private static int[] field1283 = class50.field853;

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "S")
    private short field1259;

    @OriginalMember(owner = "client!gj", name = "z", descriptor = "S")
    private short field1266;

    @OriginalMember(owner = "client!gj", name = "E", descriptor = "S")
    private short field1271;

    @OriginalMember(owner = "client!gj", name = "G", descriptor = "S")
    private short field1273;

    @OriginalMember(owner = "client!gj", name = "N", descriptor = "S")
    private short field1280;

    @OriginalMember(owner = "client!gj", name = "mb", descriptor = "S")
    private short field1305;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "()V")
    public final void method452() {
        int var10002;
        if (this.field1287 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1261; var3++) {
                int var7 = this.field1287[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field1265 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; var4++) {
                this.field1265[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field1261) {
                int var6 = this.field1287[var5];
                this.field1265[var6][var1[var6]++] = var5++;
            }
            this.field1287 = null;
        }
        if (this.field1289 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1268; var10++) {
            int var14 = this.field1289[var10];
            var10002 = var8[var14]++;
            if (var14 > var9) {
                var9 = var14;
            }
        }
        this.field1267 = new int[var9 + 1][];
        for (int var11 = 0; var11 <= var9; var11++) {
            this.field1267[var11] = new int[var8[var11]];
            var8[var11] = 0;
        }
        int var12 = 0;
        while (var12 < this.field1268) {
            int var13 = this.field1289[var12];
            this.field1267[var13][var8[var13]++] = var12++;
        }
        this.field1289 = null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(SS)V")
    public final void method453(short arg0, short arg1) {
        if (this.field1293 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1268; var3++) {
            if (this.field1293[var3] == arg0) {
                this.field1293[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([B)V")
    private final void method454(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class112 var4 = new class112(arg0);
        class112 var5 = new class112(arg0);
        class112 var6 = new class112(arg0);
        class112 var7 = new class112(arg0);
        class112 var8 = new class112(arg0);
        var4.field2133 = arg0.length - 18;
        int var9 = var4.method739(-123);
        int var10 = var4.method739(112);
        int var11 = var4.method716(-1308);
        int var12 = var4.method716(-1308);
        int var13 = var4.method716(-1308);
        int var14 = var4.method716(-1308);
        int var15 = var4.method716(-1308);
        int var16 = var4.method716(-1308);
        int var17 = var4.method739(-126);
        int var18 = var4.method739(-128);
        int var19 = var4.method739(-125);
        int var20 = var4.method739(-124);
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field1261 = var9;
        this.field1268 = var10;
        this.field1281 = var11;
        this.field1302 = new int[var9];
        this.field1291 = new int[var9];
        this.field1300 = new int[var9];
        this.field1269 = new int[var10];
        this.field1279 = new int[var10];
        this.field1260 = new int[var10];
        if (var11 > 0) {
            this.field1284 = new byte[var11];
            this.field1296 = new short[var11];
            this.field1274 = new short[var11];
            this.field1295 = new short[var11];
        }
        if (var16 == 1) {
            this.field1287 = new int[var9];
        }
        if (var12 == 1) {
            this.field1275 = new byte[var10];
            this.field1262 = new byte[var10];
            this.field1293 = new short[var10];
        }
        if (var13 == 255) {
            this.field1288 = new byte[var10];
        } else {
            this.field1276 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1301 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1289 = new int[var10];
        }
        this.field1307 = new short[var10];
        var4.field2133 = var21;
        var5.field2133 = var36;
        var6.field2133 = var38;
        var7.field2133 = var40;
        var8.field2133 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var62 = var4.method716(-1308);
            int var63 = 0;
            if ((var62 & 0x1) != 0) {
                var63 = var5.method735(false);
            }
            int var64 = 0;
            if ((var62 & 0x2) != 0) {
                var64 = var6.method735(false);
            }
            int var65 = 0;
            if ((var62 & 0x4) != 0) {
                var65 = var7.method735(false);
            }
            this.field1302[var46] = var43 + var63;
            this.field1291[var46] = var44 + var64;
            this.field1300[var46] = var45 + var65;
            var43 = this.field1302[var46];
            var44 = this.field1291[var46];
            var45 = this.field1300[var46];
            if (var16 == 1) {
                this.field1287[var46] = var8.method716(-1308);
            }
        }
        var4.field2133 = var32;
        var5.field2133 = var28;
        var6.field2133 = var26;
        var7.field2133 = var30;
        var8.field2133 = var27;
        for (int var47 = 0; var47 < var10; var47++) {
            this.field1307[var47] = (short) var4.method739(-126);
            if (var12 == 1) {
                int var61 = var5.method716(-1308);
                if ((var61 & 0x1) == 1) {
                    this.field1275[var47] = 1;
                    var2 = true;
                } else {
                    this.field1275[var47] = 0;
                }
                if ((var61 & 0x2) == 2) {
                    this.field1262[var47] = (byte) (var61 >> 2);
                    this.field1293[var47] = this.field1307[var47];
                    this.field1307[var47] = 127;
                    if (this.field1293[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1262[var47] = -1;
                    this.field1293[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field1288[var47] = var6.method734(true);
            }
            if (var14 == 1) {
                this.field1301[var47] = var7.method734(true);
            }
            if (var15 == 1) {
                this.field1289[var47] = var8.method716(-1308);
            }
        }
        var4.field2133 = var25;
        var5.field2133 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; var52++) {
            int var57 = var5.method716(-1308);
            if (var57 == 1) {
                var48 = var4.method735(false) + var51;
                var49 = var4.method735(false) + var48;
                var50 = var4.method735(false) + var49;
                var51 = var50;
                this.field1269[var52] = var48;
                this.field1279[var52] = var49;
                this.field1260[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method735(false) + var51;
                var51 = var50;
                this.field1269[var52] = var48;
                this.field1279[var52] = var49;
                this.field1260[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method735(false) + var51;
                var51 = var50;
                this.field1269[var52] = var48;
                this.field1279[var52] = var49;
                this.field1260[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method735(false) + var51;
                var51 = var50;
                this.field1269[var52] = var48;
                this.field1279[var52] = var60;
                this.field1260[var52] = var50;
            }
        }
        var4.field2133 = var34;
        for (int var53 = 0; var53 < var11; var53++) {
            this.field1284[var53] = 0;
            this.field1296[var53] = (short) var4.method739(2);
            this.field1274[var53] = (short) var4.method739(-123);
            this.field1295[var53] = (short) var4.method739(-127);
        }
        if (this.field1262 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; var55++) {
                int var56 = this.field1262[var55] & 0xFF;
                if (var56 != 255) {
                    if ((this.field1296[var56] & 0xFFFF) == this.field1269[var55] && (this.field1274[var56] & 0xFFFF) == this.field1279[var55] && (this.field1295[var56] & 0xFFFF) == this.field1260[var55]) {
                        this.field1262[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field1262 = null;
            }
        }
        if (!var3) {
            this.field1293 = null;
        }
        if (!var2) {
            this.field1275 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "()V")
    public final void method455() {
        if (this.field1290 != null) {
            return;
        }
        this.field1290 = new class150[this.field1261];
        for (int var1 = 0; var1 < this.field1261; var1++) {
            this.field1290[var1] = new class150();
        }
        for (int var2 = 0; var2 < this.field1268; var2++) {
            int var3 = this.field1269[var2];
            int var4 = this.field1279[var2];
            int var5 = this.field1260[var2];
            int var6 = this.field1302[var4] - this.field1302[var3];
            int var7 = this.field1291[var4] - this.field1291[var3];
            int var8 = this.field1300[var4] - this.field1300[var3];
            int var9 = this.field1302[var5] - this.field1302[var3];
            int var10 = this.field1291[var5] - this.field1291[var3];
            int var11 = this.field1300[var5] - this.field1300[var3];
            int var12 = var7 * var11 - var8 * var10;
            int var13 = var8 * var9 - var6 * var11;
            int var14;
            for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 0x1) {
                var12 >>= 0x1;
                var13 >>= 0x1;
            }
            int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
            if (var15 <= 0) {
                var15 = 1;
            }
            int var16 = var12 * 256 / var15;
            int var17 = var13 * 256 / var15;
            int var18 = var14 * 256 / var15;
            byte var19;
            if (this.field1275 == null) {
                var19 = 0;
            } else {
                var19 = this.field1275[var2];
            }
            if (var19 == 0) {
                class150 var20 = this.field1290[var3];
                var20.field2748 += var16;
                var20.field2749 += var17;
                var20.field2740 += var18;
                var20.field2753++;
                class150 var21 = this.field1290[var4];
                var21.field2748 += var16;
                var21.field2749 += var17;
                var21.field2740 += var18;
                var21.field2753++;
                class150 var22 = this.field1290[var5];
                var22.field2748 += var16;
                var22.field2749 += var17;
                var22.field2740 += var18;
                var22.field2753++;
            } else if (var19 == 1) {
                if (this.field1264 == null) {
                    this.field1264 = new class4[this.field1268];
                }
                class4 var23 = this.field1264[var2] = new class4();
                var23.field51 = var16;
                var23.field43 = var17;
                var23.field52 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(III)V")
    public final void method456(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1261; var4++) {
            this.field1302[var4] += arg0;
            this.field1291[var4] += arg1;
            this.field1300[var4] += arg2;
        }
        this.method473();
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIII)Lwh;")
    public final class242 method457(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class242(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V")
    public final void method458(int arg0) {
        int var2 = field1283[arg0];
        int var3 = field1294[arg0];
        for (int var4 = 0; var4 < this.field1261; var4++) {
            int var5 = this.field1302[var4] * var3 + this.field1300[var4] * var2 >> 16;
            this.field1300[var4] = this.field1300[var4] * var3 - this.field1302[var4] * var2 >> 16;
            this.field1302[var4] = var5;
        }
        this.method473();
    }

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "()V")
    public final void method459() {
        for (int var1 = 0; var1 < this.field1261; var1++) {
            this.field1300[var1] = -this.field1300[var1];
        }
        for (int var2 = 0; var2 < this.field1268; var2++) {
            int var3 = this.field1269[var2];
            this.field1269[var2] = this.field1260[var2];
            this.field1260[var2] = var3;
        }
        this.method473();
    }

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "()V")
    private final void method460() {
        if (this.field1263) {
            return;
        }
        this.field1263 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field1261; var7++) {
            int var8 = this.field1302[var7];
            int var9 = this.field1291[var7];
            int var10 = this.field1300[var7];
            if (var8 < var1) {
                var1 = var8;
            }
            if (var8 > var4) {
                var4 = var8;
            }
            if (var9 < var2) {
                var2 = var9;
            }
            if (var9 > var5) {
                var5 = var9;
            }
            if (var10 < var3) {
                var3 = var10;
            }
            if (var10 > var6) {
                var6 = var10;
            }
        }
        this.field1273 = (short) var1;
        this.field1305 = (short) var4;
        this.field1266 = (short) var2;
        this.field1280 = (short) var5;
        this.field1271 = (short) var3;
        this.field1259 = (short) var6;
    }

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "()V")
    public final void method461() {
        for (int var1 = 0; var1 < this.field1261; var1++) {
            int var2 = this.field1302[var1];
            this.field1302[var1] = this.field1300[var1];
            this.field1300[var1] = -var2;
        }
        this.method473();
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lgj;I)I")
    private final int method462(class76 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1302[arg1];
        int var5 = arg0.field1291[arg1];
        int var6 = arg0.field1300[arg1];
        for (int var7 = 0; var7 < this.field1261; var7++) {
            if (this.field1302[var7] == var4 && this.field1291[var7] == var5 && this.field1300[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1302[this.field1261] = var4;
            this.field1291[this.field1261] = var5;
            this.field1300[this.field1261] = var6;
            if (arg0.field1287 != null) {
                this.field1287[this.field1261] = arg0.field1287[arg1];
            }
            var3 = this.field1261++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lmf;IIIZ)V")
    public final void method463(class136 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class76 var6 = (class76) arg0;
        var6.method460();
        var6.method455();
        field1270++;
        int var7 = 0;
        int[] var8 = var6.field1302;
        int var9 = var6.field1261;
        for (int var10 = 0; var10 < this.field1261; var10++) {
            class150 var13 = this.field1290[var10];
            if (var13.field2753 != 0) {
                int var14 = this.field1291[var10] - arg2;
                if (var14 >= var6.field1266 && var14 <= var6.field1280) {
                    int var15 = this.field1302[var10] - arg1;
                    if (var15 >= var6.field1273 && var15 <= var6.field1305) {
                        int var16 = this.field1300[var10] - arg3;
                        if (var16 >= var6.field1271 && var16 <= var6.field1259) {
                            for (int var17 = 0; var17 < var9; var17++) {
                                class150 var18 = var6.field1290[var17];
                                if (var8[var17] == var15 && var6.field1300[var17] == var16 && var6.field1291[var17] == var14 && var18.field2753 != 0) {
                                    if (this.field1286 == null) {
                                        this.field1286 = new class150[this.field1261];
                                    }
                                    if (var6.field1286 == null) {
                                        var6.field1286 = new class150[var9];
                                    }
                                    class150 var19 = this.field1286[var10];
                                    if (var19 == null) {
                                        var19 = this.field1286[var10] = new class150(var13);
                                    }
                                    class150 var20 = var6.field1286[var17];
                                    if (var20 == null) {
                                        var20 = var6.field1286[var17] = new class150(var18);
                                    }
                                    var19.field2748 += var18.field2748;
                                    var19.field2749 += var18.field2749;
                                    var19.field2740 += var18.field2740;
                                    var19.field2753 += var18.field2753;
                                    var20.field2748 += var13.field2748;
                                    var20.field2749 += var13.field2749;
                                    var20.field2740 += var13.field2740;
                                    var20.field2753 += var13.field2753;
                                    var7++;
                                    field1282[var10] = field1270;
                                    field1298[var17] = field1270;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var7 < 3 || !arg4) {
            return;
        }
        for (int var11 = 0; var11 < this.field1268; var11++) {
            if (field1282[this.field1269[var11]] == field1270 && field1282[this.field1279[var11]] == field1270 && field1282[this.field1260[var11]] == field1270) {
                if (this.field1275 == null) {
                    this.field1275 = new byte[this.field1268];
                }
                this.field1275[var11] = 2;
            }
        }
        for (int var12 = 0; var12 < var6.field1268; var12++) {
            if (field1298[var6.field1269[var12]] == field1270 && field1298[var6.field1279[var12]] == field1270 && field1298[var6.field1260[var12]] == field1270) {
                if (var6.field1275 == null) {
                    var6.field1275 = new byte[var6.field1268];
                }
                var6.field1275[var12] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "()V")
    public final void method464() {
        for (int var1 = 0; var1 < this.field1261; var1++) {
            this.field1302[var1] = -this.field1302[var1];
            this.field1300[var1] = -this.field1300[var1];
        }
        this.method473();
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(SS)V")
    public final void method465(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1268; var3++) {
            if (this.field1307[var3] == arg0) {
                this.field1307[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lpb;II)Lgj;")
    public static final class76 method466(class165 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1079(arg1, 102, arg2);
        return var3 == null ? null : new class76(var3);
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "()Z")
    public final boolean method467() {
        return true;
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "(III)V")
    public final void method468(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1261; var4++) {
            this.field1302[var4] = this.field1302[var4] * arg0 / 128;
            this.field1291[var4] = this.field1291[var4] * arg1 / 128;
            this.field1300[var4] = this.field1300[var4] * arg2 / 128;
        }
        this.method473();
    }

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "()Lgj;")
    public final class76 method469() {
        class76 var1 = new class76();
        if (this.field1275 != null) {
            var1.field1275 = new byte[this.field1268];
            for (int var2 = 0; var2 < this.field1268; var2++) {
                var1.field1275[var2] = this.field1275[var2];
            }
        }
        var1.field1261 = this.field1261;
        var1.field1268 = this.field1268;
        var1.field1281 = this.field1281;
        var1.field1302 = this.field1302;
        var1.field1291 = this.field1291;
        var1.field1300 = this.field1300;
        var1.field1269 = this.field1269;
        var1.field1279 = this.field1279;
        var1.field1260 = this.field1260;
        var1.field1288 = this.field1288;
        var1.field1301 = this.field1301;
        var1.field1262 = this.field1262;
        var1.field1307 = this.field1307;
        var1.field1293 = this.field1293;
        var1.field1276 = this.field1276;
        var1.field1284 = this.field1284;
        var1.field1296 = this.field1296;
        var1.field1274 = this.field1274;
        var1.field1295 = this.field1295;
        var1.field1299 = this.field1299;
        var1.field1306 = this.field1306;
        var1.field1297 = this.field1297;
        var1.field1304 = this.field1304;
        var1.field1277 = this.field1277;
        var1.field1272 = this.field1272;
        var1.field1303 = this.field1303;
        var1.field1278 = this.field1278;
        var1.field1287 = this.field1287;
        var1.field1289 = this.field1289;
        var1.field1265 = this.field1265;
        var1.field1267 = this.field1267;
        var1.field1290 = this.field1290;
        var1.field1264 = this.field1264;
        var1.field1285 = this.field1285;
        var1.field1292 = this.field1292;
        return var1;
    }

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "()V")
    public final void method470() {
        for (int var1 = 0; var1 < this.field1261; var1++) {
            int var2 = this.field1300[var1];
            this.field1300[var1] = this.field1302[var1];
            this.field1302[var1] = -var2;
        }
        this.method473();
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(IIIII)Lug;")
    public final class221 method471(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class242(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "()V")
    public static void method472() {
        field1282 = null;
        field1298 = null;
        field1283 = null;
        field1294 = null;
    }

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "()V")
    private final void method473() {
        this.field1290 = null;
        this.field1286 = null;
        this.field1264 = null;
        this.field1263 = false;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)Lmf;")
    public final class136 method474(int arg0, int arg1, int arg2) {
        return this.method471(this.field1285, this.field1292, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "()I")
    public final int method55() {
        if (!this.field1263) {
            this.method460();
        }
        return this.field1266;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([[IIIIZIZ)Lgj;")
    public final class76 method475(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        this.method460();
        int var8 = this.field1273 + arg1;
        int var9 = this.field1305 + arg1;
        int var10 = this.field1271 + arg3;
        int var11 = this.field1259 + arg3;
        if (var8 < 0 || var9 + 128 >> 7 >= arg0.length || var10 < 0 || var11 + 128 >> 7 >= arg0[0].length) {
            return this;
        }
        int var12 = var8 >> 7;
        int var13 = var9 + 127 >> 7;
        int var14 = var10 >> 7;
        int var15 = var11 + 127 >> 7;
        if (arg0[var12][var14] == arg2 && arg0[var13][var14] == arg2 && arg0[var12][var15] == arg2 && arg0[var13][var15] == arg2) {
            return this;
        }
        class76 var16;
        if (arg4) {
            var16 = new class76();
            var16.field1261 = this.field1261;
            var16.field1268 = this.field1268;
            var16.field1281 = this.field1281;
            var16.field1302 = this.field1302;
            var16.field1300 = this.field1300;
            var16.field1269 = this.field1269;
            var16.field1279 = this.field1279;
            var16.field1260 = this.field1260;
            var16.field1275 = this.field1275;
            var16.field1288 = this.field1288;
            var16.field1301 = this.field1301;
            var16.field1262 = this.field1262;
            var16.field1307 = this.field1307;
            var16.field1293 = this.field1293;
            var16.field1276 = this.field1276;
            var16.field1284 = this.field1284;
            var16.field1296 = this.field1296;
            var16.field1274 = this.field1274;
            var16.field1295 = this.field1295;
            var16.field1299 = this.field1299;
            var16.field1306 = this.field1306;
            var16.field1297 = this.field1297;
            var16.field1304 = this.field1304;
            var16.field1277 = this.field1277;
            var16.field1272 = this.field1272;
            var16.field1303 = this.field1303;
            var16.field1278 = this.field1278;
            var16.field1287 = this.field1287;
            var16.field1289 = this.field1289;
            var16.field1265 = this.field1265;
            var16.field1267 = this.field1267;
            var16.field1285 = this.field1285;
            var16.field1292 = this.field1292;
            var16.field1290 = this.field1290;
            var16.field1264 = this.field1264;
            var16.field1286 = this.field1286;
            var16.field1291 = new int[var16.field1261];
        } else {
            var16 = this;
        }
        if (arg5 == 0) {
            for (int var17 = 0; var17 < var16.field1261; var17++) {
                int var18 = this.field1302[var17] + arg1;
                int var19 = this.field1300[var17] + arg3;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg0[var22][var23] + arg0[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg0[var22][var23 + 1] + arg0[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                var16.field1291[var17] = this.field1291[var17] + var26 - arg2;
            }
        } else {
            for (int var27 = 0; var27 < var16.field1261; var27++) {
                int var28 = (this.field1291[var27] << 16) / this.field1266;
                if (var28 < arg5) {
                    int var29 = this.field1302[var27] + arg1;
                    int var30 = this.field1300[var27] + arg3;
                    int var31 = var29 & 0x7F;
                    int var32 = var30 & 0x7F;
                    int var33 = var29 >> 7;
                    int var34 = var30 >> 7;
                    int var35 = (128 - var31) * arg0[var33][var34] + arg0[var33 + 1][var34] * var31 >> 7;
                    int var36 = (128 - var31) * arg0[var33][var34 + 1] + arg0[var33 + 1][var34 + 1] * var31 >> 7;
                    int var37 = (128 - var32) * var35 + var32 * var36 >> 7;
                    var16.field1291[var27] = (var37 - arg2) * (arg5 - var28) / arg5 + this.field1291[var27];
                } else {
                    var16.field1291[var27] = this.field1291[var27];
                }
            }
        }
        if (arg6) {
            var16.method473();
        } else {
            this.field1263 = false;
        }
        return var16;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "([B)V")
    private final void method476(byte[] arg0) {
        class112 var2 = new class112(arg0);
        class112 var3 = new class112(arg0);
        class112 var4 = new class112(arg0);
        class112 var5 = new class112(arg0);
        class112 var6 = new class112(arg0);
        class112 var7 = new class112(arg0);
        class112 var8 = new class112(arg0);
        var2.field2133 = arg0.length - 23;
        int var9 = var2.method739(-125);
        int var10 = var2.method739(126);
        int var11 = var2.method716(-1308);
        int var12 = var2.method716(-1308);
        int var13 = var2.method716(-1308);
        int var14 = var2.method716(-1308);
        int var15 = var2.method716(-1308);
        int var16 = var2.method716(-1308);
        int var17 = var2.method716(-1308);
        int var18 = var2.method739(-124);
        int var19 = var2.method739(-127);
        int var20 = var2.method739(122);
        int var21 = var2.method739(43);
        int var22 = var2.method739(3);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1284 = new byte[var11];
            var2.field2133 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field1284[var26] = var2.method734(true);
                if (var27 == 0) {
                    var23++;
                }
                if (var27 >= 1 && var27 <= 3) {
                    var24++;
                }
                if (var27 == 2) {
                    var25++;
                }
            }
        }
        int var30 = var9 + var11;
        int var31 = var30;
        if (var12 == 1) {
            var30 += var10;
        }
        int var33 = var10 + var30;
        int var34 = var33;
        if (var13 == 255) {
            var33 += var10;
        }
        int var35 = var33;
        if (var15 == 1) {
            var33 += var10;
        }
        int var36 = var33;
        if (var17 == 1) {
            var33 += var9;
        }
        int var37 = var33;
        if (var14 == 1) {
            var33 += var10;
        }
        int var39 = var21 + var33;
        int var40 = var39;
        if (var16 == 1) {
            var39 += var10 * 2;
        }
        int var42 = var22 + var39;
        int var44 = var10 * 2 + var42;
        int var46 = var18 + var44;
        int var48 = var19 + var46;
        int var50 = var20 + var48;
        int var52 = var23 * 6 + var50;
        int var54 = var24 * 6 + var52;
        int var56 = var24 * 6 + var54;
        int var58 = var24 + var56;
        int var60 = var24 + var58;
        int var62 = var25 * 2 + var24 + var60;
        this.field1261 = var9;
        this.field1268 = var10;
        this.field1281 = var11;
        this.field1302 = new int[var9];
        this.field1291 = new int[var9];
        this.field1300 = new int[var9];
        this.field1269 = new int[var10];
        this.field1279 = new int[var10];
        this.field1260 = new int[var10];
        if (var17 == 1) {
            this.field1287 = new int[var9];
        }
        if (var12 == 1) {
            this.field1275 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1288 = new byte[var10];
        } else {
            this.field1276 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1301 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1289 = new int[var10];
        }
        if (var16 == 1) {
            this.field1293 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1262 = new byte[var10];
        }
        this.field1307 = new short[var10];
        if (var11 > 0) {
            this.field1296 = new short[var11];
            this.field1274 = new short[var11];
            this.field1295 = new short[var11];
            if (var24 > 0) {
                this.field1299 = new short[var24];
                this.field1306 = new short[var24];
                this.field1297 = new short[var24];
                this.field1304 = new byte[var24];
                this.field1277 = new byte[var24];
                this.field1272 = new byte[var24];
            }
            if (var25 > 0) {
                this.field1303 = new byte[var25];
                this.field1278 = new byte[var25];
            }
        }
        var2.field2133 = var11;
        var3.field2133 = var44;
        var4.field2133 = var46;
        var5.field2133 = var48;
        var6.field2133 = var36;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        for (int var66 = 0; var66 < var9; var66++) {
            int var79 = var2.method716(-1308);
            int var80 = 0;
            if ((var79 & 0x1) != 0) {
                var80 = var3.method735(false);
            }
            int var81 = 0;
            if ((var79 & 0x2) != 0) {
                var81 = var4.method735(false);
            }
            int var82 = 0;
            if ((var79 & 0x4) != 0) {
                var82 = var5.method735(false);
            }
            this.field1302[var66] = var63 + var80;
            this.field1291[var66] = var64 + var81;
            this.field1300[var66] = var65 + var82;
            var63 = this.field1302[var66];
            var64 = this.field1291[var66];
            var65 = this.field1300[var66];
            if (var17 == 1) {
                this.field1287[var66] = var6.method716(-1308);
            }
        }
        var2.field2133 = var42;
        var3.field2133 = var31;
        var4.field2133 = var34;
        var5.field2133 = var37;
        var6.field2133 = var35;
        var7.field2133 = var40;
        var8.field2133 = var39;
        for (int var67 = 0; var67 < var10; var67++) {
            this.field1307[var67] = (short) var2.method739(20);
            if (var12 == 1) {
                this.field1275[var67] = var3.method734(true);
            }
            if (var13 == 255) {
                this.field1288[var67] = var4.method734(true);
            }
            if (var14 == 1) {
                this.field1301[var67] = var5.method734(true);
            }
            if (var15 == 1) {
                this.field1289[var67] = var6.method716(-1308);
            }
            if (var16 == 1) {
                this.field1293[var67] = (short) (var7.method739(32) - 1);
            }
            if (this.field1262 != null) {
                if (this.field1293[var67] == -1) {
                    this.field1262[var67] = -1;
                } else {
                    this.field1262[var67] = (byte) (var8.method716(-1308) - 1);
                }
            }
        }
        var2.field2133 = var33;
        var3.field2133 = var30;
        int var68 = 0;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        for (int var72 = 0; var72 < var10; var72++) {
            int var75 = var3.method716(-1308);
            if (var75 == 1) {
                var68 = var2.method735(false) + var71;
                var69 = var2.method735(false) + var68;
                var70 = var2.method735(false) + var69;
                var71 = var70;
                this.field1269[var72] = var68;
                this.field1279[var72] = var69;
                this.field1260[var72] = var70;
            }
            if (var75 == 2) {
                var69 = var70;
                var70 = var2.method735(false) + var71;
                var71 = var70;
                this.field1269[var72] = var68;
                this.field1279[var72] = var69;
                this.field1260[var72] = var70;
            }
            if (var75 == 3) {
                var68 = var70;
                var70 = var2.method735(false) + var71;
                var71 = var70;
                this.field1269[var72] = var68;
                this.field1279[var72] = var69;
                this.field1260[var72] = var70;
            }
            if (var75 == 4) {
                int var78 = var68;
                var68 = var69;
                var69 = var78;
                var70 = var2.method735(false) + var71;
                var71 = var70;
                this.field1269[var72] = var68;
                this.field1279[var72] = var78;
                this.field1260[var72] = var70;
            }
        }
        var2.field2133 = var50;
        var3.field2133 = var52;
        var4.field2133 = var54;
        var5.field2133 = var56;
        var6.field2133 = var58;
        var7.field2133 = var60;
        for (int var73 = 0; var73 < var11; var73++) {
            int var74 = this.field1284[var73] & 0xFF;
            if (var74 == 0) {
                this.field1296[var73] = (short) var2.method739(-127);
                this.field1274[var73] = (short) var2.method739(-125);
                this.field1295[var73] = (short) var2.method739(-125);
            }
            if (var74 == 1) {
                this.field1296[var73] = (short) var3.method739(1);
                this.field1274[var73] = (short) var3.method739(-124);
                this.field1295[var73] = (short) var3.method739(23);
                this.field1299[var73] = (short) var4.method739(-128);
                this.field1306[var73] = (short) var4.method739(58);
                this.field1297[var73] = (short) var4.method739(-126);
                this.field1304[var73] = var5.method734(true);
                this.field1277[var73] = var6.method734(true);
                this.field1272[var73] = var7.method734(true);
            }
            if (var74 == 2) {
                this.field1296[var73] = (short) var3.method739(125);
                this.field1274[var73] = (short) var3.method739(-124);
                this.field1295[var73] = (short) var3.method739(111);
                this.field1299[var73] = (short) var4.method739(124);
                this.field1306[var73] = (short) var4.method739(-124);
                this.field1297[var73] = (short) var4.method739(125);
                this.field1304[var73] = var5.method734(true);
                this.field1277[var73] = var6.method734(true);
                this.field1272[var73] = var7.method734(true);
                this.field1303[var73] = var7.method734(true);
                this.field1278[var73] = var7.method734(true);
            }
            if (var74 == 3) {
                this.field1296[var73] = (short) var3.method739(109);
                this.field1274[var73] = (short) var3.method739(-123);
                this.field1295[var73] = (short) var3.method739(43);
                this.field1299[var73] = (short) var4.method739(-123);
                this.field1306[var73] = (short) var4.method739(37);
                this.field1297[var73] = (short) var4.method739(-128);
                this.field1304[var73] = var5.method734(true);
                this.field1277[var73] = var6.method734(true);
                this.field1272[var73] = var7.method734(true);
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "()V")
    public final void method477() {
        this.field1287 = null;
        this.field1289 = null;
        this.field1265 = null;
        this.field1267 = null;
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
    private class76() {
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "([B)V")
    private class76(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method476(arg0);
        } else {
            this.method454(arg0);
        }
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "([Lgj;I)V")
    public class76(class76[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1261 = 0;
        this.field1268 = 0;
        this.field1281 = 0;
        this.field1276 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class76 var15 = arg0[var9];
            if (var15 != null) {
                this.field1261 += var15.field1261;
                this.field1268 += var15.field1268;
                this.field1281 += var15.field1281;
                if (var15.field1288 == null) {
                    if (this.field1276 == -1) {
                        this.field1276 = var15.field1276;
                    }
                    if (this.field1276 != var15.field1276) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var15.field1275 != null;
                var5 |= var15.field1301 != null;
                var6 |= var15.field1289 != null;
                var7 |= var15.field1293 != null;
                var8 |= var15.field1262 != null;
            }
        }
        this.field1302 = new int[this.field1261];
        this.field1291 = new int[this.field1261];
        this.field1300 = new int[this.field1261];
        this.field1287 = new int[this.field1261];
        this.field1269 = new int[this.field1268];
        this.field1279 = new int[this.field1268];
        this.field1260 = new int[this.field1268];
        if (var3) {
            this.field1275 = new byte[this.field1268];
        }
        if (var4) {
            this.field1288 = new byte[this.field1268];
        }
        if (var5) {
            this.field1301 = new byte[this.field1268];
        }
        if (var6) {
            this.field1289 = new int[this.field1268];
        }
        if (var7) {
            this.field1293 = new short[this.field1268];
        }
        if (var8) {
            this.field1262 = new byte[this.field1268];
        }
        this.field1307 = new short[this.field1268];
        if (this.field1281 > 0) {
            this.field1284 = new byte[this.field1281];
            this.field1296 = new short[this.field1281];
            this.field1274 = new short[this.field1281];
            this.field1295 = new short[this.field1281];
            this.field1299 = new short[this.field1281];
            this.field1306 = new short[this.field1281];
            this.field1297 = new short[this.field1281];
            this.field1304 = new byte[this.field1281];
            this.field1277 = new byte[this.field1281];
            this.field1272 = new byte[this.field1281];
            this.field1303 = new byte[this.field1281];
            this.field1278 = new byte[this.field1281];
        }
        this.field1261 = 0;
        this.field1268 = 0;
        this.field1281 = 0;
        for (int var10 = 0; var10 < arg1; var10++) {
            class76 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field1268; var12++) {
                    if (var3 && var11.field1275 != null) {
                        this.field1275[this.field1268] = var11.field1275[var12];
                    }
                    if (var4) {
                        if (var11.field1288 == null) {
                            this.field1288[this.field1268] = var11.field1276;
                        } else {
                            this.field1288[this.field1268] = var11.field1288[var12];
                        }
                    }
                    if (var5 && var11.field1301 != null) {
                        this.field1301[this.field1268] = var11.field1301[var12];
                    }
                    if (var6 && var11.field1289 != null) {
                        this.field1289[this.field1268] = var11.field1289[var12];
                    }
                    if (var7) {
                        if (var11.field1293 == null) {
                            this.field1293[this.field1268] = -1;
                        } else {
                            this.field1293[this.field1268] = var11.field1293[var12];
                        }
                    }
                    if (var8) {
                        if (var11.field1262 == null || var11.field1262[var12] == -1) {
                            this.field1262[this.field1268] = -1;
                        } else {
                            this.field1262[this.field1268] = (byte) (var11.field1262[var12] + this.field1281);
                        }
                    }
                    this.field1307[this.field1268] = var11.field1307[var12];
                    this.field1269[this.field1268] = this.method462(var11, var11.field1269[var12]);
                    this.field1279[this.field1268] = this.method462(var11, var11.field1279[var12]);
                    this.field1260[this.field1268] = this.method462(var11, var11.field1260[var12]);
                    this.field1268++;
                }
                for (int var13 = 0; var13 < var11.field1281; var13++) {
                    byte var14 = this.field1284[this.field1281] = var11.field1284[var13];
                    if (var14 == 0) {
                        this.field1296[this.field1281] = (short) this.method462(var11, var11.field1296[var13]);
                        this.field1274[this.field1281] = (short) this.method462(var11, var11.field1274[var13]);
                        this.field1295[this.field1281] = (short) this.method462(var11, var11.field1295[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field1296[this.field1281] = var11.field1296[var13];
                        this.field1274[this.field1281] = var11.field1274[var13];
                        this.field1295[this.field1281] = var11.field1295[var13];
                        this.field1299[this.field1281] = var11.field1299[var13];
                        this.field1306[this.field1281] = var11.field1306[var13];
                        this.field1297[this.field1281] = var11.field1297[var13];
                        this.field1304[this.field1281] = var11.field1304[var13];
                        this.field1277[this.field1281] = var11.field1277[var13];
                        this.field1272[this.field1281] = var11.field1272[var13];
                    }
                    if (var14 == 2) {
                        this.field1303[this.field1281] = var11.field1303[var13];
                        this.field1278[this.field1281] = var11.field1278[var13];
                    }
                    this.field1281++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lgj;ZZZZ)V")
    public class76(class76 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1261 = arg0.field1261;
        this.field1268 = arg0.field1268;
        this.field1281 = arg0.field1281;
        if (arg1) {
            this.field1302 = arg0.field1302;
            this.field1291 = arg0.field1291;
            this.field1300 = arg0.field1300;
        } else {
            this.field1302 = new int[this.field1261];
            this.field1291 = new int[this.field1261];
            this.field1300 = new int[this.field1261];
            for (int var6 = 0; var6 < this.field1261; var6++) {
                this.field1302[var6] = arg0.field1302[var6];
                this.field1291[var6] = arg0.field1291[var6];
                this.field1300[var6] = arg0.field1300[var6];
            }
        }
        if (arg2) {
            this.field1307 = arg0.field1307;
        } else {
            this.field1307 = new short[this.field1268];
            for (int var7 = 0; var7 < this.field1268; var7++) {
                this.field1307[var7] = arg0.field1307[var7];
            }
        }
        if (arg3 || arg0.field1293 == null) {
            this.field1293 = arg0.field1293;
        } else {
            this.field1293 = new short[this.field1268];
            for (int var8 = 0; var8 < this.field1268; var8++) {
                this.field1293[var8] = arg0.field1293[var8];
            }
        }
        if (arg4) {
            this.field1301 = arg0.field1301;
        } else {
            this.field1301 = new byte[this.field1268];
            if (arg0.field1301 == null) {
                for (int var9 = 0; var9 < this.field1268; var9++) {
                    this.field1301[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1268; var10++) {
                    this.field1301[var10] = arg0.field1301[var10];
                }
            }
        }
        this.field1269 = arg0.field1269;
        this.field1279 = arg0.field1279;
        this.field1260 = arg0.field1260;
        this.field1275 = arg0.field1275;
        this.field1288 = arg0.field1288;
        this.field1262 = arg0.field1262;
        this.field1276 = arg0.field1276;
        this.field1284 = arg0.field1284;
        this.field1296 = arg0.field1296;
        this.field1274 = arg0.field1274;
        this.field1295 = arg0.field1295;
        this.field1299 = arg0.field1299;
        this.field1306 = arg0.field1306;
        this.field1297 = arg0.field1297;
        this.field1304 = arg0.field1304;
        this.field1277 = arg0.field1277;
        this.field1272 = arg0.field1272;
        this.field1303 = arg0.field1303;
        this.field1278 = arg0.field1278;
        this.field1287 = arg0.field1287;
        this.field1289 = arg0.field1289;
        this.field1265 = arg0.field1265;
        this.field1267 = arg0.field1267;
        this.field1290 = arg0.field1290;
        this.field1264 = arg0.field1264;
        this.field1286 = arg0.field1286;
        this.field1285 = arg0.field1285;
        this.field1292 = arg0.field1292;
    }
}
