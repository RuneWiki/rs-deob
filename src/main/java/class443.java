import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public class class443 extends class629 {

    @OriginalMember(owner = "client!oga", name = "y", descriptor = "[I")
    private int[] field6074 = new int[this.field8483];

    @OriginalMember(owner = "client!oga", name = "t", descriptor = "Lpca;")
    public static class671 field6069 = new class671("runescape", 0);

    @OriginalMember(owner = "client!oga", name = "u", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field6070 = new Rectangle[100];

    @OriginalMember(owner = "client!oga", name = "z", descriptor = "Ldb;")
    public static class298 field6075;

    @OriginalMember(owner = "client!oga", name = "m", descriptor = "I")
    public static int field6062;

    @OriginalMember(owner = "client!oga", name = "n", descriptor = "I")
    public static int field6063;

    @OriginalMember(owner = "client!oga", name = "o", descriptor = "I")
    public static int field6064;

    @OriginalMember(owner = "client!oga", name = "p", descriptor = "I")
    public static int field6065;

    @OriginalMember(owner = "client!oga", name = "q", descriptor = "I")
    private int field6066;

    @OriginalMember(owner = "client!oga", name = "r", descriptor = "I")
    public static int field6067;

    @OriginalMember(owner = "client!oga", name = "v", descriptor = "I")
    public static int field6071;

    @OriginalMember(owner = "client!oga", name = "x", descriptor = "I")
    public static int field6073;

    @OriginalMember(owner = "client!oga", name = "A", descriptor = "I")
    public static int field6076;

    @OriginalMember(owner = "client!oga", name = "B", descriptor = "I")
    private int field6077;

    @OriginalMember(owner = "client!oga", name = "w", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field6072;

    @OriginalMember(owner = "client!oga", name = "s", descriptor = "[B")
    private byte[] field6068;

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2500(int arg0, byte arg1, int arg2) {
        ++field6065;
        if (arg1 != 72) {
            field6072 = null;
        }
        return (2048 & arg2) != 0 && (arg0 & 55) != 0;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(IILcp;Lrt;BIIIIIII)V")
    public static final void method2501(int arg0, int arg1, class679 arg2, class212 arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        class699.field9822 = arg7;
        class540.field7120 = arg1;
        class164.field2573 = arg5;
        class253.field3472 = arg6;
        class199.field2899 = arg0;
        class62.field929 = null;
        ++field6073;
        class62.field960 = arg2;
        class24.field418 = null;
        class441.field6052 = arg8;
        class524.field6988 = arg9;
        if (arg4 != -92) {
            field6070 = null;
        }
        class642.field8625 = null;
        class360.field4870 = arg10;
        class232.field3255 = arg11;
        class32.field523 = arg3;
        class18.method186(-2);
        class314.field4319 = true;
    }

    @OriginalMember(owner = "client!oga", name = "d", descriptor = "(I)V")
    public static void method2502(int arg0) {
        field6070 = null;
        if (arg0 != -4097) {
            method2501(-83, 81, (class679) null, (class212) null, (byte) 124, -123, -8, 13, 115, 123, -103, -26);
        }
        field6072 = null;
        field6069 = null;
        field6075 = null;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(I)V")
    public final void method974(int arg0) {
        this.field6066 = 0;
        this.field6077 = 0;
        if (arg0 == 4) {
            ++field6067;
        }
    }

    @OriginalMember(owner = "client!oga", name = "c", descriptor = "(I)V")
    public final void method980(int arg0) {
        ++field6076;
        this.field6066 = Math.abs(this.field6066);
        int var2 = -14 / ((arg0 - -43) / 42);
        if (~this.field6066 <= -4097) {
            this.field6066 = 4095;
        }
        this.method1146((byte) (this.field6066 >> 4), this.field6077++, (byte) 68);
        this.field6066 = 0;
    }

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "(B)V")
    public static final void method2503(byte arg0) {
        class504.field6729 = 0;
        class476.field6353 = -1;
        int var1 = 0 / ((-80 - arg0) / 37);
        class123.field2061 = -1;
        ++field6062;
        class138.field2239 = -1;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(IZI)V")
    public final void method978(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.field6066 += this.field6074[arg0] * arg2 >> 12;
            ++field6063;
        }
    }

    @OriginalMember(owner = "client!oga", name = "<init>", descriptor = "(IIIIIF)V")
    public class443(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; super.field8483 > var7; ++var7) {
            this.field6074[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(BIB)V")
    public void method1146(byte arg0, int arg1, byte arg2) {
        this.field6068[this.field6077++] = (byte) (127 + class571.method3139(127, arg0 >> 1));
        ++field6064;
        int var4 = 101 % ((arg2 - 2) / 62);
    }

    static {
        for (int var0 = 0; ~var0 > -101; ++var0) {
            field6070[var0] = new Rectangle();
        }
        field6075 = new class298(86, 3);
    }
}
