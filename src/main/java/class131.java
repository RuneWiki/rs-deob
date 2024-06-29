import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class131 {

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2256 = "glow1:";

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field2259 = -1;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
    public int field2265;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "Lhj;")
    public class35 field2257;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "[I")
    public int[] field2260;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V", line = 14)
    public static void method925(int arg0) {
        if (arg0 != 1781) {
            method925(-9);
        }
        field2256 = null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IB)Lvg;", line = 25)
    public static final class291 method926(int arg0, byte arg1) {
        class291 var2 = (class291) class139.field2361.method487(77, (long) arg0);
        field2264++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class79.field1394.method1404(5, arg0, (byte) -94);
        class291 var4 = new class291();
        if (var3 != null) {
            var4.method2069(new class146(var3), 32);
        }
        class139.field2361.method491((long) arg0, -1, var4);
        if (arg1 != 4) {
            field2259 = -100;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V", line = 49)
    public static final void method927(int arg0) {
        if (arg0 > -113) {
            method927(-102);
        }
        field2261++;
        class292.field4729.method889((byte) -122);
        class200.field3357.method889((byte) 19);
        class11.field352.method889((byte) -121);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILek;Z)[Lka;", line = 64)
    public static final class211[] method928(int arg0, class206 arg1, boolean arg2) {
        field2262++;
        if (class207.method1434(arg1, (byte) 45, arg0)) {
            return arg2 ? (class211[]) null : class35.method258(!arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)Loi;", line = 84)
    public static final class352 method929(int arg0, int arg1) {
        field2263++;
        if (arg1 != 8) {
            return (class352) null;
        }
        class352 var2 = (class352) class83.field1433.method893((long) arg0, arg1 ^ 0x46);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class108.field1993.method1404(4, arg0, (byte) -67);
        class352 var4 = new class352();
        if (var3 != null) {
            var4.method2505(arg0, (byte) -111, new class146(var3));
        }
        class83.field1433.method888((long) arg0, var4, arg1 ^ 0x4E);
        return var4;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "()V", line = 109)
    public static final void method930() {
        class238.field3952 = 0;
        label194: for (int var0 = 0; var0 < class177.field2927; var0++) {
            class308 var1 = class33.field736[var0];
            if (class12.field371 != null) {
                for (int var2 = 0; var2 < class12.field371.length; var2++) {
                    if (class12.field371[var2] != -1000000 && (var1.field5030 <= class12.field371[var2] || var1.field5039 <= class12.field371[var2]) && (var1.field5033 <= class339.field5374[var2] || var1.field5025 <= class339.field5374[var2]) && (var1.field5033 >= class172.field2862[var2] || var1.field5025 >= class172.field2862[var2]) && (var1.field5029 <= class130.field2252[var2] || var1.field5037 <= class130.field2252[var2]) && (var1.field5029 >= class50.field1032[var2] || var1.field5037 >= class50.field1032[var2])) {
                        continue label194;
                    }
                }
            }
            if (var1.field5021 == 1) {
                int var3 = var1.field5018 + class111.field2035 - class107.field1943;
                if (var3 >= 0 && var3 <= class111.field2035 + class111.field2035) {
                    int var4 = var1.field5024 + class111.field2035 - class274.field4465;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field5041 + class111.field2035 - class274.field4465;
                    if (var5 > class111.field2035 + class111.field2035) {
                        var5 = class111.field2035 + class111.field2035;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class200.field3358[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class1.field3 - var1.field5033;
                        if (var7 > 32) {
                            var1.field5031 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field5031 = 2;
                            var7 = -var7;
                        }
                        var1.field5040 = (var1.field5029 - class105.field1915 << 8) / var7;
                        var1.field5036 = (var1.field5037 - class105.field1915 << 8) / var7;
                        var1.field5022 = (var1.field5030 - class267.field4370 << 8) / var7;
                        var1.field5038 = (var1.field5039 - class267.field4370 << 8) / var7;
                        class233.field3811[class238.field3952++] = var1;
                    }
                }
            } else if (var1.field5021 == 2) {
                int var8 = var1.field5024 + class111.field2035 - class274.field4465;
                if (var8 >= 0 && var8 <= class111.field2035 + class111.field2035) {
                    int var9 = var1.field5018 + class111.field2035 - class107.field1943;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field5032 + class111.field2035 - class107.field1943;
                    if (var10 > class111.field2035 + class111.field2035) {
                        var10 = class111.field2035 + class111.field2035;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class200.field3358[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class105.field1915 - var1.field5029;
                        if (var12 > 32) {
                            var1.field5031 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field5031 = 4;
                            var12 = -var12;
                        }
                        var1.field5028 = (var1.field5033 - class1.field3 << 8) / var12;
                        var1.field5019 = (var1.field5025 - class1.field3 << 8) / var12;
                        var1.field5022 = (var1.field5030 - class267.field4370 << 8) / var12;
                        var1.field5038 = (var1.field5039 - class267.field4370 << 8) / var12;
                        class233.field3811[class238.field3952++] = var1;
                    }
                }
            } else if (var1.field5021 == 4) {
                int var13 = var1.field5030 - class267.field4370;
                if (var13 > 128) {
                    int var14 = var1.field5024 + class111.field2035 - class274.field4465;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field5041 + class111.field2035 - class274.field4465;
                    if (var15 > class111.field2035 + class111.field2035) {
                        var15 = class111.field2035 + class111.field2035;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field5018 + class111.field2035 - class107.field1943;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field5032 + class111.field2035 - class107.field1943;
                        if (var17 > class111.field2035 + class111.field2035) {
                            var17 = class111.field2035 + class111.field2035;
                        }
                        boolean var18 = false;
                        label166: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class200.field3358[var19][var20]) {
                                    var18 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var18) {
                            var1.field5031 = 5;
                            var1.field5028 = (var1.field5033 - class1.field3 << 8) / var13;
                            var1.field5019 = (var1.field5025 - class1.field3 << 8) / var13;
                            var1.field5040 = (var1.field5029 - class105.field1915 << 8) / var13;
                            var1.field5036 = (var1.field5037 - class105.field1915 << 8) / var13;
                            class233.field3811[class238.field3952++] = var1;
                        }
                    }
                }
            }
        }
    }
}
