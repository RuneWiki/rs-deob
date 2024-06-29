import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class194 extends class23 {

    @OriginalMember(owner = "client!ri", name = "S", descriptor = "[I")
    public static int[] field3710 = new int[100];

    @OriginalMember(owner = "client!ri", name = "R", descriptor = "Li;")
    public static class88 field3709 = class208.method1425(105, "event_opbase");

    @OriginalMember(owner = "client!ri", name = "Z", descriptor = "Li;")
    public static class88 field3717 = class208.method1425(105, " loggt sich aus)3");

    @OriginalMember(owner = "client!ri", name = "Y", descriptor = "[I")
    public static int[] field3716 = new int[5];

    @OriginalMember(owner = "client!ri", name = "Q", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!ri", name = "T", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!ri", name = "U", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!ri", name = "V", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!ri", name = "W", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!ri", name = "X", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(IZI)V")
    private final void method1344(int arg0, boolean arg1, int arg2) {
        ++field3712;
        int var4 = class111.field2023[arg2];
        int var5 = class22.field351[arg0];
        float var6 = (float) Math.atan2((double) (var5 + -2048), (double) (var4 + -2048));
        if (!arg1) {
            this.method7(-71, (byte) 12);
        }
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class13.field203 = arg2;
            class186.field3640 = arg0;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class13.field203 = arg0;
            class186.field3640 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class186.field3640 = -arg2 + class70.field1276;
            class13.field203 = arg0;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class186.field3640 = arg0;
            class13.field203 = -arg2 + class27.field460;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class186.field3640 = -arg0 + class70.field1276;
            class13.field203 = -arg2 + class27.field460;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class186.field3640 = -arg2 + class70.field1276;
            class13.field203 = -arg0 + class27.field460;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class186.field3640 = arg2;
            class13.field203 = -arg0 + class27.field460;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class13.field203 = arg2;
            class186.field3640 = class70.field1276 - arg0;
        }
        class13.field203 &= class220.field4160;
        class186.field3640 &= class45.field789;
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(B)V")
    public static void method1345(byte arg0) {
        field3710 = null;
        field3717 = null;
        field3716 = null;
        if (arg0 > -72) {
            method1346(-29, 18);
        }
        field3709 = null;
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V")
    public class194() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)I")
    public static final int method1346(int arg0, int arg1) {
        int var2 = -6 / ((arg1 - -61) / 55);
        ++field3713;
        return 255 & arg0;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IB)[I")
    public final int[] method54(int arg0, byte arg1) {
        ++field3714;
        int[] var3 = super.field379.method1080(false, arg0);
        if (arg1 <= 19) {
            this.method54(-59, (byte) -38);
        }
        if (super.field379.field3100) {
            for (int var4 = 0; ~class70.field1276 < ~var4; ++var4) {
                this.method1344(var4, true, arg0);
                int[] var5 = this.method120(class13.field203, false, 0);
                var3[var4] = var5[class186.field3640];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lea;II)V")
    public final void method11(class46 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            super.field369 = ~arg0.method347(26119) == -2;
        }
        ++field3708;
        if (arg1 != -3) {
            field3709 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(IB)[[I")
    public final int[][] method7(int arg0, byte arg1) {
        ++field3711;
        if (arg1 != 13) {
            field3710 = null;
        }
        int[][] var3 = super.field364.method1541(true, arg0);
        if (super.field364.field4312) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; class70.field1276 > var7; ++var7) {
                this.method1344(var7, true, arg0);
                int[][] var8 = this.method121(0, (byte) -108, class13.field203);
                var4[var7] = var8[0][class186.field3640];
                var5[var7] = var8[1][class186.field3640];
                var6[var7] = var8[2][class186.field3640];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lq;I)Li;")
    public static final class88 method1347(class174 arg0, int arg1) {
        ++field3715;
        if (arg1 != -2) {
            method1347((class174) null, -107);
        }
        if (~class87.method592(1281959627, class80.method530(arg1 + -881710558, arg0)) == -1) {
            return null;
        } else if (arg0.field3514 != null && ~arg0.field3514.method602(-125).method604((byte) -53) != -1) {
            return arg0.field3514;
        } else {
            return class116.field2105 ? class126.field2323 : null;
        }
    }
}
