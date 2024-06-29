import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class249 extends class134 {

    @OriginalMember(owner = "client!kw", name = "j", descriptor = "Ldh;")
    public static class320 field3013 = new class320(115, 6);

    @OriginalMember(owner = "client!kw", name = "l", descriptor = "I")
    public int field3015;

    @OriginalMember(owner = "client!kw", name = "n", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!kw", name = "o", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!kw", name = "p", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!kw", name = "q", descriptor = "I")
    public int field3020;

    @OriginalMember(owner = "client!kw", name = "m", descriptor = "Lwp;")
    public class179 field3016;

    @OriginalMember(owner = "client!kw", name = "k", descriptor = "Lpia;")
    public class94 field3014;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(B)V")
    public final void method1497(byte arg0) {
        if (arg0 <= 44) {
            method1498((byte) 8);
        }
        field3019++;
        if (class180.field2128.length > class37.field422) {
            class180.field2128[class37.field422++] = this;
        }
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(B)V")
    public static void method1498(byte arg0) {
        field3013 = null;
        if (arg0 > -38) {
            method1498((byte) 90);
        }
    }
}
