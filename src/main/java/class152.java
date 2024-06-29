import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public abstract class class152 {

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "J")
    public static long field2064 = 0L;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field2062 = 0;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "[I")
    public static int[] field2059 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field2060 = 0;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "Llm;")
    public static class347 field2065;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZI)I", line = 3)
    public static final int method950(boolean arg0, int arg1) {
        if (class191.field2558 != null) {
            class191.field2558.method1398((byte) 69);
            class191.field2558 = null;
        }
        field2058++;
        class438.field6429++;
        if (arg0) {
            method955(true);
        }
        if (class438.field6429 > 4) {
            class438.field6429 = 0;
            class220.field2907 = 0;
            return arg1;
        }
        if (class393.field5627 == class110.field1565) {
            class393.field5627 = class308.field4528;
        } else {
            class393.field5627 = class110.field1565;
        }
        class220.field2907 = 0;
        return -1;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V", line = 44)
    public static final void method952(byte arg0) {
        if (arg0 != 106) {
            field2064 = -14L;
        }
        class189 var1 = class270.field3909;
        synchronized (class270.field3909) {
            class270.field3909.method1136((byte) -110);
        }
        field2063++;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z[Lba;ILck;Lii;I)V", line = 61)
    public static final void method953(boolean arg0, class270[] arg1, int arg2, class351 arg3, class405 arg4, int arg5) {
        if (!arg0) {
            for (int var6 = 0; var6 < 4; var6++) {
                for (int var7 = 0; var7 < class192.field2574; var7++) {
                    for (int var8 = 0; var8 < class364.field5262; var8++) {
                        if ((class103.field1430[var6][var7][var8] & 0x1) != 0) {
                            int var9 = var6;
                            if ((class103.field1430[1][var7][var8] & 0x2) != 0) {
                                var9 = var6 - 1;
                            }
                            if (var9 >= 0) {
                                arg1[var9].method1861(var8, var7, 21946);
                            }
                        }
                    }
                }
            }
        }
        field2061++;
        int[][] var10 = new int[class192.field2574][class364.field5262];
        if (arg2 != 29649) {
            field2059 = null;
        }
        for (int var11 = 0; var11 < arg5; var11++) {
            for (int var13 = 0; var13 < class364.field5262; var13++) {
                class448.field6562[var13] = 0;
                class397.field5912[var13] = 0;
                class157.field2131[var13] = 0;
                class397.field5908[var13] = 0;
                class26.field363[var13] = 0;
            }
            for (int var14 = -5; var14 < class192.field2574; var14++) {
                for (int var15 = 0; var15 < class364.field5262; var15++) {
                    int var24 = var14 + 5;
                    int var10002;
                    if (var24 < class192.field2574) {
                        int var25 = class302.field4447[var11][var24][var15] & 0xFF;
                        if (var25 > 0) {
                            class264 var26 = class72.method530(var25 - 1, 84);
                            class448.field6562[var15] += var26.field3825;
                            class397.field5912[var15] += var26.field3828;
                            class157.field2131[var15] += var26.field3839;
                            class397.field5908[var15] += var26.field3833;
                            var10002 = class26.field363[var15]++;
                        }
                    }
                    int var27 = var14 - 5;
                    if (var27 >= 0) {
                        int var28 = class302.field4447[var11][var27][var15] & 0xFF;
                        if (var28 > 0) {
                            class264 var29 = class72.method530(var28 - 1, 106);
                            class448.field6562[var15] -= var29.field3825;
                            class397.field5912[var15] -= var29.field3828;
                            class157.field2131[var15] -= var29.field3839;
                            class397.field5908[var15] -= var29.field3833;
                            var10002 = class26.field363[var15]--;
                        }
                    }
                }
                if (var14 >= 0) {
                    int var16 = 0;
                    int var17 = 0;
                    int var18 = 0;
                    int var19 = 0;
                    int var20 = 0;
                    for (int var21 = -5; var21 < class364.field5262; var21++) {
                        int var22 = var21 + 5;
                        if (class364.field5262 > var22) {
                            var17 += class397.field5912[var22];
                            var20 += class26.field363[var22];
                            var19 += class397.field5908[var22];
                            var18 += class157.field2131[var22];
                            var16 += class448.field6562[var22];
                        }
                        int var23 = var21 - 5;
                        if (var23 >= 0) {
                            var16 -= class448.field6562[var23];
                            var17 -= class397.field5912[var23];
                            var20 -= class26.field363[var23];
                            var19 -= class397.field5908[var23];
                            var18 -= class157.field2131[var23];
                        }
                        if (var21 >= 0 && var19 > 0 && var20 > 0) {
                            var10[var14][var21] = class373.method2418(-16044, var16 * 256 / var19, var17 / var20, var18 / var20);
                        }
                    }
                }
            }
            class279.method1933(-28906, class12.field205[var11], class364.field5262, class253.field3494[var11], arg3, class390.field5619[var11], arg0, class192.field2574, arg4, var10, class424.field6267[var11], var11, class302.field4447[var11]);
            class302.field4447[var11] = null;
            class424.field6267[var11] = null;
            class390.field5619[var11] = null;
            class253.field3494[var11] = null;
        }
        if (!arg0) {
            if (class211.field2801) {
                class106.method714();
            }
            if (class423.field6238 != 0) {
                class416.method2651();
            }
        }
        for (int var12 = 0; var12 < arg5; var12++) {
            class12.field205[var12].method744();
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)V", line = 278)
    public static void method955(boolean arg0) {
        field2059 = null;
        if (arg0) {
            field2064 = -108L;
        }
        field2065 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method951(Component arg0, byte arg1);

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)I")
    public abstract int method954(int arg0);

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method956(Component arg0, int arg1);
}
