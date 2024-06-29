import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class110 extends class290 {

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
    public static int field1723 = 0;

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "Lml;")
    public static class160 field1724 = new class160(64);

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!jl", name = "s", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!jl", name = "t", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!jl", name = "u", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIIZ)V", line = 14)
    public static final void method718(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field1722++;
        int var6 = arg1 - arg2;
        int var7 = arg4 - arg3;
        if (var7 == 0) {
            if (var6 != 0) {
                class251.method1700(127, arg3, arg1, arg2, arg0);
            }
        } else if (var6 == 0) {
            class85.method593(arg0, (byte) 17, arg3, arg4, arg2);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg3;
                int var10 = arg4;
                arg4 = arg1;
                arg3 = arg2;
                arg2 = var9;
                arg1 = var10;
            }
            if (arg4 < arg3) {
                int var11 = arg3;
                arg3 = arg4;
                arg4 = var11;
                int var12 = arg2;
                arg2 = arg1;
                arg1 = var12;
            }
            if (arg5) {
                field1723 = -35;
            }
            int var13 = arg2;
            int var14 = arg4 - arg3;
            int var15 = arg1 - arg2;
            int var16 = arg2 < arg1 ? 1 : -1;
            if (var15 < 0) {
                var15 = -var15;
            }
            int var17 = -(var14 >> 1);
            if (var8) {
                for (int var19 = arg3; var19 <= arg4; var19++) {
                    class314.field5393[var19][var13] = arg0;
                    var17 += var15;
                    if (var17 > 0) {
                        var13 += var16;
                        var17 -= var14;
                    }
                }
            } else {
                for (int var18 = arg3; var18 <= arg4; var18++) {
                    var17 += var15;
                    class314.field5393[var13][var18] = arg0;
                    if (var17 > 0) {
                        var17 -= var14;
                        var13 += var16;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)V", line = 134)
    public static void method719(int arg0) {
        int var1 = -29 % ((-arg0 - 57) / 33);
        field1724 = null;
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)V", line = 142)
    public static final void method720(int arg0) {
        if (arg0 != -3) {
            field1723 = -42;
        }
        field1729++;
        class23.method114(class82.field1324, (byte) 94);
        class306.field5131++;
        if (class75.field1220 && class286.field4760) {
            int var1 = class138.field2493;
            int var2 = class260.field4366;
            int var3 = var2 - class174.field3085;
            if (var3 < class234.field3954) {
                var3 = class234.field3954;
            }
            if ((class234.field3954 + class88.field1378.field1753) < (class82.field1324.field1753 + var3)) {
                var3 = class234.field3954 + class88.field1378.field1753 - class82.field1324.field1753;
            }
            int var4 = var1 - class102.field1638;
            if (var4 < class32.field471) {
                var4 = class32.field471;
            }
            if ((class32.field471 + class88.field1378.field1766) < (var4 + class82.field1324.field1766)) {
                var4 = class88.field1378.field1766 + class32.field471 - class82.field1324.field1766;
            }
            int var5 = var4 - class307.field5199;
            int var6 = var3 - class30.field413;
            int var7 = class82.field1324.field1765;
            int var8 = var3 + class88.field1378.field1827 - class234.field3954;
            if (class82.field1324.field1837 < class306.field5131 && (var5 > var7 || var5 < (-var7) || var6 > var7 || var6 < (-var7))) {
                class17.field232 = true;
            }
            int var9 = var4 - (class32.field471 - class88.field1378.field1880);
            if (class82.field1324.field1779 != null && class17.field232) {
                class282 var10 = new class282();
                var10.field4685 = var9;
                var10.field4699 = class82.field1324.field1779;
                var10.field4697 = class82.field1324;
                var10.field4696 = var8;
                class309.method2111(var10, 200000);
            }
            if (class317.field5442 == 0) {
                if (class17.field232) {
                    if (class82.field1324.field1904 != null) {
                        class282 var11 = new class282();
                        var11.field4685 = var9;
                        var11.field4697 = class82.field1324;
                        var11.field4689 = class122.field2043;
                        var11.field4696 = var8;
                        var11.field4699 = class82.field1324.field1904;
                        class309.method2111(var11, 200000);
                    }
                    if (class122.field2043 != null && client.method811(class82.field1324) != null) {
                        class103.field1645.method1238(241, arg0 ^ 0xFFFFFF8D);
                        class322.field5500++;
                        class103.field1645.method947(class82.field1324.field1833, (byte) 97);
                        class103.field1645.method974(class122.field2043.field1875, (byte) 26);
                        class103.field1645.method938(-106, class122.field2043.field1833);
                        class103.field1645.method935(class82.field1324.field1875, arg0 + 1668921835);
                    }
                } else if ((class36.field527 == 1 || class129.method896(class173.field3067 - 1, false)) && class173.field3067 > 2) {
                    class111.method736(arg0 + 18);
                } else if (class173.field3067 > 0) {
                    class117.method766(8);
                }
                class82.field1324 = null;
            }
        } else if (class306.field5131 > 1) {
            class82.field1324 = null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)Lgi;", line = 261)
    public static final class294 method721(int arg0, int arg1) {
        if (arg0 >= -123) {
            method720(-10);
        }
        field1725++;
        class294 var2 = (class294) class209.field3571.method1173(-19839, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class303.field5045.method2173(class288.method1916(arg1, true), class202.method1424((byte) 121, arg1), (byte) -119);
        class294 var4 = new class294();
        if (var3 != null) {
            var4.method1953(new class134(var3), 121);
        }
        var4.method1950((byte) -71);
        class209.field3571.method1179(var4, (long) arg1, (byte) -72);
        return var4;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(II)V", line = 288)
    public static final void method722(int arg0, int arg1) {
        class265.field4493.method1175(true, arg1);
        field1728++;
        if (arg0 < 2) {
            method719(82);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILwd;II)V", line = 302)
    public static final void method723(int arg0, class112 arg1, int arg2, int arg3) {
        if (arg1.field1834 == 0) {
            arg1.field1919 = arg1.field1769;
        } else if (arg1.field1834 == 1) {
            arg1.field1919 = (arg3 - arg1.field1766) / 2 + arg1.field1769;
        } else if (arg1.field1834 == 2) {
            arg1.field1919 = arg3 - arg1.field1766 - arg1.field1769;
        } else if (arg1.field1834 == 3) {
            arg1.field1919 = arg1.field1769 * arg3 >> 14;
        } else if (arg1.field1834 == 4) {
            arg1.field1919 = (arg1.field1769 * arg3 >> 14) + (arg3 - arg1.field1766) / 2;
        } else {
            arg1.field1919 = arg3 - arg1.field1766 - (arg1.field1769 * arg3 >> 14);
        }
        if (arg2 <= 34) {
            field1723 = 43;
        }
        if (arg1.field1811 == 0) {
            arg1.field1784 = arg1.field1830;
        } else if (arg1.field1811 == 1) {
            arg1.field1784 = (arg0 - arg1.field1753) / 2 + arg1.field1830;
        } else if (arg1.field1811 == 2) {
            arg1.field1784 = arg0 - arg1.field1753 - arg1.field1830;
        } else if (arg1.field1811 == 3) {
            arg1.field1784 = arg1.field1830 * arg0 >> 14;
        } else if (arg1.field1811 == 4) {
            arg1.field1784 = (arg1.field1830 * arg0 >> 14) + (arg0 - arg1.field1753) / 2;
        } else {
            arg1.field1784 = arg0 - arg1.field1753 - (arg1.field1830 * arg0 >> 14);
        }
        if (class241.field4091 && (client.method804(arg1) != 0 || arg1.field1780 == 0)) {
            if (arg1.field1784 < 0) {
                arg1.field1784 = 0;
            } else if (arg0 < arg1.field1784 + arg1.field1753) {
                arg1.field1784 = arg0 - arg1.field1753;
            }
            if (arg1.field1919 < 0) {
                arg1.field1919 = 0;
            } else if (arg3 < arg1.field1919 + arg1.field1766) {
                arg1.field1919 = arg3 - arg1.field1766;
            }
        }
        field1726++;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B[F)[F", line = 389)
    public static final float[] method724(byte arg0, float[] arg1) {
        field1727++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 <= 95) {
            field1724 = (class160) null;
        }
        float[] var2 = new float[arg1.length];
        class230.method1569(arg1, 0, var2, 0, arg1.length);
        return var2;
    }
}
