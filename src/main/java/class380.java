import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class380 {

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "Lbi;")
    public static class104 field5838 = new class104(27, 8);

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "[I")
    public static int[] field5842 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field5839;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "Ll;")
    public static class199 field5841;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "Lgi;")
    public static class437 field5840;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILmn;)V")
    public static final void method2455(int arg0, class162 arg1) {
        field5839++;
        class136.field1872 = arg1.method1014(true, "p11_full");
        class68.field1040 = arg1.method1014(true, "p12_full");
        class164.field2376 = arg1.method1014(true, "b12_full");
        class192.field2850 = arg1.method1014(true, "hitmarks");
        class183.field2655 = arg1.method1014(true, "hitbar_default");
        class454.field7030 = arg1.method1014(true, "timerbar_default");
        class109.field1559 = arg1.method1014(true, "headicons_pk");
        class254.field4116 = arg1.method1014(true, "headicons_prayer");
        class464.field7129 = arg1.method1014(true, "hint_headicons");
        class363.field5612 = arg1.method1014(true, "hint_mapmarkers");
        class275.field4366 = arg1.method1014(true, "mapflag");
        class437.field6753 = arg1.method1014(true, "cross");
        class32.field330 = arg1.method1014(true, "mapdots");
        class538.field7879 = arg1.method1014(true, "scrollbar");
        class402.field6056 = arg1.method1014(true, "name_icons");
        class229.field3809 = arg1.method1014(true, "floorshadows");
        if (arg0 <= 123) {
            method2455(-53, null);
        }
        class4.field50 = arg1.method1014(true, "compass");
        class254.field4117 = arg1.method1014(true, "otherlevel");
        class80.field1189 = arg1.method1014(true, "hint_mapedge");
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public static void method2456(int arg0) {
        field5840 = null;
        if (arg0 == 44) {
            field5841 = null;
            field5842 = null;
            field5838 = null;
        }
    }
}
