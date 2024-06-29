import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class23 {

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public int field311;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "Lmg;")
    public static class101 field308;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "Lmg;")
    public static class101 field310;

    static {
        new class466("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
        new class466("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
        field313 = 0;
        field314 = 0;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "([BIII)I", line = 3)
    public static final int method137(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg3 < 72) {
            method138(77);
        }
        field312++;
        int var4 = -1;
        for (int var5 = arg1; var5 < arg2; var5++) {
            var4 = var4 >>> 8 ^ class244.field3406[(arg0[var5] ^ var4) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!uc", name = "toString", descriptor = "()Ljava/lang/String;", line = 26)
    public final String toString() {
        field309++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V", line = 34)
    public static void method138(int arg0) {
        if (arg0 != 25541) {
            field313 = -108;
        }
        field310 = null;
        field308 = null;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(II)V", line = 64)
    public class23(int arg0, int arg1) {
        this.field311 = arg0;
    }
}
