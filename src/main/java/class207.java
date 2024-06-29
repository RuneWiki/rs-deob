import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class207 extends class424 {

    @OriginalMember(owner = "client!hi", name = "L", descriptor = "I")
    public int field2488;

    @OriginalMember(owner = "client!hi", name = "I", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!hi", name = "J", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!hi", name = "K", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!hi", name = "M", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!hi", name = "N", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Lee;Lhaa;IIIIIIIIIIIIII)V")
    public class207(class676 arg0, class82 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
        this.field2488 = arg15;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIZII)V")
    public static final void method1157(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field2489++;
        if (class392.field5553 != 1) {
            return;
        }
        int var5 = arg3 / class377.field5235;
        int var6 = arg4 / class377.field5235;
        int var7 = arg1 / class759.field10586;
        int var8 = arg0 / class759.field10586;
        if (arg2) {
            field2490 = 95;
        }
        if (var5 >= class56.field573 || var6 < 0 || var7 >= class676.field9447 || var8 < 0) {
            return;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        if (class676.field9447 <= var8) {
            var8 = class676.field9447 - 1;
        }
        if (var6 >= class56.field573) {
            var6 = class56.field573 - 1;
        }
        for (int var9 = var7; var9 <= var8; var9++) {
            int var10 = class304.method1837((byte) 6, class65.field716 + var9, class676.field9447) * class56.field573;
            for (int var11 = var5; var11 <= var6; var11++) {
                int var12 = var10 + class304.method1837((byte) 6, var11 + class122.field1606, class56.field573);
                class381.field5338[var12] = class339.field4577;
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)Lhda;")
    public final class750 method333(int arg0) {
        field2487++;
        return arg0 == 30778 ? class360.field4762 : null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIZIII)V")
    public static final void method1158(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field2486++;
        if (class526.field7067 != null && (arg0 != 3 || class82.field1111 != arg4 || class490.field6699 != arg5)) {
            class114.method757(false, class526.field7067, class287.field3823);
            class526.field7067 = null;
        }
        if (arg0 == 3 && class526.field7067 == null) {
            class526.field7067 = class52.method305(0, (byte) 105, arg4, arg5, 0, class287.field3823);
            if (class526.field7067 != null) {
                class82.field1111 = arg4;
                class490.field6699 = arg5;
                class355.method2054(-5964);
            }
        }
        if (arg0 == 3 && class526.field7067 == null) {
            method1158(class11.field68.field5517.method2812((byte) 120), arg1, true, arg3, -1, -1);
            return;
        }
        Container var6;
        if (class526.field7067 != null) {
            class496.field6749 = arg4;
            var6 = class526.field7067;
            class305.field4136 = arg5;
        } else if (class271.field3587 == null) {
            if (class144.field1868 == null) {
                var6 = class561.field7928;
            } else {
                var6 = class144.field1868;
            }
            class496.field6749 = var6.getSize().width;
            class305.field4136 = var6.getSize().height;
        } else {
            Insets var7 = class271.field3587.getInsets();
            int var10001 = -var7.right;
            class496.field6749 = class271.field3587.getSize().width + var10001 - var7.left;
            int var10 = var7.top + var7.bottom;
            class305.field4136 = class271.field3587.getSize().height - var10;
            var6 = class271.field3587;
        }
        if (arg0 == 1) {
            class56.field575 = 0;
            class546.field7710 = class751.field10419;
            class512.field6932 = class396.field5620;
            class294.field3959 = (class496.field6749 - class751.field10419) / 2;
        } else {
            class70.method527(false);
        }
        if (class61.field673 != class200.field2376) {
            boolean var10000;
            if (class546.field7710 < 1024 && class512.field6932 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg2) {
            class201.method1114((byte) 107);
        } else {
            class725.field10121.setSize(class546.field7710, class512.field6932);
            if (class247.field3206) {
                class218.method1238(class725.field10121, 0);
            } else {
                class21.field142.method394(class725.field10121, class546.field7710, class512.field6932);
            }
            if (class271.field3587 == var6) {
                Insets var8 = class271.field3587.getInsets();
                class725.field10121.setLocation(class294.field3959 + var8.left, class56.field575 + var8.top);
            } else {
                class725.field10121.setLocation(class294.field3959, class56.field575);
            }
        }
        if (arg0 < 2) {
            class684.field9509 = false;
        } else {
            class684.field9509 = true;
        }
        if (class116.field1543 != -1) {
            class574.method3221(arg1 ^ 0x7448, true);
        }
        if (class582.field8161 != null && class247.method1483(-11297, class713.field9949)) {
            class751.method4183(-2);
        }
        if (arg1 != -29758) {
            field2485 = 13;
        }
        for (int var9 = 0; var9 < 100; var9++) {
            class24.field186[var9] = true;
        }
        class468.field6471 = true;
    }
}
