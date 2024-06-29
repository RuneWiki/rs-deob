import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class241 {

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "Llh;")
    private class55 field3509 = new class55();

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "Lgk;")
    private class259 field3511 = new class259();

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "I")
    private int field3515;

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "I")
    private int field3514;

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "Lc;")
    private class284 field3516;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field3505 = 0;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3504 = "Face here";

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field3500 = -1;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "Ljava/lang/String;")
    public static String field3510 = " more options";

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "[[[B")
    public static byte[][][] field3507;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)Lnh;")
    public final class288 method1565(int arg0) {
        if (arg0 != 8) {
            this.field3511 = null;
        }
        field3503++;
        return this.field3516.method1889(false);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lqi;B)V")
    public static final void method1566(class216 arg0, byte arg1) {
        int var2 = 30 % ((arg1 - 38) / 53);
        field3513++;
        while (true) {
            while (arg0.field3021 < arg0.field3030.length) {
                boolean var3 = false;
                int var4 = 0;
                int var5 = 0;
                if (arg0.method1407(120) == 1) {
                    var3 = true;
                    var4 = arg0.method1407(105);
                    var5 = arg0.method1407(110);
                }
                int var6 = arg0.method1407(119);
                int var7 = arg0.method1407(114);
                int var8 = class133.field1940 - (var7 * 64 + -class1.field1) - 1;
                int var9 = var6 * 64 - class230.field3313;
                if (var9 >= 0 && (var8 - 63) >= 0 && var9 + 63 < client.field4446 && class133.field1940 > var8) {
                    int var10 = var9 >> 6;
                    int var11 = var8 >> 6;
                    for (int var12 = 0; var12 < 64; var12++) {
                        for (int var13 = 0; var13 < 64; var13++) {
                            if (!var3 || (var4 * 8) <= var12 && var12 < var4 * 8 + 8 && var13 >= (var5 * 8) && var13 < (var5 * 8 + 8)) {
                                byte var14 = arg0.method1355(true);
                                if (var14 != 0) {
                                    if (class252.field3644[var10][var11] == null) {
                                        class252.field3644[var10][var11] = new byte[4096];
                                    }
                                    class252.field3644[var10][var11][(63 - var13 << 6) + var12] = var14;
                                    byte var15 = arg0.method1355(true);
                                    if (class265.field3829[var10][var11] == null) {
                                        class265.field3829[var10][var11] = new byte[4096];
                                    }
                                    class265.field3829[var10][var11][(63 - var13 << 6) + var12] = var15;
                                }
                            }
                        }
                    }
                } else {
                    for (int var16 = 0; var16 < (var3 ? 64 : 4096); var16++) {
                        byte var17 = arg0.method1355(true);
                        if (var17 != 0) {
                            arg0.field3021++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(JI)Llh;")
    public final class55 method1567(long arg0, int arg1) {
        field3499++;
        class55 var4 = (class55) this.field3516.method1895(arg0, -112);
        if (arg1 == 8) {
            if (var4 != null) {
                this.field3511.method1656(var4, (byte) -115);
            }
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BLlh;J)V")
    public final void method1568(byte arg0, class55 arg1, long arg2) {
        field3502++;
        if (arg0 >= -50) {
            method1570(-91, 119, -5);
        }
        if (this.field3514 == 0) {
            class55 var5 = this.field3511.method1664((byte) -79);
            var5.method1935(116);
            var5.method336(22047);
            if (this.field3509 == var5) {
                class55 var6 = this.field3511.method1664((byte) 49);
                var6.method1935(125);
                var6.method336(22047);
            }
        } else {
            this.field3514--;
        }
        this.field3516.method1894(-1, arg1, arg2);
        this.field3511.method1656(arg1, (byte) -128);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIII)V")
    public static final void method1569(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3508++;
        int var6 = class22.method134(class286.field4431, 14949, arg5, class230.field3302);
        int var7 = class22.method134(class286.field4431, 14949, arg1, class230.field3302);
        int var8 = -65 % ((-arg2 - 47) / 57);
        int var9 = class22.method134(class177.field2514, 14949, arg0, class279.field4238);
        int var10 = class22.method134(class177.field2514, 14949, arg3, class279.field4238);
        for (int var11 = var6; var11 <= var7; var11++) {
            class76.method463(var9, 0, arg4, var10, class268.field3919[var11]);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)Z")
    public static final boolean method1570(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class161.field2318; var3++) {
            class232 var4 = class53.field617[var3];
            if (var4.field3349 == 1) {
                int var5 = var4.field3344 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field3341 * var5 >> 8) + var4.field3342;
                    int var7 = (var4.field3340 * var5 >> 8) + var4.field3347;
                    int var8 = (var4.field3351 * var5 >> 8) + var4.field3339;
                    int var9 = (var4.field3353 * var5 >> 8) + var4.field3356;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field3349 == 2) {
                int var10 = arg0 - var4.field3344;
                if (var10 > 0) {
                    int var11 = (var4.field3341 * var10 >> 8) + var4.field3342;
                    int var12 = (var4.field3340 * var10 >> 8) + var4.field3347;
                    int var13 = (var4.field3351 * var10 >> 8) + var4.field3339;
                    int var14 = (var4.field3353 * var10 >> 8) + var4.field3356;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field3349 == 3) {
                int var15 = var4.field3342 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field3348 * var15 >> 8) + var4.field3344;
                    int var17 = (var4.field3355 * var15 >> 8) + var4.field3354;
                    int var18 = (var4.field3351 * var15 >> 8) + var4.field3339;
                    int var19 = (var4.field3353 * var15 >> 8) + var4.field3356;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field3349 == 4) {
                int var20 = arg2 - var4.field3342;
                if (var20 > 0) {
                    int var21 = (var4.field3348 * var20 >> 8) + var4.field3344;
                    int var22 = (var4.field3355 * var20 >> 8) + var4.field3354;
                    int var23 = (var4.field3351 * var20 >> 8) + var4.field3339;
                    int var24 = (var4.field3353 * var20 >> 8) + var4.field3356;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field3349 == 5) {
                int var25 = arg1 - var4.field3339;
                if (var25 > 0) {
                    int var26 = (var4.field3348 * var25 >> 8) + var4.field3344;
                    int var27 = (var4.field3355 * var25 >> 8) + var4.field3354;
                    int var28 = (var4.field3341 * var25 >> 8) + var4.field3342;
                    int var29 = (var4.field3340 * var25 >> 8) + var4.field3347;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
    public static void method1571(int arg0) {
        field3510 = null;
        field3504 = null;
        field3507 = null;
        int var1 = -46 / ((arg0 + 16) / 45);
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V")
    public final void method1572(int arg0) {
        this.field3511.method1661(false);
        this.field3516.method1898(124);
        this.field3509 = new class55();
        this.field3514 = this.field3515;
        if (arg0 != 8) {
            method1571(12);
        }
        field3506++;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)Lnh;")
    public final class288 method1573(byte arg0) {
        field3501++;
        if (arg0 != -78) {
            this.method1568((byte) 75, (class55) null, 87L);
        }
        return this.field3516.method1890((byte) 120);
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(I)V")
    public class241(int arg0) {
        this.field3515 = arg0;
        this.field3514 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field3516 = new class284(var2);
    }
}
