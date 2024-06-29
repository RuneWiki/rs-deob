import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class270 {

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
    public int field4335 = 8;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public int field4327 = 16777215;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
    public static int field4337 = 0;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "Lal;")
    public static class52 field4326 = new class52(64);

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "Z")
    public static boolean field4340 = false;

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "I")
    public static int field4341 = -1;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public int field4325;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public int field4328;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public int field4330;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public int field4332;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public int field4333;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "Z")
    public boolean field4336;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "[I")
    public static int[] field4339;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V", line = 11)
    public static final void method1828(int arg0) {
        class413.field6116 = -1;
        field4331++;
        class132.field2062 = -1;
        if (arg0 != 5) {
            field4340 = true;
        }
        class193.field3143 = 0;
        class19.field254 = -1;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V", line = 26)
    public static final void method1829(int arg0) {
        field4338++;
        if (class375.field5656 < 0) {
            class375.field5656 = 0;
            class80.field1002 = -1;
            class196.field3184 = -1;
        }
        if (class400.field5981 < class375.field5656) {
            class375.field5656 = class400.field5981;
            class196.field3184 = -1;
            class80.field1002 = -1;
        }
        if (class144.field2270 < arg0) {
            class80.field1002 = -1;
            class196.field3184 = -1;
            class144.field2270 = 0;
        }
        if (class144.field2270 > class400.field5967) {
            class196.field3184 = -1;
            class80.field1002 = -1;
            class144.field2270 = class400.field5967;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V", line = 74)
    public static void method1830(byte arg0) {
        if (arg0 < 66) {
            field4326 = null;
        }
        field4339 = null;
        field4326 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Ljg;IB)V", line = 86)
    public final void method1831(class186 arg0, int arg1, byte arg2) {
        if (arg2 != -116) {
            this.method1832(59, -35, (class186) null, 116);
        }
        field4334++;
        while (true) {
            int var4 = arg0.method1322(false);
            if (var4 == 0) {
                return;
            }
            this.method1832(arg1, var4, arg0, -127);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IILjg;I)V", line = 119)
    private final void method1832(int arg0, int arg1, class186 arg2, int arg3) {
        if (arg1 == 1) {
            this.field4335 = arg2.method1272((byte) -96);
        } else if (arg1 == 2) {
            this.field4336 = true;
        } else if (arg1 == 3) {
            this.field4328 = arg2.method1276((byte) 91);
            this.field4330 = arg2.method1276((byte) -108);
            this.field4333 = arg2.method1276((byte) -48);
        } else if (arg1 == 4) {
            this.field4325 = arg2.method1322(false);
        } else if (arg1 == 5) {
            this.field4332 = arg2.method1272((byte) -78);
        } else if (arg1 == 6) {
            this.field4327 = arg2.method1275(-1);
        }
        field4329++;
        if (arg3 >= -120) {
            this.method1831((class186) null, -26, (byte) -43);
        }
    }
}
