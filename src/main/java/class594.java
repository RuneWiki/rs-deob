import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class594 {

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "I")
    public static int field8494 = 0;

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "Lsv;")
    public static class570 field8495 = new class570(16, -1);

    @OriginalMember(owner = "client!bu", name = "g", descriptor = "[I")
    public static int[] field8498 = new int[256];

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "I")
    public static int field8492;

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "I")
    public static int field8493;

    @OriginalMember(owner = "client!bu", name = "e", descriptor = "I")
    public static int field8496;

    @OriginalMember(owner = "client!bu", name = "f", descriptor = "I")
    public static int field8497;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V", line = 10)
    public static void method3468(int arg0) {
        if (arg0 != 0) {
            method3471(-94);
        }
        field8495 = null;
        field8498 = null;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V", line = 22)
    public static final void method3469(int arg0, String arg1, String arg2, int arg3) {
        if (arg3 != -1) {
            field8498 = null;
        }
        class591.field8484 = 2;
        field8497++;
        class347.field4939 = arg0;
        class563.method3279(false, arg2, arg1, -6864);
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(I)V", line = 36)
    public static final void method3470(int arg0) {
        class147.field2359++;
        field8496++;
        class302 var1 = class582.method3419(class565.field7879, (byte) 125, class626.field8901);
        var1.field4341.method2524(false, class388.method2333((byte) 47));
        var1.field4341.method2546(true, class709.field9923);
        var1.field4341.method2546(true, class448.field6174);
        var1.field4341.method2524(false, class420.field5820.field9447.method745(17539));
        class501.method2928(arg0 ^ arg0, var1);
    }

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "(I)Z", line = 56)
    public static final boolean method3471(int arg0) {
        field8492++;
        if (arg0 != 0) {
            method3472(-34, null, null);
        }
        return class499.field6863;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I[[S[[F)[[S", line = 67)
    public static final short[][] method3472(int arg0, short[][] arg1, float[][] arg2) {
        field8493++;
        if (arg0 >= -65) {
            method3469(-122, null, null, -61);
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            for (int var4 = 0; var4 < arg1[var3].length; var4++) {
                arg1[var3][var4] = (short) ((int) (arg2[var3][var4] * 16383.0F));
            }
        }
        return arg1;
    }
}
