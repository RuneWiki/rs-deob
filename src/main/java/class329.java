import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class329 {

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "[F")
    public static float[] field4961 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "Lpi;")
    public static class342 field4964 = new class342("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public int field4965;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
    private int field4969;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "Lug;")
    public static class392 field4971;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIBI)Z", line = 9)
    public final boolean method2109(int arg0, int arg1, byte arg2, int arg3) {
        field4967++;
        int var5 = this.field4969;
        if (this.field4965 == arg1 && this.field4969 == 0) {
            return false;
        }
        if (arg2 != -31) {
            this.method2109(-102, -34, (byte) -102, 8);
        }
        boolean var6;
        if (this.field4969 == 0) {
            if (this.field4965 < arg1 && (this.field4965 + arg3) >= arg1 || this.field4965 > arg1 && arg1 >= this.field4965 - arg3) {
                this.field4965 = arg1;
                return false;
            }
            var6 = true;
        } else if (this.field4969 > 0 && arg1 > this.field4965) {
            int var7 = this.field4969 * this.field4969 / (arg3 * 2);
            int var8 = this.field4965 + var7;
            if (var8 < arg1 && this.field4965 <= var8) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else if (this.field4969 < 0 && this.field4965 > arg1) {
            int var9 = this.field4969 * this.field4969 / (arg3 * 2);
            int var10 = this.field4965 - var9;
            if (arg1 < var10 && this.field4965 >= var10) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else {
            var6 = false;
        }
        if (var6) {
            if (arg1 > this.field4965) {
                this.field4969 += arg3;
                if (arg0 != 0 && this.field4969 > arg0) {
                    this.field4969 = arg0;
                }
            } else {
                this.field4969 -= arg3;
                if (arg0 != 0 && -arg0 > this.field4969) {
                    this.field4969 = -arg0;
                }
            }
            if (this.field4969 != var5) {
                int var11 = this.field4969 * this.field4969 / (arg3 * 2);
                if (arg1 > this.field4965) {
                    if ((this.field4965 + var11) > arg1) {
                        this.field4969 = var5;
                    }
                } else if (arg1 < this.field4965 && this.field4965 - var11 < arg1) {
                    this.field4969 = var5;
                }
            }
        } else if (this.field4969 <= 0) {
            this.field4969 += arg3;
            if (this.field4969 > 0) {
                this.field4969 = 0;
            }
        } else {
            this.field4969 -= arg3;
            if (this.field4969 < 0) {
                this.field4969 = 0;
            }
        }
        this.field4965 += this.field4969 + var5 >> 1;
        return var6;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lae;B)V", line = 146)
    public static final void method2110(class163 arg0, byte arg1) {
        arg0.field2523 = null;
        if (arg1 > -89) {
            return;
        }
        field4970++;
        int var2 = arg0.field2516.length;
        for (int var3 = 0; var3 < var2; var3++) {
            arg0.field2516[var3].field6809 = false;
        }
        class254[] var4 = class241.field3477;
        synchronized (class241.field3477) {
            if (var2 < class241.field3477.length && class427.field6351[var2] < 200) {
                class241.field3477[var2].method1636(9, arg0);
                int var10002 = class427.field6351[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)I", line = 177)
    public static final int method2111(int arg0, int arg1, int arg2) {
        field4963++;
        if (arg2 != 0) {
            method2115((byte) -83);
        }
        if (arg1 > arg0) {
            int var3 = arg0;
            arg0 = arg1;
            arg1 = var3;
        }
        while (arg1 != 0) {
            int var4 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BI)V", line = 208)
    public final void method2112(byte arg0, int arg1) {
        if (arg0 != -51) {
            this.method2109(3, -35, (byte) 9, 7);
        }
        this.field4965 = arg1;
        field4968++;
        this.field4969 = 0;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V", line = 221)
    public final void method2113(int arg0) {
        field4962++;
        if (arg0 <= -88) {
            this.field4965 &= 0x3FFF;
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)I", line = 232)
    public final int method2114(int arg0) {
        if (arg0 != 0) {
            method2110(null, (byte) -89);
        }
        field4972++;
        return this.field4965 & 0x3FFF;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)Lt;", line = 247)
    public static final class471 method2115(byte arg0) {
        field4966++;
        try {
            if (arg0 >= -25) {
                method2110(null, (byte) 96);
            }
            return (class471) Class.forName("wn").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IB)Lvr;", line = 262)
    public static final class89 method2116(int arg0, byte arg1) {
        field4973++;
        if (class206.field2985 && class3.field97 <= arg0 && class391.field5915 >= arg0) {
            return arg1 < 53 ? null : class440.field6577[arg0 - class3.field97];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)V", line = 276)
    public static void method2117(int arg0) {
        field4964 = null;
        if (arg0 != 0) {
            field4964 = null;
        }
        field4971 = null;
        field4961 = null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIBLjava/lang/String;)V", line = 290)
    public static final void method2118(int arg0, int arg1, int arg2, byte arg3, String arg4) {
        field4974++;
        class350 var5 = class83.method649((byte) 117, arg2, arg1);
        if (var5 == null) {
            return;
        }
        if (var5.field5349 != null) {
            class207 var6 = new class207();
            var6.field2996 = var5.field5349;
            var6.field2995 = var5;
            var6.field2997 = arg0;
            var6.field2991 = arg4;
            class437.method2614(var6);
        }
        boolean var7 = true;
        if (var5.field5219 != 0) {
            var7 = class386.method2391(var5, (byte) 92);
        }
        if (!var7 || !client.method1349(var5).method1609(arg0 - 1, (byte) -31)) {
            return;
        }
        if (arg0 == 1) {
            class477.field7121++;
            class28.method321(class196.field2893, -5001);
            class307.method2012(arg1, var5.field5273, true, arg2);
        }
        if (arg0 == 2) {
            class28.method321(class19.field329, -5001);
            class79.field1338++;
            class307.method2012(arg1, var5.field5273, true, arg2);
        }
        if (arg0 == 3) {
            class28.method321(class197.field2896, -5001);
            class358.field5446++;
            class307.method2012(arg1, var5.field5273, true, arg2);
        }
        if (arg0 == 4) {
            class173.field2666++;
            class28.method321(class122.field1980, -5001);
            class307.method2012(arg1, var5.field5273, true, arg2);
        }
        if (arg0 == 5) {
            class17.field266++;
            class28.method321(class445.field6628, -5001);
            class307.method2012(arg1, var5.field5273, true, arg2);
        }
        if (arg0 == 6) {
            class28.method321(class97.field1616, -5001);
            class455.field6805++;
            class307.method2012(arg1, var5.field5273, true, arg2);
        }
        if (arg3 != -56) {
            field4961 = null;
        }
        if (arg0 == 7) {
            class105.field1761++;
            class28.method321(class378.field5718, -5001);
            class307.method2012(arg1, var5.field5273, true, arg2);
        }
        if (arg0 == 8) {
            class374.field5667++;
            class28.method321(class296.field4208, -5001);
            class307.method2012(arg1, var5.field5273, true, arg2);
        }
        if (arg0 == 9) {
            class28.method321(class124.field2010, -5001);
            class304.field4637++;
            class307.method2012(arg1, var5.field5273, true, arg2);
        }
        if (arg0 == 10) {
            class28.method321(class272.field3929, -5001);
            class233.field3395++;
            class307.method2012(arg1, var5.field5273, true, arg2);
        }
    }
}
