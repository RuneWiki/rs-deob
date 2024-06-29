import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class495 extends class383 {

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
    public int field7187 = -1;

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "I")
    public int field7189 = 0;

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "J")
    public static long field7190 = 0L;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "Lbe;")
    public static class29 field7183 = new class29(2);

    @OriginalMember(owner = "client!ih", name = "x", descriptor = "Ljava/lang/String;")
    public static String field7196 = "";

    @OriginalMember(owner = "client!ih", name = "z", descriptor = "I")
    public static int field7198 = 0;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "I")
    public int field7182;

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "I")
    public int field7184;

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "I")
    public static int field7185;

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
    public int field7186;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "I")
    public int field7188;

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "I")
    public int field7191;

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "I")
    public int field7192;

    @OriginalMember(owner = "client!ih", name = "u", descriptor = "I")
    public int field7193;

    @OriginalMember(owner = "client!ih", name = "v", descriptor = "I")
    public int field7194;

    @OriginalMember(owner = "client!ih", name = "w", descriptor = "I")
    public static int field7195;

    @OriginalMember(owner = "client!ih", name = "y", descriptor = "I")
    public int field7197;

    @OriginalMember(owner = "client!ih", name = "A", descriptor = "I")
    public int field7199;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)I", line = 10)
    public static final int method2995(int arg0) {
        field7185++;
        if (arg0 != -14826) {
            field7196 = null;
        }
        return 2;
    }

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "(I)V", line = 21)
    public static void method2996(int arg0) {
        field7183 = null;
        field7196 = null;
        if (arg0 >= -8) {
            method2995(61);
        }
    }
}
