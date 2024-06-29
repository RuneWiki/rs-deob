import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class302 extends class766 {

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "I")
    public static int field4342 = 0;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "Lvb;")
    public static class396 field4339 = new class396(5, 3);

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "Z")
    public static boolean field4344 = false;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
    public int field4336;

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "I")
    public int field4338;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!vi", name = "y", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "Lkja;")
    public class373 field4341;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "Lsv;")
    public class570 field4332;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1877(int arg0) {
        field4334++;
        if (class336.field4775.field1585 && class74.field1142.field5598 != -1) {
            class293.method1857(class74.field1142.field5598, class74.field1142.field5595, arg0 ^ 0x7);
        }
        if (arg0 != 5) {
            field4342 = 15;
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)V", line = 23)
    public final void method1878(int arg0) {
        field4343++;
        if (arg0 < 1) {
            field4344 = false;
        }
        if (class754.field10491.length > class7.field94) {
            class754.field10491[class7.field94++] = this;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZI)V", line = 39)
    public static final void method1879(boolean arg0, int arg1) {
        if (arg1 != 5117) {
            field4344 = false;
        }
        class775.field10665.method1552(class390.field5440.method489());
        field4337++;
        int[] var2 = class390.field5440.method459();
        class646.field9185 = var2[0];
        class445.field6155 = var2[2];
        class510.field7014 = var2[3];
        class641.field9023 = var2[1];
        if (arg0) {
            class390.field5440.method449(class522.field7315, class790.field10803, class758.field10509, class484.field6680);
            class63.method639(class355.field5025, (byte) -91);
        } else {
            class390.field5440.method449(class696.field9789, class125.field2132, class209.field3072, class343.field4883);
            class63.method639(class398.field5490, (byte) -90);
        }
    }

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "(I)V", line = 70)
    public static void method1880(int arg0) {
        field4339 = null;
        if (arg0 != 0) {
            method1877(-75);
        }
    }

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "(I)V", line = 84)
    public static final void method1881(int arg0) {
        class321.field4568.method516(((float) class420.field5820.field9467.method1145(17539) * 0.1F + 0.7F) * class397.field5482);
        if (arg0 != -24878) {
            method1877(8);
        }
        field4335++;
        class321.field4568.method517(class379.field5319, class33.field405, class762.field10564, (float) (class703.field9855 << 2), (float) (class78.field1171 << 2), (float) (class775.field10666 << 2));
        class321.field4568.method458(class163.field2506);
    }
}
