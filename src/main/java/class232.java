import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public abstract class class232 {

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "Z")
    public static boolean field3112 = false;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Lao;")
    public static class191 field3113 = new class191(96, 4);

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "Ljc;")
    public static class305 field3115 = new class305("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "Lfo;")
    public static class361 field3114;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V", line = 4)
    public static void method1470(boolean arg0) {
        field3114 = null;
        field3113 = null;
        field3115 = null;
        if (!arg0) {
            method1470(true);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lpt;Z)Lpt;")
    public abstract class371 method1471(class371 arg0, boolean arg1);
}
