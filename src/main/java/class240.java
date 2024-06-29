import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class240 extends class492 implements class281 {

    @OriginalMember(owner = "client!dt", name = "fb", descriptor = "Z")
    private boolean field2872 = false;

    @OriginalMember(owner = "client!dt", name = "ab", descriptor = "Liea;")
    public class477 field2867;

    @OriginalMember(owner = "client!dt", name = "M", descriptor = "Z")
    private boolean field2853;

    @OriginalMember(owner = "client!dt", name = "N", descriptor = "Z")
    public static boolean field2854 = false;

    @OriginalMember(owner = "client!dt", name = "S", descriptor = "I")
    public static int field2859 = 0;

    @OriginalMember(owner = "client!dt", name = "T", descriptor = "[Lwc;")
    public static class66[] field2860 = new class66[14];

    @OriginalMember(owner = "client!dt", name = "G", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!dt", name = "H", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!dt", name = "I", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!dt", name = "J", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!dt", name = "L", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!dt", name = "O", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!dt", name = "P", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!dt", name = "Q", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!dt", name = "R", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!dt", name = "U", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!dt", name = "V", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!dt", name = "W", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!dt", name = "X", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!dt", name = "Z", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!dt", name = "bb", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!dt", name = "cb", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!dt", name = "db", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!dt", name = "eb", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!dt", name = "gb", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!dt", name = "Y", descriptor = "Llca;")
    private class642 field2865;

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(ILha;)Llca;", line = 3)
    public final class642 method983(int arg0, class58 arg1) {
        if (arg0 != 0) {
            this.method987(true, (class58) null, (class361) null, -87, -45, -121, 65);
        }
        ++field2852;
        return this.field2865;
    }

    @OriginalMember(owner = "client!dt", name = "f", descriptor = "(I)I", line = 14)
    public final int method985(int arg0) {
        if (arg0 != 4) {
            this.method990((class58) null, 7);
        }
        ++field2871;
        return this.field2867.method2860(true);
    }

    @OriginalMember(owner = "client!dt", name = "i", descriptor = "(I)V", line = 27)
    public static void method1413(int arg0) {
        field2860 = null;
        if (arg0 != 14) {
            field2859 = 116;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIII)Z", line = 37)
    public static final boolean method1414(int arg0, int arg1, int arg2, int arg3) {
        ++field2848;
        if (class114.field1198 && class396.field5425) {
            if (arg0 != 30633) {
                return true;
            } else if (~class542.field7803 > -101) {
                return false;
            } else {
                int var4 = class280.field3432[arg3][arg1][arg2];
                if (~(-class188.field2234) == ~var4) {
                    return false;
                } else if (class188.field2234 == var4) {
                    return true;
                } else if (class504.field7120 == class159.field1758) {
                    return false;
                } else {
                    int var5 = arg1 << class748.field10430;
                    int var6 = arg2 << class748.field10430;
                    if (class320.method1913(class504.field7120[arg3].method1671(arg2 + 1, arg1 - -1, (byte) 84), var5 + -1 + class559.field7987, var5 + 1, class504.field7120[arg3].method1671(arg2 + 1, arg1, (byte) -122), class559.field7987 + var6 + -1, var6 + -1 - -class559.field7987, class504.field7120[arg3].method1671(arg2, arg1, (byte) 125), var6 - -1, (byte) -17, var5 + 1) && class320.method1913(class504.field7120[arg3].method1671(arg2, arg1 - -1, (byte) -88), class559.field7987 + var5 + -1, var5 + 1, class504.field7120[arg3].method1671(arg2 + 1, arg1 + 1, (byte) -93), var6 - (-class559.field7987 - -1), var6 - -1, class504.field7120[arg3].method1671(arg2, arg1, (byte) -87), var6 + 1, (byte) -17, var5 + -1 + class559.field7987)) {
                        ++class106.field1115;
                        class280.field3432[arg3][arg1][arg2] = class188.field2234;
                        return true;
                    } else {
                        class280.field3432[arg3][arg1][arg2] = -class188.field2234;
                        return false;
                    }
                }
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Z)Z", line = 84)
    public final boolean method1239(boolean arg0) {
        ++field2862;
        if (!arg0) {
            this.field2867 = null;
        }
        return this.field2867.method2864(false);
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(I)V", line = 97)
    public final void method982(int arg0) {
        if (arg0 != 2) {
            this.method994((byte) 122, (class58) null);
        }
        ++field2850;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Lha;Lvc;IIIIIZIII)V", line = 108)
    public class240(class58 arg0, class316 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class340.method2022(125, arg8, arg9));
        this.field2867 = new class477(arg0, arg1, arg8, arg9, super.field4628, arg3, this, arg7, arg10);
        this.field2853 = ~arg1.field4001 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "(B)I", line = 117)
    public final int method1241(byte arg0) {
        if (arg0 != 99) {
            field2859 = 60;
        }
        ++field2858;
        return this.field2867.field6801;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lha;I)V", line = 128)
    public final void method990(class58 arg0, int arg1) {
        ++field2863;
        int var3 = 45 % ((arg1 - -2) / 62);
        class470 var4 = this.field2867.method2866(true, arg0, true, 1, 262144);
        if (var4 != null) {
            int var5 = super.field4635 >> 9;
            int var6 = super.field4629 >> 9;
            class165 var7 = arg0.method422();
            var7.method1019(super.field4635, super.field4627, super.field4629);
            this.field2867.method2868(var6, var6, var4, var5, var7, var5, arg0, (byte) -14, false);
        }
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(B)V", line = 151)
    public final void method1237(byte arg0) {
        if (arg0 >= -68) {
            this.method985(9);
        }
        ++field2866;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZLha;Lrr;IIII)V", line = 166)
    public final void method987(boolean arg0, class58 arg1, class361 arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2873;
        if (arg3 == 0) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "(I)Z", line = 180)
    public final boolean method986(int arg0) {
        ++field2856;
        int var2 = -81 % ((-50 - arg0) / 60);
        return false;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)I", line = 190)
    public final int method1243(byte arg0) {
        if (arg0 != 117) {
            this.method1238((class58) null, (byte) -88);
        }
        ++field2861;
        return this.field2867.field6786;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILha;)V", line = 201)
    public final void method1244(int arg0, class58 arg1) {
        this.field2867.method2871(arg1, 262144);
        ++field2855;
        if (arg0 != 17513) {
            this.method995(-51, 72, (class58) null, 102);
        }
    }

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "(B)I", line = 212)
    public final int method1236(byte arg0) {
        ++field2851;
        return arg0 != -78 ? 7 : this.field2867.field6804;
    }

    @OriginalMember(owner = "client!dt", name = "e", descriptor = "(Z)I", line = 230)
    public final int method992(boolean arg0) {
        if (arg0) {
            field2859 = -87;
        }
        ++field2870;
        return this.field2867.method2862(true);
    }

    @OriginalMember(owner = "client!dt", name = "g", descriptor = "(I)Z", line = 250)
    public final boolean method989(int arg0) {
        if (arg0 >= -112) {
            this.field2867 = null;
        }
        ++field2864;
        return this.field2872;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IILha;I)Z", line = 262)
    public final boolean method995(int arg0, int arg1, class58 arg2, int arg3) {
        ++field2857;
        class470 var5 = this.field2867.method2866(false, arg2, false, 1, 131072);
        if (arg3 != -1) {
            this.method985(11);
        }
        if (var5 == null) {
            return false;
        } else {
            class165 var6 = arg2.method422();
            var6.method1019(super.field4635, super.field4627, super.field4629);
            return !class626.field8994 ? var5.method227(arg0, arg1, var6, false, 0) : var5.method191(arg0, arg1, var6, false, 0, class586.field8268);
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(BLha;)Llba;", line = 282)
    public final class547 method994(byte arg0, class58 arg1) {
        ++field2868;
        class470 var3 = this.field2867.method2866(true, arg1, false, 1, 2048);
        if (var3 == null) {
            return null;
        } else {
            class165 var4 = arg1.method422();
            var4.method1019(super.field4635, super.field4627, super.field4629);
            class547 var5 = class652.method3702(this.field2853, -9477, 1);
            int var6 = super.field4635 >> 9;
            int var7 = super.field4629 >> 9;
            this.field2867.method2868(var7, var7, var3, var6, var4, var6, arg1, (byte) -14, true);
            if (class626.field8994) {
                var3.method188(var4, var5.field7870[0], class586.field8268, 0);
            } else {
                var3.method228(var4, var5.field7870[0], 0);
            }
            if (arg0 != -112) {
                this.method994((byte) 62, (class58) null);
            }
            if (this.field2867.field6807 != null) {
                class713 var8 = this.field2867.field6807.method1538();
                if (class626.field8994) {
                    arg1.method402(var8, class586.field8268);
                } else {
                    arg1.method391(var8);
                }
            }
            this.field2872 = var3.method197() || this.field2867.field6807 != null;
            if (this.field2865 == null) {
                this.field2865 = class191.method1161(super.field4629, var3, super.field4635, super.field4627, 4371);
            } else {
                class206.method1232(super.field4635, super.field4629, var3, super.field4627, this.field2865, 115);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!dt", name = "h", descriptor = "(I)Z", line = 334)
    public final boolean method991(int arg0) {
        int var2 = 51 / ((arg0 - 65) / 48);
        ++field2849;
        return false;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lha;B)V", line = 346)
    public final void method1238(class58 arg0, byte arg1) {
        this.field2867.method2870(arg0, 116);
        if (arg1 >= -15) {
            this.field2872 = false;
        }
        ++field2869;
    }
}
