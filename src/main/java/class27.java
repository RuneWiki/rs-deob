import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class27 {

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "Lfn;")
    public static class52 field451 = new class52(16, -2);

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    public static int field455 = 0;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)Z")
    public static final boolean method226(int arg0) {
        if (arg0 > -111) {
            return true;
        }
        field448++;
        try {
            if (class70.field1040 == 2) {
                if (class255.field3573 == null) {
                    class255.field3573 = class413.method2415(class351.field4805, class174.field2565, class18.field302);
                    if (class255.field3573 == null) {
                        return false;
                    }
                }
                if (class123.field1710 == null) {
                    class123.field1710 = new class336(class8.field167, class137.field1947);
                }
                if (class224.field3181.method296(class347.field4752, 22050, class123.field1710, false, class255.field3573)) {
                    class224.field3181.method292(true);
                    class224.field3181.method281(class71.field1041, -21);
                    class224.field3181.method265(class344.field4708, (byte) 51, class255.field3573);
                    class123.field1710 = null;
                    class351.field4805 = null;
                    class70.field1040 = 0;
                    class255.field3573 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class224.field3181.method290((byte) 107);
            class255.field3573 = null;
            class351.field4805 = null;
            class70.field1040 = 0;
            class123.field1710 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IILkm;IIIIIIILab;)Lab;")
    public static final class232 method227(int arg0, int arg1, class487 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class232 arg10) {
        if (arg7 < 13) {
            return null;
        }
        field453++;
        long var11 = (long) arg5;
        class232 var13 = (class232) class235.field3326.method659(var11, (byte) -1);
        short var14 = 1031;
        if (var13 == null) {
            class85 var15 = class59.method440(0, arg5, class160.field2302, 3);
            if (var15 == null) {
                return null;
            }
            var13 = arg2.method1088(var15, var14, class272.field3758, 64, 768);
            class235.field3326.method653(64, var11, var13);
        }
        class232 var16 = var13.method51((byte) 2, var14, true);
        if (arg0 != 0) {
            var16.method48(arg0);
        }
        if (arg6 != 0) {
            var16.method62(arg6);
        }
        if (arg9 != 0) {
            var16.method34(arg9);
        }
        if (arg8 != 0) {
            var16.method54(0, arg8, 0);
        }
        return var16;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BZI)Lha;")
    public static final class459 method228(byte arg0, boolean arg1, int arg2) {
        int var3 = -39 / ((-arg0 - 11) / 60);
        field452++;
        long var4 = (long) ((arg1 ? Integer.MIN_VALUE : 0) | arg2);
        return (class459) class235.field3314.method2614(var4, 54);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIZ)I")
    public static final int method229(int arg0, int arg1, boolean arg2) {
        field449++;
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        if (arg2) {
            method229(99, 112, true);
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIII[B)Z")
    public static final boolean method230(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field450++;
        if (arg4 != 768) {
            method229(49, 18, false);
        }
        boolean var6 = true;
        class425 var7 = new class425(arg5);
        int var8 = -1;
        label60: while (true) {
            int var9 = var7.method2489(117);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                while (!var11) {
                    int var13 = var7.method2474((byte) 78);
                    if (var13 == 0) {
                        continue label60;
                    }
                    var10 += var13 - 1;
                    int var14 = var10 & 0x3F;
                    int var15 = var10 >> 6 & 0x3F;
                    int var16 = var7.method2503(true) >> 2;
                    int var17 = arg0 + var15;
                    int var18 = arg3 + var14;
                    if (var17 > 0 && var18 > 0 && var17 < arg2 - 1 && var18 < arg1 - 1) {
                        class475 var19 = class304.field4160.method2075(var8, false);
                        if (var16 != 22 || class216.field3068 || var19.field6681 != 0 || var19.field6671 == 1 || var19.field6666) {
                            if (!var19.method2782(arg4 + 1323)) {
                                var6 = false;
                                class198.field2842++;
                            }
                            var11 = true;
                        }
                    }
                }
                int var12 = var7.method2474((byte) -77);
                if (var12 == 0) {
                    break;
                }
                var7.method2503(true);
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V")
    public static void method231(int arg0) {
        if (arg0 != -23) {
            method227(58, 126, (class487) null, -95, -124, 16, 47, -37, 10, 112, (class232) null);
        }
        field451 = null;
    }
}
