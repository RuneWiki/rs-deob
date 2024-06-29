import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class588 {

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "Z")
    private boolean field8003 = true;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    private int field7998 = -1;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
    private int field8013;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
    private int field8008;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "[Lcm;")
    private class564[] field8004;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
    private int field8011;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    private int field8002;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "Lcm;")
    private class564 field7999;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "[Lcm;")
    private class564[] field8000;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "Lww;")
    public static class288 field8005 = new class288(7, 2);

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field8001;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    private int field8006;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
    public static int field8007;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
    private int field8009;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public static int field8010;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "I")
    public static int field8012;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
    public static int field8015;

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "Lfd;")
    private class298 field8014;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "([[B[I[B[IBII[[B)I", line = 4)
    public static final int method3394(byte[][] arg0, int[] arg1, byte[] arg2, int[] arg3, byte arg4, int arg5, int arg6, byte[][] arg7) {
        field8001++;
        int var8 = arg3[arg6];
        int var9 = arg1[arg6] + var8;
        int var10 = arg3[arg5];
        int var11 = var10 + arg1[arg5];
        int var12 = var8;
        if (arg4 != -71) {
            method3396(57);
        }
        if (var10 > var8) {
            var12 = var10;
        }
        int var13 = var9;
        if (var11 < var9) {
            var13 = var11;
        }
        int var14 = arg2[arg6] & 0xFF;
        if (var14 > (arg2[arg5] & 0xFF)) {
            var14 = arg2[arg5] & 0xFF;
        }
        byte[] var15 = arg0[arg6];
        byte[] var16 = arg7[arg5];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var15[var17++] + var16[var18++];
            if (var14 > var20) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIILha;III)V", line = 61)
    public final void method3395(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class548 arg6, int arg7, int arg8, int arg9) {
        field8010++;
        int var11 = arg8 + arg9 & 0x3FFF;
        if (this.field8002 == -1 || this.field8006 == 0) {
            arg6.method1412(arg1, arg3, arg4, arg7, arg5, 0);
        } else {
            class239 var12 = class391.field5627.method521(this.field8002, 123);
            if (this.field8014 == null && class391.field5627.method517(this.field8002, true)) {
                int[] var13 = var12.field3557 == 2 ? class391.field5627.method520(this.field8006, (byte) 76, this.field8006, false, this.field8002, 0.7F) : class391.field5627.method519(arg2 ^ 0xFFFFE549, this.field8002, 0.7F, this.field8006, this.field8006, false);
                this.field8014 = arg6.method3244(this.field8006, var13, (byte) -128, this.field8006, 0, this.field8006);
            }
            if (var12.field3557 == 2) {
                arg6.method1412(arg1, arg3, arg4, arg7, arg5, 0);
            }
            if (this.field8014 != null) {
                int var14 = var12.field3557 == 2 ? 1 : 0;
                int var15 = arg0 * arg7 / -4096;
                int var16;
                for (var16 = arg7 * var11 / 4096 + (arg4 - arg7) / 2; var16 > arg7; var16 -= arg7) {
                }
                while (var16 < 0) {
                    var16 += arg7;
                }
                while (arg7 < var15) {
                    var15 -= arg7;
                }
                while (var15 < 0) {
                    var15 += arg7;
                }
                for (int var17 = var16 - arg7; var17 < arg4; var17 += arg7) {
                    for (int var18 = var15 - arg7; var18 < arg7; var18 += arg7) {
                        this.field8014.method1969(arg1 + var17, arg3 + var18, arg7, arg7, 1, 0, var14);
                    }
                }
            }
        }
        if (arg2 == 0) {
            for (int var19 = this.field8009 - 1; var19 >= 0; var19--) {
                this.field8000[var19].method3318(arg6, arg1, arg3, arg4, arg7, arg0, var11);
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V", line = 145)
    public static void method3396(int arg0) {
        field8005 = null;
        if (arg0 != 7) {
            field8015 = -109;
        }
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(I[Lcm;IIII)V", line = 276)
    public class588(int arg0, class564[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8013 = arg3;
        this.field8008 = arg4;
        this.field8004 = arg1;
        this.field8011 = arg5;
        this.field8002 = arg0;
        if (arg1 == null) {
            this.field7999 = null;
            this.field8000 = null;
        } else {
            this.field8000 = new class564[arg1.length];
            this.field7999 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V", line = 175)
    public final void method3397(int arg0) {
        if (this.field8004 != null) {
            for (int var2 = 0; var2 < this.field8004.length; var2++) {
                this.field8004[var2].method3313();
            }
        }
        field8007++;
        this.field8014 = null;
        if (arg0 != 29586) {
            this.field8013 = 13;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILha;)Z", line = 200)
    public final boolean method3398(int arg0, int arg1, class548 arg2) {
        if (arg1 != 0) {
            this.field8011 = -6;
        }
        if (this.field7998 != arg0) {
            this.field7998 = arg0;
            int var4 = class375.method2354(arg0, (byte) 27);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field8006 != var4) {
                this.field8014 = null;
                this.field8006 = var4;
            }
            if (this.field8004 != null) {
                this.field8009 = 0;
                int[] var5 = new int[this.field8004.length];
                for (int var6 = 0; var6 < this.field8004.length; var6++) {
                    class564 var7 = this.field8004[var6];
                    if (var7.method3312(this.field8013, this.field8008, this.field8011, this.field7998)) {
                        var5[this.field8009] = var7.field7830;
                        this.field8000[this.field8009++] = var7;
                    }
                }
                class580.method3373(0, this.field8009 - 1, Integer.MIN_VALUE, this.field8000, var5);
            }
            this.field8003 = true;
        }
        field8012++;
        boolean var8 = false;
        if (this.field8003) {
            this.field8003 = false;
            for (int var9 = this.field8009 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field8000[var9].method3316(arg2, this.field7999);
                this.field8003 |= !var10;
                var8 |= var10;
            }
        }
        return var8;
    }
}
