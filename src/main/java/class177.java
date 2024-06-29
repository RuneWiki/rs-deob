import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class177 {

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "[[I")
    private int[][] field2850;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    private int field2848;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    private int field2851;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)Lom;")
    public static final class120 method1296(int arg0, int arg1) {
        class120 var2 = (class120) class149.field2467.method99((long) arg1, true);
        field2847++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class23.field419.method1149(arg0, (byte) 102, arg1);
        class120 var4 = new class120();
        if (var3 != null) {
            var4.method908(new class249(var3), 70, arg1);
        }
        class149.field2467.method100((long) arg1, var4, 48);
        return var4;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)I")
    public static final int method1297(int arg0, int arg1, int arg2) {
        class302 var3 = (class302) class21.field381.method987(-122, (long) arg0);
        field2853++;
        if (var3 == null) {
            return -1;
        } else if (arg1 <= 117) {
            return 12;
        } else if (arg2 >= 0 && arg2 < var3.field4922.length) {
            return var3.field4922[arg2];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(II)I")
    public final int method1298(int arg0, int arg1) {
        field2852++;
        if (arg0 == -2037606398) {
            if (this.field2850 != null) {
                arg1 = (int) ((long) this.field2851 * (long) arg1 / (long) this.field2848) + 6;
            }
            return arg1;
        } else {
            return 2;
        }
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(II)I")
    public final int method1299(int arg0, int arg1) {
        field2854++;
        if (this.field2850 != null) {
            arg1 = (int) ((long) this.field2851 * (long) arg1 / (long) this.field2848);
        }
        if (arg0 > -81) {
            this.field2850 = null;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
    public static final void method1300(int arg0) {
        field2849++;
        class21.field381 = new class132(32);
        if (arg0 == -32768) {
            ;
        }
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(II)V")
    public class177(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class119.method899(arg0, 120, arg1);
            int var4 = arg0 / var3;
            this.field2850 = new int[var4][14];
            int var5 = arg1 / var3;
            this.field2848 = var4;
            this.field2851 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field2850[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                double var12 = (double) var5 / (double) var4;
                if (var11 > 14) {
                    var11 = 14;
                }
                while (var10 < var11) {
                    double var14 = var12;
                    double var16 = ((double) var10 - var8) * 3.141592653589793D;
                    if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
                        var14 = var12 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V")
    public static final void method1301(int arg0) {
        class297 var1 = class32.field523;
        synchronized (class32.field523) {
            class36.field561 = class274.field4579;
            class90.field1488++;
            if (class23.field424 >= 0) {
                while (class32.field529 != class23.field424) {
                    int var3 = class240.field4052[class32.field529];
                    class32.field529 = class32.field529 + 1 & 0x7F;
                    if (var3 >= 0) {
                        class157.field2581[var3] = true;
                    } else {
                        class157.field2581[~var3] = false;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class157.field2581[var2] = false;
                }
                class23.field424 = class32.field529;
            }
            class274.field4579 = class228.field3852;
        }
        if (arg0 == 112) {
            field2855++;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "([BB)[B")
    public final byte[] method1302(byte[] arg0, byte arg1) {
        if (this.field2850 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field2851 / (long) this.field2848) + 14;
            int var4 = 0;
            int var5 = 0;
            int[] var6 = new int[var3];
            for (int var7 = 0; var7 < arg0.length; var7++) {
                int[] var10 = this.field2850[var5];
                byte var11 = arg0[var7];
                for (int var12 = 0; var12 < 14; var12++) {
                    var6[var4 + var12] += var10[var12] * var11;
                }
                int var13 = this.field2851 + var5;
                int var14 = var13 / this.field2848;
                var5 = var13 - this.field2848 * var14;
                var4 += var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var6[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 > 127) {
                    arg0[var8] = 127;
                } else {
                    arg0[var8] = (byte) var9;
                }
            }
        }
        if (arg1 >= -61) {
            return null;
        } else {
            field2846++;
            return arg0;
        }
    }
}
