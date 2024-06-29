import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public abstract class class168 extends class455 {

    @OriginalMember(owner = "client!sr", name = "i", descriptor = "I")
    public int field2479;

    @OriginalMember(owner = "client!sr", name = "o", descriptor = "I")
    public int field2485;

    @OriginalMember(owner = "client!sr", name = "r", descriptor = "I")
    public int field2488;

    @OriginalMember(owner = "client!sr", name = "j", descriptor = "I")
    public int field2480;

    @OriginalMember(owner = "client!sr", name = "k", descriptor = "I")
    public int field2481;

    @OriginalMember(owner = "client!sr", name = "p", descriptor = "I")
    public int field2486;

    @OriginalMember(owner = "client!sr", name = "m", descriptor = "I")
    public int field2483;

    @OriginalMember(owner = "client!sr", name = "h", descriptor = "I")
    public static int field2478 = 0;

    @OriginalMember(owner = "client!sr", name = "t", descriptor = "[I")
    public static int[] field2490;

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!sr", name = "l", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!sr", name = "n", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!sr", name = "q", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!sr", name = "s", descriptor = "Ljava/awt/Frame;")
    public static Frame field2489;

    static {
        new class234("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
        field2490 = new int[1000];
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IILya;ILor;IZ)V", line = 12)
    public final void method23(int arg0, int arg1, class38 arg2, int arg3, class455 arg4, int arg5, boolean arg6) {
        if (arg0 != 3) {
            this.method17(17);
        }
        field2487++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(ILjava/lang/String;IIZIZLjava/lang/String;IIJ)V", line = 28)
    public static final void method1127(int arg0, String arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6, String arg7, int arg8, int arg9, long arg10) {
        if (arg8 >= -51) {
            field2490 = null;
        }
        field2476++;
        if (!class307.field4631 && class382.field5752 < 500) {
            int var12 = arg9 == -1 ? class287.field4348 : arg9;
            class295 var13 = new class295(arg7, arg1, var12, arg5, arg0, arg10, arg2, arg3, arg4, arg6);
            class456.field6644.method994(var13, -3610);
            class382.field5752++;
        }
    }

    @OriginalMember(owner = "client!sr", name = "h", descriptor = "(I)V", line = 47)
    public static void method1128(int arg0) {
        field2489 = null;
        field2490 = null;
        if (arg0 != 0) {
            field2478 = -5;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Z)V", line = 67)
    public final void method21(boolean arg0) {
        field2482++;
        if (arg0) {
            field2490 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sr", name = "i", descriptor = "(I)V", line = 80)
    public static final void method1129(int arg0) {
        class74.method640(-29627, class422.field6281);
        class42.field553++;
        field2475++;
        class71.field1020.method1545(arg0, -83);
    }

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "(I)Z", line = 90)
    public final boolean method17(int arg0) {
        field2477++;
        if (arg0 != 13651334) {
            this.field2488 = -17;
        }
        return false;
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(IIIIIII)V", line = 108)
    public class168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2479 = arg6;
        this.field2485 = arg3;
        this.field2488 = arg5;
        this.field2480 = arg1;
        this.field2481 = arg0;
        this.field2486 = arg4;
        this.field2483 = arg2;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(B[B)[B", line = 122)
    public static final byte[] method1130(byte arg0, byte[] arg1) {
        field2484++;
        int var2 = arg1.length;
        if (arg0 <= 113) {
            method1128(-13);
        }
        byte[] var3 = new byte[var2];
        class414.method2598(arg1, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "(I)I")
    public abstract int method1079(int arg0);
}
