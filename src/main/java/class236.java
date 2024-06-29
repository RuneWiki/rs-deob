import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class236 implements Runnable {

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "Lkh;")
    private class5 field4211 = new class5();

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "I")
    public int field4217 = 0;

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "Z")
    private boolean field4216 = false;

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "Ljava/lang/Thread;")
    private Thread field4214;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "Z")
    public static boolean field4201 = false;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "Le;")
    private static class191 field4199 = class54.method368("Loading)3)3)3", 2047);

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "Le;")
    public static class191 field4195 = class54.method368("loginscreen", 2047);

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "Le;")
    public static class191 field4192 = class54.method368("mapdots", 2047);

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "Le;")
    public static class191 field4205 = field4199;

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "[J")
    public static long[] field4213 = new long[100];

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "Le;")
    private static class191 field4210 = class54.method368("Close", 2047);

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "Le;")
    public static class191 field4200 = field4210;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "Le;")
    public static class191 field4209 = class54.method368(" steht bereits auf Ihrer Ignorieren)2Liste(Q", 2047);

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "[I")
    public static int[] field4202;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
    public final void method1661(int arg0) {
        field4204++;
        this.field4216 = true;
        int var2 = -79 / ((arg0 + 68) / 36);
        class5 var3 = this.field4211;
        synchronized (this.field4211) {
            this.field4211.notifyAll();
        }
        try {
            this.field4214.join();
        } catch (InterruptedException var4) {
        }
        this.field4214 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)Lsj;")
    public static final class165 method1662(int arg0, int arg1) {
        field4194++;
        if (arg1 != -1) {
            field4213 = null;
        }
        class165 var2 = (class165) class211.field3738.method437((byte) 116, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 >= 32768) {
            var3 = class258.field4579.method826((byte) 35, 0, arg0 & 0x7FFF);
        } else {
            var3 = class3.field24.method826((byte) 35, 0, arg0);
        }
        class165 var4 = new class165();
        if (var3 != null) {
            var4.method1113(new class225(var3), 126);
        }
        if (arg0 >= 32768) {
            var4.method1111(127);
        }
        class211.field3738.method439(var4, arg1, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IILr;)Lva;")
    public final class178 method1663(int arg0, int arg1, class59 arg2) {
        field4198++;
        class178 var4 = new class178();
        var4.field3056 = 1;
        if (arg0 != -3) {
            return null;
        }
        class5 var5 = this.field4211;
        synchronized (this.field4211) {
            class178 var6 = (class178) this.field4211.method19(arg0 ^ 0x2);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg1) == var6.field2825 && var6.field3054 == arg2 && var6.field3056 == 2) {
                    var4.field4183 = false;
                    var4.field3058 = var6.field3058;
                    return var4;
                }
                var6 = (class178) this.field4211.method18(-8001);
            }
        }
        var4.field3058 = arg2.method400(false, arg1);
        var4.field4178 = true;
        var4.field4183 = false;
        return var4;
    }

    @OriginalMember(owner = "client!rg", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field4216) {
            class5 var1 = this.field4211;
            class178 var2;
            synchronized (this.field4211) {
                var2 = (class178) this.field4211.method17(0);
                if (var2 == null) {
                    try {
                        this.field4211.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field4217--;
            }
            try {
                if (var2.field3056 == 2) {
                    var2.field3054.method396(var2.field3058, var2.field3058.length, (int) var2.field2825, 13636);
                } else if (var2.field3056 == 3) {
                    var2.field3058 = var2.field3054.method400(false, (int) var2.field2825);
                }
            } catch (Exception var6) {
                class25.method182(var6, (String) null, true);
            }
            var2.field4183 = false;
        }
        field4215++;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILqb;II)V")
    public static final void method1664(int arg0, class76 arg1, int arg2, int arg3) {
        field4197++;
        if ((arg3 & 0x80) != 0) {
            arg1.field3018 = class107.field1776.method1563(true);
            arg1.field2979 = class107.field1776.method1598((byte) -87);
        }
        if ((arg3 & 0x10) != 0) {
            int var4 = class107.field1776.method1563(true);
            int var5 = class107.field1776.method1599((byte) -96);
            int var6 = class107.field1776.method1580(-73);
            boolean var7 = (var4 & 0x8000) != 0;
            int var8 = class107.field1776.field3996;
            if (arg1.field1315 != null && arg1.field1306 != null) {
                boolean var9 = false;
                long var10 = arg1.field1315.method1352(65);
                if (var5 <= 1) {
                    if (!var7 && (class42.field739 == 1 || class39.field706 == 1)) {
                        var9 = true;
                    } else {
                        for (int var12 = 0; var12 < class254.field4506; var12++) {
                            if (class207.field3693[var12] == var10) {
                                var9 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var9 && class91.field1495 == 0) {
                    int var13 = -1;
                    class89.field1446.field3996 = 0;
                    class107.field1776.method1570(255, var6, 0, class89.field1446.field3995);
                    class89.field1446.field3996 = 0;
                    class191 var15;
                    if (var7) {
                        var4 &= 0x7FFF;
                        class64 var14 = class209.method1439(class89.field1446, (byte) -35);
                        var13 = var14.field1130;
                        var15 = var14.field1129.method462(-25, class89.field1446);
                    } else {
                        var15 = class44.method299(class203.method1414(class89.field1446, arg2 + 420).method1339((byte) -59));
                    }
                    arg1.field2993 = var15.method1346((byte) 61);
                    arg1.field2985 = var4 & 0xFF;
                    arg1.field2973 = var4 >> 8;
                    arg1.field2981 = 150;
                    if (var5 == 2) {
                        class132.method892(var13, class228.method1629(new class191[] { class166.field2812, arg1.method494((byte) 59) }, (byte) -111), (class191) null, arg2 ^ 0x566A, var15, var7 ? 17 : 1);
                    } else if (var5 == 1) {
                        class132.method892(var13, class228.method1629(new class191[] { class51.field911, arg1.method494((byte) -80) }, (byte) -74), (class191) null, 10289, var15, var7 ? 17 : 1);
                    } else {
                        class132.method892(var13, arg1.method494((byte) -37), (class191) null, 10289, var15, var7 ? 17 : 2);
                    }
                }
            }
            class107.field1776.field3996 = var6 + var8;
        }
        if (arg2 != 32347) {
            field4202 = null;
        }
        if ((arg3 & 0x400) != 0) {
            int var16 = class107.field1776.method1607(255);
            int var17 = class107.field1776.method1573(arg2 - 11717739);
            arg1.method1188(var16, var17, class135.field2267, 70);
        }
        if ((arg3 & 0x40) != 0) {
            arg1.field2993 = class107.field1776.method1596((byte) 16);
            if (arg1.field2993.method1354(0, (byte) -89) == 126) {
                arg1.field2993 = arg1.field2993.method1315(1, (byte) 86);
                class47.method320(arg1.field2993, arg1.method494((byte) -120), 2, -1);
            } else if (class175.field2946 == arg1) {
                class47.method320(arg1.field2993, arg1.method494((byte) 93), 2, -1);
            }
            arg1.field2981 = 150;
            arg1.field2973 = 0;
            arg1.field2985 = 0;
        }
        if ((arg3 & 0x100) != 0) {
            arg1.field2975 = class107.field1776.method1607(255);
            arg1.field2982 = class107.field1776.method1607(255);
            arg1.field2967 = class107.field1776.method1607(255);
            arg1.field2997 = class107.field1776.method1607(255);
            arg1.field2984 = class107.field1776.method1611((byte) -118) + class135.field2267;
            arg1.field2962 = class107.field1776.method1611((byte) -84) + class135.field2267;
            arg1.field2954 = class107.field1776.method1607(255);
            arg1.field2961 = 1;
            arg1.field3010 = 0;
        }
        if ((arg3 & 0x4) != 0) {
            int var18 = class107.field1776.method1598((byte) -87);
            if (var18 == 65535) {
                var18 = -1;
            }
            int var19 = class107.field1776.method1607(255);
            class88.method535(var18, arg2 - 32347, var19, arg1);
        }
        if ((arg3 & 0x2) != 0) {
            int var20 = class107.field1776.method1580(-19);
            byte[] var21 = new byte[var20];
            class225 var22 = new class225(var21);
            class107.field1776.method1582(true, 0, var20, var21);
            class134.field2254[arg0] = var22;
            arg1.method488(var22, 27);
        }
        if ((arg3 & 0x8) != 0) {
            arg1.field2988 = class107.field1776.method1593(true);
            if (arg1.field2988 == 65535) {
                arg1.field2988 = -1;
            }
        }
        if ((arg3 & 0x200) != 0) {
            arg1.field3009 = class107.field1776.method1563(true);
            int var23 = class107.field1776.method1562(21705);
            arg1.field3000 = 0;
            arg1.field2959 = 0;
            arg1.field3013 = (var23 & 0xFFFF) + class135.field2267;
            arg1.field2956 = var23 >> 16;
            if (arg1.field3009 == 65535) {
                arg1.field3009 = -1;
            }
            if (arg1.field3013 > class135.field2267) {
                arg1.field2959 = -1;
            }
            if (arg1.field3009 != -1 && class135.field2267 == arg1.field3013) {
                int var24 = class47.method323(arg2 ^ 0xFFFF90C0, arg1.field3009).field170;
                if (var24 != -1) {
                    class248 var25 = class67.method445((byte) -61, var24);
                    if (var25 != null && var25.field4419 != null) {
                        class252.method1750((byte) -8, arg1.field3003, arg1.field2972, var25, class175.field2946 == arg1, 0);
                    }
                }
            }
        }
        if ((arg3 & 0x20) == 0) {
            return;
        }
        int var26 = class107.field1776.method1607(arg2 - 32092);
        int var27 = class107.field1776.method1607(255);
        arg1.method1188(var26, var27, class135.field2267, 70);
        arg1.field2950 = class135.field2267 + 300;
        arg1.field2989 = class107.field1776.method1599((byte) -104);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BLva;)V")
    private final void method1665(byte arg0, class178 arg1) {
        class5 var3 = this.field4211;
        synchronized (this.field4211) {
            this.field4211.method22(77, arg1);
            this.field4217++;
            this.field4211.notifyAll();
        }
        field4212++;
        int var4 = 54 / ((-arg0 - 73) / 33);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lr;IZ)Lva;")
    public final class178 method1666(class59 arg0, int arg1, boolean arg2) {
        field4206++;
        class178 var4 = new class178();
        var4.field3056 = 3;
        var4.field4178 = arg2;
        var4.field2825 = (long) arg1;
        var4.field3054 = arg0;
        this.method1665((byte) 0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "([BLr;II)Lva;")
    public final class178 method1667(byte[] arg0, class59 arg1, int arg2, int arg3) {
        field4203++;
        class178 var5 = new class178();
        var5.field3056 = arg2;
        var5.field3058 = arg0;
        var5.field4178 = false;
        var5.field2825 = (long) arg3;
        var5.field3054 = arg1;
        this.method1665((byte) -117, var5);
        return var5;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIII)V")
    public static final void method1668(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != 1) {
            field4195 = null;
        }
        field4208++;
        int var6 = arg1 - arg5;
        int var7 = arg3 - arg2;
        if (var6 == 0) {
            if (var7 != 0) {
                class176.method1179(arg3, arg4, (byte) 100, arg5, arg2);
            }
        } else if (var7 == 0) {
            class194.method1379(arg5, arg0 ^ 0x3, arg2, arg4, arg1);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var7 > var6;
            if (var8) {
                int var9 = arg5;
                int var10 = arg1;
                arg1 = arg3;
                arg3 = var10;
                arg5 = arg2;
                arg2 = var9;
            }
            if (arg1 < arg5) {
                int var11 = arg2;
                arg2 = arg3;
                arg3 = var11;
                int var12 = arg5;
                arg5 = arg1;
                arg1 = var12;
            }
            int var13 = arg2;
            int var14 = arg3 - arg2;
            if (var14 < 0) {
                var14 = -var14;
            }
            int var15 = arg1 - arg5;
            int var16 = -(var15 >> 1);
            int var17 = arg3 <= arg2 ? -1 : 1;
            if (var8) {
                for (int var18 = arg5; var18 <= arg1; var18++) {
                    class232.field4151[var18][var13] = arg4;
                    var16 += var14;
                    if (var16 > 0) {
                        var16 -= var15;
                        var13 += var17;
                    }
                }
            } else {
                for (int var19 = arg5; var19 <= arg1; var19++) {
                    var16 += var14;
                    class232.field4151[var13][var19] = arg4;
                    if (var16 > 0) {
                        var16 -= var15;
                        var13 += var17;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "([Le;Z)[Le;")
    public static final class191[] method1669(class191[] arg0, boolean arg1) {
        field4207++;
        if (arg1) {
            method1670(-102, 18);
        }
        class191[] var2 = new class191[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class228.method1629(new class191[] { class92.method563(-115, var3), class179.field3066 }, (byte) -112);
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class228.method1629(new class191[] { var2[var3], arg0[var3] }, (byte) -121);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(II)V")
    public static final void method1670(int arg0, int arg1) {
        class244.field4348.method990(116, arg0);
        class61.field1099.method990(30, arg0);
        if (arg1 == -1) {
            field4193++;
            class137.field2290.method990(arg1 ^ 0xFFFFFFC1, arg0);
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
    public static void method1671(int arg0) {
        if (arg0 > -87) {
            return;
        }
        field4209 = null;
        field4205 = null;
        field4195 = null;
        field4200 = null;
        field4202 = null;
        field4199 = null;
        field4210 = null;
        field4192 = null;
        field4213 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILgg;IIII)V")
    public static final void method1672(int arg0, class57 arg1, int arg2, int arg3, int arg4, int arg5) {
        field4196++;
        if (arg0 >= -104 || arg1.field1063 == -1 && arg1.field1042 == null) {
            return;
        }
        int var6 = 0;
        if (arg3 > arg1.field1048) {
            var6 += arg3 - arg1.field1048;
        } else if (arg1.field1066 > arg3) {
            var6 += arg1.field1066 - arg3;
        }
        if (arg4 > arg1.field1065) {
            var6 += arg4 - arg1.field1065;
        } else if (arg1.field1060 > arg4) {
            var6 += arg1.field1060 - arg4;
        }
        if (arg1.field1046 == 0 || var6 - 64 > arg1.field1046 || class173.field2904 == 0 || arg1.field1055 != arg2) {
            if (arg1.field1058 != null) {
                class270.field4764.method504(arg1.field1058);
                arg1.field1058 = null;
            }
            if (arg1.field1047 != null) {
                class270.field4764.method504(arg1.field1047);
                arg1.field1047 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = (arg1.field1046 - var6) * class173.field2904 / arg1.field1046;
        if (arg1.field1058 != null) {
            arg1.field1058.method753(var7);
        } else if (arg1.field1063 >= 0) {
            class77 var8 = class77.method497(class137.field2303, arg1.field1063, 0);
            if (var8 != null) {
                class103 var9 = var8.method498().method647(class128.field2124);
                class116 var10 = class116.method754(var9, 100, var7);
                var10.method770(-1);
                class270.field4764.method502(var10);
                arg1.field1058 = var10;
            }
        }
        if (arg1.field1047 != null) {
            arg1.field1047.method753(var7);
            if (!arg1.field1047.method654(39)) {
                arg1.field1047 = null;
            }
        } else if (arg1.field1042 != null && (arg1.field1050 -= arg5) <= 0) {
            int var11 = (int) (Math.random() * (double) arg1.field1042.length);
            class77 var12 = class77.method497(class137.field2303, arg1.field1042[var11], 0);
            if (var12 != null) {
                class103 var13 = var12.method498().method647(class128.field2124);
                class116 var14 = class116.method754(var13, 100, var7);
                var14.method770(0);
                class270.field4764.method502(var14);
                arg1.field1050 = arg1.field1045 + ((int) (Math.random() * (double) (arg1.field1044 - arg1.field1045)));
                arg1.field1047 = var14;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
    public class236() {
        class80 var1 = class167.field2820.method1715(5, -88, this);
        while (var1.field1356 == 0) {
            class18.method142(true, 10L);
        }
        if (var1.field1356 == 2) {
            throw new RuntimeException();
        }
        this.field4214 = (Thread) var1.field1360;
    }
}
