import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public class class208 {

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "[I")
    public static int[] field3083 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!dga", name = "e", descriptor = "I")
    public static int field3086 = -1;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "I")
    public int field3082;

    @OriginalMember(owner = "client!dga", name = "c", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!dga", name = "f", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!dga", name = "g", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!dga", name = "d", descriptor = "Ljava/lang/String;")
    public String field3085;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(I)V")
    public static void method1388(int arg0) {
        field3083 = null;
        if (arg0 != 64) {
            field3086 = -56;
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lfb;Z)V")
    public static final void method1389(class675 arg0, boolean arg1) {
        for (int var2 = arg0.field9367; var2 <= arg0.field9361; var2++) {
            for (int var3 = arg0.field9354; var3 <= arg0.field9360; var3++) {
                class701 var4 = class660.field8718[arg0.field3508][var2][var3];
                if (var4 != null) {
                    class10 var5 = var4.field9742;
                    class10 var6 = null;
                    while (var5 != null) {
                        if (var5.field170 == arg0) {
                            if (var6 == null) {
                                var4.field9742 = var5.field174;
                            } else {
                                var6.field174 = var5.field174;
                            }
                            var5.method101(true);
                            break;
                        }
                        var6 = var5;
                        var5 = var5.field174;
                    }
                }
            }
        }
        if (!arg1) {
            class495.method2796(arg0);
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "([[BILaha;)V")
    public static final void method1390(byte[][] arg0, int arg1, class385 arg2) {
        field3084++;
        int var3 = class547.field7235.length;
        if (arg1 > -85) {
            method1388(67);
        }
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg0[var4];
            if (var5 != null) {
                int var6 = (class197.field2972[var4] >> 8) * 64 - class503.field6752;
                int var7 = (class197.field2972[var4] & 0xFF) * 64 - class334.field4757;
                class651.method3552(-25926);
                arg2.method2287(class456.field6226, class341.field4807, 54, var5, var7, var6);
            }
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Z)Z")
    public static final boolean method1391(boolean arg0) {
        field3087++;
        try {
            class554 var1 = new class554();
            byte[] var2 = var1.method3085(class592.field7702, -18);
            class367.method2166(-82, var2);
            if (!arg0) {
                method1389(null, false);
            }
            return true;
        } catch (Exception var3) {
            return false;
        }
    }

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "(I)V")
    public static final void method1392(int arg0) {
        int var1 = 54 / ((83 - arg0) / 35);
        for (class461 var2 = (class461) class496.field6692.method21(2); var2 != null; var2 = (class461) class496.field6692.method9(-127)) {
            if (var2.field6303) {
                var2.method2621(256);
            }
        }
        field3088++;
        for (class461 var3 = (class461) class681.field9519.method21(2); var3 != null; var3 = (class461) class681.field9519.method9(-128)) {
            if (var3.field6303) {
                var3.method2621(256);
            }
        }
    }
}
