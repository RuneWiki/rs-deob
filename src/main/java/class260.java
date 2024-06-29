import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class260 extends class304 {

    @OriginalMember(owner = "client!im", name = "Q", descriptor = "I")
    public static int field3998 = 0;

    @OriginalMember(owner = "client!im", name = "U", descriptor = "Ljava/lang/String;")
    public static String field4002 = "rating: ";

    @OriginalMember(owner = "client!im", name = "R", descriptor = "I")
    public static int field3999 = 0;

    @OriginalMember(owner = "client!im", name = "V", descriptor = "I")
    public static int field4003 = 0;

    @OriginalMember(owner = "client!im", name = "ab", descriptor = "I")
    public static int field4008 = 0;

    @OriginalMember(owner = "client!im", name = "cb", descriptor = "I")
    public static int field4010 = 1;

    @OriginalMember(owner = "client!im", name = "T", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!im", name = "W", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!im", name = "X", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!im", name = "Y", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!im", name = "Z", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!im", name = "bb", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!im", name = "S", descriptor = "[Ljava/lang/String;")
    public static String[] field4000;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "(III)I", line = 15)
    private final int method1828(int arg0, int arg1, int arg2) {
        if (arg0 == 20827) {
            field4001++;
            int var4 = arg2 + (arg1 * 57);
            int var5 = var4 << 1 ^ var4;
            return 4096 - ((var5 * 15731 * var5 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144;
        } else {
            return 79;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(II)[I", line = 36)
    public final int[] method71(int arg0, int arg1) {
        if (arg0 != 7) {
            return (int[]) null;
        }
        field4004++;
        int[] var3 = this.field4669.method2342(-28750, arg1);
        if (this.field4669.field5223) {
            int var4 = class84.field1225[arg1];
            for (int var5 = 0; var5 < class218.field3333; var5++) {
                var3[var5] = this.method1828(20827, var4, class162.field2631[var5]) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IZ)V", line = 70)
    public static final void method1829(int arg0, boolean arg1) {
        class64.field862.method741(arg0, (byte) -67);
        field4005++;
        class157.field2383.method741(arg0, (byte) -68);
        class170.field2752.method741(arg0, (byte) -56);
        if (!arg1) {
            field4003 = -126;
        }
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "()V", line = 83)
    public class260() {
        super(0, true);
    }

    @OriginalMember(owner = "client!im", name = "c", descriptor = "(II)Ljj;", line = 96)
    public static final class47 method1830(int arg0, int arg1) {
        if (arg1 != 262144) {
            field4003 = -33;
        }
        field4007++;
        class47 var2 = (class47) class261.field4017.method747((long) arg0, (byte) 87);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class207.field3171.method696(arg0, (byte) 104, 1);
        class47 var4 = new class47();
        if (var3 != null) {
            var4.method357(new class254(var3), (byte) 123, arg0);
        }
        class261.field4017.method744(var4, -15692, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!im", name = "f", descriptor = "(I)V", line = 126)
    public static void method1831(int arg0) {
        field4002 = null;
        field4000 = null;
        if (arg0 != 11860737) {
            field4002 = (String) null;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIBIII)V", line = 137)
    public static final void method1832(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if (arg3 < 106) {
            return;
        }
        class213.method1527(true, arg5);
        field4006++;
        int var7 = 0;
        int var8 = -arg5;
        int var9 = arg5 - arg2;
        if (var9 < 0) {
            var9 = 0;
        }
        int var10 = arg5;
        int var11 = -1;
        int var12 = -var9;
        int var13 = var9;
        int[] var14 = class79.field1178[arg0];
        int var15 = -1;
        int var16 = arg1 + var9;
        int var17 = arg1 - var9;
        class7.method72(var17, -7, arg1 - arg5, var14, arg6);
        class7.method72(var16, -7, var17, var14, arg4);
        class7.method72(arg1 + arg5, -7, var16, var14, arg6);
        while (var10 > var7) {
            var15 += 2;
            var11 += 2;
            var8 += var15;
            var12 += var11;
            if (var12 >= 0 && var13 >= 1) {
                class35.field504[var13] = var7;
                var13--;
                var12 -= var13 << 1;
            }
            var7++;
            if (var8 >= 0) {
                var10--;
                if (var10 >= var9) {
                    int[] var18 = class79.field1178[arg0 - var10];
                    int[] var19 = class79.field1178[arg0 + var10];
                    int var20 = arg1 + var7;
                    int var21 = arg1 - var7;
                    class7.method72(var20, -7, var21, var19, arg6);
                    class7.method72(var20, -7, var21, var18, arg6);
                } else {
                    int[] var22 = class79.field1178[arg0 + var10];
                    int var23 = class35.field504[var10];
                    int[] var24 = class79.field1178[arg0 - var10];
                    int var25 = arg1 - var7;
                    int var26 = arg1 + var7;
                    int var27 = arg1 + var23;
                    int var28 = arg1 - var23;
                    class7.method72(var28, -7, var25, var22, arg6);
                    class7.method72(var27, -7, var28, var22, arg4);
                    class7.method72(var26, -7, var27, var22, arg6);
                    class7.method72(var28, -7, var25, var24, arg6);
                    class7.method72(var27, -7, var28, var24, arg4);
                    class7.method72(var26, -7, var27, var24, arg6);
                }
                var8 -= var10 << 1;
            }
            int[] var29 = class79.field1178[arg0 + var7];
            int[] var30 = class79.field1178[arg0 - var7];
            int var31 = arg1 + var10;
            int var32 = arg1 - var10;
            if (var9 <= var7) {
                class7.method72(var31, -7, var32, var29, arg6);
                class7.method72(var31, -7, var32, var30, arg6);
            } else {
                int var33 = var13 >= var7 ? var13 : class35.field504[var7];
                int var34 = arg1 - var33;
                class7.method72(var34, -7, var32, var29, arg6);
                int var35 = arg1 + var33;
                class7.method72(var35, -7, var34, var29, arg4);
                class7.method72(var31, -7, var35, var29, arg6);
                class7.method72(var34, -7, var32, var30, arg6);
                class7.method72(var35, -7, var34, var30, arg4);
                class7.method72(var31, -7, var35, var30, arg6);
            }
        }
    }
}
