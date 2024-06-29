import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class154 {

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public int field2014;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public int field2015;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public int field2018;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "Lfo;")
    public static class361 field2017;

    static {
        new class305("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");
        field2019 = 0;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V", line = 3)
    public static final void method914(int arg0) {
        field2013++;
        if (class352.field4700 == -1 || class117.field1530 == -1) {
            return;
        }
        int var1 = ((class319.field4260 - class525.field7731) * class130.field1675 >> 16) + class525.field7731;
        class130.field1675 += var1;
        if (class130.field1675 >= 65535) {
            if (class299.field3932) {
                class260.field3492 = false;
            } else {
                class260.field3492 = true;
            }
            class130.field1675 = 65535;
            class299.field3932 = true;
        } else {
            class260.field3492 = false;
            class299.field3932 = false;
        }
        if (arg0 != 8) {
            method917(-8, -21, 104);
        }
        float var2 = (float) class130.field1675 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class328.field4361 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class320.field4271[class352.field4700][var4][var5] * 3;
            int var22 = class320.field4271[class352.field4700][var4 + 1][var5] * 3;
            int var23 = (class320.field4271[class352.field4700][var4 + 2][var5] + class320.field4271[class352.field4700][var4 + 2][var5] - class320.field4271[class352.field4700][var4 + 3][var5]) * 3;
            int var24 = class320.field4271[class352.field4700][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - (var22 * 2);
            int var27 = class320.field4271[class352.field4700][var4 + 2][var5] + var22 - var24 - var23;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class267.field3572 = (int) var3[1] * -1;
        class139.field1857 = (int) var3[2] - (class418.field6074 * 128);
        class238.field3171 = (int) var3[0] - (class357.field4867 * 128);
        float[] var6 = new float[3];
        int var7 = class408.field5855 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class320.field4271[class117.field1530][var7][var8] * 3;
            int var15 = class320.field4271[class117.field1530][var7 + 1][var8] * 3;
            int var16 = (class320.field4271[class117.field1530][var7 + 2][var8] + class320.field4271[class117.field1530][var7 + 2][var8] - class320.field4271[class117.field1530][var7 + 3][var8]) * 3;
            int var17 = class320.field4271[class117.field1530][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - (var15 * 2);
            int var20 = class320.field4271[class117.field1530][var7 + 2][var8] + var15 - var16 - var17;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class65.field739 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class9.field110 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class230.field3104 = class320.field4271[class352.field4700][var4][3] + ((class320.field4271[class352.field4700][var4 + 2][3] - class320.field4271[class352.field4700][var4][3]) * class130.field1675 >> 16);
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V", line = 110)
    public static void method915(int arg0) {
        field2017 = null;
        if (arg0 != 0) {
            field2017 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 120)
    public static final void method916(String arg0, byte arg1) {
        class339.field4485 = arg0;
        field2016++;
        if (class381.field5518.field1828 == null) {
            return;
        }
        if (arg1 != 41) {
            method914(-28);
        }
        try {
            String var2 = class381.field5518.field1828.getParameter("cookieprefix");
            String var3 = class381.field5518.field1828.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class461.method2831(class45.method252((byte) -8) + 94608000000L, arg1 + 27985) + "; Max-Age=" + 94608000L;
            }
            class400.method2473(-63, "document.cookie=\"" + var5 + "\"", class381.field5518.field1828);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)Z", line = 169)
    public static final boolean method917(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class291.field3837; var3++) {
            class250 var4 = class281.field3724[var3];
            if (var4.field3336 == 1) {
                int var5 = var4.field3328 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field3323 * var5 >> 8) + var4.field3339;
                    int var7 = (var4.field3340 * var5 >> 8) + var4.field3338;
                    int var8 = (var4.field3332 * var5 >> 8) + var4.field3331;
                    int var9 = (var4.field3333 * var5 >> 8) + var4.field3342;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field3336 == 2) {
                int var10 = arg0 - var4.field3328;
                if (var10 > 0) {
                    int var11 = (var4.field3323 * var10 >> 8) + var4.field3339;
                    int var12 = (var4.field3340 * var10 >> 8) + var4.field3338;
                    int var13 = (var4.field3332 * var10 >> 8) + var4.field3331;
                    int var14 = (var4.field3333 * var10 >> 8) + var4.field3342;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field3336 == 3) {
                int var15 = var4.field3339 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field3347 * var15 >> 8) + var4.field3328;
                    int var17 = (var4.field3326 * var15 >> 8) + var4.field3343;
                    int var18 = (var4.field3332 * var15 >> 8) + var4.field3331;
                    int var19 = (var4.field3333 * var15 >> 8) + var4.field3342;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field3336 == 4) {
                int var20 = arg2 - var4.field3339;
                if (var20 > 0) {
                    int var21 = (var4.field3347 * var20 >> 8) + var4.field3328;
                    int var22 = (var4.field3326 * var20 >> 8) + var4.field3343;
                    int var23 = (var4.field3332 * var20 >> 8) + var4.field3331;
                    int var24 = (var4.field3333 * var20 >> 8) + var4.field3342;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field3336 == 5) {
                int var25 = arg1 - var4.field3331;
                if (var25 > 0) {
                    int var26 = (var4.field3347 * var25 >> 8) + var4.field3328;
                    int var27 = (var4.field3326 * var25 >> 8) + var4.field3343;
                    int var28 = (var4.field3323 * var25 >> 8) + var4.field3339;
                    int var29 = (var4.field3340 * var25 >> 8) + var4.field3338;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
