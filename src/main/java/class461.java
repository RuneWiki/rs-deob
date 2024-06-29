import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public abstract class class461 {

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field6862 = 0;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "Los;")
    public static class309 field6863 = new class309("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "F")
    public static float field6861;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V", line = 7)
    public static void method2771(int arg0) {
        field6863 = null;
        if (arg0 != 0) {
            method2771(-81);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)V")
    public abstract void method1231(int arg0, int arg1);

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IB)[B")
    public abstract byte[] method1230(int arg0, byte arg1);

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)Lea;")
    public abstract class386 method1227(int arg0);

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(IB)I")
    public abstract int method1225(int arg0, byte arg1);
}
