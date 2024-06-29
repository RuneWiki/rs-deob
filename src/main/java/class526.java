import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class526 {

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "Ltaa;")
    public class409 field7287 = new class409();

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field7281 = 0;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "Z")
    public static boolean field7284 = false;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public static int field7276;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field7277;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public static int field7278;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field7279;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
    public static int field7280;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
    public static int field7282;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public static int field7283;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
    public static int field7285;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "I")
    public static int field7286;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
    public static int field7288;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "Ltaa;")
    private class409 field7289;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)I")
    public final int method3042(int arg0) {
        field7280++;
        int var2 = arg0;
        class409 var3 = this.field7287.field5961;
        while (this.field7287 != var3) {
            var3 = var3.field5961;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)[Lsh;")
    public static final class70[] method3043(int arg0) {
        if (arg0 > -126) {
            method3049(null, -66);
        }
        field7288++;
        return new class70[] { class16.field264, class431.field6175, class628.field8649 };
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)V")
    public static final void method3044(boolean arg0) {
        field7285++;
        class290.field4059 = null;
        if (class241.field3529 && class324.method2072(-82) != 1) {
            class349.method2191(106, class214.field3036 == 3 || class214.field3036 == 7, class599.method3409(107), 0, class331.method2104((byte) -111), 0);
        }
        int var1 = 0;
        if (arg0) {
            method3049(null, -110);
        }
        int var2 = 0;
        if (class241.field3529) {
            var1 = class146.method1163((byte) -124);
            var2 = class313.method2035(false);
        }
        class348.method2189(var2, class184.field2784, var2, -1, var1, class467.field6559 + var1, var2 - -class582.field7968, (byte) 116, var1);
        if (class290.field4059 != null) {
            class618.method3501(var1, class419.field6061, true, class669.field9126, var2, class234.field3393.field5436, class467.field6559 + var1, false, class290.field4059, -1412584499, var2 + class582.field7968);
            class290.field4059 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
    public static final void method3045(byte arg0) {
        field7283++;
        if (class399.field5899 == 0 || class399.field5899 == 5) {
            return;
        }
        try {
            short var1;
            if (class576.field7899 == 0) {
                var1 = 250;
            } else {
                var1 = 2000;
            }
            if (var1 < ++class10.field141) {
                if (class512.field7137 != null) {
                    class512.field7137.method706((byte) 36);
                    class512.field7137 = null;
                }
                if (class576.field7899 >= 3) {
                    class399.field5899 = 0;
                    class204.method1420(-5, (byte) -111);
                    return;
                }
                if (class640.field8799 == 2) {
                    class678.field9207.method3761(0);
                } else {
                    class20.field316.method3761(0);
                }
                class576.field7899++;
                class399.field5899 = 1;
                class10.field141 = 0;
            }
            if (class399.field5899 == 1) {
                if (class640.field8799 == 2) {
                    class162.field2585 = class678.field9207.method3764(class689.field9299, (byte) 36);
                } else {
                    class162.field2585 = class20.field316.method3764(class689.field9299, (byte) 36);
                }
                class399.field5899 = 2;
            }
            if (class399.field5899 == 2) {
                if (class162.field2585.field8462 == 2) {
                    throw new IOException();
                }
                if (class162.field2585.field8462 != 1) {
                    return;
                }
                class512.field7137 = class199.method1409((Socket) class162.field2585.field8463, (byte) -118, 7500);
                class162.field2585 = null;
                class480.method2814(0);
                class564 var2 = class209.method1438(true);
                var2.field7778.method1526(false, class250.field3607.field7212);
                class167.method1260(9, var2);
                class620.method3538(0);
                class399.field5899 = 3;
            }
            if (class399.field5899 == 3) {
                if (!class512.field7137.method708(1, 107)) {
                    return;
                }
                class512.field7137.method707(1, 0, (byte) -118, class149.field2477.field3066);
                int var3 = class149.field2477.field3066[0] & 0xFF;
                if (var3 != 0) {
                    class399.field5899 = 0;
                    class204.method1420(var3, (byte) -113);
                    class512.field7137.method706((byte) 36);
                    class512.field7137 = null;
                    class286.method1871((byte) 3);
                    return;
                }
                class149.field2477.field3109 = 0;
                class215 var4 = new class215(518);
                int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                var4.method1526(false, 10);
                var4.method1539((byte) 91, var5[0]);
                var4.method1539((byte) 96, var5[1]);
                var4.method1539((byte) 95, var5[2]);
                var4.method1539((byte) 127, var5[3]);
                var4.method1540(0L, (byte) 70);
                var4.method1481((byte) -5, class463.field6510);
                var4.method1540(class607.field8335, (byte) -124);
                var4.method1540(class345.field4831, (byte) -112);
                var4.method1538(class498.field6964, (byte) -76, class100.field1803);
                class480.method2814(0);
                class564 var6 = class209.method1438(true);
                class665 var7 = var6.field7778;
                if (class640.field8799 == 2) {
                    if (class214.field3036 == 13) {
                        var7.method1526(false, class250.field3612.field7212);
                    } else {
                        var7.method1526(false, class250.field3610.field7212);
                    }
                    var7.method1485((byte) 107, 0);
                    int var10 = var7.field3109;
                    var7.method1539((byte) 117, 634);
                    var7.method1528(var4.field3109, 0, var4.field3066, 92);
                    int var11 = var7.field3109;
                    var7.method1481((byte) -5, class624.field8547);
                    var7.method1526(false, class274.field3850);
                    var7.method1526(false, class324.method2072(-71));
                    var7.method1485((byte) 107, class467.field6559);
                    var7.method1485((byte) 107, class582.field7968);
                    var7.method1526(false, class693.field9368.field4445.method1857(-32350));
                    class704.method3928(var7, (byte) 55);
                    var7.method1481((byte) -5, class640.field8796);
                    var7.method1539((byte) 120, class601.field8259);
                    class215 var12 = class693.field9368.method2063(24);
                    var7.method1526(false, var12.field3109);
                    var7.method1528(var12.field3109, 0, var12.field3066, 74);
                    class184.field2782 = true;
                    class215 var13 = new class215(class270.field3807.method1637((byte) -76));
                    class270.field3807.method1638(1, var13);
                    var7.method1528(var13.field3066.length, 0, var13.field3066, -73);
                    var7.method1485((byte) 107, class106.field1870);
                    var7.method1540(class638.field8767, (byte) -63);
                    var7.method1526(false, class114.field1952 == null ? 0 : 1);
                    if (class114.field1952 != null) {
                        var7.method1481((byte) -5, class114.field1952);
                    }
                    var7.method1526(false, class314.method2038((byte) 50, "jagtheora") ? 1 : 0);
                    class244.method1676(64, var7);
                    var7.method1498(var11, true, var5, var7.field3109);
                    var7.method1531(1809639944, var7.field3109 - var10);
                } else {
                    var7.method1526(false, class250.field3613.field7212);
                    var7.method1485((byte) 107, 0);
                    int var8 = var7.field3109;
                    var7.method1539((byte) 119, 634);
                    var7.method1528(var4.field3109, 0, var4.field3066, -109);
                    int var9 = var7.field3109;
                    var7.method1481((byte) -5, class624.field8547);
                    var7.method1526(false, class582.field7970.field6488);
                    var7.method1526(false, class607.field8336);
                    class704.method3928(var7, (byte) 55);
                    var7.method1481((byte) -5, class640.field8796);
                    var7.method1539((byte) 106, class601.field8259);
                    class244.method1676(92, var7);
                    var7.method1498(var9, true, var5, var7.field3109);
                    var7.method1531(1809639944, var7.field3109 - var8);
                }
                class167.method1260(-48, var6);
                class620.method3538(0);
                class72.field1320 = new class377(var5);
                for (int var14 = 0; var14 < 4; var14++) {
                    var5[var14] += 50;
                }
                class149.field2477.method3729(-111, var5);
                class399.field5899 = 4;
            }
            if (class399.field5899 == 4) {
                if (!class512.field7137.method708(1, 94)) {
                    return;
                }
                class512.field7137.method707(1, 0, (byte) -117, class149.field2477.field3066);
                int var15 = class149.field2477.field3066[0] & 0xFF;
                if (var15 == 21) {
                    class399.field5899 = 7;
                } else if (var15 == 29) {
                    class399.field5899 = 13;
                } else if (var15 == 1) {
                    class399.field5899 = 5;
                    class204.method1420(var15, (byte) -125);
                    return;
                } else if (var15 == 2) {
                    class399.field5899 = 8;
                } else if (var15 == 15) {
                    class399.field5899 = 14;
                    class57.field1142 = -2;
                } else if (var15 == 23 && class576.field7899 < 3) {
                    class399.field5899 = 1;
                    class576.field7899++;
                    class10.field141 = 0;
                    class512.field7137.method706((byte) 36);
                    class512.field7137 = null;
                    return;
                } else {
                    class399.field5899 = 0;
                    class204.method1420(var15, (byte) -87);
                    class512.field7137.method706((byte) 36);
                    class512.field7137 = null;
                    class286.method1871((byte) 3);
                    return;
                }
            }
            if (class399.field5899 == 6) {
                class480.method2814(0);
                class564 var16 = class209.method1438(true);
                class665 var17 = var16.field7778;
                var17.method3739(-18, class72.field1320);
                var17.method3731(class250.field3619.field7212, 18676);
                class167.method1260(-87, var16);
                class620.method3538(0);
                class399.field5899 = 4;
            } else if (class399.field5899 == 7) {
                if (class512.field7137.method708(1, 118)) {
                    class512.field7137.method707(1, 0, (byte) -109, class149.field2477.field3066);
                    int var18 = class149.field2477.field3066[0] & 0xFF;
                    class399.field5899 = 0;
                    class565.field7792 = (var18 + 3) * 60;
                    class204.method1420(21, (byte) -95);
                    class512.field7137.method706((byte) 36);
                    class512.field7137 = null;
                    class286.method1871((byte) 3);
                }
            } else if (class399.field5899 == 13) {
                if (class512.field7137.method708(1, 102)) {
                    class512.field7137.method707(1, 0, (byte) -128, class149.field2477.field3066);
                    class399.field5899 = 0;
                    class71.field1294 = class149.field2477.field3066[0] & 0xFF;
                    class204.method1420(29, (byte) -97);
                    class512.field7137.method706((byte) 36);
                    class512.field7137 = null;
                    class286.method1871((byte) 3);
                }
            } else if (class399.field5899 != 8) {
                if (class399.field5899 == 9) {
                    class665 var19 = class149.field2477;
                    if (class640.field8799 == 2) {
                        if (!class512.field7137.method708(class440.field6268, 93)) {
                            return;
                        }
                        class512.field7137.method707(class440.field6268, 0, (byte) 60, var19.field3066);
                        var19.field3109 = 0;
                        class476.field6653 = var19.method1535(255);
                        class323.field4477 = var19.method1535(255);
                        class175.field2705 = var19.method1535(255) == 1;
                        class405.field5941 = var19.method1535(255) == 1;
                        class684.field9262 = var19.method1535(255) == 1;
                        class748.field10364 = var19.method1535(255) == 1;
                        class561.field7752 = var19.method1478(842397944);
                        class643.field8857 = var19.method1535(255) == 1;
                        class477.field6660 = var19.method1517((byte) 125);
                        class491.field6806 = var19.method1535(255) == 1;
                        class76.field1366.method1679(class491.field6806, (byte) 25);
                        class721.field9801.method156((byte) 11, class491.field6806);
                        class510.field7099.method1334((byte) 88, class491.field6806);
                    } else if (class512.field7137.method708(class440.field6268, 107)) {
                        class512.field7137.method707(class440.field6268, 0, (byte) 85, var19.field3066);
                        var19.field3109 = 0;
                        class476.field6653 = var19.method1535(255);
                        class323.field4477 = var19.method1535(255);
                        class175.field2705 = var19.method1535(255) == 1;
                        class405.field5941 = var19.method1535(255) == 1;
                        class684.field9262 = var19.method1535(255) == 1;
                        class304.field4239 = var19.method1520(13638);
                        class643.field8857 = class304.field4239 > 0;
                        class106.field1868 = var19.method1478(842397944);
                        class346.field4840 = var19.method1478(842397944);
                        class643.field8839 = var19.method1478(842397944);
                        class96.field1667 = var19.method1533((byte) -126);
                        class715.field9743 = class689.field9299.method1206(116, class96.field1667);
                        class194.field2864 = var19.method1535(255);
                        class162.field2582 = var19.method1478(842397944);
                        class667.field9104 = var19.method1478(842397944);
                        class316.field4366 = var19.method1535(255) == 1;
                        class58.field1147.field8189 = class58.field1147.field8182 = class704.field9522 = var19.method1519(-13487);
                        class355.field5024 = var19.method1535(255);
                        class669.field9122 = var19.method1533((byte) -126);
                        class393.field5776 = new class670();
                        class393.field5776.field9140 = var19.method1478(842397944);
                        if (class393.field5776.field9140 == 65535) {
                            class393.field5776.field9140 = -1;
                        }
                        class393.field5776.field9144 = var19.method1519(-13487);
                        if (class740.field9967 != class436.field6234) {
                            class393.field5776.field9135 = class393.field5776.field9140 + 50000;
                            class393.field5776.field9145 = class393.field5776.field9140 + 40000;
                        }
                        if (class440.field6259 != class436.field6234 && (class678.field9207.method3766((byte) 94, class47.field992) || class678.field9207.method3766((byte) 112, class383.field5556))) {
                            class336.method2129(114);
                        }
                    } else {
                        return;
                    }
                    if ((!class175.field2705 || class684.field9262) && !class643.field8857) {
                        try {
                            class43.method542((byte) 125, class675.field9193, "unzap");
                        } catch (Throwable var26) {
                        }
                    } else {
                        try {
                            class43.method542((byte) 125, class675.field9193, "zap");
                        } catch (Throwable var27) {
                            if (class424.field6112) {
                                try {
                                    class675.field9193.getAppletContext().showDocument(new URL(class675.field9193.getCodeBase(), "blank.ws"), "tbi");
                                } catch (Exception var25) {
                                }
                            }
                        }
                    }
                    if (class740.field9967 == class436.field6234) {
                        try {
                            class43.method542((byte) 125, class675.field9193, "loggedin");
                        } catch (Throwable var24) {
                        }
                    }
                    if (class640.field8799 != 2) {
                        class399.field5899 = 0;
                        class204.method1420(2, (byte) -92);
                        class93.method885(8839);
                        class215.method1527(2, 7);
                        class480.field6701 = null;
                        return;
                    }
                    class399.field5899 = 11;
                }
                if (class399.field5899 == 11) {
                    if (!class512.field7137.method708(3, 94)) {
                        return;
                    }
                    class512.field7137.method707(3, 0, (byte) 11, class149.field2477.field3066);
                    class399.field5899 = 12;
                }
                if (class399.field5899 == 12) {
                    class665 var20 = class149.field2477;
                    var20.field3109 = 0;
                    if (var20.method3727(-1510)) {
                        if (!class512.field7137.method708(1, 110)) {
                            return;
                        }
                        class512.field7137.method707(1, 3, (byte) -127, var20.field3066);
                    }
                    class480.field6701 = class407.method2532(-11271)[var20.method3730(15295)];
                    class57.field1142 = var20.method1478(842397944);
                    class399.field5899 = 10;
                }
                if (class399.field5899 != 10) {
                    int var22 = -128 / (-arg0 / 53);
                    if (class399.field5899 == 14) {
                        if (class57.field1142 == -2) {
                            if (!class512.field7137.method708(2, 106)) {
                                return;
                            }
                            class512.field7137.method707(2, 0, (byte) -128, class149.field2477.field3066);
                            class149.field2477.field3109 = 0;
                            class57.field1142 = class149.field2477.method1478(842397944);
                        }
                        if (class512.field7137.method708(class57.field1142, 117)) {
                            class512.field7137.method707(class57.field1142, 0, (byte) -104, class149.field2477.field3066);
                            class149.field2477.field3109 = 0;
                            int var23 = class57.field1142;
                            class399.field5899 = 0;
                            class204.method1420(15, (byte) -120);
                            class482.method2827((byte) 86);
                            class602.method3428(class149.field2477, (byte) 118);
                            if (class149.field2477.field3109 != var23) {
                                throw new RuntimeException("lswpr pos:" + class149.field2477.field3109 + " psize:" + var23);
                            }
                            class480.field6701 = null;
                        }
                    }
                } else if (class512.field7137.method708(class57.field1142, 96)) {
                    class512.field7137.method707(class57.field1142, 0, (byte) 28, class149.field2477.field3066);
                    class149.field2477.field3109 = 0;
                    class399.field5899 = 0;
                    int var21 = class57.field1142;
                    class204.method1420(2, (byte) -124);
                    class162.method1238(0);
                    class602.method3428(class149.field2477, (byte) 118);
                    class59.field1172 = -1;
                    if (class480.field6701 == class207.field2963) {
                        class367.method2333((byte) 99);
                    } else {
                        class449.method2685(-92);
                    }
                    if (class149.field2477.field3109 != var21) {
                        throw new RuntimeException("lswp pos:" + class149.field2477.field3109 + " psize:" + var21);
                    }
                    class480.field6701 = null;
                }
            } else if (class512.field7137.method708(1, 107)) {
                class512.field7137.method707(1, 0, (byte) -107, class149.field2477.field3066);
                class440.field6268 = class149.field2477.field3066[0] & 0xFF;
                class399.field5899 = 9;
            }
        } catch (IOException var28) {
            if (class512.field7137 != null) {
                class512.field7137.method706((byte) 36);
                class512.field7137 = null;
            }
            if (class576.field7899 >= 3) {
                class399.field5899 = 0;
                class204.method1420(-4, (byte) -87);
                class286.method1871((byte) 3);
            } else {
                if (class640.field8799 == 2) {
                    class678.field9207.method3761(0);
                } else {
                    class20.field316.method3761(0);
                }
                class576.field7899++;
                class10.field141 = 0;
                class399.field5899 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ltaa;Z)V")
    public final void method3046(class409 arg0, boolean arg1) {
        field7279++;
        if (arg0.field5960 != null) {
            arg0.method2536(93);
        }
        arg0.field5961 = this.field7287;
        arg0.field5960 = this.field7287.field5960;
        if (!arg1) {
            this.field7287 = null;
        }
        arg0.field5960.field5961 = arg0;
        arg0.field5961.field5960 = arg0;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)V")
    public final void method3047(byte arg0) {
        while (true) {
            class409 var2 = this.field7287.field5961;
            if (this.field7287 == var2) {
                if (arg0 < 23) {
                    this.field7289 = null;
                }
                field7277++;
                this.field7289 = null;
                return;
            }
            var2.method2536(54);
        }
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(B)Ltaa;")
    public final class409 method3048(byte arg0) {
        field7278++;
        class409 var2 = this.field7289;
        if (this.field7287 == var2) {
            this.field7289 = null;
            return null;
        }
        if (arg0 > -34) {
            this.field7289 = null;
        }
        this.field7289 = var2.field5961;
        return var2;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method3049(String arg0, int arg1) {
        System.out.println("Error: " + class236.method1645("\n", true, "%0a", arg0));
        field7276++;
        if (arg1 != -5192) {
            method3045((byte) 17);
        }
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)Ltaa;")
    public final class409 method3050(int arg0) {
        if (arg0 != 8) {
            return null;
        }
        field7286++;
        class409 var2 = this.field7287.field5961;
        if (this.field7287 == var2) {
            this.field7289 = null;
            return null;
        } else {
            this.field7289 = var2.field5961;
            return var2;
        }
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
    public class526() {
        this.field7287.field5960 = this.field7287;
        this.field7287.field5961 = this.field7287;
    }
}
