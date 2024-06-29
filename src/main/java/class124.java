import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class124 {

    @OriginalMember(owner = "client!op", name = "a", descriptor = "I")
    public int field2004;

    @OriginalMember(owner = "client!op", name = "g", descriptor = "Lrn;")
    public static class174 field2010;

    @OriginalMember(owner = "client!op", name = "b", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!op", name = "c", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!op", name = "d", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!op", name = "f", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!op", name = "e", descriptor = "[S")
    public static short[] field2008;

    static {
        new class342("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
        field2010 = new class174(17, 8);
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Lat;III)V", line = 9)
    public static final void method949(class255 arg0, int arg1, int arg2, int arg3) {
        int var4 = -69 % ((25 - arg2) / 56);
        field2006++;
        if (arg0.field7642 == arg1 && arg1 != -1) {
            class165 var5 = class431.field6419.method1137(-117, arg1);
            int var6 = var5.field2553;
            if (var6 == 1) {
                arg0.field7594 = 0;
                arg0.field7664 = arg3;
                arg0.field7607 = 1;
                arg0.field7604 = 0;
                arg0.field7675 = 0;
                class441.method2642((byte) 32, arg0.field7594, var5, arg0.field6233, false, arg0.field6228, arg0.field6232);
            }
            if (var6 == 2) {
                arg0.field7604 = 0;
                return;
            }
        } else if (arg1 == -1 || arg0.field7642 == -1 || class431.field6419.method1137(125, arg1).field2558 >= class431.field6419.method1137(-112, arg0.field7642).field2558) {
            arg0.field7594 = 0;
            arg0.field7604 = 0;
            arg0.field7607 = 1;
            arg0.field7687 = arg0.field7690;
            arg0.field7664 = arg3;
            arg0.field7642 = arg1;
            arg0.field7675 = 0;
            if (arg0.field7642 != -1) {
                class441.method2642((byte) 34, arg0.field7594, class431.field6419.method1137(-115, arg0.field7642), arg0.field6233, false, arg0.field6228, arg0.field6232);
                return;
            }
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(II)I", line = 67)
    public static final int method950(int arg0, int arg1) {
        field2009++;
        return arg1 == 0 ? arg0 >>> 8 : -87;
    }

    @OriginalMember(owner = "client!op", name = "toString", descriptor = "()Ljava/lang/String;", line = 80)
    public final String toString() {
        field2005++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Z)V", line = 89)
    public static void method951(boolean arg0) {
        field2010 = null;
        if (!arg0) {
            method951(true);
        }
        field2008 = null;
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 105)
    public class124(String arg0, int arg1) {
        this.field2004 = arg1;
    }
}
