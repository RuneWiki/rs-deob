import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class155 extends class83 {

    @OriginalMember(owner = "client!qg", name = "L", descriptor = "I")
    public static int field1958 = 500;

    @OriginalMember(owner = "client!qg", name = "O", descriptor = "Lph;")
    public static class114 field1961 = new class114(8);

    @OriginalMember(owner = "client!qg", name = "W", descriptor = "[I")
    public static int[] field1969 = new int[3];

    @OriginalMember(owner = "client!qg", name = "X", descriptor = "Z")
    public static boolean field1970 = true;

    @OriginalMember(owner = "client!qg", name = "Y", descriptor = "Ljava/lang/String;")
    public static String field1971 = "Loaded title screen";

    @OriginalMember(owner = "client!qg", name = "M", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!qg", name = "N", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!qg", name = "P", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!qg", name = "Q", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!qg", name = "R", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!qg", name = "S", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!qg", name = "T", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!qg", name = "U", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!qg", name = "V", descriptor = "I")
    public static int field1968;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qg", name = "Z", descriptor = "Ljava/lang/Class;")
    public static Class field1972;

    @OriginalMember(owner = "client!qg", name = "K", descriptor = "[Lln;")
    private class252[] field1957;

    // $FF: synthetic method
    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method836(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IBLtq;)V", line = 3)
    public final void method35(int arg0, byte arg1, class250 arg2) {
        ++field1960;
        if (arg0 != 0) {
            if (arg0 == 1) {
                super.field924 = arg2.method1350(31351) == 1;
            }
        } else {
            this.field1957 = new class252[arg2.method1350(31351)];
            for (int var4 = 0; this.field1957.length > var4; ++var4) {
                int var6 = arg2.method1350(31351);
                if (~var6 != -1) {
                    if (~var6 != -2) {
                        if (var6 != 2) {
                            if (~var6 == -4) {
                                this.field1957[var4] = class185.method994(-2, arg2);
                            }
                        } else {
                            this.field1957[var4] = class411.method2561(arg2, false);
                        }
                    } else {
                        this.field1957[var4] = client.method1411(87, arg2);
                    }
                } else {
                    this.field1957[var4] = class12.method55(-1, arg2);
                }
            }
        }
        int var5 = 13 / ((-27 - arg1) / 50);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IB)Lpa;", line = 76)
    public static final class341 method830(int arg0, byte arg1) {
        ++field1959;
        class341 var2 = (class341) class269.field3657.method222((long) arg0, -8407);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class356.field5038.method1687(class41.method197(arg0, -80), class449.method2769(arg0, (byte) -13), 255);
            if (arg1 != -98) {
                return null;
            } else {
                class341 var4 = new class341();
                if (var3 != null) {
                    var4.method1993((byte) 123, new class250(var3));
                }
                class269.field3657.method218((long) arg0, (byte) 76, var4);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)[I", line = 102)
    public final int[] method37(int arg0, int arg1) {
        if (arg0 != 2) {
            this.method21(true, -98);
        }
        ++field1965;
        int[] var3 = super.field916.method1813(arg1, (byte) 116);
        if (super.field916.field4174) {
            this.method834(0, super.field916.method1811((byte) -124));
        }
        return var3;
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(I)V", line = 126)
    public static final void method831(int arg0) {
        if (arg0 != -2) {
            field1970 = true;
        }
        ++field1966;
        while (true) {
            class242 var1;
            class419 var3;
            do {
                do {
                    var1 = (class242) class281.field3852.method815(12256);
                    if (var1 == null) {
                        return;
                    }
                } while (class176.field2209 == null);
                if (var1.field3288 < 0) {
                    int var2 = -var1.field3288 + -1;
                    if (~class324.field4325 == ~var2) {
                        var3 = class427.field6264;
                    } else {
                        var3 = class85.field957[var2];
                    }
                } else {
                    int var4 = var1.field3288 + -1;
                    var3 = class38.field397[var4];
                }
            } while (var3 == null);
            class225 var5 = class281.method1655((byte) -28, var1.field3290);
            int var6;
            int var7;
            if (var1.field3286 != 1 && var1.field3286 != 3) {
                var6 = var5.field2995;
                var7 = var5.field3019;
            } else {
                var6 = var5.field3019;
                var7 = var5.field2995;
            }
            int var8 = var1.field3291 - -(var6 >> 1);
            int var9 = (var6 - -1 >> 1) + var1.field3291;
            int var10 = var1.field3294 - -(var7 >> 1);
            int var11 = (var7 + 1 >> 1) + var1.field3294;
            class54 var12 = class98.field1161[var3.field161];
            int var13 = var12.method271(var8, var10) + var12.method271(var9, var10) + var12.method271(var8, var11) + var12.method271(var9, var11) >> 2;
            class285 var14 = null;
            int var15 = class126.field1629[var1.field3293];
            if (~var15 != -1) {
                if (~var15 == -2) {
                    var14 = (class285) class316.method1828(var3.field161, var1.field3291, var1.field3294);
                } else if (~var15 == -3) {
                    var14 = (class285) class165.method878(var3.field161, var1.field3291, var1.field3294, field1972 != null ? field1972 : (field1972 = method836("io")));
                } else if (var15 == 3) {
                    var14 = (class285) class275.method1514(var3.field161, var1.field3291, var1.field3294);
                }
            } else {
                var14 = (class285) class173.method906(var3.field161, var1.field3291, var1.field3294);
            }
            if (var14 != null) {
                class151.method802(0, var1.field3287, -1, 0, var3.field161, (byte) -7, var1.field3291, var15, var1.field3298 - -1, var1.field3294);
                var3.field6124 = class234.field3224 + var1.field3287;
                var3.field6110 = class234.field3224 + var1.field3298;
                var3.field6113 = var1.field3291 * 128 + var6 * 64;
                var3.field6125 = var1.field3294 * 128 + var7 * 64;
                var3.field6114 = var14;
                var3.field6107 = var13;
                int var16 = var1.field3302;
                int var17 = var1.field3300;
                int var18 = var1.field3299;
                int var19 = var1.field3296;
                if (var16 > var17) {
                    int var20 = var16;
                    var16 = var17;
                    var17 = var20;
                }
                var3.field6123 = var1.field3291 + var16;
                var3.field6116 = var1.field3291 + var17;
                if (var18 > var19) {
                    int var21 = var18;
                    var18 = var19;
                    var19 = var21;
                }
                var3.field6108 = var1.field3294 + var19;
                var3.field6106 = var1.field3294 + var18;
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(B)V", line = 262)
    public static void method832(byte arg0) {
        field1971 = null;
        if (arg0 > 86) {
            field1969 = null;
            field1961 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZII[B)Ljava/lang/String;", line = 275)
    public static final String method833(boolean arg0, int arg1, int arg2, byte[] arg3) {
        ++field1962;
        char[] var4 = new char[arg1];
        int var5 = 0;
        for (int var6 = 0; var6 < arg1; ++var6) {
            int var7 = arg3[arg2 + var6] & 255;
            if (var7 != 0) {
                if (~var7 <= -129 && ~var7 > -161) {
                    char var8 = class429.field6299[var7 + -128];
                    if (~var8 == -1) {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        if (!arg0) {
            method831(33);
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I[[I)V", line = 317)
    private final void method834(int arg0, int[][] arg1) {
        ++field1968;
        int var3 = class420.field6139;
        int var4 = class91.field1047;
        class449.method2770(arg1, 32);
        class27.method132(arg0, class109.field1348, 0, class213.field2881, arg0 ^ -62);
        if (this.field1957 != null) {
            for (int var5 = 0; ~var5 > ~this.field1957.length; ++var5) {
                class252 var6 = this.field1957[var5];
                int var7 = var6.field3450;
                int var8 = var6.field3447;
                if (var7 < 0) {
                    if (var8 >= 0) {
                        var6.method380(true, var4, var3);
                    }
                } else if (var8 < 0) {
                    var6.method377(var4, var3, 0);
                } else {
                    var6.method378(16136, var4, var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "(B)V", line = 366)
    public static final void method835(byte arg0) {
        ++field1964;
        if (arg0 == -51) {
            class6.field49.method613(true);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZI)[[I", line = 378)
    public final int[][] method21(boolean arg0, int arg1) {
        ++field1967;
        int[][] var3 = super.field927.method1774((byte) 126, arg1);
        if (super.field927.field4104) {
            int var4 = class420.field6139;
            int var5 = class91.field1047;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field927.method1777((byte) -78);
            this.method834(0, var6);
            for (int var8 = 0; ~class91.field1047 < ~var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; class420.field6139 > var14; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class262.method1461(4080, var15 << 4);
                    var12[var14] = class262.method1461(var15, 65280) >> 4;
                    var11[var14] = class262.method1461(16711680, var15) >> 12;
                }
            }
        }
        if (!arg0) {
            method832((byte) -29);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V", line = 450)
    public class155() {
        super(0, true);
    }
}
