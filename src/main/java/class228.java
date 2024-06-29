import java.util.Calendar;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class228 extends class306 {

    @OriginalMember(owner = "client!bg", name = "L", descriptor = "I")
    private int field3460 = 5;

    @OriginalMember(owner = "client!bg", name = "R", descriptor = "[S")
    private short[] field3466 = new short[512];

    @OriginalMember(owner = "client!bg", name = "Q", descriptor = "I")
    private int field3465 = 5;

    @OriginalMember(owner = "client!bg", name = "S", descriptor = "I")
    private int field3467 = 1;

    @OriginalMember(owner = "client!bg", name = "H", descriptor = "I")
    private int field3456 = 2;

    @OriginalMember(owner = "client!bg", name = "J", descriptor = "I")
    private int field3458 = 2048;

    @OriginalMember(owner = "client!bg", name = "U", descriptor = "I")
    private int field3469 = 0;

    @OriginalMember(owner = "client!bg", name = "X", descriptor = "[B")
    private byte[] field3472 = new byte[512];

    @OriginalMember(owner = "client!bg", name = "G", descriptor = "Ljava/lang/String;")
    public static String field3455 = "green:";

    @OriginalMember(owner = "client!bg", name = "I", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3457 = Calendar.getInstance();

    @OriginalMember(owner = "client!bg", name = "T", descriptor = "I")
    public static int field3468 = 0;

    @OriginalMember(owner = "client!bg", name = "V", descriptor = "Ljava/lang/String;")
    public static String field3470 = "glow3:";

    @OriginalMember(owner = "client!bg", name = "K", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!bg", name = "M", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!bg", name = "N", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!bg", name = "O", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!bg", name = "P", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!bg", name = "W", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)[I", line = 4)
    public final int[] method47(int arg0, int arg1) {
        field3464++;
        if (arg1 != -1546337535) {
            this.field3465 = 3;
        }
        int[] var3 = this.field4757.method903(arg0, arg1 ^ 0x5C2B3CD9);
        if (this.field4757.field1898) {
            int var4 = class111.field1553[arg0] * this.field3465 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class31.field367; var7++) {
                class88.field1165 = Integer.MAX_VALUE;
                class169.field2584 = Integer.MAX_VALUE;
                class192.field2882 = Integer.MAX_VALUE;
                class70.field870 = Integer.MAX_VALUE;
                int var8 = class25.field288[var7] * this.field3460 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; var11++) {
                    int var12 = this.field3472[(var11 < this.field3465 ? var11 : var11 - this.field3465) & 0xFF] & 0xFF;
                    for (int var13 = var9 - 1; var13 <= var10; var13++) {
                        int var14 = (this.field3472[var12 + (var13 >= this.field3460 ? var13 - this.field3460 : var13) & 0xFF] & 0xFF) * 2;
                        int var27 = var14 + 1;
                        int var15 = var8 - this.field3466[var14] - (var13 << 12);
                        int var16 = var4 - ((var11 << 12) + this.field3466[var27]);
                        int var17 = this.field3467;
                        int var18;
                        if (var17 == 1) {
                            var18 = var15 * var15 + var16 * var16 >> 12;
                        } else if (var17 == 3) {
                            int var19 = var16 >= 0 ? var16 : -var16;
                            int var20 = var15 >= 0 ? var15 : -var15;
                            var18 = var20 <= var19 ? var19 : var20;
                        } else if (var17 == 4) {
                            int var23 = (int) (Math.sqrt((double) ((float) (var15 < 0 ? -var15 : var15) / 4096.0F)) * 4096.0D);
                            int var24 = (int) (Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                            int var25 = var23 + var24;
                            var18 = var25 * var25 >> 12;
                        } else if (var17 == 5) {
                            int var21 = var16 * var16;
                            int var22 = var15 * var15;
                            var18 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var22 + var21) / 1.6777216E7F))) * 4096.0D);
                        } else if (var17 == 2) {
                            var18 = (var16 < 0 ? -var16 : var16) + (var15 < 0 ? -var15 : var15);
                        } else {
                            var18 = (int) (Math.sqrt((double) ((float) (var15 * var15 + var16 * var16) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (class70.field870 > var18) {
                            class88.field1165 = class169.field2584;
                            class169.field2584 = class192.field2882;
                            class192.field2882 = class70.field870;
                            class70.field870 = var18;
                        } else if (var18 < class192.field2882) {
                            class88.field1165 = class169.field2584;
                            class169.field2584 = class192.field2882;
                            class192.field2882 = var18;
                        } else if (class169.field2584 > var18) {
                            class88.field1165 = class169.field2584;
                            class169.field2584 = var18;
                        } else if (class88.field1165 > var18) {
                            class88.field1165 = var18;
                        }
                    }
                }
                int var26 = this.field3456;
                if (var26 == 0) {
                    var3[var7] = class70.field870;
                } else if (var26 == 1) {
                    var3[var7] = class192.field2882;
                } else if (var26 == 3) {
                    var3[var7] = class169.field2584;
                } else if (var26 == 4) {
                    var3[var7] = class88.field1165;
                } else if (var26 == 2) {
                    var3[var7] = class192.field2882 - class70.field870;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)Lsf;", line = 215)
    public static final class123 method1582(int arg0, int arg1, int arg2) {
        class196 var3 = class194.field2947[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class123 var4 = var3.field2999;
            var3.field2999 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIILbf;ZII)Lbf;", line = 229)
    public static final class362 method1583(int arg0, int arg1, int arg2, class362 arg3, boolean arg4, int arg5, int arg6) {
        field3461++;
        long var7 = (long) arg6;
        class362 var9 = (class362) class71.field883.method380(0, var7);
        if (var9 == null) {
            class193 var10 = class193.method1319(class166.field2567, arg6, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1324(64, 768, -50, -10, -50);
            class71.field883.method377(var7, var9, -1);
        }
        int var11 = arg3.method811();
        int var12 = arg3.method813();
        int var13 = arg3.method830();
        int var14 = arg3.method803();
        class362 var15 = var9.method797(arg4, true, true);
        if (arg5 != 0) {
            var15.method839(arg5);
        }
        if (class272.field4317) {
            class124 var16 = (class124) var15;
            if (arg2 != class14.method80(arg1 + var13, class219.field3290, arg0 + var11, (byte) -126) || arg2 != class14.method80(arg1 + var14, class219.field3290, arg0 + var12, (byte) -126)) {
                for (int var17 = 0; var17 < var16.field1730; var17++) {
                    var16.field1723[var17] += class14.method80(var16.field1708[var17] + arg1, class219.field3290, var16.field1741[var17] + arg0, (byte) -126) - arg2;
                }
                var16.field1743.field1326 = false;
                var16.field1720.field881 = false;
            }
        } else {
            class133 var18 = (class133) var15;
            if (class14.method80(arg1 + var13, class219.field3290, arg0 + var11, (byte) -126) != arg2 || class14.method80(arg1 + var14, class219.field3290, arg0 + var12, (byte) -126) != arg2) {
                for (int var19 = 0; var19 < var18.field1930; var19++) {
                    var18.field1923[var19] += class14.method80(var18.field1928[var19] + arg1, class219.field3290, var18.field1924[var19] + arg0, (byte) -126) - arg2;
                }
                var18.field1941 = false;
            }
        }
        return var15;
    }

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "(I)V", line = 307)
    public static void method1584(int arg0) {
        field3457 = null;
        field3470 = null;
        if (arg0 != 1) {
            field3470 = (String) null;
        }
        field3455 = null;
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V", line = 318)
    public class228() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILlf;I)V", line = 322)
    public final void method45(int arg0, class143 arg1, int arg2) {
        field3459++;
        if (arg2 == 0) {
            this.field3460 = this.field3465 = arg1.method1043(true);
        } else if (arg2 == 1) {
            this.field3469 = arg1.method1043(true);
        } else if (arg2 == 2) {
            this.field3458 = arg1.method1051(1);
        } else if (arg2 == 3) {
            this.field3456 = arg1.method1043(true);
        } else if (arg2 == 4) {
            this.field3467 = arg1.method1043(true);
        } else if (arg2 == 5) {
            this.field3460 = arg1.method1043(true);
        } else if (arg2 == 6) {
            this.field3465 = arg1.method1043(true);
        }
        if (arg0 != -15334) {
            this.field3460 = 122;
        }
    }

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "(I)V", line = 408)
    private final void method1585(int arg0) {
        field3463++;
        Random var2 = new Random((long) this.field3469);
        this.field3466 = new short[512];
        int var3 = 104 % ((32 - arg0) / 60);
        if (this.field3458 > 0) {
            for (int var4 = 0; var4 < 512; var4++) {
                this.field3466[var4] = (short) class220.method1534(this.field3458, var2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "(B)V", line = 446)
    public final void method43(byte arg0) {
        if (arg0 <= -103) {
            field3471++;
            this.field3472 = class185.method1276(this.field3469, 7390);
            this.method1585(-101);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;", line = 464)
    public static final String method1586(boolean arg0, String arg1) {
        if (arg0) {
            return (String) null;
        }
        field3462++;
        String var2 = class230.method1597(class294.method2093((byte) 100, arg1), (byte) -59);
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }
}
