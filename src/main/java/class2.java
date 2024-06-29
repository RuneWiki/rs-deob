import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class2 extends class259 {

    @OriginalMember(owner = "client!pa", name = "kb", descriptor = "I")
    private int field42 = 0;

    @OriginalMember(owner = "client!pa", name = "jb", descriptor = "I")
    private int field41 = 2048;

    @OriginalMember(owner = "client!pa", name = "nb", descriptor = "I")
    private int field45 = 10;

    @OriginalMember(owner = "client!pa", name = "fb", descriptor = "[Lsg;")
    public static class30[] field37 = new class30[1000];

    @OriginalMember(owner = "client!pa", name = "ab", descriptor = "Lsg;")
    public static class30 field32 = class167.method1221((byte) 33, "hitbar_default");

    @OriginalMember(owner = "client!pa", name = "Y", descriptor = "Lsg;")
    public static class30 field30 = class167.method1221((byte) 33, " loggt sich aus)3");

    @OriginalMember(owner = "client!pa", name = "lb", descriptor = "Z")
    public static boolean field43 = false;

    @OriginalMember(owner = "client!pa", name = "S", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!pa", name = "T", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!pa", name = "V", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!pa", name = "W", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!pa", name = "X", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!pa", name = "Z", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!pa", name = "cb", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!pa", name = "db", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!pa", name = "gb", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!pa", name = "ib", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!pa", name = "eb", descriptor = "Lkb;")
    public static class27 field36;

    @OriginalMember(owner = "client!pa", name = "U", descriptor = "Lcg;")
    public static class34 field26;

    @OriginalMember(owner = "client!pa", name = "bb", descriptor = "[I")
    public static int[] field33;

    @OriginalMember(owner = "client!pa", name = "hb", descriptor = "[I")
    private int[] field39;

    @OriginalMember(owner = "client!pa", name = "mb", descriptor = "[I")
    private int[] field44;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(B)V")
    public static void method10(byte arg0) {
        field26 = null;
        field37 = null;
        field32 = null;
        if (arg0 == -89) {
            field36 = null;
            field33 = null;
            field30 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IILaa;)V")
    public final void method4(int arg0, int arg1, class8 arg2) {
        if (arg1 != -1586849108) {
            this.method17(-107, true);
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field42 = arg2.method63((byte) 104);
                }
            } else {
                this.field41 = arg2.method65((byte) 109);
            }
        } else {
            this.field45 = arg2.method63((byte) 60);
        }
        ++field24;
    }

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "(I)V")
    public final void method11(int arg0) {
        ++field34;
        if (arg0 < 11) {
            this.field39 = null;
        }
        this.method12((byte) -124);
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(B)V")
    private final void method12(byte arg0) {
        this.field39 = new int[this.field45 - -1];
        ++field35;
        int var2 = 0;
        int var3 = 4096 / this.field45;
        this.field44 = new int[this.field45 + 1];
        int var4 = this.field41 * var3 >> 12;
        for (int var5 = 0; ~this.field45 < ~var5; ++var5) {
            this.field39[var5] = var2;
            this.field44[var5] = var2 + var4;
            var2 += var3;
        }
        if (arg0 != -124) {
            this.field44 = null;
        }
        this.field39[this.field45] = 4096;
        this.field44[this.field45] = 4096 - -this.field44[0];
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V")
    public class2() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BZLwj;)V")
    public static final void method13(byte arg0, boolean arg1, class180 arg2) {
        ++field25;
        if (arg0 != -73) {
            method15(-69, -108, true, 79, 100, 0);
        }
        int var3 = arg2.field3335;
        int var4 = (int) arg2.field4215;
        arg2.method1681(false);
        if (arg1) {
            class43.method444(0, var3);
        }
        class160.method1189(var3, arg0 ^ -24586);
        class31 var5 = class272.method1858(var4, 65535);
        if (var5 != null) {
            class254.method1771(var5, arg0 ^ -65);
        }
        int var6 = class52.field1165;
        for (int var7 = 0; var6 > var7; ++var7) {
            if (class174.method1278(class30.field602[var7], (byte) -124)) {
                class80.method697(var7, 1);
            }
        }
        if (~class52.field1165 != -2) {
            class201.method1429(class169.field3187, class163.field3039, true, class208.field3744, class202.field3594);
            int var8 = class223.field4000.method1456(class269.field4737);
            for (int var9 = 0; ~var9 > ~class52.field1165; ++var9) {
                int var10 = class223.field4000.method1456(class109.method864(0, var9));
                if (~var8 > ~var10) {
                    var8 = var10;
                }
            }
            class163.field3039 = var8 + 8;
            class202.field3594 = class52.field1165 * 15 + 22;
        } else {
            class94.field1890 = false;
            class201.method1429(class169.field3187, class163.field3039, true, class208.field3744, class202.field3594);
        }
        if (class196.field3548 != -1) {
            class185.method1325(class196.field3548, (byte) -57, 1);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZI)Lsh;")
    public static final class241 method14(boolean arg0, int arg1) {
        ++field29;
        class241 var2 = (class241) class251.field4436.method1644((byte) -63, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class172.field3215.method1115(class104.method836((byte) -122, arg1), (byte) -80, class215.method1571(true, arg1));
            class241 var4 = new class241();
            var4.field4310 = arg1;
            if (var3 != null) {
                var4.method1705(-118, new class8(var3));
            }
            if (arg0) {
                method15(-65, 121, false, -106, -112, -8);
            }
            var4.method1709((byte) 123);
            class251.field4436.method1646((long) arg1, var4, -121);
            return var4;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIZIII)Lbj;")
    public static final class44 method15(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        ++field40;
        int var7 = (arg3 << 19) + (arg1 - (-(arg2 ? 65536 : 0) - (arg0 << 17)));
        if (arg5 != -2010447821) {
            field30 = null;
        }
        long var8 = (long) arg4 * 3147483667L + (long) var7 * 3849834839L;
        class44 var10 = (class44) class14.field303.method1644((byte) -70, var8);
        if (var10 != null) {
            return var10;
        } else {
            class213.field3860 = false;
            class44 var11 = class54.method523(false, false, arg3, arg1, arg0, arg4, arg2, arg5 + 2010447696);
            if (var11 != null && !class213.field3860) {
                class14.field303.method1646(var8, var11, arg5 ^ 2010447807);
            }
            return var11;
        }
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(B)V")
    public static final void method16(byte arg0) {
        class3.field53 = null;
        class58.field1263 = null;
        class16.field332 = null;
        int var1 = -63 / ((arg0 - -41) / 55);
        ++field31;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZ)[I")
    public final int[] method17(int arg0, boolean arg1) {
        if (arg1) {
            method15(57, -68, false, -109, 108, 0);
        }
        ++field38;
        int[] var3 = super.field4581.method1841(18, arg0);
        if (super.field4581.field4729) {
            int var4 = class154.field2910[arg0];
            if (this.field42 != 0) {
                for (int var5 = 0; var5 < class223.field3999; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class29.field558[var5];
                    int var9 = this.field42;
                    if (~var9 != -2) {
                        if (~var9 != -3) {
                            if (~var9 == -4) {
                                var6 = (-var4 + var8 >> 1) + 2048;
                            }
                        } else {
                            var6 = (var4 + var8 + -4096 >> 1) + 2048;
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; var10 < this.field45; ++var10) {
                        if (this.field39[var10] <= var6 && ~this.field39[var10 + 1] < ~var6) {
                            if (~var6 > ~this.field44[var10]) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; ~this.field45 < ~var12; ++var12) {
                    if (var4 >= this.field39[var12] && var4 < this.field39[var12 - -1]) {
                        if (~this.field44[var12] < ~var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class26.method234(var3, 0, class223.field3999, var11);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(IB)V")
    public static final void method18(int arg0, byte arg1) {
        ++field27;
        if (arg1 != 10) {
            field26 = null;
        }
        class68 var2 = class103.method830(arg0, 4, 7);
        var2.method610(arg1 + 2141640534);
    }
}
