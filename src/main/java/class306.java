import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class306 extends class292 {

    @OriginalMember(owner = "client!bn", name = "D", descriptor = "[I")
    private int[] field4198 = new int[this.field3911];

    @OriginalMember(owner = "client!bn", name = "B", descriptor = "Ljm;")
    public static class485 field4196 = new class485(18, 12);

    @OriginalMember(owner = "client!bn", name = "F", descriptor = "Luf;")
    public static class310 field4200 = new class310(107, -2);

    @OriginalMember(owner = "client!bn", name = "t", descriptor = "I")
    private int field4188;

    @OriginalMember(owner = "client!bn", name = "u", descriptor = "I")
    private int field4189;

    @OriginalMember(owner = "client!bn", name = "w", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!bn", name = "x", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!bn", name = "y", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!bn", name = "z", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!bn", name = "A", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!bn", name = "C", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!bn", name = "H", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!bn", name = "G", descriptor = "Ldb;")
    public static class210 field4201;

    @OriginalMember(owner = "client!bn", name = "v", descriptor = "[B")
    private byte[] field4190;

    @OriginalMember(owner = "client!bn", name = "E", descriptor = "[Ljava/lang/String;")
    public static String[] field4199;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "(I)V", line = 3)
    public static void method1734(int arg0) {
        field4199 = null;
        if (arg0 <= 118) {
            method1734(1);
        }
        field4201 = null;
        field4200 = null;
        field4196 = null;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(JI)V", line = 22)
    public static final void method1735(long arg0, int arg1) {
        ++field4202;
        int var3 = class42.field595 + class75.field1089.field466;
        int var4 = class137.field1960 + class75.field1089.field461;
        if (~(-var3 + class254.field3530) > 499 || ~(class254.field3530 - var3) < -501 || ~(-var4 + class67.field934) > 499 || ~(-var4 + class67.field934) < -501) {
            class254.field3530 = var3;
            class67.field934 = var4;
        }
        if (~class254.field3530 != ~var3) {
            int var5 = var3 - class254.field3530;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (~var5 >= -1) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (~var5 < ~var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var6 > var5) {
                var6 = var5;
            }
            class254.field3530 += var6;
        }
        if (arg1 == -6937) {
            if (~class67.field934 != ~var4) {
                int var7 = -class67.field934 + var4;
                int var8 = (int) ((long) var7 * arg0 / 320L);
                if (~var7 >= -1) {
                    if (var8 == 0) {
                        var8 = -1;
                    } else if (var8 < var7) {
                        var8 = var7;
                    }
                } else if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
                class67.field934 += var8;
            }
            if (!class437.field6374.field4261) {
                class510.field7495 += (float) arg0 * class260.field3580 / 6.0F;
                class40.field553 += (float) arg0 * class401.field5582 / 6.0F;
            }
            class118.method746(-103);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(II)I", line = 113)
    public static final int method1736(int arg0, int arg1) {
        int var2 = 112 / ((arg1 - -23) / 43);
        ++field4193;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(BBI)V", line = 126)
    public void method1737(byte arg0, byte arg1, int arg2) {
        this.field4190[this.field4188++] = (byte) (127 + class118.method750(arg1 >> 1, 127));
        ++field4194;
        if (arg0 != 80) {
            method1736(-89, 2);
        }
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(I)V", line = 137)
    public final void method1671(int arg0) {
        int var2 = -8 / ((arg0 - -64) / 46);
        ++field4191;
        this.field4188 = 0;
        this.field4189 = 0;
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(IIIIIF)V", line = 152)
    public class306(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~super.field3911 < ~var7; ++var7) {
            this.field4198[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(II)Z", line = 174)
    public static final boolean method1738(int arg0, int arg1) {
        if (arg0 != -17521) {
            method1739(-19, -41, 45, (class463) null, (class463) null);
        }
        ++field4192;
        return arg1 >= 0 && ~arg1 >= -4 || ~arg1 == -10;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(BII)V", line = 186)
    public final void method1670(byte arg0, int arg1, int arg2) {
        ++field4197;
        if (arg0 < 32) {
            field4196 = null;
        }
        this.field4189 += this.field4198[arg1] * arg2 >> 12;
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)V", line = 198)
    public final void method1669(int arg0) {
        ++field4195;
        this.field4189 = Math.abs(this.field4189);
        if (arg0 == -28971) {
            if (this.field4189 >= 4096) {
                this.field4189 = 4095;
            }
            this.method1737((byte) 80, (byte) (this.field4189 >> 4), this.field4188++);
            this.field4189 = 0;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIILfk;Lfk;)V", line = 218)
    public static final void method1739(int arg0, int arg1, int arg2, class463 arg3, class463 arg4) {
        class61 var5 = class176.method1082(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field825 = arg3;
            var5.field816 = arg4;
        }
    }
}
