package deob;

@ObfuscatedName("cd")
public abstract class class100 extends class177 {

    @ObfuscatedName("cd.ag")
    public int field1232;

    @ObfuscatedName("cd.aq")
    public int field1210;

    @ObfuscatedName("cd.at")
    public int field1213;

    @ObfuscatedName("cd.aj")
    public boolean field1212 = false;

    @ObfuscatedName("cd.aw")
    public int field1259 = 1;

    @ObfuscatedName("cd.ap")
    public int field1251;

    @ObfuscatedName("cd.ax")
    public int field1211 = -1;

    @ObfuscatedName("cd.as")
    public int field1252 = -1;

    @ObfuscatedName("cd.ad")
    public int field1217 = -1;

    @ObfuscatedName("cd.af")
    public int field1218 = -1;

    @ObfuscatedName("cd.ao")
    public int field1219 = -1;

    @ObfuscatedName("cd.ai")
    public int field1220 = -1;

    @ObfuscatedName("cd.av")
    public int field1247 = -1;

    @ObfuscatedName("cd.az")
    public int field1222 = -1;

    @ObfuscatedName("cd.au")
    public String field1223 = null;

    @ObfuscatedName("cd.ab")
    public boolean field1224;

    @ObfuscatedName("cd.aa")
    public boolean field1209 = false;

    @ObfuscatedName("cd.al")
    public int field1242 = 100;

    @ObfuscatedName("cd.ar")
    public int field1227 = 0;

    @ObfuscatedName("cd.ak")
    public int field1228 = 0;

    @ObfuscatedName("cd.ah")
    public byte field1229 = 0;

    @ObfuscatedName("cd.ae")
    public int[] field1258 = new int[4];

    @ObfuscatedName("cd.bh")
    public int[] field1231 = new int[4];

    @ObfuscatedName("cd.br")
    public int[] field1215 = new int[4];

    @ObfuscatedName("cd.bn")
    public int[] field1233 = new int[4];

    @ObfuscatedName("cd.bi")
    public int[] field1234 = new int[4];

    @ObfuscatedName("cd.bb")
    public class274 field1235 = new class274();

    @ObfuscatedName("cd.bk")
    public int field1236 = -1;

    @ObfuscatedName("cd.bt")
    public boolean field1230 = false;

    @ObfuscatedName("cd.ba")
    public int field1238 = -1;

    @ObfuscatedName("cd.be")
    public int field1261 = -1;

    @ObfuscatedName("cd.bo")
    public int field1244 = 0;

    @ObfuscatedName("cd.bp")
    public int field1255 = 0;

    @ObfuscatedName("cd.bj")
    public int field1216 = -1;

    @ObfuscatedName("cd.bw")
    public int field1243 = 0;

    @ObfuscatedName("cd.by")
    public int field1237 = 0;

    @ObfuscatedName("cd.bq")
    public int field1245 = 0;

    @ObfuscatedName("cd.bf")
    public int field1246 = 0;

    @ObfuscatedName("cd.bc")
    public int field1257 = -1;

    @ObfuscatedName("cd.bv")
    public int field1248 = 0;

    @ObfuscatedName("cd.bd")
    public int field1249 = 0;

    @ObfuscatedName("cd.bg")
    public int field1250;

    @ObfuscatedName("cd.bs")
    public int field1239;

    @ObfuscatedName("cd.bm")
    public int field1241;

    @ObfuscatedName("cd.bz")
    public int field1253;

    @ObfuscatedName("cd.bu")
    public int field1254;

    @ObfuscatedName("cd.bl")
    public int field1240;

    @ObfuscatedName("cd.bx")
    public int field1256;

    @ObfuscatedName("cd.cw")
    public int field1269;

    @ObfuscatedName("cd.cf")
    public int field1214;

    @ObfuscatedName("cd.co")
    public int field1221 = 0;

    @ObfuscatedName("cd.cx")
    public int field1260 = 200;

    @ObfuscatedName("cd.cp")
    public int field1226;

    @ObfuscatedName("cd.cg")
    public int field1262 = 0;

    @ObfuscatedName("cd.ce")
    public int field1263 = 32;

    @ObfuscatedName("cd.cz")
    public int field1264 = 0;

    @ObfuscatedName("cd.cc")
    public int[] field1265 = new int[10];

    @ObfuscatedName("cd.cn")
    public int[] field1266 = new int[10];

    @ObfuscatedName("cd.ca")
    public byte[] field1267 = new byte[10];

    @ObfuscatedName("cd.ch")
    public int field1268 = 0;

    @ObfuscatedName("cd.cq")
    public int field1225 = 0;

    @ObfuscatedName("cd.af(B)V")
    public final void method1888() {
        this.field1264 = 0;
        this.field1225 = 0;
    }

    @ObfuscatedName("cd.j(B)Z")
    public boolean method1857() {
        return false;
    }

    @ObfuscatedName("cd.ao(IIIIIII)V")
    public final void method1887(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field1215[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class294 var13 = class294.method3861(arg0);
            var11 = var13.field3587;
            var12 = var13.field3582;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field1215[0];
            } else if (var11 == 1) {
                var14 = this.field1231[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field1215[var15] < var14) {
                        var10 = var15;
                        var14 = this.field1215[var15];
                    }
                } else if (var11 == 1 && this.field1231[var15] < var14) {
                    var10 = var15;
                    var14 = this.field1231[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field1229 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field1229;
                this.field1229 = (byte) ((this.field1229 + 1) % 4);
                if (this.field1215[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field1258[var10] = arg0;
        this.field1231[var10] = arg1;
        this.field1233[var10] = arg2;
        this.field1234[var10] = arg3;
        this.field1215[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("cd.ai(IIIIIII)V")
    public final void method1890(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class283 var7 = (class283) class283.field3442.method3398((long) arg0);
        class283 var8;
        if (var7 == null) {
            byte[] var9 = Statics.field3455.method3933(33, arg0);
            class283 var10 = new class283();
            if (var9 != null) {
                var10.method4402(new class382(var9));
            }
            class283.field3442.method3400(var10, (long) arg0);
            var8 = var10;
        } else {
            var8 = var7;
        }
        class283 var11 = var8;
        class104 var12 = null;
        class104 var13 = null;
        int var14 = var8.field3448;
        int var15 = 0;
        for (class104 var16 = (class104) this.field1235.method4212(); var16 != null; var16 = (class104) this.field1235.method4213()) {
            var15++;
            if (var16.field1314.field3446 == var11.field3446) {
                var16.method1951(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var16.field1314.field3447 <= var11.field3447) {
                var12 = var16;
            }
            if (var16.field1314.field3448 > var14) {
                var13 = var16;
                var14 = var16.field1314.field3448;
            }
        }
        if (var13 == null && var15 >= 4) {
            return;
        }
        class104 var17 = new class104(var11);
        if (var12 == null) {
            this.field1235.method4210(var17);
        } else {
            class274.method4211(var17, var12);
        }
        var17.method1951(arg1 + arg3, arg4, arg5, arg2);
        if (var15 >= 4) {
            var13.method5354();
        }
    }

    @ObfuscatedName("cd.av(II)V")
    public final void method1889(int arg0) {
        class283 var2 = (class283) class283.field3442.method3398((long) arg0);
        class283 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3455.method3933(33, arg0);
            class283 var5 = new class283();
            if (var4 != null) {
                var5.method4402(new class382(var4));
            }
            class283.field3442.method3400(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        class283 var6 = var3;
        for (class104 var7 = (class104) this.field1235.method4212(); var7 != null; var7 = (class104) this.field1235.method4213()) {
            if (var7.field1314 == var6) {
                var7.method5354();
                return;
            }
        }
    }
}
