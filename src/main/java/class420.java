import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class420 extends class260 {

    @OriginalMember(owner = "client!et", name = "p", descriptor = "Z")
    public static boolean field6137 = false;

    @OriginalMember(owner = "client!et", name = "G", descriptor = "I")
    public static int field6154 = 1407;

    @OriginalMember(owner = "client!et", name = "x", descriptor = "F")
    public static float field6145;

    @OriginalMember(owner = "client!et", name = "l", descriptor = "I")
    public int field6133;

    @OriginalMember(owner = "client!et", name = "m", descriptor = "I")
    public static int field6134;

    @OriginalMember(owner = "client!et", name = "n", descriptor = "I")
    public int field6135;

    @OriginalMember(owner = "client!et", name = "q", descriptor = "I")
    public int field6138;

    @OriginalMember(owner = "client!et", name = "r", descriptor = "I")
    public int field6139;

    @OriginalMember(owner = "client!et", name = "s", descriptor = "I")
    public int field6140;

    @OriginalMember(owner = "client!et", name = "t", descriptor = "I")
    public int field6141;

    @OriginalMember(owner = "client!et", name = "u", descriptor = "I")
    public int field6142;

    @OriginalMember(owner = "client!et", name = "v", descriptor = "I")
    public int field6143;

    @OriginalMember(owner = "client!et", name = "w", descriptor = "I")
    public int field6144;

    @OriginalMember(owner = "client!et", name = "y", descriptor = "I")
    public int field6146;

    @OriginalMember(owner = "client!et", name = "z", descriptor = "I")
    public static int field6147;

    @OriginalMember(owner = "client!et", name = "A", descriptor = "I")
    public static int field6148;

    @OriginalMember(owner = "client!et", name = "B", descriptor = "I")
    public int field6149;

    @OriginalMember(owner = "client!et", name = "C", descriptor = "I")
    public int field6150;

    @OriginalMember(owner = "client!et", name = "D", descriptor = "I")
    public int field6151;

    @OriginalMember(owner = "client!et", name = "E", descriptor = "I")
    public int field6152;

    @OriginalMember(owner = "client!et", name = "F", descriptor = "I")
    public int field6153;

    @OriginalMember(owner = "client!et", name = "o", descriptor = "Lcd;")
    public static class206 field6136;

    // $FF: synthetic field
    @OriginalMember(owner = "client!et", name = "H", descriptor = "Ljava/lang/Class;")
    public static Class field6155;

    @OriginalMember(owner = "client!et", name = "k", descriptor = "[Lgg;")
    public static class116[] field6132;

    // $FF: synthetic method
    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2506(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!et", name = "c", descriptor = "(I)Ltt;", line = 3)
    public static final class61 method2502(int arg0) {
        field6148++;
        if (arg0 != 1407) {
            field6145 = 0.8415667F;
        }
        return class393.field5757.length > class33.field445 ? class393.field5757[class33.field445++] : null;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIIIILya;IIII[[[B)V", line = 36)
    public static final void method2503(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class38 arg7, int arg8, int arg9, int arg10, int arg11, byte[][][] arg12) {
        field6134++;
        if (arg8 >= -41) {
            method2503(56, -111, -91, 120, 22, -23, -124, null, -114, -121, -58, 65, null);
        }
        if (arg10 == 0 || arg9 == 0) {
            return;
        }
        if (arg10 == 9) {
            arg6 = arg6 + 1 & 0x3;
            arg10 = 1;
        }
        if (arg10 == 10) {
            arg10 = 1;
            arg6 = arg6 + 3 & 0x3;
        }
        if (arg10 == 11) {
            arg10 = 8;
            arg6 = arg6 + 3 & 0x3;
        }
        arg7.method268(arg4, arg1, arg5, arg2, arg3, arg0, arg12[arg10 - 1][arg6], arg9, arg11);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(B)V", line = 70)
    public static void method2504(byte arg0) {
        field6136 = null;
        if (arg0 != -53) {
            field6132 = null;
        }
        field6132 = null;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lya;IB)Lt;", line = 95)
    public final class471 method2505(class38 arg0, int arg1, byte arg2) {
        if (arg2 != -115) {
            this.field6152 = 126;
        }
        field6147++;
        int var4 = class258.field3594[this.field6150];
        if (var4 == 0) {
            class90 var5 = class176.method1135(this.field6152, this.field6142, this.field6146);
            if (var5 instanceof class372) {
                class372 var6 = (class372) var5;
                if (var6.field5440 != null) {
                    return ((class503) var6.field5440).method488((byte) 124, arg0, arg1);
                }
            }
        } else if (var4 == 1) {
            class147 var11 = class131.method899(this.field6152, this.field6142, this.field6146);
            if (var11 instanceof class158) {
                class158 var12 = (class158) var11;
                if (var12.field2389 != null) {
                    return ((class503) var12.field2389).method488((byte) 124, arg0, arg1);
                }
            }
        } else if (var4 == 2) {
            class116 var9 = class38.method295(this.field6152, this.field6142, this.field6146, field6155 == null ? (field6155 = method2506("jn")) : field6155);
            if (var9 instanceof class418) {
                class418 var10 = (class418) var9;
                if (var10.field6066 != null) {
                    return ((class503) var10.field6066).method488((byte) 124, arg0, arg1);
                }
            }
        } else if (var4 == 3) {
            class117 var7 = class509.method3048(this.field6152, this.field6142, this.field6146);
            if (var7 instanceof class377) {
                class377 var8 = (class377) var7;
                if (var8.field5520 != null) {
                    return ((class503) var8.field5520).method488((byte) 124, arg0, arg1);
                }
            }
        }
        return null;
    }
}
