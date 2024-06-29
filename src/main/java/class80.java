import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class80 {

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public int field1205;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public static int field1212 = -1;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "Ljava/lang/String;")
    public static String field1216 = "Loading defaults - ";

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "I")
    public static volatile int field1223 = 0;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
    public static int field1219 = 0;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public static int field1211 = 0;

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "Lfe;")
    public static class231 field1227 = null;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public int field1206;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
    public int field1208;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "I")
    public int field1228;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "Lfh;")
    public class188 field1209;

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "Llh;")
    public static class22 field1224;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "[I")
    public int[] field1203;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "[I")
    public int[] field1207;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "[I")
    public int[] field1210;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "[I")
    public int[] field1217;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "[I")
    public int[] field1218;

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "[I")
    public int[] field1226;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "[Lfh;")
    public class188[] field1214;

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "[[I")
    public int[][] field1220;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "[[I")
    public int[][] field1221;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLvl;Lvl;)V")
    public static final void method541(byte arg0, class73 arg1, class73 arg2) {
        if (arg0 != 56) {
            field1227 = null;
        }
        class135.field1948 = arg2;
        field1225++;
        class104.field1512 = arg1;
        class3.field47 = class104.field1512.method481(2688, 3);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
    public static final void method542(int arg0) {
        class68.field1011.method1511((byte) 107);
        if (arg0 < 116) {
            method546((byte) -73);
        }
        field1213++;
        class206.field3233.method1511((byte) 123);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIII)V")
    public static final void method543(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1215++;
        int var6 = class196.method1369(class60.field882, arg2, true, class115.field1678);
        int var7 = class196.method1369(class60.field882, arg3, true, class115.field1678);
        int var8 = class196.method1369(class187.field2938, arg0, true, class56.field816);
        int var9 = class196.method1369(class187.field2938, arg1, true, class56.field816);
        if (arg4 != -1) {
            field1216 = null;
        }
        for (int var10 = var6; var10 <= var7; var10++) {
            class16.method97(-7, class78.field1180[var10], var9, arg5, var8);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([BI)V")
    private final void method544(byte[] arg0, int arg1) {
        field1204++;
        class170 var3 = new class170(class228.method1608((byte) 78, arg0));
        int var4 = var3.method1218(64);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field1208 = 0;
        } else {
            this.field1208 = var3.method1190(6345);
        }
        int var5 = var3.method1218(arg1 + 107);
        this.field1228 = var3.method1186((byte) -77);
        this.field1226 = new int[this.field1228];
        int var6 = -1;
        int var7 = 0;
        for (int var8 = 0; var8 < this.field1228; var8++) {
            this.field1226[var8] = var7 += var3.method1186((byte) -101);
            if (var6 < this.field1226[var8]) {
                var6 = this.field1226[var8];
            }
        }
        this.field1206 = var6 + 1;
        this.field1221 = new int[this.field1206][];
        this.field1217 = new int[this.field1206];
        this.field1218 = new int[this.field1206];
        this.field1203 = new int[this.field1206];
        this.field1210 = new int[this.field1206];
        if (var5 != 0) {
            this.field1207 = new int[this.field1206];
            for (int var9 = 0; var9 < this.field1206; var9++) {
                this.field1207[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field1228; var10++) {
                this.field1207[this.field1226[var10]] = var3.method1190(6345);
            }
            this.field1209 = new class188(this.field1207);
        }
        for (int var11 = 0; var11 < this.field1228; var11++) {
            this.field1218[this.field1226[var11]] = var3.method1190(6345);
        }
        for (int var12 = arg1; var12 < this.field1228; var12++) {
            this.field1210[this.field1226[var12]] = var3.method1190(arg1 + 6345);
        }
        for (int var13 = 0; var13 < this.field1228; var13++) {
            this.field1217[this.field1226[var13]] = var3.method1186((byte) -63);
        }
        for (int var14 = 0; var14 < this.field1228; var14++) {
            int var21 = this.field1226[var14];
            int var22 = 0;
            int var23 = this.field1217[var21];
            int var24 = -1;
            this.field1221[var21] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field1221[var21][var25] = var22 += var3.method1186((byte) -50);
                if (var24 < var26) {
                    var24 = var26;
                }
            }
            this.field1203[var21] = var24 + 1;
            if ((var24 + 1) == var23) {
                this.field1221[var21] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field1220 = new int[var6 + 1][];
        this.field1214 = new class188[var6 + 1];
        for (int var15 = 0; var15 < this.field1228; var15++) {
            int var16 = this.field1226[var15];
            int var17 = this.field1217[var16];
            this.field1220[var16] = new int[this.field1203[var16]];
            for (int var18 = 0; var18 < this.field1203[var16]; var18++) {
                this.field1220[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field1221[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field1221[var16][var19];
                }
                this.field1220[var16][var20] = var3.method1190(6345);
            }
            this.field1214[var16] = new class188(this.field1220[var16]);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)I")
    public static final int method545(byte arg0) {
        if (arg0 < 45) {
            field1211 = 71;
        }
        field1222++;
        return class216.field3371;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)V")
    public static void method546(byte arg0) {
        field1227 = null;
        if (arg0 != -39) {
            field1216 = null;
        }
        field1224 = null;
        field1216 = null;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "([BI)V")
    public class80(byte[] arg0, int arg1) {
        this.field1205 = class41.method237((byte) 116, arg0.length, arg0);
        if (this.field1205 != arg1) {
            throw new RuntimeException();
        }
        this.method544(arg0, 0);
    }
}
