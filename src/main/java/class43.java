import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class43 extends class224 {

    @OriginalMember(owner = "client!dl", name = "H", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!dl", name = "I", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!dl", name = "K", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!dl", name = "M", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!dl", name = "N", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!dl", name = "O", descriptor = "I")
    public int field630;

    @OriginalMember(owner = "client!dl", name = "P", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!dl", name = "L", descriptor = "Lrg;")
    public class420 field627;

    @OriginalMember(owner = "client!dl", name = "J", descriptor = "[B")
    public byte[] field625;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZILbj;I)V")
    public static final void method286(int arg0, boolean arg1, int arg2, class146 arg3, int arg4) {
        if (arg1) {
            ++field623;
            class332 var5 = arg3.method924((byte) -32);
            int var6 = 16383 & -arg3.field2153.field1327 + arg3.field2112;
            if (arg4 == -1) {
                if (~var6 == -1 && ~arg3.field2150 >= -26) {
                    if (!arg3.field2121 || !var5.method2095(arg3.field2105, 104)) {
                        arg3.field2105 = var5.method2096(8868);
                        arg3.field2121 = arg3.field2105 != -1;
                    }
                } else {
                    arg3.field2121 = false;
                    if (arg2 < 0 && ~var5.field4811 != 0) {
                        arg3.field2105 = var5.field4811;
                    } else if (arg2 > 0 && var5.field4789 != -1) {
                        arg3.field2105 = var5.field4789;
                    } else {
                        arg3.field2105 = var5.field4792;
                    }
                }
            } else if (~arg3.field2125 == 0 || var6 < 10240 && ~var6 < -2049) {
                if (var6 == 0 && ~arg3.field2150 >= -26) {
                    arg3.field2121 = false;
                    if (arg4 == 2 && ~var5.field4815 != 0) {
                        arg3.field2105 = var5.field4815;
                    } else if (~arg4 == -1 && var5.field4819 != -1) {
                        arg3.field2105 = var5.field4819;
                    } else {
                        arg3.field2105 = var5.field4792;
                    }
                } else {
                    if (~arg4 == -3 && var5.field4815 != -1) {
                        if (~arg2 > -1 && ~var5.field4807 != 0) {
                            arg3.field2105 = var5.field4807;
                        } else if (~arg2 < -1 && ~var5.field4806 != 0) {
                            arg3.field2105 = var5.field4806;
                        } else {
                            arg3.field2105 = var5.field4815;
                        }
                    } else if (~arg4 == -1 && ~var5.field4819 != 0) {
                        if (arg2 < 0 && var5.field4795 != -1) {
                            arg3.field2105 = var5.field4795;
                        } else if (arg2 > 0 && ~var5.field4834 != 0) {
                            arg3.field2105 = var5.field4834;
                        } else {
                            arg3.field2105 = var5.field4819;
                        }
                    } else if (~arg2 > -1 && var5.field4796 != -1) {
                        arg3.field2105 = var5.field4796;
                    } else if (arg2 > 0 && var5.field4825 != -1) {
                        arg3.field2105 = var5.field4825;
                    } else {
                        arg3.field2105 = var5.field4792;
                    }
                    arg3.field2121 = false;
                }
            } else {
                int var7 = 16383 & class311.field4400[arg0] + -arg3.field2153.field1327;
                arg3.field2121 = false;
                if (~arg4 == -3 && ~var5.field4815 != 0) {
                    if (var7 > 2048 && ~var7 >= -6145 && ~var5.field4831 != 0) {
                        arg3.field2105 = var5.field4831;
                    } else if (~var7 <= -10241 && ~var7 > -14337 && ~var5.field4788 != 0) {
                        arg3.field2105 = var5.field4788;
                    } else if (~var7 < -6145 && var7 < 10240 && var5.field4794 != -1) {
                        arg3.field2105 = var5.field4794;
                    } else {
                        arg3.field2105 = var5.field4815;
                    }
                } else if (~arg4 == -1 && ~var5.field4819 != 0) {
                    if (var7 > 2048 && var7 <= 6144 && ~var5.field4816 != 0) {
                        arg3.field2105 = var5.field4816;
                    } else if (~var7 <= -10241 && ~var7 > -14337 && var5.field4833 != -1) {
                        arg3.field2105 = var5.field4833;
                    } else if (var7 > 6144 && ~var7 > -10241 && var5.field4793 != -1) {
                        arg3.field2105 = var5.field4793;
                    } else {
                        arg3.field2105 = var5.field4819;
                    }
                } else if (~var7 < -2049 && ~var7 >= -6145 && var5.field4838 != -1) {
                    arg3.field2105 = var5.field4838;
                } else if (~var7 <= -10241 && var7 < 14336 && ~var5.field4791 != 0) {
                    arg3.field2105 = var5.field4791;
                } else if (var7 > 6144 && var7 < 10240 && var5.field4828 != -1) {
                    arg3.field2105 = var5.field4828;
                } else {
                    arg3.field2105 = var5.field4792;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BI)V")
    public static final void method287(byte arg0, int arg1) {
        class479.field6719 = arg1;
        class303.field4313 = 3;
        if (arg0 > 126) {
            class269.field3930 = -1;
            class393.field5582 = 100;
            ++field626;
        }
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(I)I")
    public final int method288(int arg0) {
        ++field631;
        if (super.field3393) {
            return 0;
        } else {
            if (arg0 != 0) {
                method290(77);
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "(B)[B")
    public final byte[] method289(byte arg0) {
        if (arg0 >= -104) {
            this.field630 = 56;
        }
        ++field624;
        if (super.field3393) {
            throw new RuntimeException();
        } else {
            return this.field625;
        }
    }

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "(I)V")
    public static final void method290(int arg0) {
        ++field628;
        if (!class258.field3770) {
            if (class314.field4438.field5782) {
                class157.field2346 = (float) ((int) class157.field2346 + 191 & -128);
            } else {
                class111.field1413 += (-class111.field1413 + 24.0F) / 2.0F;
            }
            if (arg0 == 100) {
                class258.field3770 = true;
                class132.field1732 = true;
            }
        }
    }
}
