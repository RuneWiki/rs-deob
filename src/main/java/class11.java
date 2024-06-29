import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class11 extends class276 {

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
    public int field112;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
    public int field114;

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "I")
    public int field115;

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "I")
    public int field116;

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "I")
    public int field118;

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "I")
    public int field119;

    @OriginalMember(owner = "client!oe", name = "v", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!oe", name = "w", descriptor = "I")
    public int field121;

    @OriginalMember(owner = "client!oe", name = "x", descriptor = "I")
    public int field122;

    @OriginalMember(owner = "client!oe", name = "y", descriptor = "I")
    public int field123;

    @OriginalMember(owner = "client!oe", name = "z", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!oe", name = "A", descriptor = "I")
    public int field125;

    @OriginalMember(owner = "client!oe", name = "B", descriptor = "I")
    public int field126;

    @OriginalMember(owner = "client!oe", name = "C", descriptor = "I")
    public int field127;

    @OriginalMember(owner = "client!oe", name = "D", descriptor = "I")
    public int field128;

    @OriginalMember(owner = "client!oe", name = "E", descriptor = "I")
    public int field129;

    @OriginalMember(owner = "client!oe", name = "F", descriptor = "I")
    public int field130;

    // $FF: synthetic field
    @OriginalMember(owner = "client!oe", name = "G", descriptor = "Ljava/lang/Class;")
    public static Class field131;

    // $FF: synthetic method
    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method63(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILza;B)Le;", line = 6)
    public final class530 method60(int arg0, class491 arg1, byte arg2) {
        field117++;
        int var4 = class491.field7178[this.field129];
        if (var4 == 0) {
            class218 var11 = class134.method1018(this.field119, this.field114, this.field128);
            if (var11 instanceof class435) {
                class435 var12 = (class435) var11;
                if (var12.field6487 != null) {
                    return ((class518) var12.field6487).method32(arg0, arg1, -127);
                }
            }
        } else if (var4 == 1) {
            class192 var5 = class158.method1103(this.field119, this.field114, this.field128);
            if (var5 instanceof class37) {
                class37 var6 = (class37) var5;
                if (var6.field550 != null) {
                    return ((class518) var6.field550).method32(arg0, arg1, -117);
                }
            }
        } else if (var4 == 2) {
            class290 var9 = class491.method2868(this.field119, this.field114, this.field128, field131 == null ? (field131 = method63("jg")) : field131);
            if (var9 instanceof class193) {
                class193 var10 = (class193) var9;
                if (var10.field2996 != null) {
                    return ((class518) var10.field2996).method32(arg0, arg1, 113);
                }
            }
        } else if (var4 == 3) {
            class125 var7 = class373.method2346(this.field119, this.field114, this.field128);
            if (var7 instanceof class208) {
                class208 var8 = (class208) var7;
                if (var8.field3276 != null) {
                    return ((class518) var8.field3276).method32(arg0, arg1, arg2 - 235);
                }
            }
        }
        if (arg2 != 121) {
            this.method60(-62, null, (byte) 32);
        }
        return null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILqs;)V", line = 96)
    public static final void method61(int arg0, class496 arg1) {
        field113++;
        class204.field3242 = arg1.method2927("titlebg", -100);
        class90.field1500 = arg1.method2927("logo", -39);
        if (arg0 >= -10) {
            field124 = 20;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)V", line = 114)
    public static final void method62(int arg0, int arg1, int arg2) {
        if (arg0 != 6203) {
            field124 = 36;
        }
        field120++;
        class266 var3 = class308.method1961(true, arg1, 5);
        var3.method1781((byte) 95);
        var3.field4454 = arg2;
    }
}
