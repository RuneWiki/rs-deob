import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public abstract class class57 extends class96 {

    @OriginalMember(owner = "client!il", name = "P", descriptor = "Z")
    public volatile boolean field930 = true;

    @OriginalMember(owner = "client!il", name = "R", descriptor = "Lna;")
    public static class26 field932 = class69.method505("Liste des serveurs charg-Be", (byte) -121);

    @OriginalMember(owner = "client!il", name = "I", descriptor = "I")
    public static int field923 = 3;

    @OriginalMember(owner = "client!il", name = "Q", descriptor = "Lna;")
    public static class26 field931 = class69.method505("Textures charg-Bes", (byte) -125);

    @OriginalMember(owner = "client!il", name = "J", descriptor = "Lna;")
    private static class26 field924 = class69.method505("Created gameworld", (byte) -125);

    @OriginalMember(owner = "client!il", name = "M", descriptor = "Lna;")
    public static class26 field927 = field924;

    @OriginalMember(owner = "client!il", name = "K", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!il", name = "N", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!il", name = "O", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!il", name = "S", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!il", name = "L", descriptor = "Z")
    public boolean field926;

    @OriginalMember(owner = "client!il", name = "T", descriptor = "Z")
    public boolean field934;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "(B)V", line = 25)
    public static void method416(byte arg0) {
        field924 = null;
        field932 = null;
        if (arg0 != 120) {
            field931 = (class26) null;
        }
        field931 = null;
        field927 = null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(III)V", line = 39)
    public static final void method417(int arg0, int arg1, int arg2) {
        class135.field2063 = true;
        class228.field3601 = arg0;
        class302.field5212 = arg1;
        class76.field1160 = arg2;
        class322.field5533 = -1;
        class28.field477 = -1;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BII)Z", line = 71)
    public static final boolean method418(byte arg0, int arg1, int arg2) {
        if (arg2 == 11) {
            arg2 = 10;
        }
        field933++;
        int var3 = -59 % ((arg0 - 26) / 55);
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        class78 var4 = class104.method750(4, arg1);
        return var4.method551(115, arg2);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)I")
    public abstract int method414(boolean arg0);

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(Z)[B")
    public abstract byte[] method415(boolean arg0);
}
