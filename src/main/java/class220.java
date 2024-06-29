import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class220 {

    @OriginalMember(owner = "client!ts", name = "i", descriptor = "I")
    private int field3103;

    @OriginalMember(owner = "client!ts", name = "g", descriptor = "[Lww;")
    private class287[] field3101;

    @OriginalMember(owner = "client!ts", name = "o", descriptor = "I")
    public static int field3109 = -1;

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!ts", name = "f", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!ts", name = "h", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!ts", name = "k", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!ts", name = "l", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!ts", name = "m", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!ts", name = "n", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!ts", name = "p", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!ts", name = "j", descriptor = "J")
    private long field3104;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "Lww;")
    private class287 field3095;

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "Lsv;")
    public static class59 field3099;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IJ)Lww;", line = 4)
    public final class287 method1435(int arg0, long arg1) {
        field3102++;
        this.field3104 = arg1;
        class287 var4 = this.field3101[(int) (arg1 & (long) (this.field3103 - 1))];
        if (arg0 != 4741) {
            return null;
        }
        for (this.field3095 = var4.field3781; this.field3095 != var4; this.field3095 = this.field3095.field3781) {
            if (this.field3095.field3778 == arg1) {
                class287 var5 = this.field3095;
                this.field3095 = this.field3095.field3781;
                return var5;
            }
        }
        this.field3095 = null;
        return null;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(FFIIBIIFLgaa;FFII[B)V", line = 36)
    public static final void method1436(float arg0, float arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, float arg7, class71 arg8, float arg9, float arg10, int arg11, int arg12, byte[] arg13) {
        field3098++;
        if (arg4 >= -118) {
            return;
        }
        int var14 = arg2 * arg11;
        float[] var15 = new float[var14];
        for (int var16 = 0; var16 < arg6; var16++) {
            int var19 = arg5;
            arg8.method452((byte) -74, arg9 * 127.0F, arg10 / (float) arg11, arg1 / (float) arg2, arg12, arg2, arg0 / (float) arg12, arg11, 0, var15, arg3);
            arg0 *= 2.0F;
            arg10 *= 2.0F;
            for (int var20 = 0; var20 < var14; var20++) {
                arg13[var19] = (byte) ((int) ((float) arg13[var19] + var15[var20]));
                var19++;
            }
            arg9 = arg7 * arg9;
            arg1 *= 2.0F;
        }
        int var17 = arg5;
        for (int var18 = 0; var18 < var14; var18++) {
            arg13[var17] -= -127;
            var17++;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)V", line = 91)
    public static final void method1437(int arg0) {
        field3108++;
        class674.field9500.method2250((byte) 97, 1, class674.field9500.field5159);
        class674.field9500.method2250((byte) 125, 1, class674.field9500.field5113);
        class674.field9500.method2250((byte) 97, 2, class674.field9500.field5119);
        class674.field9500.method2250((byte) 90, 2, class674.field9500.field5122);
        class674.field9500.method2250((byte) 109, 1, class674.field9500.field5131);
        class674.field9500.method2250((byte) 123, 1, class674.field9500.field5163);
        class674.field9500.method2250((byte) 121, 1, class674.field9500.field5137);
        class674.field9500.method2250((byte) 107, 1, class674.field9500.field5154);
        class674.field9500.method2250((byte) 119, 1, class674.field9500.field5168);
        class674.field9500.method2250((byte) 84, 2, class674.field9500.field5151);
        class674.field9500.method2250((byte) 98, 1, class674.field9500.field5130);
        class674.field9500.method2250((byte) 124, 1, class674.field9500.field5162);
        class674.field9500.method2250((byte) 97, 2, class674.field9500.field5134);
        class674.field9500.method2250((byte) 110, 1, class674.field9500.field5143);
        class674.field9500.method2250((byte) 85, 0, class674.field9500.field5135);
        class674.field9500.method2250((byte) 116, 0, class674.field9500.field5155);
        class674.field9500.method2250((byte) 103, 2, class674.field9500.field5148);
        class674.field9500.method2250((byte) 90, arg0, class674.field9500.field5120);
        class674.field9500.method2250((byte) 85, 0, class674.field9500.field5132);
        class163.method1017(false);
        class674.field9500.method2250((byte) 97, 0, class674.field9500.field5139);
        class674.field9500.method2250((byte) 122, 4, class674.field9500.field5117);
        class469.method2794(false);
        class507.method3027(-1);
        class295.field3852 = true;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(BLww;J)V", line = 127)
    public final void method1438(byte arg0, class287 arg1, long arg2) {
        if (arg1.field3775 != null) {
            arg1.method1706((byte) 79);
        }
        field3105++;
        class287 var5 = this.field3101[(int) (arg2 & (long) (this.field3103 - 1))];
        arg1.field3781 = var5;
        arg1.field3775 = var5.field3775;
        arg1.field3775.field3781 = arg1;
        arg1.field3781.field3775 = arg1;
        if (arg0 >= 82) {
            arg1.field3778 = arg2;
        }
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)V", line = 153)
    public static void method1439(int arg0) {
        if (arg0 < 68) {
            field3109 = 110;
        }
        field3099 = null;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIB)Z", line = 163)
    public static final boolean method1440(int arg0, int arg1, byte arg2) {
        field3110++;
        if (arg2 < 105) {
            method1441(true, -109, 78, 72);
        }
        return (arg0 & 0xC580) != 0;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZIII)I", line = 174)
    public static final int method1441(boolean arg0, int arg1, int arg2, int arg3) {
        field3097++;
        class344 var4 = class70.method444(arg1, arg0, Integer.MIN_VALUE);
        if (arg3 != 2) {
            method1441(true, -42, -34, -10);
        }
        if (var4 == null) {
            return 0;
        } else if (arg2 >= 0 && var4.field4391.length > arg2) {
            return var4.field4391[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(BFFF)I", line = 197)
    public static final int method1442(byte arg0, float arg1, float arg2, float arg3) {
        field3100++;
        float var4 = arg2 < 0.0F ? -arg2 : arg2;
        float var5 = arg3 < 0.0F ? -arg3 : arg3;
        float var6 = arg1 < 0.0F ? -arg1 : arg1;
        if (arg0 >= -82) {
            field3096 = 61;
        }
        if (var4 < var5 && var5 > var6) {
            return (arg3 > 0.0F) ? 0 : 1;
        } else if (var6 > var4 && var6 > var5) {
            return (arg1 > 0.0F) ? 2 : 3;
        } else if (arg2 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "(I)[Leaa;", line = 240)
    public static final class380[] method1443(int arg0) {
        if (arg0 == -22166) {
            field3106++;
            return new class380[] { class456.field6280, class477.field6507, class286.field3771, class363.field4650, class14.field193, class710.field9914 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(I)V", line = 251)
    public class220(int arg0) {
        this.field3103 = arg0;
        this.field3101 = new class287[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class287 var3 = this.field3101[var2] = new class287();
            var3.field3775 = var3;
            var3.field3781 = var3;
        }
    }

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "(I)Lww;", line = 277)
    public final class287 method1444(int arg0) {
        field3107++;
        if (this.field3095 == null) {
            return null;
        }
        class287 var2 = this.field3101[(int) (this.field3104 & (long) (this.field3103 + arg0))];
        while (this.field3095 != var2) {
            if (this.field3095.field3778 == this.field3104) {
                class287 var3 = this.field3095;
                this.field3095 = this.field3095.field3781;
                return var3;
            }
            this.field3095 = this.field3095.field3781;
        }
        this.field3095 = null;
        return null;
    }
}
