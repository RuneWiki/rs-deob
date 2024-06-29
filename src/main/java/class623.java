import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class623 {

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "[I")
    public static int[] field9001 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public static int field9003;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    public static int field9004;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "Lqh;")
    public static class60 field9002;

    // $FF: synthetic field
    @OriginalMember(owner = "client!jn", name = "e", descriptor = "Ljava/lang/Class;")
    public static Class field9005;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3573(int arg0, byte arg1, int arg2) {
        if (arg1 != -48) {
            field9002 = null;
        }
        field9004++;
        return (arg0 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "([JI[I)V")
    public static final void method3574(long[] arg0, int arg1, int[] arg2) {
        field9003++;
        class434.method2713(arg0.length - 1, 1, arg2, 0, arg0);
        if (arg1 != 128) {
            method3574(null, 17, null);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "()V")
    public static final void method3575() {
        for (int var0 = 0; var0 < class351.field5007; var0++) {
            if (!class499.field7273[var0]) {
                class49 var1 = class48.field512[var0];
                class321 var2 = var1.field522;
                int var3 = var1.field520;
                int var4 = var2.method2094(0) - class170.field2095;
                int var5 = (var4 * 2 >> class465.field6917) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method2093((byte) -76) - var4 >> class465.field6917;
                int var9 = var2.method2095(true) - var4 >> class465.field6917;
                int var10 = var2.method2095(true) + var4 >> class465.field6917;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class91.field1047) {
                    var10 = class91.field1047 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field516[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class588.field8441) {
                        var16 = class588.field8441 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class144 var19 = class226.method1473(var3, var17, var11, field9005 == null ? (field9005 = method3577("ada")) : field9005);
                        if (var19 != null && var19.field1766 != 0) {
                            if (var19.field1766 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field516[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field516[var6 - 1];
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
                                    short var30 = var1.field516[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field516[var6 + 1];
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
                class499.field7273[var0] = true;
                class435.field6449[var3].method258(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V")
    public static void method3576(int arg0) {
        if (arg0 != 1) {
            field9002 = null;
        }
        field9002 = null;
        field9001 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3577(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
