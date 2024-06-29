import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class251 {

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public int field4453;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "Ljd;")
    public static class86 field4447 = class122.method868(" steht bereits auf Ihrer Freunde)2Liste(Q", true);

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field4452 = 1;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "Ljd;")
    private static class86 field4451 = class122.method868("Loaded config", true);

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "Ljd;")
    public static class86 field4454 = field4451;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public int field4455;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    public int field4456;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "I")
    public int field4465;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "Lbj;")
    public static class151 field4464;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "Lf;")
    public class36 field4462;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "[I")
    public int[] field4448;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "[I")
    public int[] field4459;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "[I")
    public int[] field4461;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "[I")
    public int[] field4463;

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "[I")
    public int[] field4466;

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "[I")
    public int[] field4467;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "[Lf;")
    public class36[] field4457;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "[[I")
    public int[][] field4449;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "[[I")
    public int[][] field4458;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "([BI)V")
    private final void method1694(byte[] arg0, int arg1) {
        field4450++;
        class200 var3 = new class200(class11.method88(arg0, false));
        int var4 = var3.method1408((byte) -100);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field4465 = var3.method1386(-4603);
        } else {
            this.field4465 = 0;
        }
        int var5 = var3.method1408((byte) -114);
        this.field4455 = var3.method1410(-120);
        int var6 = 0;
        int var7 = -1;
        this.field4467 = new int[this.field4455];
        for (int var8 = 0; var8 < this.field4455; var8++) {
            this.field4467[var8] = var6 += var3.method1410(class177.method1249(arg1, -20334));
            if (this.field4467[var8] > var7) {
                var7 = this.field4467[var8];
            }
        }
        this.field4456 = var7 + 1;
        this.field4458 = new int[this.field4456][];
        this.field4461 = new int[this.field4456];
        if (arg1 != 20311) {
            return;
        }
        this.field4466 = new int[this.field4456];
        this.field4459 = new int[this.field4456];
        this.field4463 = new int[this.field4456];
        if (var5 != 0) {
            this.field4448 = new int[this.field4456];
            for (int var9 = 0; var9 < this.field4456; var9++) {
                this.field4448[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field4455; var10++) {
                this.field4448[this.field4467[var10]] = var3.method1386(-4603);
            }
            this.field4462 = new class36(this.field4448);
        }
        for (int var11 = 0; var11 < this.field4455; var11++) {
            this.field4461[this.field4467[var11]] = var3.method1386(-4603);
        }
        for (int var12 = 0; var12 < this.field4455; var12++) {
            this.field4466[this.field4467[var12]] = var3.method1386(arg1 - 24914);
        }
        for (int var13 = 0; var13 < this.field4455; var13++) {
            this.field4463[this.field4467[var13]] = var3.method1410(-98);
        }
        for (int var14 = 0; var14 < this.field4455; var14++) {
            int var21 = 0;
            int var22 = this.field4467[var14];
            int var23 = this.field4463[var22];
            this.field4458[var22] = new int[var23];
            int var24 = -1;
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field4458[var22][var25] = var21 += var3.method1410(-60);
                if (var24 < var26) {
                    var24 = var26;
                }
            }
            this.field4459[var22] = var24 + 1;
            if ((var24 + 1) == var23) {
                this.field4458[var22] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field4457 = new class36[var7 + 1];
        this.field4449 = new int[var7 + 1][];
        for (int var15 = 0; var15 < this.field4455; var15++) {
            int var16 = this.field4467[var15];
            int var17 = this.field4463[var16];
            this.field4449[var16] = new int[this.field4459[var16]];
            for (int var18 = 0; var18 < this.field4459[var16]; var18++) {
                this.field4449[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field4458[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field4458[var16][var19];
                }
                this.field4449[var16][var20] = var3.method1386(arg1 - 24914);
            }
            this.field4457[var16] = new class36(this.field4449[var16]);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)V")
    public static final void method1695(int arg0, int arg1) {
        field4460++;
        class161 var2 = class204.method1456(true, 1, arg0);
        var2.method1173(true);
        if (arg1 != 14259) {
            method1695(104, -87);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method1696(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class70.field1424 * 128) {
            arg0 = class70.field1424 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class126.field2436 * 128) {
            arg2 = class126.field2436 * 128 - 1;
        }
        class240.field4314 = class145.field2746[arg3];
        class54.field1102 = class145.field2742[arg3];
        class13.field401 = class145.field2746[arg4];
        class211.field3824 = class145.field2742[arg4];
        class81.field1591 = arg0;
        class205.field3697 = arg1;
        class191.field3389 = arg2;
        class106.field2032 = arg0 / 128;
        class158.field2966 = arg2 / 128;
        class6.field236 = class106.field2032 - class119.field2339;
        if (class6.field236 < 0) {
            class6.field236 = 0;
        }
        class198.field3526 = class158.field2966 - class119.field2339;
        if (class198.field3526 < 0) {
            class198.field3526 = 0;
        }
        class33.field720 = class119.field2339 + class106.field2032;
        if (class33.field720 > class70.field1424) {
            class33.field720 = class70.field1424;
        }
        class194.field3482 = class158.field2966 + class119.field2339;
        if (class194.field3482 > class126.field2436) {
            class194.field3482 = class126.field2436;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class119.field2339 + class119.field2339 + 2; var16++) {
            for (int var19 = 0; var19 < class119.field2339 + class119.field2339 + 2; var19++) {
                int var20 = (var16 - class119.field2339 << 7) - (class81.field1591 & 0x7F);
                int var21 = (var19 - class119.field2339 << 7) - (class191.field3389 & 0x7F);
                int var22 = class106.field2032 + var16 - class119.field2339;
                int var23 = class158.field2966 + var19 - class119.field2339;
                if (var22 >= 0 && var23 >= 0 && var22 < class70.field1424 && var23 < class126.field2436) {
                    int var24;
                    if (class219.field3930 == null) {
                        var24 = class78.field1536[0][var22][var23] + 128 - class205.field3697;
                    } else {
                        var24 = class219.field3930[0][var22][var23] + 128 - class205.field3697;
                    }
                    int var25 = class78.field1536[3][var22][var23] - class205.field3697 - 1000;
                    class224.field4032[var16][var19] = class224.method1573(var20, var25, var24, var21, var15);
                } else {
                    class224.field4032[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class119.field2339 + class119.field2339 + 1; var17++) {
            for (int var18 = 0; var18 < class119.field2339 + class119.field2339 + 1; var18++) {
                class79.field1548[var17][var18] = class224.field4032[var17][var18] || class224.field4032[var17 + 1][var18] || class224.field4032[var17][var18 + 1] || class224.field4032[var17 + 1][var18 + 1];
            }
        }
        class53.field1085 = arg6;
        class98.field1949 = arg7;
        class25.field597 = arg8;
        class274.field4809 = arg9;
        class260.field4658 = arg10;
        class60.method433();
        if (class76.field1506 != null) {
            class211.method1497(true);
            class16.method116(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            class211.method1497(false);
        }
        class16.method116(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static void method1697(int arg0) {
        field4451 = null;
        field4454 = null;
        field4464 = null;
        field4447 = null;
        if (arg0 <= 116) {
            field4447 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "([BI)V")
    public class251(byte[] arg0, int arg1) {
        this.field4453 = class244.method1665(-99, arg0, arg0.length);
        if (this.field4453 != arg1) {
            throw new RuntimeException();
        }
        this.method1694(arg0, 20311);
    }
}
