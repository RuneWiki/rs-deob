import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class21 extends class406 {

    @OriginalMember(owner = "client!o", name = "u", descriptor = "I")
    public volatile int field273 = -1;

    @OriginalMember(owner = "client!o", name = "w", descriptor = "Ljava/lang/String;")
    public volatile String field275;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "[I")
    public static int[] field271 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!o", name = "r", descriptor = "[I")
    public static int[] field270 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!o", name = "p", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "I")
    public static int field274;

    static {
        new class362("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(B)V", line = 5)
    public static void method155(byte arg0) {
        field270 = null;
        if (arg0 < 39) {
            method158((byte) 43);
        }
        field271 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I[Ljava/lang/Object;[J)V", line = 16)
    public static final void method156(int arg0, Object[] arg1, long[] arg2) {
        field268++;
        if (arg0 < 43) {
            field270 = null;
        }
        class121.method771(arg1, arg2, (byte) -127, 0, arg2.length - 1);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III)Z", line = 33)
    public static final boolean method157(int arg0, int arg1, int arg2) {
        field272++;
        return (arg1 & class399.field5699[1][arg2][arg0]) != 0;
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(B)V", line = 52)
    public static final void method158(byte arg0) {
        class237 var1 = class255.field3677;
        synchronized (class255.field3677) {
            class255.field3677.method1626((byte) 106);
        }
        field269++;
        class237 var2 = class150.field1839;
        synchronized (class150.field1839) {
            class150.field1839.method1626((byte) 106);
        }
        class237 var3 = class305.field4284;
        synchronized (class305.field4284) {
            if (arg0 >= -126) {
                field271 = null;
            }
            class305.field4284.method1626((byte) 106);
        }
        class237 var4 = class425.field6071;
        synchronized (class425.field6071) {
            class425.field6071.method1626((byte) 106);
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 85)
    public class21(String arg0) {
        this.field275 = arg0;
    }
}
