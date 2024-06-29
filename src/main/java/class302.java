import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class302 {

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "B")
    public byte field4227;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "[I")
    public int[] field4238;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "B")
    public byte field4231;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "[I")
    public int[] field4226;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "[I")
    public int[] field4239;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "S")
    public short field4233;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "S")
    public short field4228;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "S")
    public short field4234;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "[S")
    public short[] field4237;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "[S")
    public short[] field4230;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "[S")
    public short[] field4229;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "S")
    public short field4232;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "Lgn;")
    public static class529 field4235 = new class529("stellardawn", 1);

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "Lvh;")
    public static class125 field4236 = new class125(66, 3);

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "[I")
    public static int[] field4241 = new int[16384];

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "[I")
    public static int[] field4242 = new int[16384];

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(JJ)J")
    public static long method1853(long arg0, long arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z)V")
    public static void method1854(boolean arg0) {
        field4242 = null;
        if (arg0) {
            field4235 = null;
            field4241 = null;
            field4236 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
    public class302(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        this.field4227 = (byte) arg0;
        this.field4238 = new int[4];
        this.field4231 = (byte) arg1;
        this.field4226 = new int[4];
        this.field4239 = new int[4];
        this.field4239[1] = arg3;
        this.field4239[2] = arg4;
        this.field4239[0] = arg2;
        this.field4239[3] = arg5;
        this.field4226[1] = arg7;
        this.field4226[3] = arg9;
        this.field4226[2] = arg8;
        this.field4226[0] = arg6;
        this.field4238[2] = arg12;
        this.field4233 = (short) (arg2 >> class49.field637);
        this.field4238[0] = arg10;
        this.field4238[1] = arg11;
        this.field4238[3] = arg13;
        this.field4228 = (short) (arg4 >> class49.field637);
        this.field4234 = (short) (arg10 >> class49.field637);
        this.field4237 = new short[4];
        this.field4230 = new short[4];
        this.field4229 = new short[4];
        this.field4232 = (short) (arg12 >> class49.field637);
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4241[var2] = (int) (Math.sin((double) var2 * var0) * 16384.0D);
            field4242[var2] = (int) (Math.cos((double) var2 * var0) * 16384.0D);
        }
    }
}
