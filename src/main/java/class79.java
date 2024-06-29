import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class79 {

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public int field1104 = 0;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    public int field1105 = 2048;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    public int field1107 = 0;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "I")
    public int field1112 = 2048;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "Z")
    public static boolean field1111 = false;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "J")
    public static volatile long field1110 = 0L;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "Lak;")
    public static class172 field1106;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ljj;ZI)V", line = 10)
    public final void method536(class44 arg0, boolean arg1, int arg2) {
        field1108++;
        if (arg1) {
            field1106 = (class172) null;
        }
        while (true) {
            int var4 = arg0.method286((byte) -72);
            if (var4 == 0) {
                return;
            }
            this.method539(arg2, arg0, var4, (byte) -118);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)V", line = 40)
    public static void method537(boolean arg0) {
        field1106 = null;
        if (!arg0) {
            method540(73, false, -77, -39, -85, -25);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 61)
    public static final void method538(Component arg0, byte arg1) {
        if (arg1 != -34) {
            return;
        }
        arg0.removeMouseListener(class63.field917);
        field1102++;
        arg0.removeMouseMotionListener(class63.field917);
        arg0.removeFocusListener(class63.field917);
        class320.field4967 = 0;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILjj;IB)V", line = 78)
    private final void method539(int arg0, class44 arg1, int arg2, byte arg3) {
        if (arg2 == 1) {
            this.field1107 = arg1.method286((byte) -64);
        } else if (arg2 == 2) {
            this.field1105 = arg1.method271(21081);
        } else if (arg2 == 3) {
            this.field1112 = arg1.method271(21081);
        } else if (arg2 == 4) {
            this.field1104 = arg1.method228(true);
        }
        field1113++;
        if (arg3 > -54) {
            this.field1105 = 82;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IZIIII)V", line = 107)
    public static final void method540(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field1103++;
        if (arg1) {
            method540(10, false, -25, -21, 70, 94);
        }
        if (arg3 == arg5) {
            class339.method2363(arg5, arg4, arg0, arg2, (byte) 95);
        } else if (arg0 - arg5 >= class336.field5249 && class191.field3131 >= arg0 + arg5 && (arg4 - arg3) >= class98.field1410 && (arg4 + arg3) <= class279.field4497) {
            class256.method1838(arg2, arg0, arg5, (byte) 115, arg4, arg3);
        } else {
            class2.method10(arg2, arg0, arg4, arg3, arg5, 0);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILqm;IIB)V", line = 130)
    public static final void method541(int arg0, class334 arg1, int arg2, int arg3, byte arg4) {
        field1101++;
        if (arg4 <= 90 || class191.field3129 == arg1 || class185.field3070 >= 400) {
            return;
        }
        String var11;
        if (arg1.field5197 == 0) {
            boolean var5 = true;
            if (class191.field3129.field5204 != -1 && arg1.field5204 != -1) {
                int var6 = class191.field3129.field5205 <= arg1.field5205 ? arg1.field5205 : class191.field3129.field5205;
                int var7 = arg1.field5204 > class191.field3129.field5204 ? class191.field3129.field5204 : arg1.field5204;
                int var8 = class191.field3129.field5205 - arg1.field5205;
                int var9 = (var6 * 10 / 100) + var7 + 5;
                if (var8 < 0) {
                    var8 = -var8;
                }
                if (var9 < var8) {
                    var5 = false;
                }
            }
            String var10 = class15.field169 == 1 ? class97.field1383 : class109.field1613;
            if (arg1.field5205 >= arg1.field5207) {
                var11 = arg1.method2333(true) + (var5 ? class178.method1335(arg1.field5205, 0, class191.field3129.field5205) : "<col=ffffff>") + " (" + var10 + arg1.field5205 + ")";
            } else {
                var11 = arg1.method2333(true) + (var5 ? class178.method1335(arg1.field5205, 0, class191.field3129.field5205) : "<col=ffffff>") + " (" + var10 + arg1.field5205 + "+" + (arg1.field5207 - arg1.field5205) + ")";
            }
        } else {
            var11 = arg1.method2333(true) + " (" + class21.field308 + arg1.field5197 + ")";
        }
        if (class8.field119 == 1) {
            class279.field4509++;
            class20.method111(class64.field925, arg0, arg2, class229.field3644 + " -> <col=ffffff>" + var11, (short) 58, class223.field3562, 1, (long) arg3);
        } else if (!class142.field2216) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class319.field4954[var12] != null) {
                    class50.field723++;
                    short var13 = 0;
                    if (class15.field169 == 0 && class319.field4954[var12].equalsIgnoreCase(class261.field4172)) {
                        if (class191.field3129.field5205 < arg1.field5205) {
                            var13 = 2000;
                        }
                        if (class191.field3129.field5214 != 0 && arg1.field5214 != 0) {
                            if (class191.field3129.field5214 == arg1.field5214) {
                                var13 = 2000;
                            } else {
                                var13 = 0;
                            }
                        }
                    } else if (class147.field2286[var12]) {
                        var13 = 2000;
                    }
                    boolean var14 = false;
                    short var15 = class64.field920[var12];
                    short var16 = (short) (var13 + var15);
                    class20.method111(class319.field4954[var12], arg0, arg2, "<col=ffffff>" + var11, var16, class159.field2637[var12], 1, (long) arg3);
                }
            }
        } else if ((class158.field2615 & 0x8) != 0) {
            class315.field4872++;
            class20.method111(class141.field2204, arg0, arg2, class200.field3247 + " -> <col=ffffff>" + var11, (short) 59, class331.field5165, 1, (long) arg3);
        }
        for (int var17 = 0; var17 < class185.field3070; var17++) {
            if (class113.field1727[var17] == 14) {
                class157.field2458[var17] = "<col=ffffff>" + var11;
                break;
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V", line = 262)
    public static final void method542(int arg0) {
        int[] var1 = new int[class200.field3258];
        field1109++;
        int var2 = arg0;
        for (int var3 = 0; var3 < class200.field3258; var3++) {
            class330 var4 = class285.method2054(var3, arg0);
            if (var4.field5136 >= 0 || var4.field5101 >= 0) {
                var1[var2++] = var3;
            }
        }
        class252.field4029 = new int[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            class252.field4029[var5] = var1[var5];
        }
    }
}
