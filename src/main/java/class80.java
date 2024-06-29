import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class80 extends class162 {

    @OriginalMember(owner = "client!te", name = "F", descriptor = "I")
    public static int field1265 = -1;

    @OriginalMember(owner = "client!te", name = "O", descriptor = "I")
    public static int field1274 = 0;

    @OriginalMember(owner = "client!te", name = "B", descriptor = "I")
    public int field1261;

    @OriginalMember(owner = "client!te", name = "C", descriptor = "I")
    public int field1262;

    @OriginalMember(owner = "client!te", name = "D", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!te", name = "E", descriptor = "I")
    public int field1264;

    @OriginalMember(owner = "client!te", name = "H", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!te", name = "L", descriptor = "I")
    public int field1271;

    @OriginalMember(owner = "client!te", name = "N", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!te", name = "P", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!te", name = "Q", descriptor = "I")
    public int field1276;

    @OriginalMember(owner = "client!te", name = "R", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!te", name = "M", descriptor = "Ljava/lang/String;")
    public String field1272;

    @OriginalMember(owner = "client!te", name = "G", descriptor = "[I")
    public int[] field1266;

    @OriginalMember(owner = "client!te", name = "K", descriptor = "[I")
    public int[] field1270;

    @OriginalMember(owner = "client!te", name = "J", descriptor = "[Lfd;")
    public class130[] field1269;

    @OriginalMember(owner = "client!te", name = "I", descriptor = "[Ljava/lang/String;")
    public String[] field1268;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BIIII)V")
    public static final void method533(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field1275++;
        int var5 = 0;
        int var6 = -arg1;
        int var7 = arg1;
        int var8 = -1;
        if (arg0 != 39) {
            return;
        }
        int var9 = class245.method1720(class53.field711, arg0 ^ 0xFFFFFF80, arg2 + arg1, class87.field1356);
        int var10 = class245.method1720(class53.field711, -87, arg2 - arg1, class87.field1356);
        class71.method451(arg4, true, var9, var10, class130.field2005[arg3]);
        while (var7 > var5) {
            var8 += 2;
            var6 += var8;
            if (var6 > 0) {
                var7--;
                int var11 = arg3 - var7;
                var6 -= var7 << 1;
                int var12 = arg3 + var7;
                if (class63.field941 <= var12 && var11 <= class75.field1180) {
                    int var13 = class245.method1720(class53.field711, -64, arg2 + var5, class87.field1356);
                    int var14 = class245.method1720(class53.field711, arg0 - 75, arg2 - var5, class87.field1356);
                    if (class75.field1180 >= var12) {
                        class71.method451(arg4, true, var13, var14, class130.field2005[var12]);
                    }
                    if (var11 >= class63.field941) {
                        class71.method451(arg4, true, var13, var14, class130.field2005[var11]);
                    }
                }
            }
            var5++;
            int var15 = arg3 - var5;
            int var16 = arg3 + var5;
            if (var16 >= class63.field941 && class75.field1180 >= var15) {
                int var17 = class245.method1720(class53.field711, -94, arg2 + var7, class87.field1356);
                int var18 = class245.method1720(class53.field711, -60, arg2 - var7, class87.field1356);
                if (class75.field1180 >= var16) {
                    class71.method451(arg4, true, var17, var18, class130.field2005[var16]);
                }
                if (class63.field941 <= var15) {
                    class71.method451(arg4, true, var17, var18, class130.field2005[var15]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)Lkk;")
    public static final class254 method534(int arg0, int arg1) {
        field1273++;
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        int var4 = 64 / ((arg0 - 32) / 59);
        if (class283.field4741[var2] == null || class283.field4741[var2][var3] == null) {
            boolean var5 = class235.method1632(27, var2);
            if (!var5) {
                return null;
            }
        }
        return class283.field4741[var2][var3];
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "([I[I[ILcl;I)V")
    public static final void method535(int[] arg0, int[] arg1, int[] arg2, class208 arg3, int arg4) {
        field1277++;
        for (int var5 = arg4; var5 < arg1.length; var5++) {
            int var6 = arg2[var5];
            int var7 = arg1[var5];
            int var8 = arg0[var5];
            int var9 = 0;
            while (var6 != 0 && var9 < arg3.field851.length) {
                if ((var6 & 0x1) != 0) {
                    if (var7 == -1) {
                        arg3.field851[var9] = null;
                    } else {
                        class200 var10 = class196.method1359(var7, (byte) 21);
                        int var11 = var10.field3171;
                        class219 var12 = arg3.field851[var9];
                        if (var12 != null) {
                            if (var12.field3493 == var7) {
                                if (var11 == 0) {
                                    var12 = arg3.field851[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field3492 = 1;
                                    var12.field3498 = 0;
                                    var12.field3497 = 0;
                                    var12.field3490 = var8;
                                    var12.field3495 = 0;
                                    class49.method303(false, class309.field5006 == arg3, arg3.field836, 0, var10, arg3.field850);
                                } else if (var11 == 2) {
                                    var12.field3497 = 0;
                                }
                            } else if (var10.field3173 >= class196.method1359(var12.field3493, (byte) 21).field3173) {
                                var12 = arg3.field851[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class219 var13 = arg3.field851[var9] = new class219();
                            var13.field3497 = 0;
                            var13.field3492 = 1;
                            var13.field3498 = 0;
                            var13.field3495 = 0;
                            var13.field3490 = var8;
                            var13.field3493 = var7;
                            class49.method303(false, class309.field5006 == arg3, arg3.field836, 0, var10, arg3.field850);
                        }
                    }
                }
                var9++;
                var6 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IB)V")
    public static final void method536(int arg0, byte arg1) {
        if (arg1 > 123) {
            field1267++;
            class36 var2 = class161.method1067(8, arg0, (byte) 81);
            var2.method220(119);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ZI)V")
    public static final void method537(boolean arg0, int arg1) {
        field1263++;
        class225.field3571 = arg0;
        if (arg1 >= -39) {
            field1265 = 12;
        }
        class90.field1386 = !class165.method1108(0);
    }
}
