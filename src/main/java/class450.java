import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class450 extends class9 {

    @OriginalMember(owner = "client!iba", name = "x", descriptor = "I")
    public static int field6228 = -1;

    @OriginalMember(owner = "client!iba", name = "H", descriptor = "I")
    public static int field6237 = 0;

    @OriginalMember(owner = "client!iba", name = "F", descriptor = "[Lsba;")
    public static class183[] field6235 = new class183[14];

    @OriginalMember(owner = "client!iba", name = "w", descriptor = "I")
    public static int field6227;

    @OriginalMember(owner = "client!iba", name = "y", descriptor = "I")
    public static int field6229;

    @OriginalMember(owner = "client!iba", name = "A", descriptor = "I")
    public static int field6231;

    @OriginalMember(owner = "client!iba", name = "G", descriptor = "I")
    public static int field6236;

    @OriginalMember(owner = "client!iba", name = "I", descriptor = "I")
    public static int field6238;

    @OriginalMember(owner = "client!iba", name = "J", descriptor = "I")
    public static int field6239;

    @OriginalMember(owner = "client!iba", name = "K", descriptor = "I")
    public static int field6240;

    @OriginalMember(owner = "client!iba", name = "E", descriptor = "Lmv;")
    public static class313 field6234;

    @OriginalMember(owner = "client!iba", name = "C", descriptor = "Lpt;")
    private class451 field6232;

    @OriginalMember(owner = "client!iba", name = "D", descriptor = "Lbl;")
    public static class554 field6233;

    @OriginalMember(owner = "client!iba", name = "z", descriptor = "[S")
    public static short[] field6230;

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "(III)I", line = 4)
    public final int method2630(int arg0, int arg1, int arg2) {
        field6238++;
        if (this.field6232 == null) {
            return arg2;
        }
        class171 var4 = (class171) this.field6232.method2645((long) arg1, (byte) -103);
        if (var4 == null) {
            return arg2;
        } else {
            if (arg0 != 20349) {
                method2631(-78, 112, true);
            }
            return var4.field2081;
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(IIZ)V", line = 25)
    public static final void method2631(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field6233 = null;
        }
        class62.field619 = arg1 - class353.field4607;
        class43.field353 = arg0 - class353.field4621;
        field6240++;
    }

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "(I)V", line = 39)
    public static void method2632(int arg0) {
        if (arg0 == 0) {
            field6230 = null;
            field6234 = null;
            field6235 = null;
            field6233 = null;
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;", line = 52)
    public final String method2633(String arg0, int arg1, int arg2) {
        if (arg1 >= -55) {
            return null;
        }
        field6239++;
        if (this.field6232 == null) {
            return arg0;
        } else {
            class646 var4 = (class646) this.field6232.method2645((long) arg2, (byte) -117);
            return var4 == null ? arg0 : var4.field9396;
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILvp;)I", line = 93)
    public static final int method2634(int arg0, class160 arg1) {
        field6229++;
        if (arg0 != 5122) {
            field6228 = -96;
        }
        if (class160.field1923 == arg1) {
            return 5120;
        } else if (class160.field1929 == arg1) {
            return 5122;
        } else if (class160.field1931 == arg1) {
            return 5124;
        } else if (class160.field1932 == arg1) {
            return 5121;
        } else if (class160.field1933 == arg1) {
            return 5123;
        } else if (class160.field1934 == arg1) {
            return 5125;
        } else if (class160.field1935 == arg1) {
            return 5131;
        } else if (class160.field1936 == arg1) {
            return 5126;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILos;I)V", line = 136)
    private final void method2635(int arg0, class374 arg1, int arg2) {
        if (arg2 == 249) {
            int var4 = arg1.method2129(-77);
            if (this.field6232 == null) {
                int var5 = class129.method731(var4, -27265);
                this.field6232 = new class451(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg1.method2129(-127) == 1;
                int var8 = arg1.method2128(true);
                class544 var9;
                if (var7) {
                    var9 = new class646(arg1.method2133(false));
                } else {
                    var9 = new class171(arg1.method2123(false));
                }
                this.field6232.method2640(1, (long) var8, var9);
            }
        }
        if (arg0 != 14) {
            method2636(86, 126, 58, 48, -2);
        }
        field6227++;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(IIIII)V", line = 181)
    public static final void method2636(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg3; var5 < class315.field4023; var5++) {
            Rectangle var6 = class250.field3224[var5];
            if (arg4 < var6.x + var6.width && var6.x < arg2 + arg4 && (var6.y + var6.height) > arg1 && (arg0 + arg1) > var6.y) {
                class371.field4888[var5] = true;
            }
        }
        field6236++;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(BLos;)V", line = 202)
    public final void method2637(byte arg0, class374 arg1) {
        if (arg0 < 61) {
            field6228 = 56;
        }
        field6231++;
        while (true) {
            int var3 = arg1.method2129(-67);
            if (var3 == 0) {
                return;
            }
            this.method2635(14, arg1, var3);
        }
    }
}
