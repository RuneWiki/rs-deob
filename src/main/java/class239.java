import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class239 extends class46 {

    @OriginalMember(owner = "client!fl", name = "P", descriptor = "I")
    public static int field3778 = -1;

    @OriginalMember(owner = "client!fl", name = "J", descriptor = "[Ljava/lang/String;")
    public static String[] field3773 = new String[200];

    @OriginalMember(owner = "client!fl", name = "R", descriptor = "I")
    public static volatile int field3780 = 0;

    @OriginalMember(owner = "client!fl", name = "U", descriptor = "[I")
    public static int[] field3783 = new int[200];

    @OriginalMember(owner = "client!fl", name = "Y", descriptor = "I")
    public static int field3787 = 0;

    @OriginalMember(owner = "client!fl", name = "Z", descriptor = "B")
    public byte field3788;

    @OriginalMember(owner = "client!fl", name = "F", descriptor = "I")
    public int field3772;

    @OriginalMember(owner = "client!fl", name = "N", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!fl", name = "O", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!fl", name = "Q", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!fl", name = "S", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!fl", name = "T", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!fl", name = "V", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!fl", name = "W", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!fl", name = "X", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!fl", name = "ab", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!fl", name = "K", descriptor = "Lim;")
    public class192 field3774;

    @OriginalMember(owner = "client!fl", name = "L", descriptor = "Lkb;")
    public static class39 field3775;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "(B)Ljava/lang/String;", line = 8)
    public static final String method1693(byte arg0) {
        int var1 = -34 / ((-arg0 - 6) / 34);
        field3789++;
        String var2 = "www";
        if (class71.field917 != 0) {
            var2 = "www-wtqa";
        }
        String var3 = "";
        if (class147.field2204 != null) {
            var3 = "/p=" + class147.field2204;
        }
        return "http://" + var2 + ".runescape.com/l=" + class136.field2054 + "/a=" + class240.field3807 + var3 + "/";
    }

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)Leh;", line = 30)
    public static final class179 method1694(int arg0) {
        field3785++;
        if (arg0 != 0) {
            field3783 = (int[]) null;
        }
        class179 var1 = (class179) class35.field467.method2286(-31893);
        if (var1 != null) {
            var1.method465((byte) -122);
            var1.method189(0);
            return var1;
        }
        class179 var2;
        do {
            var2 = (class179) class218.field3505.method2286(-31893);
            if (var2 == null) {
                return null;
            }
            if (var2.method1244(-107) > class304.method2128((byte) -104)) {
                return null;
            }
            var2.method465((byte) -122);
            var2.method189(0);
        } while ((var2.field416 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "(I)V", line = 74)
    public static final void method1695(int arg0) {
        for (class197 var1 = (class197) class114.field1709.method1807((byte) 125); var1 != null; var1 = (class197) class114.field1709.method1808(18051)) {
            if (var1.field3231) {
                var1.method1442(arg0 ^ 0x7E);
            }
        }
        field3777++;
        if (arg0 != 0) {
            method1693((byte) 68);
        }
        for (class197 var2 = (class197) class287.field4526.method1807((byte) 54); var2 != null; var2 = (class197) class287.field4526.method1808(18051)) {
            if (var2.field3231) {
                var2.method1442(arg0 + 127);
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIILdb;II)V", line = 108)
    public static final void method1696(int arg0, int arg1, int arg2, class197 arg3, int arg4, int arg5) {
        field3784++;
        if (arg3.field3236 == -1 && arg3.field3242 == null) {
            return;
        }
        int var6 = class139.field2076 * arg3.field3235 >> 8;
        int var7 = 0;
        if (arg4 > arg3.field3239) {
            var7 += arg4 - arg3.field3239;
        } else if (arg3.field3226 > arg4) {
            var7 += arg3.field3226 - arg4;
        }
        if (arg5 > arg3.field3229) {
            var7 += arg5 - arg3.field3229;
        } else if (arg5 < arg3.field3225) {
            var7 += arg3.field3225 - arg5;
        }
        if (arg3.field3241 == arg0 || arg3.field3241 < var7 - 64 || class139.field2076 == 0 || arg3.field3238 != arg2) {
            if (arg3.field3232 != null) {
                class107.field1622.method739(arg3.field3232);
                arg3.field3232 = null;
            }
            if (arg3.field3223 != null) {
                class107.field1622.method739(arg3.field3223);
                arg3.field3223 = null;
            }
            return;
        }
        var7 -= 64;
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = (arg3.field3241 - var7) * var6 / arg3.field3241;
        if (arg3.field3232 != null) {
            arg3.field3232.method943(var8);
        } else if (arg3.field3236 >= 0) {
            class108 var9 = class108.method746(class35.field469, arg3.field3236, 0);
            if (var9 != null) {
                class267 var10 = var9.method745().method1892(class200.field3287);
                class141 var11 = class141.method944(var10, 100, var8);
                var11.method979(-1);
                class107.field1622.method741(var11);
                arg3.field3232 = var11;
            }
        }
        if (arg3.field3223 != null) {
            arg3.field3223.method943(var8);
            if (!arg3.field3223.method466((byte) 56)) {
                arg3.field3223 = null;
            }
        } else if (arg3.field3242 != null && (arg3.field3228 -= arg1) <= 0) {
            int var12 = (int) ((double) arg3.field3242.length * Math.random());
            class108 var13 = class108.method746(class35.field469, arg3.field3242[var12], 0);
            if (var13 != null) {
                class267 var14 = var13.method745().method1892(class200.field3287);
                class141 var15 = class141.method944(var14, 100, var8);
                var15.method979(0);
                class107.field1622.method741(var15);
                arg3.field3223 = var15;
                arg3.field3228 = (int) ((double) (arg3.field3227 - arg3.field3243) * Math.random()) + arg3.field3243;
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "([J[IZ)V", line = 234)
    public static final void method1697(long[] arg0, int[] arg1, boolean arg2) {
        if (arg2) {
            class299.method2085(arg1, (byte) -72, arg0.length - 1, arg0, 0);
            field3779++;
        }
    }

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "(B)V", line = 254)
    public static void method1698(byte arg0) {
        field3773 = null;
        if (arg0 != 85) {
            field3778 = -91;
        }
        field3775 = null;
        field3783 = null;
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)I", line = 274)
    public final int method311(int arg0) {
        if (arg0 > -84) {
            method1695(-43);
        }
        field3776++;
        return this.field3774 == null ? 0 : this.field3774.field3129 * 100 / (this.field3774.field3128.length - this.field3788);
    }

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "(B)[B", line = 289)
    public final byte[] method308(byte arg0) {
        field3781++;
        if (arg0 < 73) {
            field3775 = (class39) null;
        }
        if (this.field624 || this.field3774.field3129 < (this.field3774.field3128.length - this.field3788)) {
            throw new RuntimeException();
        }
        return this.field3774.field3128;
    }
}
