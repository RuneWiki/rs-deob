import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class238 extends class38 {

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "Loa;")
    public static class99 field4111 = class221.method1463(2844, "brillant1:");

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "Loa;")
    public static class99 field4115 = class221.method1463(2844, "Chargement de l(W-Bcran)2titre )2 ");

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
    public static int field4112 = 0;

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "Loa;")
    public static class99 field4118 = class221.method1463(2844, " GMT");

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "Ltf;")
    public static class107 field4116;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
    public static void method1554(int arg0) {
        int var1 = -43 % ((arg0 - 22) / 46);
        field4115 = null;
        field4118 = null;
        field4116 = null;
        field4111 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ltf;I)V")
    public static final void method1555(class107 arg0, int arg1) {
        if (class52.field855 == arg0.field1834) {
            class173.field3057[arg0.field1913] = true;
        }
        field4113++;
        if (arg1 != 10555) {
            field4115 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)I")
    public static final int method1556(int arg0, int arg1, int arg2) {
        field4117++;
        int var3 = arg1 >> 31 & arg0 + arg2;
        return (arg1 + (arg1 >>> 31)) % arg2 + var3;
    }
}
