import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class130 extends class1 {

    @OriginalMember(owner = "client!mb", name = "kb", descriptor = "I")
    private int field2385;

    @OriginalMember(owner = "client!mb", name = "jb", descriptor = "Ljava/util/Random;")
    public static Random field2384 = new Random();

    @OriginalMember(owner = "client!mb", name = "lb", descriptor = "Loc;")
    public static class151 field2386 = class137.method873(2, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!mb", name = "ob", descriptor = "I")
    public static int field2389 = 1;

    @OriginalMember(owner = "client!mb", name = "nb", descriptor = "[I")
    public static int[] field2388 = new int[25];

    @OriginalMember(owner = "client!mb", name = "qb", descriptor = "Loc;")
    private static class151 field2391 = class137.method873(2, "Members only world");

    @OriginalMember(owner = "client!mb", name = "pb", descriptor = "Loc;")
    public static class151 field2390 = field2391;

    @OriginalMember(owner = "client!mb", name = "gb", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!mb", name = "hb", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!mb", name = "ib", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!mb", name = "mb", descriptor = "Lsd;")
    public static class192 field2387;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "([BIIIBIII[Ln;I)V")
    public static final void method811(byte[] arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, class138[] arg8, int arg9) {
        int var10 = -1;
        if (arg4 != -65) {
            field2386 = null;
        }
        class229 var11 = new class229(arg0);
        while (true) {
            int var12 = var11.method1440(arg4 ^ -19173);
            if (~var12 == -1) {
                ++field2383;
                return;
            }
            var10 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var11.method1440(19108);
                if (var14 == 0) {
                    break;
                }
                var13 += var14 + -1;
                int var15 = var13 & 63;
                int var16 = (4078 & var13) >> 6;
                int var17 = var13 >> 12;
                int var18 = var11.method1475(255);
                int var19 = var18 >> 2;
                int var20 = 3 & var18;
                if (~arg1 == ~var17 && arg2 <= var16 && ~(arg2 + 8) < ~var16 && arg3 <= var15 && arg3 + 8 > var15) {
                    class93 var21 = class5.method32((byte) 65, var10);
                    int var22 = class210.method1312(var21.field1697, arg4 ^ -12857, var20, 7 & var15, arg9, var16 & 7, var21.field1715) + arg6;
                    int var23 = arg7 + class11.method84(var21.field1715, 119, 7 & var15, var21.field1697, arg9, var20, 7 & var16);
                    if (var22 > 0 && ~var23 < -1 && var22 < 103 && ~var23 > -104) {
                        int var24 = arg5;
                        if (~(class122.field2191[1][var22][var23] & 2) == -3) {
                            var24 = arg5 - 1;
                        }
                        class138 var25 = null;
                        if (var24 >= 0) {
                            var25 = arg8[var24];
                        }
                        class155.method1017(var10, var20 - -arg9 & 3, var22, arg5, true, var25, arg5, var23, class13.field300, var19, false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(I)V")
    private class130(int arg0) {
        super(0, true);
        this.field2385 = 4096;
        this.field2385 = arg0;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
    public class130() {
        this(4096);
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(B)V")
    public static void method812(byte arg0) {
        field2386 = null;
        if (arg0 != 124) {
            field2386 = null;
        }
        field2391 = null;
        field2390 = null;
        field2384 = null;
        field2388 = null;
        field2387 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILwa;)V")
    public final void method13(int arg0, int arg1, class229 arg2) {
        if (~arg1 == -1) {
            this.field2385 = (arg2.method1475(arg0 + 255) << 12) / 255;
        }
        if (arg0 != 0) {
            field2386 = null;
        }
        ++field2381;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)[I")
    public final int[] method11(byte arg0, int arg1) {
        ++field2382;
        if (arg0 != 107) {
            method811((byte[]) null, 88, 71, -49, (byte) -32, 111, -20, -30, (class138[]) null, -2);
        }
        int[] var3 = super.field21.method1182(arg1, arg0 + -31816);
        if (super.field21.field3388) {
            class145.method923(var3, 0, class202.field3603, this.field2385);
        }
        return var3;
    }
}
