import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class157 {

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "Ljava/lang/String;")
    public String field2235;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public int field2232;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "Lfg;")
    public static class83 field2236 = new class83("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
    public static int field2241 = 1405;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "Luf;")
    public static class310 field2238 = new class310(87, -1);

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "Lgu;")
    public static class409 field2230;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "Lf;")
    public static class529 field2237;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "[I")
    public static int[] field2233;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
    public static void method971(byte arg0) {
        field2238 = null;
        field2230 = null;
        field2233 = null;
        field2236 = null;
        if (arg0 <= 15) {
            method971((byte) -126);
        }
        field2237 = null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IBLss;)Ljava/lang/String;")
    public static final String method972(int arg0, byte arg1, class295 arg2) {
        field2240++;
        if (!client.method1191(arg2).method1226(-18308, arg0) && arg2.field4029 == null) {
            return null;
        } else if (arg2.field4080 == null || arg2.field4080.length <= arg0 || arg2.field4080[arg0] == null || arg2.field4080[arg0].trim().length() == 0) {
            return class476.field6973 ? "Hidden-" + arg0 : null;
        } else {
            if (arg1 >= -69) {
                method974(94, 0.26147040741043814D);
            }
            return arg2.field4080[arg0];
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)I")
    public static final int method973(int arg0) {
        field2239++;
        return arg0 == -256 ? 16 : 70;
    }

    @OriginalMember(owner = "client!lf", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2231++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ID)V")
    public static final void method974(int arg0, double arg1) {
        if (arg0 <= 87) {
            return;
        }
        field2234++;
        if (class505.field7423 == arg1) {
            return;
        }
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
            class128.field1749[var3] = var4 > 255 ? 255 : var4;
        }
        class505.field7423 = arg1;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class157(String arg0, int arg1) {
        this.field2235 = arg0;
        this.field2232 = arg1;
    }
}
