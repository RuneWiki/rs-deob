import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class355 extends class482 {

    @OriginalMember(owner = "client!ve", name = "B", descriptor = "[I")
    private int[] field5179 = new int[this.field7001];

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "Lbd;")
    public static class44 field5166 = new class44("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "[Lmh;")
    public static class454[] field5175 = new class454[128];

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "F")
    public static float field5171;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
    public static int field5168;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "I")
    private int field5170;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "I")
    private int field5173;

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "I")
    public static int field5177;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "Lwt;")
    public static class208 field5172;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "[B")
    private byte[] field5169;

    @OriginalMember(owner = "client!ve", name = "A", descriptor = "[Laa;")
    public static class343[] field5178;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)V", line = 5)
    public final void method1850(int arg0, int arg1, int arg2) {
        if (arg0 == -1734376532) {
            ++field5174;
            this.field5170 += this.field5179[arg1] * arg2 >> 12;
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(III)Z", line = 16)
    public static final boolean method2212(int arg0, int arg1, int arg2) {
        ++field5167;
        int var3 = -14 / ((-43 - arg1) / 42);
        return false;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V", line = 28)
    public final void method1848(int arg0) {
        if (arg0 <= 65) {
            this.method1848(-67);
        }
        this.field5173 = 0;
        ++field5176;
        this.field5170 = 0;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(IIIIIF)V", line = 41)
    public class355(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~super.field7001 < ~var7; ++var7) {
            this.field5179[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)V", line = 58)
    public final void method1853(int arg0) {
        ++field5168;
        this.field5170 = Math.abs(this.field5170);
        if (~this.field5170 <= -4097) {
            this.field5170 = 4095;
        }
        this.method2214(arg0 + -343136855, this.field5173++, (byte) (this.field5170 >> 4));
        this.field5170 = 0;
        if (arg0 != 343124908) {
            this.method1848(-28);
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(Z)V", line = 93)
    public static void method2213(boolean arg0) {
        if (!arg0) {
            field5172 = null;
            field5178 = null;
            field5175 = null;
            field5166 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIB)V", line = 107)
    public void method2214(int arg0, int arg1, byte arg2) {
        ++field5177;
        this.field5169[this.field5173++] = (byte) (class168.method1203(127, arg2 >> 1) + 127);
        if (arg0 != -11947) {
            method2212(93, -122, 106);
        }
    }
}
