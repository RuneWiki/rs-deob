package deob;

@ObfuscatedName("dt")
public class class102 {

    @ObfuscatedName("dt.ak")
    public int field1336;

    @ObfuscatedName("dt.al")
    public class253 field1332;

    @ObfuscatedName("dt.aj")
    public class232[] field1333 = new class232[4];

    @ObfuscatedName("dt.az")
    public int field1349;

    @ObfuscatedName("dt.af")
    public int field1347;

    @ObfuscatedName("dt.aa")
    public int field1331;

    @ObfuscatedName("dt.at")
    public int field1338;

    @ObfuscatedName("dt.ab")
    public int field1334;

    @ObfuscatedName("dt.ac")
    public int[][] field1339;

    @ObfuscatedName("dt.ao")
    public int[][][] field1340;

    @ObfuscatedName("dt.ah")
    public byte[][][] field1341;

    @ObfuscatedName("dt.av")
    public class94[] field1342 = new class94[2048];

    @ObfuscatedName("dt.aq")
    public class111 field1337 = new class111(this);

    @ObfuscatedName("dt.ap")
    public class104[] field1344 = new class104[65536];

    @ObfuscatedName("dt.ae")
    public int field1345;

    @ObfuscatedName("dt.ax")
    public int[] field1346 = new int[65536];

    @ObfuscatedName("dt.ay")
    public class476[] field1348 = new class476[2048];

    @ObfuscatedName("dt.au")
    public int field1335;

    @ObfuscatedName("dt.as")
    public int[] field1351 = new int[2048];

    @ObfuscatedName("dt.aw")
    public class406[][][] field1350;

    @ObfuscatedName("dt.ad")
    public class406 field1343 = new class406();

    @ObfuscatedName("dt.ai")
    public class406 field1352 = new class406();

    @ObfuscatedName("dt.an")
    public class406 field1353 = new class406();

    public class102(int arg0, int arg1, int arg2, int arg3) {
        this.field1336 = arg0;
        this.field1347 = arg1;
        this.field1331 = arg2;
        this.field1350 = new class406[4][arg1][arg2];
        this.field1340 = new int[4][arg1 + 1][arg2 + 1];
        this.field1341 = new byte[4][arg1][arg2];
        this.field1339 = new int[arg1][arg2];
        for (int var5 = 0; var5 < 4; var5++) {
            this.field1333[var5] = new class232(arg1, arg2);
        }
        this.field1332 = new class253(arg0, 4, arg1, arg2, arg3, this.field1340);
    }

    @ObfuscatedName("dt.ak(I)Z")
    public boolean method2516() {
        return this.field1336 == -1;
    }

    @ObfuscatedName("dt.al(I)V")
    public void method2517() {
        this.field1345 = 0;
        this.field1335 = 0;
        for (int var1 = 0; var1 < 2048; var1++) {
            this.field1342[var1] = null;
        }
        for (int var2 = 0; var2 < 65536; var2++) {
            this.field1344[var2] = null;
        }
        for (int var3 = 0; var3 < 2048; var3++) {
            this.field1348[var3] = null;
        }
        this.field1352.method6828();
        this.field1353.method6828();
        this.field1343 = new class406();
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var5 = 0; var5 < this.field1347; var5++) {
                for (int var6 = 0; var6 < this.field1331; var6++) {
                    this.field1350[var4][var5][var6] = null;
                }
            }
        }
        this.field1332.method4501();
        for (int var7 = 0; var7 < 4; var7++) {
            this.field1333[var7].method4112();
        }
    }

    @ObfuscatedName("dt.aj(B)V")
    public void method2522() {
        for (int var1 = 0; var1 < 2048; var1++) {
            this.field1342[var1] = null;
        }
        for (int var2 = 0; var2 < this.field1344.length; var2++) {
            class104 var3 = this.field1344[var2];
            if (var3 != null) {
                var3.field1220 = -1;
                var3.field1241 = false;
            }
        }
    }
}
