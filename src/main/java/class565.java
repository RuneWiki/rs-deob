import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class565 extends class623 {

    @OriginalMember(owner = "client!qi", name = "w", descriptor = "[B")
    public byte[] field8037;

    @OriginalMember(owner = "client!qi", name = "v", descriptor = "Lffa;")
    public static class185 field8036 = new class185();

    @OriginalMember(owner = "client!qi", name = "x", descriptor = "I")
    public static int field8038;

    @OriginalMember(owner = "client!qi", name = "y", descriptor = "I")
    public static int field8039;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V", line = 4)
    public static final void method3287(int arg0) {
        field8038++;
        class380.method2335(class275.field3370, true, (long) class392.field5398);
        if (class327.field4245 != -1) {
            class331.method1979(false, class327.field4245);
        }
        for (int var1 = 0; var1 < class717.field10056; var1++) {
            if (class272.field3360[var1]) {
                class344.field4472[var1] = true;
            }
            class459.field6560[var1] = class272.field3360[var1];
            class272.field3360[var1] = false;
        }
        class659.field9407 = class392.field5398;
        if (class327.field4245 != -1) {
            class717.field10056 = 0;
            class629.method3604((byte) 85);
        }
        class275.field3370.method393();
        class463.method2817(class275.field3370, (byte) 70);
        int var2 = class180.method1115((byte) -66);
        if (arg0 != 512) {
            method3287(0);
        }
        if (var2 == -1) {
            var2 = class61.field627;
        }
        if (var2 == -1) {
            var2 = class627.field9012;
        }
        class521.method3060(var2, arg0 ^ 0xFFFFFDFF);
        class721.field10119 = 0;
    }

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "(I)V", line = 58)
    public static final void method3288(int arg0) {
        field8039++;
        class114 var1 = (class114) class395.field5414.method1719(65280);
        int var2 = -46 / ((72 - arg0) / 43);
        while (var1 != null) {
            class172 var3 = var1.field1196;
            if (class392.field5398 > var3.field2012) {
                var1.method864(12983);
                var3.method1062((byte) -18);
            } else if (var3.field2021 <= class392.field5398) {
                var3.method1067((byte) 116);
                if (var3.field1989 > 0) {
                    class151 var4 = (class151) class253.field3052.method1754(false, (long) (var3.field1989 - 1));
                    if (var4 != null) {
                        class197 var5 = var4.field1661;
                        if (var5.field4635 >= 0 && (class489.field6976 * 512) > var5.field4635 && var5.field4629 >= 0 && var5.field4629 < (class153.field1677 * 512)) {
                            var3.method1065(var5.field4635, class392.field5398, var5.field4629, (byte) -38, class676.method3845(var5.field4629, var5.field4635, 0, var3.field4628) - var3.field2019);
                        }
                    }
                }
                if (var3.field1989 < 0) {
                    int var6 = -var3.field1989 - 1;
                    class183 var7;
                    if (class701.field9893 == var6) {
                        var7 = class90.field937;
                    } else {
                        var7 = class75.field792[var6];
                    }
                    if (var7 != null && var7.field4635 >= 0 && (class489.field6976 * 512) > var7.field4635 && var7.field4629 >= 0 && var7.field4629 < (class153.field1677 * 512)) {
                        var3.method1065(var7.field4635, class392.field5398, var7.field4629, (byte) -65, class676.method3845(var7.field4629, var7.field4635, 0, var3.field4628) - var3.field2019);
                    }
                }
                var3.method1068(-1454638327, class721.field10119);
                class264.method1594(var3, true);
            }
            var1 = (class114) class395.field5414.method1723(-20665);
        }
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "([B)V", line = 123)
    public class565(byte[] arg0) {
        this.field8037 = arg0;
    }

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "(I)V", line = 131)
    public static void method3289(int arg0) {
        field8036 = null;
        if (arg0 != 0) {
            field8036 = null;
        }
    }
}
