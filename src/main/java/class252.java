import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class252 extends class101 {

    @OriginalMember(owner = "client!v", name = "D", descriptor = "I")
    public int field3770 = 0;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "I")
    public static int field3757 = 0;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "S")
    public static short field3756 = 32767;

    @OriginalMember(owner = "client!v", name = "C", descriptor = "I")
    public static int field3769 = 0;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "I")
    public int field3754;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "I")
    public int field3755;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "I")
    public int field3758;

    @OriginalMember(owner = "client!v", name = "t", descriptor = "I")
    public int field3760;

    @OriginalMember(owner = "client!v", name = "u", descriptor = "I")
    public int field3761;

    @OriginalMember(owner = "client!v", name = "v", descriptor = "I")
    public int field3762;

    @OriginalMember(owner = "client!v", name = "x", descriptor = "I")
    public int field3764;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "I")
    public int field3766;

    @OriginalMember(owner = "client!v", name = "E", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!v", name = "F", descriptor = "I")
    public int field3772;

    @OriginalMember(owner = "client!v", name = "G", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!v", name = "H", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!v", name = "J", descriptor = "I")
    public int field3775;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "Lqg;")
    public class195 field3753;

    @OriginalMember(owner = "client!v", name = "w", descriptor = "Llm;")
    public static class210 field3763;

    @OriginalMember(owner = "client!v", name = "K", descriptor = "Lni;")
    public class219 field3776;

    @OriginalMember(owner = "client!v", name = "L", descriptor = "Lni;")
    public class219 field3777;

    @OriginalMember(owner = "client!v", name = "A", descriptor = "Lna;")
    public class22 field3767;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "Lgg;")
    public class69 field3765;

    @OriginalMember(owner = "client!v", name = "B", descriptor = "Z")
    public boolean field3768;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "[I")
    public int[] field3759;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(B)V", line = 4)
    public final void method1701(byte arg0) {
        if (arg0 >= -17) {
            return;
        }
        int var2 = this.field3755;
        field3773++;
        if (this.field3767 != null) {
            class22 var3 = this.field3767.method142(0);
            if (var3 == null) {
                this.field3754 = 0;
                this.field3758 = 0;
                this.field3755 = -1;
                this.field3761 = 0;
                this.field3759 = null;
            } else {
                this.field3755 = var3.field303;
                this.field3761 = var3.field279;
                this.field3759 = var3.field326;
                this.field3758 = var3.field284 * 128;
                this.field3754 = var3.field304;
            }
        } else if (this.field3765 != null) {
            int var4 = class145.method1039(this.field3765, 122);
            if (var2 != var4) {
                this.field3755 = var4;
                class58 var5 = this.field3765.field914;
                if (var5.field756 != null) {
                    var5 = var5.method390(80);
                }
                if (var5 == null) {
                    this.field3758 = 0;
                } else {
                    this.field3758 = var5.field773 * 128;
                }
            }
        } else if (this.field3753 != null) {
            this.field3755 = class152.method1094(this.field3753, -1753104468);
            this.field3758 = this.field3753.field2920 * 128;
        }
        if (this.field3755 != var2 && this.field3776 != null) {
            class72.field936.method2230(this.field3776);
            this.field3776 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Llm;B)I", line = 88)
    public static final int method1702(class210 arg0, byte arg1) {
        field3771++;
        int var2 = 0;
        if (arg0.method1431(class37.field453, -70)) {
            var2++;
        }
        if (arg0.method1431(class87.field1290, -123)) {
            var2++;
        }
        if (arg0.method1431(class315.field4763, -21)) {
            var2++;
        }
        if (arg0.method1431(class23.field346, -118)) {
            var2++;
        }
        if (arg0.method1431(class75.field978, -58)) {
            var2++;
        }
        if (arg0.method1431(class3.field14, -23)) {
            var2++;
        }
        int var3 = -16 % ((-arg1 - 43) / 62);
        if (arg0.method1431(class36.field440, -11)) {
            var2++;
        }
        if (arg0.method1431(class246.field3668, -107)) {
            var2++;
        }
        if (arg0.method1431(class177.field2629, -15)) {
            var2++;
        }
        if (arg0.method1431(class92.field1376, -46)) {
            var2++;
        }
        if (arg0.method1431(class305.field4645, -60)) {
            var2++;
        }
        if (arg0.method1431(class72.field939, -122)) {
            var2++;
        }
        if (arg0.method1431(class288.field4349, -121)) {
            var2++;
        }
        if (arg0.method1431(class209.field3153, -18)) {
            var2++;
        }
        if (arg0.method1431(class306.field4670, -60)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "()V", line = 165)
    public static final void method1703() {
        class194.field2896 = 0;
        label194: for (int var0 = 0; var0 < class302.field4616; var0++) {
            class44 var1 = class154.field2314[var0];
            if (class256.field3879 != null) {
                for (int var2 = 0; var2 < class256.field3879.length; var2++) {
                    if (class256.field3879[var2] != -1000000 && (var1.field562 <= class256.field3879[var2] || var1.field533 <= class256.field3879[var2]) && (var1.field559 <= class84.field1250[var2] || var1.field537 <= class84.field1250[var2]) && (var1.field559 >= class167.field2512[var2] || var1.field537 >= class167.field2512[var2]) && (var1.field552 <= class326.field4909[var2] || var1.field538 <= class326.field4909[var2]) && (var1.field552 >= class7.field37[var2] || var1.field538 >= class7.field37[var2])) {
                        continue label194;
                    }
                }
            }
            if (var1.field536 == 1) {
                int var3 = var1.field544 + class90.field1339 - class271.field4153;
                if (var3 >= 0 && var3 <= class90.field1339 + class90.field1339) {
                    int var4 = var1.field551 + class90.field1339 - class147.field2214;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field540 + class90.field1339 - class147.field2214;
                    if (var5 > class90.field1339 + class90.field1339) {
                        var5 = class90.field1339 + class90.field1339;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class293.field4487[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class44.field556 - var1.field559;
                        if (var7 > 32) {
                            var1.field557 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field557 = 2;
                            var7 = -var7;
                        }
                        var1.field535 = (var1.field552 - class316.field4773 << 8) / var7;
                        var1.field554 = (var1.field538 - class316.field4773 << 8) / var7;
                        var1.field542 = (var1.field562 - class257.field3885 << 8) / var7;
                        var1.field558 = (var1.field533 - class257.field3885 << 8) / var7;
                        class68.field893[class194.field2896++] = var1;
                    }
                }
            } else if (var1.field536 == 2) {
                int var8 = var1.field551 + class90.field1339 - class147.field2214;
                if (var8 >= 0 && var8 <= class90.field1339 + class90.field1339) {
                    int var9 = var1.field544 + class90.field1339 - class271.field4153;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field548 + class90.field1339 - class271.field4153;
                    if (var10 > class90.field1339 + class90.field1339) {
                        var10 = class90.field1339 + class90.field1339;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class293.field4487[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class316.field4773 - var1.field552;
                        if (var12 > 32) {
                            var1.field557 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field557 = 4;
                            var12 = -var12;
                        }
                        var1.field550 = (var1.field559 - class44.field556 << 8) / var12;
                        var1.field545 = (var1.field537 - class44.field556 << 8) / var12;
                        var1.field542 = (var1.field562 - class257.field3885 << 8) / var12;
                        var1.field558 = (var1.field533 - class257.field3885 << 8) / var12;
                        class68.field893[class194.field2896++] = var1;
                    }
                }
            } else if (var1.field536 == 4) {
                int var13 = var1.field562 - class257.field3885;
                if (var13 > 128) {
                    int var14 = var1.field551 + class90.field1339 - class147.field2214;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field540 + class90.field1339 - class147.field2214;
                    if (var15 > class90.field1339 + class90.field1339) {
                        var15 = class90.field1339 + class90.field1339;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field544 + class90.field1339 - class271.field4153;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field548 + class90.field1339 - class271.field4153;
                        if (var17 > class90.field1339 + class90.field1339) {
                            var17 = class90.field1339 + class90.field1339;
                        }
                        boolean var18 = false;
                        label166: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class293.field4487[var19][var20]) {
                                    var18 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var18) {
                            var1.field557 = 5;
                            var1.field550 = (var1.field559 - class44.field556 << 8) / var13;
                            var1.field545 = (var1.field537 - class44.field556 << 8) / var13;
                            var1.field535 = (var1.field552 - class316.field4773 << 8) / var13;
                            var1.field554 = (var1.field538 - class316.field4773 << 8) / var13;
                            class68.field893[class194.field2896++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IZIII)V", line = 392)
    public static final void method1704(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class325.field4898; var5++) {
            if (class6.field29[var5] + class228.field3473[var5] > arg2 && (arg2 + arg4) > class228.field3473[var5] && (class307.field4678[var5] + class15.field168[var5]) > arg0 && class15.field168[var5] < (arg0 + arg3)) {
                class22.field298[var5] = true;
            }
        }
        field3774++;
        if (arg1) {
            method1705(-27);
        }
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(I)V", line = 414)
    public static void method1705(int arg0) {
        field3763 = null;
        if (arg0 != 2) {
            method1705(22);
        }
    }
}
