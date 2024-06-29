import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class122 extends class288 {

    @OriginalMember(owner = "client!mh", name = "Q", descriptor = "I")
    private int field2058 = -1;

    @OriginalMember(owner = "client!mh", name = "L", descriptor = "Ljava/lang/String;")
    public static String field2053 = "Loading wordpack - ";

    @OriginalMember(owner = "client!mh", name = "D", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!mh", name = "F", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!mh", name = "G", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!mh", name = "H", descriptor = "I")
    private int field2049;

    @OriginalMember(owner = "client!mh", name = "J", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!mh", name = "K", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!mh", name = "M", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!mh", name = "N", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!mh", name = "O", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!mh", name = "P", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!mh", name = "R", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!mh", name = "S", descriptor = "I")
    private int field2060;

    @OriginalMember(owner = "client!mh", name = "T", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!mh", name = "I", descriptor = "Lmc;")
    public static class163 field2050;

    @OriginalMember(owner = "client!mh", name = "C", descriptor = "[I")
    private int[] field2044;

    @OriginalMember(owner = "client!mh", name = "E", descriptor = "[I")
    public static int[] field2046;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILeb;II)V")
    public static final void method852(int arg0, class103 arg1, int arg2, int arg3) {
        ++field2057;
        if (class238.field3815 == null && !class240.field3852) {
            if (arg1 != null && class138.method951(128, arg1) != null) {
                class238.field3815 = arg1;
                int var4 = 87 % ((arg0 - 13) / 44);
                class264.field4212 = class138.method951(128, arg1);
                class78.field1069 = false;
                class278.field4454 = arg2;
                class230.field3662 = arg3;
                class170.field2753 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lhi;BI)V")
    public final void method20(class264 arg0, byte arg1, int arg2) {
        if (arg1 != -19) {
            method855((byte) -91, (byte[]) null);
        }
        ++field2056;
        if (arg2 == 0) {
            this.field2058 = arg0.method1777(-128);
        }
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(I)V")
    public final void method571(int arg0) {
        super.method571(107);
        ++field2061;
        if (arg0 < 2) {
            this.field2058 = 78;
        }
        this.field2044 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public static final void method853(boolean arg0, Component arg1) {
        arg1.removeMouseListener(class9.field128);
        arg1.removeMouseMotionListener(class9.field128);
        arg1.removeFocusListener(class9.field128);
        class30.field361 = 0;
        ++field2055;
        if (!arg0) {
            method858(101, (class134) null, (class134) null);
        }
    }

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "(I)V")
    public static void method854(int arg0) {
        field2046 = null;
        if (arg0 >= 121) {
            field2050 = null;
            field2053 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B[B)V")
    public static final void method855(byte arg0, byte[] arg1) {
        class264 var2 = new class264(arg1);
        ++field2059;
        var2.field4195 = arg1.length + -2;
        class154.field2484 = var2.method1777(-63);
        class106.field1851 = new byte[class154.field2484][];
        class263.field4168 = new int[class154.field2484];
        class130.field2181 = new boolean[class154.field2484];
        class207.field3348 = new int[class154.field2484];
        class168.field2726 = new byte[class154.field2484][];
        class249.field3993 = new int[class154.field2484];
        class70.field968 = new int[class154.field2484];
        var2.field4195 = arg1.length + -7 + -(class154.field2484 * 8);
        class88.field1215 = var2.method1777(-49);
        class64.field904 = var2.method1777(-122);
        int var3 = (var2.method1779(-79) & 255) + 1;
        for (int var4 = 0; class154.field2484 > var4; ++var4) {
            class70.field968[var4] = var2.method1777(-70);
        }
        for (int var5 = 0; ~var5 > ~class154.field2484; ++var5) {
            class249.field3993[var5] = var2.method1777(-103);
        }
        for (int var6 = 0; class154.field2484 > var6; ++var6) {
            class207.field3348[var6] = var2.method1777(-114);
        }
        if (arg0 >= -60) {
            field2053 = null;
        }
        for (int var7 = 0; ~var7 > ~class154.field2484; ++var7) {
            class263.field4168[var7] = var2.method1777(-123);
        }
        var2.field4195 = -(class154.field2484 * 8) + -7 + arg1.length + -((var3 + -1) * 3);
        class131.field2187 = new int[var3];
        for (int var8 = 1; var8 < var3; ++var8) {
            class131.field2187[var8] = var2.method1732(87);
            if (class131.field2187[var8] == 0) {
                class131.field2187[var8] = 1;
            }
        }
        var2.field4195 = 0;
        for (int var9 = 0; ~var9 > ~class154.field2484; ++var9) {
            int var10 = class263.field4168[var9];
            int var11 = class207.field3348[var9];
            int var12 = var10 * var11;
            boolean var13 = false;
            byte[] var14 = new byte[var12];
            byte[] var15 = new byte[var12];
            class168.field2726[var9] = var15;
            class106.field1851[var9] = var14;
            int var16 = var2.method1779(-68);
            if ((var16 & 1) != 0) {
                int var17 = 0;
                label92: while (true) {
                    if (~var11 >= ~var17) {
                        if ((var16 & 2) == 0) {
                            break;
                        }
                        int var18 = 0;
                        while (true) {
                            if (~var18 <= ~var11) {
                                break label92;
                            }
                            for (int var19 = 0; ~var19 > ~var10; ++var19) {
                                byte var20 = var14[var11 * var19 + var18] = var2.method1767(16711680);
                                var13 |= ~var20 != 0;
                            }
                            ++var18;
                        }
                    }
                    for (int var21 = 0; ~var21 > ~var10; ++var21) {
                        var15[var17 - -(var11 * var21)] = var2.method1767(16711680);
                    }
                    ++var17;
                }
            } else {
                for (int var22 = 0; var12 > var22; ++var22) {
                    var15[var22] = var2.method1767(16711680);
                }
                if ((var16 & 2) != 0) {
                    for (int var23 = 0; ~var12 < ~var23; ++var23) {
                        byte var24 = var14[var23] = var2.method1767(16711680);
                        var13 |= var24 != -1;
                    }
                }
            }
            class130.field2181[var9] = var13;
        }
    }

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "(I)Z")
    private final boolean method856(int arg0) {
        ++field2047;
        if (arg0 != 1) {
            return false;
        } else if (this.field2044 != null) {
            return true;
        } else if (~this.field2058 <= -1) {
            int var2 = class186.field2986;
            int var3 = class205.field3296;
            int var4 = class23.field283.method1378(this.field2058, arg0 ^ 3138).field1886 ? 64 : 128;
            this.field2044 = class23.field283.method1372(var4, var4, false, 1.0F, 1, this.field2058);
            this.field2060 = var4;
            this.field2049 = var4;
            class232.method1535(var3, -30, var2);
            return this.field2044 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(B)I")
    public final int method857(byte arg0) {
        if (arg0 != -57) {
            method855((byte) -17, (byte[]) null);
        }
        ++field2045;
        return this.field2058;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)[[I")
    public final int[][] method34(int arg0, int arg1) {
        if (arg0 != 1) {
            field2053 = null;
        }
        ++field2051;
        int[][] var3 = super.field4598.method812(arg1, 65535);
        if (super.field4598.field1954 && this.method856(1)) {
            int var4 = (~class205.field3296 == ~this.field2049 ? arg1 : this.field2049 * arg1 / class205.field3296) * this.field2060;
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int[] var7 = var3[0];
            if (class186.field2986 != this.field2060) {
                for (int var8 = 0; ~class186.field2986 < ~var8; ++var8) {
                    int var9 = this.field2060 * var8 / class186.field2986;
                    int var10 = this.field2044[var4 + var9];
                    var6[var8] = class204.method1369(255, var10) << 4;
                    var5[var8] = class204.method1369(var10, 65280) >> 4;
                    var7[var8] = class204.method1369(16711680, var10) >> 12;
                }
            } else {
                for (int var11 = 0; ~var11 > ~class186.field2986; ++var11) {
                    int var12 = this.field2044[var4++];
                    var6[var11] = class204.method1369(255, var12) << 4;
                    var5[var11] = class204.method1369(65280, var12) >> 4;
                    var7[var11] = class204.method1369(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
    public class122() {
        super(0, false);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILjj;Ljj;)V")
    public static final void method858(int arg0, class134 arg1, class134 arg2) {
        if (arg0 == 19279) {
            class66.field934 = arg1;
            ++field2052;
            class20.field230 = arg2;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IBI)Leb;")
    public static final class103 method859(int arg0, byte arg1, int arg2) {
        class103 var3 = class168.method1180(8931, arg2);
        ++field2054;
        if (~arg0 == 0) {
            return var3;
        } else if (var3 != null && var3.field1624 != null && ~var3.field1624.length < ~arg0) {
            int var4 = -123 / ((arg1 - -56) / 32);
            return var3.field1624[arg0];
        } else {
            return null;
        }
    }
}
