import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class714 implements class718 {

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "Ljr;")
    private class121 field9735;

    @OriginalMember(owner = "client!bs", name = "h", descriptor = "[I")
    public int[] field9741;

    @OriginalMember(owner = "client!bs", name = "k", descriptor = "I")
    public int field9744;

    @OriginalMember(owner = "client!bs", name = "l", descriptor = "I")
    public int field9745;

    @OriginalMember(owner = "client!bs", name = "j", descriptor = "Llo;")
    private class785 field9743;

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "[F")
    public float[] field9739;

    @OriginalMember(owner = "client!bs", name = "g", descriptor = "Z")
    public static boolean field9740 = false;

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "I")
    public static int field9736;

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "I")
    public static int field9737;

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "I")
    public static int field9738;

    @OriginalMember(owner = "client!bs", name = "i", descriptor = "I")
    public static int field9742;

    @OriginalMember(owner = "client!bs", name = "m", descriptor = "I")
    public static int field9746;

    @OriginalMember(owner = "client!bs", name = "n", descriptor = "I")
    public static int field9747;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "[I")
    public static int[] field9734;

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(IIIIIIZZ)V", line = 7)
    public final void method3505(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        class593.method3332(61, arg0, arg7 ? this.field9735.field1671 : null, arg6 ? this.field9741 : null, this.field9735.field1629.field8584, arg7 ? this.field9739 : null, arg5, arg4, this.field9744, this.field9735.field1629.field8586, arg3, arg2, arg1);
        field9737++;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "([[SB[[F)[[S", line = 17)
    public static final short[][] method3954(short[][] arg0, byte arg1, float[][] arg2) {
        field9738++;
        for (int var3 = 0; var3 < arg2.length; var3++) {
            for (int var5 = 0; var5 < arg0[var3].length; var5++) {
                arg0[var3][var5] = (short) ((int) (arg2[var3][var5] * 16383.0F));
            }
        }
        int var4 = -43 % ((41 - arg1) / 60);
        return arg0;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(III)V", line = 44)
    public static final void method3955(int arg0, int arg1, int arg2) {
        if (class289.field4115 != 0) {
            if (arg1 < 0) {
                for (int var3 = 0; var3 < 16; var3++) {
                    field9734[var3] = arg2;
                }
            } else {
                field9734[arg1] = arg2;
            }
        }
        field9736++;
        class311.field4406.method399(arg1, arg0, arg2);
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)V", line = 80)
    public static void method3956(int arg0) {
        if (arg0 != 0) {
            field9734 = null;
        }
        field9734 = null;
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(I)Lej;", line = 90)
    public static final class133 method3957(int arg0) {
        field9746++;
        try {
            return arg0 == 4 ? (class133) Class.forName("ne").getDeclaredConstructor().newInstance() : null;
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(ILha;II)V", line = 108)
    public static final void method3958(int arg0, class66 arg1, int arg2, int arg3) {
        class171.field2240 = new class74[arg3][arg0];
        if (arg2 != 1) {
            method3955(-118, 54, 62);
        }
        class593.field8098 = arg1;
        field9747++;
        if (class90.field1265 != null) {
            class388.field5625 = class762.method4201(class90.field1265[0], class90.field1265[3], class90.field1265[2], class90.field1265[1], class90.field1265[4], arg2 ^ 0x1, class90.field1265[5]);
        }
        class753.field10201 = new class74();
        class302.method1951((byte) -48);
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIIIIIZZ)V", line = 126)
    public final void method3507(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        class593.method3332(102, arg0, arg7 ? this.field9739 : null, arg6 ? this.field9735.field1629.field8586 : null, this.field9744, arg7 ? this.field9735.field1671 : null, arg5, arg4, this.field9735.field1629.field8584, this.field9741, arg3, arg2, arg1);
        field9742++;
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Ljr;Lhh;Llo;)V", line = 138)
    public class714(class121 arg0, class140 arg1, class785 arg2) {
        this.field9735 = arg0;
        if (arg1 instanceof class218) {
            class218 var4 = (class218) arg1;
            this.field9741 = var4.field2838;
            this.field9744 = var4.field5296;
            this.field9745 = var4.field5300;
        } else if ((arg1 instanceof class686)) {
            class686 var5 = (class686) arg1;
            this.field9741 = var5.field9178;
            this.field9745 = var5.field5300;
            this.field9744 = var5.field5296;
        } else {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            this.field9743 = arg2;
            if (this.field9743.field10789 != this.field9744 || this.field9743.field10790 != this.field9745) {
                throw new RuntimeException();
            }
            this.field9739 = this.field9743.field10792;
        }
    }
}
