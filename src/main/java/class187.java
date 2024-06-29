import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class187 extends class8 {

    @OriginalMember(owner = "client!uu", name = "Z", descriptor = "Z")
    public boolean field2776 = false;

    @OriginalMember(owner = "client!uu", name = "db", descriptor = "Z")
    public boolean field2780 = false;

    @OriginalMember(owner = "client!uu", name = "ab", descriptor = "[Lwi;")
    public static class324[] field2777 = new class324[8];

    @OriginalMember(owner = "client!uu", name = "eb", descriptor = "Lvp;")
    public static class123 field2781 = new class123(31, 3);

    @OriginalMember(owner = "client!uu", name = "N", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!uu", name = "U", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!uu", name = "V", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!uu", name = "W", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!uu", name = "X", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!uu", name = "Y", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!uu", name = "bb", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!uu", name = "cb", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lti;B)V", line = 3)
    private final void method1291(class303 arg0, byte arg1) {
        ++field2771;
        if (arg0.field4326.length + -arg0.field4333 >= 1) {
            int var3 = arg0.method1918((byte) -122);
            if (var3 >= 0 && var3 <= 17) {
                byte var4;
                if (var3 != 17) {
                    if (~var3 != -17) {
                        if (~var3 == -16) {
                            var4 = 37;
                        } else if (~var3 != -15) {
                            if (var3 != 13) {
                                if (var3 == 12) {
                                    var4 = 34;
                                } else if (var3 != 11) {
                                    if (~var3 != -11) {
                                        if (var3 == 9) {
                                            var4 = 31;
                                        } else if (var3 != 8) {
                                            if (~var3 == -8) {
                                                var4 = 29;
                                            } else if (var3 != 6) {
                                                if (var3 != 5) {
                                                    if (~var3 != -5) {
                                                        if (var3 == 3) {
                                                            var4 = 23;
                                                        } else if (var3 != 2) {
                                                            if (var3 == 1) {
                                                                var4 = 23;
                                                            } else {
                                                                var4 = 19;
                                                            }
                                                        } else {
                                                            var4 = 22;
                                                        }
                                                    } else {
                                                        var4 = 24;
                                                    }
                                                } else {
                                                    var4 = 28;
                                                }
                                            } else {
                                                var4 = 28;
                                            }
                                        } else {
                                            var4 = 30;
                                        }
                                    } else {
                                        var4 = 32;
                                    }
                                } else {
                                    var4 = 33;
                                }
                            } else {
                                var4 = 35;
                            }
                        } else {
                            var4 = 36;
                        }
                    } else {
                        var4 = 38;
                    }
                } else {
                    var4 = 40;
                }
                if (arg0.field4326.length + -arg0.field4333 >= var4) {
                    super.field128 = arg0.method1918((byte) 87);
                    if (~super.field128 > -2) {
                        super.field128 = 1;
                    } else if (super.field128 > 4) {
                        super.field128 = 4;
                    }
                    this.method1297(~arg0.method1918((byte) 72) == -2, 62);
                    super.field129 = arg0.method1918((byte) 109) == 1;
                    super.field123 = arg0.method1918((byte) 118) == 1;
                    super.field110 = arg0.method1918((byte) -94) == 1;
                    super.field113 = arg0.method1918((byte) 103) == 1 ? 1 : 0;
                    super.field133 = ~arg0.method1918((byte) -74) == -2;
                    super.field115 = arg0.method1918((byte) 89) == 1;
                    super.field131 = ~arg0.method1918((byte) 123) == -2;
                    super.field148 = arg0.method1918((byte) 121);
                    if (~super.field148 < -3) {
                        super.field148 = 2;
                    }
                    if (~var3 <= -18) {
                        super.field151 = arg0.method1918((byte) -68);
                    }
                    if (~var3 <= -3) {
                        super.field117 = ~arg0.method1918((byte) 110) == -2;
                        if (~var3 <= -18) {
                            super.field147 = ~arg0.method1918((byte) 106) == -2;
                        }
                    } else {
                        super.field117 = arg0.method1918((byte) 109) == 1;
                        arg0.method1918((byte) -82);
                    }
                    super.field136 = arg0.method1918((byte) -96) == 1;
                    super.field153 = ~arg0.method1918((byte) 116) == -2;
                    super.field137 = arg0.method1918((byte) 103);
                    if (~super.field137 < -3) {
                        super.field137 = 2;
                    }
                    super.field142 = super.field137;
                    super.field118 = arg0.method1918((byte) -110) == 1;
                    super.field116 = arg0.method1918((byte) -55);
                    if (super.field116 > 127) {
                        super.field116 = 127;
                    }
                    super.field141 = arg0.method1918((byte) 104);
                    super.field135 = arg0.method1918((byte) 75);
                    if (super.field135 > 127) {
                        super.field135 = 127;
                    }
                    if (~var3 <= -2) {
                        super.field132 = arg0.method1868(0);
                        super.field127 = arg0.method1868(0);
                    }
                    if (var3 >= 3 && ~var3 > -7) {
                        arg0.method1918((byte) -43);
                    }
                    if (~var3 <= -5) {
                        int var5 = arg0.method1918((byte) -95);
                        if (~var5 > -1 || ~var5 < -3) {
                            var5 = 0;
                        }
                        if (~class445.field6538 > -97) {
                            var5 = 0;
                        }
                        class112.method830(var5, (byte) -111);
                    }
                    if (~var3 <= -6) {
                        super.field140 = arg0.method1870(-1945262512);
                    }
                    int var6 = -78 % ((20 - arg1) / 58);
                    int var7 = 0;
                    if (var3 >= 6) {
                        super.field124 = var7 = arg0.method1918((byte) -122);
                    }
                    if (~super.field124 != -2 && super.field124 != 2) {
                        super.field124 = 2;
                    }
                    if (~var3 <= -8) {
                        super.field122 = ~arg0.method1918((byte) 71) == -2;
                    }
                    if (var3 >= 8) {
                        super.field150 = ~arg0.method1918((byte) -69) == -2;
                    }
                    if (~var3 <= -10) {
                        super.field109 = arg0.method1918((byte) -57);
                    }
                    if (super.field109 < 0 || super.field109 > class254.method1614(2794, class445.field6538)) {
                        super.field109 = 0;
                    }
                    if (~var3 <= -11) {
                        super.field130 = ~arg0.method1918((byte) -71) != -1;
                    }
                    if (var3 >= 11) {
                        super.field145 = arg0.method1918((byte) -128) != 0;
                    }
                    if (~var3 <= -13) {
                        super.field113 = arg0.method1918((byte) -44);
                    }
                    if (super.field113 < 0 || ~super.field113 < -3) {
                        super.field113 = 1;
                    }
                    if (var3 >= 13) {
                        super.field134 = arg0.method1918((byte) -46) == 1;
                    }
                    if (~var3 <= -15) {
                        super.field143 = arg0.method1918((byte) -85);
                    } else if (var7 != 0) {
                        super.field143 = 1;
                    } else {
                        super.field143 = 2;
                    }
                    if (super.field143 < 0 || ~super.field143 < -4) {
                        super.field143 = 2;
                    }
                    if (~var3 <= -16) {
                        super.field139 = arg0.method1918((byte) 91);
                        if (~super.field139 > -1 || super.field139 > 4) {
                            super.field139 = class23.field418 != 1 ? 4 : 2;
                        }
                    }
                    if (var3 >= 16) {
                        super.field144 = arg0.method1918((byte) 97) == 1;
                    }
                    if (var3 < 17 && super.field143 == 0) {
                        super.field143 = 2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(II)Z", line = 264)
    public final boolean method1292(int arg0, int arg1) {
        if (arg1 != -2) {
            this.method1298(-36, 48);
        }
        ++field2779;
        return ~arg0 == -1 && !this.field2780 ? super.field149 : true;
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(B)V", line = 279)
    public static void method1293(byte arg0) {
        field2777 = null;
        int var1 = -31 % ((57 - arg0) / 34);
        field2781 = null;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(II[FIIFIIII)V", line = 289)
    public static final void method1294(int arg0, int arg1, float[] arg2, int arg3, int arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = arg8 - arg7;
        ++field2774;
        int var11 = arg9 - arg1;
        int var12 = arg0 - arg3;
        float var13 = arg2[2] * (float) var10 + arg2[1] * (float) var11 + arg2[0] * (float) var12;
        float var14 = arg2[5] * (float) var10 + arg2[4] * (float) var11 + arg2[3] * (float) var12;
        float var15 = arg2[8] * (float) var10 + arg2[6] * (float) var12 + arg2[7] * (float) var11;
        if (arg6 < 28) {
            field2777 = null;
        }
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = 0.5F + (float) Math.atan2((double) var13, (double) var15) / 6.2831855F;
        float var18 = arg5 + (float) Math.asin((double) (var14 / var16)) / 3.1415927F + 0.5F;
        if (~arg4 != -2) {
            if (~arg4 != -3) {
                if (arg4 == 3) {
                    float var19 = var17;
                    var17 = var18;
                    var18 = -var19;
                }
            } else {
                var17 = -var17;
                var18 = -var18;
            }
        } else {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        }
        class472.field6960 = var17;
        class51.field749 = var18;
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(II)I", line = 340)
    public final int method1295(int arg0, int arg1) {
        if (arg1 != 0) {
            return 96;
        } else {
            ++field2770;
            if (this.field2776) {
                return 0;
            } else if (!this.method1292(arg0, -2)) {
                return 1;
            } else {
                return super.field129 ? 2 : 1;
            }
        }
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(I)Lti;", line = 359)
    public final class303 method1296(int arg0) {
        ++field2775;
        class303 var2 = new class303(41);
        var2.method1923((byte) 62, 17);
        var2.method1923((byte) 62, super.field128);
        var2.method1923((byte) 62, super.field149 ? 1 : 0);
        if (arg0 != 3809) {
            this.field2780 = false;
        }
        var2.method1923((byte) 62, super.field129 ? 1 : 0);
        var2.method1923((byte) 62, !super.field123 ? 0 : 1);
        var2.method1923((byte) 62, !super.field110 ? 0 : 1);
        var2.method1923((byte) 62, 0);
        var2.method1923((byte) 62, super.field133 ? 1 : 0);
        var2.method1923((byte) 62, super.field115 ? 1 : 0);
        var2.method1923((byte) 62, !super.field131 ? 0 : 1);
        var2.method1923((byte) 62, super.field148);
        var2.method1923((byte) 62, super.field151);
        var2.method1923((byte) 62, super.field117 ? 1 : 0);
        var2.method1923((byte) 62, super.field147 ? 1 : 0);
        var2.method1923((byte) 62, super.field136 ? 1 : 0);
        var2.method1923((byte) 62, !super.field153 ? 0 : 1);
        var2.method1923((byte) 62, super.field137);
        var2.method1923((byte) 62, super.field118 ? 1 : 0);
        var2.method1923((byte) 62, super.field116);
        var2.method1923((byte) 62, super.field141);
        var2.method1923((byte) 62, super.field135);
        var2.method1874(super.field132, (byte) -110);
        var2.method1874(super.field127, (byte) -110);
        var2.method1923((byte) 62, class266.method1706(-128));
        var2.method1892(arg0 ^ 397826825, super.field140);
        var2.method1923((byte) 62, super.field124);
        var2.method1923((byte) 62, super.field122 ? 1 : 0);
        var2.method1923((byte) 62, super.field150 ? 1 : 0);
        var2.method1923((byte) 62, super.field109);
        var2.method1923((byte) 62, !super.field130 ? 0 : 1);
        var2.method1923((byte) 62, super.field145 ? 1 : 0);
        var2.method1923((byte) 62, super.field113);
        var2.method1923((byte) 62, super.field134 ? 1 : 0);
        var2.method1923((byte) 62, super.field143);
        var2.method1923((byte) 62, super.field139);
        var2.method1923((byte) 62, !super.field144 ? 0 : 1);
        return var2;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(ZI)V", line = 409)
    public final void method1297(boolean arg0, int arg1) {
        if (arg1 < 39) {
            this.field2780 = true;
        }
        super.field149 = arg0;
        ++field2772;
        if (class246.field3567 != null) {
            class246.field3567.method612((byte) 65, !this.method1292(class399.field5865, -2));
        }
    }

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "(II)Z", line = 429)
    public final boolean method1298(int arg0, int arg1) {
        ++field2773;
        return arg0 != arg1 ? true : super.field149;
    }

    @OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(Lci;)V", line = 492)
    public class187(class312 arg0) {
        super.field128 = 3;
        this.method1297(true, 70);
        super.field151 = 0;
        super.field115 = true;
        super.field137 = 0;
        super.field148 = 2;
        super.field132 = 0;
        super.field141 = 255;
        super.field129 = true;
        super.field113 = 1;
        super.field147 = false;
        super.field135 = 127;
        super.field131 = true;
        super.field117 = true;
        super.field116 = 127;
        super.field127 = 0;
        super.field118 = true;
        super.field153 = true;
        super.field123 = true;
        super.field110 = true;
        super.field133 = true;
        super.field142 = 0;
        super.field136 = true;
        if (class445.field6538 < 96) {
            class112.method830(0, (byte) -111);
        } else {
            class112.method830(2, (byte) -111);
        }
        super.field130 = false;
        super.field109 = 0;
        super.field145 = true;
        super.field139 = ~class23.field418 != -2 ? 4 : 2;
        super.field150 = false;
        super.field140 = 0;
        super.field134 = true;
        super.field143 = 2;
        super.field122 = false;
        super.field124 = 2;
        class137 var2 = null;
        try {
            class100 var3 = arg0.method1967(12619, "");
            while (~var3.field1604 == -1) {
                class185.method1285(125, 1L);
            }
            if (~var3.field1604 == -2) {
                var2 = (class137) var3.field1608;
                byte[] var4 = new byte[(int) var2.method1014(false)];
                int var6;
                for (int var5 = 0; ~var5 > ~var4.length; var5 += var6) {
                    var6 = var2.method1013(var4, var5, (byte) 114, var4.length + -var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                this.method1291(new class303(var4), (byte) 100);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method1011(7734);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(BLci;)V", line = 449)
    public final void method1299(byte arg0, class312 arg1) {
        ++field2778;
        class137 var3 = null;
        try {
            class100 var4 = arg1.method1967(12619, "");
            while (~var4.field1604 == -1) {
                class185.method1285(120, 1L);
            }
            if (arg0 < 97) {
                this.method1299((byte) -101, (class312) null);
            }
            if (~var4.field1604 == -2) {
                var3 = (class137) var4.field1608;
                class303 var5 = this.method1296(3809);
                var3.method1009(var5.field4326, 24238, var5.field4333, 0);
            }
        } catch (Exception var7) {
        }
        try {
            if (var3 != null) {
                var3.method1011(7734);
            }
        } catch (Exception var6) {
        }
    }
}
