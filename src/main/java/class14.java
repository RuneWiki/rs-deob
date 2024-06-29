import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class14 extends class145 {

    @OriginalMember(owner = "client!mf", name = "F", descriptor = "Ljava/lang/String;")
    public static String field105 = "glow1:";

    @OriginalMember(owner = "client!mf", name = "G", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!mf", name = "H", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!mf", name = "I", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!mf", name = "J", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!mf", name = "K", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!mf", name = "L", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!mf", name = "M", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(III)I", line = 4)
    private final int method67(int arg0, int arg1, int arg2) {
        int var4 = 48 / ((40 - arg2) / 36);
        ++field111;
        int var5 = arg0 * 57 + arg1;
        int var6 = var5 ^ var5 << 1;
        return -(((var6 * 15731 * var6 - -789221) * var6 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V", line = 20)
    public class14() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 26)
    public static final void method68(byte arg0, Component arg1) {
        arg1.removeKeyListener(class446.field6419);
        ++field106;
        if (arg0 > -7) {
            method69((class427) null, -31, (class20) null, (class427) null);
        }
        arg1.removeFocusListener(class446.field6419);
        class151.field2324 = -1;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lrk;ILlg;Lrk;)V", line = 43)
    public static final void method69(class427 arg0, int arg1, class20 arg2, class427 arg3) {
        if (arg1 != 1) {
            method69((class427) null, 112, (class20) null, (class427) null);
        }
        ++field109;
        class126.field1765 = arg0;
        class266.field3581 = arg3;
        class440.field6315 = arg2;
        if (class266.field3581 != null) {
            class179.field2634 = class266.field3581.method2626(1, 13);
        }
        if (class126.field1765 != null) {
            class330.field4498 = class126.field1765.method2626(1, 30);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)[I", line = 65)
    public final int[] method3(int arg0, int arg1) {
        ++field112;
        int var3 = 112 / ((16 - arg1) / 49);
        int[] var4 = super.field2218.method1614(95, arg0);
        if (super.field2218.field3396) {
            int var5 = class134.field1902[arg0];
            for (int var6 = 0; ~class156.field2364 < ~var6; ++var6) {
                var4[var6] = this.method67(var5, class229.field3181[var6], 118) % 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BLjava/lang/String;)J", line = 102)
    public static final long method70(byte arg0, String arg1) {
        ++field110;
        if (arg0 < 40) {
            field107 = 43;
        }
        long var2 = 0L;
        int var4 = arg1.length();
        for (int var5 = 0; ~var5 > ~var4; ++var5) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 + -65);
            } else if (var6 >= 'a' && ~var6 >= -123) {
                var2 += (long) (var6 + -97 + 1);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + -48 + 27);
            }
            if (~var2 <= -177917621779460414L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "(B)V", line = 146)
    public static void method71(byte arg0) {
        field105 = null;
        int var1 = 64 / ((36 - arg0) / 47);
    }
}
