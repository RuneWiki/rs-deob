import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public abstract class class522 extends class117 {

    @OriginalMember(owner = "client!kn", name = "p", descriptor = "Z")
    public boolean field7557 = false;

    @OriginalMember(owner = "client!kn", name = "n", descriptor = "Z")
    public boolean field7555 = false;

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "I")
    public int field7552;

    @OriginalMember(owner = "client!kn", name = "q", descriptor = "I")
    public int field7558;

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "I")
    public int field7550;

    @OriginalMember(owner = "client!kn", name = "m", descriptor = "[S")
    public static short[] field7554 = new short[256];

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "Lap;")
    public static class335 field7549 = new class335("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

    @OriginalMember(owner = "client!kn", name = "r", descriptor = "Lkg;")
    public static class179 field7559 = new class179(54, 3);

    @OriginalMember(owner = "client!kn", name = "t", descriptor = "[S")
    public static short[] field7561 = new short[] { 23, 21, 11, 2, 49, 10, 20, 50 };

    @OriginalMember(owner = "client!kn", name = "s", descriptor = "Lup;")
    public static class181 field7560 = new class181(4, 3);

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "I")
    public static int field7551;

    @OriginalMember(owner = "client!kn", name = "l", descriptor = "I")
    public static int field7553;

    @OriginalMember(owner = "client!kn", name = "o", descriptor = "I")
    public static int field7556;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)V")
    public static final void method3102(int arg0, int arg1) {
        class264 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class143 var4 = class531.field7811[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class105.field1336; var5++) {
                    for (int var6 = 0; var6 < class470.field6825; var6++) {
                        var2 = var4.method398(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class94.field1144;
                            int var8 = var5 << class94.field1144;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class143 var10 = class531.field7811[var9];
                                if (var10 != null) {
                                    int var11 = var4.method399(var6, var5) - var10.method399(var6, var5);
                                    int var12 = var4.method399(var6 + 1, var5) - var10.method399(var6 + 1, var5);
                                    int var13 = var4.method399(var6 + 1, var5 + 1) - var10.method399(var6 + 1, var5 + 1);
                                    int var14 = var4.method399(var6, var5 + 1) - var10.method399(var6, var5 + 1);
                                    var10.method390(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIZIII)V")
    public static final void method3103(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field7553++;
        int var8 = 0;
        int var9 = arg2;
        int var10 = 0;
        int var11 = arg1 - arg0;
        int var12 = arg2 - arg0;
        int var13 = arg1 * arg1;
        int var14 = arg2 * arg2;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg2 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - (var21 - 1) * var18;
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg2 - 1) * var27;
        if (!arg4) {
            method3104(false);
        }
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        if (arg7 >= class533.field7845 && class289.field3694 >= arg7) {
            int[] var39 = class387.field5088[arg7];
            int var40 = class33.method242(arg5 - arg1, class147.field1870, class237.field3019, (byte) -128);
            int var41 = class33.method242(arg1 + arg5, class147.field1870, class237.field3019, (byte) -128);
            int var42 = class33.method242(arg5 - var11, class147.field1870, class237.field3019, (byte) -128);
            int var43 = class33.method242(arg5 + var11, class147.field1870, class237.field3019, (byte) -128);
            class184.method1160(var39, -7, arg6, var42, var40);
            class184.method1160(var39, -7, arg3, var43, var42);
            class184.method1160(var39, -7, arg6, var41, var43);
        }
        while (var9 > 0) {
            boolean var44 = var9 <= var12;
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var35 += var28;
                    var8++;
                    var31 += var28;
                }
            }
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var33 += var30;
                        var10++;
                        var37 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var33 += var30;
                    var10++;
                    var37 += var30;
                }
                var26 += -var34;
                var25 += -var38;
                var34 -= var29;
                var38 -= var29;
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var35 += var28;
                var31 += var28;
                var8++;
            }
            var24 += -var32;
            var23 += -var36;
            var32 -= var27;
            var36 -= var27;
            var9--;
            int var45 = arg7 - var9;
            int var46 = arg7 + var9;
            if (class533.field7845 <= var46 && var45 <= class289.field3694) {
                int var47 = class33.method242(arg5 + var8, class147.field1870, class237.field3019, (byte) -128);
                int var48 = class33.method242(arg5 - var8, class147.field1870, class237.field3019, (byte) -128);
                if (var44) {
                    int var49 = class33.method242(arg5 + var10, class147.field1870, class237.field3019, (byte) -128);
                    int var50 = class33.method242(arg5 - var10, class147.field1870, class237.field3019, (byte) -128);
                    if (var45 >= class533.field7845) {
                        int[] var51 = class387.field5088[var45];
                        class184.method1160(var51, -7, arg6, var50, var48);
                        class184.method1160(var51, -7, arg3, var49, var50);
                        class184.method1160(var51, -7, arg6, var47, var49);
                    }
                    if (var46 <= class289.field3694) {
                        int[] var52 = class387.field5088[var46];
                        class184.method1160(var52, -7, arg6, var50, var48);
                        class184.method1160(var52, -7, arg3, var49, var50);
                        class184.method1160(var52, -7, arg6, var47, var49);
                    }
                } else {
                    if (class533.field7845 <= var45) {
                        class184.method1160(class387.field5088[var45], -7, arg6, var47, var48);
                    }
                    if (var46 <= class289.field3694) {
                        class184.method1160(class387.field5088[var46], -7, arg6, var47, var48);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "(Z)V")
    public static void method3104(boolean arg0) {
        field7554 = null;
        field7560 = null;
        field7559 = null;
        field7549 = null;
        field7561 = null;
        if (arg0) {
            field7561 = null;
        }
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(IIIZZ)V")
    public class522(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field7552 = arg1;
        this.field7555 = arg4;
        this.field7557 = arg3;
        this.field7558 = arg0;
        this.field7550 = arg2;
    }
}
