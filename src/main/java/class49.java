import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class49 extends class52 {

    @OriginalMember(owner = "client!ee", name = "yb", descriptor = "I")
    private int field1055 = -1;

    @OriginalMember(owner = "client!ee", name = "Ab", descriptor = "Z")
    private volatile boolean field1057 = false;

    @OriginalMember(owner = "client!ee", name = "lb", descriptor = "Z")
    private boolean field1042 = false;

    @OriginalMember(owner = "client!ee", name = "pb", descriptor = "Lb;")
    private class12 field1046;

    @OriginalMember(owner = "client!ee", name = "Db", descriptor = "I")
    private int field1060;

    @OriginalMember(owner = "client!ee", name = "rb", descriptor = "Lb;")
    private class12 field1048;

    @OriginalMember(owner = "client!ee", name = "ob", descriptor = "[S")
    public static short[] field1045 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!ee", name = "wb", descriptor = "I")
    public static int field1053 = 0;

    @OriginalMember(owner = "client!ee", name = "zb", descriptor = "Lqe;")
    public static class179 field1056 = class206.method1380("Musik)2Engine vorbereitet)3", (byte) -126);

    @OriginalMember(owner = "client!ee", name = "ib", descriptor = "Lqe;")
    private static class179 field1039 = class206.method1380("Loading wordpack )2 ", (byte) -126);

    @OriginalMember(owner = "client!ee", name = "Fb", descriptor = "Lqe;")
    public static class179 field1062 = field1039;

    @OriginalMember(owner = "client!ee", name = "Hb", descriptor = "I")
    public static int field1064 = 20;

    @OriginalMember(owner = "client!ee", name = "Eb", descriptor = "Ls;")
    public static class194 field1061 = new class194(64);

    @OriginalMember(owner = "client!ee", name = "hb", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!ee", name = "jb", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!ee", name = "kb", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!ee", name = "mb", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!ee", name = "nb", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!ee", name = "qb", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!ee", name = "sb", descriptor = "I")
    private int field1049;

    @OriginalMember(owner = "client!ee", name = "tb", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!ee", name = "ub", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!ee", name = "xb", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!ee", name = "Bb", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!ee", name = "Cb", descriptor = "I")
    private int field1059;

    @OriginalMember(owner = "client!ee", name = "Gb", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!ee", name = "Ib", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!ee", name = "vb", descriptor = "[Z")
    private volatile boolean[] field1052;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZII)V")
    public final void method321(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            this.field1048 = null;
        }
        ++field1065;
        this.field1059 = arg1;
        this.field1049 = arg2;
        if (this.field1048 != null) {
            class89.method590(true, this, this.field1060, this.field1048);
        } else {
            class207.method1385((byte) 0, true, this.field1060, 255, this.field1059, this, -112);
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(B)V")
    private final void method322(byte arg0) {
        if (arg0 <= 93) {
            this.method325(true, (byte[]) null, 91, true, (byte) -39);
        }
        this.field1052 = new boolean[super.field1117.length];
        for (int var2 = 0; ~var2 > ~this.field1052.length; ++var2) {
            this.field1052[var2] = false;
        }
        ++field1054;
        if (this.field1046 == null) {
            this.field1057 = true;
        } else {
            this.field1055 = -1;
            for (int var3 = 0; this.field1052.length > var3; ++var3) {
                if (~super.field1126[var3] < -1) {
                    class6.method35(this.field1046, var3, 96, this);
                    this.field1055 = var3;
                }
            }
            if (this.field1055 == -1) {
                this.field1057 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(IB)V")
    public final void method323(int arg0, byte arg1) {
        ++field1044;
        if (this.method344(arg0, -26486)) {
            if (this.field1046 != null && this.field1052 != null && this.field1052[arg0]) {
                class89.method590(true, this, arg0, this.field1046);
            } else {
                class207.method1385((byte) 2, true, arg0, this.field1060, super.field1145[arg0], this, arg1 + -38);
            }
            if (arg1 != 2) {
                this.field1059 = 30;
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(BI)I")
    public final int method324(byte arg0, int arg1) {
        ++field1041;
        if (!this.method344(arg1, -26486)) {
            return 0;
        } else if (arg0 != 114) {
            return 90;
        } else if (super.field1117[arg1] != null) {
            return 100;
        } else {
            return this.field1052[arg1] ? 100 : class32.method207(this.field1060, arg0 + -3631, arg1);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z[BIZB)V")
    public final void method325(boolean arg0, byte[] arg1, int arg2, boolean arg3, byte arg4) {
        if (arg4 <= 32) {
            this.method324((byte) 9, 94);
        }
        ++field1050;
        if (!arg0) {
            arg1[arg1.length + -2] = (byte) (super.field1141[arg2] >> 8);
            arg1[arg1.length - 1] = (byte) super.field1141[arg2];
            if (this.field1046 != null) {
                class205.method1370(arg2, this.field1046, arg1, 64);
                this.field1052[arg2] = true;
            }
            if (arg3) {
                super.field1117[arg2] = class141.method895(arg1, -124, false);
                return;
            }
        } else {
            if (this.field1057) {
                throw new RuntimeException();
            }
            if (this.field1048 != null) {
                class205.method1370(this.field1060, this.field1048, arg1, -126);
            }
            this.method355(true, arg1);
            this.method322((byte) 114);
        }
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(B)I")
    public final int method326(byte arg0) {
        ++field1043;
        if (arg0 >= -14) {
            return 115;
        } else if (this.field1057) {
            return 100;
        } else if (super.field1117 != null) {
            return 99;
        } else {
            int var2 = class32.method207(255, -3517, this.field1060);
            if (~var2 <= -101) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lb;Lb;IZZZ)V")
    public class49(class12 arg0, class12 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field1046 = arg0;
        this.field1060 = arg2;
        this.field1048 = arg1;
        this.field1042 = arg5;
        class56.method389(this.field1060, 4, this);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IILb;[BZ)V")
    public final void method327(int arg0, int arg1, class12 arg2, byte[] arg3, boolean arg4) {
        ++field1063;
        if (arg0 == 13512) {
            if (this.field1048 != arg2) {
                if (!arg4 && this.field1055 == arg1) {
                    this.field1057 = true;
                }
                if (arg3 == null || ~arg3.length >= -3) {
                    this.field1052[arg1] = false;
                    if (this.field1042 || arg4) {
                        class207.method1385((byte) 2, arg4, arg1, this.field1060, super.field1145[arg1], this, -42);
                    }
                    return;
                }
                class94.field1768.reset();
                class94.field1768.update(arg3, 0, arg3.length + -2);
                int var6 = (int) class94.field1768.getValue();
                int var7 = (arg3[arg3.length + -2] << 8 & 65280) + (255 & arg3[arg3.length - 1]);
                if (~super.field1145[arg1] != ~var6 || ~super.field1141[arg1] != ~var7) {
                    this.field1052[arg1] = false;
                    if (this.field1042 || arg4) {
                        class207.method1385((byte) 2, arg4, arg1, this.field1060, super.field1145[arg1], this, -45);
                    }
                    return;
                }
                this.field1052[arg1] = true;
                if (arg4) {
                    super.field1117[arg1] = class141.method895(arg3, class171.method1087(arg0, -13474), false);
                    return;
                }
            } else {
                if (this.field1057) {
                    throw new RuntimeException();
                }
                if (arg3 == null) {
                    class207.method1385((byte) 0, true, this.field1060, 255, this.field1059, this, -35);
                    return;
                }
                class94.field1768.reset();
                class94.field1768.update(arg3, 0, arg3.length);
                int var8 = (int) class94.field1768.getValue();
                if (~this.field1059 != ~var8) {
                    class207.method1385((byte) 0, true, this.field1060, 255, this.field1059, this, -81);
                    return;
                }
                class185 var9;
                try {
                    var9 = new class185(class138.method878((byte) 105, arg3));
                } catch (RuntimeException var12) {
                    class207.method1385((byte) 0, true, this.field1060, 255, this.field1059, this, -29);
                    return;
                }
                int var10 = var9.method1243(3);
                if (~var10 != -6 && ~var10 != -7) {
                    class207.method1385((byte) 0, true, this.field1060, 255, this.field1059, this, arg0 + -13552);
                    return;
                }
                int var11 = 0;
                if (~var10 <= -7) {
                    var11 = var9.method1231(arg0 + -18410);
                }
                if (this.field1049 != var11) {
                    class207.method1385((byte) 0, true, this.field1060, 255, this.field1059, this, arg0 ^ -13494);
                    return;
                }
                this.method355(true, arg3);
                this.method322((byte) 101);
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IB)V")
    public final void method328(int arg0, byte arg1) {
        ++field1047;
        if (this.method344(arg0, -26486)) {
            class67.method434(arg0, this.field1060, -235144880);
            if (arg1 > -20) {
                this.method327(15, -67, (class12) null, (byte[]) null, false);
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)V")
    public static void method329(int arg0) {
        if (arg0 != -1017200216) {
            field1056 = null;
        }
        field1061 = null;
        field1056 = null;
        field1045 = null;
        field1039 = null;
        field1062 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lqe;IILqe;SBJ)V")
    public static final void method330(class179 arg0, int arg1, int arg2, class179 arg3, short arg4, byte arg5, long arg6) {
        ++field1058;
        if (!class182.field3358) {
            int var8 = 110 % ((arg5 - -67) / 34);
            if (~class113.field2118 > -501) {
                class215.field3993[class113.field2118] = arg0;
                class23.field567[class113.field2118] = arg3;
                class23.field552[class113.field2118] = arg4;
                class238.field4389[class113.field2118] = arg6;
                class2.field21[class113.field2118] = arg1;
                class109.field2038[class113.field2118] = arg2;
                ++class113.field2118;
            }
        }
    }
}
