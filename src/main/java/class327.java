import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class327 {

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public int field4009;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public int field4012;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
    public int field4022;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public int field4015;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "B")
    public byte field4011;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public int field4017;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public int field4008;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "Llq;")
    public class210 field4016;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "F")
    public static float field4010 = 0.0F;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "Luw;")
    public static class208 field4020 = new class208(129, 6);

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "Lpc;")
    public class543 field4019;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "Liha;")
    public class635 field4014;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "Lnga;")
    public class701 field4018;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "Llea;")
    public class74 field4021;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)Z")
    public final boolean method1903(int arg0) {
        if (arg0 <= 70) {
            method1904(-19);
        }
        field4023++;
        return this.field4011 == 2 || this.field4011 == 3;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V")
    public static void method1904(int arg0) {
        field4020 = null;
        int var1 = 106 % ((32 - arg0) / 51);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "([IILck;II[I)Lgfa;")
    public static final class787 method1905(int[] arg0, int arg1, class733 arg2, int arg3, int arg4, int[] arg5) {
        field4013++;
        int var6 = -69 / ((arg3 - 50) / 47);
        byte[] var7 = new byte[arg1 * arg4];
        for (int var8 = 0; var8 < arg1; var8++) {
            int var9 = arg4 * var8 + arg0[var8];
            for (int var10 = 0; var10 < arg5[var8]; var10++) {
                var7[var9++] = -1;
            }
        }
        return new class787(arg2, arg4, arg1, var7);
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(BIIIIIILlq;)V")
    public class327(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class210 arg7) {
        this.field4009 = arg2;
        this.field4012 = arg3;
        this.field4022 = arg4;
        this.field4015 = arg6;
        this.field4011 = arg0;
        this.field4017 = arg1;
        this.field4008 = arg5;
        this.field4016 = arg7;
    }
}
