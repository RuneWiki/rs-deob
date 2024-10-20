package deob;

@ObfuscatedName("dd")
public class class104 extends class508 {

    @ObfuscatedName("dd.ac")
    public int field1354;

    @ObfuscatedName("dd.ae")
    public class245 field1372;

    @ObfuscatedName("dd.ag")
    public class271[] field1352 = new class271[4];

    @ObfuscatedName("dd.am")
    public int field1356;

    @ObfuscatedName("dd.ax")
    public int field1359;

    @ObfuscatedName("dd.aq")
    public int field1355;

    @ObfuscatedName("dd.af")
    public int field1350;

    @ObfuscatedName("dd.at")
    public int field1357;

    @ObfuscatedName("dd.au")
    public int[][] field1358;

    @ObfuscatedName("dd.ar")
    public int[][][] field1371;

    @ObfuscatedName("dd.al")
    public byte[][][] field1360;

    @ObfuscatedName("dd.ad")
    public class95[] field1369 = new class95[2048];

    @ObfuscatedName("dd.ah")
    public class106[] field1362 = new class106[65536];

    @ObfuscatedName("dd.ap")
    public int field1367;

    @ObfuscatedName("dd.ab")
    public int[] field1351 = new int[65536];

    @ObfuscatedName("dd.az")
    public class480[] field1365 = new class480[2048];

    @ObfuscatedName("dd.aa")
    public int field1366;

    @ObfuscatedName("dd.ai")
    public int[] field1364 = new int[2048];

    @ObfuscatedName("dd.ao")
    public class410[][][] field1368;

    @ObfuscatedName("dd.as")
    public class410 field1353 = new class410();

    @ObfuscatedName("dd.ay")
    public class410 field1370 = new class410();

    @ObfuscatedName("dd.aj")
    public class410 field1363 = new class410();

    public class104(int arg0, int arg1, int arg2, int arg3, class233 arg4) {
        this.field1354 = arg0;
        this.field1359 = arg1;
        this.field1355 = arg2;
        this.field1368 = new class410[4][arg1][arg2];
        this.field1371 = new int[4][arg1 + 1][arg2 + 1];
        this.field1360 = new byte[4][arg1][arg2];
        this.field1358 = new int[arg1][arg2];
        for (int var6 = 0; var6 < 4; var6++) {
            this.field1352[var6] = new class271(arg1, arg2);
        }
        this.field1372 = new class245(arg0, 4, arg1, arg2, arg3, arg4, this.field1371);
    }

    @ObfuscatedName("dd.ac(I)V")
    public void method2723() {
        this.field1367 = 0;
        this.field1366 = 0;
        for (int var1 = 0; var1 < 2048; var1++) {
            this.field1369[var1] = null;
        }
        for (int var2 = 0; var2 < 65536; var2++) {
            this.field1362[var2] = null;
        }
        for (int var3 = 0; var3 < 2048; var3++) {
            this.field1365[var3] = null;
        }
        this.field1370.method7023();
        this.field1363.method7023();
        this.field1353 = new class410();
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var5 = 0; var5 < this.field1359; var5++) {
                for (int var6 = 0; var6 < this.field1355; var6++) {
                    this.field1368[var4][var5][var6] = null;
                }
            }
        }
        this.field1372.method4497();
        for (int var7 = 0; var7 < 4; var7++) {
            this.field1352[var7].method5098();
        }
    }

    @ObfuscatedName("dd.ae(I)V")
    public void method2719() {
        for (int var1 = 0; var1 < 2048; var1++) {
            this.field1369[var1] = null;
        }
        for (int var2 = 0; var2 < this.field1362.length; var2++) {
            class106 var3 = this.field1362[var2];
            if (var3 != null) {
                var3.field1253 = -1;
                var3.field1237 = false;
            }
        }
    }
}
