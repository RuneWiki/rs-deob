import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class132 extends class64 {

    @OriginalMember(owner = "client!of", name = "bb", descriptor = "Lsg;")
    public static class169 field2443 = class165.method1060("Weiter", 1536);

    @OriginalMember(owner = "client!of", name = "ib", descriptor = "Lsg;")
    private static class169 field2450 = class165.method1060("Service unavailable)3", 1536);

    @OriginalMember(owner = "client!of", name = "lb", descriptor = "Lsg;")
    private static class169 field2453 = class165.method1060("Loading sprites )2 ", 1536);

    @OriginalMember(owner = "client!of", name = "cb", descriptor = "Lsg;")
    public static class169 field2444 = field2453;

    @OriginalMember(owner = "client!of", name = "gb", descriptor = "Lsg;")
    private static class169 field2448 = class165.method1060("This world is full)3", 1536);

    @OriginalMember(owner = "client!of", name = "jb", descriptor = "Lsg;")
    public static class169 field2451 = field2448;

    @OriginalMember(owner = "client!of", name = "mb", descriptor = "Lsg;")
    public static class169 field2454 = field2450;

    @OriginalMember(owner = "client!of", name = "db", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!of", name = "eb", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!of", name = "fb", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!of", name = "hb", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!of", name = "kb", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "(I)V")
    public static void method860(int arg0) {
        if (arg0 != 30388) {
            field2451 = null;
        }
        field2448 = null;
        field2450 = null;
        field2453 = null;
        field2443 = null;
        field2454 = null;
        field2451 = null;
        field2444 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IBI)V")
    public static final void method861(int arg0, byte arg1, int arg2) {
        ++class102.field1871;
        ++field2445;
        class141.field2621.method1024(74, (byte) -94);
        class141.field2621.method801(arg0, (byte) 87);
        if (arg1 <= 47) {
            field2451 = null;
        }
        class141.field2621.method789(-373, arg2);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method862(Component arg0, int arg1) {
        ++field2446;
        arg0.removeKeyListener(class142.field2654);
        arg0.removeFocusListener(class142.field2654);
        int var2 = -116 % ((50 - arg1) / 35);
        class69.field1294 = -1;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
    public static final void method863(byte arg0) {
        ++field2447;
        if (~class70.field1320 < -1) {
            class151.method999(-27);
        } else {
            class140.method933((byte) 16, 40);
            class1.field25 = class2.field37;
            class2.field37 = null;
            if (arg0 > -126) {
                field2454 = null;
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
    public class132() {
        super(0, true);
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(IBI)I")
    private final int method864(int arg0, byte arg1, int arg2) {
        ++field2452;
        int var4 = arg0 * 57 + arg2;
        int var5 = var4 << 1 ^ var4;
        if (arg1 != -118) {
            method863((byte) 70);
        }
        return -((Integer.MAX_VALUE & (var5 * var5 * 15731 - -789221) * var5 + 1376312589) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IB)[I")
    public final int[] method16(int arg0, byte arg1) {
        if (arg1 != 19) {
            method862((Component) null, -4);
        }
        ++field2449;
        int[] var3 = super.field1192.method19((byte) 125, arg0);
        if (super.field1192.field75) {
            int var4 = class189.field3699[arg0];
            for (int var5 = 0; ~class147.field2715 < ~var5; ++var5) {
                var3[var5] = this.method864(var4, (byte) -118, class185.field3607[var5]) % 4096;
            }
        }
        return var3;
    }
}
