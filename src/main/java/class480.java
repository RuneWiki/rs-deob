import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class480 {

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "Liu;")
    public static class390 field6933 = new class390(23, -1);

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field6931;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field6932;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public static int field6935;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "[Lqg;")
    public static class307[] field6934;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILts;)Lts;", line = 6)
    public static final class356 method2801(int arg0, class356 arg1) {
        field6932++;
        if (arg1.field5160 != -1) {
            return class4.method25(arg1.field5160, false);
        }
        if (arg0 != 896298960) {
            method2802(-63);
        }
        int var2 = arg1.field5185 >>> 16;
        class418 var3 = new class418(class213.field3010);
        for (class311 var4 = (class311) var3.method2484((byte) 41); var4 != null; var4 = (class311) var3.method2485((byte) -94)) {
            if (var4.field4525 == var2) {
                return class4.method25((int) var4.field1177, false);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V", line = 40)
    public static void method2802(int arg0) {
        field6933 = null;
        if (arg0 != 23) {
            field6933 = null;
        }
        field6934 = null;
    }
}
