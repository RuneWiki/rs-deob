import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public abstract class class741 implements class762 {

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "Lpaa;")
    public class651 field10222;

    @OriginalMember(owner = "client!lga", name = "o", descriptor = "Laj;")
    private class333 field10235;

    @OriginalMember(owner = "client!lga", name = "c", descriptor = "Laj;")
    public class333 field10223;

    @OriginalMember(owner = "client!lga", name = "e", descriptor = "I")
    public static int field10225 = 0;

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "F")
    public static float field10221;

    @OriginalMember(owner = "client!lga", name = "f", descriptor = "I")
    private int field10226;

    @OriginalMember(owner = "client!lga", name = "h", descriptor = "I")
    public static int field10228;

    @OriginalMember(owner = "client!lga", name = "i", descriptor = "I")
    public static int field10229;

    @OriginalMember(owner = "client!lga", name = "j", descriptor = "I")
    public static int field10230;

    @OriginalMember(owner = "client!lga", name = "l", descriptor = "I")
    public static int field10232;

    @OriginalMember(owner = "client!lga", name = "m", descriptor = "I")
    public static int field10233;

    @OriginalMember(owner = "client!lga", name = "n", descriptor = "I")
    public static int field10234;

    @OriginalMember(owner = "client!lga", name = "k", descriptor = "J")
    private long field10231;

    @OriginalMember(owner = "client!lga", name = "d", descriptor = "Lub;")
    public static class22 field10224;

    @OriginalMember(owner = "client!lga", name = "g", descriptor = "Lda;")
    private class66 field10227;

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(I)V", line = 7)
    public void method16(int arg0) {
        field10234++;
        if (arg0 > 36) {
            class255 var2 = class194.method1335(this.field10235, -5707, this.field10222.field9034);
            this.field10227 = class379.field5542.method545(var2, class508.method2943(this.field10223, this.field10222.field9034), true);
        }
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(IZ)V", line = 26)
    public final void method1500(int arg0, boolean arg1) {
        field10230++;
        int var3 = this.field10222.field9027.method3160(this.field10222.field9033, class124.field1786, (byte) -91) + this.field10222.field9031;
        int var4 = this.field10222.field9024.method3543(0, class710.field9945, this.field10222.field9025) + this.field10222.field9028;
        this.method14(arg1, (byte) 28, var3, var4);
        if (arg0 >= -93) {
            this.field10222 = null;
        }
        this.method13(var4, arg1, 118, var3);
        String var5 = class209.field2778.method4265(-113);
        if ((class302.method1910(0) - this.field10231) > 10000L) {
            var5 = var5 + " (" + class209.field2778.method4268((byte) -9).method167(-10247) + ")";
        }
        this.field10227.method579(this.field10222.field9033 / 2 + var3, -1, this.field10222.field9032, (byte) 85, var5, this.field10222.field9025 / 2 + var4 + this.field10222.field9029 + 4);
    }

    @OriginalMember(owner = "client!lga", name = "c", descriptor = "(I)V", line = 49)
    public static void method4102(int arg0) {
        if (arg0 >= 42) {
            field10224 = null;
        }
    }

    @OriginalMember(owner = "client!lga", name = "d", descriptor = "(I)I", line = 63)
    public final int method4103(int arg0) {
        field10229++;
        int var2 = class209.field2778.method4259(55);
        int var3 = var2 * 100;
        if (this.field10226 == var2 && var2 != 0) {
            int var4 = class209.field2778.method4260(true);
            if (var4 > var2) {
                long var5 = this.field10231 - class209.field2778.method4271(1);
                if (var5 > 0L) {
                    long var7 = var5 * 10000L / (long) var2 * (long) (var4 - var2);
                    long var9 = (class302.method1910(arg0 ^ 0x800) - this.field10231) * 10000L;
                    if (var9 >= var7) {
                        var3 = var4 * 100;
                    } else {
                        var3 = (int) (var9 * 100L * (long) (var4 - var2) / var7 + ((long) (var2 * 100)));
                    }
                }
            }
        } else {
            this.field10226 = var2;
            this.field10231 = class302.method1910(0);
        }
        if (arg0 != 2048) {
            this.method13(-108, true, 123, -95);
        }
        return var3;
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(III)Z", line = 115)
    public static final boolean method4104(int arg0, int arg1, int arg2) {
        field10233++;
        int var3 = 127 / ((arg1 - 31) / 33);
        return class52.method383(arg2, arg0, 19) | (arg0 & 0x800) != 0 || class291.method1844(arg2, 0, arg0);
    }

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "(I)Z", line = 126)
    public boolean method15(int arg0) {
        if (arg0 != 20662) {
            this.method4103(-128);
        }
        field10228++;
        boolean var2 = true;
        if (!this.field10223.method2104(arg0 - 20770, this.field10222.field9034)) {
            var2 = false;
        }
        if (!this.field10235.method2104(-126, this.field10222.field9034)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(Laj;Laj;Lpaa;)V", line = 151)
    public class741(class333 arg0, class333 arg1, class651 arg2) {
        this.field10222 = arg2;
        this.field10235 = arg1;
        this.field10223 = arg0;
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(IZII)V")
    public abstract void method13(int arg0, boolean arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(ZBII)V")
    public abstract void method14(boolean arg0, byte arg1, int arg2, int arg3);
}
