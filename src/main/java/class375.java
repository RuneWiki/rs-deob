import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class375 {

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "Leh;")
    public static class246 field5325 = new class246(109, -1);

    @OriginalMember(owner = "client!pt", name = "g", descriptor = "[[I")
    public static int[][] field5331 = new int[6][];

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "I")
    public static int field5326;

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!pt", name = "f", descriptor = "I")
    public static int field5330;

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "Lc;")
    public static class125 field5329;

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "Lza;")
    public static class290 field5328;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(BII)Z", line = 4)
    public static final boolean method2190(byte arg0, int arg1, int arg2) {
        if (arg0 == 84) {
            field5330++;
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILoi;)V", line = 22)
    public static final void method2191(int arg0, class53 arg1) {
        class340.field4929 = arg1.method429("p11_full", -1);
        field5327++;
        class168.field2455 = arg1.method429("p12_full", arg0 ^ 0xFFFFFF92);
        class483.field6731 = arg1.method429("b12_full", -1);
        class27.field326 = arg1.method429("hitmarks", arg0 - 110);
        class528.field7748 = arg1.method429("hitbar_default", -1);
        class309.field4511 = arg1.method429("timerbar_default", arg0 - 110);
        class417.field5875 = arg1.method429("headicons_pk", -1);
        if (arg0 != 109) {
            return;
        }
        class461.field6448 = arg1.method429("headicons_prayer", -1);
        class231.field3399 = arg1.method429("hint_headicons", -1);
        class514.field7589 = arg1.method429("hint_mapmarkers", -1);
        class227.field3260 = arg1.method429("mapflag", -1);
        class532.field7808 = arg1.method429("cross", -1);
        class100.field1334 = arg1.method429("mapdots", -1);
        class63.field791 = arg1.method429("scrollbar", -1);
        class430.field6067 = arg1.method429("name_icons", -1);
        class355.field5085 = arg1.method429("floorshadows", -1);
        class327.field4769 = arg1.method429("compass", -1);
        class213.field3078 = arg1.method429("otherlevel", arg0 ^ 0xFFFFFF92);
        class494.field6987 = arg1.method429("hint_mapedge", arg0 - 110);
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V", line = 52)
    public static void method2192(int arg0) {
        field5331 = null;
        field5325 = null;
        field5328 = null;
        if (arg0 >= 119) {
            field5329 = null;
        }
    }
}
