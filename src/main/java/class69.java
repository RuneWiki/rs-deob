import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class69 extends class445 {

    @OriginalMember(owner = "client!ej", name = "C", descriptor = "Lh;")
    public static class434 field944 = new class434(43, -1);

    @OriginalMember(owner = "client!ej", name = "N", descriptor = "Z")
    public static boolean field955 = true;

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "I")
    public int field934;

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "I")
    public int field935;

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "I")
    public int field936;

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "I")
    public int field937;

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "I")
    public int field938;

    @OriginalMember(owner = "client!ej", name = "x", descriptor = "I")
    public int field939;

    @OriginalMember(owner = "client!ej", name = "y", descriptor = "I")
    public int field940;

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "I")
    public int field941;

    @OriginalMember(owner = "client!ej", name = "A", descriptor = "I")
    public int field942;

    @OriginalMember(owner = "client!ej", name = "B", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!ej", name = "D", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!ej", name = "F", descriptor = "I")
    public int field947;

    @OriginalMember(owner = "client!ej", name = "G", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!ej", name = "K", descriptor = "I")
    public int field952;

    @OriginalMember(owner = "client!ej", name = "L", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!ej", name = "O", descriptor = "I")
    public int field956;

    @OriginalMember(owner = "client!ej", name = "P", descriptor = "I")
    public int field957;

    @OriginalMember(owner = "client!ej", name = "Q", descriptor = "I")
    public int field958;

    @OriginalMember(owner = "client!ej", name = "R", descriptor = "I")
    public int field959;

    @OriginalMember(owner = "client!ej", name = "T", descriptor = "I")
    public int field961;

    @OriginalMember(owner = "client!ej", name = "U", descriptor = "I")
    public int field962;

    @OriginalMember(owner = "client!ej", name = "H", descriptor = "Lr;")
    public static class110 field949;

    @OriginalMember(owner = "client!ej", name = "S", descriptor = "Lne;")
    public class191 field960;

    @OriginalMember(owner = "client!ej", name = "E", descriptor = "Lrc;")
    public static class346 field946;

    @OriginalMember(owner = "client!ej", name = "I", descriptor = "Lbd;")
    public class42 field950;

    @OriginalMember(owner = "client!ej", name = "J", descriptor = "Lqn;")
    public class44 field951;

    @OriginalMember(owner = "client!ej", name = "M", descriptor = "Ljn;")
    public class465 field954;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V")
    public final void method453(int arg0) {
        this.field950 = null;
        field945++;
        if (arg0 <= -30) {
            this.field960 = null;
            this.field954 = null;
            this.field951 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "()V")
    public static final void method454() {
        class466.field6457 = 0;
        label191: for (int var0 = 0; var0 < class398.field5490; var0++) {
            class143 var1 = class123.field1800[var0];
            if (class114.field1718 != null) {
                for (int var2 = 0; var2 < class114.field1718.length; var2++) {
                    if (class114.field1718[var2] != -1000000 && (var1.field2074 <= class114.field1718[var2] || var1.field2080 <= class114.field1718[var2]) && (var1.field2076 <= class385.field5335[var2] || var1.field2071 <= class385.field5335[var2]) && (var1.field2076 >= class130.field1918[var2] || var1.field2071 >= class130.field1918[var2]) && (var1.field2060 <= class432.field5884[var2] || var1.field2068 <= class432.field5884[var2]) && (var1.field2060 >= class165.field2289[var2] || var1.field2068 >= class165.field2289[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field2065 == 1) {
                int var3 = var1.field2073 + class314.field4169 - class121.field1779;
                if (var3 >= 0 && var3 <= class314.field4169 + class314.field4169) {
                    int var4 = var1.field2064 + class314.field4169 - class412.field5643;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field2067 + class314.field4169 - class412.field5643;
                    if (var5 > class314.field4169 + class314.field4169) {
                        var5 = class314.field4169 + class314.field4169;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class150.field2125[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class138.field2003 - var1.field2076;
                        if (var7 > class230.field3059) {
                            var1.field2066 = 1;
                        } else {
                            if (var7 >= -class230.field3059) {
                                continue;
                            }
                            var1.field2066 = 2;
                            var7 = -var7;
                        }
                        var1.field2078 = (var1.field2060 - class1.field6 << 8) / var7;
                        var1.field2059 = (var1.field2068 - class1.field6 << 8) / var7;
                        var1.field2075 = (var1.field2074 - class35.field540 << 8) / var7;
                        var1.field2079 = (var1.field2080 - class35.field540 << 8) / var7;
                        class51.field676[class466.field6457++] = var1;
                    }
                }
            } else if (var1.field2065 == 2) {
                int var8 = var1.field2064 + class314.field4169 - class412.field5643;
                if (var8 >= 0 && var8 <= class314.field4169 + class314.field4169) {
                    int var9 = var1.field2073 + class314.field4169 - class121.field1779;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field2062 + class314.field4169 - class121.field1779;
                    if (var10 > class314.field4169 + class314.field4169) {
                        var10 = class314.field4169 + class314.field4169;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class150.field2125[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class1.field6 - var1.field2060;
                        if (var12 > class230.field3059) {
                            var1.field2066 = 3;
                        } else {
                            if (var12 >= -class230.field3059) {
                                continue;
                            }
                            var1.field2066 = 4;
                            var12 = -var12;
                        }
                        var1.field2069 = (var1.field2076 - class138.field2003 << 8) / var12;
                        var1.field2081 = (var1.field2071 - class138.field2003 << 8) / var12;
                        var1.field2075 = (var1.field2074 - class35.field540 << 8) / var12;
                        var1.field2079 = (var1.field2080 - class35.field540 << 8) / var12;
                        class51.field676[class466.field6457++] = var1;
                    }
                }
            } else if (var1.field2065 == 4) {
                int var13 = var1.field2074 - class35.field540;
                if (var13 > class230.field3025) {
                    int var14 = var1.field2064 + class314.field4169 - class412.field5643;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field2067 + class314.field4169 - class412.field5643;
                    if (var15 > class314.field4169 + class314.field4169) {
                        var15 = class314.field4169 + class314.field4169;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field2073 + class314.field4169 - class121.field1779;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field2062 + class314.field4169 - class121.field1779;
                        if (var17 > class314.field4169 + class314.field4169) {
                            var17 = class314.field4169 + class314.field4169;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class150.field2125[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field2066 = 5;
                            var1.field2069 = (var1.field2076 - class138.field2003 << 8) / var13;
                            var1.field2081 = (var1.field2071 - class138.field2003 << 8) / var13;
                            var1.field2078 = (var1.field2060 - class1.field6 << 8) / var13;
                            var1.field2059 = (var1.field2068 - class1.field6 << 8) / var13;
                            class51.field676[class466.field6457++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(I)Z")
    public static final boolean method455(int arg0) {
        field953++;
        if (class284.field3842) {
            try {
                class361.method2207(class251.field3359.field3209, "showVideoAd", (byte) -75);
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 >= -22) {
            method456(-127, -115, 12, -12, -70, (byte) 116, -71, 23, -59);
        }
        return false;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIBIII)V")
    public static final void method456(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        if (arg5 != 122) {
            method457(71);
        }
        field948++;
        if (arg1 < 1 || arg8 < 1 || class295.field3947 - 2 < arg1 || (class39.field567 - 2) < arg8) {
            return;
        }
        int var9 = arg0;
        if (arg0 < 3 && class151.method894((byte) 36, arg8, arg1)) {
            var9 = arg0 + 1;
        }
        if (!class488.field6789.method2415(112, class222.field2958) && !class383.method2350(arg8, class160.field2220, var9, 77, arg1)) {
            return;
        }
        if (class289.field3897 == null) {
            return;
        }
        class98.field1438.method112(arg0, arg1, class60.field805[arg0], arg4, arg8, -128, class98.field1432);
        if (arg2 < 0) {
            return;
        }
        boolean var10 = class488.field6789.field6683;
        class488.field6789.field6683 = true;
        class98.field1438.method109(arg3, arg1, arg8, arg2, var9, -3, arg0, class98.field1432, class60.field805[arg0], arg7, arg6);
        class488.field6789.field6683 = var10;
        return;
    }

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "(I)V")
    public static void method457(int arg0) {
        field949 = null;
        if (arg0 != 8) {
            field946 = null;
        }
        field946 = null;
        field944 = null;
    }
}
