import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class100 {

    @OriginalMember(owner = "client!p", name = "a", descriptor = "Ljf;")
    public static class229 field1760 = class212.method1457((byte) 101, "(U0a )2 in: ");

    @OriginalMember(owner = "client!p", name = "f", descriptor = "Ljf;")
    public static class229 field1765 = class212.method1457((byte) 83, "huffman");

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field1762 = 0;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "Ljf;")
    public static class229 field1761 = class212.method1457((byte) 107, "k");

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "Ljf;")
    public static class229 field1763;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "[I")
    public static int[] field1766;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V", line = 19)
    public static void method680(int arg0) {
        field1760 = null;
        field1765 = null;
        field1763 = null;
        field1761 = null;
        field1766 = null;
        if (arg0 != 0) {
            method681((class169) null, 29, 60, (byte) 94, -16);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Leh;IIBI)V", line = 57)
    public static final void method681(class169 arg0, int arg1, int arg2, byte arg3, int arg4) {
        field1764++;
        if (class124.field2176 >= 400) {
            return;
        }
        if (arg0.field2950 != null) {
            arg0 = arg0.method1154((byte) -125);
        }
        if (arg0 == null || !arg0.field2907) {
            return;
        }
        class229 var5 = arg0.field2947;
        if (arg0.field2912 != 0) {
            var5 = class142.method989(new class229[] { var5, class82.method581(arg0.field2912, 256, class301.field5124.field623), class89.field1631, class313.field5271, class84.method607(-73, arg0.field2912), class81.field1503 }, -40);
        }
        if (class23.field415 == 1) {
            class194.method1334((long) arg1, arg2, arg4, -12158, (short) 42, class156.field2670, class142.method989(new class229[] { class26.field472, class115.field2071, var5 }, arg3 ^ 0xFFFFFFD9));
            class6.field60++;
        } else if (!class273.field4677) {
            class167.field2864++;
            class229[] var6 = arg0.field2916;
            if (class136.field2374) {
                var6 = class172.method1168((byte) -93, var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && (class98.field1739 != 0 || !var6[var7].method1653(class45.field815, false))) {
                        byte var8 = 0;
                        class96.field1697++;
                        if (var7 == 0) {
                            var8 = 51;
                        }
                        if (var7 == 1) {
                            var8 = 11;
                        }
                        if (var7 == 2) {
                            var8 = 59;
                        }
                        if (var7 == 3) {
                            var8 = 39;
                        }
                        if (var7 == 4) {
                            var8 = 23;
                        }
                        class194.method1334((long) arg1, arg2, arg4, -12158, var8, var6[var7], class142.method989(new class229[] { class15.field231, var5 }, -123));
                    }
                }
            }
            if (class98.field1739 == 0 && var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method1653(class45.field815, false)) {
                        class269.field4618++;
                        short var10 = 0;
                        if (var9 == 0) {
                            var10 = 51;
                        }
                        if (var9 == 1) {
                            var10 = 11;
                        }
                        if (var9 == 2) {
                            var10 = 59;
                        }
                        short var11 = 0;
                        if (var9 == 3) {
                            var10 = 39;
                        }
                        if (arg0.field2912 > class301.field5124.field623) {
                            var11 = 2000;
                        }
                        if (var9 == 4) {
                            var10 = 23;
                        }
                        if (var10 != 0) {
                            var10 += var11;
                        }
                        class194.method1334((long) arg1, arg2, arg4, -12158, var10, var6[var9], class142.method989(new class229[] { class15.field231, var5 }, -82));
                    }
                }
            }
            class194.method1334((long) arg1, arg2, arg4, -12158, (short) 1004, class44.field792, class142.method989(new class229[] { class15.field231, var5 }, -105));
        } else if ((class324.field5471 & 0x2) == 2) {
            class19.field305++;
            class194.method1334((long) arg1, arg2, arg4, -12158, (short) 18, class228.field3916, class142.method989(new class229[] { class147.field2550, class115.field2071, var5 }, arg3 ^ 0xFFFFFFF3));
        }
        if (arg3 != 103) {
            method680(-58);
        }
    }
}
