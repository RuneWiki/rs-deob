import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class490 {

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "[I")
    public static int[] field6651 = new int[14];

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "Lqr;")
    public static class65 field6652 = new class65(10);

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "Ljava/lang/String;")
    public static String field6655 = "";

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field6648;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field6649;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field6650;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field6653;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field6654;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIILha;IIBLli;IIII)V")
    public static final void method2775(int arg0, int arg1, int arg2, class59 arg3, int arg4, int arg5, byte arg6, class433 arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg2 < arg10 && (arg2 + arg9) > arg10 && (arg1 - 13) < arg8 && arg1 + 3 > arg8 && arg7.field5969) {
            arg4 = arg5;
        }
        field6649++;
        int[] var12 = null;
        if (class361.method2151(arg7.field5963, 50)) {
            var12 = class77.field948.method1165((byte) 120, (int) arg7.field5970).field7822;
        } else if (arg7.field5967 != -1) {
            var12 = class77.field948.method1165((byte) 122, arg7.field5967).field7822;
        } else if (class410.method2392(-90, arg7.field5963)) {
            class134 var13 = (class134) class390.field5470.method2135((long) ((int) arg7.field5970), (byte) 31);
            if (var13 != null) {
                class556 var14 = var13.field2154;
                class166 var15 = var14.field7328;
                if (var15.field2575 != null) {
                    var15 = var15.method1190((byte) 84, class74.field901);
                }
                if (var15 != null) {
                    var12 = var15.field2557;
                }
            }
        } else if (class84.method650(arg7.field5963, (byte) 105)) {
            Object var16 = null;
            class100 var17;
            if (arg7.field5963 == 1009) {
                var17 = class462.field6333.method2008((byte) -81, (int) arg7.field5970);
            } else {
                var17 = class462.field6333.method2008((byte) -8, (int) (arg7.field5970 >>> 32 & 0x7FFFFFFFL));
            }
            if (var17.field1307 != null) {
                var17 = var17.method748(class74.field901, 125);
            }
            if (var17 != null) {
                var12 = var17.field1287;
            }
        }
        String var18 = class407.method2383(99, arg7);
        if (var12 != null) {
            var18 = var18 + class540.method3010(26, var12);
        }
        if (arg6 < 2) {
            method2775(-96, -6, -88, null, -7, 0, (byte) -3, null, -112, 109, 23, 112);
        }
        class64.field785.method532(class264.field3681, arg4, false, var18, 0, arg2 + 3, arg1, class657.field8682);
        if (arg7.field5959) {
            class288.field4081.method1035(arg2 + class105.field1446.method3001(-1, var18) + 5, arg1 + -12);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public static final void method2776(int arg0) {
        if (arg0 != 21068) {
            field6652 = null;
        }
        field6648++;
        class65 var1 = class600.field7880;
        synchronized (class600.field7880) {
            class600.field7880.method561((byte) -78);
        }
        class65 var2 = class66.field825;
        synchronized (class66.field825) {
            class66.field825.method561((byte) -78);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "([Ljava/lang/Object;I[JIB)V")
    public static final void method2777(Object[] arg0, int arg1, long[] arg2, int arg3, byte arg4) {
        if (arg3 > arg1) {
            int var5 = (arg1 + arg3) / 2;
            int var6 = arg1;
            long var7 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var7;
            Object var9 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var9;
            int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
            for (int var11 = arg1; var11 < arg3; var11++) {
                if ((long) (var11 & var10) + var7 > arg2[var11]) {
                    long var12 = arg2[var11];
                    arg2[var11] = arg2[var6];
                    arg2[var6] = var12;
                    Object var14 = arg0[var11];
                    arg0[var11] = arg0[var6];
                    arg0[var6++] = var14;
                }
            }
            arg2[arg3] = arg2[var6];
            arg2[var6] = var7;
            arg0[arg3] = arg0[var6];
            arg0[var6] = var9;
            method2777(arg0, arg1, arg2, var6 - 1, (byte) -90);
            method2777(arg0, var6 + 1, arg2, arg3, (byte) -103);
        }
        field6653++;
        if (arg4 > -71) {
            method2778(24, 110, -26);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)Z")
    public static final boolean method2778(int arg0, int arg1, int arg2) {
        field6650++;
        if (arg2 != 24048) {
            method2780(41, -103, -104, null);
        }
        return (arg1 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
    public static void method2779(int arg0) {
        field6655 = null;
        field6651 = null;
        if (arg0 > -60) {
            field6651 = null;
        }
        field6652 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIILjava/lang/Class;)Lfb;")
    public static final class675 method2780(int arg0, int arg1, int arg2, Class arg3) {
        class701 var4 = class660.field8718[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class10 var5 = var4.field9742; var5 != null; var5 = var5.field174) {
            class675 var6 = var5.field170;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field9367 == arg1 && var6.field9354 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
    public static final void method2781(byte arg0) {
        field6654++;
        if (arg0 != 41) {
            method2778(42, 92, -77);
        }
        if (class131.field2147 == null) {
            return;
        }
        for (int var1 = 0; var1 < class131.field2147.length; var1++) {
            for (int var2 = 0; var2 < class131.field2147[var1].length; var2++) {
                class131.field2147[var1][var2] = class29.field463;
            }
        }
    }
}
