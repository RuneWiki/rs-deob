import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class106 extends class211 {

    @OriginalMember(owner = "client!qu", name = "R", descriptor = "[I")
    private int[] field1219 = new int[3];

    @OriginalMember(owner = "client!qu", name = "D", descriptor = "I")
    private int field1227 = 4096;

    @OriginalMember(owner = "client!qu", name = "M", descriptor = "I")
    private int field1232 = 4096;

    @OriginalMember(owner = "client!qu", name = "C", descriptor = "I")
    private int field1231 = 4096;

    @OriginalMember(owner = "client!qu", name = "L", descriptor = "I")
    private int field1230 = 409;

    @OriginalMember(owner = "client!qu", name = "F", descriptor = "[Ljava/lang/String;")
    private static final String[] field1233 = new String[] { method936(method935("N4\tX\u001b")), method936(method935("N4\tY\u001b")), method936(method935("Q4Kq")), method936(method935("Do\t3N")), method936(method935("N4\t\\\u001b")), method936(method935("N4\t^\u001b")), method936(method935("N4\tT\u001b")) };

    @OriginalMember(owner = "client!qu", name = "G", descriptor = "S")
    public static short field1225 = 320;

    @OriginalMember(owner = "client!qu", name = "J", descriptor = "Z")
    public static volatile boolean field1226 = true;

    @OriginalMember(owner = "client!qu", name = "P", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!qu", name = "K", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!qu", name = "H", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!qu", name = "O", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!qu", name = "Q", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!qu", name = "E", descriptor = "[Ldf;")
    public static class420[] field1228;

    @OriginalMember(owner = "client!qu", name = "N", descriptor = "[Lfs;")
    public static class581[] field1221;

    @OriginalMember(owner = "client!qu", name = "S", descriptor = "[[B")
    public static byte[][] field1223;

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(Z)V", line = 3)
    public static final void method931(boolean arg0) {
        if (arg0) {
            class734.field10683 = class80.field907;
            class555.field8261 = class195.field2617;
        } else {
            class734.field10683 = class443.field6508;
            class555.field8261 = class184.field2541;
        }
        class501.field7246 = class734.field10683.length;
    }

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "(B)V", line = 17)
    public static void method932(byte arg0) {
        try {
            field1223 = null;
            field1228 = null;
            field1221 = null;
            if (arg0 <= 58) {
                field1229 = -54;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1233[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(II)[[I", line = 29)
    public final int[][] method234(int arg0, int arg1) {
        try {
            ++field1222;
            if (arg1 > -38) {
                method933(-69, 55, (byte) 40, (class476) null);
            }
            int[][] var3 = super.field3230.method5463((byte) -8, arg0);
            if (super.field3230.field10931) {
                int[][] var4 = this.method1853(0, 0, arg0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; var11 < class343.field5332; ++var11) {
                    int var12 = var5[var11];
                    int var13 = -this.field1219[0] + var12;
                    if (~var13 > -1) {
                        var13 = -var13;
                    }
                    if (~var13 < ~this.field1230) {
                        var8[var11] = var12;
                        var9[var11] = var6[var11];
                        var10[var11] = var7[var11];
                    } else {
                        int var14 = var6[var11];
                        int var15 = -this.field1219[1] + var14;
                        if (~var15 > -1) {
                            var15 = -var15;
                        }
                        if (~var15 < ~this.field1230) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var7[var11];
                        } else {
                            int var16 = var7[var11];
                            int var17 = -this.field1219[2] + var16;
                            if (~var17 > -1) {
                                var17 = -var17;
                            }
                            if (~var17 < ~this.field1230) {
                                var8[var11] = var12;
                                var9[var11] = var14;
                                var10[var11] = var16;
                            } else {
                                var8[var11] = this.field1231 * var12 >> 12;
                                var9[var11] = this.field1227 * var14 >> 12;
                                var10[var11] = this.field1232 * var16 >> 12;
                            }
                        }
                    }
                }
            }
            return var3;
        } catch (RuntimeException var19) {
            throw class759.method5498(var19, field1233[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIBLla;)Llq;", line = 123)
    public static final class578 method933(int arg0, int arg1, byte arg2, class476 arg3) {
        try {
            ++field1220;
            if (arg2 < 54) {
                field1229 = 89;
            }
            byte[] var4 = arg3.method3632(arg1, arg0, -123);
            return var4 == null ? null : new class578(var4);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field1233[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1233[3] : field1233[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!qu", name = "<init>", descriptor = "()V", line = 151)
    public class106() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(BILib;)V", line = 155)
    public final void method201(byte arg0, int arg1, class163 arg2) {
        try {
            if (arg0 <= 67) {
                field1225 = -117;
            }
            ++field1218;
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (arg1 != 2) {
                        if (arg1 != 3) {
                            if (arg1 == 4) {
                                int var5 = arg2.method1436((byte) 96);
                                this.field1219[1] = class291.method2359(4080, var5 >> 4);
                                this.field1219[2] = class291.method2359(var5, 255) >> 12;
                                this.field1219[0] = class291.method2359(var5, 16711680) << 4;
                            }
                        } else {
                            this.field1231 = arg2.method1445((byte) 123);
                        }
                    } else {
                        this.field1227 = arg2.method1445((byte) 126);
                    }
                } else {
                    this.field1232 = arg2.method1445((byte) 113);
                }
            } else {
                this.field1230 = arg2.method1445((byte) 121);
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field1233[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1233[3] : field1233[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(BLtia;)V", line = 224)
    public static final void method934(byte arg0, class280 arg1) {
        try {
            class383.field5800.method3868(-37, arg1);
            ++field1224;
            arg1.field4200 = arg1.field4197.field2201;
            if (arg0 == 53) {
                class90.field1034 += arg1.field4200;
                arg1.field4197.field2201 = 0;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1233[4] + arg0 + ',' + (arg1 != null ? field1233[3] : field1233[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!qu", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method935(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 51);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qu", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method936(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 63;
                    break;
                case 1:
                    var10005 = 65;
                    break;
                case 2:
                    var10005 = 39;
                    break;
                case 3:
                    var10005 = 29;
                    break;
                default:
                    var10005 = 51;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
