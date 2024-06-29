import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class424 extends class432 {

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "Leh;")
    public static class246 field5970 = new class246(64, 1);

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "Lam;")
    public static class455 field5976 = new class455();

    @OriginalMember(owner = "client!ia", name = "B", descriptor = "Z")
    public static boolean field5977 = false;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
    public static int field5966;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
    public static int field5967;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "I")
    public static int field5968;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "I")
    public static int field5969;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "I")
    public int field5971;

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "I")
    public int field5973;

    @OriginalMember(owner = "client!ia", name = "y", descriptor = "I")
    public int field5974;

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "I")
    public static int field5975;

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "J")
    public long field5972;

    @OriginalMember(owner = "client!ia", name = "D", descriptor = "Lri;")
    public static class75 field5978;

    static {
        new class530("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
    }

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "(I)V", line = 4)
    public static void method2512(int arg0) {
        if (arg0 != 64) {
            method2513(80, -42, 9, -106, 97, -102, -43);
        }
        field5978 = null;
        field5970 = null;
        field5976 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)J", line = 18)
    public final long method1081(int arg0) {
        field5968++;
        if (arg0 <= 125) {
            field5978 = null;
        }
        return this.field5972;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)I", line = 29)
    public final int method1080(byte arg0) {
        field5975++;
        return arg0 <= 81 ? -74 : this.field5971;
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(B)I", line = 43)
    public final int method1084(byte arg0) {
        if (arg0 == -102) {
            field5966++;
            return this.field5973;
        } else {
            return 20;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIII)V", line = 57)
    public static final void method2513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class296 var7 = new class296();
        var7.field4343 = arg1 >> class493.field6970;
        var7.field4354 = arg2 >> class493.field6970;
        var7.field4342 = arg3 >> class493.field6970;
        var7.field4349 = arg4 >> class493.field6970;
        var7.field4350 = arg0;
        var7.field4356 = arg1;
        var7.field4344 = arg2;
        var7.field4358 = arg3;
        var7.field4346 = arg4;
        var7.field4352 = arg5;
        var7.field4340 = arg6;
        class382.field5383[class345.field5010++] = var7;
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)I", line = 73)
    public final int method1083(int arg0) {
        if (arg0 >= -72) {
            this.field5971 = 83;
        }
        field5967++;
        return 0;
    }

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)I", line = 86)
    public final int method1082(int arg0) {
        if (arg0 != -769) {
            field5970 = null;
        }
        field5969++;
        return this.field5974;
    }
}
