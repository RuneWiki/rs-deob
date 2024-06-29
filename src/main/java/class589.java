import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class589 extends Exception {

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "[[I")
    public static int[][] field8419 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "Z")
    public static boolean field8420 = false;

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "Ldv;")
    public static class566 field8421 = new class566(57, 11);

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "[[F")
    public static float[][] field8422 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "I")
    public static int field8418;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)V")
    public static void method3453(int arg0) {
        if (arg0 >= -98) {
            method3455();
        }
        field8421 = null;
        field8422 = null;
        field8419 = null;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(II)I")
    public static int method3454(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "()V")
    public static final void method3455() {
        class144.field2227 = 0;
        label212: for (int var0 = 0; var0 < class134.field2127; var0++) {
            class626 var1 = class120.field1964[var0];
            if (class648.field9399 != null) {
                for (int var2 = 0; var2 < class648.field9399.length; var2++) {
                    if (class648.field9399[var2] != -1000000 && (var1.field9136 <= class648.field9399[var2] || var1.field9125 <= class648.field9399[var2]) && (var1.field9128 <= class205.field2887[var2] || var1.field9117 <= class205.field2887[var2]) && (var1.field9128 >= class37.field772[var2] || var1.field9117 >= class37.field772[var2]) && (var1.field9112 <= class393.field5546[var2] || var1.field9129 <= class393.field5546[var2]) && (var1.field9112 >= class520.field7329[var2] || var1.field9129 >= class520.field7329[var2])) {
                        continue label212;
                    }
                }
            }
            if (var1.field9137 == 1) {
                int var3 = var1.field9114 + class325.field4377 - class120.field1970;
                if (var3 >= 0 && var3 <= class325.field4377 + class325.field4377) {
                    int var4 = var1.field9124 + class325.field4377 - class546.field7561;
                    if (var4 < 0) {
                        var4 = 0;
                    } else if (var4 > class325.field4377 + class325.field4377) {
                        continue;
                    }
                    int var5 = var1.field9115 + class325.field4377 - class546.field7561;
                    if (var5 > class325.field4377 + class325.field4377) {
                        var5 = class325.field4377 + class325.field4377;
                    } else if (var5 < 0) {
                        continue;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class69.field1172[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class2.field31 - var1.field9128;
                        if (var7 > class293.field4031) {
                            var1.field9113 = 1;
                        } else {
                            if (var7 >= -class293.field4031) {
                                continue;
                            }
                            var1.field9113 = 2;
                            var7 = -var7;
                        }
                        var1.field9118 = (var1.field9112 - class454.field6417 << 8) / var7;
                        var1.field9123 = (var1.field9129 - class454.field6417 << 8) / var7;
                        var1.field9135 = (var1.field9136 - class48.field930 << 8) / var7;
                        var1.field9127 = (var1.field9125 - class48.field930 << 8) / var7;
                        class53.field996[class144.field2227++] = var1;
                    }
                }
            } else if (var1.field9137 == 2) {
                int var8 = var1.field9124 + class325.field4377 - class546.field7561;
                if (var8 >= 0 && var8 <= class325.field4377 + class325.field4377) {
                    int var9 = var1.field9114 + class325.field4377 - class120.field1970;
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > class325.field4377 + class325.field4377) {
                        continue;
                    }
                    int var10 = var1.field9122 + class325.field4377 - class120.field1970;
                    if (var10 > class325.field4377 + class325.field4377) {
                        var10 = class325.field4377 + class325.field4377;
                    } else if (var10 < 0) {
                        continue;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class69.field1172[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class454.field6417 - var1.field9112;
                        if (var12 > class293.field4031) {
                            var1.field9113 = 3;
                        } else {
                            if (var12 >= -class293.field4031) {
                                continue;
                            }
                            var1.field9113 = 4;
                            var12 = -var12;
                        }
                        var1.field9121 = (var1.field9128 - class2.field31 << 8) / var12;
                        var1.field9131 = (var1.field9117 - class2.field31 << 8) / var12;
                        var1.field9135 = (var1.field9136 - class48.field930 << 8) / var12;
                        var1.field9127 = (var1.field9125 - class48.field930 << 8) / var12;
                        class53.field996[class144.field2227++] = var1;
                    }
                }
            } else if (var1.field9137 == 4) {
                int var13 = var1.field9136 - class48.field930;
                if (var13 > field8418) {
                    int var14 = var1.field9124 + class325.field4377 - class546.field7561;
                    if (var14 < 0) {
                        var14 = 0;
                    } else if (var14 > class325.field4377 + class325.field4377) {
                        continue;
                    }
                    int var15 = var1.field9115 + class325.field4377 - class546.field7561;
                    if (var15 > class325.field4377 + class325.field4377) {
                        var15 = class325.field4377 + class325.field4377;
                    } else if (var15 < 0) {
                        continue;
                    }
                    int var16 = var1.field9114 + class325.field4377 - class120.field1970;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > class325.field4377 + class325.field4377) {
                        continue;
                    }
                    int var17 = var1.field9122 + class325.field4377 - class120.field1970;
                    if (var17 > class325.field4377 + class325.field4377) {
                        var17 = class325.field4377 + class325.field4377;
                    } else if (var17 < 0) {
                        continue;
                    }
                    boolean var18 = false;
                    label184: for (int var19 = var16; var19 <= var17; var19++) {
                        for (int var20 = var14; var20 <= var15; var20++) {
                            if (class69.field1172[var19][var20]) {
                                var18 = true;
                                break label184;
                            }
                        }
                    }
                    if (var18) {
                        var1.field9113 = 5;
                        var1.field9121 = (var1.field9128 - class2.field31 << 8) / var13;
                        var1.field9131 = (var1.field9117 - class2.field31 << 8) / var13;
                        var1.field9118 = (var1.field9112 - class454.field6417 << 8) / var13;
                        var1.field9123 = (var1.field9129 - class454.field6417 << 8) / var13;
                        class53.field996[class144.field2227++] = var1;
                    }
                }
            }
        }
    }
}
