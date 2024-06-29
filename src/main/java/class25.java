import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public abstract class class25 extends class152 {

    @OriginalMember(owner = "client!an", name = "x", descriptor = "Z")
    public volatile boolean field374 = true;

    @OriginalMember(owner = "client!an", name = "w", descriptor = "I")
    public static int field373 = 0;

    @OriginalMember(owner = "client!an", name = "v", descriptor = "I")
    public static int field372 = 0;

    @OriginalMember(owner = "client!an", name = "z", descriptor = "Ljava/lang/String;")
    public static String field376 = null;

    @OriginalMember(owner = "client!an", name = "A", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!an", name = "C", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!an", name = "D", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!an", name = "y", descriptor = "Z")
    public boolean field375;

    @OriginalMember(owner = "client!an", name = "B", descriptor = "Z")
    public boolean field378;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "(I)V", line = 8)
    public static final void method251(int arg0) {
        field377++;
        if (class491.field6850 < 102) {
            class491.field6850 += 6;
        }
        if (class202.field2427 != -1 && class349.method2069(true) > class385.field4947) {
            for (int var1 = class202.field2427; var1 < class478.field6628.length; var1++) {
                if (class478.field6628[var1].startsWith("pause")) {
                    int var2 = 5;
                    try {
                        var2 = Integer.parseInt(class478.field6628[var1].substring(6));
                    } catch (Exception var13) {
                    }
                    class793.method4374(0, "Pausing for " + var2 + " seconds...");
                    class202.field2427 = var1 + 1;
                    class385.field4947 = (long) (var2 * 1000) + class349.method2069(true);
                    return;
                }
                class569.field7802 = class478.field6628[var1];
                class752.method4202(false, (byte) 104);
            }
            class202.field2427 = -1;
        }
        if (~class662.field9092 != arg0) {
            class531.field7487 -= class662.field9092 * 5;
            if (class259.field3066 <= class531.field7487) {
                class531.field7487 = class259.field3066 - 1;
            }
            if (class531.field7487 < 0) {
                class531.field7487 = 0;
            }
            class662.field9092 = 0;
        }
        for (int var3 = 0; var3 < class437.field5757; var3++) {
            class732 var4 = class542.field7608[var3];
            int var5 = var4.method1451(-43);
            char var6 = var4.method1453(arg0 ^ 0xFFFFF94D);
            int var7 = var4.method1458((byte) -103);
            if (var5 == 84) {
                class752.method4202(false, (byte) 115);
            }
            if (var5 == 80) {
                class752.method4202(true, (byte) 113);
            } else if (var5 == 66 && (var7 & 0x4) != 0) {
                if (class215.field2536 != null) {
                    String var11 = "";
                    for (int var12 = class75.field1041.length - 1; var12 >= 0; var12--) {
                        if (class75.field1041[var12] != null && class75.field1041[var12].length() > 0) {
                            var11 = var11 + class75.field1041[var12] + '\n';
                        }
                    }
                    class215.field2536.setContents(new StringSelection(var11), null);
                }
            } else if (var5 == 67 && (var7 & 0x4) != 0) {
                if (class215.field2536 != null) {
                    Transferable var8 = class215.field2536.getContents(null);
                    if (var8 != null) {
                        try {
                            String var9 = (String) var8.getTransferData(DataFlavor.stringFlavor);
                            if (var9 != null) {
                                String[] var10 = class708.method4017('\n', (byte) 32, var9);
                                class716.method4050(0, var10);
                            }
                        } catch (Exception var14) {
                        }
                    }
                }
            } else if (var5 == 85 && class163.field1993 > 0) {
                class569.field7802 = class569.field7802.substring(0, class163.field1993 - 1) + class569.field7802.substring(class163.field1993);
                class163.field1993--;
            } else if (var5 == 101 && class163.field1993 < class569.field7802.length()) {
                class569.field7802 = class569.field7802.substring(0, class163.field1993) + class569.field7802.substring(class163.field1993 + 1);
            } else if (var5 == 96 && class163.field1993 > 0) {
                class163.field1993--;
            } else if (var5 == 97 && class163.field1993 < class569.field7802.length()) {
                class163.field1993++;
            } else if (var5 == 102) {
                class163.field1993 = 0;
            } else if (var5 == 103) {
                class163.field1993 = class569.field7802.length();
            } else if (var5 == 104 && class75.field1041.length > class73.field1012) {
                class73.field1012++;
                class603.method3439((byte) 68);
                class163.field1993 = class569.field7802.length();
            } else if (var5 == 105 && class73.field1012 > 0) {
                class73.field1012--;
                class603.method3439((byte) -125);
                class163.field1993 = class569.field7802.length();
            } else if (class729.method4119(arg0 + 128, var6) || "\\/.:, _-+[]~@".indexOf(var6) != -1) {
                class569.field7802 = class569.field7802.substring(0, class163.field1993) + class542.field7608[var3].method1453(1714) + class569.field7802.substring(class163.field1993);
                class163.field1993++;
            }
        }
        class437.field5757 = 0;
        class535.field7538 = 0;
        class41.method341(-117);
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(B)V", line = 204)
    public static void method252(byte arg0) {
        if (arg0 < 126) {
            field376 = null;
        }
        field376 = null;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ZIII)I", line = 218)
    public static final int method254(boolean arg0, int arg1, int arg2, int arg3) {
        field380++;
        class430 var4 = class105.method861(arg3, Integer.MIN_VALUE, arg0);
        int var5 = -107 / ((arg2 + 22) / 53);
        if (var4 == null) {
            return -1;
        } else if (arg1 >= 0 && var4.field5670.length > arg1) {
            return var4.field5670[arg1];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)[B")
    public abstract byte[] method250(int arg0);

    @OriginalMember(owner = "client!an", name = "g", descriptor = "(I)I")
    public abstract int method253(int arg0);
}
