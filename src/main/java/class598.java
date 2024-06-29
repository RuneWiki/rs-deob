import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class598 extends class132 {

    @OriginalMember(owner = "client!av", name = "p", descriptor = "I")
    public static int field8020;

    @OriginalMember(owner = "client!av", name = "q", descriptor = "I")
    public static int field8021;

    @OriginalMember(owner = "client!av", name = "r", descriptor = "I")
    public static int field8022;

    @OriginalMember(owner = "client!av", name = "s", descriptor = "I")
    public static int field8023;

    @OriginalMember(owner = "client!av", name = "t", descriptor = "I")
    public static int field8024;

    @OriginalMember(owner = "client!av", name = "u", descriptor = "I")
    public static int field8025;

    @OriginalMember(owner = "client!av", name = "v", descriptor = "I")
    public static int field8026;

    @OriginalMember(owner = "client!av", name = "w", descriptor = "I")
    public int field8027;

    @OriginalMember(owner = "client!av", name = "x", descriptor = "I")
    public static int field8028;

    @OriginalMember(owner = "client!av", name = "z", descriptor = "I")
    public int field8030;

    @OriginalMember(owner = "client!av", name = "A", descriptor = "I")
    public int field8031;

    @OriginalMember(owner = "client!av", name = "y", descriptor = "J")
    public long field8029;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IBILrr;)V")
    public static final void method3296(int arg0, byte arg1, int arg2, class337 arg3) {
        field8020++;
        int var4 = 119 % ((arg1 - 65) / 36);
        class219 var5 = arg3.method1927(class309.field3898, 74);
        if (var5 == null) {
            return;
        }
        class309.field3898.method403(arg0, arg2, arg3.field4309 + arg0, arg2 - -arg3.field4211);
        if (class666.field9038 >= 3) {
            class309.field3898.method426(-16777216, var5, arg0, arg2);
        } else {
            class292.field3710.method2553((float) arg3.field4309 / 2.0F + (float) arg0, (float) arg3.field4211 / 2.0F + (float) arg2, 4096, (int) (-class689.field9561) & 0x3FFF << 2, var5, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(B)I")
    public final int method861(byte arg0) {
        int var2 = -63 % ((-arg0 - 10) / 43);
        field8021++;
        return 0;
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(I)J")
    public final long method854(int arg0) {
        if (arg0 != 32055) {
            this.method854(-101);
        }
        field8024++;
        return this.field8029;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(III)B")
    public static final byte method3297(int arg0, int arg1, int arg2) {
        field8023++;
        if (arg0 == 9) {
            if (arg2 != 2) {
                method3297(98, -29, 114);
            }
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(B)I")
    public final int method855(byte arg0) {
        if (arg0 > -70) {
            return 90;
        } else {
            field8025++;
            return this.field8027;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(I)I")
    public final int method851(int arg0) {
        field8022++;
        if (arg0 != -1160828951) {
            this.method851(65);
        }
        return this.field8031;
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(Z)I")
    public final int method860(boolean arg0) {
        field8028++;
        return arg0 ? this.field8030 : -120;
    }
}
