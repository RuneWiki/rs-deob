import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class502 {

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "J")
    private long field6739;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "I")
    private int field6746;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
    public static int field6738;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "I")
    public static int field6740;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
    public static int field6741;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "I")
    public static int field6742;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
    public static int field6743;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "I")
    public static int field6744;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "I")
    public static int field6745;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)I", line = 4)
    public final int method2825(byte arg0) {
        field6743++;
        if (arg0 != -98) {
            this.field6746 = -33;
        }
        return this.field6746;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIZ)I", line = 16)
    public static final int method2826(int arg0, int arg1, boolean arg2) {
        field6738++;
        double var3 = Math.log((double) arg0) / Math.log(2.0D);
        if (arg2) {
            double var5 = Math.log((double) arg1) / Math.log(2.0D);
            double var7 = (var3 - var5) * Math.random() + var5;
            return (int) (Math.pow(2.0D, var7) + 0.5D);
        } else {
            return -10;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)Lfea;", line = 33)
    public final class143 method2827(int arg0, int arg1) {
        if (arg0 == -24713) {
            field6745++;
            return class143.method1090(this.method2829(arg1, (byte) -81), (byte) 83);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lfea;B)V", line = 44)
    private final void method2828(class143 arg0, byte arg1) {
        field6742++;
        if (arg1 != 70) {
            this.method2828(null, (byte) -48);
        }
        this.field6739 |= (arg0.field2274 << this.field6746++ * class143.field2288);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IB)I", line = 64)
    private final int method2829(int arg0, byte arg1) {
        if (arg1 != -81) {
            this.field6739 = -75L;
        }
        field6741++;
        return (int) (this.field6739 >> class143.field2288 * arg0) & 0xF;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZBII)I", line = 75)
    public static final int method2830(boolean arg0, byte arg1, int arg2, int arg3) {
        field6740++;
        class287 var4 = class271.method1629(arg0, arg2, (byte) -60);
        if (var4 == null) {
            return 0;
        } else {
            int var5 = 52 % ((35 - arg1) / 47);
            return arg3 >= 0 && var4.field4063.length > arg3 ? var4.field4063[arg3] : 0;
        }
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lfea;)V", line = 93)
    public class502(class143 arg0) {
        this.field6739 = arg0.field2274;
        this.field6746 = 1;
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "([Lfea;)V", line = 101)
    public class502(class143[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method2828(arg0[var2], (byte) 70);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(BLpf;III)V", line = 115)
    public static final void method2831(byte arg0, class583 arg1, int arg2, int arg3, int arg4) {
        field6744++;
        arg1.field7637.method3798(27695, arg2);
        arg1.field7637.method3780(arg4, 66);
        arg1.field7637.method3780(arg3, arg0 + 35);
        if (arg0 == 30) {
            ;
        }
    }
}
