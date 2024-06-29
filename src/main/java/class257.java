import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public class class257 extends class184 {

    @OriginalMember(owner = "client!fga", name = "p", descriptor = "I")
    public volatile int field3689 = -1;

    @OriginalMember(owner = "client!fga", name = "n", descriptor = "Ljava/lang/String;")
    public volatile String field3687;

    @OriginalMember(owner = "client!fga", name = "o", descriptor = "Loi;")
    public static class73 field3688 = new class73("", 17);

    @OriginalMember(owner = "client!fga", name = "m", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!fga", name = "r", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!fga", name = "s", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!fga", name = "q", descriptor = "Ltfa;")
    public static class34 field3690;

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lvd;I)V", line = 4)
    public static final void method1680(class39 arg0, int arg1) {
        field3686++;
        class520.field7450 = arg0.method217("hitmarks", (byte) -93);
        class196.field2978 = arg0.method217("hitbar_default", (byte) -93);
        class738.field10353 = arg0.method217("timerbar_default", (byte) -93);
        class456.field6714 = arg0.method217("headicons_pk", (byte) -93);
        class249.field3615 = arg0.method217("headicons_prayer", (byte) -93);
        class548.field7821 = arg0.method217("hint_headicons", (byte) -93);
        class177.field2749 = arg0.method217("hint_mapmarkers", (byte) -93);
        class438.field6497 = arg0.method217("mapflag", (byte) -93);
        class473.field6890 = arg0.method217("cross", (byte) -93);
        class703.field9806 = arg0.method217("mapdots", (byte) -93);
        class405.field6101 = arg0.method217("scrollbar", (byte) -93);
        class93.field1340 = arg0.method217("name_icons", (byte) -93);
        class664.field9311 = arg0.method217("floorshadows", (byte) -93);
        class210.field3082 = arg0.method217("compass", (byte) -93);
        class754.field10539 = arg0.method217("otherlevel", (byte) -93);
        if (arg1 > -109) {
            method1681((byte) 87, -36);
        }
        class233.field3395 = arg0.method217("hint_mapedge", (byte) -93);
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(BI)I", line = 34)
    public static final int method1681(byte arg0, int arg1) {
        field3691++;
        int var2 = 64 % ((-arg0 - 3) / 36);
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(I)V", line = 50)
    public static void method1682(int arg0) {
        field3690 = null;
        field3688 = null;
        if (arg0 != -1) {
            method1682(38);
        }
    }

    @OriginalMember(owner = "client!fga", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 63)
    public class257(String arg0) {
        this.field3687 = arg0;
    }
}
