import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class541 extends class17 {

    @OriginalMember(owner = "client!ms", name = "K", descriptor = "I")
    private int field7914 = 1;

    @OriginalMember(owner = "client!ms", name = "J", descriptor = "I")
    private int field7913 = 204;

    @OriginalMember(owner = "client!ms", name = "N", descriptor = "I")
    private int field7917 = 1;

    @OriginalMember(owner = "client!ms", name = "F", descriptor = "Lkn;")
    public static class530 field7909 = new class530("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

    @OriginalMember(owner = "client!ms", name = "L", descriptor = "I")
    public static int field7915 = 0;

    @OriginalMember(owner = "client!ms", name = "G", descriptor = "I")
    public static int field7910;

    @OriginalMember(owner = "client!ms", name = "H", descriptor = "I")
    public static int field7911;

    @OriginalMember(owner = "client!ms", name = "I", descriptor = "I")
    public static int field7912;

    @OriginalMember(owner = "client!ms", name = "M", descriptor = "[J")
    public static long[] field7916;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(CB)Z")
    public static final boolean method3179(char arg0, byte arg1) {
        ++field7912;
        if ((arg0 <= 0 || ~arg0 <= -129) && (~arg0 > -161 || arg0 > 255)) {
            if (arg0 != 0) {
                char[] var2 = class422.field5954;
                for (int var3 = 0; var2.length > var3; ++var3) {
                    char var4 = var2[var3];
                    if (~arg0 == ~var4) {
                        return true;
                    }
                }
            }
            return arg1 != -67;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "()V")
    public class541() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(II)[I")
    public final int[] method27(int arg0, int arg1) {
        ++field7911;
        int[] var3 = super.field210.method2683(-17, arg0);
        if (arg1 < 53) {
            return null;
        } else {
            if (super.field210.field6442) {
                for (int var4 = 0; ~class530.field7763 < ~var4; ++var4) {
                    int var5 = class492.field6966[var4];
                    int var6 = class40.field427[arg0];
                    int var7 = this.field7914 * var5 >> 12;
                    int var8 = this.field7917 * var6 >> 12;
                    int var9 = var5 % (4096 / this.field7914) * this.field7914;
                    int var10 = var6 % (4096 / this.field7917) * this.field7917;
                    if (var10 < this.field7913) {
                        for (var7 -= var8; ~var7 > -1; var7 += 4) {
                        }
                        while (var7 > 3) {
                            var7 -= 4;
                        }
                        if (var7 != 1) {
                            var3[var4] = 0;
                            continue;
                        }
                        if (var9 < this.field7913) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    if (this.field7913 > var9) {
                        int var11;
                        for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
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

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lwm;II)V")
    public final void method34(class403 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field7913 = arg0.method2338(0);
                }
            } else {
                this.field7917 = arg0.method2357((byte) 104);
            }
        } else {
            this.field7914 = arg0.method2357((byte) 120);
        }
        if (arg2 != 5159) {
            field7915 = -125;
        }
        ++field7910;
    }

    @OriginalMember(owner = "client!ms", name = "h", descriptor = "(I)V")
    public static void method3180(int arg0) {
        if (arg0 == 4) {
            field7916 = null;
            field7909 = null;
        }
    }
}
