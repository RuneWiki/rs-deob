import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public abstract class class83 {

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "Lvj;")
    public class422 field855;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "[I")
    public static int[] field857 = new int[64];

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "Lcq;")
    public static class110 field854 = new class110(104, -1);

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field858 = 0;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "Lim;")
    public static class386 field859;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILwp;I)I", line = 5)
    public static final int method434(int arg0, class452 arg1, int arg2) {
        field853++;
        if (!client.method3750(arg1).method1803(arg0, -22899) && arg1.field6320 == null) {
            return -1;
        } else {
            if (arg2 != -1) {
                method434(36, null, -79);
            }
            return arg1.field6359 == null || arg0 >= arg1.field6359.length ? -1 : arg1.field6359[arg0];
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V", line = 22)
    public static void method436(int arg0) {
        if (arg0 != -1) {
            method437(-7);
        }
        field859 = null;
        field857 = null;
        field854 = null;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V", line = 34)
    public static final void method437(int arg0) {
        field856++;
        for (int var1 = arg0; var1 < 100; var1++) {
            class518.field7380[var1] = null;
        }
        class659.field9249 = 0;
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lvj;)V", line = 52)
    public class83(class422 arg0) {
        this.field855 = arg0;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BZ)V")
    public abstract void method433(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)V")
    public abstract void method435(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V")
    public abstract void method438(int arg0);

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZI)V")
    public abstract void method439(boolean arg0, int arg1);

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)Z")
    public abstract boolean method440(byte arg0);

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILav;)V")
    public abstract void method441(int arg0, int arg1, class325 arg2);
}
