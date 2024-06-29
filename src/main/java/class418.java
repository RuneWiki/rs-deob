import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class418 {

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public int field5827;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public int field5826;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public int field5818;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public int field5825;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "[[I")
    public int[][] field5823;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "[I")
    public static int[] field5817 = new int[500];

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field5819;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field5820;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field5821;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public static int field5822;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public static int field5824;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIB)I", line = 3)
    public final int method2525(int arg0, int arg1, byte arg2) {
        field5822++;
        if (arg2 != 114) {
            this.field5825 = 45;
        }
        return this.field5823[arg0][arg1];
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V", line = 20)
    public static void method2526(int arg0) {
        if (arg0 > 80) {
            field5817 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/lang/String;IZI)V", line = 31)
    public static final void method2527(String arg0, int arg1, boolean arg2, int arg3) {
        field5816++;
        class568.method3344(arg1 + 2);
        if (arg3 == 0) {
            class111.field1332 = class713.method4003(class100.field1175, -89, class753.field10382, 0, class688.field9602.field8529.method4329((byte) -98) * 2, class749.field10341);
            if (arg0 != null) {
                class111.field1332.method230(0);
                class300 var13 = class582.method3425(class170.field2160, 0, false, class510.field6918);
                class442 var14 = class111.field1332.method179(var13, class279.method1817(class149.field1968, class510.field6918, 0), true);
                class670.method3826(true);
                class323.method2046(var13, class111.field1332, true, false, var14, arg0);
            }
        } else {
            class473 var4 = null;
            if (arg0 != null) {
                var4 = class713.method4003(class100.field1175, arg1 ^ 0x4F, class753.field10382, 0, 0, class749.field10341);
                var4.method230(0);
                class300 var5 = class582.method3425(class170.field2160, 0, false, class510.field6918);
                class442 var6 = var4.method179(var5, class279.method1817(class149.field1968, class510.field6918, 0), true);
                class670.method3826(true);
                class323.method2046(var5, var4, true, false, var6, arg0);
            }
            boolean var24 = false;
            label216: {
                try {
                    var24 = true;
                    class111.field1332 = class713.method4003(class100.field1175, -67, class753.field10382, arg3, class688.field9602.field8529.method4329((byte) -98) * 2, class749.field10341);
                    if (arg0 != null) {
                        var4.method230(0);
                        class300 var7 = class582.method3425(class170.field2160, 0, false, class510.field6918);
                        class442 var8 = var4.method179(var7, class279.method1817(class149.field1968, class510.field6918, 0), true);
                        class670.method3826(true);
                        class323.method2046(var7, var4, true, false, var8, arg0);
                    }
                    if (class111.field1332.method156()) {
                        boolean var9 = true;
                        try {
                            var9 = class495.field6813.field6744 > 256;
                        } catch (Throwable var28) {
                        }
                        class731 var10;
                        if (var9) {
                            var10 = class111.field1332.method178(146800640);
                        } else {
                            var10 = class111.field1332.method178(104857600);
                        }
                        class111.field1332.method165(var10);
                        var24 = false;
                    } else {
                        var24 = false;
                    }
                    break label216;
                } catch (Throwable var29) {
                    int var11 = class688.field9602.field8517.method2604((byte) -98);
                    if (var11 == 2) {
                        class365.field5257 = true;
                    }
                    class688.field9602.method3503(class688.field9602.field8517, -127, 0);
                    method2527(arg0, -2, arg2, var11);
                    Object var10000 = null;
                    var24 = false;
                } finally {
                    if (var24) {
                        Object var17 = null;
                        if (var4 != null) {
                            try {
                                var4.method2821((byte) 122);
                            } catch (Throwable var26) {
                            }
                        }
                    }
                }
                if (var4 != null) {
                    try {
                        var4.method2821((byte) 122);
                    } catch (Throwable var25) {
                    }
                }
                return;
            }
            Object var16 = null;
            if (var4 != null) {
                try {
                    var4.method2821((byte) 122);
                } catch (Throwable var27) {
                }
            }
        }
        class688.field9602.field8517.method2605(!arg2, (byte) 125);
        class688.field9602.method3503(class688.field9602.field8517, -126, arg3);
        class729.method4051((byte) -104);
        class111.field1332.method180(10000);
        class111.field1332.method166(32);
        class732.field10111 = class111.field1332.method159();
        class49.field592 = class111.field1332.method159();
        class305.method1988((byte) -27);
        class111.field1332.method239(arg1 == ~class688.field9602.field8503.method3969((byte) -98));
        if (class111.field1332.method223()) {
            class282.method1835(class688.field9602.field8544.method3925((byte) -98) == 1, (byte) 104);
        }
        class195.method1281(class111.field1332, class525.field7224 >> 3, class741.field10208 >> 3, -1313);
        class271.method1768((byte) -70);
        class501.field6854 = true;
        class106.field1247 = false;
        class718.field9943 = null;
        class122.method861(arg1 + 115);
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V", line = 154)
    public static final void method2528(int arg0) {
        field5820++;
        if (arg0 > class612.field8623) {
            class612.field8623 = 0;
            class759.field10432 = -1;
            class83.field1004 = -1;
        }
        if (class612.field8623 > class46.field509) {
            class612.field8623 = class46.field509;
            class83.field1004 = -1;
            class759.field10432 = -1;
        }
        if (class744.field10276 < 0) {
            class83.field1004 = -1;
            class744.field10276 = 0;
            class759.field10432 = -1;
        }
        if (class744.field10276 > class46.field516) {
            class759.field10432 = -1;
            class744.field10276 = class46.field516;
            class83.field1004 = -1;
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(IIB)I", line = 196)
    public final int method2529(int arg0, int arg1, byte arg2) {
        field5824++;
        int var4 = arg1 >> this.field5825;
        int var5 = arg0 >> this.field5825;
        if (var4 < 0 || var5 < 0 || this.field5827 - 1 < var4 || var5 > (this.field5826 - 1)) {
            return 0;
        } else if (arg2 > -127) {
            return 40;
        } else {
            int var6 = arg1 & this.field5818 - 1;
            int var7 = this.field5818 - 1 & arg0;
            int var8 = (this.field5818 - var6) * this.field5823[var4][var5] + (this.field5823[var4 + 1][var5] * var6) >> this.field5825;
            int var9 = (this.field5818 - var6) * this.field5823[var4][var5 + 1] + this.field5823[var4 + 1][var5 + 1] * var6 >> this.field5825;
            return (this.field5818 - var7) * var8 + (var7 * var9) >> this.field5825;
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(II)I", line = 226)
    public static final int method2530(int arg0, int arg1) {
        return class516.field7086 == null ? 0 : class516.field7086[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BLvt;)[Lwb;", line = 236)
    public static final class577[] method2531(byte arg0, class768 arg1) {
        field5821++;
        if (!arg1.method4240((byte) 109)) {
            return new class577[0];
        }
        if (arg0 > -69) {
            field5817 = null;
        }
        class344 var2 = arg1.method4244((byte) 94);
        while (var2.field4970 == 0) {
            class730.method4066((byte) -45, 10L);
        }
        if (var2.field4970 == 2) {
            return new class577[0];
        }
        int[] var3 = (int[]) var2.field4975;
        class577[] var4 = new class577[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class577 var6 = new class577();
            var4[var5] = var6;
            var6.field8111 = var3[var5 << 2];
            var6.field8107 = var3[(var5 << 2) + 1];
            var6.field8116 = var3[(var5 << 2) + 2];
            var6.field8112 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(III[[I)V", line = 280)
    public class418(int arg0, int arg1, int arg2, int[][] arg3) {
        this.field5827 = arg0;
        this.field5826 = arg1;
        int var5 = 0;
        while (arg2 > 1) {
            arg2 >>= 0x1;
            var5++;
        }
        this.field5818 = 0x1 << var5;
        this.field5825 = var5;
        this.field5823 = arg3;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
    public abstract void method1368(int arg0, int arg1);

    @OriginalMember(owner = "client!s", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1371(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method1375(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1363(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!s", name = "YA", descriptor = "()V")
    public abstract void method1369();

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public abstract boolean method1365(class113 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "fa", descriptor = "(IILr;)Lr;")
    public abstract class113 method1367(int arg0, int arg1, class113 arg2);

    @OriginalMember(owner = "client!s", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public abstract void method1364(class113 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "ka", descriptor = "(III)V")
    public abstract void method1376(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!s", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public abstract void method1370(class113 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lsca;[I)V")
    public abstract void method1362(class251 arg0, int[] arg1);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZI)V")
    public abstract void method1374(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZII)V")
    public abstract void method1373(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6);
}
