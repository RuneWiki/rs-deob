import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class2 extends class171 {

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "I")
    public int field11;

    @OriginalMember(owner = "client!pa", name = "u", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!pa", name = "v", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "I")
    public int field8;

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "I")
    public int field9;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)V", line = 9)
    public static final void method5(int arg0) {
        field10++;
        if (arg0 == 100) {
            class296.field5035.method791(8);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZIII)V", line = 32)
    public static final void method6(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (class63.field1093 == 1) {
            class21.field406[class74.field1207 / 100].method47(class161.field2737 - 8, class260.field4328 + -8);
        }
        if (!arg1) {
            return;
        }
        if (class63.field1093 == 2) {
            class21.field406[class74.field1207 / 100 + 4].method47(class161.field2737 - 8, class260.field4328 - 8);
        }
        class277.method2014(92);
        field13++;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(II)V", line = 53)
    public static final void method7(int arg0, int arg1) {
        class306.field5228 = -1;
        if (arg0 == 100) {
            class138.field2299 = -1;
            field12++;
            class148.field2508 = arg1;
            class95.method649((byte) -125);
        }
    }
}
