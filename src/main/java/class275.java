import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class275 extends class115 {

    @OriginalMember(owner = "client!re", name = "F", descriptor = "Ljd;")
    public class139 field4884;

    @OriginalMember(owner = "client!re", name = "B", descriptor = "Lud;")
    public static class279 field4880 = class130.method1024("::wm3", 255);

    @OriginalMember(owner = "client!re", name = "C", descriptor = "[I")
    public static int[] field4881 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!re", name = "H", descriptor = "[Lud;")
    public static class279[] field4886 = new class279[100];

    @OriginalMember(owner = "client!re", name = "I", descriptor = "I")
    public static int field4887 = 1;

    @OriginalMember(owner = "client!re", name = "A", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!re", name = "D", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!re", name = "G", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!re", name = "E", descriptor = "Lok;")
    public static class149 field4883;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZLud;Lok;)Lvd;", line = 11)
    public static final class133 method1947(boolean arg0, class279 arg1, class149 arg2) {
        field4879++;
        int var3 = arg2.method1167(arg1, 112);
        if (var3 == -1) {
            return new class133(0);
        }
        int[] var4 = arg2.method1182(var3, 0);
        if (!arg0) {
            method1948(-107);
        }
        class133 var5 = new class133(var4.length);
        for (int var6 = 0; var6 < var5.field2429; var6++) {
            class53 var7 = new class53(arg2.method1192(0, var3, var4[var6]));
            var5.field2438[var6] = var7.method467((byte) -16);
            var5.field2430[var6] = var7.method494(!arg0);
            var5.field2423[var6] = (short) var7.method468(28214);
            var5.field2436[var6] = (short) var7.method468(28214);
            var5.field2439[var6] = var7.method453(1);
        }
        return var5;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V", line = 55)
    public static void method1948(int arg0) {
        if (arg0 <= 108) {
            method1947(true, (class279) null, (class149) null);
        }
        field4883 = null;
        field4880 = null;
        field4886 = null;
        field4881 = null;
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Ljd;)V", line = 80)
    public class275(class139 arg0) {
        this.field4884 = arg0;
    }
}
