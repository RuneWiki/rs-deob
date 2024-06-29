import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class1 extends class14 {

    @OriginalMember(owner = "client!a", name = "W", descriptor = "I")
    private int field1 = -1;

    @OriginalMember(owner = "client!a", name = "jb", descriptor = "Z")
    private boolean field11 = false;

    @OriginalMember(owner = "client!a", name = "ob", descriptor = "Z")
    private volatile boolean field16 = false;

    @OriginalMember(owner = "client!a", name = "qb", descriptor = "Llb;")
    private class111 field18;

    @OriginalMember(owner = "client!a", name = "ab", descriptor = "Llb;")
    private class111 field2;

    @OriginalMember(owner = "client!a", name = "kb", descriptor = "I")
    private int field12;

    @OriginalMember(owner = "client!a", name = "ib", descriptor = "Lrd;")
    public static class173 field10 = class133.method843("<)4col> x", -71);

    @OriginalMember(owner = "client!a", name = "lb", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!a", name = "mb", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!a", name = "nb", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!a", name = "pb", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!a", name = "rb", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!a", name = "sb", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!a", name = "bb", descriptor = "I")
    private int field3;

    @OriginalMember(owner = "client!a", name = "cb", descriptor = "I")
    private int field4;

    @OriginalMember(owner = "client!a", name = "db", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!a", name = "eb", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!a", name = "fb", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!a", name = "hb", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!a", name = "gb", descriptor = "[Z")
    private volatile boolean[] field8;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lbc;Lbb;BLbc;Lbc;)Z")
    public static final boolean method1(class14 arg0, class13 arg1, byte arg2, class14 arg3, class14 arg4) {
        ++field7;
        class166.field3187 = arg3;
        class161.field3005 = arg0;
        int var5 = -100 / ((arg2 - 35) / 48);
        class34.field749 = arg4;
        class21.field467 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(IB)V")
    public static final void method2(int arg0, byte arg1) {
        ++field14;
        class37 var2 = (class37) class8.field150.method677(-2755, (long) arg0);
        if (var2 != null) {
            int var3 = 2 % ((arg1 - -12) / 44);
            for (int var4 = 0; var2.field786.length > var4; ++var4) {
                var2.field786[var4] = -1;
                var2.field784[var4] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(Z)V")
    public static void method3(boolean arg0) {
        field10 = null;
        if (arg0) {
            field10 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Llb;Llb;IZZZ)V")
    public class1(class111 arg0, class111 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field18 = arg1;
        this.field11 = arg5;
        this.field2 = arg0;
        this.field12 = arg2;
        class145.method911(63, this.field12, this);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ZI[BZI)V")
    public final void method4(boolean arg0, int arg1, byte[] arg2, boolean arg3, int arg4) {
        ++field5;
        if (arg0) {
            if (this.field16) {
                throw new RuntimeException();
            }
            if (this.field18 != null) {
                class217.method1418(this.field12, arg4 + -114, this.field18, arg2);
            }
            this.method131(arg2, -112);
            this.method11(arg4);
        } else {
            arg2[arg2.length + -2] = (byte) (super.field340[arg1] >> 8);
            arg2[arg2.length + -1] = (byte) super.field340[arg1];
            if (this.field2 != null) {
                class217.method1418(arg1, -99, this.field2, arg2);
                this.field8[arg1] = true;
            }
            if (arg3) {
                super.field295[arg1] = class84.method551(arg2, false, false);
            }
        }
        if (arg4 != 0) {
            this.method11(107);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I[BLlb;ZI)V")
    public final void method5(int arg0, byte[] arg1, class111 arg2, boolean arg3, int arg4) {
        ++field13;
        if (this.field18 != arg2) {
            if (!arg3 && this.field1 == arg0) {
                this.field16 = true;
            }
            if (arg1 == null || ~arg1.length >= -3) {
                this.field8[arg0] = false;
                if (this.field11 || arg3) {
                    class35.method276(arg3, (byte) -69, this, super.field316[arg0], this.field12, (byte) 2, arg0);
                }
                return;
            }
            class204.field3991.reset();
            class204.field3991.update(arg1, 0, arg1.length + -2);
            int var6 = (int) class204.field3991.getValue();
            int var7 = ((arg1[arg1.length + -2] & 255) << 8) + (arg1[arg1.length - 1] & 255);
            if (super.field316[arg0] != var6 || ~super.field340[arg0] != ~var7) {
                this.field8[arg0] = false;
                if (this.field11 || arg3) {
                    class35.method276(arg3, (byte) -63, this, super.field316[arg0], this.field12, (byte) 2, arg0);
                }
                return;
            }
            this.field8[arg0] = true;
            if (arg3) {
                super.field295[arg0] = class84.method551(arg1, false, false);
            }
        } else {
            if (this.field16) {
                throw new RuntimeException();
            }
            if (arg1 == null) {
                class35.method276(true, (byte) -126, this, this.field4, 255, (byte) 0, this.field12);
                return;
            }
            class204.field3991.reset();
            class204.field3991.update(arg1, 0, arg1.length);
            int var8 = (int) class204.field3991.getValue();
            if (this.field4 != var8) {
                class35.method276(true, (byte) -62, this, this.field4, 255, (byte) 0, this.field12);
                return;
            }
            class121 var9;
            try {
                var9 = new class121(class22.method183((byte) 53, arg1));
            } catch (RuntimeException var12) {
                class35.method276(true, (byte) -101, this, this.field4, 255, (byte) 0, this.field12);
                return;
            }
            int var10 = var9.method751((byte) 118);
            if (var10 != 5 && ~var10 != -7) {
                class35.method276(true, (byte) -74, this, this.field4, 255, (byte) 0, this.field12);
                return;
            }
            int var11 = 0;
            if (~var10 <= -7) {
                var11 = var9.method776(73);
            }
            if (~this.field3 != ~var11) {
                class35.method276(true, (byte) -106, this, this.field4, 255, (byte) 0, this.field12);
                return;
            }
            this.method131(arg1, -99);
            this.method11(0);
        }
        if (arg4 >= -21) {
            this.field2 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(IIB)V")
    public final void method6(int arg0, int arg1, byte arg2) {
        int var4 = -122 / ((arg2 - -43) / 33);
        this.field3 = arg1;
        ++field15;
        this.field4 = arg0;
        if (this.field18 != null) {
            class164.method1058(this.field12, this, this.field18, (byte) -79);
        } else {
            class35.method276(true, (byte) -45, this, this.field4, 255, (byte) 0, this.field12);
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(BI)I")
    public final int method7(byte arg0, int arg1) {
        ++field19;
        if (!this.method120(arg1, 0)) {
            return 0;
        } else {
            if (arg0 <= 7) {
                field10 = null;
            }
            if (super.field295[arg1] != null) {
                return 100;
            } else {
                return this.field8[arg1] ? 100 : class58.method374(arg1, this.field12, -14074);
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)V")
    public final void method8(byte arg0, int arg1) {
        ++field17;
        if (this.method120(arg1, 0)) {
            if (this.field2 != null && this.field8 != null && this.field8[arg1]) {
                class164.method1058(arg1, this, this.field2, (byte) -120);
            } else {
                class35.method276(true, (byte) -84, this, super.field316[arg1], this.field12, (byte) 2, arg1);
            }
            if (arg0 != 2) {
                this.field3 = -57;
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)I")
    public final int method9(int arg0) {
        ++field9;
        if (this.field16) {
            return 100;
        } else if (super.field295 != null) {
            return 99;
        } else {
            int var2 = class58.method374(this.field12, 255, -14074);
            int var3 = 80 % ((arg0 - -73) / 43);
            if (~var2 <= -101) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)V")
    public final void method10(int arg0, int arg1) {
        ++field20;
        if (this.method120(arg0, arg1)) {
            class92.method585(this.field12, arg0, (byte) 79);
        }
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V")
    private final void method11(int arg0) {
        this.field8 = new boolean[super.field295.length];
        ++field6;
        for (int var2 = arg0; ~this.field8.length < ~var2; ++var2) {
            this.field8[var2] = false;
        }
        if (this.field2 == null) {
            this.field16 = true;
        } else {
            this.field1 = -1;
            for (int var3 = 0; ~var3 > ~this.field8.length; ++var3) {
                if (super.field294[var3] > 0) {
                    class178.method1197(108, var3, this, this.field2);
                    this.field1 = var3;
                }
            }
            if (this.field1 == -1) {
                this.field16 = true;
            }
        }
    }
}
