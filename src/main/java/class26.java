import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class26 {

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "Lmo;")
    private class336 field276 = new class336(256);

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "Lnl;")
    private class435 field271;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "Lch;")
    public static class151 field270 = new class151("yellow:", "gelb:", "jaune:", "amarelo:");

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "[S")
    public static short[] field277 = new short[256];

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "I")
    public static int field279 = 0;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "Lnl;")
    public static class435 field278;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V")
    public final void method177(byte arg0) {
        field273++;
        if (arg0 != -14) {
            field270 = null;
        }
        class336 var2 = this.field276;
        synchronized (this.field276) {
            this.field276.method2109(-1);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(BI)V")
    public final void method178(byte arg0, int arg1) {
        class336 var3 = this.field276;
        synchronized (this.field276) {
            this.field276.method2120((byte) -118, arg1);
        }
        if (arg0 != -106) {
            field278 = null;
        }
        field272++;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Z)V")
    public static void method179(boolean arg0) {
        field270 = null;
        field277 = null;
        field278 = null;
        if (arg0) {
            field279 = 27;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V")
    public final void method180(int arg0) {
        field275++;
        class336 var2 = this.field276;
        synchronized (this.field276) {
            this.field276.method2119(0);
            int var3 = -24 % ((arg0 + 53) / 48);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)Lsh;")
    public final class175 method181(int arg0, int arg1) {
        field274++;
        class336 var3 = this.field276;
        class175 var4;
        synchronized (this.field276) {
            var4 = (class175) this.field276.method2113(arg1 ^ arg1, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field271.method2633(26, arg0, arg1 ^ 0xFFFFFE89);
        class175 var6 = new class175();
        if (var5 != null) {
            var6.method1265(new class161(var5), true);
        }
        class336 var7 = this.field276;
        synchronized (this.field276) {
            this.field276.method2116((long) arg0, (byte) -73, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Llo;ILnl;)V")
    public class26(class280 arg0, int arg1, class435 arg2) {
        this.field271 = arg2;
        this.field271.method2638(1, 26);
    }
}
