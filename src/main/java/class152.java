import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class152 extends class509 {

    @OriginalMember(owner = "client!ei", name = "Q", descriptor = "Ljava/lang/Object;")
    private Object field2305;

    @OriginalMember(owner = "client!ei", name = "J", descriptor = "Lej;")
    public static class104 field2299 = new class104(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

    @OriginalMember(owner = "client!ei", name = "R", descriptor = "[[Z")
    public static boolean[][] field2306 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!ei", name = "C", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!ei", name = "E", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!ei", name = "K", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!ei", name = "L", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!ei", name = "M", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!ei", name = "N", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!ei", name = "P", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!ei", name = "S", descriptor = "Lan;")
    public static class21 field2307;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public final Object method991(int arg0) {
        if (arg0 <= 25) {
            return null;
        } else {
            field2301++;
            return this.field2305;
        }
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(B)V")
    public static void method992(byte arg0) {
        field2307 = null;
        field2299 = null;
        field2306 = null;
        if (arg0 != -79) {
            method994(83, 48, 122, (byte) 99, 75);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ZI)V")
    public static final void method993(boolean arg0, int arg1) {
        if (!arg0) {
            field2306 = null;
        }
        class529.field7414.method3253(arg1, -126);
        field2300++;
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lfw;Ljava/lang/Object;I)V")
    public class152(class50 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field2305 = arg1;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIBI)I")
    public static final int method994(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field2298++;
        int var5 = arg1 & 0xF;
        int var6 = var5 >= 8 ? arg4 : arg2;
        if (arg3 != 64) {
            field2299 = null;
        }
        int var7 = var5 < 4 ? arg4 : (var5 == 12 || var5 == 14 ? arg2 : arg0);
        return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(B)V")
    public static final void method995(byte arg0) {
        class10.field110 = new class442(class594.field8599.method739(class173.field2491, -125), "", class575.field7926, 1002, -1, 0L, 0, 0, true, false);
        field2302++;
        if (arg0 != -84) {
            field2299 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "([BI)Z")
    public static final boolean method996(byte[] arg0, int arg1) {
        field2297++;
        class11 var2 = new class11(arg0);
        int var3 = var2.method110((byte) 23);
        if (var3 != 2) {
            return false;
        }
        if (arg1 != -29213) {
            field2306 = null;
        }
        boolean var4 = var2.method110((byte) 77) == 1;
        if (var4) {
            class104.method736(var2, true);
        }
        class439.method2595(var2, (byte) -6);
        return true;
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)Z")
    public final boolean method997(int arg0) {
        if (arg0 != 2000) {
            method996(null, 98);
        }
        field2304++;
        return false;
    }

    static {
        new class104("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
    }
}
