import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class728 {

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "[B")
    public static byte[] field10182 = new byte[32896];

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "Ldp;")
    public static class3 field10183;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
    public static int field10178;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    public int field10179;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
    public static int field10180;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
    public static int field10181;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
    public static int field10184;

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "I")
    public int field10185;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
    public int field10186;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field10182[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + (var2 * var2 + 65535)) / 65535.0F))));
            }
        }
        field10183 = new class3();
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lha;I)V", line = 8)
    public static final void method4089(class58 arg0, int arg1) {
        if (class273.field3903) {
            class434.method2637(arg1 - 31202, arg0);
        } else {
            class91.method687((byte) 112, arg0);
        }
        if (arg1 != -2) {
            method4091(41, 67, false);
        }
        field10178++;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IBLee;)V", line = 45)
    private final void method4090(int arg0, byte arg1, class675 arg2) {
        field10181++;
        if (arg0 == 1) {
            this.field10185 = arg2.method3757((byte) -65);
            this.field10179 = arg2.method3750((byte) 35);
            this.field10186 = arg2.method3750((byte) 35);
        }
        if (arg1 < 61) {
            method4089(null, -9);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIZ)V", line = 65)
    public static final void method4091(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            method4093(-58);
        }
        field10180++;
        class592 var3 = class682.method3825(-652872096, 14, arg0);
        var3.method3351(0);
        var3.field8337 = arg1;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lee;I)V", line = 84)
    public final void method4092(class675 arg0, int arg1) {
        if (arg1 != 22071) {
            field10182 = null;
        }
        while (true) {
            int var3 = arg0.method3750((byte) 35);
            if (var3 == 0) {
                field10184++;
                return;
            }
            this.method4090(var3, (byte) 112, arg0);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V", line = 105)
    public static void method4093(int arg0) {
        field10183 = null;
        int var1 = 77 / ((-arg0 - 62) / 50);
        field10182 = null;
    }
}
