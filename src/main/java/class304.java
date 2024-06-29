import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class304 extends class132 {

    @OriginalMember(owner = "client!rr", name = "z", descriptor = "Lnr;")
    public class51 field4145;

    @OriginalMember(owner = "client!rr", name = "A", descriptor = "Lcba;")
    public static class471 field4146 = new class471(66, 9);

    @OriginalMember(owner = "client!rr", name = "C", descriptor = "I")
    public static int field4148 = 0;

    @OriginalMember(owner = "client!rr", name = "E", descriptor = "I")
    public static int field4150 = 0;

    @OriginalMember(owner = "client!rr", name = "D", descriptor = "Z")
    public static boolean field4149 = false;

    @OriginalMember(owner = "client!rr", name = "H", descriptor = "Lej;")
    public static class104 field4153 = new class104("Started 3D Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

    @OriginalMember(owner = "client!rr", name = "I", descriptor = "Lej;")
    public static class104 field4154 = new class104("Loaded HW3D", "HW3D geladen", "HW3D chargé", "HW3D carregado");

    @OriginalMember(owner = "client!rr", name = "y", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!rr", name = "B", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!rr", name = "F", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!rr", name = "G", descriptor = "I")
    public static int field4152;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rr", name = "J", descriptor = "Ljava/lang/Class;")
    public static Class field4155;

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(III)I")
    public static final int method1926(int arg0, int arg1, int arg2) {
        field4151++;
        int var3 = class28.method305((byte) 92, arg2 + 45365, 4, arg0 + 91923) + (class28.method305((byte) -99, arg2 + 10294, 2, arg0 + 37821) - 128 >> 1) + (class28.method305((byte) 119, arg2, arg1, arg0) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)V")
    public static void method1927(int arg0) {
        if (arg0 > -43) {
            field4146 = null;
        }
        field4154 = null;
        field4146 = null;
        field4153 = null;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "()V")
    public static final void method1928() {
        for (int var0 = 0; var0 < class517.field7258; var0++) {
            if (!class335.field4463[var0]) {
                class579 var1 = class363.field4863[var0];
                class223 var2 = var1.field7959;
                int var3 = var1.field7956;
                int var4 = var2.method1433(4294) - class194.field2745;
                int var5 = (var4 * 2 >> class272.field3786) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method1434(7) - var4 >> class272.field3786;
                int var9 = var2.method1429(4330) - var4 >> class272.field3786;
                int var10 = var2.method1429(4330) + var4 >> class272.field3786;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class34.field624) {
                    var10 = class34.field624 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field7963[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class332.field4447) {
                        var16 = class332.field4447 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class425 var19 = class582.method3324(var3, var17, var11, field4155 == null ? (field4155 = method1932("lm")) : field4155);
                        if (var19 != null && var19.field6041 != 0) {
                            if (var19.field6041 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field7963[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field7963[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 0xFF) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field7963[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field7963[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 0xFF) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    var6++;
                }
                class335.field4463[var0] = true;
                class590.field8430[var3].method1095(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(BI)V")
    public static final void method1929(byte arg0, int arg1) {
        field4147++;
        class92.method679(73);
        int var2 = class534.field7474.method588(1, arg1).field96;
        if (var2 == 0 || arg0 < 126) {
            return;
        }
        int var3 = class189.field2681.field6447[arg1];
        if (var2 == 6) {
            class510.field7142 = var3;
        }
        if (var2 == 5) {
            class384.field5143 = var3;
        }
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(III)I")
    public static final int method1930(int arg0, int arg1, int arg2) {
        field4152++;
        if (arg1 == 1 || arg1 == 3) {
            return class384.field5145[arg0 & 0x3];
        } else {
            if (arg2 != -128) {
                method1930(-121, 1, 94);
            }
            return class91.field1425[arg0 & 0x3];
        }
    }

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "(III)Z")
    public static final boolean method1931(int arg0, int arg1, int arg2) {
        field4144++;
        if (arg0 != 65536) {
            field4146 = null;
        }
        return (arg1 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lnr;)V")
    public class304(class51 arg0) {
        this.field4145 = arg0;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1932(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
