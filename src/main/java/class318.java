import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public abstract class class318 {

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "[I")
    public static int[] field4069 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "Ltb;")
    public static class450 field4070 = new class450(64);

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "Lwp;")
    public static class453 field4072 = new class453(60, -2);

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "F")
    public static float field4071;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ab", name = "e", descriptor = "Ljava/lang/Class;")
    public static Class field4073;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(FIIIF[FIIFIF)V")
    public abstract void method1828(float arg0, int arg1, int arg2, int arg3, float arg4, float[] arg5, int arg6, int arg7, float arg8, int arg9, float arg10);

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public static void method1829(int arg0) {
        field4070 = null;
        if (arg0 == -11521) {
            field4072 = null;
            field4069 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "()V")
    public static final void method1830() {
        for (int var0 = 0; var0 < class574.field8008; var0++) {
            if (!class352.field4495[var0]) {
                class378 var1 = class352.field4498[var0];
                class332 var2 = var1.field4779;
                int var3 = var1.field4781;
                int var4 = var2.method1883((byte) -73) - class238.field2979;
                int var5 = (var4 * 2 >> class52.field775) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method1886(true) - var4 >> class52.field775;
                int var9 = var2.method1885((byte) 119) - var4 >> class52.field775;
                int var10 = var2.method1885((byte) 119) + var4 >> class52.field775;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class37.field508) {
                    var10 = class37.field508 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field4773[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class429.field5383) {
                        var16 = class429.field5383 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class172 var19 = class700.method3933(var3, var17, var11, field4073 == null ? (field4073 = method1831("qda")) : field4073);
                        if (var19 != null && var19.field2255 != 0) {
                            if (var19.field2255 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field4773[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field4773[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 0xFF) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field4773[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field4773[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 0xFF) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    var6++;
                }
                class352.field4495[var0] = true;
                class491.field6485[var3].method1289(var2, var7);
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1831(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
