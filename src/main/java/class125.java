import java.awt.Container;
import java.awt.Insets;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class125 extends class98 {

    @OriginalMember(owner = "client!tg", name = "M", descriptor = "Z")
    private boolean field1523 = true;

    @OriginalMember(owner = "client!tg", name = "O", descriptor = "I")
    private int field1525 = 4096;

    @OriginalMember(owner = "client!tg", name = "S", descriptor = "[Ldi;")
    public static class64[] field1529 = new class64[14];

    @OriginalMember(owner = "client!tg", name = "T", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1530 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!tg", name = "U", descriptor = "I")
    public static int field1531 = 0;

    @OriginalMember(owner = "client!tg", name = "L", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!tg", name = "N", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!tg", name = "P", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!tg", name = "Q", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!tg", name = "R", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!tg", name = "X", descriptor = "Lts;")
    public static class315 field1534;

    @OriginalMember(owner = "client!tg", name = "V", descriptor = "Ltq;")
    public static class376 field1532;

    @OriginalMember(owner = "client!tg", name = "W", descriptor = "Ltq;")
    public static class376 field1533;

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
    public class125() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "(I)V")
    public static void method783(int arg0) {
        field1532 = null;
        field1530 = null;
        if (arg0 >= 18) {
            field1534 = null;
            field1533 = null;
            field1529 = null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIZI)V")
    public static final void method784(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        ++field1526;
        if (arg4) {
            class313.method2062(110);
        }
        if (class255.field3680 != null && (~arg2 != -4 || class374.field5256 != arg3 || class388.field5479 != arg1)) {
            class5.method43(class255.field3680, arg0 ^ 6515, class14.field185);
            class255.field3680 = null;
        }
        if (~arg2 == -4 && class255.field3680 == null) {
            class255.field3680 = class85.method465(arg3, arg0 ^ 6416, 0, arg1, 0, class14.field185);
            if (class255.field3680 != null) {
                class388.field5479 = arg1;
                class374.field5256 = arg3;
                class278.method1834(class14.field185, (byte) 125);
            }
        }
        if (arg2 == 3 && class255.field3680 == null) {
            method784(6521, -1, class249.field3558, -1, true, arg5);
        } else {
            if (arg0 != 6521) {
                field1531 = 52;
            }
            Container var6;
            if (class255.field3680 != null) {
                class410.field5896 = arg3;
                class282.field3988 = arg1;
                var6 = class255.field3680;
            } else if (class272.field3857 != null) {
                Insets var7 = class272.field3857.getInsets();
                class410.field5896 = class272.field3857.getSize().width + -var7.right + -var7.left;
                class282.field3988 = class272.field3857.getSize().height + -var7.top + -var7.bottom;
                var6 = class272.field3857;
            } else {
                var6 = class14.field185.field2685;
                class410.field5896 = var6.getSize().width;
                class282.field3988 = var6.getSize().height;
            }
            if (arg2 != 1) {
                if (~class268.field3812 > -97 && ~class26.field329 == -1) {
                    int var8 = class410.field5896 > 1024 ? 1024 : class410.field5896;
                    int var9 = ~class282.field3988 >= -769 ? class282.field3988 : 768;
                    class323.field4601 = (class410.field5896 - var8) / 2;
                    class330.field4671 = var8;
                    class105.field1259 = var9;
                    class338.field4800 = 0;
                } else {
                    class338.field4800 = 0;
                    class330.field4671 = class410.field5896;
                    class105.field1259 = class282.field3988;
                    class323.field4601 = 0;
                }
            } else {
                class338.field4800 = 0;
                class105.field1259 = 503;
                class330.field4671 = 765;
                class323.field4601 = (class410.field5896 + -765) / 2;
            }
            if (class237.field3389 != 0) {
                boolean var10000;
                if (class330.field4671 < 1024 && ~class105.field1259 > -769) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
            }
            if (arg4) {
                class377.method2441(class26.field329, (byte) -117);
            } else {
                class402.field5767.setSize(class330.field4671, class105.field1259);
                if (class151.field1873 != null) {
                    class151.field1873.method631();
                }
                if (class272.field3857 == var6) {
                    Insets var10 = class272.field3857.getInsets();
                    class402.field5767.setLocation(var10.left - -class323.field4601, class338.field4800 + var10.top);
                } else {
                    class402.field5767.setLocation(class323.field4601, class338.field4800);
                }
            }
            if (arg2 >= 2) {
                class190.field2744 = true;
            } else {
                class190.field2744 = false;
            }
            if (~class248.field3548 != 0) {
                class340.method2185(false, true);
            }
            if (class146.field1798 != null && (class40.field475 == 30 || ~class40.field475 == -26)) {
                class43.method263((byte) -42);
            }
            for (int var11 = 0; ~var11 > -101; ++var11) {
                class394.field5556[var11] = true;
            }
            class146.field1799 = true;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIBI)V")
    public static final void method785(int arg0, int arg1, byte arg2, int arg3) {
        ++field1524;
        if (arg2 <= 58) {
            field1529 = null;
        }
        String var4 = "tele " + arg3 + "," + (arg0 >> 6) + "," + (arg1 >> 6) + "," + (arg0 & 63) + "," + (63 & arg1);
        System.out.println(var4);
        class130.method807(var4, true, 10);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILdg;I)V")
    public final void method81(int arg0, class236 arg1, int arg2) {
        if (arg2 == 0) {
            if (arg0 != 0) {
                if (arg0 == 1) {
                    this.field1523 = arg1.method1574(arg2 + -107) == 1;
                }
            } else {
                this.field1525 = arg1.method1617((byte) 48);
            }
            ++field1522;
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)[[I")
    public final int[][] method194(int arg0, int arg1) {
        ++field1527;
        int[][] var3 = super.field1184.method185((byte) -48, arg0);
        if (super.field1184.field332) {
            int[] var4 = this.method539(0, (byte) -121, class225.field3153 & arg0 + -1);
            int[] var5 = this.method539(0, (byte) -96, arg0);
            int[] var6 = this.method539(0, (byte) -123, arg0 - -1 & class225.field3153);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; class268.field3811 > var10; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field1525;
                int var12 = (var5[var10 + 1 & class210.field2995] - var5[var10 + -1 & class210.field2995]) * this.field1525;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 - -var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 != 0) {
                    var18 = var11 / var17;
                    var19 = var12 / var17;
                    var20 = 16777216 / var17;
                } else {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                }
                if (this.field1523) {
                    var19 = (var19 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                }
                var7[var10] = var19;
                var8[var10] = var18;
                var9[var10] = var20;
            }
        }
        int var21 = 6 % ((60 - arg1) / 43);
        return var3;
    }

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "(I)V")
    public static final void method786(int arg0) {
        ++field1528;
        class359.field5120.method2150(1);
        int var1 = class359.field5120.method2146(1, (byte) 52);
        if (~var1 != -1) {
            int var2 = class359.field5120.method2146(2, (byte) 52);
            if (~var2 == -1) {
                class150.field1853[class176.field2399++] = 2047;
            } else if (~var2 == -2) {
                int var3 = class359.field5120.method2146(3, (byte) 52);
                class384.field5422.method241(-30274, var3, 1);
                int var4 = class359.field5120.method2146(1, (byte) 52);
                if (~var4 == -2) {
                    class150.field1853[class176.field2399++] = 2047;
                }
            } else if (~var2 == -3) {
                if (~class359.field5120.method2146(1, (byte) 52) != -2) {
                    int var5 = class359.field5120.method2146(3, (byte) 52);
                    class384.field5422.method241(-30274, var5, 0);
                } else {
                    int var6 = class359.field5120.method2146(3, (byte) 52);
                    class384.field5422.method241(-30274, var6, 2);
                    int var7 = class359.field5120.method2146(3, (byte) 52);
                    class384.field5422.method241(-30274, var7, 2);
                }
                int var8 = class359.field5120.method2146(1, (byte) 52);
                if (~var8 == -2) {
                    class150.field1853[class176.field2399++] = 2047;
                }
            } else {
                if (arg0 > -116) {
                    method784(-21, -126, -118, 80, false, -35);
                }
                if (~var2 == -4) {
                    class129.field1570 = class359.field5120.method2146(2, (byte) 52);
                    int var9 = class359.field5120.method2146(7, (byte) 52);
                    int var10 = class359.field5120.method2146(1, (byte) 52);
                    int var11 = class359.field5120.method2146(7, (byte) 52);
                    int var12 = class359.field5120.method2146(1, (byte) 52);
                    if (~var12 == -2) {
                        class150.field1853[class176.field2399++] = 2047;
                    }
                    class384.field5422.method247(class129.field1570, var11, var10 == 1, var9, -35);
                }
            }
        }
    }

    static {
        new class362("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
    }
}
