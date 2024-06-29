import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class47 {

    @OriginalMember(owner = "client!kaa", name = "g", descriptor = "I")
    private int field598;

    @OriginalMember(owner = "client!kaa", name = "e", descriptor = "I")
    public int field596;

    @OriginalMember(owner = "client!kaa", name = "f", descriptor = "Lhda;")
    public static class752 field597 = new class752(97, 20);

    @OriginalMember(owner = "client!kaa", name = "i", descriptor = "I")
    public static int field600 = 0;

    @OriginalMember(owner = "client!kaa", name = "h", descriptor = "Lhda;")
    public static class752 field599 = new class752(64, 6);

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!kaa", name = "c", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!kaa", name = "d", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!kaa", name = "j", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)I", line = 3)
    public final int method330(int arg0) {
        if (arg0 != -1) {
            field597 = null;
        }
        field592++;
        return this.field598;
    }

    @OriginalMember(owner = "client!kaa", name = "toString", descriptor = "()Ljava/lang/String;", line = 15)
    public final String toString() {
        field594++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "(I)V", line = 29)
    public static final void method331(int arg0) {
        if (class360.field5083 < 102) {
            class360.field5083 += 6;
        }
        field601++;
        if (class586.field7668 != -1 && class375.method2193(arg0 - 8716) > class178.field2684) {
            for (int var1 = class586.field7668; var1 < class239.field3375.length; var1++) {
                if (class239.field3375[var1].startsWith("pause")) {
                    int var2 = 5;
                    try {
                        var2 = Integer.parseInt(class239.field3375[var1].substring(6));
                    } catch (Exception var13) {
                    }
                    class710.method3991("Pausing for " + var2 + " seconds...", (byte) 116);
                    class586.field7668 = var1 + 1;
                    class178.field2684 = (long) (var2 * 1000) + class375.method2193(116);
                    return;
                }
                class490.field6655 = class239.field3375[var1];
                class752.method4213(1354797057, false);
            }
            class586.field7668 = -1;
        }
        if (class118.field1903 != 0) {
            class313.field4476 -= class118.field1903 * 5;
            if (class723.field10069 <= class313.field4476) {
                class313.field4476 = class723.field10069 - 1;
            }
            class118.field1903 = 0;
            if (class313.field4476 < 0) {
                class313.field4476 = 0;
            }
        }
        if (arg0 != 8832) {
            field599 = null;
        }
        for (int var3 = 0; var3 < class26.field424; var3++) {
            class638 var4 = class26.field421[var3];
            int var5 = var4.method2250(arg0 ^ 0xFFFF9566);
            char var6 = var4.method2248((byte) -114);
            int var7 = var4.method2254(-22313);
            if (var5 == 84) {
                class752.method4213(1354797057, false);
            }
            if (var5 == 80) {
                class752.method4213(1354797057, true);
            } else if (var5 == 66 && (var7 & 0x4) != 0) {
                if (class710.field9837 != null) {
                    String var11 = "";
                    for (int var12 = class475.field6519.length - 1; var12 >= 0; var12--) {
                        if (class475.field6519[var12] != null && class475.field6519[var12].length() > 0) {
                            var11 = var11 + class475.field6519[var12] + '\n';
                        }
                    }
                    class710.field9837.setContents(new StringSelection(var11), null);
                }
            } else if (var5 == 67 && (var7 & 0x4) != 0) {
                if (class710.field9837 != null) {
                    Transferable var8 = class710.field9837.getContents(null);
                    if (var8 != null) {
                        try {
                            String var9 = (String) var8.getTransferData(DataFlavor.stringFlavor);
                            if (var9 != null) {
                                String[] var10 = class323.method1958(arg0 ^ 0x22FA, var9, '\n');
                                class375.method2191(117, var10);
                            }
                        } catch (Exception var14) {
                        }
                    }
                }
            } else if (var5 == 85 && class88.field1078 > 0) {
                class490.field6655 = class490.field6655.substring(0, class88.field1078 - 1) + class490.field6655.substring(class88.field1078);
                class88.field1078--;
            } else if (var5 == 101 && class88.field1078 < class490.field6655.length()) {
                class490.field6655 = class490.field6655.substring(0, class88.field1078) + class490.field6655.substring(class88.field1078 + 1);
            } else if (var5 == 96 && class88.field1078 > 0) {
                class88.field1078--;
            } else if (var5 == 97 && class88.field1078 < class490.field6655.length()) {
                class88.field1078++;
            } else if (var5 == 102) {
                class88.field1078 = 0;
            } else if (var5 == 103) {
                class88.field1078 = class490.field6655.length();
            } else if (var5 == 104 && class66.field824 < class475.field6519.length) {
                class66.field824++;
                class195.method1330(arg0 ^ 0x2280);
                class88.field1078 = class490.field6655.length();
            } else if (var5 == 105 && class66.field824 > 0) {
                class66.field824--;
                class195.method1330(arg0 - 8832);
                class88.field1078 = class490.field6655.length();
            } else if (class460.method2619(65, var6) || var6 == '\\' || var6 == '/' || var6 == '.' || var6 == ':' || var6 == ',' || var6 == ' ' || var6 == '_' || var6 == '-' || var6 == '+' || var6 == '[' || var6 == ']') {
                class490.field6655 = class490.field6655.substring(0, class88.field1078) + class26.field421[var3].method2248((byte) -124) + class490.field6655.substring(class88.field1078);
                class88.field1078++;
            }
        }
        class639.field8478 = 0;
        class26.field424 = 0;
        class312.method1915(-101);
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(B)Z", line = 224)
    public static final boolean method332(byte arg0) {
        if (arg0 != -7) {
            method332((byte) -92);
        }
        field595++;
        try {
            return class528.method2954(true);
        } catch (IOException var4) {
            class92.method694(16384);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class94.field1148 == null ? -1 : class94.field1148.method4214((byte) -52)) + "," + (class513.field6809 == null ? -1 : class513.field6809.method4214((byte) -25)) + "," + (class42.field552 == null ? -1 : class42.field552.method4214((byte) -36)) + " - " + class732.field10143 + "," + (class472.field6475.field10322[0] + class503.field6752) + "," + (class472.field6475.field10321[0] + class334.field4757) + " - ";
            for (int var3 = 0; var3 < class732.field10143 && var3 < 50; var3++) {
                var2 = var2 + class3.field63.field9399[var3] + ",";
            }
            class135.method1056(var2, var5, 1);
            class339.method2036(arg0 + 32, false);
            return true;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ILwu;II)Lur;", line = 260)
    public static final class538 method333(int arg0, class376 arg1, int arg2, int arg3) {
        field593++;
        byte[] var4 = arg1.method2218((byte) 116, arg3, arg0);
        if (var4 == null) {
            return null;
        } else {
            if (arg2 != -106) {
                field597 = null;
            }
            return new class538(var4);
        }
    }

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "(B)V", line = 277)
    public static void method334(byte arg0) {
        field597 = null;
        int var1 = -46 % ((12 - arg0) / 52);
        field599 = null;
    }

    @OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(II)V", line = 287)
    public class47(int arg0, int arg1) {
        this.field598 = arg0;
        this.field596 = arg1;
    }
}
