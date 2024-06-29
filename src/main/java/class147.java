import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class147 extends class17 {

    @OriginalMember(owner = "client!va", name = "jb", descriptor = "I")
    private int field2646 = 4096;

    @OriginalMember(owner = "client!va", name = "lb", descriptor = "I")
    private int field2648 = 4096;

    @OriginalMember(owner = "client!va", name = "nb", descriptor = "I")
    private int field2650 = 4096;

    @OriginalMember(owner = "client!va", name = "eb", descriptor = "Lsf;")
    public static class108 field2641 = class140.method973(255, "0");

    @OriginalMember(owner = "client!va", name = "gb", descriptor = "F")
    public static float field2643;

    @OriginalMember(owner = "client!va", name = "ab", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!va", name = "bb", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!va", name = "cb", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!va", name = "fb", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!va", name = "hb", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!va", name = "ib", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!va", name = "kb", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!va", name = "mb", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!va", name = "db", descriptor = "[Lse;")
    public static class12[] field2640;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "(I)V", line = 14)
    public static void method1022(int arg0) {
        if (arg0 != 1) {
            method1023((byte) -18);
        }
        field2641 = null;
        field2640 = null;
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(B)[Lvd;", line = 29)
    public static final class135[] method1023(byte arg0) {
        if (arg0 < 116) {
            field2637 = -110;
        }
        field2639++;
        class135[] var1 = new class135[class196.field3546];
        for (int var2 = 0; var2 < class196.field3546; var2++) {
            int var3 = class273.field4795[var2] * class155.field2780[var2];
            byte[] var4 = class94.field1512[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class321.field5494[class162.method1118(var4[var6], 255)];
            }
            if (class231.field4051) {
                var1[var2] = new class49(class95.field1519, class197.field3560, class154.field2775[var2], class88.field1383[var2], class155.field2780[var2], class273.field4795[var2], var5);
            } else {
                var1[var2] = new class12(class95.field1519, class197.field3560, class154.field2775[var2], class88.field1383[var2], class155.field2780[var2], class273.field4795[var2], var5);
            }
        }
        class15.method100(1);
        return var1;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZI)[[I", line = 77)
    public final int[][] method122(boolean arg0, int arg1) {
        if (arg0) {
            this.field2650 = -35;
        }
        int[][] var3 = this.field224.method2081(arg1, -103);
        if (this.field224.field5106) {
            int[][] var4 = this.method111(3, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class116.field2008; var11++) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && var13 == var14) {
                    var8[var11] = this.field2650 * var12 >> 12;
                    var10[var11] = this.field2646 * var13 >> 12;
                    var9[var11] = this.field2648 * var14 >> 12;
                } else {
                    var8[var11] = this.field2650;
                    var10[var11] = this.field2646;
                    var9[var11] = this.field2648;
                }
            }
        }
        field2647++;
        return var3;
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(B)La;", line = 139)
    public static final class278 method1024(byte arg0) {
        if (arg0 == -24) {
            class219.field3896 = 0;
            field2645++;
            return class170.method1179((byte) -111);
        } else {
            return (class278) null;
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V", line = 159)
    public class147() {
        super(1, false);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BLrm;I)V", line = 169)
    public final void method114(byte arg0, class249 arg1, int arg2) {
        if (arg0 != -114) {
            this.method122(true, 8);
        }
        if (arg2 == 0) {
            this.field2650 = arg1.method1712(-1);
        } else if (arg2 == 1) {
            this.field2646 = arg1.method1712(-1);
        } else if (arg2 == 2) {
            this.field2648 = arg1.method1712(-1);
        }
        field2642++;
    }
}
