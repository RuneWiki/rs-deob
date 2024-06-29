import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class321 {

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "Lcb;")
    public static class631 field4756 = new class631(52, 3);

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "Lka;")
    public class282 field4754;

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "Lr;")
    public class706 field4753;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)V", line = 5)
    public static final void method2083(byte arg0) {
        class565.field8015.method328(((float) class654.field9289.field5449.method3425(3) * 0.1F + 0.7F) * class758.field10560);
        field4755++;
        if (arg0 > -67) {
            method2083((byte) -11);
        }
        class565.field8015.method259(class624.field8744, class195.field3356, class3.field15, (float) (class100.field1476 << 2), (float) (class60.field944 << 2), (float) (class96.field1420 << 2));
        class565.field8015.method238(class103.field1529);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(FIFFB)F", line = 28)
    public static final float method2084(float arg0, int arg1, float arg2, float arg3, byte arg4) {
        if (arg4 == -41) {
            field4752++;
            float[] var5 = class443.field6438[arg1];
            return var5[2] * arg2 + var5[0] * arg3 + var5[1] * arg0;
        } else {
            return 0.058769047F;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)V", line = 41)
    public static void method2085(boolean arg0) {
        if (!arg0) {
            field4756 = null;
        }
        field4756 = null;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V", line = 51)
    public static final void method2086(int arg0) {
        if (class138.field2172 < 102) {
            class138.field2172 += 6;
        }
        field4751++;
        if (class7.field74 != -1 && class18.method109(-11121) > class130.field2126) {
            for (int var1 = class7.field74; var1 < class554.field7905.length; var1++) {
                if (class554.field7905[var1].startsWith("pause")) {
                    int var2 = 5;
                    try {
                        var2 = Integer.parseInt(class554.field7905[var1].substring(6));
                    } catch (Exception var13) {
                    }
                    class400.method2484(26852, "Pausing for " + var2 + " seconds...");
                    class7.field74 = var1 + 1;
                    class130.field2126 = (long) (var2 * 1000) + class18.method109(-11121);
                    return;
                }
                class665.field9445 = class554.field7905[var1];
                class634.method3584(false, 2);
            }
            class7.field74 = -1;
        }
        if (class625.field8754 != 0) {
            class92.field1373 -= class625.field8754 * 5;
            if (class92.field1373 >= class336.field4920) {
                class92.field1373 = class336.field4920 - 1;
            }
            if (class92.field1373 < 0) {
                class92.field1373 = 0;
            }
            class625.field8754 = 0;
        }
        for (int var3 = 0; var3 < class576.field8166; var3++) {
            class62 var4 = class354.field5372[var3];
            int var5 = var4.method614((byte) -37);
            char var6 = var4.method611(7692);
            int var7 = var4.method612(92);
            if (var5 == 84) {
                class634.method3584(false, 2);
            }
            if (var5 == 80) {
                class634.method3584(true, 2);
            } else if (var5 == 66 && (var7 & 0x4) != 0) {
                if (class593.field8331 != null) {
                    String var11 = "";
                    for (int var12 = class8.field84.length - 1; var12 >= 0; var12--) {
                        if (class8.field84[var12] != null && class8.field84[var12].length() > 0) {
                            var11 = var11 + class8.field84[var12] + '\n';
                        }
                    }
                    class593.field8331.setContents(new StringSelection(var11), null);
                }
            } else if (var5 == 67 && (var7 & 0x4) != 0) {
                if (class593.field8331 != null) {
                    Transferable var8 = class593.field8331.getContents(null);
                    if (var8 != null) {
                        try {
                            String var9 = (String) var8.getTransferData(DataFlavor.stringFlavor);
                            if (var9 != null) {
                                String[] var10 = class750.method4181((byte) -84, var9, '\n');
                                class107.method873(16128, var10);
                            }
                        } catch (Exception var14) {
                        }
                    }
                }
            } else if (var5 == 85 && class174.field2996 > 0) {
                class665.field9445 = class665.field9445.substring(0, class174.field2996 - 1) + class665.field9445.substring(class174.field2996);
                class174.field2996--;
            } else if (var5 == 101 && class174.field2996 < class665.field9445.length()) {
                class665.field9445 = class665.field9445.substring(0, class174.field2996) + class665.field9445.substring(class174.field2996 + 1);
            } else if (var5 == 96 && class174.field2996 > 0) {
                class174.field2996--;
            } else if (var5 == 97 && class174.field2996 < class665.field9445.length()) {
                class174.field2996++;
            } else if (var5 == 102) {
                class174.field2996 = 0;
            } else if (var5 == 103) {
                class174.field2996 = class665.field9445.length();
            } else if (var5 == 104 && class8.field84.length > class723.field10139) {
                class723.field10139++;
                class713.method3944(9134);
                class174.field2996 = class665.field9445.length();
            } else if (var5 == 105 && class723.field10139 > 0) {
                class723.field10139--;
                class713.method3944(9134);
                class174.field2996 = class665.field9445.length();
            } else if (class223.method1578(-30852, var6) || var6 == '\' || var6 == '/' || var6 == '.' || var6 == ':' || var6 == ',' || var6 == ' ' || var6 == '_' || var6 == '-' || var6 == '+' || var6 == '[' || var6 == ']') {
                class665.field9445 = class665.field9445.substring(0, class174.field2996) + class354.field5372[var3].method611(7692) + class665.field9445.substring(class174.field2996);
                class174.field2996++;
            }
        }
        class721.field10121 = 0;
        class576.field8166 = 0;
        class353.method2259((byte) 102);
        if (arg0 > -26) {
            field4756 = null;
        }
    }
}
