import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public abstract class class86 {

    @OriginalMember(owner = "client!th", name = "h", descriptor = "Lna;")
    public static class26 field1414 = class69.method505("::setparticles", (byte) -120);

    @OriginalMember(owner = "client!th", name = "l", descriptor = "[I")
    public static int[] field1418 = new int[100];

    @OriginalMember(owner = "client!th", name = "i", descriptor = "[I")
    public static int[] field1415 = new int[14];

    @OriginalMember(owner = "client!th", name = "n", descriptor = "Z")
    public static boolean field1420 = false;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!th", name = "r", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "[I")
    public static int[] field1421;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "[Lok;")
    public static class150[] field1412;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "[Lmm;")
    public static class256[] field1422;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "[Lbe;")
    public static class297[] field1419;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "[[Lbe;")
    public static class297[][] field1416;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(DI)V", line = 11)
    public static final void method667(double arg0, int arg1) {
        field1407++;
        if (class267.field4410 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class214.field3336[var3] = var4 > 255 ? 255 : var4;
            }
            class267.field4410 = arg0;
        }
        if (arg1 != 32258) {
            field1420 = false;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V", line = 42)
    public static void method668(int arg0) {
        field1412 = null;
        field1419 = null;
        field1416 = (class297[][]) null;
        if (arg0 != 0) {
            method668(-87);
        }
        field1422 = null;
        field1418 = null;
        field1414 = null;
        field1415 = null;
        field1421 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(III)Lth;", line = 68)
    public class86 method669(int arg0, int arg1, int arg2) {
        field1409++;
        return this;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZIIII)V", line = 83)
    public static final void method670(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        class291.field4847 = 0L;
        int var5 = class243.method1677(0);
        field1424++;
        if (arg1 == 3 || var5 == 3) {
            arg0 = true;
        }
        if (class156.field2436.startsWith("mac") && arg1 > 0) {
            arg0 = true;
        }
        if (arg2 != -8914) {
            method672(false, (byte) 90, (class266) null, (class248) null, (class266) null);
        }
        boolean var6 = false;
        if (var5 > 0 != arg1 > 0) {
            var6 = true;
        }
        if (arg0 && arg1 > 0) {
            var6 = true;
        }
        class103.method745(arg0, arg1, var6, var5, false, arg3, arg4);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIBIIII)I", line = 114)
    public static final int method671(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg5 & 0x1) == 1) {
            int var7 = arg0;
            arg0 = arg3;
            arg3 = var7;
        }
        int var8 = 121 % ((arg2 - 75) / 50);
        field1411++;
        int var9 = arg1 & 0x3;
        if (var9 == 0) {
            return arg6;
        } else if (var9 == 1) {
            return 7 + 1 - arg4 - arg0;
        } else if (var9 == 2) {
            return 1 + 7 - arg6 - arg3;
        } else {
            return arg4;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZBLve;Ldd;Lve;)V", line = 145)
    public static final void method672(boolean arg0, byte arg1, class266 arg2, class248 arg3, class266 arg4) {
        class312.field5339 = arg0;
        field1410++;
        class56.field905 = arg4;
        int var5 = -127 / ((arg1 + 87) / 32);
        class314.field5372 = arg2;
        int var6 = class314.field5372.method1877(0) - 1;
        class115.field1818 = class314.field5372.method1898(var6, (byte) 101) + var6 * 256;
        class122.field1906 = new class26[] { null, null, null, null, class109.field1735 };
        class82.field1305 = new class26[] { null, null, class315.field5398, null, null };
        class144.field2189 = arg3;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "()Z", line = 169)
    public boolean method673() {
        field1408++;
        return false;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lth;IIIZ)V", line = 178)
    public void method674(class86 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1413++;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BIIIII)V", line = 198)
    public static final void method677(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1417++;
        int var6 = arg2 - arg3;
        int var7 = arg4 - arg5;
        if (var7 == 0) {
            if (var6 != 0) {
                class20.method132(2, arg3, arg5, arg2, arg1);
            }
        } else if (var6 == 0) {
            class110.method778(arg1, arg3, arg4, (byte) -107, arg5);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            int var8 = -102 / ((-arg0 - 53) / 38);
            boolean var9 = var7 < var6;
            if (var9) {
                int var10 = arg5;
                arg5 = arg3;
                int var11 = arg4;
                arg3 = var10;
                arg4 = arg2;
                arg2 = var11;
            }
            if (arg4 < arg5) {
                int var12 = arg5;
                arg5 = arg4;
                arg4 = var12;
                int var13 = arg3;
                arg3 = arg2;
                arg2 = var13;
            }
            int var14 = arg3;
            int var15 = arg4 - arg5;
            int var16 = arg2 - arg3;
            int var17 = -(var15 >> 1);
            int var18 = arg2 <= arg3 ? -1 : 1;
            if (var16 < 0) {
                var16 = -var16;
            }
            if (var9) {
                for (int var20 = arg5; var20 <= arg4; var20++) {
                    class45.field710[var20][var14] = arg1;
                    var17 += var16;
                    if (var17 > 0) {
                        var14 += var18;
                        var17 -= var15;
                    }
                }
            } else {
                for (int var19 = arg5; var19 <= arg4; var19++) {
                    var17 += var16;
                    class45.field710[var14][var19] = arg1;
                    if (var17 > 0) {
                        var14 += var18;
                        var17 -= var15;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)V", line = 314)
    public static final void method678(boolean arg0) {
        field1423++;
        class225.field3568.method998((byte) -128);
        class306.field5280 = 1;
        if (!arg0) {
            class225.field3570 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIII)V")
    public abstract void method675(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIIIIIJILga;)V")
    public abstract void method676(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class19 arg10);

    @OriginalMember(owner = "client!th", name = "b", descriptor = "()I")
    public abstract int method679();
}
