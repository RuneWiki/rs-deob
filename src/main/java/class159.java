import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class159 extends class215 {

    @OriginalMember(owner = "client!dg", name = "R", descriptor = "I")
    private int field2540 = 1;

    @OriginalMember(owner = "client!dg", name = "Q", descriptor = "I")
    private int field2539 = 204;

    @OriginalMember(owner = "client!dg", name = "T", descriptor = "I")
    private int field2542 = 1;

    @OriginalMember(owner = "client!dg", name = "N", descriptor = "I")
    public static int field2536 = 0;

    @OriginalMember(owner = "client!dg", name = "O", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!dg", name = "P", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!dg", name = "U", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!dg", name = "V", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!dg", name = "S", descriptor = "[Lib;")
    public static class56[] field2541;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IILpd;)V")
    public final void method45(int arg0, int arg1, class96 arg2) {
        if (arg0 != 1521146348) {
            this.field2542 = 79;
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field2539 = arg2.method549(arg0 ^ 1521146131);
                }
            } else {
                this.field2542 = arg2.method584(255);
            }
        } else {
            this.field2540 = arg2.method584(255);
        }
        ++field2543;
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
    public class159() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "(I)V")
    public static void method1110(int arg0) {
        if (arg0 == 3597) {
            field2541 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(II)[I")
    public final int[] method47(int arg0, int arg1) {
        if (arg1 != 255) {
            return null;
        } else {
            int[] var3 = super.field3445.method1755(arg0, (byte) 98);
            ++field2537;
            if (super.field3445.field4163) {
                for (int var4 = 0; var4 < class244.field4015; ++var4) {
                    int var5 = class166.field2657[var4];
                    int var6 = class76.field956[arg0];
                    int var7 = this.field2540 * var5 >> 12;
                    int var8 = var6 % (4096 / this.field2542) * this.field2542;
                    int var9 = var5 % (4096 / this.field2540) * this.field2540;
                    int var10 = this.field2542 * var6 >> 12;
                    if (~var8 > ~this.field2539) {
                        for (var7 -= var10; var7 < 0; var7 += 4) {
                        }
                        while (~var7 < -4) {
                            var7 -= 4;
                        }
                        if (var7 != 1) {
                            var3[var4] = 0;
                            continue;
                        }
                        if (~this.field2539 < ~var9) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    if (~var9 > ~this.field2539) {
                        int var11;
                        for (var11 = var7 - var10; var11 < 0; var11 += 4) {
                        }
                        while (var11 > 3) {
                            var11 -= 4;
                        }
                        if (var11 > 0) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    var3[var4] = 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(II)Lgj;")
    public static final class253 method1111(int arg0, int arg1) {
        class253 var2 = (class253) class88.field1082.method1693((long) arg0, 117);
        ++field2538;
        if (arg1 <= 3) {
            method1111(10, -51);
        }
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class286.field4556.method928(34, (byte) 114, arg0);
            class253 var4 = new class253();
            if (var3 != null) {
                var4.method1736(new class96(var3), -1, arg0);
            }
            class88.field1082.method1694(true, (long) arg0, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(CI)Z")
    public static final boolean method1112(char arg0, int arg1) {
        if (arg1 >= -103) {
            field2536 = 15;
        }
        ++field2544;
        return ~arg0 <= -66 && ~arg0 >= -91 || arg0 >= 'a' && arg0 <= 'z';
    }
}
