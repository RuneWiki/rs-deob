import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class100 implements Runnable {

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "Lc;")
    private class70 field1779 = new class70();

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "Z")
    private boolean field1791 = false;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    public int field1792 = 0;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "Ljava/lang/Thread;")
    private Thread field1794;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "Lke;")
    public static class256 field1777 = class316.method2202("<img=1>", 27626);

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field1775 = 0;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "Lke;")
    public static class256 field1780 = class316.method2202("Speicher wird zugewiesen)3", 27626);

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "Lke;")
    public static class256 field1784 = class316.method2202("::fps ", 27626);

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "Lke;")
    public static class256 field1790 = class316.method2202("overlay2", 27626);

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "Lvm;")
    public static class297 field1785 = new class297(64);

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "Lke;")
    public static class256 field1795 = class316.method2202("Weiter", 27626);

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "Lke;")
    public static class256 field1793 = class316.method2202("Chargement des interfaces )2 ", 27626);

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "F")
    public static float field1788;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "Lla;")
    public static class188 field1774;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lhc;I)V", line = 4)
    private final void method716(class54 arg0, int arg1) {
        field1783++;
        class70 var3 = this.field1779;
        synchronized (this.field1779) {
            this.field1779.method537(arg0, -1);
            this.field1792++;
            this.field1779.notifyAll();
            if (arg1 != 0) {
                field1788 = 1.2426251F;
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ltj;ZI)Lhc;", line = 20)
    public final class54 method717(class75 arg0, boolean arg1, int arg2) {
        field1781++;
        class54 var4 = new class54();
        var4.field985 = 1;
        class70 var5 = this.field1779;
        synchronized (this.field1779) {
            class54 var6 = (class54) this.field1779.method534(107);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg2 == var6.field539 && var6.field994 == arg0 && var6.field985 == 2) {
                    var4.field5342 = false;
                    var4.field988 = var6.field988;
                    return var4;
                }
                var6 = (class54) this.field1779.method536((byte) -78);
            }
        }
        var4.field988 = arg0.method568(arg2, 6456);
        var4.field5344 = arg1;
        var4.field5342 = false;
        return var4;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ltj;BI)Lhc;", line = 56)
    public final class54 method718(class75 arg0, byte arg1, int arg2) {
        field1789++;
        class54 var4 = new class54();
        var4.field539 = (long) arg2;
        var4.field5344 = false;
        var4.field985 = 3;
        int var5 = 32 % ((arg1 + 75) / 48);
        var4.field994 = arg0;
        this.method716(var4, 0);
        return var4;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB[Lke;I)Lke;", line = 79)
    public static final class256 method719(int arg0, byte arg1, class256[] arg2, int arg3) {
        field1782++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg3; var5++) {
            if (arg2[arg0 + var5] == null) {
                arg2[arg0 + var5] = class155.field2766;
            }
            var4 += arg2[arg0 + var5].field4384;
        }
        if (arg1 != -26) {
            field1774 = (class188) null;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg3; var8++) {
            class256 var9 = arg2[arg0 + var8];
            class299.method2092(var9.field4380, 0, var6, var7, var9.field4384);
            var7 += var9.field4384;
        }
        class256 var10 = new class256();
        var10.field4384 = var4;
        var10.field4380 = var6;
        return var10;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V", line = 124)
    public final void method720(byte arg0) {
        this.field1791 = true;
        class70 var2 = this.field1779;
        synchronized (this.field1779) {
            this.field1779.notifyAll();
        }
        int var4 = -39 % ((arg0 + 13) / 38);
        field1778++;
        try {
            this.field1794.join();
        } catch (InterruptedException var6) {
        }
        this.field1794 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)I", line = 151)
    public static int method721(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILtj;[BI)Lhc;", line = 163)
    public final class54 method722(int arg0, class75 arg1, byte[] arg2, int arg3) {
        field1776++;
        class54 var5 = new class54();
        var5.field539 = (long) arg3;
        var5.field985 = 2;
        int var6 = 7 / ((arg0 - 63) / 60);
        var5.field994 = arg1;
        var5.field5344 = false;
        var5.field988 = arg2;
        this.method716(var5, 0);
        return var5;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V", line = 184)
    public static void method723(int arg0) {
        field1780 = null;
        field1777 = null;
        field1790 = null;
        if (arg0 != 2) {
            field1780 = (class256) null;
        }
        field1774 = null;
        field1784 = null;
        field1795 = null;
        field1785 = null;
        field1793 = null;
    }

    @OriginalMember(owner = "client!ae", name = "run", descriptor = "()V", line = 203)
    public final void run() {
        while (!this.field1791) {
            class70 var1 = this.field1779;
            class54 var2;
            synchronized (this.field1779) {
                var2 = (class54) this.field1779.method538(86);
                if (var2 == null) {
                    try {
                        this.field1779.wait();
                    } catch (InterruptedException var6) {
                    }
                    continue;
                }
                this.field1792--;
            }
            try {
                if (var2.field985 == 2) {
                    var2.field994.method569(true, var2.field988, (int) var2.field539, var2.field988.length);
                } else if (var2.field985 == 3) {
                    var2.field988 = var2.field994.method568((int) var2.field539, 6456);
                }
            } catch (Exception var7) {
                class7.method48((String) null, (byte) 90, var7);
            }
            var2.field5342 = false;
        }
        field1787++;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V", line = 355)
    public class100() {
        class82 var1 = class272.field4658.method20(5, this, (byte) 122);
        while (var1.field1500 == 0) {
            class46.method381(10L, 43);
        }
        if (var1.field1500 == 2) {
            throw new RuntimeException();
        }
        this.field1794 = (Thread) var1.field1499;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILla;BI)V", line = 253)
    public static final void method724(int arg0, class188 arg1, byte arg2, int arg3) {
        if (arg1.field3437 == 0) {
            arg1.field3333 = arg1.field3389;
        } else if (arg1.field3437 == 1) {
            arg1.field3333 = (arg0 - arg1.field3343) / 2 + arg1.field3389;
        } else if (arg1.field3437 == 2) {
            arg1.field3333 = arg0 - arg1.field3389 - arg1.field3343;
        } else if (arg1.field3437 == 3) {
            arg1.field3333 = arg1.field3389 * arg0 >> 14;
        } else if (arg1.field3437 == 4) {
            arg1.field3333 = (arg1.field3389 * arg0 >> 14) + (arg0 - arg1.field3343) / 2;
        } else {
            arg1.field3333 = arg0 - (arg1.field3389 * arg0 >> 14) - arg1.field3343;
        }
        if (arg1.field3372 == 0) {
            arg1.field3400 = arg1.field3403;
        } else if (arg1.field3372 == 1) {
            arg1.field3400 = (arg3 - arg1.field3391) / 2 + arg1.field3403;
        } else if (arg1.field3372 == 2) {
            arg1.field3400 = arg3 - arg1.field3391 - arg1.field3403;
        } else if (arg1.field3372 == 3) {
            arg1.field3400 = arg1.field3403 * arg3 >> 14;
        } else if (arg1.field3372 == 4) {
            arg1.field3400 = (arg1.field3403 * arg3 >> 14) + (arg3 - arg1.field3391) / 2;
        } else {
            arg1.field3400 = arg3 - (arg1.field3403 * arg3 >> 14) - arg1.field3391;
        }
        if (arg2 != 74) {
            field1788 = 0.5008306F;
        }
        if (class37.field654 && (client.method828(arg1) != 0 || arg1.field3467 == 0)) {
            if (arg1.field3333 < 0) {
                arg1.field3333 = 0;
            } else if ((arg1.field3343 + arg1.field3333) > arg0) {
                arg1.field3333 = arg0 - arg1.field3343;
            }
            if (arg1.field3400 < 0) {
                arg1.field3400 = 0;
            } else if ((arg1.field3400 + arg1.field3391) > arg3) {
                arg1.field3400 = arg3 - arg1.field3391;
            }
        }
        field1786++;
    }
}
