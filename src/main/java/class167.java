import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class167 extends class241 implements class248 {

    @OriginalMember(owner = "client!se", name = "F", descriptor = "Leh;")
    public class241 field2594;

    @OriginalMember(owner = "client!se", name = "z", descriptor = "[I")
    public static int[] field2588 = new int[5];

    @OriginalMember(owner = "client!se", name = "H", descriptor = "Lug;")
    public static class392 field2596 = new class392();

    @OriginalMember(owner = "client!se", name = "L", descriptor = "Liv;")
    public static class64 field2600 = new class64(47, -1);

    @OriginalMember(owner = "client!se", name = "M", descriptor = "[Lel;")
    public static class382[] field2601 = new class382[2048];

    @OriginalMember(owner = "client!se", name = "r", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!se", name = "w", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!se", name = "A", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!se", name = "B", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!se", name = "C", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!se", name = "D", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!se", name = "E", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!se", name = "G", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!se", name = "I", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!se", name = "J", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!se", name = "K", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!se", name = "y", descriptor = "Ljava/lang/Object;")
    public static Object field2587;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(B)I")
    public final int method17(byte arg0) {
        int var2 = -36 % ((arg0 + 60) / 40);
        field2592++;
        return 0;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(Z)Z")
    public final boolean method24(boolean arg0) {
        field2589++;
        return arg0 ? false : false;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILqa;ZLto;III)V")
    public final void method18(int arg0, class162 arg1, boolean arg2, class8 arg3, int arg4, int arg5, int arg6) {
        field2590++;
        if (arg4 != -1) {
            this.method19((byte) 70);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lqa;I)V")
    public final void method9(class162 arg0, int arg1) {
        field2584++;
        if (arg1 >= -111) {
            this.method22((byte) -87);
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(IIIIILeh;)V")
    public class167(int arg0, int arg1, int arg2, int arg3, int arg4, class241 arg5) {
        super(arg2, arg3, arg4, class146.method1125(-90, arg1, arg0));
        this.field2594 = arg5;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BLqa;)V")
    public final void method25(byte arg0, class162 arg1) {
        int var3 = -92 % ((-arg0 - 45) / 48);
        field2582++;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILbu;)V")
    public static final void method1227(int arg0, class17 arg1) {
        class319.field4818 = 0;
        field2583++;
        class320.field4897 = 0;
        class286.field4081 = new class254();
        if (arg0 == 1002) {
            class160.field2480 = new class490[1024];
            class37.method387((byte) 56, arg1);
            class156.method1172(arg1, true);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIILmq;)V")
    public static final void method1228(int arg0, int arg1, int arg2, class350 arg3) {
        field2599++;
        if (class99.field1638) {
            class61 var4 = class140.field2234 == -1 ? null : class162.field2506.method597(11, class140.field2234);
            if (client.method1349(arg3).method1612(false) && (class417.field6234 & 0x20) != 0 && (var4 == null || arg3.method2225((byte) 76, class140.field2234, var4.field1062) != var4.field1062)) {
                class369.field5591++;
                class338.method2167(class1.field7 + " -> " + arg3.field5305, 0L, class56.field980, 1, arg3.field5322, true, class432.field6423, false, arg3.field5354, arg3.field5273, 50);
            }
        } else {
            for (int var5 = 9; var5 >= 5; var5--) {
                String var9 = class416.method2518(var5, arg3, -25737);
                if (var9 != null) {
                    class481.field7157++;
                    class338.method2167(arg3.field5305, (long) (var5 + 1), class223.method1476((byte) 118, arg3, var5), 1, arg3.field5322, true, var9, false, arg3.field5354, arg3.field5273, 1002);
                }
            }
            String var6 = class449.method2683(-1, arg3);
            if (var6 != null) {
                class42.field816++;
                class338.method2167(arg3.field5305, 0L, arg3.field5377, 1, arg3.field5322, true, var6, false, arg3.field5354, arg3.field5273, 8);
            }
            for (int var7 = 4; var7 >= 0; var7--) {
                String var8 = class416.method2518(var7, arg3, arg0 - 25736);
                if (var8 != null) {
                    class338.method2167(arg3.field5305, (long) (var7 + 1), class223.method1476((byte) 123, arg3, var7), 1, arg3.field5322, true, var8, false, arg3.field5354, arg3.field5273, 10);
                    class481.field7157++;
                }
            }
            if (client.method1349(arg3).method1606(false)) {
                if (arg3.field5228 == null) {
                    class338.method2167("", 0L, -1, 1, arg3.field5322, true, class440.field6580.method2180(client.field2870, arg0 + 29492), false, arg3.field5354, arg3.field5273, 15);
                } else {
                    class338.method2167("", 0L, -1, 1, arg3.field5322, true, arg3.field5228, false, arg3.field5354, arg3.field5273, 15);
                }
                class504.field7440++;
            }
        }
        if (arg0 != -1) {
            field2587 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lqa;II)Lc;")
    public final class121 method23(class162 arg0, int arg1, int arg2) {
        if (arg1 == 17793) {
            field2591++;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(B)V")
    public final void method22(byte arg0) {
        field2593++;
        if (arg0 != -3) {
            this.method25((byte) 34, null);
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)I")
    public final int method12(int arg0) {
        field2595++;
        if (arg0 != 3765) {
            field2600 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)Z")
    public final boolean method8(int arg0) {
        field2597++;
        if (arg0 <= 94) {
            this.method22((byte) 111);
        }
        return false;
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(I)V")
    public final void method26(int arg0) {
        field2581++;
        int var2 = -111 / ((arg0 + 46) / 44);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)I")
    public final int method19(byte arg0) {
        field2580++;
        if (arg0 != -69) {
            field2601 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "(I)V")
    public static void method1229(int arg0) {
        int var1 = -112 % ((arg0 - 77) / 40);
        field2600 = null;
        field2596 = null;
        field2601 = null;
        field2588 = null;
        field2587 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILqa;)V")
    public final void method15(int arg0, class162 arg1) {
        if (arg0 == -13300) {
            field2586++;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZLqa;)Lae;")
    public final class163 method13(boolean arg0, class162 arg1) {
        if (arg0) {
            this.method8(64);
        }
        field2585++;
        return null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILqa;II)Z")
    public final boolean method14(int arg0, class162 arg1, int arg2, int arg3) {
        if (arg0 != 131072) {
            field2596 = null;
        }
        field2598++;
        return false;
    }
}
