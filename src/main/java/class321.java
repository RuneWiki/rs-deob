import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public abstract class class321 {

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "Lhi;")
    public static class82 field5537 = null;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field5532;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field5533;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field5536;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "Ljg;")
    public static class140 field5535;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "Lck;")
    public static class280 field5534;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BZ)V", line = 6)
    public static final void method2222(byte arg0, boolean arg1) {
        field5533++;
        byte var2;
        byte[][] var3;
        if (class147.field2485 && arg1) {
            var2 = 1;
            var3 = class71.field1094;
        } else {
            var2 = 4;
            var3 = class287.field4830;
        }
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var6 = var3[var5];
            int var7 = (class93.field1664[var5] >> 8) * 64 - class230.field3976;
            int var8 = (class93.field1664[var5] & 0xFF) * 64 - class226.field3916;
            if (var6 != null) {
                class283.method1968(89);
                class42.method318(class180.field3071, var6, -17, var7, class126.field2215 * 8 - 48, arg1, class260.field4465 * 8 - 48, var8);
            }
        }
        if (arg0 != 39) {
            field5535 = (class140) null;
        }
        for (int var9 = 0; var9 < var4; var9++) {
            int var10 = (class93.field1664[var9] >> 8) * 64 - class230.field3976;
            int var11 = (class93.field1664[var9] & 0xFF) * 64 - class226.field3916;
            byte[] var12 = var3[var9];
            if (var12 == null && class126.field2215 < 800) {
                class283.method1968(73);
                for (int var13 = 0; var13 < var2; var13++) {
                    class219.method1551(var10, var11, var13, (byte) 43, 64, 64);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Lhi;", line = 86)
    public static final class82 method2223(int arg0, int arg1) {
        if (arg1 != 1000000) {
            return (class82) null;
        }
        field5532++;
        if (arg0 < 100000) {
            return class29.method182(-6039, new class82[] { class236.field4105, class327.method2240((byte) -74, arg0), class207.field3611 });
        } else if (arg0 >= 10000000) {
            return class29.method182(-6039, new class82[] { class226.field3921, class327.method2240((byte) -74, arg0 / 1000000), class23.field312, class207.field3611 });
        } else {
            return class29.method182(-6039, new class82[] { class253.field4364, class327.method2240((byte) -74, arg0 / 1000), class112.field2030, class207.field3611 });
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIILrm;IJZ)Z", line = 107)
    public static final boolean method2224(int arg0, int arg1, int arg2, int arg3, int arg4, class175 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class323.method2231(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLbc;)Lnc;", line = 152)
    public static final class13 method2225(byte arg0, class153 arg1) {
        int var2 = 92 % ((arg0 - 26) / 35);
        field5536++;
        return new class13(arg1.method1052(31521), arg1.method1052(31521), arg1.method1052(31521), arg1.method1052(31521), arg1.method1107((byte) 82), arg1.method1107((byte) 82), arg1.method1082(-58));
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V", line = 161)
    public static void method2226(int arg0) {
        field5535 = null;
        field5534 = null;
        field5537 = null;
        int var1 = -87 % ((arg0 - 6) / 56);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZLn;)Ln;")
    public abstract class9 method393(boolean arg0, class9 arg1);
}
