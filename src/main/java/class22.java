import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class22 extends class79 {

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "I")
    private final int field551;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
    private final int field544;

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "I")
    private final int field550;

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "I")
    private final int field546;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "Z")
    public static boolean field545 = true;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "S")
    public static short field543 = 32767;

    @OriginalMember(owner = "client!lh", name = "A", descriptor = "Lmh;")
    public static class128 field556 = method156(123, "");

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!lh", name = "w", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!lh", name = "y", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!lh", name = "z", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!lh", name = "B", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!lh", name = "C", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!lh", name = "x", descriptor = "[[[B")
    public static byte[][][] field553;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(III)V", line = 8)
    public final void method151(int arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            field554++;
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)Lvb;", line = 21)
    public static final class50 method152(byte arg0) {
        if (arg0 != 49) {
            field543 = 81;
        }
        field558++;
        try {
            return (class50) Class.forName("ij").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class267();
        }
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(IIIIIII)V", line = 37)
    public class22(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field551 = arg3;
        this.field544 = arg0;
        this.field550 = arg2;
        this.field546 = arg1;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V", line = 50)
    public static final void method153(int arg0) {
        field549++;
        try {
            if (class52.field1023 == arg0) {
                int var1 = class263.field4567.method1172((byte) -95);
                if (var1 > 0 && class263.field4567.method1165(-30862)) {
                    int var2 = var1 - class75.field1406;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class263.field4567.method1171(var2, 3);
                    return;
                }
                class263.field4567.method1159(arg0 - 36);
                class263.field4567.method1175((byte) -12);
                class162.field2775 = null;
                if (class20.field537 == null) {
                    class52.field1023 = 0;
                } else {
                    class52.field1023 = 2;
                }
                class268.field4655 = null;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class263.field4567.method1159(-13);
            class162.field2775 = null;
            class268.field4655 = null;
            class52.field1023 = 0;
            class20.field537 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IZI)V", line = 96)
    public final void method154(int arg0, boolean arg1, int arg2) {
        field555++;
        int var4 = this.field550 * arg2 >> 12;
        int var5 = this.field544 * arg2 >> 12;
        if (!arg1) {
            int var6 = this.field551 * arg0 >> 12;
            int var7 = this.field546 * arg0 >> 12;
            class294.method2013(var6, var4, this.field1437, this.field1435, var5, this.field1436, var7, 125);
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(III)V", line = 117)
    public final void method155(int arg0, int arg1, int arg2) {
        int var4 = this.field544 * arg1 >> 12;
        int var5 = this.field550 * arg1 >> 12;
        field548++;
        int var6 = this.field546 * arg0 >> 12;
        int var7 = this.field551 * arg0 >> 12;
        class145.method973(var4, var7, var5, this.field1435, var6, (byte) 74);
        if (arg2 != -231) {
            method152((byte) 77);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILjava/lang/String;)Lmh;", line = 152)
    public static final class128 method156(int arg0, String arg1) {
        field552++;
        int var2 = 0;
        byte[] var3 = arg1.getBytes();
        if (arg0 < 121) {
            method153(0);
        }
        int var4 = var3.length;
        class128 var5 = new class128();
        var5.field2224 = new byte[var4];
        while (var4 > var2) {
            int var6 = var3[var2++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var4 <= var2) {
                    break;
                }
                int var7 = var3[var2++] & 0xFF;
                var5.field2224[var5.field2181++] = (byte) ((var6 - 40) * 43 + (var7 - 48));
            } else if (var6 != 0) {
                var5.field2224[var5.field2181++] = (byte) var6;
            }
        }
        var5.method846(115);
        return var5.method849(true);
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(B)V", line = 195)
    public static void method157(byte arg0) {
        field553 = (byte[][][]) null;
        field556 = null;
        if (arg0 != -67) {
            field553 = (byte[][][]) ((byte[][][]) null);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lh;IIII)V", line = 213)
    public static final void method158(class208 arg0, int arg1, int arg2, int arg3, int arg4) {
        field557++;
        if (class275.field4769 >= 400) {
            return;
        }
        if (arg0.field3655 != null) {
            arg0 = arg0.method1429((byte) -96);
        }
        if (arg0 == null || !arg0.field3653) {
            return;
        }
        class128 var5 = arg0.field3663;
        if (arg0.field3698 != 0) {
            var5 = class28.method177((byte) -72, new class128[] { var5, class292.method2008(-18955, arg0.field3698, class163.field2796.field2081), class176.field3104, class278.field4798, class257.method1811(arg0.field3698, (byte) -121), class157.field2692 });
        }
        if (arg4 < 78) {
            return;
        }
        if (class28.field591 == 1) {
            class52.field1020++;
            class89.method559(arg1, class245.field4187, (short) 15, arg3, class28.method177((byte) -54, new class128[] { class194.field3381, class137.field2346, var5 }), 1, (long) arg2);
        } else if (!class31.field685) {
            class298.field5091++;
            class128[] var6 = arg0.field3683;
            if (class161.field2738) {
                var6 = class253.method1795(var6, 5);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && (class98.field1701 != 0 || !var6[var7].method861(10362, class196.field3437))) {
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 16;
                        }
                        class53.field1037++;
                        if (var7 == 1) {
                            var8 = 9;
                        }
                        if (var7 == 2) {
                            var8 = 44;
                        }
                        if (var7 == 3) {
                            var8 = 22;
                        }
                        if (var7 == 4) {
                            var8 = 36;
                        }
                        class89.method559(arg1, var6[var7], var8, arg3, class28.method177((byte) -81, new class128[] { class221.field3886, var5 }), 1, (long) arg2);
                    }
                }
            }
            if (class98.field1701 == 0 && var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method861(10362, class196.field3437)) {
                        class239.field4083++;
                        short var10 = 0;
                        if (class163.field2796.field2081 < arg0.field3698) {
                            var10 = 2000;
                        }
                        short var11 = 0;
                        if (var9 == 0) {
                            var11 = 16;
                        }
                        if (var9 == 1) {
                            var11 = 9;
                        }
                        if (var9 == 2) {
                            var11 = 44;
                        }
                        if (var9 == 3) {
                            var11 = 22;
                        }
                        if (var9 == 4) {
                            var11 = 36;
                        }
                        if (var11 != 0) {
                            var11 += var10;
                        }
                        class89.method559(arg1, var6[var9], var11, arg3, class28.method177((byte) -124, new class128[] { class221.field3886, var5 }), 1, (long) arg2);
                    }
                }
            }
            class89.method559(arg1, class74.field1395, (short) 1007, arg3, class28.method177((byte) -127, new class128[] { class221.field3886, var5 }), 1, (long) arg2);
        } else if ((class284.field4879 & 0x2) == 2) {
            class89.method559(arg1, class140.field2398, (short) 40, arg3, class28.method177((byte) -96, new class128[] { class120.field2024, class137.field2346, var5 }), 1, (long) arg2);
            class205.field3618++;
        }
    }
}
