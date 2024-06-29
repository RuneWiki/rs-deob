import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class704 extends class90 {

    @OriginalMember(owner = "client!lt", name = "i", descriptor = "J")
    public static long field9678 = 0L;

    @OriginalMember(owner = "client!lt", name = "g", descriptor = "I")
    public int field9676;

    @OriginalMember(owner = "client!lt", name = "h", descriptor = "I")
    public int field9677;

    @OriginalMember(owner = "client!lt", name = "j", descriptor = "I")
    public int field9679;

    @OriginalMember(owner = "client!lt", name = "k", descriptor = "I")
    public static int field9680;

    @OriginalMember(owner = "client!lt", name = "m", descriptor = "I")
    public int field9682;

    @OriginalMember(owner = "client!lt", name = "l", descriptor = "Luv;")
    public class385 field9681;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Z)V")
    public static final void method3929(boolean arg0) {
        field9680++;
        int var1 = 0;
        if (arg0) {
            method3929(true);
        }
        for (int var2 = 0; var2 < class483.field6515; var2++) {
            for (int var3 = 0; var3 < class65.field926; var3++) {
                if (class354.method2171(var2, var1, var3, true, -88, class325.field4448)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }
}
