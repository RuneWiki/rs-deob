import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public class class184 {

    @OriginalMember(owner = "client!efa", name = "h", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field2816 = new Rectangle[100];

    @OriginalMember(owner = "client!efa", name = "l", descriptor = "[[B")
    public static byte[][] field2820;

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!efa", name = "c", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!efa", name = "f", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!efa", name = "g", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!efa", name = "i", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!efa", name = "j", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "J")
    public long field2810;

    @OriginalMember(owner = "client!efa", name = "d", descriptor = "Lefa;")
    public class184 field2812;

    @OriginalMember(owner = "client!efa", name = "k", descriptor = "Lefa;")
    public class184 field2819;

    @OriginalMember(owner = "client!efa", name = "e", descriptor = "Luda;")
    public static class453 field2813;

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field2816[var0] = new Rectangle();
        }
        field2820 = new byte[50][];
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(IIZLfe;II)V", line = 4)
    public static final void method1299(int arg0, int arg1, boolean arg2, class572 arg3, int arg4, int arg5) {
        field2814++;
        if (arg1 >= 1 && arg0 >= 1 && (class194.field2946 - 2) >= arg1 && (class255.field3656 - 2) >= arg0) {
            if (class80.field1136 == null) {
                return;
            }
            class721 var6 = class671.field9358.method1533(arg4, arg0, !arg2, arg1, arg5);
            if (var6 != null) {
                if ((var6 instanceof class734)) {
                    ((class734) var6).method4129(0, arg3);
                } else if (var6 instanceof class745) {
                    ((class745) var6).method4166(arg2, arg3);
                } else if ((var6 instanceof class507)) {
                    ((class507) var6).method3007(arg3, true);
                } else if (var6 instanceof class78) {
                    ((class78) var6).method641(arg3, (byte) 92);
                }
            }
        }
        if (!arg2) {
            method1302(false, (byte) -49, null);
        }
    }

    @OriginalMember(owner = "client!efa", name = "d", descriptor = "(I)V", line = 46)
    public static void method1300(int arg0) {
        field2813 = null;
        field2816 = null;
        if (arg0 != 0) {
            field2820 = null;
        }
        field2820 = null;
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(ZZI)V", line = 65)
    public static final void method1301(boolean arg0, boolean arg1, int arg2) {
        field2815++;
        if (arg2 != -22433) {
            return;
        }
        if (arg0) {
            class383.field5775++;
            class717.method4074((byte) 73);
        }
        if (arg1) {
            class394.field5923++;
            class753.method4199(-4565);
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(ZBLbs;)V", line = 89)
    public static final void method1302(boolean arg0, byte arg1, class689 arg2) {
        field2817++;
        if (class68.field969 >= 400) {
            return;
        }
        if (class130.field1749 != arg2) {
            String var3;
            if (arg2.field9509 == 0) {
                boolean var4 = true;
                if (class130.field1749.field9536 != -1 && arg2.field9536 != -1) {
                    int var5 = arg2.field9536 > class130.field1749.field9536 ? class130.field1749.field9536 : arg2.field9536;
                    int var6 = class130.field1749.field9524 - arg2.field9524;
                    if (var6 < 0) {
                        var6 = -var6;
                    }
                    if (var6 > var5) {
                        var4 = false;
                    }
                }
                String var7 = class373.field5652 == class199.field2993 ? class430.field6400.method2679(class650.field9160, 127) : class430.field6398.method2679(class650.field9160, -90);
                if (arg2.field9502 > arg2.field9524) {
                    var3 = arg2.method3917((byte) 112, true) + (var4 ? class679.method3895(0, class130.field1749.field9524, arg2.field9524) : "<col=ffffff>") + " (" + var7 + arg2.field9524 + "+" + (arg2.field9502 - arg2.field9524) + ")";
                } else {
                    var3 = arg2.method3917((byte) 122, true) + (var4 ? class679.method3895(0, class130.field1749.field9524, arg2.field9524) : "<col=ffffff>") + " (" + var7 + arg2.field9524 + ")";
                }
            } else if (arg2.field9509 == -1) {
                var3 = arg2.method3917((byte) 125, true);
            } else {
                var3 = arg2.method3917((byte) 97, true) + " (" + class430.field6399.method2679(class650.field9160, -74) + arg2.field9509 + ")";
            }
            if (class282.field3986 && !arg0 && (class295.field4202 & 0x8) != 0) {
                class105.field1474++;
                class240.method1593(class298.field4229, 0, (byte) 117, false, (long) arg2.field6118, class488.field6984, false, -1, 11, 0, true, (long) arg2.field6118, class29.field278 + " -> <col=ffffff>" + var3);
            }
            if (arg0) {
                class240.method1593("<col=cccccc>" + var3, 0, (byte) -95, true, 0L, -1, false, 0, -1, 0, false, (long) arg2.field6118, "");
            } else {
                for (int var8 = 7; var8 >= 0; var8--) {
                    if (class143.field1869[var8] != null) {
                        short var9 = 0;
                        if (class555.field7936 == class199.field2993 && class143.field1869[var8].equalsIgnoreCase(class430.field6393.method2679(class650.field9160, 98))) {
                            if (class130.field1749.field9524 < arg2.field9524) {
                                var9 = 2000;
                            }
                            if (class130.field1749.field9534 != 0 && arg2.field9534 != 0) {
                                if (class130.field1749.field9534 == arg2.field9534) {
                                    var9 = 2000;
                                } else {
                                    var9 = 0;
                                }
                            }
                        } else if (class597.field8464[var8]) {
                            var9 = 2000;
                        }
                        short var10 = (short) (class81.field1140[var8] + var9);
                        int var11 = class411.field6188[var8] == -1 ? class164.field2593 : class411.field6188[var8];
                        class240.method1593(class143.field1869[var8], 0, (byte) 107, false, (long) arg2.field6118, var11, false, -1, var10, 0, true, (long) arg2.field6118, "<col=ffffff>" + var3);
                        class371.field5328++;
                    }
                }
            }
            if (!arg0) {
                for (class342 var12 = (class342) class748.field10459.method1195(0); var12 != null; var12 = (class342) class748.field10459.method1201(2)) {
                    if (var12.field4972 == 58) {
                        var12.field4964 = "<col=ffffff>" + var3;
                        break;
                    }
                }
            }
            if (arg1 != 37) {
                field2813 = null;
            }
        } else if (class282.field3986 && (class295.field4202 & 0x10) != 0) {
            class240.method1593(class298.field4229, 0, (byte) 112, false, 0L, class488.field6984, false, -1, 46, 0, true, (long) arg2.field6118, class29.field278 + " -> <col=ffffff>" + class430.field6407.method2679(class650.field9160, -80));
            class645.field9079++;
        }
    }

    @OriginalMember(owner = "client!efa", name = "c", descriptor = "(B)Z", line = 240)
    public final boolean method1303(byte arg0) {
        field2818++;
        if (this.field2819 == null) {
            return false;
        } else if (arg0 == 26) {
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!efa", name = "d", descriptor = "(B)V", line = 255)
    public final void method1304(byte arg0) {
        field2811++;
        if (this.field2819 == null) {
            return;
        }
        this.field2819.field2812 = this.field2812;
        this.field2812.field2819 = this.field2819;
        this.field2819 = null;
        this.field2812 = null;
        if (arg0 != 7) {
            this.field2812 = null;
        }
    }
}
