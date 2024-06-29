import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public abstract class class55 extends class376 {

    @OriginalMember(owner = "client!er", name = "n", descriptor = "[I")
    public static int[] field804 = new int[14];

    @OriginalMember(owner = "client!er", name = "p", descriptor = "[[S")
    public static short[][] field806 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!er", name = "m", descriptor = "I")
    public static int field803 = 0;

    @OriginalMember(owner = "client!er", name = "q", descriptor = "Ljava/lang/String;")
    public static String field807 = "Connecting to update server";

    @OriginalMember(owner = "client!er", name = "o", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "()V", line = 17)
    public static final void method372() {
        if (class383.field5456 != null) {
            for (int var0 = 0; var0 < class383.field5456.length; var0++) {
                for (int var1 = 0; var1 < class386.field5629; var1++) {
                    for (int var2 = 0; var2 < class371.field5311; var2++) {
                        if (class383.field5456[var0][var1][var2] != null) {
                            class383.field5456[var0][var1][var2].method973((byte) -16);
                        }
                        class383.field5456[var0][var1][var2] = null;
                    }
                }
            }
        }
        class383.field5456 = null;
        class156.field2213 = null;
        if (class77.field1200 != null) {
            for (int var3 = 0; var3 < class77.field1200.length; var3++) {
                for (int var4 = 0; var4 < class386.field5629; var4++) {
                    for (int var5 = 0; var5 < class371.field5311; var5++) {
                        if (class77.field1200[var3][var4][var5] != null) {
                            class77.field1200[var3][var4][var5].method973((byte) -16);
                        }
                        class77.field1200[var3][var4][var5] = null;
                    }
                }
            }
        }
        class77.field1200 = null;
        class435.field6248 = null;
        class5.field79 = null;
        class249.field3456 = null;
        class389.field5668 = 0;
        if (class99.field1515 != null) {
            for (int var6 = 0; var6 < class389.field5668; var6++) {
                class99.field1515[var6] = null;
            }
        }
        if (class327.field4469 != null) {
            for (int var7 = 0; var7 < class170.field2426; var7++) {
                class327.field4469[var7] = null;
            }
            class170.field2426 = 0;
        }
        if (class84.field1302 != null) {
            for (int var8 = 0; var8 < class155.field2185; var8++) {
                class84.field1302[var8] = null;
            }
            for (int var9 = 0; var9 < class176.field2480; var9++) {
                for (int var10 = 0; var10 < class386.field5629; var10++) {
                    for (int var11 = 0; var11 < class371.field5311; var11++) {
                        class36.field551[var9][var10][var11] = 0;
                    }
                }
            }
            class155.field2185 = 0;
        }
        class28.field445 = null;
        class48.method338((byte) 83);
        class145.field2112.method2305(-80);
        class165.field2357 = null;
        class270.field3683 = null;
        class258.field3539 = null;
        class352.field4917 = null;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Z)V", line = 169)
    public static void method373(boolean arg0) {
        field806 = null;
        field807 = null;
        field804 = null;
        if (!arg0) {
            method372();
        }
    }
}
