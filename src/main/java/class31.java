import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class31 {

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "[I")
    private int[] field516 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "Z")
    public boolean field514 = false;

    @OriginalMember(owner = "client!fn", name = "p", descriptor = "I")
    public int field528 = -1;

    @OriginalMember(owner = "client!fn", name = "n", descriptor = "[I")
    public static int[] field526 = new int[25];

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "Z")
    public static boolean field523 = false;

    @OriginalMember(owner = "client!fn", name = "q", descriptor = "[Lqa;")
    public static class130[] field529 = new class130[4];

    @OriginalMember(owner = "client!fn", name = "r", descriptor = "F")
    public static float field530;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!fn", name = "s", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!fn", name = "t", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!fn", name = "u", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!fn", name = "v", descriptor = "[I")
    private int[] field534;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "[S")
    private short[] field515;

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "[S")
    private short[] field521;

    @OriginalMember(owner = "client!fn", name = "l", descriptor = "[S")
    private short[] field524;

    @OriginalMember(owner = "client!fn", name = "o", descriptor = "[S")
    private short[] field527;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lpe;I)V", line = 10)
    public final void method210(class101 arg0, int arg1) {
        field513++;
        while (true) {
            int var3 = arg0.method741(50);
            if (var3 == 0) {
                if (arg1 != -20231) {
                    this.method216(-14);
                }
                return;
            }
            this.method212(arg0, var3, (byte) 80);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IILpe;)Ljava/lang/String;", line = 35)
    public static final String method211(int arg0, int arg1, class101 arg2) {
        field518++;
        try {
            int var3 = 63 % ((arg1 + 47) / 56);
            int var4 = arg2.method738(-957401312);
            if (var4 > arg0) {
                var4 = arg0;
            }
            byte[] var5 = new byte[var4];
            arg2.field1667 += class230.field3656.method177((byte) -116, 0, arg2.field1667, arg2.field1661, var5, var4);
            return class230.method1663(var5, 0, var4, 128);
        } catch (Exception var8) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lpe;IB)V", line = 63)
    private final void method212(class101 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field528 = arg0.method741(64);
        } else if (arg1 == 2) {
            int var8 = arg0.method741(arg2 - 7);
            this.field534 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field534[var9] = arg0.method731(false);
            }
        } else if (arg1 == 3) {
            this.field514 = true;
        } else if (arg1 == 40) {
            int var6 = arg0.method741(63);
            this.field515 = new short[var6];
            this.field524 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field515[var7] = (short) arg0.method731(false);
                this.field524[var7] = (short) arg0.method731(false);
            }
        } else if (arg1 == 41) {
            int var4 = arg0.method741(25);
            this.field521 = new short[var4];
            this.field527 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field527[var5] = (short) arg0.method731(false);
                this.field521[var5] = (short) arg0.method731(false);
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field516[arg1 - 60] = arg0.method731(false);
        }
        field519++;
        if (arg2 != 80) {
            this.field516 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIIIIIIII)V", line = 142)
    public static final void method213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (class319.field4965 <= arg8 && arg8 <= class116.field1888 && arg9 >= class319.field4965 && class116.field1888 >= arg9 && class319.field4965 <= arg1 && arg1 <= class116.field1888 && arg2 >= class319.field4965 && arg2 <= class116.field1888 && arg5 >= class188.field2995 && class195.field3108 >= arg5 && arg4 >= class188.field2995 && class195.field3108 >= arg4 && arg6 >= class188.field2995 && class195.field3108 >= arg6 && arg7 >= class188.field2995 && class195.field3108 >= arg7) {
            class301.method2100(arg9, arg8, arg6, arg4, arg2, 109, arg5, arg1, arg0, arg7);
        } else {
            class193.method1421(arg1, 3, arg9, arg7, arg6, arg0, arg5, arg4, arg8, arg2);
        }
        field532++;
        if (arg3 != 0) {
            field529 = (class130[]) null;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)V", line = 167)
    public static void method214(byte arg0) {
        if (arg0 == -59) {
            field526 = null;
            field529 = null;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)Z", line = 178)
    public final boolean method215(int arg0) {
        field520++;
        if (arg0 != -26448) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field516[var3] != -1 && !class12.field241.method464((byte) 50, this.field516[var3], 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)Lqa;", line = 203)
    public final class130 method216(int arg0) {
        field517++;
        if (this.field534 == null) {
            return null;
        }
        class130[] var2 = new class130[this.field534.length];
        for (int var3 = arg0; var3 < this.field534.length; var3++) {
            var2[var3] = class130.method969(class12.field241, this.field534[var3], 0);
        }
        class130 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class130(var2, var2.length);
        }
        if (this.field515 != null) {
            for (int var5 = 0; var5 < this.field515.length; var5++) {
                var4.method971(this.field515[var5], this.field524[var5]);
            }
        }
        if (this.field527 != null) {
            for (int var6 = 0; var6 < this.field527.length; var6++) {
                var4.method979(this.field527[var6], this.field521[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "(I)Lqa;", line = 261)
    public final class130 method217(int arg0) {
        class130[] var2 = new class130[5];
        int var3 = 0;
        field522++;
        if (arg0 < 32) {
            method211(48, 16, (class101) null);
        }
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field516[var4] != -1) {
                var2[var3++] = class130.method969(class12.field241, this.field516[var4], 0);
            }
        }
        class130 var5 = new class130(var2, var3);
        if (this.field515 != null) {
            for (int var6 = 0; var6 < this.field515.length; var6++) {
                var5.method971(this.field515[var6], this.field524[var6]);
            }
        }
        if (this.field527 != null) {
            for (int var7 = 0; var7 < this.field527.length; var7++) {
                var5.method979(this.field527[var7], this.field521[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "(I)V", line = 316)
    public static final void method218(int arg0) {
        field525++;
        if (class127.field2032 != null) {
            class127.field2032.method131(-11918);
            class127.field2032 = null;
        }
        class116.method867(0);
        class29.method192();
        for (int var1 = 0; var1 < 4; var1++) {
            class244.field3772[var1].method414(-17697);
        }
        class191.method1414(false, false);
        System.gc();
        class270.method1952(2, false);
        class165.field2559 = false;
        class306.field4808 = -1;
        class268.method1924(5, true);
        class91.field1485 = 0;
        int var2 = 106 / ((79 - arg0) / 33);
        class111.field1847 = 0;
        class76.field1166 = 0;
        class28.field455 = false;
        class177.field2780 = 0;
        for (int var3 = 0; var3 < class88.field1341.length; var3++) {
            class88.field1341[var3] = null;
        }
        class65.field1058 = 0;
        class77.field1173 = 0;
        for (int var4 = 0; var4 < 2048; var4++) {
            class82.field1228[var4] = null;
            class138.field2193[var4] = null;
        }
        for (int var5 = 0; var5 < 32768; var5++) {
            class138.field2196[var5] = null;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 104; var7++) {
                for (int var8 = 0; var8 < 104; var8++) {
                    class261.field4050[var6][var7][var8] = null;
                }
            }
        }
        class103.method789(120);
        class247.field3822 = 0;
        class140.method1070(true);
        class98.method712(2957, true);
    }

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "(I)Z", line = 412)
    public final boolean method219(int arg0) {
        field531++;
        if (this.field534 == null) {
            return true;
        }
        if (arg0 != 22140) {
            this.field528 = 55;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field534.length; var3++) {
            if (!class12.field241.method464((byte) 64, this.field534[var3], 0)) {
                var2 = false;
            }
        }
        return var2;
    }
}
