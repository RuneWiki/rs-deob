import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class395 extends class247 {

    @OriginalMember(owner = "client!sj", name = "B", descriptor = "I")
    public int field6032 = -1;

    @OriginalMember(owner = "client!sj", name = "E", descriptor = "I")
    public int field6035 = -1;

    @OriginalMember(owner = "client!sj", name = "w", descriptor = "I")
    public int field6027;

    @OriginalMember(owner = "client!sj", name = "x", descriptor = "I")
    public static int field6028;

    @OriginalMember(owner = "client!sj", name = "y", descriptor = "I")
    public static int field6029;

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!sj", name = "A", descriptor = "I")
    public static int field6031;

    @OriginalMember(owner = "client!sj", name = "C", descriptor = "I")
    public int field6033;

    @OriginalMember(owner = "client!sj", name = "D", descriptor = "I")
    public int field6034;

    @OriginalMember(owner = "client!sj", name = "F", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!sj", name = "G", descriptor = "I")
    public static int field6037;

    @OriginalMember(owner = "client!sj", name = "H", descriptor = "I")
    public int field6038;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(Loa;I)Lew;")
    public final class425 method100(class605 arg0, int arg1) {
        if (arg1 != 28286) {
            this.method91(-107, 76, (class605) null, 84);
        }
        ++field6028;
        return null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Loa;B)Laca;")
    public final class630 method88(class605 arg0, byte arg1) {
        ++field6036;
        class364 var3 = arg0.method342();
        var3.method2014(super.field3511, super.field3499 - 10, super.field3506);
        class630 var4 = class471.method2882(-127, 3);
        if (~this.field6035 != 0) {
            class327 var5 = class622.field8999.method25(this.field6035, -125).method1142((class274) null, false, (class177) null, arg0, this.field6033, 2048, -1, 0, 0);
            if (var5 != null) {
                var5.method1380(var3, var4.field9084[2], 0);
            }
        }
        if (~this.field6032 != 0) {
            class327 var6 = class622.field8999.method25(this.field6032, -88).method1142((class274) null, false, (class177) null, arg0, this.field6038, 2048, -1, 0, 0);
            if (var6 != null) {
                var6.method1380(var3, var4.field9084[1], 0);
            }
        }
        if (arg1 > -127) {
            method2536(5);
        }
        class327 var7 = class622.field8999.method25(this.field6034, -43).method1142((class274) null, false, (class177) null, arg0, this.field6027, 2048, -1, 0, 0);
        if (var7 != null) {
            var7.method1380(var3, var4.field9084[0], 0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V")
    public static final void method2536(int arg0) {
        ++field6031;
        if (arg0 >= 52) {
            int var1 = class595.field8694.method2436(class81.field908, 0);
            if (~var1 == -1) {
                class399.field6056 = null;
                class493.method2959(-112, 0);
            } else if (~var1 == -2) {
                class602.method3493((byte) 0, 0);
                class493.method2959(-119, 512);
                if (class443.field6617 != null) {
                    class167.method963((byte) -28);
                }
            } else {
                class602.method3493((byte) (255 & class23.field246 + -4), 0);
                class493.method2959(-113, 2);
            }
            class245.field3466 = class226.field3179;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BLqb;)V")
    public static final void method2537(byte arg0, class191 arg1) {
        ++field6029;
        if (arg0 < 106) {
            method2538(33, (byte[][][]) null, -96, (byte) 79, -127, 11);
        }
        int var2 = -class287.field3982 + arg1.field2459;
        int var3 = arg1.field2466 * 512 - -(arg1.method1153(true) * 256);
        int var4 = arg1.field2429 * 512 - -(arg1.method1153(true) * 256);
        arg1.field1768 += (-arg1.field1768 + var4) / var2;
        arg1.field2516 = 0;
        arg1.field1764 += (-arg1.field1764 + var3) / var2;
        if (arg1.field2441 == 0) {
            arg1.method1155(8192, (byte) 79);
        }
        if (arg1.field2441 == 1) {
            arg1.method1155(12288, (byte) 79);
        }
        if (arg1.field2441 == 2) {
            arg1.method1155(0, (byte) 79);
        }
        if (arg1.field2441 == 3) {
            arg1.method1155(4096, (byte) 79);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Loa;I)V")
    public final void method90(class605 arg0, int arg1) {
        if (arg1 == -5) {
            ++field6037;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I[[[BIBII)V")
    public static final void method2538(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        ++class348.field4982;
        class477.field7042 = 0;
        for (int var6 = class87.field993; var6 < class637.field9161; ++var6) {
            class99[][] var15 = class431.field6408[var6];
            for (int var16 = class371.field5674; var16 < class38.field420; ++var16) {
                for (int var17 = class82.field926; var17 < class465.field6912; ++var17) {
                    class99 var18 = var15[var16][var17];
                    if (var18 != null) {
                        if (!class437.field6505[var16 - class550.field7844 + class224.field3164][var17 - class650.field9385 + class224.field3164] || arg1 != null && var6 >= arg2 && arg1[var6][var16][var17] == arg3) {
                            var18.field1172 = false;
                            var18.field1181 = false;
                            var18.field1182 = 0;
                            if (var16 >= class550.field7844 - 16 && var16 <= class550.field7844 + 16 && var17 >= class650.field9385 - 16 && var17 <= class650.field9385 + 16 && (var18.field1168 != null || var18.field1176 != null || var18.field1175 != null || var18.field1161 != null || var18.field1174 != null || var18.field1167 != null)) {
                                class453.field6777.method740(var18, (byte) 13);
                            }
                        } else {
                            var18.field1172 = true;
                            var18.field1181 = true;
                            if (var18.field1167 != null) {
                                var18.field1170 = true;
                            } else {
                                var18.field1170 = false;
                            }
                            ++class477.field7042;
                        }
                    }
                }
            }
        }
        for (int var7 = class87.field993; var7 < class637.field9161; ++var7) {
            if (class103.field1228.method370() && var7 >= arg2 && arg1 != null) {
                int var8 = class437.field6505.length;
                if (class437.field6505.length + class371.field5674 > class588.field8441) {
                    var8 -= class437.field6505.length + class371.field5674 - class588.field8441;
                }
                int var9 = class437.field6505[0].length;
                if (class437.field6505[0].length + class82.field926 > class91.field1047) {
                    var9 -= class437.field6505[0].length + class82.field926 - class91.field1047;
                }
                int var10 = class479.field7046;
                while (true) {
                    if (var10 >= var8) {
                        class453.field6777.method735(class435.field6449[var7], var7, (byte) -10, true);
                        break;
                    }
                    int var11 = class371.field5674 + var10 - class479.field7046;
                    for (int var12 = class322.field4660; var12 < var9; ++var12) {
                        class270.field3789[var10][var12] = false;
                        if (class437.field6505[var10][var12]) {
                            int var13 = class82.field926 + var12 - class322.field4660;
                            for (int var14 = var7; var14 >= 0; --var14) {
                                if (class431.field6408[var14][var11][var13] != null && class431.field6408[var14][var11][var13].field1178 == var7) {
                                    class270.field3789[var10][var12] = class431.field6408[var14][var11][var13].field1172;
                                    break;
                                }
                            }
                        }
                    }
                    ++var10;
                }
            } else {
                class453.field6777.method735(class435.field6449[var7], var7, (byte) -10, false);
            }
            class453.field6777.method734(false);
        }
        if (!class222.method1453(true)) {
            class222.method1453(false);
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(III)Lmf;")
    public static final class356 method2539(int arg0, int arg1, int arg2) {
        class99 var3 = class431.field6408[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1161;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IILoa;I)Z")
    public final boolean method91(int arg0, int arg1, class605 arg2, int arg3) {
        if (arg0 != -10503) {
            return true;
        } else {
            ++field6030;
            class364 var5 = arg2.method342();
            var5.method2014(super.field3511, super.field3499, super.field3506);
            class327 var6 = class622.field8999.method25(this.field6034, arg0 ^ 10497).method1142((class274) null, false, (class177) null, arg2, this.field6027, 131072, -1, 0, 0);
            if (var6 != null && var6.method1381(arg1, arg3, var5, true)) {
                return true;
            } else {
                if (~this.field6032 != 0) {
                    class327 var7 = class622.field8999.method25(this.field6032, -64).method1142((class274) null, false, (class177) null, arg2, this.field6038, 131072, -1, 0, 0);
                    if (var7 != null && var7.method1381(arg1, arg3, var5, true)) {
                        return true;
                    }
                }
                if (this.field6035 != -1) {
                    class327 var8 = class622.field8999.method25(this.field6035, -64).method1142((class274) null, false, (class177) null, arg2, this.field6033, 131072, -1, 0, 0);
                    if (var8 != null && var8.method1381(arg1, arg3, var5, true)) {
                        return true;
                    }
                }
                return false;
            }
        }
    }
}
