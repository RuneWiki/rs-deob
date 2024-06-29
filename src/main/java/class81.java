import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class81 extends class320 {

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "I")
    public int field1327;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
    public int field1324;

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field1329 = new String[1000];

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "Lcd;")
    public static class77 field1326;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "[Lwb;")
    public static class171[] field1321;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IB)V", line = 4)
    public static final void method741(int arg0, byte arg1) {
        field1323++;
        if (arg1 != -120 || !class272.method1863(-671591600, arg0)) {
            return;
        }
        class137[] var2 = class109.field1852[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class137 var4 = var2[var3];
            if (var4 != null) {
                var4.field2380 = 1;
                var4.field2522 = 0;
                var4.field2511 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)V", line = 40)
    public static void method742(int arg0) {
        field1326 = null;
        field1329 = null;
        if (arg0 != 68) {
            method742(-41);
        }
        field1321 = null;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(II)V", line = 58)
    public class81(int arg0, int arg1) {
        this.field1327 = arg0;
        this.field1324 = arg1;
    }
}
