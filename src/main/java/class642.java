import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class642 extends class738 {

    @OriginalMember(owner = "client!qo", name = "p", descriptor = "I")
    private int field9135;

    @OriginalMember(owner = "client!qo", name = "j", descriptor = "I")
    private int field9129;

    @OriginalMember(owner = "client!qo", name = "s", descriptor = "I")
    private int field9138;

    @OriginalMember(owner = "client!qo", name = "l", descriptor = "I")
    private int field9131;

    @OriginalMember(owner = "client!qo", name = "k", descriptor = "[B")
    public static byte[] field9130;

    @OriginalMember(owner = "client!qo", name = "t", descriptor = "I")
    public static int field9139;

    @OriginalMember(owner = "client!qo", name = "n", descriptor = "I")
    public static int field9133;

    @OriginalMember(owner = "client!qo", name = "i", descriptor = "I")
    public static int field9128;

    @OriginalMember(owner = "client!qo", name = "m", descriptor = "I")
    public static int field9132;

    @OriginalMember(owner = "client!qo", name = "o", descriptor = "I")
    public static int field9134;

    @OriginalMember(owner = "client!qo", name = "q", descriptor = "I")
    public static int field9136;

    @OriginalMember(owner = "client!qo", name = "r", descriptor = "I")
    public static int field9137;

    @OriginalMember(owner = "client!qo", name = "u", descriptor = "I")
    public static int field9140;

    @OriginalMember(owner = "client!qo", name = "v", descriptor = "I")
    public static int field9141;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(BII)V")
    public final void method83(byte arg0, int arg1, int arg2) {
        ++field9128;
        int var4 = this.field9129 * arg1 >> 12;
        if (arg0 != 81) {
            this.method84(-34, 99, -7);
        }
        int var5 = this.field9131 * arg1 >> 12;
        int var6 = this.field9135 * arg2 >> 12;
        int var7 = this.field9138 * arg2 >> 12;
        class492.method2994(var7, super.field10312, var6, arg0 ^ -19504, var5, var4);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IZI)V")
    public final void method85(int arg0, boolean arg1, int arg2) {
        ++field9134;
        int var4 = this.field9129 * arg0 >> 12;
        int var5 = this.field9131 * arg0 >> 12;
        if (!arg1) {
            field9140 = 90;
        }
        int var6 = this.field9135 * arg2 >> 12;
        int var7 = this.field9138 * arg2 >> 12;
        class59.method556(super.field10312, var4, var6, var5, var7, super.field10310, super.field10305, -1);
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(IIIIIII)V")
    public class642(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field9135 = arg1;
        this.field9129 = arg0;
        this.field9138 = arg3;
        this.field9131 = arg2;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(III)V")
    public final void method84(int arg0, int arg1, int arg2) {
        ++field9141;
        if (arg2 != 34065) {
            this.method85(-107, true, 28);
        }
        int var4 = this.field9129 * arg1 >> 12;
        int var5 = this.field9131 * arg1 >> 12;
        int var6 = this.field9135 * arg0 >> 12;
        int var7 = this.field9138 * arg0 >> 12;
        class721.method4042(var6, var7, super.field10305, var5, 10226, super.field10310, var4);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)V")
    public static void method3704(byte arg0) {
        field9130 = null;
        if (arg0 > -40) {
            field9140 = -7;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIBII)V")
    public static final void method3705(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != 11) {
            method3704((byte) 121);
        }
        if (~class377.field5458 >= ~arg4 && arg4 <= class362.field5291) {
            int var5 = class183.method1292(class200.field2976, -1, class204.field3061, arg1);
            int var6 = class183.method1292(class200.field2976, -1, class204.field3061, arg3);
            class684.method3883((byte) -9, arg4, arg0, var5, var6);
        }
        ++field9137;
    }

    static {
        int var0 = 0;
        field9130 = new byte[32896];
        for (int var1 = 0; ~var1 > -257; ++var1) {
            for (int var2 = 0; var1 >= var2; ++var2) {
                field9130[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + (var2 * var2 - -65535)) / 65535.0F))));
            }
        }
        field9139 = 1338;
        field9133 = -2;
    }
}
