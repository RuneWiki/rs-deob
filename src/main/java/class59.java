import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class59 extends class262 {

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "Z")
    private boolean field979 = false;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "I")
    private int field976 = 0;

    @OriginalMember(owner = "client!bk", name = "D", descriptor = "I")
    private int field991 = 0;

    @OriginalMember(owner = "client!bk", name = "T", descriptor = "I")
    private int field1007 = -32768;

    @OriginalMember(owner = "client!bk", name = "I", descriptor = "I")
    private int field996;

    @OriginalMember(owner = "client!bk", name = "M", descriptor = "I")
    public int field1000;

    @OriginalMember(owner = "client!bk", name = "R", descriptor = "I")
    public int field1005;

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "I")
    private int field983;

    @OriginalMember(owner = "client!bk", name = "O", descriptor = "I")
    private int field1002;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "I")
    private int field975;

    @OriginalMember(owner = "client!bk", name = "H", descriptor = "I")
    public int field995;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
    public int field973;

    @OriginalMember(owner = "client!bk", name = "K", descriptor = "I")
    public int field998;

    @OriginalMember(owner = "client!bk", name = "C", descriptor = "I")
    private int field990;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "I")
    private int field977;

    @OriginalMember(owner = "client!bk", name = "J", descriptor = "Lia;")
    private class199 field997;

    @OriginalMember(owner = "client!bk", name = "G", descriptor = "[I")
    public static int[] field994 = new int[256];

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "D")
    private double field971;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "D")
    public double field980;

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "D")
    private double field982;

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "D")
    public double field984;

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "D")
    private double field987;

    @OriginalMember(owner = "client!bk", name = "A", descriptor = "D")
    private double field988;

    @OriginalMember(owner = "client!bk", name = "B", descriptor = "D")
    private double field989;

    @OriginalMember(owner = "client!bk", name = "L", descriptor = "D")
    public double field999;

    @OriginalMember(owner = "client!bk", name = "N", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!bk", name = "P", descriptor = "I")
    private int field1003;

    @OriginalMember(owner = "client!bk", name = "Q", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!bk", name = "S", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!bk", name = "U", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!bk", name = "x", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!bk", name = "E", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!bk", name = "F", descriptor = "I")
    public int field993;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(II)V", line = 6)
    public static final void method452(int arg0, int arg1) {
        class295 var2 = class304.field5203[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class295 var4 = class304.field5203[var3][arg0][arg1] = class304.field5203[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field5084--;
                for (int var5 = 0; var5 < var4.field5075; var5++) {
                    class195 var6 = var4.field5090[var5];
                    if ((var6.field3324 >> 29 & 0x3L) == 2L && var6.field3313 == arg0 && var6.field3322 == arg1) {
                        var6.field3331--;
                    }
                }
            }
        }
        if (class304.field5203[0][arg0][arg1] == null) {
            class304.field5203[0][arg0][arg1] = new class295(0, arg0, arg1);
        }
        class304.field5203[0][arg0][arg1].field5086 = var2;
        class304.field5203[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(IIIII)V", line = 53)
    public final void method453(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1008++;
        if (!this.field979) {
            double var6 = (double) (arg0 - this.field977);
            double var8 = (double) (arg1 - this.field1002);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field984 = (double) this.field996 * var8 / var10 + (double) this.field1002;
            this.field999 = (double) this.field996 * var6 / var10 + (double) this.field977;
            this.field980 = (double) this.field975;
        }
        if (arg2 != -6924) {
            method460(84, (Component) null);
        }
        double var12 = (double) (this.field995 + 1 - arg3);
        this.field988 = ((double) arg1 - this.field984) / var12;
        this.field982 = ((double) arg0 - this.field999) / var12;
        this.field989 = Math.sqrt(this.field988 * this.field988 + this.field982 * this.field982);
        if (!this.field979) {
            this.field987 = -this.field989 * Math.tan((double) this.field983 * 0.02454369D);
        }
        this.field971 = ((double) arg4 - this.field980 - this.field987 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V", line = 86)
    public static void method454(int arg0) {
        if (arg0 != -7588) {
            field994 = (int[]) null;
        }
        field994 = null;
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 382)
    public class59(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field996 = arg8;
        this.field1000 = arg9;
        this.field1005 = arg5;
        this.field983 = arg7;
        this.field1002 = arg2;
        this.field975 = arg4;
        this.field995 = arg6;
        this.field973 = arg10;
        this.field979 = false;
        this.field998 = arg1;
        this.field990 = arg0;
        this.field977 = arg3;
        int var12 = class275.method1908(this.field990, 76).field1647;
        if (var12 == -1) {
            this.field997 = null;
        } else {
            this.field997 = class281.method1944(var12, 0);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V", line = 108)
    public static final void method455(byte arg0) {
        field974++;
        class108.field1991.method1217((byte) 105);
        int var1 = class108.field1991.method1220(-23932, 1);
        if (var1 == 0) {
            return;
        }
        int var2 = class108.field1991.method1220(-23932, 2);
        if (var2 == 0) {
            class89.field1616[class228.field3878++] = 2047;
        } else if (var2 == 1) {
            int var3 = class108.field1991.method1220(-23932, 3);
            class139.field2472.method762(var3, false, false);
            int var4 = class108.field1991.method1220(-23932, 1);
            if (var4 == 1) {
                class89.field1616[class228.field3878++] = 2047;
            }
        } else if (var2 == 2) {
            int var9 = class108.field1991.method1220(-23932, 3);
            class139.field2472.method762(var9, false, true);
            int var10 = class108.field1991.method1220(-23932, 3);
            class139.field2472.method762(var10, false, true);
            int var11 = class108.field1991.method1220(-23932, 1);
            if (var11 == 1) {
                class89.field1616[class228.field3878++] = 2047;
            }
        } else {
            if (arg0 <= 103) {
                field994 = (int[]) null;
            }
            if (var2 == 3) {
                int var5 = class108.field1991.method1220(-23932, 1);
                int var6 = class108.field1991.method1220(-23932, 7);
                int var7 = class108.field1991.method1220(-23932, 7);
                class20.field364 = class108.field1991.method1220(-23932, 2);
                int var8 = class108.field1991.method1220(-23932, 1);
                if (var8 == 1) {
                    class89.field1616[class228.field3878++] = 2047;
                }
                class139.field2472.method320(var7, true, var5 == 1, var6);
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)I", line = 184)
    public static final int method456(int arg0) {
        if (arg0 != 1) {
            field994 = (int[]) null;
        }
        field972++;
        return class43.field698;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)Lam;", line = 195)
    private final class243 method457(boolean arg0) {
        field985++;
        if (arg0) {
            method459(-99, 56, -89, (byte) -37);
        }
        class91 var2 = class275.method1908(this.field990, 63);
        class243 var3 = var2.method685(this.field991, -1);
        if (var3 == null) {
            return null;
        } else {
            var3.method42(this.field1003);
            return var3;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIIIIIJ)V", line = 221)
    public final void method43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1006++;
        class243 var11 = this.method457(false);
        if (var11 != null) {
            var11.method43(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field1007 = var11.method48();
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "()I", line = 255)
    public final int method48() {
        field981++;
        return this.field1007;
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(II)V", line = 264)
    public final void method458(int arg0, int arg1) {
        this.field980 += this.field971 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field987;
        this.field979 = true;
        this.field999 += (double) arg0 * this.field982;
        field978++;
        this.field984 += (double) arg0 * this.field988;
        this.field987 += (double) arg0 * this.field971;
        this.field993 = (int) (Math.atan2(this.field988, this.field982) * 325.949D) + 1024 & 0x7FF;
        if (arg1 != 0) {
            method460(37, (Component) null);
        }
        this.field1003 = (int) (Math.atan2(this.field987, this.field989) * 325.949D) & 0x7FF;
        if (this.field997 == null) {
            return;
        }
        this.field976 += arg0;
        while (true) {
            do {
                do {
                    if (this.field997.field3419[this.field991] >= this.field976) {
                        return;
                    }
                    this.field976 -= this.field997.field3419[this.field991];
                    this.field991++;
                } while (this.field991 < this.field997.field3393.length);
                this.field991 -= this.field997.field3395;
            } while (this.field991 >= 0 && this.field997.field3393.length > this.field991);
            this.field991 = 0;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field994[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIB)V", line = 313)
    public static final void method459(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 <= 110) {
            field994 = (int[]) null;
        }
        if (class58.field959 != 0 && arg0 != 0 && class307.field5248 < 50 && arg1 != -1) {
            class195.field3333[class307.field5248] = arg1;
            class119.field2161[class307.field5248] = arg0;
            class295.field5067[class307.field5248] = arg2;
            class132.field2352[class307.field5248] = null;
            class273.field4697[class307.field5248] = 0;
            class307.field5248++;
        }
        field1001++;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 369)
    public static final void method460(int arg0, Component arg1) {
        if (arg0 <= 1) {
            field994 = (int[]) null;
        }
        field1004++;
        arg1.removeMouseListener(class163.field2873);
        arg1.removeMouseMotionListener(class163.field2873);
        arg1.removeFocusListener(class163.field2873);
        class56.field949 = 0;
    }
}
