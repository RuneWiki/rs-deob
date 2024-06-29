import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class110 {

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "I")
    private int field1835 = 0;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "I")
    public int field1833;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "[Lfj;")
    public class240[] field1818;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "[I")
    public static int[] field1813 = new int[64];

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "[[I")
    public static int[][] field1816 = new int[5][5000];

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "Ljava/lang/String;")
    public static String field1826 = "Allocated memory";

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "[J")
    public static long[] field1824 = new long[200];

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "J")
    private long field1832;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "Lfj;")
    private class240 field1827;

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "Lfj;")
    private class240 field1834;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "([Lfj;I)I", line = 6)
    public final int method832(class240[] arg0, int arg1) {
        field1817++;
        int var3 = 0;
        if (arg1 < 125) {
            this.field1832 = -33L;
        }
        for (int var4 = 0; var4 < this.field1833; var4++) {
            class240 var5 = this.field1818[var4];
            for (class240 var6 = var5.field3739; var6 != var5; var6 = var6.field3739) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZJ)Lfj;", line = 39)
    public final class240 method833(boolean arg0, long arg1) {
        this.field1832 = arg1;
        class240 var4 = this.field1818[(int) (arg1 & (long) (this.field1833 - 1))];
        this.field1827 = var4.field3739;
        field1828++;
        while (this.field1827 != var4) {
            if (this.field1827.field3734 == arg1) {
                class240 var5 = this.field1827;
                this.field1827 = this.field1827.field3739;
                return var5;
            }
            this.field1827 = this.field1827.field3739;
        }
        this.field1827 = null;
        if (arg0) {
            return (class240) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V", line = 69)
    public static void method834(int arg0) {
        field1826 = null;
        if (arg0 <= 7) {
            field1826 = (String) null;
        }
        field1813 = null;
        field1816 = (int[][]) null;
        field1824 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIZLja;II)V", line = 87)
    public static final void method835(int arg0, int arg1, boolean arg2, class64 arg3, int arg4, int arg5) {
        class147.field2371 = arg1;
        if (arg5 >= -88) {
            method836((byte) 74, 125, 37);
        }
        class14.field264 = arg2;
        class34.field572 = arg3;
        class14.field268 = arg0;
        class312.field4900 = 10000;
        class326.field5060 = 1;
        class196.field3120 = arg4;
        field1822++;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BII)Lti;", line = 107)
    public static final class222 method836(byte arg0, int arg1, int arg2) {
        field1825++;
        if (arg0 > -69) {
            field1826 = (String) null;
        }
        class222 var3 = new class222();
        for (class169 var4 = (class169) class54.field852.method1490(200); var4 != null; var4 = (class169) class54.field852.method1487((byte) 117)) {
            if (var4.field2620 && var4.method1232(-69, arg1, arg2)) {
                var3.method1616(1, var4);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V", line = 137)
    public final void method837(boolean arg0) {
        for (int var2 = 0; var2 < this.field1833; var2++) {
            class240 var3 = this.field1818[var2];
            while (true) {
                class240 var4 = var3.field3739;
                if (var3 == var4) {
                    break;
                }
                var4.method1701(-91);
            }
        }
        this.field1827 = null;
        field1819++;
        this.field1834 = null;
        if (!arg0) {
            this.field1835 = -92;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)Lfj;", line = 168)
    public final class240 method838(byte arg0) {
        field1831++;
        if (this.field1827 == null) {
            return null;
        }
        class240 var2 = this.field1818[(int) (this.field1832 & (long) (this.field1833 - 1))];
        while (this.field1827 != var2) {
            if (this.field1827.field3734 == this.field1832) {
                class240 var3 = this.field1827;
                this.field1827 = this.field1827.field3739;
                return var3;
            }
            this.field1827 = this.field1827.field3739;
        }
        if (arg0 >= -57) {
            this.method838((byte) -41);
        }
        this.field1827 = null;
        return null;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)I", line = 203)
    public final int method839(int arg0) {
        field1814++;
        return arg0 > -118 ? -69 : this.field1833;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lwl;I)V", line = 216)
    public static final void method840(class89 arg0, int arg1) {
        if (arg1 < 11) {
            return;
        }
        field1820++;
        int var2 = arg0.field1415 - class205.field3252;
        int var3 = arg0.field1436 * 128 + (arg0.method200(-1) * 64);
        int var4 = arg0.field1371 * 128 + arg0.method200(-1) * 64;
        arg0.field1389 = 0;
        arg0.field1442 += (var3 - arg0.field1442) / var2;
        if (arg0.field1359 == 0) {
            arg0.field1395 = 1024;
        }
        if (arg0.field1359 == 1) {
            arg0.field1395 = 1536;
        }
        arg0.field1369 += (var4 - arg0.field1369) / var2;
        if (arg0.field1359 == 2) {
            arg0.field1395 = 0;
        }
        if (arg0.field1359 == 3) {
            arg0.field1395 = 512;
        }
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)Lfj;", line = 252)
    public final class240 method841(int arg0) {
        this.field1835 = arg0;
        field1815++;
        return this.method842((byte) -40);
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)Lfj;", line = 263)
    public final class240 method842(byte arg0) {
        if (arg0 != -40) {
            this.field1833 = 124;
        }
        field1823++;
        if (this.field1835 > 0 && this.field1818[this.field1835 - 1] != this.field1834) {
            class240 var2 = this.field1834;
            this.field1834 = var2.field3739;
            return var2;
        }
        class240 var3;
        do {
            if (this.field1833 <= this.field1835) {
                return null;
            }
            var3 = this.field1818[this.field1835++].field3739;
        } while (this.field1818[this.field1835 - 1] == var3);
        this.field1834 = var3.field3739;
        return var3;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIILnl;I)V", line = 299)
    public static final void method843(int arg0, int arg1, int arg2, class30 arg3, int arg4) {
        field1812++;
        if (class19.field356 == arg3 || class65.field1062 >= 400) {
            return;
        }
        String var5;
        if (arg3.field503 == 0) {
            boolean var6 = true;
            if (class19.field356.field491 != -1 && arg3.field491 != -1) {
                int var7 = class19.field356.field481 <= arg3.field481 ? arg3.field481 : class19.field356.field481;
                int var8 = arg3.field491 <= class19.field356.field491 ? arg3.field491 : class19.field356.field491;
                int var9 = var7 * 10 / 100 + var8 + 5;
                int var10 = class19.field356.field481 - arg3.field481;
                if (var10 < 0) {
                    var10 = -var10;
                }
                if (var9 < var10) {
                    var6 = false;
                }
            }
            String var11 = class141.field2241 == 1 ? class65.field1056 : class107.field1783;
            if (arg3.field501 <= arg3.field481) {
                var5 = arg3.method208((byte) 126) + (var6 ? class87.method627(0, class19.field356.field481, arg3.field481) : "<col=ffffff>") + " (" + var11 + arg3.field481 + ")";
            } else {
                var5 = arg3.method208((byte) 54) + (var6 ? class87.method627(arg4 - 1, class19.field356.field481, arg3.field481) : "<col=ffffff>") + " (" + var11 + arg3.field481 + "+" + (arg3.field501 - arg3.field481) + ")";
            }
        } else {
            var5 = arg3.method208((byte) 55) + " (" + class272.field4209 + arg3.field503 + ")";
        }
        if (class152.field2451 == 1) {
            class34.method236((short) 8, arg1, class57.field917, arg0, class89.field1364, (byte) 40, class258.field3979 + " -> <col=ffffff>" + var5, (long) arg2);
            class235.field3703++;
        } else if (!class219.field3514) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class222.field3566[var12] != null) {
                    class294.field4636++;
                    short var13 = 0;
                    boolean var14 = false;
                    if (class141.field2241 == 0 && class222.field3566[var12].equalsIgnoreCase(class18.field354)) {
                        if (arg3.field481 > class19.field356.field481) {
                            var13 = 2000;
                        }
                        if (class19.field356.field492 != 0 && arg3.field492 != 0) {
                            if (class19.field356.field492 == arg3.field492) {
                                var13 = 2000;
                            } else {
                                var13 = 0;
                            }
                        }
                    } else if (class207.field3274[var12]) {
                        var13 = 2000;
                    }
                    short var15 = class70.field1106[var12];
                    short var16 = (short) (var13 + var15);
                    class34.method236(var16, arg1, class222.field3566[var12], arg0, class327.field5066[var12], (byte) 40, "<col=ffffff>" + var5, (long) arg2);
                }
            }
        } else if ((class329.field5083 & 0x8) != 0) {
            class27.field447++;
            class34.method236((short) 47, arg1, class239.field3722, arg0, class306.field4820, (byte) 40, class82.field1232 + " -> <col=ffffff>" + var5, (long) arg2);
        }
        int var17 = 0;
        if (arg4 != 1) {
            field1824 = (long[]) null;
        }
        while (var17 < class65.field1062) {
            if (class12.field233[var17] == 35) {
                class13.field246[var17] = "<col=ffffff>" + var5;
                break;
            }
            var17++;
        }
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(I)I", line = 428)
    public final int method844(int arg0) {
        int var2 = 0;
        if (arg0 != 5) {
            this.field1832 = 94L;
        }
        for (int var3 = 0; var3 < this.field1833; var3++) {
            class240 var4 = this.field1818[var3];
            class240 var5 = var4.field3739;
            while (var4 != var5) {
                var5 = var5.field3739;
                var2++;
            }
        }
        field1829++;
        return var2;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lfj;BJ)V", line = 464)
    public final void method845(class240 arg0, byte arg1, long arg2) {
        int var5 = -58 % ((arg1 - 15) / 52);
        field1830++;
        if (arg0.field3736 != null) {
            arg0.method1701(-121);
        }
        class240 var6 = this.field1818[(int) ((long) (this.field1833 - 1) & arg2)];
        arg0.field3739 = var6;
        arg0.field3736 = var6.field3736;
        arg0.field3734 = arg2;
        arg0.field3736.field3739 = arg0;
        arg0.field3739.field3736 = arg0;
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(I)V", line = 487)
    public class110(int arg0) {
        this.field1833 = arg0;
        this.field1818 = new class240[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class240 var3 = this.field1818[var2] = new class240();
            var3.field3739 = var3;
            var3.field3736 = var3;
        }
    }
}
