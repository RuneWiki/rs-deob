import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class442 extends class176 {

    @OriginalMember(owner = "client!hv", name = "o", descriptor = "Ljava/lang/String;")
    public String field6289;

    @OriginalMember(owner = "client!hv", name = "t", descriptor = "I")
    public int field6294;

    @OriginalMember(owner = "client!hv", name = "m", descriptor = "Z")
    public boolean field6287;

    @OriginalMember(owner = "client!hv", name = "w", descriptor = "J")
    public long field6297;

    @OriginalMember(owner = "client!hv", name = "q", descriptor = "I")
    public int field6291;

    @OriginalMember(owner = "client!hv", name = "y", descriptor = "I")
    public int field6299;

    @OriginalMember(owner = "client!hv", name = "s", descriptor = "I")
    public int field6293;

    @OriginalMember(owner = "client!hv", name = "x", descriptor = "I")
    public int field6298;

    @OriginalMember(owner = "client!hv", name = "v", descriptor = "Z")
    public boolean field6296;

    @OriginalMember(owner = "client!hv", name = "u", descriptor = "Ljava/lang/String;")
    public String field6295;

    @OriginalMember(owner = "client!hv", name = "p", descriptor = "Lej;")
    public static class104 field6290 = new class104("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

    @OriginalMember(owner = "client!hv", name = "n", descriptor = "I")
    public static int field6288;

    @OriginalMember(owner = "client!hv", name = "r", descriptor = "I")
    public static int field6292;

    @OriginalMember(owner = "client!hv", name = "z", descriptor = "Lan;")
    public static class21 field6300;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)V")
    public static void method2617(byte arg0) {
        if (arg0 != 28) {
            field6300 = null;
        }
        field6300 = null;
        field6290 = null;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIZ)I")
    public static final int method2618(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field6290 = null;
        }
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        field6292++;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
    public class442(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field6289 = arg0;
        this.field6294 = arg4;
        this.field6287 = arg8;
        this.field6297 = arg5;
        this.field6291 = arg7;
        this.field6299 = arg2;
        this.field6293 = arg6;
        this.field6298 = arg3;
        this.field6296 = arg9;
        this.field6295 = arg1;
    }
}
