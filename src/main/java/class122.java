import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class122 extends class228 {

    @OriginalMember(owner = "client!fd", name = "U", descriptor = "I")
    private int field2134 = 3216;

    @OriginalMember(owner = "client!fd", name = "ab", descriptor = "I")
    private int field2140 = 4096;

    @OriginalMember(owner = "client!fd", name = "gb", descriptor = "[I")
    private int[] field2146 = new int[3];

    @OriginalMember(owner = "client!fd", name = "fb", descriptor = "I")
    private int field2145 = 3216;

    @OriginalMember(owner = "client!fd", name = "T", descriptor = "I")
    public static int field2133 = 0;

    @OriginalMember(owner = "client!fd", name = "V", descriptor = "[B")
    public static byte[] field2135 = new byte[520];

    @OriginalMember(owner = "client!fd", name = "Y", descriptor = "I")
    public static int field2138 = 0;

    @OriginalMember(owner = "client!fd", name = "hb", descriptor = "[Loa;")
    public static class99[] field2147 = new class99[500];

    @OriginalMember(owner = "client!fd", name = "S", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!fd", name = "W", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!fd", name = "X", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!fd", name = "Z", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!fd", name = "bb", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!fd", name = "cb", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!fd", name = "db", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!fd", name = "eb", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)[I")
    public final int[] method106(int arg0, int arg1) {
        if (arg1 != -3) {
            this.method278(-25);
        }
        ++field2132;
        int[] var3 = super.field3952.method1262(arg0, arg1 ^ -7495);
        if (super.field3952.field3276) {
            int var4 = class92.field1556 * this.field2140 >> 12;
            int[] var5 = this.method1500(arg0 + -1 & class250.field4309, 0, (byte) 111);
            int[] var6 = this.method1500(arg0, 0, (byte) 126);
            int[] var7 = this.method1500(class250.field4309 & arg0 + 1, 0, (byte) 119);
            for (int var8 = 0; class234.field4046 > var8; ++var8) {
                int var9 = (var6[var8 + -1 & class190.field3345] - var6[var8 + 1 & class190.field3345]) * var4 >> 12;
                int var10 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var11 = var9 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                int var12 = var10 >> 4;
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = class30.field548[((var12 - -1) * var12 >> 1) + var11] & 255;
                int var14 = var10 * var13 >> 8;
                int var15 = var9 * var13 >> 8;
                int var16 = this.field2146[1] * var14 >> 12;
                int var17 = var13 * 4096 >> 8;
                int var18 = this.field2146[0] * var15 >> 12;
                int var19 = this.field2146[2] * var17 >> 12;
                var3[var8] = var16 + var18 + var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILik;I)V")
    public final void method18(int arg0, class261 arg1, int arg2) {
        if (arg2 == -7618) {
            ++field2136;
            if (arg0 != 0) {
                if (arg0 != 1) {
                    if (~arg0 == -3) {
                        this.field2134 = arg1.method1740((byte) 56);
                    }
                } else {
                    this.field2145 = arg1.method1740((byte) 49);
                }
            } else {
                this.field2140 = arg1.method1740((byte) 113);
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
    public class122() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)V")
    private final void method805(int arg0) {
        ++field2142;
        double var2 = Math.cos((double) ((float) this.field2134 / 4096.0F));
        if (arg0 == -30889) {
            this.field2146[0] = (int) (4096.0D * Math.sin((double) ((float) this.field2145 / 4096.0F)) * var2);
            this.field2146[1] = (int) (4096.0D * var2 * Math.cos((double) ((float) this.field2145 / 4096.0F)));
            this.field2146[2] = (int) (4096.0D * Math.sin((double) ((float) this.field2134 / 4096.0F)));
            int var4 = this.field2146[1] * this.field2146[1] >> 12;
            int var5 = this.field2146[0] * this.field2146[0] >> 12;
            int var6 = this.field2146[2] * this.field2146[2] >> 12;
            int var7 = (int) (Math.sqrt((double) (var4 + var5 - -var6 >> 12)) * 4096.0D);
            if (~var7 != -1) {
                this.field2146[1] = (this.field2146[1] << 12) / var7;
                this.field2146[2] = (this.field2146[2] << 12) / var7;
                this.field2146[0] = (this.field2146[0] << 12) / var7;
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(Z)[Lde;")
    public static final class109[] method806(boolean arg0) {
        ++field2137;
        class109[] var1 = new class109[class201.field3495];
        int var2 = 0;
        if (!arg0) {
            field2138 = -81;
        }
        while (var2 < class201.field3495) {
            var1[var2] = new class109(class164.field2883, class88.field1520, class290.field5082[var2], class11.field94[var2], class223.field3885[var2], class193.field3395[var2], class181.field3151[var2], class173.field3062);
            ++var2;
        }
        class24.method181(false);
        return var1;
    }

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "(I)V")
    public static void method807(int arg0) {
        field2147 = null;
        if (arg0 != 10700) {
            method808((byte) -121);
        }
        field2135 = null;
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)V")
    public final void method278(int arg0) {
        this.method805(arg0 + -30881);
        ++field2143;
        if (arg0 != -8) {
            this.field2145 = -56;
        }
    }

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "(B)V")
    public static final void method808(byte arg0) {
        ++field2144;
        while (class129.field2252.method968(27384, class180.field3146) >= 11) {
            int var1 = class129.field2252.method975(11, true);
            if (~var1 == -2048) {
                break;
            }
            boolean var2 = false;
            if (class259.field4515[var1] == null) {
                class259.field4515[var1] = new class183();
                if (class145.field2565[var1] != null) {
                    class259.field4515[var1].method1259(23, class145.field2565[var1]);
                }
                var2 = true;
            }
            class105.field1765[class190.field3342++] = var1;
            class183 var3 = class259.field4515[var1];
            var3.field1274 = class56.field926;
            int var4 = class129.field2252.method975(1, true);
            int var5 = class276.field4857[class129.field2252.method975(3, true)];
            if (var2) {
                var3.field1275 = var3.field1296 = var5;
            }
            int var6 = class129.field2252.method975(1, true);
            if (~var6 == -2) {
                class25.field438[class64.field1078++] = var1;
            }
            int var7 = class129.field2252.method975(5, true);
            if (~var7 < -16) {
                var7 -= 32;
            }
            int var8 = class129.field2252.method975(5, true);
            if (~var8 < -16) {
                var8 -= 32;
            }
            var3.method1258(class168.field3006.field1259[0] + var8, ~var4 == -2, class168.field3006.field1317[0] - -var7, (byte) 75);
        }
        class129.field2252.method974(18964);
        if (arg0 > -70) {
            method808((byte) -94);
        }
    }

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "(B)V")
    public static final void method809(byte arg0) {
        ++field2141;
        class250.field4315.method1812(arg0 + -89);
        class237.field4100.method1812(-125);
        if (arg0 == -27) {
            class116.field2053.method1812(arg0 + -54);
        }
    }

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "(B)V")
    public static final void method810(byte arg0) {
        ++field2139;
        int var1 = class252.field4368;
        int var2 = class2.field16;
        int var3 = -class199.field3458 + -var1 + class254.field4390;
        int var4 = -class24.field373 + -var2 + class280.field4901;
        if (var1 > 0 || ~var3 < -1 || var2 > 0 || var4 > 0) {
            try {
                Container var5;
                if (class253.field4377 != null) {
                    var5 = class253.field4377;
                } else if (class75.field1281 == null) {
                    var5 = class24.field368.field1493;
                } else {
                    var5 = class75.field1281;
                }
                int var6 = 0;
                int var7 = 0;
                if (class75.field1281 == var5) {
                    Insets var8 = class75.field1281.getInsets();
                    var6 = var8.left;
                    var7 = var8.top;
                }
                Graphics var9 = var5.getGraphics();
                var9.setColor(Color.black);
                if (~var1 < -1) {
                    var9.fillRect(var6, var7, var1, class280.field4901);
                }
                if (var2 > 0) {
                    var9.fillRect(var6, var7, class254.field4390, var2);
                }
                if (var3 > 0) {
                    var9.fillRect(var6 - (-class254.field4390 - -var3), var7, var3, class280.field4901);
                }
                if (~var4 < -1) {
                    var9.fillRect(var6, class280.field4901 + var7 - var4, class254.field4390, var4);
                }
            } catch (Exception var10) {
            }
        }
        if (arg0 != 70) {
            method810((byte) -44);
        }
    }
}
