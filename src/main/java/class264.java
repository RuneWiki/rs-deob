import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class264 {

    @OriginalMember(owner = "client!oba", name = "f", descriptor = "I")
    public int field3454 = -1;

    @OriginalMember(owner = "client!oba", name = "o", descriptor = "Lbfa;")
    public static class372 field3463 = null;

    @OriginalMember(owner = "client!oba", name = "d", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!oba", name = "e", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!oba", name = "k", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!oba", name = "r", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!oba", name = "g", descriptor = "Lwr;")
    private class459 field3455;

    @OriginalMember(owner = "client!oba", name = "l", descriptor = "Ljava/lang/String;")
    private String field3460;

    @OriginalMember(owner = "client!oba", name = "v", descriptor = "Ljava/lang/String;")
    private String field3470;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "[I")
    private int[] field3449;

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "[I")
    private int[] field3450;

    @OriginalMember(owner = "client!oba", name = "h", descriptor = "[I")
    private int[] field3456;

    @OriginalMember(owner = "client!oba", name = "i", descriptor = "[I")
    private int[] field3457;

    @OriginalMember(owner = "client!oba", name = "j", descriptor = "[I")
    private int[] field3458;

    @OriginalMember(owner = "client!oba", name = "m", descriptor = "[I")
    private int[] field3461;

    @OriginalMember(owner = "client!oba", name = "s", descriptor = "[I")
    private int[] field3467;

    @OriginalMember(owner = "client!oba", name = "t", descriptor = "[I")
    private int[] field3468;

    @OriginalMember(owner = "client!oba", name = "n", descriptor = "[Ljava/lang/String;")
    private String[] field3462;

    @OriginalMember(owner = "client!oba", name = "u", descriptor = "[Ljava/lang/String;")
    private String[] field3469;

    @OriginalMember(owner = "client!oba", name = "c", descriptor = "[[I")
    private int[][] field3451;

    @OriginalMember(owner = "client!oba", name = "p", descriptor = "[[I")
    private int[][] field3464;

    @OriginalMember(owner = "client!oba", name = "q", descriptor = "[[I")
    private int[][] field3465;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(BLji;)V", line = 4)
    public final void method1580(byte arg0, class611 arg1) {
        field3466++;
        while (true) {
            int var3 = arg1.method3428((byte) 32);
            if (var3 == 0) {
                if (arg0 > -106) {
                    this.field3470 = null;
                    return;
                } else {
                    return;
                }
            }
            this.method1582(arg1, var3, 98);
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(I)V", line = 55)
    public static void method1581(int arg0) {
        field3463 = null;
        int var1 = 102 % ((arg0 - 23) / 39);
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lji;II)V", line = 72)
    private final void method1582(class611 arg0, int arg1, int arg2) {
        field3459++;
        if (arg1 == 1) {
            this.field3470 = arg0.method3422(-1);
        } else if (arg1 == 2) {
            this.field3460 = arg0.method3422(-1);
        } else if (arg1 == 3) {
            int var22 = arg0.method3428((byte) 35);
            this.field3465 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field3465[var23][0] = arg0.method3402((byte) 127);
                this.field3465[var23][1] = arg0.method3418(-2);
                this.field3465[var23][2] = arg0.method3418(-2);
            }
        } else if (arg1 == 4) {
            int var4 = arg0.method3428((byte) -1);
            this.field3451 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3451[var5][0] = arg0.method3402((byte) 127);
                this.field3451[var5][1] = arg0.method3418(-2);
                this.field3451[var5][2] = arg0.method3418(-2);
            }
        } else if (arg1 == 5) {
            arg0.method3402((byte) 127);
        } else if (arg1 == 6) {
            arg0.method3428((byte) -121);
        } else if (arg1 == 7) {
            arg0.method3428((byte) 95);
        } else if (arg1 != 8) {
            if (arg1 == 9) {
                arg0.method3428((byte) -102);
            } else if (arg1 == 10) {
                int var6 = arg0.method3428((byte) -126);
                this.field3457 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field3457[var7] = arg0.method3418(-2);
                }
            } else if (arg1 == 12) {
                arg0.method3418(-2);
            } else if (arg1 == 13) {
                int var8 = arg0.method3428((byte) 44);
                this.field3456 = new int[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field3456[var9] = arg0.method3402((byte) 127);
                }
            } else if (arg1 == 14) {
                int var10 = arg0.method3428((byte) 41);
                this.field3464 = new int[var10][2];
                for (int var11 = 0; var11 < var10; var11++) {
                    this.field3464[var11][0] = arg0.method3428((byte) -114);
                    this.field3464[var11][1] = arg0.method3428((byte) -119);
                }
            } else if (arg1 == 15) {
                arg0.method3402((byte) 127);
            } else if (arg1 == 17) {
                this.field3454 = arg0.method3402((byte) 127);
            } else if (arg1 == 18) {
                int var12 = arg0.method3428((byte) 87);
                this.field3458 = new int[var12];
                this.field3450 = new int[var12];
                this.field3469 = new String[var12];
                this.field3468 = new int[var12];
                for (int var13 = 0; var13 < var12; var13++) {
                    this.field3450[var13] = arg0.method3418(-2);
                    this.field3458[var13] = arg0.method3418(-2);
                    this.field3468[var13] = arg0.method3418(-2);
                    this.field3469[var13] = arg0.method3403((byte) 84);
                }
            } else if (arg1 == 19) {
                int var20 = arg0.method3428((byte) -119);
                this.field3461 = new int[var20];
                this.field3462 = new String[var20];
                this.field3449 = new int[var20];
                this.field3467 = new int[var20];
                for (int var21 = 0; var21 < var20; var21++) {
                    this.field3449[var21] = arg0.method3418(-2);
                    this.field3461[var21] = arg0.method3418(-2);
                    this.field3467[var21] = arg0.method3418(-2);
                    this.field3462[var21] = arg0.method3403((byte) 84);
                }
            } else if (arg1 == 249) {
                int var14 = arg0.method3428((byte) -109);
                if (this.field3455 == null) {
                    int var15 = class128.method814(423660257, var14);
                    this.field3455 = new class459(var15);
                }
                for (int var16 = 0; var16 < var14; var16++) {
                    boolean var17 = arg0.method3428((byte) 3) == 1;
                    int var18 = arg0.method3385(-125);
                    class55 var19;
                    if (var17) {
                        var19 = new class273(arg0.method3403((byte) 84));
                    } else {
                        var19 = new class629(arg0.method3418(-2));
                    }
                    this.field3455.method2558(var19, (long) var18, -1);
                }
            }
        }
        int var24 = 36 % ((arg2 - 6) / 48);
    }

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "(I)V", line = 304)
    public final void method1583(int arg0) {
        field3453++;
        if (arg0 != -9639) {
            this.field3456 = null;
        }
        if (this.field3460 == null) {
            this.field3460 = this.field3470;
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(B)V", line = 332)
    public static final void method1584(byte arg0) {
        class643.field8975 = new class573[50];
        class635.field8835 = 0;
        if (arg0 > 117) {
            field3452++;
        }
    }
}
