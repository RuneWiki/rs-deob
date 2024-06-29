import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class102 extends class107 {

    @OriginalMember(owner = "client!qg", name = "X", descriptor = "I")
    private int field1814 = 1;

    @OriginalMember(owner = "client!qg", name = "db", descriptor = "I")
    private int field1820 = 0;

    @OriginalMember(owner = "client!qg", name = "Z", descriptor = "I")
    private int field1816 = 0;

    @OriginalMember(owner = "client!qg", name = "R", descriptor = "I")
    public static int field1808 = 0;

    @OriginalMember(owner = "client!qg", name = "S", descriptor = "Lpj;")
    public static class237 field1809 = class33.method353("::clientdrop", 73);

    @OriginalMember(owner = "client!qg", name = "W", descriptor = "Lpj;")
    public static class237 field1813 = class33.method353("<col=ff7000>", 127);

    @OriginalMember(owner = "client!qg", name = "bb", descriptor = "Lpj;")
    public static class237 field1818 = class33.method353(")1u1)1m", 50);

    @OriginalMember(owner = "client!qg", name = "P", descriptor = "Z")
    public static boolean field1806 = false;

    @OriginalMember(owner = "client!qg", name = "fb", descriptor = "[Z")
    public static boolean[] field1822 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!qg", name = "Q", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!qg", name = "T", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!qg", name = "U", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!qg", name = "V", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!qg", name = "Y", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!qg", name = "ab", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!qg", name = "cb", descriptor = "[I")
    public static int[] field1819;

    @OriginalMember(owner = "client!qg", name = "eb", descriptor = "[I")
    public static int[] field1821;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)V")
    public static final void method773(int arg0, int arg1) {
        ++field1815;
        if (class47.method434(arg0, arg1)) {
            class141[] var2 = class22.field406[arg1];
            for (int var3 = arg0; ~var3 > ~var2.length; ++var3) {
                class141 var4 = var2[var3];
                if (var4 != null) {
                    var4.field2570 = 0;
                    var4.field2524 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V")
    public class102() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "(I)V")
    public static void method774(int arg0) {
        field1821 = null;
        field1818 = null;
        field1822 = null;
        if (arg0 != -4) {
            method773(-49, -19);
        }
        field1813 = null;
        field1809 = null;
        field1819 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZ)V")
    public static final void method775(int arg0, boolean arg1) {
        ++field1817;
        class249 var2 = (class249) class156.field2757.method673(false);
        int var3 = 12 % ((arg0 - -42) / 61);
        while (var2 != null) {
            if (var2.field4333 != null) {
                class74.field1424.method583(var2.field4333);
                var2.field4333 = null;
            }
            if (var2.field4335 != null) {
                class74.field1424.method583(var2.field4335);
                var2.field4335 = null;
            }
            var2.method629(0);
            var2 = (class249) class156.field2757.method680(48);
        }
        if (arg1) {
            for (class249 var4 = (class249) class82.field1536.method673(false); var4 != null; var4 = (class249) class82.field1536.method680(84)) {
                if (var4.field4333 != null) {
                    class74.field1424.method583(var4.field4333);
                    var4.field4333 = null;
                }
                var4.method629(0);
            }
            for (class249 var5 = (class249) class33.field703.method566(0); var5 != null; var5 = (class249) class33.field703.method565(-86)) {
                if (var5.field4333 != null) {
                    class74.field1424.method583(var5.field4333);
                    var5.field4333 = null;
                }
                var5.method629(0);
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lie;II)V")
    public final void method122(class32 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -4) {
                    this.field1814 = arg0.method316((byte) -4);
                }
            } else {
                this.field1820 = arg0.method316((byte) -97);
            }
        } else {
            this.field1816 = arg0.method316((byte) -50);
        }
        if (arg2 == -32513) {
            ++field1810;
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(BI)[I")
    public final int[] method123(byte arg0, int arg1) {
        ++field1807;
        if (arg0 != -17) {
            field1809 = null;
        }
        int[] var3 = super.field1921.method1388(arg1, (byte) -26);
        if (super.field1921.field3539) {
            int var4 = class185.field3233[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; class106.field1862 > var6; ++var6) {
                int var7 = class182.field3199[var6];
                int var8 = var7 + -2048 >> 1;
                int var11;
                if (this.field1816 != 0) {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                    var11 = (int) ((double) (this.field1814 * var10) * 3.141592653589793D);
                } else {
                    var11 = (-var4 + var7) * this.field1814;
                }
                int var12 = var11 - (-4096 & var11);
                if (this.field1820 != 0) {
                    if (~this.field1820 == -3) {
                        var12 -= 2048;
                        if (~var12 > -1) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                } else {
                    var12 = class105.field1845[(4093 & var12) >> 4] + 4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "(I)V")
    public final void method124(int arg0) {
        class212.method1423(arg0 ^ -19813);
        if (arg0 != 31) {
            this.method124(-70);
        }
        ++field1812;
    }

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "(I)V")
    public static final void method776(int arg0) {
        ++field1811;
        while (~class65.field1288.method364(class120.field2130, -124) <= -28) {
            int var1 = class65.field1288.method358(200, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class232.field4022[var1] == null) {
                var2 = true;
                class232.field4022[var1] = new class210();
            }
            class210 var3 = class232.field4022[var1];
            class263.field4498[class89.field1636++] = var1;
            var3.field3692 = class241.field4246;
            if (var3.field3586 != null && var3.field3586.method1539((byte) 21)) {
                class167.method1166(var3, -70);
            }
            int var4 = class65.field1288.method358(200, 5);
            if (~var4 < -16) {
                var4 -= 32;
            }
            var3.field3586 = class271.method1805(class65.field1288.method358(200, 14), 127);
            int var5 = class65.field1288.method358(200, 1);
            if (~var5 == -2) {
                class117.field2062[class155.field2752++] = var1;
            }
            int var6 = class65.field1288.method358(200, 5);
            int var7 = class65.field1288.method358(200, 1);
            int var8 = class213.field3644[class65.field1288.method358(200, 3)];
            if (var2) {
                var3.field3717 = var3.field3697 = var8;
            }
            var3.method1447(var3.field3586.field3989, (byte) 68);
            var3.field3678 = var3.field3586.field3994;
            var3.field3712 = var3.field3586.field3997;
            if (var6 > 15) {
                var6 -= 32;
            }
            var3.field3726 = var3.field3586.field4009;
            var3.field3711 = var3.field3586.field3972;
            var3.field3723 = var3.field3586.field4003;
            var3.field3687 = var3.field3586.field3965;
            var3.field3677 = var3.field3586.field3995;
            var3.field3679 = var3.field3586.field3973;
            if (var3.field3677 == 0) {
                var3.field3697 = 0;
            }
            var3.method1444(var3.method1441((byte) 123), (byte) 33, ~var7 == -2, class229.field3911.field3743[0] + var4, class229.field3911.field3715[0] + var6);
            if (var3.field3586.method1539((byte) 21)) {
                class96.method719(var3.field3743[0], var3.field3715[0], 0, (class28) null, (byte) 65, (class271) null, var3, class274.field4798);
            }
        }
        class65.field1288.method360(true);
        if (arg0 < 68) {
            method776(-78);
        }
    }
}
