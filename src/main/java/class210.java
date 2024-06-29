import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class210 {

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "Z")
    public boolean field3024 = false;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
    public int field3026 = 43594;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
    public int field3025 = 443;

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "Ldp;")
    public static class347 field3029 = new class347("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "[I")
    public static int[] field3030 = new int[13];

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
    public int field3023;

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "Lok;")
    public static class74 field3031;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "Ljava/lang/String;")
    public String field3021;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)I", line = 5)
    public final int method1356(int arg0) {
        if (arg0 > -106) {
            field3030 = null;
        }
        field3020++;
        return this.field3024 ? this.field3025 : this.field3026;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)Lfe;", line = 23)
    public static final class152 method1357(byte arg0) {
        field3022++;
        if (class487.field7253 < class96.field1495.length) {
            return class96.field1495[class487.field7253++];
        } else {
            if (arg0 > -50) {
                method1359((byte) 45);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)I", line = 41)
    public static final int method1358(int arg0, int arg1) {
        if (arg0 == 127) {
            field3027++;
            return arg1 & 0x7F;
        } else {
            return 118;
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(B)V", line = 64)
    public static void method1359(byte arg0) {
        field3030 = null;
        field3029 = null;
        field3031 = null;
        if (arg0 != -43) {
            field3030 = null;
        }
    }
}
