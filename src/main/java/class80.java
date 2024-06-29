import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class80 extends class359 {

    @OriginalMember(owner = "client!wh", name = "C", descriptor = "[I")
    private int[] field1242 = new int[this.field5055];

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "I")
    private int field1237;

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!wh", name = "B", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!wh", name = "D", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!wh", name = "E", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!wh", name = "F", descriptor = "I")
    private int field1245;

    @OriginalMember(owner = "client!wh", name = "G", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!wh", name = "A", descriptor = "[B")
    private byte[] field1240;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZLkq;)V", line = 6)
    public static final void method568(boolean arg0, class351 arg1) {
        class326.field4453 = 3;
        ++field1236;
        class141.method962(97, true);
        class72.field1114 = true;
        class276.field3750 = 255;
        class21.field280 = true;
        class267.field3639 = true;
        class427.field6127 = true;
        class406.field5895 = 127;
        class412.field5977 = true;
        class231.field3098 = true;
        class410.field5960 = 0;
        class410.field5956 = 2;
        class308.field4227 = 0;
        class396.field5788 = 127;
        class57.field813 = true;
        class67.field1056 = 0;
        class29.field457 = 0;
        class406.field5904 = true;
        class207.field2795 = 1;
        class366.field5126 = true;
        class313.field4316 = true;
        if (~class275.field3730 <= -97) {
            class132.method901(-32190, 2);
        } else {
            class132.method901(-32190, 0);
        }
        class48.field732 = true;
        class10.field147 = true;
        class28.field448 = 2;
        class152.field2153 = 2;
        class188.field2609 = arg0;
        class198.field2742 = false;
        class323.field4428 = 0;
        class233.field3156 = false;
        class129.field1800 = 0;
        class253 var2 = null;
        try {
            class295 var3 = arg1.method2240(0);
            while (var3.field4068 == 0) {
                class4.method28(1L, -121);
            }
            if (var3.field4068 == 1) {
                var2 = (class253) var3.field4070;
                byte[] var4 = new byte[(int) var2.method1559(-6067)];
                int var6;
                for (int var5 = 0; var4.length > var5; var5 += var6) {
                    var6 = var2.method1561(var4, var5, 65, var4.length - var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class436.method2728(-2, new class371(var4));
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method1562(-8060);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BII)V", line = 89)
    public final void method569(byte arg0, int arg1, int arg2) {
        ++field1239;
        this.field1245 += this.field1242[arg1] * arg2 >> 12;
        int var4 = -73 % ((-84 - arg0) / 38);
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)V", line = 110)
    public final void method570(int arg0) {
        if (arg0 == -2) {
            this.field1245 = 0;
            this.field1237 = 0;
            ++field1238;
        }
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)V", line = 123)
    public final void method571(int arg0) {
        ++field1234;
        this.field1245 = Math.abs(this.field1245);
        if (~this.field1245 <= -4097) {
            this.field1245 = 4095;
        }
        if (arg0 != 5215) {
            this.field1240 = null;
        }
        this.method572(this.field1237++, (byte) (this.field1245 >> 4));
        this.field1245 = 0;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)V", line = 140)
    public void method572(int arg0, byte arg1) {
        this.field1240[this.field1237++] = (byte) ((class318.method2028(arg1, 255) >> 1) + 127);
        ++field1241;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIZIIB)V", line = 148)
    public static final void method573(int arg0, int arg1, boolean arg2, int arg3, int arg4, byte arg5) {
        ++field1244;
        if (class5.field79 == null) {
            class408.field5920.method1762(arg1, arg4, arg3, -16777216, arg0, -1);
        } else {
            ++class64.field991;
            if (class307.field4211 != null && ~(class307.field4211.field6197 + -((-1 + class307.field4211.method410((byte) 118)) * 64) >> 7) == ~class394.field5764 && ~(class307.field4211.field6192 + -(class307.field4211.method410((byte) 48) * 64) + 64 >> 7) == ~class184.field2575) {
                class184.field2575 = -1;
                class394.field5764 = -1;
                class77.method548(66);
            }
            class225.method1429((byte) 81);
            if (!arg2) {
                class63.method425(-120);
            }
            class349.method2232((byte) 100);
            class170.method1145(arg0, arg1, true, arg3, arg4, 0);
            int var6 = class290.field4003;
            int var7 = class9.field141;
            int var8 = class16.field195;
            int var9 = class105.field1574;
            if (class123.field1731 != 1) {
                if (class123.field1731 == 4) {
                    int var10 = (int) class140.field2007;
                    if (class279.field3827 >> 8 > var10) {
                        var10 = class279.field3827 >> 8;
                    }
                    if (class5.field83[4] && var10 < class222.field2989[4] + 128) {
                        var10 = class222.field2989[4] - -128;
                    }
                    int var11 = (int) class6.field98 & 16383;
                    class199.method1328(var10, -50 + class279.method1698(class164.field2311, class120.field1714, class265.field3617, (byte) 3), var8, var11, class123.field1729, (var10 >> 3) * 3 + 600, arg5 + -2, class290.field4007);
                } else if (class123.field1731 == 5) {
                    class296.method1895(var8, 4);
                }
            } else {
                int var12 = (int) class140.field2007;
                if (~(class279.field3827 >> 8) < ~var12) {
                    var12 = class279.field3827 >> 8;
                }
                if (class5.field83[4] && ~(class222.field2989[4] + 128) < ~var12) {
                    var12 = class222.field2989[4] + 128;
                }
                int var13 = 16383 & (int) class6.field98 - -class337.field4598;
                class199.method1328(var12, -50 + class279.method1698(class307.field4211.field6197, class307.field4211.field6192, class265.field3617, (byte) 3), var8, var13, class123.field1729, (var12 >> 3) * 3 + 600, 100, class290.field4007);
            }
            int var14 = class368.field5158;
            int var15 = class34.field528;
            int var16 = class336.field4561;
            int var17 = class356.field5020;
            int var18 = class244.field3377;
            if (arg5 != 102) {
                method568(false, (class351) null);
            }
            for (int var19 = 0; var19 < 5; ++var19) {
                if (class5.field83[var19]) {
                    int var22 = (int) ((double) (class412.field5985[var19] * 2 + 1) * Math.random() - (double) class412.field5985[var19] + Math.sin((double) class294.field4063[var19] / 100.0D * (double) class261.field3572[var19]) * (double) class222.field2989[var19]);
                    if (var19 == 1) {
                        class34.field528 += var22;
                    }
                    if (var19 == 4) {
                        class356.field5020 += var22;
                        if (~class356.field5020 <= -1025) {
                            if (~class356.field5020 < -3073) {
                                class356.field5020 = 3072;
                            }
                        } else {
                            class356.field5020 = 1024;
                        }
                    }
                    if (~var19 == -1) {
                        class368.field5158 += var22;
                    }
                    if (~var19 == -4) {
                        class244.field3377 = class244.field3377 + var22 & 16383;
                    }
                    if (~var19 == -3) {
                        class336.field4561 += var22;
                    }
                }
            }
            if (class368.field5158 < 0) {
                class368.field5158 = 0;
            }
            if (~((class386.field5629 << 7) + -1) > ~class368.field5158) {
                class368.field5158 = (class386.field5629 << 7) + -1;
            }
            if (class336.field4561 < 0) {
                class336.field4561 = 0;
            }
            if (class336.field4561 > (class371.field5311 << 7) + -1) {
                class336.field4561 = (class371.field5311 << 7) + -1;
            }
            class258.method1586(-3058);
            class382.method2491(9);
            class408.field5920.method1735(var6, var9, var6 - -var7, var8 + var9);
            class408.field5920.method1779();
            int var20 = class262.field3577;
            if (class66.field1040 != null) {
                class66.field1040.method998(class408.field5920, var6, arg5 ^ 102, var7, class356.field5020, class23.field305 << 3, var8, var9, var20, class244.field3377);
            } else {
                class408.field5920.method1794(var20);
            }
            class154.method1038(arg5 ^ 102);
            class220.field2893.method887(class368.field5158, class34.field528, class336.field4561, -class356.field5020 & 16383, -class244.field3377 & 16383, -class189.field2623 & 16383);
            class408.field5920.method1724(class220.field2893);
            class408.field5920.method1763(var7 / 2 + var6, var8 / 2 + var9, class28.field453 << 1, class28.field453 << 1);
            class436.method2730(class28.field453 << 1, class28.field453 << 1, (byte) -113, var8 / 2 + var9, var7 / 2 + var6);
            class77.method546(16383 & -class189.field2623, class34.field528, 16383 & -class244.field3377, class368.field5158, class336.field4561, 16383 & -class356.field5020, -7502);
            byte var21 = class383.method2501(arg5 ^ 1486) == 2 ? (byte) class64.field991 : 1;
            class190.method1260(class408.field5920, class35.field541, class5.field84, class220.field2893, class368.field5158, class34.field528, class336.field4561, class8.field123, class434.field6233, class431.field6199, class326.field4457, class333.field4506, class163.field2281, class265.field3617 - -1, var21, class307.field4211.field6197 >> 7, class307.field4211.field6192 >> 7, !class366.field5126);
            class154.method1038(0);
            if (class79.field1220 == 30) {
                class194.method1290(256, var8, 256, var7, var9, -765, var6);
                class451.method2821(var8, var6, 20, 256, 256, var7, var9);
                class382.method2490(var6, var9, var8, (byte) -97, var7, 256, 256);
                class210.method1365(var8, var9, var7, var6, (byte) -50);
            }
            class48.method340();
            class356.field5020 = var17;
            class336.field4561 = var16;
            class244.field3377 = var18;
            class34.field528 = var15;
            class368.field5158 = var14;
            if (class423.field6070 && class296.field4115.method2192((byte) -109) == 0) {
                class423.field6070 = false;
            }
            if (class423.field6070) {
                class408.field5920.method1762(var9, var8, var6, -16777216, var7, -1);
                class176.method1176(class75.field1163, false, false, class216.field2867);
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(IIIIIF)V", line = 334)
    public class80(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; super.field5055 > var7; ++var7) {
            this.field1242[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "(I)V", line = 351)
    public static final void method574(int arg0) {
        ++field1243;
        int var1 = 0;
        if (arg0 != 3326) {
            method568(false, (class351) null);
        }
        while (~class54.field795 < ~var1) {
            int var2 = class243.field3364[var1];
            class354 var3 = class12.field153[var2];
            int var4 = class393.field5747.method2429(arg0 ^ 3326);
            if ((2 & var4) != 0) {
                var4 += class393.field5747.method2429(arg0 + -3326) << 8;
            }
            class361.method2327(var3, var4, var2, (byte) 126);
            ++var1;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;", line = 381)
    public static final String[] method575(String[] arg0, int arg1) {
        ++field1246;
        String[] var2 = new String[5];
        for (int var3 = 0; ~var3 > -6; ++var3) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        if (arg1 < 102) {
            method574(109);
        }
        return var2;
    }
}
