package deob;

@ObfuscatedName("cl")
public abstract class class100 extends class200 {

    @ObfuscatedName("cl.ah")
    public int field1242;

    @ObfuscatedName("cl.az")
    public int field1223;

    @ObfuscatedName("cl.ap")
    public int field1224;

    @ObfuscatedName("cl.ag")
    public boolean field1225 = false;

    @ObfuscatedName("cl.ab")
    public int field1226 = 1;

    @ObfuscatedName("cl.aq")
    public int field1227;

    @ObfuscatedName("cl.ae")
    public int field1248 = -1;

    @ObfuscatedName("cl.ao")
    public int field1229 = -1;

    @ObfuscatedName("cl.an")
    public int field1230 = -1;

    @ObfuscatedName("cl.al")
    public int field1253 = -1;

    @ObfuscatedName("cl.aj")
    public int field1267 = -1;

    @ObfuscatedName("cl.ac")
    public int field1256 = -1;

    @ObfuscatedName("cl.as")
    public int field1234 = -1;

    @ObfuscatedName("cl.au")
    public int field1235 = -1;

    @ObfuscatedName("cl.ay")
    public String field1232 = null;

    @ObfuscatedName("cl.am")
    public boolean field1237;

    @ObfuscatedName("cl.aa")
    public boolean field1254 = false;

    @ObfuscatedName("cl.ai")
    public int field1239 = 100;

    @ObfuscatedName("cl.av")
    public int field1240 = 0;

    @ObfuscatedName("cl.ax")
    public int field1241 = 0;

    @ObfuscatedName("cl.af")
    public byte field1236 = 0;

    @ObfuscatedName("cl.bq")
    public int[] field1262 = new int[4];

    @ObfuscatedName("cl.bx")
    public int[] field1244 = new int[4];

    @ObfuscatedName("cl.bi")
    public int[] field1245 = new int[4];

    @ObfuscatedName("cl.bz")
    public int[] field1246 = new int[4];

    @ObfuscatedName("cl.bb")
    public int[] field1247 = new int[4];

    @ObfuscatedName("cl.bv")
    public class297 field1251 = new class297();

    @ObfuscatedName("cl.bc")
    public int field1231 = -1;

    @ObfuscatedName("cl.be")
    public boolean field1250 = false;

    @ObfuscatedName("cl.ba")
    public int field1281 = -1;

    @ObfuscatedName("cl.bs")
    public int field1252 = -1;

    @ObfuscatedName("cl.br")
    public int field1222 = 0;

    @ObfuscatedName("cl.bw")
    public int field1249 = 0;

    @ObfuscatedName("cl.by")
    public int field1255 = -1;

    @ObfuscatedName("cl.bt")
    public int field1272 = 0;

    @ObfuscatedName("cl.bg")
    public int field1257 = 0;

    @ObfuscatedName("cl.bm")
    public int field1258 = 0;

    @ObfuscatedName("cl.bj")
    public int field1259 = 0;

    @ObfuscatedName("cl.bo")
    public int field1260 = -1;

    @ObfuscatedName("cl.bn")
    public int field1261 = 0;

    @ObfuscatedName("cl.bu")
    public int field1238 = 0;

    @ObfuscatedName("cl.bl")
    public int field1263;

    @ObfuscatedName("cl.bd")
    public int field1264;

    @ObfuscatedName("cl.bp")
    public int field1265;

    @ObfuscatedName("cl.bk")
    public int field1266;

    @ObfuscatedName("cl.bh")
    public int field1269;

    @ObfuscatedName("cl.bf")
    public int field1268;

    @ObfuscatedName("cl.cm")
    public int field1277;

    @ObfuscatedName("cl.cx")
    public int field1270;

    @ObfuscatedName("cl.cq")
    public int field1271;

    @ObfuscatedName("cl.cz")
    public int field1233 = 0;

    @ObfuscatedName("cl.cc")
    public int field1273 = 200;

    @ObfuscatedName("cl.cu")
    public int field1274;

    @ObfuscatedName("cl.cp")
    public int field1275 = 0;

    @ObfuscatedName("cl.cv")
    public int field1276 = 32;

    @ObfuscatedName("cl.cf")
    public int field1228 = 0;

    @ObfuscatedName("cl.cb")
    public int[] field1278 = new int[10];

    @ObfuscatedName("cl.cg")
    public int[] field1279 = new int[10];

    @ObfuscatedName("cl.ca")
    public byte[] field1280 = new byte[10];

    @ObfuscatedName("cl.cd")
    public int field1243 = 0;

    @ObfuscatedName("cl.ce")
    public int field1282 = 0;

    @ObfuscatedName("cl.bi(I)V")
    public final void method2000() {
        this.field1228 = 0;
        this.field1282 = 0;
    }

    @ObfuscatedName("cl.x(B)Z")
    public boolean method1987() {
        return false;
    }

    @ObfuscatedName("cl.bz(IIIIIIB)V")
    public final void method2001(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field1245[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class154 var13 = class154.method942(arg0);
            var11 = var13.field1748;
            var12 = var13.field1739;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field1245[0];
            } else if (var11 == 1) {
                var14 = this.field1244[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field1245[var15] < var14) {
                        var10 = var15;
                        var14 = this.field1245[var15];
                    }
                } else if (var11 == 1 && this.field1244[var15] < var14) {
                    var10 = var15;
                    var14 = this.field1244[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field1236 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field1236;
                this.field1236 = (byte) ((this.field1236 + 1) % 4);
                if (this.field1245[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field1262[var10] = arg0;
        this.field1244[var10] = arg1;
        this.field1246[var10] = arg2;
        this.field1247[var10] = arg3;
        this.field1245[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("cl.bb(IIIIIIB)V")
    public final void method2002(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class143 var7 = class143.method4686(arg0);
        class104 var8 = null;
        class104 var9 = null;
        int var10 = var7.field1605;
        int var11 = 0;
        for (class104 var12 = (class104) this.field1251.method4771(); var12 != null; var12 = (class104) this.field1251.method4773()) {
            var11++;
            if (var12.field1326.field1603 == var7.field1603) {
                var12.method2066(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field1326.field1614 <= var7.field1614) {
                var8 = var12;
            }
            if (var12.field1326.field1605 > var10) {
                var9 = var12;
                var10 = var12.field1326.field1605;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class104 var13 = new class104(var7);
        if (var8 == null) {
            this.field1251.method4769(var13);
        } else {
            class297.method4820(var13, var8);
        }
        var13.method2066(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method5407();
        }
    }

    @ObfuscatedName("cl.bv(II)V")
    public final void method2012(int arg0) {
        class143 var2 = class143.method4686(arg0);
        for (class104 var3 = (class104) this.field1251.method4771(); var3 != null; var3 = (class104) this.field1251.method4773()) {
            if (var3.field1326 == var2) {
                var3.method5407();
                return;
            }
        }
    }
}
