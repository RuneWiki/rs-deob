import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class107 {

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
    public int field1294;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "[B")
    private byte[] field1287;

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "Liv;")
    public static class97 field1305 = new class97();

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public int field1285;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
    public int field1295;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "I")
    public int field1299;

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!eg", name = "v", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "Ldda;")
    public class381 field1293;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "[I")
    public int[] field1289;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "[I")
    public int[] field1292;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "[I")
    public int[] field1296;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "[I")
    public int[] field1297;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "[I")
    public int[] field1298;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "[I")
    public int[] field1300;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "[Ldda;")
    public class381[] field1291;

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "[[B")
    public byte[][] field1303;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "[[I")
    public int[][] field1288;

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "[[I")
    public int[][] field1302;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)V")
    public static final void method764(boolean arg0) {
        field1286++;
        class172.field2349 = null;
        class296.field4170 = null;
        if (arg0) {
            method767(true);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZZLjb;)V")
    public static final void method765(boolean arg0, boolean arg1, class493 arg2) {
        field1290++;
        int var3 = arg2.field7007 == 0 ? arg2.field7095 : arg2.field7007;
        if (!arg1) {
            field1305 = null;
        }
        int var4 = arg2.field6969 == 0 ? arg2.field7031 : arg2.field6969;
        class336.method2184((byte) -112, class37.field475[arg2.field6956 >> 16], var4, arg2.field6956, arg0, var3);
        if (arg2.field7009 != null) {
            class336.method2184((byte) -127, arg2.field7009, var4, arg2.field6956, arg0, var3);
        }
        class47 var5 = (class47) class475.field6744.method1180((byte) 26, (long) arg2.field6956);
        if (var5 != null) {
            class570.method3279(var4, true, var5.field550, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I[B)Ljava/lang/String;")
    public static final String method766(int arg0, byte[] arg1) {
        field1301++;
        if (arg0 > -105) {
            field1306 = -89;
        }
        return class529.method3081(arg1, 0, 63, arg1.length);
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(Z)V")
    public static void method767(boolean arg0) {
        if (arg0) {
            field1305 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "([BZ)V")
    private final void method768(byte[] arg0, boolean arg1) {
        field1304++;
        class675 var3 = new class675(class755.method4197(arg0, arg1));
        int var4 = var3.method3750((byte) 35);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field1299 = var3.method3703(105);
        } else {
            this.field1299 = 0;
        }
        int var5 = var3.method3750((byte) 35);
        boolean var6 = (var5 & 0x1) != 0;
        this.field1285 = var3.method3757((byte) -65);
        boolean var7 = (var5 & 0x2) != 0;
        int var8 = 0;
        int var9 = -1;
        this.field1300 = new int[this.field1285];
        for (int var10 = 0; var10 < this.field1285; var10++) {
            this.field1300[var10] = var8 += var3.method3757((byte) -65);
            if (var9 < this.field1300[var10]) {
                var9 = this.field1300[var10];
            }
        }
        this.field1295 = var9 + 1;
        if (var7) {
            this.field1303 = new byte[this.field1295][];
        }
        this.field1302 = new int[this.field1295][];
        this.field1298 = new int[this.field1295];
        this.field1292 = new int[this.field1295];
        this.field1289 = new int[this.field1295];
        this.field1296 = new int[this.field1295];
        if (var6) {
            this.field1297 = new int[this.field1295];
            for (int var11 = 0; var11 < this.field1295; var11++) {
                this.field1297[var11] = -1;
            }
            for (int var12 = 0; var12 < this.field1285; var12++) {
                this.field1297[this.field1300[var12]] = var3.method3703(101);
            }
            this.field1293 = new class381(this.field1297);
        }
        for (int var13 = 0; var13 < this.field1285; var13++) {
            this.field1289[this.field1300[var13]] = var3.method3703(105);
        }
        if (var7) {
            for (int var14 = 0; var14 < this.field1285; var14++) {
                byte[] var15 = new byte[64];
                var3.method3723(var15, 4, 64, 0);
                this.field1303[this.field1300[var14]] = var15;
            }
        }
        for (int var16 = 0; var16 < this.field1285; var16++) {
            this.field1298[this.field1300[var16]] = var3.method3703(124);
        }
        for (int var17 = 0; var17 < this.field1285; var17++) {
            this.field1292[this.field1300[var17]] = var3.method3757((byte) -65);
        }
        for (int var18 = 0; var18 < this.field1285; var18++) {
            int var25 = this.field1300[var18];
            int var26 = this.field1292[var25];
            int var27 = 0;
            this.field1302[var25] = new int[var26];
            int var28 = -1;
            for (int var29 = 0; var29 < var26; var29++) {
                int var30 = this.field1302[var25][var29] = var27 += var3.method3757((byte) -65);
                if (var30 > var28) {
                    var28 = var30;
                }
            }
            this.field1296[var25] = var28 + 1;
            if (var28 + 1 == var26) {
                this.field1302[var25] = null;
            }
        }
        if (!var6) {
            return;
        }
        this.field1291 = new class381[var9 + 1];
        this.field1288 = new int[var9 + 1][];
        for (int var19 = 0; var19 < this.field1285; var19++) {
            int var20 = this.field1300[var19];
            int var21 = this.field1292[var20];
            this.field1288[var20] = new int[this.field1296[var20]];
            for (int var22 = 0; var22 < this.field1296[var20]; var22++) {
                this.field1288[var20][var22] = -1;
            }
            for (int var23 = 0; var23 < var21; var23++) {
                int var24;
                if (this.field1302[var20] == null) {
                    var24 = var23;
                } else {
                    var24 = this.field1302[var20][var23];
                }
                this.field1288[var20][var24] = var3.method3703(99);
            }
            this.field1291[var20] = new class381(this.field1288[var20]);
        }
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "([BI[B)V")
    public class107(byte[] arg0, int arg1, byte[] arg2) {
        this.field1294 = class382.method2428(arg0.length, (byte) 28, arg0);
        if (this.field1294 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field1287 = class739.method4131(arg0, arg0.length, 62, 0);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field1287[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method768(arg0, false);
    }
}
