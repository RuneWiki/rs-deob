import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class64 {

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "[Z")
    public static boolean[] field1070 = new boolean[8];

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1069 = "yellow:";

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "[Lvc;")
    public static class61[] field1064 = new class61[29];

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1073 = "white:";

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "Ljk;")
    public static class297 field1066 = null;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "Ljava/lang/String;")
    public static String field1071 = "Prepared sound engine";

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public static int field1074 = 0;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "Lpk;")
    public static class237 field1072;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "Lpk;")
    public static class237 field1075;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)I")
    public static final int method519(int arg0, byte arg1) {
        if (arg1 != -37) {
            field1066 = null;
        }
        if (class22.field369 != null) {
            class22.field369.method1718(-17492);
            class22.field369 = null;
        }
        class164.field2394++;
        field1068++;
        if (class164.field2394 > 4) {
            class164.field2394 = 0;
            class261.field4019 = 0;
            return arg0;
        }
        if (class258.field3959 == class110.field1662) {
            class110.field1662 = class145.field2109;
        } else {
            class110.field1662 = class258.field3959;
        }
        class261.field4019 = 0;
        return -1;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
    public static final void method520(byte arg0) {
        class59.field964.method1540(30, (byte) -2);
        class83.field1278++;
        class123 var1 = (class123) class124.field1833.method315((byte) -120);
        if (arg0 != 16) {
            return;
        }
        while (var1 != null) {
            if (var1.field1820 == 0) {
                class102.method743(true, arg0 + 84, var1);
            }
            var1 = (class123) class124.field1833.method310(-47);
        }
        field1065++;
        if (class7.field90 != null) {
            class297.method1979((byte) -50, class7.field90);
            class7.field90 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)V")
    public static void method521(byte arg0) {
        field1073 = null;
        field1069 = null;
        field1070 = null;
        field1064 = null;
        field1066 = null;
        field1072 = null;
        field1075 = null;
        if (arg0 != 57) {
            field1075 = null;
        }
        field1071 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)V")
    public static final void method522(int arg0, int arg1) {
        field1063++;
        class105 var2 = class9.method72(1, arg1 ^ 0x622A, arg0);
        if (arg1 != -25131) {
            field1073 = null;
        }
        var2.method764((byte) 1);
    }
}
