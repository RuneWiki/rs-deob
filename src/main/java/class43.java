import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class43 {

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "Lfi;")
    public static class388 field827 = new class388(0);

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "Luu;")
    public static class187 field830;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "Lhv;")
    public static class358 field831;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "[Lna;")
    public static class35[] field829;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V", line = 3)
    public static void method429(int arg0) {
        field827 = null;
        field830 = null;
        if (arg0 != 350) {
            method429(-120);
        }
        field829 = null;
        field831 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILqa;)V", line = 17)
    public static final void method430(int arg0, class162 arg1) {
        field828++;
        arg1.method298(0, 0, class466.field6952, 350);
        arg1.method253(0, 0, class466.field6952, 350, class478.field7130 << 24 | 0x332277, 1);
        int var2 = 350 / class321.field4910;
        if (class347.field5195 > 0) {
            int var3 = 342 - class321.field4910;
            int var4 = var2 * var3 / (class347.field5195 + var2 - 1);
            int var5 = 4;
            if (class347.field5195 > 1) {
                var5 += (class347.field5195 - class377.field5710 - 1) * (var3 - var4) / (class347.field5195 - 1);
            }
            arg1.method253(class466.field6952 - 16, var5, 12, var4, class478.field7130 << 24 | 0x332277, 2);
            for (int var6 = class377.field5710; class377.field5710 + var2 > var6 && var6 < class347.field5195; var6++) {
                String[] var7 = class139.method1043(class328.field4958[var6], 0, '\b');
                int var8 = (class466.field6952 - 24) / var7.length;
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var8 * var9 + 8;
                    arg1.method298(var10, 0, var8 + var10 - 8, 350);
                    class464.field6944.method2913(-16777216, var7[var9], arg0 - 67, -1, var10, 348 - class8.field140.field5018 - ((var6 - class377.field5710) * class321.field4910) - class520.field7732);
                }
            }
        }
        arg1.method298(0, 0, class466.field6952, 350);
        arg1.method1202(0, -1, 1, 350 - class520.field7732, class466.field6952);
        class310.field4726.method2913(-16777216, "--> " + class370.field5609, arg0 ^ 0xFFFFFFAB, -1, 10, 349 - class501.field7392.field5018);
        int var11 = -1;
        if (class531.field7821 % 30 > 15) {
            var11 = 16777215;
        }
        arg1.method1197(12, class501.field7392.method2136("--> " + class370.field5609.substring(arg0, class3.field98), 13216) + 10, 117, 350 - class501.field7392.field5018 - 11, var11);
    }
}
