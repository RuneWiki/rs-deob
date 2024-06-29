import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class4 {

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "S")
    public static short field70 = 32767;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "Lnc;")
    public static class161 field72;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "[[B")
    public static byte[][] field69;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lrf;IB)V", line = 16)
    public static final void method24(class263 arg0, int arg1, byte arg2) {
        if (arg0.field4200 > class240.field3818) {
            class336.method2344(-11685, arg0);
        } else if (arg0.field4252 >= class240.field3818) {
            class80.method549(arg0, 128);
        } else {
            class323.method2264((byte) -6, arg0);
        }
        if (arg0.field4255 < 128 || arg0.field4264 < 128 || arg0.field4255 >= 13184 || arg0.field4264 >= 13184) {
            arg0.field4268 = -1;
            arg0.field4278 = -1;
            arg0.field4200 = 0;
            arg0.field4252 = 0;
            arg0.field4255 = arg0.field4248[0] * 128 + arg0.method1881(-20395) * 64;
            arg0.field4264 = arg0.field4184[0] * 128 + (arg0.method1881(-20395) * 64);
            arg0.method1878(2);
        }
        if (class191.field3129 == arg0 && (arg0.field4255 < 1536 || arg0.field4264 < 1536 || arg0.field4255 >= 11776 || arg0.field4264 >= 11776)) {
            arg0.field4278 = -1;
            arg0.field4200 = 0;
            arg0.field4252 = 0;
            arg0.field4268 = -1;
            arg0.field4255 = arg0.field4248[0] * 128 + arg0.method1881(-20395) * 64;
            arg0.field4264 = arg0.field4184[0] * 128 + arg0.method1881(-20395) * 64;
            arg0.method1878(2);
        }
        int var3 = -54 % ((-arg2 - 20) / 49);
        class133.method975(-1, arg0);
        class318.method2241(-90, arg0);
        field68++;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B[F)[F", line = 69)
    public static final float[] method25(byte arg0, float[] arg1) {
        field71++;
        if (arg1 == null) {
            return null;
        }
        float[] var2 = new float[arg1.length];
        class9.method45(arg1, 0, var2, 0, arg1.length);
        if (arg0 < 67) {
            method25((byte) 18, (float[]) null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V", line = 88)
    public static void method26(boolean arg0) {
        field72 = null;
        field69 = (byte[][]) null;
        if (arg0) {
            field72 = (class161) null;
        }
    }
}
