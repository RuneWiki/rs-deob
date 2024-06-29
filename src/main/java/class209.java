import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class209 extends class86 {

    @OriginalMember(owner = "client!fb", name = "K", descriptor = "[Lhg;")
    public static class162[] field3212 = new class162[14];

    @OriginalMember(owner = "client!fb", name = "R", descriptor = "Ljava/lang/String;")
    public static String field3219 = "Walk here";

    @OriginalMember(owner = "client!fb", name = "N", descriptor = "I")
    public static int field3215 = 0;

    @OriginalMember(owner = "client!fb", name = "W", descriptor = "[Ljava/lang/String;")
    public static String[] field3224 = new String[5];

    @OriginalMember(owner = "client!fb", name = "V", descriptor = "I")
    public static int field3223 = 0;

    @OriginalMember(owner = "client!fb", name = "T", descriptor = "C")
    public static char field3221;

    @OriginalMember(owner = "client!fb", name = "L", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!fb", name = "M", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!fb", name = "O", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!fb", name = "P", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!fb", name = "Q", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!fb", name = "S", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!fb", name = "U", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!fb", name = "X", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V", line = 4)
    public static void method1548(byte arg0) {
        field3212 = null;
        field3224 = null;
        field3219 = null;
        int var1 = -1 % ((arg0 - 3) / 38);
    }

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "(III)I", line = 16)
    private final int method1549(int arg0, int arg1, int arg2) {
        field3225++;
        int var4 = -106 / ((arg0 + 4) / 61);
        int var5 = arg1 * 57 + arg2;
        int var6 = var5 << 1 ^ var5;
        return 4096 - ((Integer.MAX_VALUE & (var6 * 15731 * var6 + 789221) * var6 + 1376312589) / 262144);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lvb;ILcn;)Lmi;", line = 29)
    public static final class125 method1550(class192 arg0, int arg1, class37 arg2) {
        field3217++;
        long var3 = ((long) arg0.field3026 << 32) + ((long) arg0.field3017 << 56) + (long) ((arg0.field3024 + 1 << 16) + arg0.field3030);
        class125 var5 = (class125) arg2.method370((byte) -120, var3);
        if (var5 == null) {
            var5 = new class125(arg0.field3024, (float) arg0.field3030, true, false, arg0.field3026);
            arg2.method375(var5, var3, -87);
        }
        if (arg1 != 1166671216) {
            method1552(111, -22, -102, -76, 29);
        }
        return var5;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)[I", line = 58)
    public final int[] method158(int arg0, int arg1) {
        field3220++;
        int[] var3 = this.field1225.method1914(arg0, 108);
        if (this.field1225.field3995) {
            int var4 = class135.field2257[arg0];
            for (int var5 = 0; var5 < class93.field1424; var5++) {
                var3[var5] = this.method1549(87, var4, class347.field5515[var5]) % 4096;
            }
        }
        if (arg1 <= 7) {
            this.method1549(-128, 7, 23);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V", line = 89)
    public class209() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIIIII)Z", line = 93)
    public static final boolean method1551(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3222++;
        if (arg8 != 506276088) {
            method1548((byte) 9);
        }
        if (arg1 < (arg3 + arg5) && arg5 < arg1 + arg6) {
            return (arg2 + arg4) > arg0 && arg4 < arg0 + arg7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIII)V", line = 115)
    public static final void method1552(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3218++;
        int var5 = arg0;
        int var6 = arg2;
        int var7 = -arg2;
        int var8 = class268.method1965(arg1 + arg2, class128.field2130, class43.field693, -124);
        int var9 = -1;
        int var10 = class268.method1965(arg1 - arg2, class128.field2130, class43.field693, -109);
        class283.method2059(arg3, class133.field2235[arg4], (byte) 122, var8, var10);
        while (var6 > var5) {
            var9 += 2;
            var7 += var9;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg4 - var6;
                int var12 = arg4 + var6;
                if (class328.field5042 <= var12 && class284.field4385 >= var11) {
                    int var13 = class268.method1965(arg1 + var5, class128.field2130, class43.field693, -95);
                    int var14 = class268.method1965(arg1 - var5, class128.field2130, class43.field693, -110);
                    if (class284.field4385 >= var12) {
                        class283.method2059(arg3, class133.field2235[var12], (byte) 114, var13, var14);
                    }
                    if (var11 >= class328.field5042) {
                        class283.method2059(arg3, class133.field2235[var11], (byte) 90, var13, var14);
                    }
                }
            }
            var5++;
            int var15 = arg4 + var5;
            int var16 = arg4 - var5;
            if (var15 >= class328.field5042 && var16 <= class284.field4385) {
                int var17 = class268.method1965(arg1 + var6, class128.field2130, class43.field693, -105);
                int var18 = class268.method1965(arg1 - var6, class128.field2130, class43.field693, -75);
                if (class284.field4385 >= var15) {
                    class283.method2059(arg3, class133.field2235[var15], (byte) 119, var17, var18);
                }
                if (class328.field5042 <= var16) {
                    class283.method2059(arg3, class133.field2235[var16], (byte) 115, var17, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "(III)J", line = 190)
    public static final long method1553(int arg0, int arg1, int arg2) {
        class329 var3 = class170.field2689[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field5063; var4++) {
            class297 var5 = var3.field5070[var4];
            if ((var5.field4611 >> 29 & 0x3L) == 2L && var5.field4616 == arg1 && var5.field4614 == arg2) {
                return var5.field4611;
            }
        }
        return 0L;
    }
}
