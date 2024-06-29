import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class144 {

    @OriginalMember(owner = "client!om", name = "j", descriptor = "[S")
    public static short[] field2011 = new short[256];

    @OriginalMember(owner = "client!om", name = "c", descriptor = "Z")
    public static boolean field2004 = false;

    @OriginalMember(owner = "client!om", name = "m", descriptor = "I")
    public static int field2014 = -1;

    @OriginalMember(owner = "client!om", name = "o", descriptor = "Ljava/lang/String;")
    public static String field2016 = "flash3:";

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!om", name = "g", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!om", name = "h", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!om", name = "k", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!om", name = "l", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!om", name = "p", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "Luk;")
    private class105 field2005;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "Lfh;")
    public static class140 field2007;

    @OriginalMember(owner = "client!om", name = "n", descriptor = "Llh;")
    private class213 field2015;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IBIZ)I", line = 7)
    public static final int method1121(int arg0, byte arg1, int arg2, boolean arg3) {
        field2002++;
        class223 var4 = (class223) class240.field3489.method2279((long) arg2, -124);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        if (arg1 > -22) {
            return -22;
        }
        for (int var6 = 0; var6 < var4.field3216.length; var6++) {
            if (var4.field3216[var6] >= 0 && class26.field296 > var4.field3216[var6]) {
                class362 var7 = class172.method1265(var4.field3216[var6], (byte) -128);
                if (var7.field5662 != null) {
                    class7 var8 = (class7) var7.field5662.method2279((long) arg0, -127);
                    if (var8 != null) {
                        if (arg3) {
                            var5 += var4.field3217[var6] * var8.field67;
                        } else {
                            var5 += var8.field67;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V", line = 58)
    public static final void method1122(byte arg0) {
        if (class32.field393 < 0) {
            class32.field393 = 0;
            class83.field1069 = -1;
            class323.field4744 = -1;
        }
        field2013++;
        if (class32.field393 > class38.field467) {
            class32.field393 = class38.field467;
            class323.field4744 = -1;
            class83.field1069 = -1;
        }
        if (class35.field428 < 0) {
            class83.field1069 = -1;
            class35.field428 = 0;
            class323.field4744 = -1;
        }
        if (class38.field459 < class35.field428) {
            class323.field4744 = -1;
            class83.field1069 = -1;
            class35.field428 = class38.field459;
        }
        int var1 = -128 / ((-arg0 - 58) / 39);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)Llh;", line = 104)
    public final class213 method1123(int arg0) {
        field2012++;
        class213 var2 = this.field2015;
        if (this.field2005.field1368 == var2) {
            this.field2015 = null;
            return null;
        }
        this.field2015 = var2.field3012;
        if (arg0 != 20389) {
            field2011 = (short[]) null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIIZLfh;)V", line = 127)
    public static final void method1124(int arg0, int arg1, int arg2, int arg3, boolean arg4, class140 arg5) {
        class314.field4639 = arg2;
        class172.field2384 = arg0;
        field2010++;
        class233.field3338 = 10000;
        class317.field4671 = arg3;
        class229.field3287 = arg5;
        if (arg1 == -20329) {
            class29.field330 = arg4;
            class194.field2673 = 1;
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(B)V", line = 147)
    public static final void method1125(byte arg0) {
        if (class302.field4426 < 128.0F) {
            class302.field4426 = 128.0F;
        }
        int var1 = class322.field4730 >> 7;
        if (class302.field4426 > 383.0F) {
            class302.field4426 = 383.0F;
        }
        while (class247.field3601 >= 2048.0F) {
            class247.field3601 -= 2048.0F;
        }
        int var2 = class135.field1845 >> 7;
        int var3 = 0;
        field2017++;
        int var4 = -2 / ((-arg0 - 13) / 35);
        while (class247.field3601 < 0.0F) {
            class247.field3601 += 2048.0F;
        }
        int var5 = class271.method1847(class135.field1845, true, class322.field4730, class56.field724);
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var6 = var1 - 4; var6 <= (var1 + 4); var6++) {
                for (int var7 = var2 - 4; var7 <= (var2 + 4); var7++) {
                    int var8 = class56.field724;
                    if (var8 < 3 && (class9.field101[1][var6][var7] & 0x2) == 2) {
                        var8++;
                    }
                    int var9 = var5 - (class74.field978[var8][var6][var7] - (class9.field100[var8][var6][var7] & 0xFF) * 8);
                    if (var9 > var3) {
                        var3 = var9;
                    }
                }
            }
        }
        int var10 = var3 * 192;
        if (var10 > 98048) {
            var10 = 98048;
        }
        if (var10 < 32768) {
            var10 = 32768;
        }
        if (var10 > class100.field1312) {
            class100.field1312 += (var10 - class100.field1312) / 24;
        } else if (class100.field1312 > var10) {
            class100.field1312 += (var10 - class100.field1312) / 80;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(II)V", line = 223)
    public static final void method1126(int arg0, int arg1) {
        class119 var2 = class345.field5367[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class119 var4 = class345.field5367[var3][arg0][arg1] = class345.field5367[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field1561--;
                for (int var5 = 0; var5 < var4.field1563; var5++) {
                    class294 var6 = var4.field1549[var5];
                    if ((var6.field4289 >> 29 & 0x3L) == 2L && var6.field4283 == arg0 && var6.field4287 == arg1) {
                        var6.field4278--;
                    }
                }
            }
        }
        if (class345.field5367[0][arg0][arg1] == null) {
            class345.field5367[0][arg0][arg1] = new class119(0, arg0, arg1);
        }
        class345.field5367[0][arg0][arg1].field1571 = var2;
        class345.field5367[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(B)V", line = 260)
    public static void method1127(byte arg0) {
        field2011 = null;
        if (arg0 <= -127) {
            field2007 = null;
            field2016 = null;
        }
    }

    @OriginalMember(owner = "client!om", name = "d", descriptor = "(B)Llh;", line = 273)
    public final class213 method1128(byte arg0) {
        field2009++;
        class213 var2 = this.field2005.field1368.field3012;
        if (this.field2005.field1368 == var2) {
            this.field2015 = null;
            return null;
        }
        this.field2015 = var2.field3012;
        if (arg0 != -79) {
            field2004 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ILuk;)V", line = 296)
    public final void method1129(int arg0, class105 arg1) {
        field2006++;
        if (arg0 == -16646) {
            this.field2005 = arg1;
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(II)I", line = 320)
    public static final int method1130(int arg0, int arg1) {
        if (arg1 <= 28) {
            method1126(18, 65);
        }
        field2008++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!om", name = "e", descriptor = "(B)V", line = 331)
    public static final void method1131(byte arg0) {
        if (arg0 != 48) {
            field2011 = (short[]) null;
        }
        field2003++;
        class271.field3888.method2262(false);
    }
}
