import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class86 extends class587 implements class383 {

    @OriginalMember(owner = "client!qda", name = "I", descriptor = "I")
    private int field1379;

    @OriginalMember(owner = "client!qda", name = "H", descriptor = "I")
    private int field1378;

    @OriginalMember(owner = "client!qda", name = "E", descriptor = "I")
    private int field1375;

    @OriginalMember(owner = "client!qda", name = "C", descriptor = "Lcba;")
    public static class471 field1374 = new class471(84, -2);

    @OriginalMember(owner = "client!qda", name = "A", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!qda", name = "B", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!qda", name = "F", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!qda", name = "G", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!qda", name = "J", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!qda", name = "K", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(III)V")
    public static final void method645(int arg0, int arg1, int arg2) {
        ++field1376;
        int var3 = class40.field798.method2810(class459.field6463.method739(class173.field2491, -52), (byte) 124);
        for (class442 var4 = (class442) class448.field6352.method456((byte) -73); var4 != null; var4 = (class442) class448.field6352.method460((byte) 57)) {
            int var8 = class623.method3632(var4, arg2 ^ -77);
            if (~var8 < ~var3) {
                var3 = var8;
            }
        }
        var3 += 8;
        int var5 = class210.field2958 * 16 - -21;
        int var6 = -(var3 / 2) + arg1;
        if (class387.field5196 < var3 + var6) {
            var6 = -var3 + class387.field5196;
        }
        if (~var6 > -1) {
            var6 = 0;
        }
        int var7 = arg0;
        if (~(var5 + arg0) < ~class134.field2128) {
            var7 = -var5 + class134.field2128;
        }
        if (~var7 > -1) {
            var7 = 0;
        }
        class166.field2389 = var6;
        class228.field3256 = var3;
        class28.field477 = (!class379.field5098 ? 22 : 26) + class210.field2958 * arg2;
        class483.field6820 = true;
        class467.field6582 = var7;
    }

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "(I)V")
    public static final void method646(int arg0) {
        ++field1372;
        ++class476.field6706;
        class351.method2108(class646.field9377, -10511);
        int var1 = 97 / ((62 - arg0) / 59);
        class479.field6754.method108((byte) -128, class486.method2827(65));
        class479.field6754.method84(class387.field5196, (byte) -119);
        class479.field6754.method84(class134.field2128, (byte) -98);
        class479.field6754.method108((byte) -128, class491.field6875.field3360);
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(Z)V")
    public static final void method647(boolean arg0) {
        ++field1377;
        if (!arg0) {
            field1380 = -9;
        }
        class571 var1 = class65.field1110;
        synchronized (class65.field1110) {
            class65.field1110.method3248(0);
        }
        class571 var2 = class384.field5141;
        synchronized (class384.field5141) {
            class384.field5141.method3248(0);
        }
    }

    @OriginalMember(owner = "client!qda", name = "c", descriptor = "(I)V")
    public static final void method648(int arg0) {
        ++field1381;
        for (int var1 = 0; class202.field2830 > var1; ++var1) {
            class640 var2 = class233.field3289[var1];
            if (var2.field9304 == 2) {
                if (var2.field9308 == null) {
                    var2.field9312 = Integer.MIN_VALUE;
                } else {
                    class204.field2869.method2731(var2.field9308);
                }
            }
        }
        if (arg0 != Integer.MIN_VALUE) {
            method647(false);
        }
    }

    @OriginalMember(owner = "client!qda", name = "f", descriptor = "(I)V")
    public static void method649(int arg0) {
        if (arg0 != 27620) {
            field1380 = 6;
        }
        field1374 = null;
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(FFFI)I")
    public static final int method650(float arg0, float arg1, float arg2, int arg3) {
        if (arg3 != -25791) {
            field1374 = null;
        }
        ++field1373;
        float var4 = !(arg1 < 0.0F) ? arg1 : -arg1;
        float var5 = !(arg2 < 0.0F) ? arg2 : -arg2;
        float var6 = arg0 < 0.0F ? -arg0 : arg0;
        if (var5 > var4 && var6 < var5) {
            return arg2 > 0.0F ? 0 : 1;
        } else if (var4 < var6 && var6 > var5) {
            return arg0 > 0.0F ? 2 : 3;
        } else {
            return arg1 > 0.0F ? 4 : 5;
        }
    }

    @OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(Lpi;Ldk;III[B)V")
    public class86(class424 arg0, class435 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class608.field8759, arg2 * arg3 * arg4, false);
        this.field1379 = arg4;
        this.field1378 = arg2;
        this.field1375 = arg3;
        super.field8393.method2267(2, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field8403, 0, this.method3448(-1), this.field1378, this.field1375, this.field1379, 0, class32.method327(super.field8412, (byte) 123), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }
}
