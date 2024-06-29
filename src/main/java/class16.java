import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class16 {

    @OriginalMember(owner = "client!be", name = "a", descriptor = "Lob;")
    public static class141 field284 = class175.method1195(40, "logo");

    @OriginalMember(owner = "client!be", name = "f", descriptor = "[I")
    public static int[] field289 = new int[100];

    @OriginalMember(owner = "client!be", name = "i", descriptor = "[I")
    public static int[] field292 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!be", name = "l", descriptor = "I")
    public static int field295 = 0;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "Lra;")
    public static class170 field293;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "Z")
    public static boolean field290;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "[I")
    public static int[] field291;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
    public static void method100(int arg0) {
        int var1 = -105 / ((-arg0 - 67) / 46);
        field291 = null;
        field289 = null;
        field293 = null;
        field284 = null;
        field292 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field287++;
        if (class66.method443(true, arg5)) {
            class223.field4219 = null;
            if (arg2 < -51) {
                class90.method614(arg4, arg6, arg0, arg1, -1, class224.field4232[arg5], arg8, arg3, 16, arg7);
                if (class223.field4219 != null) {
                    class90.method614(arg4, arg6, arg0, arg1, -1412584499, class223.field4219, class111.field2134, class113.field2171, 16, arg7);
                    class223.field4219 = null;
                }
            }
        } else if (arg1 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class141.field2737[var9] = true;
            }
        } else {
            class141.field2737[arg1] = true;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I[Lob;I[SI)V")
    public static final void method102(int arg0, class141[] arg1, int arg2, short[] arg3, int arg4) {
        if (arg4 != -129) {
            return;
        }
        field294++;
        if (arg0 >= arg2) {
            return;
        }
        int var5 = (arg0 + arg2) / 2;
        int var6 = arg0;
        class141 var7 = arg1[var5];
        arg1[var5] = arg1[arg2];
        arg1[arg2] = var7;
        short var8 = arg3[var5];
        arg3[var5] = arg3[arg2];
        arg3[arg2] = var8;
        for (int var9 = arg0; var9 < arg2; var9++) {
            if (var7 == null || arg1[var9] != null && (var9 & 0x1) > arg1[var9].method913(var7, (byte) -117)) {
                class141 var10 = arg1[var9];
                arg1[var9] = arg1[var6];
                arg1[var6] = var10;
                short var11 = arg3[var9];
                arg3[var9] = arg3[var6];
                arg3[var6++] = var11;
            }
        }
        arg1[arg2] = arg1[var6];
        arg1[var6] = var7;
        arg3[arg2] = arg3[var6];
        arg3[var6] = var8;
        method102(arg0, arg1, var6 - 1, arg3, -129);
        method102(var6 + 1, arg1, arg2, arg3, -129);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIB)V")
    public static final void method103(int arg0, int arg1, byte arg2) {
        field288++;
        long var3 = (long) ((arg1 << 16) + arg0);
        int var5 = 42 / ((arg2 + 34) / 43);
        class209 var6 = (class209) class202.field3819.method792(var3, 22346);
        if (var6 != null) {
            class126.field2417.method812(var6, -115);
        }
    }
}
