import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public class class301 {

    @OriginalMember(owner = "client!ica", name = "f", descriptor = "I")
    public int field4220 = 2048;

    @OriginalMember(owner = "client!ica", name = "c", descriptor = "I")
    public int field4217 = 0;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "I")
    public int field4215 = 2048;

    @OriginalMember(owner = "client!ica", name = "g", descriptor = "I")
    public int field4221 = 0;

    @OriginalMember(owner = "client!ica", name = "e", descriptor = "I")
    public static int field4219 = 0;

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "Lvh;")
    public static class125 field4216 = new class125(75, 8);

    @OriginalMember(owner = "client!ica", name = "k", descriptor = "[I")
    public static int[] field4225 = new int[2];

    @OriginalMember(owner = "client!ica", name = "d", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!ica", name = "h", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!ica", name = "i", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!ica", name = "j", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(Lek;II)V")
    private final void method1849(class465 arg0, int arg1, int arg2) {
        field4222++;
        if (arg1 == 1) {
            this.field4221 = arg0.method2705(-87);
        } else if (arg1 == 2) {
            this.field4215 = arg0.method2755((byte) -92);
        } else if (arg1 == 3) {
            this.field4220 = arg0.method2755((byte) -111);
        } else if (arg1 == 4) {
            this.field4217 = arg0.method2744(-1);
        }
        int var4 = -50 / ((arg2 - 78) / 44);
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)V")
    public static void method1850(int arg0) {
        field4225 = null;
        if (arg0 == 2048) {
            field4216 = null;
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method1851(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        field4218++;
        if (arg1 < 1) {
            arg1 = 1;
        }
        int var6 = arg2 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        if (arg4 != -5282) {
            return;
        }
        int var7 = (class694.field9864 - class374.field5193) * var6 / 100 + class374.field5193;
        if (var7 < class286.field4036) {
            var7 = class286.field4036;
        } else if (class216.field3252 < var7) {
            var7 = class216.field3252;
        }
        int var8 = arg2 * var7 * 512 / (arg1 * 334);
        if (var8 < class376.field5214) {
            short var9 = class376.field5214;
            var7 = arg1 * 334 * var9 / (arg2 * 512);
            if (class216.field3252 < var7) {
                var7 = class216.field3252;
                int var10 = arg2 * 512 * var7 / (var9 * 334);
                int var11 = (arg1 - var10) / 2;
                if (arg5) {
                    class637.field9048.method805();
                    class637.field9048.method792(arg2, (byte) -88, var11, arg0, -16777216, arg3);
                    class637.field9048.method792(arg2, (byte) -88, var11, arg0, -16777216, arg1 + arg3 - var11);
                }
                arg1 -= var11 * 2;
                arg3 += var11;
            }
        } else if (var8 > class174.field2803) {
            short var12 = class174.field2803;
            var7 = arg1 * var12 * 334 / (arg2 * 512);
            if (class286.field4036 > var7) {
                var7 = class286.field4036;
                int var13 = arg1 * var12 * 334 / (var7 * 512);
                int var14 = (arg2 - var13) / 2;
                if (arg5) {
                    class637.field9048.method805();
                    class637.field9048.method792(var14, (byte) -88, arg1, arg0, -16777216, arg3);
                    class637.field9048.method792(var14, (byte) -88, arg1, arg2 + arg0 - var14, -16777216, arg3);
                }
                arg2 -= var14 * 2;
                arg0 += var14;
            }
        }
        class134.field2164 = arg3;
        class344.field4829 = arg0;
        class327.field4551 = (short) arg2;
        class419.field5956 = (short) arg1;
        class677.field9644 = arg2 * var7 / 334;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(BLek;)V")
    public final void method1852(byte arg0, class465 arg1) {
        if (arg0 <= 116) {
            field4216 = null;
        }
        field4223++;
        while (true) {
            int var3 = arg1.method2705(-66);
            if (var3 == 0) {
                return;
            }
            this.method1849(arg1, var3, 26);
        }
    }
}
