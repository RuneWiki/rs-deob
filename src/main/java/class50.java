import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class50 extends class114 {

    @OriginalMember(owner = "client!dd", name = "Z", descriptor = "Z")
    public boolean field1114 = false;

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "Loi;")
    private class105 field1104;

    @OriginalMember(owner = "client!dd", name = "db", descriptor = "Z")
    private boolean field1118;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "Z")
    private boolean field1098;

    @OriginalMember(owner = "client!dd", name = "P", descriptor = "I")
    private int field1105;

    @OriginalMember(owner = "client!dd", name = "eb", descriptor = "I")
    private int field1119;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "Lia;")
    public static class257 field1097 = class28.method234(-108, "Ablegen");

    @OriginalMember(owner = "client!dd", name = "Q", descriptor = "Lia;")
    private static class257 field1106 = class28.method234(98, "FULL");

    @OriginalMember(owner = "client!dd", name = "T", descriptor = "[I")
    public static int[] field1108 = new int[1000];

    @OriginalMember(owner = "client!dd", name = "R", descriptor = "Lia;")
    public static class257 field1107 = class28.method234(101, "(U2");

    @OriginalMember(owner = "client!dd", name = "W", descriptor = "[I")
    public static int[] field1111 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "Lia;")
    public static class257 field1100 = field1106;

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "F")
    private float field1101;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!dd", name = "N", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!dd", name = "U", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!dd", name = "V", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!dd", name = "Y", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!dd", name = "ab", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!dd", name = "bb", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!dd", name = "cb", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!dd", name = "X", descriptor = "Lk;")
    public static class152 field1112;

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "[I")
    private int[] field1099;

    @OriginalMember(owner = "client!dd", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
        field1115++;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI)V")
    public final void method388(byte arg0, int arg1) {
        field1103++;
        int var3 = 46 % ((26 - arg0) / 52);
        if (this.field1099 == null || this.field1119 == 0 && this.field1105 == 0) {
            return;
        }
        if (class260.field4509 == null || this.field1099.length > class260.field4509.length) {
            class260.field4509 = new int[this.field1099.length];
        }
        int var4 = this.field1099.length;
        int var5 = this.field1105 * arg1;
        int var6 = var4 - 1;
        int var7 = this.field1099.length == 4096 ? 64 : 128;
        int var8 = var7 - 1;
        int var9 = this.field1119 * arg1 * var7;
        for (int var10 = 0; var10 < var4; var10 += var7) {
            int var12 = var6 & var9 + var10;
            for (int var13 = 0; var13 < var7; var13++) {
                int var14 = var10 + var13;
                int var15 = (var8 & var13 + var5) + var12;
                class260.field4509[var14] = this.field1099[var15];
            }
        }
        int[] var11 = this.field1099;
        this.field1099 = class260.field4509;
        class260.field4509 = var11;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILmb;ZLmf;F)[I")
    public final int[] method389(int arg0, class178 arg1, boolean arg2, class63 arg3, float arg4) {
        field1116++;
        if (arg0 != 0) {
            this.method388((byte) -103, 96);
        }
        if (this.field1099 == null || this.field1101 != arg4) {
            if (!this.field1104.method763(1, arg3, arg1)) {
                return null;
            }
            int var6 = arg2 ? 64 : 128;
            this.field1099 = this.field1104.method761(this.field1098, arg1, true, var6, arg3, (double) arg4, var6, (byte) 77);
            this.field1101 = arg4;
            if (this.field1118) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                int[] var10 = new int[var6 * var6];
                int var11 = var6;
                int var13 = var6 - 1;
                int var14 = var6 * var6;
                int var15 = var6 - 1;
                int var16 = var6;
                int var17 = var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var34 = var15; var34 >= 0; var34--) {
                        var16--;
                        int var35 = this.field1099[var16];
                        var9[var34] += class30.method252(255, var35 >> 16);
                        var8[var34] += class30.method252(65459, var35) >> 8;
                        var7[var34] += class30.method252(var35, 255);
                    }
                    if (var16 == 0) {
                        var16 = var14;
                    }
                }
                int var19 = var14;
                for (int var20 = var13; var20 >= 0; var20--) {
                    int var21 = 1;
                    int var22 = 0;
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 1;
                    for (int var26 = 2; var26 >= 0; var26--) {
                        var25--;
                        var23 += var7[var25];
                        var22 += var8[var25];
                        var24 += var9[var25];
                        if (var25 == 0) {
                            var25 = var11;
                        }
                    }
                    for (int var27 = var15; var27 >= 0; var27--) {
                        var21--;
                        int var31 = var24 / 9;
                        int var32 = var22 / 9;
                        var25--;
                        int var33 = var23 / 9;
                        var19--;
                        var10[var19] = class198.method1332(var33, class198.method1332(var32 << 8, var31 << 16));
                        var22 += var8[var25] - var8[var21];
                        var23 += var7[var25] - var7[var21];
                        var24 += var9[var25] - var9[var21];
                        if (var21 == 0) {
                            var21 = var11;
                        }
                        if (var25 == 0) {
                            var25 = var11;
                        }
                    }
                    for (int var28 = var15; var28 >= 0; var28--) {
                        var16--;
                        int var29 = this.field1099[var16];
                        var17--;
                        int var30 = this.field1099[var17];
                        var9[var28] += -class30.method252(var30 >> 16, 255) + (class30.method252(var29, 16712395) >> 16);
                        var8[var28] += class30.method252(var29 >> 8, 255) - (class30.method252(var30, 65352) >> 8);
                        var7[var28] += class30.method252(255, var29) - class30.method252(var30, 255);
                    }
                    if (var17 == 0) {
                        var17 = var14;
                    }
                    if (var16 == 0) {
                        var16 = var14;
                    }
                }
                this.field1099 = var10;
            }
        }
        return this.field1099;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lpb;)V")
    public static final void method390(class154 arg0) {
        for (int var1 = arg0.field2693; var1 <= arg0.field2695; var1++) {
            for (int var2 = arg0.field2688; var2 <= arg0.field2700; var2++) {
                class177 var3 = class75.field1463[arg0.field2699][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field3012; var4++) {
                        if (var3.field3017[var4] == arg0) {
                            var3.field3012--;
                            for (int var5 = var4; var5 < var3.field3012; var5++) {
                                var3.field3017[var5] = var3.field3017[var5 + 1];
                                var3.field3027[var5] = var3.field3027[var5 + 1];
                            }
                            var3.field3017[var3.field3012] = null;
                            break;
                        }
                    }
                    var3.field3010 = 0;
                    for (int var6 = 0; var6 < var3.field3012; var6++) {
                        var3.field3010 |= var3.field3027[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lmb;Lmf;I)Z")
    public final boolean method391(class178 arg0, class63 arg1, int arg2) {
        if (arg2 == -1324762808) {
            field1117++;
            return this.field1104.method763(1, arg1, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V")
    public static void method392(boolean arg0) {
        if (arg0) {
            field1100 = null;
        }
        field1107 = null;
        field1097 = null;
        field1111 = null;
        field1100 = null;
        field1106 = null;
        field1112 = null;
        field1108 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lmf;ZILmb;)[I")
    public final int[] method393(class63 arg0, boolean arg1, int arg2, class178 arg3) {
        if (arg2 != -27932) {
            this.method391((class178) null, (class63) null, 113);
        }
        field1102++;
        if (this.field1104.method763(arg2 + 27933, arg0, arg3)) {
            int var5 = arg1 ? 64 : 128;
            return this.field1104.method761(this.field1098, arg3, false, var5, arg0, 1.0D, var5, (byte) 77);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lk;)V")
    public class50(class152 arg0) {
        this.field1104 = new class105(arg0);
        this.field1118 = arg0.method1051((byte) 123) == 1;
        this.field1098 = arg0.method1051((byte) 103) == 1;
        arg0.method1051((byte) 112);
        arg0.method1051((byte) 103);
        int var2 = arg0.method1051((byte) 109) & 0x3;
        this.field1105 = arg0.method1060((byte) -58);
        this.field1119 = arg0.method1060((byte) -58);
        arg0.method1051((byte) 99);
        arg0.method1051((byte) 101);
    }
}
