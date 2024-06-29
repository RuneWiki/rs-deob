import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class278 extends class116 {

    @OriginalMember(owner = "client!u", name = "yc", descriptor = "[Ljava/lang/String;")
    public static String[] field4415 = new String[] { "en", "de", "fr", "pt" };

    @OriginalMember(owner = "client!u", name = "vc", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!u", name = "zc", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!u", name = "Ac", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!u", name = "Bc", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!u", name = "Cc", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!u", name = "Dc", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!u", name = "Ec", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!u", name = "Fc", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!u", name = "Gc", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!u", name = "wc", descriptor = "Lwh;")
    public class12 field4413;

    @OriginalMember(owner = "client!u", name = "xc", descriptor = "Lfl;")
    public static class247 field4414;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "(I)I", line = 4)
    public final int method991(int arg0) {
        if (arg0 != 10295) {
            return -110;
        }
        field4412++;
        if (this.field4413.field179 != null) {
            class12 var2 = this.field4413.method122(arg0 ^ 0x2865);
            if (var2 != null && var2.field183 != -1) {
                return var2.field183;
            }
        }
        return this.field1962;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IZ)I", line = 25)
    public static final int method1906(int arg0, boolean arg1) {
        if (!arg1) {
            field4415 = (String[]) null;
        }
        field4423++;
        return arg0 == 16711935 ? -1 : class66.method634((byte) -128, arg0);
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "()I", line = 42)
    public final int method95() {
        field4420++;
        return this.field1989;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIIII)V", line = 52)
    public static final void method1907(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4422++;
        class137 var7 = class60.method557(arg6, 88, arg1);
        if (var7 != null && var7.field2473 != null) {
            class258 var8 = new class258();
            var8.field4173 = var7.field2473;
            var8.field4168 = var7;
            class179.method1376(var8, false);
        }
        class52.field811 = arg3;
        class292.field4681 = arg2;
        class321.field5075 = arg0;
        class179.field3027 = true;
        int var9 = -118 / ((9 - arg4) / 48);
        class161.field2861 = arg5;
        class230.field3839 = arg6;
        class17.field281 = arg1;
        class258.method1793(var7, 0);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIIIIIJILil;)V", line = 88)
    public final void method74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class65 arg10) {
        field4421++;
        if (this.field4413 == null) {
            return;
        }
        class285 var13 = this.field1998 != -1 && this.field1934 == 0 ? class346.method2428(this.field1998, (byte) -24) : null;
        class285 var14 = this.field2000 == -1 || this.field2000 == this.method980((byte) 73).field5521 && var13 != null ? null : class346.method2428(this.field2000, (byte) -24);
        class10 var15 = this.field4413.method120(this.field1932, this.field1974, this.field1929, this.field2026, var13, true, this.field2035, this.field2009, this.field1945, var14);
        if (var15 == null) {
            return;
        }
        this.field1989 = var15.method95();
        class12 var16 = this.field4413;
        if (var16.field179 != null) {
            var16 = var16.method122(24);
        }
        if (class195.field3276 && var16.field190) {
            class10 var17 = class258.method1786(arg0, this.field2011, this.field2036, (byte) -95, this.field4413.field141, this.field4413.field204, var15, this.field4413.field163, this.field1984, var14 == null ? this.field1932 : this.field1974, this.field1985, this.field4413.field202, this.field4413.field145, var14 == null ? var13 : var14);
            if (class43.field680) {
                float var18 = class43.method381();
                float var19 = class43.method382();
                class43.method354();
                class43.method375(var18, var19 - 150.0F);
                var17.method74(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field2012);
                class43.method376();
                class43.method375(var18, var19);
            } else {
                var17.method74(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field2012);
            }
        }
        this.method994(var15, (byte) 117);
        this.method982(var15, arg0, 102);
        class10 var20 = null;
        if (this.field1980 != -1 && this.field1966 != -1) {
            class158 var21 = class271.method1851(this.field1980, 0);
            var20 = var21.method1267(19, this.field1967, this.field1968, this.field1966);
            if (var20 != null) {
                var20.method85(0, -this.field1997, 0);
                if (var21.field2802) {
                    if (class17.field257 != 0) {
                        var20.method78(class17.field257);
                    }
                    if (class32.field459 != 0) {
                        var20.method104(class32.field459);
                    }
                    if (class125.field2164 != 0) {
                        var20.method85(0, class125.field2164, 0);
                    }
                }
            }
        }
        if (!class43.field680) {
            if (var20 != null) {
                var15 = ((class103) var15).method880(var20);
            }
            this.method993((byte) 60, var15, var20);
            if (this.field4413.field202 == 1) {
                var15.field127 = true;
            }
            var15.method74(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2012);
            return;
        }
        this.method993((byte) 60, var15, var20);
        if (this.field4413.field202 == 1) {
            var15.field127 = true;
        }
        var15.method74(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2012);
        if (var20 == null) {
            return;
        }
        if (this.field4413.field202 == 1) {
            var20.field127 = true;
        }
        if (this.field2012 != null) {
            class183 var22 = (class183) var20;
            this.field2012.method613(var22.field3086, var22.field3066, true, var22.field3080, var22.field3054, var22.field3087);
        }
        var20.method74(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2012);
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(B)Z", line = 218)
    public final boolean method981(byte arg0) {
        field4416++;
        if (arg0 == -90) {
            return this.field4413 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!u", name = "finalize", descriptor = "()V", line = 233)
    protected final void finalize() {
        field4418++;
        if (this.field2012 != null) {
            this.field2012.method624();
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIII)V", line = 247)
    public final void method97(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4419++;
        if (this.field4413 == null) {
            return;
        }
        if (!this.field1938) {
            class285 var6 = this.field1998 != -1 && this.field1934 == 0 ? class346.method2428(this.field1998, (byte) -24) : null;
            class285 var7 = this.field2000 == -1 || this.field2000 == this.method980((byte) 73).field5521 && var6 != null ? null : class346.method2428(this.field2000, (byte) -24);
            class10 var8 = this.field4413.method120(this.field1932, this.field1974, this.field1929, this.field2026, var6, true, this.field2035, this.field2009, this.field1945, var7);
            if (var8 == null) {
                return;
            }
            this.method993((byte) 60, var8, (class10) null);
        }
        if (this.field2012 != null) {
            this.field2012.method615(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lwh;I)V", line = 280)
    public final void method1908(class12 arg0, int arg1) {
        if (arg1 != 24717) {
            return;
        }
        this.field4413 = arg0;
        if (this.field2012 != null) {
            this.field2012.method620();
        }
        field4417++;
    }

    @OriginalMember(owner = "client!u", name = "h", descriptor = "(I)V", line = 295)
    public static void method1909(int arg0) {
        field4415 = null;
        if (arg0 != -18179) {
            method1907(61, -63, 12, 120, 101, 122, 48);
        }
        field4414 = null;
    }
}
