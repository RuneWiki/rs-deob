import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class619 {

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "Z")
    public boolean field9029;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "Lnj;")
    public static class487 field9028 = new class487("Loaded JAGMISC", "JAGMISC geladen", "JAGMISC chargé", "JAGMISC carregado");

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    public static int field9035 = 0;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    public static int field9034 = 0;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field9027;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field9031;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public static int field9033;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    public static int field9036;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "Lg;")
    public class512 field9030;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "Lg;")
    public class512 field9032;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "Z")
    public boolean field9026;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
    public static void method3582(int arg0) {
        field9028 = null;
        if (arg0 != -11430) {
            method3582(-86);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZIB)V")
    public static final void method3583(boolean arg0, int arg1, byte arg2) {
        field9031++;
        class580 var3 = class585.method3419(-14473, arg0, arg1);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < var3.field8538.length; var4++) {
            var3.field8538[var4] = -1;
            var3.field8543[var4] = 0;
        }
        int var5 = -77 % ((arg2 + 24) / 52);
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Z)V")
    public class619(boolean arg0) {
        this.field9029 = arg0;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V")
    public final void method3584(int arg0) {
        field9036++;
        if (this.field9032 != null) {
            this.field9032.method409(false);
        }
        this.field9026 = false;
        if (arg0 > -76) {
            method3583(true, -109, (byte) -53);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)Z")
    public final boolean method3585(byte arg0) {
        field9033++;
        if (arg0 == 96) {
            return this.field9026 && !this.field9029;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILwca;)V")
    public static final void method3586(int arg0, class311 arg1) {
        if (arg0 > 7) {
            if (class43.field529 == arg1.field4682) {
                class587.field8718[arg1.field4638] = true;
            }
            field9027++;
        }
    }
}
