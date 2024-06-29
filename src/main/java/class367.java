import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class367 {

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "Lmf;")
    private class382 field5253 = new class382(64);

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "Lmf;")
    public class382 field5256 = new class382(50);

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "Lol;")
    public class255 field5257 = new class255(250);

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "Lqfa;")
    private class84 field5258 = new class84();

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "Lbs;")
    private class638 field5262;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "Lpu;")
    private class522 field5236;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
    public int field5254;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "Z")
    private boolean field5243;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "Lpu;")
    public class522 field5249;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "I")
    public int field5251;

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "[Ljava/lang/String;")
    private String[] field5259;

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "[Ljava/lang/String;")
    private String[] field5260;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "Z")
    public static boolean field5244 = false;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "Z")
    public static boolean field5247 = false;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field5240;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "I")
    public int field5261;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILkga;ZIILr;BLr;Lla;IIZ)Lf;", line = 11)
    public final class702 method2220(int arg0, class505 arg1, boolean arg2, int arg3, int arg4, class166 arg5, byte arg6, class166 arg7, class416 arg8, int arg9, int arg10, boolean arg11) {
        field5246++;
        class702 var13 = this.method2227(arg0, arg4, arg3, arg9, arg10, arg7, arg1, -21207);
        if (var13 != null) {
            return var13;
        }
        class186 var14 = this.method2228(arg10, 0);
        if (arg3 > 1 && var14.field2658 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (arg3 >= var14.field2625[var16] && var14.field2625[var16] != 0) {
                    var15 = var14.field2658[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method2228(var15, 0);
            }
        }
        int[] var17 = var14.method1243((byte) 108, arg0, arg1, arg2, arg4, arg8, arg3, arg5, arg7, arg9);
        if (var17 == null) {
            return null;
        }
        int var18 = -19 / ((-arg6 - 25) / 60);
        class702 var19;
        if (arg11) {
            var19 = arg5.method209(var17, 0, 36, 36, 32);
        } else {
            var19 = arg7.method209(var17, 0, 36, 36, 32);
        }
        if (!arg11) {
            class84 var20 = new class84();
            var20.field1379 = arg10;
            var20.field1385 = arg4;
            var20.field1380 = arg3;
            var20.field1388 = arg0;
            var20.field1378 = arg7.field2374;
            var20.field1381 = arg9;
            var20.field1386 = arg1 != null;
            this.field5257.method1706(var19, 1, var20);
        }
        return var19;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IB)V", line = 75)
    public final void method2221(int arg0, byte arg1) {
        field5245++;
        if (arg1 != -100) {
            this.method2229(-72);
        }
        class382 var3 = this.field5253;
        synchronized (this.field5253) {
            this.field5253.method2290(false, arg0);
        }
        class382 var4 = this.field5256;
        synchronized (this.field5256) {
            this.field5256.method2290(false, arg0);
        }
        class255 var5 = this.field5257;
        synchronized (this.field5257) {
            this.field5257.method1698(arg0, (byte) -15);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V", line = 97)
    public final void method2222(int arg0) {
        class382 var2 = this.field5253;
        synchronized (this.field5253) {
            this.field5253.method2279(0);
        }
        field5242++;
        class382 var3 = this.field5256;
        synchronized (this.field5256) {
            this.field5256.method2279(0);
        }
        class255 var4 = this.field5257;
        synchronized (this.field5257) {
            if (arg0 <= -99) {
                this.field5257.method1696(3);
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)V", line = 117)
    public final void method2223(int arg0, int arg1) {
        field5237++;
        this.field5261 = arg1;
        if (arg0 != 0) {
            this.field5254 = -41;
        }
        class382 var3 = this.field5256;
        synchronized (this.field5256) {
            this.field5256.method2285((byte) -124);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZZ)V", line = 133)
    public final void method2224(boolean arg0, boolean arg1) {
        field5240++;
        if (this.field5243 == arg0) {
            return;
        }
        this.field5243 = arg0;
        this.method2225(126);
        if (arg1) {
            this.method2222(25);
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V", line = 160)
    public final void method2225(int arg0) {
        class382 var2 = this.field5253;
        synchronized (this.field5253) {
            this.field5253.method2285((byte) -75);
        }
        field5238++;
        int var3 = -21 % ((12 - arg0) / 58);
        class382 var4 = this.field5256;
        synchronized (this.field5256) {
            this.field5256.method2285((byte) -82);
        }
        class255 var5 = this.field5257;
        synchronized (this.field5257) {
            this.field5257.method1700(107);
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V", line = 178)
    public final void method2226(int arg0) {
        field5250++;
        if (arg0 != 36) {
            this.field5251 = 62;
        }
        class382 var2 = this.field5256;
        synchronized (this.field5256) {
            this.field5256.method2285((byte) -90);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIILr;Lkga;I)Lf;", line = 192)
    public final class702 method2227(int arg0, int arg1, int arg2, int arg3, int arg4, class166 arg5, class505 arg6, int arg7) {
        this.field5258.field1380 = arg2;
        this.field5258.field1378 = arg5.field2374;
        this.field5258.field1388 = arg0;
        if (arg7 != -21207) {
            this.method2222(49);
        }
        this.field5258.field1386 = arg6 != null;
        this.field5258.field1379 = arg4;
        this.field5258.field1381 = arg3;
        field5239++;
        this.field5258.field1385 = arg1;
        return (class702) this.field5257.method1701(this.field5258, true);
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)Loc;", line = 212)
    public final class186 method2228(int arg0, int arg1) {
        field5255++;
        class382 var3 = this.field5253;
        class186 var4;
        synchronized (this.field5253) {
            var4 = (class186) this.field5253.method2287(1, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class522 var5 = this.field5236;
        byte[] var6;
        synchronized (this.field5236) {
            var6 = this.field5236.method3007(class471.method2773(arg0, false), class516.method2952(arg1, arg0), 5);
        }
        class186 var7 = new class186();
        var7.field2644 = arg0;
        var7.field2678 = this;
        var7.field2642 = new String[] { null, null, class274.field4123.method1804(7175, this.field5254), null, null };
        var7.field2661 = new String[] { null, null, null, null, class274.field4124.method1804(arg1 + 7175, this.field5254) };
        if (var6 != null) {
            var7.method1254(new class695(var6), -1);
        }
        var7.method1257(28193);
        if (~var7.field2683 != arg1) {
            var7.method1255(this.method2228(var7.field2683, 0), this.method2228(var7.field2617, arg1), (byte) -97);
        }
        if (var7.field2622 != -1) {
            var7.method1249(this.method2228(var7.field2622, 0), this.method2228(var7.field2686, 0), (byte) -15);
        }
        if (!this.field5243 && var7.field2680) {
            var7.field2629 = class274.field4121.method1804(7175, this.field5254);
            var7.field2661 = this.field5260;
            var7.field2687 = null;
            var7.field2614 = 0;
            var7.field2642 = this.field5259;
            var7.field2663 = false;
            if (var7.field2650 != null) {
                boolean var8 = false;
                for (class665 var9 = var7.field2650.method1407(102); var9 != null; var9 = var7.field2650.method1413(true)) {
                    class262 var10 = this.field5262.method3552((int) var9.field9386, -80);
                    if (var10.field3979) {
                        var9.method3678(arg1 - 1);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field2650 = null;
                }
            }
        }
        class382 var11 = this.field5253;
        synchronized (this.field5253) {
            this.field5253.method2291(var7, (long) arg0, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)V", line = 289)
    public final void method2229(int arg0) {
        field5248++;
        class255 var2 = this.field5257;
        synchronized (this.field5257) {
            this.field5257.method1700(119);
            if (arg0 != -14400) {
                this.field5243 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lkr;IZLbs;Lpu;Lpu;)V", line = 322)
    public class367(class693 arg0, int arg1, boolean arg2, class638 arg3, class522 arg4, class522 arg5) {
        this.field5262 = arg3;
        this.field5236 = arg4;
        this.field5254 = arg1;
        this.field5243 = arg2;
        this.field5249 = arg5;
        if (this.field5236 == null) {
            this.field5251 = 0;
        } else {
            int var7 = this.field5236.method2977((byte) -95) - 1;
            this.field5251 = this.field5236.method2988(-18, var7) + var7 * 256;
        }
        this.field5259 = new String[] { null, null, class274.field4123.method1804(7175, this.field5254), null, null };
        this.field5260 = new String[] { null, null, null, null, class274.field4124.method1804(7175, this.field5254) };
    }
}
