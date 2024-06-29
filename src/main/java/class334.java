import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class334 extends class179 {

    @OriginalMember(owner = "client!od", name = "o", descriptor = "I")
    public int field4985 = -1;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "Z")
    public boolean field4984 = false;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "[C")
    public static char[] field4986 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!od", name = "u", descriptor = "Lsk;")
    public static class423 field4991 = new class423(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public int field4980;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "I")
    public static int field4981;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    public int field4982;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public int field4983;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "I")
    public int field4989;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!od", name = "w", descriptor = "I")
    public int field4993;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)V", line = 6)
    public static final void method2071(int arg0, String arg1, int arg2, String arg3) {
        class305.field4633 = arg3;
        class358.field5303 = arg1;
        field4992++;
        class243.field3656 = arg2;
        if (class358.field5303.equals("") || class305.field4633.equals("")) {
            class211.field3282 = 3;
        } else if (class167.field2593 == -1) {
            class41.field601 = 1;
            class211.field3282 = -3;
            class246.field3760 = 0;
            class91.field1642 = 0;
            class40 var4 = new class40(128);
            var4.method221(-1, 10);
            var4.method253(-115, (int) (Math.random() * 9.9999999E7D));
            var4.method261((byte) 60, class212.method1305(false, class358.field5303));
            var4.method253(-94, (int) (Math.random() * 9.9999999E7D));
            var4.method240(class305.field4633, 126);
            var4.method253(-77, (int) (Math.random() * 9.9999999E7D));
            var4.method233(class295.field4486, (byte) 126, class378.field5534);
            class230.field3508.field585 = 0;
            class230.field3508.method221(-1, class247.field3796.field3849);
            class230.field3508.method221(-1, var4.field585 + 2);
            class230.field3508.method246((byte) -81, 581);
            class230.field3508.method281(var4.field585, var4.field536, 0, 74);
            if (arg0 > -55) {
                field4986 = null;
            }
        } else {
            class99.method747(-114);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V", line = 54)
    public static void method2072(byte arg0) {
        field4991 = null;
        if (arg0 >= 107) {
            field4986 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(JI)V", line = 66)
    public static final void method2073(long arg0, int arg1) {
        if (class321.field4830 != null) {
            if (class408.field5928 == 1 || class408.field5928 == 5) {
                class315.method1882(arg1 + 39817, arg0);
            } else if (class408.field5928 == 4) {
                class387.method2306(0, arg0);
            }
        }
        field4987++;
        class296.method1796((long) class369.field5424, (byte) -13, class345.field5116);
        if (class375.field5475 != -1) {
            class388.method2307(class375.field5475, (byte) -119);
        }
        for (int var3 = 0; var3 < class413.field5993; var3++) {
            if (class77.field1376[var3]) {
                class400.field5832[var3] = true;
            }
            class78.field1386[var3] = class77.field1376[var3];
            class77.field1376[var3] = false;
        }
        class476.field7258 = class369.field5424;
        if (class345.field5116.method1893()) {
            class431.field6351 = true;
        }
        if (arg1 != -21448) {
            return;
        }
        if (class375.field5475 != -1) {
            class413.field5993 = 0;
            class197.method1222(arg1 + 5837);
        }
        class345.field5116.method1966();
        class244.method1468(true, class345.field5116);
        int var4 = class146.method957((byte) 46);
        if (var4 == -1) {
            var4 = client.field3001;
        }
        if (var4 == -1) {
            var4 = class392.field5740;
        }
        class349.method2128(var4, (byte) 12);
        class457.method2707(class115.field1951, class286.field4329.field3222, class286.field4329.field3217, class286.field4329.field3218, -126);
        class115.field1951 = 0;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IBII)I", line = 132)
    public static final int method2074(int arg0, byte arg1, int arg2, int arg3) {
        field4990++;
        if (class460.field7088 < 100) {
            return -2;
        }
        int var4 = -2;
        int var5 = Integer.MAX_VALUE;
        int var6 = arg0 - class492.field7497;
        int var7 = arg3 - class492.field7494;
        for (class334 var8 = (class334) class492.field7477.method8((byte) -98); var8 != null; var8 = (class334) class492.field7477.method17((byte) 107)) {
            if (var8.field4985 == arg2) {
                int var10 = var8.field4980;
                int var11 = var8.field4989;
                int var12 = class492.field7497 + var10 << 14 | var11 + class492.field7494;
                int var13 = (var7 - var11) * (var7 - var11) + (var6 - var10) * (var6 - var10);
                if (var4 < 0 || var5 > var13) {
                    var4 = var12;
                    var5 = var13;
                }
            }
        }
        int var9 = -91 / ((2 - arg1) / 32);
        return var4;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIIBIII)V", line = 181)
    public static final void method2075(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        if (arg6 > -27) {
            field4991 = null;
        }
        if (arg4 == arg7 && arg0 == arg9 && arg1 == arg8 && arg2 == arg5) {
            class187.method1159(293599692, arg7, arg5, arg1, arg3, arg9);
        } else {
            int var10 = arg7;
            int var11 = arg9;
            int var12 = arg7 * 3;
            int var13 = arg9 * 3;
            int var14 = arg4 * 3;
            int var15 = arg0 * 3;
            int var16 = arg8 * 3;
            int var17 = arg2 * 3;
            int var18 = arg1 + var14 - var16 - arg7;
            int var19 = arg5 - var17 - (-var15 + arg9);
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var13 + var17 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = arg7 + (var27 + var31 + var29 >> 12);
                int var34 = arg9 + (var28 - (-var30 - var32) >> 12);
                class187.method1159(293599692, var10, var34, var33, arg3, var11);
                var10 = var33;
                var11 = var34;
            }
        }
        field4981++;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Llt;B)V", line = 260)
    public static final void method2076(class458 arg0, byte arg1) {
        class467.field7166 = arg0;
        if (arg1 >= -26) {
            field4991 = null;
        }
        field4988++;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(I)V", line = 284)
    public class334(int arg0) {
        this.field4985 = arg0;
    }
}
