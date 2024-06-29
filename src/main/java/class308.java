import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public class class308 extends class159 implements class622 {

    @OriginalMember(owner = "client!gga", name = "r", descriptor = "[I")
    public static int[] field4373 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!gga", name = "t", descriptor = "C")
    public char field4375;

    @OriginalMember(owner = "client!gga", name = "l", descriptor = "I")
    public int field4367;

    @OriginalMember(owner = "client!gga", name = "m", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!gga", name = "n", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!gga", name = "o", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!gga", name = "p", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!gga", name = "q", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!gga", name = "s", descriptor = "I")
    public int field4374;

    @OriginalMember(owner = "client!gga", name = "u", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!gga", name = "v", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!gga", name = "w", descriptor = "I")
    public int field4378;

    @OriginalMember(owner = "client!gga", name = "x", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!gga", name = "k", descriptor = "J")
    public long field4366;

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(Z)J")
    public final long method1987(boolean arg0) {
        if (arg0) {
            field4369++;
            return this.field4366;
        } else {
            return 52L;
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(I[BII)[B")
    public static final byte[] method1988(int arg0, byte[] arg1, int arg2, int arg3) {
        field4370++;
        byte[] var4 = new byte[arg3];
        class421.method2534(arg1, arg0, var4, arg2, arg3);
        return var4;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(B)C")
    public final char method1989(byte arg0) {
        int var2 = 28 / ((10 - arg0) / 39);
        field4372++;
        return this.field4375;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "([BIZ)[B")
    public static final byte[] method1990(byte[] arg0, int arg1, boolean arg2) {
        field4371++;
        byte[] var3 = new byte[arg1];
        class421.method2534(arg0, 0, var3, 0, arg1);
        if (!arg2) {
            field4376 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(I)I")
    public final int method1991(int arg0) {
        if (arg0 != 32262) {
            this.field4375 = ';';
        }
        field4379++;
        return this.field4367;
    }

    @OriginalMember(owner = "client!gga", name = "f", descriptor = "(I)V")
    public static void method1992(int arg0) {
        if (arg0 == -30677) {
            field4373 = null;
        }
    }

    @OriginalMember(owner = "client!gga", name = "c", descriptor = "(I)I")
    public final int method1993(int arg0) {
        field4368++;
        return arg0 == 15733 ? this.field4374 : 87;
    }

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "(I)I")
    public final int method1994(int arg0) {
        if (arg0 > -16) {
            this.field4366 = 59L;
        }
        field4377++;
        return this.field4378;
    }
}
