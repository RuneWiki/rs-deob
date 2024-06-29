import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class266 extends class43 {

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    public int field3429;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "J")
    public long field3427;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public int field3423;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public int field3424;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "Ljava/lang/String;")
    public String field3421;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public int field3426;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "Ljava/lang/String;")
    public String field3422;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "Lcq;")
    public static class72 field3425 = new class72(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

    @OriginalMember(owner = "client!la", name = "u", descriptor = "[I")
    public static int[] field3431 = new int[50];

    @OriginalMember(owner = "client!la", name = "w", descriptor = "I")
    public static int field3433 = 0;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "Lwo;")
    public static class285 field3430;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "[Lc;")
    public static class436[] field3432;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZI)V", line = 13)
    public static final void method1665(boolean arg0, int arg1) {
        field3428++;
        class403.method2518((byte) 30);
        int var2 = class267.method1668(arg1, (byte) -100).field1061;
        if (var2 == 0) {
            return;
        }
        if (!arg0) {
            method1665(true, -30);
        }
        int var3 = class56.field649[arg1];
        if (var2 == 5) {
            class396.field5388 = var3;
        }
        if (var2 == 6) {
            class225.field2861 = var3;
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(B)V", line = 42)
    public static void method1666(byte arg0) {
        field3431 = null;
        field3432 = null;
        field3430 = null;
        if (arg0 < 65) {
            method1666((byte) -97);
        }
        field3425 = null;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIJII)V", line = 62)
    public class266(String arg0, String arg1, int arg2, int arg3, long arg4, int arg5, int arg6) {
        this.field3429 = arg2;
        this.field3427 = arg4;
        this.field3423 = arg5;
        this.field3424 = arg3;
        this.field3421 = arg1;
        this.field3426 = arg6;
        this.field3422 = arg0;
    }
}
