import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class98 {

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "Lkd;")
    public static class73 field2447 = class126.method1070((byte) -66, "Name des Gegenstands eingeben:");

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "Lkd;")
    public static class73 field2440 = class126.method1070((byte) -66, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "Lkd;")
    private static class73 field2445 = class126.method1070((byte) -66, "No response from server)3");

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "Lkd;")
    public static class73 field2448 = field2445;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "Lkd;")
    private static class73 field2449 = class126.method1070((byte) -66, "Unexpected loginserver response)3");

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static volatile int field2443 = -1;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "Lkd;")
    public static class73 field2442 = field2449;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "[[I")
    public static int[][] field2451 = new int[104][104];

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "Ljb;")
    public static class64 field2450 = new class64(64);

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "Lkd;")
    private static class73 field2457 = class126.method1070((byte) -66, "Too many incorrect logins from your address)3");

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "Lkd;")
    public static class73 field2454 = field2457;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "Lkd;")
    private static class73 field2459 = class126.method1070((byte) -66, "flash2:");

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "Z")
    public static boolean field2456 = false;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    public static int field2455 = 0;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "Lkd;")
    public static class73 field2453 = class126.method1070((byte) -66, "VOLL");

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "Lkd;")
    public static class73 field2458 = field2459;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "Lkd;")
    public static class73 field2461 = class126.method1070((byte) -66, "-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "Lkd;")
    public static class73 field2462 = class126.method1070((byte) -66, "m-Ochte sich mit Ihnen duellieren)3");

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "Lkd;")
    public static class73 field2460 = field2459;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZIIIIII[La;I)V")
    public static final void method803(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class1[] arg9, int arg10) {
        field2441++;
        for (int var11 = 0; var11 < arg9.length; var11++) {
            class1 var12 = arg9[var11];
            if (var12 != null && (var12.field81 == 0 || var12.field112) && var12 != null && var12.field101 == arg1 && !class112.method910(var12, -2667)) {
                int var13 = var12.field115 + arg3 - arg0;
                int var14 = var12.field63 + var13;
                int var15 = arg8 + var12.field60 - arg4;
                int var16 = var15 <= arg8 ? arg8 : var15;
                int var17 = var12.field96 + var15;
                int var18 = arg7 <= var14 ? arg7 : var14;
                int var19 = arg3 >= var13 ? arg3 : var13;
                int var20 = var17 >= arg5 ? arg5 : var17;
                if (var12.field81 == 0) {
                    method803(var12.field86 + var19 - var13, var12.field45, true, var19, var12.field73 + var16 - var15, var20, arg6, var18, var16, arg9, arg10);
                    if (var12.field126 != null) {
                        method803(var12.field86 + var19 - var13, var12.field45, true, var19, var16 + var12.field73 - var15, var20, arg6, var18, var16, var12.field126, arg10);
                    }
                }
                if (var12.field112) {
                    boolean var21;
                    if (var16 <= class31.field869 && class3.field161 >= var19 && var20 > class31.field869 && class3.field161 < var18) {
                        var21 = true;
                    } else {
                        var21 = false;
                    }
                    boolean var22 = false;
                    if (class105.field2615 == 1 && var16 <= class103.field2570 && var19 <= class42.field1134 && var20 > class103.field2570 && class42.field1134 < var18) {
                        var22 = true;
                    }
                    boolean var23 = false;
                    if (field2455 == 1 && var21) {
                        var23 = true;
                    }
                    if (var22 && class74.field1917 == null && (arg10 & 0x200) != 0 && !class15.field459 && class15.method122((byte) -79, var12) != null) {
                        class15.field461 = 0;
                        class74.field1917 = var12;
                        class26.field768 = class103.field2570 - var16;
                        class104.field2598 = false;
                        class1.field27 = arg6;
                        class19.field544 = class42.field1134 - var19;
                    }
                    if (class74.field1917 != null || class15.field459) {
                        var21 = false;
                        var22 = false;
                        var23 = false;
                    }
                    if (!var12.field24 && var22 && (arg10 & 0x1) != 0) {
                        var12.field24 = true;
                        if (var12.field46 != null) {
                            class57.method490(var12.field46, 0, (byte) 78, null, class42.field1134 - var13, var12, class103.field2570 - var15);
                        }
                    }
                    if (var12.field24 && var23 && (arg10 & 0x4) != 0 && var12.field2 != null) {
                        class57.method490(var12.field2, 0, (byte) 78, null, class3.field161 - var13, var12, class31.field869 - var15);
                    }
                    if (var12.field24 && !var23 && (arg10 & 0x2) != 0) {
                        var12.field24 = false;
                        if (var12.field131 != null) {
                            class57.method490(var12.field131, 0, (byte) 78, null, class3.field161 - var13, var12, class31.field869 - var15);
                        }
                    }
                    if (var23 && (arg10 & 0x8) != 0 && var12.field12 != null) {
                        class57.method490(var12.field12, 0, (byte) 78, null, class3.field161 - var13, var12, class31.field869 - var15);
                    }
                    if (!var12.field133 && var21 && (arg10 & 0x10) != 0) {
                        var12.field133 = true;
                        if (var12.field55 != null) {
                            class57.method490(var12.field55, 0, (byte) 78, null, class3.field161 - var13, var12, class31.field869 - var15);
                        }
                    }
                    if (var12.field133 && var21 && (arg10 & 0x40) != 0 && var12.field69 != null) {
                        class57.method490(var12.field69, 0, (byte) 78, null, class3.field161 - var13, var12, class31.field869 - var15);
                    }
                    if (var12.field133 && !var21 && (arg10 & 0x20) != 0) {
                        var12.field133 = false;
                        if (var12.field49 != null) {
                            class57.method490(var12.field49, 0, (byte) 78, null, class3.field161 - var13, var12, class31.field869 - var15);
                        }
                    }
                    if (var12.field14 != null && (arg10 & 0x80) != 0) {
                        class57.method490(var12.field14, 0, (byte) 78, null, 0, var12, 0);
                    }
                    if (var21 && class54.field1448 != 0 && var12.field118 != null && (arg10 & 0x400) != 0) {
                        class57.method490(var12.field118, 0, (byte) 78, null, class54.field1448, var12, 0);
                    }
                    if ((arg10 & 0x100) != 0) {
                        if (class112.field2807 > var12.field82 && var12.field66 != null) {
                            class57.method490(var12.field66, 0, (byte) 78, null, 0, var12, 0);
                        }
                        if (var12.field82 < class19.field536 && var12.field7 != null) {
                            class57.method490(var12.field7, 0, (byte) 78, null, 0, var12, 0);
                        }
                        if (var12.field82 < class116.field2976 && var12.field52 != null) {
                            class57.method490(var12.field52, 0, (byte) 78, null, 0, var12, 0);
                        }
                        var12.field82 = class49.field1308;
                    }
                }
            }
        }
        if (!arg2) {
            method806((byte) -31);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILqf;)V")
    public static final void method804(int arg0, class117 arg1) {
        if (arg0 != 0) {
            method805(107, null);
        }
        if (arg1.field2989 != null) {
            arg1.field2989.field3752 = 0;
        }
        arg1.field2987 = false;
        field2452++;
        for (class117 var2 = arg1.method468(); var2 != null; var2 = arg1.method454()) {
            method804(arg0, var2);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method805(int arg0, Component arg1) {
        field2444++;
        if (arg0 != -1) {
            method806((byte) -13);
        }
        Method var2 = class148.field3621;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg1.addKeyListener(class115.field2903);
        arg1.addFocusListener(class115.field2903);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
    public static void method806(byte arg0) {
        field2451 = null;
        field2447 = null;
        field2445 = null;
        field2442 = null;
        field2450 = null;
        if (arg0 != 111) {
            return;
        }
        field2449 = null;
        field2459 = null;
        field2453 = null;
        field2440 = null;
        field2448 = null;
        field2457 = null;
        field2458 = null;
        field2460 = null;
        field2462 = null;
        field2454 = null;
        field2461 = null;
    }
}
