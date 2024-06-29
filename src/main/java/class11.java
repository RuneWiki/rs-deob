import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class11 {

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public int field197 = 0;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public static int field200 = 0;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "Lbd;")
    public static class464 field196 = new class464(4, 14);

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "Lcs;")
    public static class351 field201 = new class351(52, 3);

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IILlk;)V", line = 3)
    private final void method103(int arg0, int arg1, class425 arg2) {
        if (arg1 == 5) {
            this.field197 = arg2.method2508(true);
        }
        field198++;
        if (arg0 != 0) {
            field196 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Llk;I)V", line = 22)
    public final void method104(class425 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2503(true);
            if (var3 == 0) {
                field195++;
                if (arg1 < 25) {
                    method106(-93);
                    return;
                }
                return;
            }
            this.method103(0, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)Lui;", line = 44)
    public static final class406 method105(int arg0, int arg1, int arg2) {
        if (class455.field6293[arg0][arg1][arg2] == null) {
            boolean var3 = class455.field6293[0][arg1][arg2] != null && class455.field6293[0][arg1][arg2].field5606 != null;
            if (var3 && arg0 >= class109.field1542 - 1) {
                return null;
            }
            class41.method337(arg0, arg1, arg2);
        }
        return class455.field6293[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V", line = 57)
    public static void method106(int arg0) {
        field201 = null;
        field196 = null;
        if (arg0 != 0) {
            field200 = 127;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "()V", line = 77)
    public static final void method107() {
        if (class5.field110 != null) {
            for (int var0 = 0; var0 < class5.field110.length; var0++) {
                for (int var1 = 0; var1 < class456.field6299; var1++) {
                    for (int var2 = 0; var2 < class205.field2946; var2++) {
                        if (class5.field110[var0][var1][var2] != null) {
                            class5.field110[var0][var1][var2].method2386((byte) -127);
                        }
                        class5.field110[var0][var1][var2] = null;
                    }
                }
            }
        }
        class5.field110 = null;
        class366.field5215 = null;
        if (class96.field1366 != null) {
            for (int var3 = 0; var3 < class96.field1366.length; var3++) {
                for (int var4 = 0; var4 < class456.field6299; var4++) {
                    for (int var5 = 0; var5 < class205.field2946; var5++) {
                        if (class96.field1366[var3][var4][var5] != null) {
                            class96.field1366[var3][var4][var5].method2386((byte) -74);
                        }
                        class96.field1366[var3][var4][var5] = null;
                    }
                }
            }
        }
        class96.field1366 = null;
        class8.field166 = null;
        class455.field6293 = null;
        class317.field4306 = null;
        class173.field2560 = 0;
        if (class376.field5316 != null) {
            for (int var6 = 0; var6 < class173.field2560; var6++) {
                class376.field5316[var6] = null;
            }
        }
        if (class238.field3364 != null) {
            for (int var7 = 0; var7 < class160.field2305; var7++) {
                class238.field3364[var7] = null;
            }
            class160.field2305 = 0;
        }
        if (class488.field6890 != null) {
            for (int var8 = 0; var8 < class19.field321; var8++) {
                class488.field6890[var8] = null;
            }
            for (int var9 = 0; var9 < class109.field1542; var9++) {
                for (int var10 = 0; var10 < class456.field6299; var10++) {
                    for (int var11 = 0; var11 < class205.field2946; var11++) {
                        class355.field4951[var9][var10][var11] = 0L;
                    }
                }
            }
            class19.field321 = 0;
        }
        class473.field6624 = null;
        class312.method1884(0);
        class123.field1703.method2819((byte) 4);
        class226.field3194 = null;
        class132.field1860 = null;
        class269.field3727 = null;
        class302.field4135 = null;
        class441.field6059 = null;
        class259.field3611 = null;
    }
}
