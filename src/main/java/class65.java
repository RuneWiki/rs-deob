import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class65 {

    @OriginalMember(owner = "client!h", name = "g", descriptor = "Led;")
    private static class43 field1323 = class191.method1219("Connection lost)3", false);

    @OriginalMember(owner = "client!h", name = "c", descriptor = "Led;")
    public static class43 field1319 = field1323;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "Led;")
    private static class43 field1322 = class191.method1219("Attack", false);

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    public static int field1325 = 0;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "Led;")
    public static class43 field1327 = field1322;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "Lga;")
    public static class58 field1318;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BLga;)V")
    public static final void method408(byte arg0, class58 arg1) {
        int var2 = -116 % ((arg0 - 63) / 32);
        field1324++;
        class78.field1552 = arg1;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
    public static void method409(int arg0) {
        field1327 = null;
        field1318 = null;
        field1323 = null;
        field1319 = null;
        field1322 = null;
        if (arg0 != 0) {
            method411(64, -104);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)Z")
    public static final boolean method410(int arg0, int arg1) {
        field1317++;
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg0 != -30001) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else {
            return arg1 >= 48 && arg1 <= 57;
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(II)[B")
    public static final synchronized byte[] method411(int arg0, int arg1) {
        field1320++;
        if (arg0 == 100 && class7.field140 > 0) {
            byte[] var2 = class27.field484[--class7.field140];
            class27.field484[class7.field140] = null;
            return var2;
        }
        if (arg1 != 10947) {
            field1323 = null;
        }
        if (arg0 == 5000 && class5.field106 > 0) {
            byte[] var3 = class193.field3752[--class5.field106];
            class193.field3752[class5.field106] = null;
            return var3;
        } else if (arg0 == 30000 && class50.field1013 > 0) {
            byte[] var4 = class163.field3272[--class50.field1013];
            class163.field3272[class50.field1013] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }
}
