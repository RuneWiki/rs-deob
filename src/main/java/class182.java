import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class182 extends OutputStream {

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "I")
    public static int field2784 = 0;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "Lpn;")
    public static class49 field2780 = new class49(35, -1);

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "I")
    public static int field2785 = 765;

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "[I")
    public static int[] field2786 = new int[14];

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "Lc;")
    public static class517 field2788;

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "Ljava/lang/Object;")
    public static Object field2787;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZIIII)V", line = 6)
    public static final void method1273(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field2781++;
        if (!arg0 && class50.field769 == arg3 && class339.field5086 == arg2 && class30.field370 == class213.field3236 || class40.field667.method416(80, class108.field1631)) {
            return;
        }
        class339.field5086 = arg2;
        class50.field769 = arg3;
        if (arg4 != -1) {
            field2788 = null;
        }
        class213.field3236 = class30.field370;
        if (class40.field667.method416(84, class108.field1631)) {
            class213.field3236 = 0;
        }
        class376.method2400(arg1, (byte) 107);
        class51.method334(class54.field833, class185.field2838.method1265(class345.field5141, arg4 - 64), 6, true);
        int var5 = class422.field6201;
        int var6 = class23.field273;
        class422.field6201 = (class50.field769 - (class338.field5076 >> 4)) * 8;
        class23.field273 = (class339.field5086 - (class250.field4077 >> 4)) * 8;
        class449.field6685 = class362.method2297(class50.field769 * 8, class339.field5086 * 8);
        class293.field4530 = null;
        int var7 = class422.field6201 - var5;
        int var8 = class23.field273 - var6;
        if (arg1 == 10) {
            for (int var9 = 0; var9 < class412.field6081; var9++) {
                class5 var10 = class166.field2507[var9];
                if (var10 != null) {
                    class46 var11 = var10.field65;
                    for (int var12 = 0; var12 < 10; var12++) {
                        var11.field7654[var12] -= var7;
                        var11.field7653[var12] -= var8;
                    }
                    var11.field1275 -= var7 * 128;
                    var11.field1279 -= var8 * 128;
                }
            }
        } else {
            boolean var13 = false;
            class231.field3482 = 0;
            int var14 = class338.field5076 * 128 - 128;
            int var15 = (class250.field4077 - 1) * 128;
            for (int var16 = 0; var16 < class412.field6081; var16++) {
                class5 var29 = class166.field2507[var16];
                if (var29 != null) {
                    class46 var30 = var29.field65;
                    var30.field1275 -= var7 * 128;
                    var30.field1279 -= var8 * 128;
                    if (var30.field1275 >= 0 && var30.field1275 <= var14 && var30.field1279 >= 0 && var30.field1279 <= var15) {
                        boolean var31 = true;
                        for (int var32 = 0; var32 < 10; var32++) {
                            var30.field7654[var32] -= var7;
                            var30.field7653[var32] -= var8;
                            if (var30.field7654[var32] < 0 || var30.field7654[var32] >= class338.field5076 || var30.field7653[var32] < 0 || var30.field7653[var32] >= class250.field4077) {
                                var31 = false;
                            }
                        }
                        if (var31) {
                            class234.field3513[class231.field3482++] = var30.field7562;
                        } else {
                            var30.method315(32841, null);
                            var13 = true;
                            var29.method947((byte) 119);
                        }
                    } else {
                        var30.method315(32841, null);
                        var29.method947((byte) 115);
                        var13 = true;
                    }
                }
            }
            if (var13) {
                class412.field6081 = class366.field5398.method364(0);
                class366.field5398.method361((byte) 105, class166.field2507);
            }
        }
        for (int var17 = 0; var17 < 2048; var17++) {
            class511 var27 = class530.field7747[var17];
            if (var27 != null) {
                for (int var28 = 0; var28 < 10; var28++) {
                    var27.field7654[var28] -= var7;
                    var27.field7653[var28] -= var8;
                }
                var27.field1279 -= var8 * 128;
                var27.field1275 -= var7 * 128;
            }
        }
        class417[] var18 = class292.field4519;
        for (int var19 = 0; var19 < var18.length; var19++) {
            class417 var26 = var18[var19];
            if (var26 != null) {
                var26.field6129 -= var8 * 128;
                var26.field6126 -= var7 * 128;
            }
        }
        for (class541 var20 = (class541) class368.field5420.method295((byte) -60); var20 != null; var20 = (class541) class368.field5420.method296(true)) {
            var20.field7925 -= var8;
            var20.field7927 -= var7;
            if (class91.field1475 != 4 && (var20.field7927 < 0 || var20.field7925 < 0 || class338.field5076 <= var20.field7927 || var20.field7925 >= class250.field4077)) {
                var20.method947((byte) 106);
            }
        }
        if (class91.field1475 != 4) {
            for (class192 var21 = (class192) class249.field3827.method359(true); var21 != null; var21 = (class192) class249.field3827.method365(-104)) {
                int var22 = (int) (var21.field1932 & 0x3FFFL);
                int var23 = var22 - class422.field6201;
                int var24 = (int) (var21.field1932 >> 14 & 0x3FFFL);
                int var25 = var24 - class23.field273;
                if (var23 < 0 || var25 < 0 || var23 >= class338.field5076 || class250.field4077 <= var25) {
                    var21.method947((byte) 124);
                }
            }
        }
        if (class521.field7646 != 0) {
            class521.field7646 -= var7;
            class488.field7136 -= var8;
        }
        class343.method2209(arg4 - 76);
        if (arg1 != 10) {
            class522.field7666 -= var7;
            class457.field6795 -= var8;
            class38.field638 -= var8;
            class128.field1917 -= var7 * 128;
            class406.field5999 -= var8 * 128;
            class30.field340 -= var7;
            if (Math.abs(var7) > class338.field5076 || Math.abs(var8) > class250.field4077) {
                class483.method2912((byte) -50);
            }
        } else if (class33.field401 == 4) {
            class172.field2662 -= var7 * 128;
            class351.field5232 -= var8 * 128;
            class2.field28 -= var7 * 128;
            class447.field6641 -= var8 * 128;
        } else {
            class33.field401 = 1;
        }
        class285.method1915(arg4 ^ 0xFFFFFFFC);
        class236.method1604(-20769);
        class453.field6742.method291(false);
        class361.field5319.method291(false);
        class470.field6904.method1079(true);
        class130.method945(arg4 ^ 0x3B);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I[BI)I", line = 272)
    public static final int method1274(int arg0, byte[] arg1, int arg2) {
        field2782++;
        return arg0 >= -113 ? -19 : class315.method2094(arg2, arg1, 0, (byte) 72);
    }

    @OriginalMember(owner = "client!bo", name = "write", descriptor = "(I)V", line = 284)
    public final void write(int arg0) throws IOException {
        field2783++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V", line = 293)
    public static void method1275(int arg0) {
        if (arg0 != -1) {
            method1274(49, null, 17);
        }
        field2786 = null;
        field2780 = null;
        field2788 = null;
        field2787 = null;
    }
}
