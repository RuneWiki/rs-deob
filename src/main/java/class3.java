import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class3 {

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "Lvl;")
    public static class15 field36 = new class15(31, 6);

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "Lgj;")
    public static class662 field40;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
    public static final void method18(int arg0) {
        field38++;
        if (arg0 != -1) {
            field40 = null;
        }
        for (class536 var1 = (class536) class243.field3469.method3589((byte) -128); var1 != null; var1 = (class536) class243.field3469.method3591(~arg0)) {
            class164 var2 = var1.field7289;
            if (var2.field2616 < class440.field5977) {
                var1.method1207(107);
                var2.method1288(false);
            } else if (class440.field5977 >= var2.field2635) {
                var2.method1286(26734);
                if (var2.field2625 > 0) {
                    class755 var3 = (class755) class664.field9216.method337((long) (var2.field2625 - 1), 1);
                    if (var3 != null) {
                        class666 var4 = var3.field10414;
                        if (var4.field7396 >= 0 && (class483.field6515 * 512) > var4.field7396 && var4.field7398 >= 0 && var4.field7398 < class65.field926 * 512) {
                            var2.method1285(var4.field7398, class440.field5977, (byte) -71, class309.method1973(15356, var4.field7396, var4.field7398, var2.field7391) - var2.field2627, var4.field7396);
                        }
                    }
                }
                if (var2.field2625 < 0) {
                    int var5 = -var2.field2625 - 1;
                    class771 var6;
                    if (class483.field6533 == var5) {
                        var6 = class235.field3379;
                    } else {
                        var6 = class527.field7150[var5];
                    }
                    if (var6 != null && var6.field7396 >= 0 && class483.field6515 * 512 > var6.field7396 && var6.field7398 >= 0 && class65.field926 * 512 > var6.field7398) {
                        var2.method1285(var6.field7398, class440.field5977, (byte) -91, class309.method1973(arg0 + 15357, var6.field7396, var6.field7398, var2.field7391) - var2.field2627, var6.field7396);
                    }
                }
                var2.method1284(class241.field3425, false);
                class737.method4088(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)I")
    public static final int method19(byte arg0) {
        field37++;
        int var1 = 83 / ((arg0 + 55) / 54);
        byte var3;
        if (class455.field6207 >= 96) {
            int var2 = class676.method3817(10000);
            if (var2 <= 100) {
                var3 = 4;
                class358.method2208(-110);
            } else if (var2 <= 500) {
                var3 = 3;
                class337.method2110((byte) -105);
            } else if (var2 > 1000) {
                var3 = 1;
                class124.method1072(true, 35);
            } else {
                class567.method3272(true);
                var3 = 2;
            }
        } else {
            var3 = 1;
            class124.method1072(true, 63);
        }
        if (class111.field1911.field6725.method3784((byte) 120) != 0) {
            class111.field1911.method2823(true, class111.field1911.field6753, 0);
            class624.method3517(false, 0, 0);
        }
        class307.method1957(0);
        return var3;
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)V")
    public static void method20(int arg0) {
        if (arg0 == 500) {
            field40 = null;
            field36 = null;
        }
    }
}
