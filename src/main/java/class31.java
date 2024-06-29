import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public abstract class class31 {

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "Lvi;")
    public static class560 field301 = new class560(5);

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lbe;Z)Lbe;")
    public abstract class307 method188(class307 arg0, boolean arg1);

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
    public static void method189(int arg0) {
        field301 = null;
        if (arg0 != 5) {
            method189(87);
        }
    }
}
