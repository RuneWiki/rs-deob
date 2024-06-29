import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class194 extends class139 {

    @OriginalMember(owner = "client!va", name = "X", descriptor = "I")
    private int field3814 = 1;

    @OriginalMember(owner = "client!va", name = "db", descriptor = "I")
    private int field3820 = 1;

    @OriginalMember(owner = "client!va", name = "fb", descriptor = "I")
    private int field3822 = 204;

    @OriginalMember(owner = "client!va", name = "ab", descriptor = "Lrf;")
    public static class163 field3817 = class53.method392(50, "Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

    @OriginalMember(owner = "client!va", name = "eb", descriptor = "I")
    public static int field3821 = 0;

    @OriginalMember(owner = "client!va", name = "T", descriptor = "Lfc;")
    public static class54 field3810 = new class54(64);

    @OriginalMember(owner = "client!va", name = "ib", descriptor = "Lrf;")
    public static class163 field3825 = class53.method392(94, "Okay");

    @OriginalMember(owner = "client!va", name = "jb", descriptor = "I")
    public static int field3826 = 0;

    @OriginalMember(owner = "client!va", name = "V", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!va", name = "W", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!va", name = "Y", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!va", name = "Z", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!va", name = "bb", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!va", name = "cb", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!va", name = "gb", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!va", name = "kb", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!va", name = "hb", descriptor = "Lue;")
    public static class189 field3824;

    @OriginalMember(owner = "client!va", name = "U", descriptor = "Lag;")
    public static class8 field3811;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(ZII)I")
    public static final int method1292(boolean arg0, int arg1, int arg2) {
        ++field3815;
        if (arg0) {
            return -7;
        } else {
            class95 var3 = (class95) class65.field1373.method465((long) arg1, (byte) 85);
            if (var3 == null) {
                return -1;
            } else {
                return arg2 >= 0 && ~arg2 > ~var3.field2037.length ? var3.field2037[arg2] : -1;
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
    public class194() {
        super(0, true);
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        ++field3812;
        if (arg1 != 7451) {
            this.method64(88, 20, (class52) null);
        }
        int[] var3 = super.field2859.method1319(arg1 + -7573, arg0);
        if (super.field2859.field3966) {
            for (int var4 = 0; ~class23.field402 < ~var4; ++var4) {
                int var5 = class180.field3607[arg0];
                int var6 = class189.field3772[var4];
                int var7 = this.field3820 * var6 >> 12;
                int var8 = var6 % (4096 / this.field3820) * this.field3820;
                int var9 = this.field3814 * var5 >> 12;
                int var10 = var5 % (4096 / this.field3814) * this.field3814;
                if (this.field3822 > var10) {
                    for (var7 -= var9; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var8 < this.field3822) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (this.field3822 > var8) {
                    int var11;
                    for (var11 = var7 - var9; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!va", name = "f", descriptor = "(B)V")
    public static void method1293(byte arg0) {
        field3825 = null;
        if (arg0 >= -64) {
            method1294((class167) null, -11);
        }
        field3810 = null;
        field3824 = null;
        field3811 = null;
        field3817 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lsa;I)V")
    public static final void method1294(class167 arg0, int arg1) {
        class122.field2578 = arg0;
        ++field3816;
        if (arg1 < 42) {
            method1297(73, -23);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IILfa;)V")
    public final void method64(int arg0, int arg1, class52 arg2) {
        if (arg1 != 21) {
            method1296(true, 117, 91);
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field3822 = arg2.method390((byte) 97);
                }
            } else {
                this.field3814 = arg2.method344(255);
            }
        } else {
            this.field3820 = arg2.method344(255);
        }
        ++field3818;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BLig;)V")
    public static final void method1295(byte arg0, class84 arg1) {
        int var2 = -116 / ((arg0 - -72) / 44);
        if (~class4.field47 == ~arg1.field1720) {
            class181.field3631[arg1.field1774] = true;
        }
        ++field3819;
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(ZII)I")
    public static final int method1296(boolean arg0, int arg1, int arg2) {
        int var3 = arg1 >>> 31;
        if (arg0) {
            method1294((class167) null, 72);
        }
        ++field3813;
        return (arg1 + var3) / arg2 + -var3;
    }

    @OriginalMember(owner = "client!va", name = "e", descriptor = "(II)Lj;")
    public static final class86 method1297(int arg0, int arg1) {
        ++field3823;
        class86 var2 = (class86) class81.field1644.method401((long) arg0, (byte) 126);
        if (var2 != null) {
            return var2;
        } else {
            class86 var3 = class63.method454(arg0, 0, class118.field2497, false, class72.field1507);
            if (var3 != null) {
                class81.field1644.method398(var3, (long) arg0, (byte) 89);
            }
            if (arg1 != 1) {
                field3821 = 30;
            }
            return var3;
        }
    }
}
