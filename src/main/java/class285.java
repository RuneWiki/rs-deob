import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public abstract class class285 extends class165 {

    @OriginalMember(owner = "client!o", name = "E", descriptor = "Z")
    public boolean field4572;

    @OriginalMember(owner = "client!o", name = "M", descriptor = "[Lo;")
    public class285[] field4580;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "[I")
    public static int[] field4563 = new int[99];

    @OriginalMember(owner = "client!o", name = "I", descriptor = "[I")
    public static int[] field4576 = new int[1000];

    @OriginalMember(owner = "client!o", name = "p", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!o", name = "r", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!o", name = "u", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!o", name = "x", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!o", name = "y", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!o", name = "z", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!o", name = "A", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!o", name = "B", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!o", name = "C", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!o", name = "D", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!o", name = "G", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!o", name = "H", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!o", name = "J", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!o", name = "K", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "I")
    public int field4579;

    @OriginalMember(owner = "client!o", name = "F", descriptor = "Lwd;")
    public class156 field4573;

    @OriginalMember(owner = "client!o", name = "w", descriptor = "Ltb;")
    public class217 field4564;

    @OriginalMember(owner = "client!o", name = "N", descriptor = "Z")
    public static boolean field4581;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILak;I)Lem;", line = 7)
    public static final class260 method2044(int arg0, class172 arg1, int arg2) {
        if (arg0 != 60) {
            method2046((String) null, (byte) 34);
        }
        field4566++;
        return class284.method2041(arg1, -96, arg2) ? class211.method1524((byte) 107) : null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)[[I", line = 25)
    public int[][] method62(byte arg0, int arg1) {
        field4565++;
        if (arg0 <= 121) {
            field4581 = true;
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(I)V", line = 39)
    public static final void method2045(int arg0) {
        class247.field3898.method2371(0);
        int var1 = class247.field3898.method2374(8, (byte) -36);
        if (class233.field3736 > var1) {
            for (int var2 = var1; var2 < class233.field3736; var2++) {
                class117.field1773[class24.field330++] = class142.field2225[var2];
            }
        }
        field4562++;
        if (var1 > class233.field3736) {
            throw new RuntimeException("gnpov1");
        }
        if (arg0 != 2) {
            field4581 = true;
        }
        class233.field3736 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class142.field2225[var3];
            class234 var5 = class99.field1445[var4];
            int var6 = class247.field3898.method2374(1, (byte) -36);
            if (var6 == 0) {
                class142.field2225[class233.field3736++] = var4;
                var5.field4204 = class240.field3818;
            } else {
                int var7 = class247.field3898.method2374(2, (byte) -36);
                if (var7 == 0) {
                    class142.field2225[class233.field3736++] = var4;
                    var5.field4204 = class240.field3818;
                    class322.field4988[class192.field3138++] = var4;
                } else if (var7 == 1) {
                    class142.field2225[class233.field3736++] = var4;
                    var5.field4204 = class240.field3818;
                    int var8 = class247.field3898.method2374(3, (byte) -36);
                    var5.method1885(1, -19157, var8);
                    int var9 = class247.field3898.method2374(1, (byte) -36);
                    if (var9 == 1) {
                        class322.field4988[class192.field3138++] = var4;
                    }
                } else if (var7 == 2) {
                    class142.field2225[class233.field3736++] = var4;
                    var5.field4204 = class240.field3818;
                    if (class247.field3898.method2374(1, (byte) -36) == 1) {
                        int var10 = class247.field3898.method2374(3, (byte) -36);
                        var5.method1885(2, -19157, var10);
                        int var11 = class247.field3898.method2374(3, (byte) -36);
                        var5.method1885(2, arg0 - 19159, var11);
                    } else {
                        int var12 = class247.field3898.method2374(3, (byte) -36);
                        var5.method1885(0, -19157, var12);
                    }
                    int var13 = class247.field3898.method2374(1, (byte) -36);
                    if (var13 == 1) {
                        class322.field4988[class192.field3138++] = var4;
                    }
                } else if (var7 == 3) {
                    class117.field1773[class24.field330++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZLjj;I)V", line = 150)
    public void method63(boolean arg0, class44 arg1, int arg2) {
        if (!arg0) {
            method2051(-106);
        }
        field4569++;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/lang/String;B)J", line = 162)
    public static final long method2046(String arg0, byte arg1) {
        field4559++;
        long var2 = 0L;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 = ((var2 << 5) + ((long) arg0.charAt(var5))) - var2;
        }
        return arg1 == -16 ? var2 : -81L;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)I", line = 186)
    public int method1537(boolean arg0) {
        field4557++;
        if (!arg0) {
            method2046((String) null, (byte) 112);
        }
        return -1;
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(I)[Lbf;", line = 197)
    public static final class58[] method2047(int arg0) {
        if (arg0 > -10) {
            field4581 = false;
        }
        field4577++;
        class58[] var1 = new class58[class48.field680];
        for (int var2 = 0; var2 < class48.field680; var2++) {
            int var3 = class184.field3046[var2] * class102.field1489[var2];
            byte[] var4 = class278.field4481[var2];
            if (class18.field252[var2]) {
                byte[] var7 = class54.field757[var2];
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class122.method882(class205.field3370[client.method767(255, var4[var9])], client.method767(var7[var9] << 24, -16777216));
                }
                if (class232.field3690) {
                    var1[var2] = new class92(class303.field4757, class243.field3832, class270.field4364[var2], class51.field732[var2], class102.field1489[var2], class184.field3046[var2], var8);
                } else {
                    var1[var2] = new class293(class303.field4757, class243.field3832, class270.field4364[var2], class51.field732[var2], class102.field1489[var2], class184.field3046[var2], var8);
                }
            } else {
                int[] var5 = new int[var3];
                for (int var6 = 0; var6 < var3; var6++) {
                    var5[var6] = class205.field3370[client.method767(255, var4[var6])];
                }
                if (class232.field3690) {
                    var1[var2] = new class314(class303.field4757, class243.field3832, class270.field4364[var2], class51.field732[var2], class102.field1489[var2], class184.field3046[var2], var5);
                } else {
                    var1[var2] = new class220(class303.field4757, class243.field3832, class270.field4364[var2], class51.field732[var2], class102.field1489[var2], class184.field3046[var2], var5);
                }
            }
        }
        class106.method727(true);
        return var1;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IBI)[I", line = 265)
    public final int[] method2048(int arg0, byte arg1, int arg2) {
        if (arg1 < 120) {
            this.method60(true, -81);
        }
        field4575++;
        return this.field4580[arg0].field4572 ? this.field4580[arg0].method60(true, arg2) : this.field4580[arg0].method62((byte) 122, arg2)[0];
    }

    @OriginalMember(owner = "client!o", name = "e", descriptor = "(I)V", line = 286)
    public static void method2049(int arg0) {
        field4576 = null;
        field4563 = null;
        if (arg0 != -23132) {
            method2044(53, (class172) null, 26);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BII)V", line = 298)
    public final void method2050(byte arg0, int arg1, int arg2) {
        field4570++;
        if (arg0 != -4) {
            this.method60(true, 11);
        }
        int var4 = this.field4579 == 255 ? arg2 : this.field4579;
        if (this.field4572) {
            this.field4573 = new class156(var4, arg2, arg1);
        } else {
            this.field4564 = new class217(var4, arg2, arg1);
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field4563[var1] = var0 / 4;
        }
    }

    @OriginalMember(owner = "client!o", name = "f", descriptor = "(I)I", line = 333)
    public int method1031(int arg0) {
        if (arg0 >= -127) {
            return -64;
        } else {
            field4567++;
            return -1;
        }
    }

    @OriginalMember(owner = "client!o", name = "g", descriptor = "(I)V", line = 345)
    public void method361(int arg0) {
        int var2 = -14 % ((42 - arg0) / 36);
        field4561++;
    }

    @OriginalMember(owner = "client!o", name = "h", descriptor = "(I)V", line = 354)
    public static final void method2051(int arg0) {
        field4560++;
        class227.field3621.method702((byte) 122);
        if (arg0 < 98) {
            field4563 = (int[]) null;
        }
        class302.field4750.method702((byte) 120);
        class5.field76.method702((byte) 126);
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(B)V", line = 370)
    public static final void method2052(byte arg0) {
        field4571++;
        if (class70.field996 == 0 || class70.field996 == 5) {
            return;
        }
        try {
            if (++class54.field760 > 2000) {
                if (class320.field4966 != null) {
                    class320.field4966.method91(-32);
                    class320.field4966 = null;
                }
                if (class113.field1722 >= 1) {
                    class39.field514 = -5;
                    class70.field996 = 0;
                    return;
                }
                class113.field1722++;
                class54.field760 = 0;
                if (class288.field4613 == class109.field1625) {
                    class288.field4613 = class165.field2755;
                } else {
                    class288.field4613 = class109.field1625;
                }
                class70.field996 = 1;
            }
            if (class70.field996 == 1) {
                class108.field1608 = class14.field159.method904(class34.field451, 51, class288.field4613);
                class70.field996 = 2;
            }
            if (class70.field996 == 2) {
                if (class108.field1608.field2661 == 2) {
                    throw new IOException();
                }
                if (class108.field1608.field2661 != 1) {
                    return;
                }
                class320.field4966 = new class15((Socket) class108.field1608.field2664, class14.field159);
                class108.field1608 = null;
                long var1 = class99.field1451 = class204.method1491(-26916, class201.field3275);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class194.field3175.field586 = 0;
                class194.field3175.method257(arg0 ^ 0x64, 14);
                class194.field3175.method257(-2, var3);
                class320.field4966.method85((byte) -98, 2, class194.field3175.field573, 0);
                if (class198.field3225 != null) {
                    class198.field3225.method2219(arg0 + 219);
                }
                if (class49.field693 != null) {
                    class49.field693.method2219(arg0 ^ 0xFFFFFFC1);
                }
                int var4 = class320.field4966.method86((byte) 118);
                if (class198.field3225 != null) {
                    class198.field3225.method2219(arg0 + 226);
                }
                if (class49.field693 != null) {
                    class49.field693.method2219(106);
                }
                if (var4 != 0) {
                    class70.field996 = 0;
                    class39.field514 = var4;
                    class320.field4966.method91(arg0 ^ 0xC);
                    class320.field4966 = null;
                    return;
                }
                class70.field996 = 3;
            }
            if (class70.field996 == 3) {
                if (class320.field4966.method87(arg0 + 5102) < 8) {
                    return;
                }
                class320.field4966.method89(8, true, class247.field3898.field573, 0);
                class247.field3898.field586 = 0;
                int[] var5 = new int[4];
                class174.field2887 = class247.field3898.method276((byte) -50);
                var5[3] = (int) class174.field2887;
                class194.field3175.field586 = 0;
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[2] = (int) (class174.field2887 >> 32);
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                class194.field3175.method257(-2, 10);
                class194.field3175.method283((byte) -51, var5[0]);
                class194.field3175.method283((byte) -51, var5[1]);
                class194.field3175.method283((byte) -51, var5[2]);
                class194.field3175.method283((byte) -51, var5[3]);
                class194.field3175.method255(false, class204.method1491(-26916, class201.field3275));
                class194.field3175.method231(23573, class338.field5272);
                class194.field3175.method222((byte) 116, class151.field2330, class280.field4514);
                class344.field5350.field586 = 0;
                if (class5.field75 == 40) {
                    class344.field5350.method257(-2, 18);
                } else {
                    class344.field5350.method257(-2, 16);
                }
                class344.field5350.method287(0, class194.field3175.field586 + class77.method527((byte) -46, class13.field154) + 163);
                class344.field5350.method283((byte) -51, 540);
                class344.field5350.method257(-2, class256.field4100);
                class344.field5350.method257(-2, class64.field930 ? 1 : 0);
                class344.field5350.method257(-2, 1);
                class344.field5350.method257(-2, class204.method1490((byte) 59));
                class344.field5350.method287(0, class133.field2095);
                class344.field5350.method287(arg0 ^ 0xFFFFFF9A, class20.field276);
                class344.field5350.method257(arg0 + 100, class185.field3065);
                class217.method1550((byte) 91, class344.field5350);
                class344.field5350.method231(23573, class13.field154);
                class344.field5350.method283((byte) -51, class44.field594);
                class344.field5350.method283((byte) -51, class24.method131(arg0 ^ 0x4CC26AAA));
                class316.field4888 = true;
                class344.field5350.method287(0, class39.field502);
                class344.field5350.method283((byte) -51, class309.field4806.method1288(-927));
                class344.field5350.method283((byte) -51, class304.field4777.method1288(-927));
                class344.field5350.method283((byte) -51, class217.field3513.method1288(-927));
                class344.field5350.method283((byte) -51, class79.field1106.method1288(arg0 ^ 0x3FB));
                class344.field5350.method283((byte) -51, class128.field1997.method1288(arg0 - 825));
                class344.field5350.method283((byte) -51, class234.field3748.method1288(-927));
                class344.field5350.method283((byte) -51, class243.field3846.method1288(-927));
                class344.field5350.method283((byte) -51, class126.field1967.method1288(-927));
                class344.field5350.method283((byte) -51, class130.field2034.method1288(-927));
                class344.field5350.method283((byte) -51, class278.field4476.method1288(-927));
                class344.field5350.method283((byte) -51, class2.field26.method1288(-927));
                class344.field5350.method283((byte) -51, class288.field4615.method1288(-927));
                class344.field5350.method283((byte) -51, class226.field3610.method1288(arg0 - 825));
                class344.field5350.method283((byte) -51, class76.field1061.method1288(-927));
                class344.field5350.method283((byte) -51, class279.field4502.method1288(arg0 ^ 0x3FB));
                class344.field5350.method283((byte) -51, class270.field4354.method1288(-927));
                class344.field5350.method283((byte) -51, class172.field2864.method1288(arg0 ^ 0x3FB));
                class344.field5350.method283((byte) -51, class205.field3369.method1288(arg0 - 825));
                class344.field5350.method283((byte) -51, class341.field5310.method1288(-927));
                class344.field5350.method283((byte) -51, class228.field3629.method1288(-927));
                class344.field5350.method283((byte) -51, class138.field2179.method1288(arg0 - 825));
                class344.field5350.method283((byte) -51, class45.field632.method1288(-927));
                class344.field5350.method283((byte) -51, class200.field3255.method1288(-927));
                class344.field5350.method283((byte) -51, class176.field2939.method1288(arg0 ^ 0x3FB));
                class344.field5350.method283((byte) -51, class164.field2731.method1288(-927));
                class344.field5350.method283((byte) -51, class204.field3361.method1288(-927));
                class344.field5350.method283((byte) -51, class15.field171.method1288(-927));
                class344.field5350.method283((byte) -51, class202.field3277.method1288(-927));
                class344.field5350.method283((byte) -51, class142.field2223.method1288(arg0 ^ 0x3FB));
                class344.field5350.method244(class194.field3175.field586, (byte) 104, class194.field3175.field573, 0);
                class320.field4966.method85((byte) -106, class344.field5350.field586, class344.field5350.field573, 0);
                class194.field3175.method2372(arg0 ^ 0x7191, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class247.field3898.method2372(-29173, var5);
                class70.field996 = 4;
            }
            if (class70.field996 == 4) {
                if (class320.field4966.method87(5000) < 1) {
                    return;
                }
                int var7 = class320.field4966.method86((byte) 118);
                if (var7 == 21) {
                    class70.field996 = 7;
                } else if (var7 == 29) {
                    class70.field996 = 10;
                } else if (var7 == 1) {
                    class70.field996 = 5;
                    class39.field514 = var7;
                    return;
                } else if (var7 == 2) {
                    class70.field996 = 8;
                } else if (var7 == 15) {
                    class70.field996 = 0;
                    class39.field514 = var7;
                    return;
                } else if (var7 == 23 && class113.field1722 < 1) {
                    class113.field1722++;
                    class70.field996 = 1;
                    class54.field760 = 0;
                    class320.field4966.method91(arg0 + 59);
                    class320.field4966 = null;
                    return;
                } else {
                    class39.field514 = var7;
                    class70.field996 = 0;
                    class320.field4966.method91(-113);
                    class320.field4966 = null;
                    return;
                }
            }
            if (class70.field996 == 6) {
                class194.field3175.field586 = 0;
                class194.field3175.method2375(17, 0);
                class320.field4966.method85((byte) -125, class194.field3175.field586, class194.field3175.field573, 0);
                class70.field996 = 4;
                return;
            }
            if (class70.field996 == 7) {
                if (class320.field4966.method87(arg0 ^ -5102) >= 1) {
                    class217.field3518 = class320.field4966.method86((byte) 118) * 60 + 180;
                    class39.field514 = 21;
                    class70.field996 = 0;
                    class320.field4966.method91(arg0 ^ 0x7);
                    class320.field4966 = null;
                    return;
                }
                return;
            }
            if (class70.field996 == 10) {
                if (class320.field4966.method87(arg0 ^ -5102) < 1) {
                    return;
                }
                class343.field5330 = class320.field4966.method86((byte) 118);
                class39.field514 = 29;
                class70.field996 = 0;
                class320.field4966.method91(-58);
                class320.field4966 = null;
                return;
            }
            if (class70.field996 == 8) {
                if (class320.field4966.method87(5000) < 14) {
                    return;
                }
                class320.field4966.method89(14, true, class247.field3898.field573, 0);
                class247.field3898.field586 = 0;
                class341.field5311 = class247.field3898.method286((byte) -82);
                class271.field4376 = class247.field3898.method286((byte) -84);
                class178.field2963 = class247.field3898.method286((byte) -105) == 1;
                class320.field4962 = class247.field3898.method286((byte) -107) == 1;
                class110.field1638 = class247.field3898.method286((byte) -125) == 1;
                class102.field1487 = class247.field3898.method286((byte) -69) == 1;
                class126.field1970 = class247.field3898.method286((byte) -77) == 1;
                class234.field3758 = class247.field3898.method271(21081);
                class2.field33 = class247.field3898.method286((byte) -86) == 1;
                class74.field1051 = class247.field3898.method286((byte) -71) == 1;
                class135.method1007((byte) 84, class74.field1051);
                class141.method1042((byte) -121, class74.field1051);
                if (!class64.field930) {
                    if ((!class178.field2963 || class110.field1638) && !class2.field33) {
                        try {
                            class308.method2181("unzap", 32627, class14.field159.field1951);
                        } catch (Throwable var14) {
                        }
                    } else {
                        try {
                            class308.method2181("zap", 32627, class14.field159.field1951);
                        } catch (Throwable var13) {
                        }
                    }
                }
                try {
                    class308.method2181("loggedin", 32627, class14.field159.field1951);
                } catch (Throwable var12) {
                }
                class343.field5331 = class247.field3898.method2373(false);
                class219.field3540 = class247.field3898.method271(arg0 + 21183);
                class70.field996 = 9;
            }
            if (arg0 != -102) {
                method2054(12, -116);
            }
            if (class70.field996 == 9) {
                if (class320.field4966.method87(arg0 + 5102) < class219.field3540) {
                    return;
                }
                class247.field3898.field586 = 0;
                class320.field4966.method89(class219.field3540, true, class247.field3898.field573, 0);
                class39.field514 = 2;
                class70.field996 = 0;
                class302.method2151(0);
                class142.field2215 = -1;
                class45.method292(false, (byte) 4);
                class343.field5331 = -1;
                return;
            }
        } catch (IOException var15) {
            if (class320.field4966 != null) {
                class320.field4966.method91(-115);
                class320.field4966 = null;
            }
            if (class113.field1722 < 1) {
                class70.field996 = 1;
                if (class288.field4613 == class109.field1625) {
                    class288.field4613 = class165.field2755;
                } else {
                    class288.field4613 = class109.field1625;
                }
                class54.field760 = 0;
                class113.field1722++;
            } else {
                class39.field514 = -4;
                class70.field996 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(BII)[[I", line = 758)
    public final int[][] method2053(byte arg0, int arg1, int arg2) {
        field4578++;
        int var4 = -19 / ((arg0 - 36) / 60);
        if (this.field4580[arg1].field4572) {
            int[] var5 = this.field4580[arg1].method60(true, arg2);
            return new int[][] { var5, var5, var5 };
        } else {
            return this.field4580[arg1].method62((byte) 126, arg2);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)Lng;", line = 790)
    public static final class330 method2054(int arg0, int arg1) {
        field4558++;
        class330 var2 = (class330) class110.field1637.method704((byte) 81, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class214.field3493.method1287(class311.method2193(true, arg0), class127.method919(-252213048, arg0), ~arg1);
        class330 var4 = new class330();
        var4.field5117 = arg0;
        if (var3 != null) {
            var4.method2308(new class44(var3), (byte) 80);
        }
        var4.method2305(false);
        if (~var4.field5144 != arg1) {
            var4.method2315(method2054(var4.field5150, arg1 ^ 0x0), method2054(var4.field5144, arg1 ^ 0x0), 65536);
        }
        if (var4.field5158 != -1) {
            var4.method2317(method2054(var4.field5130, arg1), method2054(var4.field5158, 0), false);
        }
        if (!class5.field82 && var4.field5106) {
            var4.field5112 = 0;
            var4.field5152 = class127.field1974;
            var4.field5105 = false;
            var4.field5135 = class80.field1117;
            var4.field5098 = class340.field5290;
        }
        class110.field1637.method703(var4, (long) arg0, (byte) -84);
        return var4;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZI)[I", line = 858)
    public int[] method60(boolean arg0, int arg1) {
        field4574++;
        if (arg0) {
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
        return (int[]) null;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(IZ)V", line = 869)
    public class285(int arg0, boolean arg1) {
        this.field4572 = arg1;
        this.field4580 = new class285[arg0];
    }

    @OriginalMember(owner = "client!o", name = "i", descriptor = "(I)V", line = 891)
    public void method1028(int arg0) {
        field4568++;
        if (arg0 != 13818) {
            method2047(73);
        }
        if (this.field4572) {
            this.field4573.method1120(true);
            this.field4573 = null;
        } else {
            this.field4564.method1551(-20458);
            this.field4564 = null;
        }
    }
}
