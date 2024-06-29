import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class505 extends class340 implements class281 {

    @OriginalMember(owner = "client!od", name = "kb", descriptor = "Z")
    private boolean field7212 = false;

    @OriginalMember(owner = "client!od", name = "lb", descriptor = "Liea;")
    public class477 field7213;

    @OriginalMember(owner = "client!od", name = "ob", descriptor = "Z")
    private boolean field7216;

    @OriginalMember(owner = "client!od", name = "ib", descriptor = "F")
    public static float field7210;

    @OriginalMember(owner = "client!od", name = "S", descriptor = "I")
    public static int field7194;

    @OriginalMember(owner = "client!od", name = "T", descriptor = "I")
    public static int field7195;

    @OriginalMember(owner = "client!od", name = "U", descriptor = "I")
    public static int field7196;

    @OriginalMember(owner = "client!od", name = "V", descriptor = "I")
    public static int field7197;

    @OriginalMember(owner = "client!od", name = "W", descriptor = "I")
    public static int field7198;

    @OriginalMember(owner = "client!od", name = "X", descriptor = "I")
    public static int field7199;

    @OriginalMember(owner = "client!od", name = "Y", descriptor = "I")
    public static int field7200;

    @OriginalMember(owner = "client!od", name = "Z", descriptor = "I")
    public static int field7201;

    @OriginalMember(owner = "client!od", name = "bb", descriptor = "I")
    public static int field7203;

    @OriginalMember(owner = "client!od", name = "cb", descriptor = "I")
    public static int field7204;

    @OriginalMember(owner = "client!od", name = "db", descriptor = "I")
    public static int field7205;

    @OriginalMember(owner = "client!od", name = "eb", descriptor = "I")
    public static int field7206;

    @OriginalMember(owner = "client!od", name = "fb", descriptor = "I")
    public static int field7207;

    @OriginalMember(owner = "client!od", name = "gb", descriptor = "I")
    public static int field7208;

    @OriginalMember(owner = "client!od", name = "hb", descriptor = "I")
    public static int field7209;

    @OriginalMember(owner = "client!od", name = "jb", descriptor = "I")
    public static int field7211;

    @OriginalMember(owner = "client!od", name = "mb", descriptor = "I")
    public static int field7214;

    @OriginalMember(owner = "client!od", name = "nb", descriptor = "I")
    public static int field7215;

    @OriginalMember(owner = "client!od", name = "pb", descriptor = "I")
    public static int field7217;

    @OriginalMember(owner = "client!od", name = "ab", descriptor = "Llca;")
    private class642 field7202;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BLha;)Llba;", line = 5)
    public final class547 method994(byte arg0, class58 arg1) {
        ++field7203;
        class470 var3 = this.field7213.method2866(true, arg1, false, 1, 2048);
        if (var3 == null) {
            return null;
        } else {
            class165 var4 = arg1.method422();
            if (arg0 != -112) {
                field7210 = 0.6744667F;
            }
            var4.method1019(super.field4635, super.field4627, super.field4629);
            class547 var5 = class652.method3702(this.field7216, -9477, 1);
            this.field7213.method2868(super.field4402, super.field4387, var3, super.field4390, var4, super.field4395, arg1, (byte) -14, true);
            if (class626.field8994) {
                var3.method188(var4, var5.field7870[0], class586.field8268, 0);
            } else {
                var3.method228(var4, var5.field7870[0], 0);
            }
            if (this.field7213.field6807 != null) {
                class713 var6 = this.field7213.field6807.method1538();
                if (class626.field8994) {
                    arg1.method402(var6, class586.field8268);
                } else {
                    arg1.method391(var6);
                }
            }
            this.field7212 = var3.method197() || this.field7213.field6807 != null;
            if (this.field7202 != null) {
                class206.method1232(super.field4635, super.field4629, var3, super.field4627, this.field7202, 111);
            } else {
                this.field7202 = class191.method1161(super.field4629, var3, super.field4635, super.field4627, 4371);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "(Z)I", line = 51)
    public final int method992(boolean arg0) {
        if (arg0) {
            return -20;
        } else {
            ++field7199;
            return this.field7213.method2862(true);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZLha;Lrr;IIII)V", line = 62)
    public final void method987(boolean arg0, class58 arg1, class361 arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 == 0) {
            ++field7211;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!od", name = "g", descriptor = "(I)Z", line = 73)
    public final boolean method989(int arg0) {
        if (arg0 >= -112) {
            this.field7213 = null;
        }
        ++field7197;
        return this.field7212;
    }

    @OriginalMember(owner = "client!od", name = "j", descriptor = "(I)V", line = 84)
    public static final void method3004(int arg0) {
        if (class687.field9704 < 102) {
            class687.field9704 += 6;
        }
        ++field7215;
        if (class726.field10150 != -1 && class652.method3700(-1) > class384.field5347) {
            for (int var1 = class726.field10150; class248.field3012.length > var1; ++var1) {
                if (class248.field3012[var1].startsWith("pause")) {
                    int var2 = 5;
                    try {
                        var2 = Integer.parseInt(class248.field3012[var1].substring(6));
                    } catch (Exception var13) {
                    }
                    class599.method3408("Pausing for " + var2 + " seconds...", (byte) -36);
                    class726.field10150 = var1 - -1;
                    class384.field5347 = class652.method3700(-1) + (long) (var2 * 1000);
                    return;
                }
                class417.field5723 = class248.field3012[var1];
                class644.method3668(false, (byte) -119);
            }
            class726.field10150 = -1;
        }
        if (class381.field5214 != 0) {
            class185.field2210 -= class381.field5214 * 5;
            if (class626.field8989 <= class185.field2210) {
                class185.field2210 = class626.field8989 + -1;
            }
            class381.field5214 = 0;
            if (~class185.field2210 > -1) {
                class185.field2210 = 0;
            }
        }
        int var3 = 0;
        if (arg0 != 101) {
            method3004(118);
        }
        while (~class183.field2202 < ~var3) {
            class426 var4 = class266.field3307[var3];
            int var5 = var4.method2517(84);
            char var6 = var4.method2514((byte) 35);
            int var7 = var4.method2518(false);
            if (~var5 == -85) {
                class644.method3668(false, (byte) 52);
            }
            if (~var5 == -81) {
                class644.method3668(true, (byte) 67);
            } else if (var5 == 66 && (var7 & 4) != 0) {
                if (class667.field9489 != null) {
                    String var11 = "";
                    for (int var12 = class15.field140.length + -1; ~var12 <= -1; --var12) {
                        if (class15.field140[var12] != null && class15.field140[var12].length() > 0) {
                            var11 = var11 + class15.field140[var12] + '\n';
                        }
                    }
                    class667.field9489.setContents(new StringSelection(var11), (ClipboardOwner) null);
                }
            } else if (var5 == 67 && (4 & var7) != 0) {
                if (class667.field9489 != null) {
                    Transferable var8 = class667.field9489.getContents((Object) null);
                    if (var8 != null) {
                        try {
                            String var9 = (String) var8.getTransferData(DataFlavor.stringFlavor);
                            if (var9 != null) {
                                String[] var10 = class625.method3586(var9, '\n', -16647);
                                class717.method3999((byte) -127, var10);
                            }
                        } catch (Exception var14) {
                        }
                    }
                }
            } else if (~var5 == -86 && ~class607.field8623 < -1) {
                class417.field5723 = class417.field5723.substring(0, class607.field8623 + -1) + class417.field5723.substring(class607.field8623);
                --class607.field8623;
            } else if (var5 == 101 && class607.field8623 < class417.field5723.length()) {
                class417.field5723 = class417.field5723.substring(0, class607.field8623) + class417.field5723.substring(class607.field8623 + 1);
            } else if (var5 == 96 && ~class607.field8623 < -1) {
                --class607.field8623;
            } else if (~var5 == -98 && class607.field8623 < class417.field5723.length()) {
                ++class607.field8623;
            } else if (~var5 == -103) {
                class607.field8623 = 0;
            } else if (~var5 != -104) {
                if (var5 == 104 && class544.field7822 < class15.field140.length) {
                    ++class544.field7822;
                    class512.method3029(true);
                    class607.field8623 = class417.field5723.length();
                } else if (var5 == 105 && ~class544.field7822 < -1) {
                    --class544.field7822;
                    class512.method3029(true);
                    class607.field8623 = class417.field5723.length();
                } else if (class412.method2524(48, var6) || ~var6 == -93 || ~var6 == -48 || var6 == '.' || ~var6 == -59 || ~var6 == -45 || var6 == ' ' || ~var6 == -96 || ~var6 == -46 || var6 == '+' || ~var6 == -92 || var6 == ']') {
                    class417.field5723 = class417.field5723.substring(0, class607.field8623) + class266.field3307[var3].method2514((byte) -93) + class417.field5723.substring(class607.field8623);
                    ++class607.field8623;
                }
            } else {
                class607.field8623 = class417.field5723.length();
            }
            ++var3;
        }
        class757.field10550 = 0;
        class183.field2202 = 0;
        class486.method2933(true);
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(B)I", line = 280)
    public final int method1241(byte arg0) {
        if (arg0 != 99) {
            this.method990((class58) null, 26);
        }
        ++field7204;
        return this.field7213.field6801;
    }

    @OriginalMember(owner = "client!od", name = "h", descriptor = "(I)Z", line = 295)
    public final boolean method991(int arg0) {
        ++field7198;
        int var2 = -89 / ((65 - arg0) / 48);
        return false;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lha;Lvc;IIIIIZIIIIIII)V", line = 307)
    public class505(class58 arg0, class316 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field4034 == 1, class157.method969(arg12, true, arg13));
        this.field7213 = new class477(arg0, arg1, arg12, arg13, super.field4628, arg3, this, arg7, arg14);
        this.field7216 = arg1.field4001 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IILha;I)Z", line = 317)
    public final boolean method995(int arg0, int arg1, class58 arg2, int arg3) {
        ++field7214;
        class470 var5 = this.field7213.method2866(false, arg2, false, 1, 131072);
        if (arg3 != -1) {
            this.field7202 = null;
        }
        if (var5 == null) {
            return false;
        } else {
            class165 var6 = arg2.method422();
            var6.method1019(super.field4635, super.field4627, super.field4629);
            return !class626.field8994 ? var5.method227(arg0, arg1, var6, false, 0) : var5.method191(arg0, arg1, var6, false, 0, class586.field8268);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILha;)V", line = 338)
    public final void method1244(int arg0, class58 arg1) {
        this.field7213.method2871(arg1, arg0 + 244631);
        if (arg0 != 17513) {
            this.method990((class58) null, -7);
        }
        ++field7208;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V", line = 351)
    public final void method982(int arg0) {
        ++field7205;
        if (arg0 == 2) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(I)Z", line = 362)
    public final boolean method986(int arg0) {
        int var2 = -48 / ((-50 - arg0) / 60);
        ++field7209;
        return false;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lha;B)V", line = 372)
    public final void method1238(class58 arg0, byte arg1) {
        ++field7207;
        this.field7213.method2870(arg0, 92);
        if (arg1 >= -15) {
            this.field7216 = true;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lha;I)V", line = 384)
    public final void method990(class58 arg0, int arg1) {
        ++field7195;
        class470 var3 = this.field7213.method2866(true, arg0, true, 1, 262144);
        if (var3 != null) {
            class165 var4 = arg0.method422();
            var4.method1019(super.field4635, super.field4627, super.field4629);
            this.field7213.method2868(super.field4402, super.field4387, var3, super.field4390, var4, super.field4395, arg0, (byte) -14, false);
        }
        int var5 = -114 % ((arg1 - -2) / 62);
    }

    @OriginalMember(owner = "client!od", name = "f", descriptor = "(I)I", line = 411)
    public final int method985(int arg0) {
        ++field7200;
        if (arg0 != 4) {
            field7210 = -0.75470424F;
        }
        return this.field7213.method2860(true);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)Z", line = 424)
    public final boolean method1239(boolean arg0) {
        ++field7206;
        if (!arg0) {
            this.field7212 = false;
        }
        return this.field7213.method2864(false);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)I", line = 435)
    public final int method1243(byte arg0) {
        if (arg0 != 117) {
            method3004(-63);
        }
        ++field7194;
        return this.field7213.field6786;
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(B)I", line = 446)
    public final int method1236(byte arg0) {
        if (arg0 != -78) {
            method3004(-80);
        }
        ++field7201;
        return this.field7213.field6804;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(ILha;)Llca;", line = 457)
    public final class642 method983(int arg0, class58 arg1) {
        ++field7196;
        return arg0 != 0 ? null : this.field7202;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(B)V", line = 475)
    public final void method1237(byte arg0) {
        if (arg0 > -68) {
            this.field7202 = null;
        }
        ++field7217;
    }
}
