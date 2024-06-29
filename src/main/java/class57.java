import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class57 implements class669 {

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "Lmv;")
    private class295 field933;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "Liba;")
    public static class211 field927 = new class211(8, -1);

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "[Loda;")
    public static class654[] field930 = new class654[300];

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "Liba;")
    public static class211 field935 = new class211(60, 5);

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
    public static int field938 = 0;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILnb;)Z", line = 5)
    public static final boolean method355(int arg0, class318 arg1) {
        field934++;
        if (arg0 != 60) {
            field930 = null;
        }
        return class564.field8247 == arg1 || class353.field5240 == arg1 || class448.field6497 == arg1 || class276.field3594 == arg1;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)V", line = 16)
    public static final void method356(boolean arg0) {
        if (arg0) {
            method361(-44);
        }
        field928++;
        if (!class643.method3659(-45)) {
            return;
        }
        if (class69.field1078 == null) {
            class433.method2578((byte) -83);
        }
        class656.field9370 = true;
        class298.field4389 = 0;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lmv;I)V", line = 43)
    public static final void method357(class295 arg0, int arg1) {
        class111.field1638 = arg0.method1819("hitmarks", (byte) 122);
        field936++;
        class702.field9975 = arg0.method1819("hitbar_default", (byte) 101);
        class205.field2789 = arg0.method1819("timerbar_default", (byte) 85);
        class465.field6713 = arg0.method1819("headicons_pk", (byte) 34);
        field937 = arg0.method1819("headicons_prayer", (byte) 103);
        class150.field2129 = arg0.method1819("hint_headicons", (byte) 29);
        class527.field7485 = arg0.method1819("hint_mapmarkers", (byte) 60);
        class489.field6941 = arg0.method1819("mapflag", (byte) 127);
        class297.field4375 = arg0.method1819("cross", (byte) 119);
        class105.field1563 = arg0.method1819("mapdots", (byte) 41);
        if (arg1 != 100) {
            return;
        }
        class684.field9640 = arg0.method1819("scrollbar", (byte) 63);
        class430.field6263 = arg0.method1819("name_icons", (byte) 31);
        class121.field1786 = arg0.method1819("floorshadows", (byte) 47);
        class147.field2093 = arg0.method1819("compass", (byte) 32);
        class574.field8339 = arg0.method1819("otherlevel", (byte) 120);
        class324.field4710 = arg0.method1819("hint_mapedge", (byte) 25);
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(B)Lbl;", line = 69)
    public final class348 method358(byte arg0) {
        field932++;
        return arg0 <= 75 ? null : class348.field5153;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "([[II)V", line = 80)
    public static final void method359(int[][] arg0, int arg1) {
        class565.field8253 = arg0;
        if (arg1 >= -9) {
            method356(false);
        }
        field931++;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)I", line = 96)
    public final int method360(byte arg0) {
        if (arg0 != 84) {
            field935 = null;
        }
        field929++;
        return this.field933.method1847(false) ? 100 : this.field933.method1840(-19396);
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lmv;)V", line = 109)
    public class57(class295 arg0) {
        this.field933 = arg0;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V", line = 124)
    public static void method361(int arg0) {
        field930 = null;
        field935 = null;
        field927 = null;
        int var1 = -65 / ((arg0 - 55) / 44);
    }
}
