import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class99 implements class51 {

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "Z")
    private boolean field2018 = false;

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "I")
    private int field2021 = 50;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "Lmc;")
    private class151 field2009;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "Lmc;")
    private class151 field2004;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "Lub;")
    private class17 field2007;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "Lub;")
    private class17 field2002;

    @OriginalMember(owner = "client!hd", name = "K", descriptor = "[Z")
    private boolean[] field2029;

    @OriginalMember(owner = "client!hd", name = "E", descriptor = "[B")
    private byte[] field2023;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "[Z")
    private boolean[] field1998;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "[Z")
    private boolean[] field1993;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "[B")
    private byte[] field1997;

    @OriginalMember(owner = "client!hd", name = "D", descriptor = "[Z")
    private boolean[] field2022;

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "[S")
    private short[] field2016;

    @OriginalMember(owner = "client!hd", name = "L", descriptor = "[Z")
    private boolean[] field2030;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "[B")
    private byte[] field2010;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "[B")
    private byte[] field2001;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "Lsg;")
    public static class30 field1994 = class167.method1221((byte) 33, "Spielwelt erstellt)3");

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "Lsg;")
    public static class30 field2015 = class167.method1221((byte) 33, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!hd", name = "B", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!hd", name = "F", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!hd", name = "G", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!hd", name = "H", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!hd", name = "I", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BZ)V")
    public final void method803(byte arg0, boolean arg1) {
        field2014++;
        this.field2018 = arg1;
        this.method815((byte) -102);
        int var3 = 56 % ((92 - arg0) / 33);
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(II)V")
    public final void method804(int arg0, int arg1) {
        if (arg1 > -86) {
            this.method508(123, 12);
        }
        for (class25 var3 = (class25) this.field2007.method168((byte) -36); var3 != null; var3 = (class25) this.field2007.method165(32)) {
            if (var3.field474) {
                var3.method222(1, arg0);
                var3.field474 = false;
            }
        }
        field2005++;
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(BI)Lhj;")
    private final class25 method805(byte arg0, int arg1) {
        field2017++;
        class25 var3 = (class25) this.field2007.method174((long) arg1, (byte) -73);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field2004.method1115(0, (byte) -108, arg1);
        if (var4 == null) {
            return null;
        } else if (arg0 < 81) {
            return null;
        } else {
            class8 var5 = new class8(var4);
            class25 var6 = new class25(var5);
            this.field2007.method169(var6, -86, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)Z")
    public final boolean method508(int arg0, int arg1) {
        class25 var3 = this.method805((byte) 124, arg1);
        field1996++;
        if (arg0 > -56) {
            this.method815((byte) -109);
        }
        return var3 == null ? false : var3.method226(true, this.field2009, this);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIIIIIII)V")
    public static final void method806(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg8 - arg3;
        int var12 = arg5 - arg0;
        boolean var13;
        if (class252.field4453 > 0 && (class252.field4453 % 10) < 5) {
            var13 = true;
        } else {
            var13 = false;
        }
        int var14 = 983040 / arg1;
        field2026++;
        int var15 = 983040 / arg9;
        for (int var16 = -var14; var16 < var11 + var14; var16++) {
            int var18 = arg1 * var16 + arg7 >> 16;
            int var19 = (var16 + 1) * arg1 + arg7 >> 16;
            int var20 = var19 - var18;
            if (var20 > 0) {
                int var10000 = arg6 + var19;
                int var22 = arg6 + var18;
                int var23 = var16 + arg3 >> 6;
                if (var23 >= 0 && (class252.field4444.length - 1) >= var23) {
                    int[][] var24 = class252.field4444[var23];
                    for (int var25 = -var15; var25 < var12 + var15; var25++) {
                        int var26 = arg9 * var25 + arg4 >> 16;
                        int var27 = (var25 + 1) * arg9 + arg4 >> 16;
                        int var28 = var27 - var26;
                        if (var28 > 0) {
                            var10000 = arg2 + var27;
                            int var30 = arg2 + var26;
                            int var31 = var25 + arg0 >> 6;
                            if (var31 >= 0 && var31 <= var24.length - 1 && var24[var31] != null) {
                                int var32 = ((arg0 + var25 & 0x3F) << 6) + (arg3 + var16 & 0x3F);
                                int var33 = var24[var31][var32];
                                if (var33 != 0) {
                                    class40 var34 = class195.method1415(39, var33 - 1);
                                    if (var13 && class114.field2259 == var34.field1000) {
                                        class239 var35 = new class239();
                                        var35.field4255 = var22;
                                        var35.field4247 = var30;
                                        var35.field4248 = var34.field1000;
                                        class117.field2302.method477(var35, (byte) 6);
                                    }
                                    class141.field2736[var34.field1000].method446(var22 - 7, var30 - 7);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg10 <= 101) {
            return;
        }
        for (class239 var17 = (class239) class117.field2302.method478(0); var17 != null; var17 = (class239) class117.field2302.method476((byte) 13)) {
            class141.field2736[var17.field4248].method446(var17.field4255 - 7, var17.field4247 + -7);
            class188.method1358(var17.field4255, var17.field4247, 15, 16776960, 128);
            class188.method1358(var17.field4255, var17.field4247, 7, 16777215, 256);
        }
        class117.field2302.method480(111);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIII)V")
    public static final void method807(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class252.field4458 = arg2;
        field2027++;
        if (arg1 != 0) {
            method814(-97);
        }
        class48.field1096 = arg4;
        class167.field3064 = arg3;
        class275.field4804 = arg0;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(BI)[I")
    public final int[] method513(byte arg0, int arg1) {
        field2000++;
        if (arg0 == 101) {
            class25 var3 = this.method805((byte) 114, arg1);
            return var3 == null ? null : var3.method225(this, this.field2009, this.field2018 || this.field2022[arg1], arg0 ^ 0xE5);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(FII)[I")
    public final int[] method511(float arg0, int arg1, int arg2) {
        class25 var4 = this.method805((byte) 105, arg1);
        field1999++;
        if (var4 == null) {
            return null;
        } else if (arg2 == 0) {
            var4.field474 = true;
            return var4.method220(this, arg0, this.field2018 || this.field2022[arg1], (byte) -70, this.field2009);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lmc;I)V")
    public static final void method808(class151 arg0, int arg1) {
        field2011++;
        class231.field4100 = arg0.method1096((byte) -102, class17.field335);
        class110.field2201 = arg0.method1096((byte) -102, class273.field4786);
        class271.field4764 = arg0.method1096((byte) -102, class60.field1295);
        class60.field1293 = arg0.method1096((byte) -102, class9.field169);
        class45.field1057 = arg0.method1096((byte) -102, class20.field376);
        class175.field3257 = arg0.method1096((byte) -102, class176.field3275);
        class168.field3168 = arg0.method1096((byte) -102, class2.field32);
        class104.field2092 = arg0.method1096((byte) -102, class116.field2294);
        class79.field1709 = arg0.method1096((byte) -102, class167.field3075);
        class220.field3975 = arg0.method1096((byte) -102, class234.field4163);
        class176.field3273 = arg0.method1096((byte) -102, class91.field1842);
        class90.field1821 = arg0.method1096((byte) -102, class55.field1217);
        class177.field3288 = arg0.method1096((byte) -102, class151.field2865);
        class246.field4391 = arg0.method1096((byte) -102, class216.field3943);
        class32.field819 = arg0.method1096((byte) -102, class45.field1054);
        int var2 = -100 / ((arg1 + 19) / 51);
        class93.field1871 = arg0.method1096((byte) -102, class141.field2726);
        class36.field867 = arg0.method1096((byte) -102, class225.field4037);
        class203.field3629 = arg0.method1096((byte) -102, class129.field2545);
        class52.field1172 = arg0.method1096((byte) -102, class168.field3124);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILdl;)Ldl;")
    public static final class31 method809(int arg0, class31 arg1) {
        field2024++;
        if (arg0 <= 72) {
            method809(-45, (class31) null);
        }
        class31 var2 = client.method1492(arg1);
        if (var2 == null) {
            var2 = arg1.field751;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)Z")
    public final boolean method509(int arg0, byte arg1) {
        field2019++;
        return arg1 == -51 ? this.field1998[arg0] : true;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILsg;Ldl;)Lsg;")
    public static final class30 method810(int arg0, class30 arg1, class31 arg2) {
        if (arg1.method255(true, class75.field1668) != -1) {
            label62: while (true) {
                int var3 = arg1.method255(true, class136.field2651);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg1.method255(true, class225.field4028);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg1.method255(true, class125.field2449);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg1.method255(true, class266.field4699);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg1.method255(true, class117.field2315);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg1.method255(true, class90.field1827);
                                                        if (var8 == -1) {
                                                            break label62;
                                                        }
                                                        class30 var9 = class55.field1203;
                                                        if (class60.field1307 != null) {
                                                            var9 = class257.method1788(true, class60.field1307.field497);
                                                            try {
                                                                if (class60.field1307.field492 != null) {
                                                                    byte[] var10 = ((String) class60.field1307.field492).getBytes("ISO-8859-1");
                                                                    var9 = class255.method1775(var10.length, var10, 2, 0);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg1 = class160.method1188(new class30[] { arg1.method274(var8, 0, (byte) 118), var9, arg1.method260((byte) -123, var8 + 4) }, 0);
                                                    }
                                                }
                                                arg1 = class160.method1188(new class30[] { arg1.method274(var7, 0, (byte) 15), class220.method1593(class229.method1628(4, arg2, true), 999999999), arg1.method260((byte) -102, var7 + 2) }, 0);
                                            }
                                        }
                                        arg1 = class160.method1188(new class30[] { arg1.method274(var6, 0, (byte) 37), class220.method1593(class229.method1628(3, arg2, true), 999999999), arg1.method260((byte) -105, var6 + 2) }, 0);
                                    }
                                }
                                arg1 = class160.method1188(new class30[] { arg1.method274(var5, 0, (byte) -121), class220.method1593(class229.method1628(2, arg2, true), 999999999), arg1.method260((byte) -105, var5 + 2) }, 0);
                            }
                        }
                        arg1 = class160.method1188(new class30[] { arg1.method274(var4, 0, (byte) 19), class220.method1593(class229.method1628(1, arg2, true), 999999999), arg1.method260((byte) 13, var4 + 2) }, 0);
                    }
                }
                arg1 = class160.method1188(new class30[] { arg1.method274(var3, 0, (byte) 67), class220.method1593(class229.method1628(0, arg2, true), 999999999), arg1.method260((byte) -108, var3 + 2) }, 0);
            }
        }
        if (arg0 == -27188) {
            field2012++;
            return arg1;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lsg;ILaa;)I")
    public static final int method811(class30 arg0, int arg1, class8 arg2) {
        int var3 = arg2.field146;
        field2008++;
        arg2.method96(arg0.field576, arg1);
        arg2.field146 += class146.field2807.method911(0, arg0.field576, 41, arg2.field146, arg2.field124, arg0.field618);
        return arg2.field146 - var3;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V")
    public static final void method812(boolean arg0) {
        class146.field2802.method1650(96);
        field1995++;
        if (!arg0) {
            field1994 = null;
        }
        class3.field47.method1650(92);
        class14.field303.method1650(47);
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(II)Z")
    public final boolean method512(int arg0, int arg1) {
        if (arg1 != 1989091174) {
            this.method804(97, -54);
        }
        field2006++;
        return this.field2018 || this.field2022[arg0];
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BI)Z")
    public final boolean method507(byte arg0, int arg1) {
        if (arg0 != -31) {
            this.method507((byte) 43, 68);
        }
        field2025++;
        return this.field2029[arg1];
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(III)I")
    public static final int method813(int arg0, int arg1, int arg2) {
        field2013++;
        int var3 = arg0 >> 31 & arg1 + arg2;
        return (arg0 + (arg0 >>> 31)) % arg2 + var3;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
    public static void method814(int arg0) {
        field2015 = null;
        field1994 = null;
        if (arg0 != -1) {
            method807(78, 38, -48, -83, -95);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
    public final void method815(byte arg0) {
        field2028++;
        this.field2007.method166((byte) -63);
        if (arg0 > -43) {
            this.field2007 = null;
        }
        if (this.field2002 != null) {
            this.field2002.method166((byte) -90);
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(IB)I")
    public final int method510(int arg0, byte arg1) {
        if (arg1 == 40) {
            field2020++;
            return this.field2016[arg0] & 0xFFFF;
        } else {
            return 36;
        }
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lmc;Lmc;Lmc;IZ)V")
    public class99(class151 arg0, class151 arg1, class151 arg2, int arg3, boolean arg4) {
        this.field2009 = arg2;
        this.field2018 = arg4;
        this.field2004 = arg0;
        this.field2021 = arg3;
        this.field2007 = new class17(this.field2021);
        this.field2002 = null;
        class8 var6 = new class8(arg1.method1115(0, (byte) -94, 0));
        int var7 = var6.method65((byte) 113);
        this.field2029 = new boolean[var7];
        this.field2023 = new byte[var7];
        this.field1998 = new boolean[var7];
        this.field1993 = new boolean[var7];
        this.field1997 = new byte[var7];
        this.field2022 = new boolean[var7];
        this.field2016 = new short[var7];
        this.field2030 = new boolean[var7];
        this.field2010 = new byte[var7];
        this.field2001 = new byte[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field1993[var8] = var6.method63((byte) 104) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field1993[var9]) {
                this.field1998[var9] = var6.method63((byte) 99) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field1993[var10]) {
                this.field2029[var10] = var6.method63((byte) 96) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field1993[var11]) {
                this.field2022[var11] = var6.method63((byte) 53) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field1993[var12]) {
                this.field2030[var12] = var6.method63((byte) 93) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field1993[var13]) {
                this.field1997[var13] = var6.method98(1);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field1993[var14]) {
                this.field2023[var14] = var6.method98(1);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field1993[var15]) {
                this.field2010[var15] = var6.method98(1);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field1993[var16]) {
                this.field2001[var16] = var6.method98(1);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field1993[var17]) {
                this.field2016[var17] = (short) var6.method65((byte) 107);
            }
        }
    }
}
