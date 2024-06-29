import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class174 {

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "Lhf;")
    public static class413 field2456 = new class413();

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "[I")
    public static int[] field2459 = new int[3];

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "Lada;")
    public static class171 field2460 = new class171();

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "Lke;")
    public static class622 field2461 = new class622(112, 6);

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "[I")
    public static int[] field2463 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "Ldba;")
    public static class101 field2462 = new class101(0, 4);

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V")
    public static void method1306(byte arg0) {
        field2462 = null;
        field2461 = null;
        field2463 = null;
        int var1 = -71 % ((10 - arg0) / 46);
        field2456 = null;
        field2460 = null;
        field2459 = null;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)V")
    public static final void method1307(byte arg0) {
        field2458++;
        class768 var1 = (class768) class399.field5668.method2508((byte) 111);
        if (arg0 != -108) {
            return;
        }
        while (var1 != null) {
            class36 var2 = var1.field10604;
            if (class673.field9441 > var2.field482) {
                var1.method3117((byte) 23);
                var2.method250((byte) 78);
            } else if (var2.field502 <= class673.field9441) {
                var2.method252(-50);
                if (var2.field483 > 0) {
                    class14 var3 = (class14) class543.field7606.method380((byte) -3, (long) (var2.field483 - 1));
                    if (var3 != null) {
                        class645 var4 = var3.field262;
                        if (var4.field7718 >= 0 && var4.field7718 < (class109.field1314 * 512) && var4.field7719 >= 0 && (class760.field10479 * 512) > var4.field7719) {
                            var2.method256(var4.field7718, class673.field9441, false, var4.field7719, class580.method3366(var2.field7710, (byte) -95, var4.field7719, var4.field7718) - var2.field490);
                        }
                    }
                }
                if (var2.field483 < 0) {
                    int var5 = -var2.field483 - 1;
                    class559 var6;
                    if (class223.field3199 == var5) {
                        var6 = class251.field3549;
                    } else {
                        var6 = class581.field8250[var5];
                    }
                    if (var6 != null && var6.field7718 >= 0 && (class109.field1314 * 512) > var6.field7718 && var6.field7719 >= 0 && (class760.field10479 * 512) > var6.field7719) {
                        var2.method256(var6.field7718, class673.field9441, false, var6.field7719, class580.method3366(var2.field7710, (byte) -95, var6.field7719, var6.field7718) - var2.field490);
                    }
                }
                var2.method241(class55.field755, arg0 + 27807);
                class513.method2991(var2, true);
            }
            var1 = (class768) class399.field5668.method2505((byte) -55);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I[I[Ljava/lang/Object;)V")
    public static final void method1308(int arg0, int[] arg1, Object[] arg2) {
        class698.method3938(arg2, arg1.length - 1, (byte) -78, arg1, 0);
        if (arg0 >= -8) {
            field2459 = null;
        }
        field2455++;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)Z")
    public static final boolean method1309(int arg0, int arg1, int arg2) {
        if (arg1 != 11318) {
            method1306((byte) -44);
        }
        field2457++;
        return (arg0 & 0x70000) != 0 | class119.method831(arg2, arg0, 0) || class428.method2549(-32443, arg2, arg0);
    }
}
