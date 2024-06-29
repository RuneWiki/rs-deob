import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class352 extends Exception {

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "[Llm;")
    public static class256[] field5145 = new class256[34];

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V", line = 7)
    public static void method2201(int arg0) {
        if (arg0 != 34) {
            method2201(-114);
        }
        field5145 = null;
    }
}
