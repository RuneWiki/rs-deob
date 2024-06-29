import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class150 {

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "Ldk;")
    public static class326 field2242 = new class326("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public int field2236;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public int field2237;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public int field2240;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public int field2241;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public static void method944(int arg0) {
        if (arg0 == 22842) {
            field2242 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BII)I")
    public static final int method945(byte arg0, int arg1, int arg2) {
        if (arg0 == -37) {
            field2239++;
            return arg2 == 4 || arg2 == 5 ? class58.field774[arg1 & 0x3] : 256;
        } else {
            return 32;
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V")
    public static final void method946(int arg0) {
        if (arg0 < 14) {
            return;
        }
        field2238++;
        if (class166.field2437 != 0) {
            class411.field5764 -= class166.field2437 * 5;
            if (class411.field5764 >= class377.field5435) {
                class411.field5764 = class377.field5435 - 1;
            }
            if (class411.field5764 < 0) {
                class411.field5764 = 0;
            }
            class166.field2437 = 0;
        }
        if (class248.field3673 < 102) {
            class248.field3673 += 6;
        }
        for (int var1 = 0; var1 < class370.field5340; var1++) {
            int var2 = class153.field2265[var1].method368((byte) -128);
            char var3 = class153.field2265[var1].method367((byte) 113);
            if (var2 == 84) {
                class140.method886(0);
            } else if (class272.field3959.method2712(2, 82) && var2 == 66) {
                if (class27.field366 != null) {
                    String var8 = "";
                    for (int var9 = class118.field1487.length - 1; var9 >= 0; var9--) {
                        if (class118.field1487[var9] != null && class118.field1487[var9].length() > 0) {
                            var8 = var8 + class118.field1487[var9] + '\n';
                        }
                    }
                    class27.field366.setContents(new StringSelection(var8), (ClipboardOwner) null);
                }
            } else if (class272.field3959.method2712(2, 82) && var2 == 67) {
                if (class27.field366 != null) {
                    Transferable var4 = class27.field366.getContents((Object) null);
                    if (var4 != null) {
                        try {
                            String var5 = (String) var4.getTransferData(DataFlavor.stringFlavor);
                            if (var5 != null) {
                                String[] var6 = class193.method1192('\n', 0, var5);
                                if (var6.length > 1) {
                                    for (int var7 = 0; var7 < var6.length; var7++) {
                                        class224.field3399 = var6[var7];
                                        class140.method886(0);
                                    }
                                } else {
                                    class224.field3399 = class224.field3399 + var5;
                                }
                            }
                        } catch (Exception var11) {
                        }
                    }
                }
            } else if (var2 == 85 && class136.field1806 > 0) {
                class224.field3399 = class224.field3399.substring(0, class136.field1806 - 1) + class224.field3399.substring(class136.field1806);
                class136.field1806--;
            } else if (var2 == 101 && class136.field1806 < class224.field3399.length()) {
                class224.field3399 = class224.field3399.substring(0, class136.field1806) + class224.field3399.substring(class136.field1806 + 1);
            } else if (var2 == 96 && class136.field1806 > 0) {
                class136.field1806--;
            } else if (var2 == 97 && class136.field1806 < class224.field3399.length()) {
                class136.field1806++;
            } else if (var2 == 102) {
                class136.field1806 = 0;
            } else if (var2 == 103) {
                class136.field1806 = class224.field3399.length();
            } else if (var2 == 104 && class118.field1487.length > class293.field4256) {
                class293.field4256++;
                class11.method45((byte) 111);
                class136.field1806 = class224.field3399.length();
            } else if (var2 == 105 && class293.field4256 > 0) {
                class293.field4256--;
                class11.method45((byte) 111);
                class136.field1806 = class224.field3399.length();
            } else if (class410.method2426(48, var3) || var3 == ':' || var3 == ',' || var3 == ' ' || var3 == '_' || var3 == '-' || var3 == '+' || var3 == '[' || var3 == ']') {
                class224.field3399 = class224.field3399.substring(0, class136.field1806) + class153.field2265[var1].method367((byte) 119) + class224.field3399.substring(class136.field1806);
                class136.field1806++;
            }
        }
        class370.field5340 = 0;
        for (int var10 = 0; var10 < 100; var10++) {
            class184.field2715[var10] += class255.field3740[var10];
            if ((class184.field2715[var10] >> 4) >= 350) {
                class95.field1228[var10] = (int) ((double) class144.field1900 * Math.random()) << 4;
                class184.field2715[var10] = 0;
                class23.field309[var10] = (int) (Math.random() * 102.0D) + 51;
                class255.field3740[var10] = (int) (Math.random() * 48.0D) + 8;
            }
        }
        class453.method2661((byte) 127);
    }
}
