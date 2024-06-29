import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class294 extends class275 {

    @OriginalMember(owner = "client!q", name = "t", descriptor = "I")
    private int field4226;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "I")
    private int field4225;

    @OriginalMember(owner = "client!q", name = "x", descriptor = "I")
    private int field4230;

    @OriginalMember(owner = "client!q", name = "z", descriptor = "I")
    private int field4232;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "Lgk;")
    public static class331 field4224 = new class331("yellow:", "gelb:", "jaune:", "amarelo:");

    @OriginalMember(owner = "client!q", name = "p", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!q", name = "q", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!q", name = "u", descriptor = "I")
    private int field4227;

    @OriginalMember(owner = "client!q", name = "v", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!q", name = "w", descriptor = "I")
    private int field4229;

    @OriginalMember(owner = "client!q", name = "y", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!q", name = "A", descriptor = "I")
    private int field4233;

    @OriginalMember(owner = "client!q", name = "B", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!q", name = "C", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!q", name = "E", descriptor = "I")
    private int field4237;

    @OriginalMember(owner = "client!q", name = "D", descriptor = "[B")
    private byte[] field4236;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIZ)V")
    public final void method1076(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.field4237 = -22;
        }
        if (arg0 == 0) {
            this.field4237 = this.field4226 - (arg1 >= 0 ? arg1 : -arg1);
            this.field4229 = 4096;
            this.field4237 = this.field4237 * this.field4237 >> 12;
            this.field4227 = this.field4237;
        } else {
            this.field4229 = this.field4237 * this.field4225 >> 12;
            this.field4237 = this.field4226 - (arg1 < 0 ? -arg1 : arg1);
            if (this.field4229 < 0) {
                this.field4229 = 0;
            } else if (this.field4229 > 4096) {
                this.field4229 = 4096;
            }
            this.field4237 = this.field4237 * this.field4237 >> 12;
            this.field4237 = this.field4237 * this.field4229 >> 12;
            this.field4227 += this.field4237 * this.field4232 >> 12;
            this.field4232 = this.field4232 * this.field4230 >> 12;
        }
        field4228++;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(FIFF)F")
    public static final float method1860(float arg0, int arg1, float arg2, float arg3) {
        field4234++;
        return arg1 == 4449 ? (arg3 - arg2) * arg0 + arg2 : -0.6757636F;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class294(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field4226 = (int) (arg6 * 4096.0F);
        this.field4225 = (int) (arg7 * 4096.0F);
        this.field4232 = this.field4230 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BII)V")
    public void method1861(byte arg0, int arg1, int arg2) {
        field4231++;
        this.field4236[arg1] = arg0;
        int var4 = 117 % ((-arg2 - 21) / 51);
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(I)V")
    public final void method1078(int arg0) {
        if (arg0 >= -54) {
            this.field4236 = null;
        }
        this.field4227 = 0;
        field4223++;
        this.field4233 = 0;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ICI)C")
    public static final char method1862(int arg0, char arg1, int arg2) {
        field4222++;
        if (arg0 >= -68) {
            return (char) 65469;
        }
        if (arg1 >= 'À' && arg1 <= 'ÿ') {
            if (arg1 >= 'À' && arg1 <= 'Æ') {
                return 'A';
            }
            if (arg1 == 'Ç') {
                return 'C';
            }
            if (arg1 >= 'È' && arg1 <= 'Ë') {
                return 'E';
            }
            if (arg1 >= 'Ì' && arg1 <= 'Ï') {
                return 'I';
            }
            if (arg1 == 'Ñ' && arg2 != 0) {
                return 'N';
            }
            if (arg1 >= 'Ò' && arg1 <= 'Ö') {
                return 'O';
            }
            if (arg1 >= 'Ù' && arg1 <= 'Ü') {
                return 'U';
            }
            if (arg1 == 'Ý') {
                return 'Y';
            }
            if (arg1 == 'ß') {
                return 's';
            }
            if (arg1 >= 'à' && arg1 <= 'æ') {
                return 'a';
            }
            if (arg1 == 'ç') {
                return 'c';
            }
            if (arg1 >= 'è' && arg1 <= 'ë') {
                return 'e';
            }
            if (arg1 >= 'ì' && arg1 <= 'ï') {
                return 'i';
            }
            if (arg1 == 'ñ' && arg2 != 0) {
                return 'n';
            }
            if (arg1 >= 'ò' && arg1 <= 'ö') {
                return 'o';
            }
            if (arg1 >= 'ù' && arg1 <= 'ü') {
                return 'u';
            }
            if (arg1 == 'ý' || arg1 == 'ÿ') {
                return 'y';
            }
        }
        if (arg1 == 'Œ') {
            return 'O';
        } else if (arg1 == 'œ') {
            return 'o';
        } else if (arg1 == 'Ÿ') {
            return 'Y';
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V")
    public final void method1074(byte arg0) {
        this.field4227 >>= 0x4;
        this.field4232 = this.field4230;
        field4235++;
        if (this.field4227 < 0) {
            this.field4227 = 0;
        } else if (this.field4227 > 255) {
            this.field4227 = 255;
        }
        this.method1861((byte) this.field4227, this.field4233++, 52);
        if (arg0 <= -55) {
            this.field4227 = 0;
        }
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(B)V")
    public static void method1863(byte arg0) {
        if (arg0 == -23) {
            field4224 = null;
        }
    }
}
