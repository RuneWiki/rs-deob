import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public class class643 extends class140 {

    @OriginalMember(owner = "client!sw", name = "k", descriptor = "[Z")
    public static boolean[] field9366 = new boolean[100];

    @OriginalMember(owner = "client!sw", name = "m", descriptor = "Z")
    public static boolean field9368 = true;

    @OriginalMember(owner = "client!sw", name = "p", descriptor = "[I")
    public static int[] field9371 = new int[8];

    @OriginalMember(owner = "client!sw", name = "g", descriptor = "I")
    public static int field9362;

    @OriginalMember(owner = "client!sw", name = "h", descriptor = "I")
    public static int field9363;

    @OriginalMember(owner = "client!sw", name = "i", descriptor = "I")
    public static int field9364;

    @OriginalMember(owner = "client!sw", name = "l", descriptor = "I")
    public static int field9367;

    @OriginalMember(owner = "client!sw", name = "n", descriptor = "I")
    public static int field9369;

    @OriginalMember(owner = "client!sw", name = "o", descriptor = "I")
    public static int field9370;

    @OriginalMember(owner = "client!sw", name = "q", descriptor = "I")
    public static int field9372;

    @OriginalMember(owner = "client!sw", name = "j", descriptor = "Llg;")
    public static class352 field9365;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sw", name = "r", descriptor = "Ljava/lang/Class;")
    public static Class field9373;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(Lqa;)V")
    public static final void method3716(class208 arg0) {
        for (int var1 = class606.field9004; var1 < class348.field4772; ++var1) {
            for (int var2 = 0; var2 < class145.field2083; ++var2) {
                for (int var3 = 0; var3 < class384.field5282; ++var3) {
                    class205 var4 = class420.field5697[var1][var2][var3];
                    if (var4 != null) {
                        class113 var5 = var4.field3047;
                        class113 var6 = var4.field3037;
                        if (var5 != null && var5.method180((byte) 58)) {
                            class610.method3586(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method180((byte) 58)) {
                                class610.method3586(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method182(arg0, 0, false, 0, 0, var5, 21130);
                                var6.method179(1);
                            }
                            var5.method179(1);
                        }
                        for (class636 var7 = var4.field3029; var7 != null; var7 = var7.field9302) {
                            class577 var9 = var7.field9299;
                            if (var9 != null && var9.method180((byte) 58)) {
                                class610.method3586(arg0, var9, var1, var2, var3, var9.field8508 - var9.field8504 + 1, var9.field8499 - var9.field8509 + 1);
                                var9.method179(1);
                            }
                        }
                        class238 var8 = var4.field3045;
                        if (var8 != null && var8.method180((byte) 58)) {
                            class552.method3340(arg0, var8, var1, var2, var3);
                            var8.method179(1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sw", name = "<init>", descriptor = "(Lte;)V")
    public class643(class527 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(III)V")
    public final void method144(int arg0, int arg1, int arg2) {
        if (arg1 != -4741) {
            field9366 = null;
        }
        ++field9363;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(ZB)V")
    public final void method148(boolean arg0, byte arg1) {
        super.field1984.method3113(442822664, true);
        if (arg1 != -86) {
            field9365 = null;
        }
        ++field9370;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(B)V")
    public static void method3717(byte arg0) {
        field9366 = null;
        field9365 = null;
        field9371 = null;
        if (arg0 != -1) {
            field9368 = true;
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(IILjl;)V")
    public final void method146(int arg0, int arg1, class228 arg2) {
        if (arg0 == -7) {
            super.field1984.method3152(-2, arg2);
            ++field9367;
            super.field1984.method3121(arg0 + -27738, arg1);
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(I)Z")
    public final boolean method149(int arg0) {
        if (arg0 > -36) {
            field9371 = null;
        }
        ++field9364;
        return true;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "()V")
    public static final void method3718() {
        for (int var0 = 0; var0 < class495.field7041; ++var0) {
            if (!class79.field1064[var0]) {
                class420 var1 = class148.field2163[var0];
                class405 var2 = var1.field5683;
                int var3 = var1.field5689;
                int var4 = var2.method2390(6042) - class402.field5500;
                int var5 = (var4 * 2 >> class115.field1626) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method2388((byte) 119) - var4 >> class115.field1626;
                int var9 = var2.method2389(-10161) - var4 >> class115.field1626;
                int var10 = var2.method2389(-10161) + var4 >> class115.field1626;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class384.field5282) {
                    var10 = class384.field5282 - 1;
                }
                for (int var11 = var9; var11 <= var10; ++var11) {
                    short var12 = var1.field5692[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 255) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class145.field2083) {
                        var16 = class145.field2083 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; ++var17) {
                        byte var18 = 1;
                        class577 var19 = class624.method3650(var3, var17, var11, field9373 != null ? field9373 : (field9373 = method3720("pc")));
                        if (var19 != null && var19.field8494 != 0) {
                            if (var19.field8494 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field5692[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 255) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field5692[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 255) + var26;
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
                                    short var30 = var1.field5692[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 255) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field5692[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 255) + var34;
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
                    ++var6;
                }
                class79.field1064[var0] = true;
                class165.field2609[var3].method1236(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method3719(int arg0, int arg1, String arg2) {
        ++field9372;
        if (arg0 != 255) {
            field9366 = null;
        }
        class221 var3 = class65.method413(3, arg1, (byte) -106);
        var3.method1426((byte) -124);
        var3.field3218 = arg2;
    }

    @OriginalMember(owner = "client!sw", name = "c", descriptor = "(I)V")
    public final void method143(int arg0) {
        if (arg0 != -7) {
            field9371 = null;
        }
        super.field1984.method3113(442822664, false);
        ++field9369;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(IZ)V")
    public final void method145(int arg0, boolean arg1) {
        if (arg0 != -7) {
            field9371 = null;
        }
        ++field9362;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3720(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
