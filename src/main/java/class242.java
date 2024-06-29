import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class242 extends class105 {

    @OriginalMember(owner = "client!ij", name = "J", descriptor = "[I")
    private int[] field3285 = new int[this.field1182];

    @OriginalMember(owner = "client!ij", name = "u", descriptor = "Z")
    public static boolean field3271 = false;

    @OriginalMember(owner = "client!ij", name = "v", descriptor = "I")
    private int field3272;

    @OriginalMember(owner = "client!ij", name = "w", descriptor = "I")
    private int field3273;

    @OriginalMember(owner = "client!ij", name = "x", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!ij", name = "y", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!ij", name = "z", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!ij", name = "B", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!ij", name = "C", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!ij", name = "D", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!ij", name = "E", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!ij", name = "F", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!ij", name = "G", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!ij", name = "H", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!ij", name = "I", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!ij", name = "L", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!ij", name = "K", descriptor = "[B")
    private byte[] field3286;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)V", line = 4)
    public static final void method1533(int arg0) {
        class26.field254.method2052(0);
        int var1 = 2 % ((arg0 - -44) / 39);
        ++field3278;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)V", line = 18)
    public static final void method1534(int arg0, int arg1) {
        ++field3279;
        if (arg1 != -1) {
            if (class45.field542[arg1]) {
                class172.field2401.method327((byte) -89, arg1);
                if (class224.field3054[arg1] != null) {
                    if (arg0 < 41) {
                        method1533(5);
                    }
                    boolean var2 = true;
                    for (int var3 = 0; var3 < class224.field3054[arg1].length; ++var3) {
                        if (class224.field3054[arg1][var3] != null) {
                            if (class224.field3054[arg1][var3].field1535 == 2) {
                                var2 = false;
                            } else {
                                class224.field3054[arg1][var3] = null;
                            }
                        }
                    }
                    if (var2) {
                        class224.field3054[arg1] = null;
                    }
                    class45.field542[arg1] = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIB)V", line = 65)
    public final void method570(int arg0, int arg1, byte arg2) {
        if (arg2 > -66) {
            this.field3285 = null;
        }
        ++field3274;
        this.field3272 += this.field3285[arg0] * arg1 >> 12;
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(IIIIIF)V", line = 77)
    public class242(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~var7 > ~super.field1182; ++var7) {
            this.field3285[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "(I)V", line = 96)
    public static final void method1535(int arg0) {
        ++field3287;
        if (~class351.field5127 != -1) {
            try {
                if (~(++class386.field5654) < -1501) {
                    if (class330.field4719 != null) {
                        class330.field4719.method1503(false);
                        class330.field4719 = null;
                    }
                    if (class78.field883 >= 1) {
                        class159.field2251 = -5;
                        class351.field5127 = 0;
                        return;
                    }
                    class351.field5127 = 1;
                    ++class78.field883;
                    if (~class422.field6065 != ~class341.field5020) {
                        class422.field6065 = class341.field5020;
                    } else {
                        class422.field6065 = class300.field4275;
                    }
                    class386.field5654 = 0;
                }
                if (~class351.field5127 == -2) {
                    class103.field1176 = class323.field4554.method2380(class422.field6065, -51, class118.field1397);
                    class351.field5127 = 2;
                }
                if (arg0 == -102) {
                    if (class351.field5127 == 2) {
                        if (class103.field1176.field3268 == 2) {
                            throw new IOException();
                        }
                        if (~class103.field1176.field3268 != -2) {
                            return;
                        }
                        class330.field4719 = new class236((Socket) class103.field1176.field3270, class323.field4554);
                        class103.field1176 = null;
                        class330.field4719.method1511(class169.field2360.field2888, 28067, 0, class169.field2360.field2867);
                        if (class225.field3064 != null) {
                            class225.field3064.method1861((byte) -51);
                        }
                        if (class444.field6488 != null) {
                            class444.field6488.method1861((byte) -51);
                        }
                        int var1 = class330.field4719.method1509((byte) 26);
                        if (class225.field3064 != null) {
                            class225.field3064.method1861((byte) -51);
                        }
                        if (class444.field6488 != null) {
                            class444.field6488.method1861((byte) -51);
                        }
                        if (~var1 != -102) {
                            class159.field2251 = var1;
                            class351.field5127 = 0;
                            class330.field4719.method1503(false);
                            class330.field4719 = null;
                            return;
                        }
                        class351.field5127 = 3;
                    }
                    if (~class351.field5127 == -4) {
                        if (class330.field4719.method1508((byte) -27) >= 2) {
                            int var2 = class330.field4719.method1509((byte) 26) << 8 | class330.field4719.method1509((byte) 26);
                            class198.method1266(-8868, var2);
                            if (class23.field229 == -1) {
                                class351.field5127 = 0;
                                class159.field2251 = 6;
                                class330.field4719.method1503(false);
                                class330.field4719 = null;
                            } else {
                                class351.field5127 = 0;
                                class330.field4719.method1503(false);
                                class330.field4719 = null;
                                class329.method2037(0);
                            }
                        }
                    }
                }
            } catch (IOException var3) {
                if (class330.field4719 != null) {
                    class330.field4719.method1503(false);
                    class330.field4719 = null;
                }
                if (~class78.field883 <= -2) {
                    class351.field5127 = 0;
                    class159.field2251 = -4;
                } else {
                    ++class78.field883;
                    class351.field5127 = 1;
                    if (~class422.field6065 == ~class341.field5020) {
                        class422.field6065 = class300.field4275;
                    } else {
                        class422.field6065 = class341.field5020;
                    }
                    class386.field5654 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)V", line = 246)
    public final void method572(int arg0) {
        ++field3281;
        this.field3272 = Math.abs(this.field3272);
        if (arg0 >= 42) {
            if (this.field3272 >= 4096) {
                this.field3272 = 4095;
            }
            this.method1471(this.field3273++, (byte) (this.field3272 >> 4));
            this.field3272 = 0;
        }
    }

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "(I)V", line = 264)
    public static final void method1536(int arg0) {
        class450.field6562 = class358.method2279(4, 2048, 8, true, 0.4F, false, 35, 8);
        if (arg0 == -14747) {
            ++field3282;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V", line = 285)
    public final void method568(int arg0) {
        ++field3283;
        if (arg0 != 82) {
            field3277 = 119;
        }
        this.field3273 = 0;
        this.field3272 = 0;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IB)V", line = 297)
    public void method1471(int arg0, byte arg1) {
        this.field3286[this.field3273++] = (byte) ((class40.method253(arg1, 255) >> 1) + 127);
        ++field3275;
    }
}
