import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class222 {

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
    public int field2739 = 1;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    public static int field2732 = 0;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "C")
    public char field2738;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILos;I)V", line = 7)
    private final void method1275(int arg0, class374 arg1, int arg2) {
        field2734++;
        if (arg0 == arg2) {
            this.field2738 = class67.method376((byte) -31, arg1.method2124(-126));
        } else if (arg0 == 2) {
            this.field2739 = 0;
            return;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)V", line = 29)
    public static final void method1276(int arg0, int arg1) {
        class318.field4053 = new int[arg1];
        class7.field60 = new int[arg1];
        class329.field4301 = new int[arg1];
        class462.field6375 = new int[arg1];
        class194.field2351 = new int[arg1];
        field2735++;
        if (arg0 < 9) {
            field2730 = -59;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "([III[II)V", line = 45)
    public static final void method1277(int[] arg0, int arg1, int arg2, int[] arg3, int arg4) {
        if (arg4 > arg1) {
            int var5 = (arg1 + arg4) / 2;
            int var6 = arg1;
            int var7 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var7;
            int var8 = arg3[var5];
            arg3[var5] = arg3[arg4];
            arg3[arg4] = var8;
            int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
            for (int var10 = arg1; var10 < arg4; var10++) {
                if (arg0[var10] < ((var9 & var10) + var7)) {
                    int var11 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6] = var11;
                    int var12 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6++] = var12;
                }
            }
            arg0[arg4] = arg0[var6];
            arg0[var6] = var7;
            arg3[arg4] = arg3[var6];
            arg3[var6] = var8;
            method1277(arg0, arg1, -8720, arg3, var6 - 1);
            method1277(arg0, var6 + 1, -8720, arg3, arg4);
        }
        if (arg2 != -8720) {
            field2730 = -61;
        }
        field2727++;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Los;B)V", line = 100)
    public final void method1278(class374 arg0, byte arg1) {
        field2729++;
        if (arg1 >= -96) {
            return;
        }
        while (true) {
            int var3 = arg0.method2129(-100);
            if (var3 == 0) {
                return;
            }
            this.method1275(var3, arg0, 1);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IILkj;)V", line = 120)
    public static final void method1279(int arg0, int arg1, class484 arg2) {
        class306.field3893 = 0;
        field2736++;
        class182.field2211 = false;
        class84.method496((byte) 107, arg2);
        int var3 = 46 % ((-arg1 - 82) / 38);
        class470.method2740(arg2, (byte) -17);
        if (class182.field2211) {
            System.out.println("---endgpp---");
        }
        if (arg2.field4966 != arg0) {
            throw new RuntimeException("gpi1 pos:" + arg2.field4966 + " psize:" + arg0);
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)Z", line = 144)
    public static final boolean method1280(int arg0, int arg1) {
        field2731++;
        if (arg1 != 0) {
            method1281((byte) 123);
        }
        return arg0 == 20 || arg0 == 48 || arg0 == 1009 || arg0 == 47 || arg0 == 30;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)I", line = 156)
    public static final int method1281(byte arg0) {
        field2733++;
        if (arg0 != -17) {
            field2730 = 87;
        }
        return class557.field8210;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIILqa;I)Lr;", line = 169)
    public static final class157 method1282(int arg0, int arg1, int arg2, int arg3, int arg4, class206 arg5, int arg6) {
        field2737++;
        long var7 = (long) arg6;
        class157 var9 = (class157) class539.field7888.method3682(0, var7);
        short var10 = 2055;
        if (var9 == null) {
            class152 var11 = class447.method2618(arg6, class377.field5020, 3317, 0);
            if (var11 == null) {
                return null;
            }
            if (var11.field1812 < 13) {
                var11.method825(-2, 0);
            }
            var9 = arg5.method277(var11, var10, class636.field9143, 64, 768);
            class539.field7888.method3684(var9, 0, var7);
        }
        class157 var12 = var9.method64((byte) 2, var10, true);
        if (arg0 != 0) {
            var12.method92(arg0);
        }
        if (arg2 != 0) {
            var12.method85(arg2);
        }
        if (arg4 != 0) {
            var12.method79(arg4);
        }
        if (~arg1 != arg3) {
            var12.method98(0, arg1, 0);
        }
        return var12;
    }
}
