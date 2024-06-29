import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class87 {

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    private int field2018 = -1;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
    private int field2024 = 0;

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "Lpg;")
    private class141 field2031 = new class141();

    @OriginalMember(owner = "client!jg", name = "u", descriptor = "Z")
    public boolean field2032 = false;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    private int field2014;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "[Lmg;")
    private class114[] field2013;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    private int field2017;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "[[[I")
    private int[][][] field2021;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "Ljava/util/Random;")
    public static Random field2016 = new Random();

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
    public static int field2026 = 0;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "I")
    public static int field2029 = 0;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "Lea;")
    public static class38 field2027 = class9.method46((byte) 123, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "[I")
    public static int[] field2019;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method720(boolean arg0, int arg1) {
        if (arg0) {
            this.field2032 = true;
        }
        field2020++;
        if (this.field2017 == this.field2014) {
            this.field2032 = this.field2013[arg1] == null;
            this.field2013[arg1] = class36.field758;
            return this.field2021[arg1];
        } else if (this.field2017 == 1) {
            this.field2032 = this.field2018 != arg1;
            this.field2018 = arg1;
            return this.field2021[0];
        } else {
            class114 var3 = this.field2013[arg1];
            if (this.field2032 = var3 == null) {
                if (this.field2024 < this.field2017) {
                    var3 = new class114(arg1, this.field2024);
                    this.field2024++;
                } else {
                    class114 var4 = (class114) this.field2031.method1022(arg0);
                    var3 = new class114(arg1, var4.field2535);
                    this.field2013[var4.field2532] = null;
                    var4.method805(false);
                }
                this.field2013[arg1] = var3;
            }
            this.field2031.method1015(9282, var3);
            return this.field2021[var3.field2535];
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)Lk;")
    public static final class89 method721(int arg0) {
        field2028++;
        class89 var1 = new class89();
        var1.field2048 = class165.field3418[0];
        var1.field2047 = class52.field1338;
        var1.field2050 = class150.field3101[0];
        var1.field2044 = class30.field605[0];
        var1.field2049 = class148.field3080[0];
        byte[] var2 = class25.field513[0];
        var1.field2046 = class117.field2563;
        int var3 = var1.field2048 * var1.field2044;
        var1.field2045 = new int[var3];
        int var4 = 0;
        int var5 = 4 / ((arg0 + 79) / 34);
        while (var3 > var4) {
            var1.field2045[var4] = class10.field227[class52.method380(255, var2[var4])];
            var4++;
        }
        class90.method758(true);
        return var1;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BIIII)V")
    public static final void method722(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class205.field4035; var5++) {
            if (class28.field552[var5] + class166.field3434[var5] > arg3 && arg3 + arg2 > class166.field3434[var5] && arg4 < class113.field2526[var5] + class176.field3559[var5] && class113.field2526[var5] < arg4 + arg1) {
                class10.field228[var5] = true;
            }
        }
        field2025++;
        if (arg0 > -35) {
            field2019 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
    public final void method723(int arg0) {
        field2022++;
        if (arg0 != 2) {
            this.field2014 = -5;
        }
        for (int var2 = 0; var2 < this.field2017; var2++) {
            this.field2021[var2][0] = null;
            this.field2021[var2][1] = null;
            this.field2021[var2][2] = null;
            this.field2021[var2] = null;
        }
        this.field2021 = null;
        this.field2013 = null;
        this.field2031.method1019(64);
        this.field2031 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILea;Lea;Ldd;)[Lk;")
    public static final class89[] method724(int arg0, class38 arg1, class38 arg2, class32 arg3) {
        if (arg0 <= 108) {
            method727(false);
        }
        int var4 = arg3.method207((byte) 32, arg1);
        field2015++;
        int var5 = arg3.method212(arg2, -106, var4);
        return class4.method20(var5, var4, arg3, (byte) 104);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I[Lfh;[BIILre;IIIII)V")
    public static final void method725(int arg0, class54[] arg1, byte[] arg2, int arg3, int arg4, class157 arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field2012++;
        class66 var11 = new class66(arg2);
        if (arg10 != 967) {
            return;
        }
        int var12 = -1;
        while (true) {
            int var13 = var11.method492(255);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method492(255);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var11.method509(117);
                int var17 = var14 >> 12;
                int var18 = var14 & 0x3F;
                int var19 = var14 >> 6 & 0x3F;
                int var20 = var16 >> 2;
                int var21 = var16 & 0x3;
                if (arg3 == var17 && var19 >= arg4 && var19 < arg4 + 8 && var18 >= arg8 && arg8 + 8 > var18) {
                    class106 var22 = class70.method553(var12, 28067);
                    int var23 = arg0 + class187.method1259(var18 & 0x7, var22.field2393, var22.field2405, (byte) -38, var21, var19 & 0x7, arg9);
                    int var24 = arg7 + class124.method927(arg9, var18 & 0x7, var22.field2393, var21, (byte) 83, var19 & 0x7, var22.field2405);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class54 var25 = null;
                        int var26 = arg6;
                        if ((class3.field104[1][var23][var24] & 0x2) == 2) {
                            var26 = arg6 - 1;
                        }
                        if (var26 >= 0) {
                            var25 = arg1[var26];
                        }
                        class137.method990(var12, var20, arg9 + var21 & 0x3, arg6, arg5, false, var24, var23, var25);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)V")
    public static void method726(int arg0) {
        if (arg0 != 63) {
            field2026 = -120;
        }
        field2027 = null;
        field2016 = null;
        field2019 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)V")
    public static final void method727(boolean arg0) {
        if (!arg0) {
            return;
        }
        field2023++;
        if (class94.field2113 != null) {
            class57 var1 = class94.field2113;
            synchronized (class94.field2113) {
                class94.field2113 = null;
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(III)V")
    public class87(int arg0, int arg1, int arg2) {
        this.field2014 = arg1;
        this.field2013 = new class114[arg1];
        this.field2017 = arg0;
        this.field2021 = new int[arg0][3][arg2];
    }
}
