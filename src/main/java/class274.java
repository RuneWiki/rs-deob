import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class274 {

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
    public static int field4537 = 0;

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "F")
    public static float field4542;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "Lth;")
    public static class57 field4538;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "[[[B")
    public static byte[][][] field4541;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V", line = 4)
    public static final void method2047(int arg0) {
        if (arg0 != 5) {
            method2047(-92);
        }
        field4539++;
        while (class29.field383.method2229(class223.field3706, 21256) >= 11) {
            int var1 = class29.field383.method2227(-27542, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class56.field924[var1] == null) {
                var2 = true;
                class56.field924[var1] = new class258();
                if (class261.field4401[var1] != null) {
                    class56.field924[var1].method1979(true, class261.field4401[var1], var1);
                }
            }
            class306.field4895[class345.field5501++] = var1;
            class258 var3 = class56.field924[var1];
            var3.field3550 = class332.field5261;
            int var4 = class29.field383.method2227(arg0 ^ 0xFFFF946F, 1);
            int var5 = class29.field383.method2227(-27542, 5);
            int var6 = class29.field383.method2227(-27542, 5);
            if (var5 > 15) {
                var5 -= 32;
            }
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class279.field4584[class29.field383.method2227(arg0 ^ 0xFFFF946F, 3)];
            if (var2) {
                var3.field3549 = var3.field3477 = var7;
            }
            int var8 = class29.field383.method2227(-27542, 1);
            if (var8 == 1) {
                class330.field5248[class356.field5645++] = var1;
            }
            var3.method1981(class6.field55.field3519[0] + var5, class6.field55.field3553[0] - -var6, var4 == 1, (byte) -67);
        }
        class29.field383.method2232(0);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Z)V", line = 73)
    public static void method2048(boolean arg0) {
        field4538 = null;
        field4541 = (byte[][][]) null;
        if (!arg0) {
            field4541 = (byte[][][]) ((byte[][][]) null);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(III)V", line = 107)
    public static final void method2049(int arg0, int arg1, int arg2) {
        if (arg1 != 11) {
            method2049(-92, -1, 77);
        }
        field4540++;
        class321 var3 = class46.method370(7, (byte) -106, arg2);
        var3.method2265(false);
        var3.field5112 = arg0;
    }
}
