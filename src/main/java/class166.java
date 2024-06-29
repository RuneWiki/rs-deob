import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class166 {

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "Llb;")
    private class224 field2297 = new class224(256);

    @OriginalMember(owner = "client!ll", name = "p", descriptor = "Llb;")
    private class224 field2305 = new class224(256);

    @OriginalMember(owner = "client!ll", name = "l", descriptor = "Llc;")
    private class175 field2301;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "Llc;")
    private class175 field2298;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    public static int field2292 = 0;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
    public static int field2293 = -1;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "F")
    public static float field2295;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!ll", name = "m", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!ll", name = "n", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!ll", name = "o", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)V", line = 7)
    public static final void method1085(int arg0, int arg1) {
        if (!class296.field4614) {
            arg1 = -1;
        }
        if (arg0 != 6376) {
            return;
        }
        field2290++;
        if (class145.field2018 == arg1) {
            return;
        }
        if (arg1 != -1) {
            class235 var2 = class118.method803(arg1, (byte) -81);
            class189 var3 = var2.method1667(0);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class9.field131.method1924(class260.field3941, new Point(var2.field3430, var2.field3414), var3.method1319(), var3.field1140, 114, var3.field1135);
                class145.field2018 = arg1;
            }
        }
        if (arg1 == -1 && class145.field2018 != -1) {
            class9.field131.method1924(class260.field3941, new Point(), (int[]) null, -1, 111, -1);
            class145.field2018 = -1;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V", line = 58)
    public static final void method1086(byte arg0) {
        if (arg0 <= 47) {
            return;
        }
        field2304++;
        while (true) {
            class330 var1;
            class170 var3;
            do {
                var1 = (class330) class291.field4564.method2323((byte) -5);
                if (var1 == null) {
                    return;
                }
                if (var1.field5040 < 0) {
                    int var2 = -var1.field5040 - 1;
                    if (class117.field1655 == var2) {
                        var3 = class118.field1664;
                    } else {
                        var3 = class328.field5009[var2];
                    }
                } else {
                    int var4 = var1.field5040 - 1;
                    var3 = class223.field3159[var4];
                }
            } while (var3 == null);
            class238 var5 = class142.method951(var1.field5051, 26915);
            if (class138.field1940 < 3) {
            }
            int var6;
            int var7;
            if (var1.field5047 == 1 || var1.field5047 == 3) {
                var6 = var5.field3532;
                var7 = var5.field3489;
            } else {
                var6 = var5.field3489;
                var7 = var5.field3532;
            }
            int var8 = (var6 >> 1) + var1.field5048;
            int var9 = (var6 + 1 >> 1) + var1.field5048;
            int var10 = var1.field5041 + (var7 >> 1);
            int var11 = (var7 + 1 >> 1) + var1.field5041;
            int[][] var12 = class167.field2324[class138.field1940];
            int var13 = var12[var9][var10] + var12[var8][var11] + var12[var9][var11] + var12[var8][var10] >> 2;
            class47 var14 = null;
            int var15 = class120.field1693[var1.field5042];
            if (var15 == 0) {
                class168 var16 = class298.method2109(class138.field1940, var1.field5048, var1.field5041);
                if (var16 != null) {
                    var14 = var16.field2335;
                }
            } else if (var15 == 1) {
                class54 var17 = client.method1943(class138.field1940, var1.field5048, var1.field5041);
                if (var17 != null) {
                    var14 = var17.field662;
                }
            } else if (var15 == 2) {
                class80 var19 = class91.method536(class138.field1940, var1.field5048, var1.field5041);
                if (var19 != null) {
                    var14 = var19.field1024;
                }
            } else if (var15 == 3) {
                class138 var18 = class339.method2345(class138.field1940, var1.field5048, var1.field5041);
                if (var18 != null) {
                    var14 = var18.field1935;
                }
            }
            if (var14 != null) {
                class232.method1632(var1.field5041, var1.field5048, 0, -1, 0, var1.field5056 + 1, var1.field5055 + 1, class138.field1940, 0, var15);
                var3.field2436 = var13;
                int var20 = var1.field5037;
                var3.field2355 = var1.field5041 * 128 + var7 * 64;
                var3.field2439 = var1.field5048 * 128 + var6 * 64;
                var3.field2434 = class38.field463 + var1.field5055;
                int var21 = var1.field5052;
                var3.field2381 = class38.field463 + var1.field5056;
                int var22 = var1.field5049;
                int var23 = var1.field5054;
                if (var21 < var20) {
                    int var24 = var20;
                    var20 = var21;
                    var21 = var24;
                }
                if (var22 > var23) {
                    int var25 = var22;
                    var22 = var23;
                    var23 = var25;
                }
                var3.field2429 = var1.field5041 + var23;
                var3.field2430 = var14;
                var3.field2390 = var1.field5041 + var22;
                var3.field2451 = var1.field5048 + var20;
                var3.field2453 = var1.field5048 + var21;
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIB[I)Lgl;", line = 237)
    private final class203 method1087(int arg0, int arg1, byte arg2, int[] arg3) {
        field2302++;
        int var5 = ((arg1 & 0xC0000FFF) << 4 | arg1 >>> 12) ^ arg0;
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        int var9 = -82 % ((25 - arg2) / 34);
        class203 var10 = (class203) this.field2305.method1537(var7, -22708);
        if (var10 != null) {
            return var10;
        } else if (arg3 == null || arg3[0] > 0) {
            class338 var11 = (class338) this.field2297.method1537(var7, -22708);
            if (var11 == null) {
                var11 = class338.method2336(this.field2298, arg1, arg0);
                if (var11 == null) {
                    return null;
                }
                this.field2297.method1541(false, var11, var7);
            }
            class203 var12 = var11.method2334(arg3);
            if (var12 == null) {
                return null;
            } else {
                var11.method2285(true);
                this.field2305.method1541(false, var12, var7);
                return var12;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I[II)Lgl;", line = 279)
    public final class203 method1088(int arg0, int[] arg1, int arg2) {
        field2299++;
        if (arg2 <= 96) {
            this.method1090(-74, -48, (int[]) null);
        }
        if (this.field2301.method1183(8321) == 1) {
            return this.method1089(arg1, 90, arg0, 0);
        } else if (this.field2301.method1197(-125, arg0) == 1) {
            return this.method1089(arg1, 91, 0, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "([IIII)Lgl;", line = 303)
    private final class203 method1089(int[] arg0, int arg1, int arg2, int arg3) {
        field2303++;
        if (arg1 < 68) {
            field2296 = 111;
        }
        int var5 = (arg3 & 0xFFF << 4 | arg3 >>> 12) ^ arg2;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class203 var9 = (class203) this.field2305.method1537(var7, -22708);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class33 var10 = class33.method199(this.field2301, arg3, arg2);
            if (var10 == null) {
                return null;
            }
            class203 var11 = var10.method198();
            this.field2305.method1541(false, var11, var7);
            if (arg0 != null) {
                arg0[0] -= var11.field2854.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(II[I)Lgl;", line = 342)
    public final class203 method1090(int arg0, int arg1, int[] arg2) {
        field2291++;
        if (this.field2298.method1183(8321) == 1) {
            return this.method1087(arg1, 0, (byte) -46, arg2);
        } else if (this.field2298.method1197(-91, arg1) == 1) {
            return this.method1087(0, arg1, (byte) -122, arg2);
        } else {
            int var4 = 54 / ((arg0 + 15) / 52);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Llc;Llc;)V", line = 373)
    public class166(class175 arg0, class175 arg1) {
        this.field2301 = arg0;
        this.field2298 = arg1;
    }
}
