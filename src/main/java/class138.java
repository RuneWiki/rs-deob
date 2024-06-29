import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public abstract class class138 {

    @OriginalMember(owner = "client!lca", name = "e", descriptor = "I")
    private int field1509 = 4;

    @OriginalMember(owner = "client!lca", name = "f", descriptor = "I")
    public int field1510 = 4;

    @OriginalMember(owner = "client!lca", name = "h", descriptor = "I")
    private int field1512 = 0;

    @OriginalMember(owner = "client!lca", name = "g", descriptor = "[S")
    private short[] field1511 = new short[512];

    @OriginalMember(owner = "client!lca", name = "j", descriptor = "I")
    private int field1514 = 4;

    @OriginalMember(owner = "client!lca", name = "m", descriptor = "I")
    private int field1517 = 4;

    @OriginalMember(owner = "client!lca", name = "l", descriptor = "Lnd;")
    public static class689 field1516 = new class689();

    @OriginalMember(owner = "client!lca", name = "n", descriptor = "Lcq;")
    public static class110 field1518 = new class110(38, 12);

    @OriginalMember(owner = "client!lca", name = "p", descriptor = "[I")
    public static int[] field1520 = new int[1];

    @OriginalMember(owner = "client!lca", name = "o", descriptor = "Lcq;")
    public static class110 field1519 = new class110(82, -2);

    @OriginalMember(owner = "client!lca", name = "q", descriptor = "Lcq;")
    public static class110 field1521 = new class110(102, 19);

    @OriginalMember(owner = "client!lca", name = "r", descriptor = "Lsb;")
    public static class305 field1522 = new class305(60, -1);

    @OriginalMember(owner = "client!lca", name = "s", descriptor = "Lgk;")
    public static class616 field1523 = new class616();

    @OriginalMember(owner = "client!lca", name = "t", descriptor = "I")
    public static int field1524 = -1;

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!lca", name = "c", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!lca", name = "d", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!lca", name = "i", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!lca", name = "k", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!lca", name = "u", descriptor = "[Let;")
    public static class613[] field1525;

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "[S")
    private short[] field1505;

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(B)V")
    private final void method768(byte arg0) {
        field1515++;
        this.field1505 = new short[this.field1510];
        if (arg0 != -72) {
            this.field1509 = -12;
        }
        for (int var2 = 0; var2 < this.field1510; var2++) {
            this.field1505[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IIIBIIIIII)V")
    public static final void method769(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 51) {
            field1524 = -112;
        }
        field1507++;
        class323 var10 = null;
        for (class323 var11 = (class323) class412.field5527.method3434((byte) 2); var11 != null; var11 = (class323) class412.field5527.method3430(true)) {
            if (var11.field3973 == arg7 && var11.field3971 == arg8 && var11.field3968 == arg2 && var11.field3975 == arg5) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class323();
            var10.field3973 = arg7;
            var10.field3968 = arg2;
            var10.field3975 = arg5;
            var10.field3971 = arg8;
            if (arg8 >= 0 && arg2 >= 0 && class142.field1574 > arg8 && arg2 < class140.field1550) {
                class694.method3819(var10, (byte) 6);
            }
            class412.field5527.method3425(var10, false);
        }
        var10.field3978 = arg0;
        var10.field3972 = arg9;
        var10.field3979 = arg6;
        var10.field3967 = arg1;
        var10.field3976 = arg4;
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(B)V")
    public abstract void method770(byte arg0);

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(ILqg;)Z")
    public static final boolean method771(int arg0, class216 arg1) {
        field1508++;
        if (arg0 != 13651) {
            field1516 = null;
        }
        return class407.field5437 == arg1 || class295.field3686 == arg1 || class193.field2235 == arg1 || class314.field3902 == arg1;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)V")
    public abstract void method772(int arg0);

    @OriginalMember(owner = "client!lca", name = "c", descriptor = "(B)V")
    private final void method773(byte arg0) {
        field1506++;
        Random var2 = new Random((long) this.field1512);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field1511[var3] = (short) var3;
        }
        if (arg0 <= 119) {
            return;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class304.method1756(var2, var5, -1304107232);
            short var7 = this.field1511[var6];
            this.field1511[var6] = this.field1511[var5];
            this.field1511[var5] = this.field1511[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IIII)V")
    public final void method774(int arg0, int arg1, int arg2, int arg3) {
        field1513++;
        int[] var5 = new int[arg3];
        int[] var6 = new int[arg1];
        int[] var7 = new int[arg2];
        for (int var8 = 0; var8 < arg3; var8++) {
            var5[var8] = (var8 << 12) / arg3;
        }
        for (int var9 = 0; var9 < arg1; var9++) {
            var6[var9] = (var9 << 12) / arg1;
        }
        for (int var10 = 0; var10 < arg2; var10++) {
            var7[var10] = (var10 << 12) / arg2;
        }
        this.method772(30321);
        int var11 = -21 / ((-arg0 - 22) / 57);
        for (int var12 = 0; var12 < arg2; var12++) {
            for (int var13 = 0; var13 < arg1; var13++) {
                for (int var14 = 0; var14 < arg3; var14++) {
                    for (int var15 = 0; var15 < this.field1510; var15++) {
                        int var16 = this.field1505[var15] << 12;
                        int var17 = var7[var12] * var16 >> 12;
                        int var18 = var6[var13] * var16 >> 12;
                        int var19 = this.field1509 * var16 >> 12;
                        int var20 = var5[var14] * var16 >> 12;
                        int var21 = this.field1514 * var16 >> 12;
                        int var22 = this.field1517 * var16 >> 12;
                        int var23 = this.field1517 * var20;
                        int var24 = this.field1514 * var17;
                        int var25 = this.field1509 * var18;
                        int var26 = var23 >> 12;
                        int var27 = var26 + 1;
                        int var28 = var25 >> 12;
                        int var29 = var26 & 0xFF;
                        int var30 = var28 + 1;
                        int var31 = var24 >> 12;
                        int var32 = var28 & 0xFF;
                        int var33 = var31 + 1;
                        int var34 = var25 & 0xFFF;
                        int var35;
                        if (var21 > var33) {
                            var35 = var33 & 0xFF;
                        } else {
                            var35 = 0;
                        }
                        int var36 = var24 & 0xFFF;
                        int var37;
                        if (var30 >= var19) {
                            var37 = 0;
                        } else {
                            var37 = var30 & 0xFF;
                        }
                        int var38 = var31 & 0xFF;
                        int var39;
                        if (var22 > var27) {
                            var39 = var27 & 0xFF;
                        } else {
                            var39 = 0;
                        }
                        int var40 = var23 & 0xFFF;
                        int var41 = class182.field2039[var40];
                        short var42 = this.field1511[var38];
                        int var43 = class182.field2039[var34];
                        int var44 = var34 - 4096;
                        int var45 = class182.field2039[var36];
                        short var46 = this.field1511[var35];
                        int var47 = var36 - 4096;
                        int var48 = var40 - 4096;
                        short var49 = this.field1511[var32 + var42];
                        short var50 = this.field1511[var37 + var42];
                        short var51 = this.field1511[var32 + var46];
                        short var52 = this.field1511[var37 + var46];
                        int var53 = class501.method2883(var34, (byte) -118, var36, var40, this.field1511[var29 + var49]);
                        int var54 = class501.method2883(var34, (byte) -118, var36, var48, this.field1511[var39 + var49]);
                        int var55 = ((var54 - var53) * var41 >> 12) + var53;
                        int var56 = class501.method2883(var44, (byte) -118, var36, var40, this.field1511[var29 + var50]);
                        int var57 = class501.method2883(var44, (byte) -118, var36, var48, this.field1511[var39 + var50]);
                        int var58 = ((var57 - var56) * var41 >> 12) + var56;
                        int var59 = class501.method2883(var34, (byte) -118, var47, var40, this.field1511[var29 + var51]);
                        int var60 = ((var58 - var55) * var43 >> 12) + var55;
                        int var61 = class501.method2883(var34, (byte) -118, var47, var48, this.field1511[var39 + var51]);
                        int var62 = ((var61 - var59) * var41 >> 12) + var59;
                        int var63 = class501.method2883(var44, (byte) -118, var47, var40, this.field1511[var29 + var52]);
                        int var64 = class501.method2883(var44, (byte) -118, var47, var48, this.field1511[var39 + var52]);
                        int var65 = ((var64 - var63) * var41 >> 12) + var63;
                        int var66 = ((var65 - var62) * var43 >> 12) + var62;
                        this.method776(((var66 - var60) * var45 >> 12) + var60, 0, var15);
                    }
                    this.method770((byte) -60);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lca", name = "d", descriptor = "(B)V")
    public static void method775(byte arg0) {
        if (arg0 > -15) {
            return;
        }
        field1521 = null;
        field1519 = null;
        field1520 = null;
        field1518 = null;
        field1522 = null;
        field1523 = null;
        field1525 = null;
        field1516 = null;
    }

    @OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(IIIII)V")
    public class138(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1517 = arg2;
        this.field1512 = arg0;
        this.field1514 = arg4;
        this.field1510 = arg1;
        this.field1509 = arg3;
        this.method768((byte) -72);
        this.method773((byte) 124);
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(III)V")
    public abstract void method776(int arg0, int arg1, int arg2);
}
