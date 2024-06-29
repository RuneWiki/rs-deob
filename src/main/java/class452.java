import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public class class452 extends class392 {

    @OriginalMember(owner = "client!jea", name = "B", descriptor = "I")
    private int field6305;

    @OriginalMember(owner = "client!jea", name = "A", descriptor = "Lfc;")
    public static class262 field6304 = new class262(30);

    @OriginalMember(owner = "client!jea", name = "v", descriptor = "I")
    public static int field6299;

    @OriginalMember(owner = "client!jea", name = "w", descriptor = "I")
    public static int field6300;

    @OriginalMember(owner = "client!jea", name = "y", descriptor = "I")
    public static int field6302;

    @OriginalMember(owner = "client!jea", name = "z", descriptor = "I")
    public static int field6303;

    @OriginalMember(owner = "client!jea", name = "D", descriptor = "I")
    public static int field6306;

    @OriginalMember(owner = "client!jea", name = "F", descriptor = "I")
    public static int field6308;

    @OriginalMember(owner = "client!jea", name = "G", descriptor = "I")
    public static int field6309;

    @OriginalMember(owner = "client!jea", name = "x", descriptor = "[Lag;")
    public class683[] field6301;

    @OriginalMember(owner = "client!jea", name = "E", descriptor = "[[B")
    private byte[][] field6307;

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(II[BIIII)V")
    public static final void method2523(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6) {
        field6303++;
        if (~arg0 < arg3 && !class143.method891(arg0, 0)) {
            throw new IllegalArgumentException("");
        } else if (arg4 <= 0 || class143.method891(arg4, 0)) {
            int var7 = class719.method4044(1, arg6);
            int var8 = 0;
            int var9 = arg0 >= arg4 ? arg4 : arg0;
            int var10 = arg0 >> 1;
            int var11 = arg4 >> 1;
            byte[] var12 = arg2;
            byte[] var13 = new byte[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Dub(arg1, var8, arg5, arg0, arg4, 0, arg6, 5121, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg0 * var7;
                for (int var15 = 0; var15 < var7; var15++) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var15 + var14;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            byte var22 = var12[var18];
                            int var23 = var7 + var18;
                            int var24 = var12[var23] + var22;
                            var18 = var7 + var23;
                            int var25 = var12[var19] + var24;
                            int var26 = var7 + var19;
                            int var27 = var12[var26] + var25;
                            var19 = var7 + var26;
                            var13[var17] = (byte) (var27 >> 2);
                            var17 += var7;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                byte[] var16 = var13;
                var13 = var12;
                arg0 = var10;
                var12 = var16;
                arg4 = var11;
                var11 >>= 0x1;
                var9 >>= 0x1;
                var8++;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(B)Z")
    public final boolean method2524(byte arg0) {
        field6302++;
        if (this.field6301 != null) {
            return true;
        }
        if (this.field6307 == null) {
            class522 var2 = class478.field6610;
            synchronized (class478.field6610) {
                if (!class478.field6610.method2896(false, this.field6305)) {
                    return false;
                }
                int[] var4 = class478.field6610.method2883(this.field6305, 6341);
                this.field6307 = new byte[var4.length][];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    this.field6307[var5] = class478.field6610.method2885(var4[var5], this.field6305, false);
                }
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < this.field6307.length; var7++) {
            byte[] var8 = this.field6307[var7];
            class611 var9 = new class611(var8);
            var9.field8520 = 1;
            int var10 = var9.method3402((byte) 127);
            class522 var11 = class639.field8870;
            synchronized (class639.field8870) {
                var6 &= class639.field8870.method2882(-89, var10);
            }
        }
        if (!var6) {
            return false;
        }
        class108 var12 = new class108();
        class522 var13 = class478.field6610;
        int[] var15;
        synchronized (class478.field6610) {
            int var14 = class478.field6610.method2901(0, this.field6305);
            this.field6301 = new class683[var14];
            var15 = class478.field6610.method2883(this.field6305, 6341);
        }
        for (int var16 = 0; var16 < var15.length; var16++) {
            byte[] var17 = this.field6307[var16];
            class611 var18 = new class611(var17);
            var18.field8520 = 1;
            int var19 = var18.method3402((byte) 127);
            class388 var20 = null;
            for (class388 var21 = (class388) var12.method724(32); var21 != null; var21 = (class388) var12.method723(92)) {
                if (var21.field5475 == var19) {
                    var20 = var21;
                    break;
                }
            }
            if (var20 == null) {
                class522 var22 = class639.field8870;
                synchronized (class639.field8870) {
                    var20 = new class388(var19, class639.field8870.method2873(var19, -118));
                }
                var12.method725(var20, -20911);
            }
            this.field6301[var15[var16]] = new class683(var17, var20);
        }
        this.field6307 = null;
        int var23 = -47 % ((5 - arg0) / 61);
        return true;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(IZ)Z")
    public final boolean method2525(int arg0, boolean arg1) {
        field6308++;
        return arg1 ? true : this.field6301[arg0].field9495;
    }

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "(I)V")
    public static void method2526(int arg0) {
        if (arg0 >= -3) {
            field6304 = null;
        }
        field6304 = null;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(ZI)Z")
    public final boolean method2527(boolean arg0, int arg1) {
        field6306++;
        return arg0 ? true : this.field6301[arg1].field9502;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(IB)V")
    public static final void method2528(int arg0, byte arg1) {
        field6299++;
        class87.field1201 = arg0;
        if (arg1 == -85) {
            class385.field5412.method1563(105);
        }
    }

    @OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(I)V")
    public class452(int arg0) {
        this.field6305 = arg0;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(II)Z")
    public final boolean method2529(int arg0, int arg1) {
        if (arg1 != 31239) {
            method2523(53, 0, null, 91, 99, -3, -67);
        }
        field6309++;
        return this.field6301[arg0].field9504;
    }
}
