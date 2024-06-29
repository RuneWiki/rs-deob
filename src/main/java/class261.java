import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class261 extends Canvas {

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "Ljava/awt/Component;")
    private Component field4165;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field4164 = 0;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4168 = "wishes to trade with you.";

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field4169 = 127;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "Ljava/lang/String;")
    public static String field4172 = "Attack";

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "Log;")
    public static class157 field4166;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "[Lmh;")
    public static class20[] field4167;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lak;ILak;)I", line = 5)
    public static final int method1860(class172 arg0, int arg1, class172 arg2) {
        field4171++;
        int var3 = 0;
        if (arg2.method1276(class39.field504, -70)) {
            var3++;
        }
        int var4 = 54 / ((-arg1 - 13) / 62);
        if (arg2.method1276(class36.field482, -101)) {
            var3++;
        }
        if (arg2.method1276(class97.field1339, 84)) {
            var3++;
        }
        if (arg0.method1276(class39.field504, -116)) {
            var3++;
        }
        if (arg0.method1276(class36.field482, -85)) {
            var3++;
        }
        if (arg0.method1276(class97.field1339, -54)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fc", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 38)
    public final void update(Graphics arg0) {
        this.field4165.update(arg0);
        field4174++;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZLjava/lang/String;)Z", line = 46)
    public static final boolean method1861(boolean arg0, String arg1) {
        field4170++;
        if (!arg0) {
            field4169 = -127;
        }
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class207.field3412; var2++) {
            if (arg1.equalsIgnoreCase(class210.field3450[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIB)I", line = 78)
    public static final int method1862(int arg0, int arg1, int arg2, byte arg3) {
        if (arg0 > 243) {
            arg1 >>= 0x4;
        } else if (arg0 > 217) {
            arg1 >>= 0x3;
        } else if (arg0 > 192) {
            arg1 >>= 0x2;
        } else if (arg0 > 179) {
            arg1 >>= 0x1;
        }
        field4177++;
        int var4 = -88 / ((arg3 - 13) / 51);
        return (arg1 >> 5 << 7) + (arg2 >> 2 << 10) + (arg0 >> 1);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V", line = 109)
    public static void method1863(byte arg0) {
        int var1 = 40 % ((arg0 + 51) / 50);
        field4167 = null;
        field4166 = null;
        field4172 = null;
        field4168 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)Lik;", line = 125)
    public static final class17 method1864(int arg0, int arg1) {
        class17 var2 = (class17) class25.field337.method704((byte) 108, (long) arg0);
        field4176++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class43.field540.method1287(arg0, 32, -1);
        class17 var4 = new class17();
        if (arg1 >= -52) {
            return (class17) null;
        }
        if (var3 != null) {
            var4.method96(-1, new class44(var3));
        }
        var4.method97(-128);
        class25.field337.method703(var4, (long) arg0, (byte) -107);
        return var4;
    }

    @OriginalMember(owner = "client!fc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 152)
    public final void paint(Graphics arg0) {
        this.field4165.paint(arg0);
        field4175++;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 159)
    public class261(Component arg0) {
        this.field4165 = arg0;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)I", line = 173)
    public static final int method1865(int arg0, int arg1, int arg2) {
        field4173++;
        int var3 = -6 % ((-arg0 - 7) / 44);
        int var4 = class122.method883(false, arg2 + 91923, arg1 - -45365, 4) + (class122.method883(false, arg2 + 37821, arg1 + 10294, 2) - 128 >> 1) + (class122.method883(false, arg2, arg1, 1) + -128 >> 2) - 128;
        int var5 = (int) ((double) var4 * 0.3D) + 35;
        if (var5 < 10) {
            var5 = 10;
        } else if (var5 > 60) {
            var5 = 60;
        }
        return var5;
    }
}
