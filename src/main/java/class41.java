import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class41 {

    @OriginalMember(owner = "client!vba", name = "j", descriptor = "Leia;")
    private class243 field453 = new class243();

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "Ljava/lang/String;")
    public String field446;

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "I")
    public static int field445 = 0;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!vba", name = "d", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!vba", name = "e", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!vba", name = "f", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!vba", name = "g", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!vba", name = "h", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!vba", name = "i", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!vba", name = "k", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!vba", name = "l", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!vba", name = "n", descriptor = "I")
    private volatile int field457;

    @OriginalMember(owner = "client!vba", name = "m", descriptor = "Ltw;")
    private class203 field456;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(Lvs;B)V", line = 4)
    public final void method288(class593 arg0, byte arg1) {
        arg0.field8430 = false;
        field452++;
        if (arg1 != 23) {
            this.field457 = -98;
        }
        class243 var3 = this.field453;
        synchronized (this.field453) {
            this.field453.method1616(22437, arg0);
            this.field457++;
        }
        if (this.field456 != null) {
            class203 var4 = this.field456;
            synchronized (this.field456) {
                this.field456.notify();
            }
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(B)Lgda;", line = 27)
    public final class55 method289(byte arg0) {
        if (arg0 <= 78) {
            return null;
        }
        field454++;
        Object var2 = null;
        class243 var3 = this.field453;
        synchronized (this.field453) {
            class55 var4 = this.field453.method1615((byte) 57);
            var4.method385((byte) -41);
            this.field457--;
            return var4;
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)V", line = 48)
    public static final void method290(int arg0) {
        if (class73.field1023 < 102) {
            class73.field1023 += 6;
        }
        field449++;
        if (class673.field9389 != -1 && class93.field1342 < class524.method3075(18)) {
            for (int var1 = class673.field9389; var1 < class371.field5325.length; var1++) {
                if (class371.field5325[var1].startsWith("pause")) {
                    int var2 = 5;
                    try {
                        var2 = Integer.parseInt(class371.field5325[var1].substring(6));
                    } catch (Exception var13) {
                    }
                    class533.method3136(124, "Pausing for " + var2 + " seconds...");
                    class673.field9389 = var1 + 1;
                    class93.field1342 = (long) (var2 * 1000) + class524.method3075(18);
                    return;
                }
                class241.field3505 = class371.field5325[var1];
                class686.method3909(86, false);
            }
            class673.field9389 = -1;
        }
        if (arg0 >= -110) {
            return;
        }
        if (class671.field9360 != 0) {
            class692.field9564 -= class671.field9360 * 5;
            if (class736.field10318 <= class692.field9564) {
                class692.field9564 = class736.field10318 - 1;
            }
            class671.field9360 = 0;
            if (class692.field9564 < 0) {
                class692.field9564 = 0;
            }
        }
        for (int var3 = 0; var3 < class730.field10232; var3++) {
            class204 var4 = class516.field7374[var3];
            int var5 = var4.method711(10196);
            char var6 = var4.method712((byte) -92);
            int var7 = var4.method715(-1119);
            if (var5 == 84) {
                class686.method3909(44, false);
            }
            if (var5 == 80) {
                class686.method3909(106, true);
            } else if (var5 == 66 && (var7 & 0x4) != 0) {
                if (class365.field5271 != null) {
                    String var11 = "";
                    for (int var12 = class146.field1946.length - 1; var12 >= 0; var12--) {
                        if (class146.field1946[var12] != null && class146.field1946[var12].length() > 0) {
                            var11 = var11 + class146.field1946[var12] + '\n';
                        }
                    }
                    class365.field5271.setContents(new StringSelection(var11), null);
                }
            } else if (var5 == 67 && (var7 & 0x4) != 0) {
                if (class365.field5271 != null) {
                    Transferable var8 = class365.field5271.getContents(null);
                    if (var8 != null) {
                        try {
                            String var9 = (String) var8.getTransferData(DataFlavor.stringFlavor);
                            if (var9 != null) {
                                String[] var10 = class258.method1684(3270, var9, '\n');
                                class391.method2508(false, var10);
                            }
                        } catch (Exception var14) {
                        }
                    }
                }
            } else if (var5 == 85 && class37.field379 > 0) {
                class241.field3505 = class241.field3505.substring(0, class37.field379 - 1) + class241.field3505.substring(class37.field379);
                class37.field379--;
            } else if (var5 == 101 && class37.field379 < class241.field3505.length()) {
                class241.field3505 = class241.field3505.substring(0, class37.field379) + class241.field3505.substring(class37.field379 + 1);
            } else if (var5 == 96 && class37.field379 > 0) {
                class37.field379--;
            } else if (var5 == 97 && class37.field379 < class241.field3505.length()) {
                class37.field379++;
            } else if (var5 == 102) {
                class37.field379 = 0;
            } else if (var5 == 103) {
                class37.field379 = class241.field3505.length();
            } else if (var5 == 104 && class146.field1946.length > class753.field10517) {
                class753.field10517++;
                class458.method2798(-1);
                class37.field379 = class241.field3505.length();
            } else if (var5 == 105 && class753.field10517 > 0) {
                class753.field10517--;
                class458.method2798(-1);
                class37.field379 = class241.field3505.length();
            } else if (class571.method3307(var6, 90) || var6 == '\\' || var6 == '/' || var6 == '.' || var6 == ':' || var6 == ',' || var6 == ' ' || var6 == '_' || var6 == '-' || var6 == '+' || var6 == '[' || var6 == ']') {
                class241.field3505 = class241.field3505.substring(0, class37.field379) + class516.field7374[var3].method712((byte) -92) + class241.field3505.substring(class37.field379);
                class37.field379++;
            }
        }
        class748.field10462 = 0;
        class730.field10232 = 0;
        class459.method2805(81);
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(BLqda;)V", line = 247)
    public final void method291(byte arg0, class105 arg1) {
        field448++;
        class243 var3 = this.field453;
        synchronized (this.field453) {
            this.field453.method1616(22437, arg1);
            this.field457++;
            if (arg0 != 122) {
                this.method288(null, (byte) 19);
            }
        }
        if (this.field456 != null) {
            class203 var4 = this.field456;
            synchronized (this.field456) {
                this.field456.notify();
            }
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(Ltw;I)V", line = 269)
    public final void method292(class203 arg0, int arg1) {
        if (arg1 != -1) {
            this.method292(null, -109);
        }
        this.field456 = arg0;
        field455++;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(III)Z", line = 282)
    public static final boolean method293(int arg0, int arg1, int arg2) {
        field450++;
        if (arg2 != -19909) {
            field445 = -67;
        }
        return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
    }

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "(I)Z", line = 297)
    public final boolean method294(int arg0) {
        field444++;
        int var2 = 10 / ((20 - arg0) / 54);
        return this.field457 == 0;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIII)V", line = 307)
    public static final void method295(int arg0, int arg1, int arg2, int arg3) {
        field447++;
        int var4 = class361.field5224 + arg1;
        int var5 = class582.field8288 + arg2;
        if (class80.field1136 == null || arg1 < 0 || arg2 < 0 || arg1 >= class194.field2946 || arg2 >= class255.field3656 || class63.field916.field10204.method368(arg3 + 17503) == 0 && class130.field1749.field8429 != arg0) {
            return;
        }
        long var6 = (long) (arg0 << 28 | var5 << 14 | var4);
        class258 var8 = (class258) class12.field173.method2287(var6, (byte) -117);
        if (var8 == null) {
            class442.method2747(arg0, arg1, arg2);
            return;
        }
        class661 var9 = (class661) var8.field3693.method1195(arg3);
        if (var9 == null) {
            class442.method2747(arg0, arg1, arg2);
            return;
        }
        class618 var10 = (class618) class442.method2747(arg0, arg1, arg2);
        if (var10 == null) {
            var10 = new class618(arg1 << 9, class582.field8287[arg0].method1787(arg1, 19646, arg2), arg2 << 9, arg0, arg0);
        } else {
            var10.field8695 = var10.field8685 = -1;
        }
        var10.field8687 = var9.field9243;
        var10.field8694 = var9.field9240;
        label57: while (true) {
            class661 var11 = (class661) var8.field3693.method1201(2);
            if (var11 == null) {
                break;
            }
            if (var10.field8687 != var11.field9243) {
                var10.field8695 = var11.field9243;
                var10.field8680 = var11.field9240;
                while (true) {
                    class661 var12 = (class661) var8.field3693.method1201(2);
                    if (var12 == null) {
                        break label57;
                    }
                    if (var10.field8687 != var12.field9243 && var10.field8695 != var12.field9243) {
                        var10.field8685 = var12.field9243;
                        var10.field8693 = var12.field9240;
                    }
                }
            }
        }
        int var13 = class384.method2468(true, (arg1 << 9) + 256, arg0, (arg2 << 9) + 256);
        var10.field8421 = var13;
        var10.field8423 = arg1 << 9;
        var10.field8428 = arg2 << 9;
        var10.field8429 = (byte) arg0;
        var10.field8686 = 0;
        var10.field8417 = (byte) arg0;
        if (class286.method1827(arg1, arg2, (byte) -72)) {
            var10.field8417++;
        }
        class220.method1479(arg0, arg1, arg2, var13, var10);
    }

    @OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 430)
    public class41(String arg0) {
        this.field446 = arg0;
    }

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "(Lvs;B)V", line = 407)
    public final void method296(class593 arg0, byte arg1) {
        field451++;
        arg0.field8430 = true;
        int var3 = -36 / ((-arg1 - 59) / 39);
        class243 var4 = this.field453;
        synchronized (this.field453) {
            this.field453.method1616(22437, arg0);
            this.field457++;
        }
        if (this.field456 != null) {
            class203 var5 = this.field456;
            synchronized (this.field456) {
                this.field456.notify();
            }
        }
    }
}
