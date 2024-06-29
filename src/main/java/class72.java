import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class72 extends class232 {

    @OriginalMember(owner = "client!kd", name = "Q", descriptor = "[Ljc;")
    public class291[] field1180;

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "S")
    public static short field1171 = 320;

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "I")
    public static int field1178 = -1;

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!kd", name = "L", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!kd", name = "M", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!kd", name = "N", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!kd", name = "P", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!kd", name = "R", descriptor = "Lld;")
    public static class118 field1181;

    @OriginalMember(owner = "client!kd", name = "J", descriptor = "Loh;")
    public static class15 field1174;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)Z", line = 13)
    public final boolean method530(byte arg0, int arg1) {
        if (arg0 == -119) {
            field1177++;
            return this.field1180[arg1].field4953;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(B)V", line = 32)
    public static void method531(byte arg0) {
        field1174 = null;
        field1181 = null;
        int var1 = 74 / ((34 - arg0) / 41);
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(B)V", line = 50)
    public static final void method532(byte arg0) {
        client.field4080.method1653(14051);
        field1170++;
        int var1 = client.field4080.method1659(8, false);
        if (arg0 != 104) {
            field1175 = 12;
        }
        if (class151.field2574 > var1) {
            for (int var2 = var1; var2 < class151.field2574; var2++) {
                class190.field3140[class81.field1293++] = class210.field3476[var2];
            }
        }
        if (class151.field2574 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class151.field2574 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class210.field3476[var3];
            class282 var5 = class173.field2906[var4];
            int var6 = client.field4080.method1659(1, false);
            if (var6 == 0) {
                class210.field3476[class151.field2574++] = var4;
                var5.field5440 = class203.field3385;
            } else {
                int var7 = client.field4080.method1659(2, false);
                if (var7 == 0) {
                    class210.field3476[class151.field2574++] = var4;
                    var5.field5440 = class203.field3385;
                    class228.field3809[class182.field3045++] = var4;
                } else if (var7 == 1) {
                    class210.field3476[class151.field2574++] = var4;
                    var5.field5440 = class203.field3385;
                    int var8 = client.field4080.method1659(3, false);
                    var5.method2218(false, -108, var8);
                    int var9 = client.field4080.method1659(1, false);
                    if (var9 == 1) {
                        class228.field3809[class182.field3045++] = var4;
                    }
                } else if (var7 == 2) {
                    class210.field3476[class151.field2574++] = var4;
                    var5.field5440 = class203.field3385;
                    int var10 = client.field4080.method1659(3, false);
                    var5.method2218(true, arg0 ^ 0xFFFFFFCE, var10);
                    int var11 = client.field4080.method1659(3, false);
                    var5.method2218(true, -83, var11);
                    int var12 = client.field4080.method1659(1, false);
                    if (var12 == 1) {
                        class228.field3809[class182.field3045++] = var4;
                    }
                } else if (var7 == 3) {
                    class190.field3140[class81.field1293++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIJ)Z", line = 153)
    public static final boolean method533(int arg0, int arg1, int arg2, long arg3) {
        class11 var5 = class203.field3382[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field212 != null && var5.field212.field4780 == arg3) {
            return true;
        } else if (var5.field223 != null && var5.field223.field364 == arg3) {
            return true;
        } else if (var5.field205 != null && var5.field205.field2787 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field218; var6++) {
                if (var5.field217[var6].field5289 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)V", line = 188)
    public static final void method534(int arg0) {
        class22.field414.method793((byte) -100);
        field1172++;
        if (arg0 != -30126) {
            field1173 = 93;
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Loh;Loh;IZ)V", line = 197)
    public class72(class15 arg0, class15 arg1, int arg2, boolean arg3) {
        class160 var5 = new class160();
        int var6 = arg0.method95(64, arg2);
        this.field1180 = new class291[var6];
        int[] var7 = arg0.method99(-4577, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            class230 var9 = null;
            byte[] var10 = arg0.method92(arg2, 0, var7[var8]);
            int var11 = var10[1] & 0xFF | var10[0] & 0xFF << 8;
            for (class230 var12 = (class230) var5.method1251(-70); var12 != null; var12 = (class230) var5.method1253(65)) {
                if (var12.field3838 == var11) {
                    var9 = var12;
                    break;
                }
            }
            if (var9 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method111(var11, 2047798024, 0);
                } else {
                    var13 = arg1.method111(0, 2047798024, var11);
                }
                var9 = new class230(var11, var13);
                var5.method1258(0, var9);
            }
            this.field1180[var7[var8]] = new class291(var10, var9);
        }
    }
}
