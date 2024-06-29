import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class222 {

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "Lnb;")
    private class330 field3539 = new class330();

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
    private int field3533;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    private int field3527;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "Lol;")
    private class246 field3531;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "Ljava/lang/String;")
    public static String field3543 = "green:";

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)I", line = 5)
    public final int method1614(int arg0) {
        field3536++;
        int var2 = arg0;
        for (class93 var3 = (class93) this.field3539.method2286(-31893); var3 != null; var3 = (class93) this.field3539.method2285(false)) {
            if (!var3.method22((byte) -102)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V", line = 29)
    public final void method1615(int arg0) {
        for (class93 var2 = (class93) this.field3539.method2286(-31893); var2 != null; var2 = (class93) this.field3539.method2285(false)) {
            if (var2.method22((byte) -61)) {
                var2.method465((byte) -122);
                var2.method189(0);
                this.field3527++;
            }
        }
        field3532++;
        if (arg0 <= 32) {
            this.field3531 = (class246) null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BIIIIIIII)V", line = 53)
    public static final void method1616(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3529++;
        if (arg0 != 89) {
            field3535 = -17;
        }
        if (class204.method1498((byte) -127, arg7)) {
            class219.method1606(arg2, (byte) -39, class21.field309[arg7], arg3, arg4, arg8, arg1, -1, arg5, arg6);
        } else if (arg4 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class284.field4485[var9] = true;
            }
        } else {
            class284.field4485[arg4] = true;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V", line = 84)
    public static final void method1617(byte arg0) {
        int var1 = class336.field5213.method1535((byte) 108, 8);
        field3534++;
        if (arg0 != 13) {
            field3535 = 99;
        }
        if (var1 < class24.field350) {
            for (int var2 = var1; var2 < class24.field350; var2++) {
                class292.field4597[class225.field3584++] = class103.field1575[var2];
            }
        }
        if (class24.field350 < var1) {
            throw new RuntimeException("gppov1");
        }
        class24.field350 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class103.field1575[var3];
            class320 var5 = class100.field1523[var4];
            int var6 = class336.field5213.method1535((byte) 19, 1);
            if (var6 == 0) {
                class103.field1575[class24.field350++] = var4;
                var5.field2008 = class48.field648;
            } else {
                int var7 = class336.field5213.method1535((byte) 49, 2);
                if (var7 == 0) {
                    class103.field1575[class24.field350++] = var4;
                    var5.field2008 = class48.field648;
                    class318.field4946[class126.field1877++] = var4;
                } else if (var7 == 1) {
                    class103.field1575[class24.field350++] = var4;
                    var5.field2008 = class48.field648;
                    int var8 = class336.field5213.method1535((byte) 69, 3);
                    var5.method907(var8, 1, (byte) 127);
                    int var9 = class336.field5213.method1535((byte) 85, 1);
                    if (var9 == 1) {
                        class318.field4946[class126.field1877++] = var4;
                    }
                } else if (var7 == 2) {
                    class103.field1575[class24.field350++] = var4;
                    var5.field2008 = class48.field648;
                    if (class336.field5213.method1535((byte) 13, 1) == 1) {
                        int var10 = class336.field5213.method1535((byte) 27, 3);
                        var5.method907(var10, 2, (byte) 127);
                        int var11 = class336.field5213.method1535((byte) 20, 3);
                        var5.method907(var11, 2, (byte) 127);
                    } else {
                        int var12 = class336.field5213.method1535((byte) 31, 3);
                        var5.method907(var12, 0, (byte) 126);
                    }
                    int var13 = class336.field5213.method1535((byte) 34, 1);
                    if (var13 == 1) {
                        class318.field4946[class126.field1877++] = var4;
                    }
                } else if (var7 == 3) {
                    class292.field4597[class225.field3584++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lkb;Lkb;ILkb;Lkb;)V", line = 199)
    public static final void method1618(class39 arg0, class39 arg1, int arg2, class39 arg3, class39 arg4) {
        if (arg2 != 13255) {
            method1616((byte) 118, 16, 0, -29, 100, -8, -95, -60, 36);
        }
        class102.field1561 = arg1;
        class343.field5344 = arg4;
        class194.field3195 = arg3;
        field3528++;
        class283.field4475 = arg0;
        class21.field309 = new class160[class102.field1561.method271((byte) 113)][];
        class127.field1897 = new boolean[class102.field1561.method271((byte) -116)];
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(JI)Ljava/lang/Object;", line = 227)
    public final Object method1619(long arg0, int arg1) {
        field3541++;
        if (arg1 <= 36) {
            return (Object) null;
        }
        class93 var4 = (class93) this.field3531.method1743(arg0, (byte) -84);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method20((byte) -125);
        if (var5 == null) {
            var4.method465((byte) -122);
            var4.method189(0);
            this.field3527++;
            return null;
        }
        if (var4.method22((byte) -116)) {
            class5 var6 = new class5(var5);
            this.field3531.method1750(var6, (byte) 120, var4.field916);
            this.field3539.method2279(var6, (byte) -114);
            var6.field416 = 0L;
            var4.method465((byte) -122);
            var4.method189(0);
        } else {
            this.field3539.method2279(var4, (byte) -125);
            var4.field416 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)V", line = 271)
    public static final void method1620(int arg0, int arg1) {
        if (!class126.field1885) {
            arg0 = -1;
        }
        field3530++;
        if (class16.field208 == arg0) {
            return;
        }
        if (arg0 != arg1) {
            class52 var2 = class138.method933((byte) 78, arg0);
            class298 var3 = var2.method359((byte) -52);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class264.field4183.method44(var3.method607(), -95, var3.field5027, class338.field5247, new Point(var2.field705, var2.field710), var3.field5028);
                class16.field208 = arg0;
            }
        }
        if (arg0 == -1 && class16.field208 != -1) {
            class264.field4183.method44((int[]) null, 94, -1, class338.field5247, new Point(), -1);
            class16.field208 = -1;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(JILjava/lang/Object;)V", line = 314)
    public final void method1621(long arg0, int arg1, Object arg2) {
        field3542++;
        this.method1624((byte) 124, arg0);
        if (this.field3527 == 0) {
            class93 var5 = (class93) this.field3539.method2283(33);
            var5.method465((byte) -122);
            var5.method189(0);
        } else {
            this.field3527--;
        }
        int var6 = -78 / ((arg1 + 38) / 53);
        class5 var7 = new class5(arg2);
        this.field3531.method1750(var7, (byte) 127, arg0);
        this.field3539.method2279(var7, (byte) -106);
        var7.field416 = 0L;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Z)V", line = 341)
    public static void method1622(boolean arg0) {
        field3543 = null;
        if (arg0) {
            method1616((byte) 35, 82, 125, 124, 83, -92, 99, -116, 32);
        }
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(I)V", line = 360)
    public final void method1623(int arg0) {
        field3538++;
        this.field3539.method2281(37);
        this.field3531.method1745(-90);
        if (arg0 != 1) {
            this.field3539 = (class330) null;
        }
        this.field3527 = this.field3533;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BJ)V", line = 373)
    public final void method1624(byte arg0, long arg1) {
        field3537++;
        int var4 = 28 / ((39 - arg0) / 46);
        class93 var5 = (class93) this.field3531.method1743(arg1, (byte) 109);
        if (var5 != null) {
            var5.method465((byte) -122);
            var5.method189(0);
            this.field3527++;
        }
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(I)V", line = 393)
    public class222(int arg0) {
        this.field3533 = arg0;
        this.field3527 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3531 = new class246(var2);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IB)V", line = 415)
    public final void method1625(int arg0, byte arg1) {
        if (arg1 < 5) {
            return;
        }
        if (class218.field3499 != null) {
            for (class93 var3 = (class93) this.field3539.method2286(-31893); var3 != null; var3 = (class93) this.field3539.method2285(false)) {
                if (var3.method22((byte) 106)) {
                    if (var3.method20((byte) -107) == null) {
                        var3.method465((byte) -122);
                        var3.method189(0);
                        this.field3527++;
                    }
                } else if ((long) arg0 < ++var3.field416) {
                    class93 var4 = class218.field3499.method912(false, var3);
                    this.field3531.method1750(var4, (byte) 125, var3.field916);
                    class335.method2308(var4, (byte) -122, var3);
                    var3.method465((byte) -122);
                    var3.method189(0);
                }
            }
        }
        field3540++;
    }
}
