import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class62 {

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "I")
    private int field1257 = 0;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
    private int field1254;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "[Lb;")
    private class12[] field1246;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "Lkh;")
    public static class117 field1245 = class224.method1450((byte) 120, "Ihr Spielkonto wird bereits benutzt)3");

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field1240 = 0;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "Lkh;")
    private static class117 field1253 = class224.method1450((byte) -94, "Discard");

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public static int field1249 = 0;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "Lkh;")
    public static class117 field1248 = field1253;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "J")
    private long field1255;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "Lb;")
    private class12 field1243;

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "Lb;")
    private class12 field1256;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public static void method455(int arg0) {
        field1245 = null;
        field1248 = null;
        if (arg0 != -9640) {
            method457(null, -95);
        }
        field1253 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)Lb;")
    public final class12 method456(byte arg0) {
        this.field1257 = 0;
        if (arg0 < 109) {
            method455(-21);
        }
        field1242++;
        return this.method459((byte) -87);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lah;I)V")
    public static final void method457(class9 arg0, int arg1) {
        if (class97.field1775 == arg0.field297) {
            class173.field3126[arg0.field204] = true;
        }
        if (arg1 != 0) {
            field1253 = null;
        }
        field1252++;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)Lb;")
    public final class12 method458(byte arg0) {
        field1251++;
        if (this.field1243 == null) {
            return null;
        }
        class12 var2 = this.field1246[(int) ((long) (this.field1254 - 1) & this.field1255)];
        while (this.field1243 != var2) {
            if (this.field1243.field389 == this.field1255) {
                class12 var3 = this.field1243;
                this.field1243 = this.field1243.field382;
                return var3;
            }
            this.field1243 = this.field1243.field382;
        }
        this.field1243 = null;
        if (arg0 != 96) {
            this.method461(-24L, (byte) 111, null);
        }
        return null;
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(B)Lb;")
    public final class12 method459(byte arg0) {
        field1247++;
        if (this.field1257 > 0 && this.field1246[this.field1257 - 1] != this.field1256) {
            class12 var2 = this.field1256;
            this.field1256 = var2.field382;
            return var2;
        }
        while (this.field1257 < this.field1254) {
            class12 var3 = this.field1246[this.field1257++].field382;
            if (this.field1246[this.field1257 - 1] != var3) {
                this.field1256 = var3.field382;
                return var3;
            }
        }
        if (arg0 != -87) {
            this.method459((byte) -101);
        }
        return null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(JI)Lb;")
    public final class12 method460(long arg0, int arg1) {
        this.field1255 = arg0;
        field1239++;
        if (arg1 != 1) {
            this.method461(-13L, (byte) -51, null);
        }
        class12 var4 = this.field1246[(int) (arg0 & (long) (this.field1254 - 1))];
        for (this.field1243 = var4.field382; this.field1243 != var4; this.field1243 = this.field1243.field382) {
            if (this.field1243.field389 == arg0) {
                class12 var5 = this.field1243;
                this.field1243 = this.field1243.field382;
                return var5;
            }
        }
        this.field1243 = null;
        return null;
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(I)V")
    public class62(int arg0) {
        this.field1254 = arg0;
        this.field1246 = new class12[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class12 var3 = this.field1246[var2] = new class12();
            var3.field393 = var3;
            var3.field382 = var3;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(JBLb;)V")
    public final void method461(long arg0, byte arg1, class12 arg2) {
        if (arg2.field393 != null) {
            arg2.method123((byte) -126);
        }
        class12 var5 = this.field1246[(int) (arg0 & (long) (this.field1254 - 1))];
        arg2.field382 = var5;
        if (arg1 > -10) {
            this.method461(3L, (byte) -70, null);
        }
        field1244++;
        arg2.field389 = arg0;
        arg2.field393 = var5.field393;
        arg2.field393.field382 = arg2;
        arg2.field382.field393 = arg2;
    }
}
