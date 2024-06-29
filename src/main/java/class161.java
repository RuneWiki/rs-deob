import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class161 extends class171 {

    @OriginalMember(owner = "client!ro", name = "u", descriptor = "I")
    private int field2152 = 0;

    @OriginalMember(owner = "client!ro", name = "n", descriptor = "Lhaa;")
    private class77 field2145 = new class77();

    @OriginalMember(owner = "client!ro", name = "x", descriptor = "Lqc;")
    public static class325 field2155 = new class325(260);

    @OriginalMember(owner = "client!ro", name = "y", descriptor = "Lwo;")
    public static class408 field2156 = new class408();

    @OriginalMember(owner = "client!ro", name = "A", descriptor = "[Ljava/lang/String;")
    public static String[] field2158 = new String[200];

    @OriginalMember(owner = "client!ro", name = "z", descriptor = "Lud;")
    public static class119 field2157 = new class119();

    @OriginalMember(owner = "client!ro", name = "k", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!ro", name = "l", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!ro", name = "m", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!ro", name = "o", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!ro", name = "p", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!ro", name = "q", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!ro", name = "r", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!ro", name = "s", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!ro", name = "t", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!ro", name = "v", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!ro", name = "w", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!ro", name = "B", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(B)V")
    private final void method934(byte arg0) {
        ++field2148;
        if (arg0 != -88) {
            this.method940((class415) null, (byte) 56);
        }
        int var2 = super.field2318++;
        if (~super.field2318 <= -5001) {
            super.field2318 = 0;
        }
        this.field2152 = super.field2323[var2];
        Object var3 = super.field2326[var2];
        super.field2326[var2] = null;
        if (~this.field2152 == -22) {
            class152.method890(this.field2145, (class415) var3);
        } else if (this.field2152 != 20) {
            if (~this.field2152 <= -31 && this.field2152 <= 33) {
                class139.field1827.method1009(3000.0F, super.field2319[var2] * 1.5F);
                ((class543) var3).method1318(class365.field5254, class613.field8993, class67.field763, class181.field2786, ~(this.field2152 + -30) == -1);
            } else if (~this.field2152 <= -41 && this.field2152 <= 43) {
                class139.field1827.method1009(3000.0F, super.field2319[var2] * 1.5F);
                ((class543) var3).method1318(class365.field5254, class613.field8993, class67.field763, class268.field3982, ~(this.field2152 + -40) == -1);
            } else if (this.field2152 == 22) {
                class139.field1827.method1019(-1, 1583160, 40, 127);
            } else {
                if (this.field2152 != 23) {
                    if (~this.field2152 == -25) {
                        class139.field1827.method1045(0, (class535[]) null);
                        return;
                    }
                } else {
                    class139.field1827.method1034();
                }
            }
        } else {
            class415 var4 = (class415) var3;
            if (var4.field5987 != null) {
                var4.field5987.method166(class139.field1827, true);
            }
            if (var4.field5978 != null) {
                var4.field5978.method166(class139.field1827, true);
            }
            if (var4.field5985 != null) {
                var4.field5985.method166(class139.field1827, true);
            }
            if (var4.field5989 != null) {
                var4.field5989.method166(class139.field1827, true);
            }
            if (var4.field5976 != null) {
                var4.field5976.method166(class139.field1827, true);
            }
            for (class639 var5 = var4.field5981; var5 != null; var5 = var5.field9291) {
                var5.field9288.method166(class139.field1827, true);
            }
        }
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(I)V")
    public final void method935(int arg0) {
        if (arg0 != 5000) {
            this.method938(0.8337799F, 83, 17, false, (class543) null);
        }
        while (super.field2324 != super.field2318) {
            this.method934((byte) -88);
        }
        ++field2154;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V")
    public final void method936(byte arg0) {
        if (arg0 < 93) {
            this.field2145 = null;
        }
        ++field2153;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IZ)V")
    public final void method937(int arg0, boolean arg1) {
        super.field2323[super.field2324] = (byte) arg0;
        ++field2144;
        if (arg1) {
            ++super.field2324;
            if (~super.field2324 <= -5001) {
                super.field2324 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(FIIZLsa;)V")
    public final void method938(float arg0, int arg1, int arg2, boolean arg3, class543 arg4) {
        super.field2323[super.field2324] = (byte) (arg3 ? arg1 + 40 : arg1 + 30);
        ++field2150;
        super.field2326[super.field2324] = arg4;
        if (arg2 != -499625812) {
            this.method937(97, true);
        }
        super.field2319[super.field2324] = arg0;
        ++super.field2324;
        if (super.field2324 >= 5000) {
            super.field2324 = 0;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIIZIIII)V")
    public static final void method939(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field2142;
        if (~arg5 <= -2 && ~arg2 <= -2 && class35.field399 + -2 >= arg5 && class382.field5586 - 2 >= arg2) {
            int var9 = arg8;
            if (~arg8 > -4 && class300.method1855(arg5, arg2, 22753)) {
                var9 = arg8 + 1;
            }
            if (!class94.field1158.method2675(0, class239.field3499) && !class169.method1076(arg5, var9, arg2, -15708, class97.field1205)) {
                return;
            }
            if (class526.field7777 == null) {
                return;
            }
            class288.field4249.method2206(arg7, arg5, class67.field772[arg8], arg8, arg2, 1, class379.field5558);
            if (~arg6 <= -1) {
                boolean var10 = class94.field1158.field268;
                class94.field1158.field268 = true;
                class288.field4249.method2208(class379.field5558, arg2, arg3, arg1, arg5, 0, var9, arg8, arg6, class67.field772[arg8], arg0);
                class94.field1158.field268 = var10;
            }
        }
        if (arg4) {
            field2155 = null;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lsk;B)V")
    public final void method940(class415 arg0, byte arg1) {
        ++field2151;
        int var3 = -127 / ((arg1 - 57) / 47);
        super.field2323[super.field2324] = 20;
        super.field2326[super.field2324] = arg0;
        ++super.field2324;
        if (~super.field2324 <= -5001) {
            super.field2324 = 0;
        }
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(BLsk;)V")
    public final void method941(byte arg0, class415 arg1) {
        super.field2323[super.field2324] = 21;
        ++field2147;
        super.field2326[super.field2324] = arg1;
        if (arg0 <= -122) {
            ++super.field2324;
            if (super.field2324 >= 5000) {
                super.field2324 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(BLsk;)V")
    public final void method942(byte arg0, class415 arg1) {
        if (arg0 > 126) {
            ++field2146;
            --super.field2318;
            if (~super.field2318 > -1) {
                super.field2318 = 4999;
            }
            super.field2323[super.field2318] = 21;
            super.field2326[super.field2318] = arg1;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)V")
    public final void method943(int arg0, int arg1) {
        ++field2143;
        if (arg0 != 1300271884) {
            method945((byte) -109);
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILqa;)V")
    public static final void method944(int arg0, class167 arg1) {
        ++field2149;
        if ((class487.field7385 >= 2 || class369.field5337) && class106.field1333 == null) {
            String var2;
            if (class369.field5337 && class487.field7385 < 2) {
                var2 = class479.field7270 + class449.field6579.method2953(3181, class77.field889) + class323.field4798 + " ->";
            } else if (class154.field1979 && class542.field8105.method1259(true, 81) && ~class487.field7385 < -3) {
                var2 = class105.method606((byte) 66, (class548) class272.field4014.field6029.field7466.field7466);
            } else {
                class548 var3 = (class548) class272.field4014.field6029.field7466;
                var2 = class105.method606((byte) 66, var3);
                int[] var4 = null;
                if (!class647.method3732(var3.field8163, (byte) -80)) {
                    if (var3.field8174 == -1) {
                        if (!class555.method3242(var3.field8163, (byte) 125)) {
                            if (class340.method2113((byte) -82, var3.field8163)) {
                                Object var5 = null;
                                class158 var6;
                                if (~var3.field8163 == -1007) {
                                    var6 = class312.field4690.method2004(false, (int) var3.field8171);
                                } else {
                                    var6 = class312.field4690.method2004(false, (int) (2147483647L & var3.field8171 >>> 32));
                                }
                                if (var6.field2035 != null) {
                                    var6 = var6.method923(arg0 + 7385, class406.field5823);
                                }
                                if (var6 != null) {
                                    var4 = var6.field2104;
                                }
                            }
                        } else {
                            class234 var7 = (class234) class627.field9185.method1333((long) ((int) var3.field8171), false);
                            if (var7 != null) {
                                class383 var8 = var7.field3443;
                                class429 var9 = var8.field5601;
                                if (var9.field6238 != null) {
                                    var9 = var9.method2629(class406.field5823, (byte) 96);
                                }
                                if (var9 != null) {
                                    var4 = var9.field6253;
                                }
                            }
                        }
                    } else {
                        var4 = class216.field3204.method3357(var3.field8174, (byte) -100).field5965;
                    }
                } else {
                    var4 = class216.field3204.method3357((int) var3.field8171, (byte) -115).field5965;
                }
                if (var4 != null) {
                    var2 = var2 + class148.method874(23965, var4);
                }
            }
            if (~class487.field7385 < -3) {
                var2 = var2 + "<col=ffffff> / " + (class487.field7385 + -2) + class252.field3687.method2953(3181, class77.field889);
            }
            if (class158.field2079 != null) {
                class262 var10 = class158.field2079.method1910(arg1, 874312624);
                if (var10 == null) {
                    var10 = class179.field2757;
                }
                var10.method1680(class209.field3086, true, class80.field922, class158.field2079.field4556, class530.field7864, class158.field2079.field4562, class158.field2079.field4557, class158.field2079.field4543, class158.field2079.field4619, class364.field5237, class158.field2079.field4620, class582.field8558, var2, class427.field6112, class465.field6720);
                class598.method3494(class209.field3086[3], class209.field3086[0], (byte) -120, class209.field3086[2], class209.field3086[1]);
            } else if (class76.field885 != null && class490.field7415 == class461.field6666) {
                int var11 = class179.field2757.method1669(var2, class174.field2370 + 4, class465.field6720, 16777215, class427.field6112, -105, 0, class530.field7864, class556.field8252 + 16, class364.field5237);
                class598.method3494(16, class174.field2370 + 4, (byte) -93, class511.field7585.method1053((byte) -124, var2) + var11, class556.field8252);
            }
            if (arg0 != -7509) {
                field2157 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "(B)V")
    public static void method945(byte arg0) {
        field2156 = null;
        field2158 = null;
        field2157 = null;
        int var1 = 33 / ((arg0 - -29) / 37);
        field2155 = null;
    }
}
