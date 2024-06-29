import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class167 extends class86 {

    @OriginalMember(owner = "client!rn", name = "A", descriptor = "[[[I")
    public static int[][][] field2192 = new int[2][][];

    @OriginalMember(owner = "client!rn", name = "D", descriptor = "Lak;")
    public static class222 field2195 = new class222(2, 4, 4, 0);

    @OriginalMember(owner = "client!rn", name = "o", descriptor = "I")
    public int field2180;

    @OriginalMember(owner = "client!rn", name = "p", descriptor = "I")
    public int field2181;

    @OriginalMember(owner = "client!rn", name = "q", descriptor = "I")
    public int field2182;

    @OriginalMember(owner = "client!rn", name = "r", descriptor = "I")
    public int field2183;

    @OriginalMember(owner = "client!rn", name = "s", descriptor = "I")
    public int field2184;

    @OriginalMember(owner = "client!rn", name = "t", descriptor = "I")
    public int field2185;

    @OriginalMember(owner = "client!rn", name = "u", descriptor = "I")
    public int field2186;

    @OriginalMember(owner = "client!rn", name = "v", descriptor = "I")
    public int field2187;

    @OriginalMember(owner = "client!rn", name = "w", descriptor = "I")
    public int field2188;

    @OriginalMember(owner = "client!rn", name = "x", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!rn", name = "y", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!rn", name = "z", descriptor = "I")
    public int field2191;

    @OriginalMember(owner = "client!rn", name = "B", descriptor = "I")
    public int field2193;

    @OriginalMember(owner = "client!rn", name = "C", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!rn", name = "E", descriptor = "I")
    public int field2196;

    @OriginalMember(owner = "client!rn", name = "F", descriptor = "I")
    public int field2197;

    @OriginalMember(owner = "client!rn", name = "G", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!rn", name = "H", descriptor = "I")
    public int field2199;

    @OriginalMember(owner = "client!rn", name = "I", descriptor = "I")
    public int field2200;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rn", name = "J", descriptor = "Ljava/lang/Class;")
    public static Class field2201;

    // $FF: synthetic method
    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1055(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V", line = 12)
    public static void method1052(int arg0) {
        field2195 = null;
        if (arg0 > 46) {
            field2192 = null;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(BLeq;I)Lva;", line = 23)
    public final class327 method1053(byte arg0, class134 arg1, int arg2) {
        field2194++;
        int var4 = class327.field4772[this.field2181];
        if (arg0 != -32) {
            return null;
        }
        if (var4 == 0) {
            class403 var5 = class478.method2795(this.field2182, this.field2180, this.field2188);
            if (var5 instanceof class349) {
                class349 var6 = (class349) var5;
                if (var6.field5048 != null) {
                    return ((class113) var6.field5048).method367(arg2, arg1, true);
                }
            }
        } else if (var4 == 1) {
            class455 var7 = class305.method1832(this.field2182, this.field2180, this.field2188);
            if (var7 instanceof class172) {
                class172 var8 = (class172) var7;
                if (var8.field2348 != null) {
                    return ((class113) var8.field2348).method367(arg2, arg1, true);
                }
            }
        } else if (var4 == 2) {
            class210 var11 = class124.method701(this.field2182, this.field2180, this.field2188, field2201 == null ? (field2201 = method1055("sq")) : field2201);
            if (var11 instanceof class387) {
                class387 var12 = (class387) var11;
                if (var12.field5742 != null) {
                    return ((class113) var12.field5742).method367(arg2, arg1, true);
                }
            }
        } else if (var4 == 3) {
            class79 var9 = class79.method515(this.field2182, this.field2180, this.field2188);
            if (var9 instanceof class178) {
                class178 var10 = (class178) var9;
                if (var10.field2548 != null) {
                    return ((class113) var10.field2548).method367(arg2, arg1, true);
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(BII)I", line = 120)
    public static final int method1054(byte arg0, int arg1, int arg2) {
        field2198++;
        int var3 = 4 / ((36 - arg0) / 60);
        return arg1 == 4 || arg1 == 5 ? class112.field1466[arg2 & 0x3] : 256;
    }
}
