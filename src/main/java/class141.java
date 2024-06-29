import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class141 extends class456 {

    @OriginalMember(owner = "client!iq", name = "L", descriptor = "[I")
    private int[] field2012 = new int[3];

    @OriginalMember(owner = "client!iq", name = "O", descriptor = "I")
    private int field2015 = 409;

    @OriginalMember(owner = "client!iq", name = "M", descriptor = "I")
    private int field2013 = 4096;

    @OriginalMember(owner = "client!iq", name = "N", descriptor = "I")
    private int field2014 = 4096;

    @OriginalMember(owner = "client!iq", name = "R", descriptor = "I")
    private int field2018 = 4096;

    @OriginalMember(owner = "client!iq", name = "Q", descriptor = "Lo;")
    public static class332 field2017 = new class332("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");

    @OriginalMember(owner = "client!iq", name = "S", descriptor = "Lsl;")
    public static class422 field2019 = new class422("", 14);

    @OriginalMember(owner = "client!iq", name = "T", descriptor = "Lo;")
    public static class332 field2020 = new class332("scroll:", "scrollen:", "déroulement:", "rolagem:");

    @OriginalMember(owner = "client!iq", name = "H", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!iq", name = "I", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!iq", name = "J", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!iq", name = "K", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!iq", name = "P", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!iq", name = "U", descriptor = "J")
    public static long field2021;

    // $FF: synthetic field
    @OriginalMember(owner = "client!iq", name = "W", descriptor = "Ljava/lang/Class;")
    public static Class field2023;

    @OriginalMember(owner = "client!iq", name = "V", descriptor = "Ljava/lang/String;")
    public static String field2022;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IBLre;)V")
    public final void method210(int arg0, byte arg1, class446 arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 == -5) {
                            int var5 = arg2.method2613(-25778);
                            this.field2012[1] = class412.method2463(65280, var5) >> 4;
                            this.field2012[2] = class412.method2463(0, var5 >> 12);
                            this.field2012[0] = class412.method2463(var5, 16711680) << 4;
                        }
                    } else {
                        this.field2018 = arg2.method2631(arg1 + 2475);
                    }
                } else {
                    this.field2014 = arg2.method2631(2530);
                }
            } else {
                this.field2013 = arg2.method2631(2530);
            }
        } else {
            this.field2015 = arg2.method2631(2530);
        }
        if (arg1 != 55) {
            field2017 = null;
        }
        ++field2011;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lfn;I)V")
    public static final void method972(class198 arg0, int arg1) {
        ++field2009;
        if (class170.field2427 != null) {
            class218 var2 = null;
            if (arg0.field2978 == arg1) {
                var2 = (class218) class147.method1006(arg0.field2988, arg0.field2986, arg0.field2974);
            }
            if (~arg0.field2978 == -2) {
                var2 = (class218) class115.method826(arg0.field2988, arg0.field2986, arg0.field2974);
            }
            if (arg0.field2978 == 2) {
                var2 = (class218) class390.method2350(arg0.field2988, arg0.field2986, arg0.field2974, field2023 != null ? field2023 : (field2023 = method976("ki")));
            }
            if (arg0.field2978 == 3) {
                var2 = (class218) class487.method2848(arg0.field2988, arg0.field2986, arg0.field2974);
            }
            if (var2 != null) {
                arg0.field2994 = var2.method257(false);
                arg0.field2980 = var2.method250((byte) 102);
                arg0.field2976 = var2.method244((byte) -40);
            } else {
                arg0.field2976 = 0;
                arg0.field2994 = -1;
                arg0.field2980 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(II)[[I")
    public final int[][] method212(int arg0, int arg1) {
        ++field2008;
        if (arg0 != 0) {
            method973(-6);
        }
        int[][] var3 = super.field6468.method1090(arg0 + -2, arg1);
        if (super.field6468.field2227) {
            int[][] var4 = this.method2709(false, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class156.field2169 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field2012[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (var13 > this.field2015) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field2012[1] + var14;
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (this.field2015 < var15) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field2012[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (~var17 < ~this.field2015) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field2018 * var12 >> 12;
                            var9[var11] = this.field2014 * var14 >> 12;
                            var10[var11] = this.field2013 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!iq", name = "h", descriptor = "(I)V")
    public static void method973(int arg0) {
        field2019 = null;
        if (arg0 == -20234) {
            field2022 = null;
            field2020 = null;
            field2017 = null;
        }
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "()V")
    public class141() {
        super(1, false);
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(Z)V")
    public static final void method974(boolean arg0) {
        ++field2016;
        if (!class389.field5719) {
            class346.method2131(class138.field1990, -116);
            if (class475.field6650 != null) {
                class346.method2131(class475.field6650, -108);
            }
            class389.field5719 = arg0;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIIBII)V")
    public static final void method975(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        ++field2010;
        int var6 = class352.method2172(arg2, class296.field4443, class176.field2503, arg3 + -91);
        int var7 = class352.method2172(arg1, class296.field4443, class176.field2503, 0);
        int var8 = class352.method2172(arg4, class119.field1643, class293.field4420, 0);
        if (arg3 != 91) {
            method973(74);
        }
        int var9 = class352.method2172(arg5, class119.field1643, class293.field4420, 0);
        for (int var10 = var6; var10 <= var7; ++var10) {
            class345.method2125(false, class49.field723[var10], var8, var9, arg0);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method976(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
