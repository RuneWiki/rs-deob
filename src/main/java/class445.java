import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class445 extends Canvas {

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "Ljava/awt/Component;")
    private Component field6183;

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
    public static int field6185 = -1;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "F")
    public static float field6184;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
    public static int field6178;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
    public static int field6179;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
    public static int field6180;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
    public static int field6181;

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
    public static int field6182;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "I")
    public static int field6186;

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 10)
    public class445(Component arg0) {
        this.field6183 = arg0;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V", line = 21)
    public static final void method2494(byte arg0) {
        field6182++;
        if (class713.field9949 == 7) {
            class727.method4076(false, false);
            return;
        }
        class347.field4621 = class582.field8161;
        class582.field8161 = null;
        if (arg0 == 104) {
            class237.method1429(13, false);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIIIIII)V", line = 44)
    public static final void method2495(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6186++;
        if (arg5 < ~arg6 || arg1 < 1 || arg6 > (class272.field3589 - 2) || class3.field26 - 2 < arg1) {
            return;
        }
        int var9 = arg4;
        if (arg4 < 3 && class669.method3767(arg1, (byte) -88, arg6)) {
            var9 = arg4 + 1;
        }
        if (class11.field68.field5548.method186((byte) 122) == 0 && !class351.method2038(arg1, var9, arg6, class131.field1693, 55)) {
            return;
        }
        if (class77.field947 == null) {
            return;
        }
        class78.field1060.method4228(arg1, arg4, class21.field142, class171.field2130[arg4], 1, arg2, arg6);
        if (arg0 < 0) {
            return;
        }
        int var10 = class11.field68.field5498.method4055((byte) 122);
        class11.field68.method2276((byte) -13, 1, class11.field68.field5498);
        class78.field1060.method4226(arg0, arg1, arg7, var9, false, arg6, class21.field142, arg3, arg8, arg4, class171.field2130[arg4]);
        class11.field68.method2276((byte) -13, var10, class11.field68.field5498);
        return;
    }

    @OriginalMember(owner = "client!bn", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 82)
    public final void paint(Graphics arg0) {
        field6178++;
        this.field6183.paint(arg0);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILuv;I[II[I)Lhu;", line = 90)
    public static final class133 method2496(int arg0, class367 arg1, int arg2, int[] arg3, int arg4, int[] arg5) {
        if (arg4 <= 70) {
            method2495(108, -86, 41, 17, 85, 52, -105, 11, 108);
        }
        field6181++;
        if (!arg1.method1315(0, class695.field9710, class594.field8277)) {
            int[] var6 = new int[arg0 * arg2];
            for (int var7 = 0; var7 < arg0; var7++) {
                int var8 = arg2 * var7 + arg3[var7];
                for (int var9 = 0; var9 < arg5[var7]; var9++) {
                    var6[var8++] = -16777216;
                }
            }
            return new class133(arg1, arg2, arg0, var6);
        }
        byte[] var10 = new byte[arg0 * arg2];
        for (int var11 = 0; var11 < arg0; var11++) {
            int var12 = arg2 * var11 + arg3[var11];
            for (int var13 = 0; var13 < arg5[var11]; var13++) {
                var10[var12++] = -1;
            }
        }
        return new class133(arg1, arg2, arg0, var10);
    }

    @OriginalMember(owner = "client!bn", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 147)
    public final void update(Graphics arg0) {
        this.field6183.update(arg0);
        field6179++;
    }
}
