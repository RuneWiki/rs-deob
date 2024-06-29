import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class3 extends InputStream {

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "Z")
    public static boolean field16 = false;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "Ljava/lang/String;")
    public static String field20 = "Connection lost.";

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "[J")
    public static long[] field21 = new long[32];

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field19;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qd", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field22;

    // $FF: synthetic method
    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method15(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!qd", name = "read", descriptor = "()I", line = 6)
    public final int read() {
        class229.method1541(57, 30000L);
        field18++;
        return -1;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V", line = 18)
    public static void method11(int arg0) {
        field21 = null;
        field20 = null;
        if (arg0 > -20) {
            field14 = 91;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIBIII)I", line = 31)
    public static final int method12(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg2 != -6) {
            field20 = null;
        }
        field17++;
        if (class91.field1351 == null) {
            return 0;
        }
        if (arg0 < 3) {
            int var6 = arg4 >> 7;
            int var7 = arg5 >> 7;
            if (arg3 < 0 || arg1 < 0 || arg3 > class116.field1621 - 1 || class385.field5425 - 1 < arg1) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || var6 > class116.field1621 - 1 || var7 > (class385.field5425 - 1)) {
                return 0;
            }
            boolean var8 = (class7.field57[1][arg4 >> 7][arg5 >> 7] & 0x2) != 0;
            if ((arg4 & 0x7F) == 0) {
                boolean var9 = (class7.field57[1][var6 - 1][arg5 >> 7] & 0x2) != 0;
                boolean var10 = (class7.field57[1][var6][arg5 >> 7] & 0x2) != 0;
                if (var10 != var9) {
                    var8 = (class7.field57[1][arg3][arg1] & 0x2) != 0;
                }
            }
            if ((arg5 & 0x7F) == 0) {
                boolean var11 = (class7.field57[1][arg4 >> 7][var7 - 1] & 0x2) != 0;
                boolean var12 = (class7.field57[1][arg4 >> 7][var7] & 0x2) != 0;
                if (var12 != var11) {
                    var8 = (class7.field57[1][arg3][arg1] & 0x2) != 0;
                }
            }
            if (var8) {
                arg0++;
            }
        }
        return class91.field1351[arg0].method1515(arg4, arg5);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IJ)V", line = 96)
    public static final void method13(int arg0, long arg1) {
        field15++;
        int var3 = class267.field3598;
        int var4 = class325.field4411;
        if (class241.field3334 != var3) {
            int var5 = var3 - class241.field3334;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var6 < var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var6 > var5) {
                var6 = var5;
            }
            class241.field3334 += var6;
        }
        if (!class100.field1443) {
            class313.field4229 += (float) arg1 * class170.field2515 / 40.0F * 8.0F;
            class47.field810 += (float) arg1 * class150.field2292 / 40.0F * 8.0F;
        }
        if (class153.field2327 != var4) {
            int var7 = var4 - class153.field2327;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var7 < var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var8 < var7) {
                var8 = var7;
            }
            class153.field2327 += var8;
        }
        class314.method1997(-29452);
        if (arg0 != 18423) {
            field14 = 111;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILom;)V", line = 182)
    public static final void method14(int arg0, class128 arg1) {
        field19++;
        if (class118.field1653 == null) {
            return;
        }
        class111 var2 = null;
        if (arg0 < 38) {
            return;
        }
        if (arg1.field1819 == 0) {
            var2 = (class111) class194.method1394(arg1.field1808, arg1.field1827, arg1.field1816);
        }
        if (arg1.field1819 == 1) {
            var2 = (class111) class434.method2691(arg1.field1808, arg1.field1827, arg1.field1816);
        }
        if (arg1.field1819 == 2) {
            var2 = (class111) class95.method815(arg1.field1808, arg1.field1827, arg1.field1816, field22 == null ? (field22 = method15("gd")) : field22);
        }
        if (arg1.field1819 == 3) {
            var2 = (class111) class314.method2001(arg1.field1808, arg1.field1827, arg1.field1816);
        }
        if (var2 == null) {
            arg1.field1803 = 0;
            arg1.field1809 = 0;
            arg1.field1823 = -1;
        } else {
            arg1.field1823 = var2.method582((byte) 22);
            arg1.field1803 = var2.method575(-15863);
            arg1.field1809 = var2.method580(24493);
        }
    }
}
