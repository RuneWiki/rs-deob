import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class169 {

    @OriginalMember(owner = "client!c", name = "e", descriptor = "Lvh;")
    private class328 field2545 = new class328(128);

    @OriginalMember(owner = "client!c", name = "b", descriptor = "Lpj;")
    private class132 field2542;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "Lak;")
    public static class318 field2547;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BI)V")
    public final void method1159(byte arg0, int arg1) {
        field2544++;
        class328 var3 = this.field2545;
        synchronized (this.field2545) {
            this.field2545.method1989(arg1, (byte) 114);
        }
        int var4 = -83 / ((arg0 - 29) / 54);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
    public final void method1160(int arg0) {
        field2546++;
        if (arg0 != -29793) {
            method1161((byte) -77);
        }
        class328 var2 = this.field2545;
        synchronized (this.field2545) {
            this.field2545.method1997(1);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V")
    public static void method1161(byte arg0) {
        if (arg0 >= 79) {
            field2547 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)Lon;")
    public final class305 method1162(int arg0, int arg1) {
        field2551++;
        class328 var3 = this.field2545;
        class305 var4;
        synchronized (this.field2545) {
            var4 = (class305) this.field2545.method1986((byte) -89, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class132 var5 = this.field2542;
        byte[] var6;
        synchronized (this.field2542) {
            var6 = this.field2542.method940(arg0, arg1, arg0 - 1);
        }
        class305 var7 = new class305();
        if (var6 != null) {
            var7.method1877(new class96(var6), 24455);
        }
        class328 var8 = this.field2545;
        synchronized (this.field2545) {
            this.field2545.method1985(var7, (long) arg1, (byte) -102);
            return var7;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(B)V")
    public static final void method1163(byte arg0) {
        if (class477.field6669 < 102) {
            class477.field6669 += 6;
        }
        field2543++;
        if (class355.field5089 != 0) {
            class182.field2680 -= class355.field5089 * 5;
            if (class182.field2680 >= class603.field8372) {
                class182.field2680 = class603.field8372 - 1;
            }
            if (class182.field2680 < 0) {
                class182.field2680 = 0;
            }
            class355.field5089 = 0;
        }
        for (int var1 = 0; var1 < class95.field1255; var1++) {
            class109 var2 = class526.field7216[var1];
            int var3 = var2.method816(arg0 ^ 0x304C);
            char var4 = var2.method817((byte) -100);
            int var5 = var2.method818((byte) -53);
            if (var3 == 84) {
                class43.method243(false, false);
            }
            if (var3 == 80) {
                class43.method243(true, false);
            } else if (var3 == 66 && (var5 & 0x4) != 0) {
                if (class77.field1056 != null) {
                    String var6 = "";
                    for (int var7 = class371.field5278.length - 1; var7 >= 0; var7--) {
                        if (class371.field5278[var7] != null && class371.field5278[var7].length() > 0) {
                            var6 = var6 + class371.field5278[var7] + '\n';
                        }
                    }
                    class77.field1056.setContents(new StringSelection(var6), null);
                }
            } else if (var3 == 67 && (var5 & 0x4) != 0) {
                if (class77.field1056 != null) {
                    Transferable var8 = class77.field1056.getContents(null);
                    if (var8 != null) {
                        try {
                            String var9 = (String) var8.getTransferData(DataFlavor.stringFlavor);
                            if (var9 != null) {
                                String[] var10 = class533.method2945(-19028, var9, '\n');
                                if (var10.length > 1) {
                                    for (int var11 = 0; var11 < var10.length; var11++) {
                                        class591.field8240 = var10[var11];
                                        class43.method243(false, false);
                                    }
                                } else {
                                    class591.field8240 = class591.field8240 + var9;
                                }
                            }
                        } catch (Exception var12) {
                        }
                    }
                }
            } else if (var3 == 85 && class538.field7304 > 0) {
                class591.field8240 = class591.field8240.substring(0, class538.field7304 - 1) + class591.field8240.substring(class538.field7304);
                class538.field7304--;
            } else if (var3 == 101 && class538.field7304 < class591.field8240.length()) {
                class591.field8240 = class591.field8240.substring(0, class538.field7304) + class591.field8240.substring(class538.field7304 + 1);
            } else if (var3 == 96 && class538.field7304 > 0) {
                class538.field7304--;
            } else if (var3 == 97 && class538.field7304 < class591.field8240.length()) {
                class538.field7304++;
            } else if (var3 == 102) {
                class538.field7304 = 0;
            } else if (var3 == 103) {
                class538.field7304 = class591.field8240.length();
            } else if (var3 == 104 && class584.field8138 < class371.field5278.length) {
                class584.field8138++;
                class479.method2721(-106);
                class538.field7304 = class591.field8240.length();
            } else if (var3 == 105 && class584.field8138 > 0) {
                class584.field8138--;
                class479.method2721(arg0 ^ 0xFFFFFF8A);
                class538.field7304 = class591.field8240.length();
            } else if (class625.method3479(arg0 ^ 0xFFFFFFAB, var4) || var4 == ':' || var4 == ',' || var4 == ' ' || var4 == '_' || var4 == '-' || var4 == '+' || var4 == '[' || var4 == ']') {
                class591.field8240 = class591.field8240.substring(0, class538.field7304) + class526.field7216[var1].method817((byte) -100) + class591.field8240.substring(class538.field7304);
                class538.field7304++;
            }
        }
        class438.field6178 = 0;
        class95.field1255 = 0;
        class336.method2026(100);
        if (arg0 != 21) {
            field2549 = 85;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
    public final void method1164(int arg0) {
        if (arg0 != -8249) {
            method1165((byte) 31, -1);
        }
        class328 var2 = this.field2545;
        synchronized (this.field2545) {
            this.field2545.method1987(arg0 - 22836);
        }
        field2541++;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(BI)I")
    public static final int method1165(byte arg0, int arg1) {
        if (arg0 == -49) {
            field2548++;
            return arg1 & 0x7F;
        } else {
            return -30;
        }
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Ldd;ILpj;)V")
    public class169(class647 arg0, int arg1, class132 arg2) {
        this.field2542 = arg2;
        this.field2542.method936(1, -112);
    }
}
