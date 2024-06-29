import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class32 extends class114 {

    @OriginalMember(owner = "client!vg", name = "Q", descriptor = "I")
    private int field478 = 4096;

    @OriginalMember(owner = "client!vg", name = "S", descriptor = "I")
    private int field480 = 0;

    @OriginalMember(owner = "client!vg", name = "R", descriptor = "Ljava/lang/String;")
    public static String field479 = "skill: ";

    @OriginalMember(owner = "client!vg", name = "P", descriptor = "Llm;")
    public static class150 field477 = new class150(100);

    @OriginalMember(owner = "client!vg", name = "F", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!vg", name = "N", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!vg", name = "O", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!vg", name = "T", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!vg", name = "U", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(Z)V")
    public static final void method198(boolean arg0) {
        if (arg0) {
            class251.field3923.method948((byte) 58);
            ++field475;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lbj;II)V")
    public final void method13(class215 arg0, int arg1, int arg2) {
        if (arg2 != 12953) {
            field479 = null;
        }
        ++field481;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field1648 = ~arg0.method1374((byte) -60) == -2;
                }
            } else {
                this.field478 = arg0.method1379(-105);
            }
        } else {
            this.field480 = arg0.method1379(-87);
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V")
    public class32() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BI)[[I")
    public final int[][] method73(byte arg0, int arg1) {
        ++field482;
        if (arg0 != -112) {
            this.field480 = 25;
        }
        int[][] var3 = super.field1627.method104(arg1, (byte) 120);
        if (super.field1627.field280) {
            int[][] var4 = this.method727(0, arg1, 842);
            int[] var5 = var4[0];
            int[] var6 = var3[0];
            int[] var7 = var4[1];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var4[2];
            for (int var11 = 0; ~class145.field2009 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var10[var11];
                if (~this.field480 < ~var12) {
                    var6[var11] = this.field480;
                } else if (var12 > this.field478) {
                    var6[var11] = this.field478;
                } else {
                    var6[var11] = var12;
                }
                if (var13 >= this.field480) {
                    if (var13 <= this.field478) {
                        var8[var11] = var13;
                    } else {
                        var8[var11] = this.field478;
                    }
                } else {
                    var8[var11] = this.field480;
                }
                if (~var14 > ~this.field480) {
                    var9[var11] = this.field480;
                } else if (this.field478 >= var14) {
                    var9[var11] = var14;
                } else {
                    var9[var11] = this.field478;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZ)[I")
    public final int[] method16(int arg0, boolean arg1) {
        ++field476;
        if (arg1) {
            method200(92);
        }
        int[] var3 = super.field1630.method302(arg0, -110);
        if (super.field1630.field710) {
            int[] var4 = this.method729(arg0, 0, 0);
            for (int var5 = 0; ~class145.field2009 < ~var5; ++var5) {
                int var6 = var4[var5];
                if (~this.field480 < ~var6) {
                    var3[var5] = this.field480;
                } else if (~var6 >= ~this.field478) {
                    var3[var5] = var6;
                } else {
                    var3[var5] = this.field478;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(II)I")
    public static int method199(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "(I)V")
    public static void method200(int arg0) {
        field479 = null;
        field477 = null;
        if (arg0 >= -90) {
            field477 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lbj;B)V")
    public static final void method201(class215 arg0, byte arg1) {
        ++field474;
        if (~(arg0.field3287.length + -arg0.field3280) <= -2) {
            int var2 = arg0.method1374((byte) -60);
            if (var2 >= 0 && ~var2 >= -12) {
                byte var3;
                if (~var2 != -12) {
                    if (var2 == 10) {
                        var3 = 32;
                    } else if (var2 == 9) {
                        var3 = 31;
                    } else if (var2 == 8) {
                        var3 = 30;
                    } else if (~var2 != -8) {
                        if (var2 != 6) {
                            if (~var2 != -6) {
                                if (var2 != 4) {
                                    if (var2 != 3) {
                                        if (var2 == 2) {
                                            var3 = 22;
                                        } else if (~var2 == -2) {
                                            var3 = 23;
                                        } else {
                                            var3 = 19;
                                        }
                                    } else {
                                        var3 = 23;
                                    }
                                } else {
                                    var3 = 24;
                                }
                            } else {
                                var3 = 28;
                            }
                        } else {
                            var3 = 28;
                        }
                    } else {
                        var3 = 29;
                    }
                } else {
                    var3 = 33;
                }
                if (~(arg0.field3287.length + -arg0.field3280) <= ~var3) {
                    class270.field4310 = arg0.method1374((byte) -60);
                    if (~class270.field4310 > -2) {
                        class270.field4310 = 1;
                    } else if (class270.field4310 > 4) {
                        class270.field4310 = 4;
                    }
                    class150.method949((byte) 84, ~arg0.method1374((byte) -60) == -2);
                    class281.field4464 = ~arg0.method1374((byte) -60) == -2;
                    class38.field583 = arg0.method1374((byte) -60) == 1;
                    class116.field1677 = arg0.method1374((byte) -60) == 1;
                    class288.field4598 = ~arg0.method1374((byte) -60) == -2;
                    class103.field1483 = ~arg0.method1374((byte) -60) == -2;
                    class78.field1087 = arg0.method1374((byte) -60) == 1;
                    class68.field959 = arg0.method1374((byte) -60) == 1;
                    class56.field782 = arg0.method1374((byte) -60);
                    if (~class56.field782 < -3) {
                        class56.field782 = 2;
                    }
                    if (var2 >= 2) {
                        class202.field3054 = ~arg0.method1374((byte) -60) == -2;
                    } else {
                        class202.field3054 = arg0.method1374((byte) -60) == 1;
                        arg0.method1374((byte) -60);
                    }
                    class314.field5048 = ~arg0.method1374((byte) -60) == -2;
                    class108.field1548 = ~arg0.method1374((byte) -60) == -2;
                    class181.field2741 = arg0.method1374((byte) -60);
                    if (~class181.field2741 < -3) {
                        class181.field2741 = 2;
                    }
                    class179.field2716 = class181.field2741;
                    class37.field570 = ~arg0.method1374((byte) -60) == -2;
                    class221.field3440 = arg0.method1374((byte) -60);
                    if (~class221.field3440 < -128) {
                        class221.field3440 = 127;
                    }
                    class51.field716 = arg0.method1374((byte) -60);
                    class209.field3110 = arg0.method1374((byte) -60);
                    if (arg1 != -14) {
                        field479 = null;
                    }
                    if (class209.field3110 > 127) {
                        class209.field3110 = 127;
                    }
                    if (~var2 <= -2) {
                        class71.field1033 = arg0.method1379(arg1 + -88);
                        class59.field818 = arg0.method1379(-116);
                    }
                    if (var2 >= 3 && ~var2 > -7) {
                        arg0.method1374((byte) -60);
                    }
                    if (var2 >= 4) {
                        int var4 = arg0.method1374((byte) -60);
                        if (class42.field632 < 96) {
                            var4 = 0;
                        }
                        class220.method1445(var4);
                    }
                    if (var2 >= 5) {
                        class71.field1028 = arg0.method1383((byte) -76);
                    }
                    if (var2 >= 6) {
                        class288.field4610 = arg0.method1374((byte) -60);
                    }
                    if (var2 >= 7) {
                        class223.field3483 = ~arg0.method1374((byte) -60) == -2;
                    }
                    if (~var2 <= -9) {
                        class78.field1085 = arg0.method1374((byte) -60) == 1;
                    }
                    if (var2 >= 9) {
                        class221.field3441 = arg0.method1374((byte) -60);
                    }
                    if (var2 >= 10) {
                        class139.field1929 = ~arg0.method1374((byte) -60) != -1;
                    }
                    if (~var2 <= -12) {
                        class175.field2470 = arg0.method1374((byte) -60) != 0;
                    }
                }
            }
        }
    }
}
