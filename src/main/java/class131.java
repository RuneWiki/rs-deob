import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class131 extends class273 {

    @OriginalMember(owner = "client!fh", name = "A", descriptor = "Lqk;")
    public static class207 field2269 = class24.method212(255, "Fps:");

    @OriginalMember(owner = "client!fh", name = "F", descriptor = "[I")
    public static int[] field2274 = new int[128];

    @OriginalMember(owner = "client!fh", name = "E", descriptor = "[I")
    public static int[] field2273 = new int[500];

    @OriginalMember(owner = "client!fh", name = "B", descriptor = "I")
    public static int field2270 = 0;

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!fh", name = "C", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!fh", name = "D", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "Lpk;")
    public static class99 field2266;

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "[I")
    public static int[] field2268;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(B)Lbl;")
    public static final class33 method917(byte arg0) {
        if (arg0 > -3) {
            method917((byte) 17);
        }
        field2267++;
        class130 var1 = new class130(class242.field4406, class230.field4224, class287.field5127[0], class170.field3021[0], class107.field1895[0], class241.field4402[0], class185.field3286[0], class243.field4421);
        class116.method821((byte) -127);
        return var1;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIII)I")
    public static final int method918(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field2272++;
        if (arg2 == var4) {
            return arg1;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIII)V")
    public static final void method919(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 0) {
            field2273 = null;
        }
        class40 var5 = (class40) class177.field3194.method1867((long) arg4, true);
        field2271++;
        if (var5 == null) {
            var5 = new class40();
            class177.field3194.method1863((byte) 115, var5, (long) arg4);
        }
        if (arg0 >= var5.field810.length) {
            int[] var6 = new int[arg0 + 1];
            int[] var7 = new int[arg0 + 1];
            for (int var8 = 0; var8 < var5.field810.length; var8++) {
                var6[var8] = var5.field810[var8];
                var7[var8] = var5.field804[var8];
            }
            for (int var9 = var5.field810.length; var9 < arg0; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field804 = var7;
            var5.field810 = var6;
        }
        var5.field810[arg0] = arg1;
        var5.field804[arg0] = arg3;
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(B)V")
    public static void method920(byte arg0) {
        field2266 = null;
        field2273 = null;
        field2268 = null;
        if (arg0 > 81) {
            field2269 = null;
            field2274 = null;
        }
    }
}
