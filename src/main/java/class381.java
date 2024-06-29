import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class381 extends class328 {

    @OriginalMember(owner = "client!wr", name = "r", descriptor = "I")
    private int field5594;

    @OriginalMember(owner = "client!wr", name = "y", descriptor = "I")
    private int field5601;

    @OriginalMember(owner = "client!wr", name = "u", descriptor = "I")
    private int field5597;

    @OriginalMember(owner = "client!wr", name = "t", descriptor = "I")
    private int field5596;

    @OriginalMember(owner = "client!wr", name = "x", descriptor = "Ldq;")
    public static class90 field5600 = new class90(16);

    @OriginalMember(owner = "client!wr", name = "z", descriptor = "I")
    public static int field5602 = 10;

    @OriginalMember(owner = "client!wr", name = "A", descriptor = "Z")
    public static boolean field5603 = false;

    @OriginalMember(owner = "client!wr", name = "B", descriptor = "Ljava/lang/String;")
    public static String field5604 = "";

    @OriginalMember(owner = "client!wr", name = "o", descriptor = "I")
    public static int field5591;

    @OriginalMember(owner = "client!wr", name = "p", descriptor = "I")
    public static int field5592;

    @OriginalMember(owner = "client!wr", name = "q", descriptor = "I")
    public static int field5593;

    @OriginalMember(owner = "client!wr", name = "s", descriptor = "I")
    public static int field5595;

    @OriginalMember(owner = "client!wr", name = "v", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!wr", name = "w", descriptor = "I")
    public static int field5599;

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(III)V", line = 5)
    public final void method330(int arg0, int arg1, int arg2) {
        ++field5595;
        if (arg2 == 0) {
            int var4 = this.field5601 * arg1 >> 12;
            int var5 = this.field5596 * arg1 >> 12;
            int var6 = this.field5594 * arg0 >> 12;
            int var7 = this.field5597 * arg0 >> 12;
            class75.method529(var5, var7, arg2 ^ 85, var4, var6, super.field4884);
        }
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)V", line = 28)
    public static void method2417(int arg0) {
        if (arg0 != -3511) {
            field5602 = 80;
        }
        field5600 = null;
        field5604 = null;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(BIZIII)V", line = 39)
    public static final void method2418(byte arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        ++field5593;
        if (arg2) {
            class369.method2347((byte) 125);
        }
        if (class359.field5222 != null && (arg1 != 3 || ~class189.field2643 != ~arg4 || ~class10.field134 != ~arg5)) {
            class262.method1790(class267.field3963, (byte) -109, class359.field5222);
            class359.field5222 = null;
        }
        if (~arg1 == -4 && class359.field5222 == null) {
            class359.field5222 = class257.method1774(0, arg5, false, class267.field3963, 0, arg4);
            if (class359.field5222 != null) {
                class189.field2643 = arg4;
                class10.field134 = arg5;
                class53.method414(class267.field3963, true);
            }
        }
        if (arg1 == 3 && class359.field5222 == null) {
            method2418((byte) -20, class223.field3361, true, arg3, -1, -1);
        } else {
            Container var6;
            if (class359.field5222 != null) {
                class266.field3946 = arg4;
                var6 = class359.field5222;
                class252.field3699 = arg5;
            } else if (class279.field4116 != null) {
                Insets var7 = class279.field4116.getInsets();
                int var10001 = var7.right + var7.left;
                class266.field3946 = class279.field4116.getSize().width - var10001;
                int var12 = var7.top + var7.bottom;
                class252.field3699 = class279.field4116.getSize().height - var12;
                var6 = class279.field4116;
            } else {
                var6 = class267.field3963.field5023;
                class266.field3946 = var6.getSize().width;
                class252.field3699 = var6.getSize().height;
            }
            if (~arg1 == -2) {
                class263.field3898 = 0;
                class31.field433 = (-class60.field800 + class266.field3946) / 2;
                class375.field5473 = class366.field5302;
                class214.field3016 = class60.field800;
            } else if (class451.field6661 < 96 && class118.field1594 == 0) {
                int var8 = ~class266.field3946 < -1025 ? 1024 : class266.field3946;
                class31.field433 = (class266.field3946 - var8) / 2;
                class214.field3016 = var8;
                int var9 = ~class252.field3699 < -769 ? 768 : class252.field3699;
                class375.field5473 = var9;
                class263.field3898 = 0;
            } else {
                class375.field5473 = class252.field3699;
                class214.field3016 = class266.field3946;
                class263.field3898 = 0;
                class31.field433 = 0;
            }
            if (class373.field5452 != 0) {
                boolean var10000;
                if (~class214.field3016 > -1025 && ~class375.field5473 > -769) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
            }
            if (arg0 != -20) {
                field5603 = false;
            }
            if (arg2) {
                class358.method2280(class118.field1594, true);
            } else {
                class270.field4004.setSize(class214.field3016, class375.field5473);
                if (class74.field942 != null) {
                    class74.field942.method83();
                }
                if (class279.field4116 == var6) {
                    Insets var10 = class279.field4116.getInsets();
                    class270.field4004.setLocation(var10.left - -class31.field433, class263.field3898 + var10.top);
                } else {
                    class270.field4004.setLocation(class31.field433, class263.field3898);
                }
            }
            if (arg1 < 2) {
                class37.field526 = false;
            } else {
                class37.field526 = true;
            }
            if (class318.field4672 != -1) {
                class298.method1981(true, (byte) -104);
            }
            if (class72.field933 != null && (~class120.field1610 == -31 || ~class120.field1610 == -26)) {
                class454.method2814(false);
            }
            for (int var11 = 0; var11 < 100; ++var11) {
                class344.field5053[var11] = true;
            }
            class36.field508 = true;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(BII)V", line = 190)
    public final void method328(byte arg0, int arg1, int arg2) {
        if (arg0 != 20) {
            this.field5594 = -9;
        }
        ++field5599;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(BII[II)V", line = 200)
    public static final void method2419(byte arg0, int arg1, int arg2, int[] arg3, int arg4) {
        ++field5591;
        --arg2;
        if (arg0 < 4) {
            method2419((byte) -36, -18, -51, (int[]) null, -28);
        }
        int var11 = arg4 - 1;
        int var5 = -7 + var11;
        while (arg2 < var5) {
            int var6 = arg2 + 1;
            arg3[var6] = arg1;
            int var7 = var6 + 1;
            arg3[var7] = arg1;
            int var8 = var7 + 1;
            arg3[var8] = arg1;
            int var9 = var8 + 1;
            arg3[var9] = arg1;
            int var10 = var9 + 1;
            arg3[var10] = arg1;
            int var12 = var10 + 1;
            arg3[var12] = arg1;
            int var13 = var12 + 1;
            arg3[var13] = arg1;
            arg2 = var13 + 1;
            arg3[arg2] = arg1;
        }
        while (~arg2 > ~var11) {
            ++arg2;
            arg3[arg2] = arg1;
        }
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(IIIIII)V", line = 230)
    public class381(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field5594 = arg1;
        this.field5601 = arg0;
        this.field5597 = arg3;
        this.field5596 = arg2;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(BI)V", line = 242)
    public static final void method2420(byte arg0, int arg1) {
        if (arg0 != 38) {
            field5603 = false;
        }
        ++field5598;
        if (class103.method695(arg1, arg0 ^ -87)) {
            class450.method2776(-1, 127, class444.field6470[arg1]);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(III)V", line = 269)
    public final void method325(int arg0, int arg1, int arg2) {
        ++field5592;
        if (arg0 != 0) {
            field5604 = null;
        }
    }
}
