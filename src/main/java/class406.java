import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class406 extends class467 {

    @OriginalMember(owner = "client!fp", name = "s", descriptor = "Z")
    public static boolean field6129 = true;

    @OriginalMember(owner = "client!fp", name = "n", descriptor = "I")
    public static int field6124 = 0;

    @OriginalMember(owner = "client!fp", name = "x", descriptor = "Z")
    public static boolean field6134 = false;

    @OriginalMember(owner = "client!fp", name = "p", descriptor = "Lui;")
    public static class375 field6126 = new class375("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

    @OriginalMember(owner = "client!fp", name = "o", descriptor = "I")
    public int field6125;

    @OriginalMember(owner = "client!fp", name = "q", descriptor = "I")
    public static int field6127;

    @OriginalMember(owner = "client!fp", name = "r", descriptor = "I")
    public int field6128;

    @OriginalMember(owner = "client!fp", name = "t", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!fp", name = "u", descriptor = "I")
    public int field6131;

    @OriginalMember(owner = "client!fp", name = "v", descriptor = "I")
    public int field6132;

    @OriginalMember(owner = "client!fp", name = "w", descriptor = "I")
    public int field6133;

    @OriginalMember(owner = "client!fp", name = "y", descriptor = "I")
    public static int field6135;

    @OriginalMember(owner = "client!fp", name = "z", descriptor = "I")
    public int field6136;

    @OriginalMember(owner = "client!fp", name = "A", descriptor = "I")
    public int field6137;

    @OriginalMember(owner = "client!fp", name = "B", descriptor = "I")
    public int field6138;

    @OriginalMember(owner = "client!fp", name = "C", descriptor = "I")
    public int field6139;

    @OriginalMember(owner = "client!fp", name = "D", descriptor = "I")
    public int field6140;

    @OriginalMember(owner = "client!fp", name = "E", descriptor = "I")
    public int field6141;

    @OriginalMember(owner = "client!fp", name = "F", descriptor = "I")
    public int field6142;

    @OriginalMember(owner = "client!fp", name = "G", descriptor = "I")
    public int field6143;

    @OriginalMember(owner = "client!fp", name = "H", descriptor = "I")
    public int field6144;

    @OriginalMember(owner = "client!fp", name = "I", descriptor = "I")
    public static int field6145;

    @OriginalMember(owner = "client!fp", name = "J", descriptor = "I")
    public int field6146;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fp", name = "K", descriptor = "Ljava/lang/Class;")
    public static Class field6147;

    // $FF: synthetic method
    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2481(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(BLqa;I)Lc;", line = 4)
    public final class201 method2478(byte arg0, class496 arg1, int arg2) {
        field6127++;
        int var4 = class341.field5384[this.field6143];
        if (var4 == 0) {
            class70 var11 = class456.method2743(this.field6140, this.field6136, this.field6132);
            if (var11 instanceof class458) {
                class458 var12 = (class458) var11;
                if (var12.field6719 != null) {
                    return ((class196) var12.field6719).method53(arg2, arg1, (byte) 64);
                }
            }
        } else if (var4 == 1) {
            class255 var5 = class174.method1214(this.field6140, this.field6136, this.field6132);
            if (var5 instanceof class392) {
                class392 var6 = (class392) var5;
                if (var6.field5955 != null) {
                    return ((class196) var6.field5955).method53(arg2, arg1, (byte) 94);
                }
            }
        } else if (var4 == 2) {
            class153 var7 = class432.method2587(this.field6140, this.field6136, this.field6132, field6147 == null ? (field6147 = method2481("ou")) : field6147);
            if (var7 instanceof class399) {
                class399 var8 = (class399) var7;
                if (var8.field6076 != null) {
                    return ((class196) var8.field6076).method53(arg2, arg1, (byte) 87);
                }
            }
        } else if (var4 == 3) {
            class383 var9 = class380.method2357(this.field6140, this.field6136, this.field6132);
            if (var9 instanceof class286) {
                class286 var10 = (class286) var9;
                if (var10.field4270 != null) {
                    return ((class196) var10.field4270).method53(arg2, arg1, (byte) 40);
                }
            }
        }
        return arg0 == -35 ? null : null;
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(I)V", line = 88)
    public static void method2479(int arg0) {
        field6126 = null;
        if (arg0 != 0) {
            method2480(-83, -39, -12);
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(III)I", line = 131)
    public static final int method2480(int arg0, int arg1, int arg2) {
        field6130++;
        if (arg2 != -400678849) {
            field6124 = -40;
        }
        int var3 = arg1 >>> 31;
        return (arg1 + var3) / arg0 - var3;
    }
}
