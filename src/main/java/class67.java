import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class67 {

    @OriginalMember(owner = "client!il", name = "k", descriptor = "I")
    public int field773 = -1;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "Z")
    public static boolean field771 = false;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "[Lgea;")
    public static class82[] field772 = new class82[4];

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    public int field764;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    public int field765;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    public int field766;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "I")
    public int field767;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "I")
    public int field768;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "I")
    public int field769;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "I")
    public int field774;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "I")
    public int field776;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IBI)Lgea;")
    public static final class82 method413(int arg0, byte arg1, int arg2) {
        field775++;
        if (arg1 != 7) {
            field771 = false;
        }
        class82 var3 = new class82();
        var3.field943 = -1;
        var3.field933 = arg2 + 1 + 5;
        var3.field957 = -1;
        var3.field949 = arg0 + 1 + 5;
        var3.field948 = new int[var3.field933][var3.field949];
        var3.method481(-120);
        return var3;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method414(byte arg0, String arg1) {
        field770++;
        if (arg1 == null) {
            return;
        }
        if (!(class156.field1993 < 100 || class109.field1382) || class156.field1993 >= 200) {
            class62.method389(class553.field8225.method2953(3181, class77.field889), 0);
            return;
        }
        String var2 = class436.method2679(arg1, -1);
        if (var2 == null || arg0 > -115) {
            return;
        }
        for (int var3 = 0; var3 < class156.field1993; var3++) {
            String var7 = class436.method2679(class417.field5994[var3], -1);
            if (var7 != null && var7.equals(var2)) {
                class62.method389(arg1 + class50.field596.method2953(3181, class77.field889), 0);
                return;
            }
            if (class19.field177[var3] != null) {
                String var8 = class436.method2679(class19.field177[var3], -1);
                if (var8 != null && var8.equals(var2)) {
                    class62.method389(arg1 + class50.field596.method2953(3181, class77.field889), 0);
                    return;
                }
            }
        }
        for (int var4 = 0; var4 < class103.field1309; var4++) {
            String var5 = class436.method2679(class446.field6551[var4], -1);
            if (var5 != null && var5.equals(var2)) {
                class62.method389(class584.field8617.method2953(3181, class77.field889) + arg1 + class278.field4141.method2953(3181, class77.field889), 0);
                return;
            }
            if (class461.field6672[var4] != null) {
                String var6 = class436.method2679(class461.field6672[var4], -1);
                if (var6 != null && var6.equals(var2)) {
                    class62.method389(class584.field8617.method2953(3181, class77.field889) + arg1 + class278.field4141.method2953(3181, class77.field889), 0);
                    return;
                }
            }
        }
        if (class436.method2679(class239.field3493.field2718, -1).equals(var2)) {
            class62.method389(class293.field4301.method2953(3181, class77.field889), 0);
        } else {
            class165.method1046(-3466, class114.field1509);
            class442.field6455++;
            class221.field3268.method2563(-13021, class83.method488(-123, arg1));
            class221.field3268.method2580(arg1, 30127);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
    public static void method415(int arg0) {
        field772 = null;
        if (arg0 != -1) {
            field772 = null;
        }
    }
}
