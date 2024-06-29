import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class104 {

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
    public int field1540;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "[[Z")
    public static boolean[][] field1538 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "I")
    public static int field1543 = 0;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "[I")
    public static int[] field1539;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lpia;Ljava/lang/String;Lha;BLda;Z)V", line = 5)
    public static final void method853(class54 arg0, String arg1, class544 arg2, byte arg3, class400 arg4, boolean arg5) {
        field1542++;
        boolean var6 = !class757.field10546 || class97.method795((byte) -20);
        if (arg3 != -10) {
            method855((byte) -59, 64, -40, -81);
        }
        if (!var6) {
            return;
        }
        if (class757.field10546 && var6) {
            class54 var7 = class43.field734;
            class400 var8 = arg2.method424(var7, class403.field5984, true);
            int var9 = var7.method506(0, arg1, 250, null);
            int var10 = var7.method512(var7.field854, null, 1384, arg1, 250);
            int var11 = class718.field10074.field10184;
            int var12 = var11 + 4;
            int var13 = var12 * 2 + var10;
            int var14 = var12 * 2 + var9;
            if (var13 < class150.field2337) {
                var13 = class150.field2337;
            }
            if (var14 < class576.field8164) {
                var14 = class576.field8164;
            }
            int var15 = class235.field3754.method3824(class335.field4917, (byte) -74, var14) + class639.field8971;
            int var16 = class40.field711.method2088(var13, (byte) -120, class614.field8651) + class238.field3834;
            if (class250.field3989) {
                var15 += class499.method3028(arg3 + 10);
                var16 += class545.method3197(86);
            }
            arg2.method310(class401.field5954, false).method181(class447.field6530.field10184 + var15, class447.field6530.field10186 + var16, var14 - (class447.field6530.field10184 * 2), -(class447.field6530.field10186 * 2) + var13, 1, 0, 0);
            arg2.method310(class447.field6530, true).method182(var15, var16);
            class447.field6530.method4015();
            arg2.method310(class447.field6530, true).method182(var15 + var14 - var11, var16);
            class447.field6530.method4004();
            arg2.method310(class447.field6530, true).method182(var15 + var14 - var11, var13 + var16 - var11);
            class447.field6530.method4015();
            arg2.method310(class447.field6530, true).method182(var15, var13 + var16 - var11);
            class447.field6530.method4004();
            arg2.method310(class718.field10074, true).method188(var15, class447.field6530.field10186 + var16, var11, var13 - (class447.field6530.field10186 * 2));
            class718.field10074.method4009();
            arg2.method310(class718.field10074, true).method188(class447.field6530.field10184 + var15, var16, var14 - class447.field6530.field10184 * 2, var11);
            class718.field10074.method4009();
            arg2.method310(class718.field10074, true).method188(var14 + var15 - var11, class447.field6530.field10186 + var16, var11, var13 - class447.field6530.field10186 * 2);
            class718.field10074.method4009();
            arg2.method310(class718.field10074, true).method188(class447.field6530.field10184 + var15, var16 - var11 + var13, var14 - (class447.field6530.field10184 * 2), var11);
            class718.field10074.method4009();
            var8.method2468(0, 0, 1, arg3 ^ 0xFFFFFFF6, 0, var16 + var12, var12 + var15, null, arg1, -1, var13 - var12 * 2, null, null, class146.field2297 | 0xFF000000, 1, var14 - (var12 * 2));
            class598.method3436(var15, var13, (byte) -123, var14, var16);
        } else {
            int var17 = arg0.method506(0, arg1, 250, null);
            int var18 = arg0.method516(250, arg1, (byte) -116, null) * 13;
            byte var19 = 4;
            int var20 = var19 + 6;
            int var21 = var19 + 6;
            arg2.method410(var20 - var19, var21 - var19, var19 + var19 + var17, var18 - -var19 + var19, -16777216, 0);
            arg2.method224(var20 - var19, var21 - var19, var17 + var19 + var19, var18 + var19 + var19, -1, 0);
            arg4.method2468(0, 0, 1, 0, 0, var21, var20, null, arg1, -1, var18, null, null, -1, 1, var17);
            class598.method3436(var20 - var19, var18 + var19 + var19, (byte) -123, var19 + var19 + var17, -var19 + var21);
        }
        if (!arg5) {
            return;
        }
        try {
            if (class250.field3989) {
                class147.method1124(125);
            } else {
                arg2.method3193(arg3 ^ 0xFFFFFFF6);
            }
        } catch (class556 var22) {
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V", line = 105)
    public static void method854(int arg0) {
        field1538 = null;
        if (arg0 < 16) {
            field1538 = null;
        }
        field1539 = null;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(BIII)V", line = 123)
    public static final void method855(byte arg0, int arg1, int arg2, int arg3) {
        field1537++;
        if (arg0 != -59) {
            field1538 = null;
        }
        class22 var4 = class121.field1865[arg2][arg1];
        class706.method3918((byte) 109, arg3, var4 == null ? class290.field4471 : var4);
    }

    @OriginalMember(owner = "client!ql", name = "toString", descriptor = "()Ljava/lang/String;", line = 137)
    public final String toString() {
        field1541++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(II)V", line = 148)
    public class104(int arg0, int arg1) {
        this.field1540 = arg0;
    }
}
