import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class83 implements Runnable {

    @OriginalMember(owner = "client!je", name = "k", descriptor = "Ljo;")
    private class98 field1340 = new class98();

    @OriginalMember(owner = "client!je", name = "m", descriptor = "Z")
    private boolean field1342 = false;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public int field1343 = 0;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field1341;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "F")
    public static float field1331 = 0.0F;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "I")
    public static int field1345 = 0;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "[Ln;")
    public static class309[] field1330;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III)V", line = 4)
    public static final void method749(int arg0, int arg1, int arg2) {
        field1332++;
        if (arg1 == 8) {
            arg1 = 4;
        }
        if (arg1 == 4 && !class285.field4521) {
            arg0 = 2;
            arg1 = 2;
        }
        if (class290.field4627 != arg1) {
            if (class292.field4679) {
                return;
            }
            if (class290.field4627 != 0) {
                class259.field4204[class290.field4627].method243();
            }
            if (arg1 != 0) {
                class236 var3 = class259.field4204[arg1];
                var3.method245();
                var3.method239(arg0);
            }
            class290.field4627 = arg1;
            class135.field2353 = arg0;
        } else if (arg1 != 0 && class135.field2353 != arg0) {
            class259.field4204[arg1].method239(arg0);
            class135.field2353 = arg0;
        }
        if (arg2 <= 83) {
            field1331 = 0.056555826F;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIILuk;Luk;IIIIJ)V", line = 52)
    public static final void method750(int arg0, int arg1, int arg2, int arg3, class104 arg4, class104 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class44 var12 = new class44();
        var12.field701 = arg10;
        var12.field692 = arg1 * 128 + 64;
        var12.field702 = arg2 * 128 + 64;
        var12.field695 = arg3;
        var12.field700 = arg4;
        var12.field694 = arg5;
        var12.field689 = arg6;
        var12.field697 = arg7;
        var12.field687 = arg8;
        var12.field699 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class279.field4430[var13][arg1][arg2] == null) {
                class279.field4430[var13][arg1][arg2] = new class257(var13, arg1, arg2);
            }
        }
        class279.field4430[arg0][arg1][arg2].field4152 = var12;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IC)Z", line = 84)
    public static final boolean method751(int arg0, char arg1) {
        if (arg0 < 55) {
            field1330 = (class309[]) null;
        }
        field1333++;
        return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lg;IB)Laj;", line = 105)
    public final class1 method752(class177 arg0, int arg1, byte arg2) {
        field1334++;
        class1 var4 = new class1();
        var4.field10 = 1;
        class98 var5 = this.field1340;
        synchronized (this.field1340) {
            for (class1 var6 = (class1) this.field1340.method849(128); var6 != null; var6 = (class1) this.field1340.method850(-5714)) {
                if ((long) arg1 == var6.field2214 && var6.field7 == arg0 && var6.field10 == 2) {
                    var4.field12 = var6.field12;
                    var4.field3029 = false;
                    return var4;
                }
            }
        }
        var4.field12 = arg0.method1369(arg1, true);
        var4.field3029 = false;
        var4.field3033 = true;
        if (arg2 > -59) {
            method750(-55, 86, 100, 85, (class104) null, (class104) null, 49, 8, -49, 3, 36L);
        }
        return var4;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BLaj;)V", line = 140)
    private final void method753(byte arg0, class1 arg1) {
        field1337++;
        class98 var3 = this.field1340;
        synchronized (this.field1340) {
            this.field1340.method851(arg1, (byte) -44);
            if (arg0 < -50) {
                this.field1343++;
                this.field1340.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V", line = 157)
    public static final void method754(byte arg0) {
        field1344++;
        class34.field489 = 0;
        class119.field2067 = 0;
        class279.method1912((byte) 95);
        class321.method2203(120);
        class339.method2390(-120);
        int var1 = -24 / ((arg0 - 8) / 39);
        for (int var2 = 0; var2 < class34.field489; var2++) {
            int var3 = class180.field3037[var2];
            if (class181.field3045 != class320.field5071[var3].field2029) {
                if (class320.field5071[var3].field4413.method127(0)) {
                    class215.method1588(class320.field5071[var3], 16383);
                }
                class320.field5071[var3].method1908((class12) null, 24717);
                class320.field5071[var3] = null;
            }
        }
        if (class308.field4906 != class276.field4398.field5353) {
            throw new RuntimeException("gnp1 pos:" + class276.field4398.field5353 + " psize:" + class308.field4906);
        }
        for (int var4 = 0; var4 < class191.field3200; var4++) {
            if (class320.field5071[class33.field468[var4]] == null) {
                throw new RuntimeException("gnp2 pos:" + var4 + " size:" + class191.field3200);
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V", line = 210)
    public static void method755(int arg0) {
        field1330 = null;
        if (arg0 > -48) {
            method749(-98, -3, 37);
        }
    }

    @OriginalMember(owner = "client!je", name = "run", descriptor = "()V", line = 220)
    public final void run() {
        while (!this.field1342) {
            class98 var1 = this.field1340;
            class1 var2;
            synchronized (this.field1340) {
                var2 = (class1) this.field1340.method852(14278);
                if (var2 == null) {
                    try {
                        this.field1340.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field1343--;
            }
            try {
                if (var2.field10 == 2) {
                    var2.field7.method1370(var2.field12, 0, var2.field12.length, (int) var2.field2214);
                } else if (var2.field10 == 3) {
                    var2.field12 = var2.field7.method1369((int) var2.field2214, true);
                }
            } catch (Exception var6) {
                class88.method775(var6, (String) null, true);
            }
            var2.field3029 = false;
        }
        field1339++;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I[BLg;I)Laj;", line = 265)
    public final class1 method756(int arg0, byte[] arg1, class177 arg2, int arg3) {
        field1338++;
        class1 var5 = new class1();
        var5.field2214 = (long) arg0;
        var5.field7 = arg2;
        var5.field10 = arg3;
        var5.field12 = arg1;
        var5.field3033 = false;
        this.method753((byte) -77, var5);
        return var5;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BLg;I)Laj;", line = 282)
    public final class1 method757(byte arg0, class177 arg1, int arg2) {
        field1335++;
        class1 var4 = new class1();
        var4.field3033 = false;
        if (arg0 > -17) {
            return (class1) null;
        }
        var4.field10 = 3;
        var4.field2214 = (long) arg2;
        var4.field7 = arg1;
        this.method753((byte) -102, var4);
        return var4;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V", line = 315)
    public class83() {
        class45 var1 = class85.field1369.method551((byte) 100, this, 5);
        while (var1.field709 == 0) {
            class142.method1149(10L, (byte) 126);
        }
        if (var1.field709 == 2) {
            throw new RuntimeException();
        }
        this.field1341 = (Thread) var1.field712;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V", line = 342)
    public final void method758(int arg0) {
        this.field1342 = true;
        class98 var2 = this.field1340;
        synchronized (this.field1340) {
            this.field1340.notifyAll();
        }
        try {
            this.field1341.join();
        } catch (InterruptedException var5) {
        }
        field1346++;
        if (arg0 != 11791) {
            field1345 = 81;
        }
        this.field1341 = null;
    }
}
