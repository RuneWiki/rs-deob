import jagex3.jagmisc.jagmisc;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class303 extends class310 {

    @OriginalMember(owner = "client!wb", name = "wb", descriptor = "Z")
    public boolean field4717 = false;

    @OriginalMember(owner = "client!wb", name = "Hb", descriptor = "Z")
    public boolean field4728 = false;

    @OriginalMember(owner = "client!wb", name = "vb", descriptor = "Z")
    public boolean field4716 = false;

    @OriginalMember(owner = "client!wb", name = "Db", descriptor = "Z")
    public boolean field4724 = false;

    @OriginalMember(owner = "client!wb", name = "qb", descriptor = "Z")
    public boolean field4711 = false;

    @OriginalMember(owner = "client!wb", name = "ub", descriptor = "Z")
    public static boolean field4715 = false;

    @OriginalMember(owner = "client!wb", name = "rb", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!wb", name = "sb", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!wb", name = "tb", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!wb", name = "xb", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!wb", name = "yb", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!wb", name = "zb", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!wb", name = "Ab", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!wb", name = "Bb", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!wb", name = "Cb", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!wb", name = "Eb", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!wb", name = "Fb", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!wb", name = "Gb", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!wb", name = "Ib", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!wb", name = "Jb", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!wb", name = "Kb", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!wb", name = "Lb", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!wb", name = "Mb", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!wb", name = "Nb", descriptor = "I")
    public int field4734;

    @OriginalMember(owner = "client!wb", name = "Ob", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!wb", name = "Pb", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!wb", name = "Qb", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!wb", name = "Rb", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lie;I)V")
    private final void method2083(class6 arg0, int arg1) {
        ++field4730;
        if (~(arg0.field96.length + -arg0.field57) <= -2) {
            int var3 = arg0.method70(-9059);
            if (var3 >= 0 && var3 <= 22) {
                byte var4;
                if (~var3 != -23) {
                    if (~var3 != -22) {
                        if (var3 != 20) {
                            if (var3 == 19) {
                                var4 = 42;
                            } else if (var3 != 18) {
                                if (var3 == 17) {
                                    var4 = 40;
                                } else if (var3 != 16) {
                                    if (~var3 != -16) {
                                        if (var3 != 14) {
                                            if (var3 == 13) {
                                                var4 = 35;
                                            } else if (~var3 == -13) {
                                                var4 = 34;
                                            } else if (~var3 != -12) {
                                                if (~var3 != -11) {
                                                    if (var3 != 9) {
                                                        if (var3 != 8) {
                                                            if (~var3 != -8) {
                                                                if (var3 == 6) {
                                                                    var4 = 28;
                                                                } else if (~var3 == -6) {
                                                                    var4 = 28;
                                                                } else if (var3 == 4) {
                                                                    var4 = 24;
                                                                } else if (~var3 == -4) {
                                                                    var4 = 23;
                                                                } else if (~var3 != -3) {
                                                                    if (~var3 != -2) {
                                                                        var4 = 19;
                                                                    } else {
                                                                        var4 = 23;
                                                                    }
                                                                } else {
                                                                    var4 = 22;
                                                                }
                                                            } else {
                                                                var4 = 29;
                                                            }
                                                        } else {
                                                            var4 = 30;
                                                        }
                                                    } else {
                                                        var4 = 31;
                                                    }
                                                } else {
                                                    var4 = 32;
                                                }
                                            } else {
                                                var4 = 33;
                                            }
                                        } else {
                                            var4 = 36;
                                        }
                                    } else {
                                        var4 = 37;
                                    }
                                } else {
                                    var4 = 38;
                                }
                            } else {
                                var4 = 41;
                            }
                        } else {
                            var4 = 43;
                        }
                    } else {
                        var4 = 44;
                    }
                } else {
                    var4 = 45;
                }
                if (arg0.field96.length + -arg0.field57 >= var4) {
                    super.field4861 = arg0.method70(-9059);
                    if (super.field4861 >= 1) {
                        if (super.field4861 > 4) {
                            super.field4861 = 4;
                        }
                    } else {
                        super.field4861 = 1;
                    }
                    this.method2101((byte) 24, arg0.method70(-9059) == 1);
                    super.field4850 = arg0.method70(arg1 ^ -9059) == 1;
                    super.field4881 = ~arg0.method70(-9059) == -2;
                    super.field4873 = ~arg0.method70(-9059) == -2;
                    super.field4849 = ~arg0.method70(arg1 + -9059) == -2 ? 1 : 0;
                    super.field4852 = arg0.method70(-9059) == 1;
                    super.field4877 = ~arg0.method70(-9059) == -2;
                    super.field4887 = arg0.method70(-9059) == 1;
                    super.field4889 = arg0.method70(-9059);
                    if (super.field4889 > 2) {
                        super.field4889 = 2;
                    }
                    if (var3 >= 17) {
                        super.field4858 = arg0.method70(arg1 ^ -9059);
                    }
                    if (~var3 <= -3) {
                        super.field4869 = ~arg0.method70(-9059) == -2;
                        if (~var3 <= -18) {
                            super.field4859 = arg0.method70(-9059) == 1;
                        }
                    } else {
                        super.field4869 = ~arg0.method70(-9059) == -2;
                        arg0.method70(-9059);
                    }
                    super.field4853 = arg0.method70(-9059) == 1;
                    super.field4848 = ~arg0.method70(-9059) == -2;
                    super.field4880 = arg0.method70(-9059);
                    if (~super.field4880 < -3) {
                        super.field4880 = 2;
                    }
                    super.field4846 = super.field4880;
                    super.field4862 = arg0.method70(-9059) == 1;
                    super.field4860 = arg0.method70(-9059);
                    if (~super.field4860 < -128) {
                        super.field4860 = 127;
                    }
                    if (~var3 > -21) {
                        super.field4875 = super.field4860;
                    } else {
                        super.field4875 = arg0.method70(-9059);
                        if (~super.field4875 < -128) {
                            super.field4875 = 127;
                        }
                    }
                    super.field4864 = arg0.method70(-9059);
                    super.field4847 = arg0.method70(-9059);
                    if (super.field4847 > 127) {
                        super.field4847 = 127;
                    }
                    if (var3 >= 21) {
                        super.field4863 = arg0.method70(arg1 ^ -9059);
                        if (~super.field4863 < -128) {
                            super.field4863 = 127;
                        }
                    } else {
                        super.field4863 = super.field4864;
                    }
                    if (var3 >= 1) {
                        super.field4896 = arg0.method67(arg1 + 12021);
                        super.field4857 = arg0.method67(12021);
                    }
                    if (~var3 <= -4 && ~var3 > -7) {
                        arg0.method70(-9059);
                    }
                    if (~var3 <= -5) {
                        int var5 = arg0.method70(-9059);
                        if (var5 < 0 || ~var5 < -3) {
                            var5 = 0;
                        }
                        if (class204.field3324 < 96) {
                            var5 = 0;
                        }
                        class300.method2074(var5, (byte) 72);
                    }
                    if (~var3 <= -6) {
                        super.field4894 = arg0.method72(-27);
                    }
                    int var6 = 0;
                    if (~var3 <= -7) {
                        super.field4865 = var6 = arg0.method70(-9059);
                    }
                    if (~super.field4865 != -2 && ~super.field4865 != -3) {
                        super.field4865 = 2;
                    }
                    if (var3 >= 7) {
                        super.field4897 = ~arg0.method70(-9059) == -2;
                    }
                    if (var3 >= 8) {
                        super.field4878 = arg0.method70(arg1 ^ -9059) == 1;
                    }
                    if (~var3 <= -10) {
                        super.field4856 = arg0.method70(arg1 ^ -9059);
                    }
                    if (~super.field4856 > -1 || super.field4856 > class258.method1825(class204.field3324, -14)) {
                        super.field4856 = 0;
                    }
                    if (~var3 <= -11) {
                        super.field4891 = ~arg0.method70(-9059) != -1;
                    }
                    if (var3 >= 11) {
                        super.field4851 = arg0.method70(-9059) != 0;
                    }
                    if (~var3 <= -13) {
                        super.field4849 = arg0.method70(-9059);
                    }
                    if (~super.field4849 > -1 || super.field4849 > 2) {
                        super.field4849 = 1;
                    }
                    if (var3 >= 13) {
                        super.field4890 = arg0.method70(arg1 ^ -9059) == 1;
                    }
                    if (var3 < 14) {
                        if (~var6 != -1) {
                            super.field4868 = 1;
                        } else {
                            super.field4868 = 2;
                        }
                    } else {
                        super.field4868 = arg0.method70(-9059);
                    }
                    if (~super.field4868 > -1 || ~super.field4868 < -6) {
                        super.field4868 = 2;
                    }
                    if (~var3 <= -16) {
                        super.field4854 = arg0.method70(-9059);
                        if (super.field4854 < 0 || ~super.field4854 < -5) {
                            super.field4854 = ~class369.field5783 != -2 ? 4 : 2;
                        }
                    }
                    if (~var3 <= -17) {
                        super.field4872 = ~arg0.method70(-9059) == -2;
                        try {
                            if (~jagmisc.getTotalPhysicalMemory() >= -268435457L) {
                                super.field4872 = false;
                            }
                        } catch (Throwable var7) {
                        }
                    }
                    if (~var3 > -18 && super.field4868 == 0) {
                        super.field4868 = 2;
                    }
                    if (var3 >= 18) {
                        super.field4870 = arg0.method70(-9059);
                        if (super.field4870 < 0 || super.field4870 > 4) {
                            super.field4870 = 0;
                        }
                    }
                    if (~var3 <= -20) {
                        super.field4885 = arg0.method70(-9059);
                    } else if (~super.field4870 != -2 && super.field4870 != 2) {
                        if (~super.field4870 == -4) {
                            super.field4885 = 1;
                        } else {
                            super.field4885 = 0;
                        }
                    } else {
                        super.field4885 = 2;
                    }
                    if (~var3 <= -23) {
                        super.field4886 = arg0.method70(-9059);
                    }
                    if (super.field4868 == arg1 && class204.field3324 < 96 && ~super.field4870 != -2 && super.field4870 != 0) {
                        this.method2096(false, 1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(B)V")
    public static final void method2084(byte arg0) {
        ++field4725;
        if (class385.field5986 < 102) {
            class385.field5986 += 6;
        }
        if (class570.field8160 != -1 && ~class514.field7477 > ~class112.method1033(-11752)) {
            for (int var1 = class570.field8160; var1 < class455.field6839.length; ++var1) {
                if (class455.field6839[var1].startsWith("pause")) {
                    int var2 = 5;
                    try {
                        var2 = Integer.parseInt(class455.field6839[var1].substring(6));
                    } catch (Exception var14) {
                    }
                    class529.method3200("Pausing for " + var2 + " seconds...", -101);
                    class570.field8160 = var1 + 1;
                    class514.field7477 = class112.method1033(-11752) - -((long) (var2 * 1000));
                    return;
                }
                class66.field855 = class455.field6839[var1];
                class259.method1832(false, false);
            }
            class570.field8160 = -1;
        }
        if (class259.field4142 != 0) {
            class106.field1729 -= class259.field4142 * 5;
            if (class106.field1729 >= class706.field9990) {
                class106.field1729 = class706.field9990 + -1;
            }
            if (~class106.field1729 > -1) {
                class106.field1729 = 0;
            }
            class259.field4142 = 0;
        }
        for (int var3 = 0; var3 < class345.field5560; ++var3) {
            class291 var4 = class365.field5738[var3];
            int var5 = var4.method2053(4006);
            char var6 = var4.method2051((byte) 104);
            int var7 = var4.method2050((byte) 35);
            if (~var5 == -85) {
                class259.method1832(false, false);
            }
            if (~var5 == -81) {
                class259.method1832(false, true);
            } else if (var5 == 66 && (4 & var7) != 0) {
                if (class614.field8723 != null) {
                    String var11 = "";
                    for (int var12 = class589.field8381.length - 1; var12 >= 0; --var12) {
                        if (class589.field8381[var12] != null && ~class589.field8381[var12].length() < -1) {
                            var11 = var11 + class589.field8381[var12] + '\n';
                        }
                    }
                    class614.field8723.setContents(new StringSelection(var11), (ClipboardOwner) null);
                }
            } else if (var5 == 67 && ~(var7 & 4) != -1) {
                if (class614.field8723 != null) {
                    Transferable var8 = class614.field8723.getContents((Object) null);
                    if (var8 != null) {
                        try {
                            String var9 = (String) var8.getTransferData(DataFlavor.stringFlavor);
                            if (var9 != null) {
                                String[] var10 = class698.method3944('\n', var9, -4);
                                class531.method3212(var10, 1);
                            }
                        } catch (Exception var15) {
                        }
                    }
                }
            } else if (~var5 == -86 && class384.field5944 > 0) {
                class66.field855 = class66.field855.substring(0, class384.field5944 + -1) + class66.field855.substring(class384.field5944);
                --class384.field5944;
            } else if (~var5 == -102 && class384.field5944 < class66.field855.length()) {
                class66.field855 = class66.field855.substring(0, class384.field5944) + class66.field855.substring(class384.field5944 + 1);
            } else if (~var5 == -97 && class384.field5944 > 0) {
                --class384.field5944;
            } else if (var5 == 97 && class384.field5944 < class66.field855.length()) {
                ++class384.field5944;
            } else if (var5 != 102) {
                if (var5 == 103) {
                    class384.field5944 = class66.field855.length();
                } else if (~var5 == -105 && ~class200.field3260 > ~class589.field8381.length) {
                    ++class200.field3260;
                    class30.method436((byte) 76);
                    class384.field5944 = class66.field855.length();
                } else if (var5 == 105 && ~class200.field3260 < -1) {
                    --class200.field3260;
                    class30.method436((byte) 81);
                    class384.field5944 = class66.field855.length();
                } else if (class531.method3211(-116, var6) || var6 == '\\' || var6 == '/' || var6 == '.' || var6 == ':' || ~var6 == -45 || var6 == ' ' || var6 == '_' || var6 == '-' || var6 == '+' || var6 == '[' || var6 == ']') {
                    class66.field855 = class66.field855.substring(0, class384.field5944) + class365.field5738[var3].method2051((byte) 104) + class66.field855.substring(class384.field5944);
                    ++class384.field5944;
                }
            } else {
                class384.field5944 = 0;
            }
        }
        class345.field5560 = 0;
        int var13 = -61 / ((arg0 - -55) / 63);
        class496.field7236 = 0;
        class211.method1601(-20030);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)I")
    public final int method2085(boolean arg0) {
        ++field4735;
        boolean var2 = false;
        boolean var3 = false;
        boolean var4 = false;
        if (class402.field6207.field7655 && !class402.field6207.field7677) {
            if (class525.field7660.startsWith("win")) {
                var4 = true;
                if (!class525.field7659.startsWith("amd64") && !class525.field7659.startsWith("x86_64")) {
                    var2 = true;
                }
                var3 = true;
            } else {
                var3 = true;
            }
        }
        if (this.field4724) {
            var3 = false;
        }
        if (this.field4716) {
            var4 = false;
        }
        if (this.field4728) {
            var2 = false;
        }
        if (!var2 && !var3 && !var4) {
            return this.method2092(0);
        } else {
            int var5 = -1;
            if (!arg0) {
                return 29;
            } else {
                int var6 = -1;
                int var7 = -1;
                if (var2) {
                    try {
                        var5 = class126.method1106(-2066990686, 2, 1000);
                    } catch (Exception var16) {
                    }
                }
                if (var4) {
                    try {
                        var7 = class126.method1106(-2066990686, 3, 1000);
                        if (class497.field7259 == 3) {
                            class530 var8 = class627.field8857.method160();
                            long var9 = 281474976710655L & var8.field7731;
                            int var11 = var8.field7727;
                            if (var11 != 4318) {
                                if (var11 == 4098) {
                                    var3 &= ~var9 <= -60129613780L;
                                }
                            } else {
                                var3 &= ~var9 <= -64425238955L;
                            }
                        }
                    } catch (Exception var15) {
                    }
                }
                if (var3) {
                    try {
                        var6 = class126.method1106(-2066990686, 1, 1000);
                    } catch (Exception var14) {
                    }
                }
                if (var5 == -1 && var6 == -1 && var7 == -1) {
                    return this.method2092(0);
                } else {
                    int var12 = (int) ((float) var7 * 1.1F);
                    int var13 = (int) ((float) var6 * 1.1F);
                    if (var12 < var5 && var13 < var5) {
                        return this.method2091(var5, (byte) -10);
                    } else {
                        return var12 > var13 ? this.method2098(3, var12, 2) : this.method2098(1, var13, 2);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)I")
    public final int method2086(int arg0, int arg1) {
        ++field4729;
        if (arg0 != 32416) {
            return -89;
        } else if (class520.method3135(-30134, arg1) && !class327.method2206(class682.field9564, (byte) 99)) {
            return ~class204.field3324 > -97 && class97.method941(arg1, -49) && ~super.field4885 == -1 ? 1 : super.field4885;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
    public final void method2087(int arg0) {
        ++field4723;
        this.method2101((byte) 24, true);
        super.field4872 = true;
        super.field4869 = true;
        super.field4889 = super.field4858 = 2;
        super.field4887 = true;
        super.field4852 = true;
        if (arg0 != 756) {
            this.field4716 = true;
        }
        super.field4873 = true;
        super.field4849 = 1;
        super.field4880 = super.field4846 = 0;
        super.field4853 = true;
        super.field4877 = true;
        super.field4881 = true;
        super.field4859 = true;
        super.field4848 = true;
        super.field4850 = true;
        if (~class204.field3324 >= -96) {
            class300.method2074(0, (byte) 72);
        } else {
            class300.method2074(2, (byte) 72);
        }
        super.field4891 = false;
        super.field4890 = true;
        super.field4856 = 0;
        this.method2090((byte) 84);
        this.method2097(2, 0);
        super.field4870 = 4;
        class49.method574(arg0 ^ 714);
        class338.method2317(21);
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
    public final void method2088(int arg0) {
        ++field4719;
        this.method2101((byte) 24, true);
        super.field4850 = true;
        super.field4849 = 1;
        super.field4889 = super.field4858 = 1;
        super.field4887 = true;
        super.field4880 = super.field4846 = 0;
        super.field4853 = false;
        super.field4852 = true;
        super.field4881 = true;
        super.field4859 = false;
        super.field4869 = true;
        super.field4848 = true;
        super.field4877 = true;
        super.field4872 = true;
        super.field4873 = true;
        if (~class204.field3324 < -96) {
            class300.method2074(1, (byte) 72);
        } else {
            class300.method2074(0, (byte) 72);
        }
        super.field4890 = true;
        super.field4891 = false;
        super.field4856 = arg0;
        this.method2090((byte) 84);
        this.method2097(arg0 ^ 2, 1);
        super.field4870 = 3;
        class49.method574(4);
        class338.method2317(48);
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(II)Z")
    public final boolean method2089(int arg0, int arg1) {
        ++field4726;
        return ~arg0 == arg1 && !this.field4717 ? super.field4882 : true;
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(B)V")
    private final void method2090(byte arg0) {
        if (arg0 != 84) {
            this.field4716 = true;
        }
        if (~class369.field5783 < -2) {
            super.field4854 = 4;
        } else {
            super.field4854 = 2;
        }
        ++field4714;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB)I")
    private final int method2091(int arg0, byte arg1) {
        ++field4718;
        byte var3;
        if (~arg0 < -12001) {
            this.method2087(756);
            var3 = 4;
        } else if (arg0 <= 5000) {
            if (~arg0 < -2001) {
                var3 = 2;
                this.method2099(false);
            } else {
                var3 = 1;
                this.method2096(true, 1);
            }
        } else {
            var3 = 3;
            this.method2088(arg1 + 10);
        }
        if (class497.field7259 != 2) {
            super.field4868 = 2;
            class265.method1878(2, arg1 ^ 14465);
        }
        this.method2094(false, class402.field6207);
        if (arg1 != -10) {
            this.method2099(false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)I")
    private final int method2092(int arg0) {
        ++field4721;
        byte var2;
        if (~class204.field3324 > -97) {
            this.method2096(true, 1);
            var2 = 1;
        } else {
            int var3 = class520.method3132(55);
            if (~var3 < -101) {
                if (~var3 < -501) {
                    if (var3 <= 1000) {
                        this.method2099(false);
                        var2 = 2;
                    } else {
                        var2 = 1;
                        this.method2096(true, 1);
                    }
                } else {
                    var2 = 3;
                    this.method2088(arg0);
                }
            } else {
                var2 = 4;
                this.method2087(arg0 ^ 756);
            }
        }
        if (class497.field7259 != arg0) {
            super.field4868 = 0;
            class265.method1878(0, -14473);
        }
        this.method2094(false, class402.field6207);
        return var2;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)Z")
    public static final boolean method2093(int arg0, int arg1, int arg2) {
        if (arg2 != -11501) {
            return false;
        } else {
            ++field4713;
            return ~(458752 & arg1) != -1 | class542.method3282((byte) -116, arg0, arg1) || class247.method1758(arg1, -113, arg0);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZLk;)V")
    public final void method2094(boolean arg0, class525 arg1) {
        ++field4737;
        class441 var3 = null;
        try {
            if (arg0) {
                return;
            }
            class701 var4 = arg1.method3169(0, "", true);
            while (~var4.field9884 == -1) {
                class549.method3313(1L, 124);
            }
            if (~var4.field9884 == -2) {
                var3 = (class441) var4.field9885;
                class6 var5 = new class6(class641.method3718(arg0));
                this.method2130(false, var5);
                var3.method2783(var5.field96, 0, var5.field57, 110);
            }
        } catch (Exception var7) {
        }
        try {
            if (var3 != null) {
                var3.method2785(-1856);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(II)I")
    public final int method2095(int arg0, int arg1) {
        if (arg1 != 9408) {
            this.field4734 = -111;
        }
        ++field4731;
        if (this.field4711) {
            return 0;
        } else if (!this.method2089(arg0, -1)) {
            return 1;
        } else {
            return super.field4850 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(ZI)V")
    public final void method2096(boolean arg0, int arg1) {
        this.method2101((byte) 24, false);
        ++field4712;
        super.field4850 = false;
        super.field4881 = !class99.field1647.equals(client.field4436);
        super.field4880 = super.field4846 = 0;
        super.field4853 = false;
        super.field4852 = false;
        super.field4859 = false;
        super.field4849 = 0;
        super.field4887 = false;
        super.field4869 = false;
        super.field4877 = false;
        super.field4872 = false;
        super.field4848 = false;
        super.field4889 = super.field4858 = 0;
        super.field4873 = false;
        class300.method2074(0, (byte) 72);
        super.field4890 = false;
        super.field4891 = false;
        super.field4856 = 0;
        this.method2090((byte) 84);
        this.method2097(2, 2);
        super.field4870 = arg1;
        if (arg0) {
            class49.method574(118);
        }
        class338.method2317(-94);
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(II)V")
    public final void method2097(int arg0, int arg1) {
        class576.field8217 = null;
        class311.field4901 = true;
        if (arg0 != 2) {
            this.method2089(67, 103);
        }
        ++field4738;
        super.field4885 = arg1;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(III)I")
    private final int method2098(int arg0, int arg1, int arg2) {
        ++field4727;
        byte var4;
        if (arg1 <= 20000) {
            if (~arg1 < -10001) {
                this.method2088(arg2 ^ 2);
                var4 = 3;
            } else if (~arg1 < -5001) {
                this.method2099(false);
                var4 = 2;
            } else {
                var4 = 1;
                this.method2096(true, 1);
            }
        } else {
            var4 = 4;
            this.method2087(756);
        }
        if (~class497.field7259 != ~arg0) {
            super.field4868 = arg0;
            class265.method1878(arg0, arg2 + -14475);
        }
        if (arg2 != 2) {
            this.method2087(46);
        }
        this.method2094(false, class402.field6207);
        return var4;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(Z)V")
    public final void method2099(boolean arg0) {
        ++field4722;
        this.method2101((byte) 24, true);
        super.field4848 = false;
        super.field4850 = false;
        super.field4889 = super.field4858 = 0;
        super.field4869 = false;
        super.field4853 = false;
        super.field4877 = false;
        super.field4887 = false;
        super.field4873 = false;
        super.field4859 = false;
        super.field4880 = super.field4846 = 0;
        super.field4849 = 0;
        super.field4872 = false;
        super.field4881 = true;
        super.field4852 = arg0;
        class300.method2074(0, (byte) 72);
        super.field4890 = true;
        super.field4856 = 0;
        super.field4891 = false;
        this.method2090((byte) 84);
        this.method2097(2, 2);
        super.field4870 = 2;
        class49.method574(57);
        class338.method2317(-111);
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lk;)V")
    public class303(class525 arg0) {
        super.field4861 = 3;
        super.field4870 = 3;
        this.method2101((byte) 24, true);
        super.field4850 = true;
        super.field4853 = true;
        super.field4881 = true;
        super.field4889 = 2;
        super.field4896 = 0;
        super.field4858 = 0;
        super.field4864 = 127;
        super.field4859 = false;
        super.field4869 = true;
        super.field4846 = 0;
        super.field4857 = 0;
        super.field4862 = true;
        super.field4852 = true;
        super.field4877 = true;
        super.field4887 = true;
        super.field4875 = 127;
        super.field4849 = 1;
        super.field4873 = true;
        super.field4880 = 0;
        super.field4848 = true;
        super.field4860 = 127;
        super.field4847 = 127;
        super.field4863 = 127;
        if (~class204.field3324 <= -97) {
            class300.method2074(2, (byte) 72);
        } else {
            class300.method2074(0, (byte) 72);
        }
        super.field4897 = false;
        super.field4891 = false;
        super.field4856 = 0;
        super.field4868 = 2;
        super.field4878 = false;
        super.field4851 = true;
        super.field4885 = 0;
        super.field4865 = 2;
        super.field4854 = class369.field5783 == 1 ? 2 : 4;
        super.field4890 = true;
        super.field4894 = 0;
        class441 var2 = null;
        try {
            class701 var3 = arg0.method3169(0, "", true);
            while (var3.field9884 == 0) {
                class549.method3313(1L, 125);
            }
            if (var3.field9884 == 1) {
                var2 = (class441) var3.field9885;
                byte[] var4 = new byte[(int) var2.method2789(0)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method2790(var5, -1, var4.length + -var5, var4);
                    if (~var6 == 0) {
                        throw new IOException("EOF");
                    }
                }
                this.method2083(new class6(var4), 0);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method2785(-1856);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "(II)Z")
    public final boolean method2100(int arg0, int arg1) {
        ++field4720;
        return arg0 != arg1 ? true : super.field4882;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BZ)V")
    public final void method2101(byte arg0, boolean arg1) {
        if (arg0 != 24) {
            this.method2097(-48, 99);
        }
        super.field4882 = arg1;
        ++field4733;
        if (class213.field3537 != null) {
            class213.field3537.method95(!this.method2089(class497.field7259, -1), (byte) 113);
        }
    }
}
