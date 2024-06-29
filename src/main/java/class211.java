import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class211 extends class435 {

    @OriginalMember(owner = "client!en", name = "D", descriptor = "[C")
    public static char[] field2831;

    @OriginalMember(owner = "client!en", name = "l", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!en", name = "m", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!en", name = "n", descriptor = "I")
    public int field2815;

    @OriginalMember(owner = "client!en", name = "o", descriptor = "I")
    public int field2816;

    @OriginalMember(owner = "client!en", name = "p", descriptor = "I")
    public int field2817;

    @OriginalMember(owner = "client!en", name = "q", descriptor = "I")
    public int field2818;

    @OriginalMember(owner = "client!en", name = "r", descriptor = "I")
    public int field2819;

    @OriginalMember(owner = "client!en", name = "s", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!en", name = "t", descriptor = "I")
    public int field2821;

    @OriginalMember(owner = "client!en", name = "u", descriptor = "I")
    public int field2822;

    @OriginalMember(owner = "client!en", name = "w", descriptor = "I")
    public int field2824;

    @OriginalMember(owner = "client!en", name = "x", descriptor = "I")
    public int field2825;

    @OriginalMember(owner = "client!en", name = "y", descriptor = "I")
    public int field2826;

    @OriginalMember(owner = "client!en", name = "A", descriptor = "I")
    public int field2828;

    @OriginalMember(owner = "client!en", name = "B", descriptor = "I")
    public int field2829;

    @OriginalMember(owner = "client!en", name = "C", descriptor = "I")
    public int field2830;

    @OriginalMember(owner = "client!en", name = "E", descriptor = "I")
    public int field2832;

    @OriginalMember(owner = "client!en", name = "F", descriptor = "I")
    public int field2833;

    @OriginalMember(owner = "client!en", name = "H", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!en", name = "z", descriptor = "Lne;")
    public static class210 field2827;

    @OriginalMember(owner = "client!en", name = "G", descriptor = "Lbp;")
    public static class264 field2834;

    @OriginalMember(owner = "client!en", name = "v", descriptor = "Lml;")
    public static class266 field2823;

    // $FF: synthetic field
    @OriginalMember(owner = "client!en", name = "I", descriptor = "Ljava/lang/Class;")
    public static Class field2836;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ILug;)Lqq;")
    public static final class334 method1343(int arg0, class396 arg1) {
        field2814++;
        if (arg0 != 8661) {
            method1346(-14, -46, -27, 105, 73, 102, 100, 11, -127, 28);
        }
        return new class334(arg1.method2433((byte) 115), arg1.method2433((byte) 115), arg1.method2433((byte) 115), arg1.method2433((byte) 115), arg1.method2433((byte) 115), arg1.method2433((byte) 115), arg1.method2433((byte) 115), arg1.method2433((byte) 115), arg1.method2396((byte) -90), arg1.method2388((byte) -125));
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V")
    public static final void method1344(byte arg0) {
        if (arg0 != -120) {
            field2834 = null;
        }
        field2813++;
        int var1 = class461.field6877;
        int[] var2 = class342.field4589;
        for (int var3 = 0; var3 < var1; var3++) {
            class531 var4 = class29.field272[var2[var3]];
            if (var4 != null) {
                class417.method2578(var4.method546(24273), var4, 0);
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ILza;I)Le;")
    public final class373 method1345(int arg0, class287 arg1, int arg2) {
        field2835++;
        int var4 = class198.field2555[this.field2833];
        if (var4 == 0) {
            class262 var11 = class48.method279(this.field2832, this.field2828, this.field2829);
            if (var11 instanceof class378) {
                class378 var12 = (class378) var11;
                if (var12.field5468 != null) {
                    return ((class448) var12.field5468).method39(arg2, (byte) -54, arg1);
                }
            }
        } else if (var4 == 1) {
            class100 var5 = class107.method663(this.field2832, this.field2828, this.field2829);
            if (var5 instanceof class462) {
                class462 var6 = (class462) var5;
                if (var6.field6895 != null) {
                    return ((class448) var6.field6895).method39(arg2, (byte) -54, arg1);
                }
            }
        } else if (var4 == 2) {
            class279 var9 = class365.method2172(this.field2832, this.field2828, this.field2829, field2836 == null ? (field2836 = method1348("mh")) : field2836);
            if (var9 instanceof class314) {
                class314 var10 = (class314) var9;
                if (var10.field4199 != null) {
                    return ((class448) var10.field4199).method39(arg2, (byte) -54, arg1);
                }
            }
        } else if (var4 == 3) {
            class215 var7 = class434.method2671(this.field2832, this.field2828, this.field2829);
            if (var7 instanceof class229) {
                class229 var8 = (class229) var7;
                if (var8.field3086 != null) {
                    return ((class448) var8.field3086).method39(arg2, (byte) -54, arg1);
                }
            }
        }
        if (arg0 >= -89) {
            this.field2824 = 88;
        }
        return null;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1346(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 >= class307.field4111 && class91.field1086 >= arg3 && class307.field4111 <= arg5 && arg5 <= class91.field1086 && arg1 >= class307.field4111 && arg1 <= class91.field1086 && class307.field4111 <= arg6 && arg6 <= class91.field1086 && arg7 >= class169.field2184 && arg7 <= class386.field5620 && class169.field2184 <= arg9 && arg9 <= class386.field5620 && arg8 >= class169.field2184 && arg8 <= class386.field5620 && class169.field2184 <= arg4 && class386.field5620 >= arg4) {
            class419.method2588(arg5, arg8, 3, arg9, arg7, arg3, arg4, arg6, arg1, arg2);
        } else {
            class116.method702(arg2, arg1, arg8, arg6, arg5, arg9, arg4, (byte) -58, arg3, arg7);
        }
        if (arg0 != 19440) {
            field2827 = null;
        }
        field2820++;
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(I)V")
    public static void method1347(int arg0) {
        field2831 = null;
        field2827 = null;
        field2823 = null;
        field2834 = null;
        if (arg0 > -126) {
            method1347(70);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1348(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class305("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
        field2831 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };
    }
}
