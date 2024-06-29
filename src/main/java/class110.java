import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class110 implements class63 {

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "Lma;")
    public static class5 field1631 = null;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "Lel;")
    public static class218 field1629 = new class218();

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "Lma;")
    public static class5 field1634 = null;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    public static int field1636 = 0;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "Lni;")
    public static class202 field1633;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "[[Lwh;")
    public static class56[][] field1635;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IILeb;I)V", line = 15)
    public static final void method732(int arg0, int arg1, class253 arg2, int arg3) {
        if (arg0 >= -71) {
            return;
        }
        field1630++;
        if (arg2.field4276 == 1) {
            class8.field129++;
            class137.method890(arg2.field4206, class250.field4145, 29639, arg2.field4207, 0, (short) 35, 0L);
        }
        if (arg2.field4276 == 2 && !class265.field4539) {
            class5 var4 = class170.method1128(92, arg2);
            if (var4 != null) {
                class9.field134++;
                class137.method890(arg2.field4206, class288.method1940((byte) 122, new class5[] { class105.field1558, arg2.field4200 }), 29639, var4, -1, (short) 2, 0L);
            }
        }
        if (arg2.field4276 == 3) {
            class137.method890(arg2.field4206, class250.field4145, 29639, class256.field4386, 0, (short) 23, 0L);
            class260.field4445++;
        }
        if (arg2.field4276 == 4) {
            class179.field2706++;
            class137.method890(arg2.field4206, class250.field4145, 29639, arg2.field4207, 0, (short) 21, 0L);
        }
        if (arg2.field4276 == 5) {
            class137.method890(arg2.field4206, class250.field4145, 29639, arg2.field4207, 0, (short) 10, 0L);
            class260.field4426++;
        }
        if (arg2.field4276 == 6 && class73.field1145 == null) {
            class137.method890(arg2.field4206, class250.field4145, 29639, arg2.field4207, -1, (short) 49, 0L);
            class97.field1442++;
        }
        if (arg2.field4216 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg2.field4248; var6++) {
                for (int var7 = 0; var7 < arg2.field4283; var7++) {
                    int var8 = (arg2.field4203 + 32) * var6;
                    int var9 = (arg2.field4244 + 32) * var7;
                    if (var5 < 20) {
                        var8 += arg2.field4195[var5];
                        var9 += arg2.field4290[var5];
                    }
                    if (var9 <= arg3 && arg1 >= var8 && (var9 + 32) > arg3 && var8 + 32 > arg1) {
                        class23.field407 = var5;
                        class235.field3888 = arg2;
                        if (arg2.field4257[var5] > 0) {
                            class196 var10 = class235.method1664(78, arg2.field4257[var5] - 1);
                            if (class96.field1431 == 1 && class272.method1858(client.method767(arg2), (byte) 102)) {
                                if (class85.field1289 != arg2.field4206 || class20.field333 != var5) {
                                    class281.field4758++;
                                    class137.method890(arg2.field4206, class288.method1940((byte) 72, new class5[] { class59.field922, class240.field3981, var10.field3062 }), 29639, class274.field4669, var5, (short) 14, (long) var10.field3126);
                                }
                            } else if (!class265.field4539 || !class272.method1858(client.method767(arg2), (byte) 58)) {
                                class5[] var11 = var10.field3072;
                                class130.field1947++;
                                if (class177.field2696) {
                                    var11 = class13.method127((byte) -113, var11);
                                }
                                if (class272.method1858(client.method767(arg2), (byte) 22)) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 17;
                                            } else {
                                                var13 = 26;
                                            }
                                            class252.field4173++;
                                            class137.method890(arg2.field4206, class288.method1940((byte) 118, new class5[] { class181.field2768, var10.field3062 }), 29639, var11[var12], var5, var13, (long) var10.field3126);
                                        } else if (var12 == 4) {
                                            class137.method890(arg2.field4206, class288.method1940((byte) 76, new class5[] { class181.field2768, var10.field3062 }), 29639, class278.field4714, var5, (short) 26, (long) var10.field3126);
                                            class267.field4554++;
                                        }
                                    }
                                }
                                if (class267.method1831(client.method767(arg2), 6749)) {
                                    class217.field3490++;
                                    class137.method890(arg2.field4206, class288.method1940((byte) 91, new class5[] { class181.field2768, var10.field3062 }), 29639, class274.field4669, var5, (short) 24, (long) var10.field3126);
                                }
                                if (class272.method1858(client.method767(arg2), (byte) 73) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            class8.field128++;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 37;
                                            }
                                            if (var14 == 1) {
                                                var15 = 45;
                                            }
                                            if (var14 == 2) {
                                                var15 = 16;
                                            }
                                            class137.method890(arg2.field4206, class288.method1940((byte) 58, new class5[] { class181.field2768, var10.field3062 }), 29639, var11[var14], var5, var15, (long) var10.field3126);
                                        }
                                    }
                                }
                                class5[] var16 = arg2.field4270;
                                if (class177.field2696) {
                                    var16 = class13.method127((byte) -80, var16);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class168.field2568++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 48;
                                            }
                                            if (var17 == 1) {
                                                var18 = 33;
                                            }
                                            if (var17 == 2) {
                                                var18 = 1;
                                            }
                                            if (var17 == 3) {
                                                var18 = 36;
                                            }
                                            if (var17 == 4) {
                                                var18 = 39;
                                            }
                                            class137.method890(arg2.field4206, class288.method1940((byte) 84, new class5[] { class181.field2768, var10.field3062 }), 29639, var16[var17], var5, var18, (long) var10.field3126);
                                        }
                                    }
                                }
                                class137.method890(arg2.field4206, class288.method1940((byte) 126, new class5[] { class181.field2768, var10.field3062 }), 29639, class158.field2393, var5, (short) 1001, (long) var10.field3126);
                            } else if ((class157.field2347 & 0x10) == 16) {
                                class137.method890(arg2.field4206, class288.method1940((byte) 89, new class5[] { field1634, class240.field3981, var10.field3062 }), 29639, class23.field405, var5, (short) 34, (long) var10.field3126);
                                class201.field3195++;
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg2.field4265) {
            return;
        }
        if (!class265.field4539) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class5 var20 = class144.method915((byte) -115, var19, arg2);
                if (var20 != null) {
                    class137.method890(arg2.field4206, arg2.field4225, 29639, var20, arg2.field4210, (short) 1005, (long) (var19 + 1));
                    class238.field3937++;
                }
            }
            class5 var21 = class170.method1128(126, arg2);
            if (var21 != null) {
                class137.method890(arg2.field4206, arg2.field4225, 29639, var21, arg2.field4210, (short) 2, 0L);
                class9.field134++;
            }
            for (int var22 = 4; var22 >= 0; var22--) {
                class5 var23 = class144.method915((byte) 119, var22, arg2);
                if (var23 != null) {
                    class238.field3937++;
                    class137.method890(arg2.field4206, arg2.field4225, 29639, var23, arg2.field4210, (short) 50, (long) (var22 + 1));
                }
            }
            if (class15.method135(client.method767(arg2), (byte) 42)) {
                class97.field1442++;
                class137.method890(arg2.field4206, class250.field4145, 29639, class281.field4767, arg2.field4210, (short) 49, 0L);
            }
        } else if (class266.method1829(client.method767(arg2), -74) && (class157.field2347 & 0x20) == 32) {
            class137.method890(arg2.field4206, class288.method1940((byte) 94, new class5[] { field1634, class97.field1445, arg2.field4225 }), 29639, class23.field405, arg2.field4210, (short) 43, 0L);
            class174.field2659++;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V", line = 328)
    public static void method733(int arg0) {
        field1629 = null;
        field1634 = null;
        field1635 = (class56[][]) null;
        field1633 = null;
        field1631 = null;
        if (arg0 < 1) {
            method733(41);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIJ[I)Lma;", line = 342)
    public final class5 method455(int arg0, int arg1, long arg2, int[] arg3) {
        field1628++;
        if (arg0 > -55) {
            return (class5) null;
        } else if (arg1 == 0) {
            class146 var6 = class127.method848(arg3[0], (byte) 126);
            return var6.method929((int) arg2, (byte) -72);
        } else if (arg1 == 1 || arg1 == 10) {
            class196 var7 = class235.method1664(108, (int) arg2);
            return var7.field3062;
        } else if (arg1 == 6 || arg1 == 7) {
            return class127.method848(arg3[0], (byte) 11).method929((int) arg2, (byte) -41);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II[I[II)V", line = 373)
    public static final void method734(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        field1632++;
        if (arg4 < arg0) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg4;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var7;
            int var8 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var8;
            for (int var9 = arg4; var9 < arg0; var9++) {
                if ((var7 + (var9 & 0x1)) < arg3[var9]) {
                    int var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    int var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg3[arg0] = arg3[var6];
            arg3[var6] = var7;
            arg2[arg0] = arg2[var6];
            arg2[var6] = var8;
            method734(var6 - 1, 3, arg2, arg3, arg4);
            method734(arg0, 3, arg2, arg3, var6 + 1);
        }
        if (arg1 != 3) {
            field1634 = (class5) null;
        }
    }
}
