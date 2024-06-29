import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class117 extends class28 {

    @OriginalMember(owner = "client!ki", name = "x", descriptor = "Z")
    public boolean field2196 = false;

    @OriginalMember(owner = "client!ki", name = "M", descriptor = "I")
    public int field2211 = 99;

    @OriginalMember(owner = "client!ki", name = "J", descriptor = "I")
    public int field2208 = -1;

    @OriginalMember(owner = "client!ki", name = "F", descriptor = "I")
    public int field2204 = -1;

    @OriginalMember(owner = "client!ki", name = "y", descriptor = "I")
    public int field2197 = 2;

    @OriginalMember(owner = "client!ki", name = "P", descriptor = "I")
    public int field2214 = -1;

    @OriginalMember(owner = "client!ki", name = "Z", descriptor = "I")
    public int field2224 = -1;

    @OriginalMember(owner = "client!ki", name = "ab", descriptor = "I")
    public int field2225 = -1;

    @OriginalMember(owner = "client!ki", name = "db", descriptor = "I")
    public int field2228 = 5;

    @OriginalMember(owner = "client!ki", name = "K", descriptor = "Lqe;")
    public static class179 field2209 = class206.method1380("zur-Uck auf die RuneScape)2Webseite gehen", (byte) -15);

    @OriginalMember(owner = "client!ki", name = "D", descriptor = "Lqe;")
    public static class179 field2202 = null;

    @OriginalMember(owner = "client!ki", name = "L", descriptor = "[S")
    public static short[] field2210 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!ki", name = "X", descriptor = "Lqe;")
    public static class179 field2222 = class206.method1380("Cabbage", (byte) -127);

    @OriginalMember(owner = "client!ki", name = "U", descriptor = "Lqe;")
    public static class179 field2219 = class206.method1380("und loggen sich dann erneut ein)3", (byte) 115);

    @OriginalMember(owner = "client!ki", name = "w", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!ki", name = "z", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!ki", name = "B", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!ki", name = "C", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!ki", name = "G", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!ki", name = "I", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!ki", name = "N", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!ki", name = "O", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!ki", name = "Q", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!ki", name = "R", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!ki", name = "V", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!ki", name = "W", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!ki", name = "Y", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!ki", name = "bb", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!ki", name = "cb", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!ki", name = "A", descriptor = "[I")
    public int[] field2199;

    @OriginalMember(owner = "client!ki", name = "E", descriptor = "[I")
    private int[] field2203;

    @OriginalMember(owner = "client!ki", name = "H", descriptor = "[I")
    public int[] field2206;

    @OriginalMember(owner = "client!ki", name = "S", descriptor = "[I")
    public int[] field2217;

    @OriginalMember(owner = "client!ki", name = "T", descriptor = "[I")
    private int[] field2218;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIII)V")
    public static final void method749(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != -4) {
            return;
        }
        field2195++;
        if (class42.field909 == 1) {
            class199.field3708[class52.field1095 / 100].method799(class98.field1838 - 8, class36.field799 - 8);
        }
        if (class42.field909 == 2) {
            class199.field3708[class52.field1095 / 100 + 4].method799(class98.field1838 - 8, class36.field799 - 8);
        }
        class12.method84(5);
        if (!class191.field3568) {
            return;
        }
        int var5 = arg0 + 512 - 5;
        int var6 = arg3 + 20;
        class191.field3546.method999(class78.method502((byte) -100, new class179[] { class143.field2610, class148.method949((byte) -14, class149.field2689) }), var5, var6, 16776960, -1);
        Runtime var7 = Runtime.getRuntime();
        int var10 = var6 + 15;
        int var8 = 16776960;
        int var9 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
        if (var9 > 32768 && class180.field3307) {
            var8 = 16711680;
        }
        if (var9 > 65536 && !class180.field3307) {
            var8 = 16711680;
        }
        class191.field3546.method999(class78.method502((byte) -89, new class179[] { class84.field1627, class148.method949((byte) -14, var9), class231.field4260 }), var5, var10, var8, -1);
        var6 = var10 + 15;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIIII)V")
    public static final void method750(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2198++;
        class73.method464(arg5 ^ 0xFFFFE937, arg3);
        int var7 = 0;
        int var8 = arg3 - arg1;
        int var9 = arg3;
        if (arg5 > var8) {
            var8 = 0;
        }
        int var10 = -arg3;
        int var11 = var8;
        int var12 = -1;
        int var13 = -var8;
        int[] var14 = class14.field331[arg4];
        int var15 = -1;
        int var16 = arg2 - var8;
        int var17 = arg2 + var8;
        class23.method161(var16, -1, arg6, arg2 - arg3, var14);
        class23.method161(var17, -1, arg0, var16, var14);
        class23.method161(arg2 + arg3, -1, arg6, var17, var14);
        while (var7 < var9) {
            var15 += 2;
            var12 += 2;
            var13 += var12;
            if (var13 >= 0 && var11 >= 1) {
                class148.field2668[var11] = var7;
                var11--;
                var13 -= var11 << 1;
            }
            var10 += var15;
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var8 > var9) {
                    int[] var18 = class14.field331[arg4 + var9];
                    int[] var19 = class14.field331[arg4 - var9];
                    int var20 = arg2 + var7;
                    int var21 = class148.field2668[var9];
                    int var22 = arg2 - var7;
                    int var23 = arg2 + var21;
                    int var24 = arg2 - var21;
                    class23.method161(var24, -1, arg6, var22, var18);
                    class23.method161(var23, -1, arg0, var24, var18);
                    class23.method161(var20, -1, arg6, var23, var18);
                    class23.method161(var24, -1, arg6, var22, var19);
                    class23.method161(var23, -1, arg0, var24, var19);
                    class23.method161(var20, ~arg5, arg6, var23, var19);
                } else {
                    int[] var25 = class14.field331[arg4 + var9];
                    int var26 = arg2 + var7;
                    int[] var27 = class14.field331[arg4 - var9];
                    int var28 = arg2 - var7;
                    class23.method161(var26, -1, arg6, var28, var25);
                    class23.method161(var26, -1, arg6, var28, var27);
                }
            }
            int[] var29 = class14.field331[arg4 + var7];
            int var30 = arg2 + var9;
            int var31 = arg2 - var9;
            int[] var32 = class14.field331[arg4 - var7];
            if (var7 < var8) {
                int var33 = var7 <= var11 ? var11 : class148.field2668[var7];
                int var34 = arg2 + var33;
                int var35 = arg2 - var33;
                class23.method161(var35, -1, arg6, var31, var29);
                class23.method161(var34, -1, arg0, var35, var29);
                class23.method161(var30, -1, arg6, var34, var29);
                class23.method161(var35, -1, arg6, var31, var32);
                class23.method161(var34, -1, arg0, var35, var32);
                class23.method161(var30, -1, arg6, var34, var32);
            } else {
                class23.method161(var30, -1, arg6, var31, var29);
                class23.method161(var30, -1, arg6, var31, var32);
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IZ)Lfd;")
    public static final class59 method751(int arg0, boolean arg1) {
        class59 var2 = (class59) class87.field1664.method1299((byte) -126, (long) arg0);
        field2223++;
        if (var2 != null) {
            return var2;
        }
        if (!arg1) {
            method749(29, 65, 125, 55, -51);
        }
        byte[] var3 = class50.field1075.method342(arg0, 28, (byte) 98);
        class59 var4 = new class59();
        if (var3 != null) {
            var4.method402(2, new class185(var3));
        }
        class87.field1664.method1303(var4, (long) arg0, (byte) 102);
        return var4;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)Lqe;")
    public static final class179 method752(int arg0, int arg1) {
        class179 var2 = new class179();
        var2.field3256 = new byte[arg0];
        var2.field3277 = arg1;
        field2207++;
        return var2;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lki;Lgj;IBI)Lgj;")
    public final class75 method753(class117 arg0, class75 arg1, int arg2, byte arg3, int arg4) {
        field2215++;
        int var6 = this.field2217[arg2];
        if (arg3 <= 84) {
            this.field2225 = 96;
        }
        class60 var7 = class159.method1029(true, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg0.method758(arg4, arg1, (byte) -121);
        }
        int var9 = arg0.field2217[arg4];
        class60 var10 = class159.method1029(true, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class75 var12 = arg1.method478(!var7.method410(101, var8));
            var12.method492(var7, var8);
            return var12;
        } else {
            class75 var13 = arg1.method478(!var7.method410(100, var8) & !var10.method410(104, var11));
            var13.method488(var7, var8, var10, var11, this.field2218);
            return var13;
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V")
    public static void method754(int arg0) {
        field2219 = null;
        field2222 = null;
        if (arg0 > -36) {
            field2202 = null;
        }
        field2209 = null;
        field2210 = null;
        field2202 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lra;IB)V")
    private final void method755(class185 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            int var11 = arg0.method1252(2);
            this.field2199 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2199[var12] = arg0.method1252(2);
            }
            this.field2217 = new int[var11];
            for (int var13 = 0; var13 < var11; var13++) {
                this.field2217[var13] = arg0.method1252(2);
            }
            for (int var14 = 0; var14 < var11; var14++) {
                this.field2217[var14] = (arg0.method1252(2) << 16) + this.field2217[var14];
            }
        } else if (arg1 == 2) {
            this.field2208 = arg0.method1252(2);
        } else if (arg1 == 3) {
            int var9 = arg0.method1243(3);
            this.field2218 = new int[var9 + 1];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2218[var10] = arg0.method1243(3);
            }
            this.field2218[var9] = 9999999;
        } else if (arg1 == 4) {
            this.field2196 = true;
        } else if (arg1 == 5) {
            this.field2228 = arg0.method1243(3);
        } else if (arg1 == 6) {
            this.field2214 = arg0.method1252(2);
        } else if (arg1 == 7) {
            this.field2204 = arg0.method1252(2);
        } else if (arg1 == 8) {
            this.field2211 = arg0.method1243(3);
        } else if (arg1 == 9) {
            this.field2224 = arg0.method1243(3);
        } else if (arg1 == 10) {
            this.field2225 = arg0.method1243(3);
        } else if (arg1 == 11) {
            this.field2197 = arg0.method1243(3);
        } else if (arg1 == 12) {
            int var6 = arg0.method1243(3);
            this.field2203 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2203[var7] = arg0.method1252(2);
            }
            for (int var8 = 0; var8 < var6; var8++) {
                this.field2203[var8] += arg0.method1252(2) << 16;
            }
        } else if (arg1 == 13) {
            int var4 = arg0.method1243(3);
            this.field2206 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2206[var5] = arg0.method1244(-27523);
            }
        }
        if (arg2 < 106) {
            field2222 = null;
        }
        field2221++;
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)V")
    public final void method756(int arg0) {
        field2200++;
        if (this.field2225 == -1) {
            if (this.field2218 == null) {
                this.field2225 = 0;
            } else {
                this.field2225 = 2;
            }
        }
        if (~this.field2224 != arg0) {
            return;
        }
        if (this.field2218 == null) {
            this.field2224 = 0;
        } else {
            this.field2224 = 2;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BILgj;)Lgj;")
    public final class75 method757(byte arg0, int arg1, class75 arg2) {
        int var4 = this.field2217[arg1];
        field2213++;
        class60 var5 = class159.method1029(true, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method478(true);
        }
        if (arg0 != -99) {
            method759((byte) -46, 41);
        }
        class60 var7 = null;
        int var8 = 0;
        if (this.field2203 != null && arg1 < this.field2203.length) {
            int var9 = this.field2203[arg1];
            var7 = class159.method1029(true, var9 >> 16);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class75 var11 = arg2.method478(!var5.method410(arg0 ^ 0xFFFFFFF9, var6));
            var11.method492(var5, var6);
            return var11;
        } else {
            class75 var10 = arg2.method478(!var5.method410(104, var6) & !var7.method410(94, var8));
            var10.method492(var5, var6);
            var10.method492(var7, var8);
            return var10;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILgj;B)Lgj;")
    public final class75 method758(int arg0, class75 arg1, byte arg2) {
        field2205++;
        int var4 = this.field2217[arg0];
        class60 var5 = class159.method1029(true, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (arg2 != -121) {
            return null;
        } else if (var5 == null) {
            return arg1.method478(true);
        } else {
            class75 var7 = arg1.method478(!var5.method410(86, var6));
            var7.method492(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BI)Z")
    public static final boolean method759(byte arg0, int arg1) {
        field2201++;
        if (arg0 >= -62) {
            return false;
        } else {
            return (arg1 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IILgj;I)Lgj;")
    public final class75 method760(int arg0, int arg1, class75 arg2, int arg3) {
        field2227++;
        int var5 = this.field2217[arg3];
        class60 var6 = class159.method1029(true, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method478(true);
        }
        int var8 = arg1 & 0x3;
        if (arg0 != -331) {
            return null;
        }
        class75 var9 = arg2.method478(!var6.method410(97, var7));
        if (var8 == 1) {
            var9.method480();
        } else if (var8 == 2) {
            var9.method491();
        } else if (var8 == 3) {
            var9.method475();
        }
        var9.method492(var6, var7);
        if (var8 == 1) {
            var9.method475();
        } else if (var8 == 2) {
            var9.method491();
        } else if (var8 == 3) {
            var9.method480();
        }
        return var9;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IILjava/awt/Component;I)Lgh;")
    public static final class73 method761(int arg0, int arg1, Component arg2, int arg3) {
        field2220++;
        try {
            if (arg0 != 0) {
                method761(16, -43, null, -27);
            }
            Class var4 = Class.forName("hc");
            class73 var5 = (class73) var4.getDeclaredConstructor().newInstance();
            var5.method465(arg3, arg2, arg0 ^ 0x8, arg1);
            return var5;
        } catch (Throwable var7) {
            class191 var6 = new class191();
            var6.method465(arg3, arg2, 8, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BLra;)V")
    public final void method762(byte arg0, class185 arg1) {
        if (arg0 >= -83) {
            this.field2217 = null;
        }
        field2226++;
        while (true) {
            int var3 = arg1.method1243(3);
            if (var3 == 0) {
                return;
            }
            this.method755(arg1, var3, (byte) 109);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BLgj;I)Lgj;")
    public final class75 method763(byte arg0, class75 arg1, int arg2) {
        if (arg0 != -75) {
            field2202 = null;
        }
        field2212++;
        int var4 = this.field2217[arg2];
        class60 var5 = class159.method1029(true, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method476(true);
        } else {
            class75 var7 = arg1.method476(!var5.method410(119, var6));
            var7.method492(var5, var6);
            return var7;
        }
    }
}
