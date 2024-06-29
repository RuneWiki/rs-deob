import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class434 extends class544 {

    @OriginalMember(owner = "client!jq", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field5884 = new String[100];

    @OriginalMember(owner = "client!jq", name = "D", descriptor = "Llc;")
    public static class552 field5896 = new class552("RC", 1);

    @OriginalMember(owner = "client!jq", name = "H", descriptor = "[F")
    public static float[] field5900 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!jq", name = "s", descriptor = "F")
    public static float field5885;

    @OriginalMember(owner = "client!jq", name = "m", descriptor = "I")
    public int field5879;

    @OriginalMember(owner = "client!jq", name = "n", descriptor = "I")
    public int field5880;

    @OriginalMember(owner = "client!jq", name = "o", descriptor = "I")
    public static int field5881;

    @OriginalMember(owner = "client!jq", name = "p", descriptor = "I")
    public int field5882;

    @OriginalMember(owner = "client!jq", name = "q", descriptor = "I")
    public static int field5883;

    @OriginalMember(owner = "client!jq", name = "t", descriptor = "I")
    public int field5886;

    @OriginalMember(owner = "client!jq", name = "u", descriptor = "I")
    public int field5887;

    @OriginalMember(owner = "client!jq", name = "v", descriptor = "I")
    public int field5888;

    @OriginalMember(owner = "client!jq", name = "w", descriptor = "I")
    public int field5889;

    @OriginalMember(owner = "client!jq", name = "x", descriptor = "I")
    public int field5890;

    @OriginalMember(owner = "client!jq", name = "y", descriptor = "I")
    public int field5891;

    @OriginalMember(owner = "client!jq", name = "z", descriptor = "I")
    public int field5892;

    @OriginalMember(owner = "client!jq", name = "A", descriptor = "I")
    public static int field5893;

    @OriginalMember(owner = "client!jq", name = "B", descriptor = "I")
    public int field5894;

    @OriginalMember(owner = "client!jq", name = "C", descriptor = "I")
    public int field5895;

    @OriginalMember(owner = "client!jq", name = "E", descriptor = "I")
    public int field5897;

    @OriginalMember(owner = "client!jq", name = "F", descriptor = "I")
    public int field5898;

    @OriginalMember(owner = "client!jq", name = "G", descriptor = "I")
    public int field5899;

    // $FF: synthetic field
    @OriginalMember(owner = "client!jq", name = "I", descriptor = "Ljava/lang/Class;")
    public static Class field5901;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)V")
    public static void method2508(byte arg0) {
        if (arg0 == 72) {
            field5900 = null;
            field5896 = null;
            field5884 = null;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IBLqa;)Lr;")
    public final class157 method2509(int arg0, byte arg1, class206 arg2) {
        field5883++;
        if (arg1 != 83) {
            this.field5888 = 119;
        }
        int var4 = class605.field8736[this.field5895];
        class157 var5 = null;
        if (var4 == 0) {
            class241 var6 = class19.method124(this.field5898, this.field5899, this.field5889);
            if (var6 instanceof class58) {
                class58 var7 = (class58) var6;
                if (var7.field549 != null) {
                    var5 = ((class269) var7.field549).method335(arg0, arg2, true);
                }
            }
        } else if (var4 == 1) {
            class56 var12 = class31.method181(this.field5898, this.field5899, this.field5889);
            if (var12 instanceof class574) {
                class574 var13 = (class574) var12;
                if (var13.field8385 != null) {
                    var5 = ((class269) var13.field8385).method335(arg0, arg2, true);
                }
            }
        } else if (var4 == 2) {
            class598 var8 = class198.method1072(this.field5898, this.field5899, this.field5889, field5901 == null ? (field5901 = method2511("fp")) : field5901);
            if (var8 instanceof class79) {
                class79 var9 = (class79) var8;
                if (var9.field921 != null) {
                    var5 = ((class269) var9.field921).method335(arg0, arg2, true);
                }
            }
        } else if (var4 == 3) {
            class31 var10 = class543.method3171(this.field5898, this.field5899, this.field5889);
            if (var10 instanceof class550) {
                class550 var11 = (class550) var10;
                if (var11.field8079 != null) {
                    var5 = ((class269) var11.field8079).method335(arg0, arg2, true);
                }
            }
        }
        return var5 == null ? null : var5.method64((byte) 0, arg0, true);
    }

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "(B)V")
    public static final void method2510(byte arg0) {
        class390.method2238((byte) -59, false);
        field5881++;
        if (class51.field433 >= 0 && class51.field433 != 0) {
            class24.method144(-2, class51.field433);
            class51.field433 = -1;
        }
        if (arg0 != -2) {
            method2508((byte) 101);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2511(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
