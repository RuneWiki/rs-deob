import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class164 extends class278 {

    @OriginalMember(owner = "client!ba", name = "P", descriptor = "J")
    public static long field2948 = 0L;

    @OriginalMember(owner = "client!ba", name = "O", descriptor = "Lud;")
    public static class279 field2947 = class130.method1024("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", 255);

    @OriginalMember(owner = "client!ba", name = "S", descriptor = "[[I")
    public static int[][] field2951 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

    @OriginalMember(owner = "client!ba", name = "Q", descriptor = "[I")
    public static int[] field2949 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ba", name = "U", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!ba", name = "V", descriptor = "I")
    public int field2954;

    @OriginalMember(owner = "client!ba", name = "W", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!ba", name = "X", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!ba", name = "T", descriptor = "Lda;")
    public class120 field2952;

    @OriginalMember(owner = "client!ba", name = "L", descriptor = "[B")
    public byte[] field2946;

    @OriginalMember(owner = "client!ba", name = "R", descriptor = "[I")
    public static int[] field2950;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V", line = 18)
    public static void method1284(int arg0) {
        field2951 = (int[][]) null;
        field2949 = null;
        field2950 = null;
        if (arg0 >= -110) {
            field2951 = (int[][]) ((int[][]) null);
        }
        field2947 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)[B", line = 31)
    public final byte[] method873(int arg0) {
        field2953++;
        if (this.field4920) {
            throw new RuntimeException();
        }
        if (arg0 != -4958) {
            this.method869(true);
        }
        return this.field2946;
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(Z)I", line = 78)
    public final int method869(boolean arg0) {
        if (arg0) {
            field2955++;
            return this.field4920 ? 0 : 100;
        } else {
            return 99;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BZ)V", line = 97)
    public static final void method1285(byte arg0, boolean arg1) {
        if (arg0 <= 44) {
            return;
        }
        int var10002;
        for (int var2 = 0; var2 < class26.field626; var2++) {
            class102 var3 = class122.field2196[class200.field3579[var2]];
            if (var3 != null && var3.method2(27121) && var3.field1921.field2269 == arg1 && var3.field1921.method1007(0)) {
                int var4 = var3.method3((byte) -122);
                if (var4 == 1) {
                    if ((var3.field86 & 0x7F) == 64 && (var3.field79 & 0x7F) == 64) {
                        int var11 = var3.field86 >> 7;
                        int var12 = var3.field79 >> 7;
                        if (var11 >= 0 && var11 < 104 && var12 >= 0 && var12 < 104) {
                            var10002 = class229.field3984[var11][var12]++;
                        }
                    }
                } else if (((var4 & 0x1) != 0 || (var3.field86 & 0x7F) == 0 && (var3.field79 & 0x7F) == 0) && ((var4 & 0x1) != 1 || (var3.field86 & 0x7F) == 64 && (var3.field79 & 0x7F) == 64)) {
                    int var5 = var3.field86 - (var4 * 64) >> 7;
                    int var6 = var3.field79 - (var4 * 64) >> 7;
                    int var7 = var3.method3((byte) -94) + var5;
                    if (var7 > 104) {
                        var7 = 104;
                    }
                    int var8 = var3.method3((byte) -116) + var6;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    if (var8 > 104) {
                        var8 = 104;
                    }
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    for (int var9 = var5; var9 < var7; var9++) {
                        for (int var10 = var6; var10 < var8; var10++) {
                            var10002 = class229.field3984[var9][var10]++;
                        }
                    }
                }
            }
        }
        label196: for (int var13 = 0; var13 < class26.field626; var13++) {
            long var14 = (long) class200.field3579[var13] << 32 | 0x20000000L;
            class102 var16 = class122.field2196[class200.field3579[var13]];
            if (var16 != null && var16.method2(27121) && var16.field1921.field2269 == arg1 && var16.field1921.method1007(0)) {
                int var17 = var16.method3((byte) -106);
                if (var17 == 1) {
                    if ((var16.field86 & 0x7F) == 64 && (var16.field79 & 0x7F) == 64) {
                        int var18 = var16.field79 >> 7;
                        int var19 = var16.field86 >> 7;
                        if (var19 < 0 || var19 >= 104 || var18 < 0 || var18 >= 104) {
                            continue;
                        }
                        if (class229.field3984[var19][var18] > 1) {
                            var10002 = class229.field3984[var19][var18]--;
                            continue;
                        }
                    }
                } else if ((var17 & 0x1) == 0 && (var16.field86 & 0x7F) == 0 && (var16.field79 & 0x7F) == 0 || (var17 & 0x1) == 1 && (var16.field86 & 0x7F) == 64 && (var16.field79 & 0x7F) == 64) {
                    int var20 = var16.field79 - (var17 * 64) >> 7;
                    int var21 = var16.field86 - (var17 * 64) >> 7;
                    int var22 = var17 + var21;
                    if (var22 > 104) {
                        var22 = 104;
                    }
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    int var23 = var17 + var20;
                    boolean var24 = true;
                    if (var20 < 0) {
                        var20 = 0;
                    }
                    if (var23 > 104) {
                        var23 = 104;
                    }
                    for (int var25 = var21; var25 < var22; var25++) {
                        for (int var26 = var20; var26 < var23; var26++) {
                            if (class229.field3984[var25][var26] <= 1) {
                                var24 = false;
                                break;
                            }
                        }
                    }
                    if (var24) {
                        int var27 = var21;
                        while (true) {
                            if (var22 <= var27) {
                                continue label196;
                            }
                            for (int var28 = var20; var28 < var23; var28++) {
                                var10002 = class229.field3984[var27][var28]--;
                            }
                            var27++;
                        }
                    }
                }
                if (!var16.field1921.field2334) {
                    var14 |= Long.MIN_VALUE;
                }
                var16.field70 = class130.method1025(var16.field86, 1008652135, class287.field5134, var16.field79);
                class320.method2251(class287.field5134, var16.field86, var16.field79, var16.field70, (var17 - 1) * 64 + 60, var16, var16.field44, var14, var16.field20);
            }
        }
        field2956++;
    }
}
