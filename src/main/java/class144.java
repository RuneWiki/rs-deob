import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public abstract class class144 {

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "[B")
    public static byte[] field2224;

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!pba", name = "c", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!pba", name = "e", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!pba", name = "f", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!pba", name = "g", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!pba", name = "d", descriptor = "Lgp;")
    public static class561 field2227;

    @OriginalMember(owner = "client!pba", name = "h", descriptor = "[Lha;")
    public static class116[] field2231;

    static {
        int var0 = 0;
        field2224 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field2224[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(B)V", line = 5)
    public static final void method1058(byte arg0) {
        field2225++;
        if (!class349.field4995) {
            return;
        }
        class477.field6821 = null;
        class349.field4995 = false;
        class214.field3242 = null;
        if (arg0 > -106) {
            method1060((byte) 87);
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(ZII)I", line = 21)
    public static final int method1059(boolean arg0, int arg1, int arg2) {
        field2230++;
        int var3 = arg1 + (arg2 * 57);
        int var4 = var3 ^ var3 << 13;
        if (arg0) {
            int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
            return var5 >> 19 & 0xFF;
        } else {
            return -104;
        }
    }

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "(B)I", line = 42)
    public static final int method1060(byte arg0) {
        field2228++;
        if (class2.field20) {
            return 6;
        } else if (arg0 != -21) {
            return -48;
        } else if (class634.field9212 == null) {
            return 0;
        } else {
            int var1 = class634.field9212.field8359;
            if (class600.method3411(var1, 58)) {
                return 1;
            } else if (class458.method2682(var1, true)) {
                return 2;
            } else if (class36.method315(48, var1)) {
                return 3;
            } else if (class393.method2383(-23131, var1)) {
                return 4;
            } else {
                return 5;
            }
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(I)V", line = 80)
    public static void method1061(int arg0) {
        if (arg0 < 28) {
            field2227 = null;
        }
        field2224 = null;
        field2231 = null;
        field2227 = null;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(FIF[BIIBFFFIILvo;)V", line = 92)
    public static final void method1062(float arg0, int arg1, float arg2, byte[] arg3, int arg4, int arg5, byte arg6, float arg7, float arg8, float arg9, int arg10, int arg11, class433 arg12) {
        field2226++;
        if (arg6 != -117) {
            field2231 = null;
        }
        for (int var13 = 0; var13 < arg11; var13++) {
            class393.method2380(-21576, arg5, arg10, arg1, arg7, arg0, arg12, var13, arg8, arg11, arg4, arg3, arg9, arg2);
            arg4 += arg1 * arg10;
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(Low;B)Low;")
    public abstract class89 method1063(class89 arg0, byte arg1);
}
