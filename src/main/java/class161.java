import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public abstract class class161 extends class264 {

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "I")
    public static int field2149 = 0;

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "Lct;")
    public static class104 field2150;

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "Lnb;")
    public static class344 field2152;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "[I")
    public static int[] field2148;

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "[Lui;")
    public static class378[] field2151;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "(I)V")
    public static void method1077(int arg0) {
        field2152 = null;
        field2150 = null;
        field2148 = null;
        if (arg0 != 0) {
            method1077(-115);
        }
        field2151 = null;
    }
}
