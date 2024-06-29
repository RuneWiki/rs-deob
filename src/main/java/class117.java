import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public class class117 {

    @OriginalMember(owner = "client!qea", name = "f", descriptor = "Z")
    private boolean field1454 = true;

    @OriginalMember(owner = "client!qea", name = "m", descriptor = "I")
    private int field1461 = -1;

    @OriginalMember(owner = "client!qea", name = "h", descriptor = "I")
    private int field1456;

    @OriginalMember(owner = "client!qea", name = "j", descriptor = "I")
    private int field1458;

    @OriginalMember(owner = "client!qea", name = "c", descriptor = "I")
    private int field1451;

    @OriginalMember(owner = "client!qea", name = "k", descriptor = "[Lol;")
    private class265[] field1459;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "I")
    private int field1449;

    @OriginalMember(owner = "client!qea", name = "g", descriptor = "[Lol;")
    private class265[] field1455;

    @OriginalMember(owner = "client!qea", name = "o", descriptor = "Lol;")
    private class265 field1463;

    @OriginalMember(owner = "client!qea", name = "d", descriptor = "Z")
    public static boolean field1452 = false;

    @OriginalMember(owner = "client!qea", name = "e", descriptor = "Lhd;")
    public static class694 field1453 = new class694(32);

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!qea", name = "l", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!qea", name = "n", descriptor = "I")
    private int field1462;

    @OriginalMember(owner = "client!qea", name = "p", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!qea", name = "q", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!qea", name = "r", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!qea", name = "s", descriptor = "I")
    private int field1467;

    @OriginalMember(owner = "client!qea", name = "i", descriptor = "Lxa;")
    private class468 field1457;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(B)V")
    public static void method789(byte arg0) {
        field1453 = null;
        if (arg0 >= -122) {
            method789((byte) 13);
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
    public static final String[] method790(int arg0, String[] arg1) {
        int var2 = 54 / ((arg0 - 56) / 34);
        field1460++;
        String[] var3 = new String[5];
        for (int var4 = 0; var4 < 5; var4++) {
            var3[var4] = var4 + ": ";
            if (arg1 != null && arg1[var4] != null) {
                var3[var4] = var3[var4] + arg1[var4];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(IIBIIIILoa;II)V")
    public final void method791(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, class650 arg7, int arg8, int arg9) {
        int var11 = arg4 + arg6 & 0x3FFF;
        field1465++;
        if (this.field1449 == -1) {
            arg7.method475(arg0, arg1, arg3, arg5, arg9, 0);
        } else {
            class152 var12 = class474.field5870.method2718(this.field1449, (byte) 72);
            if (this.field1457 == null && class474.field5870.method2717(this.field1449, false)) {
                int[] var13 = var12.field1829 ? class474.field5870.method2715(this.field1467, this.field1467, this.field1449, 0.7F, false, true) : class474.field5870.method2714(0.7F, this.field1449, this.field1467, 19991, false, this.field1467);
                this.field1457 = arg7.method428(var13, 0, this.field1467, this.field1467, this.field1467);
            }
            if (var12.field1829) {
                arg7.method475(arg0, arg1, arg3, arg5, arg9, 0);
            }
            if (this.field1457 != null) {
                int var14 = var12.field1829 ? 1 : 0;
                int var15 = arg5 * arg8 / -4096;
                int var16;
                for (var16 = arg5 * var11 / 4096 + (arg3 - arg5) / 2; var16 > arg5; var16 -= arg5) {
                }
                while (var16 < 0) {
                    var16 += arg5;
                }
                while (var15 > arg5) {
                    var15 -= arg5;
                }
                while (var15 < 0) {
                    var15 += arg5;
                }
                for (int var17 = var16 - arg5; var17 < arg3; var17 += arg5) {
                    for (int var18 = var15 - arg5; var18 < arg5; var18 += arg5) {
                        this.field1457.method1553(arg0 + var17, arg1 + var18, arg5, arg5, 1, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field1462 - 1; var19 >= 0; var19--) {
            this.field1455[var19].method1577(arg7, arg0, arg1, arg3, arg5, arg8, var11);
        }
        int var20 = -79 / ((arg2 + 54) / 46);
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(ILoa;I)Z")
    public final boolean method792(int arg0, class650 arg1, int arg2) {
        if (this.field1461 != arg2) {
            this.field1461 = arg2;
            int var4 = class217.method1256((byte) -64, arg2);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field1467 != var4) {
                this.field1457 = null;
                this.field1467 = var4;
            }
            if (this.field1459 != null) {
                this.field1462 = 0;
                int[] var5 = new int[this.field1459.length];
                for (int var6 = 0; var6 < this.field1459.length; var6++) {
                    class265 var7 = this.field1459[var6];
                    if (var7.method1572(this.field1451, this.field1458, this.field1456, this.field1461)) {
                        var5[this.field1462] = var7.field3347;
                        this.field1455[this.field1462++] = var7;
                    }
                }
                class527.method2845(this.field1455, 0, var5, this.field1462 - 1, 0);
            }
            this.field1454 = true;
        }
        if (arg0 != 0) {
            this.field1456 = -60;
        }
        field1464++;
        boolean var8 = false;
        if (this.field1454) {
            this.field1454 = false;
            for (int var9 = this.field1462 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field1455[var9].method1574(arg1, this.field1463);
                var8 |= var10;
                this.field1454 |= !var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)V")
    public final void method793(int arg0) {
        field1466++;
        if (this.field1459 != null) {
            for (int var2 = 0; var2 < this.field1459.length; var2++) {
                this.field1459[var2].method1576();
            }
        }
        this.field1457 = null;
        if (arg0 > -25) {
            this.field1467 = 58;
        }
    }

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "(I)[Lcf;")
    public static final class566[] method794(int arg0) {
        int var1 = -28 % ((arg0 - 48) / 60);
        field1450++;
        return new class566[] { class295.field3746, class295.field3747, class295.field3748, class295.field3749, class295.field3750, class295.field3751, class295.field3752, class295.field3753, class295.field3754, class295.field3755, class295.field3756, class295.field3757, class295.field3758, class295.field3759 };
    }

    @OriginalMember(owner = "client!qea", name = "<init>", descriptor = "(I[Lol;IIII)V")
    public class117(int arg0, class265[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1456 = arg5;
        this.field1458 = arg4;
        this.field1451 = arg3;
        this.field1459 = arg1;
        this.field1449 = arg0;
        if (arg1 == null) {
            this.field1463 = null;
            this.field1455 = null;
        } else {
            this.field1455 = new class265[arg1.length];
            this.field1463 = arg2 < 0 ? null : arg1[arg2];
        }
    }
}
