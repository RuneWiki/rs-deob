import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class279 extends class224 {

    @OriginalMember(owner = "client!kc", name = "O", descriptor = "F")
    public static float field4432;

    @OriginalMember(owner = "client!kc", name = "I", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!kc", name = "J", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!kc", name = "K", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!kc", name = "L", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!kc", name = "M", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!kc", name = "N", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!kc", name = "P", descriptor = "Lma;")
    public static class188 field4433;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)V")
    public static final void method1867(String arg0, int arg1, int arg2, String arg3) {
        class158.field2432 = arg0;
        class57.field806 = arg1;
        ++field4431;
        class280.field4436 = arg3;
        if (!class158.field2432.equals("") && !class280.field4436.equals("")) {
            if (class30.field402 != -1) {
                class173.method1217((byte) 44);
            } else {
                class207.field3225 = 0;
                class190.field3012 = 0;
                class149.field2208 = -3;
                class131.field1918 = 1;
                class25 var4 = new class25(128);
                var4.method184(10, arg2 ^ 90);
                var4.method166((int) (Math.random() * 9.9999999E7D), -3);
                var4.method206(-5061, class162.method1116(class158.field2432, (byte) 19));
                var4.method166((int) (Math.random() * 9.9999999E7D), arg2 + -3);
                var4.method199(arg2, class280.field4436);
                var4.method166((int) (9.9999999E7D * Math.random()), -3);
                var4.method165(class249.field3974, (byte) 94, class148.field2196);
                class13.field165.field349 = 0;
                class13.field165.method184(24, 110);
                class13.field165.method184(var4.field349 + 2, arg2 + 105);
                class13.field165.method223(-1720191288, 532);
                class13.field165.method213(0, var4.field339, var4.field349, -127);
            }
        } else {
            class149.field2208 = 3;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
    public static void method1868(byte arg0) {
        field4433 = null;
        int var1 = 104 % ((46 - arg0) / 60);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BI)I")
    public static final int method1869(byte arg0, int arg1) {
        ++field4427;
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        if (arg0 > -24) {
            field4433 = null;
        }
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BZLsi;III)V")
    public static final void method1870(byte arg0, boolean arg1, class198 arg2, int arg3, int arg4, int arg5) {
        ++field4430;
        if (~class87.field1369 > -51) {
            if (arg2.field3100 != null && ~arg2.field3100.length < ~arg3 && arg2.field3100[arg3] != null) {
                int var6 = arg2.field3100[arg3][0];
                if (arg0 != 65) {
                    method1869((byte) 38, -112);
                }
                int var7 = var6 >> 8;
                int var8 = (242 & var6) >> 5;
                if (~arg2.field3100[arg3].length < -2) {
                    int var9 = (int) (Math.random() * (double) arg2.field3100[arg3].length);
                    if (~var9 < -1) {
                        var7 = arg2.field3100[arg3][var9];
                    }
                }
                int var10 = 31 & var6;
                if (var10 == 0) {
                    if (arg1) {
                        class87.method601(0, var7, 0, var8);
                    }
                } else if (class60.field841 != 0) {
                    class100.field1556[class87.field1369] = var7;
                    int var11 = (arg4 + -64) / 128;
                    class3.field29[class87.field1369] = var8;
                    class216.field3520[class87.field1369] = 0;
                    class71.field1000[class87.field1369] = null;
                    int var12 = (arg5 + -64) / 128;
                    class6.field93[class87.field1369] = (var11 << 16) + (var12 << 8) + var10;
                    ++class87.field1369;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
    public class279() {
        super(1, true);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZ)[I")
    public final int[] method14(int arg0, boolean arg1) {
        ++field4428;
        int[] var3 = super.field3625.method1862(arg0, (byte) 52);
        if (!arg1) {
            return null;
        } else {
            if (super.field3625.field4425) {
                int[][] var4 = this.method1532(66, 0, arg0);
                int[] var5 = var4[1];
                int[] var6 = var4[0];
                int[] var7 = var4[2];
                for (int var8 = 0; ~var8 > ~class78.field1108; ++var8) {
                    var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1871(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == arg2 && arg3 == arg4) {
            if (!class170.method1188(arg0, arg1, arg3)) {
                return false;
            } else {
                int var6 = arg1 << 7;
                int var7 = arg3 << 7;
                return class174.method1226(var6 + 1, class200.field3128[arg0][arg1][arg3] + arg5, var7 + 1) && class174.method1226(var6 + 128 - 1, class200.field3128[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class174.method1226(var6 + 128 - 1, class200.field3128[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class174.method1226(var6 + 1, class200.field3128[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
            }
        } else {
            for (int var8 = arg1; var8 <= arg2; ++var8) {
                for (int var14 = arg3; var14 <= arg4; ++var14) {
                    if (class74.field1044[arg0][var8][var14] == -class31.field420) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class200.field3128[arg0][arg1][arg3] + arg5;
            if (!class174.method1226(var9, var11, var10)) {
                return false;
            } else {
                int var12 = (arg2 << 7) - 1;
                if (!class174.method1226(var12, var11, var10)) {
                    return false;
                } else {
                    int var13 = (arg4 << 7) - 1;
                    if (!class174.method1226(var9, var11, var13)) {
                        return false;
                    } else if (!class174.method1226(var12, var11, var13)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
    }
}
