import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 implements Runnable {

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "Lwc;")
    private class46 field29 = new class46();

    @OriginalMember(owner = "client!ro", name = "j", descriptor = "Z")
    private boolean field36 = false;

    @OriginalMember(owner = "client!ro", name = "k", descriptor = "I")
    public int field37 = 0;

    @OriginalMember(owner = "client!ro", name = "i", descriptor = "Ljava/lang/Thread;")
    private Thread field35;

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "Lh;")
    public static class434 field30 = new class434(36, 8);

    @OriginalMember(owner = "client!ro", name = "m", descriptor = "I")
    public static int field39 = 0;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!ro", name = "h", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!ro", name = "n", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!ro", name = "l", descriptor = "[I")
    public static int[] field38;

    @OriginalMember(owner = "client!ro", name = "run", descriptor = "()V", line = 3)
    public final void run() {
        while (!this.field36) {
            class46 var1 = this.field29;
            class289 var2;
            synchronized (this.field29) {
                var2 = (class289) this.field29.method334(27830);
                if (var2 == null) {
                    try {
                        this.field29.wait();
                    } catch (InterruptedException var6) {
                    }
                    continue;
                }
                this.field37--;
            }
            try {
                if (var2.field3898 == 2) {
                    var2.field3887.method1208(var2.field3901.length, var2.field3901, (byte) -58, (int) var2.field5532);
                } else if (var2.field3898 == 3) {
                    var2.field3901 = var2.field3887.method1210(-101, (int) var2.field5532);
                }
            } catch (Exception var7) {
                class228.method1278(var7, (String) null, -30116);
            }
            var2.field973 = false;
        }
        field31++;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIIII)Z", line = 48)
    public static final boolean method18(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class448.field6103[arg0][var8][var14] == -class288.field3885) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << class302.field4025) + 1;
            int var10 = (arg3 << class302.field4025) + 2;
            int var11 = class221.field2945[arg0].method371(arg1, arg3) + arg5;
            if (!class472.method2772(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << class302.field4025) - 1;
            if (!class472.method2772(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << class302.field4025) - 1;
            if (!class472.method2772(var9, var11, var13)) {
                return false;
            } else if (class472.method2772(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class17.method110(arg0, arg1, arg3)) {
            int var6 = arg1 << class302.field4025;
            int var7 = arg3 << class302.field4025;
            return class472.method2772(var6 + 1, class221.field2945[arg0].method371(arg1, arg3) + arg5, var7 + 1) && class472.method2772(class230.field3020 + var6 - 1, class221.field2945[arg0].method371(arg1 + 1, arg3) + arg5, var7 + 1) && class472.method2772(class230.field3020 + var6 - 1, class221.field2945[arg0].method371(arg1 + 1, arg3 + 1) + arg5, class230.field3020 + var7 - 1) && class472.method2772(var6 + 1, class221.field2945[arg0].method371(arg1, arg3 + 1) + arg5, class230.field3020 + var7 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(BLtd;)V", line = 110)
    private final void method19(byte arg0, class289 arg1) {
        class46 var3 = this.field29;
        synchronized (this.field29) {
            this.field29.method336(106, arg1);
            this.field37++;
            this.field29.notifyAll();
            int var4 = 93 % ((-arg0 - 52) / 46);
        }
        field34++;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V", line = 124)
    public static void method20(byte arg0) {
        field30 = null;
        field38 = null;
        if (arg0 <= 70) {
            field39 = 37;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IBLrq;)Ltd;", line = 139)
    public final class289 method21(int arg0, byte arg1, class213 arg2) {
        if (arg1 >= -85) {
            this.method23(false);
        }
        field33++;
        class289 var4 = new class289();
        var4.field3898 = 1;
        class46 var5 = this.field29;
        synchronized (this.field29) {
            class289 var6 = (class289) this.field29.method332(17948);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg0) == var6.field5532 && var6.field3887 == arg2 && var6.field3898 == 2) {
                    var4.field3901 = var6.field3901;
                    var4.field973 = false;
                    return var4;
                }
                var6 = (class289) this.field29.method331((byte) 99);
            }
        }
        var4.field3901 = arg2.method1210(-90, arg0);
        var4.field973 = false;
        var4.field976 = true;
        return var4;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILrq;Z)Ltd;", line = 174)
    public final class289 method22(int arg0, class213 arg1, boolean arg2) {
        field32++;
        if (!arg2) {
            return null;
        }
        class289 var4 = new class289();
        var4.field3887 = arg1;
        var4.field3898 = 3;
        var4.field976 = false;
        var4.field5532 = (long) arg0;
        this.method19((byte) -124, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Z)V", line = 192)
    public final void method23(boolean arg0) {
        this.field36 = true;
        field27++;
        class46 var2 = this.field29;
        synchronized (this.field29) {
            this.field29.notifyAll();
        }
        if (arg0) {
            field30 = null;
        }
        try {
            this.field35.join();
        } catch (InterruptedException var3) {
        }
        this.field35 = null;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "([BILrq;I)Ltd;", line = 211)
    public final class289 method24(byte[] arg0, int arg1, class213 arg2, int arg3) {
        field28++;
        if (arg3 < 3) {
            this.field36 = true;
        }
        class289 var5 = new class289();
        var5.field3901 = arg0;
        var5.field976 = false;
        var5.field5532 = (long) arg1;
        var5.field3887 = arg2;
        var5.field3898 = 2;
        this.method19((byte) -118, var5);
        return var5;
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(Lml;)V", line = 253)
    public class2(class241 arg0) {
        class474 var2 = arg0.method1351(5, 7000, this);
        while (var2.field6534 == 0) {
            class374.method2298(-28114, 10L);
        }
        if (var2.field6534 == 2) {
            throw new RuntimeException();
        }
        this.field35 = (Thread) var2.field6529;
    }
}
