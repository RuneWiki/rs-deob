import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class249 {

    @OriginalMember(owner = "client!af", name = "g", descriptor = "F")
    public float field3378 = 0.25F;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "F")
    public float field3374 = 1.0F;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "F")
    public float field3387 = 1.0F;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public int field3373;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "I")
    public int field3390;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    public int field3384;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "F")
    public float field3391;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "Lbd;")
    public class38 field3381;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "F")
    public float field3389;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "F")
    public float field3375;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public int field3382;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    public int field3386;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "I")
    public int field3388;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "Lae;")
    public static class135 field3379 = new class135(5000);

    @OriginalMember(owner = "client!af", name = "v", descriptor = "I")
    public static int field3393 = 0;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!af", name = "u", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!af", name = "w", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!af", name = "x", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V", line = 6)
    public static final void method1561(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field3383++;
        if (class392.field5734 == 0) {
            return;
        }
        try {
            if (++class10.field120 > 2000) {
                if (class330.field4719 != null) {
                    class330.field4719.method1503(false);
                    class330.field4719 = null;
                }
                if (class75.field841 >= 1) {
                    class430.field6238 = -5;
                    class392.field5734 = 0;
                    return;
                }
                class10.field120 = 0;
                if (class375.field5469 == field3394) {
                    class375.field5469 = class2.field23;
                } else {
                    class375.field5469 = field3394;
                }
                class75.field841++;
                class392.field5734 = 1;
            }
            if (class392.field5734 == 1) {
                class103.field1176 = class323.field4554.method2380(class375.field5469, -62, class85.field950);
                class392.field5734 = 2;
            }
            if (class392.field5734 == 2) {
                if (class103.field1176.field3268 == 2) {
                    throw new IOException();
                }
                if (class103.field1176.field3268 != 1) {
                    return;
                }
                class330.field4719 = new class236((Socket) class103.field1176.field3270, class323.field4554);
                class103.field1176 = null;
                class330.field4719.method1511(class169.field2360.field2888, arg0 + 28067, 0, class169.field2360.field2867);
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
                if (var1 != 21) {
                    class430.field6238 = var1;
                    class392.field5734 = 0;
                    class330.field4719.method1503(false);
                    class330.field4719 = null;
                    return;
                }
                class392.field5734 = 3;
            }
            if (class392.field5734 == 3) {
                if (class330.field4719.method1508((byte) 109) < 1) {
                    return;
                }
                class43.field532 = new String[class330.field4719.method1509((byte) 26)];
                class392.field5734 = 4;
            }
            if (class392.field5734 == 4 && class330.field4719.method1508((byte) 97) >= class43.field532.length * 8) {
                field3379.field2888 = 0;
                class330.field4719.method1502(field3379.field2867, -1, class43.field532.length * 8, 0);
                for (int var2 = 0; var2 < class43.field532.length; var2++) {
                    class43.field532[var2] = class335.method2160(field3379.method1394(true), 111);
                }
                class430.field6238 = 21;
                class392.field5734 = 0;
                class330.field4719.method1503(false);
                class330.field4719 = null;
            }
        } catch (IOException var3) {
            if (class330.field4719 != null) {
                class330.field4719.method1503(false);
                class330.field4719 = null;
            }
            if (class75.field841 < 1) {
                class10.field120 = 0;
                class75.field841++;
                if (class375.field5469 == field3394) {
                    class375.field5469 = class2.field23;
                } else {
                    class375.field5469 = field3394;
                }
                class392.field5734 = 1;
            } else {
                class430.field6238 = -4;
                class392.field5734 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([SB)[S", line = 166)
    public static final short[] method1562(short[] arg0, byte arg1) {
        field3380++;
        if (arg0 == null) {
            return null;
        }
        short[] var2 = new short[arg0.length];
        class408.method2568(arg0, 0, var2, 0, arg0.length);
        if (arg1 != -8) {
            method1564(-102, -54, -103, 112, -3, 113, -36, 125);
        }
        return var2;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V", line = 189)
    public static void method1563(int arg0) {
        if (arg0 >= 122) {
            field3379 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V", line = 247)
    public class249() {
        this.field3373 = -50;
        this.field3390 = -50;
        this.field3384 = 0;
        this.field3391 = 1.2F;
        this.field3381 = class102.field1152;
        this.field3389 = 1.1523438F;
        this.field3375 = 0.69921875F;
        this.field3382 = class158.field2243;
        this.field3386 = class217.field2978;
        this.field3388 = -60;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lbk;)V", line = 276)
    public class249(class211 arg0) {
        int var2 = arg0.method1342((byte) -126);
        if (class216.field2943 && class257.field3504.method994() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field3382 = class158.field2243;
            } else {
                this.field3382 = arg0.method1336((byte) -120);
            }
            if ((var2 & 0x2) == 0) {
                this.field3389 = 1.1523438F;
            } else {
                this.field3389 = (float) arg0.method1355(32136) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field3375 = 0.69921875F;
            } else {
                this.field3375 = (float) arg0.method1355(32136) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field3391 = 1.2F;
            } else {
                this.field3391 = (float) arg0.method1355(32136) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method1336((byte) -58);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method1355(32136);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method1355(32136);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method1355(32136);
            }
            this.field3375 = 0.69921875F;
            this.field3391 = 1.2F;
            this.field3389 = 1.1523438F;
            this.field3382 = class158.field2243;
        }
        if ((var2 & 0x10) == 0) {
            this.field3388 = -60;
            this.field3390 = -50;
            this.field3373 = -50;
        } else {
            this.field3390 = arg0.method1344((byte) -4);
            this.field3388 = arg0.method1344((byte) -4);
            this.field3373 = arg0.method1344((byte) -4);
        }
        if ((var2 & 0x20) == 0) {
            this.field3386 = class217.field2978;
        } else {
            this.field3386 = arg0.method1336((byte) -68);
        }
        if ((var2 & 0x40) == 0) {
            this.field3384 = 0;
        } else {
            this.field3384 = arg0.method1355(32136);
        }
        if ((var2 & 0x80) == 0) {
            this.field3381 = class102.field1152;
        } else {
            this.field3381 = class335.method2166(arg0.method1355(32136), true, arg0.method1355(32136), arg0.method1355(32136), arg0.method1355(32136), arg0.method1355(32136), arg0.method1355(32136));
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIIII)V", line = 212)
    public static final void method1564(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3372++;
        int var8 = 99 % ((arg0 - 50) / 57);
        class55.method321(arg2, arg6, arg4, arg5, arg1, 0, arg3, arg7, (byte) 116);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILaf;)Z", line = 226)
    public final boolean method1565(int arg0, class249 arg1) {
        if (arg0 == -6409) {
            field3385++;
            return this.field3382 == arg1.field3382 && this.field3389 == arg1.field3389 && this.field3375 == arg1.field3375 && this.field3391 == arg1.field3391 && this.field3378 == arg1.field3378 && this.field3374 == arg1.field3374 && this.field3387 == arg1.field3387 && this.field3386 == arg1.field3386 && this.field3384 == arg1.field3384 && this.field3381 == arg1.field3381;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lbk;I)V", line = 265)
    public final void method1566(class211 arg0, int arg1) {
        this.field3374 = (float) (arg0.method1342((byte) -128) * 8) / 255.0F;
        field3377++;
        int var3 = 5 / ((-arg1 - 61) / 36);
        this.field3378 = (float) (arg0.method1342((byte) -128) * 8) / 255.0F;
        this.field3387 = (float) (arg0.method1342((byte) -127) * 8) / 255.0F;
    }
}
