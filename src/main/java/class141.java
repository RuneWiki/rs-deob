import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class141 extends class64 {

    @OriginalMember(owner = "client!pg", name = "P", descriptor = "Lcd;")
    private static class23 field2897 = class54.method414("We suspect someone knows your password)3", -1);

    @OriginalMember(owner = "client!pg", name = "V", descriptor = "Lcd;")
    public static class23 field2903 = field2897;

    @OriginalMember(owner = "client!pg", name = "Q", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!pg", name = "R", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!pg", name = "S", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!pg", name = "T", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!pg", name = "U", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!pg", name = "W", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!pg", name = "X", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "(I)V")
    public static void method905(int arg0) {
        field2897 = null;
        if (arg0 >= 39) {
            field2903 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
    public class141() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "(I)V")
    public static final void method906(int arg0) {
        ++field2901;
        if (arg0 != -17169) {
            method910(false);
        }
        for (class154 var1 = (class154) class154.field3096.method188((byte) 54); var1 != null; var1 = (class154) class154.field3096.method185((byte) -102)) {
            if (var1.field3090 != null) {
                var1.method951((byte) -13);
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lkh;B)V")
    public static final void method907(class97 arg0, byte arg1) {
        if (arg1 <= 37) {
            field2897 = null;
        }
        ++field2899;
        class191.field3796 = arg0;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "([Lfh;II[BLob;I)V")
    public static final void method908(class54[] arg0, int arg1, int arg2, byte[] arg3, class127 arg4, int arg5) {
        ++field2898;
        class189 var6 = new class189(arg3);
        if (arg1 >= -113) {
            method908((class54[]) null, 35, -66, (byte[]) null, (class127) null, 54);
        }
        int var7 = -1;
        while (true) {
            int var8 = var6.method1210(false);
            if (var8 == 0) {
                return;
            }
            int var9 = 0;
            var7 += var8;
            while (true) {
                int var10 = var6.method1210(false);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 + -1;
                int var11 = var9 & 63;
                int var12 = (4084 & var9) >> 6;
                int var13 = var9 >> 12;
                int var14 = var6.method1202(-36);
                int var15 = var14 >> 2;
                int var16 = var14 & 3;
                int var17 = arg5 + var12;
                int var18 = arg2 + var11;
                if (var17 > 0 && var18 > 0 && ~var17 > -104 && ~var18 > -104) {
                    int var19 = var13;
                    if (~(2 & class53.field1253[1][var17][var18]) == -3) {
                        var19 = var13 - 1;
                    }
                    class54 var20 = null;
                    if (~var19 <= -1) {
                        var20 = arg0[var19];
                    }
                    class146.method925(var16, var17, var13, -741, var18, var15, arg4, var20, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lfa;I)I")
    public static final int method909(class47 arg0, int arg1) {
        class56 var2 = (class56) class205.field4032.method260(((long) arg0.field1071 << 32) + (long) arg0.field1070, (byte) 28);
        ++field2905;
        if (var2 != null) {
            return var2.field1311;
        } else {
            int var3 = 120 % ((arg1 - -76) / 43);
            return arg0.field1129;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        if (arg1 != -9421) {
            field2903 = null;
        }
        ++field2900;
        int[] var3 = super.field1513.method1033(-103, arg0);
        if (super.field1513.field3368) {
            class93.method608(var3, 0, class168.field3367, class95.field1995[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(Z)V")
    public static final void method910(boolean arg0) {
        ++field2904;
        client.field577.method997(arg0);
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(III)I")
    public static final int method911(int arg0, int arg1, int arg2) {
        ++field2902;
        if (arg0 < 22) {
            return 35;
        } else {
            int var3 = arg2 >>> 31;
            return (arg2 - -var3) / arg1 + -var3;
        }
    }
}
