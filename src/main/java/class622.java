import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class622 extends class454 implements class614 {

    @OriginalMember(owner = "client!pc", name = "F", descriptor = "Z")
    private boolean field8663;

    @OriginalMember(owner = "client!pc", name = "mb", descriptor = "S")
    private short field8696;

    @OriginalMember(owner = "client!pc", name = "T", descriptor = "Z")
    private boolean field8677;

    @OriginalMember(owner = "client!pc", name = "kb", descriptor = "B")
    private byte field8694;

    @OriginalMember(owner = "client!pc", name = "ab", descriptor = "Z")
    private boolean field8684;

    @OriginalMember(owner = "client!pc", name = "bb", descriptor = "B")
    private byte field8685;

    @OriginalMember(owner = "client!pc", name = "G", descriptor = "Z")
    private boolean field8664;

    @OriginalMember(owner = "client!pc", name = "N", descriptor = "Lha;")
    private class54 field8671;

    @OriginalMember(owner = "client!pc", name = "J", descriptor = "Lda;")
    public class55 field8667;

    @OriginalMember(owner = "client!pc", name = "K", descriptor = "Lmf;")
    public static class382 field8668 = new class382(5);

    @OriginalMember(owner = "client!pc", name = "D", descriptor = "I")
    public static int field8661;

    @OriginalMember(owner = "client!pc", name = "E", descriptor = "I")
    public static int field8662;

    @OriginalMember(owner = "client!pc", name = "I", descriptor = "I")
    public static int field8666;

    @OriginalMember(owner = "client!pc", name = "L", descriptor = "I")
    public static int field8669;

    @OriginalMember(owner = "client!pc", name = "M", descriptor = "I")
    public static int field8670;

    @OriginalMember(owner = "client!pc", name = "O", descriptor = "I")
    public static int field8672;

    @OriginalMember(owner = "client!pc", name = "P", descriptor = "I")
    public static int field8673;

    @OriginalMember(owner = "client!pc", name = "Q", descriptor = "I")
    public static int field8674;

    @OriginalMember(owner = "client!pc", name = "R", descriptor = "I")
    public static int field8675;

    @OriginalMember(owner = "client!pc", name = "S", descriptor = "I")
    public static int field8676;

    @OriginalMember(owner = "client!pc", name = "U", descriptor = "I")
    public static int field8678;

    @OriginalMember(owner = "client!pc", name = "V", descriptor = "I")
    public static int field8679;

    @OriginalMember(owner = "client!pc", name = "W", descriptor = "I")
    public static int field8680;

    @OriginalMember(owner = "client!pc", name = "X", descriptor = "I")
    public static int field8681;

    @OriginalMember(owner = "client!pc", name = "Y", descriptor = "I")
    public static int field8682;

    @OriginalMember(owner = "client!pc", name = "Z", descriptor = "I")
    public static int field8683;

    @OriginalMember(owner = "client!pc", name = "cb", descriptor = "I")
    public static int field8686;

    @OriginalMember(owner = "client!pc", name = "db", descriptor = "I")
    public static int field8687;

    @OriginalMember(owner = "client!pc", name = "eb", descriptor = "I")
    public static int field8688;

    @OriginalMember(owner = "client!pc", name = "fb", descriptor = "I")
    public static int field8689;

    @OriginalMember(owner = "client!pc", name = "gb", descriptor = "I")
    public static int field8690;

    @OriginalMember(owner = "client!pc", name = "hb", descriptor = "I")
    public static int field8691;

    @OriginalMember(owner = "client!pc", name = "ib", descriptor = "I")
    public static int field8692;

    @OriginalMember(owner = "client!pc", name = "lb", descriptor = "I")
    public static int field8695;

    @OriginalMember(owner = "client!pc", name = "H", descriptor = "Lnu;")
    private class548 field8665;

    @OriginalMember(owner = "client!pc", name = "jb", descriptor = "Laga;")
    public static class618 field8693;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "(I)Z", line = 7)
    public final boolean method1184(int arg0) {
        ++field8681;
        int var2 = 102 / ((arg0 - -1) / 59);
        return this.field8667 != null ? this.field8667.method545() : false;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLr;I)Lda;", line = 22)
    private final class55 method3453(byte arg0, class166 arg1, int arg2) {
        ++field8669;
        if (this.field8667 != null && ~arg1.method172(this.field8667.method517(), arg2) == -1) {
            return this.field8667;
        } else {
            if (arg0 != -52) {
                this.field8667 = null;
            }
            class336 var4 = this.method3456(114, false, arg1, arg2);
            return var4 != null ? var4.field4961 : null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V", line = 45)
    public final void method1174(int arg0) {
        if (arg0 == -24082) {
            ++field8676;
            if (this.field8667 != null) {
                this.field8667.method530();
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)I", line = 60)
    public final int method1186(int arg0) {
        if (arg0 != -9960) {
            this.field8696 = -55;
        }
        ++field8661;
        return this.field8685;
    }

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "(I)I", line = 71)
    public final int method3454(int arg0) {
        ++field8686;
        if (arg0 != 0) {
            return 1;
        } else {
            return this.field8667 == null ? 15 : this.field8667.method507() / 4;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILr;)V", line = 82)
    public final void method1177(int arg0, class166 arg1) {
        ++field8692;
        if (arg0 != 0) {
            this.field8696 = -66;
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(Lr;Z)Lkq;", line = 94)
    public final class549 method1173(class166 arg0, boolean arg1) {
        ++field8670;
        if (this.field8667 == null) {
            return null;
        } else {
            if (!arg1) {
                this.field8684 = false;
            }
            class391 var3 = arg0.method130();
            var3.method252(super.field3024, super.field3018, super.field3029);
            class549 var4 = null;
            if (this.field8677) {
                var4 = class26.method321(1, 0);
            }
            if (class676.field9574) {
                this.field8667.method495(var3, var4 == null ? null : var4.field7711[0], class341.field5008, 0);
            } else {
                this.field8667.method513(var3, var4 == null ? null : var4.field7711[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "(I)V", line = 125)
    public static final void method3455(int arg0) {
        ++field8691;
        if (~class594.field8391 != -1) {
            try {
                if (++class661.field9347 > 2000) {
                    if (class274.field4181 != null) {
                        class274.field4181.method2234(false);
                        class274.field4181 = null;
                    }
                    if (class619.field8637 >= 2) {
                        class594.field8391 = 0;
                        class513.field7244 = -5;
                        return;
                    }
                    class533.field7487.method2103(-1);
                    class661.field9347 = 0;
                    ++class619.field8637;
                    class594.field8391 = 1;
                }
                if (~class594.field8391 == -2) {
                    class420.field6114 = class533.field7487.method2104(29767, class368.field5267);
                    class594.field8391 = 2;
                }
                if (~class594.field8391 == -3) {
                    if (~class420.field6114.field7024 == -3) {
                        throw new IOException();
                    }
                    if (~class420.field6114.field7024 != -2) {
                        return;
                    }
                    class274.field4181 = class461.method2721(7500, -8663, (Socket) class420.field6114.field7019);
                    class420.field6114 = null;
                    class475.method2788(0);
                    class594.field8391 = 4;
                }
                if (~class594.field8391 == -5) {
                    if (!class274.field4181.method2233(1, 13)) {
                        return;
                    }
                    class274.field4181.method2231(-82, 1, class523.field7392.field9796, 0);
                    int var1 = 255 & class523.field7392.field9796[0];
                    if (var1 != 21) {
                        class513.field7244 = var1;
                        class594.field8391 = 0;
                        class274.field4181.method2234(false);
                        class274.field4181 = null;
                        return;
                    }
                    class594.field8391 = 5;
                }
                if (~class594.field8391 == -6) {
                    if (!class274.field4181.method2233(1, 13)) {
                        return;
                    }
                    class274.field4181.method2231(-42, 1, class523.field7392.field9796, 0);
                    class703.field9912 = new String[255 & class523.field7392.field9796[0]];
                    class594.field8391 = 6;
                }
                if (class594.field8391 != 6) {
                    if (arg0 != 2490) {
                        field8693 = null;
                    }
                } else if (class274.field4181.method2233(class703.field9912.length * 8, arg0 + -2477)) {
                    class523.field7392.field9761 = 0;
                    class274.field4181.method2231(-57, class703.field9912.length * 8, class523.field7392.field9796, 0);
                    for (int var2 = 0; ~var2 > ~class703.field9912.length; ++var2) {
                        class703.field9912[var2] = class477.method2797(class523.field7392.method3854((byte) -12), 12095);
                    }
                    class594.field8391 = 0;
                    class513.field7244 = 21;
                    class274.field4181.method2234(false);
                    class274.field4181 = null;
                }
            } catch (IOException var3) {
                if (class274.field4181 != null) {
                    class274.field4181.method2234(false);
                    class274.field4181 = null;
                }
                if (~class619.field8637 > -3) {
                    class533.field7487.method2103(-1);
                    class661.field9347 = 0;
                    class594.field8391 = 1;
                    ++class619.field8637;
                } else {
                    class513.field7244 = -4;
                    class594.field8391 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZLr;I)Lpa;", line = 265)
    private final class336 method3456(int arg0, boolean arg1, class166 arg2, int arg3) {
        ++field8690;
        int var5 = 106 % ((-79 - arg0) / 35);
        class550 var6 = class101.field1572.method2617((byte) -94, 65535 & this.field8696);
        class37 var7;
        class37 var8;
        if (!this.field8684) {
            var7 = class420.field6108[super.field3023];
            if (~super.field3023 <= -4) {
                var8 = null;
            } else {
                var8 = class420.field6108[super.field3023 - -1];
            }
        } else {
            var7 = class499.field7071[super.field3023];
            var8 = class420.field6108[0];
        }
        return var6.method3111(var7, super.field3018, 3, ~this.field8685 != -12 ? this.field8685 : 10, arg2, arg1, super.field3024, arg3, this.field8685 != 11 ? this.field8694 : this.field8694 + 4, var8, super.field3029);
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)Z", line = 296)
    public final boolean method1180(int arg0) {
        if (arg0 <= 100) {
            this.field8684 = true;
        }
        ++field8682;
        return this.field8664;
    }

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "(I)Z", line = 308)
    public final boolean method951(int arg0) {
        if (arg0 >= -26) {
            this.field8671 = null;
        }
        ++field8678;
        return this.field8663;
    }

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "(I)V", line = 321)
    public final void method947(int arg0) {
        ++field8672;
        this.field8663 = false;
        int var2 = -41 % ((-44 - arg0) / 42);
        if (this.field8667 != null) {
            this.field8667.method536(-65537 & this.field8667.method517());
        }
    }

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "(I)I", line = 336)
    public final int method1182(int arg0) {
        ++field8695;
        if (arg0 != -32768) {
            return -86;
        } else {
            return this.field8667 == null ? 0 : this.field8667.method488();
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)V", line = 347)
    public static void method3457(byte arg0) {
        if (arg0 <= 120) {
            field8693 = null;
        }
        field8693 = null;
        field8668 = null;
    }

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "(I)Z", line = 360)
    public final boolean method1181(int arg0) {
        ++field8687;
        if (arg0 != -1) {
            this.field8694 = 106;
        }
        return true;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BII)V", line = 371)
    public static final void method3458(byte arg0, int arg1, int arg2) {
        ++field8689;
        int var3 = class467.field6721.method1039(0, class274.field4140.method1804(7175, class512.field7203));
        for (class279 var4 = (class279) class663.field9367.method472((byte) -26); var4 != null; var4 = (class279) class663.field9367.method482(126)) {
            int var8 = class304.method1944(var4, (byte) 97);
            if (~var3 > ~var8) {
                var3 = var8;
            }
        }
        var3 += 8;
        int var5 = class340.field5002 * 16 + 21;
        int var6 = -(var3 / 2) + arg1;
        if (var6 - -var3 > class487.field6930) {
            var6 = -var3 + class487.field6930;
        }
        if (arg0 >= -65) {
            method3455(-32);
        }
        if (~var6 > -1) {
            var6 = 0;
        }
        int var7 = arg2;
        if (~class31.field494 > ~(var5 + arg2)) {
            var7 = -var5 + class31.field494;
        }
        class352.field5079 = var6;
        if (~var7 > -1) {
            var7 = 0;
        }
        class450.field6490 = class340.field5002 * 16 - -(!class566.field7979 ? 22 : 26);
        class101.field1573 = var7;
        class623.field8731 = true;
        class70.field1246 = var3;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(ILr;)Lnu;", line = 424)
    public final class548 method1183(int arg0, class166 arg1) {
        if (this.field8665 == null) {
            this.field8665 = class149.method1060(super.field3029, super.field3024, this.method3453((byte) -52, arg1, 0), false, super.field3018);
        }
        ++field8688;
        if (arg0 != 6433) {
            this.field8665 = null;
        }
        return this.field8665;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)I", line = 440)
    public final int method1175(int arg0) {
        if (arg0 != 24563) {
            this.field8667 = null;
        }
        ++field8673;
        return this.field8694;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZIIIII)V", line = 452)
    public static final void method3459(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8679;
        if (class153.field2210 == null) {
            class282.field4228.method1150(arg1, arg3, arg4, -1, -16777216, arg5);
        } else if (~class648.field9106.field3024 <= -1 && ~class648.field9106.field3024 > ~(class199.field2812 * 512) && ~class648.field9106.field3029 <= -1 && class232.field3611 * 512 > class648.field9106.field3029) {
            ++class534.field7501;
            if (class648.field9106 != null && class648.field9106.field3024 - (256 * class648.field9106.method2553((byte) 112) - 256) >> 9 == class535.field7508 && ~(class648.field9106.field3029 - class648.field9106.method2553((byte) 74) * 256 + 256 >> 9) == ~class674.field9547) {
                class674.field9547 = -1;
                class535.field7508 = -1;
                class640.method3566(3);
            }
            class661.method3662((byte) -122);
            if (!arg0) {
                class566.method3226(arg2 ^ -25756);
            }
            class697.method3894(19874);
            class124.method945(true, arg4, arg5, arg2 ^ -16751461, arg1, arg3);
            int var6 = class626.field8769;
            int var7 = class56.field1094;
            int var8 = class190.field2745;
            int var9 = class386.field5435;
            if (class43.field700 == 1) {
                int var10 = (int) class105.field1635;
                if (var10 < class287.field4274 >> 8) {
                    var10 = class287.field4274 >> 8;
                }
                if (class598.field8449[4] && var10 < class316.field4676[4] + 128) {
                    var10 = class316.field4676[4] + 128;
                }
                int var11 = 16383 & (int) class630.field8811 + class433.field6338;
                class217.method1430(-1651000018, -200 + class674.method3748(class648.field9106.field3024, class58.field1112, 109, class648.field9106.field3029), var7, var11, (var10 >> 3) * 3 + 600 << 2, class564.field7963, class391.field5796, var10);
            } else if (~class43.field700 != -5) {
                if (class43.field700 == 5) {
                    class231.method1590(4, var7);
                }
            } else {
                int var12 = (int) class105.field1635;
                if (~(class287.field4274 >> 8) < ~var12) {
                    var12 = class287.field4274 >> 8;
                }
                if (class598.field8449[4] && class316.field4676[4] + 128 > var12) {
                    var12 = class316.field4676[4] + 128;
                }
                int var13 = (int) class630.field8811 & 16383;
                class217.method1430(-1651000018, -200 + class674.method3748(class72.field1267, class58.field1112, 74, class124.field1866), var7, var13, (var12 >> 3) * 3 + 600 << 2, class564.field7963, class391.field5796, var12);
            }
            int var14 = class131.field1928;
            int var15 = class568.field7998;
            int var16 = class413.field6011;
            int var17 = class544.field7662;
            int var18 = class637.field9001;
            for (int var19 = 0; ~var19 > -6; ++var19) {
                if (class598.field8449[var19]) {
                    int var22 = (int) ((double) (-class499.field7074[var19]) + Math.random() * (double) (class499.field7074[var19] * 2 + 1) + Math.sin((double) class32.field505[var19] / 100.0D * (double) class271.field4079[var19]) * (double) class316.field4676[var19]);
                    if (var19 == 3) {
                        class637.field9001 = class637.field9001 + var22 & 16383;
                    }
                    if (var19 == 0) {
                        class131.field1928 += var22 << 2;
                    }
                    if (~var19 == -2) {
                        class568.field7998 += var22 << 2;
                    }
                    if (~var19 == -3) {
                        class413.field6011 += var22 << 2;
                    }
                    if (var19 == 4) {
                        class544.field7662 += var22;
                        if (class544.field7662 >= 1024) {
                            if (~class544.field7662 < -3073) {
                                class544.field7662 = 3072;
                            }
                        } else {
                            class544.field7662 = 1024;
                        }
                    }
                }
            }
            if (class131.field1928 < 0) {
                class131.field1928 = 0;
            }
            if (class413.field6011 < 0) {
                class413.field6011 = 0;
            }
            if (~class131.field1928 < ~((class302.field4492 << 9) - 1)) {
                class131.field1928 = (class302.field4492 << 9) + -1;
            }
            if ((class8.field82 << 9) - 1 < class413.field6011) {
                class413.field6011 = (class8.field82 << 9) + -1;
            }
            class104.method837(-47);
            class424.method2542((byte) 119);
            class282.field4228.method168(var9, var8, var6 + var9, var7 + var8);
            class282.field4228.method194();
            int var20 = class637.field9005;
            if (class380.field5380 != null) {
                class380.field5380.method1025(var7, class134.field1975 << 3, (byte) -108, var6, class544.field7662, var20, class637.field9001, class282.field4228, var8, var9);
            } else {
                class282.field4228.method139(var20);
            }
            class263.method1730(-1);
            class318.field4690.method240(class131.field1928, class568.field7998, class413.field6011, 16383 & -class544.field7662, 16383 & -class637.field9001, -class300.field4472 & 16383);
            class282.field4228.method155(class318.field4690);
            class282.field4228.method184(var6 / 2 + var9, var7 / 2 + var8, class701.field9901 << 1, class701.field9901 << 1);
            class671.method3723(-7725, var6 / 2 + var9, class701.field9901 << 1, class701.field9901 << 1, var7 / 2 + var8);
            class308.method1961(16383 & -class544.field7662, -class300.field4472 & 16383, class131.field1928, 4, class568.field7998, 16383 & -class637.field9001, class413.field6011);
            if (arg2 != 25755) {
                method3458((byte) 1, -43, -14);
            }
            byte var21 = class287.field4270.method2746(0, class328.field4859) == 2 ? (byte) class534.field7501 : 1;
            class356.method2174(class564.field7962, class131.field1928, class568.field7998, class413.field6011, class262.field3977, class166.field2387, class539.field7552, class158.field2274, class692.field9728, class117.field1784, class648.field9106.field3019 + 1, var21, class648.field9106.field3024 >> 9, class648.field9106.field3029 >> 9, !class287.field4270.field3723, true);
            class263.method1730(-1);
            if (~class420.field6113 == -11) {
                class232.method1594(256, 1, var8, var7, var9, var6, 256);
                class636.method3543(var8, 256, 78, var6, 256, var7, var9);
                class381.method2278(arg2 ^ 25838, 256, var9, var8, 256, var7, var6);
                class31.method353(var6, var7, var9, 339, var8);
            }
            class105.method838();
            class131.field1928 = var14;
            class544.field7662 = var17;
            class637.field9001 = var18;
            class568.field7998 = var15;
            class413.field6011 = var16;
            if (class434.field6347 && ~field8693.method3428(-126) == -1) {
                class434.field6347 = false;
            }
            if (class434.field6347) {
                class282.field4228.method1150(var6, var8, var9, -1, -16777216, var7);
                class140.method1015(class563.field7931, false, class244.field3796, class282.field4228, (byte) 122, class274.field4128.method1804(arg2 ^ 30876, class512.field7203));
            }
        } else {
            class282.field4228.method1150(arg1, arg3, arg4, arg2 ^ -25756, -16777216, arg5);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)I", line = 648)
    public final int method1179(boolean arg0) {
        ++field8675;
        return !arg0 ? -5 : this.field8696 & 65535;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lr;I)V", line = 660)
    public final void method1172(class166 arg0, int arg1) {
        ++field8662;
        Object var3 = null;
        class54 var5;
        if (this.field8671 == null && this.field8664) {
            class336 var4 = this.method3456(-120, true, arg0, 262144);
            var5 = var4 != null ? var4.field4963 : null;
        } else {
            var5 = this.field8671;
            this.field8671 = null;
        }
        if (var5 != null) {
            class320.method2005(var5, super.field3023, super.field3024, super.field3029, (boolean[]) null);
        }
        if (arg1 < 26) {
            this.method1171((byte) 4);
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lr;Let;IIIIIZIIIIIIZ)V", line = 698)
    public class622(class166 arg0, class550 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field7812 == 1, class327.method2061(arg12, arg13, 81));
        this.field8663 = arg14;
        this.field8696 = (short) arg1.field7783;
        this.field8677 = ~arg1.field7746 != -1 && !arg7;
        this.field8694 = (byte) arg13;
        this.field8684 = arg7;
        super.field3023 = (byte) arg3;
        this.field8685 = (byte) arg12;
        this.field8664 = arg0.method104() && arg1.field7759 && !this.field8684 && class287.field4270.method1625(-123, class328.field4859) != 0;
        int var16 = 2048;
        if (this.field8663) {
            var16 |= 65536;
        }
        class336 var17 = this.method3456(-4, this.field8664, arg0, var16);
        if (var17 != null) {
            this.field8671 = var17.field4963;
            this.field8667 = var17.field4961;
            if (this.field8663) {
                this.field8667 = this.field8667.method532((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lr;Z)V", line = 730)
    public final void method1176(class166 arg0, boolean arg1) {
        ++field8683;
        Object var3 = null;
        class54 var5;
        if (this.field8671 == null && this.field8664) {
            class336 var4 = this.method3456(-126, true, arg0, 262144);
            var5 = var4 == null ? null : var4.field4963;
        } else {
            var5 = this.field8671;
            this.field8671 = null;
        }
        if (var5 != null) {
            class409.method2472(var5, super.field3023, super.field3024, super.field3029, (boolean[]) null);
        }
        if (arg1) {
            this.field8694 = -31;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IILr;I)Z", line = 760)
    public final boolean method1185(int arg0, int arg1, class166 arg2, int arg3) {
        ++field8666;
        class55 var5 = this.method3453((byte) -52, arg2, 131072);
        if (var5 != null) {
            class391 var6 = arg2.method130();
            var6.method252(super.field3024, super.field3018, super.field3029);
            return class676.field9574 ? var5.method492(arg3, arg1, var6, false, class341.field5008) : var5.method529(arg3, arg1, var6, false);
        } else {
            return arg0 != -26798;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZLr;Lrga;IIZ)V", line = 783)
    public final void method953(int arg0, boolean arg1, class166 arg2, class215 arg3, int arg4, int arg5, boolean arg6) {
        if (!arg6) {
            this.field8677 = false;
        }
        ++field8680;
        if (!(arg3 instanceof class176)) {
            if (arg3 instanceof class622) {
                class622 var8 = (class622) arg3;
                if (this.field8667 != null && var8.field8667 != null) {
                    this.field8667.method539(var8.field8667, arg4, arg0, arg5, arg1);
                    return;
                }
            }
        } else {
            class176 var9 = (class176) arg3;
            if (this.field8667 == null || var9.field2492 == null) {
                return;
            }
            this.field8667.method539(var9.field2492, arg4, arg0, arg5, arg1);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)I", line = 812)
    public final int method1171(byte arg0) {
        ++field8674;
        if (arg0 < 39) {
            this.field8664 = true;
        }
        return this.field8667 == null ? 0 : this.field8667.method525();
    }
}
