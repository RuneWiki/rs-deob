import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class7 {

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "[I")
    public static int[] field120 = new int[99];

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "Z")
    public static boolean field121;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "Ljava/lang/String;")
    public static String field123;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "[Lpk;")
    public static class103[] field125;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "I")
    public static volatile int field126;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public int field108;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public int field110;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    public int field112;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public int field113;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public int field114;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "I")
    public int field115;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
    public int field117;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "[B")
    public byte[] field106;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "[B")
    public byte[] field111;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "[I")
    public static int[] field124;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field122;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)[Lel;")
    public static final class213[] method45(int arg0) {
        field119++;
        class213[] var1 = new class213[class174.field2682];
        for (int var2 = arg0; var2 < class174.field2682; var2++) {
            int var3 = class170.field2583[var2] * class104.field1621[var2];
            byte[] var4 = class301.field4847[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class102.field1585[class118.method863(var4[var6], 255)];
            }
            var1[var2] = new class51(class214.field3278, class234.field3705, class196.field3069[var2], class125.field1877[var2], class104.field1621[var2], class170.field2583[var2], var5);
        }
        class30.method254(2);
        return var1;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
    public static void method46(int arg0) {
        if (arg0 < 58) {
            return;
        }
        field122 = null;
        field124 = null;
        field123 = null;
        field125 = null;
        field120 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IZ)I")
    public static final int method47(int arg0, boolean arg1) {
        if (class301.field4848 != null) {
            class301.field4848.method1306((byte) -108);
            class301.field4848 = null;
        }
        class80.field1213++;
        field105++;
        if (class80.field1213 > 4) {
            class80.field1213 = 0;
            class92.field1459 = 0;
            return arg0;
        }
        if (class95.field1498 == class154.field2300) {
            class154.field2300 = class211.field3256;
        } else {
            class154.field2300 = class95.field1498;
        }
        if (!arg1) {
            method46(-105);
        }
        class92.field1459 = 0;
        return -1;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIZIIII)V")
    public static final void method48(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        class293.field4550 = arg4;
        class230.field3647 = arg5;
        class286.field4495 = arg6;
        field107++;
        class76.field1173 = arg1;
        class53.field847 = arg0;
        if (arg2 && class230.field3647 >= 100) {
            class118.field1787 = class293.field4550 * 128 + 64;
            class226.field3616 = class286.field4495 * 128 + 64;
            class250.field4007 = class254.method1721(-580808345, class130.field1941, class118.field1787, class226.field3616) - class53.field847;
        }
        class175.field2704 = 2;
        if (arg3 > -103) {
            field125 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)I")
    public static final int method49(byte arg0) {
        if (arg0 < 57) {
            method47(-42, false);
        }
        field116++;
        return class101.field1582 && class292.field4537[81] && class14.field174 > 2 ? class166.field2518[class14.field174 - 2] : class166.field2518[class14.field174 - 1];
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)V")
    public static final void method50(byte arg0) {
        class174.field2687 = null;
        class85.field1263 = null;
        field118++;
        class42.field698 = null;
        if (arg0 >= -24) {
            method50((byte) -121);
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field120[var1] = var0 / 4;
        }
        field121 = false;
        field123 = "flash2:";
        field125 = new class103[14];
        field126 = 0;
    }
}
