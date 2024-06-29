import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class327 {

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "I")
    private int field4718 = 128;

    @OriginalMember(owner = "client!jq", name = "j", descriptor = "I")
    private int field4721 = 0;

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "I")
    private int field4717 = 0;

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "I")
    public int field4714 = -1;

    @OriginalMember(owner = "client!jq", name = "m", descriptor = "I")
    private int field4724 = 128;

    @OriginalMember(owner = "client!jq", name = "q", descriptor = "Z")
    public boolean field4728 = false;

    @OriginalMember(owner = "client!jq", name = "i", descriptor = "I")
    private int field4720 = 0;

    @OriginalMember(owner = "client!jq", name = "l", descriptor = "Z")
    public boolean field4723 = false;

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "Lus;")
    public static class1 field4715 = new class1(32, -1);

    @OriginalMember(owner = "client!jq", name = "v", descriptor = "I")
    public static int field4733 = 0;

    @OriginalMember(owner = "client!jq", name = "y", descriptor = "I")
    public static int field4736 = 52;

    @OriginalMember(owner = "client!jq", name = "z", descriptor = "J")
    public static long field4737 = 0L;

    @OriginalMember(owner = "client!jq", name = "A", descriptor = "Z")
    public static volatile boolean field4738 = false;

    @OriginalMember(owner = "client!jq", name = "w", descriptor = "Lus;")
    public static class1 field4734 = new class1(10, -1);

    @OriginalMember(owner = "client!jq", name = "B", descriptor = "Lwf;")
    public static class79 field4739 = new class79(4, -1);

    @OriginalMember(owner = "client!jq", name = "D", descriptor = "I")
    public static int field4741 = 0;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!jq", name = "k", descriptor = "I")
    public int field4722;

    @OriginalMember(owner = "client!jq", name = "o", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!jq", name = "r", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!jq", name = "s", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!jq", name = "u", descriptor = "I")
    private int field4732;

    @OriginalMember(owner = "client!jq", name = "C", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "Lrd;")
    public class204 field4716;

    @OriginalMember(owner = "client!jq", name = "n", descriptor = "[S")
    private short[] field4725;

    @OriginalMember(owner = "client!jq", name = "p", descriptor = "[S")
    private short[] field4727;

    @OriginalMember(owner = "client!jq", name = "t", descriptor = "[S")
    private short[] field4731;

    @OriginalMember(owner = "client!jq", name = "x", descriptor = "[S")
    private short[] field4735;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lrp;BI)V")
    private final void method2070(class276 arg0, byte arg1, int arg2) {
        int var4 = -84 % ((arg1 + 73) / 35);
        field4729++;
        if (arg2 == 1) {
            this.field4732 = arg0.method1729(65280);
        } else if (arg2 == 2) {
            this.field4714 = arg0.method1729(65280);
        } else if (arg2 == 4) {
            this.field4718 = arg0.method1729(65280);
        } else if (arg2 == 5) {
            this.field4724 = arg0.method1729(65280);
        } else if (arg2 == 6) {
            this.field4721 = arg0.method1729(65280);
        } else if (arg2 == 7) {
            this.field4720 = arg0.method1701(-23121);
        } else if (arg2 == 8) {
            this.field4717 = arg0.method1701(-23121);
        } else if (arg2 == 9) {
            this.field4723 = true;
        } else if (arg2 == 10) {
            this.field4728 = true;
            return;
        } else if (arg2 == 40) {
            int var5 = arg0.method1701(-23121);
            this.field4725 = new short[var5];
            this.field4727 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field4727[var6] = (short) arg0.method1729(65280);
                this.field4725[var6] = (short) arg0.method1729(65280);
            }
            return;
        } else if (arg2 == 41) {
            int var7 = arg0.method1701(-23121);
            this.field4731 = new short[var7];
            this.field4735 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field4731[var8] = (short) arg0.method1729(65280);
                this.field4735[var8] = (short) arg0.method1729(65280);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)I")
    public static final int method2071(byte arg0) {
        if (arg0 == 42) {
            field4719++;
            return 6;
        } else {
            return -10;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lrp;B)V")
    public final void method2072(class276 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1701(-23121);
            if (var3 == 0) {
                field4726++;
                int var4 = 10 % ((-arg1 - 48) / 60);
                return;
            }
            this.method2070(arg0, (byte) 16, var3);
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Z)V")
    public static void method2073(boolean arg0) {
        field4715 = null;
        if (!arg0) {
            method2073(true);
        }
        field4734 = null;
        field4739 = null;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILcn;ILnp;III)Lf;")
    public final class491 method2074(int arg0, class329 arg1, int arg2, class313 arg3, int arg4, int arg5, int arg6) {
        field4712++;
        int var8 = arg6;
        class153 var9 = this.field4714 == -1 || arg5 == -1 ? null : arg1.method2081(this.field4714, arg0);
        if (var9 != null) {
            var8 = arg6 | var9.method966(false, -384337424, arg4, arg5);
        }
        if (this.field4724 != 128) {
            var8 |= 0x2;
        }
        if (this.field4718 != 128 || this.field4721 != 0) {
            var8 |= 0x5;
        }
        class232 var10 = this.field4716.field3038;
        class491 var11;
        synchronized (this.field4716.field3038) {
            var11 = (class491) this.field4716.field3038.method1479(arg0, (long) (this.field4722 |= arg3.field4429 << 29));
        }
        if (var11 == null || arg3.method653(var11.method1319(), var8) != 0) {
            if (var11 != null) {
                var8 = arg3.method647(var8, var11.method1319());
            }
            int var12 = var8;
            if (this.field4727 != null) {
                var12 = var8 | 0x2000;
            }
            if (this.field4731 != null) {
                var12 |= 0x4000;
            }
            class187 var13 = class264.method1629(this.field4716.field3036, this.field4732, (byte) -42, 0);
            if (var13 == null) {
                return null;
            }
            var11 = arg3.method696(var13, var12, this.field4716.field3039, this.field4720 + 64, this.field4717 - -850);
            if (this.field4727 != null) {
                for (int var14 = 0; var14 < this.field4727.length; var14++) {
                    var11.method1309(this.field4727[var14], this.field4725[var14]);
                }
            }
            if (this.field4731 != null) {
                for (int var15 = 0; var15 < this.field4731.length; var15++) {
                    var11.method1317(this.field4731[var15], this.field4735[var15]);
                }
            }
            var11.method1344(var8);
            class232 var16 = this.field4716.field3038;
            synchronized (this.field4716.field3038) {
                this.field4716.field3038.method1473(var11, (long) (this.field4722 |= arg3.field4429 << 29), -26);
            }
        }
        class491 var17 = var9 == null ? var11.method1292((byte) 2, var8, true) : var9.method961(0, arg4, arg2, (byte) 2, var11, var8, (byte) 112, arg5);
        if (this.field4718 != 128 || this.field4724 != 128) {
            var17.method1336(this.field4718, this.field4724, this.field4718);
        }
        if (this.field4721 != 0) {
            if (this.field4721 == 90) {
                var17.method1311(4096);
            }
            if (this.field4721 == 180) {
                var17.method1311(8192);
            }
            if (this.field4721 == 270) {
                var17.method1311(12288);
            }
        }
        var17.method1344(arg6);
        return var17;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIZI)V")
    public static final void method2075(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field4713++;
        class414.field5824 = (long) arg2;
        int var5 = class262.method1624(16822);
        if (arg0 == 3 || var5 == 3) {
            arg3 = true;
        }
        if (!class141.field1878.method684()) {
            arg3 = true;
        }
        class353.method2200(arg1, arg3, false, var5, arg4, arg0);
    }
}
