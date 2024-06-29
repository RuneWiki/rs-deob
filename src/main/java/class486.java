import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class486 {

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "Lvg;")
    private class49 field7117 = new class49(256);

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "Lrr;")
    private class332 field7110;

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "Lfa;")
    private class214 field7116;

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "Lsba;")
    public static class200 field7115 = new class200(8);

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "I")
    public static int field7109;

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "I")
    public static int field7111;

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "I")
    public static int field7112;

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "I")
    public static int field7113;

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "I")
    public static int field7114;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIIZ)I", line = 8)
    public static final int method2977(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field7114++;
        int var5 = 65536 - class567.field8138[arg3 * 8192 / arg0] >> 1;
        if (arg4) {
            method2977(16, 62, -34, -102, false);
        }
        return ((65536 - var5) * arg2 >> 16) + (arg1 * var5 >> 16);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)V", line = 27)
    public static void method2978(byte arg0) {
        if (arg0 <= 76) {
            method2978((byte) 72);
        }
        field7115 = null;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)Lmca;", line = 42)
    public final class29 method2979(int arg0, int arg1) {
        field7111++;
        Object var3 = this.field7117.method560(false, (long) arg1);
        if (arg0 != 8893) {
            return null;
        } else if (var3 != null) {
            return (class29) var3;
        } else if (this.field7116.method1608(-20340, arg1)) {
            class258 var4 = this.field7116.method1610(18904, arg1);
            int var5 = var4.field4137 ? 64 : this.field7110.field5354;
            class29 var7;
            if (var4.field4135 && this.field7110.method168()) {
                float[] var6 = this.field7116.method1611(var5, var5, 0.7F, arg1, false, false);
                var7 = this.field7110.method2267(var4.field4127 != 0, var5, class86.field1055, var5, var6, true);
            } else {
                int[] var8 = !var4.field4119 && class290.method2045(arg0 - 22750, var4.field4134) ? this.field7116.method1607(var5, arg1, -20490, true, var5, 0.7F) : this.field7116.method1609(0.7F, false, arg1, (byte) -102, var5, var5);
                var7 = this.field7110.method2243(var8, var5, var4.field4127 != 0, var5, (byte) -20);
            }
            var7.method364(var4.field4124, var4.field4125, (byte) 102);
            this.field7117.method559(var7, (long) arg1, 0);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lr;I)V", line = 82)
    public static final void method2980(class167 arg0, int arg1) {
        field7109++;
        if (class453.field6808) {
            class124.method1100(arg0, (byte) 100);
        } else {
            class310.method2132(arg0, (byte) -11);
        }
        if (arg1 != 679) {
            field7115 = null;
        }
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(B)V", line = 97)
    public final void method2981(byte arg0) {
        field7112++;
        this.field7117.method569(arg0 - 79);
        if (arg0 != 79) {
            this.field7110 = null;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Z)V", line = 108)
    public final void method2982(boolean arg0) {
        if (arg0) {
            this.method2979(101, 96);
        }
        field7113++;
        this.field7117.method573((byte) 119, 5);
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lrr;Lfa;)V", line = 122)
    public class486(class332 arg0, class214 arg1) {
        this.field7110 = arg0;
        this.field7116 = arg1;
    }
}
