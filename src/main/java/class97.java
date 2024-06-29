import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class97 {

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "I")
    public static int field1506 = 503;

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "[I")
    public static int[] field1505 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "Lok;")
    public static class74 field1504;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)V")
    public static void method757(int arg0) {
        field1504 = null;
        if (arg0 <= 77) {
            method757(-76);
        }
        field1505 = null;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Laa;Z)V")
    public static final void method758(class76 arg0, boolean arg1) {
        field1507++;
        class43.field559.method1819(arg1, arg0.method560((byte) 114));
    }
}
