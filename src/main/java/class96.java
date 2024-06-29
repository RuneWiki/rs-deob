import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class96 {

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "Lmt;")
    public static class249 field1231 = new class249();

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public static int field1235 = -1;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "[I")
    public static int[] field1233;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)Lql;")
    public static final class477 method543(int arg0, byte arg1) {
        field1232++;
        class225[] var2 = class171.field2487;
        synchronized (class171.field2487) {
            if (arg1 != 71) {
                method544(-26, 48, -80, -67, 74);
            }
            class477 var3;
            if (arg0 >= class171.field2487.length || class171.field2487[arg0].method1440((byte) -88)) {
                var3 = new class477();
                var3.field6696 = new class98[arg0];
                for (int var4 = 0; var4 < arg0; var4++) {
                    var3.field6696[var4] = new class98();
                }
            } else {
                var3 = (class477) class171.field2487[arg0].method1441((byte) 119);
                var3.method738((byte) -2);
                int var10002 = class200.field2920[arg0]--;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIII)V")
    public static final void method544(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -3648) {
            field1233 = null;
        }
        field1234++;
        int var5 = 0;
        int var6 = arg0;
        int var7 = -arg0;
        int var8 = -1;
        int var9 = class156.method978(0, arg0 + arg2, class94.field1209, class168.field2449);
        int var10 = class156.method978(0, arg2 - arg0, class94.field1209, class168.field2449);
        class103.method579((byte) 115, var10, var9, arg4, class128.field1676[arg3]);
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg3 - var6;
                int var12 = arg3 + var6;
                if (class345.field5011 <= var12 && class485.field6827 >= var11) {
                    int var13 = class156.method978(arg1 ^ 0xFFFFF1C0, arg2 + var5, class94.field1209, class168.field2449);
                    int var14 = class156.method978(0, arg2 - var5, class94.field1209, class168.field2449);
                    if (var12 <= class485.field6827) {
                        class103.method579((byte) 115, var14, var13, arg4, class128.field1676[var12]);
                    }
                    if (var11 >= class345.field5011) {
                        class103.method579((byte) 115, var14, var13, arg4, class128.field1676[var11]);
                    }
                }
            }
            var5++;
            int var15 = arg3 - var5;
            int var16 = arg3 + var5;
            if (var16 >= class345.field5011 && var15 <= class485.field6827) {
                int var17 = class156.method978(arg1 ^ 0xFFFFF1C0, arg2 + var6, class94.field1209, class168.field2449);
                int var18 = class156.method978(0, arg2 - var6, class94.field1209, class168.field2449);
                if (class485.field6827 >= var16) {
                    class103.method579((byte) 115, var18, var17, arg4, class128.field1676[var16]);
                }
                if (var15 >= class345.field5011) {
                    class103.method579((byte) 115, var18, var17, arg4, class128.field1676[var15]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
    public static void method545(byte arg0) {
        int var1 = -2 / ((64 - arg0) / 54);
        field1233 = null;
        field1231 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(JIBIZ)Ljava/lang/String;")
    public static final String method546(long arg0, int arg1, byte arg2, int arg3, boolean arg4) {
        field1229++;
        char var6 = ',';
        char var7 = '.';
        if (arg3 == 0) {
            var6 = '.';
            var7 = ',';
        }
        if (arg3 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg0 < 0L) {
            var8 = true;
            arg0 = -arg0;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg1 > 0) {
            for (int var10 = 0; var10 < arg1; var10++) {
                int var11 = (int) arg0;
                arg0 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg0 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg0;
            arg0 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg0 * 10)));
            if (arg0 == 0L) {
                if (arg2 > -81) {
                    return null;
                }
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg4) {
                var12++;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public static final void method547(int arg0) {
        field1230++;
        boolean var1 = class250.field3695 != null || class81.field990 > 0;
        if (var1) {
            class404.field5694 = 1;
        }
        if (class325.field4695 && class272.field3959.method2712(arg0 + 1, 81) && class476.field6690 > 2) {
            if (var1) {
                class63.field831 = (class451) class160.field2365.field6838.field3576.field3576;
            } else {
                class142.method891((class451) class160.field2365.field6838.field3576.field3576, class419.field5854.method2162(true), (byte) -86, class419.field5854.method2159(arg0 - 124));
            }
        } else if (var1) {
            class63.field831 = (class451) class160.field2365.field6838.field3576;
        } else {
            class142.method891((class451) class160.field2365.field6838.field3576, class419.field5854.method2162(true), (byte) -86, class419.field5854.method2159(-107));
        }
        if (arg0 != 1) {
            field1231 = null;
        }
    }
}
