import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class144 extends class8 {

    @OriginalMember(owner = "client!w", name = "S", descriptor = "I")
    private int field2321 = 585;

    @OriginalMember(owner = "client!w", name = "L", descriptor = "I")
    public static int field2314 = 0;

    @OriginalMember(owner = "client!w", name = "K", descriptor = "I")
    public static int field2313 = 0;

    @OriginalMember(owner = "client!w", name = "J", descriptor = "Z")
    public static boolean field2312 = false;

    @OriginalMember(owner = "client!w", name = "N", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!w", name = "O", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!w", name = "P", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!w", name = "R", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!w", name = "I", descriptor = "[B")
    public static byte[] field2311;

    @OriginalMember(owner = "client!w", name = "M", descriptor = "[[Z")
    public static boolean[][] field2315;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        ++field2317;
        int[] var3 = super.field110.method1585(0, arg1);
        if (arg0 != 3) {
            method988((byte) -89);
        }
        if (super.field110.field3734) {
            int var4 = class182.field2864[arg1];
            for (int var5 = 0; ~var5 > ~class231.field3798; ++var5) {
                int var6 = class176.field2776[var5];
                if (var6 > this.field2321 && var6 < -this.field2321 + 4096 && ~(-this.field2321 + 2048) > ~var4 && this.field2321 + 2048 > var4) {
                    int var7 = 2048 - var6;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field2321 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (var6 > 2048 - this.field2321 && this.field2321 + 2048 > var6) {
                    int var11 = var4 + -2048;
                    int var12 = ~var11 <= -1 ? var11 : -var11;
                    int var13 = var12 - this.field2321;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field2321 + 2048);
                } else if (~var4 <= ~this.field2321 && ~var4 >= ~(-this.field2321 + 4096)) {
                    if (var6 >= this.field2321 && -this.field2321 + 4096 >= var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 < 0 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field2321 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 > -1 ? -var19 : var19;
                    int var21 = var20 - this.field2321;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field2321 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIZ)I")
    public static final int method987(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field2311 = null;
        }
        ++field2320;
        if (arg0 == -1) {
            return 12345678;
        } else {
            int var3 = (127 & arg0) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 65408) + var3;
        }
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V")
    public class144() {
        super(0, true);
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(B)V")
    public static void method988(byte arg0) {
        field2311 = null;
        field2315 = null;
        int var1 = 61 % ((arg0 - -10) / 32);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lfa;I)V")
    public static final void method989(class251 arg0, int arg1) {
        if (arg0.field3987 != null) {
            arg0.field3987.field4220 = 0;
        }
        ++field2318;
        if (arg1 != 0) {
            field2313 = -119;
        }
        arg0.field3986 = false;
        for (class251 var2 = arg0.method153(); var2 != null; var2 = arg0.method154()) {
            method989(var2, 0);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILjava/awt/Component;II)Lme;")
    public static final class224 method990(int arg0, Component arg1, int arg2, int arg3) {
        ++field2316;
        if (arg0 != 4096) {
            method990(69, (Component) null, -30, 41);
        }
        try {
            Class var4 = Class.forName("uc");
            class224 var5 = (class224) var4.newInstance();
            var5.method336(arg1, arg3, arg2, -107);
            return var5;
        } catch (Throwable var7) {
            class72 var6 = new class72();
            var6.method336(arg1, arg3, arg2, -111);
            return var6;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BLog;I)V")
    public final void method64(byte arg0, class221 arg1, int arg2) {
        ++field2319;
        if (arg0 >= 62) {
            if (~arg2 == -1) {
                this.field2321 = arg1.method1521((byte) 113);
            }
        }
    }
}
