import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class59 extends class213 {

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "Loc;")
    public class348 field750;

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "I")
    public static int field753 = 0;

    @OriginalMember(owner = "client!bb", name = "F", descriptor = "Ljava/lang/String;")
    public static String field755 = "Take";

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!bb", name = "B", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!bb", name = "E", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!bb", name = "G", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!bb", name = "H", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!bb", name = "I", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!bb", name = "J", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)V", line = 4)
    public static void method441(int arg0) {
        field755 = null;
        if (arg0 != 0) {
            method444((int[]) null, (byte) -112, (Object[]) null);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)V", line = 16)
    public static final void method442(int arg0, int arg1) {
        field751++;
        if (!class140.method1081(-115, arg1)) {
            return;
        }
        int var2 = 9 / ((53 - arg0) / 55);
        class333[] var3 = class26.field308[arg1];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class333 var5 = var3[var4];
            if (var5 != null) {
                var5.field5218 = 1;
                var5.field5054 = 0;
                var5.field5074 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lfh;I)V", line = 55)
    public static final void method443(class140 arg0, int arg1) {
        field756++;
        class75.field989 = arg0;
        if (arg1 != 40) {
            method441(-18);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "([IB[Ljava/lang/Object;)V", line = 71)
    public static final void method444(int[] arg0, byte arg1, Object[] arg2) {
        class44.method315(arg0.length - 1, arg2, 0, -118, arg0);
        if (arg1 > 93) {
            field752++;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IB)V", line = 87)
    public static final void method445(int arg0, byte arg1) {
        field757++;
        if (class316.field4661 == arg0) {
            return;
        }
        if (class316.field4661 == 0) {
            class205.method1490((byte) -119);
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (arg1 < 70) {
            method444((int[]) null, (byte) -5, (Object[]) null);
        }
        if (arg0 == 40) {
            class345.method2394((byte) -120);
        }
        if (arg0 != 40 && class339.field5290 != null) {
            class339.field5290.method526(-19055);
            class339.field5290 = null;
        }
        if (arg0 == 25 || arg0 == 28) {
            class191.field2648 = 0;
            class225.field3243 = 1;
            class152.field2137 = 0;
            class338.field5267 = 1;
            class355.field5564 = 0;
            class40.method281(true, (byte) -93);
        }
        if (arg0 == 25 || arg0 == 10) {
            class268.method1830(18);
        }
        if (arg0 == 5) {
            class52.method400(111, class1.field7);
        } else {
            class340.method2363(256);
        }
        boolean var3 = class316.field4661 == 5 || class316.field4661 == 10 || class316.field4661 == 28;
        if (var3 != var2) {
            if (var2) {
                class84.field1082 = class158.field2254;
                if (class101.field1319 == 0) {
                    class67.method489(5, 2);
                } else {
                    class206.method1496(0, class305.field4459, 2, (byte) -127, 255, class158.field2254, false);
                }
                class85.field1092.method22((byte) 124, false);
            } else {
                class67.method489(5, 2);
                class85.field1092.method22((byte) 122, true);
            }
        }
        if (class47.field623 && (arg0 == 25 || arg0 == 28 || arg0 == 40)) {
            class47.method365();
        }
        class316.field4661 = arg0;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Loc;)V", line = 165)
    public class59(class348 arg0) {
        this.field750 = arg0;
    }
}
