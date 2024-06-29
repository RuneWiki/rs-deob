import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class223 extends class325 {

    @OriginalMember(owner = "client!ve", name = "G", descriptor = "Z")
    public boolean field3393 = true;

    @OriginalMember(owner = "client!ve", name = "T", descriptor = "I")
    public static int field3406 = 0;

    @OriginalMember(owner = "client!ve", name = "W", descriptor = "J")
    public static long field3409 = 0L;

    @OriginalMember(owner = "client!ve", name = "N", descriptor = "Ljava/lang/String;")
    public static String field3400 = null;

    @OriginalMember(owner = "client!ve", name = "I", descriptor = "I")
    public static int field3395 = -1;

    @OriginalMember(owner = "client!ve", name = "bb", descriptor = "I")
    public static int field3414 = 0;

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!ve", name = "J", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!ve", name = "K", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!ve", name = "M", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!ve", name = "O", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!ve", name = "P", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!ve", name = "Q", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!ve", name = "R", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!ve", name = "U", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!ve", name = "V", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!ve", name = "X", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!ve", name = "Y", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!ve", name = "L", descriptor = "Ljd;")
    public static class95 field3398;

    @OriginalMember(owner = "client!ve", name = "H", descriptor = "[I")
    public int[] field3394;

    @OriginalMember(owner = "client!ve", name = "S", descriptor = "[I")
    private int[] field3405;

    @OriginalMember(owner = "client!ve", name = "Z", descriptor = "[Ljava/lang/String;")
    private String[] field3412;

    @OriginalMember(owner = "client!ve", name = "ab", descriptor = "[[I")
    private int[][] field3413;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(B)Ljava/lang/String;", line = 4)
    public final String method1583(byte arg0) {
        if (arg0 != 10) {
            this.method1589(false, -107, 110);
        }
        field3392++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field3412 == null) {
            return "";
        }
        var2.append(this.field3412[0]);
        for (int var3 = 1; var3 < this.field3412.length; var3++) {
            var2.append("...");
            var2.append(this.field3412[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "([ILwm;B)V", line = 34)
    public final void method1584(int[] arg0, class254 arg1, byte arg2) {
        field3401++;
        if (this.field3405 == null) {
            return;
        }
        if (arg2 != -37) {
            this.method1587((byte) -82);
        }
        for (int var4 = 0; this.field3405.length > var4 && var4 < arg0.length; var4++) {
            int var5 = class273.field4262[this.method1593(var4, 0)];
            if (var5 > 0) {
                arg1.method1780((byte) -66, var5, (long) arg0[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILwm;)V", line = 61)
    public final void method1585(int arg0, class254 arg1) {
        field3411++;
        while (true) {
            int var3 = arg1.method1774((byte) -128);
            if (var3 == 0) {
                if (arg0 != 0) {
                    this.method1584((int[]) null, (class254) null, (byte) 88);
                }
                return;
            }
            this.method1586(arg1, var3, 0);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lwm;II)V", line = 87)
    private final void method1586(class254 arg0, int arg1, int arg2) {
        field3407++;
        if (arg2 != 0) {
            return;
        }
        if (arg1 == 1) {
            this.field3412 = class32.method250('<', 0, arg0.method1778(arg2 + 1258));
        } else if (arg1 == 2) {
            int var4 = arg0.method1774((byte) 21);
            this.field3394 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3394[var5] = arg0.method1755(false);
            }
        } else if (arg1 == 3) {
            int var6 = arg0.method1774((byte) -116);
            this.field3413 = new int[var6][];
            this.field3405 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg0.method1755(false);
                this.field3405[var7] = var8;
                this.field3413[var7] = new int[class226.field3455[var8]];
                for (int var9 = 0; var9 < class226.field3455[var8]; var9++) {
                    this.field3413[var7][var9] = arg0.method1755(false);
                }
            }
        } else if (arg1 == 4) {
            this.field3393 = false;
        }
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(B)I", line = 154)
    public final int method1587(byte arg0) {
        if (arg0 == 78) {
            field3397++;
            return this.field3405 == null ? 0 : this.field3405.length;
        } else {
            return -64;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIII)V", line = 169)
    public static final void method1588(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3403++;
        int var6 = class335.method2343(-1, class212.field3261, arg0, class182.field2888);
        int var7 = class335.method2343(arg1, class212.field3261, arg4, class182.field2888);
        int var8 = class335.method2343(arg1, class234.field3569, arg2, class322.field4965);
        int var9 = class335.method2343(-1, class234.field3569, arg3, class322.field4965);
        for (int var10 = var6; var10 <= var7; var10++) {
            class7.method72(var9, -7, var8, class79.field1178[var10], arg5);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZII)I", line = 194)
    public final int method1589(boolean arg0, int arg1, int arg2) {
        field3410++;
        if (this.field3405 == null || arg1 < 0 || this.field3405.length < arg1) {
            return -1;
        } else {
            if (!arg0) {
                field3398 = (class95) null;
            }
            return this.field3413[arg1] == null || arg2 < 0 || arg2 > this.field3413[arg1].length ? -1 : this.field3413[arg1][arg2];
        }
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(I)V", line = 227)
    public static void method1590(int arg0) {
        field3398 = null;
        if (arg0 > -49) {
            method1588(-69, -25, -6, -19, -123, -16);
        }
        field3400 = null;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(Z)V", line = 249)
    public final void method1591(boolean arg0) {
        if (this.field3394 != null) {
            for (int var2 = 0; var2 < this.field3394.length; var2++) {
                this.field3394[var2] = class261.method1835(this.field3394[var2], 32768);
            }
        }
        if (arg0) {
            field3402++;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IB)I", line = 269)
    public static final int method1592(int arg0, byte arg1) {
        if (arg1 != -101) {
            method1592(-17, (byte) -45);
        }
        field3396++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(II)I", line = 292)
    public final int method1593(int arg0, int arg1) {
        field3404++;
        if (this.field3405 == null || arg0 < 0 || this.field3405.length < arg0) {
            return -1;
        } else {
            if (arg1 != 0) {
                this.method1587((byte) -51);
            }
            return this.field3405[arg0];
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLwm;)Ljava/lang/String;", line = 315)
    public final String method1594(byte arg0, class254 arg1) {
        field3399++;
        if (arg0 != 33) {
            this.method1583((byte) -61);
        }
        StringBuffer var3 = new StringBuffer(80);
        if (this.field3405 != null) {
            for (int var4 = 0; var4 < this.field3405.length; var4++) {
                var3.append(this.field3412[var4]);
                var3.append(class144.method1095(0, this.field3405[var4], this.field3413[var4], arg1.method1732((byte) 31, class62.field832[this.field3405[var4]])));
            }
        }
        var3.append(this.field3412[this.field3412.length - 1]);
        return var3.toString();
    }
}
