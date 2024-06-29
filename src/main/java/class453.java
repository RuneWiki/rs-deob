import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class453 extends class432 {

    @OriginalMember(owner = "client!ck", name = "D", descriptor = "Lbj;")
    public static class159 field6620 = new class159(16);

    @OriginalMember(owner = "client!ck", name = "I", descriptor = "[I")
    public static int[] field6625 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ck", name = "J", descriptor = "Lfg;")
    public static class83 field6626 = new class83("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

    @OriginalMember(owner = "client!ck", name = "L", descriptor = "Ljm;")
    public static class485 field6628 = new class485(45, 3);

    @OriginalMember(owner = "client!ck", name = "N", descriptor = "I")
    public static int field6630 = 0;

    @OriginalMember(owner = "client!ck", name = "E", descriptor = "I")
    public static int field6621;

    @OriginalMember(owner = "client!ck", name = "F", descriptor = "I")
    public static int field6622;

    @OriginalMember(owner = "client!ck", name = "H", descriptor = "I")
    public static int field6624;

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "I")
    public static int field6627;

    @OriginalMember(owner = "client!ck", name = "G", descriptor = "Lew;")
    public static class339 field6623;

    @OriginalMember(owner = "client!ck", name = "M", descriptor = "[[I")
    public static int[][] field6629;

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(IIIIIF)V", line = 4)
    public class453(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "(I)V", line = 9)
    public static void method2675(int arg0) {
        field6626 = null;
        field6629 = null;
        field6628 = null;
        field6625 = null;
        if (arg0 != 0) {
            method2677((String) null, -118);
        }
        field6620 = null;
        field6623 = null;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BF)V", line = 24)
    public final void method1080(byte arg0, float arg1) {
        ++field6627;
        int var3 = -71 % ((-22 - arg0) / 40);
        super.field6287 = arg1;
    }

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "(I)V", line = 34)
    public static final void method2676(int arg0) {
        ++class88.field1202;
        ++field6622;
        class356.method1978((byte) 114, class116.field1561);
        class244.field3395.method2084(arg0, false);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 44)
    public static final int method2677(String arg0, int arg1) {
        ++field6621;
        for (int var2 = arg1; var2 < class487.field7121.length; ++var2) {
            if (class487.field7121[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BIII)V", line = 65)
    public final void method1079(byte arg0, int arg1, int arg2, int arg3) {
        super.field6284 = arg2;
        ++field6624;
        if (arg0 != 0) {
            method2675(-68);
        }
        super.field6286 = arg1;
        super.field6279 = arg3;
    }
}
