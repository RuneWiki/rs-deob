package deob;

@ObfuscatedName("de")
public class class102 {

    @ObfuscatedName("de.aq")
    public int field1329;

    @ObfuscatedName("de.ad")
    public class283 field1317;

    @ObfuscatedName("de.ag")
    public class233[] field1318 = new class233[4];

    @ObfuscatedName("de.ak")
    public int field1319;

    @ObfuscatedName("de.ap")
    public int field1333;

    @ObfuscatedName("de.an")
    public int field1321;

    @ObfuscatedName("de.aj")
    public int field1322;

    @ObfuscatedName("de.av")
    public int field1324;

    @ObfuscatedName("de.ab")
    public int[][] field1339;

    @ObfuscatedName("de.ai")
    public int[][][] field1328;

    @ObfuscatedName("de.ae")
    public byte[][][] field1326;

    @ObfuscatedName("de.au")
    public class94[] field1327 = new class94[2048];

    @ObfuscatedName("de.ah")
    public class111 field1320 = new class111(this);

    @ObfuscatedName("de.az")
    public class104[] field1316 = new class104[65536];

    @ObfuscatedName("de.ax")
    public int field1330;

    @ObfuscatedName("de.ac")
    public int[] field1331 = new int[65536];

    @ObfuscatedName("de.al")
    public class477[] field1332 = new class477[2048];

    @ObfuscatedName("de.ay")
    public int field1323;

    @ObfuscatedName("de.ao")
    public int[] field1334 = new int[2048];

    @ObfuscatedName("de.aa")
    public class407[][][] field1335;

    @ObfuscatedName("de.as")
    public class407 field1336 = new class407();

    @ObfuscatedName("de.aw")
    public class407 field1325 = new class407();

    @ObfuscatedName("de.at")
    public class407 field1338 = new class407();

    public class102(int arg0, int arg1, int arg2, int arg3) {
        this.field1329 = arg0;
        this.field1333 = arg1;
        this.field1321 = arg2;
        this.field1335 = new class407[4][arg1][arg2];
        this.field1328 = new int[4][arg1 + 1][arg2 + 1];
        this.field1326 = new byte[4][arg1][arg2];
        this.field1339 = new int[arg1][arg2];
        for (int var5 = 0; var5 < 4; var5++) {
            this.field1318[var5] = new class233(arg1, arg2);
        }
        this.field1317 = new class283(arg0, 4, arg1, arg2, arg3, this.field1328);
    }

    @ObfuscatedName("de.aq(B)Z")
    public boolean method2547() {
        return this.field1329 == -1;
    }

    @ObfuscatedName("de.ad(I)V")
    public void method2548() {
        this.field1330 = 0;
        this.field1323 = 0;
        for (int var1 = 0; var1 < 2048; var1++) {
            this.field1327[var1] = null;
        }
        for (int var2 = 0; var2 < 65536; var2++) {
            this.field1316[var2] = null;
        }
        for (int var3 = 0; var3 < 2048; var3++) {
            this.field1332[var3] = null;
        }
        this.field1325.method6806();
        this.field1338.method6806();
        this.field1336 = new class407();
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var5 = 0; var5 < this.field1333; var5++) {
                for (int var6 = 0; var6 < this.field1321; var6++) {
                    this.field1335[var4][var5][var6] = null;
                }
            }
        }
        this.field1317.method4926();
        for (int var7 = 0; var7 < 4; var7++) {
            this.field1318[var7].method4057();
        }
    }

    @ObfuscatedName("de.ag(I)V")
    public void method2551() {
        for (int var1 = 0; var1 < 2048; var1++) {
            this.field1327[var1] = null;
        }
        for (int var2 = 0; var2 < this.field1316.length; var2++) {
            class104 var3 = this.field1316[var2];
            if (var3 != null) {
                var3.field1191 = -1;
                var3.field1210 = false;
            }
        }
    }
}
