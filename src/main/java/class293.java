import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class293 extends InputStream {

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "Ljf;")
    public static class229 field5017 = class212.method1457((byte) 87, "lila:");

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "Lni;")
    public static class24 field5016 = new class24(200);

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "Ljf;")
    public static class229 field5018 = class212.method1457((byte) 60, ")3");

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
    public static volatile int field5020 = 0;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
    public static int field5021 = 128;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "Ljf;")
    private static class229 field5024 = class212.method1457((byte) 71, "wave2:");

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "Ljf;")
    public static class229 field5022 = field5024;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "Ljf;")
    public static class229 field5019 = field5024;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "Lek;")
    public static class185 field5023;

    @OriginalMember(owner = "client!mk", name = "read", descriptor = "()I", line = 8)
    public final int read() {
        field5015++;
        class235.method1675((byte) -22, 30000L);
        return -1;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V", line = 35)
    public static final void method2032(int arg0) {
        class324.field5460.method226((byte) -106);
        class284.field4866.method226((byte) -96);
        field5014++;
        if (arg0 != 30000) {
            method2035();
        }
        class277.field4760.method226((byte) -115);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)V", line = 48)
    public static void method2033(boolean arg0) {
        field5023 = null;
        field5019 = null;
        if (arg0) {
            method2032(79);
        }
        field5022 = null;
        field5016 = null;
        field5018 = null;
        field5024 = null;
        field5017 = null;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(Z)V", line = 63)
    public static final void method2034(boolean arg0) {
        if (arg0) {
            class312.field5246 = class74.field1401;
            class132.field2328 = class242.field4270;
            class3.field20 = class321.field5431;
        } else {
            class312.field5246 = class320.field5411;
            class132.field2328 = class16.field256;
            class3.field20 = class1.field1;
        }
        class45.field828 = class312.field5246.length;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "()V", line = 85)
    public static final void method2035() {
        class184.field3189 = 0;
        label194: for (int var0 = 0; var0 < class312.field5247; var0++) {
            class150 var1 = class278.field4773[var0];
            if (class206.field3602 != null) {
                for (int var2 = 0; var2 < class206.field3602.length; var2++) {
                    if (class206.field3602[var2] != -1000000 && (var1.field2591 <= class206.field3602[var2] || var1.field2592 <= class206.field3602[var2]) && (var1.field2580 <= class242.field4271[var2] || var1.field2583 <= class242.field4271[var2]) && (var1.field2580 >= class51.field893[var2] || var1.field2583 >= class51.field893[var2]) && (var1.field2581 <= class30.field529[var2] || var1.field2596 <= class30.field529[var2]) && (var1.field2581 >= class290.field4954[var2] || var1.field2596 >= class290.field4954[var2])) {
                        continue label194;
                    }
                }
            }
            if (var1.field2597 == 1) {
                int var3 = var1.field2589 + class281.field4799 - class325.field5481;
                if (var3 >= 0 && var3 <= class281.field4799 + class281.field4799) {
                    int var4 = var1.field2600 + class281.field4799 - class243.field4316;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field2599 + class281.field4799 - class243.field4316;
                    if (var5 > class281.field4799 + class281.field4799) {
                        var5 = class281.field4799 + class281.field4799;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class160.field2712[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class331.field5639 - var1.field2580;
                        if (var7 > 32) {
                            var1.field2585 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field2585 = 2;
                            var7 = -var7;
                        }
                        var1.field2588 = (var1.field2581 - class61.field1045 << 8) / var7;
                        var1.field2582 = (var1.field2596 - class61.field1045 << 8) / var7;
                        var1.field2595 = (var1.field2591 - class42.field754 << 8) / var7;
                        var1.field2594 = (var1.field2592 - class42.field754 << 8) / var7;
                        class16.field250[class184.field3189++] = var1;
                    }
                }
            } else if (var1.field2597 == 2) {
                int var8 = var1.field2600 + class281.field4799 - class243.field4316;
                if (var8 >= 0 && var8 <= class281.field4799 + class281.field4799) {
                    int var9 = var1.field2589 + class281.field4799 - class325.field5481;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field2586 + class281.field4799 - class325.field5481;
                    if (var10 > class281.field4799 + class281.field4799) {
                        var10 = class281.field4799 + class281.field4799;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class160.field2712[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class61.field1045 - var1.field2581;
                        if (var12 > 32) {
                            var1.field2585 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field2585 = 4;
                            var12 = -var12;
                        }
                        var1.field2598 = (var1.field2580 - class331.field5639 << 8) / var12;
                        var1.field2601 = (var1.field2583 - class331.field5639 << 8) / var12;
                        var1.field2595 = (var1.field2591 - class42.field754 << 8) / var12;
                        var1.field2594 = (var1.field2592 - class42.field754 << 8) / var12;
                        class16.field250[class184.field3189++] = var1;
                    }
                }
            } else if (var1.field2597 == 4) {
                int var13 = var1.field2591 - class42.field754;
                if (var13 > 128) {
                    int var14 = var1.field2600 + class281.field4799 - class243.field4316;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field2599 + class281.field4799 - class243.field4316;
                    if (var15 > class281.field4799 + class281.field4799) {
                        var15 = class281.field4799 + class281.field4799;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field2589 + class281.field4799 - class325.field5481;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field2586 + class281.field4799 - class325.field5481;
                        if (var17 > class281.field4799 + class281.field4799) {
                            var17 = class281.field4799 + class281.field4799;
                        }
                        boolean var18 = false;
                        label166: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class160.field2712[var19][var20]) {
                                    var18 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var18) {
                            var1.field2585 = 5;
                            var1.field2598 = (var1.field2580 - class331.field5639 << 8) / var13;
                            var1.field2601 = (var1.field2583 - class331.field5639 << 8) / var13;
                            var1.field2588 = (var1.field2581 - class61.field1045 << 8) / var13;
                            var1.field2582 = (var1.field2596 - class61.field1045 << 8) / var13;
                            class16.field250[class184.field3189++] = var1;
                        }
                    }
                }
            }
        }
    }
}
