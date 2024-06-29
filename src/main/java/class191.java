import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class191 {

    @OriginalMember(owner = "client!vda", name = "f", descriptor = "I")
    public int field2847 = -1;

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "Ljo;")
    public static class351 field2843 = new class351(68, 4);

    @OriginalMember(owner = "client!vda", name = "l", descriptor = "I")
    public static int field2853 = 0;

    @OriginalMember(owner = "client!vda", name = "k", descriptor = "Lke;")
    public static class622 field2852 = new class622(46, 1);

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!vda", name = "e", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!vda", name = "h", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!vda", name = "m", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!vda", name = "i", descriptor = "Lmha;")
    public class433 field2850;

    @OriginalMember(owner = "client!vda", name = "g", descriptor = "[I")
    public int[] field2848;

    @OriginalMember(owner = "client!vda", name = "j", descriptor = "[I")
    public static int[] field2851;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "[J")
    public long[] field2842;

    @OriginalMember(owner = "client!vda", name = "d", descriptor = "[Ljava/lang/String;")
    public String[] field2845;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(B)V", line = 4)
    public static void method1403(byte arg0) {
        field2852 = null;
        if (arg0 == 1) {
            field2851 = null;
            field2843 = null;
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(IBIIIII)V", line = 36)
    public static final void method1404(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2854++;
        int var7 = arg2 + arg6;
        int var8 = arg5 - arg2;
        for (int var9 = arg6; var9 < var7; var9++) {
            class382.method2347(arg4, class347.field5087[var9], arg3, 7, arg0);
        }
        int var10 = arg0 - arg2;
        for (int var11 = arg5; var11 > var8; var11--) {
            class382.method2347(arg4, class347.field5087[var11], arg3, 7, arg0);
        }
        int var12 = arg2 + arg4;
        if (arg1 < 97) {
            method1405(-55, -127, -6, null);
        }
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class347.field5087[var13];
            class382.method2347(arg4, var14, arg3, 7, var12);
            class382.method2347(var10, var14, arg3, 7, arg0);
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIILks;)Lmha;", line = 81)
    public static final class433 method1405(int arg0, int arg1, int arg2, class460 arg3) {
        field2846++;
        int var4 = arg3.field6588 | arg0 << 10;
        class433 var5 = (class433) class212.field3073.method220((long) var4 << 16, 0);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class264.field3732.method3149(class264.field3732.method3158(true, var4), -94);
        if (var6 == null) {
            if (arg1 > -87) {
                return null;
            }
            int var9 = arg2 + 65536 << 10 | arg3.field6588;
            class433 var10 = (class433) class212.field3073.method220((long) var9 << 16, 0);
            if (var10 != null) {
                return var10;
            }
            byte[] var11 = class264.field3732.method3149(class264.field3732.method3158(true, var9), -87);
            if (var11 == null) {
                int var14 = arg3.field6588 | 0x3FFFC00;
                class433 var15 = (class433) class212.field3073.method220((long) var14 << 16, 0);
                if (var15 != null) {
                    return var15;
                }
                byte[] var16 = class264.field3732.method3149(class264.field3732.method3158(true, var14), -99);
                if (var16 == null) {
                    return null;
                } else if (var16.length <= 1) {
                    return null;
                } else {
                    class433 var17;
                    try {
                        var17 = class147.method1013(var16, (byte) -109);
                    } catch (Exception var21) {
                        throw new RuntimeException(var21.getMessage() + " S: " + var14);
                    }
                    var17.field6159 = arg3;
                    class212.field3073.method221(var17, false, (long) var14 << 16);
                    return var17;
                }
            } else if (var11.length <= 1) {
                return null;
            } else {
                class433 var12;
                try {
                    var12 = class147.method1013(var11, (byte) -109);
                } catch (Exception var20) {
                    throw new RuntimeException(var20.getMessage() + " S: " + var9);
                }
                var12.field6159 = arg3;
                class212.field3073.method221(var12, false, (long) var9 << 16);
                return var12;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class433 var7;
            try {
                var7 = class147.method1013(var6, (byte) -109);
            } catch (Exception var19) {
                throw new RuntimeException(var19.getMessage() + " S: " + var4);
            }
            var7.field6159 = arg3;
            class212.field3073.method221(var7, false, (long) var4 << 16);
            return var7;
        }
    }
}
