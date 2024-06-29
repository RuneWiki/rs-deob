import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qha")
public class class104 extends class297 {

    @OriginalMember(owner = "client!qha", name = "N", descriptor = "[I")
    public static int[] field1844 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!qha", name = "I", descriptor = "I")
    private int field1839;

    @OriginalMember(owner = "client!qha", name = "K", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!qha", name = "L", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!qha", name = "M", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!qha", name = "O", descriptor = "I")
    private int field1845;

    @OriginalMember(owner = "client!qha", name = "P", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!qha", name = "Q", descriptor = "I")
    private int field1847;

    @OriginalMember(owner = "client!qha", name = "J", descriptor = "Lcn;")
    public static class516 field1840;

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(ILua;)V")
    public static final void method951(int arg0, class665 arg1) {
        ++field1842;
        int var2 = 0;
        arg1.method3740(-87);
        for (int var3 = 0; ~class219.field3167 < ~var3; ++var3) {
            int var15 = class87.field1561[var3];
            if (~(1 & class25.field736[var15]) == -1) {
                if (var2 > 0) {
                    class25.field736[var15] = (byte) class418.method2577(class25.field736[var15], 2);
                    --var2;
                } else {
                    int var16 = arg1.method3733((byte) -24, 1);
                    if (~var16 == -1) {
                        var2 = class494.method2908(1, arg1);
                        class25.field736[var15] = (byte) class418.method2577(class25.field736[var15], 2);
                    } else {
                        class144.method1136(1, var15, arg1);
                    }
                }
            }
        }
        arg1.method3735(false);
        if (~var2 != -1) {
            throw new RuntimeException("nsn0");
        } else {
            arg1.method3740(-65);
            for (int var4 = 0; var4 < class219.field3167; ++var4) {
                int var13 = class87.field1561[var4];
                if (~(1 & class25.field736[var13]) != -1) {
                    if (var2 > 0) {
                        class25.field736[var13] = (byte) class418.method2577(class25.field736[var13], 2);
                        --var2;
                    } else {
                        int var14 = arg1.method3733((byte) -24, 1);
                        if (var14 == 0) {
                            var2 = class494.method2908(1, arg1);
                            class25.field736[var13] = (byte) class418.method2577(class25.field736[var13], 2);
                        } else {
                            class144.method1136(arg0 ^ -21477, var13, arg1);
                        }
                    }
                }
            }
            arg1.method3735(false);
            if (var2 != 0) {
                throw new RuntimeException("nsn1");
            } else {
                arg1.method3740(arg0 ^ -21401);
                for (int var5 = 0; ~class500.field6982 < ~var5; ++var5) {
                    int var11 = class106.field1861[var5];
                    if ((1 & class25.field736[var11]) != 0) {
                        if (~var2 < -1) {
                            class25.field736[var11] = (byte) class418.method2577(class25.field736[var11], 2);
                            --var2;
                        } else {
                            int var12 = arg1.method3733((byte) -24, 1);
                            if (var12 == 0) {
                                var2 = class494.method2908(arg0 + 21479, arg1);
                                class25.field736[var11] = (byte) class418.method2577(class25.field736[var11], 2);
                            } else if (class2.method2(var11, (byte) 105, arg1)) {
                                class25.field736[var11] = (byte) class418.method2577(class25.field736[var11], 2);
                            }
                        }
                    }
                }
                arg1.method3735(false);
                if (arg0 == -21478) {
                    if (var2 != 0) {
                        throw new RuntimeException("nsn2");
                    } else {
                        arg1.method3740(36);
                        for (int var6 = 0; ~var6 > ~class500.field6982; ++var6) {
                            int var9 = class106.field1861[var6];
                            if ((class25.field736[var9] & 1) == 0) {
                                if (var2 > 0) {
                                    class25.field736[var9] = (byte) class418.method2577(class25.field736[var9], 2);
                                    --var2;
                                } else {
                                    int var10 = arg1.method3733((byte) -24, 1);
                                    if (~var10 == -1) {
                                        var2 = class494.method2908(1, arg1);
                                        class25.field736[var9] = (byte) class418.method2577(class25.field736[var9], 2);
                                    } else if (class2.method2(var9, (byte) 105, arg1)) {
                                        class25.field736[var9] = (byte) class418.method2577(class25.field736[var9], 2);
                                    }
                                }
                            }
                        }
                        arg1.method3735(false);
                        if (~var2 != -1) {
                            throw new RuntimeException("nsn3");
                        } else {
                            class219.field3167 = 0;
                            class500.field6982 = 0;
                            for (int var7 = 1; var7 < 2048; ++var7) {
                                class25.field736[var7] = (byte) (class25.field736[var7] >> 1);
                                class598 var8 = class49.field1040[var7];
                                if (var8 == null) {
                                    class106.field1861[class500.field6982++] = var7;
                                } else {
                                    class87.field1561[class219.field3167++] = var7;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qha", name = "<init>", descriptor = "(I)V")
    private class104(int arg0) {
        super(0, false);
        this.method952(-104, arg0);
    }

    @OriginalMember(owner = "client!qha", name = "d", descriptor = "(II)[[I")
    public final int[][] method18(int arg0, int arg1) {
        ++field1841;
        int[][] var3 = super.field4166.method2180(arg1 ^ 1564598960, arg0);
        if (super.field4166.field4849) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class525.field7275; ++var7) {
                var4[var7] = this.field1839;
                var5[var7] = this.field1847;
                var6[var7] = this.field1845;
            }
        }
        if (arg1 != -1564599039) {
            this.method952(102, 6);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qha", name = "e", descriptor = "(II)V")
    private final void method952(int arg0, int arg1) {
        this.field1839 = 4080 & arg1 >> 12;
        this.field1847 = arg1 >> 4 & 4080;
        ++field1843;
        this.field1845 = (arg1 & 255) << 4;
        if (arg0 >= -54) {
            this.field1845 = -42;
        }
    }

    @OriginalMember(owner = "client!qha", name = "f", descriptor = "(I)V")
    public static void method953(int arg0) {
        field1844 = null;
        field1840 = null;
        if (arg0 != 32462) {
            field1840 = null;
        }
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(Lcea;II)V")
    public final void method17(class215 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.method952(-124, arg0.method1499(-1));
        }
        ++field1846;
        if (arg2 != 31015) {
            this.field1845 = 105;
        }
    }

    @OriginalMember(owner = "client!qha", name = "<init>", descriptor = "()V")
    public class104() {
        this(0);
    }
}
