import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class69 {

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field1127 = 0;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
    public static int field1133 = 0;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "Lul;")
    public static class51 field1130 = new class51(20);

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "Lco;")
    public static class107 field1128;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIII)V", line = 4)
    public static final void method658(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1131++;
        class317.method2184(arg3 + arg5, (byte) 105, class64.field1007[arg1], arg4, arg3 - arg5);
        int var6 = 0;
        int var7 = arg0 * arg0;
        int var8 = arg5 * arg5;
        int var9 = arg0;
        if (arg2 <= 69) {
            field1128 = (class107) null;
        }
        int var10 = var8 << 1;
        int var11 = var7 << 1;
        int var12 = arg0 << 1;
        int var13 = (1 - var12) * var8 + var11;
        int var14 = var7 - ((var12 - 1) * var10);
        int var15 = var7 << 2;
        int var16 = var8 << 2;
        int var17 = ((var6 << 1) + 3) * var11;
        int var18 = ((arg0 << 1) - 3) * var10;
        int var19 = (var6 + 1) * var15;
        int var20 = (arg0 - 1) * var16;
        while (var9 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var6++;
                    var14 += var19;
                    var13 += var17;
                    var17 += var15;
                    var19 += var15;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var6++;
                var14 += var19;
                var19 += var15;
                var17 += var15;
            }
            var14 += -var18;
            var18 -= var16;
            var9--;
            var13 += -var20;
            int var21 = arg1 - var9;
            var20 -= var16;
            int var22 = arg3 + var6;
            int var23 = arg1 + var9;
            int var24 = arg3 - var6;
            class317.method2184(var22, (byte) 96, class64.field1007[var21], arg4, var24);
            class317.method2184(var22, (byte) -103, class64.field1007[var23], arg4, var24);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)V", line = 87)
    public static final void method659(int arg0, int arg1) {
        field1129++;
        class30 var2 = class99.method857((byte) 87, arg1, arg0);
        var2.method276(0);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIII)V", line = 97)
    public static final void method660(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != -3369) {
            field1133 = 82;
        }
        int var5 = 0;
        int var6 = arg0;
        field1134++;
        int var7 = -1;
        int var8 = -arg0;
        int var9 = class105.method899(false, class310.field4916, class170.field2944, arg0 + arg1);
        int var10 = class105.method899(false, class310.field4916, class170.field2944, arg1 - arg0);
        class317.method2184(var9, (byte) -81, class64.field1007[arg2], arg3, var10);
        while (var5 < var6) {
            var7 += 2;
            var8 += var7;
            if (var8 > 0) {
                var6--;
                var8 -= var6 << 1;
                int var11 = arg2 + var6;
                int var12 = arg2 - var6;
                if (var11 >= class90.field1428 && class135.field2358 >= var12) {
                    int var13 = class105.method899(false, class310.field4916, class170.field2944, arg1 + var5);
                    int var14 = class105.method899(false, class310.field4916, class170.field2944, arg1 - var5);
                    if (class135.field2358 >= var11) {
                        class317.method2184(var13, (byte) 122, class64.field1007[var11], arg3, var14);
                    }
                    if (class90.field1428 <= var12) {
                        class317.method2184(var13, (byte) -20, class64.field1007[var12], arg3, var14);
                    }
                }
            }
            var5++;
            int var15 = arg2 + var5;
            int var16 = arg2 - var5;
            if (class90.field1428 <= var15 && class135.field2358 >= var16) {
                int var17 = class105.method899(false, class310.field4916, class170.field2944, arg1 + var6);
                int var18 = class105.method899(false, class310.field4916, class170.field2944, arg1 - var6);
                if (var15 <= class135.field2358) {
                    class317.method2184(var17, (byte) 106, class64.field1007[var15], arg3, var18);
                }
                if (class90.field1428 <= var16) {
                    class317.method2184(var17, (byte) -14, class64.field1007[var16], arg3, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "([Llg;II)V", line = 172)
    public static final void method661(class137[] arg0, int arg1, int arg2) {
        field1132++;
        if (arg2 < 16) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class137 var4 = arg0[var3];
            if (var4 != null && var4.field2465 == arg1 && (!var4.field2402 || !client.method1893(var4))) {
                if (var4.field2490 == 0) {
                    if (!var4.field2402 && client.method1893(var4) && class144.field2627 != var4) {
                        continue;
                    }
                    method661(arg0, var4.field2462, 39);
                    if (var4.field2453 != null) {
                        method661(var4.field2453, var4.field2462, 25);
                    }
                    class228 var5 = (class228) class172.field2972.method732((long) var4.field2462, true);
                    if (var5 != null) {
                        class212.method1571(var5.field3833, (byte) 26);
                    }
                }
                if (var4.field2490 == 6) {
                    if (var4.field2385 != -1 || var4.field2423 != -1) {
                        boolean var6 = class27.method249(var4, -4);
                        int var7;
                        if (var6) {
                            var7 = var4.field2423;
                        } else {
                            var7 = var4.field2385;
                        }
                        if (var7 != -1) {
                            class285 var8 = class346.method2428(var7, (byte) -24);
                            if (var8 != null) {
                                var4.field2511 += class31.field446;
                                while (var4.field2511 > var8.field4536[var4.field2522]) {
                                    var4.field2511 -= var8.field4536[var4.field2522];
                                    var4.field2522++;
                                    if (var8.field4531.length <= var4.field2522) {
                                        var4.field2522 -= var8.field4544;
                                        if (var4.field2522 < 0 || var8.field4531.length <= var4.field2522) {
                                            var4.field2522 = 0;
                                        }
                                    }
                                    var4.field2380 = var4.field2522 + 1;
                                    if (var8.field4531.length <= var4.field2380) {
                                        var4.field2380 -= var8.field4544;
                                        if (var4.field2380 < 0 || var4.field2380 >= var8.field4531.length) {
                                            var4.field2380 = -1;
                                        }
                                    }
                                    class258.method1793(var4, 0);
                                }
                            }
                        }
                    }
                    if (var4.field2526 != 0 && !var4.field2402) {
                        int var9 = var4.field2526 >> 16;
                        int var10 = var4.field2526 << 16 >> 16;
                        int var11 = class31.field446 * var9;
                        int var12 = class31.field446 * var10;
                        var4.field2430 = var4.field2430 + var12 & 0x7FF;
                        var4.field2367 = var4.field2367 + var11 & 0x7FF;
                        class258.method1793(var4, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V", line = 288)
    public static void method662(int arg0) {
        if (arg0 != 1) {
            method661((class137[]) null, 97, 21);
        }
        field1128 = null;
        field1130 = null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I[Lbl;)V", line = 307)
    public static final void method663(int arg0, class337[] arg1) {
        class304.field4826[arg0] = arg1;
    }
}
