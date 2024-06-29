import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class263 extends class139 {

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    private int field4219;

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "I")
    private int field4228;

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "I")
    private int field4230;

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "I")
    private int field4232;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "Ljava/lang/String;")
    public static String field4226 = "Loading...";

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "Ljava/lang/String;")
    public static String field4224 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field4229 = null;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILbj;BLfk;)V")
    public static final void method1706(int arg0, class215 arg1, byte arg2, class52 arg3) {
        class103 var4 = new class103();
        ++field4225;
        if (arg2 < 39) {
            method1709(false, -25, (class305) null);
        }
        var4.field1479 = arg1.method1374((byte) -60);
        var4.field1478 = arg1.method1383((byte) 75);
        var4.field1489 = new int[var4.field1479];
        var4.field1472 = new class286[var4.field1479];
        var4.field1486 = new int[var4.field1479];
        var4.field1473 = new class286[var4.field1479];
        var4.field1484 = new int[var4.field1479];
        var4.field1481 = new byte[var4.field1479][][];
        for (int var5 = 0; ~var4.field1479 < ~var5; ++var5) {
            try {
                int var6 = arg1.method1374((byte) -60);
                if (~var6 != -1 && ~var6 != -2 && ~var6 != -3) {
                    if (~var6 == -4 || var6 == 4) {
                        String var10 = arg1.method1376(-14);
                        String var11 = arg1.method1376(-106);
                        int var12 = arg1.method1374((byte) -60);
                        String[] var13 = new String[var12];
                        for (int var14 = 0; ~var14 > ~var12; ++var14) {
                            var13[var14] = arg1.method1376(-63);
                        }
                        byte[][] var15 = new byte[var12][];
                        if (var6 == 3) {
                            for (int var16 = 0; var12 > var16; ++var16) {
                                int var17 = arg1.method1383((byte) 77);
                                var15[var16] = new byte[var17];
                                arg1.method1355(255, 0, var17, var15[var16]);
                            }
                        }
                        var4.field1486[var5] = var6;
                        Class[] var18 = new Class[var12];
                        for (int var19 = 0; var12 > var19; ++var19) {
                            var18[var19] = class260.method1697(8661, var13[var19]);
                        }
                        var4.field1472[var5] = arg3.method320(var11, class260.method1697(8661, var10), false, var18);
                        var4.field1481[var5] = var15;
                    }
                } else {
                    String var7 = arg1.method1376(-106);
                    String var8 = arg1.method1376(-42);
                    int var9 = 0;
                    if (~var6 == -2) {
                        var9 = arg1.method1383((byte) 113);
                    }
                    var4.field1486[var5] = var6;
                    var4.field1489[var5] = var9;
                    var4.field1473[var5] = arg3.method329(var8, 9, class260.method1697(8661, var7));
                }
            } catch (ClassNotFoundException var20) {
                var4.field1484[var5] = -1;
            } catch (SecurityException var21) {
                var4.field1484[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field1484[var5] = -3;
            } catch (Exception var23) {
                var4.field1484[var5] = -4;
            } catch (Throwable var24) {
                var4.field1484[var5] = -5;
            }
        }
        class112.field1604.method370((byte) -22, var4);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BC)C")
    public static final char method1707(byte arg0, char arg1) {
        ++field4231;
        if (arg1 == 198) {
            return 'E';
        } else if (arg1 == 230) {
            return 'e';
        } else if (~arg1 == -224) {
            return 's';
        } else if (~arg1 == -339) {
            return 'E';
        } else if (arg1 == 339) {
            return 'e';
        } else {
            return (char) (arg0 > -3 ? '\u0012' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BII)V")
    public final void method790(byte arg0, int arg1, int arg2) {
        ++field4223;
        if (arg0 <= 93) {
            field4220 = 84;
        }
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(IIIIIII)V")
    public class263(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4219 = arg0;
        this.field4228 = arg3;
        this.field4230 = arg1;
        this.field4232 = arg2;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIII)V")
    public static final void method1708(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -902108468) {
            field4229 = null;
        }
        if (~arg2 <= ~arg4) {
            class129.method822(class247.field3876[arg0], arg4, arg3 + 902106042, arg1, arg2);
        } else {
            class129.method822(class247.field3876[arg0], arg2, arg3 ^ 902110282, arg1, arg4);
        }
        ++field4218;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZII)V")
    public final void method791(boolean arg0, int arg1, int arg2) {
        int var4 = this.field4219 * arg1 >> 12;
        ++field4227;
        int var5 = this.field4230 * arg2 >> 12;
        int var6 = this.field4232 * arg1 >> 12;
        if (!arg0) {
            int var7 = this.field4228 * arg2 >> 12;
            class105.method668(var4, var6, super.field1928, var5, (byte) 60, super.field1932, var7, super.field1926);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZILnh;)[Lee;")
    public static final class74[] method1709(boolean arg0, int arg1, class305 arg2) {
        if (!arg0) {
            return null;
        } else {
            ++field4217;
            return !class109.method696(0, arg1, arg2) ? null : class164.method1046(65527);
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(ZII)V")
    public final void method786(boolean arg0, int arg1, int arg2) {
        ++field4222;
        int var4 = this.field4219 * arg2 >> 12;
        int var5 = this.field4230 * arg1 >> 12;
        int var6 = this.field4232 * arg2 >> 12;
        int var7 = this.field4228 * arg1 >> 12;
        class93.method602(var5, arg0, var4, var7, var6, super.field1928);
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V")
    public static void method1710(int arg0) {
        field4229 = null;
        if (arg0 == -1) {
            field4224 = null;
            field4226 = null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V")
    public static final void method1711(int arg0, int arg1) {
        ++field4221;
        class39 var2 = class149.method935(-86, arg0, 10);
        int var3 = 15 % ((arg1 - 6) / 48);
        var2.method268((byte) -19);
    }
}
