import java.io.FileOutputStream;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aia")
public class class239 extends class17 {

    @OriginalMember(owner = "client!aia", name = "u", descriptor = "I")
    private int field3585;

    @OriginalMember(owner = "client!aia", name = "o", descriptor = "I")
    private int field3579;

    @OriginalMember(owner = "client!aia", name = "w", descriptor = "I")
    private int field3587;

    @OriginalMember(owner = "client!aia", name = "q", descriptor = "I")
    private int field3581;

    @OriginalMember(owner = "client!aia", name = "p", descriptor = "Loo;")
    public static class652 field3580 = new class652(8);

    @OriginalMember(owner = "client!aia", name = "s", descriptor = "Lok;")
    public static class266 field3583 = new class266();

    @OriginalMember(owner = "client!aia", name = "r", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!aia", name = "t", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!aia", name = "v", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!aia", name = "x", descriptor = "I")
    private int field3588;

    @OriginalMember(owner = "client!aia", name = "y", descriptor = "I")
    private int field3589;

    @OriginalMember(owner = "client!aia", name = "z", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!aia", name = "A", descriptor = "I")
    private int field3591;

    @OriginalMember(owner = "client!aia", name = "D", descriptor = "I")
    private int field3594;

    @OriginalMember(owner = "client!aia", name = "E", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!aia", name = "B", descriptor = "Ljava/io/FileOutputStream;")
    public static FileOutputStream field3592;

    @OriginalMember(owner = "client!aia", name = "C", descriptor = "[B")
    private byte[] field3593;

    @OriginalMember(owner = "client!aia", name = "b", descriptor = "(I)V")
    public static void method1595(int arg0) {
        field3580 = null;
        field3583 = null;
        if (arg0 >= -92) {
            field3580 = null;
        }
        field3592 = null;
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(BIB)V")
    public void method1596(byte arg0, int arg1, byte arg2) {
        if (arg0 == 91) {
            this.field3593[arg1] = arg2;
            field3584++;
        }
    }

    @OriginalMember(owner = "client!aia", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class239(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field3585 = (int) (arg6 * 4096.0F);
        this.field3579 = (int) (arg7 * 4096.0F);
        this.field3581 = this.field3587 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(B)V")
    public final void method157(byte arg0) {
        int var2 = 38 / ((1 - arg0) / 43);
        field3586++;
        this.field3594 = 0;
        this.field3591 = 0;
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(I)V")
    public final void method162(int arg0) {
        field3582++;
        this.field3591 >>= 0x4;
        this.field3581 = this.field3587;
        if (this.field3591 < 0) {
            this.field3591 = 0;
        } else if (this.field3591 > 255) {
            this.field3591 = 255;
        }
        this.method1596((byte) 91, this.field3594++, (byte) this.field3591);
        this.field3591 = arg0;
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(IZI)V")
    public final void method159(int arg0, boolean arg1, int arg2) {
        if (arg0 == 0) {
            this.field3588 = this.field3585 - (arg2 < 0 ? -arg2 : arg2);
            this.field3589 = 4096;
            this.field3588 = this.field3588 * this.field3588 >> 12;
            this.field3591 = this.field3588;
        } else {
            this.field3589 = this.field3588 * this.field3579 >> 12;
            if (this.field3589 < 0) {
                this.field3589 = 0;
            } else if (this.field3589 > 4096) {
                this.field3589 = 4096;
            }
            this.field3588 = this.field3585 - (arg2 < 0 ? -arg2 : arg2);
            this.field3588 = this.field3588 * this.field3588 >> 12;
            this.field3588 = this.field3589 * this.field3588 >> 12;
            this.field3591 += this.field3588 * this.field3581 >> 12;
            this.field3581 = this.field3587 * this.field3581 >> 12;
        }
        if (!arg1) {
            field3595++;
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(IIJZ)Ljava/lang/String;")
    public static final String method1597(int arg0, int arg1, long arg2, boolean arg3) {
        field3590++;
        Calendar var5;
        if (arg3) {
            class12.method135(9281, arg2);
            var5 = class4.field31;
        } else {
            class193.method1338(arg2, arg1 - 114);
            var5 = class4.field30;
        }
        int var6 = var5.get(arg1);
        int var7 = var5.get(2);
        int var8 = var5.get(1);
        int var9 = var5.get(11);
        int var10 = var5.get(12);
        return arg0 == 3 ? class276.method1800(arg0, (byte) 118, arg2, arg3) : Integer.toString(var6 / 10) + var6 % 10 + "-" + class159.field2546[arg0][var7] + "-" + var8 + " " + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
    }
}
