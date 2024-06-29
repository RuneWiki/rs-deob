import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class452 extends class431 {

    @OriginalMember(owner = "client!sp", name = "r", descriptor = "Lhn;")
    public static class509 field6601 = new class509(11, 0);

    @OriginalMember(owner = "client!sp", name = "u", descriptor = "I")
    public static int field6604 = 0;

    @OriginalMember(owner = "client!sp", name = "k", descriptor = "I")
    public static int field6594;

    @OriginalMember(owner = "client!sp", name = "l", descriptor = "I")
    public static int field6595;

    @OriginalMember(owner = "client!sp", name = "n", descriptor = "I")
    public static int field6597;

    @OriginalMember(owner = "client!sp", name = "p", descriptor = "I")
    public static int field6599;

    @OriginalMember(owner = "client!sp", name = "q", descriptor = "I")
    public static int field6600;

    @OriginalMember(owner = "client!sp", name = "s", descriptor = "I")
    public static int field6602;

    @OriginalMember(owner = "client!sp", name = "m", descriptor = "J")
    public long field6596;

    @OriginalMember(owner = "client!sp", name = "o", descriptor = "Lsp;")
    public class452 field6598;

    @OriginalMember(owner = "client!sp", name = "t", descriptor = "Lsp;")
    public class452 field6603;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(III)Len;")
    public static final class211 method2749(int arg0, int arg1, int arg2) {
        field6595++;
        class211 var3 = (class211) class293.field4455.method2585((byte) 114, (long) arg2 | (long) arg0 << 32);
        int var4 = -27 % ((76 - arg1) / 50);
        if (var3 == null) {
            var3 = new class211(arg0, arg2);
            class293.field4455.method2591(var3.field6388, var3, (byte) 81);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)Lqu;")
    public static final class65 method2750(int arg0, int arg1) {
        if (arg1 != -3020) {
            return null;
        }
        field6602++;
        class65[] var2 = class122.method910(1);
        for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3].field840 == arg0) {
                return var2[var3];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!sp", name = "g", descriptor = "(I)Z")
    public final boolean method2751(int arg0) {
        if (arg0 > -85) {
            this.field6603 = null;
        }
        field6599++;
        return this.field6603 != null;
    }

    @OriginalMember(owner = "client!sp", name = "h", descriptor = "(I)V")
    public static void method2752(int arg0) {
        if (arg0 < 118) {
            field6601 = null;
        }
        field6601 = null;
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(III)Z")
    public static final boolean method2753(int arg0, int arg1, int arg2) {
        field6594++;
        class69 var3 = class510.field7458.method2973(-120, arg0);
        if (arg1 != 22046) {
            return false;
        }
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method591(arg2, (byte) 110);
    }

    @OriginalMember(owner = "client!sp", name = "i", descriptor = "(I)V")
    public final void method2754(int arg0) {
        field6600++;
        if (this.field6603 == null) {
            return;
        }
        this.field6603.field6598 = this.field6598;
        if (arg0 == -152804768) {
            this.field6598.field6603 = this.field6603;
            this.field6598 = null;
            this.field6603 = null;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(B[I[J)V")
    public static final void method2755(byte arg0, int[] arg1, long[] arg2) {
        if (arg0 >= -65) {
            field6601 = null;
        }
        field6597++;
        class502.method2984(0, arg2, 2, arg1, arg2.length - 1);
    }
}
