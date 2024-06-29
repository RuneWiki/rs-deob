import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class305 {

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "Laba;")
    public static class150 field4156 = new class150();

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)V")
    public static final void method1933(byte arg0) {
        field4158++;
        if (class519.field7316 < 102) {
            class519.field7316 += 6;
        }
        if (class231.field3283 != 0) {
            class169.field2443 -= class231.field3283 * 5;
            if (class169.field2443 >= class266.field3735) {
                class169.field2443 = class266.field3735 - 1;
            }
            class231.field3283 = 0;
            if (class169.field2443 < 0) {
                class169.field2443 = 0;
            }
        }
        if (arg0 != 29) {
            field4156 = null;
        }
        for (int var1 = 0; var1 < class105.field1583; var1++) {
            class620 var2 = class297.field4068[var1];
            int var3 = var2.method3200((byte) 113);
            char var4 = var2.method3201(29232);
            int var5 = var2.method3194(arg0 - 18926);
            if (var3 == 84) {
                class362.method2168(false, -1);
            }
            if (var3 == 80) {
                class362.method2168(true, -1);
            } else if (var3 == 66 && (var5 & 0x4) != 0) {
                if (class639.field9301 != null) {
                    String var6 = "";
                    for (int var7 = class607.field8742.length - 1; var7 >= 0; var7--) {
                        if (class607.field8742[var7] != null && class607.field8742[var7].length() > 0) {
                            var6 = var6 + class607.field8742[var7] + '\n';
                        }
                    }
                    class639.field9301.setContents(new StringSelection(var6), null);
                }
            } else if (var3 == 67 && (var5 & 0x4) != 0) {
                if (class639.field9301 != null) {
                    Transferable var8 = class639.field9301.getContents(null);
                    if (var8 != null) {
                        try {
                            String var9 = (String) var8.getTransferData(DataFlavor.stringFlavor);
                            if (var9 != null) {
                                String[] var10 = class294.method1884(1, var9, '\n');
                                if (var10.length <= 1) {
                                    class585.field8364 = class585.field8364 + var9;
                                } else {
                                    for (int var11 = 0; var11 < var10.length; var11++) {
                                        class585.field8364 = var10[var11];
                                        class362.method2168(false, arg0 ^ 0xFFFFFFE2);
                                    }
                                }
                            }
                        } catch (Exception var12) {
                        }
                    }
                }
            } else if (var3 == 85 && class148.field2273 > 0) {
                class585.field8364 = class585.field8364.substring(0, class148.field2273 - 1) + class585.field8364.substring(class148.field2273);
                class148.field2273--;
            } else if (var3 == 101 && class148.field2273 < class585.field8364.length()) {
                class585.field8364 = class585.field8364.substring(0, class148.field2273) + class585.field8364.substring(class148.field2273 + 1);
            } else if (var3 == 96 && class148.field2273 > 0) {
                class148.field2273--;
            } else if (var3 == 97 && class148.field2273 < class585.field8364.length()) {
                class148.field2273++;
            } else if (var3 == 102) {
                class148.field2273 = 0;
            } else if (var3 == 103) {
                class148.field2273 = class585.field8364.length();
            } else if (var3 == 104 && class607.field8742.length > class360.field4844) {
                class360.field4844++;
                class363.method2172(false);
                class148.field2273 = class585.field8364.length();
            } else if (var3 == 105 && class360.field4844 > 0) {
                class360.field4844--;
                class363.method2172(false);
                class148.field2273 = class585.field8364.length();
            } else if (class285.method1824((byte) -82, var4) || var4 == ':' || var4 == ',' || var4 == ' ' || var4 == '_' || var4 == '-' || var4 == '+' || var4 == '[' || var4 == ']') {
                class585.field8364 = class585.field8364.substring(0, class148.field2273) + class297.field4068[var1].method3201(29232) + class585.field8364.substring(class148.field2273);
                class148.field2273++;
            }
        }
        class105.field1583 = 0;
        class40.method413(-101);
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(B)V")
    public static void method1934(byte arg0) {
        if (arg0 > -19) {
            method1933((byte) 6);
        }
        field4156 = null;
    }
}
