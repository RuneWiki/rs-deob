import jaggl.OpenGL;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class328 {

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    private int field5131;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "Lni;")
    public static class521 field5126 = new class521();

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "[Z")
    public static boolean[] field5132 = new boolean[100];

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "Lsl;")
    public static class456 field5129 = new class456("", 16);

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field5121;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field5125;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field5127;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field5128;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "[Ltb;")
    public static class330[] field5130;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "[S")
    public static short[] field5124;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IC)V", line = 6)
    public final void method2035(int arg0, char arg1) {
        field5127++;
        OpenGL.glCallList(this.field5131 + arg1);
        int var3 = 43 % ((-arg0 - 46) / 43);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BI)V", line = 19)
    public final void method2036(byte arg0, int arg1) {
        if (arg0 != -107) {
            field5126 = null;
        }
        field5125++;
        OpenGL.glNewList(this.field5131 + arg1, 4864);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V", line = 30)
    public static void method2037(int arg0) {
        field5132 = null;
        int var1 = -127 / ((1 - arg0) / 44);
        field5130 = null;
        field5126 = null;
        field5129 = null;
        field5124 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V", line = 47)
    public static final void method2038(byte arg0) {
        if (class384.field5794 != 0) {
            class179.field2654 -= class384.field5794 * 5;
            if (class301.field4472 <= class179.field2654) {
                class179.field2654 = class301.field4472 - 1;
            }
            if (class179.field2654 < 0) {
                class179.field2654 = 0;
            }
            class384.field5794 = 0;
        }
        if (class214.field3052 < 102) {
            class214.field3052 += 6;
        }
        field5122++;
        for (int var1 = 0; var1 < class56.field775; var1++) {
            int var2 = class58.field800[var1].method209(true);
            char var3 = class58.field800[var1].method203((byte) 78);
            if (var2 == 84) {
                class454.method2642(-7810, false);
            }
            if (var2 == 80) {
                class454.method2642(-7810, true);
            } else if (class49.field630.method1879(82, true) && var2 == 66) {
                if (class202.field2946 != null) {
                    String var8 = "";
                    for (int var9 = class100.field1522.length - 1; var9 >= 0; var9--) {
                        if (class100.field1522[var9] != null && class100.field1522[var9].length() > 0) {
                            var8 = var8 + class100.field1522[var9] + '\n';
                        }
                    }
                    class202.field2946.setContents(new StringSelection(var8), null);
                }
            } else if (class49.field630.method1879(82, true) && var2 == 67) {
                if (class202.field2946 != null) {
                    Transferable var4 = class202.field2946.getContents(null);
                    if (var4 != null) {
                        try {
                            String var5 = (String) var4.getTransferData(DataFlavor.stringFlavor);
                            if (var5 != null) {
                                String[] var6 = class167.method1164(var5, (byte) 73, '\n');
                                if (var6.length <= 1) {
                                    class159.field2395 = class159.field2395 + var5;
                                } else {
                                    for (int var7 = 0; var7 < var6.length; var7++) {
                                        class159.field2395 = var6[var7];
                                        class454.method2642(-7810, false);
                                    }
                                }
                            }
                        } catch (Exception var10) {
                        }
                    }
                }
            } else if (var2 == 85 && class258.field3706 > 0) {
                class159.field2395 = class159.field2395.substring(0, class258.field3706 - 1) + class159.field2395.substring(class258.field3706);
                class258.field3706--;
            } else if (var2 == 101 && class258.field3706 < class159.field2395.length()) {
                class159.field2395 = class159.field2395.substring(0, class258.field3706) + class159.field2395.substring(class258.field3706 + 1);
            } else if (var2 == 96 && class258.field3706 > 0) {
                class258.field3706--;
            } else if (var2 == 97 && class258.field3706 < class159.field2395.length()) {
                class258.field3706++;
            } else if (var2 == 102) {
                class258.field3706 = 0;
            } else if (var2 == 103) {
                class258.field3706 = class159.field2395.length();
            } else if (var2 == 104 && class100.field1522.length > class516.field7573) {
                class516.field7573++;
                class304.method1897(92);
                class258.field3706 = class159.field2395.length();
            } else if (var2 == 105 && class516.field7573 > 0) {
                class516.field7573--;
                class304.method1897(arg0 ^ 0x4B);
                class258.field3706 = class159.field2395.length();
            } else if (class72.method506(var3, (byte) 75) || var3 == ':' || var3 == ',' || var3 == ' ' || var3 == '_' || var3 == '-' || var3 == '+' || var3 == '[' || var3 == ']') {
                class159.field2395 = class159.field2395.substring(0, class258.field3706) + class58.field800[var1].method203((byte) 21) + class159.field2395.substring(class258.field3706);
                class258.field3706++;
            }
        }
        class56.field775 = 0;
        if (arg0 != 22) {
            field5129 = null;
        }
        class134.method988(arg0 ^ 0xFFFF8EF9);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIIILjava/lang/String;)V", line = 220)
    public static final void method2039(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, String arg7) {
        field5128++;
        class336 var8 = new class336();
        var8.field5180 = arg6;
        if (arg0 > -38) {
            field5124 = null;
        }
        var8.field5183 = class86.field1350 + arg2;
        var8.field5188 = arg1;
        var8.field5187 = arg7;
        var8.field5190 = arg4;
        var8.field5182 = arg3;
        var8.field5179 = arg5;
        class295.field4411.method3094(-2713, var8);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)Z", line = 240)
    public static final boolean method2040(int arg0, int arg1, int arg2) {
        if (arg2 != 13430) {
            method2040(-93, -77, 69);
        }
        field5121++;
        return (class511.method3014(3652, arg1, arg0) | class316.method1976(true, arg0, arg1) | class268.method1670(arg0, (byte) 29, arg1)) & class403.method2434(arg0, (byte) 117, arg1);
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)V", line = 252)
    public final void method2041(byte arg0) {
        OpenGL.glEndList();
        field5123++;
        if (arg0 != 33) {
            field5132 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lvd;I)V", line = 268)
    public class328(class258 arg0, int arg1) {
        this.field5131 = OpenGL.glGenLists(arg1);
    }
}
