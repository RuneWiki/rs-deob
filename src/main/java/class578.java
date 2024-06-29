import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class578 extends class340 implements class281 {

    @OriginalMember(owner = "client!gu", name = "ob", descriptor = "B")
    private byte field8179;

    @OriginalMember(owner = "client!gu", name = "wb", descriptor = "S")
    private short field8187;

    @OriginalMember(owner = "client!gu", name = "qb", descriptor = "Z")
    private boolean field8181;

    @OriginalMember(owner = "client!gu", name = "Ab", descriptor = "Z")
    private boolean field8191;

    @OriginalMember(owner = "client!gu", name = "hb", descriptor = "B")
    private byte field8172;

    @OriginalMember(owner = "client!gu", name = "U", descriptor = "Z")
    private boolean field8159;

    @OriginalMember(owner = "client!gu", name = "cb", descriptor = "Z")
    private boolean field8167;

    @OriginalMember(owner = "client!gu", name = "xb", descriptor = "Lr;")
    private class182 field8188;

    @OriginalMember(owner = "client!gu", name = "mb", descriptor = "Lka;")
    public class470 field8177;

    @OriginalMember(owner = "client!gu", name = "rb", descriptor = "I")
    public static int field8182 = 100;

    @OriginalMember(owner = "client!gu", name = "fb", descriptor = "Lbq;")
    public static class289 field8170 = new class289();

    @OriginalMember(owner = "client!gu", name = "Bb", descriptor = "Lsq;")
    public static class178 field8192 = new class178(1, 2, 2, 0);

    @OriginalMember(owner = "client!gu", name = "S", descriptor = "I")
    public static int field8157;

    @OriginalMember(owner = "client!gu", name = "T", descriptor = "I")
    public static int field8158;

    @OriginalMember(owner = "client!gu", name = "V", descriptor = "I")
    public static int field8160;

    @OriginalMember(owner = "client!gu", name = "W", descriptor = "I")
    public static int field8161;

    @OriginalMember(owner = "client!gu", name = "X", descriptor = "I")
    public static int field8162;

    @OriginalMember(owner = "client!gu", name = "Y", descriptor = "I")
    public static int field8163;

    @OriginalMember(owner = "client!gu", name = "Z", descriptor = "I")
    public static int field8164;

    @OriginalMember(owner = "client!gu", name = "ab", descriptor = "I")
    public static int field8165;

    @OriginalMember(owner = "client!gu", name = "bb", descriptor = "I")
    public static int field8166;

    @OriginalMember(owner = "client!gu", name = "db", descriptor = "I")
    public static int field8168;

    @OriginalMember(owner = "client!gu", name = "eb", descriptor = "I")
    public static int field8169;

    @OriginalMember(owner = "client!gu", name = "ib", descriptor = "I")
    public static int field8173;

    @OriginalMember(owner = "client!gu", name = "jb", descriptor = "I")
    public static int field8174;

    @OriginalMember(owner = "client!gu", name = "kb", descriptor = "I")
    public static int field8175;

    @OriginalMember(owner = "client!gu", name = "lb", descriptor = "I")
    public static int field8176;

    @OriginalMember(owner = "client!gu", name = "nb", descriptor = "I")
    public static int field8178;

    @OriginalMember(owner = "client!gu", name = "pb", descriptor = "I")
    public static int field8180;

    @OriginalMember(owner = "client!gu", name = "sb", descriptor = "I")
    public static int field8183;

    @OriginalMember(owner = "client!gu", name = "tb", descriptor = "I")
    public static int field8184;

    @OriginalMember(owner = "client!gu", name = "ub", descriptor = "I")
    public static int field8185;

    @OriginalMember(owner = "client!gu", name = "vb", descriptor = "I")
    public static int field8186;

    @OriginalMember(owner = "client!gu", name = "yb", descriptor = "I")
    public static int field8189;

    @OriginalMember(owner = "client!gu", name = "zb", descriptor = "I")
    public static int field8190;

    @OriginalMember(owner = "client!gu", name = "gb", descriptor = "Llca;")
    private class642 field8171;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lha;B)V", line = 5)
    public final void method1238(class58 arg0, byte arg1) {
        ++field8183;
        Object var3 = null;
        class182 var5;
        if (this.field8188 == null && this.field8167) {
            class42 var4 = this.method3338(arg0, 262144, true, (byte) 102);
            var5 = var4 != null ? var4.field474 : null;
        } else {
            var5 = this.field8188;
            this.field8188 = null;
        }
        if (arg1 > -15) {
            this.field8179 = -106;
        }
        if (var5 != null) {
            class158.method979(var5, super.field4633, super.field4635, super.field4629, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!gu", name = "h", descriptor = "(B)I", line = 35)
    public final int method3334(byte arg0) {
        ++field8180;
        if (arg0 >= -57) {
            method3336(28);
        }
        return this.field8177 != null ? this.field8177.method203() / 4 : 15;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V", line = 46)
    public static final void method3335(Canvas arg0, boolean arg1) {
        if (!arg1) {
            field8173 = 27;
        }
        ++field8174;
        Dimension var2 = arg0.getSize();
        class85.method598(var2.height, -1, var2.width);
        if (~class3.field27 != -2) {
            class574.field8144.method427(arg0, class415.field5687, class627.field9011);
        } else {
            class574.field8144.method427(arg0, class233.field2723, class2.field9);
        }
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(B)V", line = 64)
    public final void method1237(byte arg0) {
        if (arg0 > -68) {
            this.method991(54);
        }
        ++field8190;
        if (this.field8177 != null) {
            this.field8177.method223();
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)I", line = 78)
    public final int method1243(byte arg0) {
        ++field8169;
        return arg0 != 117 ? -115 : this.field8179;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lha;I)V", line = 90)
    public final void method990(class58 arg0, int arg1) {
        int var3 = 31 / ((-2 - arg1) / 62);
        ++field8168;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Z)Z", line = 99)
    public final boolean method1239(boolean arg0) {
        if (!arg0) {
            return true;
        } else {
            ++field8178;
            return this.field8167;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZLha;Lrr;IIII)V", line = 110)
    public final void method987(boolean arg0, class58 arg1, class361 arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!(arg2 instanceof class706)) {
            if (arg2 instanceof class578) {
                class578 var8 = (class578) arg2;
                if (this.field8177 != null && var8.field8177 != null) {
                    this.field8177.method230(var8.field8177, arg4, arg6, arg5, arg0);
                }
            }
        } else {
            class706 var9 = (class706) arg2;
            if (this.field8177 != null && var9.field9941 != null) {
                this.field8177.method230(var9.field9941, arg4, arg6, arg5, arg0);
            }
        }
        ++field8186;
        if (arg3 != 0) {
            this.field8188 = null;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IILha;I)Z", line = 145)
    public final boolean method995(int arg0, int arg1, class58 arg2, int arg3) {
        ++field8158;
        if (arg3 != -1) {
            this.method3338((class58) null, 122, true, (byte) -16);
        }
        class470 var5 = this.method3337(false, arg2, 131072);
        if (var5 != null) {
            class165 var6 = arg2.method422();
            var6.method1019(super.field4635, super.field4627, super.field4629);
            return class626.field8994 ? var5.method191(arg0, arg1, var6, false, 0, class586.field8268) : var5.method227(arg0, arg1, var6, false, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(ILha;)Llca;", line = 166)
    public final class642 method983(int arg0, class58 arg1) {
        ++field8185;
        if (arg0 != 0) {
            this.method994((byte) 49, (class58) null);
        }
        if (this.field8171 == null) {
            this.field8171 = class191.method1161(super.field4629, this.method3337(false, arg1, 0), super.field4635, super.field4627, arg0 ^ 4371);
        }
        return this.field8171;
    }

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "(Z)I", line = 182)
    public final int method992(boolean arg0) {
        ++field8175;
        if (arg0) {
            return 46;
        } else {
            return this.field8177 == null ? 0 : this.field8177.method217();
        }
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)V", line = 196)
    public final void method982(int arg0) {
        if (arg0 == 2) {
            this.field8181 = false;
            ++field8164;
            if (this.field8177 != null) {
                this.field8177.method207(this.field8177.method213() & -65537);
            }
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILha;)V", line = 213)
    public final void method1244(int arg0, class58 arg1) {
        ++field8165;
        if (arg0 != 17513) {
            this.method1244(-8, (class58) null);
        }
        Object var3 = null;
        class182 var5;
        if (this.field8188 == null && this.field8167) {
            class42 var4 = this.method3338(arg1, 262144, true, (byte) 112);
            var5 = var4 == null ? null : var4.field474;
        } else {
            var5 = this.field8188;
            this.field8188 = null;
        }
        if (var5 != null) {
            class663.method3772(var5, super.field4633, super.field4635, super.field4629, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "(I)I", line = 240)
    public final int method985(int arg0) {
        ++field8166;
        if (arg0 != 4) {
            field8182 = -30;
        }
        return this.field8177 == null ? 0 : this.field8177.method190();
    }

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "(I)Z", line = 253)
    public final boolean method986(int arg0) {
        ++field8162;
        int var2 = -17 / ((-50 - arg0) / 60);
        if (this.field8177 != null) {
            return !this.field8177.method202();
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gu", name = "j", descriptor = "(I)V", line = 267)
    public static void method3336(int arg0) {
        field8192 = null;
        field8170 = null;
        if (arg0 > -35) {
            method3335((Canvas) null, true);
        }
    }

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "(B)I", line = 289)
    public final int method1236(byte arg0) {
        ++field8184;
        if (arg0 != -78) {
            this.field8179 = 10;
        }
        return this.field8172;
    }

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "(B)I", line = 301)
    public final int method1241(byte arg0) {
        if (arg0 != 99) {
            this.method985(-111);
        }
        ++field8157;
        return this.field8187 & 65535;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZLha;I)Lka;", line = 312)
    private final class470 method3337(boolean arg0, class58 arg1, int arg2) {
        ++field8163;
        if (this.field8177 != null && ~arg1.method418(this.field8177.method213(), arg2) == -1) {
            return this.field8177;
        } else {
            class42 var4 = this.method3338(arg1, arg2, arg0, (byte) 47);
            return var4 == null ? null : var4.field475;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(BLha;)Llba;", line = 332)
    public final class547 method994(byte arg0, class58 arg1) {
        ++field8160;
        if (this.field8177 == null) {
            return null;
        } else {
            if (arg0 != -112) {
                this.method982(19);
            }
            class165 var3 = arg1.method422();
            var3.method1019(super.field4635, super.field4627, super.field4629);
            class547 var4 = class652.method3702(this.field8159, -9477, 1);
            if (class626.field8994) {
                this.field8177.method188(var3, var4.field7870[0], class586.field8268, 0);
            } else {
                this.field8177.method228(var3, var4.field7870[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!gu", name = "h", descriptor = "(I)Z", line = 359)
    public final boolean method991(int arg0) {
        ++field8189;
        int var2 = 88 / ((arg0 - 65) / 48);
        return this.field8181;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lha;IZB)Lbt;", line = 371)
    private final class42 method3338(class58 arg0, int arg1, boolean arg2, byte arg3) {
        ++field8176;
        class316 var5 = class445.field6442.method3972((byte) 127, this.field8187 & 65535);
        if (arg3 <= 33) {
            this.field8177 = null;
        }
        class278 var6;
        class278 var7;
        if (this.field8191) {
            var6 = class159.field1758[super.field4633];
            var7 = class11.field88[0];
        } else {
            var6 = class11.field88[super.field4633];
            if (~super.field4633 <= -4) {
                var7 = null;
            } else {
                var7 = class11.field88[super.field4633 + 1];
            }
        }
        return var5.method1894(this.field8172 == 11 ? 4 - -this.field8179 : this.field8179, -103, arg1, var7, arg2, super.field4629, arg0, super.field4627, ~this.field8172 == -12 ? 10 : this.field8172, var6, super.field4635);
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lha;Lvc;IIIIIZIIIIIIZ)V", line = 402)
    public class578(class58 arg0, class316 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field4034 == 1, class484.method2924(arg13, arg12, true));
        this.field8179 = (byte) arg13;
        super.field4633 = (byte) arg3;
        this.field8187 = (short) arg1.field3962;
        this.field8181 = arg14;
        this.field8191 = arg7;
        this.field8172 = (byte) arg12;
        this.field8159 = ~arg1.field4001 != -1 && !arg7;
        this.field8167 = arg0.method376() && arg1.field4029 && !this.field8191 && class654.field9334.field9856.method2185(-121) != 0;
        int var16 = 2048;
        if (this.field8181) {
            var16 |= 65536;
        }
        class42 var17 = this.method3338(arg0, var16, this.field8167, (byte) 77);
        if (var17 != null) {
            this.field8188 = var17.field474;
            this.field8177 = var17.field475;
            if (this.field8181) {
                this.field8177 = this.field8177.method237((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gu", name = "g", descriptor = "(I)Z", line = 440)
    public final boolean method989(int arg0) {
        if (arg0 > -112) {
            this.method995(118, -89, (class58) null, -97);
        }
        ++field8161;
        return this.field8177 != null ? this.field8177.method197() : false;
    }
}
