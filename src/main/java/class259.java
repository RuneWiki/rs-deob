import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class259 extends class41 {

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "Ljava/lang/String;")
    private String field3065 = null;

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "J")
    private long field3070 = -1L;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
    public static int field3066 = 0;

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "[I")
    public static int[] field3069 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "Lhj;")
    public static class596 field3072 = new class596(104, 8);

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!ig", name = "y", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)V", line = 15)
    public static void method1550(int arg0) {
        field3072 = null;
        if (arg0 != -1) {
            field3066 = 94;
        }
        field3069 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILes;)V", line = 31)
    public final void method329(int arg0, class403 arg1) {
        field3067++;
        if (arg1.method2396((byte) 94) != 255) {
            arg1.field5262--;
            this.field3070 = arg1.method2361(97);
        }
        if (arg0 != -3999) {
            field3072 = null;
        }
        this.field3065 = arg1.method2383(7540);
        if (class93.field1232) {
            System.out.println("memberhash:" + this.field3070 + " membername:" + this.field3065);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "([BBII)[B", line = 52)
    public static final byte[] method1551(byte[] arg0, byte arg1, int arg2, int arg3) {
        field3074++;
        int var4 = -87 % ((-arg1 - 64) / 34);
        byte[] var5;
        if (arg2 <= 0) {
            var5 = arg0;
        } else {
            var5 = new byte[arg3];
            for (int var6 = 0; var6 < arg3; var6++) {
                var5[var6] = arg0[arg2 + var6];
            }
        }
        class668 var7 = new class668();
        var7.method3748(-3192);
        var7.method3752((byte) -86, (long) (arg3 * 8), var5);
        byte[] var8 = new byte[64];
        var7.method3751(var8, 0, (byte) -127);
        return var8;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Loga;I)V", line = 93)
    public final void method331(class500 arg0, int arg1) {
        field3071++;
        if (arg1 == 55) {
            arg0.method2962(this.field3070, this.field3065, -5158);
        }
    }
}
