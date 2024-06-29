import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public abstract class class543 extends class90 {

    @OriginalMember(owner = "client!cn", name = "m", descriptor = "Z")
    public boolean field7397 = false;

    @OriginalMember(owner = "client!cn", name = "k", descriptor = "Lot;")
    public static class617 field7395 = new class617(2);

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "B")
    public byte field7391;

    @OriginalMember(owner = "client!cn", name = "t", descriptor = "B")
    public byte field7404;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "I")
    public int field7392;

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "I")
    public int field7393;

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "I")
    public int field7394;

    @OriginalMember(owner = "client!cn", name = "l", descriptor = "I")
    public int field7396;

    @OriginalMember(owner = "client!cn", name = "n", descriptor = "I")
    public int field7398;

    @OriginalMember(owner = "client!cn", name = "o", descriptor = "I")
    public static int field7399;

    @OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
    public static int field7400;

    @OriginalMember(owner = "client!cn", name = "r", descriptor = "I")
    public static int field7402;

    @OriginalMember(owner = "client!cn", name = "s", descriptor = "I")
    public static int field7403;

    @OriginalMember(owner = "client!cn", name = "u", descriptor = "I")
    public int field7405;

    @OriginalMember(owner = "client!cn", name = "v", descriptor = "I")
    public static int field7406;

    @OriginalMember(owner = "client!cn", name = "w", descriptor = "Lcn;")
    public class543 field7407;

    @OriginalMember(owner = "client!cn", name = "q", descriptor = "Z")
    public boolean field7401;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II[BIIII)V", line = 5)
    public static final void method3061(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6) {
        field7402++;
        if (arg1 > 0 && !class461.method2656(arg5 - 2, arg1)) {
            throw new IllegalArgumentException("");
        } else if (arg4 <= 0 || class461.method2656(0, arg4)) {
            int var7 = class622.method3510(-8, arg0);
            int var8 = 0;
            int var9 = arg4 > arg1 ? arg1 : arg4;
            int var10 = arg1 >> 1;
            int var11 = arg4 >> 1;
            byte[] var12 = arg2;
            if (arg5 == 2) {
                byte[] var13 = new byte[var7 * var11 * var10];
                while (true) {
                    OpenGL.glTexImage2Dub(arg3, var8, arg6, arg1, arg4, 0, arg0, 5121, var12, 0);
                    if (var9 <= 1) {
                        return;
                    }
                    int var14 = arg1 * var7;
                    byte[] var15 = var13;
                    for (int var16 = 0; var16 < var7; var16++) {
                        int var17 = var16;
                        int var18 = var16;
                        int var19 = var14 + var16;
                        for (int var20 = 0; var20 < var11; var20++) {
                            for (int var21 = 0; var21 < var10; var21++) {
                                byte var22 = var12[var18];
                                int var23 = var7 + var18;
                                int var24 = var12[var23] + var22;
                                var18 = var7 + var23;
                                int var25 = var12[var19] + var24;
                                int var26 = var7 + var19;
                                int var27 = var12[var26] + var25;
                                var19 = var7 + var26;
                                var13[var17] = (byte) (var27 >> 2);
                                var17 += var7;
                            }
                            var19 += var14;
                            var18 += var14;
                        }
                    }
                    var13 = var12;
                    arg1 = var10;
                    arg4 = var11;
                    var12 = var15;
                    var10 >>= 0x1;
                    var11 >>= 0x1;
                    var8++;
                    var9 >>= 0x1;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "(I)V", line = 103)
    public static void method3062(int arg0) {
        int var1 = -22 % ((-arg0 - 78) / 32);
        field7395 = null;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(III)I", line = 123)
    public static final int method3063(int arg0, int arg1, int arg2) {
        field7406++;
        int var3 = 1;
        int var4 = 24 / ((arg2 + 48) / 55);
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg1 *= arg1;
            arg0 >>= 0x1;
        }
        if (arg0 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Ljo;IIIIIIIIII)Z", line = 163)
    public static final boolean method3064(class355 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field7400++;
        int var11 = arg5;
        int var12 = arg1;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg5 - var13;
        int var16 = arg1 - var14;
        class567.field8018[var13][var14] = 99;
        class388.field5339[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class428.field5844[var17] = arg5;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class513.field7012[var10001] = arg1;
        int[][] var19 = arg0.field4830;
        while (var26 != var18) {
            var12 = class513.field7012[var18];
            var11 = class428.field5844[var18];
            int var20 = var11 - var15;
            int var21 = var12 - var16;
            var18 = var18 + 1 & 0xFFF;
            int var22 = var11 - arg0.field4843;
            int var23 = var12 - arg0.field4841;
            if (arg3 == -4) {
                if (arg10 == var11 && arg7 == var12) {
                    class640.field8803 = var11;
                    class471.field6398 = var12;
                    return true;
                }
            } else if (arg3 == -3) {
                if (class28.method183(arg2, arg10, arg7, var11, 2, var12, -1803607479, arg4, 2)) {
                    class640.field8803 = var11;
                    class471.field6398 = var12;
                    return true;
                }
            } else if (arg3 == -2) {
                if (arg0.method2195(arg10, var12, 2, var11, arg8, 8, arg4, arg7, 2, arg2)) {
                    class471.field6398 = var12;
                    class640.field8803 = var11;
                    return true;
                }
            } else if (arg3 == -1) {
                if (arg0.method2190(var12, arg2, arg7, arg4, arg8, arg10, 2, false, var11)) {
                    class471.field6398 = var12;
                    class640.field8803 = var11;
                    return true;
                }
            } else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
                if (arg0.method2186(arg3, 2, 5282, var12, arg7, arg10, arg6, var11)) {
                    class471.field6398 = var12;
                    class640.field8803 = var11;
                    return true;
                }
            } else if (arg0.method2193(var11, arg3, 2, arg10, arg6, var12, -1, arg7)) {
                class471.field6398 = var12;
                class640.field8803 = var11;
                return true;
            }
            int var25 = class388.field5339[var20][var21] + 1;
            if (var20 > 0 && class567.field8018[var20 - 1][var21] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class428.field5844[var26] = var11 - 1;
                class513.field7012[var26] = var12;
                class567.field8018[var20 - 1][var21] = 2;
                var26 = var26 + 1 & 0xFFF;
                class388.field5339[var20 - 1][var21] = var25;
            }
            if (var20 < 126 && class567.field8018[var20 + 1][var21] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class428.field5844[var26] = var11 + 1;
                class513.field7012[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class567.field8018[var20 + 1][var21] = 8;
                class388.field5339[var20 + 1][var21] = var25;
            }
            if (var21 > 0 && class567.field8018[var20][var21 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class428.field5844[var26] = var11;
                class513.field7012[var26] = var12 - 1;
                class567.field8018[var20][var21 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class388.field5339[var20][var21 - 1] = var25;
            }
            if (var21 < 126 && class567.field8018[var20][var21 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class428.field5844[var26] = var11;
                class513.field7012[var26] = var12 + 1;
                class567.field8018[var20][var21 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class388.field5339[var20][var21 + 1] = var25;
            }
            if (var20 > 0 && var21 > 0 && class567.field8018[var20 - 1][var21 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class428.field5844[var26] = var11 - 1;
                class513.field7012[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class567.field8018[var20 - 1][var21 - 1] = 3;
                class388.field5339[var20 - 1][var21 - 1] = var25;
            }
            if (var20 < 126 && var21 > 0 && class567.field8018[var20 + 1][var21 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class428.field5844[var26] = var11 + 1;
                class513.field7012[var26] = var12 - 1;
                class567.field8018[var20 + 1][var21 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class388.field5339[var20 + 1][var21 - 1] = var25;
            }
            if (var20 > 0 && var21 < 126 && class567.field8018[var20 - 1][var21 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class428.field5844[var26] = var11 - 1;
                class513.field7012[var26] = var12 + 1;
                class567.field8018[var20 - 1][var21 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class388.field5339[var20 - 1][var21 + 1] = var25;
            }
            if (var20 < 126 && var21 < 126 && class567.field8018[var20 + 1][var21 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class428.field5844[var26] = var11 + 1;
                class513.field7012[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class567.field8018[var20 + 1][var21 + 1] = 12;
                class388.field5339[var20 + 1][var21 + 1] = var25;
            }
        }
        if (arg9 > -97) {
            method3063(3, -127, 64);
        }
        class640.field8803 = var11;
        class471.field6398 = var12;
        return false;
    }

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "(B)I", line = 517)
    public int method1461(byte arg0) {
        field7399++;
        int var2 = 70 / ((arg0 + 58) / 47);
        return 0;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(III[Lbq;)I", line = 536)
    public final int method3065(int arg0, int arg1, int arg2, class307[] arg3) {
        field7403++;
        if (arg1 > -89) {
            return -92;
        }
        long var5 = class227.field3295[this.field7391][arg2][arg0];
        long var7 = 0L;
        int var9 = 0;
        while (var7 <= 48L) {
            int var10 = (int) (var5 >> (int) var7 & 0xFFFFL);
            if (var10 <= 0) {
                break;
            }
            arg3[var9++] = class98.field1601[var10 - 1].field3001;
            var7 += 16L;
        }
        for (int var11 = var9; var11 < 4; var11++) {
            arg3[var11] = null;
        }
        return var9;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(BLha;)V")
    public abstract void method901(byte arg0, class66 arg1);

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "(I)V")
    public abstract void method905(int arg0);

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(Z)Z")
    public abstract boolean method910(boolean arg0);

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(Lha;B)Ldg;")
    public abstract class435 method894(class66 arg0, byte arg1);

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lha;Lcn;IIBZI)V")
    public abstract void method903(class66 arg0, class543 arg1, int arg2, int arg3, byte arg4, boolean arg5, int arg6);

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "(I)Z")
    public abstract boolean method2263(int arg0);

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILha;)Z")
    public abstract boolean method2261(int arg0, class66 arg1);

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lha;III)Z")
    public abstract boolean method908(class66 arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "(I)I")
    public abstract int method907(int arg0);

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "([Lbq;Z)I")
    public abstract int method2262(class307[] arg0, boolean arg1);

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(BLha;)Lhga;")
    public abstract class186 method898(byte arg0, class66 arg1);

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "(I)I")
    public abstract int method900(int arg0);

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "(I)Z")
    public abstract boolean method904(int arg0);

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "(I)Z")
    public abstract boolean method902(int arg0);
}
