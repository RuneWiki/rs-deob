import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class232 extends class10 {

    @OriginalMember(owner = "client!vb", name = "kb", descriptor = "Z")
    private boolean field4161 = false;

    @OriginalMember(owner = "client!vb", name = "rb", descriptor = "I")
    private int field4168 = -1;

    @OriginalMember(owner = "client!vb", name = "Db", descriptor = "Z")
    private volatile boolean field4180 = false;

    @OriginalMember(owner = "client!vb", name = "sb", descriptor = "I")
    private int field4169;

    @OriginalMember(owner = "client!vb", name = "jb", descriptor = "Lsf;")
    private class203 field4160;

    @OriginalMember(owner = "client!vb", name = "nb", descriptor = "Lsf;")
    private class203 field4164;

    @OriginalMember(owner = "client!vb", name = "lb", descriptor = "Lkh;")
    public static class117 field4162 = class224.method1450((byte) -53, ")1p");

    @OriginalMember(owner = "client!vb", name = "vb", descriptor = "D")
    public static double field4172 = -1.0D;

    @OriginalMember(owner = "client!vb", name = "Bb", descriptor = "I")
    public static int field4178 = 0;

    @OriginalMember(owner = "client!vb", name = "Fb", descriptor = "Lkh;")
    public static class117 field4182 = class224.method1450((byte) 114, "<img=0>");

    @OriginalMember(owner = "client!vb", name = "Eb", descriptor = "Ldb;")
    public static class36 field4181 = new class36();

    @OriginalMember(owner = "client!vb", name = "Gb", descriptor = "[I")
    public static int[] field4183 = new int[2000];

    @OriginalMember(owner = "client!vb", name = "Hb", descriptor = "Lge;")
    public static class71 field4184 = new class71(64);

    @OriginalMember(owner = "client!vb", name = "Ib", descriptor = "Lkh;")
    private static class117 field4185 = class224.method1450((byte) 106, "The server is being updated)3");

    @OriginalMember(owner = "client!vb", name = "Jb", descriptor = "Lkh;")
    public static class117 field4186 = field4185;

    @OriginalMember(owner = "client!vb", name = "mb", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!vb", name = "ob", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!vb", name = "qb", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!vb", name = "tb", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!vb", name = "ub", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!vb", name = "wb", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!vb", name = "xb", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!vb", name = "yb", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!vb", name = "zb", descriptor = "I")
    private int field4176;

    @OriginalMember(owner = "client!vb", name = "Ab", descriptor = "I")
    private int field4177;

    @OriginalMember(owner = "client!vb", name = "Cb", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!vb", name = "pb", descriptor = "[Z")
    private volatile boolean[] field4166;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IB)V")
    public final void method78(int arg0, byte arg1) {
        if (arg1 == -52) {
            ++field4174;
            if (this.method86(arg0, (byte) -68)) {
                class10.method100(this.field4169, arg0, false);
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BZ[BILsf;)V")
    public final void method1496(byte arg0, boolean arg1, byte[] arg2, int arg3, class203 arg4) {
        ++field4175;
        if (this.field4160 != arg4) {
            if (!arg1 && ~this.field4168 == ~arg3) {
                this.field4180 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field4166[arg3] = false;
                if (this.field4161 || arg1) {
                    class119.method836(super.field363[arg3], arg3, arg1, -1334633144, this.field4169, (byte) 2, this);
                }
                return;
            }
            class165.field2984.reset();
            class165.field2984.update(arg2, 0, arg2.length + -2);
            int var6 = (int) class165.field2984.getValue();
            int var7 = ((255 & arg2[arg2.length - 2]) << 8) + (255 & arg2[arg2.length + -1]);
            if (~super.field363[arg3] != ~var6 || ~super.field343[arg3] != ~var7) {
                this.field4166[arg3] = false;
                if (this.field4161 || arg1) {
                    class119.method836(super.field363[arg3], arg3, arg1, -1334633144, this.field4169, (byte) 2, this);
                }
                return;
            }
            this.field4166[arg3] = true;
            if (arg1) {
                super.field328[arg3] = class130.method882(arg2, -137, false);
            }
        } else {
            if (this.field4180) {
                throw new RuntimeException();
            }
            if (arg2 == null) {
                class119.method836(this.field4177, this.field4169, true, -1334633144, 255, (byte) 0, this);
                return;
            }
            class165.field2984.reset();
            class165.field2984.update(arg2, 0, arg2.length);
            int var8 = (int) class165.field2984.getValue();
            if (this.field4177 != var8) {
                class119.method836(this.field4177, this.field4169, true, -1334633144, 255, (byte) 0, this);
                return;
            }
            class145 var9;
            try {
                var9 = new class145(class74.method521(arg2, (byte) 14));
            } catch (RuntimeException var12) {
                class119.method836(this.field4177, this.field4169, true, -1334633144, 255, (byte) 0, this);
                return;
            }
            int var10 = var9.method998(71);
            if (var10 != 5 && ~var10 != -7) {
                class119.method836(this.field4177, this.field4169, true, arg0 + -1334633132, 255, (byte) 0, this);
                return;
            }
            int var11 = 0;
            if (var10 >= 6) {
                var11 = var9.method1018(-1068451600);
            }
            if (~this.field4176 != ~var11) {
                class119.method836(this.field4177, this.field4169, true, -1334633144, 255, (byte) 0, this);
                return;
            }
            this.method82(0, arg2);
            this.method1499(arg0 ^ -24871);
        }
        if (arg0 != -12) {
            this.field4180 = true;
        }
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(II)V")
    public final void method103(int arg0, int arg1) {
        if (arg0 > -80) {
            this.method103(-66, -19);
        }
        ++field4179;
        if (this.method86(arg1, (byte) -68)) {
            if (this.field4164 != null && this.field4166 != null && this.field4166[arg1]) {
                class225.method1458(arg1, -106, this.field4164, this);
            } else {
                class119.method836(super.field363[arg1], arg1, true, -1334633144, this.field4169, (byte) 2, this);
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZIBZ[B)V")
    public final void method1497(boolean arg0, int arg1, byte arg2, boolean arg3, byte[] arg4) {
        ++field4173;
        if (arg2 != 0) {
            field4181 = null;
        }
        if (arg3) {
            if (this.field4180) {
                throw new RuntimeException();
            } else {
                if (this.field4160 != null) {
                    class100.method678(arg4, this.field4169, this.field4160, (byte) -89);
                }
                this.method82(0, arg4);
                this.method1499(24877);
            }
        } else {
            arg4[arg4.length + -2] = (byte) (super.field343[arg1] >> 8);
            arg4[arg4.length + -1] = (byte) super.field343[arg1];
            if (this.field4164 != null) {
                class100.method678(arg4, arg1, this.field4164, (byte) -78);
                this.field4166[arg1] = true;
            }
            if (arg0) {
                super.field328[arg1] = class130.method882(arg4, -137, false);
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "(I)V")
    public static void method1498(int arg0) {
        field4185 = null;
        field4184 = null;
        field4186 = null;
        field4162 = null;
        field4182 = null;
        field4181 = null;
        field4183 = null;
        if (arg0 != 707) {
            method1498(107);
        }
    }

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "(I)V")
    private final void method1499(int arg0) {
        this.field4166 = new boolean[super.field328.length];
        ++field4167;
        for (int var2 = 0; ~this.field4166.length < ~var2; ++var2) {
            this.field4166[var2] = false;
        }
        if (arg0 != 24877) {
            this.method1497(false, 6, (byte) -35, false, (byte[]) null);
        }
        if (this.field4164 == null) {
            this.field4180 = true;
        } else {
            this.field4168 = -1;
            for (int var3 = 0; ~this.field4166.length < ~var3; ++var3) {
                if (~super.field336[var3] < -1) {
                    class159.method1136(this.field4164, this, var3, true);
                    this.field4168 = var3;
                }
            }
            if (this.field4168 == -1) {
                this.field4180 = true;
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)V")
    public static final void method1500(boolean arg0) {
        ++field4170;
        if (class67.field1294) {
            class74.field1401 = null;
            client.field785 = null;
            class140.field2551 = null;
            class104.field1908 = null;
            class8.field139 = null;
            class209.field3747 = null;
            class98.field1810 = null;
            class98.field1800 = null;
            class194.field3458 = null;
            class110.field2072 = null;
            class214.field3885 = null;
            class137.field2481 = null;
            class80.field1506 = null;
            class90.field1679 = null;
            class173.field3118 = null;
            class86.field1628 = null;
            class60.field1213 = null;
            class80.field1510 = null;
            class39.field901 = null;
            class78.field1484 = null;
            class182.field3287 = null;
            class209.field3752 = null;
            class26.method232(2, (byte) 118);
            class171.method1202(80, true);
            class67.field1294 = arg0;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZI)V")
    public final void method1501(int arg0, boolean arg1, int arg2) {
        this.field4176 = arg2;
        if (arg1) {
            field4183 = null;
        }
        this.field4177 = arg0;
        if (this.field4160 == null) {
            class119.method836(this.field4177, this.field4169, true, -1334633144, 255, (byte) 0, this);
        } else {
            class225.method1458(this.field4169, -114, this.field4160, this);
        }
        ++field4171;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lsf;Lsf;IZZZ)V")
    public class232(class203 arg0, class203 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field4161 = arg5;
        this.field4169 = arg2;
        this.field4160 = arg1;
        this.field4164 = arg0;
        class13.method125(this.field4169, this, -114);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)I")
    public final int method1502(byte arg0) {
        ++field4163;
        if (this.field4180) {
            return 100;
        } else if (super.field328 != null) {
            return 99;
        } else {
            int var2 = 117 % ((32 - arg0) / 51);
            int var3 = class6.method47(-825699888, 255, this.field4169);
            if (~var3 <= -101) {
                var3 = 99;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)I")
    public final int method81(int arg0, int arg1) {
        ++field4165;
        if (!this.method86(arg1, (byte) -68)) {
            return 0;
        } else {
            if (arg0 != 100) {
                this.method1502((byte) 60);
            }
            if (super.field328[arg1] != null) {
                return 100;
            } else {
                return this.field4166[arg1] ? 100 : class6.method47(-825699888, this.field4169, arg1);
            }
        }
    }
}
