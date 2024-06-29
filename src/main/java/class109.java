import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class109 extends class59 {

    @OriginalMember(owner = "client!ma", name = "S", descriptor = "Lsd;")
    public static class166 field2112 = class135.method935("mapedge", 0);

    @OriginalMember(owner = "client!ma", name = "T", descriptor = "Lsd;")
    public static class166 field2113 = class135.method935("k", 0);

    @OriginalMember(owner = "client!ma", name = "W", descriptor = "Lsd;")
    public static class166 field2116 = class135.method935("headicons_prayer", 0);

    @OriginalMember(owner = "client!ma", name = "X", descriptor = "I")
    public static int field2117 = 0;

    @OriginalMember(owner = "client!ma", name = "V", descriptor = "Lsd;")
    public static class166 field2115 = class135.method935("und loggen sich dann erneut ein)3", 0);

    @OriginalMember(owner = "client!ma", name = "Z", descriptor = "Lsd;")
    public static class166 field2119 = class135.method935("p11_full", 0);

    @OriginalMember(owner = "client!ma", name = "U", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!ma", name = "Y", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!ma", name = "ab", descriptor = "Ljava/awt/Image;")
    public static Image field2120;

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
    public class109() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "(I)V")
    public static void method795(int arg0) {
        if (arg0 != -9464) {
            method796(-53, (byte) 92, -67);
        }
        field2119 = null;
        field2116 = null;
        field2120 = null;
        field2112 = null;
        field2115 = null;
        field2113 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IBI)V")
    public static final void method796(int arg0, byte arg1, int arg2) {
        ++field2118;
        if (class180.field3411 == 2) {
            if (arg1 > -25) {
                method795(122);
            }
            class16.method88((class43.field776 - class147.field2901 << 7) + class187.field3577, -11931, class31.field578 * 2, (-class170.field3279 + class88.field1742 << 7) - -class35.field659);
            if (~class52.field943 < 0 && class49.field910 % 20 < 10) {
                class159.field3045[0].method1055(class52.field943 + -12 + arg0, arg2 - -class29.field532 + -28);
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(IB)[I")
    public final int[] method36(int arg0, byte arg1) {
        if (arg1 > -124) {
            return null;
        } else {
            ++field2114;
            int[] var3 = super.field1219.method721(arg0, -125);
            if (super.field1219.field1816) {
                int[][] var4 = this.method498(arg0, 0, 0);
                int[] var5 = var4[1];
                int[] var6 = var4[2];
                int[] var7 = var4[0];
                for (int var8 = 0; ~class98.field1879 < ~var8; ++var8) {
                    var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
                }
            }
            return var3;
        }
    }
}
