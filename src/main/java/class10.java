import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class10 {

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z[BI)V", line = 3)
    public static final void method150(boolean arg0, byte[] arg1, int arg2) {
        field138++;
        if (class579.field8344 == null) {
            class579.field8344 = new class431(20000);
        }
        if (arg2 >= -96) {
            method150(true, null, 40);
        }
        class579.field8344.method2514(arg1, arg1.length, (byte) -112, 0);
        if (!arg0) {
            return;
        }
        class621.method3558(-2053826689, class579.field8344.field6002);
        class556.field7710 = new class422[class720.field10051];
        int var3 = 0;
        for (int var4 = class527.field7353; var4 <= class42.field516; var4++) {
            class422 var5 = class630.method3595(26316, var4);
            if (var5 != null) {
                class556.field7710[var3++] = var5;
            }
        }
        class555.field7709 = false;
        class180.field2756 = class337.method2062(false);
        class579.field8344 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V", line = 50)
    public static final void method151(int arg0) {
        if (class77.field1158 != -1) {
            class138.method1131(-1, false, -1, (byte) -70, class77.field1158);
            class77.field1158 = -1;
        }
        field137++;
        if (arg0 < 71) {
            method151(-126);
        }
    }
}
