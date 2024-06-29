import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mia")
public class class69 extends class735 {

    @OriginalMember(owner = "client!mia", name = "t", descriptor = "I")
    private int field1020 = -1;

    @OriginalMember(owner = "client!mia", name = "s", descriptor = "B")
    private byte field1019;

    @OriginalMember(owner = "client!mia", name = "w", descriptor = "F")
    public static float field1023;

    @OriginalMember(owner = "client!mia", name = "u", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!mia", name = "v", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!mia", name = "x", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!mia", name = "y", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!mia", name = "z", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(IIIII)V", line = 4)
    public static final void method623(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1021++;
        class281 var5 = class54.method395((byte) -53, (long) arg1, arg0);
        var5.method1821((byte) -43);
        var5.field3901 = arg3;
        var5.field3910 = arg4;
        var5.field3909 = arg2;
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(Lrh;Z)V", line = 19)
    public final void method624(class280 arg0, boolean arg1) {
        if (arg1) {
            this.field1020 = -86;
        }
        field1024++;
        arg0.method1800(this.field1019, (byte) 94, this.field1020);
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(IIIIZB)V", line = 32)
    public static final void method625(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5) {
        if (class703.field9674 != null && (arg2 != 3 || class435.field5920 != arg1 || class792.field10847 != arg0)) {
            class315.method1989(1, class703.field9674, class630.field8751);
            class703.field9674 = null;
        }
        field1025++;
        if (arg2 == 3 && class703.field9674 == null) {
            class703.field9674 = class451.method2615(arg1, 0, class630.field8751, 104, arg0, 0);
            if (class703.field9674 != null) {
                class792.field10847 = arg0;
                class435.field5920 = arg1;
                class307.method1957(0);
            }
        }
        if (arg2 == 3 && class703.field9674 == null) {
            method625(-1, -1, class111.field1911.field6714.method2951((byte) 68), arg3, true, (byte) -122);
            return;
        }
        Container var6;
        if (class703.field9674 != null) {
            var6 = class703.field9674;
            class760.field10464 = arg1;
            class540.field7360 = arg0;
        } else if (class194.field2956 == null) {
            if (class286.field3936 == null) {
                var6 = class286.field3938;
            } else {
                var6 = class286.field3936;
            }
            class760.field10464 = var6.getSize().width;
            class540.field7360 = var6.getSize().height;
        } else {
            Insets var7 = class194.field2956.getInsets();
            class760.field10464 = class194.field2956.getSize().width - var7.right - var7.left;
            class540.field7360 = class194.field2956.getSize().height - var7.bottom - var7.top;
            var6 = class194.field2956;
        }
        if (arg2 == 1) {
            class732.field10098 = class374.field5075;
            class108.field1697 = class412.field5635;
            class596.field8354 = (class760.field10464 - class374.field5075) / 2;
            class41.field665 = 0;
        } else {
            class642.method3573(800);
        }
        if (class556.field7850 != class517.field7028) {
            boolean var10000;
            if (class732.field10098 < 1024 && class108.field1697 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg4) {
            class356.method2196(-118);
        } else {
            class558.field7896.setSize(class732.field10098, class108.field1697);
            if (class618.field8597) {
                class146.method1180(class558.field7896, 21047);
            } else {
                class95.field1472.method477(class558.field7896, class732.field10098, class108.field1697);
            }
            if (class194.field2956 == var6) {
                Insets var8 = class194.field2956.getInsets();
                class558.field7896.setLocation(class596.field8354 + var8.left, class41.field665 + var8.top);
            } else {
                class558.field7896.setLocation(class596.field8354, class41.field665);
            }
        }
        if (arg2 >= 2) {
            class760.field10465 = true;
        } else {
            class760.field10465 = false;
        }
        if (class359.field4911 != -1) {
            class386.method2349(0, true);
        }
        if (arg5 > -82) {
            field1023 = 0.2356641F;
        }
        if (class193.field2948 != null && class787.method4288(class753.field10398, (byte) 126)) {
            class402.method2404(-13113);
        }
        for (int var9 = 0; var9 < 100; var9++) {
            class377.field5145[var9] = true;
        }
        class711.field9797 = true;
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(ZLwda;)I", line = 167)
    public static final int method626(boolean arg0, class666 arg1) {
        field1026++;
        class568 var2 = arg1.field9253;
        if (var2.field8023 != null) {
            var2 = var2.method3283((byte) -128, class694.field9613);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field8078;
        class540 var4 = arg1.method2347(16383);
        if (arg1.field5249 == -1 || arg1.field5262) {
            var3 = var2.field8068;
        } else if (arg1.field5249 == var4.field7368 || arg1.field5249 == var4.field7337 || arg1.field5249 == var4.field7359 || arg1.field5249 == var4.field7357) {
            var3 = var2.field8027;
        } else if (arg1.field5249 == var4.field7372 || arg1.field5249 == var4.field7351 || arg1.field5249 == var4.field7366 || arg1.field5249 == var4.field7336) {
            var3 = var2.field8020;
        }
        return arg0 ? var3 : 68;
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(ILfca;)V", line = 206)
    public final void method627(int arg0, class93 arg1) {
        this.field1020 = arg1.method763(-73);
        field1022++;
        this.field1019 = arg1.method766((byte) 122);
        if (arg0 != 5) {
            method626(false, null);
        }
    }
}
