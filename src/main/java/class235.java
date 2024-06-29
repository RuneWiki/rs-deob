import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class235 extends class243 {

    @OriginalMember(owner = "client!ag", name = "Y", descriptor = "Z")
    private boolean field4064 = true;

    @OriginalMember(owner = "client!ag", name = "gb", descriptor = "Z")
    private boolean field4072 = true;

    @OriginalMember(owner = "client!ag", name = "bb", descriptor = "I")
    public static int field4067 = 0;

    @OriginalMember(owner = "client!ag", name = "cb", descriptor = "Lub;")
    public static class227 field4068 = class257.method1749("rect_debug=", 17263);

    @OriginalMember(owner = "client!ag", name = "ib", descriptor = "Luh;")
    public static class198 field4074 = new class198();

    @OriginalMember(owner = "client!ag", name = "lb", descriptor = "I")
    public static int field4077 = 20;

    @OriginalMember(owner = "client!ag", name = "Z", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!ag", name = "ab", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!ag", name = "eb", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!ag", name = "fb", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!ag", name = "hb", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!ag", name = "jb", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!ag", name = "nb", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!ag", name = "db", descriptor = "Lwa;")
    public static class135 field4069;

    @OriginalMember(owner = "client!ag", name = "mb", descriptor = "Ltb;")
    public static class253 field4078;

    @OriginalMember(owner = "client!ag", name = "kb", descriptor = "Z")
    public static boolean field4076;

    @OriginalMember(owner = "client!ag", name = "ob", descriptor = "[[[I")
    public static int[][][] field4080;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lnj;ZI)V")
    public final void method81(class226 arg0, boolean arg1, int arg2) {
        ++field4065;
        if (!arg1) {
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (~arg2 == -3) {
                        super.field4230 = arg0.method1471(255) == 1;
                    }
                } else {
                    this.field4064 = arg0.method1471(255) == 1;
                }
            } else {
                this.field4072 = arg0.method1471(255) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
    public class235() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "(I)V")
    public static void method1568(int arg0) {
        field4078 = null;
        field4080 = null;
        field4069 = null;
        field4068 = null;
        field4074 = null;
        if (arg0 != 128) {
            field4068 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(III)Z")
    public static final boolean method1569(int arg0, int arg1, int arg2) {
        int var3 = class257.field4506[arg0][arg1][arg2];
        if (-class38.field627 == var3) {
            return false;
        } else if (class38.field627 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class204.method1304(var4 + 1, class98.field1717[arg0][arg1][arg2], var5 + 1) && class204.method1304(var4 + 128 - 1, class98.field1717[arg0][arg1 + 1][arg2], var5 + 1) && class204.method1304(var4 + 128 - 1, class98.field1717[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class204.method1304(var4 + 1, class98.field1717[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class257.field4506[arg0][arg1][arg2] = class38.field627;
                return true;
            } else {
                class257.field4506[arg0][arg1][arg2] = -class38.field627;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIII)V")
    public static final void method1570(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class161.field2718 = arg0;
        if (arg2 != 1) {
            method1570(30, 114, -4, 66, 67);
        }
        class19.field331 = arg4;
        ++field4073;
        class46.field817 = arg1;
        class125.field2234 = arg3;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)[[I")
    public final int[][] method80(int arg0, int arg1) {
        ++field4075;
        if (arg0 != 230) {
            return null;
        } else {
            int[][] var3 = super.field4213.method1406(arg1, arg0 + -230);
            if (super.field4213.field3771) {
                int[][] var4 = this.method1616(arg0 + -231, !this.field4064 ? arg1 : -arg1 + class254.field4469, 0);
                int[] var5 = var4[1];
                int[] var6 = var4[0];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[2];
                int[] var10 = var3[1];
                if (this.field4072) {
                    for (int var11 = 0; ~var11 > ~class212.field3586; ++var11) {
                        var8[var11] = var6[-var11 + class179.field3062];
                        var10[var11] = var5[-var11 + class179.field3062];
                        var9[var11] = var7[class179.field3062 - var11];
                    }
                } else {
                    for (int var12 = 0; ~var12 > ~class212.field3586; ++var12) {
                        var8[var12] = var6[var12];
                        var10[var12] = var5[var12];
                        var9[var12] = var7[var12];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(II)[I")
    public final int[] method77(int arg0, int arg1) {
        ++field4070;
        int var3 = 40 % ((-15 - arg0) / 51);
        int[] var4 = super.field4215.method984(arg1, 0);
        if (super.field4215.field2707) {
            int[] var5 = this.method1614(0, !this.field4064 ? arg1 : -arg1 + class254.field4469, 102);
            if (this.field4072) {
                for (int var6 = 0; class212.field3586 > var6; ++var6) {
                    var4[var6] = var5[-var6 + class179.field3062];
                }
            } else {
                class68.method424(var5, 0, var4, 0, class212.field3586);
            }
        }
        return var4;
    }
}
