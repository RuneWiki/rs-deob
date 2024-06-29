import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class152 {

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "Lka;")
    public static class109 field2934;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "Lba;")
    public static class13 field2935;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZLge;)V")
    public static final void method978(boolean arg0, class70 arg1) {
        field2933++;
        arg1.field1314 = 0;
        if (arg1.field1357 == 0) {
            arg1.field1325 = 1024;
        }
        if (!arg0) {
            return;
        }
        int var2 = arg1.field1367 - class175.field3280;
        int var3 = arg1.field1332 * 128 + arg1.field1331 * 64;
        if (arg1.field1357 == 1) {
            arg1.field1325 = 1536;
        }
        if (arg1.field1357 == 2) {
            arg1.field1325 = 0;
        }
        if (arg1.field1357 == 3) {
            arg1.field1325 = 512;
        }
        int var4 = arg1.field1331 * 64 + arg1.field1320 * 128;
        arg1.field1353 += (var3 - arg1.field1353) / var2;
        arg1.field1360 += (var4 - arg1.field1360) / var2;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
    public static void method979(int arg0) {
        if (arg0 > 94) {
            field2934 = null;
            field2935 = null;
        }
    }
}
