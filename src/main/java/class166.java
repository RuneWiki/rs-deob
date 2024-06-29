import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public abstract class class166 {

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "[I")
    public static int[] field2510 = new int[2048];

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "Z")
    public static boolean field2513 = false;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "Z")
    public static boolean field2516 = false;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIII)V")
    public static final void method1098(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2512++;
        if (class113.field1779 >= arg2 && arg3 >= class271.field4289) {
            boolean var6;
            if (class75.field1265 > arg0) {
                arg0 = class75.field1265;
                var6 = false;
            } else if (class261.field4025 < arg0) {
                var6 = false;
                arg0 = class261.field4025;
            } else {
                var6 = true;
            }
            boolean var7;
            if (class75.field1265 > arg1) {
                var7 = false;
                arg1 = class75.field1265;
            } else if (class261.field4025 < arg1) {
                var7 = false;
                arg1 = class261.field4025;
            } else {
                var7 = true;
            }
            if (arg2 < class271.field4289) {
                arg2 = class271.field4289;
            } else {
                class263.method1788(arg0, arg5 - 20780, arg4, class156.field2379[arg2++], arg1);
            }
            if (arg3 <= class113.field1779) {
                class263.method1788(arg0, -18732, arg4, class156.field2379[arg3--], arg1);
            } else {
                arg3 = class113.field1779;
            }
            if (var6 && var7) {
                for (int var8 = arg2; var8 <= arg3; var8++) {
                    int[] var9 = class156.field2379[var8];
                    var9[arg0] = var9[arg1] = arg4;
                }
            } else if (var6) {
                for (int var10 = arg2; var10 <= arg3; var10++) {
                    class156.field2379[var10][arg0] = arg4;
                }
            } else if (var7) {
                for (int var11 = arg2; var11 <= arg3; var11++) {
                    class156.field2379[var11][arg1] = arg4;
                }
            }
        }
        if (arg5 != 2048) {
            field2516 = true;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BLr;)Lr;")
    public abstract class42 method341(byte arg0, class42 arg1);

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
    public static void method1099(int arg0) {
        field2510 = null;
        if (arg0 != 2048) {
            method1100(79);
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V")
    public static final void method1100(int arg0) {
        if (arg0 == 2048) {
            field2515++;
            class278.field4374 = null;
            class173.field2574 = null;
            class81.field1346 = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lf;I)Lga;")
    public static final class174 method1101(class37 arg0, int arg1) {
        if (arg1 != 2048) {
            method1099(127);
        }
        field2509++;
        return new class174(arg0.method306(arg1 - 1946), arg0.method306(arg1 - 1951), arg0.method306(arg1 - 1985), arg0.method306(110), arg0.method336(23362), arg0.method333((byte) -59));
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)V")
    public static final void method1102(int arg0, int arg1) {
        class247.field3822.method1778(arg0, arg1 - 2077);
        class64.field1019.method1778(arg0, -63);
        field2511++;
        if (arg1 != 2048) {
            field2513 = false;
        }
    }
}
