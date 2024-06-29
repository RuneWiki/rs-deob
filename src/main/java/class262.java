import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class262 extends class208 {

    @OriginalMember(owner = "client!a", name = "m", descriptor = "[I")
    public int[] field4440 = new int[] { 0 };

    @OriginalMember(owner = "client!a", name = "u", descriptor = "[I")
    public int[] field4448 = new int[] { -1 };

    @OriginalMember(owner = "client!a", name = "o", descriptor = "Lve;")
    public static class255 field4442 = class87.method607(66, ":assistreq:");

    @OriginalMember(owner = "client!a", name = "p", descriptor = "[I")
    public static int[] field4443 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!a", name = "n", descriptor = "I")
    public static int field4441 = 0;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "I")
    public static int field4447 = 0;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!a", name = "s", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!a", name = "v", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(B)V", line = 6)
    public static void method1824(byte arg0) {
        if (arg0 != 119) {
            field4443 = (int[]) null;
        }
        field4442 = null;
        field4443 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)Ldd;", line = 18)
    public static final class238 method1825(byte arg0, int arg1) {
        if (arg0 != -70) {
            method1830((class88) null, -32, 112, -96);
        }
        field4438++;
        return class277.field4760 && class100.field1693 <= arg1 && arg1 <= class297.field5090 ? class213.field3631[arg1 - class100.field1693] : null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIII)I", line = 38)
    public static final int method1826(int arg0, int arg1, int arg2, int arg3) {
        field4446++;
        if (arg3 != -25165) {
            return 76;
        }
        int var4 = class283.field4865[class267.method1860(arg2, arg1)];
        if (arg0 > 0) {
            int var5 = class283.field4866.method986(arg0 & 0xFFFF, 31);
            if (var5 != 0) {
                int var6;
                if (arg1 < 0) {
                    var6 = 0;
                } else if (arg1 <= 127) {
                    var6 = arg1 * 131586;
                } else {
                    var6 = 16777215;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) + ((var4 & 0xFF00) * var8 + (var6 & 0xFF00) * var5 & 0xFF0000) >> 8;
                }
            }
            int var9 = class283.field4866.method983(arg0 & 0xFFFF, 40);
            if (var9 != 0) {
                var9 += 256;
                int var10 = (var4 >> 16 & 0xFF) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = (var4 & 0xFF) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = ((var4 & 0xFF00) >> 8) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var11 >> 8) + (var10 << 8 & 0xFF009A) + (var12 & 0xFF00);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)V", line = 112)
    public static final void method1827(int arg0, int arg1) {
        class100.field1696 = false;
        class78.field1274 = -1;
        class235.field3872 = 0;
        class15.field224 = -1;
        field4439++;
        class258.field4389 = null;
        int var2 = -119 % ((21 - arg1) / 47);
        class73.field1203 = 1;
        class132.field2197 = arg0;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(II)V", line = 131)
    public static final void method1828(int arg0, int arg1) {
        if (arg0 == 16777215) {
            class70.field1116.method562((byte) 95, arg1);
            class256.field4371.method562((byte) 101, arg1);
            class14.field203.method562((byte) 93, arg1);
            field4445++;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIZIIF)[I", line = 146)
    public static final int[] method1829(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, float arg7) {
        field4444++;
        int[] var8 = new int[arg6];
        class114 var9 = new class114();
        var9.field1923 = arg1;
        var9.field1922 = arg2;
        var9.field1931 = arg4;
        var9.field1939 = arg0;
        var9.field1935 = (int) ((float) arg5 * arg7);
        var9.field1932 = arg3;
        var9.method111((byte) -57);
        class42.method257(arg6, 1, arg5 - 4212);
        var9.method865(-118, 0, var8);
        return var8;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lrg;III)[Lvi;", line = 195)
    public static final class5[] method1830(class88 arg0, int arg1, int arg2, int arg3) {
        field4449++;
        if (arg2 == 13035) {
            return class96.method763((byte) 57, arg1, arg3, arg0) ? class108.method835((byte) -26) : null;
        } else {
            return (class5[]) null;
        }
    }
}
