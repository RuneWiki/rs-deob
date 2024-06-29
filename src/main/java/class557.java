import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class557 extends class678 {

    @OriginalMember(owner = "client!ai", name = "B", descriptor = "I")
    public int field7882 = -1;

    @OriginalMember(owner = "client!ai", name = "x", descriptor = "I")
    public int field7878 = -1;

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "I")
    public int field7873 = 12800;

    @OriginalMember(owner = "client!ai", name = "C", descriptor = "I")
    public int field7883 = 0;

    @OriginalMember(owner = "client!ai", name = "D", descriptor = "I")
    public int field7884 = 12800;

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "Z")
    public boolean field7874 = true;

    @OriginalMember(owner = "client!ai", name = "z", descriptor = "I")
    public int field7880 = 0;

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "I")
    public int field7875;

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "Ljava/lang/String;")
    public String field7876;

    @OriginalMember(owner = "client!ai", name = "A", descriptor = "Ljava/lang/String;")
    public String field7881;

    @OriginalMember(owner = "client!ai", name = "G", descriptor = "I")
    public int field7887;

    @OriginalMember(owner = "client!ai", name = "K", descriptor = "Lhga;")
    public class158 field7891;

    @OriginalMember(owner = "client!ai", name = "J", descriptor = "Lsc;")
    public static class320 field7890 = new class320();

    @OriginalMember(owner = "client!ai", name = "M", descriptor = "Lsb;")
    public static class266 field7893 = new class266(80, 4);

    @OriginalMember(owner = "client!ai", name = "w", descriptor = "I")
    public static int field7877;

    @OriginalMember(owner = "client!ai", name = "y", descriptor = "I")
    public static int field7879;

    @OriginalMember(owner = "client!ai", name = "E", descriptor = "I")
    public static int field7885;

    @OriginalMember(owner = "client!ai", name = "F", descriptor = "I")
    public static int field7886;

    @OriginalMember(owner = "client!ai", name = "H", descriptor = "I")
    public static int field7888;

    @OriginalMember(owner = "client!ai", name = "I", descriptor = "I")
    public static int field7889;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ai", name = "N", descriptor = "Ljava/lang/Class;")
    public static Class field7894;

    @OriginalMember(owner = "client!ai", name = "L", descriptor = "[I")
    public static int[] field7892;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
    public final void method3169(int arg0) {
        this.field7880 = 0;
        field7877++;
        this.field7883 = 0;
        this.field7873 = 12800;
        this.field7884 = 12800;
        if (arg0 != 22509) {
            this.method3174(-81, -61, null, 92);
        }
        for (class306 var2 = (class306) this.field7891.method1224(-2); var2 != null; var2 = (class306) this.field7891.method1232(-2)) {
            if (this.field7884 > var2.field4537) {
                this.field7884 = var2.field4537;
            }
            if (this.field7883 < var2.field4527) {
                this.field7883 = var2.field4527;
            }
            if (this.field7880 < var2.field4531) {
                this.field7880 = var2.field4531;
            }
            if (var2.field4535 < this.field7873) {
                this.field7873 = var2.field4535;
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)V")
    public static void method3170(byte arg0) {
        if (arg0 > 113) {
            field7892 = null;
            field7893 = null;
            field7890 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "()V")
    public static final void method3171() {
        for (int var0 = 0; var0 < class6.field503; var0++) {
            if (!class397.field5786[var0]) {
                class682 var1 = class173.field2850[var0];
                class9 var2 = var1.field9658;
                int var3 = var1.field9665;
                int var4 = var2.method274((byte) 34) - class271.field4068;
                int var5 = (var4 * 2 >> class30.field940) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method276(-1) - var4 >> class30.field940;
                int var9 = var2.method270(-128) - var4 >> class30.field940;
                int var10 = var2.method270(93) + var4 >> class30.field940;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class107.field1852) {
                    var10 = class107.field1852 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field9663[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class520.field7369) {
                        var16 = class520.field7369 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class122 var19 = class63.method756(var3, var17, var11, field7894 == null ? (field7894 = method3177("vr")) : field7894);
                        if (var19 != null && var19.field2225 != 0) {
                            if (var19.field2225 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field9663[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field9663[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 0xFF) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field9663[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field9663[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 0xFF) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    var6++;
                }
                class397.field5786[var0] = true;
                class485.field6947[var3].method541(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(III)Z")
    public final boolean method3172(int arg0, int arg1, int arg2) {
        field7879++;
        if (arg1 >= -25) {
            this.field7873 = 42;
        }
        for (class306 var4 = (class306) this.field7891.method1224(-2); var4 != null; var4 = (class306) this.field7891.method1232(-2)) {
            if (var4.method2008(arg2, (byte) 91, arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "([IIII)Z")
    public final boolean method3173(int[] arg0, int arg1, int arg2, int arg3) {
        field7889++;
        class306 var5 = (class306) this.field7891.method1224(-2);
        if (arg3 != 0) {
            field7893 = null;
        }
        while (var5 != null) {
            if (var5.method2004(arg1, 8470, arg2)) {
                var5.method2006(arg2, arg0, arg3 ^ 0x30CD, arg1);
                return true;
            }
            var5 = (class306) this.field7891.method1232(-2);
        }
        return false;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II[II)Z")
    public final boolean method3174(int arg0, int arg1, int[] arg2, int arg3) {
        if (arg3 != 0) {
            this.method3174(93, -73, null, 86);
        }
        field7885++;
        for (class306 var5 = (class306) this.field7891.method1224(-2); var5 != null; var5 = (class306) this.field7891.method1232(-2)) {
            if (var5.method2008(arg1, (byte) 76, arg0)) {
                var5.method2007(0, arg1, arg0, arg2);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(B)Z")
    public static final boolean method3175(byte arg0) {
        if (arg0 != 117) {
            field7890 = null;
        }
        field7886++;
        return class481.field6904 > 0;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(III[II)Z")
    public final boolean method3176(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        field7888++;
        if (arg1 >= -114) {
            this.method3169(30);
        }
        for (class306 var6 = (class306) this.field7891.method1224(-2); var6 != null; var6 = (class306) this.field7891.method1232(-2)) {
            if (var6.method2010(arg2, arg4, true, arg0)) {
                var6.method2007(0, arg2, arg0, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
    public class557(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field7875 = arg3;
        this.field7876 = arg1;
        this.field7881 = arg2;
        this.field7874 = arg5;
        this.field7878 = arg6;
        this.field7882 = arg4;
        this.field7887 = arg0;
        if (this.field7878 == 255) {
            this.field7878 = 0;
        }
        this.field7891 = new class158();
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3177(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
