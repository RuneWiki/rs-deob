import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class89 extends class82 {

    @OriginalMember(owner = "client!ia", name = "T", descriptor = "I")
    private int field1690 = 4096;

    @OriginalMember(owner = "client!ia", name = "S", descriptor = "I")
    private int field1689 = 0;

    @OriginalMember(owner = "client!ia", name = "V", descriptor = "Ldj;")
    private static class44 field1692 = method650(255, " has logged in)3");

    @OriginalMember(owner = "client!ia", name = "ab", descriptor = "[I")
    public static int[] field1697 = new int[128];

    @OriginalMember(owner = "client!ia", name = "U", descriptor = "Ldj;")
    public static class44 field1691 = field1692;

    @OriginalMember(owner = "client!ia", name = "P", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!ia", name = "Q", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!ia", name = "R", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!ia", name = "W", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!ia", name = "X", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!ia", name = "Y", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!ia", name = "Z", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILjava/lang/String;)Ldj;")
    public static final class44 method650(int arg0, String arg1) {
        ++field1688;
        byte[] var2 = arg1.getBytes();
        int var3 = var2.length;
        if (arg0 != 255) {
            field1691 = null;
        }
        class44 var4 = new class44();
        int var5 = 0;
        var4.field822 = new byte[var3];
        while (var3 > var5) {
            int var6 = var2[var5++] & 255;
            if (var6 <= 45 && ~var6 <= -41) {
                if (~var5 <= ~var3) {
                    break;
                }
                int var7 = 255 & var2[var5++];
                var4.field822[var4.field849++] = (byte) ((var6 - 40) * 43 + var7 + -48);
            } else if (~var6 != -1) {
                var4.field822[var4.field849++] = (byte) var6;
            }
        }
        var4.method311((byte) -118);
        return var4.method325(-62);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILve;)V")
    public static final void method651(int arg0, class225 arg1) {
        ++field1694;
        if (arg0 != 128) {
            method650(-18, (String) null);
        }
        class74.field1427 = arg1;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field1693;
        if (arg0 != 25238) {
            method654((byte) -8);
        }
        int[] var3 = super.field1595.method603(true, arg1);
        if (super.field1595.field1538) {
            int[] var4 = this.method620(2652, arg1, 0);
            for (int var5 = 0; ~class129.field2287 < ~var5; ++var5) {
                int var6 = var4[var5];
                if (~this.field1689 < ~var6) {
                    var3[var5] = this.field1689;
                } else if (this.field1690 >= var6) {
                    var3[var5] = var6;
                } else {
                    var3[var5] = this.field1690;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IILvc;)Ldj;")
    public static final class44 method652(int arg0, int arg1, class223 arg2) {
        ++field1687;
        if (!class2.method12(arg0, -6, class117.method821(arg2, 21064)) && arg2.field4095 == null) {
            return null;
        } else if (arg1 != 0) {
            return null;
        } else if (arg2.field4051 != null && ~arg0 > ~arg2.field4051.length && arg2.field4051[arg0] != null && ~arg2.field4051[arg0].method339(-11196).method340(3) != -1) {
            return arg2.field4051[arg0];
        } else {
            return class153.field2669 ? class70.method555(new class44[] { class8.field165, class199.method1287(arg0, -1) }, arg1 + -3) : null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
    public class89() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lfj;IB)V")
    public final void method2(class66 arg0, int arg1, byte arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field1599 = ~arg0.method506(255) == -2;
                }
            } else {
                this.field1690 = arg0.method500(59);
            }
        } else {
            this.field1689 = arg0.method500(arg2 + 51);
        }
        if (arg2 != 68) {
            field1692 = null;
        }
        ++field1696;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V")
    public static final void method653(boolean arg0) {
        for (class29 var1 = (class29) class78.field1503.method1189(0); var1 != null; var1 = (class29) class78.field1503.method1192((byte) -111)) {
            if (var1.field510 != null) {
                class36.field634.method109(var1.field510);
                var1.field510 = null;
            }
            if (var1.field519 != null) {
                class36.field634.method109(var1.field519);
                var1.field519 = null;
            }
        }
        ++field1686;
        class78.field1503.method1193((byte) 26);
        if (!arg0) {
            method651(120, (class225) null);
        }
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(II)[[I")
    public final int[][] method6(int arg0, int arg1) {
        if (arg0 >= -59) {
            field1697 = null;
        }
        ++field1695;
        int[][] var3 = super.field1601.method548(arg1, true);
        if (super.field1601.field1343) {
            int[][] var4 = this.method619(arg1, true, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; class129.field2287 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (~var12 <= ~this.field1689) {
                    if (var12 <= this.field1690) {
                        var8[var11] = var12;
                    } else {
                        var8[var11] = this.field1690;
                    }
                } else {
                    var8[var11] = this.field1689;
                }
                if (var13 < this.field1689) {
                    var10[var11] = this.field1689;
                } else if (var13 > this.field1690) {
                    var10[var11] = this.field1690;
                } else {
                    var10[var11] = var13;
                }
                if (var14 >= this.field1689) {
                    if (var14 <= this.field1690) {
                        var9[var11] = var14;
                    } else {
                        var9[var11] = this.field1690;
                    }
                } else {
                    var9[var11] = this.field1689;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(B)V")
    public static void method654(byte arg0) {
        int var1 = -117 % ((arg0 - 13) / 53);
        field1697 = null;
        field1692 = null;
        field1691 = null;
    }
}
