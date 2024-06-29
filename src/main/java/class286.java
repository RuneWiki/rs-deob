import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class286 {

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "Lhga;")
    public static class158 field4543 = new class158(63, 16);

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "[I")
    public static int[] field4547 = new int[32];

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "Lpw;")
    public static class656 field4548;

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "Lhga;")
    public static class158 field4550;

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "Lui;")
    public static class210 field4551;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "Lps;")
    public static class82 field4544;

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "Lri;")
    public static class97 field4546;

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "[I")
    public static int[] field4549;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field4547[var1] = var0 - 1;
            var0 += var0;
        }
        field4548 = new class656();
        field4550 = new class158(84, 3);
        field4551 = new class210(14, 0, 4, 1);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILoo;)V", line = 10)
    public static final void method2033(int arg0, class580 arg1) {
        if (arg0 != 12947) {
            field4548 = null;
        }
        field4541++;
        for (int var2 = 0; var2 < class422.field6437; var2++) {
            int var3 = class318.field4992[var2];
            class304 var4 = class597.field8465[var3];
            int var5 = arg1.method70(arg0 ^ 0xFFFFEE0E);
            if ((var5 & 0x10) != 0) {
                var5 += arg1.method70(-9059) << 8;
            }
            if ((var5 & 0x100) != 0) {
                var5 += arg1.method70(-9059) << 16;
            }
            class203.method1571((byte) 36, var4, arg1, var5, var3);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V", line = 44)
    public static void method2034(int arg0) {
        field4543 = null;
        field4551 = null;
        field4548 = null;
        field4546 = null;
        field4544 = null;
        field4550 = null;
        field4547 = null;
        field4549 = null;
        if (arg0 != 16) {
            method2033(50, null);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILjava/lang/String;)V", line = 61)
    public static final void method2035(int arg0, String arg1) {
        field4545++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class321.method2179(-2081246228, arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class204.field3334; var3++) {
            String var4 = class527.field7700[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class321.method2179(-2081246228, var4);
            if (var5 != null && var5.equals(var2)) {
                class204.field3334--;
                for (int var6 = var3; var6 < class204.field3334; var6++) {
                    class527.field7700[var6] = class527.field7700[var6 + 1];
                    class20.field328[var6] = class20.field328[var6 + 1];
                    class185.field3113[var6] = class185.field3113[var6 + 1];
                    class124.field2048[var6] = class124.field2048[var6 + 1];
                    class46.field623[var6] = class46.field623[var6 + 1];
                    class322.field5038[var6] = class322.field5038[var6 + 1];
                }
                class292.field4608 = class79.field997;
                class400.field6177++;
                class165 var7 = class271.method1917(class420.field6424, (byte) -46, class272.field4386);
                var7.field2776.method65(class516.method3125(112, arg1), arg0 - 78);
                var7.field2776.method28(arg1, 0);
                class642.method3726(-684096285, var7);
                break;
            }
        }
        if (arg0 != 1) {
            field4547 = null;
        }
    }
}
