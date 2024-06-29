import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class408 extends class272 {

    @OriginalMember(owner = "client!oo", name = "i", descriptor = "S")
    public static short field5583 = 205;

    @OriginalMember(owner = "client!oo", name = "n", descriptor = "[S")
    public static short[] field5588 = new short[256];

    @OriginalMember(owner = "client!oo", name = "k", descriptor = "I")
    public static int field5585;

    @OriginalMember(owner = "client!oo", name = "l", descriptor = "I")
    public int field5586;

    @OriginalMember(owner = "client!oo", name = "m", descriptor = "I")
    public int field5587;

    @OriginalMember(owner = "client!oo", name = "o", descriptor = "I")
    public int field5589;

    @OriginalMember(owner = "client!oo", name = "p", descriptor = "I")
    public static int field5590;

    @OriginalMember(owner = "client!oo", name = "q", descriptor = "I")
    public int field5591;

    @OriginalMember(owner = "client!oo", name = "j", descriptor = "Lmr;")
    public class86 field5584;

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(B)V", line = 5)
    public static void method2453(byte arg0) {
        if (arg0 >= -50) {
            method2456((String) null, true);
        }
        field5588 = null;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZIIII)V", line = 18)
    public static final void method2454(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field5585++;
        if (class222.field2958 == 0) {
            class294.method1651(false, 64);
        } else {
            class447.field6086 = class222.field2958;
            class107.method664(0, (byte) 125);
        }
        class216.field2913 = arg1;
        class200.field2700 = arg3;
        if (arg4 == 0) {
            class52.field700 = arg0;
            class55.method393(arg2);
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lwm;Lhp;IIIII)V", line = 45)
    public static final void method2455(class364 arg0, class197 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class142.field2056 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class143.field2058) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class91.field1344 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class491 var15 = class289.field3897[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class221.field2945[var12].method371(var13, var14) + class221.field2945[var12].method371(var13 + 1, var14) + class221.field2945[var12].method371(var13, var14 + 1) + class221.field2945[var12].method371(var13 + 1, var14 + 1)) / 4 - (class221.field2945[arg2].method371(arg3, arg4) + class221.field2945[arg2].method371(arg3 + 1, arg4) + class221.field2945[arg2].method371(arg3, arg4 + 1) + class221.field2945[arg2].method371(arg3 + 1, arg4 + 1)) / 4;
                                    class327 var17 = var15.field6864;
                                    class327 var18 = var15.field6847;
                                    if (var17 != null && var17.method17(7)) {
                                        arg1.method2((var13 - arg3) * class230.field3020 + (1 - arg5) * class235.field3119, (var14 - arg4) * class230.field3020 + (1 - arg6) * class235.field3119, var16, arg0, var7, var17, true);
                                    }
                                    if (var18 != null && var18.method17(7)) {
                                        arg1.method2((var13 - arg3) * class230.field3020 + (1 - arg5) * class235.field3119, (var14 - arg4) * class230.field3020 + (1 - arg6) * class235.field3119, var16, arg0, var7, var18, true);
                                    }
                                    for (class309 var19 = var15.field6845; var19 != null; var19 = var19.field4084) {
                                        class471 var20 = var19.field4091;
                                        if (var20 != null && var20.method17(7) && (var20.field6500 == var13 || var8 == var13) && (var20.field6491 == var14 || var10 == var14)) {
                                            int var21 = var20.field6505 + 1 - var20.field6500;
                                            int var22 = var20.field6497 + 1 - var20.field6491;
                                            arg1.method2((var20.field6500 - arg3) * class230.field3020 + (var21 - arg5) * class235.field3119, (var20.field6491 - arg4) * class230.field3020 + (var22 - arg6) * class235.field3119, var16, arg0, var7, var20, true);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var8--;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 138)
    public static final void method2456(String arg0, boolean arg1) {
        field5590++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class92.method589(77, arg0);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class65.field865; var3++) {
            String var4 = class34.field524[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class92.method589(71, var4);
            if (var5 != null && var5.equals(var2)) {
                class65.field865--;
                for (int var6 = var3; var6 < class65.field865; var6++) {
                    class34.field524[var6] = class34.field524[var6 + 1];
                    class332.field4505[var6] = class332.field4505[var6 + 1];
                    class31.field424[var6] = class31.field424[var6 + 1];
                    class98.field1437[var6] = class98.field1437[var6 + 1];
                    class336.field4539[var6] = class336.field4539[var6 + 1];
                }
                class41.field587 = class236.field3123;
                class69.field943++;
                class491.method2861(class343.field4591, 1);
                class203.field2751.method228(class231.method1292((byte) 3, arg0), 32);
                class203.field2751.method208(arg0, -93);
                break;
            }
        }
        if (!arg1) {
            method2453((byte) 21);
        }
    }
}
