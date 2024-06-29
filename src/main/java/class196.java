import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class196 extends class108 {

    @OriginalMember(owner = "client!vu", name = "p", descriptor = "[F")
    public static float[] field2545 = new float[4];

    @OriginalMember(owner = "client!vu", name = "k", descriptor = "Lbv;")
    public static class568 field2540 = new class568();

    @OriginalMember(owner = "client!vu", name = "F", descriptor = "[I")
    public static int[] field2561 = new int[1];

    @OriginalMember(owner = "client!vu", name = "D", descriptor = "Luv;")
    public static class3 field2559 = new class3(36, 7);

    @OriginalMember(owner = "client!vu", name = "j", descriptor = "I")
    public int field2539;

    @OriginalMember(owner = "client!vu", name = "l", descriptor = "I")
    public int field2541;

    @OriginalMember(owner = "client!vu", name = "m", descriptor = "I")
    public int field2542;

    @OriginalMember(owner = "client!vu", name = "n", descriptor = "I")
    public int field2543;

    @OriginalMember(owner = "client!vu", name = "o", descriptor = "I")
    public int field2544;

    @OriginalMember(owner = "client!vu", name = "q", descriptor = "I")
    public int field2546;

    @OriginalMember(owner = "client!vu", name = "r", descriptor = "I")
    public int field2547;

    @OriginalMember(owner = "client!vu", name = "s", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!vu", name = "t", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!vu", name = "u", descriptor = "I")
    public int field2550;

    @OriginalMember(owner = "client!vu", name = "v", descriptor = "I")
    public int field2551;

    @OriginalMember(owner = "client!vu", name = "w", descriptor = "I")
    public int field2552;

    @OriginalMember(owner = "client!vu", name = "x", descriptor = "I")
    public int field2553;

    @OriginalMember(owner = "client!vu", name = "y", descriptor = "I")
    public int field2554;

    @OriginalMember(owner = "client!vu", name = "z", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!vu", name = "A", descriptor = "I")
    public int field2556;

    @OriginalMember(owner = "client!vu", name = "B", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!vu", name = "C", descriptor = "I")
    public int field2558;

    @OriginalMember(owner = "client!vu", name = "E", descriptor = "I")
    public int field2560;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vu", name = "G", descriptor = "Ljava/lang/Class;")
    public static Class field2562;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(ILqa;I)Lr;")
    public final class521 method1257(int arg0, class167 arg1, int arg2) {
        field2549++;
        if (arg2 != 3) {
            this.field2560 = -50;
        }
        int var4 = class94.field1244[this.field2554];
        class521 var5 = null;
        if (var4 == 0) {
            class8 var6 = class146.method798(this.field2560, this.field2552, this.field2556);
            if (var6 instanceof class265) {
                class265 var7 = (class265) var6;
                if (var7.field3382 != null) {
                    var5 = ((class246) var7.field3382).method53(arg0, 30307, arg1);
                }
            }
        } else if (var4 == 1) {
            class486 var12 = class234.method1474(this.field2560, this.field2552, this.field2556);
            if (var12 instanceof class579) {
                class579 var13 = (class579) var12;
                if (var13.field8050 != null) {
                    var5 = ((class246) var13.field8050).method53(arg0, 30307, arg1);
                }
            }
        } else if (var4 == 2) {
            class450 var8 = class49.method273(this.field2560, this.field2552, this.field2556, field2562 == null ? (field2562 = method1260("vaa")) : field2562);
            if (var8 instanceof class515) {
                class515 var9 = (class515) var8;
                if (var9.field7158 != null) {
                    var5 = ((class246) var9.field7158).method53(arg0, 30307, arg1);
                }
            }
        } else if (var4 == 3) {
            class249 var10 = class380.method2313(this.field2560, this.field2552, this.field2556);
            if (var10 instanceof class12) {
                class12 var11 = (class12) var10;
                if (var11.field115 != null) {
                    var5 = ((class246) var11.field115).method53(arg0, 30307, arg1);
                }
            }
        }
        return var5 == null ? null : var5.method1607((byte) 0, arg0, true);
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(BII)I")
    public static final int method1258(byte arg0, int arg1, int arg2) {
        field2548++;
        if (arg2 == 4 || arg2 == 5) {
            return class136.field1665[arg1 & 0x3];
        } else if (arg0 > -38) {
            return 49;
        } else {
            return 256;
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)V")
    public static void method1259(int arg0) {
        if (arg0 != 2) {
            field2559 = null;
        }
        field2540 = null;
        field2545 = null;
        field2559 = null;
        field2561 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1260(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
