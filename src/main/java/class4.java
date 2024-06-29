import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class4 extends class115 {

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "[J")
    private long[] field43 = new long[10];

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    private int field40 = 0;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "I")
    private int field49 = 1;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    private int field46 = 256;

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "J")
    private long field52 = class253.method1711((byte) -15);

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "Ljd;")
    public static class86 field41 = class122.method868("Fertigkeit:", true);

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "Z")
    public static boolean field50 = true;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "Ljd;")
    public static class86 field47 = class122.method868("::qa_op_test", true);

    @OriginalMember(owner = "client!vd", name = "z", descriptor = "Ljd;")
    public static class86 field55 = class122.method868("null", true);

    @OriginalMember(owner = "client!vd", name = "H", descriptor = "Z")
    public static boolean field63 = true;

    @OriginalMember(owner = "client!vd", name = "E", descriptor = "Luk;")
    public static class96 field60 = new class96(50);

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!vd", name = "x", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!vd", name = "y", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!vd", name = "A", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!vd", name = "B", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!vd", name = "C", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!vd", name = "D", descriptor = "I")
    private int field59;

    @OriginalMember(owner = "client!vd", name = "F", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!vd", name = "G", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!vd", name = "I", descriptor = "Lwj;")
    public static class6 field64;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
    public final void method18(int arg0) {
        if (arg0 == -1006) {
            field51++;
            for (int var2 = 0; var2 < 10; var2++) {
                this.field43[var2] = 0L;
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(BII)I")
    public static final int method19(byte arg0, int arg1, int arg2) {
        if (arg0 != 57) {
            method28(14);
        }
        int var3 = arg1 - 1 & arg2 >> 31;
        field42++;
        return ((arg2 >>> 31) + arg2) % arg1 + var3;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field45++;
        if (arg4 < 128 || arg5 < 128 || arg4 > 13056 || arg5 > 13056) {
            class56.field1153 = -1;
            class54.field1103 = -1;
            return;
        }
        int var8 = class30.method198(31482, arg4, arg5, class180.field3244) - arg0;
        int var9 = class145.field2746[class176.field3202];
        int var10 = arg4 - class70.field1430;
        int var11 = class145.field2742[class255.field4541];
        int var12 = class145.field2746[class255.field4541];
        int var13 = var8 - class88.field1748;
        int var14 = arg5 - field61;
        int var15 = class145.field2742[class176.field3202];
        int var16 = var9 * var14 + (var10 * var15) >> 16;
        if (arg1 != -1) {
            field61 = 3;
        }
        int var17 = var14 * var15 - (var9 * var10) >> 16;
        int var19 = var11 * var13 - (var12 * var17) >> 16;
        int var20 = var11 * var17 + var12 * var13 >> 16;
        if (var20 >= 50) {
            class56.field1153 = arg7 + ((var19 << 9) / var20);
            class54.field1103 = arg3 + ((var16 << 9) / var20);
        } else {
            class54.field1103 = -1;
            class56.field1153 = -1;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)V")
    public static final void method21(boolean arg0) {
        class118 var1 = class108.field2079;
        synchronized (class108.field2079) {
            class260.field4657++;
            if (arg0) {
                method22(-45);
            }
            class30.field643 = class104.field1983;
            if (class6.field97 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class9.field295[var2] = false;
                }
                class6.field97 = class9.field274;
            } else {
                while (class9.field274 != class6.field97) {
                    int var3 = class158.field2974[class9.field274];
                    class9.field274 = class9.field274 + 1 & 0x7F;
                    if (var3 >= 0) {
                        class9.field295[var3] = true;
                    } else {
                        class9.field295[~var3] = false;
                    }
                }
            }
            class104.field1983 = class27.field614;
        }
        field39++;
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(I)V")
    public static void method22(int arg0) {
        field47 = null;
        field60 = null;
        field41 = null;
        if (arg0 == -1855471984) {
            field55 = null;
            field64 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BII)I")
    public final int method23(byte arg0, int arg1, int arg2) {
        int var4 = this.field46;
        this.field46 = 300;
        int var5 = this.field49;
        this.field49 = 1;
        this.field52 = class253.method1711((byte) -80);
        if (this.field43[this.field59] == 0L) {
            this.field46 = var4;
            this.field49 = var5;
        } else if (this.field43[this.field59] < this.field52) {
            this.field46 = (int) ((long) (arg1 * 2560) / (this.field52 - this.field43[this.field59]));
        }
        field38++;
        if (this.field46 < 25) {
            this.field46 = 25;
        }
        if (this.field46 > 256) {
            this.field46 = 256;
            this.field49 = (int) ((long) arg1 - ((this.field52 - this.field43[this.field59]) / 10L));
        }
        if (this.field49 > arg1) {
            this.field49 = arg1;
        }
        this.field43[this.field59] = this.field52;
        this.field59 = (this.field59 + 1) % 10;
        if (this.field49 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field43[var6] != 0L) {
                    this.field43[var6] += (long) this.field49;
                }
            }
        }
        int var7 = 0;
        int var8 = 92 / ((arg0 - 57) / 41);
        if (arg2 > this.field49) {
            this.field49 = arg2;
        }
        class91.method677(0, (long) this.field49);
        while (this.field40 < 256) {
            this.field40 += this.field46;
            var7++;
        }
        this.field40 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lqk;BLjd;)I")
    public static final int method24(class200 arg0, byte arg1, class86 arg2) {
        if (arg1 < 62) {
            field61 = -63;
        }
        field54++;
        int var3 = arg0.field3565;
        arg0.method1416(arg2.field1704, (byte) 96);
        arg0.field3565 += class181.field3254.method535(0, arg2.field1670, arg0.field3565, arg0.field3547, 115, arg2.field1704);
        return arg0.field3565 - var3;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BLwj;)Z")
    public static final boolean method25(byte arg0, class6 arg1) {
        field48++;
        if (arg1.field100 == 205) {
            class213.field3837 = 250;
            return true;
        } else {
            int var2 = 75 / ((13 - arg0) / 61);
            return false;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZI)Ljd;")
    public static final class86 method26(boolean arg0, int arg1) {
        if (arg0) {
            field41 = null;
        }
        field56++;
        return class141.method1005(4709, 10, arg1, false);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILqk;)V")
    public static final void method27(int arg0, class200 arg1) {
        field62++;
        int var2 = arg1.method1402(20740);
        class186.field3292 = new class260[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class186.field3292[var3] = new class260();
            class186.field3292[var3].field4640 = arg1.method1402(20740);
            class186.field3292[var3].field4641 = arg1.method1397(true);
        }
        class82.field1609 = arg1.method1402(arg0 + 20741);
        class190.field3375 = arg1.method1402(20740);
        class122.field2359 = arg1.method1402(20740);
        class232.field4203 = new class239[class190.field3375 + 1 - class82.field1609];
        int var4 = 0;
        if (arg0 != -1) {
            field47 = null;
        }
        while (class122.field2359 > var4) {
            int var5 = arg1.method1402(arg0 + 20741);
            class239 var6 = class232.field4203[var5] = new class239();
            var6.field1722 = arg1.method1408((byte) -124);
            var6.field1733 = arg1.method1386(-4603);
            var6.field4307 = var5 + class82.field1609;
            var6.field4303 = arg1.method1397(true);
            var6.field4302 = arg1.method1397(true);
            var4++;
        }
        class203.field3680 = arg1.method1386(arg0 - 4602);
        class83.field1616 = true;
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
    public class4() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field43[var1] = this.field52;
        }
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)I")
    public static final int method28(int arg0) {
        field44++;
        if (arg0 != 10) {
            field47 = null;
        }
        return class147.field2767;
    }
}
