import jaggl.OpenGL;
import java.awt.Frame;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class220 extends class776 {

    @OriginalMember(owner = "client!eq", name = "P", descriptor = "[[B")
    private byte[][] field3141 = new byte[10][];

    @OriginalMember(owner = "client!eq", name = "K", descriptor = "Lrv;")
    private class120 field3136 = new class120(null);

    @OriginalMember(owner = "client!eq", name = "U", descriptor = "Lrv;")
    private class120 field3146 = new class120(null);

    @OriginalMember(owner = "client!eq", name = "R", descriptor = "I")
    private int field3143;

    @OriginalMember(owner = "client!eq", name = "O", descriptor = "Lcb;")
    private class544 field3140;

    @OriginalMember(owner = "client!eq", name = "J", descriptor = "[[I")
    public static int[][] field3135 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!eq", name = "N", descriptor = "Lke;")
    public static class622 field3139 = new class622(41, -1);

    @OriginalMember(owner = "client!eq", name = "A", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!eq", name = "G", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!eq", name = "H", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!eq", name = "L", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!eq", name = "M", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!eq", name = "Q", descriptor = "I")
    private int field3142;

    @OriginalMember(owner = "client!eq", name = "S", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!eq", name = "I", descriptor = "Lda;")
    public static class67 field3134;

    @OriginalMember(owner = "client!eq", name = "T", descriptor = "[I")
    private int[] field3145;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(BI[FIIII)V", line = 4)
    public static final void method1516(byte arg0, int arg1, float[] arg2, int arg3, int arg4, int arg5, int arg6) {
        field3131++;
        if (arg5 > 0 && !class315.method2071(-128, arg5)) {
            throw new IllegalArgumentException("");
        } else if (arg6 <= 0 || class315.method2071(-128, arg6)) {
            int var7 = class488.method2853(arg1, false);
            int var8 = 0;
            int var9 = arg6 > arg5 ? arg5 : arg6;
            int var10 = arg5 >> 1;
            if (arg0 >= -28) {
                field3139 = null;
            }
            int var11 = arg6 >> 1;
            float[] var12 = arg2;
            float[] var13 = new float[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Df(arg3, var8, arg4, arg5, arg6, 0, arg1, 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg5 * var7;
                for (int var15 = 0; var15 < var7; var15++) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var15 + var14;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            float var22 = var12[var18];
                            int var23 = var7 + var18;
                            float var24 = var12[var23] + var22;
                            var18 = var7 + var23;
                            float var25 = var12[var19] + var24;
                            int var26 = var7 + var19;
                            float var27 = var12[var26] + var25;
                            var19 = var7 + var26;
                            var13[var17] = var27 * 0.25F;
                            var17 += var7;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                float[] var16 = var13;
                var13 = var12;
                var12 = var16;
                arg6 = var11;
                arg5 = var10;
                var9 >>= 0x1;
                var11 >>= 0x1;
                var8++;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lrv;I)Ltp;", line = 101)
    public static final class557 method1517(class120 arg0, int arg1) {
        field3138++;
        String var2 = arg0.method861(true);
        class336 var3 = class329.method2126(true)[arg0.method842(2384)];
        class185 var4 = class674.method3822(true)[arg0.method842(2384)];
        int var5 = arg0.method838(true);
        int var6 = arg0.method838(true);
        if (arg1 < 17) {
            method1519(-61);
        }
        int var7 = arg0.method842(2384);
        int var8 = arg0.method842(2384);
        int var9 = arg0.method842(2384);
        int var10 = arg0.method898((byte) -83);
        int var11 = arg0.method898((byte) -111);
        int var12 = arg0.method871(23995);
        int var13 = arg0.method871(23995);
        int var14 = arg0.method871(23995);
        return new class557(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
    }

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "(I)V", line = 138)
    public final void method1518(int arg0) {
        field3132++;
        if (this.field3145 == null) {
            return;
        }
        for (int var2 = 0; var2 < 10 && this.field3145.length > (this.field3142 + var2); var2++) {
            if (this.field3141[var2] == null && this.field3140.method3135(-1, 0, this.field3145[this.field3142 + var2])) {
                this.field3141[var2] = this.field3140.method3150(0, 64, this.field3145[this.field3142 + var2]);
            }
        }
        int var3 = -29 / ((arg0 - 7) / 42);
    }

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "(I)Lib;", line = 170)
    public static final class162 method1519(int arg0) {
        field3133++;
        if (class384.field5475 < class194.field2859.length) {
            return class194.field2859[class384.field5475++];
        } else if (arg0 == 1) {
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(Z)V", line = 189)
    public static void method1520(boolean arg0) {
        if (!arg0) {
            field3135 = null;
            field3134 = null;
            field3139 = null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(ILcb;I)V", line = 209)
    public class220(int arg0, class544 arg1, int arg2) {
        super(arg0);
        this.field3143 = arg2;
        this.field3140 = arg1;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(B[B)I", line = 232)
    public final int method1521(byte arg0, byte[] arg1) throws IOException {
        field3137++;
        if (this.field3145 == null) {
            if (!this.field3140.method3135(-1, 0, this.field3143)) {
                return 0;
            }
            byte[] var3 = this.field3140.method3150(0, 72, this.field3143);
            if (var3 == null) {
                throw new IllegalStateException("");
            }
            this.field3146.field1521 = 0;
            this.field3146.field1556 = var3;
            int var4 = var3.length >> 1;
            this.field3145 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3145[var5] = this.field3146.method898((byte) -119);
            }
        }
        if (arg0 >= -53) {
            field3135 = null;
        }
        if (this.field3145.length <= this.field3142) {
            return -1;
        }
        this.method1518(122);
        this.field3146.field1521 = 0;
        this.field3146.field1556 = arg1;
        do {
            if (this.field3146.field1556.length <= this.field3146.field1521) {
                this.field3146.field1556 = null;
                return arg1.length;
            }
            if (this.field3136.field1556 == null) {
                if (this.field3141[0] == null) {
                    this.field3146.field1556 = null;
                    return this.field3146.field1521;
                }
                this.field3136.field1556 = this.field3141[0];
            }
            int var6 = this.field3146.field1556.length - this.field3146.field1521;
            int var7 = this.field3136.field1556.length - this.field3136.field1521;
            if (var7 > var6) {
                this.field3136.method850(255, this.field3146.field1521, var6, this.field3146.field1556);
                this.field3146.field1556 = null;
                return arg1.length;
            }
            this.field3146.method885(this.field3136.field1556, -18983, var7, this.field3136.field1521);
            this.field3142++;
            this.field3136.field1521 = 0;
            this.field3136.field1556 = null;
            for (int var8 = 0; var8 < 9; var8++) {
                this.field3141[var8] = this.field3141[var8 + 1];
            }
            this.field3141[9] = null;
        } while (this.field3142 < this.field3145.length);
        this.field3146.field1556 = null;
        return this.field3146.field1521;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IILkj;BII)Ljava/awt/Frame;", line = 328)
    public static final Frame method1522(int arg0, int arg1, class590 arg2, byte arg3, int arg4, int arg5) {
        field3144++;
        if (!arg2.method3431((byte) 49)) {
            return null;
        }
        if (arg5 == 0) {
            class251[] var6 = class91.method644(-116, arg2);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field3551 == arg1 && var6[var8].field3550 == arg0 && (arg4 == 0 || var6[var8].field3552 == arg4) && (!var7 || var6[var8].field3548 > arg5)) {
                    var7 = true;
                    arg5 = var6[var8].field3548;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class370 var9 = arg2.method3430(arg0, 7, arg4, arg5, arg1);
        while (var9.field5314 == 0) {
            class117.method820(false, 10L);
        }
        int var10 = -45 % ((arg3 - 10) / 49);
        Frame var11 = (Frame) var9.field5317;
        if (var11 == null) {
            return null;
        } else if (var9.field5314 == 2) {
            class646.method3693(arg2, (byte) 84, var11);
            return null;
        } else {
            return var11;
        }
    }
}
