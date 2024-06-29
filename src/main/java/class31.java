import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class31 {

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field516 = 0;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "I")
    public static int field519 = 50;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "[I")
    public static int[] field514 = new int[field519];

    @OriginalMember(owner = "client!i", name = "d", descriptor = "[I")
    public static int[] field512 = new int[field519];

    @OriginalMember(owner = "client!i", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field515 = new String[field519];

    @OriginalMember(owner = "client!i", name = "l", descriptor = "[I")
    public static int[] field520 = new int[field519];

    @OriginalMember(owner = "client!i", name = "i", descriptor = "[I")
    public static int[] field517 = new int[field519];

    @OriginalMember(owner = "client!i", name = "a", descriptor = "[I")
    public static int[] field509 = new int[field519];

    @OriginalMember(owner = "client!i", name = "b", descriptor = "[I")
    public static int[] field510 = new int[field519];

    @OriginalMember(owner = "client!i", name = "j", descriptor = "Lsn;")
    public static class443 field518 = new class443("RC", 1);

    @OriginalMember(owner = "client!i", name = "m", descriptor = "I")
    public static int field521 = 0;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "Lcu;")
    public static class145 field522 = new class145(68, 4);

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "Lul;")
    public static class402 field513;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static void method251(int arg0) {
        field522 = null;
        field515 = null;
        field509 = null;
        field520 = null;
        field512 = null;
        field518 = null;
        field513 = null;
        field514 = null;
        field510 = null;
        field517 = null;
        if (arg0 != 4) {
            method251(-124);
        }
    }
}
