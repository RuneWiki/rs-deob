import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class77 {

    @OriginalMember(owner = "client!fv", name = "o", descriptor = "I")
    public int field1292;

    @OriginalMember(owner = "client!fv", name = "k", descriptor = "I")
    public static int field1288 = 0;

    @OriginalMember(owner = "client!fv", name = "u", descriptor = "Lrn;")
    public static class174 field1298 = new class174(61, -1);

    @OriginalMember(owner = "client!fv", name = "y", descriptor = "[I")
    public static int[] field1302 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!fv", name = "z", descriptor = "Z")
    public static boolean field1303 = false;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "I")
    public int field1279;

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!fv", name = "j", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!fv", name = "n", descriptor = "I")
    public int field1291;

    @OriginalMember(owner = "client!fv", name = "p", descriptor = "I")
    public int field1293;

    @OriginalMember(owner = "client!fv", name = "r", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!fv", name = "t", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!fv", name = "w", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!fv", name = "i", descriptor = "Lru;")
    public class127 field1286;

    @OriginalMember(owner = "client!fv", name = "x", descriptor = "Lf;")
    public static class529 field1301;

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "[I")
    public int[] field1280;

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "[I")
    public int[] field1282;

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "[I")
    public int[] field1283;

    @OriginalMember(owner = "client!fv", name = "h", descriptor = "[I")
    public int[] field1285;

    @OriginalMember(owner = "client!fv", name = "q", descriptor = "[I")
    public int[] field1294;

    @OriginalMember(owner = "client!fv", name = "s", descriptor = "[I")
    public int[] field1296;

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "[Lru;")
    public class127[] field1284;

    @OriginalMember(owner = "client!fv", name = "v", descriptor = "[Lmq;")
    public static class350[] field1299;

    @OriginalMember(owner = "client!fv", name = "l", descriptor = "[[I")
    public int[][] field1289;

    @OriginalMember(owner = "client!fv", name = "m", descriptor = "[[I")
    public int[][] field1290;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lvj;I)V")
    public static final void method610(class303 arg0, int arg1) {
        field1278++;
        if (class167.field2587 == null) {
            class385 var2 = new class385();
            byte[] var3 = var2.method2382(81, 128, 16, 128);
            class167.field2587 = class20.method164(true, var3, false);
        }
        if (class241.field3481 == null) {
            class330 var4 = new class330();
            byte[] var5 = var4.method2119(128, 128, (byte) -96, 16);
            class241.field3481 = class20.method164(true, var5, false);
        }
        if (arg1 != 4497) {
            return;
        }
        class398 var6 = arg0.field4493;
        if (var6.method2458((byte) 26) && class37.field706 == null) {
            byte[] var7 = class267.method1718(0.6F, 128, 4.0F, 4.0F, 8, 0, 128, 16.0F, new class413(419684), 0.5F, 16);
            class37.field706 = class20.method164(true, var7, false);
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "([BB)V")
    private final void method611(byte[] arg0, byte arg1) {
        field1281++;
        class145 var3 = new class145(class366.method2290((byte) 52, arg0));
        int var4 = var3.method1063((byte) 127);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field1293 = var3.method1070(-32387);
        } else {
            this.field1293 = 0;
        }
        int var5 = var3.method1063((byte) 121);
        this.field1279 = var3.method1069((byte) -72);
        int var6 = 0;
        int var7 = -1;
        this.field1294 = new int[this.field1279];
        int var8 = 0;
        if (arg1 <= 77) {
            this.field1284 = null;
        }
        while (var8 < this.field1279) {
            this.field1294[var8] = var6 += var3.method1069((byte) -108);
            if (var7 < this.field1294[var8]) {
                var7 = this.field1294[var8];
            }
            var8++;
        }
        this.field1291 = var7 + 1;
        this.field1296 = new int[this.field1291];
        this.field1289 = new int[this.field1291][];
        this.field1280 = new int[this.field1291];
        this.field1283 = new int[this.field1291];
        this.field1282 = new int[this.field1291];
        if (var5 != 0) {
            this.field1285 = new int[this.field1291];
            for (int var9 = 0; var9 < this.field1291; var9++) {
                this.field1285[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field1279; var10++) {
                this.field1285[this.field1294[var10]] = var3.method1070(-32387);
            }
            this.field1286 = new class127(this.field1285);
        }
        for (int var11 = 0; var11 < this.field1279; var11++) {
            this.field1283[this.field1294[var11]] = var3.method1070(-32387);
        }
        for (int var12 = 0; var12 < this.field1279; var12++) {
            this.field1280[this.field1294[var12]] = var3.method1070(-32387);
        }
        for (int var13 = 0; var13 < this.field1279; var13++) {
            this.field1296[this.field1294[var13]] = var3.method1069((byte) -53);
        }
        for (int var14 = 0; var14 < this.field1279; var14++) {
            int var21 = this.field1294[var14];
            int var22 = this.field1296[var21];
            int var23 = 0;
            int var24 = -1;
            this.field1289[var21] = new int[var22];
            for (int var25 = 0; var25 < var22; var25++) {
                int var26 = this.field1289[var21][var25] = var23 += var3.method1069((byte) -118);
                if (var24 < var26) {
                    var24 = var26;
                }
            }
            this.field1282[var21] = var24 + 1;
            if (var24 + 1 == var22) {
                this.field1289[var21] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field1284 = new class127[var7 + 1];
        this.field1290 = new int[var7 + 1][];
        for (int var15 = 0; var15 < this.field1279; var15++) {
            int var16 = this.field1294[var15];
            int var17 = this.field1296[var16];
            this.field1290[var16] = new int[this.field1282[var16]];
            for (int var18 = 0; var18 < this.field1282[var16]; var18++) {
                this.field1290[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field1289[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field1289[var16][var19];
                }
                this.field1290[var16][var20] = var3.method1070(-32387);
            }
            this.field1284[var16] = new class127(this.field1290[var16]);
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Z)V")
    public static void method612(boolean arg0) {
        field1302 = null;
        field1298 = null;
        if (arg0) {
            field1297 = 27;
        }
        field1301 = null;
        field1299 = null;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(BI)Z")
    public static final boolean method613(byte arg0, int arg1) {
        field1295++;
        if (arg0 != 36) {
            method612(false);
        }
        return arg1 == 10 || arg1 == 50 || arg1 == 1002 || arg1 == 8 || arg1 == 15;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIIII)V")
    public static final void method614(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1287++;
        int var5 = 10 % ((arg3 + 4) / 54);
        if (class443.field6623.field630 != 0 && arg1 != 0 && class148.field2361 < 50 && arg2 != -1) {
            class245.field3527[class148.field2361++] = new class150((byte) 2, arg2, arg1, arg4, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "([BI)V")
    public class77(byte[] arg0, int arg1) {
        this.field1292 = class69.method569(arg0, arg0.length, (byte) 114);
        if (this.field1292 != arg1) {
            throw new RuntimeException();
        }
        this.method611(arg0, (byte) 120);
    }
}
