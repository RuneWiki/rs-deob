import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class80 extends class238 {

    @OriginalMember(owner = "client!vr", name = "q", descriptor = "I")
    public int field980 = -1;

    @OriginalMember(owner = "client!vr", name = "s", descriptor = "Z")
    public boolean field982 = false;

    @OriginalMember(owner = "client!vr", name = "u", descriptor = "[I")
    public static int[] field984 = new int[4096];

    @OriginalMember(owner = "client!vr", name = "m", descriptor = "Ldk;")
    public static class326 field976 = new class326("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

    @OriginalMember(owner = "client!vr", name = "l", descriptor = "I")
    public int field975;

    @OriginalMember(owner = "client!vr", name = "n", descriptor = "I")
    public int field977;

    @OriginalMember(owner = "client!vr", name = "o", descriptor = "I")
    public int field978;

    @OriginalMember(owner = "client!vr", name = "p", descriptor = "I")
    public int field979;

    @OriginalMember(owner = "client!vr", name = "r", descriptor = "I")
    public int field981;

    @OriginalMember(owner = "client!vr", name = "v", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!vr", name = "t", descriptor = "[Ltr;")
    public static class176[] field983;

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(Z)V")
    public static void method456(boolean arg0) {
        if (!arg0) {
            field983 = null;
        }
        field983 = null;
        field976 = null;
        field984 = null;
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(I)V")
    public class80(int arg0) {
        this.field980 = arg0;
    }
}
