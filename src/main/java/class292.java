import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class292 {

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public static int field4623 = 0;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field4622 = -1;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public static int field4626 = 0;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "Lwj;")
    public static class130 field4625;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "Lbc;")
    public static class282 field4619;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field4624;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
    public static void method1953(boolean arg0) {
        if (arg0) {
            field4625 = null;
            field4619 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)Lnc;")
    public static final class243 method1954(int arg0, int arg1, int arg2) {
        class133 var3 = class6.field94[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field1934; var4++) {
            class243 var5 = var3.field1930[var4];
            if ((var5.field3539 >> 29 & 0x3L) == 2L && var5.field3540 == arg1 && var5.field3527 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZII[I[I)V")
    public static final void method1955(boolean arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        field4628++;
        if (arg2 > arg1) {
            int var5 = arg1;
            int var6 = (arg1 + arg2) / 2;
            int var7 = arg3[var6];
            arg3[var6] = arg3[arg2];
            arg3[arg2] = var7;
            int var8 = arg4[var6];
            arg4[var6] = arg4[arg2];
            arg4[arg2] = var8;
            for (int var9 = arg1; var9 < arg2; var9++) {
                if (((var9 & 0x1) + var7) < arg3[var9]) {
                    int var10 = arg3[var9];
                    arg3[var9] = arg3[var5];
                    arg3[var5] = var10;
                    int var11 = arg4[var9];
                    arg4[var9] = arg4[var5];
                    arg4[var5++] = var11;
                }
            }
            arg3[arg2] = arg3[var5];
            arg3[var5] = var7;
            arg4[arg2] = arg4[var5];
            arg4[var5] = var8;
            method1955(true, arg1, var5 - 1, arg3, arg4);
            method1955(true, var5 + 1, arg2, arg3, arg4);
        }
        if (!arg0) {
            method1954(67, -2, -99);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I[BLqi;)V")
    public final void method1956(int arg0, byte[] arg1, class216 arg2) {
        field4631++;
        if (arg2.field3030[arg2.field3021] != 31 || arg2.field3030[arg2.field3021 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field4624 == null) {
            this.field4624 = new Inflater(true);
        }
        try {
            this.field4624.setInput(arg2.field3030, arg2.field3021 + 10, -arg2.field3021 - 8 + -10 + arg2.field3030.length);
            this.field4624.inflate(arg1);
        } catch (Exception var4) {
            this.field4624.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        if (arg0 != -16850) {
            field4625 = null;
        }
        this.field4624.reset();
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
    public static final void method1957(int arg0) {
        field4627++;
        if (class253.field3661 == 2) {
            if (class17.field215 == class152.field2199 && class72.field866 == class257.field3719) {
                class253.field3661 = 0;
                if (class32.field380 && class260.field3784[81] && class112.field1496 > 2) {
                    class119.method773(0, class112.field1496 - 2);
                } else {
                    class119.method773(0, class112.field1496 - 1);
                }
            }
        } else if (class76.field905 == class17.field215 && class72.field866 == class190.field2736) {
            class253.field3661 = 0;
            if (class32.field380 && class260.field3784[81] && class112.field1496 > 2) {
                class119.method773(0, class112.field1496 - 2);
            } else {
                class119.method773(0, class112.field1496 - 1);
            }
        } else {
            class152.field2199 = class76.field905;
            class253.field3661 = 2;
            class257.field3719 = class190.field2736;
        }
        int var1 = 70 / ((42 - arg0) / 56);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IILra;III)V")
    public static final void method1958(int arg0, int arg1, class116 arg2, int arg3, int arg4, int arg5) {
        field4630++;
        if (~arg2.field1612 == arg1 && arg2.field1609 == null) {
            return;
        }
        int var6 = 0;
        if (arg3 > arg2.field1603) {
            var6 += arg3 - arg2.field1603;
        } else if (arg2.field1615 > arg3) {
            var6 += arg2.field1615 - arg3;
        }
        if (arg2.field1624 < arg5) {
            var6 += arg5 - arg2.field1624;
        } else if (arg2.field1607 > arg5) {
            var6 += arg2.field1607 - arg5;
        }
        int var7 = class95.field1277 * arg2.field1616 >> 8;
        if (arg2.field1621 == 0 || arg2.field1621 < (var6 - 64) || class95.field1277 == 0 || arg2.field1623 != arg0) {
            if (arg2.field1610 != null) {
                class14.field178.method189(arg2.field1610);
                arg2.field1610 = null;
            }
            if (arg2.field1622 != null) {
                class14.field178.method189(arg2.field1622);
                arg2.field1622 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg2.field1621 - var6) * var7 / arg2.field1621;
        if (arg2.field1610 != null) {
            arg2.field1610.method1828(var8);
        } else if (arg2.field1612 >= 0) {
            class186 var9 = class186.method1212(class61.field723, arg2.field1612, 0);
            if (var9 != null) {
                class295 var10 = var9.method1213().method1969(class23.field281);
                class278 var11 = class278.method1821(var10, 100, var8);
                var11.method1813(-1);
                class14.field178.method191(var11);
                arg2.field1610 = var11;
            }
        }
        if (arg2.field1622 != null) {
            arg2.field1622.method1828(var8);
            if (arg2.field1622.method1936((byte) 126)) {
                return;
            }
            arg2.field1622 = null;
        } else if (arg2.field1609 != null && (arg2.field1611 -= arg4) <= 0) {
            int var12 = (int) ((double) arg2.field1609.length * Math.random());
            class186 var13 = class186.method1212(class61.field723, arg2.field1609[var12], 0);
            if (var13 != null) {
                class295 var14 = var13.method1213().method1969(class23.field281);
                class278 var15 = class278.method1821(var14, 100, var8);
                var15.method1813(0);
                class14.field178.method191(var15);
                arg2.field1622 = var15;
                arg2.field1611 = (int) ((double) (arg2.field1618 - arg2.field1620) * Math.random()) + arg2.field1620;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1959(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4621++;
        if (arg4 < 128 || arg7 < 128 || arg4 > 13056 || arg7 > 13056) {
            class118.field1678 = -1;
            field4622 = -1;
            return;
        }
        int var8 = class4.method21(arg7, class199.field2833, arg4, (byte) 26) - arg5;
        int var9 = class297.field4697[class280.field4246];
        int var10 = class297.field4697[class138.field2010];
        if (arg0 != 0) {
            return;
        }
        int var11 = class297.field4698[class280.field4246];
        int var12 = arg4 - class245.field3560;
        int var13 = arg7 - class204.field2902;
        int var14 = var8 - class225.field3172;
        int var15 = class297.field4698[class138.field2010];
        int var16 = var10 * var13 + var12 * var15 >> 16;
        int var17 = var13 * var15 - (var10 * var12) >> 16;
        int var19 = var11 * var14 - (var9 * var17) >> 16;
        int var20 = var9 * var14 + (var11 * var17) >> 16;
        if (var20 >= 50) {
            class118.field1678 = arg2 + ((var16 << 9) / var20);
            field4622 = (var19 << 9) / var20 + arg3;
        } else {
            field4622 = -1;
            class118.field1678 = -1;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IILah;IIII)Lah;")
    public static final class106 method1960(int arg0, int arg1, class106 arg2, int arg3, int arg4, int arg5, int arg6) {
        field4629++;
        long var7 = (long) arg4;
        class106 var9 = (class106) class243.field3544.method65((byte) -102, var7);
        if (var9 == null) {
            class113 var10 = class113.method719(class217.field3074, arg4, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method714(64, 768, -50, -10, -50);
            class243.field3544.method64(var7, -1, var9);
        }
        if (arg6 != 27382) {
            return null;
        }
        int var11 = arg2.method652();
        int var12 = arg2.method654();
        int var13 = arg2.method653();
        int var14 = arg2.method661();
        class106 var15 = var9.method664(true, true, true);
        if (arg0 != 0) {
            var15.method644(arg0);
        }
        class275 var16 = (class275) var15;
        if (arg1 != class4.method21(arg5 + var13, class199.field2833, arg3 + var11, (byte) 26) || arg1 != class4.method21(arg5 + var14, class199.field2833, arg3 + var12, (byte) 26)) {
            for (int var17 = 0; var17 < var16.field4119; var17++) {
                var16.field4146[var17] += class4.method21(var16.field4115[var17] + arg5, class199.field2833, var16.field4139[var17] + arg3, (byte) 26) - arg1;
            }
            var16.field4125 = false;
        }
        return var15;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
    public class292() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
    public static final void method1961(byte arg0) {
        if (arg0 <= -1) {
            class204.field2898.method71(-127);
            field4620++;
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(III)V")
    private class292(int arg0, int arg1, int arg2) {
    }
}
