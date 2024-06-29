import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public abstract class class29 {

    @OriginalMember(owner = "client!mca", name = "c", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "[I")
    public static int[] field345;

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "[Lep;")
    public static class382[] field344;

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(Z)Lve;")
    public abstract class460 method154(boolean arg0);

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "(Z)Z")
    public final boolean method155(boolean arg0) {
        field346++;
        if (!arg0) {
            field345 = null;
        }
        return this.method158(-7948) || this.method160(false) || this.method156(17289);
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(I)Z")
    public abstract boolean method156(int arg0);

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(B)V")
    public abstract void method157(byte arg0);

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "(I)Z")
    public abstract boolean method158(int arg0);

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "(B)V")
    public static void method159(byte arg0) {
        field344 = null;
        int var1 = 61 % ((85 - arg0) / 32);
        field345 = null;
    }

    @OriginalMember(owner = "client!mca", name = "c", descriptor = "(Z)Z")
    public abstract boolean method160(boolean arg0);

    @OriginalMember(owner = "client!mca", name = "c", descriptor = "(I)I")
    public abstract int method161(int arg0);

    @OriginalMember(owner = "client!mca", name = "d", descriptor = "(I)I")
    public abstract int method162(int arg0);

    @OriginalMember(owner = "client!mca", name = "c", descriptor = "(B)V")
    public abstract void method163(byte arg0);
}
