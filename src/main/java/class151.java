import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class151 {

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "Lvj;")
    private class90 field2174 = new class90();

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field2170 = 0;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "Z")
    public static boolean field2185 = false;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "Llk;")
    public static class244 field2176;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "Lvj;")
    private class90 field2180;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1018(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        field2175++;
        int var9 = 0;
        int var10 = arg3;
        int var11 = arg3 - arg1;
        int var12 = arg7 - arg1;
        int var13 = 5 / ((arg4 - 66) / 57);
        int var14 = arg7 * arg7;
        int var15 = var12 * var12;
        int var16 = arg3 * arg3;
        int var17 = var11 * var11;
        int var18 = var16 << 1;
        int var19 = var15 << 1;
        int var20 = var14 << 1;
        int var21 = var17 << 1;
        int var22 = arg3 << 1;
        int var23 = (1 - var22) * var14 + var18;
        int var24 = var11 << 1;
        int var25 = var16 - ((var22 - 1) * var20);
        int var26 = (1 - var24) * var15 + var21;
        int var27 = var17 - ((var24 - 1) * var19);
        int var28 = var14 << 2;
        int var29 = var16 << 2;
        int var30 = var17 << 2;
        int var31 = var15 << 2;
        int var32 = var21 * 3;
        int var33 = (var24 - 3) * var19;
        int var34 = (var22 - 3) * var20;
        int var35 = var29;
        int var36 = var18 * 3;
        int var37 = var30;
        int var38 = (arg3 - 1) * var28;
        int var39 = (var11 - 1) * var31;
        int[] var40 = class163.field2370[arg6];
        class183.method1181(arg0, (byte) -69, arg2 - var12, var40, arg2 - arg7);
        class183.method1181(arg5, (byte) -69, arg2 + var12, var40, arg2 - var12);
        class183.method1181(arg0, (byte) -69, arg2 + arg7, var40, arg2 + var12);
        while (var10 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var25 += var35;
                    var8++;
                    var35 += var29;
                    var23 += var36;
                    var36 += var29;
                }
            }
            boolean var41 = var10 <= var11;
            var10--;
            int var42 = arg6 - var10;
            int var43 = arg6 + var10;
            if (var25 < 0) {
                var8++;
                var25 += var35;
                var23 += var36;
                var36 += var29;
                var35 += var29;
            }
            var25 += -var34;
            var23 += -var38;
            int var44 = arg2 + var8;
            if (var41) {
                if (var26 < 0) {
                    while (var26 < 0) {
                        var27 += var37;
                        var26 += var32;
                        var9++;
                        var32 += var30;
                        var37 += var30;
                    }
                }
                if (var27 < 0) {
                    var9++;
                    var27 += var37;
                    var26 += var32;
                    var37 += var30;
                    var32 += var30;
                }
                var26 += -var39;
                var39 -= var31;
                var27 += -var33;
                var33 -= var31;
            }
            var34 -= var28;
            var38 -= var28;
            int var45 = arg2 - var8;
            if (var41) {
                int var46 = arg2 + var9;
                int var47 = arg2 - var9;
                class183.method1181(arg0, (byte) -69, var47, class163.field2370[var42], var45);
                class183.method1181(arg5, (byte) -69, var46, class163.field2370[var42], var47);
                class183.method1181(arg0, (byte) -69, var44, class163.field2370[var42], var46);
                class183.method1181(arg0, (byte) -69, var47, class163.field2370[var43], var45);
                class183.method1181(arg5, (byte) -69, var46, class163.field2370[var43], var47);
                class183.method1181(arg0, (byte) -69, var44, class163.field2370[var43], var46);
            } else {
                class183.method1181(arg0, (byte) -69, var44, class163.field2370[var42], var45);
                class183.method1181(arg0, (byte) -69, var44, class163.field2370[var43], var45);
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
    public static final void method1019(int arg0) {
        field2177++;
        if (arg0 != -25344) {
            return;
        }
        if ((class276.field4428 < class9.field166)) {
            class276.field4428 = (float) ((double) class276.field4428 / 30.0D + (double) class276.field4428);
            if (class9.field166 < class276.field4428) {
                class276.field4428 = class9.field166;
            }
            class81.method544(58);
        } else if (class276.field4428 > class9.field166) {
            class276.field4428 = (float) ((double) class276.field4428 - (double) class276.field4428 / 30.0D);
            if (class276.field4428 < class9.field166) {
                class276.field4428 = class9.field166;
            }
            class81.method544(84);
        }
        if (class140.field2028 == -1 || class12.field191 == -1) {
            return;
        }
        int var1 = class140.field2028 - class136.field1967;
        if (var1 < 2 || var1 > 2) {
            var1 >>= 0x4;
        }
        class136.field1967 += var1;
        int var2 = class12.field191 - class286.field4544;
        if (var2 < 2 || var2 > 2) {
            var2 >>= 0x4;
        }
        class286.field4544 += var2;
        if (var1 == 0 && var2 == 0) {
            class140.field2028 = -1;
            class12.field191 = -1;
        }
        class81.method544(-128);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljava/awt/Component;IBI)Lci;")
    public static final class173 method1020(Component arg0, int arg1, byte arg2, int arg3) {
        field2182++;
        try {
            if (arg2 < 17) {
                return null;
            } else {
                Class var4 = Class.forName("of");
                class173 var5 = (class173) var4.getDeclaredConstructor().newInstance();
                var5.method204(arg3, -125, arg1, arg0);
                return var5;
            }
        } catch (Throwable var7) {
            class27 var6 = new class27();
            var6.method204(arg3, -103, arg1, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)I")
    public static final int method1021(int arg0, int arg1, int arg2) {
        field2181++;
        class255 var3 = (class255) class168.field2428.method1218((long) arg2, 123);
        if (var3 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var4 = 0;
            if (arg0 != 17583) {
                field2170 = -58;
            }
            for (int var5 = 0; var5 < var3.field3871.length; var5++) {
                if (var3.field3867[var5] == arg1) {
                    var4 += var3.field3871[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)Lvj;")
    public final class90 method1022(int arg0) {
        field2186++;
        class90 var2 = this.field2180;
        if (this.field2174 == var2) {
            this.field2180 = null;
            return null;
        }
        if (arg0 != -9709) {
            this.field2180 = null;
        }
        this.field2180 = var2.field1367;
        return var2;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)Lvj;")
    public final class90 method1023(byte arg0) {
        field2171++;
        if (arg0 != 54) {
            field2173 = -122;
        }
        class90 var2 = this.field2174.field1367;
        if (this.field2174 == var2) {
            return null;
        } else {
            var2.method609(-15747);
            return var2;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)V")
    public final void method1024(boolean arg0) {
        if (arg0) {
            return;
        }
        while (true) {
            class90 var2 = this.field2174.field1367;
            if (this.field2174 == var2) {
                this.field2180 = null;
                field2178++;
                return;
            }
            var2.method609(-15747);
        }
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)V")
    public static void method1025(int arg0) {
        field2176 = null;
        if (arg0 < 104) {
            field2184 = 64;
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)Lvj;")
    public final class90 method1026(byte arg0) {
        field2183++;
        class90 var2 = this.field2174.field1367;
        if (this.field2174 == var2) {
            this.field2180 = null;
            return null;
        }
        if (arg0 < 124) {
            method1018(35, -85, -36, 112, 124, 79, 80, 124);
        }
        this.field2180 = var2.field1367;
        return var2;
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(B)I")
    public final int method1027(byte arg0) {
        field2172++;
        int var2 = 0;
        class90 var3 = this.field2174.field1367;
        if (arg0 > -88) {
            return 9;
        }
        while (this.field2174 != var3) {
            var2++;
            var3 = var3.field1367;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZLvj;)V")
    public final void method1028(boolean arg0, class90 arg1) {
        if (arg0) {
            field2169 = -41;
        }
        if (arg1.field1370 != null) {
            arg1.method609(-15747);
        }
        field2179++;
        arg1.field1370 = this.field2174.field1370;
        arg1.field1367 = this.field2174;
        arg1.field1370.field1367 = arg1;
        arg1.field1367.field1370 = arg1;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
    public class151() {
        this.field2174.field1367 = this.field2174;
        this.field2174.field1370 = this.field2174;
    }
}
