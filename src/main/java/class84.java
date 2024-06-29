import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class84 extends class89 {

    @OriginalMember(owner = "client!ma", name = "eb", descriptor = "Lr;")
    private static class118 field2006 = class153.method1136(82, "To create a new account you need to");

    @OriginalMember(owner = "client!ma", name = "ab", descriptor = "Lr;")
    private static class118 field2002 = class153.method1136(104, "red:");

    @OriginalMember(owner = "client!ma", name = "jb", descriptor = "Lr;")
    public static class118 field2011 = field2006;

    @OriginalMember(owner = "client!ma", name = "lb", descriptor = "Lr;")
    public static class118 field2013 = class153.method1136(88, "Stufe)2");

    @OriginalMember(owner = "client!ma", name = "gb", descriptor = "Lr;")
    public static class118 field2008 = field2002;

    @OriginalMember(owner = "client!ma", name = "kb", descriptor = "[I")
    public static int[] field2012 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!ma", name = "nb", descriptor = "I")
    public static int field2015 = 0;

    @OriginalMember(owner = "client!ma", name = "pb", descriptor = "Lr;")
    public static class118 field2017 = class153.method1136(112, "sl_back");

    @OriginalMember(owner = "client!ma", name = "ub", descriptor = "[[[Lqb;")
    public static class113[][][] field2022 = new class113[4][104][104];

    @OriginalMember(owner = "client!ma", name = "xb", descriptor = "Lr;")
    public static class118 field2025 = field2002;

    @OriginalMember(owner = "client!ma", name = "vb", descriptor = "[Lr;")
    public static class118[] field2023 = new class118[8];

    @OriginalMember(owner = "client!ma", name = "sb", descriptor = "Ljava/lang/Object;")
    public static Object field2020 = new Object();

    @OriginalMember(owner = "client!ma", name = "yb", descriptor = "Lr;")
    public static class118 field2026 = class153.method1136(102, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!ma", name = "Z", descriptor = "I")
    public int field2001;

    @OriginalMember(owner = "client!ma", name = "bb", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!ma", name = "cb", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!ma", name = "db", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!ma", name = "fb", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!ma", name = "hb", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!ma", name = "ib", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!ma", name = "mb", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!ma", name = "ob", descriptor = "I")
    public int field2016;

    @OriginalMember(owner = "client!ma", name = "qb", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!ma", name = "rb", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!ma", name = "tb", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!ma", name = "wb", descriptor = "Lff;")
    public static class42 field2024;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "(I)Lwb;")
    public final class155 method215(int arg0) {
        if (arg0 != 15246) {
            field2006 = null;
        }
        field2007++;
        return class131.method1013(arg0 - 27828, this.field2016).method697((byte) -109, this.field2001);
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(II)Lf;")
    public static final class36 method683(int arg0, int arg1) {
        class36 var2 = (class36) class42.field1001.method395((byte) -52, (long) arg1);
        field2005++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class88.field2135.method350(arg0, arg0 ^ 0xFFFFFFC6, arg1);
        class36 var4 = new class36();
        if (var3 != null) {
            var4.method301(arg1, new class105(var3), (byte) -124);
        }
        var4.method298((byte) -72);
        class42.field1001.method391(var4, (long) arg1, true);
        return var4;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(JZ)V")
    public static final void method684(long arg0, boolean arg1) {
        field2010++;
        try {
            Thread.sleep(arg0);
            if (arg1) {
                field2011 = null;
            }
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lbe;I)V")
    public static final void method685(class13 arg0, int arg1) {
        field2018++;
        int var2 = 0;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field290 == 0) {
            var5 = class68.field1583.method1169(arg0.field280, arg0.field282, arg0.field279);
        }
        if (arg1 >= -52) {
            field2017 = null;
        }
        if (arg0.field290 == 1) {
            var5 = class68.field1583.method1186(arg0.field280, arg0.field282, arg0.field279);
        }
        if (arg0.field290 == 2) {
            var5 = class68.field1583.method1194(arg0.field280, arg0.field282, arg0.field279);
        }
        if (arg0.field290 == 3) {
            var5 = class68.field1583.method1156(arg0.field280, arg0.field282, arg0.field279);
        }
        if (var5 != 0) {
            var3 = var5 >> 14 & 0x7FFF;
            int var6 = class68.field1583.method1147(arg0.field280, arg0.field282, arg0.field279, var5);
            var4 = var6 >> 6 & 0x3;
            var2 = var6 & 0x1F;
        }
        arg0.field277 = var2;
        arg0.field285 = var4;
        arg0.field288 = var3;
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(II)Z")
    public static final boolean method686(int arg0, int arg1) {
        if (arg0 == -1) {
            field2009++;
            return (arg1 >> 30 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "(I)V")
    public static void method687(int arg0) {
        field2020 = null;
        field2002 = null;
        field2022 = null;
        field2023 = null;
        field2025 = null;
        field2017 = null;
        if (arg0 <= 104) {
            method690((byte) 124);
        }
        field2011 = null;
        field2026 = null;
        field2024 = null;
        field2012 = null;
        field2008 = null;
        field2013 = null;
        field2006 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(III[B)Z")
    public static final boolean method688(int arg0, int arg1, int arg2, byte[] arg3) {
        field2003++;
        boolean var4 = true;
        class105 var5 = new class105(arg3);
        int var6 = arg0;
        label70: while (true) {
            int var7 = var5.method815((byte) 126);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            boolean var8 = false;
            int var9 = 0;
            while (true) {
                int var15;
                class148 var16;
                do {
                    int var13;
                    int var14;
                    do {
                        do {
                            do {
                                do {
                                    while (var8) {
                                        int var17 = var5.method815((byte) 127);
                                        if (var17 == 0) {
                                            continue label70;
                                        }
                                        var5.method831((byte) 76);
                                    }
                                    int var10 = var5.method815((byte) 127);
                                    if (var10 == 0) {
                                        continue label70;
                                    }
                                    var9 += var10 - 1;
                                    int var11 = var9 & 0x3F;
                                    int var12 = var9 >> 6 & 0x3F;
                                    var13 = var12 + arg1;
                                    var14 = arg2 + var11;
                                    var15 = var5.method831((byte) 76) >> 2;
                                } while (var13 <= 0);
                            } while (var14 <= 0);
                        } while (var13 >= 103);
                    } while (var14 >= 103);
                    var16 = class47.method396(117, var6);
                } while (var15 == 22 && class68.field1582 && var16.field3302 == 0 && var16.field3297 != 1 && !var16.field3276);
                if (!var16.method1088(26299)) {
                    class113.field2649++;
                    var4 = false;
                }
                var8 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIII)V")
    public static final void method689(int arg0, int arg1, int arg2, int arg3) {
        class74 var4 = class113.method887(arg2, (byte) 1, arg1);
        if (arg0 != -14896) {
            field2013 = null;
        }
        field2004++;
        if (var4 != null && var4.field1823 != null) {
            class136 var5 = new class136();
            var5.field3067 = var4.field1823;
            var5.field3077 = var4;
            class83.method681(var5, (byte) -107);
        }
        class19.field465 = arg1;
        class80.field1934 = arg3;
        class35.field884 = true;
        class66.field1510 = arg2;
        class26.method232((byte) 88, var4);
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(B)V")
    public static final void method690(byte arg0) {
        field2021++;
        if (arg0 != 51) {
            return;
        }
        for (int var1 = -1; var1 < class105.field2425; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class73.field1685[var1];
            }
            class132 var3 = class108.field2526[var2];
            if (var3 != null) {
                class35.method295(16189, var3, 1);
            }
        }
    }
}
