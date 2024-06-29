import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class172 {

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "Z")
    public boolean field2191 = true;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "[Lis;")
    public static class348[] field2185 = new class348[4];

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "Lnh;")
    public static class528 field2190 = new class528(0, 0);

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "Lkg;")
    public static class179 field2195 = new class179(41, 4);

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "C")
    private char field2186;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
    public int field2188;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "Ljava/lang/String;")
    public String field2192;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V", line = 3)
    public static void method1093(int arg0) {
        int var1 = 106 / ((10 - arg0) / 38);
        field2185 = null;
        field2190 = null;
        field2195 = null;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "()V", line = 14)
    public static final void method1094() {
        class363.field4726 = 0;
        label212: for (int var0 = 0; var0 < class283.field3606; var0++) {
            class425 var1 = class238.field3048[var0];
            if (class133.field1729 != null) {
                for (int var2 = 0; var2 < class133.field1729.length; var2++) {
                    if (class133.field1729[var2] != -1000000 && (var1.field6030 <= class133.field1729[var2] || var1.field6026 <= class133.field1729[var2]) && (var1.field6029 <= class411.field5870[var2] || var1.field6041 <= class411.field5870[var2]) && (var1.field6029 >= class280.field3574[var2] || var1.field6041 >= class280.field3574[var2]) && (var1.field6036 <= class350.field4499[var2] || var1.field6033 <= class350.field4499[var2]) && (var1.field6036 >= class479.field7009[var2] || var1.field6033 >= class479.field7009[var2])) {
                        continue label212;
                    }
                }
            }
            if (var1.field6027 == 1) {
                int var3 = var1.field6034 + class230.field2929 - class255.field3246;
                if (var3 >= 0 && var3 <= class230.field2929 + class230.field2929) {
                    int var4 = var1.field6038 + class230.field2929 - class139.field1797;
                    if (var4 < 0) {
                        var4 = 0;
                    } else if (var4 > class230.field2929 + class230.field2929) {
                        continue;
                    }
                    int var5 = var1.field6040 + class230.field2929 - class139.field1797;
                    if (var5 > class230.field2929 + class230.field2929) {
                        var5 = class230.field2929 + class230.field2929;
                    } else if (var5 < 0) {
                        continue;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class38.field501[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class309.field3954 - var1.field6029;
                        if (var7 > class514.field7456) {
                            var1.field6042 = 1;
                        } else {
                            if (var7 >= -class514.field7456) {
                                continue;
                            }
                            var1.field6042 = 2;
                            var7 = -var7;
                        }
                        var1.field6025 = (var1.field6036 - class211.field2718 << 8) / var7;
                        var1.field6032 = (var1.field6033 - class211.field2718 << 8) / var7;
                        var1.field6037 = (var1.field6030 - class370.field4780 << 8) / var7;
                        var1.field6035 = (var1.field6026 - class370.field4780 << 8) / var7;
                        class473.field6854[class363.field4726++] = var1;
                    }
                }
            } else if (var1.field6027 == 2) {
                int var8 = var1.field6038 + class230.field2929 - class139.field1797;
                if (var8 >= 0 && var8 <= class230.field2929 + class230.field2929) {
                    int var9 = var1.field6034 + class230.field2929 - class255.field3246;
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > class230.field2929 + class230.field2929) {
                        continue;
                    }
                    int var10 = var1.field6039 + class230.field2929 - class255.field3246;
                    if (var10 > class230.field2929 + class230.field2929) {
                        var10 = class230.field2929 + class230.field2929;
                    } else if (var10 < 0) {
                        continue;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class38.field501[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class211.field2718 - var1.field6036;
                        if (var12 > class514.field7456) {
                            var1.field6042 = 3;
                        } else {
                            if (var12 >= -class514.field7456) {
                                continue;
                            }
                            var1.field6042 = 4;
                            var12 = -var12;
                        }
                        var1.field6024 = (var1.field6029 - class309.field3954 << 8) / var12;
                        var1.field6028 = (var1.field6041 - class309.field3954 << 8) / var12;
                        var1.field6037 = (var1.field6030 - class370.field4780 << 8) / var12;
                        var1.field6035 = (var1.field6026 - class370.field4780 << 8) / var12;
                        class473.field6854[class363.field4726++] = var1;
                    }
                }
            } else if (var1.field6027 == 4) {
                int var13 = var1.field6030 - class370.field4780;
                if (var13 > class113.field1527) {
                    int var14 = var1.field6038 + class230.field2929 - class139.field1797;
                    if (var14 < 0) {
                        var14 = 0;
                    } else if (var14 > class230.field2929 + class230.field2929) {
                        continue;
                    }
                    int var15 = var1.field6040 + class230.field2929 - class139.field1797;
                    if (var15 > class230.field2929 + class230.field2929) {
                        var15 = class230.field2929 + class230.field2929;
                    } else if (var15 < 0) {
                        continue;
                    }
                    int var16 = var1.field6034 + class230.field2929 - class255.field3246;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > class230.field2929 + class230.field2929) {
                        continue;
                    }
                    int var17 = var1.field6039 + class230.field2929 - class255.field3246;
                    if (var17 > class230.field2929 + class230.field2929) {
                        var17 = class230.field2929 + class230.field2929;
                    } else if (var17 < 0) {
                        continue;
                    }
                    boolean var18 = false;
                    label184: for (int var19 = var16; var19 <= var17; var19++) {
                        for (int var20 = var14; var20 <= var15; var20++) {
                            if (class38.field501[var19][var20]) {
                                var18 = true;
                                break label184;
                            }
                        }
                    }
                    if (var18) {
                        var1.field6042 = 5;
                        var1.field6024 = (var1.field6029 - class309.field3954 << 8) / var13;
                        var1.field6028 = (var1.field6041 - class309.field3954 << 8) / var13;
                        var1.field6025 = (var1.field6036 - class211.field2718 << 8) / var13;
                        var1.field6032 = (var1.field6033 - class211.field2718 << 8) / var13;
                        class473.field6854[class363.field4726++] = var1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)Z", line = 265)
    public final boolean method1095(byte arg0) {
        if (arg0 == -63) {
            field2193++;
            return this.field2186 == 's';
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lfh;I)V", line = 276)
    public final void method1096(class463 arg0, int arg1) {
        if (arg1 >= -22) {
            this.method1097(-89, (byte) -63, null);
        }
        while (true) {
            int var3 = arg0.method2737(false);
            if (var3 == 0) {
                field2187++;
                return;
            }
            this.method1097(var3, (byte) 74, arg0);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IBLfh;)V", line = 299)
    private final void method1097(int arg0, byte arg1, class463 arg2) {
        if (arg1 != 74) {
            field2190 = null;
        }
        if (arg0 == 1) {
            this.field2186 = class511.method3054(arg2.method2793(arg1 + 32693), true);
        } else if (arg0 == 2) {
            this.field2188 = arg2.method2727(arg1 - 189);
        } else if (arg0 == 4) {
            this.field2191 = false;
        } else if (arg0 == 5) {
            this.field2192 = arg2.method2768((byte) 38);
        }
        field2194++;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(III)V", line = 331)
    public static final void method1098(int arg0, int arg1, int arg2) {
        if (class245.field3167 != arg1) {
            class347.field4461 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class347.field4461[var3] = (var3 << 12) / arg1;
            }
            class397.field5686 = arg1 * 32;
            class245.field3167 = arg1;
            class421.field5961 = arg1 - 1;
        }
        if (arg2 <= 75) {
            field2190 = null;
        }
        field2189++;
        if (class79.field1026 == arg0) {
            return;
        }
        if (class245.field3167 == arg0) {
            class334.field4218 = class347.field4461;
        } else {
            class334.field4218 = new int[arg0];
            for (int var4 = 0; var4 < arg0; var4++) {
                class334.field4218[var4] = (var4 << 12) / arg0;
            }
        }
        class79.field1026 = arg0;
        class501.field7240 = arg0 - 1;
    }
}
