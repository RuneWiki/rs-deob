import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class292 extends class72 {

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
    private int field4242;

    @OriginalMember(owner = "client!ea", name = "L", descriptor = "I")
    private int field4257;

    @OriginalMember(owner = "client!ea", name = "F", descriptor = "I")
    private int field4251;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    private int field4239;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "Lmc;")
    public static class206 field4244 = new class206(0, 0);

    @OriginalMember(owner = "client!ea", name = "M", descriptor = "I")
    public static int field4258 = 0;

    @OriginalMember(owner = "client!ea", name = "G", descriptor = "[[Z")
    public static boolean[][] field4252 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

    @OriginalMember(owner = "client!ea", name = "K", descriptor = "I")
    public static int field4256 = 1;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
    private int field4241;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "I")
    private int field4246;

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "I")
    private int field4247;

    @OriginalMember(owner = "client!ea", name = "D", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!ea", name = "J", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!ea", name = "N", descriptor = "I")
    private int field4259;

    @OriginalMember(owner = "client!ea", name = "I", descriptor = "Lfh;")
    public static class140 field4254;

    @OriginalMember(owner = "client!ea", name = "E", descriptor = "Ljava/awt/Image;")
    public static Image field4250;

    @OriginalMember(owner = "client!ea", name = "C", descriptor = "[B")
    private byte[] field4248;

    @OriginalMember(owner = "client!ea", name = "H", descriptor = "[I")
    public static int[] field4253;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)V", line = 7)
    public static final void method2001(int arg0) {
        field4240++;
        int var1 = 48 / ((arg0 - 18) / 61);
        for (int var2 = 0; var2 < 100; var2++) {
            class229.field3276[var2] = true;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)V", line = 29)
    public void method1136(int arg0, byte arg1) {
        this.field4248[arg0] = arg1;
        field4238++;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V", line = 40)
    public final void method531(byte arg0) {
        this.field4239 = this.field4251;
        this.field4247 >>= 0x4;
        field4245++;
        if (this.field4247 < 0) {
            this.field4247 = 0;
        } else if (this.field4247 > 255) {
            this.field4247 = 255;
        }
        int var2 = 85 % ((arg0 - 61) / 35);
        this.method1136(this.field4241++, (byte) this.field4247);
        this.field4247 = 0;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)Lhi;", line = 61)
    public static final class201 method2002(byte arg0, int arg1) {
        field4243++;
        if (arg0 > -105) {
            method2002((byte) 102, 66);
        }
        class201 var2 = (class201) class217.field3062.method2265((long) arg1, (byte) 64);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class362.field5656.method1089(16, (byte) 110, arg1);
        class201 var4 = new class201();
        if (var3 != null) {
            var4.method1477(new class299(var3), 40);
        }
        class217.field3062.method2257(-125, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IBIII)Leh;", line = 103)
    public static final class324 method2003(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        int var5 = -36 / ((arg1 - 76) / 50);
        field4237++;
        long var6 = (long) arg3 & 0xFFFFL | ((long) arg0 & 0xFFFFL) << 48 | ((long) arg2 & 0xFFFFL) << 32 | ((long) arg4 & 0xFFFFL) << 16;
        class324 var8 = (class324) class122.field1597.method2265(var6, (byte) 33);
        if (var8 != null) {
            return var8;
        }
        class108[] var9 = null;
        class338 var10 = class172.method1268(arg3, (byte) -83);
        if (var10.field5273 != null) {
            var9 = new class108[var10.field5273.length];
            for (int var11 = 0; var11 < var9.length; var11++) {
                class346 var12 = class333.method2327((byte) -10, var10.field5273[var11]);
                var9[var11] = new class108(var12.field5384, var12.field5374, var12.field5372, var12.field5373, var12.field5377, var12.field5385, var12.field5380, var12.field5376);
            }
        }
        class324 var13 = new class324(var10.field5275, var9, var10.field5268, arg0, arg2, arg4);
        class122.field1597.method2257(-127, var13, var6);
        return var13;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 143)
    public final void method534(int arg0) {
        this.field4247 = 0;
        this.field4241 = 0;
        field4249++;
        if (arg0 != 255) {
            method2003(-3, (byte) 87, -16, 108, -56);
        }
    }

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)V", line = 158)
    public static void method2004(int arg0) {
        field4253 = null;
        field4250 = null;
        field4244 = null;
        field4254 = null;
        if (arg0 == 2061936524) {
            field4252 = (boolean[][]) null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIB)V", line = 174)
    public final void method536(int arg0, int arg1, byte arg2) {
        if (arg0 == 0) {
            this.field4246 = 4096;
            this.field4259 = this.field4242 - (arg1 < 0 ? -arg1 : arg1);
            this.field4259 = this.field4259 * this.field4259 >> 12;
            this.field4247 = this.field4259;
        } else {
            this.field4246 = this.field4259 * this.field4257 >> 12;
            if (this.field4246 < 0) {
                this.field4246 = 0;
            } else if (this.field4246 > 4096) {
                this.field4246 = 4096;
            }
            this.field4259 = this.field4242 - (arg1 < 0 ? -arg1 : arg1);
            this.field4259 = this.field4259 * this.field4259 >> 12;
            this.field4259 = this.field4259 * this.field4246 >> 12;
            this.field4247 += this.field4259 * this.field4239 >> 12;
            this.field4239 = this.field4251 * this.field4239 >> 12;
        }
        if (arg2 >= -17) {
            field4250 = (Image) null;
        }
        field4255++;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(IIIIIFFF)V", line = 214)
    public class292(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field4242 = (int) (arg6 * 4096.0F);
        this.field4257 = (int) (arg7 * 4096.0F);
        this.field4239 = this.field4251 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }
}
