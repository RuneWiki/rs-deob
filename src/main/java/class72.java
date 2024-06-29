import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class72 extends class43 {

    @OriginalMember(owner = "client!gf", name = "W", descriptor = "Lmb;")
    public static class132 field1205 = class166.method1092("3D)2Softwarebibliothek gestartet)3", 121);

    @OriginalMember(owner = "client!gf", name = "bb", descriptor = "Lmb;")
    public static class132 field1210 = class166.method1092("::fpson", 125);

    @OriginalMember(owner = "client!gf", name = "cb", descriptor = "Lmb;")
    public static class132 field1211 = class166.method1092("compass", 111);

    @OriginalMember(owner = "client!gf", name = "eb", descriptor = "I")
    public static int field1213 = -1;

    @OriginalMember(owner = "client!gf", name = "X", descriptor = "Lmb;")
    public static class132 field1206 = class166.method1092("Geben Sie Ihren Benutzernamen", 122);

    @OriginalMember(owner = "client!gf", name = "T", descriptor = "Lmb;")
    public static class132 field1202 = null;

    @OriginalMember(owner = "client!gf", name = "ab", descriptor = "Lmb;")
    public static class132 field1209 = class166.method1092(" Sekunde(Xn(Y -Ubertragen)3", 121);

    @OriginalMember(owner = "client!gf", name = "U", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!gf", name = "V", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!gf", name = "Y", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!gf", name = "Z", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!gf", name = "db", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(IBI)V")
    public static final void method440(int arg0, byte arg1, int arg2) {
        int var3 = -85 % ((21 - arg1) / 61);
        ++field1208;
        if (~class57.field974 <= -3 || class106.field1984 != 0 || class10.field116) {
            class132 var4;
            if (class106.field1984 == 1 && class57.field974 < 2) {
                var4 = class187.method1197(new class132[] { class187.field3465, class231.field4173, class170.field3177, class42.field710 }, -113);
            } else if (class10.field116 && ~class57.field974 > -3) {
                var4 = class187.method1197(new class132[] { class138.field2589, class231.field4173, class160.field2914, class42.field710 }, -98);
            } else {
                var4 = class127.method834(class57.field974 + -1, false);
            }
            if (class57.field974 > 2) {
                var4 = class187.method1197(new class132[] { var4, class95.field1687, class132.method889(class57.field974 + -2, (byte) 119), class27.field445 }, -119);
            }
            int var5 = class53.field895.method661(var4, arg0 + 4, arg2 - -15, 16777215, 0, class225.field4072, class68.field1139);
            class150.method993(15, arg2, arg0 + 4, true, class53.field895.method687(var4) - -var5);
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)[I")
    public final int[] method64(int arg0, int arg1) {
        ++field1203;
        int[] var3 = super.field768.method1123(arg1 + arg1, arg0);
        if (super.field768.field3219) {
            int[] var4 = this.method300(114, 0, arg0);
            int[] var5 = this.method300(-80, 1, arg0);
            int[] var6 = this.method300(-116, 2, arg0);
            for (int var7 = 0; var7 < class131.field2427; ++var7) {
                int var8 = var6[var7];
                if (~var8 != -4097) {
                    if (var8 != 0) {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
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

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IBLkd;)V")
    public final void method200(int arg0, byte arg1, class112 arg2) {
        ++field1204;
        if (arg0 == 0) {
            super.field746 = arg2.method716(-1308) == 1;
        }
        if (arg1 != -73) {
            field1205 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "(I)V")
    public static void method441(int arg0) {
        if (arg0 != -4097) {
            field1210 = null;
        }
        field1206 = null;
        field1211 = null;
        field1210 = null;
        field1205 = null;
        field1209 = null;
        field1202 = null;
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V")
    public class72() {
        super(3, false);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)[[I")
    public final int[][] method203(int arg0, int arg1) {
        int[][] var3 = super.field764.method1350((byte) 125, arg1);
        if (arg0 != -1893) {
            return null;
        } else {
            if (super.field764.field3960) {
                int[] var4 = this.method300(96, 2, arg1);
                int[][] var5 = this.method301(arg1, (byte) -69, 0);
                int[][] var6 = this.method301(arg1, (byte) -102, 1);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                int[] var10 = var5[0];
                int[] var11 = var5[2];
                int[] var12 = var5[1];
                int[] var13 = var6[0];
                int[] var14 = var6[1];
                int[] var15 = var6[2];
                for (int var16 = 0; var16 < class131.field2427; ++var16) {
                    int var17 = var4[var16];
                    if (~var17 != -4097) {
                        if (var17 == 0) {
                            var7[var16] = var13[var16];
                            var8[var16] = var14[var16];
                            var9[var16] = var15[var16];
                        } else {
                            int var18 = -var17 + 4096;
                            var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                            var8[var16] = var12[var16] * var17 + var14[var16] * var18 >> 12;
                            var9[var16] = var11[var16] * var17 + var15[var16] * var18 >> 12;
                        }
                    } else {
                        var7[var16] = var10[var16];
                        var8[var16] = var12[var16];
                        var9[var16] = var11[var16];
                    }
                }
            }
            ++field1212;
            return var3;
        }
    }
}
