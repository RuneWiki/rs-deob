import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class238 {

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "[I")
    public static int[] field3006 = new int[25];

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "Lmb;")
    public class238 field3007;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "Lmb;")
    public class238 field3008;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "Ljo;")
    public static class303 field3009;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
    public static void method1373(int arg0) {
        field3006 = null;
        field3009 = null;
        if (arg0 != 25) {
            method1373(-117);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
    public final void method1374(byte arg0) {
        field3010++;
        if (this.field3008 == null) {
            return;
        }
        this.field3008.field3007 = this.field3007;
        this.field3007.field3008 = this.field3008;
        this.field3008 = null;
        this.field3007 = null;
        if (arg0 >= -46) {
            this.field3008 = null;
        }
    }
}
