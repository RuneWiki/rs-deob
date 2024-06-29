import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class15 {

    @OriginalMember(owner = "client!we", name = "a", descriptor = "Lpj;")
    public static class237 field243 = class33.method353("leuchten3:", 108);

    @OriginalMember(owner = "client!we", name = "b", descriptor = "Z")
    public static boolean field244 = false;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "Lpj;")
    public static class237 field247 = class33.method353("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", 112);

    @OriginalMember(owner = "client!we", name = "k", descriptor = "Lpj;")
    public static class237 field253 = class33.method353(")4", 42);

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public static int field251 = 0;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "[I")
    public static int[] field252 = new int[1000];

    @OriginalMember(owner = "client!we", name = "h", descriptor = "J")
    public static long field250 = 0L;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
    public static void method133(int arg0) {
        field243 = null;
        field252 = null;
        field247 = null;
        if (arg0 == 1000) {
            field253 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZLjh;)V")
    public static final void method134(boolean arg0, class271 arg1) {
        if (!arg0) {
            field253 = null;
        }
        class249 var2 = (class249) class33.field703.method568(arg1.field4655.method1616(0), -1);
        if (var2 != null) {
            if (var2.field4333 != null) {
                class74.field1424.method583(var2.field4333);
                var2.field4333 = null;
            }
            var2.method629(0);
        }
        field246++;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BI)Lpj;")
    public static final class237 method135(byte arg0, int arg1) {
        int var2 = 104 / ((arg0 - 67) / 39);
        field245++;
        return class215.field3747[arg1].method1588(false) > 0 ? class238.method1626(new class237[] { class180.field3168[arg1], class41.field931, class215.field3747[arg1] }, -73) : class180.field3168[arg1];
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)V")
    public static final void method136(int arg0, int arg1) {
        field248++;
        if (arg0 == -1 || !class47.method434(0, arg0)) {
            return;
        }
        class141[] var2 = class22.field406[arg0];
        if (arg1 < 125) {
            return;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class141 var4 = var2[var3];
            if (var4.field2576 != null) {
                class117 var5 = new class117();
                var5.field2053 = var4.field2576;
                var5.field2046 = var4;
                class50.method458(var5, 2, 2000000);
            }
        }
    }
}
