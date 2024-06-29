import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class511 {

    @OriginalMember(owner = "client!et", name = "q", descriptor = "S")
    public short field7278;

    @OriginalMember(owner = "client!et", name = "c", descriptor = "S")
    public short field7264;

    @OriginalMember(owner = "client!et", name = "e", descriptor = "Z")
    public boolean field7266;

    @OriginalMember(owner = "client!et", name = "f", descriptor = "S")
    public short field7267;

    @OriginalMember(owner = "client!et", name = "d", descriptor = "I")
    public int field7265;

    @OriginalMember(owner = "client!et", name = "l", descriptor = "I")
    public int field7273;

    @OriginalMember(owner = "client!et", name = "k", descriptor = "I")
    public int field7272;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "B")
    public byte field7262;

    @OriginalMember(owner = "client!et", name = "h", descriptor = "I")
    public int field7269;

    @OriginalMember(owner = "client!et", name = "i", descriptor = "I")
    public int field7270;

    @OriginalMember(owner = "client!et", name = "g", descriptor = "[F")
    public static float[] field7268 = new float[16384];

    @OriginalMember(owner = "client!et", name = "j", descriptor = "[F")
    public static float[] field7271 = new float[16384];

    @OriginalMember(owner = "client!et", name = "m", descriptor = "J")
    public static long field7274;

    @OriginalMember(owner = "client!et", name = "b", descriptor = "I")
    public static int field7263;

    @OriginalMember(owner = "client!et", name = "o", descriptor = "I")
    public static int field7276;

    @OriginalMember(owner = "client!et", name = "p", descriptor = "I")
    public static int field7277;

    @OriginalMember(owner = "client!et", name = "n", descriptor = "Lkda;")
    public static class328 field7275;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(B)V")
    public static void method3039(byte arg0) {
        field7268 = null;
        field7271 = null;
        field7275 = null;
        if (arg0 != 106) {
            method3040((byte) 14);
        }
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(B)V")
    public static final void method3040(byte arg0) {
        field7263++;
        class332 var1 = (class332) class306.field4198.method124((byte) 42);
        if (arg0 != -104) {
            method3039((byte) -40);
        }
        while (var1 != null) {
            if (var1.field4589 == -1) {
                var1.field4592 = 0;
                if (var1.field4593 >= 0 && var1.field4584 >= 0 && var1.field4593 < class146.field2125 && class410.field5609 > var1.field4584) {
                    class62.method402(var1, 1);
                }
            } else {
                var1.method2457(arg0 ^ 0x2082);
            }
            var1 = (class332) class306.field4198.method120(121);
        }
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class511(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field7278 = (short) arg6;
        this.field7264 = (short) arg4;
        this.field7266 = arg10;
        this.field7267 = (short) arg5;
        this.field7265 = arg2;
        this.field7273 = arg0;
        this.field7272 = arg3;
        this.field7262 = (byte) arg8;
        this.field7269 = arg11;
        this.field7270 = arg1;
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field7268[var2] = (float) Math.sin((double) var2 * var0);
            field7271[var2] = (float) Math.cos((double) var2 * var0);
        }
        field7274 = 0L;
    }
}
