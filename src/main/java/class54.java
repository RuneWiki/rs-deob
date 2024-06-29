import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class54 extends class259 {

    @OriginalMember(owner = "client!ri", name = "V", descriptor = "I")
    public static int field1193 = -1;

    @OriginalMember(owner = "client!ri", name = "bb", descriptor = "Lsg;")
    private static class30 field1199 = class167.method1221((byte) 33, "glow2:");

    @OriginalMember(owner = "client!ri", name = "cb", descriptor = "Lsg;")
    public static class30 field1200 = field1199;

    @OriginalMember(owner = "client!ri", name = "eb", descriptor = "Lsg;")
    public static class30 field1202 = class167.method1221((byte) 33, "blinken1:");

    @OriginalMember(owner = "client!ri", name = "db", descriptor = "Lsg;")
    public static class30 field1201 = field1199;

    @OriginalMember(owner = "client!ri", name = "S", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!ri", name = "T", descriptor = "I")
    private int field1191;

    @OriginalMember(owner = "client!ri", name = "U", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!ri", name = "W", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!ri", name = "X", descriptor = "I")
    private int field1195;

    @OriginalMember(owner = "client!ri", name = "Y", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!ri", name = "Z", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!ri", name = "ab", descriptor = "I")
    private int field1198;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(BI)V")
    private final void method522(byte arg0, int arg1) {
        if (arg0 > 61) {
            this.field1195 = (arg1 & 16711680) >> 12;
            this.field1191 = (255 & arg1) << 4;
            this.field1198 = 4080 & arg1 >> 4;
            ++field1192;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZZIIIIZI)Lbj;")
    public static final class44 method523(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        class168 var8 = class201.method1425(82, arg3);
        if (arg5 > 1 && var8.field3148 != null) {
            int var9 = -1;
            for (int var10 = 0; ~var10 > -11; ++var10) {
                if (~arg5 <= ~var8.field3110[var10] && ~var8.field3110[var10] != -1) {
                    var9 = var8.field3148[var10];
                }
            }
            if (var9 != -1) {
                var8 = class201.method1425(31, var9);
            }
        }
        ++field1197;
        class214 var11 = var8.method1229(6936);
        if (var11 == null) {
            return null;
        } else {
            class152 var12 = null;
            if (var8.field3105 != -1) {
                var12 = (class152) method523(true, true, 0, var8.field3116, 1, 10, false, -128);
                if (var12 == null) {
                    return null;
                }
            } else if (~var8.field3112 != 0) {
                var12 = (class152) method523(false, true, arg2, var8.field3123, arg4, arg5, false, -119);
                if (var12 == null) {
                    return null;
                }
            }
            int var13 = class188.field3436;
            int var14 = class188.field3433;
            int[] var15 = class188.field3437;
            int[] var16 = new int[4];
            class188.method1352(var16);
            class152 var17 = new class152(36, 32);
            class188.method1368(var17.field2904, 36, 32);
            class213.method1528();
            class213.method1535(16, 16);
            class213.field3856 = false;
            int var18 = var8.field3155;
            if (arg0) {
                var18 = (int) ((double) var18 * 1.5D);
            } else if (~arg4 == -3) {
                var18 = (int) ((double) var18 * 1.04D);
            }
            int var19 = class213.field3849[var8.field3138] * var18 >> 16;
            int var20 = class213.field3846[var8.field3138] * var18 >> 16;
            var11.method1550(0, var8.field3113, var8.field3109, var8.field3138, var8.field3161, var19 - (var11.method22() / 2 + -var8.field3132), var8.field3132 + var20);
            if (arg4 >= 1) {
                var17.method1136(1);
                if (~arg4 <= -3) {
                    var17.method1136(16777215);
                }
                class188.method1368(var17.field2904, 36, 32);
            }
            if (arg2 != 0) {
                var17.method1138(arg2);
            }
            if (~var8.field3105 == 0) {
                if (~var8.field3112 != 0) {
                    class188.method1368(var12.field2904, 36, 32);
                    var17.method446(0, 0);
                    var17 = var12;
                }
            } else {
                var12.method446(0, 0);
            }
            if (arg6 && (~var8.field3097 == -2 || arg5 != 1) && ~arg5 != 0) {
                class175.field3255.method1450(class137.method1032(arg5, (byte) 23), 0, 9, 16776960, 1);
            }
            class188.method1368(var15, var13, var14);
            class188.method1356(var16);
            class213.method1528();
            class213.field3856 = true;
            int var21 = 124 / ((arg7 - -79) / 34);
            return var17;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BI)[[I")
    public final int[][] method3(byte arg0, int arg1) {
        int[][] var3 = super.field4568.method241(63, arg1);
        int var4 = 60 % ((-48 - arg0) / 42);
        if (super.field4568.field564) {
            int[] var5 = var3[1];
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            for (int var8 = 0; class223.field3999 > var8; ++var8) {
                var6[var8] = this.field1195;
                var5[var8] = this.field1198;
                var7[var8] = this.field1191;
            }
        }
        ++field1194;
        return var3;
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V")
    public class54() {
        this(0);
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(I)V")
    private class54(int arg0) {
        super(0, false);
        this.method522((byte) 96, arg0);
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(B)V")
    public static void method524(byte arg0) {
        int var1 = 84 / ((arg0 - -73) / 33);
        field1199 = null;
        field1202 = null;
        field1201 = null;
        field1200 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IILaa;)V")
    public final void method4(int arg0, int arg1, class8 arg2) {
        ++field1190;
        if (~arg0 == -1) {
            this.method522((byte) 120, arg2.method60(23888));
        }
        if (arg1 != -1586849108) {
            this.field1198 = 40;
        }
    }
}
