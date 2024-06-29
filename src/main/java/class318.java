import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class318 extends class456 {

    @OriginalMember(owner = "client!u", name = "P", descriptor = "I")
    private int field4772 = 2000;

    @OriginalMember(owner = "client!u", name = "I", descriptor = "I")
    private int field4766 = 0;

    @OriginalMember(owner = "client!u", name = "L", descriptor = "I")
    private int field4768 = 0;

    @OriginalMember(owner = "client!u", name = "R", descriptor = "I")
    private int field4774 = 16;

    @OriginalMember(owner = "client!u", name = "S", descriptor = "I")
    private int field4775 = 4096;

    @OriginalMember(owner = "client!u", name = "U", descriptor = "Les;")
    public static class441 field4777;

    @OriginalMember(owner = "client!u", name = "W", descriptor = "Lo;")
    public static class332 field4779;

    @OriginalMember(owner = "client!u", name = "K", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!u", name = "M", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!u", name = "N", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!u", name = "O", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!u", name = "Q", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!u", name = "T", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!u", name = "V", descriptor = "Lhp;")
    public static class270 field4778;

    @OriginalMember(owner = "client!u", name = "X", descriptor = "[[B")
    public static byte[][] field4780;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(Z)V")
    public static void method1956(boolean arg0) {
        if (arg0) {
            field4779 = null;
        }
        field4779 = null;
        field4778 = null;
        field4780 = null;
        field4777 = null;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
    public class318() {
        super(0, true);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IBLre;)V")
    public final void method210(int arg0, byte arg1, class446 arg2) {
        if (arg1 != 55) {
            this.method33(70, -76);
        }
        ++field4773;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 == -5) {
                            this.field4775 = arg2.method2631(2530);
                        }
                    } else {
                        this.field4766 = arg2.method2631(2530);
                    }
                } else {
                    this.field4774 = arg2.method2628(arg1 + 49097);
                }
            } else {
                this.field4772 = arg2.method2631(arg1 + 2475);
            }
        } else {
            this.field4768 = arg2.method2628(49152);
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(II)[I")
    public final int[] method33(int arg0, int arg1) {
        ++field4767;
        int[] var3 = super.field6466.method2533(true, arg1);
        if (arg0 != -1) {
            this.method33(-118, 80);
        }
        if (super.field6466.field6153) {
            int var4 = this.field4775 >> 1;
            int[][] var5 = super.field6466.method2531(arg0 + -9442);
            Random var6 = new Random((long) this.field4768);
            for (int var7 = 0; var7 < this.field4772; ++var7) {
                int var8 = this.field4775 <= 0 ? this.field4766 : this.field4766 + method1957(this.field4775, (byte) -64, var6) + -var4;
                int var9 = var8 >> 4 & 255;
                int var10 = method1957(class156.field2169, (byte) -64, var6);
                int var11 = method1957(class487.field6842, (byte) -64, var6);
                int var12 = (class489.field6853[var9] * this.field4774 >> 12) + var10;
                int var13 = (class346.field5288[var9] * this.field4774 >> 12) + var11;
                int var14 = -var11 + var13;
                int var15 = var12 - var10;
                if (var15 != 0 || ~var14 != -1) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    boolean var16 = var14 > var15;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var12;
                        var12 = var13;
                        var11 = var17;
                        var13 = var18;
                    }
                    if (var10 > var12) {
                        int var19 = var10;
                        var10 = var12;
                        int var20 = var11;
                        var11 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = 1024 + -(method1957(4096, (byte) -64, var6) >> 2);
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    int var27 = var13 <= var11 ? -1 : 1;
                    for (int var28 = var10; var12 > var28; ++var28) {
                        int var29 = var26 - -((-var10 + var28) * var25) + 1024;
                        int var30 = class428.field6112 & var28;
                        int var31 = class493.field6947 & var21;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        var24 += var23;
                        if (~var24 < -1) {
                            var21 -= -var27;
                            var24 += -var22;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V")
    public final void method653(boolean arg0) {
        ++field4771;
        class154.method1056(-49);
        if (!arg0) {
            this.method210(42, (byte) -81, (class446) null);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IBLjava/util/Random;)I")
    public static final int method1957(int arg0, byte arg1, Random arg2) {
        ++field4769;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class72.method621((byte) -113, arg0)) {
            return (int) ((long) arg0 * (4294967295L & (long) arg2.nextInt()) >> 32);
        } else {
            int var3 = -((int) (4294967296L % (long) arg0)) + Integer.MIN_VALUE;
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (~var4 <= ~var3);
            if (arg1 != -64) {
                field4777 = null;
            }
            return class212.method1425(arg0, true, var4);
        }
    }

    static {
        new class332(" days.", " Tage.", " jours.", " dias.");
        field4777 = new class441("WTQA", 2);
        field4779 = new class332("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");
    }
}
