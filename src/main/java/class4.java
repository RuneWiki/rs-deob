import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class4 extends class202 {

    @OriginalMember(owner = "client!ps", name = "K", descriptor = "[F")
    public static float[] field43 = new float[4];

    @OriginalMember(owner = "client!ps", name = "N", descriptor = "Lh;")
    public static class164 field46 = new class164(0, 0);

    @OriginalMember(owner = "client!ps", name = "I", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!ps", name = "J", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!ps", name = "L", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!ps", name = "M", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!ps", name = "O", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!ps", name = "P", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!ps", name = "Q", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!ps", name = "R", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "(III)V")
    private final void method39(int arg0, int arg1, int arg2) {
        ++field49;
        int var4 = class476.field7271[arg0];
        int var5 = class521.field7716[arg2];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class416.field6306 = arg0;
            class434.field6556 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class416.field6306 = arg2;
            class434.field6556 = arg0;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class416.field6306 = class276.field4375 - arg2;
            class434.field6556 = arg0;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class434.field6556 = class249.field4051 - arg2;
            class416.field6306 = arg0;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class434.field6556 = class249.field4051 - arg2;
            class416.field6306 = -arg0 + class276.field4375;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class416.field6306 = -arg2 + class276.field4375;
            class434.field6556 = class249.field4051 - arg0;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class434.field6556 = -arg0 + class249.field4051;
            class416.field6306 = arg2;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class416.field6306 = -arg0 + class276.field4375;
            class434.field6556 = arg2;
        }
        class416.field6306 &= class538.field7882;
        if (arg1 != 0) {
            field50 = -121;
        }
        class434.field6556 &= class335.field5237;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lhw;BI)V")
    public final void method40(class208 arg0, byte arg1, int arg2) {
        int var4 = 37 % ((-46 - arg1) / 50);
        if (arg2 == 0) {
            super.field3071 = ~arg0.method1445(28) == -2;
        }
        ++field44;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IZ)[I")
    public final int[] method41(int arg0, boolean arg1) {
        ++field42;
        if (!arg1) {
            field50 = -33;
        }
        int[] var3 = super.field3064.method2452((byte) 62, arg0);
        if (super.field3064.field5837) {
            for (int var4 = 0; class276.field4375 > var4; ++var4) {
                this.method39(var4, 0, arg0);
                int[] var5 = this.method1376(1046794076, 0, class434.field6556);
                var3[var4] = var5[class416.field6306];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "(Z)V")
    public static void method42(boolean arg0) {
        field43 = null;
        if (!arg0) {
            field43 = null;
        }
        field46 = null;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IILpb;Ljava/awt/Component;I)Lin;")
    public static final class262 method43(int arg0, int arg1, class2 arg2, Component arg3, int arg4) {
        ++field47;
        if (~class221.field3742 == -1) {
            throw new IllegalStateException();
        } else if (arg0 >= 0 && arg0 < 2) {
            if (~arg1 > -257) {
                arg1 = 256;
            }
            try {
                class262 var5 = (class262) Class.forName("dw").newInstance();
                if (arg4 != -3869) {
                    field46 = null;
                }
                var5.field4224 = new int[256 * (!class309.field4835 ? 1 : 2)];
                var5.field4254 = arg1;
                var5.method1796(arg3);
                var5.field4250 = (-1024 & arg1) + 1024;
                if (var5.field4250 > 16384) {
                    var5.field4250 = 16384;
                }
                var5.method1790(var5.field4250);
                if (~class65.field1016 < -1 && class472.field7235 == null) {
                    class472.field7235 = new class479();
                    class472.field7235.field7313 = arg2;
                    arg2.method7(class472.field7235, (byte) 82, class65.field1016);
                }
                if (class472.field7235 != null) {
                    if (class472.field7235.field7312[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class472.field7235.field7312[arg0] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class478 var6 = new class478(arg2, arg0);
                    var6.field4254 = arg1;
                    var6.field4224 = new int[(class309.field4835 ? 2 : 1) * 256];
                    var6.method1796(arg3);
                    var6.field4250 = 16384;
                    var6.method1790(var6.field4250);
                    if (class65.field1016 > 0 && class472.field7235 == null) {
                        class472.field7235 = new class479();
                        class472.field7235.field7313 = arg2;
                        arg2.method7(class472.field7235, (byte) 120, class65.field1016);
                    }
                    if (class472.field7235 != null) {
                        if (class472.field7235.field7312[arg0] != null) {
                            throw new IllegalArgumentException();
                        }
                        class472.field7235.field7312[arg0] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class262();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "()V")
    public class4() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(II)[[I")
    public final int[][] method44(int arg0, int arg1) {
        ++field48;
        int[][] var3 = super.field3081.method1050(arg1, -62);
        if (super.field3081.field2432) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class276.field4375; ++var7) {
                this.method39(var7, 0, arg1);
                int[][] var8 = this.method1382(0, class434.field6556, -90);
                var4[var7] = var8[0][class416.field6306];
                var5[var7] = var8[1][class416.field6306];
                var6[var7] = var8[2][class416.field6306];
            }
        }
        if (arg0 != -1) {
            method45(-45, -53, -109);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ps", name = "f", descriptor = "(III)V")
    public static final void method45(int arg0, int arg1, int arg2) {
        ++field41;
        class456 var3 = class233.method1654(arg1, 5, -6);
        var3.method2858(10250);
        if (arg2 != 2) {
            method43(-41, 53, (class2) null, (Component) null, -93);
        }
        var3.field7042 = arg0;
    }
}
