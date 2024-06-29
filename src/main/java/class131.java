import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class131 {

    @OriginalMember(owner = "client!me", name = "i", descriptor = "Lug;")
    private class395 field1724;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "J")
    public long field1719;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    public static int field1723 = -1;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "Lcp;")
    public static class511 field1725 = new class511();

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V", line = 10)
    public static final void method915(int arg0) {
        class40.field511.method2777(class183.field2402.method479(arg0 + 88), -11);
        field1721++;
        class40.field511.method2777(class280.field3547.method479(-80), -11);
        class40.field511.method2777(class404.field5750.method479(109), -11);
        if (arg0 != -4) {
            return;
        }
        class40.field511.method2777(class191.field2483.method479(-111), -11);
        class40.field511.method2777(class492.field7163.method479(-109), -11);
        class40.field511.method2777(class351.field4507.method479(arg0 + 91), arg0 ^ 0x9);
        class40.field511.method2777(class530.field7806.method479(arg0 ^ 0xFFFFFF83), arg0 - 7);
        class40.field511.method2777(class483.field7068.method479(84), -11);
        class40.field511.method2777(class448.field6413.method479(100), -11);
        class40.field511.method2777(class303.field3891.method479(86), -11);
        class40.field511.method2777(class347.field4456.method479(arg0 ^ 0xFFFFFFA3), -11);
        class40.field511.method2777(class288.field3675.method479(arg0 ^ 0xFFFFFFB0), -11);
        class40.field511.method2777(class379.field4982.method479(107), -11);
        class40.field511.method2777(class511.field7421.method479(69), -11);
        class40.field511.method2777(class473.field6858.method479(-77), -11);
        class40.field511.method2777(class426.field6049.method479(-119), arg0 - 7);
        class40.field511.method2777(class470.field6830.method479(56), -11);
        class40.field511.method2777(class84.field1055.method479(arg0 + 126), arg0 ^ 0x9);
        class40.field511.method2777(class233.field2984.method479(75), arg0 ^ 0x9);
        class40.field511.method2777(class8.field76.method479(-108), -11);
        class40.field511.method2777(class3.field29.method479(-75), arg0 ^ 0x9);
        class40.field511.method2777(class126.field1687.method479(-81), arg0 - 7);
        class40.field511.method2777(class395.field5425.method479(88), -11);
        class40.field511.method2777(class231.field2945.method479(105), -11);
        class40.field511.method2777(class390.field5243.method479(arg0 ^ 0x38), -11);
        class40.field511.method2777(class17.field259.method479(-100), -11);
        class40.field511.method2777(class354.field4558.method479(63), arg0 ^ 0x9);
        class40.field511.method2777(class123.field1655.method479(arg0 ^ 0x5B), -11);
        class40.field511.method2777(class264.field3330.method479(arg0 + 68), -11);
        class40.field511.method2777(class42.field515.method479(-124), -11);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)V", line = 51)
    public static final void method916(int arg0, byte arg1) {
        class500.field7237 = 1000 / arg0;
        if (arg1 != -60) {
            method916(75, (byte) 26);
        }
        field1717++;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V", line = 65)
    public static void method917(int arg0) {
        int var1 = -30 % ((-arg0 - 76) / 41);
        field1725 = null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BLrd;IBI)V", line = 79)
    public static final void method918(byte arg0, class223 arg1, int arg2, byte arg3, int arg4) {
        field1716++;
        int var5 = arg1.field4944[0];
        int var6 = arg1.field4936[0];
        if (var5 < 0 || var5 >= class452.field6526 || var6 < 0 || var6 >= class440.field6307 || arg4 < 0 || class452.field6526 <= arg4 || arg2 < 0 || arg2 >= class440.field6307) {
            return;
        }
        int var7 = class160.method1034(class382.field5038, var6, -4, 0, 0, arg1.method1366((byte) -91), (byte) 72, class172.field2185[arg1.field2676], 0, true, arg2, var5, arg4, class439.field6296, 0);
        if (var7 < 1 || var7 > 3) {
            return;
        }
        for (int var8 = 0; var8 < (var7 - 1); var8++) {
            arg1.method1354(class439.field6296[var8], arg0, (byte) -3, class382.field5038[var8]);
        }
        if (arg3 != -30) {
            method918((byte) 101, null, 35, (byte) 70, -36);
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lug;J[Lsl;)V", line = 117)
    public class131(class395 arg0, long arg1, class320[] arg2) {
        this.field1724 = arg0;
        this.field1719 = arg1;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 128)
    public static final void method919(String arg0, boolean arg1) {
        field1722++;
        if (!arg0.equals("")) {
            class446.field6393++;
            class282.method1669(class512.field7429, arg1);
            class40.field511.method2729(class463.method2733(-118, arg0), false);
            class40.field511.method2769(arg0, true);
        }
    }

    @OriginalMember(owner = "client!me", name = "finalize", descriptor = "()V", line = 142)
    protected final void finalize() throws Throwable {
        this.field1724.method2320(this.field1719, (byte) -115);
        field1718++;
        super.finalize();
    }
}
