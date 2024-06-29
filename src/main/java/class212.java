import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class212 {

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "Z")
    public boolean field3363 = true;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public int field3361;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
    public int field3365;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public int field3364;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public int field3359;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public int field3357;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public int field3360;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "[[[I")
    public static int[][][] field3362;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "()V", line = 7)
    public static final void method1418() {
        class268.field4136 = 0;
        label194: for (int var0 = 0; var0 < class175.field2684; var0++) {
            class58 var1 = class234.field3766[var0];
            if (class190.field2893 != null) {
                for (int var2 = 0; var2 < class190.field2893.length; var2++) {
                    if (class190.field2893[var2] != -1000000 && (var1.field807 <= class190.field2893[var2] || var1.field803 <= class190.field2893[var2]) && (var1.field804 <= class234.field3764[var2] || var1.field811 <= class234.field3764[var2]) && (var1.field804 >= class63.field942[var2] || var1.field811 >= class63.field942[var2]) && (var1.field809 <= class314.field4955[var2] || var1.field820 <= class314.field4955[var2]) && (var1.field809 >= class273.field4209[var2] || var1.field820 >= class273.field4209[var2])) {
                        continue label194;
                    }
                }
            }
            if (var1.field817 == 1) {
                int var3 = var1.field816 + class50.field712 - class77.field1151;
                if (var3 >= 0 && var3 <= class50.field712 + class50.field712) {
                    int var4 = var1.field814 + class50.field712 - class335.field5208;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field819 + class50.field712 - class335.field5208;
                    if (var5 > class50.field712 + class50.field712) {
                        var5 = class50.field712 + class50.field712;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class131.field2057[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class343.field5342 - var1.field804;
                        if (var7 > 32) {
                            var1.field808 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field808 = 2;
                            var7 = -var7;
                        }
                        var1.field813 = (var1.field809 - class246.field3859 << 8) / var7;
                        var1.field822 = (var1.field820 - class246.field3859 << 8) / var7;
                        var1.field821 = (var1.field807 - class99.field1542 << 8) / var7;
                        var1.field806 = (var1.field803 - class99.field1542 << 8) / var7;
                        class38.field485[class268.field4136++] = var1;
                    }
                }
            } else if (var1.field817 == 2) {
                int var8 = var1.field814 + class50.field712 - class335.field5208;
                if (var8 >= 0 && var8 <= class50.field712 + class50.field712) {
                    int var9 = var1.field816 + class50.field712 - class77.field1151;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field815 + class50.field712 - class77.field1151;
                    if (var10 > class50.field712 + class50.field712) {
                        var10 = class50.field712 + class50.field712;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class131.field2057[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class246.field3859 - var1.field809;
                        if (var12 > 32) {
                            var1.field808 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field808 = 4;
                            var12 = -var12;
                        }
                        var1.field812 = (var1.field804 - class343.field5342 << 8) / var12;
                        var1.field805 = (var1.field811 - class343.field5342 << 8) / var12;
                        var1.field821 = (var1.field807 - class99.field1542 << 8) / var12;
                        var1.field806 = (var1.field803 - class99.field1542 << 8) / var12;
                        class38.field485[class268.field4136++] = var1;
                    }
                }
            } else if (var1.field817 == 4) {
                int var13 = var1.field807 - class99.field1542;
                if (var13 > 128) {
                    int var14 = var1.field814 + class50.field712 - class335.field5208;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field819 + class50.field712 - class335.field5208;
                    if (var15 > class50.field712 + class50.field712) {
                        var15 = class50.field712 + class50.field712;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field816 + class50.field712 - class77.field1151;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field815 + class50.field712 - class77.field1151;
                        if (var17 > class50.field712 + class50.field712) {
                            var17 = class50.field712 + class50.field712;
                        }
                        boolean var18 = false;
                        label166: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class131.field2057[var19][var20]) {
                                    var18 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var18) {
                            var1.field808 = 5;
                            var1.field812 = (var1.field804 - class343.field5342 << 8) / var13;
                            var1.field805 = (var1.field811 - class343.field5342 << 8) / var13;
                            var1.field813 = (var1.field809 - class246.field3859 << 8) / var13;
                            var1.field822 = (var1.field820 - class246.field3859 << 8) / var13;
                            class38.field485[class268.field4136++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BI)I", line = 234)
    public static final int method1419(byte arg0, int arg1) {
        if (arg0 != -90) {
            field3362 = (int[][][]) ((int[][][]) null);
        }
        field3356++;
        return (arg1 & 0x3FD78) >> 11;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IZJ)V", line = 245)
    public static final void method1420(int arg0, boolean arg1, long arg2) {
        field3358++;
        if (arg2 == 0L) {
            return;
        }
        if (class190.field2891 >= 100) {
            class343.method2390(class132.field2090, 0, false, "");
            return;
        }
        String var4 = class305.method2073(false, arg2);
        for (int var5 = 0; var5 < class190.field2891; var5++) {
            if (class115.field1792[var5] == arg2) {
                class343.method2390(var4 + class275.field4240, 0, false, "");
                return;
            }
        }
        for (int var6 = arg0; var6 < class116.field1795; var6++) {
            if (class81.field1205[var6] == arg2) {
                class343.method2390(class187.field2842 + var4 + class35.field450, 0, false, "");
                return;
            }
        }
        if (var4.equals(class79.field1173.field1218)) {
            class343.method2390(class317.field4982, 0, false, "");
            return;
        }
        class155.field2436++;
        class115.field1792[class190.field2891] = arg2;
        class317.field4978[class190.field2891] = class275.method1805(false, arg2);
        class240.field3819[class190.field2891++] = arg1;
        class315.field4968 = class71.field1068;
        class265.field4095.method2064(255, 117);
        class265.field4095.method2023(arg2, arg0 ^ 0xFFFFFFBA);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)V", line = 310)
    public static void method1421(boolean arg0) {
        if (!arg0) {
            field3362 = (int[][][]) ((int[][][]) null);
        }
        field3362 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(IIIIIIZ)V", line = 324)
    public class212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field3363 = arg6;
        this.field3361 = arg4;
        this.field3365 = arg3;
        this.field3364 = arg2;
        this.field3359 = arg1;
        this.field3357 = arg0;
        this.field3360 = arg5;
    }
}
