import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class56 {

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public int field804 = -1;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field802 = 0;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "Led;")
    public static class187 field806 = new class187();

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public static int field809 = 0;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field810 = 0;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "Ldh;")
    public class122 field808;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "[I")
    public int[] field803;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "[Ljava/lang/String;")
    public String[] field805;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
    public static final void method416(byte arg0) {
        if (arg0 != -43) {
            method417(false);
        }
        field807++;
        class57.field812.method1558(-54);
        class264.field4282.method1558(-124);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)V")
    public static void method417(boolean arg0) {
        field806 = null;
        if (!arg0) {
            method416((byte) -66);
        }
    }
}
