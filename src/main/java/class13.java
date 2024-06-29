import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class13 extends class119 {

    @OriginalMember(owner = "client!be", name = "U", descriptor = "I")
    private int field212 = 0;

    @OriginalMember(owner = "client!be", name = "N", descriptor = "I")
    public static int field205 = 0;

    @OriginalMember(owner = "client!be", name = "Q", descriptor = "I")
    public static int field208 = 0;

    @OriginalMember(owner = "client!be", name = "S", descriptor = "Lv;")
    private static class146 field210 = class159.method1226((byte) -37, " seconds)3");

    @OriginalMember(owner = "client!be", name = "O", descriptor = "Lv;")
    public static class146 field206 = field210;

    @OriginalMember(owner = "client!be", name = "R", descriptor = "Lua;")
    public static class140 field209 = new class140(50);

    @OriginalMember(owner = "client!be", name = "Y", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field216 = new CRC32();

    @OriginalMember(owner = "client!be", name = "cb", descriptor = "Lv;")
    private static class146 field220 = class159.method1226((byte) -37, " ");

    @OriginalMember(owner = "client!be", name = "bb", descriptor = "Lv;")
    public static class146 field219 = class159.method1226((byte) -37, ")1j");

    @OriginalMember(owner = "client!be", name = "db", descriptor = "I")
    public static volatile int field221 = -1;

    @OriginalMember(owner = "client!be", name = "eb", descriptor = "Lv;")
    public static class146 field222 = class159.method1226((byte) -37, "<)4col>");

    @OriginalMember(owner = "client!be", name = "ab", descriptor = "Lv;")
    public static class146 field218 = field220;

    @OriginalMember(owner = "client!be", name = "B", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!be", name = "G", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!be", name = "H", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!be", name = "I", descriptor = "I")
    public int field200;

    @OriginalMember(owner = "client!be", name = "J", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!be", name = "K", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!be", name = "L", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!be", name = "M", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!be", name = "P", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!be", name = "T", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!be", name = "V", descriptor = "I")
    public int field213;

    @OriginalMember(owner = "client!be", name = "W", descriptor = "I")
    public int field214;

    @OriginalMember(owner = "client!be", name = "X", descriptor = "I")
    public int field215;

    @OriginalMember(owner = "client!be", name = "Z", descriptor = "Ljf;")
    public static class68 field217;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lv;ILv;ZILla;)V")
    public static final void method73(class146 arg0, int arg1, class146 arg2, boolean arg3, int arg4, class77 arg5) {
        if (arg4 != 0) {
            field208 = 86;
        }
        field204++;
        int var6 = arg5.method593(arg4 ^ 0x4D, arg2);
        int var7 = arg5.method592(arg0, 124, var6);
        class119.method908(var6, 1, arg1, var7, arg5, arg3);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(III)I")
    public static final int method74(int arg0, int arg1, int arg2) {
        field203++;
        class125 var3 = (class125) class124.field2868.method332((byte) -79, (long) arg2);
        if (var3 == null) {
            return 0;
        } else if (arg1 >= 0 && var3.field2900.length > arg1) {
            if (arg0 != 14217) {
                field210 = null;
            }
            return var3.field2900[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILne;BI)V")
    private final void method75(int arg0, class95 arg1, byte arg2, int arg3) {
        if (arg2 > 94) {
            if (arg3 == 1) {
                this.field212 = arg1.method763(true);
            }
            field202++;
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(B)V")
    public static void method76(byte arg0) {
        field210 = null;
        field218 = null;
        field217 = null;
        field209 = null;
        field222 = null;
        field216 = null;
        if (arg0 == 100) {
            field220 = null;
            field206 = null;
            field219 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "(I)Z")
    public static final boolean method77(int arg0) {
        field199++;
        try {
            if (class58.field1300 == 2) {
                if (class82.field1985 == null) {
                    class82.field1985 = class36.method243(class33.field693, class77.field1870, class120.field2778);
                    if (class82.field1985 == null) {
                        return false;
                    }
                }
                if (class122.field2822 == null) {
                    class122.field2822 = new class87(class3.field88, class147.field3424);
                }
                if (class35.field760.method545(class122.field2822, class141.field3230, 22050, (byte) 81, class82.field1985)) {
                    class35.field760.method544(true);
                    class35.field760.method536(class132.field3010, 111);
                    class35.field760.method537(class82.field1985, class25.field410, arg0 - 21989);
                    class33.field693 = null;
                    class58.field1300 = 0;
                    class122.field2822 = null;
                    class82.field1985 = null;
                    return true;
                }
            }
            if (arg0 != 22050) {
                method73(null, -59, null, true, -80, null);
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class35.field760.method561(-17);
            class58.field1300 = 0;
            class33.field693 = null;
            class122.field2822 = null;
            class82.field1985 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIIII)V")
    public static final void method78(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 2048 - arg1 & 0x7FF;
        field211++;
        int var8 = 2048 - arg6 & 0x7FF;
        int var9 = 0;
        int var10 = 0;
        int var11 = arg5;
        if (var7 != 0) {
            int var12 = class45.field1030[var7];
            int var13 = class45.field1032[var7];
            int var14 = var10 * var13 - arg5 * var12 >> 16;
            var11 = var10 * var12 + arg5 * var13 >> 16;
            var10 = var14;
        }
        if (var8 != 0) {
            int var15 = class45.field1030[var8];
            int var16 = class45.field1032[var8];
            int var17 = var9 * var16 + var11 * var15 >> 16;
            var11 = var11 * var16 - var9 * var15 >> 16;
            var9 = var17;
        }
        class126.field2920 = arg2 - var9;
        class89.field2109 = arg1;
        class143.field3266 = arg3 - var11;
        if (arg0 != 1939431536) {
            field220 = null;
        }
        class116.field2698 = arg4 - var10;
        class123.field2854 = arg6;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IB)V")
    private final void method79(int arg0, byte arg1) {
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        if (arg1 != -76) {
            field205 = 46;
        }
        double var7 = var3;
        double var9 = (double) (arg0 & 0xFF) / 256.0D;
        field197++;
        if (var5 < var3) {
            var7 = var5;
        }
        double var11 = var3;
        if (var9 < var7) {
            var7 = var9;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        if (var5 > var3) {
            var11 = var5;
        }
        if (var11 < var9) {
            var11 = var9;
        }
        double var17 = (var7 + var11) / 2.0D;
        if (var7 != var11) {
            if (var3 == var11) {
                var15 = (var5 - var9) / (var11 - var7);
            } else if (var5 == var11) {
                var15 = (var9 - var3) / (-var7 + var11) + 2.0D;
            } else if (var9 == var11) {
                var15 = (var3 - var5) / (-var7 + var11) + 4.0D;
            }
            if (var17 < 0.5D) {
                var13 = (var11 - var7) / (var7 + var11);
            }
            if (var17 >= 0.5D) {
                var13 = (var11 - var7) / (2.0D - var11 - var7);
            }
        }
        double var19 = var15 / 6.0D;
        if (var17 > 0.5D) {
            this.field215 = (int) ((1.0D - var17) * var13 * 512.0D);
        } else {
            this.field215 = (int) (var13 * var17 * 512.0D);
        }
        if (this.field215 < 1) {
            this.field215 = 1;
        }
        this.field200 = (int) (var13 * 256.0D);
        if (this.field200 < 0) {
            this.field200 = 0;
        } else if (this.field200 > 255) {
            this.field200 = 255;
        }
        this.field213 = (int) ((double) this.field215 * var19);
        this.field214 = (int) (var17 * 256.0D);
        if (this.field214 < 0) {
            this.field214 = 0;
        } else if (this.field214 > 255) {
            this.field214 = 255;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IILne;)V")
    public final void method80(int arg0, int arg1, class95 arg2) {
        while (true) {
            int var4 = arg2.method790((byte) 73);
            if (var4 == 0) {
                if (arg1 != -1) {
                    method73(null, 82, null, true, 49, null);
                }
                field198++;
                return;
            }
            this.method75(arg0, arg2, (byte) 108, var4);
        }
    }

    @OriginalMember(owner = "client!be", name = "f", descriptor = "(I)V")
    public final void method81(int arg0) {
        if (arg0 != 1492795248) {
            field219 = null;
        }
        this.method79(this.field212, (byte) -76);
        field207++;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BII)V")
    public static final void method82(byte arg0, int arg1, int arg2) {
        class76.field1820++;
        field201++;
        class82.field1990.method265((byte) -85, 91);
        if (arg0 < 21) {
            method78(-100, 111, -19, 120, -8, 0, 121);
        }
        class82.field1990.method766(arg2, (byte) 115);
        class82.field1990.method788(arg1, -730641264);
    }
}
