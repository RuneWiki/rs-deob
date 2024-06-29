import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class142 extends class21 {

    @OriginalMember(owner = "client!cj", name = "R", descriptor = "Z")
    private boolean field2346 = true;

    @OriginalMember(owner = "client!cj", name = "S", descriptor = "I")
    private int field2347 = 4096;

    @OriginalMember(owner = "client!cj", name = "Z", descriptor = "Ljava/lang/String;")
    public static String field2354 = "scroll:";

    @OriginalMember(owner = "client!cj", name = "N", descriptor = "[J")
    public static long[] field2342 = new long[256];

    @OriginalMember(owner = "client!cj", name = "ab", descriptor = "[I")
    public static int[] field2355;

    @OriginalMember(owner = "client!cj", name = "X", descriptor = "F")
    public static float field2352;

    @OriginalMember(owner = "client!cj", name = "O", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!cj", name = "P", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!cj", name = "Q", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!cj", name = "T", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!cj", name = "U", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!cj", name = "V", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!cj", name = "W", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!cj", name = "Y", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V", line = 5)
    public class142() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 10)
    public static final String method918(int arg0, String arg1) {
        field2351++;
        String var2 = class72.method552(class116.method767(arg0 - 2175, arg1), 37);
        if (arg0 == 2048) {
            if (var2 == null) {
                var2 = "";
            }
            return var2;
        } else {
            return (String) null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "(B)V", line = 28)
    public static void method919(byte arg0) {
        field2354 = null;
        field2342 = null;
        if (arg0 < 84) {
            field2342 = (long[]) null;
        }
        field2355 = null;
    }

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "(B)V", line = 40)
    public static final void method920(byte arg0) {
        if (arg0 == -59) {
            class125.field2161.method1884(-22054);
            field2344++;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILga;Lrg;ILve;IZI)V", line = 52)
    public static final void method921(int arg0, class31 arg1, class255 arg2, int arg3, class278 arg4, int arg5, boolean arg6, int arg7) {
        class174 var8 = new class174();
        var8.field2791 = arg0 * 128;
        var8.field2803 = arg7;
        field2353++;
        var8.field2795 = arg3 * 128;
        if (arg1 != null) {
            var8.field2805 = arg1.field590;
            var8.field2797 = arg1.field599;
            var8.field2786 = arg1.field567;
            var8.field2800 = arg1.field617 * 128;
            var8.field2804 = arg1.field575;
            var8.field2781 = arg1.field568;
            var8.field2799 = arg1;
            int var9 = arg1.field616;
            int var10 = arg1.field589;
            if (arg5 == 1 || arg5 == 3) {
                var10 = arg1.field616;
                var9 = arg1.field589;
            }
            var8.field2787 = (arg0 + var10) * 128;
            var8.field2798 = (arg3 + var9) * 128;
            if (arg1.field597 != null) {
                var8.field2807 = true;
                var8.method1097(128);
            }
            if (var8.field2781 != null) {
                var8.field2801 = (int) ((double) (var8.field2804 - var8.field2797) * Math.random()) + var8.field2797;
            }
            class233.field3643.method427((byte) -67, var8);
        } else if (arg2 != null) {
            var8.field2790 = arg2;
            class44 var11 = arg2.field3991;
            if (var11.field888 != null) {
                var8.field2807 = true;
                var11 = var11.method338(17911);
            }
            if (var11 != null) {
                var8.field2787 = (arg0 + var11.field882) * 128;
                var8.field2798 = (var11.field882 + arg3) * 128;
                var8.field2786 = class324.method2246(-1, arg2);
                var8.field2800 = var11.field829 * 128;
                var8.field2805 = var11.field886;
            }
            class264.field4094.method427((byte) -101, var8);
        } else if (arg4 != null) {
            var8.field2788 = arg4;
            var8.field2787 = (arg0 + arg4.method710(-1)) * 128;
            var8.field2798 = (arg3 + arg4.method710(-1)) * 128;
            var8.field2786 = class188.method1199(arg4, 259336492);
            var8.field2805 = arg4.field4280;
            var8.field2800 = arg4.field4273 * 128;
            class200.field3197.method310(class116.method767(-126, arg4.field4269), var8, 25357);
        }
        if (arg6) {
            method920((byte) -86);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IILag;)V", line = 141)
    public final void method178(int arg0, int arg1, class202 arg2) {
        field2343++;
        if (arg0 != -318) {
            method918(-53, (String) null);
        }
        if (arg1 == 0) {
            this.field2347 = arg2.method1315(arg0 ^ 0xFFFFC913);
        } else if (arg1 == 1) {
            this.field2346 = arg2.method1317((byte) -119) == 1;
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;", line = 177)
    public static final Class method922(int arg0, String arg1) throws ClassNotFoundException {
        field2350++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg1.equals("C")) {
            return Character.TYPE;
        } else {
            if (arg0 > -36) {
                method920((byte) -53);
            }
            return Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(IB)[[I", line = 218)
    public final int[][] method175(int arg0, byte arg1) {
        field2348++;
        int[][] var3 = this.field441.method220(arg0, 17433);
        if (arg1 <= 16) {
            field2355 = (int[]) null;
        }
        if (this.field441.field532) {
            int[] var4 = this.method171(0, -52, class204.field3323 & arg0 - 1);
            int[] var5 = this.method171(0, -84, arg0);
            int[] var6 = this.method171(0, 75, arg0 + 1 & class204.field3323);
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var3[0];
            for (int var10 = 0; var10 < class294.field4489; var10++) {
                int var11 = (var6[var10] - var4[var10]) * this.field2347;
                int var12 = var11 >> 12;
                int var13 = (var5[var10 + 1 & class4.field108] - var5[class4.field108 & var10 - 1]) * this.field2347;
                int var14 = var12 * var12 >> 12;
                int var15 = var13 >> 12;
                int var16 = var15 * var15 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var16 + var14 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var18 = var13 / var17;
                    var19 = 16777216 / var17;
                    var20 = var11 / var17;
                }
                if (this.field2346) {
                    var18 = (var18 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var9[var10] = var18;
                var7[var10] = var20;
                var8[var10] = var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)V", line = 297)
    public static final void method923(int arg0) {
        field2349++;
        if (class276.field4225 <= 0) {
            class15.field275 = class177.field2860;
            class177.field2860 = null;
            int var1 = 107 / ((arg0 - 87) / 32);
            class9.method79((byte) -101, 40);
        } else {
            class264.method1761((byte) 110);
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2342[var0] = var1;
        }
        field2355 = new int[] { 1, 2, 4, 8 };
    }
}
