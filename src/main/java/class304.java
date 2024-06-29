import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public abstract class class304 extends class54 {

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "Z")
    public boolean field4316;

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "I")
    public int field4322;

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "B")
    public byte field4319;

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "I")
    public int field4317;

    @OriginalMember(owner = "client!nm", name = "x", descriptor = "B")
    public byte field4336;

    @OriginalMember(owner = "client!nm", name = "p", descriptor = "S")
    public short field4328;

    @OriginalMember(owner = "client!nm", name = "s", descriptor = "I")
    public int field4331;

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "S")
    public short field4330;

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "S")
    public short field4324;

    @OriginalMember(owner = "client!nm", name = "v", descriptor = "S")
    public short field4334;

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field4326 = new Rectangle[100];

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "Z")
    public static boolean field4318 = false;

    @OriginalMember(owner = "client!nm", name = "o", descriptor = "I")
    public static int field4327 = 0;

    @OriginalMember(owner = "client!nm", name = "w", descriptor = "[C")
    public static char[] field4335 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "I")
    public int field4321;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!nm", name = "q", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!nm", name = "t", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!nm", name = "u", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILdt;II)V")
    public static final void method1883(int arg0, class145 arg1, int arg2, int arg3) {
        class481.field6762 = arg1;
        field4325++;
        if (arg0 <= 80) {
            field4326 = null;
        }
        class448.field6194 = arg3;
        class460.field6457 = arg2;
    }

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "(I)V")
    public static final void method1884(int arg0) {
        field4329++;
        if (arg0 != -16357) {
            method1887(false);
        }
        if (class413.field5818) {
            class320.field4650 = null;
            class413.field5818 = false;
            class330.field4784 = null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "(I)V")
    public static final void method1885(int arg0) {
        class26.field346 = null;
        if (arg0 != 872) {
            field4327 = 41;
        }
        class61.field801 = -1;
        field4320++;
    }

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "(I)V")
    public void method922(int arg0) {
        field4332++;
        if (arg0 != 200) {
            method1883(-68, (class145) null, -44, 30);
        }
    }

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "(I)V")
    public static final void method1886(int arg0) {
        class364.field5236.method2771(arg0 ^ 0xFFFFDFE1);
        field4323++;
        if (arg0 != 8218) {
            field4327 = -47;
        }
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(Z)V")
    public static void method1887(boolean arg0) {
        field4326 = null;
        field4335 = null;
        if (arg0) {
            field4326 = null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "(I)I")
    public abstract int method323(int arg0);

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(IIIIIIIIZB)V")
    public class304(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field4316 = arg8;
        this.field4322 = (short) arg2;
        this.field4319 = (byte) arg0;
        this.field4317 = (short) arg3;
        this.field4336 = arg9;
        this.field4328 = (short) arg5;
        this.field4331 = (short) arg1;
        this.field4330 = (short) arg4;
        this.field4324 = (short) arg6;
        this.field4334 = (short) arg7;
    }
}
