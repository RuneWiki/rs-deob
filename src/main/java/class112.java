import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class112 {

    @OriginalMember(owner = "client!i", name = "x", descriptor = "I")
    private int field2032 = 0;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "[Lia;")
    public class83[] field2021;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public int field2013;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "[Lwd;")
    public static class152[] field2014 = new class152[50];

    @OriginalMember(owner = "client!i", name = "o", descriptor = "[I")
    public static int[] field2023 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!i", name = "s", descriptor = "I")
    public static int field2027 = 0;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!i", name = "u", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!i", name = "v", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "J")
    private long field2010;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "Lsa;")
    public static class244 field2018;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "Lia;")
    private class83 field2017;

    @OriginalMember(owner = "client!i", name = "w", descriptor = "Lia;")
    private class83 field2031;

    @OriginalMember(owner = "client!i", name = "t", descriptor = "[I")
    public static int[] field2028;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)I")
    public final int method775(byte arg0) {
        field2020++;
        if (arg0 >= -94) {
            this.field2032 = 60;
        }
        return this.field2013;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)Lia;")
    public final class83 method776(int arg0) {
        field2022++;
        if (this.field2017 == null) {
            return null;
        }
        if (arg0 != 26952) {
            this.method777(true);
        }
        class83 var2 = this.field2021[(int) ((long) (this.field2013 - 1) & this.field2010)];
        while (this.field2017 != var2) {
            if (this.field2017.field1515 == this.field2010) {
                class83 var3 = this.field2017;
                this.field2017 = this.field2017.field1506;
                return var3;
            }
            this.field2017 = this.field2017.field1506;
        }
        this.field2017 = null;
        return null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V")
    public final void method777(boolean arg0) {
        field2019++;
        for (int var2 = 0; var2 < this.field2013; var2++) {
            class83 var3 = this.field2021[var2];
            while (true) {
                class83 var4 = var3.field1506;
                if (var3 == var4) {
                    break;
                }
                var4.method547(10026);
            }
        }
        if (!arg0) {
            this.field2032 = -117;
        }
        this.field2031 = null;
        this.field2017 = null;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I)I")
    public final int method778(int arg0) {
        field2011++;
        int var2 = 0;
        for (int var3 = arg0; var3 < this.field2013; var3++) {
            class83 var4 = this.field2021[var3];
            class83 var5 = var4.field1506;
            while (var4 != var5) {
                var5 = var5.field1506;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IJ)Lia;")
    public final class83 method779(int arg0, long arg1) {
        field2016++;
        this.field2010 = arg1;
        class83 var4 = this.field2021[(int) (arg1 & (long) (this.field2013 - 1))];
        for (this.field2017 = var4.field1506; this.field2017 != var4; this.field2017 = this.field2017.field1506) {
            if (this.field2017.field1515 == arg1) {
                class83 var6 = this.field2017;
                this.field2017 = this.field2017.field1506;
                return var6;
            }
        }
        int var5 = 38 % ((arg0 + 16) / 59);
        this.field2017 = null;
        return null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BJLia;)V")
    public final void method780(byte arg0, long arg1, class83 arg2) {
        field2030++;
        if (arg2.field1510 != null) {
            arg2.method547(arg0 + 10104);
        }
        if (arg0 != -78) {
            method787(-54);
        }
        class83 var5 = this.field2021[(int) (arg1 & (long) (this.field2013 - 1))];
        arg2.field1506 = var5;
        arg2.field1510 = var5.field1510;
        arg2.field1515 = arg1;
        arg2.field1510.field1506 = arg2;
        arg2.field1506.field1510 = arg2;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)I")
    public static final int method781(int arg0, int arg1) {
        field2015++;
        if (arg0 == 16711935) {
            return -1;
        } else {
            if (arg1 != -1) {
                field2018 = null;
            }
            return class169.method1146(arg0, true);
        }
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(I)Lia;")
    public final class83 method782(int arg0) {
        this.field2032 = arg0;
        field2025++;
        return this.method788(true);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method783(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2026++;
        if (arg6 < 128 || arg2 < 128 || arg6 > 13056 || arg2 > 13056) {
            class111.field1999 = -1;
            class85.field1536 = -1;
            return;
        }
        int var8 = class10.method68(true, class176.field2886, arg2, arg6) - arg0;
        int var9 = arg2 - class237.field3904;
        int var10 = var8 - class250.field4093;
        int var11 = arg6 - class56.field976;
        int var12 = class287.field4567[class228.field3844];
        int var13 = class287.field4567[class52.field914];
        int var14 = class287.field4562[class228.field3844];
        int var15 = class287.field4562[class52.field914];
        int var16 = var9 * var13 + (var11 * var15) >> 16;
        if (arg5 != -129) {
            field2018 = null;
        }
        int var17 = var9 * var15 - (var11 * var13) >> 16;
        int var19 = var10 * var14 - (var12 * var17) >> 16;
        int var20 = var10 * var12 + var14 * var17 >> 16;
        if (var20 < 50) {
            class85.field1536 = -1;
            class111.field1999 = -1;
        } else {
            class111.field1999 = arg7 + ((var19 << 9) / var20);
            class85.field1536 = (var16 << 9) / var20 + arg3;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III)J")
    public static final long method784(int arg0, int arg1, int arg2) {
        class109 var3 = class79.field1367[arg0][arg1][arg2];
        return var3 == null || var3.field1957 == null ? 0L : var3.field1957.field3577;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(II)Lnf;")
    public static final class14 method785(int arg0, int arg1) {
        field2024++;
        class14 var2 = (class14) class198.field3198.method57((long) arg0, arg1 - 120);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class147.field2506.method746(arg0, (byte) -128, arg1);
        class14 var4 = new class14();
        if (var3 != null) {
            var4.method85(arg0, new class101(var3), 106);
        }
        class198.field3198.method62(0, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILpb;IIBZ)V")
    public static final void method786(int arg0, class167 arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        field2029++;
        if (class31.field461 >= 50 || arg1 == null || arg1.field2741 == null || arg1.field2741.length <= arg2 || arg1.field2741[arg2] == null) {
            return;
        }
        int var6 = arg1.field2741[arg2][0];
        if (arg4 > -5) {
            method783(18, 0, -24, 93, -116, 94, -2, -89);
        }
        int var7 = var6 & 0x1F;
        int var8 = var6 >> 8;
        if (arg1.field2741[arg2].length > 1) {
            int var9 = (int) ((double) arg1.field2741[arg2].length * Math.random());
            if (var9 > 0) {
                var8 = arg1.field2741[arg2][var9];
            }
        }
        int var10 = var6 >> 5 & 0x7;
        if (var7 == 0) {
            if (arg5) {
                class31.method208(var8, var10, 0, 255, -126);
            }
        } else if (class196.field3167 != 0) {
            class245.field4018[class31.field461] = var8;
            class169.field2797[class31.field461] = var10;
            class135.field2360[class31.field461] = 0;
            int var11 = (arg3 - 64) / 128;
            int var12 = (arg0 - 64) / 128;
            class47.field829[class31.field461] = null;
            class56.field981[class31.field461] = 255;
            class25.field386[class31.field461] = (var11 << 16) + ((var12 << 8) + var7);
            class31.field461++;
        }
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(I)V")
    public static void method787(int arg0) {
        field2023 = null;
        field2028 = null;
        field2014 = null;
        field2018 = null;
        if (arg0 != 1391207625) {
            method786(-53, (class167) null, -109, -6, (byte) 76, false);
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(Z)Lia;")
    public final class83 method788(boolean arg0) {
        if (!arg0) {
            return null;
        }
        field2012++;
        if (this.field2032 > 0 && this.field2021[this.field2032 - 1] != this.field2031) {
            class83 var2 = this.field2031;
            this.field2031 = var2.field1506;
            return var2;
        }
        while (this.field2013 > this.field2032) {
            class83 var3 = this.field2021[this.field2032++].field1506;
            if (this.field2021[this.field2032 - 1] != var3) {
                this.field2031 = var3.field1506;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(II)I")
    public static int method789(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(I)V")
    public class112(int arg0) {
        this.field2021 = new class83[arg0];
        this.field2013 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class83 var3 = this.field2021[var2] = new class83();
            var3.field1506 = var3;
            var3.field1510 = var3;
        }
    }
}
