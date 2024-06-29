import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class446 {

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "[I")
    public static int[] field6169 = new int[1];

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
    public static int field6168;

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
    public static int field6170;

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "[[I")
    public static int[][] field6171;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V")
    public static void method2593(int arg0) {
        if (arg0 != 24145) {
            field6171 = null;
        }
        field6171 = null;
        field6169 = null;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Ljq;III)V")
    public static final void method2594(class447 arg0, int arg1, int arg2, int arg3) {
        field6170++;
        if (class280.field3669) {
            class360 var4 = class354.field4957 == -1 ? null : class132.field1621.method151(class354.field4957, 33);
            if (client.method3572(arg0).method2767(false) && (class59.field809 & 0x20) != 0 && (var4 == null || arg0.method2599(class354.field4957, var4.field5020, arg1 ^ 0xFFFFF800) != var4.field5020)) {
                class431.method2520(0L, arg0.field6229, class126.field1571 + " -> " + arg0.field6213, arg0.field6317, 2, 2, class88.field1171, arg0.field6263, true, false, class497.field6936);
                class338.field4725++;
            }
        }
        for (int var5 = 9; var5 >= 5; var5--) {
            String var9 = class330.method2081(arg1 + 1977, arg0, var5);
            if (var9 != null) {
                class406.field5572++;
                class431.method2520((long) (var5 + 1), arg0.field6229, arg0.field6213, arg0.field6317, 1009, 2, var9, arg0.field6263, true, false, class117.method643(arg0, var5, -1));
            }
        }
        if (arg1 != -2048) {
            field6169 = null;
        }
        String var6 = class522.method2919(arg0, (byte) -111);
        if (var6 != null) {
            class431.method2520(0L, arg0.field6229, arg0.field6213, arg0.field6317, 4, arg1 ^ 0xFFFFF802, var6, arg0.field6263, true, false, arg0.field6275);
            class245.field3095++;
        }
        for (int var7 = 4; var7 >= 0; var7--) {
            String var8 = class330.method2081(-121, arg0, var7);
            if (var8 != null) {
                class406.field5572++;
                class431.method2520((long) (var7 + 1), arg0.field6229, arg0.field6213, arg0.field6317, 18, arg1 + 2050, var8, arg0.field6263, true, false, class117.method643(arg0, var7, -1));
            }
        }
        if (!client.method3572(arg0).method2766(1204238977)) {
            return;
        }
        if (arg0.field6227 == null) {
            class431.method2520(0L, arg0.field6229, "", arg0.field6317, 3, 2, class408.field5599.method2157(class245.field3103, 4074), arg0.field6263, true, false, -1);
        } else {
            class431.method2520(0L, arg0.field6229, "", arg0.field6317, 3, 2, arg0.field6227, arg0.field6263, true, false, -1);
        }
        class428.field5834++;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(II)V")
    public static final void method2595(int arg0, int arg1) {
        field6168++;
        class287.field3758 = arg0;
        class58 var2 = class358.field5001;
        synchronized (class358.field5001) {
            class358.field5001.method315(1);
        }
        if (arg1 != 1039742598) {
            field6169 = null;
        }
        class58 var3 = class60.field834;
        synchronized (class60.field834) {
            class60.field834.method315(1);
        }
    }
}
