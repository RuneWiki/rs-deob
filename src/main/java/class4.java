import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class4 {

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "[I")
    public static int[] field55 = new int[32768];

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "[I")
    public static int[] field56 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public int field59;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public int field60;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public int field63;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILaa;)V")
    private final void method23(int arg0, int arg1, class8 arg2) {
        field62++;
        if (arg0 == arg1) {
            this.field59 = arg2.method65((byte) 119);
            this.field63 = arg2.method63((byte) 98);
            this.field60 = arg2.method63((byte) 120);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Laa;B)V")
    public final void method24(class8 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method63((byte) 117);
            if (var3 == 0) {
                if (arg1 != -125) {
                    this.field60 = -63;
                }
                field57++;
                return;
            }
            this.method23(var3, 1, arg0);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public static void method25(int arg0) {
        field56 = null;
        field55 = null;
        if (arg0 != -23418) {
            field56 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZLce;Lce;ZIIB)I")
    public static final int method26(boolean arg0, class205 arg1, class205 arg2, boolean arg3, int arg4, int arg5, byte arg6) {
        int var7 = class134.method1010(arg2, -24019, arg1, arg5, arg3);
        field61++;
        if (var7 == 0) {
            if (arg6 != 34) {
                field55 = null;
            }
            if (arg4 == -1) {
                return 0;
            } else {
                int var8 = class134.method1010(arg2, -24019, arg1, arg4, arg0);
                return arg0 ? -var8 : var8;
            }
        } else if (arg3) {
            return -var7;
        } else {
            return var7;
        }
    }
}
