import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class199 extends class154 {

    @OriginalMember(owner = "client!hl", name = "lb", descriptor = "I")
    private int field3394 = -1;

    @OriginalMember(owner = "client!hl", name = "Y", descriptor = "Leg;")
    public static class37 field3381 = class174.method1167("<col=ffb000>", 92);

    @OriginalMember(owner = "client!hl", name = "X", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!hl", name = "ab", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!hl", name = "bb", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!hl", name = "cb", descriptor = "I")
    private int field3385;

    @OriginalMember(owner = "client!hl", name = "db", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!hl", name = "eb", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!hl", name = "fb", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!hl", name = "gb", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!hl", name = "hb", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!hl", name = "ib", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!hl", name = "jb", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!hl", name = "kb", descriptor = "I")
    private int field3393;

    @OriginalMember(owner = "client!hl", name = "Z", descriptor = "[I")
    private int[] field3382;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(B)I")
    public final int method1058(byte arg0) {
        if (arg0 != 121) {
            method1388(-16);
        }
        ++field3383;
        return this.field3394;
    }

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "(I)V")
    public static final void method1383(int arg0) {
        class181.field3033.method1409(122);
        class160.field2671.method1409(90);
        ++field3388;
        if (arg0 != -4) {
            method1384(-101, -81, 100, 21, -19, 121, 34);
        }
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V")
    public class199() {
        super(0, false);
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(BI)[[I")
    public final int[][] method193(byte arg0, int arg1) {
        if (arg0 != 115) {
            field3390 = 16;
        }
        ++field3380;
        int[][] var3 = super.field2585.method1532(arg1, -116);
        if (super.field2585.field3761 && this.method1386(128)) {
            int var4 = this.field3393 * (class110.field1847 != this.field3385 ? this.field3385 * arg1 / class110.field1847 : arg1);
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            if (class227.field3898 != this.field3393) {
                for (int var8 = 0; var8 < class227.field3898; ++var8) {
                    int var9 = this.field3393 * var8 / class227.field3898;
                    int var10 = this.field3382[var4 + var9];
                    var6[var8] = class96.method626(var10, 255) << 4;
                    var7[var8] = class96.method626(4080, var10 >> 4);
                    var5[var8] = class96.method626(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; ~var11 > ~class227.field3898; ++var11) {
                    int var12 = this.field3382[var4++];
                    var6[var11] = class96.method626(var12 << 4, 4080);
                    var7[var11] = class96.method626(var12, 65280) >> 4;
                    var5[var11] = class96.method626(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lva;II)V")
    public final void method142(class187 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field3394 = arg0.method1244(false);
        }
        ++field3386;
        if (arg1 != -14015) {
            this.method1386(-13);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1384(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 67 / ((-44 - arg6) / 52);
        class134[] var8 = class61.field1001;
        for (int var9 = 0; var9 < var8.length; ++var9) {
            class134 var10 = var8[var9];
            if (var10 != null && ~var10.field2331 == -3) {
                class1.method3(arg2 >> 1, arg1, var10.field2334 * 2, (-class144.field2456 + var10.field2324 << 7) - -var10.field2317, arg0, -22971, (-class40.field642 + var10.field2330 << 7) + var10.field2328, arg3 >> 1);
                if (class203.field3460 > -1 && ~(class72.field1146 % 20) > -11) {
                    class89.field1425[var10.field2319].method702(class203.field3460 - 12 + arg5, class189.field3257 + -28 + arg4);
                }
            }
        }
        ++field3389;
    }

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "(I)V")
    public static void method1385(int arg0) {
        if (arg0 != 2008214828) {
            field3381 = null;
        }
        field3381 = null;
    }

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "(I)Z")
    private final boolean method1386(int arg0) {
        ++field3391;
        if (arg0 != 128) {
            return true;
        } else if (this.field3382 != null) {
            return true;
        } else if (~this.field3394 <= -1) {
            int var2 = class110.field1847;
            int var3 = class227.field3898;
            int var4 = client.field1893.method709(this.field3394, true) ? 64 : 128;
            this.field3382 = client.field1893.method710(-28433, this.field3394);
            this.field3385 = var4;
            this.field3393 = var4;
            class66.method462(var3, (byte) -80, var2);
            return this.field3382 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZIZIIII)V")
    public static final void method1387(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = -32 / ((70 - arg3) / 48);
        ++field3384;
        if (~arg1 == -4) {
            method1387(true, class121.field2037, true, -44, -1, -1, arg6);
        } else {
            Container var8;
            if (class112.field1911 != null) {
                var8 = class112.field1911;
            } else if (class71.field1114 == null) {
                var8 = class177.field2957.field3504;
            } else {
                var8 = class71.field1114;
            }
            class131.field2193 = var8.getSize().width;
            class37.field549 = var8.getSize().height;
            if (class71.field1114 == var8) {
                Insets var9 = class71.field1114.getInsets();
                class37.field549 -= var9.top + var9.bottom;
                class131.field2193 -= var9.right + var9.left;
            }
            if (arg1 >= 2) {
                class249.field4479 = class131.field2193;
                class118.field1996 = 0;
                class46.field721 = 0;
                field3390 = class37.field549;
            } else {
                field3390 = 503;
                class118.field1996 = (class131.field2193 + -765) / 2;
                class46.field721 = 0;
                class249.field4479 = 765;
            }
            if (!arg2) {
                class93.field1466.setSize(class249.field4479, field3390);
                if (class71.field1114 == var8) {
                    Insets var10 = class71.field1114.getInsets();
                    class93.field1466.setLocation(class118.field1996 + var10.left, class46.field721 + var10.top);
                } else {
                    class93.field1466.setLocation(class118.field1996, class46.field721);
                }
            } else {
                class26.method152(class93.field1466, 109);
                class173.method1161(class93.field1466, (byte) -97);
                if (class84.field1326 != null) {
                    class84.field1326.method196(-70, class93.field1466);
                }
                class133.field2291.method1897(-1);
                class58.method417((byte) -37, class93.field1466);
                class4.method27((byte) -98, class93.field1466);
                if (class84.field1326 != null) {
                    class84.field1326.method198(-127, class93.field1466);
                }
            }
            if (arg1 > 0) {
                method1387(true, 0, true, 6, -1, -1, arg6);
            } else {
                class239.field4261 = !class72.method492(-2001);
                if (class234.field4044 != -1) {
                    class58.method413(-1025659988, true);
                }
                if (class187.field3190 != null && (class232.field4011 == 30 || class232.field4011 == 25)) {
                    class231.method1594(127);
                }
                for (int var11 = 0; var11 < 100; ++var11) {
                    class154.field2597[var11] = true;
                }
                class190.field3268 = true;
            }
        }
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)V")
    public final void method539(int arg0) {
        ++field3392;
        super.method539(75);
        if (arg0 <= 53) {
            this.field3393 = -55;
        }
        this.field3382 = null;
    }

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "(I)V")
    public static final void method1388(int arg0) {
        ++field3387;
        int var1 = -15 % ((-58 - arg0) / 63);
        class73.field1151.method1409(83);
    }
}
