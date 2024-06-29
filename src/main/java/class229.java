import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class229 implements Runnable {

    @OriginalMember(owner = "client!n", name = "j", descriptor = "Lr;")
    private class250 field3980 = new class250();

    @OriginalMember(owner = "client!n", name = "m", descriptor = "I")
    public int field3983 = 0;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "Z")
    private boolean field3982 = false;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "Ljava/lang/Thread;")
    private Thread field3986;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "Lsk;")
    public static class199 field3984 = new class199(64);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "Lhi;")
    public static class26 field3988;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILek;)V", line = 4)
    private final void method1614(int arg0, class251 arg1) {
        class250 var3 = this.field3980;
        synchronized (this.field3980) {
            this.field3980.method1737(arg1, arg0 ^ 0x65);
            this.field3983++;
            if (arg0 != 1) {
                field3988 = (class26) null;
            }
            this.field3980.notifyAll();
        }
        field3975++;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILpb;Z)Lek;", line = 24)
    public final class251 method1615(int arg0, class177 arg1, boolean arg2) {
        class251 var4 = new class251();
        field3973++;
        var4.field1703 = false;
        var4.field3426 = (long) arg0;
        var4.field4255 = 3;
        if (arg2) {
            var4.field4262 = arg1;
            this.method1614(1, var4);
            return var4;
        } else {
            return (class251) null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILpb;B[B)Lek;", line = 44)
    public final class251 method1616(int arg0, class177 arg1, byte arg2, byte[] arg3) {
        class251 var5 = new class251();
        if (arg2 > -47) {
            this.method1621((byte) 45);
        }
        field3985++;
        var5.field4249 = arg3;
        var5.field4255 = 2;
        var5.field4262 = arg1;
        var5.field3426 = (long) arg0;
        var5.field1703 = false;
        this.method1614(1, var5);
        return var5;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "()V", line = 63)
    public static final void method1617() {
        class84.field1378 = (class166[][][]) null;
        class96.field1563 = (int[][]) null;
        class41.field632 = (int[][][]) null;
        class173.field2790 = (class224[][]) null;
    }

    @OriginalMember(owner = "client!n", name = "run", descriptor = "()V", line = 75)
    public final void run() {
        while (!this.field3982) {
            class250 var1 = this.field3980;
            class251 var2;
            synchronized (this.field3980) {
                var2 = (class251) this.field3980.method1740((byte) -108);
                if (var2 == null) {
                    try {
                        this.field3980.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field3983--;
            }
            try {
                if (var2.field4255 == 2) {
                    var2.field4262.method1245(var2.field4249, (int) var2.field3426, var2.field4249.length, 0);
                } else if (var2.field4255 == 3) {
                    var2.field4249 = var2.field4262.method1248((int) var2.field3426, (byte) 17);
                }
            } catch (Exception var6) {
                class235.method1659(var6, (String) null, -28677);
            }
            var2.field1706 = false;
        }
        field3981++;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BIIII)V", line = 129)
    public static final void method1618(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= -102) {
            return;
        }
        field3979++;
        if (arg3 <= arg2) {
            class271.method1861(arg4, true, class282.field4817[arg1], arg2, arg3);
        } else {
            class271.method1861(arg4, true, class282.field4817[arg1], arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V", line = 373)
    public class229() {
        class147 var1 = class193.field3246.method1954(5, 0, this);
        while (var1.field2322 == 0) {
            class99.method792(-1, 10L);
        }
        if (var1.field2322 == 2) {
            throw new RuntimeException();
        }
        this.field3986 = (Thread) var1.field2323;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIII)V", line = 154)
    public static final void method1619(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3974++;
        for (int var6 = arg1; var6 <= (arg0 + arg1); var6++) {
            for (int var7 = arg3; var7 <= arg3 + arg5; var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class72.field1110[arg2][var7][var6] = 127;
                }
            }
        }
        if (arg4 != -105) {
            return;
        }
        for (int var8 = arg1; var8 < (arg0 + arg1); var8++) {
            for (int var9 = arg3; var9 < arg3 + arg5; var9++) {
                if (var9 >= 0 && var9 < 104 && var8 >= 0 && var8 < 104) {
                    class37.field569[arg2][var9][var8] = arg2 > 0 ? class37.field569[arg2 - 1][var9][var8] : 0;
                }
            }
        }
        if (arg3 > 0 && arg3 < 104) {
            for (int var10 = arg1 + 1; var10 < arg1 + arg0; var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class37.field569[arg2][arg3][var10] = class37.field569[arg2][arg3 - 1][var10];
                }
            }
        }
        if (arg1 > 0 && arg1 < 104) {
            for (int var11 = arg3 + 1; var11 < arg3 + arg5; var11++) {
                if (var11 >= 0 && var11 < 104) {
                    class37.field569[arg2][var11][arg1] = class37.field569[arg2][var11][arg1 - 1];
                }
            }
        }
        if (arg3 < 0 || arg1 < 0 || arg3 >= 104 || arg1 >= 104) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 > 0 && class37.field569[arg2][arg3 - 1][arg1] != 0) {
                class37.field569[arg2][arg3][arg1] = class37.field569[arg2][arg3 - 1][arg1];
            } else if (arg1 > 0 && class37.field569[arg2][arg3][arg1 - 1] != 0) {
                class37.field569[arg2][arg3][arg1] = class37.field569[arg2][arg3][arg1 - 1];
            } else if (arg3 > 0 && arg1 > 0 && class37.field569[arg2][arg3 - 1][arg1 - 1] != 0) {
                class37.field569[arg2][arg3][arg1] = class37.field569[arg2][arg3 - 1][arg1 - 1];
            }
        } else if (arg3 > 0 && class37.field569[arg2][arg3 - 1][arg1] != class37.field569[arg2 - 1][arg3 - 1][arg1]) {
            class37.field569[arg2][arg3][arg1] = class37.field569[arg2][arg3 - 1][arg1];
        } else if (arg1 > 0 && class37.field569[arg2][arg3][arg1 - 1] != class37.field569[arg2 - 1][arg3][arg1 - 1]) {
            class37.field569[arg2][arg3][arg1] = class37.field569[arg2][arg3][arg1 - 1];
        } else if (arg3 > 0 && arg1 > 0 && class37.field569[arg2 - 1][arg3 - 1][arg1 - 1] != class37.field569[arg2][arg3 - 1][arg1 - 1]) {
            class37.field569[arg2][arg3][arg1] = class37.field569[arg2][arg3 - 1][arg1 - 1];
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V", line = 270)
    public static void method1620(byte arg0) {
        if (arg0 != -102) {
            field3977 = -82;
        }
        field3988 = null;
        field3984 = null;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(B)V", line = 281)
    public final void method1621(byte arg0) {
        this.field3982 = true;
        if (arg0 != -20) {
            this.method1615(36, (class177) null, true);
        }
        field3972++;
        class250 var2 = this.field3980;
        synchronized (this.field3980) {
            this.field3980.notifyAll();
        }
        try {
            this.field3986.join();
        } catch (InterruptedException var5) {
        }
        this.field3986 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ZI)I", line = 300)
    public static final int method1622(boolean arg0, int arg1) {
        if (!arg0) {
            method1618((byte) -80, 100, -16, -125, 117);
        }
        field3987++;
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IBLpb;)Lek;", line = 319)
    public final class251 method1623(int arg0, byte arg1, class177 arg2) {
        if (arg1 < 110) {
            return (class251) null;
        }
        class251 var4 = new class251();
        field3976++;
        var4.field4255 = 1;
        class250 var5 = this.field3980;
        synchronized (this.field3980) {
            class251 var6 = (class251) this.field3980.method1742(255);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg0 == var6.field3426 && var6.field4262 == arg2 && var6.field4255 == 2) {
                    var4.field1706 = false;
                    var4.field4249 = var6.field4249;
                    return var4;
                }
                var6 = (class251) this.field3980.method1739((byte) 61);
            }
        }
        var4.field4249 = arg2.method1248(arg0, (byte) 17);
        var4.field1703 = true;
        var4.field1706 = false;
        return var4;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IZ)V", line = 352)
    public static final void method1624(int arg0, boolean arg1) {
        class150.field2361 = arg1;
        field3971++;
        if (arg0 != 0) {
            method1624(110, true);
        }
        class113.field1870 = !class149.method1073((byte) 121);
    }
}
