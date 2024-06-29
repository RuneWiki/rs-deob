import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public abstract class class243 {

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "Lvv;")
    public static class313 field4169 = new class313(57, 2);

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "Llo;")
    public static class306 field4170 = new class306("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "[I")
    public static int[] field4174 = new int[14];

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "Lms;")
    public static class34 field4173;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "[S")
    public static short[] field4172;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(III)Z", line = 10)
    public static final boolean method1663(int arg0, int arg1, int arg2) {
        if (arg1 != -364) {
            field4173 = null;
        }
        field4171++;
        return (arg0 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "(I)V", line = 28)
    public static void method1664(int arg0) {
        field4170 = null;
        field4172 = null;
        field4173 = null;
        if (arg0 == 14) {
            field4174 = null;
            field4169 = null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(BLza;)V")
    public abstract void method43(byte arg0, class491 arg1);

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lza;III)Z")
    public abstract boolean method27(class491 arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IILza;IILvl;Z)V")
    public abstract void method39(int arg0, int arg1, class491 arg2, int arg3, int arg4, class243 arg5, boolean arg6);

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)Z")
    public abstract boolean method42(boolean arg0);

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(Z)V")
    public abstract void method36(boolean arg0);

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(ILza;)Lsr;")
    public abstract class430 method40(int arg0, class491 arg1);
}
