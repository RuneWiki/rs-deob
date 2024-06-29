import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class72 {

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public static int field1129 = 0;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1130 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public static int field1131 = 0;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "Lma;")
    public static class5 field1135 = class12.method119("hint_mapedge", (byte) 106);

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "Lma;")
    private static class5 field1137 = class12.method119("Unable to find ", (byte) 57);

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "Lma;")
    public static class5 field1136 = field1137;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "Lnd;")
    public static class216 field1133;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "Lfl;")
    public static class299 field1127;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "[[I")
    public static int[][] field1134;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V", line = 8)
    public static void method510(byte arg0) {
        field1135 = null;
        if (arg0 != 123) {
            return;
        }
        field1133 = null;
        field1136 = null;
        field1134 = (int[][]) null;
        field1127 = null;
        field1130 = null;
        field1137 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([IIJI)Lma;", line = 24)
    public static final class5 method511(int[] arg0, int arg1, long arg2, int arg3) {
        field1128++;
        if (arg3 != 4) {
            return (class5) null;
        }
        if (class196.field3125 != null) {
            class5 var5 = class196.field3125.method455(-92, arg1, arg2, arg0);
            if (var5 != null) {
                return var5;
            }
        }
        return arg1 == 5 ? class245.method1719(arg2, (byte) -45).method30(-95) : class236.method1671(-61, arg2);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZIIIIILeb;)V", line = 58)
    public static final void method512(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class253 arg7) {
        field1124++;
        if (class147.field2139) {
            class246.field4085 = 32;
        } else {
            class246.field4085 = 0;
        }
        class147.field2139 = arg1;
        if (class122.field1844 != 0) {
            if (arg6 >= arg0 && arg6 < (arg0 + 16) && arg4 <= arg3 && arg4 + 16 > arg3) {
                arg7.field4243 -= 4;
                class29.method205(arg7, (byte) 103);
            } else if (arg0 <= arg6 && arg6 < arg0 + 16 && (arg4 - (16 - arg2)) <= arg3 && (arg2 + arg4) > arg3) {
                arg7.field4243 += 4;
                class29.method205(arg7, (byte) 95);
            } else if (arg6 >= arg0 - class246.field4085 && arg6 < (class246.field4085 + arg0 + 16) && arg3 >= (arg4 + 16) && (arg4 + arg2 - 16) > arg3) {
                int var8 = (arg2 - 32) * arg2 / arg5;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg2 - var8 - 32;
                int var10 = arg3 - arg4 - (var8 / 2) - 16;
                arg7.field4243 = (arg5 - arg2) * var10 / var9;
                class29.method205(arg7, (byte) 111);
                class147.field2139 = true;
            }
        }
        if (class65.field1025 == 0) {
            return;
        }
        int var11 = arg7.field4228;
        if (arg0 - var11 <= arg6 && arg3 >= arg4 && arg0 + 16 > arg6 && arg3 <= (arg2 + arg4)) {
            arg7.field4243 += class65.field1025 * 45;
            class29.method205(arg7, (byte) 101);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BI)I", line = 145)
    public static final int method513(byte arg0, int arg1) {
        double var2 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        field1125++;
        double var4 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var6 = var2;
        int var8 = 21 % ((arg0 - 47) / 55);
        double var9 = (double) (arg1 & 0xFF) / 256.0D;
        double var11 = 0.0D;
        double var13 = 0.0D;
        double var15 = var2;
        if (var4 < var2) {
            var6 = var4;
        }
        if (var9 < var6) {
            var6 = var9;
        }
        if (var4 > var2) {
            var15 = var4;
        }
        if (var9 > var15) {
            var15 = var9;
        }
        double var17 = (var6 + var15) / 2.0D;
        int var19 = (int) (var17 * 256.0D);
        if (var19 < 0) {
            var19 = 0;
        } else if (var19 > 255) {
            var19 = 255;
        }
        if (var6 != var15) {
            if (var2 == var15) {
                var11 = (var4 - var9) / (var15 - var6);
            } else if (var4 == var15) {
                var11 = (var9 - var2) / (var15 - var6) + 2.0D;
            } else if (var9 == var15) {
                var11 = (var2 - var4) / (var15 - var6) + 4.0D;
            }
            if (var17 < 0.5D) {
                var13 = (var15 - var6) / (var6 + var15);
            }
            if (var17 >= 0.5D) {
                var13 = (var15 - var6) / (2.0D - var15 - var6);
            }
        }
        int var20 = (int) (var13 * 256.0D);
        double var21 = var11 / 6.0D;
        if (var20 < 0) {
            var20 = 0;
        } else if (var20 > 255) {
            var20 = 255;
        }
        int var23 = (int) (var21 * 256.0D);
        if (var19 > 243) {
            var20 >>= 0x4;
        } else if (var19 > 217) {
            var20 >>= 0x3;
        } else if (var19 > 192) {
            var20 >>= 0x2;
        } else if (var19 > 179) {
            var20 >>= 0x1;
        }
        return (var19 >> 1) + ((var23 >> 2 << 10) + (var20 >> 5 << 7));
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)V", line = 246)
    public static final void method514(byte arg0) {
        class287.field4838 = 0;
        class168.field2554 = 0;
        field1123++;
        if (arg0 <= 59) {
            method510((byte) 45);
        }
        class118.method791(-26);
        class49.method363((byte) -24);
        class261.method1808((byte) -62);
        class282.method1908(0);
        for (int var1 = 0; var1 < class168.field2554; var1++) {
            int var2 = class249.field4128[var1];
            if (class50.field784 != class267.field4593[var2].field217) {
                if (class267.field4593[var2].field1362 > 0) {
                    class289.method1954(128, class267.field4593[var2]);
                }
                class267.field4593[var2] = null;
            }
        }
        if (class171.field2625 != class200.field3184.field3610) {
            throw new RuntimeException("gpp1 pos:" + class200.field3184.field3610 + " psize:" + class171.field2625);
        }
        for (int var3 = 0; var3 < class175.field2675; var3++) {
            if (class267.field4593[class118.field1785[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class175.field2675);
            }
        }
    }
}
