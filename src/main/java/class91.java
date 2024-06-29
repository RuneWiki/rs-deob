import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public abstract class class91 extends class223 {

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "Lfd;")
    public class365 field1255;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "Lbg;")
    public static class324 field1248;

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "Ljava/lang/String;")
    public static String field1252;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "Lfs;")
    public static class387 field1256;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "Z")
    public boolean field1254;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
    public static void method802(int arg0) {
        field1252 = null;
        field1256 = null;
        if (arg0 != 0) {
            method809(-47, 20, -73);
        }
        field1248 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V")
    public abstract void method803(int arg0, int arg1);

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)Z")
    public static final boolean method804(int arg0, int arg1, int arg2) {
        if (arg2 != 2074) {
            field1252 = null;
        }
        field1249++;
        return class484.method2911(arg0, -1376312589, arg1) | (arg0 & 0x70000) != 0 || class148.method1070(arg1, -1, arg0);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)Z")
    public final boolean method805(boolean arg0) {
        if (!arg0) {
            this.method810((byte) 52);
        }
        field1250++;
        return false;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(Z)I")
    public int method806(boolean arg0) {
        field1258++;
        if (!arg0) {
            field1252 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IBLaf;Laf;)V")
    public abstract void method807(int arg0, byte arg1, class299 arg2, class299 arg3);

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(Z)I")
    public final int method808(boolean arg0) {
        field1253++;
        if (!arg0) {
            this.method803(-33, -71);
        }
        return 1;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(III)Z")
    public static final boolean method809(int arg0, int arg1, int arg2) {
        int var3 = -34 % ((-arg2 - 66) / 53);
        field1251++;
        return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(B)Z")
    public final boolean method810(byte arg0) {
        field1246++;
        if (arg0 < 119) {
            field1256 = null;
        }
        return this.field1254;
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(B)Z")
    public abstract boolean method811(byte arg0);

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "(B)Z")
    public abstract boolean method812(byte arg0);

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "(B)V")
    public abstract void method813(byte arg0);

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lfd;)V")
    public class91(class365 arg0) {
        this.field1255 = arg0;
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(III)V")
    public abstract void method814(int arg0, int arg1, int arg2);

    static {
        new class331("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
        field1248 = new class324(33, 0);
        field1257 = 0;
        field1252 = null;
    }
}
