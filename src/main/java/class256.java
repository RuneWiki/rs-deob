import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class256 {

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "[I")
    public static int[] field4473;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V", line = 28)
    public static void method1829(byte arg0) {
        if (arg0 < 42) {
            method1829((byte) 34);
        }
        field4473 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIILhg;JZ)V", line = 44)
    public static final void method1830(int arg0, int arg1, int arg2, int arg3, class174 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class143 var8 = new class143();
        var8.field2480 = arg4;
        var8.field2491 = arg1 * 128 + 64;
        var8.field2495 = arg2 * 128 + 64;
        var8.field2477 = arg3;
        var8.field2493 = arg5;
        var8.field2481 = arg6;
        if (class312.field5246[arg0][arg1][arg2] == null) {
            class312.field5246[arg0][arg1][arg2] = new class125(arg0, arg1, arg2);
        }
        class312.field5246[arg0][arg1][arg2].field2190 = var8;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lih;IIII)V", line = 69)
    public static final void method1831(class33 arg0, int arg1, int arg2, int arg3, int arg4) {
        field4474++;
        if (arg2 != 7 || class301.field5124 == arg0 || class124.field2176 >= 400) {
            return;
        }
        class229 var5;
        if (arg0.field610 == 0) {
            boolean var6 = true;
            if (class301.field5124.field646 != -1 && arg0.field646 != -1) {
                int var7 = class301.field5124.field623 > arg0.field623 ? class301.field5124.field623 : arg0.field623;
                int var8 = class301.field5124.field646 >= arg0.field646 ? arg0.field646 : class301.field5124.field646;
                int var9 = var7 * 10 / 100 + var8 + 5;
                int var10 = class301.field5124.field623 - arg0.field623;
                if (var10 < 0) {
                    var10 = -var10;
                }
                if (var10 > var9) {
                    var6 = false;
                }
            }
            if (arg0.field623 >= arg0.field617) {
                var5 = class142.method989(new class229[] { arg0.method304(24930), var6 ? class82.method581(arg0.field623, arg2 + 249, class301.field5124.field623) : class180.field3119, class89.field1631, class313.field5271, class84.method607(118, arg0.field623), class81.field1503 }, arg2 - 21);
            } else {
                var5 = class142.method989(new class229[] { arg0.method304(arg2 + 24923), var6 ? class82.method581(arg0.field623, 256, class301.field5124.field623) : class180.field3119, class89.field1631, class313.field5271, class84.method607(-79, arg0.field623), class199.field3481, class84.method607(75, arg0.field617 - arg0.field623), class81.field1503 }, arg2 ^ 0xFFFFFFDA);
            }
        } else {
            var5 = class142.method989(new class229[] { arg0.method304(24930), class89.field1631, class144.field2510, class84.method607(116, arg0.field610), class81.field1503 }, -87);
        }
        if (class23.field415 == 1) {
            class174.field3039++;
            class194.method1334((long) arg1, arg3, arg4, -12158, (short) 25, class156.field2670, class142.method989(new class229[] { class26.field472, class175.field3049, var5 }, -112));
        } else if (!class273.field4677) {
            for (int var11 = 7; var11 >= 0; var11--) {
                if (class41.field733[var11] != null) {
                    class156.field2673++;
                    short var12 = 0;
                    boolean var13 = false;
                    if (class98.field1739 == 0 && class41.field733[var11].method1653(class45.field815, false)) {
                        if (arg0.field623 > class301.field5124.field623) {
                            var12 = 2000;
                        }
                        if (class301.field5124.field607 != 0 && arg0.field607 != 0) {
                            if (class301.field5124.field607 == arg0.field607) {
                                var12 = 2000;
                            } else {
                                var12 = 0;
                            }
                        }
                    } else if (class90.field1647[var11]) {
                        var12 = 2000;
                    }
                    short var14 = class1.field2[var11];
                    short var15 = (short) (var12 + var14);
                    class194.method1334((long) arg1, arg3, arg4, -12158, var15, class41.field733[var11], class142.method989(new class229[] { class180.field3119, var5 }, arg2 ^ 0xFFFFFFC8));
                }
            }
        } else if ((class324.field5471 & 0x8) == 8) {
            class194.method1334((long) arg1, arg3, arg4, -12158, (short) 31, class228.field3916, class142.method989(new class229[] { class147.field2550, class175.field3049, var5 }, -96));
            class81.field1507++;
        }
        for (int var16 = 0; var16 < class124.field2176; var16++) {
            if (class115.field2063[var16] == 28) {
                class143.field2498[var16] = class142.method989(new class229[] { class180.field3119, var5 }, arg2 - 103);
                break;
            }
        }
    }
}
