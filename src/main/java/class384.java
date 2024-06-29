import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class384 {

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    public static int field5495 = 0;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
    public int field5490;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public int field5491;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
    public int field5492;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public int field5493;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    public static int field5494;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V", line = 4)
    public static final void method2339(int arg0) {
        for (int var1 = arg0; var1 < class57.field1019.length; var1++) {
            for (int var2 = 0; var2 < class57.field1019[var1].length; var2++) {
                class57.field1019[var1][var2] = class56.field1011;
            }
        }
        field5494++;
    }
}
