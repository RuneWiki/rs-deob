import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class444 extends class148 {

    @OriginalMember(owner = "client!mh", name = "L", descriptor = "Z")
    private boolean field6608 = true;

    @OriginalMember(owner = "client!mh", name = "J", descriptor = "Z")
    private boolean field6606 = true;

    @OriginalMember(owner = "client!mh", name = "P", descriptor = "Llt;")
    public static class475 field6612;

    @OriginalMember(owner = "client!mh", name = "S", descriptor = "Z")
    public static boolean field6615;

    @OriginalMember(owner = "client!mh", name = "R", descriptor = "Lgo;")
    public static class441 field6614;

    @OriginalMember(owner = "client!mh", name = "K", descriptor = "I")
    public static int field6607;

    @OriginalMember(owner = "client!mh", name = "M", descriptor = "I")
    public static int field6609;

    @OriginalMember(owner = "client!mh", name = "N", descriptor = "I")
    public static int field6610;

    @OriginalMember(owner = "client!mh", name = "O", descriptor = "I")
    public static int field6611;

    @OriginalMember(owner = "client!mh", name = "Q", descriptor = "I")
    public static int field6613;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field6611;
        int[] var3 = super.field2193.method497(arg1, false);
        if (super.field2193.field1312) {
            int[] var4 = this.method971(false, this.field6606 ? -arg1 + class39.field569 : arg1, 0);
            if (!this.field6608) {
                class520.method3073(var4, 0, var3, 0, class320.field4579);
            } else {
                for (int var5 = 0; ~class320.field4579 < ~var5; ++var5) {
                    var3[var5] = var4[-var5 + class304.field4339];
                }
            }
        }
        if (arg0 > -65) {
            this.field6608 = true;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
    public class444() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)Lwo;")
    public static final class522 method2670(int arg0, int arg1, int arg2) {
        class518 var3 = class108.field1553[arg0][arg1][arg2];
        return var3 == null ? null : var3.field7551;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method27(boolean arg0, int arg1) {
        ++field6609;
        int[][] var3 = super.field2189.method2422(-2, arg1);
        if (!arg0) {
            field6615 = true;
        }
        if (super.field2189.field6033) {
            int[][] var4 = this.method974(true, 0, this.field6606 ? class39.field569 - arg1 : arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field6608) {
                for (int var11 = 0; class320.field4579 > var11; ++var11) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; class320.field4579 > var12; ++var12) {
                    var8[var12] = var5[-var12 + class304.field4339];
                    var9[var12] = var6[-var12 + class304.field4339];
                    var10[var12] = var7[-var12 + class304.field4339];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(CI)Z")
    public static final boolean method2671(char arg0, int arg1) {
        if (arg1 > -80) {
            field6612 = null;
        }
        ++field6607;
        return ~arg0 <= -49 && ~arg0 >= -58;
    }

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "(I)V")
    public static void method2672(int arg0) {
        field6614 = null;
        field6612 = null;
        if (arg0 != 0) {
            field6614 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILdh;I)V")
    public final void method23(int arg0, class209 arg1, int arg2) {
        int var4 = -54 / ((arg2 - -88) / 33);
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field2183 = ~arg1.method1428(32122) == -2;
                }
            } else {
                this.field6606 = ~arg1.method1428(32122) == -2;
            }
        } else {
            this.field6608 = ~arg1.method1428(32122) == -2;
        }
        ++field6610;
    }

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "(B)Z")
    public static final boolean method2673(byte arg0) {
        if (arg0 != -12) {
            return false;
        } else {
            ++field6613;
            try {
                if (class150.field2232 == 2) {
                    if (class470.field6931 == null) {
                        class470.field6931 = class373.method2294(class197.field2869, class107.field1546, class237.field3495);
                        if (class470.field6931 == null) {
                            return false;
                        }
                    }
                    if (class165.field2424 == null) {
                        class165.field2424 = new class150(class437.field6530, class191.field2810);
                    }
                    if (class411.field6178.method1251(class165.field2424, class479.field7042, 22050, 127, class470.field6931)) {
                        class411.field6178.method1255((byte) 76);
                        class411.field6178.method1240((byte) 106, class146.field2162);
                        class411.field6178.method1235(-1, class470.field6931, class23.field239);
                        class150.field2232 = 0;
                        class470.field6931 = null;
                        class165.field2424 = null;
                        class197.field2869 = null;
                        return true;
                    }
                }
            } catch (Exception var2) {
                var2.printStackTrace();
                class411.field6178.method1242(2);
                class470.field6931 = null;
                class165.field2424 = null;
                class150.field2232 = 0;
                class197.field2869 = null;
            }
            return false;
        }
    }

    static {
        new class475("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field6612 = new class475("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");
        field6615 = false;
        field6614 = new class441(15, 0, 1, 0);
    }
}
