import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class39 extends class297 {

    @OriginalMember(owner = "client!kb", name = "N", descriptor = "I")
    private int field594 = 4096;

    @OriginalMember(owner = "client!kb", name = "P", descriptor = "I")
    private int field596 = 0;

    @OriginalMember(owner = "client!kb", name = "T", descriptor = "I")
    public static int field600 = 0;

    @OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!kb", name = "J", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!kb", name = "L", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!kb", name = "O", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!kb", name = "R", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!kb", name = "S", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!kb", name = "U", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!kb", name = "M", descriptor = "Lpk;")
    public static class120 field593;

    @OriginalMember(owner = "client!kb", name = "Q", descriptor = "Lpk;")
    public static class120 field597;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZ)[I", line = 4)
    public final int[] method173(int arg0, boolean arg1) {
        if (!arg1) {
            this.method169(70, 92, (class1) null);
        }
        field595++;
        int[] var3 = this.field4760.method215(arg0, 19142);
        if (this.field4760.field388) {
            int[] var4 = this.method2109(arg0, (byte) 56, 0);
            for (int var5 = 0; var5 < class31.field491; var5++) {
                int var6 = var4[var5];
                if (var6 < this.field596) {
                    var3[var5] = this.field596;
                } else if (var6 > this.field594) {
                    var3[var5] = this.field594;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(CI)Z", line = 57)
    public static final boolean method341(char arg0, int arg1) {
        field598++;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg0 != '\u0000') {
            int var2 = 0;
            char[] var3 = class216.field3355;
            while (var3.length > var2) {
                char var4 = var3[var2];
                if (arg0 == var4) {
                    return true;
                }
                var2++;
            }
        }
        if (arg1 <= 94) {
            method342(123, 111);
        }
        return false;
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V", line = 93)
    public class39() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V", line = 97)
    public static final void method342(int arg0, int arg1) {
        class247.field3680.method2285(arg1, (byte) 118);
        if (arg0 == 46) {
            field599++;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IB)[[I", line = 109)
    public final int[][] method172(int arg0, byte arg1) {
        int[][] var3 = this.field4767.method1141(arg1 - 1740, arg0);
        field591++;
        if (arg1 != 63) {
            this.method172(-2, (byte) -26);
        }
        if (this.field4767.field2480) {
            int[][] var4 = this.method2105(arg0, 2, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class31.field491; var11++) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 < this.field596) {
                    var8[var11] = this.field596;
                } else if (this.field594 >= var12) {
                    var8[var11] = var12;
                } else {
                    var8[var11] = this.field594;
                }
                if (var13 < this.field596) {
                    var10[var11] = this.field596;
                } else if (this.field594 < var13) {
                    var10[var11] = this.field594;
                } else {
                    var10[var11] = var13;
                }
                if (var14 < this.field596) {
                    var9[var11] = this.field596;
                } else if (this.field594 < var14) {
                    var9[var11] = this.field594;
                } else {
                    var9[var11] = var14;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(B)V", line = 187)
    public static void method343(byte arg0) {
        field593 = null;
        if (arg0 > -22) {
            method342(-11, 117);
        }
        field597 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZIIIJ)Ljava/lang/String;", line = 200)
    public static final String method344(boolean arg0, int arg1, int arg2, int arg3, long arg4) {
        field590++;
        char var6 = ',';
        char var7 = '.';
        boolean var8 = false;
        if (arg4 < 0L) {
            var8 = true;
            arg4 = -arg4;
        }
        if (arg3 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg3 == 2) {
            var7 = ' ';
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg1 > 0) {
            for (int var10 = 0; var10 < arg1; var10++) {
                int var11 = (int) arg4;
                arg4 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg4 * 10)));
            }
            var9.append(var6);
        }
        if (arg2 != 23485) {
            field600 = -107;
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg4;
            arg4 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg4 * 10)));
            if (arg4 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg0) {
                var12++;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IILaj;)V", line = 287)
    public final void method169(int arg0, int arg1, class1 arg2) {
        field601++;
        if (arg1 != 255) {
            method342(-66, -64);
        }
        if (arg0 == 0) {
            this.field596 = arg2.method56(19612);
        } else if (arg0 == 1) {
            this.field594 = arg2.method56(19612);
        } else if (arg0 == 2) {
            this.field4762 = arg2.method15((byte) -112) == 1;
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(Z)V", line = 334)
    public static final void method345(boolean arg0) {
        class252.method1743();
        class136.field2221 = new class335[9];
        class136.field2221[1] = new class97();
        class136.field2221[2] = new class276();
        field592++;
        class136.field2221[3] = new class300();
        class136.field2221[4] = new class203();
        class136.field2221[5] = new class204();
        if (arg0) {
            field600 = 99;
        }
        class136.field2221[6] = new class163();
        class136.field2221[7] = new class285();
    }
}
