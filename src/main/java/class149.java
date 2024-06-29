import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class149 {

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "[Ldf;")
    public static class51[] field2492 = new class51[200];

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "Ldf;")
    public static class51 field2501 = class46.method233("Mem:", 100);

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "Z")
    public static boolean field2503 = false;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public int field2490;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public int field2491;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public int field2495;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public int field2499;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "Ldf;")
    public class51 field2497;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "Lja;")
    public static class55 field2493;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "Z")
    public boolean field2496;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIII)I")
    public static final int method1074(int arg0, int arg1, int arg2, int arg3) {
        field2494++;
        int var4 = 41 / ((arg0 - 17) / 57);
        if (arg2 > arg3) {
            return arg2;
        } else if (arg1 < arg3) {
            return arg1;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)I")
    public static final int method1075(int arg0, int arg1) {
        field2498++;
        if (arg1 != 1044683339) {
            method1074(-100, 9, 13, -26);
        }
        return arg0 >> 11 & 0x3F;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "()V")
    public static final void method1076() {
        class42.field685 = 0;
        label191: for (int var0 = 0; var0 < class46.field730; var0++) {
            class245 var1 = class147.field2471[var0];
            if (class205.field3432 != null) {
                for (int var2 = 0; var2 < class205.field3432.length; var2++) {
                    if (class205.field3432[var2] != -1000000 && (var1.field4247 <= class205.field3432[var2] || var1.field4235 <= class205.field3432[var2]) && (var1.field4240 <= class159.field2617[var2] || var1.field4243 <= class159.field2617[var2]) && (var1.field4240 >= class128.field2147[var2] || var1.field4243 >= class128.field2147[var2]) && (var1.field4239 <= class34.field508[var2] || var1.field4245 <= class34.field508[var2]) && (var1.field4239 >= class84.field1411[var2] || var1.field4245 >= class84.field1411[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field4234 == 1) {
                int var3 = var1.field4236 + class198.field3299 - class40.field628;
                if (var3 >= 0 && var3 <= class198.field3299 + class198.field3299) {
                    int var4 = var1.field4241 + class198.field3299 - class20.field274;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field4242 + class198.field3299 - class20.field274;
                    if (var5 > class198.field3299 + class198.field3299) {
                        var5 = class198.field3299 + class198.field3299;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class255.field4453[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class124.field2105 - var1.field4240;
                        if (var7 > 32) {
                            var1.field4238 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field4238 = 2;
                            var7 = -var7;
                        }
                        var1.field4231 = (var1.field4239 - class123.field2083 << 8) / var7;
                        var1.field4244 = (var1.field4245 - class123.field2083 << 8) / var7;
                        var1.field4233 = (var1.field4247 - class69.field1108 << 8) / var7;
                        var1.field4254 = (var1.field4235 - class69.field1108 << 8) / var7;
                        class142.field2370[class42.field685++] = var1;
                    }
                }
            } else if (var1.field4234 == 2) {
                int var8 = var1.field4241 + class198.field3299 - class20.field274;
                if (var8 >= 0 && var8 <= class198.field3299 + class198.field3299) {
                    int var9 = var1.field4236 + class198.field3299 - class40.field628;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field4248 + class198.field3299 - class40.field628;
                    if (var10 > class198.field3299 + class198.field3299) {
                        var10 = class198.field3299 + class198.field3299;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class255.field4453[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class123.field2083 - var1.field4239;
                        if (var12 > 32) {
                            var1.field4238 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field4238 = 4;
                            var12 = -var12;
                        }
                        var1.field4251 = (var1.field4240 - class124.field2105 << 8) / var12;
                        var1.field4246 = (var1.field4243 - class124.field2105 << 8) / var12;
                        var1.field4233 = (var1.field4247 - class69.field1108 << 8) / var12;
                        var1.field4254 = (var1.field4235 - class69.field1108 << 8) / var12;
                        class142.field2370[class42.field685++] = var1;
                    }
                }
            } else if (var1.field4234 == 4) {
                int var13 = var1.field4247 - class69.field1108;
                if (var13 > 128) {
                    int var14 = var1.field4241 + class198.field3299 - class20.field274;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field4242 + class198.field3299 - class20.field274;
                    if (var15 > class198.field3299 + class198.field3299) {
                        var15 = class198.field3299 + class198.field3299;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field4236 + class198.field3299 - class40.field628;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field4248 + class198.field3299 - class40.field628;
                        if (var17 > class198.field3299 + class198.field3299) {
                            var17 = class198.field3299 + class198.field3299;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class255.field4453[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field4238 = 5;
                            var1.field4251 = (var1.field4240 - class124.field2105 << 8) / var13;
                            var1.field4246 = (var1.field4243 - class124.field2105 << 8) / var13;
                            var1.field4231 = (var1.field4239 - class123.field2083 << 8) / var13;
                            var1.field4244 = (var1.field4245 - class123.field2083 << 8) / var13;
                            class142.field2370[class42.field685++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
    public static void method1077(byte arg0) {
        field2493 = null;
        field2492 = null;
        field2501 = null;
        if (arg0 != -86) {
            method1075(121, 83);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BI)I")
    public static final int method1078(byte arg0, int arg1) {
        field2500++;
        class231 var2 = class46.method232(-114, arg1);
        int var3 = var2.field4034;
        int var4 = var2.field4035;
        int var5 = var2.field4041;
        if (arg0 > -74) {
            method1078((byte) -21, 75);
        }
        int var6 = class191.field3194[var4 - var5];
        return class30.field439[var3] >> var5 & var6;
    }
}
