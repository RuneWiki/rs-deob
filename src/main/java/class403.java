import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class403 {

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public static int field5876 = -14475237;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "[Z")
    public static boolean[] field5875 = new boolean[5];

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public static int field5878;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "Lvc;")
    public static class225 field5877;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
    public static final void method2571(int arg0) {
        field5878++;
        class94.field1279 = arg0;
        class322.field4804 = null;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V")
    public static void method2572(int arg0) {
        field5875 = null;
        field5877 = null;
        if (arg0 != 27228) {
            field5877 = null;
        }
    }
}
