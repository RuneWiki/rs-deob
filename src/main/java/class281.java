import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class281 {

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "Llc;")
    private class86 field4446 = new class86();

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    private int field4441;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    private int field4438;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "Luc;")
    private class39 field4443;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "Lwh;")
    private static class198 field4436 = class181.method1236(0);

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "Loh;")
    public static class281 field4450 = new class281(64);

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "[I")
    public static int[] field4451 = new int[5];

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "[I")
    public static int[] field4452 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IJLjava/lang/Object;)V")
    public final void method1886(int arg0, long arg1, Object arg2) {
        this.method1896((byte) -30, arg1);
        field4439++;
        if (this.field4441 == 0) {
            class2 var5 = (class2) this.field4446.method605(0);
            var5.method1123(0);
            var5.method174(31388);
        } else {
            this.field4441--;
        }
        if (arg0 >= -47) {
            field4436 = null;
        }
        class28 var6 = new class28(arg2);
        this.field4443.method281(1, arg1, var6);
        this.field4446.method604(var6, -105);
        var6.field273 = 0L;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
    public final Object method1887(int arg0, long arg1) {
        field4432++;
        class2 var4 = (class2) this.field4443.method285(arg1, 13821);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method7((byte) -118);
        if (arg0 != 0) {
            return null;
        } else if (var5 == null) {
            var4.method1123(0);
            var4.method174(31388);
            this.field4441++;
            return null;
        } else {
            if (var4.method8(1)) {
                class28 var6 = new class28(var5);
                this.field4443.method281(1, var4.field2603, var6);
                this.field4446.method604(var6, -105);
                var6.field273 = 0L;
                var4.method1123(arg0);
                var4.method174(31388);
            } else {
                this.field4446.method604(var4, -105);
                var4.field273 = 0L;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    public final void method1888(int arg0) {
        field4433++;
        int var2 = -82 / ((62 - arg0) / 32);
        for (class2 var3 = (class2) this.field4446.method607((byte) 104); var3 != null; var3 = (class2) this.field4446.method611((byte) -2)) {
            if (var3.method8(1)) {
                var3.method1123(0);
                var3.method174(31388);
                this.field4441++;
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V")
    public static final void method1889(byte arg0) {
        field4447++;
        int var1 = 37 / ((52 - arg0) / 39);
        if (class39.field551 == 30) {
            client.method1042(false, 25);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIB)I")
    public static final int method1890(int arg0, int arg1, byte arg2) {
        field4437++;
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        if (arg2 != 12) {
            method1892(false, true, (class235) null, (class235) null);
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)V")
    public static final void method1891(int arg0, int arg1) {
        class113.field1847.method1897(true, arg0);
        if (arg1 != -127) {
            field4436 = null;
        }
        class62.field1072.method1897(true, arg0);
        field4442++;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZZLhc;Lhc;)V")
    public static final void method1892(boolean arg0, boolean arg1, class235 arg2, class235 arg3) {
        class2.field10 = arg3;
        class218.field3372 = arg2;
        field4435++;
        class97.field1632 = arg1;
        if (!arg0) {
            field4436 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(B)V")
    public static final void method1893(byte arg0) {
        field4449++;
        int var1 = 0;
        if (arg0 != -101) {
            return;
        }
        while (var1 < class141.field2155) {
            int var2 = class244.field3972[var1];
            class236 var3 = class210.field3267[var2];
            int var4 = class236.field3814.method633(arg0 ^ 0xFFFFFFD9);
            if ((var4 & 0x40) != 0) {
                var4 += class236.field3814.method633(82) << 8;
            }
            class189.method1272(10454, var4, var2, var3);
            var1++;
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V")
    public static void method1894(int arg0) {
        int var1 = 97 % ((23 - arg0) / 32);
        field4450 = null;
        field4452 = null;
        field4436 = null;
        field4451 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)I")
    public final int method1895(boolean arg0) {
        field4440++;
        int var2 = 0;
        if (!arg0) {
            this.field4438 = 23;
        }
        for (class2 var3 = (class2) this.field4446.method607((byte) 59); var3 != null; var3 = (class2) this.field4446.method611((byte) -2)) {
            if (!var3.method8(1)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BJ)V")
    public final void method1896(byte arg0, long arg1) {
        if (arg0 != -30) {
            method1892(false, true, (class235) null, (class235) null);
        }
        field4445++;
        class2 var4 = (class2) this.field4443.method285(arg1, 13821);
        if (var4 != null) {
            var4.method1123(0);
            var4.method174(31388);
            this.field4441++;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZI)V")
    public final void method1897(boolean arg0, int arg1) {
        if (!arg0) {
            return;
        }
        if (field4436 != null) {
            for (class2 var3 = (class2) this.field4446.method607((byte) 97); var3 != null; var3 = (class2) this.field4446.method611((byte) -2)) {
                if (var3.method8(1)) {
                    if (var3.method7((byte) -118) == null) {
                        var3.method1123(0);
                        var3.method174(31388);
                        this.field4441++;
                    }
                } else if (((long) arg1) < (++var3.field273)) {
                    class2 var4 = field4436.method532((byte) -74, var3);
                    this.field4443.method281(1, var3.field2603, var4);
                    class125.method868(var3, var4, 124);
                    var3.method1123(0);
                    var3.method174(31388);
                }
            }
        }
        field4448++;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(I)V")
    public class281(int arg0) {
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field4441 = arg0;
        this.field4438 = arg0;
        this.field4443 = new class39(var2);
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(B)V")
    public final void method1898(byte arg0) {
        this.field4446.method603((byte) 111);
        field4444++;
        this.field4443.method290(-7981);
        this.field4441 = this.field4438;
        int var2 = 33 % ((-arg0 - 42) / 37);
    }
}
