import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public abstract class class223 {

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "I")
    private int field3713 = 4;

    @OriginalMember(owner = "client!wj", name = "o", descriptor = "I")
    private int field3717 = 0;

    @OriginalMember(owner = "client!wj", name = "p", descriptor = "I")
    public int field3718 = 4;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
    private int field3711 = 4;

    @OriginalMember(owner = "client!wj", name = "u", descriptor = "[S")
    private short[] field3723 = new short[512];

    @OriginalMember(owner = "client!wj", name = "w", descriptor = "I")
    private int field3725 = 4;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field3703 = new String[8];

    @OriginalMember(owner = "client!wj", name = "l", descriptor = "[S")
    public static short[] field3714 = new short[256];

    @OriginalMember(owner = "client!wj", name = "v", descriptor = "I")
    public static int field3724 = 1;

    @OriginalMember(owner = "client!wj", name = "m", descriptor = "Lal;")
    public static class52 field3715 = new class52(64);

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "F")
    public static float field3708;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!wj", name = "q", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!wj", name = "r", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!wj", name = "t", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!wj", name = "x", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!wj", name = "y", descriptor = "Lmo;")
    public static class447 field3727;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wj", name = "z", descriptor = "Ljava/lang/Class;")
    public static Class field3728;

    @OriginalMember(owner = "client!wj", name = "s", descriptor = "[S")
    private short[] field3721;

    // $FF: synthetic method
    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1605(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BIII)V", line = 3)
    public final void method1593(byte arg0, int arg1, int arg2, int arg3) {
        field3720++;
        if (arg0 != 66) {
            this.field3711 = -65;
        }
        int[] var5 = new int[arg2];
        int[] var6 = new int[arg1];
        for (int var7 = 0; var7 < arg2; var7++) {
            var5[var7] = (var7 << 12) / arg2;
        }
        int[] var8 = new int[arg3];
        for (int var9 = 0; var9 < arg1; var9++) {
            var6[var9] = (var9 << 12) / arg1;
        }
        for (int var10 = 0; var10 < arg3; var10++) {
            var8[var10] = (var10 << 12) / arg3;
        }
        this.method1209(111);
        for (int var11 = 0; var11 < arg3; var11++) {
            for (int var12 = 0; var12 < arg1; var12++) {
                for (int var13 = 0; var13 < arg2; var13++) {
                    for (int var14 = 0; var14 < this.field3718; var14++) {
                        int var15 = this.field3721[var14] << 12;
                        int var16 = this.field3711 * var15 >> 12;
                        int var17 = var8[var11] * var15 >> 12;
                        int var18 = this.field3713 * var15 >> 12;
                        int var19 = var6[var12] * var15 >> 12;
                        int var20 = this.field3725 * var15 >> 12;
                        int var21 = var5[var13] * var15 >> 12;
                        int var22 = this.field3725 * var17;
                        int var23 = this.field3711 * var19;
                        int var24 = this.field3713 * var21;
                        int var25 = var24 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var23 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var27 & 0xFF;
                        int var31 = var22 >> 12;
                        int var32 = var31 + 1;
                        int var33;
                        if (var16 > var29) {
                            var33 = var29 & 0xFF;
                        } else {
                            var33 = 0;
                        }
                        int var34 = var24 & 0xFFF;
                        int var35 = var22 & 0xFFF;
                        int var36;
                        if (var32 < var20) {
                            var36 = var32 & 0xFF;
                        } else {
                            var36 = 0;
                        }
                        int var37 = var31 & 0xFF;
                        int var38 = var23 & 0xFFF;
                        int var39;
                        if (var18 <= var26) {
                            var39 = 0;
                        } else {
                            var39 = var26 & 0xFF;
                        }
                        short var40 = this.field3723[var37];
                        int var41 = class379.field5723[var38];
                        int var42 = var38 - 4096;
                        int var43 = var35 - 4096;
                        int var44 = var34 - 4096;
                        short var45 = this.field3723[var36];
                        int var46 = class379.field5723[var34];
                        int var47 = class379.field5723[var35];
                        short var48 = this.field3723[var30 + var40];
                        short var49 = this.field3723[var30 + var45];
                        short var50 = this.field3723[var33 + var40];
                        short var51 = this.field3723[var33 + var45];
                        int var52 = class308.method2066(false, var34, var38, var35, this.field3723[var28 + var48]);
                        int var53 = class308.method2066(false, var44, var38, var35, this.field3723[var39 + var48]);
                        int var54 = var52 + ((var53 - var52) * var46 >> 12);
                        int var55 = class308.method2066(false, var34, var42, var35, this.field3723[var28 + var50]);
                        int var56 = class308.method2066(false, var44, var42, var35, this.field3723[var39 + var50]);
                        int var57 = ((var56 - var55) * var46 >> 12) + var55;
                        int var58 = var54 + ((var57 - var54) * var41 >> 12);
                        int var59 = class308.method2066(false, var34, var38, var43, this.field3723[var28 + var49]);
                        int var60 = class308.method2066(false, var44, var38, var43, this.field3723[var39 + var49]);
                        int var61 = ((var60 - var59) * var46 >> 12) + var59;
                        int var62 = class308.method2066(false, var34, var42, var43, this.field3723[var28 + var51]);
                        int var63 = class308.method2066(false, var44, var42, var43, this.field3723[var39 + var51]);
                        int var64 = ((var63 - var62) * var46 >> 12) + var62;
                        int var65 = ((var64 - var61) * var41 >> 12) + var61;
                        this.method1212(var14, ((var65 - var58) * var47 >> 12) + var58, (byte) -115);
                    }
                    this.method1210(true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V", line = 172)
    public static final void method1594(int arg0) {
        if (class262.field4219 == 10 || class262.field4219 == 28) {
            class284.method1934(5000, class427.field6301 >> 10, class290.field4631 >> 10, -18047);
        } else {
            class284.method1934(5000, class261.field4201.field1906[0] >> 3, class261.field4201.field1916[0] >> 3, -18047);
        }
        field3712++;
        class277.method1864((byte) 23);
        class326.method2163(1005);
        int var1 = 59 / ((arg0 - 18) / 44);
        class209.method1474((byte) -17);
        class183.method1253((byte) 28);
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(Z)V", line = 195)
    public static final void method1595(boolean arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class8.field107[var1] = false;
        }
        if (!arg0) {
            method1600((byte) 120);
        }
        field3726++;
        class217.field3557 = 0;
        class13.field194 = 1;
        class305.field4844 = -1;
        class254.field4125 = -1;
        class181.field2966 = 0;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 228)
    public static final void method1596(String arg0, int arg1) {
        field3722++;
        if (arg0 == null) {
            return;
        }
        if (!(class262.field4215 < 100 || class226.field3809) || class262.field4215 >= 200) {
            class357.method2329(class75.field951, 0);
            return;
        }
        String var2 = class428.method2652(arg0, false);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class262.field4215; var3++) {
            String var7 = class428.method2652(class338.field5248[var3], false);
            if (var7 != null && var7.equals(var2)) {
                class357.method2329(arg0 + class141.field2186, 0);
                return;
            }
            if (class70.field863[var3] != null) {
                String var8 = class428.method2652(class70.field863[var3], false);
                if (var8 != null && var8.equals(var2)) {
                    class357.method2329(arg0 + class141.field2186, 0);
                    return;
                }
            }
        }
        for (int var4 = 0; var4 < class418.field6190; var4++) {
            String var5 = class428.method2652(class269.field4317[var4], false);
            if (var5 != null && var5.equals(var2)) {
                class357.method2329(class372.field5623 + arg0 + class42.field523, 0);
                return;
            }
            if (class285.field4576[var4] != null) {
                String var6 = class428.method2652(class285.field4576[var4], false);
                if (var6 != null && var6.equals(var2)) {
                    class357.method2329(class372.field5623 + arg0 + class42.field523, 0);
                    return;
                }
            }
        }
        if (class428.method2652(class261.field4201.field3588, false).equals(var2)) {
            class357.method2329(class155.field2433, 0);
            return;
        }
        if (arg1 >= -76) {
            method1601(-65, false);
        }
        class449.field6545++;
        class11.field139.method2224(198, (byte) 0);
        class11.field139.method1312(class317.method2110(true, arg0), -126);
        class11.field139.method1301(arg0, 126);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIIIII)V", line = 325)
    public static final void method1597(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3704++;
        if (arg0 < 0) {
            field3727 = null;
        }
        if (arg1 < 0 || arg4 < 0 || (class80.field1003 - 1) <= arg1 || arg4 >= class380.field5751 - 1) {
            return;
        }
        if (class423.field6252 == null) {
            return;
        }
        if (arg6 != 0) {
            if (arg6 == 1) {
                class149 var8 = (class149) class238.method1684(arg2, arg1, arg4);
                if (var8 != null) {
                    if (var8 instanceof class284) {
                        ((class284) var8).field4555.method2040(arg5, -17647);
                        return;
                    }
                    int var9 = var8.method197(true);
                    if (arg3 != 4 && arg3 != 5) {
                        if (arg3 == 6) {
                            class150.method1061(arg6, arg4, true, 4, arg5, var9, arg1, arg2, arg7 + 4);
                        } else if (arg3 == 7) {
                            class150.method1061(arg6, arg4, true, 4, arg5, var9, arg1, arg2, (arg7 + 2 & 0x3) + 4);
                            return;
                        } else if (arg3 == 8) {
                            class150.method1061(arg6, arg4, true, 4, arg5, var9, arg1, arg2, arg7 + 4);
                            class150.method1061(arg6, arg4, true, 4, arg5, var9, arg1, arg2, (arg7 + 2 & 0x3) + 4);
                            return;
                        }
                        return;
                    }
                    class150.method1061(arg6, arg4, true, 4, arg5, var9, arg1, arg2, arg7);
                    return;
                }
            } else if (arg6 == 2) {
                class149 var10 = (class149) class12.method117(arg2, arg1, arg4, field3728 == null ? (field3728 = method1605("up")) : field3728);
                if (var10 != null) {
                    if (arg3 == 11) {
                        arg3 = 10;
                    }
                    if (!(var10 instanceof class285)) {
                        class150.method1061(arg6, arg4, true, arg3, arg5, var10.method197(true), arg1, arg2, arg7);
                        return;
                    }
                    ((class285) var10).field4574.method2040(arg5, -17647);
                    return;
                }
            } else if (arg6 == 3) {
                class149 var11 = (class149) class316.method2107(arg2, arg1, arg4);
                if (var11 == null) {
                    return;
                }
                if (var11 instanceof class212) {
                    ((class212) var11).field3390.method2040(arg5, -17647);
                    return;
                }
                class150.method1061(arg6, arg4, true, arg3, arg5, var11.method197(true), arg1, arg2, arg7);
            } else {
                return;
            }
            return;
        }
        class149 var12 = (class149) class139.method1016(arg2, arg1, arg4);
        class149 var13 = (class149) class160.method1118(arg2, arg1, arg4);
        if (var12 != null && arg3 != 2) {
            if ((var12 instanceof class181)) {
                ((class181) var12).field2969.method2040(arg5, -17647);
            } else {
                class150.method1061(arg6, arg4, true, arg3, arg5, var12.method197(true), arg1, arg2, arg7);
            }
        }
        if (var13 == null) {
            return;
        }
        if (var13 instanceof class181) {
            ((class181) var13).field2969.method2040(arg5, -17647);
            return;
        }
        class150.method1061(arg6, arg4, true, arg3, arg5, var13.method197(true), arg1, arg2, arg7);
        return;
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)V", line = 448)
    private final void method1598(int arg0) {
        field3707++;
        Random var2 = new Random((long) this.field3717);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field3723[var3] = (short) var3;
        }
        if (arg0 != 256) {
            return;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class105.method797(var2, -75, var5);
            short var7 = this.field3723[var6];
            this.field3723[var6] = this.field3723[var5];
            this.field3723[var5] = this.field3723[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILsd;II)V", line = 489)
    public static final void method1599(int arg0, class50 arg1, int arg2, int arg3) {
        if (arg1.field1878 == arg0 && arg0 != -1) {
            class417 var4 = class156.method1099(arg0, arg2 + 27529);
            int var5 = var4.field6172;
            if (var5 == 1) {
                arg1.field1893 = 1;
                arg1.field1845 = 0;
                arg1.field1885 = 0;
                arg1.field1880 = arg3;
                arg1.field1858 = 0;
                class196.method1374(arg1.field722, (byte) -104, arg1.field1845, arg1.field724, false, var4);
            }
            if (var5 == 2) {
                arg1.field1858 = 0;
            }
        } else if (arg0 == -1 || arg1.field1878 == -1 || class156.method1099(arg0, arg2 ^ 0xFFFF94BE).field6166 >= class156.method1099(arg1.field1878, 65).field6166) {
            arg1.field1885 = 0;
            arg1.field1893 = 1;
            arg1.field1880 = arg3;
            arg1.field1845 = 0;
            arg1.field1858 = 0;
            arg1.field1878 = arg0;
            arg1.field1911 = arg1.field1909;
            if (arg1.field1878 != -1) {
                class196.method1374(arg1.field722, (byte) -104, arg1.field1845, arg1.field724, false, class156.method1099(arg1.field1878, 55));
            }
        }
        if (arg2 == -27449) {
            field3705++;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V", line = 552)
    public static void method1600(byte arg0) {
        int var1 = 114 % ((arg0 + 70) / 39);
        field3714 = null;
        field3727 = null;
        field3703 = null;
        field3715 = null;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZ)V", line = 568)
    public static final void method1601(int arg0, boolean arg1) {
        field3706++;
        byte[][] var2;
        if (arg1) {
            var2 = class431.field6341;
        } else {
            var2 = class376.field5693;
        }
        int var3 = class254.field4123.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class52.field640[var4] >> 8) * 64 - class409.field6048;
                int var7 = (class52.field640[var4] & 0xFF) * 64 - class444.field6481;
                class409.method2566(true);
                class112.method830(class284.field4547, arg1, var6, var7, var5, -3, class162.field2547);
            }
        }
        if (arg0 > -71) {
            field3724 = -60;
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(IIIII)V", line = 1109)
    public class223(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3711 = arg3;
        this.field3725 = arg4;
        this.field3713 = arg2;
        this.field3718 = arg1;
        this.field3717 = arg0;
        this.method1602(2);
        this.method1598(256);
    }

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "(I)V", line = 612)
    private final void method1602(int arg0) {
        if (arg0 != 2) {
            this.field3718 = 53;
        }
        this.field3721 = new short[this.field3718];
        field3716++;
        for (int var2 = 0; var2 < this.field3718; var2++) {
            this.field3721[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZBLjava/lang/String;)V", line = 647)
    public static final void method1603(boolean arg0, byte arg1, String arg2) {
        if (arg1 != 66) {
            method1604((byte) -46, -22);
        }
        field3719++;
        if (class141.field2184 == 0 && class382.field5772 < 2) {
            return;
        }
        if (arg2.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
        }
        try {
            if (arg2.equalsIgnoreCase("fpson")) {
                class323.field5044 = true;
            }
            if (arg2.equalsIgnoreCase("fpsoff")) {
                class323.field5044 = false;
            }
            if (arg2.equalsIgnoreCase("cls")) {
                class92.field1134 = 0;
                class316.field4967 = 0;
            }
            if (arg2.equalsIgnoreCase("cleartext")) {
                class139.field2161.method2439(-119);
            }
            if (arg2.equalsIgnoreCase("gc")) {
                class245.method1706(-25568);
                for (int var3 = 0; var3 < 10; var3++) {
                    System.gc();
                }
                Runtime var4 = Runtime.getRuntime();
                int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
                class394.method2489((byte) 73, "mem=" + var5 + "k");
            }
            if (arg2.equalsIgnoreCase("compact")) {
                class245.method1706(-25568);
                for (int var6 = 0; var6 < 10; var6++) {
                    System.gc();
                }
                Runtime var7 = Runtime.getRuntime();
                int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                class394.method2489((byte) 64, "Memory before cleanup=" + var8 + "k");
                class12.method118((byte) -90);
                class245.method1706(arg1 ^ 0xFFFF9C62);
                for (int var9 = 0; var9 < 10; var9++) {
                    System.gc();
                }
                int var10 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                class394.method2489((byte) 37, "Memory after cleanup=" + var10 + "k");
            }
            if (arg2.equalsIgnoreCase("pcachesize")) {
                class394.method2489((byte) -123, "Number of player models in cache:" + class209.method1479(15795));
            }
            if (arg2.equalsIgnoreCase("clientdrop")) {
                class342.method2248(-1);
            }
            if (arg2.equalsIgnoreCase("clientjs5drop")) {
                class298.field4739.method1836((byte) -93);
            }
            if (arg2.equalsIgnoreCase("serverjs5drop")) {
                class298.field4739.method1847(3393);
            }
            if (arg2.equalsIgnoreCase("breakcon")) {
                class63.field822.method1899(99);
                class421.field6216.method1096(-15279);
                class298.field4739.method1837((byte) 93);
            }
            if (arg2.equalsIgnoreCase("rebuild")) {
                class3.method68(arg1 - 41);
                class257.method1780(true);
            }
            if (arg2.equalsIgnoreCase("wm1")) {
                class50.method319(false, -1, 1, 10371, -1);
            }
            if (arg2.equalsIgnoreCase("wm2")) {
                class50.method319(false, -1, 2, arg1 + 10305, -1);
            }
            if (arg2.equalsIgnoreCase("::wm3")) {
                class50.method319(false, 768, 3, arg1 ^ 0x28C1, 1024);
            }
            if (arg2.equalsIgnoreCase("tk0")) {
                class221.method1586(-1009, 0);
                class452.field6579 = 0;
                class306.method2062((byte) 106, class63.field822);
                class444.field6477 = false;
            }
            if (arg2.equalsIgnoreCase("tk1")) {
                class221.method1586(-1009, 1);
                class452.field6579 = 1;
                class306.method2062((byte) 105, class63.field822);
                class444.field6477 = false;
            }
            if (arg2.equalsIgnoreCase("tk2")) {
                class221.method1586(arg1 - 1075, 2);
                class452.field6579 = 2;
                class306.method2062((byte) 122, class63.field822);
                class444.field6477 = false;
            }
            if (arg2.equalsIgnoreCase("tk3")) {
                class221.method1586(-1009, 3);
            }
            if (arg2.equalsIgnoreCase("ot")) {
                class256.field4149 = !class256.field4149;
                class306.method2062((byte) 101, class63.field822);
                class444.field6477 = false;
                class3.method68(25);
            }
            if (arg2.equalsIgnoreCase("gb")) {
                class395.field5923 = !class395.field5923;
                class306.method2062((byte) 123, class63.field822);
                class444.field6477 = false;
                class3.method68(25);
            }
            if (arg2.startsWith("shadows ")) {
                class299.field4755 = class162.method1128(arg2.substring(8), 118);
                class306.method2062((byte) 107, class63.field822);
                class444.field6477 = false;
                class3.method68(25);
            }
            if (arg2.startsWith("setba")) {
                class386.field5835 = class162.method1128(arg2.substring(6), 102);
                class306.method2062((byte) 123, class63.field822);
                class444.field6477 = false;
            }
            if (arg2.startsWith("setparticles")) {
                class331.method2196(arg1 ^ 0x42, class162.method1128(arg2.substring(13), arg1 ^ 0x37));
                class306.method2062((byte) 101, class63.field822);
                class444.field6477 = false;
            }
            if (arg2.startsWith("fps ") && class141.field2184 != 0) {
                class298.method2015(-5635, class162.method1128(arg2.substring(4), arg1 ^ 0x2E));
            }
            if (arg2.startsWith("rect_debug")) {
                class377.field5698 = class162.method1128(arg2.substring(10).trim(), 113);
                class394.method2489((byte) 24, "rect_debug=" + class377.field5698);
            }
            if (arg2.equalsIgnoreCase("qa_op_test")) {
                class80.field1000 = true;
            }
            if (arg2.equalsIgnoreCase("clipcomponents")) {
                class13.field191 = !class13.field191;
                class394.method2489((byte) -106, "clipcomponents=" + class13.field191);
            }
            if (arg2.startsWith("bloom")) {
                boolean var11 = class284.field4547.method657();
                if (!class348.method2270(!var11, -61)) {
                    class394.method2489((byte) -113, "Failed to enable bloom");
                } else if (var11) {
                    class394.method2489((byte) 25, "Bloom disabled");
                } else {
                    class394.method2489((byte) -104, "Bloom enabled");
                }
            }
            if (arg2.equalsIgnoreCase("tween")) {
                if (class191.field3120) {
                    class191.field3120 = false;
                    class394.method2489((byte) 124, "Forced tweening disabled.");
                } else {
                    class191.field3120 = true;
                    class394.method2489((byte) 125, "Forced tweening ENABLED!");
                }
            }
            if (arg2.equalsIgnoreCase("shiftclick")) {
                if (class183.field2983) {
                    class394.method2489((byte) 63, "Shift-click disabled.");
                    class183.field2983 = false;
                } else {
                    class394.method2489((byte) -118, "Shift-click ENABLED!");
                    class183.field2983 = true;
                }
            }
            if (arg2.equalsIgnoreCase("getcgcoord")) {
                class394.method2489((byte) -126, "x:" + (class261.field4201.field724 >> 7) + " z:" + (class261.field4201.field722 >> 7));
            }
            if (arg2.equalsIgnoreCase("getheight")) {
                class394.method2489((byte) -103, "Height: " + class275.field4396[class266.field4286].method779(class261.field4201.field724 >> 7, class261.field4201.field722 >> 7));
            }
            if (arg2.equalsIgnoreCase("resetminimap")) {
                field3727.method2779(-119);
                field3727.method2774(-10298);
                class267.method1819(arg1 ^ 0xFFFFD707);
                class257.method1780(true);
            }
            if (arg2.startsWith("mc")) {
                if (class284.field4547.method615()) {
                    int var12 = Integer.parseInt(arg2.substring(3));
                    if (var12 < 1) {
                        var12 = 1;
                    } else if (var12 > 4) {
                        var12 = 4;
                    }
                    class447.field6501 = var12;
                    class284.field4547.method636(class447.field6501);
                    class284.field4547.method674(0);
                    class394.method2489((byte) -112, "Render cores now: " + class447.field6501);
                } else {
                    class394.method2489((byte) 12, "Current toolkit doesn't support multiple cores");
                }
            }
            if (arg2.startsWith("cachespace")) {
                class394.method2489((byte) -106, "I(s): " + class89.field1112.method338(-19696) + "/" + class89.field1112.method339((byte) -105));
                class394.method2489((byte) 35, "I(m): " + class338.field5247.method338(-19696) + "/" + class338.field5247.method339((byte) -112));
                class394.method2489((byte) 15, "O(s): " + class110.field1528.method2476((byte) -70) + "/" + class110.field1528.method2470((byte) 87));
            }
            if (arg2.equalsIgnoreCase("getcamerapos")) {
                class394.method2489((byte) 94, "Pos: " + class266.field4286 + "," + ((class427.field6301 >> 7) + class409.field6048 >> 6) + "," + ((class290.field4631 >> 7) + class444.field6481 >> 6) + "," + ((class427.field6301 >> 7) + class409.field6048 & 0x3F) + "," + ((class290.field4631 >> 7) + class444.field6481 & 0x3F) + " Height: " + (class58.method386(class266.field4286, (byte) -114, class427.field6301, class290.field4631) - class379.field5733));
                class394.method2489((byte) 126, "Look: " + class266.field4286 + "," + (class409.field6048 + class364.field5541 >> 6) + "," + (class444.field6481 + class136.field2123 >> 6) + "," + (class409.field6048 + class364.field5541 & 0x3F) + "," + (class444.field6481 + class136.field2123 & 0x3F) + " Height: " + (class58.method386(class266.field4286, (byte) -110, class364.field5541, class136.field2123) - class89.field1120));
            }
            if (arg2.equals("showocc")) {
                class381.field5767 = !class381.field5767;
                class3.method68(25);
            }
            if (arg2.equals("renderprofile") || arg2.equals("rp")) {
                class39.field495 = !class39.field495;
                class284.field4547.method652(class39.field495);
                class8.method97((byte) 91);
            }
            if (arg2.equals("nonpcs")) {
                class77.field963 = !class77.field963;
            }
            if (arg2.equals("autoworld")) {
                class252.method1751(-1);
            }
            if (arg2.equals("heap")) {
                class394.method2489((byte) -108, "Heap: " + class27.field314 + "MB");
            }
            if (arg2.equals("savevarcs")) {
                class8.method94(true);
            }
            if (arg2.equals("scramblevarcs")) {
                for (int var13 = 0; var13 < class158.field2520.length; var13++) {
                    if (class338.field5250[var13]) {
                        class158.field2520[var13] = (int) (Math.random() * 99999.0D);
                        if (Math.random() > 0.5D) {
                            class158.field2520[var13] *= -1;
                        }
                    }
                }
                class8.method94(true);
            }
            if (arg2.equals("showcolmap")) {
                class126.field1941 = true;
                class257.method1780(true);
            }
            if (arg2.equals("hidecolmap")) {
                class126.field1941 = false;
                class257.method1780(true);
            }
            if (arg2.equals("resetcache")) {
                class346.method2261(15);
            }
            if (arg2.equals("profilecpu")) {
                class394.method2489((byte) -121, class367.method2361(75) + "ms");
            }
            if (class262.field4219 == 30) {
                class99.field1394++;
                class11.field139.method2224(99, (byte) 0);
                class11.field139.method1312(arg2.length() + 2, -30);
                class11.field139.method1312(arg0 ? 1 : 0, -117);
                class11.field139.method1301(arg2, arg1 + 35);
                return;
            }
        } catch (Exception var14) {
            class394.method2489((byte) -109, "Whoops, something went wrong.");
            return;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BI)Lml;", line = 1079)
    public static final class218 method1604(byte arg0, int arg1) {
        field3709++;
        class218 var2 = (class218) class191.field3116.method331((byte) 69, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class182.field2979.method2771(35, arg1, 3);
        class218 var4 = new class218();
        if (var3 != null) {
            var4.method1557(new class186(var3), (byte) 32);
        }
        var4.method1555(0);
        if (arg0 > -84) {
            field3727 = null;
        }
        class191.field3116.method341(47, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)V")
    public abstract void method1210(boolean arg0);

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V")
    public abstract void method1209(int arg0);

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIB)V")
    public abstract void method1212(int arg0, int arg1, byte arg2);
}
