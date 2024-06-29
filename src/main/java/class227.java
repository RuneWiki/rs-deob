import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class227 extends class405 {

    @OriginalMember(owner = "client!lt", name = "V", descriptor = "Z")
    public boolean field3785 = false;

    @OriginalMember(owner = "client!lt", name = "S", descriptor = "Z")
    public boolean field3782 = false;

    @OriginalMember(owner = "client!lt", name = "W", descriptor = "Lbi;")
    public static class104 field3786 = new class104(73, 17);

    @OriginalMember(owner = "client!lt", name = "ab", descriptor = "F")
    public static float field3790;

    @OriginalMember(owner = "client!lt", name = "J", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!lt", name = "R", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!lt", name = "T", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!lt", name = "U", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!lt", name = "X", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!lt", name = "Y", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!lt", name = "Z", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)Lhw;")
    public final class208 method1631(int arg0) {
        ++field3781;
        class208 var2 = new class208(41);
        var2.method1479((byte) -116, 17);
        var2.method1479((byte) -126, super.field6114);
        var2.method1479((byte) -99, super.field6102 ? 1 : 0);
        var2.method1479((byte) -123, !super.field6101 ? 0 : 1);
        var2.method1479((byte) -109, !super.field6108 ? 0 : 1);
        var2.method1479((byte) -128, super.field6094 ? 1 : 0);
        var2.method1479((byte) -100, 0);
        var2.method1479((byte) -111, !super.field6087 ? 0 : 1);
        if (arg0 > -39) {
            return null;
        } else {
            var2.method1479((byte) -93, super.field6096 ? 1 : 0);
            var2.method1479((byte) -115, super.field6093 ? 1 : 0);
            var2.method1479((byte) -95, super.field6091);
            var2.method1479((byte) -89, super.field6084);
            var2.method1479((byte) -114, !super.field6085 ? 0 : 1);
            var2.method1479((byte) -122, !super.field6103 ? 0 : 1);
            var2.method1479((byte) -114, super.field6123 ? 1 : 0);
            var2.method1479((byte) -114, super.field6120 ? 1 : 0);
            var2.method1479((byte) -126, super.field6089);
            var2.method1479((byte) -120, !super.field6122 ? 0 : 1);
            var2.method1479((byte) -92, super.field6109);
            var2.method1479((byte) -104, super.field6112);
            var2.method1479((byte) -124, super.field6100);
            var2.method1437(super.field6117, 0);
            var2.method1437(super.field6116, 0);
            var2.method1479((byte) -92, class241.method1680(-122));
            var2.method1477(65280, super.field6090);
            var2.method1479((byte) -94, super.field6110);
            var2.method1479((byte) -88, !super.field6107 ? 0 : 1);
            var2.method1479((byte) -90, super.field6082 ? 1 : 0);
            var2.method1479((byte) -112, super.field6095);
            var2.method1479((byte) -115, super.field6098 ? 1 : 0);
            var2.method1479((byte) -118, !super.field6115 ? 0 : 1);
            var2.method1479((byte) -108, super.field6121);
            var2.method1479((byte) -123, !super.field6106 ? 0 : 1);
            var2.method1479((byte) -90, super.field6083);
            var2.method1479((byte) -90, super.field6119);
            var2.method1479((byte) -87, !super.field6099 ? 0 : 1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lhw;I)V")
    private final void method1632(class208 arg0, int arg1) {
        ++field3780;
        if (arg0.field3193.length + -arg0.field3162 >= 1) {
            int var3 = arg0.method1445(-105);
            if (var3 >= 0 && ~var3 >= -18) {
                byte var4;
                if (~var3 != -18) {
                    if (var3 == 16) {
                        var4 = 38;
                    } else if (~var3 != -16) {
                        if (~var3 != -15) {
                            if (var3 == 13) {
                                var4 = 35;
                            } else if (var3 != 12) {
                                if (~var3 == -12) {
                                    var4 = 33;
                                } else if (var3 != 10) {
                                    if (~var3 == -10) {
                                        var4 = 31;
                                    } else if (var3 == 8) {
                                        var4 = 30;
                                    } else if (~var3 == -8) {
                                        var4 = 29;
                                    } else if (var3 != 6) {
                                        if (~var3 == -6) {
                                            var4 = 28;
                                        } else if (~var3 != -5) {
                                            if (~var3 != -4) {
                                                if (var3 == 2) {
                                                    var4 = 22;
                                                } else if (~var3 != -2) {
                                                    var4 = 19;
                                                } else {
                                                    var4 = 23;
                                                }
                                            } else {
                                                var4 = 23;
                                            }
                                        } else {
                                            var4 = 24;
                                        }
                                    } else {
                                        var4 = 28;
                                    }
                                } else {
                                    var4 = 32;
                                }
                            } else {
                                var4 = 34;
                            }
                        } else {
                            var4 = 36;
                        }
                    } else {
                        var4 = 37;
                    }
                } else {
                    var4 = 40;
                }
                if (arg0.field3193.length + -arg0.field3162 >= var4) {
                    super.field6114 = arg0.method1445(arg1 + -250);
                    if (super.field6114 < 1) {
                        super.field6114 = 1;
                    } else if (~super.field6114 < -5) {
                        super.field6114 = 4;
                    }
                    this.method1637(false, ~arg0.method1445(-82) == -2);
                    super.field6101 = arg0.method1445(125) == 1;
                    super.field6108 = arg0.method1445(-79) == 1;
                    super.field6094 = ~arg0.method1445(arg1 ^ -10) == -2;
                    super.field6121 = arg0.method1445(arg1 ^ -11) != 1 ? 0 : 1;
                    super.field6087 = ~arg0.method1445(38) == -2;
                    super.field6096 = ~arg0.method1445(120) == -2;
                    super.field6093 = ~arg0.method1445(arg1 + -4) == -2;
                    super.field6091 = arg0.method1445(arg1 + -68);
                    if (super.field6091 > 2) {
                        super.field6091 = 2;
                    }
                    if (~var3 <= -18) {
                        super.field6084 = arg0.method1445(114);
                    }
                    if (~var3 > -3) {
                        super.field6085 = arg0.method1445(61) == 1;
                        arg0.method1445(-127);
                    } else {
                        super.field6085 = ~arg0.method1445(65) == -2;
                        if (~var3 <= -18) {
                            super.field6103 = ~arg0.method1445(87) == -2;
                        }
                    }
                    super.field6123 = arg0.method1445(-89) == 1;
                    super.field6120 = arg0.method1445(99) == 1;
                    super.field6089 = arg0.method1445(32);
                    if (super.field6089 > 2) {
                        super.field6089 = 2;
                    }
                    super.field6097 = super.field6089;
                    super.field6122 = arg0.method1445(48) == 1;
                    super.field6109 = arg0.method1445(19);
                    if (~super.field6109 < -128) {
                        super.field6109 = 127;
                    }
                    super.field6112 = arg0.method1445(72);
                    super.field6100 = arg0.method1445(-122);
                    if (arg1 < super.field6100) {
                        super.field6100 = 127;
                    }
                    if (~var3 <= -2) {
                        super.field6117 = arg0.method1455(-3387);
                        super.field6116 = arg0.method1455(arg1 + -3514);
                    }
                    if (var3 >= 3 && ~var3 > -7) {
                        arg0.method1445(123);
                    }
                    if (var3 >= 4) {
                        int var5 = arg0.method1445(69);
                        if (~var5 > -1 || var5 > 2) {
                            var5 = 0;
                        }
                        if (class491.field7438 < 96) {
                            var5 = 0;
                        }
                        class319.method2135(var5, (byte) -117);
                    }
                    if (var3 >= 5) {
                        super.field6090 = arg0.method1436((byte) 112);
                    }
                    int var6 = 0;
                    if (var3 >= 6) {
                        super.field6110 = var6 = arg0.method1445(-117);
                    }
                    if (super.field6110 != 1 && super.field6110 != 2) {
                        super.field6110 = 2;
                    }
                    if (var3 >= 7) {
                        super.field6107 = ~arg0.method1445(124) == -2;
                    }
                    if (var3 >= 8) {
                        super.field6082 = arg0.method1445(87) == 1;
                    }
                    if (var3 >= 9) {
                        super.field6095 = arg0.method1445(43);
                    }
                    if (~super.field6095 > -1 || ~super.field6095 < ~class317.method2118(false, class491.field7438)) {
                        super.field6095 = 0;
                    }
                    if (var3 >= 10) {
                        super.field6098 = ~arg0.method1445(arg1 ^ -48) != -1;
                    }
                    if (~var3 <= -12) {
                        super.field6115 = arg0.method1445(95) != 0;
                    }
                    if (var3 >= 12) {
                        super.field6121 = arg0.method1445(-108);
                    }
                    if (super.field6121 < 0 || super.field6121 > 2) {
                        super.field6121 = 1;
                    }
                    if (~var3 <= -14) {
                        super.field6106 = ~arg0.method1445(80) == -2;
                    }
                    if (~var3 <= -15) {
                        super.field6083 = arg0.method1445(26);
                    } else if (~var6 != -1) {
                        super.field6083 = 1;
                    } else {
                        super.field6083 = 2;
                    }
                    if (~super.field6083 > -1 || super.field6083 > 3) {
                        super.field6083 = 2;
                    }
                    if (var3 >= 15) {
                        super.field6119 = arg0.method1445(75);
                        if (~super.field6119 > -1 || super.field6119 > 4) {
                            super.field6119 = class236.field3878 == 1 ? 2 : 4;
                        }
                    }
                    if (~var3 <= -17) {
                        super.field6099 = ~arg0.method1445(-90) == -2;
                        try {
                            if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
                                super.field6099 = false;
                            }
                        } catch (Throwable var7) {
                        }
                    }
                    if (var3 < 17 && super.field6083 == 0) {
                        super.field6083 = 2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IB)Z")
    public final boolean method1633(int arg0, byte arg1) {
        ++field3784;
        int var3 = 121 / ((-1 - arg1) / 35);
        return arg0 == 0 ? super.field6102 : true;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(B)V")
    public static void method1634(byte arg0) {
        field3786 = null;
        if (arg0 >= -64) {
            method1634((byte) -84);
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(II)Z")
    public final boolean method1635(int arg0, int arg1) {
        ++field3789;
        return ~arg0 == arg1 && !this.field3785 ? super.field6102 : true;
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(Lpb;)V")
    public class227(class2 arg0) {
        super.field6114 = 3;
        this.method1637(false, true);
        super.field6101 = true;
        super.field6109 = 127;
        super.field6097 = 0;
        super.field6122 = true;
        super.field6112 = 255;
        super.field6123 = true;
        super.field6091 = 2;
        super.field6085 = true;
        super.field6094 = true;
        super.field6100 = 127;
        super.field6089 = 0;
        super.field6116 = 0;
        super.field6121 = 1;
        super.field6103 = false;
        super.field6108 = true;
        super.field6117 = 0;
        super.field6084 = 0;
        super.field6120 = true;
        super.field6096 = true;
        super.field6087 = true;
        super.field6093 = true;
        if (~class491.field7438 > -97) {
            class319.method2135(0, (byte) -117);
        } else {
            class319.method2135(2, (byte) -117);
        }
        super.field6090 = 0;
        super.field6098 = false;
        super.field6107 = false;
        super.field6106 = true;
        super.field6119 = ~class236.field3878 != -2 ? 4 : 2;
        super.field6095 = 0;
        super.field6083 = 2;
        super.field6082 = false;
        super.field6110 = 2;
        super.field6115 = true;
        class488 var2 = null;
        try {
            class495 var3 = arg0.method19(19, true, "");
            while (~var3.field7458 == -1) {
                class208.method1464((byte) -125, 1L);
            }
            if (~var3.field7458 == -2) {
                var2 = (class488) var3.field7462;
                byte[] var4 = new byte[(int) var2.method2997((byte) -92)];
                int var6;
                for (int var5 = 0; var4.length > var5; var5 += var6) {
                    var6 = var2.method2993(var4, (byte) -108, var5, var4.length + -var5);
                    if (~var6 == 0) {
                        throw new IOException("EOF");
                    }
                }
                this.method1632(new class208(var4), 127);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method2994(-30563);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(II)I")
    public final int method1636(int arg0, int arg1) {
        ++field3783;
        if (arg0 != 308) {
            return 10;
        } else if (this.field3782) {
            return 0;
        } else if (!this.method1635(arg1, arg0 + -309)) {
            return 1;
        } else {
            return super.field6101 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(ZZ)V")
    public final void method1637(boolean arg0, boolean arg1) {
        super.field6102 = arg1;
        if (arg0) {
            this.method1633(-57, (byte) -66);
        }
        ++field3788;
        if (class454.field7029 != null) {
            class454.field7029.method2999(!this.method1635(class452.field7013, -1), 108);
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILpb;)V")
    public final void method1638(int arg0, class2 arg1) {
        ++field3787;
        class488 var3 = null;
        try {
            class495 var4 = arg1.method19(19, true, "");
            while (var4.field7458 == 0) {
                class208.method1464((byte) -75, 1L);
            }
            if (var4.field7458 == 1) {
                var3 = (class488) var4.field7462;
                class208 var5 = this.method1631(-43);
                var3.method2995(true, var5.field3162, var5.field3193, 0);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg0 != 32749) {
                this.method1636(-108, -48);
            }
            if (var3 != null) {
                var3.method2994(-30563);
            }
        } catch (Exception var6) {
        }
    }
}
