import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class490 implements Runnable {

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "[Lvn;")
    public volatile class313[] field6998 = new class313[2];

    @OriginalMember(owner = "client!kp", name = "j", descriptor = "Z")
    public volatile boolean field7003 = false;

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "Z")
    public volatile boolean field6997 = false;

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "[I")
    public static int[] field7000 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "Lqe;")
    public static class469 field6994 = new class469(98, 17);

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "I")
    public static int field6995;

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "I")
    public static int field6999;

    @OriginalMember(owner = "client!kp", name = "h", descriptor = "I")
    public static int field7001;

    @OriginalMember(owner = "client!kp", name = "i", descriptor = "I")
    public static int field7002;

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "Lge;")
    public class711 field6996;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;")
    public static final String method2930(int arg0, String[] arg1, int arg2, int arg3) {
        field6995++;
        if (arg2 == 0) {
            return "";
        } else if (arg2 == 1) {
            String var4 = arg1[arg3];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg2 + arg3;
            int var6 = 0;
            for (int var7 = arg3; var7 < var5; var7++) {
                String var12 = arg1[var7];
                if (var12 == null) {
                    var6 += 4;
                } else {
                    var6 += var12.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg3; var9 < var5; var9++) {
                String var11 = arg1[var9];
                if (var11 == null) {
                    var8.append("null");
                } else {
                    var8.append(var11);
                }
            }
            int var10 = -60 % ((-arg0 - 59) / 49);
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIIILha;)V")
    public static final void method2931(int arg0, int arg1, int arg2, int arg3, int arg4, class60 arg5) {
        field6999++;
        arg5.method476(arg3, arg1, arg0 + arg3, arg1 + arg2);
        arg5.method482(arg3, -16777216, arg0, 1, arg1, arg2);
        if (class735.field10311 < 100) {
            return;
        }
        float var6 = (float) class84.field1198 / (float) class84.field1204;
        int var7 = arg0;
        if (arg4 <= 11) {
            method2933(57);
        }
        int var8 = arg2;
        if (var6 < 1.0F) {
            var8 = (int) ((float) arg0 * var6);
        } else {
            var7 = (int) ((float) arg2 / var6);
        }
        int var9 = (arg2 - var8) / 2 + arg1;
        int var10 = (arg0 - var7) / 2 + arg3;
        if (class519.field7415 == null || arg0 != class519.field7415.method1517() || arg2 != class519.field7415.method1510()) {
            class84.method687(class84.field1201, class84.field1198 + class84.field1190, class84.field1201 - -class84.field1204, class84.field1190, var10, var9, var7 + var10, var8 + var9);
            class84.method683(arg5);
            class519.field7415 = arg5.method470(var10, var9, var7, var8, false);
        }
        class519.field7415.method3142(var10, var9);
        int var11 = class678.field9432 * var7 / class84.field1204;
        int var12 = class751.field10497 * var8 / class84.field1198;
        int var13 = class218.field3215 * var7 / class84.field1204 + var10;
        int var14 = var9 - var12 - (class255.field3664 * var8 / class84.field1198 + -var8);
        int var15 = -1996554240;
        if (class373.field5652 == class199.field2993) {
            var15 = -1996488705;
        }
        arg5.method516(var13, var14, var11, var12, var15, 1);
        arg5.method525(var13, var14, var11, var12, var15, 0);
        if (class712.field10051 <= 0) {
            return;
        }
        int var16;
        if (class439.field6501 > 50) {
            var16 = (100 - class439.field6501) * 5;
        } else {
            var16 = class439.field6501 * 5;
        }
        for (class622 var17 = (class622) class84.field1180.method1195(0); var17 != null; var17 = (class622) class84.field1180.method1201(2)) {
            class519 var18 = class84.field1175.method864(84, var17.field8729);
            if (class79.method646((byte) 122, var18)) {
                if (class601.field8510 == var17.field8729) {
                    int var21 = var17.field8732 * var7 / class84.field1204 + var10;
                    int var22 = (class84.field1198 - var17.field8735) * var8 / class84.field1198 + var9;
                    arg5.method482(var21 - 2, var16 << 24 | 0xFFFF00, 4, 1, var22 - 2, 4);
                } else if (class627.field8776 != -1 && class627.field8776 == var18.field7412) {
                    int var19 = var17.field8732 * var7 / class84.field1204 + var10;
                    int var20 = (class84.field1198 - var17.field8735) * var8 / class84.field1198 + var9;
                    arg5.method482(var19 - 2, var16 << 24 | 0xFFFF00, 4, 1, var20 - 2, 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V")
    public static void method2932(int arg0) {
        field6994 = null;
        field7000 = null;
        if (arg0 != 18841) {
            field7000 = null;
        }
    }

    @OriginalMember(owner = "client!kp", name = "run", descriptor = "()V")
    public final void run() {
        field7001++;
        this.field6997 = true;
        try {
            while (!this.field7003) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class313 var2 = this.field6998[var1];
                    if (var2 != null) {
                        var2.method1981(0);
                    }
                }
                class277.method1759(10L, -94);
                class340.method2163((byte) 2, this.field6996, null);
            }
        } catch (Exception var9) {
            class326.method2072(-3753, var9, null);
        } finally {
            Object var6 = null;
            this.field6997 = false;
        }
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)V")
    public static final void method2933(int arg0) {
        if (arg0 != 16776960) {
            return;
        }
        for (int var1 = 0; var1 < class411.field6179; var1++) {
            class240.field3494[var1] = null;
        }
        field7002++;
        class411.field6179 = 0;
        for (int var2 = 0; var2 < class409.field6165; var2++) {
            for (int var42 = 0; var42 < class34.field356; var42++) {
                for (int var43 = 0; var43 < class565.field8040; var43++) {
                    class186 var44 = class80.field1136[var2][var43][var42];
                    if (var44 != null) {
                        if (var44.field2837 > 0) {
                            var44.field2837 = (short) (var44.field2837 * -1);
                        }
                        if (var44.field2833 > 0) {
                            var44.field2833 = (short) (var44.field2833 * -1);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < class409.field6165; var3++) {
            for (int var4 = 0; var4 < class34.field356; var4++) {
                for (int var5 = 0; var5 < class565.field8040; var5++) {
                    class186 var6 = class80.field1136[var3][var5][var4];
                    if (var6 != null) {
                        boolean var7 = class80.field1136[0][var5][var4] != null && class80.field1136[0][var5][var4].field2842 != null;
                        if (var6.field2833 < 0) {
                            int var8 = var4;
                            int var9 = var4;
                            int var11 = var3;
                            class186 var12 = class80.field1136[var3][var5][var4 - 1];
                            int var13 = class531.field7566[var3].method1787(var5, arg0 ^ 0xFFB3BE, var4);
                            while (var8 > 0 && var12 != null && var12.field2833 < 0 && var6.field2833 == var12.field2833 && var6.field2839 == var12.field2839 && class531.field7566[var3].method1787(var5, 19646, var8 - 1) == var13 && ((var8 - 1) <= 0 || class531.field7566[var3].method1787(var5, 19646, var8 - 2) == var13)) {
                                var8--;
                                var12 = class80.field1136[var3][var5][var8 - 1];
                            }
                            for (class186 var14 = class80.field1136[var3][var5][var4 + 1]; var9 < class565.field8040 && var14 != null && var14.field2833 < 0 && var6.field2833 == var14.field2833 && var6.field2839 == var14.field2839 && class531.field7566[var3].method1787(var5, 19646, var9 + 1) == var13 && (var9 + 1 >= class565.field8040 || var13 == class531.field7566[var3].method1787(var5, 19646, var9 + 2)); var14 = class80.field1136[var3][var5][var9 + 1]) {
                                var9++;
                            }
                            int var15 = var3 + 1 - var3;
                            int var16 = class531.field7566[var7 ? var3 + 1 : var3].method1787(var5, 19646, var8);
                            int var17 = var6.field2833 * var15 + var16;
                            int var18 = class531.field7566[var7 ? var3 + 1 : var3].method1787(var5, 19646, var9 + 1);
                            int var19 = var6.field2833 * var15 + var18;
                            int var20 = var5 << class459.field6769;
                            int var21 = var8 << class459.field6769;
                            int var22 = (var9 << class459.field6769) + class504.field7164;
                            class240.field3494[class411.field6179++] = new class417(1, var3, var6.field2839 + var20, var6.field2839 + var20, var6.field2839 + var20, var6.field2839 + var20, var16, var18, var19, var17, var21, var22, var22, var21);
                            for (int var23 = var3; var23 <= var11; var23++) {
                                for (int var24 = var8; var24 <= var9; var24++) {
                                    class80.field1136[var23][var5][var24].field2833 = (short) (class80.field1136[var23][var5][var24].field2833 * -1);
                                }
                            }
                        }
                        if (var6.field2837 < 0) {
                            int var25 = var5;
                            int var26 = var5;
                            int var28 = var3;
                            class186 var29 = class80.field1136[var3][var5 - 1][var4];
                            int var30 = class531.field7566[var3].method1787(var5, 19646, var4);
                            while (var25 > 0 && var29 != null && var29.field2837 < 0 && var6.field2837 == var29.field2837 && var6.field2838 == var29.field2838 && class531.field7566[var3].method1787(var25 - 1, arg0 + -16757314, var4) == var30 && ((var25 - 1) <= 0 || var30 == class531.field7566[var3].method1787(var25 - 2, 19646, var4))) {
                                var25--;
                                var29 = class80.field1136[var3][var25 - 1][var4];
                            }
                            for (class186 var31 = class80.field1136[var3][var5 + 1][var4]; var26 < class34.field356 && var31 != null && var31.field2837 < 0 && var6.field2837 == var31.field2837 && var6.field2838 == var31.field2838 && var30 == class531.field7566[var3].method1787(var26 + 1, 19646, var4) && (class34.field356 <= var26 + 1 || var30 == class531.field7566[var3].method1787(var26 + 2, 19646, var4)); var31 = class80.field1136[var3][var26 + 1][var4]) {
                                var26++;
                            }
                            int var32 = var3 + 1 - var3;
                            int var33 = class531.field7566[var7 ? var3 + 1 : var3].method1787(var25, arg0 ^ 0xFFB3BE, var4);
                            int var34 = var6.field2837 * var32 + var33;
                            int var35 = class531.field7566[var7 ? var3 + 1 : var3].method1787(var26 + 1, 19646, var4);
                            int var36 = var6.field2837 * var32 + var35;
                            int var37 = var25 << class459.field6769;
                            int var38 = (var26 << class459.field6769) + class504.field7164;
                            int var39 = var4 << class459.field6769;
                            class240.field3494[class411.field6179++] = new class417(2, var3, var37, var38, var38, var37, var33, var35, var36, var34, var6.field2838 + var39, var6.field2838 + var39, var6.field2838 + var39, var6.field2838 + var39);
                            for (int var40 = var3; var40 <= var28; var40++) {
                                for (int var41 = var25; var41 <= var26; var41++) {
                                    class80.field1136[var40][var41][var4].field2837 = (short) (class80.field1136[var40][var41][var4].field2837 * -1);
                                }
                            }
                        }
                    }
                }
            }
        }
        class262.field3715 = true;
    }
}
