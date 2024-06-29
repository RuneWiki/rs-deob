import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class680 {

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "Lwp;")
    public static class453 field9559 = new class453(38, 6);

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "J")
    public static long field9562 = 20000000L;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "Lwp;")
    public static class453 field9561 = new class453(82, -2);

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field9564 = new String[100];

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public int field9553;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field9554;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public int field9555;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field9557;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field9558;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static int field9560;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
    public static int field9563;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "[Loc;")
    public class547[] field9556;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Les;B)V", line = 5)
    public final void method3825(class630 arg0, byte arg1) {
        this.field9555 = arg0.method3517(arg1 ^ 0x4F);
        field9554++;
        this.field9553 = arg0.method3470(13111);
        this.field9556 = new class547[arg0.method3501(-9268)];
        class259[] var3 = class252.method1477(true);
        if (arg1 == -80) {
            for (int var4 = 0; var4 < this.field9556.length; var4++) {
                this.field9556[var4] = this.method3826(var3[arg0.method3501(-9268)], class688.method3877(arg1, 30), arg0);
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lwea;ILes;)Loc;", line = 30)
    private final class547 method3826(class259 arg0, int arg1, class630 arg2) {
        field9560++;
        if (class419.field5270 == arg0) {
            return class426.method2262((byte) 121, arg2);
        } else if (class551.field7693 == arg0) {
            return class433.method2280(arg2, (byte) -101);
        } else if (class484.field6425 == arg0) {
            return class564.method3097(arg2, (byte) -117);
        } else if (class1.field8 == arg0) {
            return class480.method2614((byte) 71, arg2);
        } else if (class349.field4462 == arg0) {
            return class590.method3245(arg2, 124);
        } else if (class161.field2130 == arg0) {
            return class105.method591(true, arg2);
        } else if (class531.field7170 == arg0) {
            return class16.method113(arg2, 72);
        } else if (class162.field2133 == arg0) {
            return class572.method3157(1023, arg2);
        } else if (class78.field1069 == arg0) {
            return class366.method2005((byte) 108, arg2);
        } else if (arg1 >= -73) {
            return null;
        } else if (class119.field1525 == arg0) {
            return class133.method766(0, arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)V", line = 79)
    public static final void method3827(int arg0, byte arg1) {
        if (class235.field2946 == 0) {
            class598.field8405.method1314(-118, arg0);
        } else {
            class436.field5443 = arg0;
        }
        field9557++;
        if (arg1 != -119) {
            method3829(44, -53, -114);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V", line = 98)
    public static void method3828(int arg0) {
        field9559 = null;
        field9561 = null;
        if (arg0 != 65536) {
            method3828(-54);
        }
        field9564 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)Z", line = 110)
    public static final boolean method3829(int arg0, int arg1, int arg2) {
        field9558++;
        int var3 = -58 / ((arg1 + 45) / 59);
        return (arg2 & 0x10000) != 0;
    }
}
