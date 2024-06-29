import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class262 extends class86 {

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "Ljava/lang/String;")
    public String field3738;

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "Z")
    public boolean field3740;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "I")
    public int field3734;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
    public int field3736;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "Ljava/lang/String;")
    public String field3732;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "Z")
    public boolean field3731;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
    public int field3735;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
    public int field3737;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "J")
    public long field3733;

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "I")
    public int field3739;

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "[Lso;")
    public static class313[] field3742;

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "Liu;")
    public static class390 field3741;

    @OriginalMember(owner = "client!tb", name = "C", descriptor = "Lgn;")
    public static class475 field3743;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
    public static int field3730;

    static {
        new class194("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
        field3742 = new class313[2048];
        field3741 = new class390(104, 6);
        field3743 = new class475(45, 3);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)I", line = 5)
    public static final int method1618(int arg0) {
        if (arg0 != -29489) {
            method1618(36);
        }
        field3730++;
        if (class217.field3043 == null) {
            return class427.field6293 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(B)V", line = 26)
    public static void method1619(byte arg0) {
        field3743 = null;
        field3741 = null;
        field3742 = null;
        if (arg0 >= -51) {
            field3741 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V", line = 47)
    public class262(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field3738 = arg0;
        this.field3740 = arg9;
        this.field3734 = arg6;
        this.field3736 = arg4;
        this.field3732 = arg1;
        this.field3731 = arg8;
        this.field3735 = arg7;
        this.field3737 = arg3;
        this.field3733 = arg5;
        this.field3739 = arg2;
    }
}
