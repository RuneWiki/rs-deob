import java.awt.Component;
import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class65 extends class81 {

    @OriginalMember(owner = "client!ij", name = "J", descriptor = "Z")
    public static boolean field1429 = false;

    @OriginalMember(owner = "client!ij", name = "Q", descriptor = "Lsg;")
    public static class30 field1435 = class167.method1221((byte) 33, "; Max)2Age=");

    @OriginalMember(owner = "client!ij", name = "U", descriptor = "Lsg;")
    public static class30 field1439 = class167.method1221((byte) 33, "mem=");

    @OriginalMember(owner = "client!ij", name = "H", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!ij", name = "I", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!ij", name = "K", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!ij", name = "M", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!ij", name = "O", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!ij", name = "P", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!ij", name = "R", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!ij", name = "S", descriptor = "I")
    private int field1437;

    @OriginalMember(owner = "client!ij", name = "T", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!ij", name = "V", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!ij", name = "W", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!ij", name = "X", descriptor = "I")
    public int field1442;

    @OriginalMember(owner = "client!ij", name = "L", descriptor = "Lsg;")
    public class30 field1431;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "(I)V")
    public static final void method578(int arg0) {
        field1427++;
        class59.field1289.method1269((byte) -70);
        int var1 = class59.field1289.method1270(-67, 1);
        if (var1 == 0) {
            return;
        }
        int var2 = class59.field1289.method1270(-109, 2);
        if (var2 == 0) {
            class116.field2293[class168.field3158++] = 2047;
        } else if (var2 == 1) {
            int var3 = class59.field1289.method1270(-82, 3);
            class247.field4394.method573(var3, false, arg0 ^ 0xFFFFE151);
            int var4 = class59.field1289.method1270(-103, 1);
            if (var4 == 1) {
                class116.field2293[class168.field3158++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class59.field1289.method1270(-97, 3);
            class247.field4394.method573(var5, true, 52);
            int var6 = class59.field1289.method1270(-85, 3);
            class247.field4394.method573(var6, true, 65);
            int var7 = class59.field1289.method1270(arg0 + 7694, 1);
            if (var7 == 1) {
                class116.field2293[class168.field3158++] = 2047;
            }
        } else if (var2 == 3) {
            int var8 = class59.field1289.method1270(arg0 + 7716, 7);
            int var9 = class59.field1289.method1270(-102, 1);
            int var10 = class59.field1289.method1270(-50, 1);
            if (var10 == 1) {
                class116.field2293[class168.field3158++] = 2047;
            }
            class159.field2998 = class59.field1289.method1270(-123, 2);
            int var11 = class59.field1289.method1270(arg0 ^ 0x1EE8, 7);
            class247.field4394.method914(var11, var8, var9 == 1, arg0 ^ 0xFFFFE17B);
        } else if (arg0 != -7813) {
            method580((Component) null, (byte) -4);
        }
    }

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "(I)Z")
    public final boolean method579(int arg0) {
        int var2 = -71 / ((8 - arg0) / 43);
        field1432++;
        return this.field1437 == 115;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method580(Component arg0, byte arg1) {
        arg0.removeKeyListener(class81.field1737);
        field1434++;
        arg0.removeFocusListener(class81.field1737);
        class98.field1985 = -1;
        int var2 = 125 / ((arg1 - 41) / 53);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IBIII)V")
    public static final void method581(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        int var5 = arg4;
        field1430++;
        int var6 = 0;
        int var7 = -arg4;
        int var8 = -1;
        if (arg1 != -70) {
            method583((byte) 72);
        }
        int var9 = class68.method609(class48.field1096, 22050, class252.field4458, arg3 + arg4);
        int var10 = class68.method609(class48.field1096, arg1 ^ 0xFFFFA998, class252.field4458, arg3 - arg4);
        class194.method1405(true, class121.field2390[arg0], var9, var10, arg2);
        while (var5 > var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var5--;
                int var11 = arg0 + var5;
                int var12 = arg0 - var5;
                var7 -= var5 << 1;
                if (var11 >= class275.field4804 && var12 <= class167.field3064) {
                    int var13 = class68.method609(class48.field1096, arg1 ^ 0xFFFFA998, class252.field4458, arg3 + var6);
                    int var14 = class68.method609(class48.field1096, 22050, class252.field4458, arg3 - var6);
                    if (class167.field3064 >= var11) {
                        class194.method1405(true, class121.field2390[var11], var13, var14, arg2);
                    }
                    if (var12 >= class275.field4804) {
                        class194.method1405(true, class121.field2390[var12], var13, var14, arg2);
                    }
                }
            }
            var6++;
            int var15 = arg0 - var6;
            int var16 = arg0 + var6;
            if (var16 >= class275.field4804 && var15 <= class167.field3064) {
                int var17 = class68.method609(class48.field1096, 22050, class252.field4458, arg3 + var5);
                int var18 = class68.method609(class48.field1096, 22050, class252.field4458, arg3 - var5);
                if (class167.field3064 >= var16) {
                    class194.method1405(true, class121.field2390[var16], var17, var18, arg2);
                }
                if (class275.field4804 <= var15) {
                    class194.method1405(true, class121.field2390[var15], var17, var18, arg2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "(I)V")
    public static void method582(int arg0) {
        field1435 = null;
        field1439 = null;
        if (arg0 != 3) {
            field1439 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
    public static final void method583(byte arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class125.field2446[var1] = false;
        }
        class215.field3931 = 1;
        field1440++;
        class57.field1252 = -1;
        class54.field1193 = -1;
        if (arg0 != -112) {
            method582(-22);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILaa;)V")
    private final void method584(int arg0, int arg1, class8 arg2) {
        if (~arg0 == arg1) {
            this.field1437 = arg2.method63((byte) 97);
        } else if (arg0 == 2) {
            this.field1442 = arg2.method70(arg1 + 65282);
        } else if (arg0 == 5) {
            this.field1431 = arg2.method84(arg1 ^ 0xFFFFFFFE);
        }
        field1441++;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Laa;B)V")
    public final void method585(class8 arg0, byte arg1) {
        field1438++;
        while (true) {
            int var3 = arg0.method63((byte) 100);
            if (var3 == 0) {
                if (arg1 < 10) {
                    this.method585((class8) null, (byte) 25);
                    return;
                } else {
                    return;
                }
            }
            this.method584(var3, -2, arg0);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I[Lgj;[Lgj;[Lpj;[Lgj;[Lgj;Lmc;)V")
    public static final void method586(int arg0, class192[] arg1, class192[] arg2, class152[] arg3, class192[] arg4, class192[] arg5, class151 arg6) {
        class119.field2329 = arg1;
        class58.field1269 = arg5;
        field1428++;
        class167.field3072 = arg6;
        class141.field2736 = arg3;
        class141.field2732 = arg2;
        class86.field1774 = arg4;
        class204.field3659.method480(106);
        int var7 = class167.field3072.method1096((byte) -102, class143.field2769);
        int[] var8 = class167.field3072.method1097(var7, true);
        if (arg0 != -2) {
            method587((Object) null, 81, (class66) null);
        }
        for (int var9 = 0; var9 < var8.length; var9++) {
            class204.field3659.method477(class115.method896(124, new class8(class167.field3072.method1115(var8[var9], (byte) -67, var7))), (byte) 6);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/lang/Object;ILbi;)V")
    public static final void method587(Object arg0, int arg1, class66 arg2) {
        field1433++;
        if (arg1 <= 64) {
            method580((Component) null, (byte) -83);
        }
        if (arg2.field1451 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field1451.peekEvent() != null; var3++) {
            class160.method1191(1L, 0);
        }
        if (arg0 != null) {
            arg2.field1451.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method588(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field1436++;
        if (arg0 == arg7) {
            class37.method351(arg6, arg5, arg3, arg7, arg1, -90, arg2);
            return;
        }
        int var8 = 91 % ((arg4 - 18) / 37);
        if (class48.field1096 <= arg5 - arg7 && (arg5 + arg7) <= class252.field4458 && (arg6 - arg0) >= class275.field4804 && class167.field3064 >= arg0 + arg6) {
            class25.method228(arg7, (byte) 88, arg5, arg0, arg3, arg6, arg2, arg1);
        } else {
            class29.method248(arg1, arg7, arg2, arg6, arg5, 3, arg0, arg3);
        }
    }
}
