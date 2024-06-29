import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class384 {

    @OriginalMember(owner = "client!no", name = "m", descriptor = "I")
    private int field5395 = -1;

    @OriginalMember(owner = "client!no", name = "q", descriptor = "Z")
    private boolean field5399 = true;

    @OriginalMember(owner = "client!no", name = "f", descriptor = "I")
    private int field5388;

    @OriginalMember(owner = "client!no", name = "k", descriptor = "I")
    private int field5393;

    @OriginalMember(owner = "client!no", name = "o", descriptor = "I")
    private int field5397;

    @OriginalMember(owner = "client!no", name = "n", descriptor = "[Lqq;")
    private class82[] field5396;

    @OriginalMember(owner = "client!no", name = "g", descriptor = "I")
    private int field5389;

    @OriginalMember(owner = "client!no", name = "b", descriptor = "Lqq;")
    private class82 field5384;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "[Lqq;")
    private class82[] field5383;

    @OriginalMember(owner = "client!no", name = "j", descriptor = "[Ljava/awt/Color;")
    public static Color[] field5392 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

    @OriginalMember(owner = "client!no", name = "c", descriptor = "I")
    public static int field5385;

    @OriginalMember(owner = "client!no", name = "d", descriptor = "I")
    private int field5386;

    @OriginalMember(owner = "client!no", name = "e", descriptor = "I")
    public static int field5387;

    @OriginalMember(owner = "client!no", name = "h", descriptor = "I")
    private int field5390;

    @OriginalMember(owner = "client!no", name = "l", descriptor = "I")
    public static int field5394;

    @OriginalMember(owner = "client!no", name = "p", descriptor = "I")
    public static int field5398;

    @OriginalMember(owner = "client!no", name = "i", descriptor = "Lmq;")
    private class85 field5391;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2317(int arg0) {
        for (class421 var1 = (class421) class628.field8911.method3731((byte) -82); var1 != null; var1 = (class421) class628.field8911.method3729((byte) -127)) {
            if (var1.field5841) {
                var1.method2485(-78);
            }
        }
        field5387++;
        if (arg0 < 8) {
            field5392 = null;
        }
        for (class421 var2 = (class421) class254.field3641.method3731((byte) -72); var2 != null; var2 = (class421) class254.field3641.method3729((byte) -111)) {
            if (var2.field5841) {
                var2.method2485(-111);
            }
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IILha;IIIIIBI)V", line = 37)
    public final void method2318(int arg0, int arg1, class475 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        int var11 = arg4 + arg7 & 0x3FFF;
        field5394++;
        if (this.field5393 == -1 || this.field5386 == 0) {
            arg2.method436(arg6, arg1, arg5, arg0, arg9, 0);
        } else {
            class719 var12 = class106.field1527.method847(this.field5393, -126);
            if (this.field5391 == null && class106.field1527.method846(this.field5393, true)) {
                int[] var13 = var12.field10042 == 2 ? class106.field1527.method845(0.7F, this.field5393, false, (byte) 52, this.field5386, this.field5386) : class106.field1527.method844(false, (byte) 119, 0.7F, this.field5386, this.field5393, this.field5386);
                this.field5391 = arg2.method2773(1, this.field5386, var13, 0, this.field5386, this.field5386);
            }
            if (var12.field10042 == 2) {
                arg2.method436(arg6, arg1, arg5, arg0, arg9, 0);
            }
            if (this.field5391 != null) {
                int var14 = var12.field10042 == 2 ? 1 : 0;
                int var15 = arg0 * arg3 / -4096;
                int var16;
                for (var16 = (arg5 - arg0) / 2 + (arg0 * var11 / 4096); var16 > arg0; var16 -= arg0) {
                }
                while (var15 > arg0) {
                    var15 -= arg0;
                }
                while (var16 < 0) {
                    var16 += arg0;
                }
                while (var15 < 0) {
                    var15 += arg0;
                }
                for (int var17 = var16 - arg0; var17 < arg5; var17 += arg0) {
                    for (int var18 = var15 - arg0; var18 < arg0; var18 += arg0) {
                        this.field5391.method758(arg6 + var17, var18 - -arg1, arg0, arg0, 1, 0, var14);
                    }
                }
            }
        }
        int var19 = this.field5390 - 1;
        if (arg8 > 0) {
            this.method2320(113, null, -7);
        }
        while (var19 >= 0) {
            this.field5383[var19].method727(arg2, arg6, arg1, arg5, arg0, arg3, var11);
            var19--;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Z)V", line = 118)
    public static void method2319(boolean arg0) {
        if (arg0) {
            field5392 = null;
        }
        field5392 = null;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ILha;I)Z", line = 135)
    public final boolean method2320(int arg0, class475 arg1, int arg2) {
        if (arg2 != 23527) {
            this.field5395 = 27;
        }
        if (this.field5395 != arg0) {
            this.field5395 = arg0;
            int var4 = class515.method3025(arg0, 592877665);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field5386 != var4) {
                this.field5391 = null;
                this.field5386 = var4;
            }
            if (this.field5396 != null) {
                this.field5390 = 0;
                int[] var5 = new int[this.field5396.length];
                for (int var6 = 0; var6 < this.field5396.length; var6++) {
                    class82 var7 = this.field5396[var6];
                    if (var7.method722(this.field5388, this.field5397, this.field5389, this.field5395)) {
                        var5[this.field5390] = var7.field1209;
                        this.field5383[this.field5390++] = var7;
                    }
                }
                class413.method2433(this.field5390 - 1, 2, 0, var5, this.field5383);
            }
            this.field5399 = true;
        }
        field5385++;
        boolean var8 = false;
        if (this.field5399) {
            this.field5399 = false;
            for (int var9 = this.field5390 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field5383[var9].method726(arg1, this.field5384);
                var8 |= var10;
                this.field5399 |= !var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(JJ)J", line = 217)
    public static long method2321(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(B)V", line = 226)
    public final void method2322(byte arg0) {
        field5398++;
        int var2 = 19 / ((12 - arg0) / 42);
        if (this.field5396 != null) {
            for (int var3 = 0; var3 < this.field5396.length; var3++) {
                this.field5396[var3].method721();
            }
        }
        this.field5391 = null;
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(I[Lqq;IIII)V", line = 256)
    public class384(int arg0, class82[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5388 = arg3;
        this.field5393 = arg0;
        this.field5397 = arg4;
        this.field5396 = arg1;
        this.field5389 = arg5;
        if (arg1 == null) {
            this.field5384 = null;
            this.field5383 = null;
        } else {
            this.field5383 = new class82[arg1.length];
            this.field5384 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }
}
