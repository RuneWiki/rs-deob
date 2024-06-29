import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class23 extends class287 {

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "I")
    public int field350;

    @OriginalMember(owner = "client!dm", name = "t", descriptor = "I")
    public int field356;

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field351 = new CRC32();

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "[J")
    public static long[] field352 = new long[200];

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!dm", name = "s", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!dm", name = "r", descriptor = "Lug;")
    public static class253 field354;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IZ)V", line = 4)
    public static final void method224(int arg0, boolean arg1) {
        field353++;
        class62.field913.method1353(-1, arg0);
        if (arg1) {
            field352 = (long[]) null;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZLcd;)Z", line = 16)
    public static final boolean method225(boolean arg0, class136 arg1) {
        if (arg0) {
            field354 = (class253) null;
        }
        field349++;
        if (arg1.field2038 == 205) {
            class258.field4072 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)V", line = 39)
    public static final void method226(boolean arg0) {
        if (!arg0) {
            field352 = (long[]) null;
        }
        class197 var1 = (class197) class68.field959.method22((byte) 118);
        field355++;
        while (var1 != null) {
            if (var1.field3142 > 0) {
                var1.field3142--;
            }
            if (var1.field3142 != 0) {
                if (var1.field3153 > 0) {
                    var1.field3153--;
                }
                if (var1.field3153 == 0 && var1.field3158 >= 1 && var1.field3149 >= 1 && var1.field3158 <= 102 && var1.field3149 <= 102 && (var1.field3152 < 0 || class77.method577((byte) 24, var1.field3144, var1.field3152))) {
                    class117.method828(var1.field3149, var1.field3144, (byte) -117, var1.field3152, var1.field3147, var1.field3158, var1.field3155, var1.field3148);
                    var1.field3153 = -1;
                    if (var1.field3152 == var1.field3150 && var1.field3150 == -1) {
                        var1.method2028(13329);
                    } else if (var1.field3152 == var1.field3150 && var1.field3148 == var1.field3141 && var1.field3144 == var1.field3143) {
                        var1.method2028(13329);
                    }
                }
            } else if (var1.field3150 < 0 || class77.method577((byte) 24, var1.field3143, var1.field3150)) {
                class117.method828(var1.field3149, var1.field3143, (byte) -124, var1.field3150, var1.field3147, var1.field3158, var1.field3155, var1.field3141);
                var1.method2028(13329);
            }
            var1 = (class197) class68.field959.method26((byte) -121);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZLnn;IILnn;)I", line = 96)
    public static final int method227(boolean arg0, class187 arg1, int arg2, int arg3, class187 arg4) {
        field348++;
        if (arg2 == arg3) {
            int var5 = arg1.field1215;
            int var6 = arg4.field1215;
            if (!arg0) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg2 == 2) {
            return class308.method2128(arg1.method1374(0).field957, 0, arg4.method1374(0).field957, class141.field2240);
        } else if (arg2 == 3) {
            if (arg1.field3012.equals("-")) {
                if (arg4.field3012.equals("-")) {
                    return 0;
                } else if (arg0) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg4.field3012.equals("-")) {
                return arg0 ? 1 : -1;
            } else {
                return class308.method2128(arg1.field3012, 0, arg4.field3012, class141.field2240);
            }
        } else if (arg2 == 4) {
            return arg1.method666((byte) 120) ? (arg4.method666((byte) 120) ? 0 : 1) : (arg4.method666((byte) 120) ? -1 : 0);
        } else if (arg2 == 5) {
            return arg1.method659(-101) ? (arg4.method659(-83) ? 0 : 1) : (arg4.method659(-66) ? -1 : 0);
        } else if (arg2 == 6) {
            return arg1.method665(30171) ? (arg4.method665(30171) ? 0 : 1) : (arg4.method665(arg3 + 30170) ? -1 : 0);
        } else if (arg2 == 7) {
            return arg1.method664((byte) -70) ? (arg4.method664((byte) -70) ? 0 : 1) : (arg4.method664((byte) -70) ? -1 : 0);
        } else {
            return arg1.field3009 - arg4.field3009;
        }
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(I)V", line = 159)
    public static void method228(int arg0) {
        field351 = null;
        field354 = null;
        field352 = null;
        if (arg0 != -1) {
            method224(-120, false);
        }
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(II)V", line = 183)
    public class23(int arg0, int arg1) {
        this.field350 = arg0;
        this.field356 = arg1;
    }
}
