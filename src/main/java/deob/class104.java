package deob;

@ObfuscatedName("dn")
public class class104 extends class515 {

    @ObfuscatedName("dn.ap")
    public int field1354;

    @ObfuscatedName("dn.aw")
    public class245 field1352;

    @ObfuscatedName("dn.ak")
    public class271[] field1343 = new class271[4];

    @ObfuscatedName("dn.aj")
    public int field1344;

    @ObfuscatedName("dn.ai")
    public int field1345;

    @ObfuscatedName("dn.ay")
    public int field1346;

    @ObfuscatedName("dn.as")
    public int field1347;

    @ObfuscatedName("dn.ae")
    public int field1348;

    @ObfuscatedName("dn.am")
    public int[][] field1349;

    @ObfuscatedName("dn.at")
    public int[][][] field1350;

    @ObfuscatedName("dn.au")
    public byte[][][] field1351;

    @ObfuscatedName("dn.an")
    public class95[] field1357 = new class95[2048];

    @ObfuscatedName("dn.ao")
    public class106[] field1353 = new class106[65536];

    @ObfuscatedName("dn.af")
    public int field1360;

    @ObfuscatedName("dn.ar")
    public int[] field1342 = new int[65536];

    @ObfuscatedName("dn.ab")
    public class481[] field1355 = new class481[2048];

    @ObfuscatedName("dn.az")
    public int field1356;

    @ObfuscatedName("dn.ag")
    public int[] field1358 = new int[2048];

    @ObfuscatedName("dn.ad")
    public class411[][][] field1359;

    @ObfuscatedName("dn.ac")
    public class411 field1341 = new class411();

    @ObfuscatedName("dn.av")
    public class411 field1361 = new class411();

    @ObfuscatedName("dn.ax")
    public class411 field1362 = new class411();

    public class104(int arg0, int arg1, int arg2, int arg3, class233 arg4) {
        this.field1354 = arg0;
        this.field1345 = arg1;
        this.field1346 = arg2;
        this.field1359 = new class411[4][arg1][arg2];
        this.field1350 = new int[4][arg1 + 1][arg2 + 1];
        this.field1351 = new byte[4][arg1][arg2];
        this.field1349 = new int[arg1][arg2];
        for (int var6 = 0; var6 < 4; var6++) {
            this.field1343[var6] = new class271(arg1, arg2);
        }
        this.field1352 = new class245(arg0, 4, arg1, arg2, arg3, arg4, this.field1350);
    }

    @ObfuscatedName("dn.ap(S)V")
    public void method2834() {
        this.field1360 = 0;
        this.field1356 = 0;
        for (int var1 = 0; var1 < 2048; var1++) {
            this.field1357[var1] = null;
        }
        for (int var2 = 0; var2 < 65536; var2++) {
            this.field1353[var2] = null;
        }
        for (int var3 = 0; var3 < 2048; var3++) {
            this.field1355[var3] = null;
        }
        this.field1361.method7248();
        this.field1362.method7248();
        this.field1341 = new class411();
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var5 = 0; var5 < this.field1345; var5++) {
                for (int var6 = 0; var6 < this.field1346; var6++) {
                    this.field1359[var4][var5][var6] = null;
                }
            }
        }
        this.field1352.method4676();
        for (int var7 = 0; var7 < 4; var7++) {
            this.field1343[var7].method5280();
        }
    }

    @ObfuscatedName("dn.aw(I)V")
    public void method2835() {
        for (int var1 = 0; var1 < 2048; var1++) {
            this.field1357[var1] = null;
        }
        for (int var2 = 0; var2 < this.field1353.length; var2++) {
            class106 var3 = this.field1353[var2];
            if (var3 != null) {
                var3.field1241 = -1;
                var3.field1253 = false;
            }
        }
    }
}
