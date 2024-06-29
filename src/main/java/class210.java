import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class210 extends class203 {

    @OriginalMember(owner = "client!td", name = "F", descriptor = "I")
    private final int field3913;

    @OriginalMember(owner = "client!td", name = "A", descriptor = "I")
    private final int field3908;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "I")
    private final int field3907;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "I")
    private final int field3905;

    @OriginalMember(owner = "client!td", name = "u", descriptor = "Llc;")
    public static class143 field3902 = class66.method374("<col=ffff00>", -1);

    @OriginalMember(owner = "client!td", name = "y", descriptor = "Llc;")
    public static class143 field3906 = class66.method374(":chalreq:", -1);

    @OriginalMember(owner = "client!td", name = "w", descriptor = "Llc;")
    public static class143 field3904 = null;

    @OriginalMember(owner = "client!td", name = "B", descriptor = "I")
    public static int field3909 = (int) (33.0D * Math.random()) - 16;

    @OriginalMember(owner = "client!td", name = "C", descriptor = "Llc;")
    public static class143 field3910 = class66.method374("3D)2Softwarebibliothek gestartet)3", -1);

    @OriginalMember(owner = "client!td", name = "r", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!td", name = "t", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!td", name = "D", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!td", name = "E", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IBI)V")
    public final void method497(int arg0, byte arg1, int arg2) {
        ++field3900;
        if (arg1 >= -17) {
            this.method497(-50, (byte) -39, 93);
        }
        int var4 = this.field3905 * arg2 >> 12;
        int var5 = this.field3908 * arg0 >> 12;
        int var6 = this.field3913 * arg2 >> 12;
        int var7 = this.field3907 * arg0 >> 12;
        class119.method730(var6, var5, super.field3688, var7, var4, 117, super.field3686);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
    public static final void method1469(int arg0) {
        int var1 = -22 / ((arg0 - -36) / 37);
        ++field3899;
        class143.field2518 = new class277(32);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
    public static void method1470(boolean arg0) {
        if (!arg0) {
            field3904 = null;
        }
        field3902 = null;
        field3910 = null;
        field3904 = null;
        field3906 = null;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(IIIIIII)V")
    public class210(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3913 = arg0;
        this.field3908 = arg1;
        this.field3907 = arg3;
        this.field3905 = arg2;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZILlc;)V")
    public static final void method1471(boolean arg0, int arg1, class143 arg2) {
        ++field3911;
        short[] var3 = new short[16];
        if (arg1 != 241) {
            field3909 = -103;
        }
        int var4 = 0;
        class143 var5 = arg2.method868(-64);
        int var6 = arg0 ? 32768 : 0;
        int var7 = var6 - -(!arg0 ? class274.field4877 : class234.field4267);
        for (int var8 = var6; var8 < var7; ++var8) {
            class204 var11 = class13.method103(arg1 ^ 140, var8);
            if (var11.field3702 && var11.method1391((byte) 19).method868(98).method891(-31978, var5) != -1) {
                if (var4 >= 50) {
                    class30.field472 = -1;
                    class107.field1892 = null;
                    return;
                }
                if (var3.length <= var4) {
                    short[] var12 = new short[var3.length * 2];
                    for (int var13 = 0; ~var4 < ~var13; ++var13) {
                        var12[var13] = var3[var13];
                    }
                    var3 = var12;
                }
                var3[var4++] = (short) var8;
            }
        }
        class30.field472 = var4;
        class24.field407 = 0;
        class143[] var9 = new class143[class30.field472];
        class107.field1892 = var3;
        for (int var10 = 0; class30.field472 > var10; ++var10) {
            var9[var10] = class13.method103(97, var3[var10]).method1391((byte) 19);
        }
        class37.method247(class107.field1892, var9, (byte) 63);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BII)V")
    public final void method500(byte arg0, int arg1, int arg2) {
        ++field3903;
        int var4 = this.field3908 * arg1 >> 12;
        int var5 = this.field3913 * arg2 >> 12;
        int var6 = this.field3905 * arg2 >> 12;
        int var7 = -112 / ((arg0 - -14) / 59);
        int var8 = this.field3907 * arg1 >> 12;
        class194.method1339(var4, super.field3696, var5, -2, var6, var8);
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(III)V")
    public final void method498(int arg0, int arg1, int arg2) {
        ++field3901;
        if (arg0 != -13349) {
            field3910 = null;
        }
        int var4 = this.field3905 * arg1 >> 12;
        int var5 = this.field3913 * arg1 >> 12;
        int var6 = this.field3908 * arg2 >> 12;
        int var7 = this.field3907 * arg2 >> 12;
        class203.method1388(var7, super.field3688, var4, false, super.field3696, var5, var6, super.field3686);
    }
}
