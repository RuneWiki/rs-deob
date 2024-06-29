import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class30 extends class270 {

    @OriginalMember(owner = "client!cl", name = "Z", descriptor = "Lmh;")
    public static class62 field412 = class201.method1405(true, "showingVideoAd");

    @OriginalMember(owner = "client!cl", name = "V", descriptor = "I")
    public static int field408 = 0;

    @OriginalMember(owner = "client!cl", name = "db", descriptor = "Lmh;")
    public static class62 field416 = class201.method1405(true, "lila:");

    @OriginalMember(owner = "client!cl", name = "eb", descriptor = "I")
    public static int field417 = 0;

    @OriginalMember(owner = "client!cl", name = "Y", descriptor = "[I")
    public static int[] field411 = new int[5];

    @OriginalMember(owner = "client!cl", name = "S", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!cl", name = "T", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!cl", name = "U", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!cl", name = "W", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!cl", name = "X", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!cl", name = "ab", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!cl", name = "bb", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!cl", name = "cb", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!cl", name = "fb", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "(B)V", line = 14)
    public static final void method194(byte arg0) {
        if (class81.field1345 != null) {
            class263 var1 = class81.field1345;
            synchronized (class81.field1345) {
                class81.field1345 = null;
            }
        }
        field407++;
        if (arg0 != -70) {
            method198((class26) null, false, (class26) null);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILhi;II)[Lkb;", line = 34)
    public static final class82[] method195(int arg0, class26 arg1, int arg2, int arg3) {
        field415++;
        if (class127.method951(arg1, arg0, 114, arg3)) {
            if (arg2 < 113) {
                method200((class92) null, true, (class62) null);
            }
            return class271.method1860(90);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)[I", line = 49)
    public final int[] method6(int arg0, int arg1) {
        if (arg0 == 18693) {
            field405++;
            return class283.field4840;
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)I", line = 60)
    public static final int method196(boolean arg0) {
        field406++;
        if (!arg0) {
            method194((byte) -95);
        }
        return 16;
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(II)V", line = 71)
    public static final void method197(int arg0, int arg1) {
        class270.field4575.method1390(arg1, -56);
        int var2 = 120 % ((-arg0 - 32) / 58);
        field413++;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lhi;ZLhi;)V", line = 90)
    public static final void method198(class26 arg0, boolean arg1, class26 arg2) {
        field409++;
        class125.field2097 = class70.method510(class52.field739, arg2, 0, true, arg0);
        class169.field2748 = class2.method7(38, arg2, class52.field739, 0, arg0);
        class20.field195 = class70.method510(class304.field5232, arg2, 0, true, arg0);
        class296.field5047 = class70.method510(class156.field2508, arg2, 0, true, arg0);
        if (arg1) {
            field417 = -87;
        }
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V", line = 108)
    public class30() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "(B)V", line = 118)
    public static void method199(byte arg0) {
        field412 = null;
        field411 = null;
        field416 = null;
        int var1 = -113 / ((59 - arg0) / 52);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lmi;ZLmh;)I", line = 139)
    public static final int method200(class92 arg0, boolean arg1, class62 arg2) {
        field410++;
        int var3 = arg0.field1476;
        arg0.method750(arg2.field893, (byte) 118);
        if (arg1) {
            arg0.field1476 += class261.field4390.method293(arg2.field906, arg0.field1495, 0, -22228, arg0.field1476, arg2.field893);
            return arg0.field1476 - var3;
        } else {
            return 68;
        }
    }
}
