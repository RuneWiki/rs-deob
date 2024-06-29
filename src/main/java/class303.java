import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public abstract class class303 extends class583 {

    @OriginalMember(owner = "client!vt", name = "s", descriptor = "Z")
    public volatile boolean field4256 = true;

    @OriginalMember(owner = "client!vt", name = "t", descriptor = "[[Z")
    public static boolean[][] field4257 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!vt", name = "u", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!vt", name = "v", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!vt", name = "q", descriptor = "Z")
    public boolean field4254;

    @OriginalMember(owner = "client!vt", name = "r", descriptor = "Z")
    public boolean field4255;

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "(I)V", line = 10)
    public static void method1981(int arg0) {
        if (arg0 < 7) {
            method1983(-100);
        }
        field4257 = null;
    }

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "(I)V", line = 23)
    public static final void method1982(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field4259++;
        class673.method3679((byte) 113, false);
        if (class210.field2774 >= 0 && class210.field2774 != 0) {
            class759.method4212(false, 0, class210.field2774);
            class210.field2774 = -1;
        }
    }

    @OriginalMember(owner = "client!vt", name = "h", descriptor = "(I)V", line = 48)
    public static final void method1983(int arg0) {
        if (arg0 <= 82) {
            return;
        }
        field4258++;
        if (class101.field1199 < 102) {
            class101.field1199 += 6;
        }
        if (class562.field7886 != -1 && class139.field2011 < class479.method2864((byte) -98)) {
            for (int var1 = class562.field7886; var1 < class720.field9999.length; var1++) {
                if (class720.field9999[var1].startsWith("pause")) {
                    int var2 = 5;
                    try {
                        var2 = Integer.parseInt(class720.field9999[var1].substring(6));
                    } catch (Exception var13) {
                    }
                    class559.method3221("Pausing for " + var2 + " seconds...", (byte) -100);
                    class562.field7886 = var1 + 1;
                    class139.field2011 = class479.method2864((byte) -63) + ((long) (var2 * 1000));
                    return;
                }
                class185.field2500 = class720.field9999[var1];
                class63.method537(false, (byte) 100);
            }
            class562.field7886 = -1;
        }
        if (class677.field9256 != 0) {
            class446.field6324 -= class677.field9256 * 5;
            if (class407.field5766 <= class446.field6324) {
                class446.field6324 = class407.field5766 - 1;
            }
            if (class446.field6324 < 0) {
                class446.field6324 = 0;
            }
            class677.field9256 = 0;
        }
        for (int var3 = 0; var3 < class101.field1206; var3++) {
            class620 var4 = class462.field6504[var3];
            int var5 = var4.method699(123);
            char var6 = var4.method697(4152);
            int var7 = var4.method695(2674);
            if (var5 == 84) {
                class63.method537(false, (byte) 45);
            }
            if (var5 == 80) {
                class63.method537(true, (byte) 62);
            } else if (var5 == 66 && (var7 & 0x4) != 0) {
                if (class595.field8367 != null) {
                    String var8 = "";
                    for (int var9 = class540.field7569.length - 1; var9 >= 0; var9--) {
                        if (class540.field7569[var9] != null && class540.field7569[var9].length() > 0) {
                            var8 = var8 + class540.field7569[var9] + '\n';
                        }
                    }
                    class595.field8367.setContents(new StringSelection(var8), null);
                }
            } else if (var5 == 67 && (var7 & 0x4) != 0) {
                if (class595.field8367 != null) {
                    Transferable var10 = class595.field8367.getContents(null);
                    if (var10 != null) {
                        try {
                            String var11 = (String) var10.getTransferData(DataFlavor.stringFlavor);
                            if (var11 != null) {
                                String[] var12 = class719.method4040(11027, '\n', var11);
                                class251.method1596(-13841, var12);
                            }
                        } catch (Exception var14) {
                        }
                    }
                }
            } else if (var5 == 85 && class115.field1387 > 0) {
                class185.field2500 = class185.field2500.substring(0, class115.field1387 - 1) + class185.field2500.substring(class115.field1387);
                class115.field1387--;
            } else if (var5 == 101 && class115.field1387 < class185.field2500.length()) {
                class185.field2500 = class185.field2500.substring(0, class115.field1387) + class185.field2500.substring(class115.field1387 + 1);
            } else if (var5 == 96 && class115.field1387 > 0) {
                class115.field1387--;
            } else if (var5 == 97 && class115.field1387 < class185.field2500.length()) {
                class115.field1387++;
            } else if (var5 == 102) {
                class115.field1387 = 0;
            } else if (var5 == 103) {
                class115.field1387 = class185.field2500.length();
            } else if (var5 == 104 && class614.field8601 < class540.field7569.length) {
                class614.field8601++;
                class418.method2569(-122);
                class115.field1387 = class185.field2500.length();
            } else if (var5 == 105 && class614.field8601 > 0) {
                class614.field8601--;
                class418.method2569(46);
                class115.field1387 = class185.field2500.length();
            } else if (class506.method2994(var6, -98) || var6 == '\\' || var6 == '/' || var6 == '.' || var6 == ':' || var6 == ',' || var6 == ' ' || var6 == '_' || var6 == '-' || var6 == '+' || var6 == '[' || var6 == ']') {
                class185.field2500 = class185.field2500.substring(0, class115.field1387) + class462.field6504[var3].method697(4152) + class185.field2500.substring(class115.field1387);
                class115.field1387++;
            }
        }
        class721.field10004 = 0;
        class101.field1206 = 0;
        class350.method2257(-101);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)I")
    public abstract int method734(int arg0);

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "(B)[B")
    public abstract byte[] method735(byte arg0);
}
