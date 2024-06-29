import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class205 {

    @OriginalMember(owner = "client!i", name = "d", descriptor = "Lmh;")
    private static class128 field3613 = class22.method156(125, "Loading title screen )2 ");

    @OriginalMember(owner = "client!i", name = "f", descriptor = "Lmh;")
    public static class128 field3615 = field3613;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "[I")
    public static int[] field3617 = new int[128];

    @OriginalMember(owner = "client!i", name = "b", descriptor = "Ltb;")
    public static class210 field3611 = new class210(128);

    @OriginalMember(owner = "client!i", name = "j", descriptor = "Lmh;")
    private static class128 field3619 = class22.method156(126, "");

    @OriginalMember(owner = "client!i", name = "k", descriptor = "Lmh;")
    public static class128 field3620 = field3619;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "[I")
    public static int[] field3614;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILbg;)V", line = 8)
    public static final void method1414(int arg0, class194 arg1) {
        int var2 = 0;
        if (arg0 != -1) {
            return;
        }
        while (class91.field1556 > var2) {
            int var3 = arg1.method1345((byte) 40);
            int var4 = arg1.method1308(arg0 - 96);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class245.field4178[var3] != null) {
                class245.field4178[var3].field2487 = var4;
            }
            var2++;
        }
        field3610++;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)Lmh;", line = 35)
    public static final class128 method1415(boolean arg0) {
        field3616++;
        class128 var1 = class264.field4577;
        if (!arg0) {
            field3619 = (class128) null;
        }
        class128 var2 = class273.field4733;
        if (class236.field4057 != 0) {
            var1 = class97.field1683;
        }
        if (class221.field3890 != null) {
            var2 = class28.method177((byte) -115, new class128[] { class260.field4505, class221.field3890 });
        }
        return class28.method177((byte) -56, new class128[] { class94.field1584, var1, class315.field5348, class257.method1811(class77.field1417, (byte) 38), class301.field5116, class257.method1811(class36.field743, (byte) 111), var2, class93.field1580 });
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V", line = 64)
    public static void method1416(int arg0) {
        field3611 = null;
        if (arg0 <= 17) {
            method1417(-30, -45, 31, -95, (class226) null, -86L, (class226) null, (class226) null);
        }
        field3614 = null;
        field3615 = null;
        field3613 = null;
        field3620 = null;
        field3619 = null;
        field3617 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIILjm;JLjm;Ljm;)V", line = 108)
    public static final void method1417(int arg0, int arg1, int arg2, int arg3, class226 arg4, long arg5, class226 arg6, class226 arg7) {
        class289 var9 = new class289();
        var9.field4931 = arg4;
        var9.field4951 = arg1 * 128 + 64;
        var9.field4944 = arg2 * 128 + 64;
        var9.field4948 = arg3;
        var9.field4939 = arg5;
        var9.field4950 = arg6;
        var9.field4935 = arg7;
        int var10 = 0;
        class150 var11 = class182.field3184[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field2576; var12++) {
                class5 var13 = var11.field2575[var12];
                if ((var13.field89 & 0x400000L) == 4194304L) {
                    int var14 = var13.field105.method204();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field4941 = -var10;
        if (class182.field3184[arg0][arg1][arg2] == null) {
            class182.field3184[arg0][arg1][arg2] = new class150(arg0, arg1, arg2);
        }
        class182.field3184[arg0][arg1][arg2].field2569 = var9;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lbg;I)Lmd;", line = 164)
    public static final class241 method1418(class194 arg0, int arg1) {
        field3612++;
        class241 var2 = new class241(arg0.method1319(1), arg0.method1319(1), arg0.method1308(arg1 ^ 0xFFFFFFE3), arg0.method1308(-107), arg0.method1350(false), arg0.method1325(7627) == 1);
        int var3 = arg0.method1325(7627);
        for (int var4 = arg1; var4 < var3; var4++) {
            var2.field4134.method2029((byte) -34, new class109(arg0.method1308(-66), arg0.method1308(-114), arg0.method1308(-73), arg0.method1308(arg1 ^ 0xFFFFFFC2)));
        }
        var2.method1639(12800);
        return var2;
    }
}
