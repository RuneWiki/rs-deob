import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class30 extends class105 {

    @OriginalMember(owner = "client!sg", name = "Z", descriptor = "I")
    private int field761 = 10;

    @OriginalMember(owner = "client!sg", name = "N", descriptor = "I")
    private int field750 = 2048;

    @OriginalMember(owner = "client!sg", name = "S", descriptor = "I")
    private int field755 = 0;

    @OriginalMember(owner = "client!sg", name = "db", descriptor = "Lvf;")
    public static class265 field765 = class87.method582(-46, ":clanreq:");

    @OriginalMember(owner = "client!sg", name = "jb", descriptor = "[Lma;")
    public static class244[] field771 = new class244[4];

    @OriginalMember(owner = "client!sg", name = "cb", descriptor = "Lvf;")
    public static class265 field764 = class87.method582(-46, "settings=");

    @OriginalMember(owner = "client!sg", name = "lb", descriptor = "I")
    public static int field773 = 0;

    @OriginalMember(owner = "client!sg", name = "O", descriptor = "Z")
    public static boolean field751 = false;

    @OriginalMember(owner = "client!sg", name = "ab", descriptor = "Lvf;")
    public static class265 field762 = class87.method582(-46, "www");

    @OriginalMember(owner = "client!sg", name = "fb", descriptor = "Lvf;")
    public static class265 field767 = class87.method582(-46, "<col=ffb000>");

    @OriginalMember(owner = "client!sg", name = "U", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!sg", name = "W", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!sg", name = "X", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!sg", name = "Y", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!sg", name = "bb", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!sg", name = "eb", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!sg", name = "gb", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!sg", name = "hb", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!sg", name = "ib", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!sg", name = "kb", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!sg", name = "mb", descriptor = "Lel;")
    public static class100 field774;

    @OriginalMember(owner = "client!sg", name = "V", descriptor = "Lfl;")
    public static class192 field757;

    @OriginalMember(owner = "client!sg", name = "Q", descriptor = "[B")
    public static byte[] field753;

    @OriginalMember(owner = "client!sg", name = "M", descriptor = "[I")
    private int[] field749;

    @OriginalMember(owner = "client!sg", name = "R", descriptor = "[I")
    private int[] field754;

    @OriginalMember(owner = "client!sg", name = "P", descriptor = "[Lcg;")
    public static class34[] field752;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)V")
    public static final void method245(byte arg0) {
        if (arg0 != 90) {
            field765 = null;
        }
        ++field756;
        if (~class226.field4020.toLowerCase().indexOf("microsoft") == 0) {
            class216.field3900[44] = 71;
            class216.field3900[61] = 27;
            class216.field3900[93] = 43;
            class216.field3900[47] = 73;
            class216.field3900[92] = 74;
            class216.field3900[45] = 26;
            class216.field3900[46] = 72;
            class216.field3900[59] = 57;
            class216.field3900[91] = 42;
            if (class226.field4023 != null) {
                class216.field3900[520] = 59;
                class216.field3900[192] = 28;
                class216.field3900[222] = 58;
            } else {
                class216.field3900[192] = 58;
                class216.field3900[222] = 59;
            }
        } else {
            class216.field3900[188] = 71;
            class216.field3900[190] = 72;
            class216.field3900[221] = 43;
            class216.field3900[187] = 27;
            class216.field3900[189] = 26;
            class216.field3900[186] = 57;
            class216.field3900[222] = 59;
            class216.field3900[220] = 74;
            class216.field3900[192] = 58;
            class216.field3900[223] = 28;
            class216.field3900[219] = 42;
            class216.field3900[191] = 73;
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V")
    public class30() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "(I)V")
    public static final void method246(int arg0) {
        if (class278.field4911 < 0) {
            class36.field842 = -1;
            class174.field3125 = -1;
            class278.field4911 = 0;
        }
        ++field758;
        if (class213.field3824 < class278.field4911) {
            class174.field3125 = -1;
            class36.field842 = -1;
            class278.field4911 = class213.field3824;
        }
        if (class263.field4590 < 0) {
            class263.field4590 = 0;
            class174.field3125 = -1;
            class36.field842 = -1;
        }
        if (class155.field2871 < class263.field4590) {
            class174.field3125 = -1;
            class263.field4590 = class155.field2871;
            class36.field842 = -1;
        }
        if (arg0 != 44) {
            method248(-58, -96);
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(Z)V")
    public final void method94(boolean arg0) {
        this.method247(-1551);
        ++field772;
        if (arg0) {
            field771 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "(I)V")
    private final void method247(int arg0) {
        this.field749 = new int[this.field761 - -1];
        ++field759;
        this.field754 = new int[this.field761 + 1];
        int var2 = 4096 / this.field761;
        if (arg0 == -1551) {
            int var3 = this.field750 * var2 >> 12;
            int var4 = 0;
            for (int var5 = 0; ~var5 > ~this.field761; ++var5) {
                this.field754[var5] = var4;
                this.field749[var5] = var3 + var4;
                var4 += var2;
            }
            this.field754[this.field761] = 4096;
            this.field749[this.field761] = this.field749[0] + 4096;
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)Z")
    public static final boolean method248(int arg0, int arg1) {
        ++field768;
        if (arg1 != 4) {
            method250(18);
        }
        return arg0 == 198 || ~arg0 == -231 || arg0 == 156 || arg0 == 140 || arg0 == 223;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)[I")
    public final int[] method16(int arg0, int arg1) {
        ++field770;
        int[] var3 = super.field1862.method458(arg1, false);
        if (arg0 != 8055) {
            field773 = -2;
        }
        if (super.field1862.field1236) {
            int var4 = class219.field3951[arg1];
            if (~this.field755 != -1) {
                for (int var5 = 0; ~class94.field1668 < ~var5; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class277.field4894[var5];
                    int var9 = this.field755;
                    if (~var9 != -2) {
                        if (~var9 != -3) {
                            if (var9 == 3) {
                                var6 = (-var4 + var8 >> 1) + 2048;
                            }
                        } else {
                            var6 = (var4 + var8 + -4096 >> 1) + 2048;
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; var10 < this.field761; ++var10) {
                        if (~this.field754[var10] >= ~var6 && this.field754[var10 - -1] > var6) {
                            if (~this.field749[var10] < ~var6) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; this.field761 > var12; ++var12) {
                    if (var4 >= this.field754[var12] && ~this.field754[var12 + 1] < ~var4) {
                        if (~this.field749[var12] < ~var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class194.method1346(var3, 0, class94.field1668, var11);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILfl;BILfl;)Lrh;")
    public static final class115 method249(int arg0, class192 arg1, byte arg2, int arg3, class192 arg4) {
        ++field769;
        if (!class28.method239(50, arg4, arg3, arg0)) {
            return null;
        } else {
            if (arg2 > -32) {
                field764 = null;
            }
            return class204.method1402(arg1.method1332(true, arg0, arg3), -126);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IILng;)V")
    public final void method12(int arg0, int arg1, class135 arg2) {
        if (arg1 != 255) {
            field751 = true;
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field755 = arg2.method920((byte) 26);
                }
            } else {
                this.field750 = arg2.method927(126);
            }
        } else {
            this.field761 = arg2.method920((byte) 79);
        }
        ++field766;
    }

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "(I)V")
    public static void method250(int arg0) {
        field764 = null;
        field767 = null;
        field752 = null;
        field771 = null;
        field757 = null;
        int var1 = -5 % ((58 - arg0) / 57);
        field753 = null;
        field765 = null;
        field762 = null;
        field774 = null;
    }
}
