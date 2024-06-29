import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class340 {

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    private int field4339;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    public int field4346;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "Lhb;")
    public static class250 field4338 = new class250(38, 7);

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "[S")
    public static short[] field4344 = new short[256];

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "Lia;")
    public static class142 field4340;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field4341;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZIIII)V", line = 4)
    public static final void method2001(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field4343++;
        if (arg0 < 1) {
            arg0 = 1;
        }
        if (arg5 > arg2) {
            arg2 = 1;
        }
        int var6 = arg0 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class475.field6951 - class200.field2582) * var6 / 100 + class200.field2582;
        if (class196.field2538 > var7) {
            var7 = class196.field2538;
        } else if (class529.field7802 < var7) {
            var7 = class529.field7802;
        }
        int var8 = var7 * 512 * arg0 / (arg2 * 334);
        if (class508.field7459 > var8) {
            short var12 = class508.field7459;
            var7 = arg2 * 334 * var12 / (arg0 * 512);
            if (class529.field7802 < var7) {
                var7 = class529.field7802;
                int var13 = arg0 * var7 * 512 / (var12 * 334);
                int var14 = (arg2 - var13) / 2;
                if (arg1) {
                    class512.field7538.method865();
                    class512.field7538.method866(arg0, -5152, arg3, var14, arg4, -16777216);
                    class512.field7538.method866(arg0, arg5 - 5153, -var14 + arg3 + arg2, var14, arg4, -16777216);
                }
                arg3 += var14;
                arg2 -= var14 * 2;
            }
        } else if (var8 > class76.field978) {
            short var9 = class76.field978;
            var7 = var9 * 334 * arg2 / (arg0 * 512);
            if (var7 < class196.field2538) {
                var7 = class196.field2538;
                int var10 = var9 * 334 * arg2 / (var7 * 512);
                int var11 = (arg0 - var10) / 2;
                if (arg1) {
                    class512.field7538.method865();
                    class512.field7538.method866(var11, -5152, arg3, arg2, arg4, -16777216);
                    class512.field7538.method866(var11, -5152, arg3, arg2, arg4 + arg0 - var11, -16777216);
                }
                arg0 -= var11 * 2;
                arg4 += var11;
            }
        }
        class183.field2406 = arg0 * var7 / 334;
        class225.field2917 = (short) arg0;
        class111.field1538 = arg4;
        class281.field3593 = arg3;
        class139.field1856 = (short) arg2;
    }

    @OriginalMember(owner = "client!pi", name = "toString", descriptor = "()Ljava/lang/String;", line = 96)
    public final String toString() {
        field4345++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI)V", line = 105)
    public static final void method2002(byte arg0, int arg1) {
        class375.field4873 = arg1;
        field4335++;
        class11 var2 = class324.field4156;
        synchronized (class324.field4156) {
            class324.field4156.method90((byte) -27);
        }
        if (arg0 == 64) {
            class11 var3 = class286.field3657;
            synchronized (class286.field3657) {
                class286.field3657.method90((byte) -27);
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "([JB[Ljava/lang/Object;)V", line = 124)
    public static final void method2003(long[] arg0, byte arg1, Object[] arg2) {
        if (arg1 == -80) {
            field4342++;
            class237.method1505(arg2, 0, arg1 ^ 0x34, arg0, arg0.length - 1);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V", line = 152)
    public static void method2004(byte arg0) {
        if (arg0 <= 62) {
            method2003(null, (byte) 30, null);
        }
        field4341 = null;
        field4338 = null;
        field4340 = null;
        field4344 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IB)Lv;", line = 166)
    public static final class455 method2005(int arg0, byte arg1) {
        if (arg1 <= 111) {
            return null;
        }
        field4337++;
        if (arg0 == 0) {
            if ((double) class230.field2952 == 3.0D) {
                return class240.field3103;
            }
            if ((double) class230.field2952 == 4.0D) {
                return class391.field5119;
            }
            if ((double) class230.field2952 == 6.0D) {
                return class163.field2108;
            }
            if ((double) class230.field2952 >= 8.0D) {
                return class216.field2774;
            }
        } else if (arg0 == 1) {
            if ((double) class230.field2952 == 3.0D) {
                return class163.field2108;
            }
            if ((double) class230.field2952 == 4.0D) {
                return class216.field2774;
            }
            if ((double) class230.field2952 == 6.0D) {
                return class162.field2104;
            }
            if ((double) class230.field2952 >= 8.0D) {
                return class527.field7784;
            }
        } else if (arg0 == 2) {
            if ((double) class230.field2952 == 3.0D) {
                return class162.field2104;
            }
            if ((double) class230.field2952 == 4.0D) {
                return class527.field7784;
            }
            if ((double) class230.field2952 == 6.0D) {
                return class448.field6230;
            }
            if ((double) class230.field2952 >= 8.0D) {
                return class46.field672;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(II)V", line = 232)
    public class340(int arg0, int arg1) {
        this.field4339 = arg0;
        this.field4346 = arg1;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z)I", line = 241)
    public final int method2006(boolean arg0) {
        if (!arg0) {
            method2004((byte) 19);
        }
        field4336++;
        return this.field4339;
    }
}
