import java.awt.Frame;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class155 {

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "Ljf;")
    public static class229 field2642 = class212.method1457((byte) 77, "Cache:");

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field2648 = 0;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2646 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "Z")
    public static boolean field2650 = false;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "Ljava/awt/Frame;")
    public static Frame field2641;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IB[I[Ljava/lang/Object;I)V", line = 6)
    public static final void method1037(int arg0, byte arg1, int[] arg2, Object[] arg3, int arg4) {
        field2649++;
        if (arg0 > arg4) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg2[var5];
            arg2[var5] = arg2[arg0];
            int var7 = arg4;
            arg2[arg0] = var6;
            Object var8 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var8;
            for (int var9 = arg4; var9 < arg0; var9++) {
                if (arg2[var9] < ((var9 & 0x1) + var6)) {
                    int var10 = arg2[var9];
                    arg2[var9] = arg2[var7];
                    arg2[var7] = var10;
                    Object var11 = arg3[var9];
                    arg3[var9] = arg3[var7];
                    arg3[var7++] = var11;
                }
            }
            arg2[arg0] = arg2[var7];
            arg2[var7] = var6;
            arg3[arg0] = arg3[var7];
            arg3[var7] = var8;
            method1037(var7 - 1, (byte) 0, arg2, arg3, arg4);
            method1037(arg0, (byte) 0, arg2, arg3, var7 + 1);
        }
        if (arg1 != 0) {
            field2641 = (Frame) null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z[F)[F", line = 60)
    public static final float[] method1038(boolean arg0, float[] arg1) {
        field2644++;
        if (arg1 == null) {
            return null;
        } else if (arg0) {
            return (float[]) null;
        } else {
            float[] var2 = new float[arg1.length];
            class36.method323(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BLbf;)V", line = 109)
    public static final void method1039(byte arg0, class331 arg1) {
        field2643++;
        for (class165 var2 = (class165) class125.field2203.method2078(-113); var2 != null; var2 = (class165) class125.field2203.method2080(5)) {
            if (var2.field2830 == arg1) {
                if (var2.field2834 != null) {
                    class104.field1816.method613(var2.field2834);
                    var2.field2834 = null;
                }
                var2.method1747((byte) -49);
                return;
            }
        }
        if (arg0 < 0) {
            field2650 = true;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V", line = 148)
    public static void method1040(boolean arg0) {
        field2641 = null;
        field2642 = null;
        field2646 = null;
        if (arg0) {
            method1037(-75, (byte) 7, (int[]) null, (Object[]) null, 15);
        }
    }
}
