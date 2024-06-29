import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class403 {

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
    private int field6021;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "[Lff;")
    private class7[] field6018;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "[I")
    public static int[] field6014 = new int[2500];

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field6012 = 0;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "Ljava/lang/String;")
    public static String field6010 = "slide:";

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "[I")
    public static int[] field6019 = new int[13];

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "[I")
    public static int[] field6013 = new int[5];

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "Ljava/lang/String;")
    public static String field6020 = "glow3:";

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public static int field6009;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field6011;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public static int field6015;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public static int field6016;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
    public static int field6022;

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "I")
    public static int field6023;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "J")
    private long field6017;

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "Lff;")
    private class7 field6024;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)V", line = 3)
    public static void method2533(boolean arg0) {
        field6010 = null;
        if (!arg0) {
            field6010 = null;
        }
        field6020 = null;
        field6013 = null;
        field6019 = null;
        field6014 = null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BLe;II)V", line = 26)
    public static final void method2534(byte arg0, class312 arg1, int arg2, int arg3) {
        if (arg0 != -91) {
            method2537(-1);
        }
        field6009++;
        if (arg2 < 0 || arg3 < 0 || class106.field1484 == 0 || class38.field485 == 0) {
            return;
        }
        arg1.method589(class166.field2610, class70.field865, class106.field1484, class38.field485);
        arg1.method671(class422.field6247, class314.field4933, class106.field1484, class38.field485);
        class435 var4 = arg1.method704();
        var4.method1987(class321.field5017, class104.field1465, class309.field4882, class158.field2518, class224.field3732, class414.field6128);
        arg1.method693(var4);
        if (class374.field5639 == 0 && class181.field2961 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg1.method690();
            int var8 = (arg2 - class166.field2610) * var7 / class106.field1484;
            int var9 = (arg3 - class70.field865) * var7 / class38.field485;
            int var10 = arg1.method702();
            int var11 = (arg2 - class166.field2610) * var10 / class106.field1484;
            int var12 = (arg3 - class70.field865) * var10 / class38.field485;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method1985(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method1985(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 7;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 7;
                if (var20 > 0 && var22 > 0 && class80.field1003 > var20 && class380.field5751 > var22) {
                    int var23 = class266.field4286;
                    if (var23 < 3 && (class31.field382[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class181.field2961[var23].method771(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = var19 + (class261.field4201.method903(arg0 - 27) * 64) - 64 >> 7;
                        var6 = class261.field4201.method903(-119) * 64 + var21 - 64 >> 7;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class449.field6546 && (class379.field5737 & 0x40) != 0) {
                    class172 var24 = class201.method1393(class436.field6419, class73.field925, -122);
                    if (var24 == null) {
                        class11.method109(-13853);
                    } else {
                        class413.method2587(0L, class306.field4854, var5, class248.field4058, 42, var6, " ->", -233);
                    }
                } else {
                    if (class61.field787 == 1) {
                        class413.method2587(0L, class286.field4596, var5, -1, 21, var6, "", -233);
                    }
                    class413.method2587(0L, class61.field790, var5, -1, 34, var6, "", -233);
                    class112.field1553++;
                }
            }
        }
        class385 var25 = class449.field6542;
        for (class306 var26 = (class306) var25.method2430(67); var26 != null; var26 = (class306) var25.method2435(arg0 - 133)) {
            if (var26.method2060(28533, arg2, arg3, arg1) && class266.field4286 == var26.field4848) {
                if (var26.field4859 instanceof class219) {
                    class219 var27 = (class219) var26.field4859;
                    int var28 = var27.method903(-85);
                    if ((var28 & 0x1) == 0 && (var27.field724 & 0x7F) == 0 && (var27.field722 & 0x7F) == 0 || (var28 & 0x1) == 1 && (var27.field724 & 0x7F) == 64 && (var27.field722 & 0x7F) == 64) {
                        int var29 = var27.field724 - ((var27.method903(-91) - 1) * 64);
                        int var30 = var27.field722 + 64 - (var27.method903(-72) * 64);
                        for (int var31 = 0; var31 < class397.field5940; var31++) {
                            class50 var36 = class39.field499[class423.field6253[var31]];
                            if (var36 != null && class183.field2987 != var36.field1847 && var36.field1819) {
                                int var37 = var36.field724 - ((var36.field615.field3779 - 1) * 64);
                                int var38 = var36.field722 + 64 - (var36.field615.field3779 * 64);
                                if (var29 <= var37 && var36.field615.field3779 <= var27.method903(-103) - (var37 - var29 >> 7) && var30 <= var38 && var36.field615.field3779 <= var27.method903(-49) - (var38 - var30 >> 7)) {
                                    class183.method1252(var36, arg0 ^ 0xFFFFFFA5);
                                    var36.field1847 = class183.field2987;
                                }
                            }
                        }
                        for (int var32 = 0; var32 < class107.field1500; var32++) {
                            class219 var33 = class216.field3517[class132.field2063[var32]];
                            if (var33 != null && class183.field2987 != var33.field1847 && var27 != var33 && var33.field1819) {
                                int var34 = var33.field724 + 64 - (var33.method903(-84) * 64);
                                int var35 = var33.field722 + 64 - (var33.method903(-70) * 64);
                                if (var34 >= var29 && var33.method903(-121) <= (var27.method903(-43) - (var34 - var29 >> 7)) && var35 >= var30 && var33.method903(arg0 ^ 0x20) <= (var27.method903(-90) - (var35 - var30 >> 7))) {
                                    class181.method1244(var33, (byte) -94);
                                    var33.field1847 = class183.field2987;
                                }
                            }
                        }
                    }
                    if (class183.field2987 == var27.field1847) {
                        continue;
                    }
                    class181.method1244(var27, (byte) -94);
                    var27.field1847 = class183.field2987;
                }
                if (var26.field4859 instanceof class50) {
                    class50 var39 = (class50) var26.field4859;
                    if (var39.field615 != null) {
                        if ((var39.field615.field3779 & 0x1) == 0 && (var39.field724 & 0x7F) == 0 && (var39.field722 & 0x7F) == 0 || (var39.field615.field3779 & 0x1) == 1 && (var39.field724 & 0x7F) == 64 && (var39.field722 & 0x7F) == 64) {
                            int var40 = var39.field724 + 64 - (var39.field615.field3779 * 64);
                            int var41 = var39.field722 - (var39.field615.field3779 - 1) * 64;
                            for (int var42 = 0; var42 < class397.field5940; var42++) {
                                class50 var47 = class39.field499[class423.field6253[var42]];
                                if (var47 != null && class183.field2987 != var47.field1847 && var39 != var47 && var47.field1819) {
                                    int var48 = var47.field724 - (var47.field615.field3779 - 1) * 64;
                                    int var49 = var47.field722 + 64 - var47.field615.field3779 * 64;
                                    if (var48 >= var40 && (var39.field615.field3779 - (var48 - var40 >> 7)) >= var47.field615.field3779 && var41 <= var49 && var39.field615.field3779 - (var49 - var41 >> 7) >= var47.field615.field3779) {
                                        class183.method1252(var47, 0);
                                        var47.field1847 = class183.field2987;
                                    }
                                }
                            }
                            for (int var43 = 0; var43 < class107.field1500; var43++) {
                                class219 var44 = class216.field3517[class132.field2063[var43]];
                                if (var44 != null && class183.field2987 != var44.field1847 && var44.field1819) {
                                    int var45 = var44.field724 + 64 - (var44.method903(-75) * 64);
                                    int var46 = var44.field722 + 64 - var44.method903(arg0 ^ 0x7C) * 64;
                                    if (var40 <= var45 && var44.method903(-106) <= var39.field615.field3779 - (var45 - var40 >> 7) && var41 <= var46 && var44.method903(-83) <= (var39.field615.field3779 - (var46 - var41 >> 7))) {
                                        class181.method1244(var44, (byte) -94);
                                        var44.field1847 = class183.field2987;
                                    }
                                }
                            }
                        }
                        if (class183.field2987 == var39.field1847) {
                            continue;
                        }
                        class183.method1252(var39, arg0 + 91);
                        var39.field1847 = class183.field2987;
                    }
                }
                if (var26.field4859 instanceof class193) {
                    class9 var50 = (class9) class312.field4924.method1770(-880, (long) (var26.field4848 << 28 | var26.field4852 << 14 | var26.field4855));
                    if (var50 != null) {
                        for (class271 var51 = (class271) var50.field109.method257(-112); var51 != null; var51 = (class271) var50.field109.method254(119)) {
                            class97 var52 = class155.method1092(true, var51.field4351);
                            if (class374.field5639 == 1) {
                                class413.method2587((long) var51.field4351, class318.field4986, var26.field4855, class71.field878, 26, var26.field4852, class287.field4606 + " -> <col=ff9040>" + var52.field1370, arg0 - 142);
                                class246.field4034++;
                            } else if (class449.field6546) {
                                class309 var57 = class264.field4251 == -1 ? null : class255.method1760(class264.field4251, arg0 ^ 0xFFFFFF9A);
                                if ((class379.field5737 & 0x1) != 0 && (var57 == null || var52.method726(var57.field4893, (byte) -105, class264.field4251) != var57.field4893)) {
                                    class318.field4978++;
                                    class413.method2587((long) var51.field4351, class306.field4854, var26.field4855, class248.field4058, 5, var26.field4852, class213.field3414 + " -> <col=ff9040>" + var52.field1370, arg0 ^ 0xB2);
                                }
                            } else {
                                String[] var53 = var52.field1346;
                                for (int var54 = 4; var54 >= 0; var54--) {
                                    if (var53 != null && var53[var54] != null) {
                                        byte var55 = 0;
                                        if (var54 == 0) {
                                            var55 = 47;
                                        }
                                        int var56 = class32.field398;
                                        if (var54 == 1) {
                                            var55 = 3;
                                        }
                                        if (var54 == 2) {
                                            var55 = 6;
                                        }
                                        if (var54 == 3) {
                                            var55 = 57;
                                        }
                                        if (var54 == 4) {
                                            var55 = 30;
                                        }
                                        if (var52.field1295 == var54) {
                                            var56 = var52.field1294;
                                        }
                                        if (var52.field1351 == var54) {
                                            var56 = var52.field1327;
                                        }
                                        class413.method2587((long) var51.field4351, var53[var54], var26.field4855, var56, var55, var26.field4852, "<col=ff9040>" + var52.field1370, -233);
                                        class353.field5436++;
                                    }
                                }
                                class413.method2587((long) var51.field4351, class252.field4102, var26.field4855, class216.field3522, 1012, var26.field4852, "<col=ff9040>" + var52.field1370, -233);
                                class281.field4510++;
                            }
                        }
                    }
                }
                if (var26.field4859 instanceof class149) {
                    class149 var58 = (class149) var26.field4859;
                    class127 var59 = class137.method1003(var58.method197(true), arg0 - 30705);
                    if (var59.field1984 != null) {
                        var59 = var59.method948((byte) -56);
                    }
                    if (var59 != null) {
                        if (class374.field5639 == 1) {
                            class235.field3933++;
                            class413.method2587(class449.method2796(var26.field4855, var58, -15620, var26.field4852), class318.field4986, var26.field4855, class71.field878, 33, var26.field4852, class287.field4606 + " -> <col=00ffff>" + var59.field2009, -233);
                        } else if (class449.field6546) {
                            class309 var60 = class264.field4251 == -1 ? null : class255.method1760(class264.field4251, 63);
                            if ((class379.field5737 & 0x4) != 0 && (var60 == null || var59.method939(20177, var60.field4893, class264.field4251) != var60.field4893)) {
                                class236.field3949++;
                                class413.method2587(class449.method2796(var26.field4855, var58, -15620, var26.field4852), class306.field4854, var26.field4855, class248.field4058, 9, var26.field4852, class213.field3414 + " -> <col=00ffff>" + var59.field2009, -233);
                            }
                        } else {
                            String[] var61 = var59.field1955;
                            if (var61 != null) {
                                for (int var62 = 4; var62 >= 0; var62--) {
                                    if (var61[var62] != null) {
                                        short var63 = 0;
                                        if (var62 == 0) {
                                            var63 = 41;
                                        }
                                        int var64 = class32.field398;
                                        if (var62 == 1) {
                                            var63 = 50;
                                        }
                                        if (var62 == 2) {
                                            var63 = 19;
                                        }
                                        if (var62 == 3) {
                                            var63 = 49;
                                        }
                                        if (var62 == 4) {
                                            var63 = 1008;
                                        }
                                        if (var59.field2004 == var62) {
                                            var64 = var59.field1968;
                                        }
                                        if (var59.field2006 == var62) {
                                            var64 = var59.field1966;
                                        }
                                        class38.field483++;
                                        class413.method2587(class449.method2796(var26.field4855, var58, -15620, var26.field4852), var61[var62], var26.field4855, var64, var63, var26.field4852, "<col=00ffff>" + var59.field2009, -233);
                                    }
                                }
                            }
                            class205.field3301++;
                            class413.method2587((long) var59.field2016, class252.field4102, var26.field4855, class216.field3522, 1001, var26.field4852, "<col=00ffff>" + var59.field2009, -233);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lff;IJ)V", line = 481)
    public final void method2535(class7 arg0, int arg1, long arg2) {
        if (arg1 != 64) {
            return;
        }
        if (arg0.field90 != null) {
            arg0.method90((byte) -53);
        }
        field6023++;
        class7 var5 = this.field6018[(int) (arg2 & (long) (this.field6021 - 1))];
        arg0.field90 = var5.field90;
        arg0.field89 = var5;
        arg0.field90.field89 = arg0;
        arg0.field86 = arg2;
        arg0.field89.field90 = arg0;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIILe;ILid;IZII)Lid;", line = 513)
    public static final class348 method2536(int arg0, int arg1, int arg2, int arg3, class312 arg4, int arg5, class348 arg6, int arg7, boolean arg8, int arg9, int arg10) {
        field6015++;
        long var11 = (long) arg5;
        class348 var13 = (class348) class51.field625.method331((byte) 69, var11);
        short var14 = 1031;
        if (var13 == null) {
            class86 var15 = class21.method154(arg5, class267.field4293, 0, (byte) 34);
            if (var15 == null) {
                return null;
            }
            var13 = arg4.method639(var15, var14, class127.field1961, 64, 768);
            class51.field625.method341(113, var11, var13);
        }
        class348 var16 = var13.method15((byte) 2, var14, arg8);
        if (arg9 != 0) {
            var16.method41(arg9);
        }
        if (arg10 != 0) {
            var16.method42(arg10);
        }
        if (arg1 != 0) {
            var16.method18(arg1);
        }
        if (arg3 != 0) {
            var16.method51(0, arg3, 0);
        }
        return var16;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V", line = 564)
    public static final void method2537(int arg0) {
        field6022++;
        if (class395.field5920 != null) {
            return;
        }
        int var1 = class13.field192;
        int var2 = class108.field1512;
        if (arg0 != -12029) {
            return;
        }
        int var3 = class318.field4984 - class369.field5615 - var1;
        int var4 = class284.field4567 - var2 - class430.field6324;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class47.field587 == null) {
                var5 = class63.field822.field4464;
            } else {
                var5 = class47.field587;
            }
            int var6 = 0;
            int var7 = 0;
            if (class47.field587 == var5) {
                Insets var8 = class47.field587.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class284.field4567);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class318.field4984, var2);
            }
            if (var3 > 0) {
                var9.fillRect(class318.field4984 + var6 - var3, var7, var3, class284.field4567);
            }
            if (var4 > 0) {
                var9.fillRect(var6, class284.field4567 + var7 - var4, class318.field4984, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IJ)Lff;", line = 636)
    public final class7 method2538(int arg0, long arg1) {
        field6011++;
        this.field6017 = arg1;
        class7 var4 = this.field6018[(int) ((long) (this.field6021 + arg0) & arg1)];
        for (this.field6024 = var4.field89; this.field6024 != var4; this.field6024 = this.field6024.field89) {
            if (this.field6024.field86 == arg1) {
                class7 var5 = this.field6024;
                this.field6024 = this.field6024.field89;
                return var5;
            }
        }
        this.field6024 = null;
        return null;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)Lff;", line = 672)
    public final class7 method2539(int arg0) {
        field6016++;
        if (this.field6024 == null) {
            return null;
        }
        class7 var2 = this.field6018[(int) (this.field6017 & (long) (this.field6021 - 1))];
        int var3 = 48 / ((arg0 + 90) / 35);
        while (this.field6024 != var2) {
            if (this.field6024.field86 == this.field6017) {
                class7 var4 = this.field6024;
                this.field6024 = this.field6024.field89;
                return var4;
            }
            this.field6024 = this.field6024.field89;
        }
        this.field6024 = null;
        return null;
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(I)V", line = 706)
    public class403(int arg0) {
        this.field6021 = arg0;
        this.field6018 = new class7[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class7 var3 = this.field6018[var2] = new class7();
            var3.field89 = var3;
            var3.field90 = var3;
        }
    }
}
