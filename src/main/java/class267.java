import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class267 {

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "Z")
    private boolean field4289 = true;

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "I")
    private int field4290 = -1;

    @OriginalMember(owner = "client!vq", name = "k", descriptor = "I")
    private int field4297;

    @OriginalMember(owner = "client!vq", name = "t", descriptor = "[Lfl;")
    private class439[] field4306;

    @OriginalMember(owner = "client!vq", name = "o", descriptor = "I")
    private int field4301;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "I")
    private int field4287;

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "I")
    private int field4291;

    @OriginalMember(owner = "client!vq", name = "i", descriptor = "[Lfl;")
    private class439[] field4295;

    @OriginalMember(owner = "client!vq", name = "h", descriptor = "Lfl;")
    private class439 field4294;

    @OriginalMember(owner = "client!vq", name = "j", descriptor = "[Z")
    public static boolean[] field4296 = new boolean[100];

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!vq", name = "l", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!vq", name = "m", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!vq", name = "n", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!vq", name = "q", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!vq", name = "r", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!vq", name = "s", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!vq", name = "u", descriptor = "I")
    private int field4307;

    @OriginalMember(owner = "client!vq", name = "v", descriptor = "I")
    private int field4308;

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "Lgl;")
    private class356 field4292;

    @OriginalMember(owner = "client!vq", name = "p", descriptor = "Lsn;")
    public static class375 field4302;

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "Lmo;")
    public static class447 field4293;

    @OriginalMember(owner = "client!vq", name = "w", descriptor = "[Lgl;")
    public static class356[] field4309;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V", line = 3)
    public static void method1816(int arg0) {
        field4302 = null;
        field4309 = null;
        field4293 = null;
        if (arg0 != -1007544913) {
            method1818((byte) -78);
        }
        field4296 = null;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(ILe;I)Z", line = 16)
    public final boolean method1817(int arg0, class312 arg1, int arg2) {
        if (this.field4290 != arg0) {
            this.field4290 = arg0;
            int var4 = class111.method822((byte) 122, arg0);
            if (var4 > arg0) {
                var4 = class410.method2573(arg0, (byte) -113);
            }
            if (var4 > 512) {
                var4 = 512;
            }
            if (this.field4308 != var4) {
                this.field4308 = var4;
                this.field4292 = null;
            }
            if (this.field4306 != null) {
                this.field4307 = 0;
                int[] var5 = new int[this.field4306.length];
                for (int var6 = 0; var6 < this.field4306.length; var6++) {
                    class439 var7 = this.field4306[var6];
                    if (var7.method2707(this.field4301, this.field4291, this.field4287, this.field4290)) {
                        var5[this.field4307] = var7.field6437;
                        this.field4295[this.field4307++] = var7;
                    }
                }
                class311.method2082(0, var5, this.field4307 - 1, (byte) 113, this.field4295);
            }
            this.field4289 = true;
        }
        field4299++;
        if (arg2 != 0) {
            this.method1817(16, (class312) null, 25);
        }
        boolean var8 = false;
        if (this.field4289) {
            this.field4289 = false;
            for (int var9 = this.field4307 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field4295[var9].method2702(arg1, this.field4294);
                this.field4289 |= !var10;
                var8 |= var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V", line = 101)
    public static final void method1818(byte arg0) {
        field4304++;
        class8.field106.method335((byte) -75);
        if (arg0 == -66) {
            class223.field3715.method335((byte) -42);
        }
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)V", line = 116)
    public static final void method1819(int arg0) {
        if (arg0 != -10427) {
            method1819(7);
        }
        field4300++;
        class142.field2254.method335((byte) 102);
        class102.field1417.method335((byte) 106);
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(I[Lfl;IIII)V", line = 322)
    public class267(int arg0, class439[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4297 = arg0;
        this.field4306 = arg1;
        this.field4301 = arg3;
        this.field4287 = arg5;
        this.field4291 = arg4;
        if (arg1 == null) {
            this.field4295 = null;
            this.field4294 = null;
        } else {
            this.field4295 = new class439[arg1.length];
            this.field4294 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "(I)V", line = 134)
    public final void method1820(int arg0) {
        if (this.field4306 != null) {
            for (int var2 = 0; var2 < this.field4306.length; var2++) {
                this.field4306[var2].method2699();
            }
        }
        field4298++;
        int var3 = 14 / ((arg0 - 6) / 60);
        this.field4292 = null;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(BILe;IIIIIII)V", line = 165)
    public final void method1821(byte arg0, int arg1, class312 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = -75 / ((arg0 - 4) / 55);
        field4305++;
        int var12 = arg4 + arg5 & 0x3FFF;
        if (this.field4297 == -1) {
            arg2.method563(arg7, arg9, arg8, arg1, arg6, 0);
        } else {
            class266 var13 = class285.field4583.method989(this.field4297, (byte) 36);
            if (this.field4292 == null && class285.field4583.method985(this.field4297, (byte) -16)) {
                int[] var14 = var13.field4267 ? class285.field4583.method983(this.field4297, 0.7F, this.field4308, false, -28113, this.field4308) : class285.field4583.method984(this.field4297, this.field4308, false, false, 0.7F, this.field4308);
                this.field4292 = arg2.method703(var14, 0, this.field4308, this.field4308, this.field4308);
            }
            if (!var13.field4267) {
                arg2.method563(arg7, arg9, arg8, arg1, arg6, 0);
            }
            if (this.field4292 != null) {
                int var15 = var13.field4267 ? 0 : 1;
                int var16 = arg1 * arg3 / -4096;
                int var17;
                for (var17 = arg1 * var12 / 4096 + (arg8 - arg1) / 2; var17 > arg1; var17 -= arg1) {
                }
                while (var17 < 0) {
                    var17 += arg1;
                }
                while (var16 > arg1) {
                    var16 -= arg1;
                }
                while (var16 < 0) {
                    var16 += arg1;
                }
                for (int var18 = var17 - arg1; var18 < arg8; var18 += arg1) {
                    for (int var19 = var16 - arg1; var19 < arg1; var19 += arg1) {
                        this.field4292.method420(arg7 + var18, var19 - -arg9, arg1, arg1, 0, 0, var15);
                    }
                }
            }
        }
        for (int var20 = this.field4307 - 1; var20 >= 0; var20--) {
            this.field4295[var20].method2704(arg2, arg7, arg9, arg8, arg1, arg3, var12);
        }
    }

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "(I)V", line = 242)
    public static final void method1822(int arg0) {
        if (arg0 > -46) {
            method1816(75);
        }
        field4303++;
        if (class284.field4547.method568()) {
            class75.method478(false);
            class284.field4547.method585(class86.field1073);
            class193.method1356((byte) 97);
        } else {
            class221.method1586(-1009, class128.field2035);
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIILne;IILq;I)V", line = 269)
    public static final void method1823(int arg0, int arg1, int arg2, int arg3, class172 arg4, int arg5, int arg6, class245 arg7, int arg8) {
        if (arg2 >= -124) {
            method1823(21, 9, 42, -93, (class172) null, -97, 78, (class245) null, -7);
        }
        field4288++;
        int var9 = arg5 * arg5 + arg6 * arg6;
        if (var9 > arg8) {
            return;
        }
        int var10 = Math.min(arg4.field2705 / 2, arg4.field2834 / 2);
        if ((var10 * var10) >= var9) {
            class258.method1787((byte) -110, arg0, arg5, arg1, arg7, arg4, class152.field2373[arg3], arg6);
            return;
        }
        var10 -= 10;
        int var11;
        if (class13.field194 == 4) {
            var11 = (int) class329.field5153 & 0x3FFF;
        } else {
            var11 = (int) class329.field5153 + class52.field650 & 0x3FFF;
        }
        int var12 = class258.field4177[var11];
        int var13 = class258.field4173[var11];
        if (class13.field194 != 4) {
            var12 = var12 * 256 / (class367.field5561 + 256);
            var13 = var13 * 256 / (class367.field5561 + 256);
        }
        int var14 = arg6 * var12 + (arg5 * var13) >> 15;
        int var15 = arg6 * var13 - (arg5 * var12) >> 15;
        double var16 = Math.atan2((double) var14, (double) var15);
        int var18 = (int) ((double) var10 * Math.sin(var16));
        int var19 = (int) ((double) var10 * Math.cos(var16));
        field4309[arg3].method2317((float) arg4.field2705 / 2.0F + (float) arg1 + (float) var18, (float) arg4.field2834 / 2.0F + (float) arg0 - (float) var19, 4096, (int) (-var16 / 6.283185307179586D * 65535.0D));
    }
}
