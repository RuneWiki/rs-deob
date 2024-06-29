import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class170 extends InputStream {

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public static int field2398 = 127;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field2401 = 1;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "Ltj;")
    public static class108 field2406;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BLtj;)V", line = 11)
    public static final void method1213(byte arg0, class108 arg1) {
        field2404++;
        class243.field3602 = arg1;
        if (arg0 > -38) {
            method1214(18);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V", line = 28)
    public static void method1214(int arg0) {
        field2406 = null;
        if (arg0 != 7043) {
            field2401 = -20;
        }
    }

    @OriginalMember(owner = "client!aj", name = "read", descriptor = "()I", line = 38)
    public final int read() {
        class259.method1790((byte) -88, 30000L);
        field2403++;
        return -1;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)Lqn;", line = 47)
    public static final class40 method1215(int arg0, int arg1) {
        field2399++;
        if (arg1 == 0) {
            return new class434();
        } else if (arg1 == 1) {
            return new class228();
        } else if (arg1 == 2) {
            return new class131();
        } else if (arg1 == 3) {
            return new class445();
        } else if (arg1 == 4) {
            return new class449();
        } else if (arg1 == 5) {
            return new class25();
        } else if (arg1 == 6) {
            return new class421();
        } else if (arg1 == 7) {
            return new class369();
        } else if (arg1 == 8) {
            return new class62();
        } else if (arg1 == 9) {
            return new class333();
        } else if (arg1 == 10) {
            return new class240();
        } else if (arg1 == 11) {
            return new class440();
        } else if (arg1 == 12) {
            return new class285();
        } else if (arg1 == 13) {
            return new class46();
        } else if (arg1 == 14) {
            return new class414();
        } else if (arg1 == 15) {
            return new class373();
        } else if (arg1 == 16) {
            return new class246();
        } else if (arg1 == 17) {
            return new class439();
        } else if (arg1 == 18) {
            return new class262();
        } else if (arg1 == 19) {
            return new class317();
        } else if (arg1 == 20) {
            return new class44();
        } else if (arg1 == 21) {
            return new class420();
        } else if (arg1 == 22) {
            return new class392();
        } else if (arg1 == 23) {
            return new class376();
        } else if (arg1 == 24) {
            return new class162();
        } else if (arg1 == 25) {
            return new class58();
        } else if (arg1 == 26) {
            return new class10();
        } else if (arg1 == 27) {
            return new class8();
        } else if (arg1 == 28) {
            return new class374();
        } else if (arg1 == 29) {
            return new class20();
        } else if (arg1 == 30) {
            return new class393();
        } else if (arg1 == 31) {
            return new class185();
        } else if (arg1 == 32) {
            return new class340();
        } else if (arg1 == 33) {
            return new class212();
        } else if (arg1 == 34) {
            return new class32();
        } else if (arg1 == 35) {
            return new class265();
        } else if (arg1 == 36) {
            return new class68();
        } else if (arg1 == 37) {
            return new class52();
        } else if (arg1 == 38) {
            return new class181();
        } else if (arg1 == 39) {
            return new class232();
        } else {
            if (arg0 != -5) {
                method1217((byte) -65, false, -2, 0);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BIIIII)V", line = 370)
    public static final void method1216(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2402++;
        int var6 = arg5 - arg4;
        int var7 = arg3 - arg1;
        if (var6 == 0) {
            if (var7 != 0) {
                class447.method2787(arg1, (byte) -61, arg3, arg4, arg2);
            }
        } else if (var7 == 0) {
            class446.method2785(arg2, arg5, arg1, arg4, (byte) -67);
        } else {
            if (arg0 > -21) {
                field2401 = -80;
            }
            int var8 = (var7 << 12) / var6;
            int var9 = arg1 - (arg4 * var8 >> 12);
            int var10;
            int var11;
            if (arg5 < class408.field5789) {
                var10 = var9 + (class408.field5789 * var8 >> 12);
                var11 = class408.field5789;
            } else if (arg5 > class231.field3415) {
                var10 = var9 + (class231.field3415 * var8 >> 12);
                var11 = class231.field3415;
            } else {
                var10 = arg3;
                var11 = arg5;
            }
            int var12;
            int var13;
            if (arg4 < class408.field5789) {
                var12 = class408.field5789;
                var13 = (class408.field5789 * var8 >> 12) + var9;
            } else if (class231.field3415 < arg4) {
                var13 = (class231.field3415 * var8 >> 12) + var9;
                var12 = class231.field3415;
            } else {
                var12 = arg4;
                var13 = arg1;
            }
            if (class245.field3659 > var10) {
                var11 = (class245.field3659 - var9 << 12) / var8;
                var10 = class245.field3659;
            } else if (class240.field3547 < var10) {
                var11 = (class240.field3547 - var9 << 12) / var8;
                var10 = class240.field3547;
            }
            if (class245.field3659 > var13) {
                var12 = (class245.field3659 - var9 << 12) / var8;
                var13 = class245.field3659;
            } else if (class240.field3547 < var13) {
                var13 = class240.field3547;
                var12 = (class240.field3547 - var9 << 12) / var8;
            }
            class417.method2630(var10, var13, var12, arg2, var11, (byte) 32);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BZII)I", line = 478)
    public static final int method1217(byte arg0, boolean arg1, int arg2, int arg3) {
        field2400++;
        if (arg0 != -68) {
            field2406 = null;
        }
        class101 var4 = class438.method2729(arg1, arg2, true);
        if (var4 == null) {
            return 0;
        } else if (arg3 == -1) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field1280.length; var6++) {
                if (var4.field1277[var6] == arg3) {
                    var5 += var4.field1280[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lbr;I)Ljava/lang/String;", line = 516)
    public static final String method1218(class223 arg0, int arg1) {
        field2405++;
        if (client.method1168(arg0).method488(2) == 0) {
            return null;
        } else if (arg0.field3245 == null || arg0.field3245.trim().length() == 0) {
            return class450.field6455 ? "Hidden-use" : null;
        } else {
            if (arg1 != 21) {
                field2407 = 50;
            }
            return arg0.field3245;
        }
    }
}
