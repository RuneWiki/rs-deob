import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class268 {

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "[I")
    public static int[] field4182 = new int[32];

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "[I")
    public static int[] field4177 = new int[14];

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "Lpg;")
    public static class320 field4178 = new class320(500);

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field4186 = new String[100];

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4185 = "glow3:";

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "Lwj;")
    public static class270 field4181;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lkh;I)Lsi;", line = 6)
    public static final class335 method1847(class166 arg0, int arg1) {
        arg0.method1178(arg1 ^ arg1);
        field4179++;
        int var2 = arg0.method1178(0);
        class335 var3 = class176.method1258(var2, -10644);
        var3.field5230 = arg0.method1178(0);
        int var4 = arg0.method1178(0);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method1178(arg1);
            var3.method230(var6, arg0, 60);
        }
        var3.method381(arg1 ^ 0x72);
        return var3;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLl;)V", line = 38)
    public static final void method1848(byte arg0, class133 arg1) {
        class37.field571 = arg1;
        int var2 = 118 % ((-arg0 - 33) / 45);
        field4176++;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "([Lvg;Z[BIII)V", line = 50)
    public static final void method1849(class303[] arg0, boolean arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field4183++;
        int var6 = -1;
        if (arg4 != 63) {
            return;
        }
        class166 var7 = new class166(arg2);
        while (true) {
            int var8 = var7.method1123(32767);
            if (var8 == 0) {
                return;
            }
            var6 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var7.method1145(128);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 6 & 0x3F;
                int var13 = var9 >> 12;
                int var14 = var7.method1178(0);
                int var15 = var14 >> 2;
                int var16 = var12 + arg5;
                int var17 = arg3 + var11;
                int var18 = var14 & 0x3;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    class303 var19 = null;
                    if (!arg1) {
                        int var20 = var13;
                        if ((class92.field1468[1][var16][var17] & 0x2) == 2) {
                            var20 = var13 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg0[var20];
                        }
                    }
                    class257.method1764(arg1, var16, arg4 ^ 0xFFFF9047, !arg1, var19, var6, var17, var18, var13, var15, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZ)Lv;", line = 130)
    public static final class75 method1850(int arg0, boolean arg1) {
        field4180++;
        class75 var2 = (class75) class31.field447.method2179(false, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (!arg1) {
            field4178 = (class320) null;
        }
        class75 var3 = class225.method1593((byte) 123, arg0, class160.field2413, false, class241.field3861);
        if (var3 != null) {
            class31.field447.method2173(var3, arg1, (long) arg0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lj;I)V", line = 152)
    public static final void method1851(class150 arg0, int arg1) {
        field4175++;
        if (arg1 != 7467) {
            field4186 = (String[]) null;
        }
        class26.field398 = arg0;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)Z", line = 163)
    public static final boolean method1852(int arg0) {
        field4187++;
        try {
            if (arg0 != 24959) {
                method1854((byte) 127);
            }
            return class101.method742(-29217);
        } catch (IOException var5) {
            class233.method1640((byte) -77);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class342.field5333 + "," + class254.field3994 + "," + class224.field3557 + " - " + class186.field2778 + "," + (class213.field3249 + class98.field1566.field1910[0]) + "," + (class342.field5328 + class98.field1566.field1938[0]) + " - ";
            for (int var4 = 0; class186.field2778 > var4 && var4 < 50; var4++) {
                var3 = var3 + class10.field132.field2500[var4] + ",";
            }
            class184.method1322(var6, var3, (byte) -24);
            class108.method792((byte) 6);
            return true;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V", line = 199)
    public static void method1853(byte arg0) {
        field4185 = null;
        field4182 = null;
        field4181 = null;
        field4177 = null;
        if (arg0 >= 97) {
            field4186 = null;
            field4178 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)[Lgm;", line = 223)
    public static final class249[] method1854(byte arg0) {
        class249[] var1 = new class249[class290.field4519];
        field4184++;
        if (arg0 < 57) {
            return (class249[]) null;
        }
        for (int var2 = 0; var2 < class290.field4519; var2++) {
            int var3 = class75.field1215[var2] * class73.field1201[var2];
            byte[] var4 = class306.field4757[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class63.field1002[class270.method1860(255, var4[var6])];
            }
            var1[var2] = new class249(class65.field1019, class228.field3627, class97.field1546[var2], class320.field5001[var2], class75.field1215[var2], class73.field1201[var2], var5);
        }
        class7.method56((byte) 59);
        return var1;
    }
}
