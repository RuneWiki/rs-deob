import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class127 extends class574 implements class219 {

    @OriginalMember(owner = "client!jl", name = "t", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!jl", name = "u", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!jl", name = "w", descriptor = "I")
    public static int field1435;

    // $FF: synthetic field
    @OriginalMember(owner = "client!jl", name = "x", descriptor = "Ljava/lang/Class;")
    public static Class field1436;

    // $FF: synthetic method
    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method726(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lmr;IZ[[I)V", line = 6)
    public class127(class221 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class412.field5529, class179.field2008, arg1 * 6 * arg1, arg2);
        super.field8143.method1997(126, this);
        if (!arg2) {
            for (int var5 = 0; ~var5 > -7; ++var5) {
                OpenGL.glTexImage2Di(var5 + 34069, 0, this.method3244(9), arg1, arg1, 0, class181.method1102(super.field8155, (byte) 125), super.field8143.field2739, arg3[var5], 0);
            }
        } else {
            for (int var6 = 0; var6 < 6; ++var6) {
                this.method3245(13787, arg1, arg3[var6], var6 + 34069, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(JI)V", line = 45)
    public static final void method722(long arg0, int arg1) {
        try {
            if (arg1 != 1) {
                method724(123);
            }
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        ++field1432;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II[S)[S", line = 59)
    public static final short[] method723(int arg0, int arg1, short[] arg2) {
        ++field1435;
        short[] var3 = new short[arg1];
        class567.method3212(arg2, 0, var3, 0, arg1);
        if (arg0 != 10790) {
            field1433 = -58;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)[Lqg;", line = 74)
    public static final class216[] method724(int arg0) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field1434;
            return new class216[] { class364.field4875, class407.field5437, class295.field3686, class193.field2235, class325.field4005, class314.field3902 };
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "()V", line = 88)
    public static final void method725() {
        for (int var0 = 0; var0 < class137.field1501; ++var0) {
            if (!class652.field9154[var0]) {
                class241 var1 = class85.field860[var0];
                class670 var2 = var1.field2980;
                int var3 = var1.field2983;
                int var4 = var2.method3708((byte) 83) - class291.field3640;
                int var5 = (var4 * 2 >> class559.field7984) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method3711(1795643394) - var4 >> class559.field7984;
                int var9 = var2.method3706((byte) -72) - var4 >> class559.field7984;
                int var10 = var2.method3706((byte) 118) + var4 >> class559.field7984;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class247.field3058) {
                    var10 = class247.field3058 - 1;
                }
                for (int var11 = var9; var11 <= var10; ++var11) {
                    short var12 = var1.field2987[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 255) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class122.field1369) {
                        var16 = class122.field1369 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; ++var17) {
                        byte var18 = 1;
                        class613 var19 = class362.method2121(var3, var17, var11, field1436 != null ? field1436 : (field1436 = method726("et")));
                        if (var19 != null && var19.field8633 != 0) {
                            if (var19.field8633 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field2987[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 255) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field2987[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 255) + var26;
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
                                    short var30 = var1.field2987[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 255) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field2987[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 255) + var34;
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
                    ++var6;
                }
                class652.field9154[var0] = true;
                class156.field1743[var3].method381(var2, var7);
            }
        }
    }
}
