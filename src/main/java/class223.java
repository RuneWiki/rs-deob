import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class223 extends class3 {

    @OriginalMember(owner = "client!ve", name = "sb", descriptor = "I")
    private int field4190 = -1;

    @OriginalMember(owner = "client!ve", name = "ub", descriptor = "Z")
    private boolean field4192 = false;

    @OriginalMember(owner = "client!ve", name = "wb", descriptor = "Z")
    private volatile boolean field4194 = false;

    @OriginalMember(owner = "client!ve", name = "lb", descriptor = "Ls;")
    private class188 field4183;

    @OriginalMember(owner = "client!ve", name = "db", descriptor = "I")
    private int field4175;

    @OriginalMember(owner = "client!ve", name = "fb", descriptor = "Ls;")
    private class188 field4177;

    @OriginalMember(owner = "client!ve", name = "cb", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!ve", name = "eb", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!ve", name = "gb", descriptor = "I")
    private int field4178;

    @OriginalMember(owner = "client!ve", name = "hb", descriptor = "I")
    private int field4179;

    @OriginalMember(owner = "client!ve", name = "jb", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!ve", name = "kb", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!ve", name = "mb", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!ve", name = "nb", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!ve", name = "ob", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!ve", name = "pb", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!ve", name = "qb", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!ve", name = "rb", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!ve", name = "tb", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!ve", name = "ib", descriptor = "Lbg;")
    public static class19 field4180;

    @OriginalMember(owner = "client!ve", name = "vb", descriptor = "[Z")
    private volatile boolean[] field4193;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V")
    public static void method1457(boolean arg0) {
        if (arg0) {
            field4182 = -122;
        }
        field4180 = null;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Ls;Ls;IZZZ)V")
    public class223(class188 arg0, class188 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field4183 = arg0;
        this.field4175 = arg2;
        this.field4177 = arg1;
        this.field4192 = arg5;
        class132.method827(this.field4175, this, 20538);
    }

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "(I)I")
    public final int method1458(int arg0) {
        ++field4185;
        if (this.field4194) {
            return 100;
        } else {
            if (arg0 > -32) {
                this.method1462(-36, (byte[]) null, -119, false, true);
            }
            if (super.field56 != null) {
                return 99;
            } else {
                int var2 = class155.method993(255, this.field4175, -114);
                if (~var2 <= -101) {
                    var2 = 99;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(B)V")
    private final void method1459(byte arg0) {
        ++field4191;
        this.field4193 = new boolean[super.field56.length];
        for (int var2 = 0; ~var2 > ~this.field4193.length; ++var2) {
            this.field4193[var2] = false;
        }
        if (this.field4183 == null) {
            this.field4194 = true;
        } else {
            if (arg0 < 67) {
                this.field4193 = null;
            }
            this.field4190 = -1;
            for (int var3 = 0; ~this.field4193.length < ~var3; ++var3) {
                if (super.field34[var3] > 0) {
                    class208.method1334(this, var3, 108, this.field4183);
                    this.field4190 = var3;
                }
            }
            if (this.field4190 == -1) {
                this.field4194 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "(II)V")
    public final void method36(int arg0, int arg1) {
        ++field4186;
        if (this.method35(arg0, -1)) {
            if (this.field4183 != null && this.field4193 != null && this.field4193[arg0]) {
                class213.method1358(true, arg0, this, this.field4183);
            } else {
                class28.method245(arg0, this.field4175, true, 126, super.field42[arg0], (byte) 2, this);
            }
            int var3 = 42 % ((arg1 - 19) / 35);
        }
    }

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "(II)I")
    public final int method45(int arg0, int arg1) {
        ++field4188;
        if (!this.method35(arg1, -1)) {
            return 0;
        } else if (arg0 != 255) {
            return -54;
        } else if (super.field56[arg1] != null) {
            return 100;
        } else {
            return this.field4193[arg1] ? 100 : class155.method993(this.field4175, arg1, -94);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I[BZLs;I)V")
    public final void method1460(int arg0, byte[] arg1, boolean arg2, class188 arg3, int arg4) {
        ++field4174;
        if (this.field4177 != arg3) {
            if (!arg2 && ~this.field4190 == ~arg4) {
                this.field4194 = true;
            }
            if (arg1 == null || ~arg1.length >= -3) {
                this.field4193[arg4] = false;
                if (this.field4192 || arg2) {
                    class28.method245(arg4, this.field4175, arg2, 94, super.field42[arg4], (byte) 2, this);
                }
                return;
            }
            class196.field3571.reset();
            class196.field3571.update(arg1, 0, arg1.length + -2);
            int var6 = (int) class196.field3571.getValue();
            int var7 = ((255 & arg1[arg1.length + -2]) << 8) + (255 & arg1[arg1.length + -1]);
            if (~super.field42[arg4] != ~var6 || ~super.field31[arg4] != ~var7) {
                this.field4193[arg4] = false;
                if (this.field4192 || arg2) {
                    class28.method245(arg4, this.field4175, arg2, 91, super.field42[arg4], (byte) 2, this);
                }
                return;
            }
            this.field4193[arg4] = true;
            if (arg2) {
                super.field56[arg4] = class16.method143(false, (byte) 89, arg1);
            }
        } else {
            if (this.field4194) {
                throw new RuntimeException();
            }
            if (arg1 == null) {
                class28.method245(this.field4175, 255, true, 122, this.field4179, (byte) 0, this);
                return;
            }
            class196.field3571.reset();
            class196.field3571.update(arg1, 0, arg1.length);
            int var8 = (int) class196.field3571.getValue();
            if (this.field4179 != var8) {
                class28.method245(this.field4175, 255, true, 97, this.field4179, (byte) 0, this);
                return;
            }
            class109 var9;
            try {
                var9 = new class109(class75.method505(arg1, (byte) -115));
            } catch (RuntimeException var12) {
                class28.method245(this.field4175, 255, true, arg0 ^ 28122, this.field4179, (byte) 0, this);
                return;
            }
            int var10 = var9.method662((byte) -100);
            if (var10 != 5 && var10 != 6) {
                class28.method245(this.field4175, 255, true, 105, this.field4179, (byte) 0, this);
                return;
            }
            int var11 = 0;
            if (var10 >= 6) {
                var11 = var9.method710(28908);
            }
            if (this.field4178 != var11) {
                class28.method245(this.field4175, 255, true, arg0 + -27978, this.field4179, (byte) 0, this);
                return;
            }
            this.method13(arg1, (byte) -84);
            this.method1459((byte) 70);
        }
        if (arg0 != 28068) {
            this.method1459((byte) 111);
        }
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(B)V")
    public static final void method1461(byte arg0) {
        ++field4181;
        if (class79.field1522) {
            class13 var1 = class197.method1215(class16.field423, class125.field2389, -115);
            if (var1 != null && var1.field304 != null) {
                class191 var2 = new class191();
                var2.field3521 = var1;
                var2.field3510 = var1.field304;
                class52.method373(-32560, var2);
            }
            int var3 = -12 / ((-22 - arg0) / 41);
            class79.field1522 = false;
            class80.method527(var1, 31702);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BI)V")
    public final void method24(byte arg0, int arg1) {
        ++field4176;
        if (this.method35(arg1, -1)) {
            class190.method1187((byte) 86, arg1, this.field4175);
            int var3 = 127 / ((-77 - arg0) / 33);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I[BIZZ)V")
    public final void method1462(int arg0, byte[] arg1, int arg2, boolean arg3, boolean arg4) {
        ++field4187;
        if (!arg4) {
            arg1[arg1.length - 2] = (byte) (super.field31[arg2] >> 8);
            arg1[arg1.length + -1] = (byte) super.field31[arg2];
            if (this.field4183 != null) {
                class77.method513(this.field4183, -1, arg2, arg1);
                this.field4193[arg2] = true;
            }
            if (arg3) {
                super.field56[arg2] = class16.method143(false, (byte) 103, arg1);
            }
        } else {
            if (this.field4194) {
                throw new RuntimeException();
            }
            if (this.field4177 != null) {
                class77.method513(this.field4177, -1, this.field4175, arg1);
            }
            this.method13(arg1, (byte) -75);
            this.method1459((byte) 88);
        }
        if (arg0 != -1267907032) {
            this.field4178 = -32;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIZ)V")
    public final void method1463(int arg0, int arg1, boolean arg2) {
        this.field4179 = arg0;
        ++field4184;
        this.field4178 = arg1;
        if (!arg2) {
            if (this.field4177 != null) {
                class213.method1358(!arg2, this.field4175, this, this.field4177);
            } else {
                class28.method245(this.field4175, 255, true, 110, this.field4179, (byte) 0, this);
            }
        }
    }
}
