import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class21 extends class290 {

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
    private int field306 = 0;

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "I")
    private int field316 = -32768;

    @OriginalMember(owner = "client!ub", name = "Q", descriptor = "Z")
    private boolean field323 = false;

    @OriginalMember(owner = "client!ub", name = "gb", descriptor = "I")
    private int field338 = 0;

    @OriginalMember(owner = "client!ub", name = "fb", descriptor = "Z")
    private boolean field337 = false;

    @OriginalMember(owner = "client!ub", name = "T", descriptor = "I")
    private int field325;

    @OriginalMember(owner = "client!ub", name = "jb", descriptor = "I")
    public int field341;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
    public int field305;

    @OriginalMember(owner = "client!ub", name = "hb", descriptor = "I")
    public int field339;

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "I")
    private int field307;

    @OriginalMember(owner = "client!ub", name = "eb", descriptor = "I")
    private int field336;

    @OriginalMember(owner = "client!ub", name = "ab", descriptor = "I")
    private int field332;

    @OriginalMember(owner = "client!ub", name = "G", descriptor = "I")
    public int field314;

    @OriginalMember(owner = "client!ub", name = "M", descriptor = "I")
    private int field319;

    @OriginalMember(owner = "client!ub", name = "Y", descriptor = "I")
    public int field330;

    @OriginalMember(owner = "client!ub", name = "X", descriptor = "I")
    private int field329;

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "Ljh;")
    private class272 field309;

    @OriginalMember(owner = "client!ub", name = "E", descriptor = "[S")
    public static short[] field312 = new short[256];

    @OriginalMember(owner = "client!ub", name = "P", descriptor = "[I")
    public static int[] field322 = new int[50];

    @OriginalMember(owner = "client!ub", name = "bb", descriptor = "Lsf;")
    public static class108 field333 = class140.method973(255, "tbrefresh");

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "D")
    private double field300;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "D")
    public double field301;

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "D")
    private double field310;

    @OriginalMember(owner = "client!ub", name = "L", descriptor = "D")
    private double field318;

    @OriginalMember(owner = "client!ub", name = "O", descriptor = "D")
    public double field321;

    @OriginalMember(owner = "client!ub", name = "W", descriptor = "D")
    public double field328;

    @OriginalMember(owner = "client!ub", name = "ib", descriptor = "D")
    private double field340;

    @OriginalMember(owner = "client!ub", name = "kb", descriptor = "D")
    private double field342;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "I")
    private int field304;

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!ub", name = "F", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!ub", name = "H", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!ub", name = "K", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!ub", name = "N", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!ub", name = "S", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!ub", name = "U", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!ub", name = "V", descriptor = "I")
    public int field327;

    @OriginalMember(owner = "client!ub", name = "Z", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!ub", name = "cb", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!ub", name = "db", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!ub", name = "D", descriptor = "Lac;")
    private class165 field311;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)V", line = 6)
    public static final void method142(int arg0, int arg1) {
        field334++;
        if (arg0 != -16313) {
            field322 = (int[]) null;
        }
        class120 var2 = class248.method1704(8, 122, arg1);
        var2.method843((byte) 28);
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 327)
    public class21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field337 = false;
        this.field325 = arg7;
        this.field341 = arg10;
        this.field305 = arg9;
        this.field339 = arg5;
        this.field307 = arg2;
        this.field336 = arg8;
        this.field332 = arg3;
        this.field314 = arg1;
        this.field319 = arg0;
        this.field330 = arg6;
        this.field329 = arg4;
        int var12 = class152.method1074((byte) 104, this.field319).field5308;
        if (var12 == -1) {
            this.field309 = null;
        } else {
            this.field309 = class149.method1063(var12, -18767);
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(IIIII)V", line = 32)
    public final void method143(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field320++;
        if (!this.field337) {
            double var6 = (double) (arg1 - this.field332);
            double var8 = (double) (arg3 - this.field307);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field301 = (double) this.field336 * var6 / var10 + (double) this.field332;
            this.field328 = (double) this.field336 * var8 / var10 + (double) this.field307;
            this.field321 = (double) this.field329;
        }
        double var12 = (double) (this.field330 + 1 - arg4);
        this.field310 = ((double) arg1 - this.field301) / var12;
        this.field342 = ((double) arg3 - this.field328) / var12;
        this.field318 = Math.sqrt(this.field342 * this.field342 + this.field310 * this.field310);
        if (!this.field337) {
            this.field300 = -this.field318 * Math.tan((double) this.field325 * 0.02454369D);
        }
        this.field340 = ((double) arg0 - this.field321 - (this.field300 * var12)) * 2.0D / (var12 * var12);
        if (arg2 > -91) {
            this.method99(67, 127, -12, -31, 20);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIIIIIJILac;)V", line = 66)
    public final void method98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class165 arg10) {
        field303++;
        class113 var13 = this.method146(-102);
        if (var13 != null) {
            this.method144(var13, (byte) -123);
            var13.method98(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field311);
            this.field316 = var13.method95();
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lke;B)V", line = 92)
    private final void method144(class113 arg0, byte arg1) {
        if (class231.field4051) {
            class148 var4 = (class148) arg0;
            if ((this.field311 == null || this.field311.field2946) && (var4.field2678 != null || var4.field2658 != null)) {
                this.field311 = new class165(class116.field2000, 1, 1);
            }
            if (this.field311 != null) {
                this.field311.method1141(var4.field2678, var4.field2658, false, var4.field2679, var4.field2692, var4.field2674);
            }
        } else {
            class44 var3 = (class44) arg0;
            if ((this.field311 == null || this.field311.field2946) && (var3.field598 != null || var3.field600 != null)) {
                this.field311 = new class165(class116.field2000, 1, 1);
            }
            if (this.field311 != null) {
                this.field311.method1141(var3.field598, var3.field600, false, var3.field586, var3.field574, var3.field599);
            }
        }
        field335++;
        if (arg1 <= -108) {
            this.field323 = true;
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(II)[F", line = 150)
    public static final float[] method145(int arg0, int arg1) {
        field317++;
        float var2 = class217.method1492() + class217.method1497();
        int var3 = class217.method1498();
        float var4 = (float) ((var3 & 0xFF6A3F) >> 16) / 255.0F;
        class322.field5508[3] = (float) arg1;
        float var5 = (float) ((var3 & 0xFF29) >> 8) / 255.0F;
        float var6 = (float) (var3 & 0xFF) / 255.0F;
        float var7 = 0.58823526F;
        class322.field5508[1] = var2 * var7 * var5 * ((float) (class162.method1118(65307, arg0) >> 8) / 255.0F);
        class322.field5508[2] = var7 * (float) class162.method1118(255, arg0) / 255.0F * var6 * var2;
        class322.field5508[0] = (float) (class162.method1118(16775021, arg0) >> 16) / 255.0F * var4 * var7 * var2;
        return class322.field5508;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)Lke;", line = 194)
    private final class113 method146(int arg0) {
        field315++;
        class305 var2 = class152.method1074((byte) 112, this.field319);
        if (arg0 >= -85) {
            field322 = (int[]) null;
        }
        class113 var3 = var2.method2144(18, this.field306);
        if (var3 == null) {
            return null;
        } else {
            var3.method307(this.field304);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "()I", line = 215)
    public final int method95() {
        field326++;
        return this.field316;
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(II)V", line = 223)
    public final void method147(int arg0, int arg1) {
        this.field328 += (double) arg1 * this.field342;
        this.field321 += this.field340 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field300;
        int var3 = -115 / ((-arg0 - 20) / 38);
        field313++;
        this.field337 = true;
        this.field301 += (double) arg1 * this.field310;
        this.field300 += (double) arg1 * this.field340;
        this.field327 = (int) (Math.atan2(this.field342, this.field310) * 325.949D) + 1024 & 0x7FF;
        this.field304 = (int) (Math.atan2(this.field300, this.field318) * 325.949D) & 0x7FF;
        if (this.field309 == null) {
            return;
        }
        this.field338 += arg1;
        while (true) {
            do {
                do {
                    if (this.field309.field4764[this.field306] >= this.field338) {
                        return;
                    }
                    this.field338 -= this.field309.field4764[this.field306];
                    this.field306++;
                } while (this.field309.field4774.length > this.field306);
                this.field306 -= this.field309.field4765;
            } while (this.field306 >= 0 && this.field309.field4774.length > this.field306);
            this.field306 = 0;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V", line = 263)
    public static void method148(byte arg0) {
        field312 = null;
        field333 = null;
        field322 = null;
        if (arg0 != 23) {
            field324 = -4;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIII)V", line = 299)
    public final void method99(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field302++;
        if (!this.field323) {
            class113 var6 = this.method146(-124);
            if (var6 == null) {
                return;
            }
            this.method144(var6, (byte) -118);
        }
        if (this.field311 != null) {
            this.field311.method1157(arg0, arg1, arg3, arg2, arg4);
        }
    }
}
