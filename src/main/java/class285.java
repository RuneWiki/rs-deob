import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public class class285 {

    @OriginalMember(owner = "client!bca", name = "d", descriptor = "I")
    public int field3714 = 1;

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "Lim;")
    public static class353 field3712 = new class353(93, 16);

    @OriginalMember(owner = "client!bca", name = "h", descriptor = "Luv;")
    public static class3 field3718 = new class3(43, -1);

    @OriginalMember(owner = "client!bca", name = "i", descriptor = "Lvt;")
    public static class344 field3719;

    @OriginalMember(owner = "client!bca", name = "j", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!bca", name = "c", descriptor = "C")
    public char field3713;

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!bca", name = "e", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!bca", name = "f", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!bca", name = "g", descriptor = "I")
    public static int field3717;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bca", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field3721;

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(Lge;II)V")
    private final void method1768(class551 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3713 = class515.method2865(0, arg0.method3051((byte) 111));
        } else if (arg1 == 2) {
            this.field3714 = 0;
        }
        if (arg2 <= -50) {
            field3716++;
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(Lge;B)V")
    public final void method1769(class551 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method3045(-125);
            if (var3 == 0) {
                if (arg1 >= -100) {
                    this.method1768(null, -44, 31);
                }
                field3711++;
                return;
            }
            this.method1768(arg0, var3, -123);
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(IZ)V")
    public static final void method1770(int arg0, boolean arg1) {
        class88.field1169 = new int[arg0];
        class324.field4451 = new int[arg0];
        if (arg1) {
            class585.field8466 = new int[arg0];
            class207.field2692 = new int[arg0];
            field3715++;
            client.field8972 = new int[arg0];
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(I)V")
    public static void method1771(int arg0) {
        field3718 = null;
        field3712 = null;
        if (arg0 == 1) {
            field3719 = null;
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(B)V")
    public static final void method1772(byte arg0) {
        try {
            if (arg0 != -4) {
                field3718 = null;
            }
            Method var1 = (field3721 == null ? (field3721 = method1773("java.lang.Runtime")) : field3721).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class435.field5919 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
        field3717++;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1773(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class344("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
        field3719 = new class344("K", "T", "K", "K");
        field3720 = 0;
    }
}
