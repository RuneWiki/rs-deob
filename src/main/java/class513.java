import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class513 {

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
    public int field7521;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field7506;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public int field7511;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public int field7512;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    public static int field7516;

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
    public int field7518;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "Lvj;")
    public class312 field7510;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "[I")
    public int[] field7507;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "[I")
    public int[] field7508;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "[I")
    public int[] field7509;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "[I")
    public int[] field7513;

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "[I")
    public int[] field7517;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "[I")
    public int[] field7520;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "[Lvj;")
    public class312[] field7519;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "[[I")
    public int[][] field7514;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "[[I")
    public int[][] field7515;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V", line = 8)
    public static final void method3039(int arg0) {
        if (arg0 <= 54) {
            return;
        }
        for (int var1 = 0; var1 < class40.field602; var1++) {
            class441 var2 = class320.field4411[var1];
            boolean var3 = false;
            if (var2.field6354 == null) {
                var2.field6360--;
                if (var2.field6360 >= (var2.field6346 == 2 ? -1500 : -10)) {
                    if (var2.field6346 == 1 && var2.field6350 == null) {
                        var2.field6350 = class64.method423(class481.field6956, var2.field6363, 0);
                        if (var2.field6350 == null) {
                            continue;
                        }
                        var2.field6360 += var2.field6350.method422();
                    } else if (var2.field6346 == 2 && (var2.field6359 == null || var2.field6357 == null)) {
                        if (var2.field6359 == null) {
                            var2.field6359 = class252.method1513(class383.field5505, var2.field6363);
                        }
                        if (var2.field6359 == null) {
                            continue;
                        }
                        if (var2.field6357 == null) {
                            var2.field6357 = var2.field6359.method1507(new int[] { 22050 });
                            if (var2.field6357 == null) {
                                continue;
                            }
                        }
                    }
                    if (var2.field6360 < 0) {
                        int var4;
                        if (var2.field6356 == 0) {
                            var4 = class76.field1075.field3651 * var2.field6353 >> 8;
                        } else {
                            int var5 = var2.field6356 >> 24 & 0x3;
                            if (class81.field1158.field6279 == var5) {
                                int var6 = (var2.field6356 & 0xFF) << 7;
                                int var7 = (var2.field6356 & 0xFF67A1) >> 16;
                                int var8 = (var7 << 7) + 64 - class81.field1158.field6284;
                                if (var8 < 0) {
                                    var8 = -var8;
                                }
                                int var9 = var2.field6356 >> 8 & 0xFF;
                                int var10 = (var9 << 7) + 64 - class81.field1158.field6287;
                                if (var10 < 0) {
                                    var10 = -var10;
                                }
                                int var11 = var8 + var10 - 128;
                                if (var11 > var6) {
                                    var2.field6360 = -99999;
                                    continue;
                                }
                                if (var11 < 0) {
                                    var11 = 0;
                                }
                                var4 = class76.field1075.field3682 * var2.field6353 * (var6 - var11) / var6 >> 8;
                            } else {
                                var4 = 0;
                            }
                        }
                        if (var4 > 0) {
                            class174 var12 = null;
                            if (var2.field6346 == 1) {
                                var12 = var2.field6350.method425().method1204(class149.field2289);
                            } else if (var2.field6346 == 2) {
                                var12 = var2.field6357;
                            }
                            class477 var13 = var2.field6354 = class477.method2820(var12, 100, var4);
                            var13.method2825(var2.field6364 - 1);
                            class290.field3924.method293(var13);
                        }
                    }
                } else {
                    var3 = true;
                }
            } else if (!var2.field6354.method2790(-97)) {
                var3 = true;
            }
            if (var3) {
                class40.field602--;
                for (int var14 = var1; var14 < class40.field602; var14++) {
                    class320.field4411[var14] = class320.field4411[var14 + 1];
                }
                var1--;
            }
        }
        field7506++;
        if (class363.field5221 && !class40.method281((byte) -115)) {
            if (class76.field1075.field3685 != 0 && class72.field1027 != -1) {
                class188.method1258(class437.field6309, -114, class72.field1027, false, 0, class76.field1075.field3685);
            }
            class363.field5221 = false;
        } else if (class76.field1075.field3685 != 0 && class72.field1027 != -1 && !class40.method281((byte) -122)) {
            class330.field4482++;
            class274.method1602(14, class28.field406);
            class17.field275.method1858(class72.field1027, (byte) -107);
            class72.field1027 = -1;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B[B)V", line = 181)
    private final void method3040(byte arg0, byte[] arg1) {
        field7516++;
        class319 var3 = new class319(class486.method2875(arg1, (byte) 26));
        int var4 = var3.method1869(-124);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field7518 = var3.method1863(-1);
        } else {
            this.field7518 = 0;
        }
        int var5 = var3.method1869(-68);
        this.field7511 = var3.method1844(-125);
        int var6 = 0;
        int var7 = -1;
        this.field7509 = new int[this.field7511];
        for (int var8 = 0; var8 < this.field7511; var8++) {
            this.field7509[var8] = var6 += var3.method1844(-128);
            if (var7 < this.field7509[var8]) {
                var7 = this.field7509[var8];
            }
        }
        this.field7512 = var7 + 1;
        this.field7508 = new int[this.field7512];
        this.field7515 = new int[this.field7512][];
        this.field7517 = new int[this.field7512];
        this.field7513 = new int[this.field7512];
        this.field7507 = new int[this.field7512];
        if (var5 != 0) {
            this.field7520 = new int[this.field7512];
            for (int var9 = 0; var9 < this.field7512; var9++) {
                this.field7520[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field7511; var10++) {
                this.field7520[this.field7509[var10]] = var3.method1863(-1);
            }
            this.field7510 = new class312(this.field7520);
        }
        for (int var11 = 0; var11 < this.field7511; var11++) {
            this.field7517[this.field7509[var11]] = var3.method1863(-1);
        }
        if (arg0 > -126) {
            return;
        }
        for (int var12 = 0; var12 < this.field7511; var12++) {
            this.field7513[this.field7509[var12]] = var3.method1863(-1);
        }
        for (int var13 = 0; var13 < this.field7511; var13++) {
            this.field7507[this.field7509[var13]] = var3.method1844(-123);
        }
        for (int var14 = 0; var14 < this.field7511; var14++) {
            int var21 = this.field7509[var14];
            int var22 = 0;
            int var23 = this.field7507[var21];
            this.field7515[var21] = new int[var23];
            int var24 = -1;
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field7515[var21][var25] = var22 += var3.method1844(-120);
                if (var24 < var26) {
                    var24 = var26;
                }
            }
            this.field7508[var21] = var24 + 1;
            if ((var24 + 1) == var23) {
                this.field7515[var21] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field7519 = new class312[var7 + 1];
        this.field7514 = new int[var7 + 1][];
        for (int var15 = 0; var15 < this.field7511; var15++) {
            int var16 = this.field7509[var15];
            int var17 = this.field7507[var16];
            this.field7514[var16] = new int[this.field7508[var16]];
            for (int var18 = 0; var18 < this.field7508[var16]; var18++) {
                this.field7514[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field7515[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field7515[var16][var19];
                }
                this.field7514[var16][var20] = var3.method1863(-1);
            }
            this.field7519[var16] = new class312(this.field7514[var16]);
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "([BI)V", line = 365)
    public class513(byte[] arg0, int arg1) {
        this.field7521 = class163.method1143(arg0, arg0.length, 0);
        if (this.field7521 != arg1) {
            throw new RuntimeException();
        }
        this.method3040((byte) -127, arg0);
    }
}
