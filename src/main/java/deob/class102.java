package deob;

@ObfuscatedName("dy")
public class class102 {

    @ObfuscatedName("dy.ab")
    public int field1312;

    @ObfuscatedName("dy.ay")
    public class186 field1328;

    @ObfuscatedName("dy.an")
    public class269[] field1305 = new class269[4];

    @ObfuscatedName("dy.au")
    public int field1308;

    @ObfuscatedName("dy.ax")
    public int field1309;

    @ObfuscatedName("dy.ao")
    public int field1310;

    @ObfuscatedName("dy.am")
    public int field1311;

    @ObfuscatedName("dy.ac")
    public int field1319;

    @ObfuscatedName("dy.ae")
    public int[][] field1313;

    @ObfuscatedName("dy.ad")
    public int[][][] field1314;

    @ObfuscatedName("dy.aq")
    public byte[][][] field1315;

    @ObfuscatedName("dy.al")
    public class94[] field1317 = new class94[2048];

    @ObfuscatedName("dy.aj")
    public class111 field1322 = new class111(this);

    @ObfuscatedName("dy.as")
    public class104[] field1318 = new class104[65536];

    @ObfuscatedName("dy.aw")
    public int field1316;

    @ObfuscatedName("dy.af")
    public int[] field1320 = new int[65536];

    @ObfuscatedName("dy.aa")
    public class478[] field1321 = new class478[2048];

    @ObfuscatedName("dy.ah")
    public int field1307;

    @ObfuscatedName("dy.ag")
    public int[] field1323 = new int[2048];

    @ObfuscatedName("dy.av")
    public class408[][][] field1324;

    @ObfuscatedName("dy.ar")
    public class408 field1325 = new class408();

    @ObfuscatedName("dy.ap")
    public class408 field1326 = new class408();

    @ObfuscatedName("dy.ak")
    public class408 field1327 = new class408();

    public class102(int arg0, int arg1, int arg2, int arg3, class174 arg4) {
        this.field1312 = arg0;
        this.field1309 = arg1;
        this.field1310 = arg2;
        this.field1324 = new class408[4][arg1][arg2];
        this.field1314 = new int[4][arg1 + 1][arg2 + 1];
        this.field1315 = new byte[4][arg1][arg2];
        this.field1313 = new int[arg1][arg2];
        for (int var6 = 0; var6 < 4; var6++) {
            this.field1305[var6] = new class269(arg1, arg2);
        }
        this.field1328 = new class186(arg0, 4, arg1, arg2, arg3, arg4, this.field1314);
    }

    @ObfuscatedName("dy.ab(B)Z")
    public boolean method2615() {
        return this.field1312 == -1;
    }

    @ObfuscatedName("dy.ay(B)V")
    public void method2616() {
        this.field1316 = 0;
        this.field1307 = 0;
        for (int var1 = 0; var1 < 2048; var1++) {
            this.field1317[var1] = null;
        }
        for (int var2 = 0; var2 < 65536; var2++) {
            this.field1318[var2] = null;
        }
        for (int var3 = 0; var3 < 2048; var3++) {
            this.field1321[var3] = null;
        }
        this.field1326.method6898();
        this.field1327.method6898();
        this.field1325 = new class408();
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var5 = 0; var5 < this.field1309; var5++) {
                for (int var6 = 0; var6 < this.field1310; var6++) {
                    this.field1324[var4][var5][var6] = null;
                }
            }
        }
        this.field1328.method3598();
        for (int var7 = 0; var7 < 4; var7++) {
            this.field1305[var7].method4986();
        }
    }

    @ObfuscatedName("dy.an(I)V")
    public void method2617() {
        for (int var1 = 0; var1 < 2048; var1++) {
            this.field1317[var1] = null;
        }
        for (int var2 = 0; var2 < this.field1318.length; var2++) {
            class104 var3 = this.field1318[var2];
            if (var3 != null) {
                var3.field1215 = -1;
                var3.field1216 = false;
            }
        }
    }
}
