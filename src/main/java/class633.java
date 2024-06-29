import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class633 {

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "Laf;")
    private class39 field8843 = new class39(256);

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "Ld;")
    private class101 field8840;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "Lpq;")
    private class194 field8841;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field8842;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
    public static int field8844;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field8845;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public static int field8846;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public static int field8847;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "Ljava/lang/String;")
    public static String field8839;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V", line = 3)
    public static final void method3626(byte arg0) {
        field8844++;
        int var1 = class783.field10748;
        if (arg0 >= -3) {
            return;
        }
        int[] var2 = class244.field3610;
        for (int var3 = 0; var3 < var1; var3++) {
            class723 var4 = class413.field5787[var2[var3]];
            if (var4 != null) {
                class219.method1355(var4.method3744(1), (byte) 61, var4);
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZ)Lrq;", line = 33)
    public final class470 method3627(int arg0, boolean arg1) {
        field8847++;
        Object var3 = this.field8843.method312(0, (long) arg0);
        if (var3 != null) {
            return (class470) var3;
        }
        if (arg1) {
            method3626((byte) 42);
        }
        if (!this.field8840.method583(12101, arg0)) {
            return null;
        }
        class744 var4 = this.field8840.method581(-21732, arg0);
        int var5 = var4.field10265 ? 64 : this.field8841.field2602;
        class470 var7;
        if (var4.field10252 && this.field8841.method147()) {
            float[] var6 = this.field8840.method574(0.7F, false, var5, var5, 1136, arg0);
            var7 = new class470(this.field8841, 3553, 34842, var5, var5, var4.field10270 != 0, var6, 6408);
        } else {
            int[] var8;
            if (var4.field10258 != 2 && class452.method2727(var4.field10273, 1)) {
                var8 = this.field8840.method578(var5, true, arg0, 0.7F, true, var5);
            } else {
                var8 = this.field8840.method579(arg0, 0.7F, false, 5084, var5, var5);
            }
            var7 = new class470(this.field8841, 3553, 6408, var5, var5, var4.field10270 != 0, var8, 0, 0, false);
        }
        var7.method2804(var4.field10255, 10243, var4.field10253);
        this.field8843.method305(var7, (long) arg0, 18320);
        return var7;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)Z", line = 83)
    public static final boolean method3628(int arg0, int arg1, int arg2) {
        if (arg2 < 63) {
            return true;
        } else {
            field8845++;
            return class195.method1277(-24149, arg0, arg1) | (arg0 & 0x60000) != 0 || class403.method2473(arg0, arg1, 0) || class558.method3282(arg1, (byte) 9, arg0);
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lpq;Ld;)V", line = 102)
    public class633(class194 arg0, class101 arg1) {
        this.field8840 = arg1;
        this.field8841 = arg0;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V", line = 111)
    public final void method3629(int arg0) {
        field8846++;
        this.field8843.method314(-2);
        if (arg0 != -8929) {
            this.field8841 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V", line = 122)
    public final void method3630(int arg0) {
        field8842++;
        this.field8843.method308(-1, arg0);
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)V", line = 130)
    public static void method3631(int arg0) {
        if (arg0 != -9625) {
            field8839 = null;
        }
        field8839 = null;
    }
}
