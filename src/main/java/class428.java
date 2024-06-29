import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class428 extends class43 {

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    public int field5848 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "I")
    public int field5859 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    public int field5855 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public int field5846 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public int field5850 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    public int field5852 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "I")
    public int field5861 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!qe", name = "B", descriptor = "I")
    public int field5863 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!qe", name = "A", descriptor = "Lpd;")
    public class278 field5862;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "[[I")
    public static int[][] field5847 = new int[128][128];

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
    public static int field5851 = 0;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    public static int field5849;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "I")
    public static int field5853;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
    public static int field5854;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
    public static int field5856;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "I")
    public static int field5857;

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "I")
    public static int field5858;

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "Lwo;")
    public static class285 field5860;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)I", line = 11)
    public static final int method2610(int arg0) {
        field5853++;
        if (arg0 != 255) {
            field5847 = null;
        }
        return 6;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lpd;)V", line = 205)
    public class428(class278 arg0) {
        this.field5862 = arg0;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)V", line = 28)
    public static final void method2611(byte arg0) {
        field5849++;
        class365 var1 = class219.field2706;
        synchronized (class219.field2706) {
            class219.field2706.method2298(0);
        }
        class365 var2 = class106.field1272;
        synchronized (class106.field1272) {
            class106.field1272.method2298(0);
        }
        class365 var3 = class363.field4932;
        synchronized (class363.field4932) {
            class363.field4932.method2298(0);
        }
        if (arg0 <= -66) {
            class365 var4 = class395.field5376;
            synchronized (class395.field5376) {
                class395.field5376.method2298(0);
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IBI)Z", line = 50)
    public final boolean method2612(int arg0, byte arg1, int arg2) {
        if (arg1 > -28) {
            this.field5859 = -23;
        }
        field5856++;
        if (this.field5850 <= arg0 && arg0 <= this.field5852 && this.field5848 <= arg2 && arg2 <= this.field5861) {
            return true;
        } else {
            return arg0 >= this.field5846 && arg0 <= this.field5859 && this.field5863 <= arg2 && arg2 <= this.field5855;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)[B", line = 74)
    public static final byte[] method2613(int arg0, int arg1) {
        if (arg1 != 511) {
            method2613(106, -26);
        }
        field5854++;
        class116 var2 = (class116) class401.field5523.method648(1, (long) arg0);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class174.method1096(-20548, var4, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class116(var3);
            class401.field5523.method643((long) arg0, var2, (byte) 122);
        }
        return var2.field1336;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILla;)V", line = 124)
    public static final void method2614(int arg0, class266 arg1) {
        field5857++;
        if (arg0 <= 13) {
            method2616((byte) 42);
        }
        if (!class49.field574) {
            arg1.method263(false);
            class57.field660--;
        }
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)V", line = 159)
    public static void method2615(int arg0) {
        if (arg0 != Integer.MAX_VALUE) {
            field5847 = null;
        }
        field5860 = null;
        field5847 = null;
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)I", line = 177)
    public static final int method2616(byte arg0) {
        field5858++;
        if ((double) class224.field2814 == 3.0D) {
            return 37;
        } else if ((double) class224.field2814 == 4.0D) {
            return 50;
        } else {
            if (arg0 != 22) {
                field5851 = -90;
            }
            if ((double) class224.field2814 == 6.0D) {
                return 75;
            } else if ((double) class224.field2814 == 8.0D) {
                return 100;
            } else {
                return 200;
            }
        }
    }
}
