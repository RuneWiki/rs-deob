import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class459 extends class379 {

    @OriginalMember(owner = "client!mm", name = "M", descriptor = "I")
    public int field6239;

    @OriginalMember(owner = "client!mm", name = "O", descriptor = "I")
    public int field6241;

    @OriginalMember(owner = "client!mm", name = "Q", descriptor = "Z")
    public boolean field6243;

    @OriginalMember(owner = "client!mm", name = "P", descriptor = "F")
    public float field6242;

    @OriginalMember(owner = "client!mm", name = "N", descriptor = "F")
    public float field6240;

    @OriginalMember(owner = "client!mm", name = "R", descriptor = "[C")
    private static char[] field6244 = new char[64];

    @OriginalMember(owner = "client!mm", name = "S", descriptor = "Lcb;")
    public static class318 field6245;

    @OriginalMember(owner = "client!mm", name = "L", descriptor = "I")
    public static int field6238;

    @OriginalMember(owner = "client!mm", name = "T", descriptor = "I")
    public static int field6246;

    static {
        for (int var0 = 0; ~var0 > -27; ++var0) {
            field6244[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; ++var1) {
            field6244[var1] = (char) (var1 + 97 + -26);
        }
        for (int var2 = 52; var2 < 62; ++var2) {
            field6244[var2] = (char) (var2 - 52 + 48);
        }
        field6244[62] = '*';
        field6244[63] = '-';
        field6245 = new class318(55, -2);
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lpea;IIIIIZ)V", line = 4)
    public class459(class641 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field6239 = arg4;
        this.field6241 = arg5;
        if (super.field3500 != 34037) {
            this.field6243 = true;
            this.field6240 = this.field6242 = 1.0F;
        } else {
            this.field6242 = (float) arg5;
            this.field6243 = false;
            this.field6240 = (float) arg4;
        }
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(I)V", line = 27)
    public static void method2594(int arg0) {
        field6244 = null;
        if (arg0 != 48) {
            method2594(-32);
        }
        field6245 = null;
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lpea;IIIZ[I)V", line = 39)
    public class459(class641 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field6241 = arg3;
        this.field6239 = arg2;
        if (super.field3500 == 34037) {
            this.field6243 = false;
            this.field6242 = (float) arg3;
            this.field6240 = (float) arg2;
        } else {
            this.field6240 = this.field6242 = 1.0F;
            this.field6243 = true;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IBI)V", line = 60)
    public static final void method2595(int arg0, byte arg1, int arg2) {
        if (arg1 <= 49) {
            method2595(-6, (byte) 95, -104);
        }
        ++field6238;
        class19 var3 = class364.method2236(1248116640, arg2, 13);
        var3.method110(12142);
        var3.field171 = arg0;
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lpea;IIII[I)V", line = 74)
    public class459(class641 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field6241 = arg2;
        this.field6239 = arg1;
        this.method2298(0, 6008, 0, arg5, arg2, 0, true, arg1, 0);
        this.field6243 = false;
        this.field6242 = (float) arg2 / (float) arg4;
        this.field6240 = (float) arg1 / (float) arg3;
        this.method2299(-68, false, false);
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lpea;IIIIZ[BI)V", line = 91)
    public class459(class641 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field6239 = arg3;
        if (~super.field3500 == -34038) {
            this.field6243 = false;
            this.field6242 = (float) arg4;
            this.field6240 = (float) arg3;
        } else {
            this.field6240 = this.field6242 = 1.0F;
            this.field6243 = true;
        }
        this.field6241 = arg4;
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lpea;IIIII[BI)V", line = 140)
    public class459(class641 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field6241 = arg3;
        this.field6239 = arg2;
        this.method2295(0, arg3, arg2, arg6, 0, 0, arg7, 0, true, true);
        this.field6243 = false;
        this.field6240 = (float) arg2 / (float) arg4;
        this.field6242 = (float) arg3 / (float) arg5;
        this.method2299(-92, false, false);
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lpea;IIIIIIZ)V", line = 161)
    public class459(class641 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field6240 = (float) arg3 / (float) arg5;
        this.field6242 = (float) arg4 / (float) arg6;
        this.field6243 = false;
        this.field6241 = arg4;
        this.field6239 = arg3;
        this.method2299(-128, false, false);
    }
}
