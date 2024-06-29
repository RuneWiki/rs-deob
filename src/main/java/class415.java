import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public abstract class class415 extends class184 {

    @OriginalMember(owner = "client!za", name = "n", descriptor = "Z")
    public static boolean field6231 = false;

    @OriginalMember(owner = "client!za", name = "m", descriptor = "I")
    public static int field6230;

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(II)V", line = 12)
    public static final void method2627(int arg0, int arg1) {
        field6230++;
        class150 var2 = class676.method3885(1000, arg0, arg1);
        var2.method1115(true);
    }
}
