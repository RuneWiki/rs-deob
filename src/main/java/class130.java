import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class130 extends class252 {

    @OriginalMember(owner = "client!wi", name = "X", descriptor = "I")
    private int field2272 = 4096;

    @OriginalMember(owner = "client!wi", name = "ab", descriptor = "I")
    private int field2275 = 0;

    @OriginalMember(owner = "client!wi", name = "Y", descriptor = "Ljd;")
    public static class85 field2273 = class221.method1499("loc", (byte) -58);

    @OriginalMember(owner = "client!wi", name = "bb", descriptor = "Ljd;")
    public static class85 field2276 = class221.method1499(")3", (byte) -84);

    @OriginalMember(owner = "client!wi", name = "cb", descriptor = "Ljd;")
    public static class85 field2277 = class221.method1499("VOLL", (byte) 103);

    @OriginalMember(owner = "client!wi", name = "V", descriptor = "Ljd;")
    public static class85 field2270 = class221.method1499("Ausw-=hlen", (byte) -94);

    @OriginalMember(owner = "client!wi", name = "T", descriptor = "Ljd;")
    private static class85 field2268 = class221.method1499("glow2:", (byte) -77);

    @OriginalMember(owner = "client!wi", name = "db", descriptor = "Ljd;")
    public static class85 field2278 = field2268;

    @OriginalMember(owner = "client!wi", name = "Z", descriptor = "Ljd;")
    public static class85 field2274 = field2268;

    @OriginalMember(owner = "client!wi", name = "U", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!wi", name = "W", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!wi", name = "fb", descriptor = "Lmf;")
    public static class10 field2280;

    @OriginalMember(owner = "client!wi", name = "eb", descriptor = "[I")
    public static int[] field2279;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "(I)V")
    public static void method875(int arg0) {
        field2276 = null;
        field2277 = null;
        if (arg0 != 128) {
            field2274 = null;
        }
        field2274 = null;
        field2268 = null;
        field2270 = null;
        field2279 = null;
        field2280 = null;
        field2273 = null;
        field2278 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIILqb;IJZ)Z")
    public static final boolean method876(int arg0, int arg1, int arg2, int arg3, int arg4, class56 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        } else {
            int var10 = arg1 - arg4;
            int var11 = arg2 - arg4;
            int var12 = arg1 + arg4;
            int var13 = arg2 + arg4;
            if (arg8) {
                if (arg6 > 640 && arg6 < 1408) {
                    var13 += 128;
                }
                if (arg6 > 1152 && arg6 < 1920) {
                    var12 += 128;
                }
                if (arg6 > 1664 || arg6 < 384) {
                    var11 -= 128;
                }
                if (arg6 > 128 && arg6 < 896) {
                    var10 -= 128;
                }
            }
            int var14 = var10 / 128;
            int var15 = var11 / 128;
            int var16 = var12 / 128;
            int var17 = var13 / 128;
            return class180.method1236(arg0, var14, var15, var16 - var14 + 1, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V")
    public class130() {
        super(1, true);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lik;IB)V")
    public final void method88(class247 arg0, int arg1, byte arg2) {
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                this.field2272 = arg0.method1694((byte) -100);
            }
        } else {
            this.field2275 = arg0.method1694((byte) -100);
        }
        if (arg2 != -99) {
            field2280 = null;
        }
        ++field2271;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(IB)[I")
    public final int[] method149(int arg0, byte arg1) {
        ++field2269;
        if (arg1 != -55) {
            return null;
        } else {
            int[] var3 = super.field4356.method868(arg0, (byte) -41);
            if (super.field4356.field2258) {
                int[] var4 = this.method1742((byte) 8, 0, arg0);
                for (int var5 = 0; var5 < class5.field63; ++var5) {
                    int var6 = var4[var5];
                    var3[var5] = ~this.field2275 >= ~var6 && this.field2272 >= var6 ? 4096 : 0;
                }
            }
            return var3;
        }
    }
}
