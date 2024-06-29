import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class171 extends class63 {

    @OriginalMember(owner = "client!de", name = "t", descriptor = "I")
    public int field2225 = -1;

    @OriginalMember(owner = "client!de", name = "C", descriptor = "I")
    public int field2234 = -1;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "I")
    public int field2224;

    @OriginalMember(owner = "client!de", name = "u", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!de", name = "v", descriptor = "I")
    public int field2227;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "I")
    public int field2228;

    @OriginalMember(owner = "client!de", name = "x", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!de", name = "y", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!de", name = "z", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!de", name = "A", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!de", name = "B", descriptor = "I")
    public int field2233;

    @OriginalMember(owner = "client!de", name = "E", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!de", name = "D", descriptor = "Lae;")
    public static class285 field2235;

    static {
        new class409("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lfp;III)Z", line = 4)
    public final boolean method5(class9 arg0, int arg1, int arg2, int arg3) {
        ++field2226;
        class187 var5 = arg0.method145();
        if (arg2 != -754) {
            this.method2(7, (class9) null);
        }
        var5.method831(super.field828, super.field829, super.field837);
        class143 var6 = class157.field2119.method176((byte) -109, this.field2227).method2631(-1, (class259) null, arg0, this.field2233, -129, 0, 0, (class196) null, 65536);
        if (var6 != null && var6.method988(arg3, arg1, var5, true)) {
            return true;
        } else {
            if (~this.field2225 != 0) {
                class143 var7 = class157.field2119.method176((byte) -119, this.field2225).method2631(-1, (class259) null, arg0, this.field2228, -129, 0, 0, (class196) null, 65536);
                if (var7 != null && var7.method988(arg3, arg1, var5, true)) {
                    return true;
                }
            }
            if (this.field2234 != -1) {
                class143 var8 = class157.field2119.method176((byte) -104, this.field2234).method2631(-1, (class259) null, arg0, this.field2224, -129, 0, 0, (class196) null, 65536);
                if (var8 != null && var8.method988(arg3, arg1, var5, true)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V", line = 47)
    public static void method1108(byte arg0) {
        if (arg0 <= 7) {
            field2235 = null;
        }
        field2235 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILfp;)Luq;", line = 60)
    public final class241 method2(int arg0, class9 arg1) {
        ++field2230;
        if (arg0 >= -125) {
            return null;
        } else {
            class187 var3 = arg1.method145();
            var3.method831(super.field828, super.field829, super.field837);
            class241 var4 = class395.method2485(-29083, 3);
            if (~this.field2234 != 0) {
                class143 var5 = class157.field2119.method176((byte) -125, this.field2234).method2631(-1, (class259) null, arg1, this.field2224, -129, 0, 0, (class196) null, 1024);
                if (var5 != null) {
                    var5.method947(var3, var4.field3578[2], 0);
                }
            }
            if (~this.field2225 != 0) {
                class143 var6 = class157.field2119.method176((byte) -62, this.field2225).method2631(-1, (class259) null, arg1, this.field2228, -129, 0, 0, (class196) null, 1024);
                if (var6 != null) {
                    var6.method947(var3, var4.field3578[1], 0);
                }
            }
            class143 var7 = class157.field2119.method176((byte) -82, this.field2227).method2631(-1, (class259) null, arg1, this.field2233, -129, 0, 0, (class196) null, 1024);
            if (var7 != null) {
                var7.method947(var3, var4.field3578[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!de", name = "e", descriptor = "(B)V", line = 103)
    public static final void method1109(byte arg0) {
        ++field2223;
        if (arg0 != -102) {
            field2236 = -97;
        }
        if (class63.field833 >= 0) {
            long var1 = class43.method364(-16756);
            class63.field833 = (int) ((long) class63.field833 - (var1 - class262.field3867));
            if (class63.field833 <= 0) {
                class294.field4275 = class55.field673.field2808;
                class432.field6296 = class55.field673.field2798;
                class288.field4223 = class55.field673.field2819;
                class148.field2018 = class55.field673.field2811;
                class166.field2194 = class55.field673.field2809;
                class42.field570 = class55.field673.field2807;
                class289.field4235 = class55.field673.field2812;
                class184.field2598 = class55.field673.field2815;
                class63.field833 = -1;
                class157.field2121 = class55.field673.field2800;
                class317.field4656 = class55.field673.field2805;
            } else {
                int var3 = (class63.field833 << 8) / class281.field4124;
                int var4 = -var3 + 255;
                float var5 = (float) var3 / 255.0F;
                float var6 = 1.0F - var5;
                class166.field2194 = ((65280 & class401.field5796) * var3 + (65280 & class55.field673.field2809) * var4 & 16711680) + (-16711936 & (class401.field5796 & 16711935) * var3 + (class55.field673.field2809 & 16711935) * var4) >>> 8;
                class289.field4235 = (class55.field673.field2812 - class289.field4228) * var6 + class289.field4228;
                class317.field4656 = (-class247.field3633 + class55.field673.field2805) * var6 + class247.field3633;
                class157.field2121 = (class55.field673.field2800 - class51.field644) * var6 + class51.field644;
                class42.field570 = (-class299.field4359 + class55.field673.field2807) * var6 + class299.field4359;
                class184.field2598 = (-class368.field5314 + class55.field673.field2815) * var6 + class368.field5314;
                class148.field2018 = class15.field240 * var3 - -(class55.field673.field2811 * var4) >> 8;
                class288.field4223 = (class55.field673.field2819 - class288.field4227) * var6 + class288.field4227;
                class294.field4275 = (16711680 & (65280 & class169.field2216) * var3 + (65280 & class55.field673.field2808) * var4) + (-16711936 & (class169.field2216 & 16711935) * var3 + (class55.field673.field2808 & 16711935) * var4) >>> 8;
                if (class202.field2846 != class55.field673.field2798) {
                    class432.field6296 = class388.field5677.method142(class202.field2846, class55.field673.field2798, var6, class432.field6296);
                }
            }
            class262.field3867 = var1;
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(ILfp;)V", line = 166)
    public final void method14(int arg0, class9 arg1) {
        if (arg0 != -7561) {
            method1109((byte) 51);
        }
        ++field2232;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lwe;Z)I", line = 177)
    public static final int method1110(class26 arg0, boolean arg1) {
        ++field2229;
        class327 var2 = arg0.field369;
        if (var2.field4871 != null) {
            var2 = var2.method2139(true);
            if (var2 == null) {
                return -1;
            }
        }
        if (!arg1) {
            field2235 = null;
        }
        int var3 = var2.field4859;
        class446 var4 = arg0.method450(0);
        if (arg0.field719) {
            var3 = var2.field4839;
        } else if (~arg0.field706 != ~var4.field6484 && arg0.field706 != var4.field6486 && ~arg0.field706 != ~var4.field6499 && arg0.field706 != var4.field6537) {
            if (~arg0.field706 == ~var4.field6504 || arg0.field706 == var4.field6498 || arg0.field706 == var4.field6503 || ~arg0.field706 == ~var4.field6505) {
                var3 = var2.field4808;
            }
        } else {
            var3 = var2.field4820;
        }
        return var3;
    }
}
