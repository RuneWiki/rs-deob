import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class273 extends class239 {

    @OriginalMember(owner = "client!li", name = "x", descriptor = "Z")
    public static boolean field4826 = true;

    @OriginalMember(owner = "client!li", name = "u", descriptor = "Ljd;")
    public static class85 field4823 = class221.method1499("Freie Welt", (byte) -89);

    @OriginalMember(owner = "client!li", name = "s", descriptor = "Lpa;")
    public static class204 field4821 = new class204(512);

    @OriginalMember(owner = "client!li", name = "B", descriptor = "Ljd;")
    public static class85 field4830 = class221.method1499("scrollbar", (byte) 116);

    @OriginalMember(owner = "client!li", name = "C", descriptor = "Ljd;")
    private static class85 field4831 = class221.method1499("World", (byte) -111);

    @OriginalMember(owner = "client!li", name = "A", descriptor = "Ljd;")
    public static class85 field4829 = field4831;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!li", name = "t", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!li", name = "v", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!li", name = "w", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!li", name = "y", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!li", name = "z", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V")
    public static void method1859(int arg0) {
        field4821 = null;
        if (arg0 != -7) {
            method1861((byte) 99, (class85) null);
        }
        field4829 = null;
        field4831 = null;
        field4830 = null;
        field4823 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "([BZ)[B")
    public static final byte[] method1860(byte[] arg0, boolean arg1) {
        class247 var2 = new class247(arg0);
        field4820++;
        int var3 = var2.method1711((byte) -67);
        if (arg1) {
            return null;
        }
        int var4 = var2.method1712(6357);
        if (var4 < 0 || !(class247.field4280 == 0 || var4 <= class247.field4280)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method1686(var4, 0, (byte) -103, var7);
            return var7;
        } else {
            int var5 = var2.method1712(6357);
            if (var5 < 0 || !(class247.field4280 == 0 || var5 <= class247.field4280)) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class166.method1116(var6, var5, arg0, var4, 9);
            } else {
                class2.field22.method823(var6, (byte) 18, var2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(BLjd;)V")
    public static final void method1861(byte arg0, class85 arg1) {
        field4828++;
        int var2 = class168.method1130((byte) 107, arg1);
        if (var2 == -1) {
            return;
        }
        class147.field2496 = class177.field3025.field3847[var2] - class21.field303;
        if (arg0 != 84) {
            method1860((byte[]) null, false);
        }
        class150.field2537 = class79.field1458 - (class177.field3025.field3845[var2] - class196.field3371) - 1;
        int var3 = (int) ((float) class13.field202.field4513 / class99.field1779) + class147.field2496;
        int var4 = class147.field2496 - ((int) ((float) class13.field202.field4513 / class99.field1779));
        if (var4 < 0) {
            class147.field2496 = (int) ((float) class13.field202.field4513 / class99.field1779);
        }
        int var5 = class150.field2537 - (int) ((float) class13.field202.field4482 / class99.field1779);
        int var6 = class150.field2537 + ((int) ((float) class13.field202.field4482 / class99.field1779));
        if (var3 > class100.field1793) {
            class147.field2496 = class100.field1793 - (int) ((float) class13.field202.field4513 / class99.field1779);
        }
        if (var5 < 0) {
            class150.field2537 = (int) ((float) class13.field202.field4482 / class99.field1779);
        }
        if (var6 > class79.field1458) {
            class150.field2537 = class79.field1458 - ((int) ((float) class13.field202.field4482 / class99.field1779));
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(III)Ljd;")
    public static final class85 method1862(int arg0, int arg1, int arg2) {
        field4824++;
        int var3 = arg0 - arg2;
        if (var3 < -9) {
            return class154.field2661;
        }
        if (arg1 < 27) {
            field4831 = null;
        }
        if (var3 < -6) {
            return class210.field3682;
        } else if (var3 < -3) {
            return class202.field3523;
        } else if (var3 < 0) {
            return class134.field2332;
        } else if (var3 > 9) {
            return class202.field3526;
        } else if (var3 > 6) {
            return class132.field2309;
        } else if (var3 > 3) {
            return class199.field3408;
        } else if (var3 > 0) {
            return class121.field2138;
        } else {
            return class208.field3639;
        }
    }
}
