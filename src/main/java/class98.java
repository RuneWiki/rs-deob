import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class98 extends class45 {

    @OriginalMember(owner = "client!pj", name = "H", descriptor = "I")
    private int field1624 = 1;

    @OriginalMember(owner = "client!pj", name = "L", descriptor = "I")
    private int field1628 = 204;

    @OriginalMember(owner = "client!pj", name = "I", descriptor = "I")
    private int field1625 = 1;

    @OriginalMember(owner = "client!pj", name = "K", descriptor = "Liv;")
    public static class64 field1627 = new class64(49, 2);

    @OriginalMember(owner = "client!pj", name = "P", descriptor = "Lgr;")
    public static class296 field1632;

    @OriginalMember(owner = "client!pj", name = "N", descriptor = "F")
    public static float field1630;

    @OriginalMember(owner = "client!pj", name = "J", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!pj", name = "M", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!pj", name = "O", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!pj", name = "R", descriptor = "Lbu;")
    public static class17 field1634;

    @OriginalMember(owner = "client!pj", name = "Q", descriptor = "[[I")
    public static int[][] field1633;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "(B)V")
    public static void method738(byte arg0) {
        field1633 = null;
        field1632 = null;
        field1627 = null;
        if (arg0 == 67) {
            field1634 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lcu;II)V")
    public final void method37(class145 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field1628 = arg0.method1069((byte) -47);
                }
            } else {
                this.field1625 = arg0.method1063((byte) -49);
            }
        } else {
            this.field1624 = arg0.method1063((byte) 126);
        }
        if (arg1 != -26471) {
            this.method35(-74, 7);
        }
        ++field1626;
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
    public class98() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field1629;
            int[] var3 = super.field854.method863((byte) 12, arg1);
            if (super.field854.field1928) {
                for (int var4 = 0; var4 < class259.field3768; ++var4) {
                    int var5 = class69.field1199[var4];
                    int var6 = class433.field6429[arg1];
                    int var7 = this.field1624 * var5 >> 12;
                    int var8 = this.field1625 * var6 >> 12;
                    int var9 = var5 % (4096 / this.field1624) * this.field1624;
                    int var10 = var6 % (4096 / this.field1625) * this.field1625;
                    if (~this.field1628 < ~var10) {
                        for (var7 -= var8; ~var7 > -1; var7 += 4) {
                        }
                        while (var7 > 3) {
                            var7 -= 4;
                        }
                        if (~var7 != -2) {
                            var3[var4] = 0;
                            continue;
                        }
                        if (~this.field1628 < ~var9) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    if (this.field1628 > var9) {
                        int var11;
                        for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                        }
                        while (~var11 < -4) {
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

    static {
        new class342("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
        field1632 = new class296(14, -1);
    }
}
