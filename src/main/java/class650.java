import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class650 {

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "[I")
    public int[] field9069;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "[I")
    public int[] field9064;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "[I")
    public int[] field9065;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "[[F")
    public float[][] field9062;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "Llga;")
    public static class712 field9067 = new class712(76, 7);

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field9061;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public static int field9063;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public static int field9066;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "Lvia;")
    public static class564 field9068;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V", line = 6)
    public static void method3670(int arg0) {
        field9067 = null;
        if (arg0 != 76) {
            method3670(-70);
        }
        field9068 = null;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIB)I", line = 20)
    public static final int method3671(int arg0, int arg1, int arg2, byte arg3) {
        field9063++;
        int var4 = arg2 & 0x3;
        int var5 = 89 / ((-arg3 - 70) / 52);
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "([I[I[I[[F)V", line = 48)
    public class650(int[] arg0, int[] arg1, int[] arg2, float[][] arg3) {
        this.field9069 = arg1;
        this.field9064 = arg0;
        this.field9065 = arg2;
        this.field9062 = arg3;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(BLmha;)V", line = 59)
    public static final void method3672(byte arg0, class417 arg1) {
        if (arg1.field5876 != null) {
            arg1.field5876.field4561 = 0;
        }
        if (arg0 != -32) {
            return;
        }
        arg1.field5874 = false;
        field9061++;
        for (class417 var2 = arg1.method1989(); var2 != null; var2 = arg1.method1991()) {
            method3672((byte) -32, var2);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lni;ZLd;)V", line = 81)
    public static final void method3673(class522 arg0, boolean arg1, class152 arg2) {
        class565.field7978 = arg0;
        field9066++;
        class124.field1622 = arg2;
        if (!arg1) {
            method3671(-101, -39, 69, (byte) -47);
        }
    }
}
