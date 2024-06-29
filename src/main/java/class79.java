import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class79 extends class276 {

    @OriginalMember(owner = "client!kb", name = "R", descriptor = "Ljava/lang/String;")
    public static String field1361 = "Unable to find ";

    @OriginalMember(owner = "client!kb", name = "M", descriptor = "I")
    public static int field1356 = 20;

    @OriginalMember(owner = "client!kb", name = "U", descriptor = "I")
    public static int field1364 = 0;

    @OriginalMember(owner = "client!kb", name = "S", descriptor = "Lrc;")
    public static class9 field1362 = new class9(64);

    @OriginalMember(owner = "client!kb", name = "N", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!kb", name = "O", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!kb", name = "Q", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!kb", name = "T", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!kb", name = "V", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!kb", name = "W", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!kb", name = "P", descriptor = "Ldl;")
    public static class46 field1359;

    @OriginalMember(owner = "client!kb", name = "X", descriptor = "[[[Lhj;")
    public static class109[][][] field1367;

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
    public class79() {
        super(3, false);
    }

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "(I)V")
    public static void method515(int arg0) {
        field1367 = null;
        if (arg0 <= 9) {
            method515(-31);
        }
        field1362 = null;
        field1359 = null;
        field1361 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILeh;B)V")
    public final void method21(int arg0, class101 arg1, byte arg2) {
        if (~arg0 == -1) {
            super.field4408 = arg1.method669((byte) 36) == 1;
        }
        ++field1366;
        if (arg2 != -1) {
            field1356 = -94;
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)[[I")
    public final int[][] method300(int arg0, int arg1) {
        ++field1360;
        int[][] var3 = super.field4418.method835((byte) 125, arg0);
        if (arg1 != -1) {
            field1364 = -31;
        }
        if (super.field4418.field2164) {
            int[] var4 = this.method1805(false, 2, arg0);
            int[][] var5 = this.method1810((byte) -128, arg0, 0);
            int[][] var6 = this.method1810((byte) -114, arg0, 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var6[0];
            int[] var13 = var5[2];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; class53.field929 > var16; ++var16) {
                int var17 = var4[var16];
                if (~var17 == -4097) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var13[var16];
                } else if (~var17 == -1) {
                    var7[var16] = var12[var16];
                    var8[var16] = var14[var16];
                    var9[var16] = var15[var16];
                } else {
                    int var18 = -var17 + 4096;
                    var7[var16] = var10[var16] * var17 + var12[var16] * var18 >> 12;
                    var8[var16] = var11[var16] * var17 - -(var14[var16] * var18) >> 12;
                    var9[var16] = var13[var16] * var17 + var15[var16] * var18 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)[I")
    public final int[] method23(int arg0, int arg1) {
        ++field1358;
        int[] var3 = super.field4425.method992(17118, arg1);
        if (super.field4425.field2448) {
            int[] var4 = this.method1805(false, 0, arg1);
            int[] var5 = this.method1805(false, 1, arg1);
            int[] var6 = this.method1805(false, 2, arg1);
            for (int var7 = 0; ~var7 > ~class53.field929; ++var7) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (~var8 == -1) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        if (arg0 < 39) {
            field1364 = -85;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILdl;)V")
    public static final void method516(int arg0, class46 arg1) {
        if (arg0 == -373) {
            if (~class24.field378 == ~arg1.field763) {
                class23.field367[arg1.field709] = true;
            }
            ++field1357;
        }
    }
}
