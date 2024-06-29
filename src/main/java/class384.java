import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class384 extends class398 {

    @OriginalMember(owner = "client!uo", name = "P", descriptor = "I")
    private int field5558 = -1;

    @OriginalMember(owner = "client!uo", name = "U", descriptor = "I")
    public static int field5563 = 0;

    @OriginalMember(owner = "client!uo", name = "K", descriptor = "Ljava/lang/String;")
    public static String field5553 = "Use";

    @OriginalMember(owner = "client!uo", name = "X", descriptor = "I")
    public static int field5566 = 50;

    @OriginalMember(owner = "client!uo", name = "N", descriptor = "[I")
    public static int[] field5556 = new int[500];

    @OriginalMember(owner = "client!uo", name = "J", descriptor = "I")
    public int field5552;

    @OriginalMember(owner = "client!uo", name = "L", descriptor = "I")
    public static int field5554;

    @OriginalMember(owner = "client!uo", name = "M", descriptor = "I")
    public static int field5555;

    @OriginalMember(owner = "client!uo", name = "S", descriptor = "I")
    public static int field5561;

    @OriginalMember(owner = "client!uo", name = "T", descriptor = "I")
    public int field5562;

    @OriginalMember(owner = "client!uo", name = "V", descriptor = "I")
    public static int field5564;

    @OriginalMember(owner = "client!uo", name = "W", descriptor = "I")
    public static int field5565;

    @OriginalMember(owner = "client!uo", name = "Y", descriptor = "I")
    public static int field5567;

    @OriginalMember(owner = "client!uo", name = "Z", descriptor = "I")
    public static int field5568;

    @OriginalMember(owner = "client!uo", name = "O", descriptor = "Ltj;")
    public static class429 field5557;

    @OriginalMember(owner = "client!uo", name = "Q", descriptor = "[I")
    public int[] field5559;

    @OriginalMember(owner = "client!uo", name = "R", descriptor = "[[I")
    public static int[][] field5560;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lnj;II)V")
    public final void method208(class228 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field5558 = arg0.method1343(255);
        }
        ++field5564;
        if (arg2 != -13132) {
            this.method1273(12);
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lps;IIILcq;Lud;II)V")
    public static final void method2473(class394 arg0, int arg1, int arg2, int arg3, class67 arg4, class2 arg5, int arg6, int arg7) {
        int var8 = 53 % ((-68 - arg7) / 55);
        ++field5565;
        if (arg4 != null) {
            int var9;
            if (~class346.field4979 != -5) {
                var9 = (int) class396.field5847 + class399.field5948 & 16383;
            } else {
                var9 = (int) class396.field5847 & 16383;
            }
            int var10 = 10 + Math.max(arg0.field5773 / 2, arg0.field5672 / 2);
            int var11 = arg3 * arg3 + arg6 * arg6;
            if (~(var10 * var10) <= ~var11) {
                int var12 = class117.field1644[var9];
                int var13 = class117.field1636[var9];
                if (class346.field4979 != 4) {
                    var13 = var13 * 256 / (class364.field5261 + 256);
                    var12 = var12 * 256 / (class364.field5261 + 256);
                }
                int var14 = arg3 * var13 + arg6 * var12 >> 15;
                int var15 = arg6 * var13 + -(arg3 * var12) >> 15;
                arg4.method403(arg1 + var14 - (-(arg0.field5773 / 2) + arg4.method411() / 2), -var15 + arg0.field5672 / 2 + arg2 + -(arg4.method409() / 2), arg5, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "(I)V")
    public final void method1273(int arg0) {
        ++field5554;
        super.method1273(-104);
        this.field5559 = null;
        if (arg0 >= -31) {
            method2475(121, (String) null);
        }
    }

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(Z)Z")
    public final boolean method2474(boolean arg0) {
        ++field5561;
        if (this.field5559 != null) {
            return true;
        } else if (arg0) {
            return false;
        } else if (~this.field5558 <= -1) {
            class441 var2 = class84.field1210 < 0 ? class441.method2776(class94.field1354, this.field5558) : class441.method2778(class94.field1354, class84.field1210, this.field5558);
            var2.method2768();
            this.field5559 = var2.method2775();
            this.field5562 = var2.field6466;
            this.field5552 = var2.field6462;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static final long method2475(int arg0, String arg1) {
        ++field5555;
        if (arg0 != -20964) {
            method2477((byte) -79);
        }
        int var2 = arg1.length();
        long var3 = 0L;
        for (int var5 = 0; ~var2 < ~var5; ++var5) {
            var3 = (long) arg1.charAt(var5) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(B)I")
    public final int method2476(byte arg0) {
        if (arg0 != -21) {
            method2475(-21, (String) null);
        }
        ++field5568;
        return this.field5558;
    }

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(B)V")
    public static void method2477(byte arg0) {
        field5557 = null;
        field5556 = null;
        field5553 = null;
        int var1 = 91 / ((92 - arg0) / 32);
        field5560 = null;
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(II)[[I")
    public int[][] method99(int arg0, int arg1) {
        ++field5567;
        int[][] var3 = super.field5933.method2205((byte) -114, arg0);
        if (arg1 != 2) {
            return null;
        } else {
            if (super.field5933.field4847 && this.method2474(false)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = (~class329.field4798 != ~this.field5552 ? this.field5552 * arg0 / class329.field4798 : arg0) * this.field5562;
                if (class140.field1922 != this.field5562) {
                    for (int var8 = 0; ~var8 > ~class140.field1922; ++var8) {
                        int var9 = this.field5562 * var8 / class140.field1922;
                        int var10 = this.field5559[var7 - -var9];
                        var6[var8] = class183.method1117(4080, var10 << 4);
                        var5[var8] = class183.method1117(4080, var10 >> 4);
                        var4[var8] = class183.method1117(var10, 16711680) >> 12;
                    }
                } else {
                    for (int var11 = 0; class140.field1922 > var11; ++var11) {
                        int var12 = this.field5559[var7++];
                        var6[var11] = class183.method1117(var12, 255) << 4;
                        var5[var11] = class183.method1117(65280, var12) >> 4;
                        var4[var11] = class183.method1117(var12, 16711680) >> 12;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "()V")
    public class384() {
        super(0, false);
    }
}
