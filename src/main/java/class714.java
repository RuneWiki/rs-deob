import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class714 {

    @OriginalMember(owner = "client!to", name = "k", descriptor = "Leda;")
    private class14 field10040 = new class14(256);

    @OriginalMember(owner = "client!to", name = "b", descriptor = "Ld;")
    private class267 field10031;

    @OriginalMember(owner = "client!to", name = "j", descriptor = "Lrs;")
    private class166 field10039;

    @OriginalMember(owner = "client!to", name = "c", descriptor = "I")
    public static int field10032 = 0;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "I")
    public static int field10030;

    @OriginalMember(owner = "client!to", name = "d", descriptor = "I")
    public static int field10033;

    @OriginalMember(owner = "client!to", name = "f", descriptor = "I")
    public static int field10035;

    @OriginalMember(owner = "client!to", name = "g", descriptor = "I")
    public static int field10036;

    @OriginalMember(owner = "client!to", name = "h", descriptor = "I")
    public static int field10037;

    @OriginalMember(owner = "client!to", name = "i", descriptor = "I")
    public static int field10038;

    @OriginalMember(owner = "client!to", name = "e", descriptor = "Lla;")
    public static class422 field10034;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V", line = 3)
    public static void method3946(int arg0) {
        if (arg0 != 3553) {
            field10034 = null;
        }
        field10034 = null;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Ljava/awt/Frame;Lfc;Z)V", line = 13)
    public static final void method3947(Frame arg0, class731 arg1, boolean arg2) {
        field10036++;
        while (true) {
            class162 var3 = arg1.method4071(arg0, -15);
            while (var3.field2512 == 0) {
                class484.method2932(true, 10L);
            }
            if (var3.field2512 == 1) {
                arg0.setVisible(arg2);
                arg0.dispose();
                return;
            }
            class484.method2932(true, 100L);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BI)Lwo;", line = 35)
    public final class692 method3948(byte arg0, int arg1) {
        field10037++;
        Object var3 = this.field10040.method80((byte) -45, (long) arg1);
        if (var3 != null) {
            return (class692) var3;
        } else if (this.field10031.method1772(arg0 ^ 0xFFFFE8F8, arg1)) {
            if (arg0 != 25) {
                field10034 = null;
            }
            class569 var4 = this.field10031.method1774(111, arg1);
            int var5 = var4.field8067 ? 64 : this.field10039.field2751;
            class692 var7;
            if (var4.field8070 && this.field10039.method1237()) {
                float[] var6 = this.field10031.method1775(var5, false, 0.7F, var5, arg0 ^ 0xFFFF953E, arg1);
                var7 = new class692(this.field10039, 3553, 34842, var5, var5, var4.field8061 != 0, var6, 6408);
            } else {
                int[] var8;
                if (var4.field8072 != 2 && class119.method940(var4.field8079, (byte) -53)) {
                    var8 = this.field10031.method1771(0.7F, var5, arg1, var5, (byte) 70, true);
                } else {
                    var8 = this.field10031.method1776(false, 0.7F, var5, (byte) 45, var5, arg1);
                }
                var7 = new class692(this.field10039, 3553, 6408, var5, var5, var4.field8061 != 0, var8, 0, 0, false);
            }
            var7.method3862(var4.field8078, var4.field8063, -29630);
            this.field10040.method67((long) arg1, var7, -6772);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BLjava/lang/String;)I", line = 82)
    public static final int method3949(byte arg0, String arg1) {
        if (arg0 >= -40) {
            return 58;
        } else {
            field10030++;
            return class440.method2705(94, arg1, 10, true);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Z)V", line = 97)
    public final void method3950(boolean arg0) {
        field10035++;
        if (!arg0) {
            this.field10040.method76(66);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(B)V", line = 114)
    public static final void method3951(byte arg0) {
        field10038++;
        class221.field3593 = null;
        if (class250.field3989 && class347.method2215(-21383) != 1) {
            class368.method2349(0, class336.method2151((byte) -96), 0, class521.field7529 == 3 || class521.field7529 == 7, -21120, class59.method581(-3497));
        }
        if (arg0 != -102) {
            method3947(null, null, true);
        }
        int var1 = 0;
        int var2 = 0;
        if (class250.field3989) {
            var1 = class499.method3028(0);
            var2 = class545.method3197(-102);
        }
        class118.method935(var2, var1, -1, var1, class412.field6066 + var2, class673.field9523, var1 + class660.field9408, (byte) 80, var2);
        if (class221.field3593 != null) {
            class706.method3919((byte) 66, class23.field236.field5369, var1, var2, true, class652.field9258, class60.field943, class660.field9408 + var1, class221.field3593, class412.field6066 + var2, -1412584499);
            class221.field3593 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(I)V", line = 150)
    public final void method3952(int arg0) {
        this.field10040.method68(-16878, 5);
        if (arg0 != 3553) {
            field10032 = 81;
        }
        field10033++;
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lrs;Ld;)V", line = 166)
    public class714(class166 arg0, class267 arg1) {
        this.field10031 = arg1;
        this.field10039 = arg0;
    }
}
