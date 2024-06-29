import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public abstract class class360 {

    @OriginalMember(owner = "client!of", name = "b", descriptor = "Lnn;")
    public static class151 field5316 = new class151("K", "T", "K", "K");

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field5320;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public static int field5317;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "[Lbs;")
    public static class141[] field5318;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "[Z")
    public static boolean[] field5321;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    public static void method2169(int arg0) {
        field5321 = null;
        if (arg0 >= -54) {
            field5319 = 26;
        }
        field5316 = null;
        field5318 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)J")
    public abstract long method150(byte arg0);

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIBI)V")
    public static final void method2170(int arg0, int arg1, byte arg2, int arg3) {
        field5315++;
        class189.field2840.method2381(arg1, arg2 - 12);
        class189.field2840.method2340((byte) -66, arg3);
        class189.field2840.method2377(arg0, -98);
        if (arg2 != 12) {
            field5320 = -62;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(III)V")
    public static final void method2171(int arg0, int arg1, int arg2) {
        class13 var3 = class277.field4216[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field164 != null) {
            var3.field164 = null;
        }
        if (var3.field149 != null) {
            var3.field149 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II)I")
    public abstract int method151(int arg0, int arg1);

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
    public abstract void method149(int arg0);

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(I)Z")
    public static final boolean method2172(int arg0) {
        field5317++;
        if (arg0 <= 18) {
            method2171(113, -82, -13);
        }
        return class405.field6032 == 0 ? class71.field935 : true;
    }

    static {
        new class151("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
        field5320 = 0;
        field5319 = 0;
    }
}
