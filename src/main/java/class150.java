import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public abstract class class150 implements class37 {

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "Luu;")
    private class237 field2076;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "Lcv;")
    public class545 field2073;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "Luu;")
    public class237 field2074;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
    public static int field2077 = class200.method1219(1600, 8);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    private int field2071;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "J")
    private long field2070;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "Lda;")
    private class402 field2078;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    public void method200(int arg0) {
        field2069++;
        class179 var2 = class363.method2306(this.field2073.field7549, this.field2076, (byte) 117);
        this.field2078 = class129.field1802.method1392(var2, class52.method384(this.field2074, this.field2073.field7549), true);
        if (arg0 <= 12) {
            this.method600(-102, false, -64, 87);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZII)V")
    public abstract void method600(int arg0, boolean arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)Z")
    public boolean method202(byte arg0) {
        field2079++;
        boolean var2 = true;
        if (!this.field2074.method1578(this.field2073.field7549, (byte) -81)) {
            var2 = false;
        }
        if (arg0 > -46) {
            this.method202((byte) -22);
        }
        if (!this.field2076.method1578(this.field2073.field7549, (byte) -81)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)I")
    public static final int method955(int arg0) {
        if (arg0 != 0) {
            method955(-17);
        }
        field2075++;
        return class521.field7260 == 1 ? class559.field7774 : class462.field6420;
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Luu;Luu;Lcv;)V")
    public class150(class237 arg0, class237 arg1, class545 arg2) {
        this.field2076 = arg1;
        this.field2073 = arg2;
        this.field2074 = arg0;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BZ)V")
    public final void method201(byte arg0, boolean arg1) {
        field2072++;
        int var3 = this.field2073.field7560.method3281(false, class732.field10164, this.field2073.field7561) + this.field2073.field7557;
        int var4 = this.field2073.field7553.method779(this.field2073.field7550, class84.field1195, 14) + this.field2073.field7562;
        this.method600(var4, arg1, var3, 0);
        this.method597(var4, var3, arg1, (byte) -92);
        if (arg0 > -74) {
            field2077 = -49;
        }
        String var5 = class155.field2184.method2775(0);
        if (class97.method664((byte) -50) - this.field2070 > 10000L) {
            var5 = var5 + " (" + class155.field2184.method2771(-23515).method2976((byte) 121) + ")";
        }
        this.field2078.method2508(var5, this.field2073.field7550 / 2 + var4 - (-this.field2073.field7555 - 4), this.field2073.field7563, -1, 66, this.field2073.field7561 / 2 + var3);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIZB)V")
    public abstract void method597(int arg0, int arg1, boolean arg2, byte arg3);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)I")
    public final int method956(int arg0) {
        field2080++;
        int var2 = class155.field2184.method2777(20);
        int var3 = var2 * 100;
        if (this.field2071 == var2 && var2 != 0) {
            int var4 = class155.field2184.method2769(16777215);
            if (var2 < var4) {
                long var5 = this.field2070 - class155.field2184.method2773(-1);
                if (var5 > 0L) {
                    long var7 = var5 * 10000L / (long) var2 * (long) (var4 - var2);
                    long var9 = (class97.method664((byte) -50) - this.field2070) * 10000L;
                    if (var7 <= var9) {
                        var3 = var4 * 100;
                    } else {
                        var3 = (int) ((long) (var4 - var2) * var9 * 100L / var7 + (long) (var2 * 100));
                    }
                }
            }
        } else {
            this.field2071 = var2;
            this.field2070 = class97.method664((byte) -50);
        }
        int var11 = 98 % ((-arg0 - 33) / 55);
        return var3;
    }
}
