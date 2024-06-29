import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class410 {

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "I")
    private int field5876 = 0;

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "Ldj;")
    private class191 field5879;

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "Ljava/lang/String;")
    public static String field5881 = "";

    @OriginalMember(owner = "client!bs", name = "i", descriptor = "Lpm;")
    public static class349 field5884 = new class349("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

    @OriginalMember(owner = "client!bs", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field5885 = new String[5];

    @OriginalMember(owner = "client!bs", name = "l", descriptor = "[I")
    public static int[] field5887 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!bs", name = "m", descriptor = "I")
    public static int field5888 = 0;

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "I")
    public static int field5877;

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "I")
    public static int field5878;

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "I")
    public static int field5880;

    @OriginalMember(owner = "client!bs", name = "h", descriptor = "I")
    public static int field5883;

    @OriginalMember(owner = "client!bs", name = "k", descriptor = "I")
    public static int field5886;

    @OriginalMember(owner = "client!bs", name = "g", descriptor = "Lge;")
    private class425 field5882;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(B)Lge;", line = 8)
    public final class425 method2595(byte arg0) {
        field5878++;
        if (this.field5876 > 0 && this.field5879.field2780[this.field5876 - 1] != this.field5882) {
            class425 var2 = this.field5882;
            this.field5882 = var2.field6074;
            return var2;
        }
        if (arg0 != 67) {
            this.field5879 = null;
        }
        while (this.field5876 < this.field5879.field2766) {
            class425 var3 = this.field5879.field2780[this.field5876++].field6074;
            if (this.field5879.field2780[this.field5876 - 1] != var3) {
                this.field5882 = var3.field6074;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(B)V", line = 43)
    public static final void method2596(byte arg0) {
        field5880++;
        class198.field2833.method102((byte) -89);
        class293.field4238.method102((byte) -95);
        if (arg0 > -19) {
            field5887 = null;
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(ZZ)Z", line = 55)
    public static final boolean method2597(boolean arg0, boolean arg1) {
        field5883++;
        if (!arg1) {
            return true;
        }
        boolean var2 = class59.field786.method971();
        if (var2 == arg0) {
            return true;
        }
        if (!arg0) {
            class59.field786.method932();
        } else if (!class59.field786.method952()) {
            arg0 = false;
        }
        if (arg0 == var2) {
            return false;
        } else {
            class255.field3795 = arg0;
            class415.method2612(class401.field5628, 117);
            return true;
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)Lge;", line = 92)
    public final class425 method2598(int arg0) {
        this.field5876 = 0;
        if (arg0 != 12584) {
            field5886 = -87;
        }
        field5877++;
        return this.method2595((byte) 67);
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Ldj;)V", line = 127)
    public class410(class191 arg0) {
        this.field5879 = arg0;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Z)V", line = 109)
    public static void method2599(boolean arg0) {
        if (!arg0) {
            field5887 = null;
        }
        field5887 = null;
        field5885 = null;
        field5884 = null;
        field5881 = null;
    }
}
