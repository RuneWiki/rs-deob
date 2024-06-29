import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class315 {

    @OriginalMember(owner = "client!mv", name = "e", descriptor = "S")
    public short field4338;

    @OriginalMember(owner = "client!mv", name = "j", descriptor = "I")
    public int field4343;

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "B")
    public byte field4337;

    @OriginalMember(owner = "client!mv", name = "k", descriptor = "B")
    public byte field4344;

    @OriginalMember(owner = "client!mv", name = "f", descriptor = "S")
    public short field4339;

    @OriginalMember(owner = "client!mv", name = "h", descriptor = "Z")
    public boolean field4341;

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "S")
    public short field4336;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "Llu;")
    public static class610 field4334 = new class610(26, 4);

    @OriginalMember(owner = "client!mv", name = "g", descriptor = "[[I")
    public static int[][] field4340 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "F")
    public static float field4335;

    @OriginalMember(owner = "client!mv", name = "i", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)V")
    public static void method1911(int arg0) {
        field4340 = null;
        if (arg0 == -22322) {
            field4334 = null;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(ZIIII)Lmv;")
    public final class315 method1912(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!arg0) {
            this.method1912(true, -6, -7, -59, -36);
        }
        field4342++;
        return new class315(arg1, arg3, arg4, arg2, this.field4339, this.field4336, this.field4338, this.field4337, this.field4344, this.field4341);
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
    public class315(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        this.field4338 = (short) arg6;
        this.field4343 = arg0;
        this.field4337 = (byte) arg7;
        this.field4344 = (byte) arg8;
        this.field4339 = (short) arg4;
        this.field4341 = arg9;
        this.field4336 = (short) arg5;
    }

    static {
        new class572("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
    }
}
