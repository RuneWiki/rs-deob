import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class300 {

    @OriginalMember(owner = "client!io", name = "f", descriptor = "I")
    public int field4122 = 2048;

    @OriginalMember(owner = "client!io", name = "h", descriptor = "I")
    public int field4124 = 0;

    @OriginalMember(owner = "client!io", name = "d", descriptor = "I")
    public int field4120 = 0;

    @OriginalMember(owner = "client!io", name = "l", descriptor = "I")
    public int field4128 = 2048;

    @OriginalMember(owner = "client!io", name = "b", descriptor = "[I")
    public static int[] field4118 = new int[4096];

    @OriginalMember(owner = "client!io", name = "a", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!io", name = "c", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!io", name = "e", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!io", name = "g", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!io", name = "i", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!io", name = "k", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!io", name = "m", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!io", name = "n", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!io", name = "j", descriptor = "Lvh;")
    public static class240 field4126;

    @OriginalMember(owner = "client!io", name = "o", descriptor = "[Ltl;")
    public static class437[] field4131;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ILtr;)Z")
    public static final boolean method1712(int arg0, class191 arg1) {
        field4123++;
        if (arg1 == null) {
            return false;
        }
        if (arg0 != 4096) {
            field4130 = -107;
        }
        if (!arg1.field2648) {
            return false;
        } else if (!arg1.method1149(0, class481.field7030)) {
            return false;
        } else if (class519.field7647.method979((byte) 28, (long) arg1.field2661) == null) {
            return class292.field3907.method979((byte) 28, (long) arg1.field2682) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IZLlh;)V")
    private final void method1713(int arg0, boolean arg1, class365 arg2) {
        field4121++;
        if (!arg1) {
            this.field4124 = -83;
        }
        if (arg0 == 1) {
            this.field4124 = arg2.method2099(255);
        } else if (arg0 == 2) {
            this.field4122 = arg2.method2062((byte) 14);
        } else if (arg0 == 3) {
            this.field4128 = arg2.method2062((byte) 14);
            return;
        } else if (arg0 == 4) {
            this.field4120 = arg2.method2069(-126);
            return;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
    public static void method1714(int arg0) {
        if (arg0 < 42) {
            method1714(-94);
        }
        field4131 = null;
        field4126 = null;
        field4118 = null;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ILlh;)V")
    public final void method1715(int arg0, class365 arg1) {
        while (true) {
            int var3 = arg1.method2099(255);
            if (var3 == 0) {
                field4125++;
                if (arg0 > -105) {
                    field4131 = null;
                    return;
                }
                return;
            }
            this.method1713(var3, true, arg1);
        }
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(I)Lvq;")
    public static final class320 method1716(int arg0) {
        if (arg0 != 0) {
            method1712(-16, null);
        }
        field4127++;
        return class1.field10.length > class12.field139 ? class1.field10[class12.field139++] : null;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(La;B)V")
    public static final void method1717(class436 arg0, byte arg1) {
        field4129++;
        int var2 = 0;
        arg0.method2597(123);
        for (int var3 = 0; var3 < class378.field5322; var3++) {
            int var15 = class95.field1321[var3];
            if ((class220.field3083[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    class220.field3083[var15] = (byte) class25.method183(class220.field3083[var15], 2);
                    var2--;
                } else {
                    int var16 = arg0.method2599((byte) 98, 1);
                    if (var16 == 0) {
                        var2 = class103.method680(-6124, arg0);
                        class220.field3083[var15] = (byte) class25.method183(class220.field3083[var15], 2);
                    } else {
                        class20.method147(arg0, var15, false);
                    }
                }
            }
        }
        arg0.method2601((byte) 56);
        if (arg1 < 50) {
            method1716(106);
        }
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg0.method2597(123);
        for (int var4 = 0; var4 < class378.field5322; var4++) {
            int var13 = class95.field1321[var4];
            if ((class220.field3083[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class220.field3083[var13] = (byte) class25.method183(class220.field3083[var13], 2);
                } else {
                    int var14 = arg0.method2599((byte) 98, 1);
                    if (var14 == 0) {
                        var2 = class103.method680(-6124, arg0);
                        class220.field3083[var13] = (byte) class25.method183(class220.field3083[var13], 2);
                    } else {
                        class20.method147(arg0, var13, false);
                    }
                }
            }
        }
        arg0.method2601((byte) 56);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg0.method2597(122);
        for (int var5 = 0; var5 < class166.field2353; var5++) {
            int var11 = class77.field1105[var5];
            if ((class220.field3083[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class220.field3083[var11] = (byte) class25.method183(class220.field3083[var11], 2);
                } else {
                    int var12 = arg0.method2599((byte) 98, 1);
                    if (var12 == 0) {
                        var2 = class103.method680(-6124, arg0);
                        class220.field3083[var11] = (byte) class25.method183(class220.field3083[var11], 2);
                    } else if (class368.method2132(var11, 24, arg0)) {
                        class220.field3083[var11] = (byte) class25.method183(class220.field3083[var11], 2);
                    }
                }
            }
        }
        arg0.method2601((byte) 56);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg0.method2597(113);
        for (int var6 = 0; var6 < class166.field2353; var6++) {
            int var9 = class77.field1105[var6];
            if ((class220.field3083[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class220.field3083[var9] = (byte) class25.method183(class220.field3083[var9], 2);
                } else {
                    int var10 = arg0.method2599((byte) 98, 1);
                    if (var10 == 0) {
                        var2 = class103.method680(-6124, arg0);
                        class220.field3083[var9] = (byte) class25.method183(class220.field3083[var9], 2);
                    } else if (class368.method2132(var9, 71, arg0)) {
                        class220.field3083[var9] = (byte) class25.method183(class220.field3083[var9], 2);
                    }
                }
            }
        }
        arg0.method2601((byte) 56);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class166.field2353 = 0;
        class378.field5322 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            class220.field3083[var7] = (byte) (class220.field3083[var7] >> 1);
            class192 var8 = class309.field4234[var7];
            if (var8 == null) {
                class77.field1105[class166.field2353++] = var7;
            } else {
                class95.field1321[class378.field5322++] = var7;
            }
        }
    }
}
