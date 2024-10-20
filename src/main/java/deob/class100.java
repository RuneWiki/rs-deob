package deob;

@ObfuscatedName("cy")
public abstract class class100 extends class199 {

    @ObfuscatedName("cy.ad")
    public int field1238;

    @ObfuscatedName("cy.ai")
    public int field1237;

    @ObfuscatedName("cy.ar")
    public int field1280;

    @ObfuscatedName("cy.ag")
    public boolean field1256 = false;

    @ObfuscatedName("cy.ax")
    public int field1240 = 1;

    @ObfuscatedName("cy.as")
    public int field1241;

    @ObfuscatedName("cy.aj")
    public int field1242 = -1;

    @ObfuscatedName("cy.am")
    public int field1282 = -1;

    @ObfuscatedName("cy.az")
    public int field1244 = -1;

    @ObfuscatedName("cy.av")
    public int field1245 = -1;

    @ObfuscatedName("cy.ac")
    public int field1268 = -1;

    @ObfuscatedName("cy.at")
    public int field1293 = -1;

    @ObfuscatedName("cy.ah")
    public int field1248 = -1;

    @ObfuscatedName("cy.ao")
    public int field1294 = -1;

    @ObfuscatedName("cy.aq")
    public String field1250 = null;

    @ObfuscatedName("cy.aw")
    public boolean field1251;

    @ObfuscatedName("cy.af")
    public boolean field1249 = false;

    @ObfuscatedName("cy.ak")
    public int field1253 = 100;

    @ObfuscatedName("cy.ay")
    public int field1254 = 0;

    @ObfuscatedName("cy.aa")
    public int field1255 = 0;

    @ObfuscatedName("cy.an")
    public byte field1236 = 0;

    @ObfuscatedName("cy.bd")
    public int[] field1257 = new int[4];

    @ObfuscatedName("cy.bt")
    public int[] field1258 = new int[4];

    @ObfuscatedName("cy.bq")
    public int[] field1259 = new int[4];

    @ObfuscatedName("cy.bu")
    public int[] field1260 = new int[4];

    @ObfuscatedName("cy.bl")
    public int[] field1261 = new int[4];

    @ObfuscatedName("cy.bv")
    public class296 field1262 = new class296();

    @ObfuscatedName("cy.bm")
    public int field1289 = -1;

    @ObfuscatedName("cy.bz")
    public boolean field1264 = false;

    @ObfuscatedName("cy.bh")
    public int field1265 = -1;

    @ObfuscatedName("cy.bs")
    public int field1243 = -1;

    @ObfuscatedName("cy.br")
    public int field1252 = 0;

    @ObfuscatedName("cy.bf")
    public int field1296 = 0;

    @ObfuscatedName("cy.ba")
    public int field1269 = -1;

    @ObfuscatedName("cy.be")
    public int field1292 = 0;

    @ObfuscatedName("cy.bj")
    public int field1271 = 0;

    @ObfuscatedName("cy.bx")
    public int field1272 = 0;

    @ObfuscatedName("cy.bp")
    public int field1246 = 0;

    @ObfuscatedName("cy.bn")
    public int field1274 = -1;

    @ObfuscatedName("cy.bo")
    public int field1263 = 0;

    @ObfuscatedName("cy.bw")
    public int field1276 = 0;

    @ObfuscatedName("cy.bi")
    public int field1288;

    @ObfuscatedName("cy.bb")
    public int field1278;

    @ObfuscatedName("cy.bk")
    public int field1279;

    @ObfuscatedName("cy.bg")
    public int field1270;

    @ObfuscatedName("cy.by")
    public int field1281;

    @ObfuscatedName("cy.bc")
    public int field1239;

    @ObfuscatedName("cy.cd")
    public int field1266;

    @ObfuscatedName("cy.cm")
    public int field1284;

    @ObfuscatedName("cy.cv")
    public int field1285;

    @ObfuscatedName("cy.cp")
    public int field1286 = 0;

    @ObfuscatedName("cy.ci")
    public int field1277 = 200;

    @ObfuscatedName("cy.ct")
    public int field1267;

    @ObfuscatedName("cy.cq")
    public int field1283 = 0;

    @ObfuscatedName("cy.cr")
    public int field1290 = 32;

    @ObfuscatedName("cy.cf")
    public int field1291 = 0;

    @ObfuscatedName("cy.cn")
    public int[] field1273 = new int[10];

    @ObfuscatedName("cy.cs")
    public int[] field1287 = new int[10];

    @ObfuscatedName("cy.cg")
    public byte[] field1247 = new byte[10];

    @ObfuscatedName("cy.co")
    public int field1295 = 0;

    @ObfuscatedName("cy.ck")
    public int field1275 = 0;

    @ObfuscatedName("cy.be(I)V")
    public final void method1975() {
        this.field1291 = 0;
        this.field1275 = 0;
    }

    @ObfuscatedName("cy.m(B)Z")
    public boolean method1968() {
        return false;
    }

    @ObfuscatedName("cy.bj(IIIIIIB)V")
    public final void method1977(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field1259[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class153 var13 = class153.method1779(arg0);
            var11 = var13.field1744;
            var12 = var13.field1732;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field1259[0];
            } else if (var11 == 1) {
                var14 = this.field1258[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field1259[var15] < var14) {
                        var10 = var15;
                        var14 = this.field1259[var15];
                    }
                } else if (var11 == 1 && this.field1258[var15] < var14) {
                    var10 = var15;
                    var14 = this.field1258[var15];
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
                if (this.field1259[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field1257[var10] = arg0;
        this.field1258[var10] = arg1;
        this.field1260[var10] = arg2;
        this.field1261[var10] = arg3;
        this.field1259[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("cy.bx(IIIIIIB)V")
    public final void method1983(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class142 var7 = class142.method2274(arg0);
        class104 var8 = null;
        class104 var9 = null;
        int var10 = var7.field1599;
        int var11 = 0;
        for (class104 var12 = (class104) this.field1262.method4767(); var12 != null; var12 = (class104) this.field1262.method4769()) {
            var11++;
            if (var12.field1340.field1597 == var7.field1597) {
                var12.method2048(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field1340.field1598 <= var7.field1598) {
                var8 = var12;
            }
            if (var12.field1340.field1599 > var10) {
                var9 = var12;
                var10 = var12.field1340.field1599;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class104 var13 = new class104(var7);
        if (var8 == null) {
            this.field1262.method4765(var13);
        } else {
            class296.method4812(var13, var8);
        }
        var13.method2048(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method5496();
        }
    }

    @ObfuscatedName("cy.bp(IB)V")
    public final void method1987(int arg0) {
        class142 var2 = class142.method2274(arg0);
        for (class104 var3 = (class104) this.field1262.method4767(); var3 != null; var3 = (class104) this.field1262.method4769()) {
            if (var3.field1340 == var2) {
                var3.method5496();
                return;
            }
        }
    }
}
