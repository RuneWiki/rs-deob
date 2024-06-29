import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class102 {

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "Z")
    public static boolean field1626 = false;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public static int field1627 = -1;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
    public static int field1632 = 0;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1629 = "Loaded update list";

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public static int field1633 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "Lfe;")
    public static class261 field1631;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILag;)Lag;")
    public static final class188 method781(int arg0, class188 arg1) {
        field1628++;
        if (arg0 != 683162224) {
            field1631 = null;
        }
        if (arg1.field2870 != -1) {
            return class5.method57((byte) -122, arg1.field2870);
        }
        int var2 = arg1.field2977 >>> 16;
        class124 var3 = new class124(class13.field230);
        for (class120 var4 = (class120) var3.method892((byte) 100); var4 != null; var4 = (class120) var3.method889((byte) 94)) {
            if (var4.field1852 == var2) {
                return class5.method57((byte) -114, (int) var4.field1408);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    public static void method782(int arg0) {
        field1629 = null;
        int var1 = 25 % ((-arg0 - 5) / 47);
        field1631 = null;
    }
}
