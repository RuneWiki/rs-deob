import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class202 extends class23 {

    @OriginalMember(owner = "client!t", name = "y", descriptor = "Lam;")
    public class180 field3155 = new class180();

    @OriginalMember(owner = "client!t", name = "H", descriptor = "Lbc;")
    public class178 field3163 = new class178();

    @OriginalMember(owner = "client!t", name = "w", descriptor = "Lti;")
    private class5 field3153;

    @OriginalMember(owner = "client!t", name = "C", descriptor = "La;")
    public static class49 field3159 = new class49();

    @OriginalMember(owner = "client!t", name = "u", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!t", name = "v", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!t", name = "x", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!t", name = "z", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!t", name = "A", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!t", name = "B", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!t", name = "D", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!t", name = "E", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!t", name = "G", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!t", name = "I", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "()Lwd;")
    public final class23 method45() {
        field3152++;
        class89 var1;
        do {
            var1 = (class89) this.field3155.method1227(-10626);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1555 == null);
        return var1.field1555;
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(I)V")
    public static void method1362(int arg0) {
        field3159 = null;
        if (arg0 >= -100) {
            field3159 = null;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "()I")
    public final int method22() {
        field3154++;
        return 0;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljd;[IIIIZ)V")
    private final void method1363(class89 arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg5) {
            return;
        }
        if ((this.field3153.field109[arg0.field1541] & 0x4) != 0 && arg0.field1558 < 0) {
            int var7 = this.field3153.field79[arg0.field1541] / class186.field2873;
            while (true) {
                int var8 = (var7 + 1048575 - arg0.field1561) / var7;
                if (var8 > arg3) {
                    arg0.field1561 += arg3 * var7;
                    break;
                }
                arg0.field1555.method26(arg1, arg4, var8);
                arg3 -= var8;
                arg0.field1561 += var7 * var8 - 1048576;
                int var9 = 262144 / var7;
                int var10 = class186.field2873 / 100;
                if (var10 > var9) {
                    var10 = var9;
                }
                class14 var11 = arg0.field1555;
                if (this.field3153.field100[arg0.field1541] == 0) {
                    arg0.field1555 = class14.method147(arg0.field1547, var11.method136(), var11.method141(), var11.method139());
                } else {
                    arg0.field1555 = class14.method147(arg0.field1547, var11.method136(), 0, var11.method139());
                    this.field3153.method52(1, arg0.field1546.field4415[arg0.field1554] < 0, arg0);
                    arg0.field1555.method115(var10, var11.method141());
                }
                arg4 += var8;
                if (arg0.field1546.field4415[arg0.field1554] < 0) {
                    arg0.field1555.method152(-1);
                }
                var11.method116(var10);
                var11.method26(arg1, arg4, arg2 - arg4);
                if (var11.method149()) {
                    this.field3163.method1203(var11);
                }
            }
        }
        field3160++;
        arg0.field1555.method26(arg1, arg4, arg3);
    }

    @OriginalMember(owner = "client!t", name = "e", descriptor = "(I)V")
    public static final void method1364(int arg0) {
        field3158++;
        if (class155.field2412 > class218.field3370) {
            class218.field3370 = (float) ((double) class218.field3370 / 30.0D + (double) class218.field3370);
            if (class155.field2412 < class218.field3370) {
                class218.field3370 = class155.field2412;
            }
            class56.method427(115);
        } else if (class155.field2412 < class218.field3370) {
            class218.field3370 = (float) ((double) class218.field3370 - (double) class218.field3370 / 30.0D);
            if (class155.field2412 > class218.field3370) {
                class218.field3370 = class155.field2412;
            }
            class56.method427(37);
        }
        if (arg0 < 4) {
            method1365(true, (int[]) null, (int[]) null, (class45) null, (int[]) null);
        }
        if (class4.field27 == -1 || class250.field4038 == -1) {
            return;
        }
        int var1 = class4.field27 - class293.field4621;
        int var2 = class250.field4038 - class201.field3148;
        if (var1 < 2 || var1 > 2) {
            var1 >>= 0x4;
        }
        if (var2 < 2 || var2 > 2) {
            var2 >>= 0x4;
        }
        class201.field3148 += var2;
        if (var1 == 0 && var2 == 0) {
            class4.field27 = -1;
            class250.field4038 = -1;
        }
        class293.field4621 -= -var1;
        class56.method427(96);
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V")
    public final void method32(int arg0) {
        this.field3163.method32(arg0);
        field3164++;
        for (class89 var2 = (class89) this.field3155.method1221(120); var2 != null; var2 = (class89) this.field3155.method1227(-10626)) {
            if (!this.field3153.method55(var2, 5)) {
                int var3 = arg0;
                do {
                    if (var2.field1562 >= var3) {
                        this.method1366(var3, var2, true);
                        var2.field1562 -= var3;
                        break;
                    }
                    this.method1366(var2.field1562, var2, true);
                    var3 -= var2.field1562;
                } while (!this.field3153.method60(var2, (byte) 88, (int[]) null, 0, var3));
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Z[I[ILsd;[I)V")
    public static final void method1365(boolean arg0, int[] arg1, int[] arg2, class45 arg3, int[] arg4) {
        field3161++;
        if (arg0) {
            method1364(11);
        }
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = arg1[var5];
            int var7 = arg2[var5];
            int var8 = arg4[var5];
            for (int var9 = 0; var8 != 0 && arg3.field2273.length > var9; var9++) {
                if ((var8 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg3.field2273[var9] = null;
                    } else {
                        class30 var10 = class148.method996(-128, var6);
                        int var11 = var10.field450;
                        class65 var12 = arg3.field2273[var9];
                        if (var12 != null) {
                            if (var12.field1094 == var6) {
                                if (var11 == 0) {
                                    var12 = arg3.field2273[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field1086 = 0;
                                    var12.field1097 = var7;
                                    var12.field1087 = 1;
                                    var12.field1088 = 0;
                                    var12.field1095 = 0;
                                    class52.method390(false, var10, 0, 102, arg3.field2278, arg3.field2240);
                                } else if (var11 == 2) {
                                    var12.field1086 = 0;
                                }
                            } else if (var10.field440 >= class148.method996(-103, var12.field1094).field440) {
                                var12 = arg3.field2273[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class65 var13 = arg3.field2273[var9] = new class65();
                            var13.field1097 = var7;
                            var13.field1088 = 0;
                            var13.field1095 = 0;
                            var13.field1086 = 0;
                            var13.field1087 = 1;
                            var13.field1094 = var6;
                            class52.method390(false, var10, 0, 100, arg3.field2278, arg3.field2240);
                        }
                    }
                }
                var8 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILjd;Z)V")
    private final void method1366(int arg0, class89 arg1, boolean arg2) {
        if (!arg2) {
            this.field3155 = null;
        }
        field3156++;
        if ((this.field3153.field109[arg1.field1541] & 0x4) != 0 && arg1.field1558 < 0) {
            int var4 = this.field3153.field79[arg1.field1541] / class186.field2873;
            int var5 = (var4 + 1048575 - arg1.field1561) / var4;
            arg1.field1561 = arg1.field1561 + (arg0 * var4) & 0xFFFFF;
            if (arg0 >= var5) {
                if (this.field3153.field100[arg1.field1541] == 0) {
                    arg1.field1555 = class14.method147(arg1.field1547, arg1.field1555.method136(), arg1.field1555.method141(), arg1.field1555.method139());
                } else {
                    arg1.field1555 = class14.method147(arg1.field1547, arg1.field1555.method136(), 0, arg1.field1555.method139());
                    this.field3153.method52(1, arg1.field1546.field4415[arg1.field1554] < 0, arg1);
                }
                if (arg1.field1546.field4415[arg1.field1554] < 0) {
                    arg1.field1555.method152(-1);
                }
                arg0 = arg1.field1561 / var4;
            }
        }
        arg1.field1555.method32(arg0);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([III)V")
    public final void method26(int[] arg0, int arg1, int arg2) {
        this.field3163.method26(arg0, arg1, arg2);
        field3157++;
        for (class89 var4 = (class89) this.field3155.method1221(119); var4 != null; var4 = (class89) this.field3155.method1227(-10626)) {
            if (!this.field3153.method55(var4, 5)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field1562 >= var5) {
                        this.method1363(var4, arg0, var6 + var5, var5, var6, false);
                        var4.field1562 -= var5;
                        break;
                    }
                    this.method1363(var4, arg0, var5 + var6, var4.field1562, var6, false);
                    var5 -= var4.field1562;
                    var6 += var4.field1562;
                } while (!this.field3153.method60(var4, (byte) 88, arg0, var6, var5));
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "()Lwd;")
    public final class23 method33() {
        class89 var1 = (class89) this.field3155.method1221(122);
        field3151++;
        if (var1 == null) {
            return null;
        } else if (var1.field1555 == null) {
            return this.method45();
        } else {
            return var1.field1555;
        }
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lti;)V")
    public class202(class5 arg0) {
        this.field3153 = arg0;
    }
}
