import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class328 extends class372 {

    @OriginalMember(owner = "client!ss", name = "m", descriptor = "Ljava/net/Socket;")
    private Socket field4964;

    @OriginalMember(owner = "client!ss", name = "j", descriptor = "Lti;")
    private class240 field4961;

    @OriginalMember(owner = "client!ss", name = "p", descriptor = "Lev;")
    private class452 field4967;

    @OriginalMember(owner = "client!ss", name = "h", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!ss", name = "i", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!ss", name = "k", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!ss", name = "l", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!ss", name = "o", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!ss", name = "q", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!ss", name = "r", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!ss", name = "s", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!ss", name = "g", descriptor = "Lo;")
    public static class363 field4958;

    @OriginalMember(owner = "client!ss", name = "n", descriptor = "Lnv;")
    public static class44 field4965;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I[BII)I")
    public final int method2152(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field4962++;
        return arg2 >= -47 ? -30 : this.field4961.method1616(-115, arg3, arg1, arg0);
    }

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "(I)Z")
    public static final boolean method2153(int arg0) {
        field4970++;
        if (arg0 > -84) {
            field4965 = null;
        }
        return class195.field3060;
    }

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "(I)V")
    public static void method2154(int arg0) {
        field4965 = null;
        field4958 = null;
        if (arg0 != -98) {
            method2154(-82);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Z)V")
    public final void method2155(boolean arg0) {
        try {
            this.field4964.close();
        } catch (IOException var2) {
        }
        if (!arg0) {
            field4966++;
            this.field4961.method1617((byte) 97);
            this.field4967.method2773(-118);
        }
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(I)V")
    public final void method2156(int arg0) {
        field4969++;
        if (arg0 != -14524) {
            field4965 = null;
        }
        this.field4961.method1618(4);
        this.field4967.method2770(true);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(B)V")
    public static final void method2157(byte arg0) {
        if (class314.field4788 != 0) {
            class193.field2966 -= class314.field4788 * 5;
            if (class193.field2966 >= class182.field2784) {
                class193.field2966 = class182.field2784 - 1;
            }
            class314.field4788 = 0;
            if (class193.field2966 < 0) {
                class193.field2966 = 0;
            }
        }
        if (arg0 < 30) {
            method2154(121);
        }
        field4960++;
        if (class71.field1130 < 102) {
            class71.field1130 += 6;
        }
        for (int var1 = 0; var1 < class49.field764; var1++) {
            class214 var2 = class426.field6346[var1];
            int var3 = var2.method1472(false);
            char var4 = var2.method1470(-128);
            int var5 = var2.method1468(-103);
            if (var3 == 84) {
                class452.method2768(-1126, false);
            }
            if (var3 == 80) {
                class452.method2768(-1126, true);
            } else if (var3 == 66 && (var5 & 0x4) != 0) {
                if (class480.field7051 != null) {
                    String var10 = "";
                    for (int var11 = class86.field1415.length - 1; var11 >= 0; var11--) {
                        if (class86.field1415[var11] != null && class86.field1415[var11].length() > 0) {
                            var10 = var10 + class86.field1415[var11] + '\n';
                        }
                    }
                    class480.field7051.setContents(new StringSelection(var10), null);
                }
            } else if (var3 == 67 && (var5 & 0x4) != 0) {
                if (class480.field7051 != null) {
                    Transferable var6 = class480.field7051.getContents(null);
                    if (var6 != null) {
                        try {
                            String var7 = (String) var6.getTransferData(DataFlavor.stringFlavor);
                            if (var7 != null) {
                                String[] var8 = class454.method2784('\n', 1, var7);
                                if (var8.length > 1) {
                                    for (int var9 = 0; var9 < var8.length; var9++) {
                                        class406.field6002 = var8[var9];
                                        class452.method2768(-1126, false);
                                    }
                                } else {
                                    class406.field6002 = class406.field6002 + var7;
                                }
                            }
                        } catch (Exception var12) {
                        }
                    }
                }
            } else if (var3 == 85 && class489.field7141 > 0) {
                class406.field6002 = class406.field6002.substring(0, class489.field7141 - 1) + class406.field6002.substring(class489.field7141);
                class489.field7141--;
            } else if (var3 == 101 && class489.field7141 < class406.field6002.length()) {
                class406.field6002 = class406.field6002.substring(0, class489.field7141) + class406.field6002.substring(class489.field7141 + 1);
            } else if (var3 == 96 && class489.field7141 > 0) {
                class489.field7141--;
            } else if (var3 == 97 && class489.field7141 < class406.field6002.length()) {
                class489.field7141++;
            } else if (var3 == 102) {
                class489.field7141 = 0;
            } else if (var3 == 103) {
                class489.field7141 = class406.field6002.length();
            } else if (var3 == 104 && class86.field1415.length > class517.field7509) {
                class517.field7509++;
                class495.method2965((byte) -105);
                class489.field7141 = class406.field6002.length();
            } else if (var3 == 105 && class517.field7509 > 0) {
                class517.field7509--;
                class495.method2965((byte) -105);
                class489.field7141 = class406.field6002.length();
            } else if (class435.method2701(var4, -128) || var4 == ':' || var4 == ',' || var4 == ' ' || var4 == '_' || var4 == '-' || var4 == '+' || var4 == '[' || var4 == ']') {
                class406.field6002 = class406.field6002.substring(0, class489.field7141) + class426.field6346[var1].method1470(-128) + class406.field6002.substring(class489.field7141);
                class489.field7141++;
            }
        }
        class49.field764 = 0;
        class80.method713(-14703);
    }

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
    public class328(Socket arg0, int arg1) throws IOException {
        this.field4964 = arg0;
        this.field4964.setSoTimeout(30000);
        this.field4964.setTcpNoDelay(true);
        this.field4961 = new class240(this.field4964.getInputStream(), arg1);
        this.field4967 = new class452(this.field4964.getOutputStream(), arg1);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)Z")
    public final boolean method2158(int arg0, int arg1) throws IOException {
        if (arg1 > -118) {
            return true;
        } else {
            field4959++;
            return this.field4961.method1614(arg0, false);
        }
    }

    @OriginalMember(owner = "client!ss", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method2155(false);
        field4968++;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(III[B)V")
    public final void method2159(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        this.field4967.method2771(arg1, arg0 ^ 0x3D0D, arg3, arg2);
        field4963++;
        if (arg0 != -15728) {
            this.method2156(-118);
        }
    }
}
