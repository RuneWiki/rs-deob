import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class256 {

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "Lp;")
    private class292 field3924 = new class292();

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "Lb;")
    private class84 field3937 = new class84();

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "I")
    private int field3936;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "I")
    private int field3935;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "Lll;")
    private class211 field3934;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3920 = "Use";

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field3921 = -1;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "C")
    public static char field3932;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "La;")
    public static class49 field3919;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "[[B")
    public static byte[][] field3933;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "[[Z")
    public static boolean[][] field3918;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
    public static void method1698(byte arg0) {
        field3919 = null;
        if (arg0 != -42) {
            method1705((class37) null, false);
        }
        field3918 = null;
        field3933 = null;
        field3920 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)Lnc;")
    public final class86 method1699(int arg0) {
        if (arg0 >= -60) {
            method1706(-76, 23, 11, -12, -60, 25, (class205) null, 34, 39L);
        }
        field3925++;
        return this.field3934.method1413(-1);
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
    public final void method1700(int arg0) {
        if (arg0 < 119) {
            return;
        }
        field3928++;
        this.field3937.method684(125);
        this.field3934.method1412(29692);
        this.field3924 = new class292();
        this.field3935 = this.field3936;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZJ)Lp;")
    public final class292 method1701(boolean arg0, long arg1) {
        class292 var4 = (class292) this.field3934.method1414(true, arg1);
        if (var4 != null) {
            this.field3937.method683(var4, 116);
        }
        field3929++;
        if (arg0) {
            field3919 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)I")
    public static final int method1702(int arg0, int arg1, int arg2) {
        field3923++;
        int var3 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg2 * var3;
            }
            arg2 *= arg2;
            arg0 >>= 0x1;
        }
        if (arg0 == 1) {
            return arg2 * var3;
        } else {
            int var4 = 109 / ((55 - arg1) / 48);
            return var3;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZIIIILvl;I)Lqd;")
    public static final class3 method1703(boolean arg0, int arg1, int arg2, int arg3, int arg4, class242 arg5, int arg6) {
        field3926++;
        int var8 = (arg6 << 19) + (arg0 ? 65536 : 0) + arg2 + (arg3 << 17);
        long var9 = (long) arg1 * 3147483667L + (long) var8 * 3849834839L;
        class3 var11 = (class3) class8.field176.method1780(var9, (byte) -122);
        if (var11 != null) {
            return var11;
        }
        if (arg4 != -30235) {
            field3933 = null;
        }
        class97.field1562 = false;
        class3 var12 = class70.method544(false, arg6, (byte) 105, arg0, arg5, arg1, arg2, arg3, false);
        if (var12 != null && !class97.field1562) {
            class8.field176.method1784(var12, false, var9);
        }
        return var12;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(JLp;Z)V")
    public final void method1704(long arg0, class292 arg1, boolean arg2) {
        if (this.field3935 == 0) {
            class292 var5 = this.field3937.method685(0);
            var5.method693(-108);
            var5.method1964(12213);
            if (this.field3924 == var5) {
                class292 var6 = this.field3937.method685(0);
                var6.method693(-79);
                var6.method1964(12213);
            }
        } else {
            this.field3935--;
        }
        if (arg2) {
            this.field3934.method1409(arg0, 1, arg1);
            field3927++;
            this.field3937.method683(arg1, 122);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lf;Z)V")
    public static final void method1705(class37 arg0, boolean arg1) {
        while (arg0.field583.length > arg0.field588) {
            boolean var2 = false;
            int var3 = 0;
            int var4 = 0;
            if (arg0.method333((byte) -59) == 1) {
                var3 = arg0.method333((byte) -59);
                var4 = arg0.method333((byte) -59);
                var2 = true;
            }
            int var5 = arg0.method333((byte) -59);
            int var6 = arg0.method333((byte) -59);
            int var7 = class221.field3453 - (var6 * 64 - class197.field3093) - 1;
            int var8 = var5 * 64 - class76.field1275;
            if (var8 >= 0 && var7 - 63 >= 0 && (var8 + 63) < class188.field3010 && class221.field3453 > var7) {
                int var9 = var8 >> 6;
                int var10 = var7 >> 6;
                for (int var11 = 0; var11 < 64; var11++) {
                    for (int var12 = 0; var12 < 64; var12++) {
                        if (!var2 || (var3 * 8) <= var11 && var11 < var3 * 8 + 8 && var12 >= (var4 * 8) && (var4 * 8 + 8) > var12) {
                            byte var13 = arg0.method322((byte) 109);
                            if (var13 != 0) {
                                if (class222.field3467[var9][var10] == null) {
                                    class222.field3467[var9][var10] = new byte[4096];
                                }
                                class222.field3467[var9][var10][(63 - var12 << 6) + var11] = var13;
                                byte var14 = arg0.method322((byte) 118);
                                if (class157.field2413[var9][var10] == null) {
                                    class157.field2413[var9][var10] = new byte[4096];
                                }
                                class157.field2413[var9][var10][(63 - var12 << 6) + var11] = var14;
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                    byte var16 = arg0.method322((byte) 24);
                    if (var16 != 0) {
                        arg0.field588++;
                    }
                }
            }
        }
        field3931++;
        if (!arg1) {
            method1702(-91, -86, -78);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIILbf;IJ)Z")
    public static final boolean method1706(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class205 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class66.method521(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)Lnc;")
    public final class86 method1707(int arg0) {
        field3930++;
        return arg0 == 6709 ? this.field3934.method1410(-128) : null;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(I)V")
    public class256(int arg0) {
        this.field3936 = arg0;
        int var2 = 1;
        this.field3935 = arg0;
        while (var2 + var2 < arg0) {
            var2 += var2;
        }
        this.field3934 = new class211(var2);
    }
}
