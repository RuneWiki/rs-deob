import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class277 extends class88 {

    @OriginalMember(owner = "client!ug", name = "x", descriptor = "I")
    private int field4453;

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "I")
    private int field4452;

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "I")
    private int field4448;

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "I")
    private int field4449;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
    public static final void method1859(byte arg0) {
        if (class130.field2168 < class109.field1894) {
            class130.field2168 = (float) ((double) class130.field2168 / 30.0D + (double) class130.field2168);
            if (class130.field2168 > class109.field1894) {
                class130.field2168 = class109.field1894;
            }
            class26.method180(116);
        } else if (class109.field1894 < class130.field2168) {
            class130.field2168 = (float) ((double) class130.field2168 - (double) class130.field2168 / 30.0D);
            if (class109.field1894 > class130.field2168) {
                class130.field2168 = class109.field1894;
            }
            class26.method180(126);
        }
        ++field4450;
        if (arg0 < -25) {
            if (~class237.field3791 != 0 && class150.field2407 != -1) {
                int var1 = class237.field3791 - class122.field2048;
                int var2 = -class266.field4320 + class150.field2407;
                if (~var1 > -3 || var1 > 2) {
                    var1 >>= 4;
                }
                class122.field2048 -= -var1;
                if (~var2 > -3 || var2 > 2) {
                    var2 >>= 4;
                }
                class266.field4320 += var2;
                if (var1 == 0 && ~var2 == -1) {
                    class150.field2407 = -1;
                    class237.field3791 = -1;
                }
                class26.method180(48);
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(III)V")
    public final void method621(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            ++field4446;
        }
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(IIIIII)V")
    public class277(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field4453 = arg3;
        this.field4452 = arg0;
        this.field4448 = arg2;
        this.field4449 = arg1;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)V")
    public final void method620(int arg0, int arg1, int arg2) {
        if (arg0 == -1) {
            ++field4451;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIB)V")
    public final void method629(int arg0, int arg1, byte arg2) {
        ++field4447;
        int var4 = this.field4448 * arg0 >> 12;
        int var5 = -86 / ((-19 - arg2) / 62);
        int var6 = this.field4452 * arg0 >> 12;
        int var7 = this.field4449 * arg1 >> 12;
        int var8 = this.field4453 * arg1 >> 12;
        class263.method1723(var7, var8, super.field1208, var6, 255, var4);
    }
}
