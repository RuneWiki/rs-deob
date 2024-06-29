import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class33 extends class415 {

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "I")
    public static int field339 = 0;

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "F")
    public static float field342;

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZF)V")
    public final void method207(boolean arg0, float arg1) {
        ++field335;
        if (arg0) {
            method208(90, 49, 41, -33, 47, 104);
        }
        super.field6283 = arg1;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)V")
    public static final void method208(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field336;
        if (arg4 > -105) {
            field339 = 78;
        }
        if (~class141.field1911.field6109 != -1 && ~arg0 != -1 && ~class486.field7371 > -51 && arg5 != -1) {
            class357.field5540[class486.field7371++] = new class17((byte) 1, arg5, arg0, arg3, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)I")
    public static final int method209(int arg0, int arg1, int arg2) {
        if (~arg1 < ~arg0) {
            int var3 = arg0;
            arg0 = arg1;
            arg1 = var3;
        }
        ++field338;
        if (arg2 != 9759) {
            method210(4);
        }
        while (arg1 != 0) {
            int var4 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "(I)V")
    public static final void method210(int arg0) {
        if (arg0 <= 67) {
            field339 = -120;
        }
        ++field337;
        class298.field4680.method1128(-125);
        class183.field2656.method2730(0);
        class209.field3224.method2730(0);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method211(int arg0, long arg1) {
        ++field343;
        if (~arg1 < -1L && ~arg1 > -6582952005840035282L) {
            if (arg1 % 37L == 0L) {
                return null;
            } else {
                int var3 = arg0;
                for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                    ++var3;
                }
                StringBuffer var6 = new StringBuffer(var3);
                while (arg1 != 0L) {
                    long var7 = arg1;
                    arg1 /= 37L;
                    var6.append(class108.field1546[(int) (-(arg1 * 37L) + var7)]);
                }
                return var6.reverse().toString();
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(IIIIIF)V")
    public class33(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZIII)V")
    public static final void method212(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        ++field340;
        if (arg1 != 19489) {
            field342 = -0.6121804F;
        }
        long var6 = (long) ((arg2 ? Integer.MIN_VALUE : 0) | arg0);
        class339 var8 = (class339) class389.field5929.method1122((byte) 59, var6);
        if (var8 == null) {
            var8 = new class339();
            class389.field5929.method1127(var8, (byte) 31, var6);
        }
        if (~var8.field5287.length >= ~arg3) {
            int[] var9 = new int[arg3 - -1];
            int[] var10 = new int[arg3 - -1];
            for (int var11 = 0; ~var8.field5287.length < ~var11; ++var11) {
                var9[var11] = var8.field5287[var11];
                var10[var11] = var8.field5290[var11];
            }
            for (int var12 = var8.field5287.length; arg3 > var12; ++var12) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field5287 = var9;
            var8.field5290 = var10;
        }
        var8.field5287[arg3] = arg5;
        var8.field5290[arg3] = arg4;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
    public final void method213(int arg0, int arg1, int arg2, int arg3) {
        super.field6288 = arg3;
        super.field6282 = arg1;
        ++field341;
        if (arg0 == -14174) {
            super.field6295 = arg2;
        }
    }
}
