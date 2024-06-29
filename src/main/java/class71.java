import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class71 extends class626 {

    @OriginalMember(owner = "client!naa", name = "h", descriptor = "I")
    public volatile int field1275 = -1;

    @OriginalMember(owner = "client!naa", name = "i", descriptor = "Ljava/lang/String;")
    public volatile String field1276;

    @OriginalMember(owner = "client!naa", name = "j", descriptor = "Lqaa;")
    public static class27 field1277 = new class27(84, -1);

    @OriginalMember(owner = "client!naa", name = "l", descriptor = "Lqe;")
    public static class465 field1279 = new class465(89, 10);

    @OriginalMember(owner = "client!naa", name = "k", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(Leq;I)V", line = 3)
    public static final void method730(class209 arg0, int arg1) {
        field1278++;
        class25.field363 = arg0.method1482(-1, "hitmarks");
        class281.field4005 = arg0.method1482(arg1, "hitbar_default");
        class121.field1874 = arg0.method1482(-1, "timerbar_default");
        class623.field8969 = arg0.method1482(arg1, "headicons_pk");
        class80.field1496 = arg0.method1482(-1, "headicons_prayer");
        class202.field2887 = arg0.method1482(-1, "hint_headicons");
        class705.field9870 = arg0.method1482(-1, "hint_mapmarkers");
        class435.field6083 = arg0.method1482(arg1, "mapflag");
        class423.field5922 = arg0.method1482(arg1, "cross");
        class56.field1054 = arg0.method1482(arg1, "mapdots");
        class144.field2208 = arg0.method1482(-1, "scrollbar");
        class561.field7958 = arg0.method1482(-1, "name_icons");
        class337.field4762 = arg0.method1482(arg1, "floorshadows");
        class144.field2219 = arg0.method1482(-1, "compass");
        class512.field7308 = arg0.method1482(-1, "otherlevel");
        class172.field2500 = arg0.method1482(-1, "hint_mapedge");
    }

    @OriginalMember(owner = "client!naa", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 58)
    public class71(String arg0) {
        this.field1276 = arg0;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(I)V", line = 33)
    public static void method731(int arg0) {
        field1277 = null;
        if (arg0 != 84) {
            field1277 = null;
        }
        field1279 = null;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(Z)V", line = 44)
    public static final void method732(boolean arg0) {
        if (arg0) {
            class390.field5454 = class421.field5916;
            class138.field2153 = class4.field56;
        } else {
            class390.field5454 = class25.field323;
            class138.field2153 = class173.field2511;
        }
        class749.field10470 = class390.field5454.length;
    }
}
