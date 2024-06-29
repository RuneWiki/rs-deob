import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class386 extends class222 {

    @OriginalMember(owner = "client!ii", name = "t", descriptor = "I")
    private int field5714;

    @OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
    private int field5715;

    @OriginalMember(owner = "client!ii", name = "E", descriptor = "I")
    private int field5724;

    @OriginalMember(owner = "client!ii", name = "B", descriptor = "I")
    private int field5722;

    @OriginalMember(owner = "client!ii", name = "v", descriptor = "I")
    private int field5716;

    @OriginalMember(owner = "client!ii", name = "F", descriptor = "I")
    private int field5725;

    @OriginalMember(owner = "client!ii", name = "A", descriptor = "I")
    private int field5721;

    @OriginalMember(owner = "client!ii", name = "x", descriptor = "I")
    private int field5718;

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "Lgf;")
    public static class180 field5720 = new class180("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

    @OriginalMember(owner = "client!ii", name = "H", descriptor = "Z")
    public static boolean field5727;

    @OriginalMember(owner = "client!ii", name = "G", descriptor = "Lvp;")
    public static class123 field5726;

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "I")
    public static int field5711;

    @OriginalMember(owner = "client!ii", name = "r", descriptor = "I")
    public static int field5712;

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!ii", name = "w", descriptor = "I")
    public static int field5717;

    @OriginalMember(owner = "client!ii", name = "y", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!ii", name = "D", descriptor = "I")
    public static int field5723;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ii", name = "J", descriptor = "Ljava/lang/Class;")
    public static Class field5729;

    @OriginalMember(owner = "client!ii", name = "I", descriptor = "[I")
    public static int[] field5728;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2430(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class180("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
        field5727 = false;
        field5726 = new class123(73, 3);
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(B)V", line = 11)
    public static final void method2427(byte arg0) {
        ++field5719;
        try {
            Method var1 = (field5729 != null ? field5729 : (field5729 = method2430("java.lang.Runtime"))).getMethod("availableProcessors");
            if (arg0 <= 92) {
                method2427((byte) -12);
            }
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class23.field418 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIZ)V", line = 40)
    public final void method48(int arg0, int arg1, boolean arg2) {
        ++field5717;
        if (!arg2) {
            this.method44(45, -23, 51);
        }
        int var4 = this.field5715 * arg0 >> 12;
        int var5 = this.field5718 * arg1 >> 12;
        int var6 = this.field5714 * arg0 >> 12;
        int var7 = this.field5724 * arg1 >> 12;
        int var8 = this.field5722 * arg0 >> 12;
        int var9 = this.field5716 * arg1 >> 12;
        int var10 = this.field5725 * arg0 >> 12;
        int var11 = this.field5721 * arg1 >> 12;
        class17.method161(var10, var6, (byte) 44, var5, var8, var11, var4, var7, super.field3210, var9);
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)V", line = 67)
    public static final void method2428(int arg0) {
        ++field5712;
        for (class81 var1 = (class81) class278.field4007.method2257((byte) 118); var1 != null; var1 = (class81) class278.field4007.method2256(77)) {
            if (var1.field1345) {
                var1.method649(125);
            }
        }
        for (class81 var2 = (class81) class11.field192.method2257((byte) 122); var2 != null; var2 = (class81) class11.field192.method2256(35)) {
            if (var2.field1345) {
                var2.method649(121);
            }
        }
        if (arg0 <= 61) {
            field5727 = true;
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(III)V", line = 102)
    public final void method44(int arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            ++field5723;
        }
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 113)
    public class386(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field5714 = arg2;
        this.field5715 = arg0;
        this.field5724 = arg3;
        this.field5722 = arg4;
        this.field5716 = arg5;
        this.field5725 = arg6;
        this.field5721 = arg7;
        this.field5718 = arg1;
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(B)V", line = 131)
    public static void method2429(byte arg0) {
        field5720 = null;
        field5728 = null;
        field5726 = null;
        int var1 = 79 / ((arg0 - 21) / 53);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(III)V", line = 154)
    public final void method51(int arg0, int arg1, int arg2) {
        ++field5713;
        if (arg2 >= -20) {
            this.field5715 = 15;
        }
    }
}
