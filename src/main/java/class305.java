import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class305 {

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "I")
    private int field4395 = 0;

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "Lcb;")
    private class78 field4398;

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "I")
    public static int field4393 = 1;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "Lbv;")
    public static class567 field4390 = new class567("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

    @OriginalMember(owner = "client!rn", name = "l", descriptor = "I")
    public static int field4401 = 2;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!rn", name = "j", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!rn", name = "k", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "Lum;")
    private class108 field4394;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)V")
    public static final void method1897(int arg0, int arg1) {
        field4399++;
        if (!class543.method3045(arg0, -29039)) {
            return;
        }
        class549[] var2 = class177.field2593[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class549 var4 = var2[var3];
            if (var4 != null) {
                var4.field7632 = 1;
                var4.field7664 = 0;
                var4.field7712 = 0;
            }
        }
        if (arg1 >= -113) {
            method1897(69, -8);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)V")
    public static void method1898(byte arg0) {
        field4390 = null;
        if (arg0 <= 7) {
            method1899(20);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)I")
    public static final int method1899(int arg0) {
        field4391++;
        return arg0 < 108 ? -123 : 42;
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)Lum;")
    public final class108 method1900(int arg0) {
        this.field4395 = 0;
        if (arg0 != -1) {
            field4401 = -89;
        }
        field4396++;
        return this.method1901((byte) 57);
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(B)Lum;")
    public final class108 method1901(byte arg0) {
        field4397++;
        if (arg0 != 57) {
            field4390 = null;
        }
        if (this.field4395 > 0 && this.field4398.field1423[this.field4395 - 1] != this.field4394) {
            class108 var2 = this.field4394;
            this.field4394 = var2.field1802;
            return var2;
        }
        while (this.field4398.field1418 > this.field4395) {
            class108 var3 = this.field4398.field1423[this.field4395++].field1802;
            if (this.field4398.field1423[this.field4395 - 1] != var3) {
                this.field4394 = var3.field1802;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "()V")
    public class305() {
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lcb;)V")
    public class305(class78 arg0) {
        this.field4398 = arg0;
    }
}
