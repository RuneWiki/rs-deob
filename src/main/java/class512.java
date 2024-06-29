import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class512 extends class184 {

    @OriginalMember(owner = "client!hb", name = "E", descriptor = "Ljk;")
    public static class449 field7423 = new class449(260);

    @OriginalMember(owner = "client!hb", name = "I", descriptor = "Lap;")
    public static class335 field7427 = new class335("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

    @OriginalMember(owner = "client!hb", name = "J", descriptor = "[I")
    public static int[] field7428 = new int[6];

    @OriginalMember(owner = "client!hb", name = "K", descriptor = "Lkg;")
    public static class179 field7429 = new class179(62, -1);

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "I")
    public static int field7422;

    @OriginalMember(owner = "client!hb", name = "F", descriptor = "I")
    public static int field7424;

    @OriginalMember(owner = "client!hb", name = "G", descriptor = "I")
    public static int field7425;

    @OriginalMember(owner = "client!hb", name = "H", descriptor = "I")
    public static int field7426;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BILfh;)V")
    public final void method7(byte arg0, int arg1, class463 arg2) {
        if (arg1 == 0) {
            super.field2406 = arg2.method2737(false) == 1;
        }
        ++field7425;
        int var4 = -126 % ((arg0 - -13) / 51);
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)V")
    public static void method3059(byte arg0) {
        field7429 = null;
        field7423 = null;
        if (arg0 >= 41) {
            field7428 = null;
            field7427 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)[[I")
    public final int[][] method13(int arg0, int arg1) {
        ++field7426;
        int[][] var3 = super.field2416.method3031(-28526, arg0);
        if (arg1 != 1) {
            return null;
        } else {
            if (super.field2416.field7271) {
                int[] var4 = this.method1159(arg1 + 50, arg0, 2);
                int[][] var5 = this.method1163(1, arg0, 0);
                int[][] var6 = this.method1163(1, arg0, 1);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                int[] var10 = var5[0];
                int[] var11 = var5[1];
                int[] var12 = var5[2];
                int[] var13 = var6[0];
                int[] var14 = var6[1];
                int[] var15 = var6[2];
                for (int var16 = 0; class245.field3167 > var16; ++var16) {
                    int var17 = var4[var16];
                    if (~var17 != -4097) {
                        if (~var17 != -1) {
                            int var18 = -var17 + 4096;
                            var7[var16] = var10[var16] * var17 - -(var13[var16] * var18) >> 12;
                            var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                            var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                        } else {
                            var7[var16] = var13[var16];
                            var8[var16] = var14[var16];
                            var9[var16] = var15[var16];
                        }
                    } else {
                        var7[var16] = var10[var16];
                        var8[var16] = var11[var16];
                        var9[var16] = var12[var16];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
    public class512() {
        super(3, false);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)[I")
    public final int[] method6(int arg0, int arg1) {
        ++field7424;
        if (arg1 != 578) {
            return null;
        } else {
            int[] var3 = super.field2409.method248(arg0, 16776960);
            if (super.field2409.field436) {
                int[] var4 = this.method1159(70, arg0, 0);
                int[] var5 = this.method1159(arg1 ^ 547, arg0, 1);
                int[] var6 = this.method1159(120, arg0, 2);
                for (int var7 = 0; ~var7 > ~class245.field3167; ++var7) {
                    int var8 = var6[var7];
                    if (var8 != 4096) {
                        if (~var8 != -1) {
                            var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                        } else {
                            var3[var7] = var5[var7];
                        }
                    } else {
                        var3[var7] = var4[var7];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIBLqi;I)V")
    public static final void method3060(int arg0, int arg1, byte arg2, class400 arg3, int arg4) {
        ++field7422;
        long var5 = (long) (arg0 << 28 | arg1 << 14 | arg4);
        class91 var7 = (class91) class201.field2614.method2022(-1, var5);
        if (var7 == null) {
            class91 var8 = new class91();
            class201.field2614.method2019((byte) -51, var8, var5);
            var8.field1112.method163(arg3, 0);
        } else {
            class9 var9 = class376.field4949.method624((byte) -115, arg3.field5703);
            int var10 = var9.field119;
            if (var9.field138 == 1) {
                var10 = (arg3.field5707 + 1) * var10;
            }
            class400 var11 = (class400) var7.field1112.method153(0);
            if (arg2 > -46) {
                method3060(95, -52, (byte) 9, (class400) null, 115);
            }
            while (var11 != null) {
                class9 var12 = class376.field4949.method624((byte) -112, var11.field5703);
                int var13 = var12.field119;
                if (~var12.field138 == -2) {
                    var13 = (var11.field5707 + 1) * var13;
                }
                if (~var13 > ~var10) {
                    class102.method766(123, var11, arg3);
                    return;
                }
                var11 = (class400) var7.field1112.method161(-106);
            }
            var7.field1112.method163(arg3, 0);
        }
    }
}
