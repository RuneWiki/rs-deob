import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class33 {

    @OriginalMember(owner = "client!db", name = "D", descriptor = "I")
    private int field762 = 0;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "[Lwd;")
    private class210[] field734;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "I")
    private int field755;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field733 = 0;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field741 = 0;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    public static int field748 = 0;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field740 = 2;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "Ljd;")
    public static class92 field742 = class202.method1325((byte) 90, "p12_full");

    @OriginalMember(owner = "client!db", name = "v", descriptor = "Z")
    public static boolean field754 = false;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field737 = 4;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "[[Lbb;")
    public static class13[][] field753 = new class13[field737][500];

    @OriginalMember(owner = "client!db", name = "d", descriptor = "Ljd;")
    public static class92 field736 = class202.method1325((byte) 90, ")3runescape)3com");

    @OriginalMember(owner = "client!db", name = "g", descriptor = "[I")
    public static int[] field739 = new int[field737];

    @OriginalMember(owner = "client!db", name = "n", descriptor = "Ljd;")
    public static class92 field746 = null;

    @OriginalMember(owner = "client!db", name = "B", descriptor = "Ljd;")
    public static class92 field760 = class202.method1325((byte) 90, " weitere Optionen");

    @OriginalMember(owner = "client!db", name = "k", descriptor = "Ljd;")
    public static class92 field743 = class202.method1325((byte) 90, "; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!db", name = "y", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!db", name = "C", descriptor = "J")
    private long field761;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "Lwd;")
    private class210 field759;

    @OriginalMember(owner = "client!db", name = "E", descriptor = "Lwd;")
    private class210 field763;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "[I")
    public static int[] field752;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)Lwd;")
    public final class210 method209(boolean arg0) {
        field757++;
        if (this.field762 > 0 && this.field734[this.field762 - 1] != this.field763) {
            class210 var2 = this.field763;
            this.field763 = var2.field4078;
            return var2;
        }
        while (this.field755 > this.field762) {
            class210 var3 = this.field734[this.field762++].field4078;
            if (this.field734[this.field762 - 1] != var3) {
                this.field763 = var3.field4078;
                return var3;
            }
        }
        if (arg0) {
            method212(123, -50, -91, null, -52, 127, -16, -123, 76);
        }
        return null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BJLwd;)V")
    public final void method210(byte arg0, long arg1, class210 arg2) {
        if (arg2.field4071 != null) {
            arg2.method1370(-64);
        }
        field749++;
        class210 var5 = this.field734[(int) ((long) (this.field755 - 1) & arg1)];
        arg2.field4071 = var5.field4071;
        arg2.field4079 = arg1;
        arg2.field4078 = var5;
        if (arg0 < -29) {
            arg2.field4071.field4078 = arg2;
            arg2.field4078.field4071 = arg2;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
    public static void method211(byte arg0) {
        field736 = null;
        field753 = null;
        field743 = null;
        if (arg0 != 51) {
            return;
        }
        field760 = null;
        field752 = null;
        field739 = null;
        field742 = null;
        field746 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(III[La;IIIII)V")
    public static final void method212(int arg0, int arg1, int arg2, class1[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field758++;
        for (int var9 = 0; var9 < arg3.length; var9++) {
            class1 var10 = arg3[var9];
            if (var10 != null && (!var10.field94 || var10.field10 == 0 || var10.field41 || class114.method766(arg8 + 91, var10) != 0 || client.field687 == var10 || var10.field120 == 1338) && var10.field36 == arg0 && (!var10.field94 || !class103.method709(0, var10))) {
                int var11 = var10.field79 + arg6;
                int var12 = var10.field11 + arg5;
                int var18;
                int var20;
                int var21;
                int var22;
                if (var10.field10 == 2) {
                    var21 = arg4;
                    var20 = arg2;
                    var22 = arg1;
                    var18 = arg7;
                } else if (var10.field10 == 9) {
                    int var13 = var12;
                    int var14 = var10.field96 + var11;
                    int var15 = var11;
                    int var16 = var10.field28 + var12;
                    if (var14 < var11) {
                        var15 = var14;
                        var14 = var11;
                    }
                    var14++;
                    var18 = var14 < arg7 ? var14 : arg7;
                    if (var12 > var16) {
                        var13 = var16;
                        var16 = var12;
                    }
                    var16++;
                    var20 = var16 < arg2 ? var16 : arg2;
                    var21 = arg4 >= var13 ? arg4 : var13;
                    var22 = arg1 < var15 ? var15 : arg1;
                } else {
                    var22 = var11 <= arg1 ? arg1 : var11;
                    int var23 = var10.field96 + var11;
                    var21 = var12 <= arg4 ? arg4 : var12;
                    var18 = var23 < arg7 ? var23 : arg7;
                    int var24 = var10.field28 + var12;
                    var20 = var24 >= arg2 ? arg2 : var24;
                }
                if (class6.field298 == var10) {
                    class31.field708 = var12;
                    class189.field3603 = true;
                    class4.field266 = var11;
                }
                if (!var10.field94 || var18 > var22 && var21 < var20) {
                    if (var10.field120 == 1337) {
                        class3.method21(26702, var10);
                    } else {
                        if (var10.field10 == 0) {
                            if (!var10.field94 && class103.method709(0, var10) && class114.field2299 != var10) {
                                continue;
                            }
                            method212(var10.field100, var22, var20, arg3, var21, var12 - var10.field48, -var10.field24 + var11, var18, arg8);
                            if (var10.field55 != null) {
                                method212(var10.field100, var22, var20, var10.field55, var21, var12 - var10.field48, -var10.field24 + var11, var18, arg8);
                            }
                            class105 var25 = (class105) class118.field2394.method216(-81, (long) var10.field100);
                            if (var25 != null) {
                                class212.method1374(var18, var21, var12, var22, var11, var25.field2155, -102, var20);
                            }
                        }
                        if (var10.field94) {
                            boolean var26;
                            if (var22 <= class29.field641 && var21 <= class192.field3756 && class29.field641 < var18 && class192.field3756 < var20) {
                                var26 = true;
                            } else {
                                var26 = false;
                            }
                            boolean var27 = false;
                            if (class202.field3923 == 1 && var26) {
                                var27 = true;
                            }
                            boolean var28 = false;
                            if (class74.field1559 == 1 && var22 <= class31.field705 && var21 <= class81.field1645 && class31.field705 < var18 && class81.field1645 < var20) {
                                var28 = true;
                            }
                            if (var10.field120 == 1338) {
                                if (var28) {
                                    class7.method46(var10, class81.field1645 - var12, (byte) 121, class31.field705 - var11);
                                }
                                continue;
                            }
                            if (var28) {
                                class65.method389(var10, class81.field1645 - var12, class31.field705 - var11, (byte) 127);
                            }
                            if (class6.field298 != null && class6.field298 != var10 && var26 && class146.method958((byte) -117, class114.method766(-81, var10))) {
                                class205.field3941 = var10;
                            }
                            if (client.field687 == var10) {
                                class159.field3171 = var11;
                                class97.field1977 = var12;
                                class15.field424 = true;
                            }
                            if (var10.field41) {
                                if (var26 && class79.field1611 != 0 && var10.field75 != null) {
                                    class156 var29 = new class156();
                                    var29.field3102 = class79.field1611;
                                    var29.field3103 = var10;
                                    var29.field3108 = var10.field75;
                                    class3.field176.method101(var29, (byte) -69);
                                }
                                if (class6.field298 != null || class115.field2319 != null || class72.field1524) {
                                    var28 = false;
                                    var27 = false;
                                    var26 = false;
                                }
                                if (!var10.field47 && var28) {
                                    var10.field47 = true;
                                    if (var10.field33 != null) {
                                        class156 var30 = new class156();
                                        var30.field3102 = class81.field1645 - var12;
                                        var30.field3108 = var10.field33;
                                        var30.field3103 = var10;
                                        var30.field3107 = class31.field705 - var11;
                                        class3.field176.method101(var30, (byte) -10);
                                    }
                                }
                                if (var10.field47 && var27 && var10.field89 != null) {
                                    class156 var31 = new class156();
                                    var31.field3108 = var10.field89;
                                    var31.field3103 = var10;
                                    var31.field3102 = class192.field3756 - var12;
                                    var31.field3107 = class29.field641 - var11;
                                    class3.field176.method101(var31, (byte) 124);
                                }
                                if (var10.field47 && !var27) {
                                    var10.field47 = false;
                                    if (var10.field122 != null) {
                                        class156 var32 = new class156();
                                        var32.field3103 = var10;
                                        var32.field3102 = class192.field3756 - var12;
                                        var32.field3107 = class29.field641 - var11;
                                        var32.field3108 = var10.field122;
                                        class66.field1349.method101(var32, (byte) -67);
                                    }
                                }
                                if (var27 && var10.field112 != null) {
                                    class156 var33 = new class156();
                                    var33.field3103 = var10;
                                    var33.field3102 = class192.field3756 - var12;
                                    var33.field3107 = class29.field641 - var11;
                                    var33.field3108 = var10.field112;
                                    class3.field176.method101(var33, (byte) 126);
                                }
                                if (!var10.field54 && var26) {
                                    var10.field54 = true;
                                    if (var10.field70 != null) {
                                        class156 var34 = new class156();
                                        var34.field3102 = class192.field3756 - var12;
                                        var34.field3108 = var10.field70;
                                        var34.field3107 = class29.field641 - var11;
                                        var34.field3103 = var10;
                                        class3.field176.method101(var34, (byte) 122);
                                    }
                                }
                                if (var10.field54 && var26 && var10.field57 != null) {
                                    class156 var35 = new class156();
                                    var35.field3103 = var10;
                                    var35.field3102 = class192.field3756 - var12;
                                    var35.field3108 = var10.field57;
                                    var35.field3107 = class29.field641 - var11;
                                    class3.field176.method101(var35, (byte) -76);
                                }
                                if (var10.field54 && !var26) {
                                    var10.field54 = false;
                                    if (var10.field104 != null) {
                                        class156 var36 = new class156();
                                        var36.field3102 = class192.field3756 - var12;
                                        var36.field3108 = var10.field104;
                                        var36.field3103 = var10;
                                        var36.field3107 = class29.field641 - var11;
                                        class66.field1349.method101(var36, (byte) 123);
                                    }
                                }
                                if (var10.field23 != null) {
                                    class156 var37 = new class156();
                                    var37.field3103 = var10;
                                    var37.field3108 = var10.field23;
                                    class136.field2723.method101(var37, (byte) 123);
                                }
                                if (var10.field21 != null && var10.field42 < class162.field3175) {
                                    if (var10.field114 == null || class162.field3175 - var10.field42 > 32) {
                                        class156 var42 = new class156();
                                        var42.field3103 = var10;
                                        var42.field3108 = var10.field21;
                                        class3.field176.method101(var42, (byte) 117);
                                    } else {
                                        label396: for (int var38 = var10.field42; var38 < class162.field3175; var38++) {
                                            int var39 = class156.field3111[var38 & 0x1F];
                                            for (int var40 = 0; var40 < var10.field114.length; var40++) {
                                                if (var10.field114[var40] == var39) {
                                                    class156 var41 = new class156();
                                                    var41.field3108 = var10.field21;
                                                    var41.field3103 = var10;
                                                    class3.field176.method101(var41, (byte) 23);
                                                    break label396;
                                                }
                                            }
                                        }
                                    }
                                    var10.field42 = class162.field3175;
                                }
                                if (var10.field78 != null && class166.field3269 > var10.field71) {
                                    if (var10.field141 == null || class166.field3269 - var10.field71 > 32) {
                                        class156 var47 = new class156();
                                        var47.field3108 = var10.field78;
                                        var47.field3103 = var10;
                                        class3.field176.method101(var47, (byte) 115);
                                    } else {
                                        label372: for (int var43 = var10.field71; var43 < class166.field3269; var43++) {
                                            int var44 = class185.field3503[var43 & 0x1F];
                                            for (int var45 = 0; var45 < var10.field141.length; var45++) {
                                                if (var10.field141[var45] == var44) {
                                                    class156 var46 = new class156();
                                                    var46.field3108 = var10.field78;
                                                    var46.field3103 = var10;
                                                    class3.field176.method101(var46, (byte) 123);
                                                    break label372;
                                                }
                                            }
                                        }
                                    }
                                    var10.field71 = class166.field3269;
                                }
                                if (var10.field49 != null && var10.field2 < class123.field2471) {
                                    if (var10.field92 == null || class123.field2471 - var10.field2 > 32) {
                                        class156 var52 = new class156();
                                        var52.field3103 = var10;
                                        var52.field3108 = var10.field49;
                                        class3.field176.method101(var52, (byte) 8);
                                    } else {
                                        label348: for (int var48 = var10.field2; var48 < class123.field2471; var48++) {
                                            int var49 = class98.field1993[var48 & 0x1F];
                                            for (int var50 = 0; var50 < var10.field92.length; var50++) {
                                                if (var10.field92[var50] == var49) {
                                                    class156 var51 = new class156();
                                                    var51.field3103 = var10;
                                                    var51.field3108 = var10.field49;
                                                    class3.field176.method101(var51, (byte) 121);
                                                    break label348;
                                                }
                                            }
                                        }
                                    }
                                    var10.field2 = class123.field2471;
                                }
                                if (var10.field125 < class42.field926 && var10.field64 != null) {
                                    class156 var53 = new class156();
                                    var53.field3108 = var10.field64;
                                    var53.field3103 = var10;
                                    class3.field176.method101(var53, (byte) 124);
                                }
                                if (class136.field2732 > var10.field125 && var10.field117 != null) {
                                    class156 var54 = new class156();
                                    var54.field3103 = var10;
                                    var54.field3108 = var10.field117;
                                    class3.field176.method101(var54, (byte) 122);
                                }
                                if (class114.field2312 > var10.field125 && var10.field74 != null) {
                                    class156 var55 = new class156();
                                    var55.field3103 = var10;
                                    var55.field3108 = var10.field74;
                                    class3.field176.method101(var55, (byte) -25);
                                }
                                if (var10.field125 < class39.field891 && var10.field32 != null) {
                                    class156 var56 = new class156();
                                    var56.field3103 = var10;
                                    var56.field3108 = var10.field32;
                                    class3.field176.method101(var56, (byte) 0);
                                }
                                if (class92.field1826 > var10.field125 && var10.field1 != null) {
                                    class156 var57 = new class156();
                                    var57.field3103 = var10;
                                    var57.field3108 = var10.field1;
                                    class3.field176.method101(var57, (byte) 9);
                                }
                                var10.field125 = class186.field3516;
                                if (var10.field134 != null) {
                                    for (int var58 = 0; var58 < class108.field2224; var58++) {
                                        class156 var59 = new class156();
                                        var59.field3103 = var10;
                                        var59.field3101 = class152.field3015[var58];
                                        var59.field3110 = class20.field494[var58];
                                        var59.field3108 = var10.field134;
                                        class3.field176.method101(var59, (byte) -67);
                                    }
                                }
                            }
                        }
                        if (!var10.field94) {
                            if (class6.field298 != null || class115.field2319 != null || class72.field1524) {
                                return;
                            }
                            if ((var10.field15 >= 0 || var10.field81 != 0) && class29.field641 >= var22 && class192.field3756 >= var21 && class29.field641 < var18 && var20 > class192.field3756) {
                                if (var10.field15 >= 0) {
                                    class114.field2299 = arg3[var10.field15];
                                } else {
                                    class114.field2299 = var10;
                                }
                            }
                            if (var10.field10 == 8 && class29.field641 >= var22 && class192.field3756 >= var21 && class29.field641 < var18 && var20 > class192.field3756) {
                                class185.field3506 = var10;
                            }
                            if (var10.field28 < var10.field73) {
                                class147.method960(var10.field96 + var11, var10, arg8 ^ 0x8, var10.field28, class29.field641, var12, var10.field73, class192.field3756);
                            }
                        }
                    }
                }
            }
        }
        if (arg8 != 8) {
            field743 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(B)V")
    public static final void method213(byte arg0) {
        field756++;
        class115.field2339 = true;
        if (arg0 != 93) {
            method211((byte) -48);
        }
        class212.field4108 = true;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)Lwd;")
    public final class210 method214(int arg0) {
        field735++;
        if (this.field759 == null) {
            return null;
        }
        class210 var2 = this.field734[(int) (this.field761 & (long) (this.field755 + arg0))];
        while (this.field759 != var2) {
            if (this.field759.field4079 == this.field761) {
                class210 var3 = this.field759;
                this.field759 = this.field759.field4078;
                return var3;
            }
            this.field759 = this.field759.field4078;
        }
        this.field759 = null;
        return null;
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(B)Lwd;")
    public final class210 method215(byte arg0) {
        field745++;
        if (arg0 >= -29) {
            return null;
        } else {
            this.field762 = 0;
            return this.method209(false);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IJ)Lwd;")
    public final class210 method216(int arg0, long arg1) {
        field747++;
        this.field761 = arg1;
        class210 var4 = this.field734[(int) (arg1 & (long) (this.field755 - 1))];
        if (arg0 >= -74) {
            field743 = null;
        }
        for (this.field759 = var4.field4078; this.field759 != var4; this.field759 = this.field759.field4078) {
            if (this.field759.field4079 == arg1) {
                class210 var5 = this.field759;
                this.field759 = this.field759.field4078;
                return var5;
            }
        }
        this.field759 = null;
        return null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B[Lwd;)I")
    public final int method217(byte arg0, class210[] arg1) {
        field750++;
        int var3 = 0;
        if (arg0 != 86) {
            return -37;
        }
        for (int var4 = 0; var4 < this.field755; var4++) {
            class210 var5 = this.field734[var4];
            for (class210 var6 = var5.field4078; var6 != var5; var6 = var6.field4078) {
                arg1[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(B)I")
    public final int method218(byte arg0) {
        field751++;
        int var2 = 0;
        if (arg0 >= -72) {
            field740 = -76;
        }
        for (int var3 = 0; var3 < this.field755; var3++) {
            class210 var4 = this.field734[var3];
            class210 var5 = var4.field4078;
            while (var4 != var5) {
                var5 = var5.field4078;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(I)V")
    public class33(int arg0) {
        this.field734 = new class210[arg0];
        this.field755 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class210 var3 = this.field734[var2] = new class210();
            var3.field4071 = var3;
            var3.field4078 = var3;
        }
    }
}
