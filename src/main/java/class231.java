import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class231 extends class238 {

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public int field2943;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
    public int field2948;

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "I")
    public int field2950;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "Lfl;")
    public class673 field2949;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "[Lmr;")
    public class130[] field2947;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BIZIII)V")
    public static final void method1342(byte arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (class680.field9649 != null && (arg3 != 3 || class601.field8530.field2850 != arg4 || class601.field8530.field2865 != arg5)) {
            class330.method1865(class680.field9649, (byte) 111, class623.field8837);
            class680.field9649 = null;
        }
        field2944++;
        if (arg3 == 3 && class680.field9649 == null) {
            class680.field9649 = class316.method1787(0, class623.field8837, (byte) -125, arg5, 0, arg4);
            if (class680.field9649 != null) {
                class601.field8530.field2865 = arg5;
                class601.field8530.field2850 = arg4;
                class601.field8530.method1841(124, class623.field8837);
            }
        }
        if (arg3 == 3 && class680.field9649 == null) {
            method1342((byte) -126, arg1, true, class601.field8530.field2869, -1, -1);
        } else if (arg0 < -118) {
            Container var6;
            if (class680.field9649 != null) {
                class433.field5699 = arg4;
                class680.field9645 = arg5;
                var6 = class680.field9649;
            } else if (class77.field796 == null) {
                if (class485.field7068 == null) {
                    var6 = class663.field9432;
                } else {
                    var6 = class485.field7068;
                }
                class433.field5699 = var6.getSize().width;
                class680.field9645 = var6.getSize().height;
            } else {
                Insets var7 = class77.field796.getInsets();
                int var10001 = -var7.right;
                class433.field5699 = class77.field796.getSize().width + var10001 - var7.left;
                int var10 = var7.top + var7.bottom;
                class680.field9645 = class77.field796.getSize().height - var10;
                var6 = class77.field796;
            }
            if (arg3 == 1) {
                class600.field8523 = 0;
                class287.field3673 = (class433.field5699 - class466.field6460) / 2;
                class416.field5524 = class137.field1567;
                class399.field5336 = class466.field6460;
            } else {
                class562.method3173(1024);
            }
            if (class73.field771 != class553.field7884) {
                boolean var10000;
                if (class399.field5336 < 1024 && class416.field5524 < 768) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
            }
            if (arg2) {
                class236.method1366(112);
            } else {
                class220.field2664.setSize(class399.field5336, class416.field5524);
                class453.field6284.method325(class220.field2664);
                if (class77.field796 == var6) {
                    Insets var8 = class77.field796.getInsets();
                    class220.field2664.setLocation(var8.left + class287.field3673, var8.top - -class600.field8523);
                } else {
                    class220.field2664.setLocation(class287.field3673, class600.field8523);
                }
            }
            if (arg3 >= 2) {
                class354.field4637 = true;
            } else {
                class354.field4637 = false;
            }
            if (class397.field5320 != -1) {
                class433.method2313(-89, true);
            }
            if (class170.field2043 != null && class621.method3481(-107, class351.field4601)) {
                class200.method1220((byte) -117);
            }
            for (int var9 = 0; var9 < 100; var9++) {
                class406.field5409[var9] = true;
            }
            class229.field2914 = true;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IZIFIZII)[I")
    public static final int[] method1343(int arg0, boolean arg1, int arg2, float arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field2940++;
        int[] var8 = new int[arg2];
        class273 var9 = new class273();
        if (!arg5) {
            return null;
        }
        var9.field3459 = (int) (arg3 * 4096.0F);
        var9.field3470 = arg1;
        var9.field3456 = arg6;
        var9.field3468 = arg0;
        var9.field3466 = arg4;
        var9.field3469 = arg7;
        var9.method118(-9);
        class625.method3502(arg2, (byte) 81, 1);
        var9.method1562(var8, 0, arg5);
        return var8;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BFFF)F")
    public static final float method1344(byte arg0, float arg1, float arg2, float arg3) {
        if (arg0 != -28) {
            method1346(35, -30);
        }
        field2942++;
        return (arg2 - arg1) * arg3 + arg1;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lrt;B)I")
    public static final int method1345(class208 arg0, byte arg1) {
        field2945++;
        String var2 = class5.method24(arg0, (byte) -122);
        if (arg1 != -71) {
            return -92;
        }
        int[] var3 = null;
        if (class455.method2586(arg0.field2527, (byte) -114)) {
            var3 = class472.field6588.method1903((int) arg0.field2524, (byte) -115).field7702;
        } else if (arg0.field2534 != -1) {
            var3 = class472.field6588.method1903(arg0.field2534, (byte) 117).field7702;
        } else if (class662.method3721((byte) 72, arg0.field2527)) {
            class443 var6 = (class443) class392.field5223.method3234((byte) -68, (long) ((int) arg0.field2524));
            if (var6 != null) {
                class625 var7 = var6.field6107;
                class23 var8 = var7.field8855;
                if (var8.field229 != null) {
                    var8 = var8.method108(0, class491.field7127);
                }
                if (var8 != null) {
                    var3 = var8.field215;
                }
            }
        } else if (class429.method2304(15311, arg0.field2527)) {
            Object var4 = null;
            class335 var5;
            if (arg0.field2527 == 1009) {
                var5 = class195.field2339.method3729((int) arg0.field2524, (byte) 109);
            } else {
                var5 = class195.field2339.method3729((int) (arg0.field2524 >>> 32 & 0x7FFFFFFFL), (byte) 109);
            }
            if (var5.field4342 != null) {
                var5 = var5.method1889(1, class491.field7127);
            }
            if (var5 != null) {
                var3 = var5.field4375;
            }
        }
        if (var3 != null) {
            var2 = var2 + class392.method2140(var3, -82);
        }
        int var9 = class612.field8650.method3624(arg1 + 189, var2, class595.field8449);
        if (arg0.field2535) {
            var9 += class217.field2619.method415() + 4;
        }
        return var9;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)Lav;")
    public static final class583 method1346(int arg0, int arg1) {
        field2941++;
        return arg0 < 7 ? null : new class583(arg1, false);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Loa;BII)Z")
    public final boolean method1347(class635 arg0, byte arg1, int arg2, int arg3) {
        if (arg1 <= 63) {
            this.field2948 = -54;
        }
        field2946++;
        if (this.field2947 != null) {
            for (int var5 = 0; var5 < this.field2947.length; var5++) {
                if (this.field2947[var5].method736(arg2, arg3) && this.field2949.method457(arg3, 1, arg0, arg2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
