import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public abstract class class85 {

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "[I")
    public static int[] field1894 = new int[5];

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "Llc;")
    public static class69 field1904 = class69.method470((byte) -127, "Loading config )2 ");

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "Lpd;")
    public static class94 field1897 = new class94(new byte[5000]);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public int field1895;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public int field1905;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "Ljava/awt/Image;")
    public Image field1903;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "[I")
    public int[] field1907;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lkc;Lkc;ILkc;)V")
    public static final void method604(class63 arg0, class63 arg1, int arg2, class63 arg3) {
        field1902++;
        class119.field2548 = arg1;
        class3.field20 = arg3;
        if (arg2 != 3) {
            field1900 = 41;
        }
        class71.field1575 = arg0;
        class106.field2310 = new class9[class71.field1575.method405(121)][];
        class70.field1547 = new boolean[class71.field1575.method405(51)];
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public static final void method605(int arg0) {
        if (arg0 != -1) {
            method605(-86);
        }
        field1906++;
        for (class13 var1 = (class13) class75.field1689.method580((byte) 86); var1 != null; var1 = (class13) class75.field1689.method576((byte) 22)) {
            if (var1.field247 > 0) {
                var1.field247--;
            }
            if (var1.field247 != 0) {
                if (var1.field260 > 0) {
                    var1.field260--;
                }
                if (var1.field260 == 0 && var1.field242 >= 1 && var1.field250 >= 1 && var1.field242 <= 102 && var1.field250 <= 102 && (var1.field245 < 0 || class29.method188(var1.field245, var1.field241, 75))) {
                    class94.method714(var1.field246, var1.field241, var1.field242, var1.field250, var1.field243, (byte) 124, var1.field256, var1.field245);
                    var1.field260 = -1;
                    if (var1.field251 == var1.field245 && var1.field251 == -1) {
                        var1.method502(0);
                    } else if (var1.field251 == var1.field245 && var1.field255 == var1.field246 && var1.field248 == var1.field241) {
                        var1.method502(0);
                    }
                }
            } else if (var1.field251 < 0 || class29.method188(var1.field251, var1.field248, 111)) {
                class94.method714(var1.field255, var1.field248, var1.field242, var1.field250, var1.field243, (byte) -100, var1.field256, var1.field251);
                var1.method502(arg0 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public final void method606(int arg0) {
        field1899++;
        class95.method727(this.field1907, this.field1895, this.field1905);
        if (arg0 != -2) {
            field1900 = -108;
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
    public static void method607(int arg0) {
        field1904 = null;
        field1894 = null;
        field1897 = null;
        if (arg0 != -1) {
            field1904 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Graphics;IZI)V")
    public abstract void method69(Graphics arg0, int arg1, boolean arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Lsb;")
    public static final class107 method608(int arg0, int arg1) {
        field1898++;
        class107 var2 = (class107) class47.field985.method224((long) arg0, (byte) 125);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class106.field2302.method394(3, arg0, (byte) -29);
        class107 var4 = new class107();
        int var5 = 82 % ((arg1 + 44) / 43);
        if (var3 != null) {
            var4.method799(0, new class94(var3));
        }
        class47.field985.method221(var4, true, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZIIIIIIIII)Z")
    public static final boolean method609(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class94.field2063[var12][var36] = 0;
                class74.field1675[var12][var36] = 99999999;
            }
        }
        class94.field2063[arg7][arg6] = 99;
        class74.field1675[arg7][arg6] = 0;
        field1901++;
        int var13 = arg7;
        byte var14 = 0;
        int var15 = arg6;
        class73.field1632[var14] = arg7;
        int var37 = var14 + 1;
        class115.field2501[var14] = arg6;
        boolean var16 = false;
        int var17 = class73.field1632.length;
        int var18 = 0;
        int[][] var19 = class91.field1997[class71.field1588].field2662;
        while (var37 != var18) {
            var15 = class115.field2501[var18];
            var13 = class73.field1632[var18];
            var18 = (var18 + 1) % var17;
            if (arg11 == var13 && arg9 == var15) {
                var16 = true;
                break;
            }
            if (arg0 != 0) {
                if ((arg0 < 5 || arg0 == 10) && class91.field1997[class71.field1588].method912(false, arg0 - 1, arg11, arg9, arg1, var15, var13)) {
                    var16 = true;
                    break;
                }
                if (arg0 < 10 && class91.field1997[class71.field1588].method903(arg1, arg11, var15, var13, arg9, false, arg0 - 1)) {
                    var16 = true;
                    break;
                }
            }
            if (arg5 != 0 && arg4 != 0 && class91.field1997[class71.field1588].method904(arg11, arg9, arg3, var13, arg5, 1, arg4, var15)) {
                var16 = true;
                break;
            }
            int var35 = class74.field1675[var13][var15] + 1;
            if (var13 > 0 && class94.field2063[var13 - 1][var15] == 0 && (var19[var13 - 1][var15] & 0x1280108) == 0) {
                class73.field1632[var37] = var13 - 1;
                class115.field2501[var37] = var15;
                class94.field2063[var13 - 1][var15] = 2;
                var37 = (var37 + 1) % var17;
                class74.field1675[var13 - 1][var15] = var35;
            }
            if (var13 < 103 && class94.field2063[var13 + 1][var15] == 0 && (var19[var13 + 1][var15] & 0x1280180) == 0) {
                class73.field1632[var37] = var13 + 1;
                class115.field2501[var37] = var15;
                var37 = (var37 + 1) % var17;
                class94.field2063[var13 + 1][var15] = 8;
                class74.field1675[var13 + 1][var15] = var35;
            }
            if (var15 > 0 && class94.field2063[var13][var15 - 1] == 0 && (var19[var13][var15 - 1] & 0x1280102) == 0) {
                class73.field1632[var37] = var13;
                class115.field2501[var37] = var15 - 1;
                var37 = (var37 + 1) % var17;
                class94.field2063[var13][var15 - 1] = 1;
                class74.field1675[var13][var15 - 1] = var35;
            }
            if (var15 < 103 && class94.field2063[var13][var15 + 1] == 0 && (var19[var13][var15 + 1] & 0x1280120) == 0) {
                class73.field1632[var37] = var13;
                class115.field2501[var37] = var15 + 1;
                var37 = (var37 + 1) % var17;
                class94.field2063[var13][var15 + 1] = 4;
                class74.field1675[var13][var15 + 1] = var35;
            }
            if (var13 > 0 && var15 > 0 && class94.field2063[var13 - 1][var15 - 1] == 0 && (var19[var13 - 1][var15 - 1] & 0x128010E) == 0 && (var19[var13 - 1][var15] & 0x1280108) == 0 && (var19[var13][var15 - 1] & 0x1280102) == 0) {
                class73.field1632[var37] = var13 - 1;
                class115.field2501[var37] = var15 - 1;
                var37 = (var37 + 1) % var17;
                class94.field2063[var13 - 1][var15 - 1] = 3;
                class74.field1675[var13 - 1][var15 - 1] = var35;
            }
            if (var13 < 103 && var15 > 0 && class94.field2063[var13 + 1][var15 - 1] == 0 && (var19[var13 + 1][var15 - 1] & 0x1280183) == 0 && (var19[var13 + 1][var15] & 0x1280180) == 0 && (var19[var13][var15 - 1] & 0x1280102) == 0) {
                class73.field1632[var37] = var13 + 1;
                class115.field2501[var37] = var15 - 1;
                var37 = (var37 + 1) % var17;
                class94.field2063[var13 + 1][var15 - 1] = 9;
                class74.field1675[var13 + 1][var15 - 1] = var35;
            }
            if (var13 > 0 && var15 < 103 && class94.field2063[var13 - 1][var15 + 1] == 0 && (var19[var13 - 1][var15 + 1] & 0x1280138) == 0 && (var19[var13 - 1][var15] & 0x1280108) == 0 && (var19[var13][var15 + 1] & 0x1280120) == 0) {
                class73.field1632[var37] = var13 - 1;
                class115.field2501[var37] = var15 + 1;
                var37 = (var37 + 1) % var17;
                class94.field2063[var13 - 1][var15 + 1] = 6;
                class74.field1675[var13 - 1][var15 + 1] = var35;
            }
            if (var13 < 103 && var15 < 103 && class94.field2063[var13 + 1][var15 + 1] == 0 && (var19[var13 + 1][var15 + 1] & 0x12801E0) == 0 && (var19[var13 + 1][var15] & 0x1280180) == 0 && (var19[var13][var15 + 1] & 0x1280120) == 0) {
                class73.field1632[var37] = var13 + 1;
                class115.field2501[var37] = var15 + 1;
                class94.field2063[var13 + 1][var15 + 1] = 12;
                var37 = (var37 + 1) % var17;
                class74.field1675[var13 + 1][var15 + 1] = var35;
            }
        }
        class43.field857 = 0;
        if (!var16) {
            if (!arg2) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg11 - var22; var23 <= arg11 + var22; var23++) {
                for (int var24 = arg9 - var22; var24 <= arg9 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class74.field1675[var23][var24] < 100) {
                        int var25 = 0;
                        int var26 = 0;
                        if (arg9 > var24) {
                            var26 = arg9 - var24;
                        } else if (arg9 + arg4 - 1 < var24) {
                            var26 = var24 + 1 - arg4 - arg9;
                        }
                        if (arg11 > var23) {
                            var25 = arg11 - var23;
                        } else if (arg5 + arg11 - 1 < var23) {
                            var25 = var23 + 1 - arg5 - arg11;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var20 > var27 || var20 == var27 && var21 > class74.field1675[var23][var24]) {
                            var21 = class74.field1675[var23][var24];
                            var20 = var27;
                            var13 = var23;
                            var15 = var24;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg7 == var13 && arg6 == var15) {
                return false;
            }
            class43.field857 = 1;
        }
        byte var28 = 0;
        class73.field1632[var28] = var13;
        int var38 = var28 + 1;
        class115.field2501[var28] = var15;
        if (arg8 != 130) {
            return true;
        }
        int var29;
        int var30 = var29 = class94.field2063[var13][var15];
        while (arg7 != var13 || arg6 != var15) {
            if (var29 != var30) {
                class73.field1632[var38] = var13;
                class115.field2501[var38++] = var15;
                var29 = var30;
            }
            if ((var30 & 0x1) != 0) {
                var15++;
            } else if ((var30 & 0x4) != 0) {
                var15--;
            }
            if ((var30 & 0x2) != 0) {
                var13++;
            } else if ((var30 & 0x8) != 0) {
                var13--;
            }
            var30 = class94.field2063[var13][var15];
        }
        if (var38 > 0) {
            int var31 = var38--;
            if (var31 > 25) {
                var31 = 25;
            }
            int var32 = class115.field2501[var38];
            int var33 = class73.field1632[var38];
            if (arg10 == 0) {
                class66.field1384++;
                class26.field557.method178(-5, 130);
                class26.field557.method675((byte) -118, var31 + var31 + 3);
            }
            if (arg10 == 1) {
                class26.field557.method178(-5, 136);
                class66.field1388++;
                class26.field557.method675((byte) -100, var31 + var31 + 14 + 3);
            }
            if (arg10 == 2) {
                class40.field791++;
                class26.field557.method178(-5, 89);
                class26.field557.method675((byte) -73, var31 + var31 + 3);
            }
            class26.field557.method681(741826216, class125.field2706[82] ? 1 : 0);
            class26.field557.method696(class33.field648 + var33, false);
            class26.field557.method676(-122, class60.field1234 + var32);
            class101.field2196 = class73.field1632[0];
            class10.field215 = class115.field2501[0];
            for (int var34 = 1; var34 < var31; var34++) {
                var38--;
                class26.field557.method681(741826216, class73.field1632[var38] - var33);
                class26.field557.method669(arg8 ^ 0xFFFFFF58, class115.field2501[var38] - var32);
            }
            return true;
        } else if (arg10 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public abstract void method68(int arg0, int arg1, int arg2, Component arg3);

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V")
    protected class85() {
    }
}
