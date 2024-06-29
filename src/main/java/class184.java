import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class184 extends class399 {

    @OriginalMember(owner = "client!vu", name = "h", descriptor = "I")
    public int field2263;

    @OriginalMember(owner = "client!vu", name = "i", descriptor = "I")
    public int field2264;

    @OriginalMember(owner = "client!vu", name = "j", descriptor = "I")
    public int field2265;

    @OriginalMember(owner = "client!vu", name = "k", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!vu", name = "l", descriptor = "I")
    public int field2267;

    @OriginalMember(owner = "client!vu", name = "n", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!vu", name = "m", descriptor = "Lrq;")
    public class39 field2268;

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(I)V", line = 8)
    public static final void method1186(int arg0) {
        field2266++;
        int var1 = 76 / ((arg0 + 20) / 46);
        if (class243.field3275 == 6) {
            class243.field3275 = 7;
        }
    }

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "(I)V", line = 24)
    public static final void method1187(int arg0) {
        field2269++;
        if (class429.field5954 == 1 || class429.field5954 == 3 || class429.field5954 != class258.field3579 && (class429.field5954 == 0 || class258.field3579 == 0)) {
            class306.field4106 = 0;
            class327.field4786 = 0;
            class77.field955.method2510(-1);
        }
        class258.field3579 = class429.field5954;
        if (arg0 <= 21) {
            method1186(-22);
        }
    }
}
