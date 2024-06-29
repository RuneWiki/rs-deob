import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public abstract class class533 extends class5 {

    @OriginalMember(owner = "client!wo", name = "t", descriptor = "Lnq;")
    public class325 field7841;

    @OriginalMember(owner = "client!wo", name = "m", descriptor = "Lpw;")
    public static class507 field7834 = new class507();

    @OriginalMember(owner = "client!wo", name = "v", descriptor = "I")
    public static int field7843 = 503;

    @OriginalMember(owner = "client!wo", name = "x", descriptor = "[I")
    public static int[] field7845;

    @OriginalMember(owner = "client!wo", name = "y", descriptor = "F")
    public static float field7846;

    @OriginalMember(owner = "client!wo", name = "j", descriptor = "I")
    public static int field7831;

    @OriginalMember(owner = "client!wo", name = "k", descriptor = "I")
    public static int field7832;

    @OriginalMember(owner = "client!wo", name = "l", descriptor = "I")
    public static int field7833;

    @OriginalMember(owner = "client!wo", name = "n", descriptor = "I")
    public static int field7835;

    @OriginalMember(owner = "client!wo", name = "o", descriptor = "I")
    public static int field7836;

    @OriginalMember(owner = "client!wo", name = "p", descriptor = "I")
    public static int field7837;

    @OriginalMember(owner = "client!wo", name = "q", descriptor = "I")
    public static int field7838;

    @OriginalMember(owner = "client!wo", name = "u", descriptor = "I")
    public static int field7842;

    @OriginalMember(owner = "client!wo", name = "w", descriptor = "I")
    public static int field7844;

    @OriginalMember(owner = "client!wo", name = "s", descriptor = "Lnm;")
    public static class335 field7840;

    @OriginalMember(owner = "client!wo", name = "r", descriptor = "Z")
    public boolean field7839;

    static {
        new class446("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
        field7845 = new int[4096];
        for (int var0 = 0; var0 < 4096; var0++) {
            field7845[var0] = class424.method2590(2, var0);
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)Z", line = 3)
    public final boolean method3150(byte arg0) {
        if (arg0 != 33) {
            this.method2396(-77);
        }
        field7844++;
        return this.field7839;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZF)F", line = 14)
    public static final float method3151(boolean arg0, float arg1) {
        if (arg0) {
            field7837++;
            return arg1 * arg1 * arg1 * ((arg1 * 6.0F - 15.0F) * arg1 + 10.0F);
        } else {
            return -1.9428759F;
        }
    }

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "(I)V", line = 32)
    public static final void method3152(int arg0) {
        field7835++;
        if (class435.field6596 == 8) {
            class134.method908(4, 2);
        } else if (class435.field6596 == 4 || class435.field6596 == 5) {
            class134.method908(2, 2);
        } else if (class435.field6596 == 11) {
            class134.method908(2, 2);
        }
        if (arg0 <= 90) {
            field7845 = null;
        }
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(III)Z", line = 64)
    public static final boolean method3153(int arg0, int arg1, int arg2) {
        if (arg0 != 2048) {
            field7840 = null;
        }
        field7831++;
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "(I)V", line = 76)
    public static void method3154(int arg0) {
        field7840 = null;
        field7845 = null;
        if (arg0 == 0) {
            field7834 = null;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I[[I)V", line = 90)
    public static final void method3155(int arg0, int[][] arg1) {
        class466.field6955 = arg1;
        if (arg0 != 1) {
            method3152(65);
        }
        field7832++;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Z)Z", line = 108)
    public final boolean method3156(boolean arg0) {
        if (arg0) {
            method3152(-87);
        }
        field7833++;
        return false;
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lnq;)V", line = 120)
    public class533(class325 arg0) {
        this.field7841 = arg0;
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(B)I", line = 128)
    public final int method3157(byte arg0) {
        if (arg0 <= 88) {
            this.method2394(-7, null, null, -7);
        }
        field7838++;
        return 1;
    }

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "(B)I", line = 139)
    public int method2393(byte arg0) {
        field7836++;
        return arg0 >= -47 ? -12 : 0;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)Z")
    public abstract boolean method2396(int arg0);

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "(I)Z")
    public abstract boolean method2395(int arg0);

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IB)V")
    public abstract void method2390(int arg0, byte arg1);

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILwv;Lwv;I)V")
    public abstract void method2394(int arg0, class25 arg1, class25 arg2, int arg3);

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(III)V")
    public abstract void method2392(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wo", name = "i", descriptor = "(I)V")
    public abstract void method2391(int arg0);
}
