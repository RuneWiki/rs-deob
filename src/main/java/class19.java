import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class19 extends class525 implements class463 {

    @OriginalMember(owner = "client!qo", name = "p", descriptor = "I")
    private int field240;

    @OriginalMember(owner = "client!qo", name = "v", descriptor = "Lro;")
    public static class2 field246 = new class2(0, 0);

    @OriginalMember(owner = "client!qo", name = "w", descriptor = "Lak;")
    public static class234 field247 = new class234("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

    @OriginalMember(owner = "client!qo", name = "n", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!qo", name = "o", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!qo", name = "q", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!qo", name = "r", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!qo", name = "s", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!qo", name = "t", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!qo", name = "u", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!qo", name = "x", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIB[B)V")
    public final void method153(int arg0, int arg1, byte arg2, byte[] arg3) {
        ++field245;
        this.method3116(arg3, 43, arg0);
        int var5 = -6 / ((arg2 - -21) / 41);
        this.field240 = arg1;
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lkd;I[BIZ)V")
    public class19(class188 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field240 = arg1;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)I")
    public final int method154(byte arg0) {
        ++field242;
        int var2 = -43 / ((-19 - arg0) / 47);
        return this.field240;
    }

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "(I)V")
    public static void method155(int arg0) {
        int var1 = -51 % ((arg0 - -22) / 56);
        field247 = null;
        field246 = null;
    }

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "(I)I")
    public static final int method156(int arg0) {
        ++field241;
        if (arg0 != -26197) {
            method155(-23);
        }
        return 16;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)J")
    public final long method157(int arg0) {
        ++field239;
        int var2 = -43 % ((42 - arg0) / 43);
        return 0L;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIIIIZ)V")
    public static final void method158(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        class199.field3323 = arg5;
        class273.field4188 = arg1;
        class480.field6915 = arg4;
        class55.field684 = arg2;
        int var7 = 116 / ((-2 - arg3) / 37);
        class347.field5126 = arg0;
        ++field243;
        if (arg6 && ~class480.field6915 <= -101) {
            class412.field6180 = class199.field3323 * 128 - -64;
            class71.field1024 = class273.field4188 * 128 + 64;
            class473.field6831 = class172.method1153(class154.field2286, -4, class412.field6180, class71.field1024) + -class347.field5126;
        }
        class176.field2611 = 2;
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(I)I")
    public final int method159(int arg0) {
        if (arg0 < 19) {
            this.field240 = -40;
        }
        ++field238;
        return super.field7679;
    }

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "(I)V")
    public final void method160(int arg0) {
        if (arg0 == -20485) {
            ++field244;
            super.field7681.method1246(123, this);
        }
    }

    static {
        new class234("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
    }
}
