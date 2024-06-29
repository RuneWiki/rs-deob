import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class11 {

    @OriginalMember(owner = "client!jba", name = "o", descriptor = "I")
    public int field104 = 99;

    @OriginalMember(owner = "client!jba", name = "i", descriptor = "Z")
    public boolean field98 = false;

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "I")
    public int field92 = 5;

    @OriginalMember(owner = "client!jba", name = "q", descriptor = "I")
    public int field106 = -1;

    @OriginalMember(owner = "client!jba", name = "k", descriptor = "Z")
    public boolean field100 = false;

    @OriginalMember(owner = "client!jba", name = "m", descriptor = "I")
    public int field102 = 2;

    @OriginalMember(owner = "client!jba", name = "s", descriptor = "Z")
    public boolean field108 = false;

    @OriginalMember(owner = "client!jba", name = "h", descriptor = "Z")
    public boolean field97 = false;

    @OriginalMember(owner = "client!jba", name = "v", descriptor = "I")
    public int field111 = -1;

    @OriginalMember(owner = "client!jba", name = "D", descriptor = "I")
    public int field119 = -1;

    @OriginalMember(owner = "client!jba", name = "z", descriptor = "I")
    public int field115 = -1;

    @OriginalMember(owner = "client!jba", name = "H", descriptor = "I")
    public int field123 = -1;

    @OriginalMember(owner = "client!jba", name = "n", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!jba", name = "p", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!jba", name = "r", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!jba", name = "u", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!jba", name = "w", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!jba", name = "x", descriptor = "I")
    public int field113;

    @OriginalMember(owner = "client!jba", name = "A", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!jba", name = "C", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!jba", name = "d", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!jba", name = "g", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!jba", name = "j", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!jba", name = "E", descriptor = "Lwm;")
    public static class30 field120;

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "Lcl;")
    public class778 field91;

    @OriginalMember(owner = "client!jba", name = "l", descriptor = "[I")
    private int[] field101;

    @OriginalMember(owner = "client!jba", name = "t", descriptor = "[I")
    public int[] field109;

    @OriginalMember(owner = "client!jba", name = "y", descriptor = "[I")
    public int[] field114;

    @OriginalMember(owner = "client!jba", name = "B", descriptor = "[I")
    public int[] field117;

    @OriginalMember(owner = "client!jba", name = "F", descriptor = "[I")
    public int[] field121;

    @OriginalMember(owner = "client!jba", name = "G", descriptor = "[I")
    public int[] field122;

    @OriginalMember(owner = "client!jba", name = "e", descriptor = "[Z")
    public boolean[] field94;

    @OriginalMember(owner = "client!jba", name = "f", descriptor = "[[I")
    public int[][] field95;

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIIILka;I)Lka;", line = 5)
    public final class299 method43(int arg0, int arg1, int arg2, int arg3, class299 arg4, int arg5) {
        field103++;
        int var7 = this.field121[arg5];
        int var8 = this.field109[arg5];
        if (arg0 != 1024) {
            this.field95 = null;
        }
        class350 var9 = this.field91.method4264(26510, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg4.method1284((byte) 1, arg1, true);
        }
        class350 var11 = null;
        if ((this.field108 || class449.field5850) && arg3 != -1 && this.field109.length > arg3) {
            int var12 = this.field109[arg3];
            var11 = this.field91.method4264(26510, var12 >> 16);
            arg3 = var12 & 0xFFFF;
        }
        class350 var13 = null;
        class350 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field101 != null) {
            if (arg5 < this.field101.length) {
                var15 = this.field101[arg5];
                if (var15 != 65535) {
                    var13 = this.field91.method4264(26510, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field108 || class449.field5850) && arg3 != -1 && arg3 < this.field101.length) {
                var16 = this.field101[arg3];
                if (var16 != 65535) {
                    var14 = this.field91.method4264(26510, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field98) {
            arg1 |= 0x200;
        }
        if (var9.method2021(var10, 124)) {
            arg1 |= 0x80;
        }
        if (var9.method2025(var10, -2)) {
            arg1 |= 0x100;
        }
        if (var9.method2020(var10, 1)) {
            arg1 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2021(var15, arg0 ^ 0x479)) {
                arg1 |= 0x80;
            }
            if (var13.method2025(var15, -2)) {
                arg1 |= 0x100;
            }
            if (var13.method2020(var15, 1)) {
                arg1 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method2021(arg3, 124)) {
                arg1 |= 0x80;
            }
            if (var11.method2025(arg3, -2)) {
                arg1 |= 0x100;
            }
            if (var11.method2020(arg3, 1)) {
                arg1 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method2021(var16, 121)) {
                arg1 |= 0x80;
            }
            if (var14.method2025(var16, -2)) {
                arg1 |= 0x100;
            }
            if (var14.method2020(var16, 1)) {
                arg1 |= 0x400;
            }
        }
        int var17 = arg1 | 0x20;
        class299 var18 = arg4.method1284((byte) 1, var17, true);
        var18.method1787(arg2 - 1, var7, var11, 0, var10, arg3, 0, this.field98, var9);
        if (var13 != null) {
            var18.method1787(arg2 - 1, var7, var14, 0, var15, var16, 0, this.field98, var13);
        }
        return var18;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(Z)V", line = 146)
    public static final void method44(boolean arg0) {
        field107++;
        if (class203.field2816 == 0 || class203.field2816 == 5) {
            return;
        }
        try {
            short var1;
            if (class592.field7507 == 0) {
                var1 = 250;
            } else {
                var1 = 2000;
            }
            if (++class351.field4288 > var1) {
                if (class252.field3437 != null) {
                    class252.field3437.method1817(-119);
                    class252.field3437 = null;
                }
                if (class592.field7507 >= 3) {
                    class203.field2816 = 0;
                    class620.method3316(false, -5);
                    return;
                }
                if (class1.field6 == 2) {
                    class379.field4640.method1602(-99);
                } else {
                    class185.field2596.method1602(-106);
                }
                class351.field4288 = 0;
                class592.field7507++;
                class203.field2816 = 1;
            }
            if (class203.field2816 == 1) {
                if (class1.field6 == 2) {
                    class263.field3510 = class379.field4640.method1604((byte) 115, class740.field10014);
                } else {
                    class263.field3510 = class185.field2596.method1604((byte) 90, class740.field10014);
                }
                class203.field2816 = 2;
            }
            if (arg0) {
                if (class203.field2816 == 2) {
                    if (class263.field3510.field4144 == 2) {
                        throw new IOException();
                    }
                    if (class263.field3510.field4144 != 1) {
                        return;
                    }
                    class252.field3437 = class499.method2771(121, (Socket) class263.field3510.field4142, 15000);
                    class263.field3510 = null;
                    class727.method3889(-11108);
                    class13 var2 = class634.method3387((byte) -117);
                    var2.field130.method1491(-129, class117.field1562.field1774);
                    class116.method679(var2, 0);
                    class610.method3269(-102);
                    class203.field2816 = 3;
                }
                if (class203.field2816 == 3) {
                    if (!class252.field3437.method1814(1, (byte) 47)) {
                        return;
                    }
                    class252.field3437.method1818(1, (byte) 52, class356.field4337.field3193, 0);
                    int var3 = class356.field4337.field3193[0] & 0xFF;
                    if (var3 != 0) {
                        class203.field2816 = 0;
                        class620.method3316(!arg0, var3);
                        class252.field3437.method1817(-118);
                        class252.field3437 = null;
                        class409.method2376(4096);
                        return;
                    }
                    class356.field4337.field3133 = 0;
                    class234 var4 = new class234(518);
                    int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                    var4.method1491(-129, 10);
                    var4.method1496(var5[0], (byte) 91);
                    var4.method1496(var5[1], (byte) -118);
                    var4.method1496(var5[2], (byte) 38);
                    var4.method1496(var5[3], (byte) -118);
                    var4.method1517(false, 0L);
                    var4.method1547(class614.field7750, -6457);
                    var4.method1517(false, class196.field2730);
                    var4.method1517(false, class379.field4639);
                    var4.method1546(class176.field2315, (byte) -116, class366.field4473);
                    class727.method3889(-11108);
                    class13 var6 = class634.method3387((byte) -117);
                    class740 var7 = var6.field130;
                    if (class1.field6 == 2) {
                        if (class332.field4052 == 13) {
                            var7.method1491(-129, class117.field1585.field1774);
                        } else {
                            var7.method1491(-129, class117.field1580.field1774);
                        }
                        var7.method1541(374, 0);
                        int var10 = var7.field3133;
                        var7.method1496(647, (byte) 115);
                        var7.method1530(0, var4.field3133, var4.field3193, 82);
                        int var11 = var7.field3133;
                        var7.method1547(class506.field6471, -6457);
                        var7.method1491(-129, class530.field6723);
                        var7.method1491(-129, class400.method2313((byte) -101));
                        var7.method1541(374, class372.field4550);
                        var7.method1541(374, class463.field6021);
                        var7.method1491(-129, class485.field6252.field6939.method3350(false));
                        class213.method1415(var7, (byte) 58);
                        var7.method1547(class310.field3887, -6457);
                        var7.method1496(class517.field6589, (byte) -124);
                        class234 var12 = class485.field6252.method2989(6654);
                        var7.method1491(-129, var12.field3133);
                        var7.method1530(0, var12.field3133, var12.field3193, 121);
                        class165.field2184 = true;
                        class234 var13 = new class234(class231.field3108.method2091((byte) -90));
                        class231.field3108.method2097(var13, (byte) 7);
                        var7.method1530(0, var13.field3193.length, var13.field3193, 92);
                        var7.method1541(374, class515.field6574);
                        var7.method1517(false, class713.field9400);
                        var7.method1491(-129, class504.field6459 == null ? 0 : 1);
                        if (class504.field6459 != null) {
                            var7.method1547(class504.field6459, -6457);
                        }
                        var7.method1491(-129, class659.method3588(116, "jagtheora") ? 1 : 0);
                        var7.method1491(-129, class87.field1218 ? 1 : 0);
                        class607.method3261(var7, 0);
                        var7.method1537(var11, var5, var7.field3133, -127);
                        var7.method1534(var7.field3133 - var10, 95);
                    } else {
                        var7.method1491(-129, class117.field1588.field1774);
                        var7.method1541(374, 0);
                        int var8 = var7.field3133;
                        var7.method1496(647, (byte) -120);
                        var7.method1530(0, var4.field3133, var4.field3193, 117);
                        int var9 = var7.field3133;
                        var7.method1547(class506.field6471, -6457);
                        var7.method1491(-129, class201.field2799.field6153);
                        var7.method1491(-129, class496.field6338);
                        class213.method1415(var7, (byte) 58);
                        var7.method1547(class310.field3887, -6457);
                        var7.method1496(class517.field6589, (byte) 39);
                        class607.method3261(var7, 0);
                        var7.method1537(var9, var5, var7.field3133, -127);
                        var7.method1534(var7.field3133 - var8, 104);
                    }
                    class116.method679(var6, 0);
                    class610.method3269(51);
                    class68.field909 = new class152(var5);
                    for (int var14 = 0; var14 < 4; var14++) {
                        var5[var14] += 50;
                    }
                    class356.field4337.method4018(89, var5);
                    class203.field2816 = 4;
                }
                if (class203.field2816 == 4) {
                    if (!class252.field3437.method1814(1, (byte) -101)) {
                        return;
                    }
                    class252.field3437.method1818(1, (byte) 52, class356.field4337.field3193, 0);
                    int var15 = class356.field4337.field3193[0] & 0xFF;
                    if (var15 == 21) {
                        class203.field2816 = 7;
                    } else if (var15 == 29) {
                        class203.field2816 = 13;
                    } else if (var15 == 1) {
                        class203.field2816 = 5;
                        class620.method3316(false, var15);
                        return;
                    } else if (var15 == 2) {
                        class203.field2816 = 8;
                    } else if (var15 == 15) {
                        class203.field2816 = 14;
                        class199.field2766 = -2;
                    } else if (var15 == 23 && class592.field7507 < 3) {
                        class203.field2816 = 1;
                        class351.field4288 = 0;
                        class592.field7507++;
                        class252.field3437.method1817(-113);
                        class252.field3437 = null;
                        return;
                    } else {
                        class203.field2816 = 0;
                        class620.method3316(false, var15);
                        class252.field3437.method1817(-108);
                        class252.field3437 = null;
                        class409.method2376(4096);
                        return;
                    }
                }
                if (class203.field2816 == 6) {
                    class727.method3889(-11108);
                    class13 var16 = class634.method3387((byte) -117);
                    class740 var17 = var16.field130;
                    var17.method4022(class68.field909, (byte) 63);
                    var17.method4027(class117.field1592.field1774, 25989);
                    class116.method679(var16, 0);
                    class610.method3269(120);
                    class203.field2816 = 4;
                } else if (class203.field2816 == 7) {
                    if (class252.field3437.method1814(1, (byte) 87)) {
                        class252.field3437.method1818(1, (byte) 52, class356.field4337.field3193, 0);
                        int var18 = class356.field4337.field3193[0] & 0xFF;
                        class553.field7021 = var18 * 50;
                        class203.field2816 = 0;
                        class620.method3316(false, 21);
                        class252.field3437.method1817(-105);
                        class252.field3437 = null;
                        class409.method2376(4096);
                    }
                } else if (class203.field2816 == 13) {
                    if (class252.field3437.method1814(1, (byte) 65)) {
                        class252.field3437.method1818(1, (byte) 52, class356.field4337.field3193, 0);
                        class203.field2816 = 0;
                        class135.field1792 = class356.field4337.field3193[0] & 0xFF;
                        class620.method3316(false, 29);
                        class252.field3437.method1817(-126);
                        class252.field3437 = null;
                        class409.method2376(4096);
                    }
                } else if (class203.field2816 != 8) {
                    if (class203.field2816 == 9) {
                        class740 var19 = class356.field4337;
                        if (class1.field6 == 2) {
                            if (!class252.field3437.method1814(class548.field6849, (byte) -98)) {
                                return;
                            }
                            class252.field3437.method1818(class548.field6849, (byte) 52, var19.field3193, 0);
                            var19.field3133 = 0;
                            class20.field186 = var19.method1509(true);
                            class271.field3567 = var19.method1509(true);
                            class227.field3073 = var19.method1509(true) == 1;
                            class731.field9576 = var19.method1509(true) == 1;
                            class155.field1978 = var19.method1509(true) == 1;
                            class776.field10593 = var19.method1509(true) == 1;
                            class330.field4043 = var19.method1553((byte) 121);
                            class159.field2065 = var19.method1509(true) == 1;
                            class563.field7157 = var19.method1494(22527720);
                            class216.field2939 = var19.method1509(arg0) == 1;
                            class390.field4983.method4289((byte) 105, class216.field2939);
                            class640.field8189.method694(class216.field2939, 121);
                            class595.field7561.method770(-1, class216.field2939);
                        } else if (class252.field3437.method1814(class548.field6849, (byte) -105)) {
                            class252.field3437.method1818(class548.field6849, (byte) 52, var19.field3193, 0);
                            var19.field3133 = 0;
                            class20.field186 = var19.method1509(true);
                            class271.field3567 = var19.method1509(true);
                            class227.field3073 = var19.method1509(true) == 1;
                            class731.field9576 = var19.method1509(true) == 1;
                            class155.field1978 = var19.method1509(true) == 1;
                            class419.field5522 = var19.method1516(-11290);
                            class628.field7984 = -class502.method2786(-7114) + (class419.field5522 - var19.method1501((byte) -51));
                            int var20 = var19.method1509(true);
                            class313.field3896 = (var20 & 0x2) != 0;
                            class159.field2065 = (var20 & 0x1) != 0;
                            class470.field6130 = var19.method1497((byte) 108);
                            class733.field9692 = var19.method1553((byte) -112);
                            class562.field7135 = var19.method1553((byte) -111);
                            class736.field9974 = var19.method1553((byte) -127);
                            class290.field3702 = var19.method1497((byte) 109);
                            class73.field995 = class740.field10014.method4236(class290.field3702, 3);
                            class386.field4935 = var19.method1509(arg0);
                            class422.field5562 = var19.method1553((byte) -107);
                            class80.field1129 = var19.method1553((byte) 82);
                            class72.field982 = var19.method1509(true) == 1;
                            class422.field5564.field375 = class422.field5564.field358 = class188.field2616 = var19.method1506(1188375600);
                            class765.field10414 = var19.method1509(true);
                            class113.field1496 = var19.method1497((byte) 64);
                            class405.field5382 = var19.method1509(true) == 1;
                            class524.field6667 = new class246();
                            class524.field6667.field3371 = var19.method1553((byte) -128);
                            if (class524.field6667.field3371 == 65535) {
                                class524.field6667.field3371 = -1;
                            }
                            class524.field6667.field3374 = var19.method1506(1188375600);
                            if (class611.field7718 != class290.field3701) {
                                class524.field6667.field3366 = class524.field6667.field3371 + 50000;
                                class524.field6667.field3379 = class524.field6667.field3371 + 40000;
                            }
                            if (class611.field7718 != class169.field2235 && (class611.field7718 != class561.field7132 || class20.field186 < 2) && (class379.field4640.method1603(class219.field2988, 1) || class379.field4640.method1603(class376.field4589, 1))) {
                                class283.method1729((byte) -58);
                            }
                        } else {
                            return;
                        }
                        if ((!class227.field3073 || class155.field1978) && !class159.field2065) {
                            try {
                                class586.method3137(8259, "unzap", class80.field1134);
                            } catch (Throwable var25) {
                            }
                        } else {
                            try {
                                class586.method3137(8259, "zap", class80.field1134);
                            } catch (Throwable var27) {
                                if (class563.field7154) {
                                    try {
                                        class80.field1134.getAppletContext().showDocument(new URL(class80.field1134.getCodeBase(), "blank.ws"), "tbi");
                                    } catch (Exception var26) {
                                    }
                                }
                            }
                        }
                        if (class611.field7718 == class290.field3701) {
                            try {
                                class586.method3137(8259, "loggedin", class80.field1134);
                            } catch (Throwable var24) {
                            }
                        }
                        if (class1.field6 != 2) {
                            class203.field2816 = 0;
                            class620.method3316(false, 2);
                            class138.method794(-24358);
                            class26.method113((byte) 95, 7);
                            class563.field7155 = null;
                            return;
                        }
                        class203.field2816 = 11;
                    }
                    if (class203.field2816 == 11) {
                        if (!class252.field3437.method1814(3, (byte) -60)) {
                            return;
                        }
                        class252.field3437.method1818(3, (byte) 52, class356.field4337.field3193, 0);
                        class203.field2816 = 12;
                    }
                    if (class203.field2816 == 12) {
                        class740 var21 = class356.field4337;
                        var21.field3133 = 0;
                        if (var21.method4017((byte) 61)) {
                            if (!class252.field3437.method1814(1, (byte) 38)) {
                                return;
                            }
                            class252.field3437.method1818(1, (byte) 52, var21.field3193, 3);
                        }
                        class563.field7155 = class749.method4067(15973)[var21.method4020(-3781)];
                        class199.field2766 = var21.method1553((byte) -123);
                        class203.field2816 = 10;
                    }
                    if (class203.field2816 == 10) {
                        if (class252.field3437.method1814(class199.field2766, (byte) 35)) {
                            class252.field3437.method1818(class199.field2766, (byte) 52, class356.field4337.field3193, 0);
                            class356.field4337.field3133 = 0;
                            int var22 = class199.field2766;
                            class203.field2816 = 0;
                            class620.method3316(false, 2);
                            class496.method2756((byte) 6);
                            class316.method1851(true, class356.field4337);
                            class527.field6693 = -1;
                            if (class563.field7155 == class52.field666) {
                                class171.method1080(65510);
                            } else {
                                class29.method120((byte) 99);
                            }
                            if (class356.field4337.field3133 != var22) {
                                throw new RuntimeException("lswp pos:" + class356.field4337.field3133 + " psize:" + var22);
                            }
                            class563.field7155 = null;
                        }
                    } else if (class203.field2816 == 14) {
                        if (class199.field2766 == -2) {
                            if (!class252.field3437.method1814(2, (byte) -100)) {
                                return;
                            }
                            class252.field3437.method1818(2, (byte) 52, class356.field4337.field3193, 0);
                            class356.field4337.field3133 = 0;
                            class199.field2766 = class356.field4337.method1553((byte) -127);
                        }
                        if (class252.field3437.method1814(class199.field2766, (byte) -52)) {
                            class252.field3437.method1818(class199.field2766, (byte) 52, class356.field4337.field3193, 0);
                            class356.field4337.field3133 = 0;
                            int var23 = class199.field2766;
                            class203.field2816 = 0;
                            class620.method3316(false, 15);
                            class644.method3486(0);
                            class316.method1851(true, class356.field4337);
                            if (class356.field4337.field3133 != var23) {
                                throw new RuntimeException("lswpr pos:" + class356.field4337.field3133 + " psize:" + var23);
                            }
                            class563.field7155 = null;
                        }
                    }
                } else if (class252.field3437.method1814(1, (byte) -127)) {
                    class252.field3437.method1818(1, (byte) 52, class356.field4337.field3193, 0);
                    class203.field2816 = 9;
                    class548.field6849 = class356.field4337.field3193[0] & 0xFF;
                }
            }
        } catch (IOException var28) {
            if (class252.field3437 != null) {
                class252.field3437.method1817(-126);
                class252.field3437 = null;
            }
            if (class592.field7507 >= 3) {
                class203.field2816 = 0;
                class620.method3316(false, -4);
                class409.method2376(4096);
            } else {
                if (class1.field6 == 2) {
                    class379.field4640.method1602(89);
                } else {
                    class185.field2596.method1602(72);
                }
                class203.field2816 = 1;
                class351.field4288 = 0;
                class592.field7507++;
            }
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(BILmc;)V", line = 749)
    private final void method45(byte arg0, int arg1, class234 arg2) {
        if (arg1 == 1) {
            int var4 = arg2.method1553((byte) 89);
            this.field121 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field121[var5] = arg2.method1553((byte) 64);
            }
            this.field109 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field109[var6] = arg2.method1553((byte) -124);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field109[var7] = (arg2.method1553((byte) 11) << 16) + this.field109[var7];
            }
        } else if (arg1 == 2) {
            this.field111 = arg2.method1553((byte) 27);
        } else if (arg1 == 3) {
            this.field94 = new boolean[256];
            int var18 = arg2.method1509(true);
            for (int var19 = 0; var19 < var18; var19++) {
                this.field94[arg2.method1509(true)] = true;
            }
        } else if (arg1 == 5) {
            this.field92 = arg2.method1509(true);
        } else if (arg1 == 6) {
            this.field123 = arg2.method1553((byte) 55);
        } else if (arg1 == 7) {
            this.field119 = arg2.method1553((byte) 81);
        } else if (arg1 == 8) {
            this.field104 = arg2.method1509(true);
        } else if (arg1 == 9) {
            this.field106 = arg2.method1509(true);
        } else if (arg1 == 10) {
            this.field115 = arg2.method1509(true);
        } else if (arg1 == 11) {
            this.field102 = arg2.method1509(true);
        } else if (arg1 == 12) {
            int var15 = arg2.method1509(true);
            this.field101 = new int[var15];
            for (int var16 = 0; var16 < var15; var16++) {
                this.field101[var16] = arg2.method1553((byte) -124);
            }
            for (int var17 = 0; var17 < var15; var17++) {
                this.field101[var17] = (arg2.method1553((byte) -125) << 16) + this.field101[var17];
            }
        } else if (arg1 == 13) {
            int var8 = arg2.method1553((byte) 80);
            this.field95 = new int[var8][];
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method1509(true);
                if (var10 > 0) {
                    this.field95[var9] = new int[var10];
                    this.field95[var9][0] = arg2.method1500((byte) -114);
                    for (int var11 = 1; var11 < var10; var11++) {
                        this.field95[var9][var11] = arg2.method1553((byte) -113);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field98 = true;
        } else if (arg1 == 15) {
            this.field108 = true;
        } else if (arg1 == 16) {
            this.field97 = true;
        } else if (arg1 == 18) {
            this.field100 = true;
        } else if (arg1 == 19) {
            if (this.field122 == null) {
                this.field122 = new int[this.field95.length];
                for (int var14 = 0; var14 < this.field95.length; var14++) {
                    this.field122[var14] = 255;
                }
            }
            this.field122[arg2.method1509(true)] = arg2.method1509(true);
        } else if (arg1 == 20) {
            if (this.field117 == null || this.field114 == null) {
                this.field117 = new int[this.field95.length];
                this.field114 = new int[this.field95.length];
                for (int var12 = 0; var12 < this.field95.length; var12++) {
                    this.field117[var12] = 256;
                    this.field114[var12] = 256;
                }
            }
            int var13 = arg2.method1509(true);
            this.field117[var13] = arg2.method1553((byte) -124);
            this.field114[var13] = arg2.method1553((byte) -122);
        }
        field112++;
        if (arg0 != 60) {
            this.method49(-54, (byte) 1, 46, 87, null, 56, 36, -115);
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(B)V", line = 954)
    public static final void method46(byte arg0) {
        field105++;
        class485.field6252.method2986(1, class485.field6252.field6940, (byte) -128);
        class485.field6252.method2986(1, class485.field6252.field6942, (byte) 118);
        class485.field6252.method2986(1, class485.field6252.field6918, (byte) 116);
        class485.field6252.method2986(1, class485.field6252.field6954, (byte) -128);
        class485.field6252.method2986(1, class485.field6252.field6938, (byte) -77);
        class485.field6252.method2986(1, class485.field6252.field6915, (byte) 124);
        class485.field6252.method2986(0, class485.field6252.field6945, (byte) -63);
        class485.field6252.method2986(0, class485.field6252.field6906, (byte) -115);
        class485.field6252.method2986(0, class485.field6252.field6923, (byte) -60);
        class485.field6252.method2986(0, class485.field6252.field6952, (byte) -61);
        if (arg0 <= 79) {
            field99 = 28;
        }
        class485.field6252.method2986(0, class485.field6252.field6913, (byte) -107);
        class485.field6252.method2986(0, class485.field6252.field6947, (byte) 85);
        class485.field6252.method2986(0, class485.field6252.field6951, (byte) -56);
        class485.field6252.method2986(0, class485.field6252.field6920, (byte) -76);
        class485.field6252.method2986(0, class485.field6252.field6953, (byte) 99);
        class485.field6252.method2986(0, class485.field6252.field6939, (byte) -68);
        class485.field6252.method2986(0, class485.field6252.field6908, (byte) 124);
        class485.field6252.method2986(0, class485.field6252.field6916, (byte) 54);
        class485.field6252.method2986(0, class485.field6252.field6936, (byte) -50);
        class251.method1634(7);
        class485.field6252.method2986(2, class485.field6252.field6955, (byte) 60);
        class485.field6252.method2986(2, class485.field6252.field6933, (byte) 51);
        class723.method3873(false);
        class193.method1346((byte) -72);
        class459.field5997 = true;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(IZII)I", line = 995)
    public final int method47(int arg0, boolean arg1, int arg2, int arg3) {
        field118++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field109[arg3];
        class350 var8 = null;
        class350 var9 = this.field91.method4264(26510, var7 >> 16);
        int var10 = var7 & arg0;
        if (var9 == null) {
            return var5;
        }
        if ((this.field108 || class449.field5850) && arg2 != -1 && this.field109.length > arg2) {
            int var11 = this.field109[arg2];
            var8 = this.field91.method4264(26510, var11 >> 16);
            var6 = var11 & 0xFFFF;
        }
        if (this.field98) {
            var5 |= 0x200;
        }
        if (var9.method2021(var10, arg0 ^ 0xFF86)) {
            var5 |= 0x80;
        }
        if (var9.method2025(var10, arg0 ^ 0xFFFF0001)) {
            var5 |= 0x100;
        }
        if (var9.method2020(var10, 1)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method2021(var6, 123)) {
                var5 |= 0x80;
            }
            if (var8.method2025(var6, -2)) {
                var5 |= 0x100;
            }
            if (var8.method2020(var6, 1)) {
                var5 |= 0x400;
            }
        }
        if (this.field101 != null && arg1) {
            if (this.field101.length > arg3) {
                int var12 = this.field101[arg3];
                if (var12 != 65535) {
                    class350 var13 = this.field91.method4264(arg0 - 39025, var12 >> 16);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method2021(var14, arg0 ^ 0xFF85)) {
                            var5 |= 0x80;
                        }
                        if (var13.method2025(var14, -2)) {
                            var5 |= 0x100;
                        }
                        if (var13.method2020(var14, 1)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field108 || class449.field5850) && arg2 != -1 && this.field101.length > arg2) {
                int var15 = this.field101[arg2];
                if (var15 != 65535) {
                    class350 var16 = this.field91.method4264(arg0 ^ 0x9871, var15 >> 16);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method2021(var17, 122)) {
                            var5 |= 0x80;
                        }
                        if (var16.method2025(var17, -2)) {
                            var5 |= 0x100;
                        }
                        if (var16.method2020(var17, 1)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIIIIIIIZ)Z", line = 1116)
    public static final boolean method48(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        field93++;
        int var9 = class422.field5564.field4767[0];
        int var10 = 20 % ((arg0 + 3) / 39);
        int var11 = class422.field5564.field4758[0];
        if (var9 < 0 || class240.field3280 <= var9 || var11 < 0 || var11 >= class276.field3602) {
            return false;
        } else if (arg3 >= 0 && arg3 < class240.field3280 && arg1 >= 0 && class276.field3602 > arg1) {
            int var12 = class15.method64(var9, arg5, (byte) 111, arg2, arg6, class106.field1449, var11, arg3, arg7, arg4, arg1, class422.field5564.method190((byte) 89), arg8, class299.field3792, class179.field2391[class422.field5564.field2895]);
            if (var12 < 1) {
                return false;
            }
            class270.field3560 = class106.field1449[var12 - 1];
            class167.field2221 = class299.field3792[var12 - 1];
            class102.field1357 = false;
            class20.method91((byte) -84);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(IBIILka;III)Lka;", line = 1155)
    public final class299 method49(int arg0, byte arg1, int arg2, int arg3, class299 arg4, int arg5, int arg6, int arg7) {
        field110++;
        int var9 = this.field121[arg3];
        int var10 = this.field109[arg3];
        class350 var11 = this.field91.method4264(26510, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg4.method1284(arg1, arg5, true);
        }
        class350 var13 = null;
        if ((this.field108 || class449.field5850) && arg7 != -1 && this.field109.length > arg7) {
            int var14 = this.field109[arg7];
            var13 = this.field91.method4264(arg6 ^ 0x678C, var14 >> 16);
            arg7 = var14 & 0xFFFF;
        }
        if (this.field98) {
            arg5 |= 0x200;
        }
        if (var11.method2021(var12, arg6 ^ 0x78)) {
            arg5 |= 0x80;
        }
        if (var11.method2025(var12, -2)) {
            arg5 |= 0x100;
        }
        if (var11.method2020(var12, arg6 - 1)) {
            arg5 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2021(arg7, arg6 + 122)) {
                arg5 |= 0x80;
            }
            if (var13.method2025(arg7, -2)) {
                arg5 |= 0x100;
            }
            if (var13.method2020(arg7, 1)) {
                arg5 |= 0x400;
            }
        }
        if (arg6 != 2) {
            this.method49(-118, (byte) 73, -49, -24, null, -43, 53, -125);
        }
        int var15 = arg5 | 0x20;
        class299 var16 = arg4.method1284(arg1, var15, true);
        var16.method1787(arg2 - 1, var9, var13, arg0, var12, arg7, arg6 - 2, this.field98, var11);
        return var16;
    }

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "(B)V", line = 1229)
    public static void method50(byte arg0) {
        if (arg0 == 96) {
            field120 = null;
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(I)V", line = 1254)
    public final void method51(int arg0) {
        if (arg0 != 2) {
            return;
        }
        if (this.field115 == -1) {
            if (this.field94 == null) {
                this.field115 = 0;
            } else {
                this.field115 = 2;
            }
        }
        if (this.field106 == -1) {
            if (this.field94 == null) {
                this.field106 = 0;
            } else {
                this.field106 = 2;
            }
        }
        field90++;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lmc;I)V", line = 1283)
    public final void method52(class234 arg0, int arg1) {
        field96++;
        while (true) {
            int var3 = arg0.method1509(true);
            if (var3 == 0) {
                if (arg1 > -22) {
                    method44(false);
                    return;
                } else {
                    return;
                }
            }
            this.method45((byte) 60, var3, arg0);
        }
    }
}
