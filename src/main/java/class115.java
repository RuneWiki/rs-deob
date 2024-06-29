import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rja")
public class class115 extends class291 {

    @OriginalMember(owner = "client!rja", name = "i", descriptor = "I")
    public static int field1449 = 0;

    @OriginalMember(owner = "client!rja", name = "g", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!rja", name = "j", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!rja", name = "k", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!rja", name = "h", descriptor = "Lkj;")
    public static class590 field1448;

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(B)V", line = 8)
    public static void method815(byte arg0) {
        if (arg0 < 111) {
            field1449 = 68;
        }
        field1448 = null;
    }

    @OriginalMember(owner = "client!rja", name = "b", descriptor = "(I)V", line = 21)
    public static final void method816(int arg0) {
        if (arg0 == 0) {
            if (class622.field8775 == 2) {
                class468.field6693[0].method2669(class137.field1790[0]);
                class468.field6693[1].method2669(class137.field1790[1]);
            } else if (class622.field8775 == 3) {
                class468.field6693[0].method2669(class137.field1790[0]);
                class468.field6693[1].method2669(class137.field1790[1]);
                class468.field6693[2].method2669(class137.field1790[2]);
            } else {
                class468.field6693[0].method2669(class137.field1790[0]);
                class468.field6693[1].method2669(class137.field1790[1]);
                class468.field6693[2].method2669(class137.field1790[2]);
                class468.field6693[3].method2669(class137.field1790[3]);
            }
        } else if (arg0 == 1) {
            if (class622.field8775 == 2) {
                class468.field6693[0].method2669(class137.field1790[2]);
            } else if (class622.field8775 == 3) {
                class468.field6693[0].method2669(class137.field1790[3]);
                class468.field6693[1].method2669(class137.field1790[4]);
            } else {
                class468.field6693[0].method2669(class137.field1790[4]);
                class468.field6693[1].method2669(class137.field1790[5]);
                class468.field6693[2].method2669(class137.field1790[6]);
            }
        } else if (arg0 == 2) {
            if (class622.field8775 == 2) {
                class468.field6693[0].method2669(class137.field1790[3]);
                return;
            }
            if (class622.field8775 == 3) {
                class468.field6693[0].method2669(class137.field1790[5]);
                return;
            }
            class468.field6693[0].method2669(class137.field1790[7]);
        }
    }

    @OriginalMember(owner = "client!rja", name = "a", descriptor = "(IIILev;Lev;)V", line = 92)
    public static final void method817(int arg0, int arg1, int arg2, class719 arg3, class719 arg4) {
        class379 var5 = class386.method2357(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field5439 = arg3;
        var5.field5430 = arg4;
        int var6 = class622.field8777 == class311.field4628 ? 1 : 0;
        if (!arg3.method254((byte) 104)) {
            arg3.field7714 = class511.field7305[var6];
            class511.field7305[var6] = arg3;
        } else if (arg3.method248((byte) -55)) {
            arg3.field7714 = class110.field1365[var6];
            class110.field1365[var6] = arg3;
        } else {
            arg3.field7714 = class472.field6734[var6];
            class472.field6734[var6] = arg3;
            class432.field6151 = true;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method254((byte) 104)) {
            if (arg4.method248((byte) -55)) {
                arg4.field7714 = class110.field1365[var6];
                class110.field1365[var6] = arg4;
                return;
            }
            arg4.field7714 = class472.field6734[var6];
            class472.field6734[var6] = arg4;
            class432.field6151 = true;
            return;
        }
        arg4.field7714 = class511.field7305[var6];
        class511.field7305[var6] = arg4;
    }
}
