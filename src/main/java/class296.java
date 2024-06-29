import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class296 {

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public int field4300;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public int field4301;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public int field4295;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "[[I")
    public int[][] field4292;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public int field4297;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field4291 = new Rectangle[100];

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "Llt;")
    public static class705 field4302;

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field4291[var0] = new Rectangle();
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IZIIII)V", line = 4)
    public static final void method1879(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field4294++;
        int var6 = arg3 - arg2;
        int var7 = arg4 - arg5;
        if (var7 == 0) {
            if (var6 != 0) {
                class289.method1836(arg3, true, arg0, arg5, arg2);
            }
        } else if (var6 == 0) {
            class652.method3633(arg5, arg4, -123, arg0, arg2);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var6 > var7;
            if (arg1) {
                if (var8) {
                    int var9 = arg5;
                    arg5 = arg2;
                    int var10 = arg4;
                    arg4 = arg3;
                    arg2 = var9;
                    arg3 = var10;
                }
                if (arg5 > arg4) {
                    int var11 = arg5;
                    int var12 = arg2;
                    arg5 = arg4;
                    arg4 = var11;
                    arg2 = arg3;
                    arg3 = var12;
                }
                int var13 = arg2;
                int var14 = arg4 - arg5;
                int var15 = arg3 - arg2;
                int var16 = -(var14 >> 1);
                int var17 = arg2 < arg3 ? 1 : -1;
                if (var15 < 0) {
                    var15 = -var15;
                }
                if (var8) {
                    for (int var19 = arg5; var19 <= arg4; var19++) {
                        var16 += var15;
                        class785.field10808[var19][var13] = arg0;
                        if (var16 > 0) {
                            var16 -= var14;
                            var13 += var17;
                        }
                    }
                } else {
                    for (int var18 = arg5; var18 <= arg4; var18++) {
                        var16 += var15;
                        class785.field10808[var13][var18] = arg0;
                        if (var16 > 0) {
                            var13 += var17;
                            var16 -= var14;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IZI)I", line = 123)
    public final int method1880(int arg0, boolean arg1, int arg2) {
        field4298++;
        if (arg1) {
            this.method1147(-43, 103, null);
        }
        return this.field4292[arg0][arg2];
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V", line = 137)
    public static void method1881(int arg0) {
        field4302 = null;
        field4291 = null;
        if (arg0 > -76) {
            method1884(120, null);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)I", line = 158)
    public final int method1882(int arg0, int arg1, int arg2) {
        field4296++;
        int var4 = arg2 >> this.field4297;
        int var5 = arg0 >> this.field4297;
        if (arg1 > var4 || var5 < 0 || var4 > (this.field4301 - 1) || var5 > this.field4300 - 1) {
            return 0;
        }
        int var6 = this.field4295 - 1 & arg2;
        int var7 = arg0 & this.field4295 - 1;
        int var8 = (this.field4295 - var6) * this.field4292[var4][var5] + this.field4292[var4 + 1][var5] * var6 >> this.field4297;
        int var9 = (this.field4295 - var6) * this.field4292[var4][var5 + 1] + (this.field4292[var4 + 1][var5 + 1] * var6) >> this.field4297;
        return (this.field4295 - var7) * var8 + var7 * var9 >> this.field4297;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILjp;Z)V", line = 200)
    public static final void method1883(int arg0, class376 arg1, boolean arg2) {
        if (!arg2) {
            return;
        }
        if (class365.field5320 != null) {
            try {
                class365.field5320.method174(true, 0L);
                class365.field5320.method178(arg1.field5518, (byte) 123, arg0, 24);
            } catch (Exception var3) {
            }
        }
        field4293++;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(III[[I)V", line = 222)
    public class296(int arg0, int arg1, int arg2, int[][] arg3) {
        this.field4300 = arg1;
        this.field4301 = arg0;
        int var5 = 0;
        while (arg2 > 1) {
            var5++;
            arg2 >>= 0x1;
        }
        this.field4295 = 0x1 << var5;
        this.field4292 = arg3;
        this.field4297 = var5;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILnu;)V", line = 243)
    public static final void method1884(int arg0, class619 arg1) {
        field4299++;
        if (arg0 > -1) {
            method1881(-104);
        }
        class673.field9465 = arg1;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZI)V")
    public abstract void method1146(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method1153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Luca;[I)V")
    public abstract void method1141(class540 arg0, int[] arg1);

    @OriginalMember(owner = "client!s", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public abstract void method1138(class195 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public abstract void method1152(class195 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1149(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZII)V")
    public abstract void method1137(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
    public abstract void method1140(int arg0, int arg1);

    @OriginalMember(owner = "client!s", name = "fa", descriptor = "(IILr;)Lr;")
    public abstract class195 method1147(int arg0, int arg1, class195 arg2);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public abstract boolean method1142(class195 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "YA", descriptor = "()V")
    public abstract void method1139();

    @OriginalMember(owner = "client!s", name = "ka", descriptor = "(III)V")
    public abstract void method1150(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!s", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1145(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);
}
