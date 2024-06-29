import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class124 {

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "[I")
    public static int[] field2006 = new int[100];

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    public static int field2014 = 0;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field2010 = null;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field2007 = 50;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "[[[I")
    public static int[][][] field2012;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method891(byte arg0, Component arg1) {
        field2008++;
        Method var2 = class165.field2627;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg1.addKeyListener(class72.field1188);
        arg1.addFocusListener(class72.field1188);
        if (arg0 != -11) {
            method892(-26, (class36) null);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILf;)Lf;")
    public static final class36 method892(int arg0, class36 arg1) {
        if (arg0 != 325) {
            return null;
        }
        field2011++;
        class36 var2 = client.method1088(arg1);
        if (var2 == null) {
            var2 = arg1.field600;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
    public static final void method893(byte arg0) {
        if (arg0 != 116) {
            field2010 = null;
        }
        field2013++;
        while (true) {
            class128 var1;
            class207 var3;
            do {
                var1 = (class128) class123.field1999.method845((byte) 113);
                if (var1 == null) {
                    return;
                }
                if (var1.field2075 < 0) {
                    int var2 = -var1.field2075 - 1;
                    if (class233.field3811 == var2) {
                        var3 = class167.field2655;
                    } else {
                        var3 = class35.field548[var2];
                    }
                } else {
                    int var4 = var1.field2075 - 1;
                    var3 = class137.field2260[var4];
                }
            } while (var3 == null);
            class135 var5 = class209.method1447(var1.field2067, arg0 - 6769);
            int var6;
            int var7;
            if (var1.field2060 == 1 || var1.field2060 == 3) {
                var7 = var5.field2225;
                var6 = var5.field2175;
            } else {
                var6 = var5.field2225;
                var7 = var5.field2175;
            }
            int var8 = (var7 >> 1) + var1.field2058;
            int var9 = var1.field2057 + (var6 >> 1);
            int var10 = (var7 + 1 >> 1) + var1.field2058;
            int var11 = var1.field2057 + (var6 + 1 >> 1);
            int[][] var12 = field2012[class250.field3980];
            int var13 = var12[var8][var11] + var12[var10][var11] + var12[var8][var9] + var12[var10][var9] >> 2;
            class260 var14 = null;
            int var15 = class95.field1562[var1.field2066];
            if (var15 == 0) {
                class229 var19 = class91.method682(class250.field3980, var1.field2058, var1.field2057);
                if (var19 != null) {
                    var14 = var19.field3775;
                }
            } else if (var15 == 1) {
                class278 var18 = class179.method1220(class250.field3980, var1.field2058, var1.field2057);
                if (var18 != null) {
                    var14 = var18.field4390;
                }
            } else if (var15 == 2) {
                class289 var17 = class10.method78(class250.field3980, var1.field2058, var1.field2057);
                if (var17 != null) {
                    var14 = var17.field4581;
                }
            } else if (var15 == 3) {
                class42 var16 = class57.method425(class250.field3980, var1.field2058, var1.field2057);
                if (var16 != null) {
                    var14 = var16.field789;
                }
            }
            if (var14 != null) {
                class201.method1366(var1.field2069 + 1, arg0 + -116, var1.field2059 + 1, 0, var1.field2057, var15, class250.field3980, -1, 0, var1.field2058);
                var3.field3336 = var13;
                var3.field3391 = var14;
                int var20 = var1.field2056;
                int var21 = var1.field2073;
                int var22 = var1.field2070;
                int var23 = var1.field2068;
                if (var21 > var23) {
                    int var24 = var21;
                    var21 = var23;
                    var23 = var24;
                }
                var3.field3319 = class222.field3682 + var1.field2069;
                var3.field3398 = class222.field3682 + var1.field2059;
                var3.field3326 = var1.field2057 * 128 + (var6 * 64);
                var3.field3314 = var1.field2058 + var21;
                var3.field3369 = var1.field2058 + var23;
                var3.field3409 = var1.field2058 * 128 + (var7 * 64);
                if (var20 < var22) {
                    int var25 = var22;
                    var22 = var20;
                    var20 = var25;
                }
                var3.field3381 = var1.field2057 + var22;
                var3.field3393 = var1.field2057 + var20;
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lf;Z)V")
    public static final void method894(class36 arg0, boolean arg1) {
        field2005++;
        int var2 = arg0.field570;
        if (var2 == 324) {
            if (class11.field159 == -1) {
                class11.field159 = arg0.field561;
                class205.field3284 = arg0.field708;
            }
            if (class197.field3149.field1809) {
                arg0.field561 = class11.field159;
            } else {
                arg0.field561 = class205.field3284;
            }
        } else if (var2 == 325) {
            if (class11.field159 == -1) {
                class11.field159 = arg0.field561;
                class205.field3284 = arg0.field708;
            }
            if (class197.field3149.field1809) {
                arg0.field561 = class205.field3284;
            } else {
                arg0.field561 = class11.field159;
            }
        } else {
            if (!arg1) {
                field2007 = 41;
            }
            if (var2 == 327) {
                arg0.field647 = 150;
                arg0.field567 = (int) (Math.sin((double) class222.field3682 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field565 = 5;
                arg0.field598 = -1;
            } else if (var2 == 328) {
                if (class167.field2655.field525 == null) {
                    arg0.field598 = 0;
                } else {
                    arg0.field647 = 150;
                    arg0.field567 = (int) (Math.sin((double) class222.field3682 / 40.0D) * 256.0D) & 0x7FF;
                    arg0.field565 = 5;
                    arg0.field598 = ((int) class74.method522((byte) -79, class167.field2655.field525) << 11) + 2047;
                    arg0.field635 = 0;
                    arg0.field664 = class167.field2655.field3338;
                    arg0.field689 = class167.field2655.field3387;
                    arg0.field683 = class167.field2655.field3331;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V")
    public static final void method895(int arg0, int arg1) {
        if (arg0 >= -107) {
            method891((byte) 23, (Component) null);
        }
        field2009++;
        class259 var2 = class213.method1464((byte) -127, arg1, 9);
        var2.method1772((byte) -81);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)J")
    public static final long method896(int arg0, int arg1, int arg2) {
        class134 var3 = class288.field4563[arg0][arg1][arg2];
        return var3 == null || var3.field2140 == null ? 0L : var3.field2140.field786;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
    public static void method897(int arg0) {
        field2010 = null;
        field2006 = null;
        if (arg0 == -19308) {
            field2012 = null;
        }
    }
}
