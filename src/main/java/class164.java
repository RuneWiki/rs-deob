import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class164 {

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field3118 = 2;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "Ld;")
    public static class29 field3120 = new class29(512);

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "Lsd;")
    private static class166 field3123 = class135.method935("Malformed login packet)3", 0);

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "Lsd;")
    public static class166 field3124 = field3123;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "Lsd;")
    public static class166 field3126 = class135.method935("sl_stars", 0);

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "[I")
    public static int[] field3125 = new int[128];

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(III[B[Lpf;Li;)V")
    public static final void method1100(int arg0, int arg1, int arg2, byte[] arg3, class141[] arg4, class73 arg5) {
        field3122++;
        int var6 = -1;
        class53 var7 = new class53(arg3);
        while (true) {
            int var8 = var7.method425(-21462);
            if (var8 == 0) {
                if (arg2 != 63) {
                    field3125 = null;
                    return;
                }
                return;
            }
            var6 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var7.method425(-21462);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 6 & 0x3F;
                int var13 = var9 >> 12;
                int var14 = var7.method400(255);
                int var15 = var14 >> 2;
                int var16 = var14 & 0x3;
                int var17 = var11 + arg0;
                int var18 = var12 + arg1;
                if (var18 > 0 && var17 > 0 && var18 < 103 && var17 < 103) {
                    class141 var19 = null;
                    int var20 = var13;
                    if ((class122.field2387[1][var18][var17] & 0x2) == 2) {
                        var20 = var13 - 1;
                    }
                    if (var20 >= 0) {
                        var19 = arg4[var20];
                    }
                    class140.method954(var16, var13, (byte) 122, var6, var17, var15, arg5, var18, var19);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lf;I)V")
    public static final void method1101(class47 arg0, int arg1) {
        class142.field2768 = arg0;
        if (arg1 != -29923) {
            method1100(-30, -56, -66, null, null, null);
        }
        field3119++;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public static void method1102(int arg0) {
        field3124 = null;
        if (arg0 != 16204) {
            method1100(-112, 123, -7, null, null, null);
        }
        field3125 = null;
        field3123 = null;
        field3120 = null;
        field3126 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1103(int arg0, boolean arg1) {
        field3121++;
        if (arg1) {
            return true;
        } else {
            return (arg0 >> 21 & 0x1) != 0;
        }
    }
}
