import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class205 extends class197 {

    @OriginalMember(owner = "client!wi", name = "T", descriptor = "I")
    private int field3548 = 1365;

    @OriginalMember(owner = "client!wi", name = "V", descriptor = "I")
    private int field3550 = 0;

    @OriginalMember(owner = "client!wi", name = "X", descriptor = "I")
    private int field3552 = 20;

    @OriginalMember(owner = "client!wi", name = "U", descriptor = "I")
    private int field3549 = 0;

    @OriginalMember(owner = "client!wi", name = "W", descriptor = "Loh;")
    private static class258 field3551 = class153.method1046("RuneScape is loading )2 please wait)3)3)3", 87);

    @OriginalMember(owner = "client!wi", name = "O", descriptor = "Loh;")
    public static class258 field3543 = field3551;

    @OriginalMember(owner = "client!wi", name = "N", descriptor = "Lfk;")
    public static class144 field3542 = new class144(16);

    @OriginalMember(owner = "client!wi", name = "Z", descriptor = "I")
    public static int field3554 = -1;

    @OriginalMember(owner = "client!wi", name = "ab", descriptor = "Loh;")
    public static class258 field3555 = class153.method1046("Lade Benutzeroberfl-=che )2 ", 102);

    @OriginalMember(owner = "client!wi", name = "M", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!wi", name = "Q", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!wi", name = "R", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!wi", name = "S", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!wi", name = "P", descriptor = "Lgb;")
    public static class213 field3544;

    @OriginalMember(owner = "client!wi", name = "Y", descriptor = "Lhh;")
    public static class80 field3553;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V", line = 5)
    public static void method1359(int arg0) {
        if (arg0 <= 114) {
            method1360(25, (byte) -48, 53, 22, -124, -46);
        }
        field3544 = null;
        field3553 = null;
        field3543 = null;
        field3542 = null;
        field3555 = null;
        field3551 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)[I", line = 27)
    public final int[] method96(int arg0, int arg1) {
        field3546++;
        int[] var3 = this.field3456.method2104(arg1, 0);
        if (arg0 != -16221) {
            return (int[]) null;
        }
        if (this.field3456.field5115) {
            for (int var4 = 0; var4 < class190.field3362; var4++) {
                int var5 = (class166.field2822[var4] << 12) / this.field3548 + this.field3549;
                int var6 = (class268.field4670[arg1] << 12) / this.field3548 + this.field3550;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while ((var11 + var12) < 16384 && this.field3552 > var13) {
                    var13++;
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = var11 + var7 - var12;
                    var12 = var10 * var10 >> 12;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = var13 >= this.field3552 - 1 ? 0 : (var13 << 12) / this.field3552;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IBIIII)V", line = 88)
    public static final void method1360(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg2 - arg3;
        field3547++;
        int var7 = arg0 - arg5;
        if (var7 == 0) {
            if (var6 != 0) {
                class32.method233(117, arg4, arg2, arg5, arg3);
            }
        } else if (var6 == 0) {
            class168.method1115(arg0, (byte) 12, arg5, arg4, arg3);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg5;
                int var10 = arg0;
                arg0 = arg2;
                arg2 = var10;
                arg5 = arg3;
                arg3 = var9;
            }
            if (arg0 < arg5) {
                int var11 = arg5;
                arg5 = arg0;
                arg0 = var11;
                int var12 = arg3;
                arg3 = arg2;
                arg2 = var12;
            }
            int var13 = arg3;
            int var14 = arg2 - arg3;
            int var15 = arg0 - arg5;
            if (arg1 != 110) {
                method1359(-99);
            }
            if (var14 < 0) {
                var14 = -var14;
            }
            int var16 = -(var15 >> 1);
            int var17 = arg2 > arg3 ? 1 : -1;
            if (var8) {
                for (int var19 = arg5; var19 <= arg0; var19++) {
                    class154.field2638[var19][var13] = arg4;
                    var16 += var14;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var15;
                    }
                }
            } else {
                for (int var18 = arg5; var18 <= arg0; var18++) {
                    var16 += var14;
                    class154.field2638[var13][var18] = arg4;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var15;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V", line = 215)
    public class205() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)V", line = 220)
    public static final void method1361(int arg0) {
        if (arg0 != 20) {
            method1361(-87);
        }
        class166.field2816.method1157(arg0 ^ 0x10);
        field3541++;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILva;I)V", line = 250)
    public final void method98(int arg0, class235 arg1, int arg2) {
        if (arg0 != 7955) {
            return;
        }
        if (arg2 == 0) {
            this.field3548 = arg1.method1615(-120);
        } else if (arg2 == 1) {
            this.field3552 = arg1.method1615(arg0 ^ 0x1F01);
        } else if (arg2 == 2) {
            this.field3549 = arg1.method1615(108);
        } else if (arg2 == 3) {
            this.field3550 = arg1.method1615(-125);
        }
        field3545++;
    }
}
