import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class29 extends class95 {

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "Lvf;")
    public static class265 field746 = class87.method582(-46, "Chargement de l(W-Bcran)2titre )2 ");

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "Lvf;")
    public static class265 field742 = class87.method582(-46, "(U");

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "Lfl;")
    public static class192 field741;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "[[S")
    public static short[][] field743;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)V")
    public static final void method242(boolean arg0) {
        class181.field3214.method1888((byte) 116);
        field748++;
        if (!arg0) {
            class126.field2261.method1888((byte) 98);
            class183.field3246.method1888((byte) 121);
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V")
    public static void method243(int arg0) {
        if (arg0 >= 86) {
            field742 = null;
            field746 = null;
            field743 = null;
            field741 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BI)Z")
    public static final boolean method244(byte arg0, int arg1) {
        field747++;
        int var2 = 24 / ((62 - arg0) / 48);
        return ((arg1 & 0x2EE096) >> 21) != 0;
    }
}
