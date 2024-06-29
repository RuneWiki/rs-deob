import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class8 {

    @OriginalMember(owner = "client!ba", name = "C", descriptor = "I")
    private int field172 = 0;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "[Lg;")
    private class37[] field151;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    private int field152;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field145 = 0;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "Z")
    public static boolean field160 = false;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    public static int field155 = 255;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "B")
    public static byte field158 = 0;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "Lo;")
    public static class84 field156 = class15.method124("Enter amount:", 255);

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "Lo;")
    public static class84 field164 = class15.method124(")3)3)3", 255);

    @OriginalMember(owner = "client!ba", name = "A", descriptor = "[B")
    public static byte[] field170 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "Z")
    public static boolean field159 = false;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "J")
    private long field167;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "Lg;")
    private class37 field161;

    @OriginalMember(owner = "client!ba", name = "B", descriptor = "Lg;")
    private class37 field171;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "Lp;")
    public static class89 field147;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)Lg;", line = 14)
    public final class37 method58(int arg0) {
        field153++;
        if (this.field161 == null) {
            return null;
        }
        class37 var2 = this.field151[(int) (this.field167 & (long) (this.field152 + arg0))];
        while (this.field161 != var2) {
            if (this.field161.field731 == this.field167) {
                class37 var3 = this.field161;
                this.field161 = this.field161.field733;
                return var3;
            }
            this.field161 = this.field161.field733;
        }
        this.field161 = null;
        return null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V", line = 42)
    public static final void method59(byte arg0) {
        if (arg0 != 3) {
            return;
        }
        if (class97.field2071 != null) {
            class97.field2071.method405();
            class97.field2071 = null;
        }
        field154++;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)Lg;", line = 59)
    public final class37 method60(byte arg0) {
        this.field172 = 0;
        field148++;
        if (arg0 >= -73) {
            method65(false, -24, 2, -91);
        }
        return this.method69(true);
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)Ljava/awt/Component;", line = 71)
    public static final Component method61(int arg0) {
        if (arg0 >= -92) {
            field164 = null;
        }
        field168++;
        if (class126.field2795 == null) {
            return class118.field2627 == null ? null : class118.field2627.field187;
        } else {
            return class126.field2795;
        }
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)V", line = 94)
    public static final void method62(int arg0) {
        field166++;
        if (class122.field2730 == 0) {
            return;
        }
        class34 var1 = class123.field2762;
        int var2 = 0;
        if (class103.field2169 != 0) {
            var2 = 1;
        }
        if (arg0 != 4) {
            field164 = null;
        }
        for (int var3 = 0; var3 < 100; var3++) {
            if (class75.field1597[var3] != null) {
                int var4 = class89.field2007[var3];
                class84 var5 = class127.field2803[var3];
                byte var6 = 0;
                if (var5 != null && var5.method638(class49.field1067, 98)) {
                    var6 = 1;
                    var5 = var5.method655(arg0 + 28414, 5);
                }
                if (var5 != null && var5.method638(class111.field2412, 87)) {
                    var6 = 2;
                    var5 = var5.method655(arg0 + 28414, 5);
                }
                if ((var4 == 3 || var4 == 7) && (var4 == 7 || class125.field2771 == 0 || class125.field2771 == 1 && class45.method394(var5, -20281))) {
                    int var7 = 329 - var2 * 13;
                    var2++;
                    byte var8 = 4;
                    var1.method320(class54.field1127, var8, var7, 0);
                    var1.method320(class54.field1127, var8, var7 - 1, 65535);
                    int var9 = var8 + var1.method313(class100.field2123);
                    if (var6 == 1) {
                        class82.field1770[0].method732(var9, var7 - 12);
                        var9 += 14;
                    }
                    if (var6 == 2) {
                        class82.field1770[1].method732(var9, var7 - 12);
                        var9 += 14;
                    }
                    var1.method320(class97.method746(arg0 ^ 0x4, new class84[] { var5, class1.field26, class75.field1597[var3] }), var9, var7, 0);
                    var1.method320(class97.method746(0, new class84[] { var5, class1.field26, class75.field1597[var3] }), var9, var7 - 1, 65535);
                    if (var2 >= 5) {
                        return;
                    }
                }
                if (var4 == 5 && class125.field2771 < 2) {
                    int var10 = 329 - var2 * 13;
                    var2++;
                    var1.method320(class75.field1597[var3], 4, var10, 0);
                    var1.method320(class75.field1597[var3], 4, var10 - 1, 65535);
                    if (var2 >= 5) {
                        return;
                    }
                }
                if (var4 == 6 && class125.field2771 < 2) {
                    int var11 = 329 - var2 * 13;
                    var1.method320(class97.method746(arg0 - 4, new class84[] { class119.field2649, var5, class1.field26, class75.field1597[var3] }), 4, var11, 0);
                    var1.method320(class97.method746(arg0 - 4, new class84[] { class119.field2649, var5, class1.field26, class75.field1597[var3] }), 4, var11 - 1, 65535);
                    var2++;
                    if (var2 >= 5) {
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZ)V", line = 233)
    public static final void method63(int arg0, boolean arg1) {
        field165++;
        if (class51.field1088 == arg0) {
            return;
        }
        if (class51.field1088 == 0) {
            class54.method455(true);
        }
        if (arg0 == 20 || arg0 == 40) {
            class78.field1651 = 0;
            class105.field2236 = 0;
            class33.field662 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && class42.field862 != null) {
            class42.field862.method395(-9098);
        }
        if (class51.field1088 == 25 || class51.field1088 == 40) {
            class88.method701(25085);
            class32.method288();
        }
        if (class51.field1088 == 25) {
            class40.field815 = 1;
            class79.field1675 = 0;
            class80.field1698 = 0;
            class55.field1135 = 1;
            class51.field1099 = 0;
        }
        if (arg0 == 0 || arg0 == 35) {
            class3.method8(true);
            class14.method119(10);
            if (class35.field696 == null) {
                class35.field696 = class101.method763(765, method61(-96), -8, 503);
            }
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            class35.field696 = null;
            class3.method8(true);
            class17.method142(class100.field2122, method61(-127), class99.field2108, (byte) -75);
        }
        if (arg1) {
            field164 = null;
        }
        if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
            class35.field696 = null;
            class14.method119(10);
            class69.method522(class100.field2122, 23589, method61(-128));
        }
        class51.field1088 = arg0;
        class1.field5 = true;
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(B)V", line = 313)
    public static final void method64(byte arg0) {
        field169++;
        if (arg0 != 84) {
            method59((byte) -61);
        }
        class108.field2302 = false;
        class1.field23 = false;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZIII)I", line = 334)
    public static final int method65(boolean arg0, int arg1, int arg2, int arg3) {
        field150++;
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            if (!arg0) {
                method63(-26, false);
            }
            return arg3;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IJ)Lg;", line = 360)
    public final class37 method66(int arg0, long arg1) {
        this.field167 = arg1;
        field162++;
        if (arg0 <= 119) {
            field160 = false;
        }
        class37 var4 = this.field151[(int) ((long) (this.field152 - 1) & arg1)];
        for (this.field161 = var4.field733; this.field161 != var4; this.field161 = this.field161.field733) {
            if (this.field161.field731 == arg1) {
                class37 var5 = this.field161;
                this.field161 = this.field161.field733;
                return var5;
            }
        }
        this.field161 = null;
        return null;
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(B)V", line = 389)
    public static void method67(byte arg0) {
        field170 = null;
        int var1 = 11 / ((arg0 - 84) / 32);
        field156 = null;
        field164 = null;
        field147 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILeb;)Lo;", line = 401)
    public static final class84 method68(int arg0, class27 arg1) {
        if (arg0 >= -4) {
            field156 = null;
        }
        field163++;
        return class21.method171((byte) 40, arg1, 32767);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)Lg;", line = 416)
    private final class37 method69(boolean arg0) {
        if (!arg0) {
            field145 = 15;
        }
        field149++;
        if (this.field172 > 0 && this.field151[this.field172 - 1] != this.field171) {
            class37 var2 = this.field171;
            this.field171 = var2.field733;
            return var2;
        }
        while (this.field172 < this.field152) {
            class37 var3 = this.field151[this.field172++].field733;
            if (this.field151[this.field172 - 1] != var3) {
                this.field171 = var3.field733;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILud;II)[Lqb;", line = 454)
    public static final class96[] method70(int arg0, class118 arg1, int arg2, int arg3) {
        field144++;
        if (arg3 <= 38) {
            return null;
        } else if (class111.method863(arg0, -29446, arg1, arg2)) {
            return class115.method889(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILg;J)V", line = 469)
    public final void method71(int arg0, class37 arg1, long arg2) {
        if (arg1.field726 != null) {
            arg1.method333(0);
        }
        field157++;
        class37 var5 = this.field151[(int) ((long) (this.field152 - 1) & arg2)];
        if (arg0 < 120) {
            method64((byte) -3);
        }
        arg1.field731 = arg2;
        arg1.field733 = var5;
        arg1.field726 = var5.field726;
        arg1.field726.field733 = arg1;
        arg1.field733.field726 = arg1;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIII)V", line = 522)
    public static final void method72(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field146++;
        if (arg2 != 20318) {
            return;
        }
        for (int var5 = arg3; var5 <= arg0 + arg3; var5++) {
            for (int var6 = arg4; var6 <= arg4 + arg1; var6++) {
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    class71.field1495[0][var6][var5] = 127;
                    if (arg4 == var6 && var6 > 0) {
                        class110.field2377[0][var6][var5] = class110.field2377[0][var6 - 1][var5];
                    }
                    if (arg1 + arg4 == var6 && var6 < 103) {
                        class110.field2377[0][var6][var5] = class110.field2377[0][var6 + 1][var5];
                    }
                    if (arg3 == var5 && var5 > 0) {
                        class110.field2377[0][var6][var5] = class110.field2377[0][var6][var5 - 1];
                    }
                    if (arg0 + arg3 == var5 && var5 < 103) {
                        class110.field2377[0][var6][var5] = class110.field2377[0][var6][var5 + 1];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(I)V", line = 570)
    public class8(int arg0) {
        this.field151 = new class37[arg0];
        this.field152 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class37 var3 = this.field151[var2] = new class37();
            var3.field733 = var3;
            var3.field726 = var3;
        }
    }
}
