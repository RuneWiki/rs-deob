import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class292 {

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4839 = Calendar.getInstance();

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "[I")
    public static int[] field4846 = new int[1000];

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "[Llj;")
    public static class289[] field4844;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V", line = 4)
    public static void method2063(int arg0) {
        field4844 = null;
        if (arg0 != 0) {
            field4839 = (Calendar) null;
        }
        field4839 = null;
        field4846 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZLuo;)V", line = 29)
    public static final void method2064(boolean arg0, class274 arg1) {
        field4841++;
        class133 var2 = null;
        try {
            class158 var3 = arg1.method1957(10, "runescape");
            while (var3.field2542 == 0) {
                class177.method1246(1L, -32644);
            }
            if (!arg0) {
                method2065(-0.6848925F, -28, (byte) 10, 94, 126, -39, -27, true, 61);
            }
            if (var3.field2542 == 1) {
                var2 = (class133) var3.field2538;
                class313 var4 = class76.method516(0);
                var2.method866(var4.field5137, var4.field5124, 9, 0);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method865((byte) -113);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(FIBIIIIZI)[[I", line = 68)
    public static final int[][] method2065(float arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        field4843++;
        int[][] var9 = new int[arg5][arg3];
        class215 var10 = new class215();
        var10.field3308 = (int) (arg0 * 4096.0F);
        var10.field3323 = arg7;
        var10.field3316 = arg6;
        var10.field3312 = arg8;
        var10.field3311 = arg4;
        var10.method20((byte) -85);
        class46.method353(arg5, -1, arg3);
        int var11 = 39 % ((arg2 - 9) / 41);
        for (int var12 = 0; var12 < arg5; var12++) {
            var10.method1461(var9[var12], var12, -20647);
        }
        return var9;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)I", line = 99)
    public static final int method2066(int arg0) {
        field4842++;
        int var1 = -103 % ((arg0 + 38) / 59);
        return class230.field3639;
    }
}
