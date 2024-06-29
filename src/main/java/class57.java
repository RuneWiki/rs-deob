import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public abstract class class57 {

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "Lhq;")
    public static class365 field654 = new class365(32);

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "Lcq;")
    public static class72 field659 = new class72("red:", "rot:", "rouge:", "vermelho:");

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
    public static int field660 = 0;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "[Ltr;")
    public static class215[] field661;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIILki;IBIILki;I)V", line = 3)
    public static final void method314(int arg0, int arg1, int arg2, class204 arg3, int arg4, byte arg5, int arg6, int arg7, class204 arg8, int arg9) {
        field655++;
        int var10 = arg3.method845(arg5 - 153);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class436 var12 = (class436) class382.field5232.method2295((long) var10, (byte) 74);
        if (var12 == null) {
            class132[] var13 = class132.method853(class15.field177, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class267.field3454.method697(var13[0], true);
            class382.field5232.method2294(var12, (byte) 124, (long) var10);
        }
        class319.method1995(arg2 >> 1, arg1 >> 1, arg8.field1516, 0, arg4, arg8.field1514, arg8.method841(true) * 64, arg7, (byte) -17);
        int var14 = arg6 + class242.field3234[0] - 18;
        int var15 = arg0 + class242.field3234[1] - 54 - 16;
        int var16 = arg9 / 4 * 18 + var14;
        int var17 = arg9 % 4 * 18 + var15;
        var12.method2659(var16, var17);
        if (arg5 != 39) {
            return;
        }
        if (arg3 == arg8) {
            class267.field3454.method731(var16 - 1, var17 + -1, 18, -256, (byte) 75, 18);
        }
        class23 var18 = class427.method2607(81);
        var18.field242 = var16;
        var18.field244 = var17;
        var18.field243 = var16 + 16;
        var18.field239 = arg3;
        var18.field249 = var17 + 16;
        class210.field2546.method1833(var18, arg5 + 10170);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V", line = 52)
    public static final void method315(byte arg0) {
        if (arg0 < 30) {
            field658 = 39;
        }
        field653++;
        class12 var1 = class390.method2422(341555040, 0, 15);
        var1.method65(-95);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZLjava/lang/String;I)V", line = 68)
    public static final void method317(boolean arg0, String arg1, int arg2) {
        field656++;
        if (!arg0) {
            class12 var3 = class390.method2422(341555040, arg2, 2);
            var3.method66(-39);
            var3.field140 = arg1;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)Z", line = 87)
    public static final boolean method319(int arg0) {
        if (arg0 >= -119) {
            return false;
        }
        field652++;
        if (class314.field4219) {
            try {
                class443.method2743(class401.field5525.field6077, -24425, "showVideoAd");
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)Lqg;", line = 107)
    public static final class140 method320(int arg0, int arg1) {
        if (arg0 != -16) {
            method317(false, (String) null, -44);
        }
        field657++;
        class365 var2 = class231.field3036;
        class140 var3;
        synchronized (class231.field3036) {
            var3 = (class140) class231.field3036.method2295((long) arg1, (byte) 74);
            if (var3 == null) {
                var3 = new class140(arg1);
                class231.field3036.method2294(var3, (byte) 54, (long) arg1);
            }
        }
        synchronized (var3) {
            return var3.method897((byte) 124) ? var3 : null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(B)V", line = 141)
    public static void method322(byte arg0) {
        field661 = null;
        field659 = null;
        if (arg0 < -104) {
            field654 = null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(B)I")
    public abstract int method316(byte arg0);

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)C")
    public abstract char method318(boolean arg0);

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)J")
    public abstract long method321(int arg0);

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)I")
    public abstract int method323(int arg0);

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "(B)Z")
    public abstract boolean method324(byte arg0);
}
