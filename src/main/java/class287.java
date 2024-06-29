import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class287 extends class198 {

    @OriginalMember(owner = "client!ca", name = "O", descriptor = "I")
    public static int field4783 = 0;

    @OriginalMember(owner = "client!ca", name = "N", descriptor = "I")
    public static volatile int field4782 = 0;

    @OriginalMember(owner = "client!ca", name = "I", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!ca", name = "J", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!ca", name = "L", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!ca", name = "M", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!ca", name = "P", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!ca", name = "Q", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!ca", name = "R", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!ca", name = "T", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!ca", name = "S", descriptor = "Z")
    public static boolean field4787;

    @OriginalMember(owner = "client!ca", name = "K", descriptor = "[[I")
    public static int[][] field4779;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lfa;Lfa;ZII)Lak;")
    public static final class146 method2017(class273 arg0, class273 arg1, boolean arg2, int arg3, int arg4) {
        boolean var5 = true;
        ++field4780;
        int[] var6 = arg1.method1875(arg4, arg3);
        for (int var7 = 0; var6.length > var7; ++var7) {
            byte[] var8 = arg1.method1883((byte) 127, arg4, var6[var7]);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 255 | var8[0] << 8 & 65280;
                byte[] var10;
                if (arg2) {
                    var10 = arg0.method1883((byte) -10, 0, var9);
                } else {
                    var10 = arg0.method1883((byte) -19, var9, 0);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        } else {
            try {
                return new class146(arg1, arg0, arg4, arg2);
            } catch (Exception var11) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZI)[I")
    public final int[] method32(boolean arg0, int arg1) {
        ++field4786;
        if (!arg0) {
            this.method52(-10, (class202) null, -91);
        }
        int[] var3 = super.field3134.method36(arg1, 30672);
        if (super.field3134.field69) {
            for (int var4 = 0; class42.field590 > var4; ++var4) {
                this.method2020(-6, arg1, var4);
                int[] var5 = this.method1367((byte) -79, 0, class314.field5066);
                var3[var4] = var5[class118.field1794];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
    public class287() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(Z)V")
    public static void method2018(boolean arg0) {
        field4779 = null;
        if (!arg0) {
            method2019(-37, (byte) 75, (String) null);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)[[I")
    public final int[][] method200(int arg0, int arg1) {
        if (arg1 != -2) {
            method2018(false);
        }
        ++field4781;
        int[][] var3 = super.field3150.method642(arg0, 1);
        if (super.field3150.field1498) {
            int[] var4 = var3[1];
            int[] var5 = var3[2];
            int[] var6 = var3[0];
            for (int var7 = 0; var7 < class42.field590; ++var7) {
                this.method2020(-6, arg0, var7);
                int[][] var8 = this.method1372(0, class314.field5066, (byte) 88);
                var6[var7] = var8[0][class118.field1794];
                var4[var7] = var8[1][class118.field1794];
                var5[var7] = var8[2][class118.field1794];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILma;I)V")
    public final void method52(int arg0, class202 arg1, int arg2) {
        ++field4785;
        if (~arg2 == -1) {
            super.field3139 = arg1.method1420((byte) 0) == 1;
        }
        int var4 = 38 / ((arg0 - 60) / 61);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IBLjava/lang/String;)V")
    public static final void method2019(int arg0, byte arg1, String arg2) {
        ++field4784;
        boolean var3 = false;
        for (int var4 = 0; ~var4 > ~class249.field3964; ++var4) {
            class208 var5 = class300.field4925[class53.field713[var4]];
            if (var5 != null && var5.field3329 != null && var5.field3329.equalsIgnoreCase(arg2)) {
                if (~arg0 != -2) {
                    if (~arg0 == -5) {
                        class276.field4572.method1391(0, 227);
                        class276.field4572.method1452(-10615, class53.field713[var4]);
                        class276.field4572.method1407(0, false);
                        ++class299.field4917;
                    } else if (~arg0 == -6) {
                        ++class74.field1101;
                        class276.field4572.method1391(arg1 + 61, 40);
                        class276.field4572.method1433(class53.field713[var4], (byte) 116);
                        class276.field4572.method1446((byte) 84, 0);
                    } else if (~arg0 != -7) {
                        if (arg0 == 7) {
                            class276.field4572.method1391(0, 166);
                            class276.field4572.method1433(class53.field713[var4], (byte) -116);
                            ++class29.field371;
                            class276.field4572.method1407(0, false);
                        }
                    } else {
                        class276.field4572.method1391(0, 127);
                        class276.field4572.method1438(0, arg1 ^ 98);
                        class276.field4572.method1433(class53.field713[var4], (byte) 114);
                        ++class276.field4565;
                    }
                } else {
                    ++class182.field2812;
                    class276.field4572.method1391(0, 142);
                    class276.field4572.method1433(class53.field713[var4], (byte) 126);
                    class276.field4572.method1446((byte) 111, 0);
                }
                var3 = true;
                break;
            }
        }
        if (arg1 != -61) {
            method2019(16, (byte) -26, (String) null);
        }
        if (!var3) {
            class286.method2013((byte) -103, class127.field1965 + arg2);
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(III)V")
    private final void method2020(int arg0, int arg1, int arg2) {
        ++field4778;
        if (arg0 != -6) {
            this.method2020(-22, 69, -112);
        }
        int var4 = class152.field2367[arg2];
        int var5 = class42.field591[arg1];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class314.field5066 = arg1;
            class118.field1794 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class314.field5066 = arg2;
            class118.field1794 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class314.field5066 = arg2;
            class118.field1794 = -arg1 + class42.field590;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class314.field5066 = class258.field4243 - arg1;
            class118.field1794 = arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class118.field1794 = -arg2 + class42.field590;
            class314.field5066 = -arg1 + class258.field4243;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class118.field1794 = -arg1 + class42.field590;
            class314.field5066 = class258.field4243 - arg2;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class314.field5066 = -arg2 + class258.field4243;
            class118.field1794 = arg1;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class314.field5066 = arg1;
            class118.field1794 = -arg2 + class42.field590;
        }
        class118.field1794 &= class227.field3594;
        class314.field5066 &= class52.field704;
    }
}
