import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class289 extends class264 {

    @OriginalMember(owner = "client!oc", name = "P", descriptor = "Lap;")
    public static class310 field4098 = new class310(62, 15);

    @OriginalMember(owner = "client!oc", name = "U", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!oc", name = "W", descriptor = "Lmo;")
    public static class336 field4105;

    @OriginalMember(owner = "client!oc", name = "X", descriptor = "Lch;")
    public static class151 field4106;

    @OriginalMember(owner = "client!oc", name = "Y", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!oc", name = "N", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!oc", name = "O", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!oc", name = "Q", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!oc", name = "R", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!oc", name = "S", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!oc", name = "T", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!oc", name = "V", descriptor = "I")
    public static int field4104;

    // $FF: synthetic field
    @OriginalMember(owner = "client!oc", name = "Z", descriptor = "Ljava/lang/Class;")
    public static Class field4108;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "(I)V")
    public static void method1896(int arg0) {
        field4098 = null;
        field4105 = null;
        field4106 = null;
        if (arg0 != -4) {
            method1899((byte) 48, (class52[][][]) null);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lvc;II)Z")
    public static final boolean method1897(class89 arg0, int arg1, int arg2) {
        ++field4101;
        int var3 = (class36.field388 + -104) / 2;
        int var4 = (class68.field998 - 104) / 2;
        boolean var5 = true;
        int var6 = -36 / ((8 - arg1) / 34);
        for (int var7 = var3; var3 + 104 > var7; ++var7) {
            for (int var52 = var4; var52 < var4 - -104; ++var52) {
                for (int var53 = arg2; ~var53 >= -4; ++var53) {
                    if (class190.method1339(0, var52, arg2, var53, var7)) {
                        int var54 = var53;
                        if (class94.method783(var7, (byte) -86, var52)) {
                            var54 = var53 - 1;
                        }
                        if (~var54 <= -1) {
                            var5 &= class243.method1685(var52, (byte) -128, var54, var7);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        } else {
            int[] var8 = new int[262144];
            for (int var9 = 0; var9 < var8.length; ++var9) {
                var8[var9] = -16777216;
            }
            class369.field5087 = arg0.method342(var8, 0, 512, 512, 512);
            class1.method2(-60);
            int var10 = -16777216 | (-10 + 238 + (int) (20.0D * Math.random()) << 8) + (((int) (Math.random() * 20.0D) + 238 - 10 << 16) - 10 - -((int) (20.0D * Math.random()))) - -238;
            int var11 = -10 + (238 - -((int) (Math.random() * 20.0D))) << 16 | -16777216;
            int var12 = (int) (Math.random() * 8.0D) << 8 | (int) (8.0D * Math.random()) << 16 | (int) (Math.random() * 8.0D);
            boolean[][] var13 = new boolean[class219.field3169][class219.field3169];
            for (int var14 = var3; var3 - -104 > var14; var14 += class219.field3169) {
                for (int var37 = var4; ~(var4 + 104) < ~var37; var37 += class219.field3169) {
                    arg0.method453(0, 0, class219.field3169 * 4, class219.field3169 * 4);
                    arg0.method373(-16777216);
                    for (int var38 = arg2; ~var38 >= -4; ++var38) {
                        for (int var45 = 0; class219.field3169 > var45; ++var45) {
                            for (int var51 = 0; ~class219.field3169 < ~var51; ++var51) {
                                var13[var45][var51] = class190.method1339(0, var37 + var51, arg2, var38, var14 + var45);
                            }
                        }
                        class190.field2858[var38].method585(0, 0, 1024, var14, var37, class219.field3169 + var14, class219.field3169 + var37, var13);
                        if (!class436.field6205) {
                            for (int var46 = -4; class219.field3169 > var46; ++var46) {
                                for (int var47 = -4; class219.field3169 > var47; ++var47) {
                                    int var48 = var14 - -var46;
                                    int var49 = var37 + var47;
                                    if (var3 <= var48 && ~var4 >= ~var49 && class190.method1339(0, var49, arg2, var38, var48)) {
                                        int var50 = var38;
                                        if (class94.method783(var48, (byte) -95, var49)) {
                                            var50 = var38 - 1;
                                        }
                                        if (~var50 <= -1) {
                                            class371.method2267(var50, (-var47 + class219.field3169) * 4 + -4, var48, var49, var11, -29747, var10, var46 * 4, arg0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class436.field6205) {
                        class18 var39 = class300.field4249[arg2];
                        for (int var40 = 0; class219.field3169 > var40; ++var40) {
                            for (int var41 = 0; ~var41 > ~class219.field3169; ++var41) {
                                int var42 = var14 + var40;
                                int var43 = var37 + var41;
                                int var44 = var39.field176[-var39.field182 + var42][-var39.field187 + var43];
                                if (~(1076101120 & var44) == -1) {
                                    if ((var44 & 8388608) != 0) {
                                        arg0.method743(4, (-var41 + class219.field3169) * 4 + -4, (byte) -127, var40 * 4, -1713569622);
                                    } else if (~(var44 & 33554432) == -1) {
                                        if (~(134217728 & var44) != -1) {
                                            arg0.method743(4, (-var41 + class219.field3169) * 4 + -4 + 3, (byte) -127, var40 * 4, -1713569622);
                                        } else if ((536870912 & var44) != 0) {
                                            arg0.method748(4, (byte) -57, -1713569622, (-var41 + class219.field3169) * 4 + -4, var40 * 4);
                                        }
                                    } else {
                                        arg0.method748(4, (byte) -57, -1713569622, (-var41 + class219.field3169) * 4 + -4, var40 * 4 - -3);
                                    }
                                } else {
                                    arg0.method742(11, (-var41 + class219.field3169) * 4 + -4, 4, 4, -1713569622, var40 * 4);
                                }
                            }
                        }
                    }
                    arg0.method438(0, 0, class219.field3169 * 4, class219.field3169 * 4, var12, 2);
                    class369.field5087.method726((-var3 + var14) * 4 + 48, -(class219.field3169 * 4) + 464 - (-var4 + var37) * 4, class219.field3169 * 4, class219.field3169 * 4, 0, 0);
                }
            }
            arg0.method360();
            arg0.method373(-16777215);
            class125.method947(-101);
            class368.field5075 = 0;
            class237.field3465.method773(-1568);
            if (!class436.field6205) {
                for (int var15 = var3; var3 - -104 > var15; ++var15) {
                    for (int var21 = var4; var21 < var4 + 104; ++var21) {
                        for (int var22 = arg2; ~(arg2 - -1) <= ~var22 && ~var22 >= -4; ++var22) {
                            if (class190.method1339(0, var21, arg2, var22, var15)) {
                                class210 var23 = (class210) class86.method730(var22, var15, var21);
                                if (var23 == null) {
                                    var23 = (class210) class106.method847(var22, var15, var21, field4108 != null ? field4108 : (field4108 = method1902("dc")));
                                }
                                if (var23 == null) {
                                    var23 = (class210) class133.method991(var22, var15, var21);
                                }
                                if (var23 == null) {
                                    var23 = (class210) class418.method2504(var22, var15, var21);
                                }
                                if (var23 != null) {
                                    class267 var24 = class468.field6599.method506(-127, var23.method80(10143));
                                    if (!var24.field3878 || class205.field2999) {
                                        int var25 = var24.field3842;
                                        if (var24.field3846 != null) {
                                            for (int var26 = 0; var24.field3846.length > var26; ++var26) {
                                                if (var24.field3846[var26] != -1) {
                                                    class267 var27 = class468.field6599.method506(-120, var24.field3846[var26]);
                                                    if (var27.field3842 >= 0) {
                                                        var25 = var27.field3842;
                                                    }
                                                }
                                            }
                                        }
                                        if (var25 >= 0) {
                                            boolean var28 = false;
                                            if (var25 >= 0) {
                                                class76 var29 = class53.field788.method2321(var25, true);
                                                if (var29 != null && var29.field1090) {
                                                    var28 = true;
                                                }
                                            }
                                            int var30 = var15;
                                            int var31 = var21;
                                            if (var28) {
                                                int[][] var32 = class300.field4249[var22].field176;
                                                int var33 = class300.field4249[var22].field182;
                                                int var34 = class300.field4249[var22].field187;
                                                for (int var35 = 0; var35 < 10; ++var35) {
                                                    int var36 = (int) (4.0D * Math.random());
                                                    if (~var36 == -1 && ~var30 < ~var3 && ~var30 < ~(var15 + -3) && (2883848 & var32[var30 + -1 + -var33][-var34 + var31]) == 0) {
                                                        --var30;
                                                    }
                                                    if (~var36 == -2 && ~var30 > ~(var3 + 103) && var15 + 3 > var30 && ~(var32[var30 + 1 + -var33][-var34 + var31] & 2883968) == -1) {
                                                        ++var30;
                                                    }
                                                    if (~var36 == -3 && ~var31 < ~var4 && var31 > var21 + -3 && ~(var32[-var33 + var30][var31 + -1 + -var34] & 2883842) == -1) {
                                                        --var31;
                                                    }
                                                    if (var36 == 3 && var4 + -1 + 104 > var31 && ~var31 > ~(var21 + 3) && ~(2883872 & var32[-var33 + var30][var31 + 1 + -var34]) == -1) {
                                                        ++var31;
                                                    }
                                                }
                                            }
                                            class219.field3168[class368.field5075] = var24.field3887;
                                            class198.field2929[class368.field5075] = var30;
                                            class278.field3996[class368.field5075] = var31;
                                            ++class368.field5075;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (class406.field5546 != null) {
                    class69.field1009.field6151 = 1;
                    class53.field788.method2320(1024, -79, 64);
                    for (int var16 = 0; var16 < class406.field5546.field6807; ++var16) {
                        int var17 = class406.field5546.field6804[var16];
                        if (var17 >> 28 == class262.field3781.field4531) {
                            int var18 = (16383 & var17 >> 14) + -class279.field4012;
                            int var19 = (var17 & 16383) - class189.field2810;
                            if (~var18 <= -1 && ~var18 > ~class36.field388 && ~var19 <= -1 && ~class68.field998 < ~var19) {
                                class237.field3465.method766(new class478(var16), -1);
                            } else {
                                class76 var20 = class53.field788.method2321(class406.field5546.field6805[var16], true);
                                if (var20.field1111 != null && ~(var20.field1135 + var18) <= -1 && ~(var18 - -var20.field1115) > ~class36.field388 && ~(var20.field1104 + var19) <= -1 && class68.field998 > var20.field1095 + var19) {
                                    class237.field3465.method766(new class478(var16), -1);
                                }
                            }
                        }
                    }
                    class53.field788.method2320(128, -87, 64);
                    class69.field1009.field6151 = 2;
                    class69.field1009.method2651(1);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "(I)V")
    public static final void method1898(int arg0) {
        class380.field5227.method2119(arg0 ^ arg0);
        ++field4097;
        class408.field5588.method2119(0);
        class442.field6289.method2119(0);
        class421.field5832.method2119(0);
        class439.field6224.method2119(0);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B[[[Lwr;)V")
    public static final void method1899(byte arg0, class52[][][] arg1) {
        for (int var2 = 0; var2 < arg1.length; ++var2) {
            class52[][] var3 = arg1[var2];
            for (int var4 = 0; var4 < var3.length; ++var4) {
                for (int var5 = 0; ~var5 > ~var3[var4].length; ++var5) {
                    class52 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field758 instanceof class210) {
                            ((class210) var6.field758).method84(16805);
                        }
                        if (var6.field755 instanceof class210) {
                            ((class210) var6.field755).method84(16805);
                        }
                        if (var6.field756 instanceof class210) {
                            ((class210) var6.field756).method84(arg0 ^ 16831);
                        }
                        if (var6.field772 instanceof class210) {
                            ((class210) var6.field772).method84(16805);
                        }
                        if (var6.field752 instanceof class210) {
                            ((class210) var6.field752).method84(16805);
                        }
                        for (class131 var7 = var6.field763; var7 != null; var7 = var7.field1796) {
                            class325 var8 = var7.field1803;
                            if (var8 instanceof class210) {
                                ((class210) var8).method84(16805);
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != 26) {
            method1897((class89) null, -36, -120);
        }
        ++field4096;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
    public class289() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)Lvb;")
    public static final class247 method1900(byte arg0) {
        if (arg0 != -37) {
            method1900((byte) -103);
        }
        ++field4099;
        try {
            return (class247) Class.forName("pm").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        if (arg1 != 21034) {
            return null;
        } else {
            ++field4102;
            int[] var3 = super.field3808.method958((byte) 103, arg0);
            if (super.field3808.field1732) {
                class214.method1452(var3, 0, class478.field6792, class379.field5216[arg0]);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "(I)Lkk;")
    public static final class161 method1901(int arg0) {
        ++field4104;
        class161 var1 = new class161(38);
        var1.method1180((byte) -110, 15);
        var1.method1180((byte) -110, class172.field2621);
        var1.method1180((byte) -110, !class102.field1431 ? 0 : 1);
        var1.method1180((byte) -110, class362.field4981 ? 1 : 0);
        var1.method1180((byte) -110, class181.field2743 ? 1 : 0);
        var1.method1180((byte) -110, !class169.field2453 ? 0 : 1);
        var1.method1180((byte) -110, arg0);
        var1.method1180((byte) -110, class199.field2951 ? 1 : 0);
        var1.method1180((byte) -110, class130.field1777 ? 1 : 0);
        var1.method1180((byte) -110, !class228.field3281 ? 0 : 1);
        var1.method1180((byte) -110, class99.field1396);
        var1.method1180((byte) -110, class62.field913 ? 1 : 0);
        var1.method1180((byte) -110, class273.field3964 ? 1 : 0);
        var1.method1180((byte) -110, class300.field4246 ? 1 : 0);
        var1.method1180((byte) -110, class30.field309);
        var1.method1180((byte) -110, !class55.field817 ? 0 : 1);
        var1.method1180((byte) -110, class193.field2870);
        var1.method1180((byte) -110, class409.field5605);
        var1.method1180((byte) -110, class339.field4687);
        var1.method1173(class185.field2787, (byte) 123);
        var1.method1173(class30.field312, (byte) 117);
        var1.method1180((byte) -110, class267.method1803(-59));
        var1.method1177(class254.field3646, arg0 ^ -91);
        var1.method1180((byte) -110, class223.field3222);
        var1.method1180((byte) -110, class21.field231 ? 1 : 0);
        var1.method1180((byte) -110, class165.field2399 ? 1 : 0);
        var1.method1180((byte) -110, class443.field6300);
        var1.method1180((byte) -110, class18.field193 ? 1 : 0);
        var1.method1180((byte) -110, !class51.field743 ? 0 : 1);
        var1.method1180((byte) -110, class491.field6931);
        var1.method1180((byte) -110, class89.field1269 ? 1 : 0);
        var1.method1180((byte) -110, class211.field3082);
        var1.method1180((byte) -110, class69.field1010);
        return var1;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1902(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class151("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field4103 = -1;
        field4105 = new class336(10);
        field4106 = new class151(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");
        field4107 = 0;
    }
}
