import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class75 extends class118 {

    @OriginalMember(owner = "client!um", name = "G", descriptor = "I")
    private int field1012 = 3072;

    @OriginalMember(owner = "client!um", name = "J", descriptor = "I")
    private int field1015 = 2048;

    @OriginalMember(owner = "client!um", name = "P", descriptor = "I")
    private int field1021 = 1024;

    @OriginalMember(owner = "client!um", name = "O", descriptor = "[Z")
    public static boolean[] field1020;

    @OriginalMember(owner = "client!um", name = "H", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!um", name = "I", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!um", name = "L", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!um", name = "M", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!um", name = "N", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!um", name = "Q", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!um", name = "K", descriptor = "[[[B")
    public static byte[][][] field1016;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field1013;
        int[] var3 = super.field1537.method2395(30963, arg1);
        if (arg0 != 1) {
            this.method306(-6);
        }
        if (super.field1537.field5756) {
            int[] var4 = this.method703(0, arg1, arg0 + -3);
            for (int var5 = 0; ~var5 > ~class440.field6474; ++var5) {
                var3[var5] = (var4[var5] * this.field1015 >> 12) + this.field1021;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method195(boolean arg0, int arg1) {
        ++field1019;
        int[][] var3 = super.field1549.method2013(arg1, true);
        if (super.field1549.field4903) {
            int[][] var4 = this.method708(arg1, (byte) -123, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class440.field6474; ++var11) {
                var8[var11] = (var5[var11] * this.field1015 >> 12) + this.field1021;
                var9[var11] = (var6[var11] * this.field1015 >> 12) + this.field1021;
                var10[var11] = (var7[var11] * this.field1015 >> 12) + this.field1021;
            }
        }
        if (arg0) {
            field1016 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!um", name = "f", descriptor = "(I)V")
    public static void method494(int arg0) {
        field1020 = null;
        if (arg0 != 27344) {
            field1014 = 3;
        }
        field1016 = null;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(BI)Lht;")
    public static final class402 method495(byte arg0, int arg1) {
        ++field1022;
        class402 var2 = (class402) class358.field5273.method927((long) arg1, -124);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3;
            if (arg1 >= 32768) {
                var3 = class103.field1378.method823(1, -20334, 32767 & arg1);
            } else {
                var3 = class55.field738.method823(1, -20334, arg1);
            }
            class402 var4 = new class402();
            if (arg0 != -10) {
                field1014 = -70;
            }
            if (var3 != null) {
                var4.method2526(false, new class385(var3));
            }
            if (~arg1 <= -32769) {
                var4.method2530(-1);
            }
            class358.field5273.method929((long) arg1, var4, false);
            return var4;
        }
    }

    @OriginalMember(owner = "client!um", name = "e", descriptor = "(I)V")
    public final void method306(int arg0) {
        ++field1017;
        this.field1015 = -this.field1021 + this.field1012;
        if (arg0 <= 103) {
            field1016 = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IILef;)V")
    public final void method24(int arg0, int arg1, class385 arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field1552 = arg2.method2343(255) == 1;
                }
            } else {
                this.field1012 = arg2.method2323(-77);
            }
        } else {
            this.field1021 = arg2.method2323(-89);
        }
        ++field1018;
        if (arg1 != 1) {
            field1020 = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V")
    public class75() {
        super(1, false);
    }

    static {
        new class151("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
        field1020 = new boolean[100];
    }
}
