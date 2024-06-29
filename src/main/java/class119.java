import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class119 extends class154 {

    @OriginalMember(owner = "client!ne", name = "bb", descriptor = "Leg;")
    public static class37 field2015 = class174.method1167(":duelstake:", 81);

    @OriginalMember(owner = "client!ne", name = "Z", descriptor = "[Z")
    public static boolean[] field2013 = new boolean[200];

    @OriginalMember(owner = "client!ne", name = "db", descriptor = "Lbf;")
    public static class202 field2017 = new class202(260);

    @OriginalMember(owner = "client!ne", name = "X", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!ne", name = "Y", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!ne", name = "cb", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!ne", name = "eb", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!ne", name = "fb", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!ne", name = "gb", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!ne", name = "hb", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!ne", name = "ab", descriptor = "[Lrk;")
    public static class14[] field2014;

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
    public class119() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "(I)V")
    public static final void method845(int arg0) {
        ++field2019;
        client.method781(false, (byte) -75);
        if (arg0 != 18327) {
            field2013 = null;
        }
        System.gc();
        class102.method683(25, false);
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)[I")
    public final int[] method143(int arg0, int arg1) {
        ++field2020;
        int[] var3 = super.field2574.method206(arg0, 10232);
        if (super.field2574.field536) {
            for (int var4 = 0; class227.field3898 > var4; ++var4) {
                this.method848(var4, arg0, 5937);
                int[] var5 = this.method1052(0, class85.field1344, (byte) -50);
                var3[var4] = var5[class85.field1334];
            }
        }
        return arg1 != 1075962732 ? null : var3;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lva;II)V")
    public final void method142(class187 arg0, int arg1, int arg2) {
        if (~arg2 == -1) {
            super.field2579 = arg0.method1268(255) == 1;
        }
        ++field2018;
        if (arg1 != -14015) {
            this.method193((byte) 51, -67);
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(BI)[[I")
    public final int[][] method193(byte arg0, int arg1) {
        ++field2021;
        int[][] var3 = super.field2585.method1532(arg1, -102);
        if (arg0 != 115) {
            method847(-81);
        }
        if (super.field2585.field3761) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~class227.field3898 < ~var7; ++var7) {
                this.method848(var7, arg1, 5937);
                int[][] var8 = this.method1054(0, 0, class85.field1344);
                var4[var7] = var8[0][class85.field1334];
                var5[var7] = var8[1][class85.field1334];
                var6[var7] = var8[2][class85.field1334];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILva;)V")
    public static final void method846(int arg0, class187 arg1) {
        if (arg0 != 1) {
            field2013 = null;
        }
        ++field2011;
        byte[] var2 = new byte[24];
        if (class169.field2818 != null) {
            try {
                class169.field2818.method1924(0L, (byte) -71);
                class169.field2818.method1934(52, var2);
                int var3;
                for (var3 = 0; ~var3 > -25 && var2[var3] == 0; ++var3) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; ++var4) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method1259(var2, arg0 + -126, 0, 24);
    }

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "(I)V")
    public static void method847(int arg0) {
        field2015 = null;
        field2017 = null;
        field2014 = null;
        if (arg0 == 0) {
            field2013 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(III)V")
    private final void method848(int arg0, int arg1, int arg2) {
        ++field2012;
        int var4 = class239.field4263[arg0];
        int var5 = class62.field1029[arg1];
        if (arg2 == 5937) {
            float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                class85.field1344 = arg1;
                class85.field1334 = arg0;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class85.field1334 = arg1;
                class85.field1344 = arg0;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class85.field1344 = arg0;
                class85.field1334 = class227.field3898 - arg1;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                class85.field1344 = -arg1 + class110.field1847;
                class85.field1334 = arg0;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                class85.field1334 = -arg0 + class227.field3898;
                class85.field1344 = -arg1 + class110.field1847;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                class85.field1334 = -arg1 + class227.field3898;
                class85.field1344 = class110.field1847 - arg0;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                class85.field1334 = arg1;
                class85.field1344 = class110.field1847 - arg0;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                class85.field1334 = -arg0 + class227.field3898;
                class85.field1344 = arg1;
            }
            class85.field1344 &= class239.field4260;
            class85.field1334 &= class109.field1786;
        }
    }

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "(I)V")
    public static final void method849(int arg0) {
        ++field2016;
        int var1 = 0;
        int[] var2 = new int[class45.field704];
        for (int var3 = arg0; ~class45.field704 < ~var3; ++var3) {
            class241 var5 = class9.method52(true, var3);
            if (~var5.field4273 <= -1 || var5.field4299 >= 0) {
                var2[var1++] = var3;
            }
        }
        class139.field2371 = new int[var1];
        for (int var4 = 0; var4 < var1; ++var4) {
            class139.field2371[var4] = var2[var4];
        }
    }
}
