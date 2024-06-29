import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class294 extends class320 {

    @OriginalMember(owner = "client!ss", name = "q", descriptor = "Lug;")
    public class392 field4192 = new class392();

    @OriginalMember(owner = "client!ss", name = "o", descriptor = "[[S")
    public static short[][] field4190 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ss", name = "s", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!ss", name = "l", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!ss", name = "m", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!ss", name = "n", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!ss", name = "p", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!ss", name = "r", descriptor = "Lbu;")
    public static class17 field4193;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)V")
    public static final void method1873(int arg0, int arg1) {
        field4191++;
        class54 var2 = class442.method2651(arg1, 14, -13208);
        if (arg0 > -63) {
            field4190 = null;
        }
        var2.method476((byte) -44);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Z)V")
    public static final void method1874(boolean arg0) {
        field4187++;
        if (class50.field908 != 0) {
            class377.field5710 -= class50.field908 * 5;
            if (class347.field5195 <= class377.field5710) {
                class377.field5710 = class347.field5195 - 1;
            }
            if (class377.field5710 < 0) {
                class377.field5710 = 0;
            }
            class50.field908 = 0;
        }
        if (class478.field7130 < 102) {
            class478.field7130 += 6;
        }
        for (int var1 = 0; var1 < class483.field7187; var1++) {
            int var2 = class109.field1842[var1].method1171((byte) 104);
            char var3 = class109.field1842[var1].method1176((byte) 90);
            if (var2 == 84) {
                class449.method2681(true);
            } else if (class380.field5726.method1584(14, 82) && var2 == 66) {
                if (class140.field2229 != null) {
                    String var8 = "";
                    for (int var9 = class328.field4958.length - 1; var9 >= 0; var9--) {
                        if (class328.field4958[var9] != null && class328.field4958[var9].length() > 0) {
                            var8 = var8 + class328.field4958[var9] + '\n';
                        }
                    }
                    class140.field2229.setContents(new StringSelection(var8), null);
                }
            } else if (class380.field5726.method1584(14, 82) && var2 == 67) {
                if (class140.field2229 != null) {
                    Transferable var4 = class140.field2229.getContents(null);
                    if (var4 != null) {
                        try {
                            String var5 = (String) var4.getTransferData(DataFlavor.stringFlavor);
                            if (var5 != null) {
                                String[] var6 = class139.method1043(var5, 0, '\n');
                                if (var6.length > 1) {
                                    for (int var7 = 0; var7 < var6.length; var7++) {
                                        class370.field5609 = var6[var7];
                                        class449.method2681(true);
                                    }
                                } else {
                                    class370.field5609 = class370.field5609 + var5;
                                }
                            }
                        } catch (Exception var10) {
                        }
                    }
                }
            } else if (var2 == 85 && class3.field98 > 0) {
                class370.field5609 = class370.field5609.substring(0, class3.field98 - 1) + class370.field5609.substring(class3.field98);
                class3.field98--;
            } else if (var2 == 101 && class3.field98 < class370.field5609.length()) {
                class370.field5609 = class370.field5609.substring(0, class3.field98) + class370.field5609.substring(class3.field98 + 1);
            } else if (var2 == 96 && class3.field98 > 0) {
                class3.field98--;
            } else if (var2 == 97 && class3.field98 < class370.field5609.length()) {
                class3.field98++;
            } else if (var2 == 102) {
                class3.field98 = 0;
            } else if (var2 == 103) {
                class3.field98 = class370.field5609.length();
            } else if (var2 == 104 && class328.field4958.length > class258.field3752) {
                class258.field3752++;
                class202.method1396(0);
                class3.field98 = class370.field5609.length();
            } else if (var2 == 105 && class258.field3752 > 0) {
                class258.field3752--;
                class202.method1396(0);
                class3.field98 = class370.field5609.length();
            } else if (class245.method1593(var3, (byte) 62) || var3 == ':' || var3 == ',' || var3 == ' ' || var3 == '_' || var3 == '-' || var3 == '+' || var3 == '[' || var3 == ']') {
                class370.field5609 = class370.field5609.substring(0, class3.field98) + class109.field1842[var1].method1176((byte) 91) + class370.field5609.substring(class3.field98);
                class3.field98++;
            }
        }
        if (arg0) {
            field4188 = -34;
        }
        class483.field7187 = 0;
        class511.method3061(22843);
    }

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "(I)V")
    public static final void method1875(int arg0) {
        field4189++;
        if (class423.field6322 == class177.field2702) {
            return;
        }
        try {
            class512.method3065("tbrefresh", class19.field322, (byte) 10);
            if (arg0 != 10429) {
                method1876(-2);
            }
        } catch (Throwable var1) {
        }
    }

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "(I)V")
    public static void method1876(int arg0) {
        field4193 = null;
        if (arg0 != -1) {
            field4194 = 42;
        }
        field4190 = null;
    }

    static {
        new class342(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
        field4194 = 1406;
    }
}
