import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class196 extends class222 {

    @OriginalMember(owner = "client!fi", name = "W", descriptor = "I")
    private int field3378 = 4096;

    @OriginalMember(owner = "client!fi", name = "X", descriptor = "I")
    private int field3379 = 4096;

    @OriginalMember(owner = "client!fi", name = "gb", descriptor = "I")
    private int field3388 = 4096;

    @OriginalMember(owner = "client!fi", name = "Y", descriptor = "Lsb;")
    private static class98 field3380 = class47.method368("Allocated memory", 0);

    @OriginalMember(owner = "client!fi", name = "db", descriptor = "Lsb;")
    public static class98 field3385 = field3380;

    @OriginalMember(owner = "client!fi", name = "eb", descriptor = "Lsb;")
    public static class98 field3386 = class47.method368("Abbrechen", 0);

    @OriginalMember(owner = "client!fi", name = "hb", descriptor = "Lsb;")
    private static class98 field3389 = class47.method368("glow3:", 0);

    @OriginalMember(owner = "client!fi", name = "fb", descriptor = "Lsb;")
    public static class98 field3387 = field3389;

    @OriginalMember(owner = "client!fi", name = "cb", descriptor = "Lsb;")
    public static class98 field3384 = field3389;

    @OriginalMember(owner = "client!fi", name = "jb", descriptor = "I")
    public static int field3391 = -1;

    @OriginalMember(owner = "client!fi", name = "Z", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!fi", name = "ab", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!fi", name = "bb", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!fi", name = "ib", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "(B)V")
    public static void method1345(byte arg0) {
        field3389 = null;
        field3384 = null;
        if (arg0 != -35) {
            method1345((byte) 117);
        }
        field3380 = null;
        field3386 = null;
        field3387 = null;
        field3385 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Llj;ZI)V")
    public final void method3(class216 arg0, boolean arg1, int arg2) {
        ++field3383;
        if (arg1) {
            field3387 = null;
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field3379 = arg0.method1487(84);
                }
            } else {
                this.field3388 = arg0.method1487(37);
            }
        } else {
            this.field3378 = arg0.method1487(97);
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
    public class196() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(II)[[I")
    public final int[][] method4(int arg0, int arg1) {
        ++field3390;
        if (arg1 != 1) {
            this.method4(-8, -99);
        }
        int[][] var3 = super.field3834.method627(4103, arg0);
        if (super.field3834.field1486) {
            int[][] var4 = this.method1531(arg0, 0, 119);
            int[] var5 = var3[0];
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            int[] var8 = var3[1];
            int[] var9 = var4[2];
            int[] var10 = var3[2];
            for (int var11 = 0; class13.field253 > var11; ++var11) {
                int var12 = var6[var11];
                int var13 = var9[var11];
                int var14 = var7[var11];
                if (~var12 == ~var13 && var13 == var14) {
                    var5[var11] = this.field3378 * var12 >> 12;
                    var8[var11] = this.field3388 * var13 >> 12;
                    var10[var11] = this.field3379 * var14 >> 12;
                } else {
                    var5[var11] = this.field3378;
                    var8[var11] = this.field3388;
                    var10[var11] = this.field3379;
                }
            }
        }
        return var3;
    }
}
