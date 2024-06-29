import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class559 extends class601 {

    @OriginalMember(owner = "client!hk", name = "F", descriptor = "Luw;")
    public static class208 field7101 = new class208(56, 10);

    @OriginalMember(owner = "client!hk", name = "L", descriptor = "Luaa;")
    public static class391 field7107 = null;

    @OriginalMember(owner = "client!hk", name = "G", descriptor = "I")
    public static int field7102;

    @OriginalMember(owner = "client!hk", name = "H", descriptor = "I")
    public static int field7103;

    @OriginalMember(owner = "client!hk", name = "I", descriptor = "I")
    public static int field7104;

    @OriginalMember(owner = "client!hk", name = "K", descriptor = "I")
    public static int field7106;

    @OriginalMember(owner = "client!hk", name = "M", descriptor = "I")
    public static int field7108;

    @OriginalMember(owner = "client!hk", name = "J", descriptor = "Lwm;")
    public static class30 field7105;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "(I)V")
    public static final void method3030(int arg0) {
        if (~class652.field8334 > -103) {
            class652.field8334 += 6;
        }
        ++field7103;
        if (~class545.field6826 != 0 && class502.method2786(-7114) > class675.field8735) {
            for (int var1 = class545.field6826; var1 < class549.field6891.length; ++var1) {
                if (class549.field6891[var1].startsWith("pause")) {
                    int var2 = 5;
                    try {
                        var2 = Integer.parseInt(class549.field6891[var1].substring(6));
                    } catch (Exception var14) {
                    }
                    class789.method4318("Pausing for " + var2 + " seconds...", false);
                    class545.field6826 = var1 + 1;
                    class675.field8735 = class502.method2786(-7114) - -((long) (var2 * 1000));
                    return;
                }
                class656.field8466 = class549.field6891[var1];
                class636.method3432(false, true);
            }
            class545.field6826 = -1;
        }
        if (class479.field6200 != 0) {
            class435.field5714 -= class479.field6200 * 5;
            if (~class184.field2591 >= ~class435.field5714) {
                class435.field5714 = class184.field2591 - 1;
            }
            if (~class435.field5714 > -1) {
                class435.field5714 = 0;
            }
            class479.field6200 = 0;
        }
        for (int var3 = 0; ~class86.field1199 < ~var3; ++var3) {
            class637 var4 = class278.field3615[var3];
            int var5 = var4.method371(false);
            char var6 = var4.method375(3206);
            int var7 = var4.method370((byte) 65);
            if (~var5 == -85) {
                class636.method3432(false, true);
            }
            if (var5 == 80) {
                class636.method3432(true, true);
            } else if (var5 == 66 && ~(4 & var7) != -1) {
                if (class423.field5566 != null) {
                    String var11 = "";
                    for (int var12 = class210.field2891.length + -1; var12 >= 0; --var12) {
                        if (class210.field2891[var12] != null && ~class210.field2891[var12].length() < -1) {
                            var11 = var11 + class210.field2891[var12] + '\n';
                        }
                    }
                    class423.field5566.setContents(new StringSelection(var11), (ClipboardOwner) null);
                }
            } else if (var5 == 67 && (var7 & 4) != 0) {
                if (class423.field5566 != null) {
                    Transferable var8 = class423.field5566.getContents((Object) null);
                    if (var8 != null) {
                        try {
                            String var9 = (String) var8.getTransferData(DataFlavor.stringFlavor);
                            if (var9 != null) {
                                String[] var10 = class340.method1966(1, '\n', var9);
                                class627.method3351(-603633050, var10);
                            }
                        } catch (Exception var15) {
                        }
                    }
                }
            } else if (var5 == 85 && class749.field10220 > 0) {
                class656.field8466 = class656.field8466.substring(0, class749.field10220 + -1) + class656.field8466.substring(class749.field10220);
                --class749.field10220;
            } else if (var5 == 101 && ~class749.field10220 > ~class656.field8466.length()) {
                class656.field8466 = class656.field8466.substring(0, class749.field10220) + class656.field8466.substring(class749.field10220 + 1);
            } else if (~var5 == -97 && class749.field10220 > 0) {
                --class749.field10220;
            } else if (var5 == 97 && ~class749.field10220 > ~class656.field8466.length()) {
                ++class749.field10220;
            } else if (~var5 == -103) {
                class749.field10220 = 0;
            } else if (~var5 != -104) {
                if (~var5 == -105 && ~class510.field6513 > ~class210.field2891.length) {
                    ++class510.field6513;
                    class47.method290((byte) 121);
                    class749.field10220 = class656.field8466.length();
                } else if (var5 == 105 && class510.field6513 > 0) {
                    --class510.field6513;
                    class47.method290((byte) 117);
                    class749.field10220 = class656.field8466.length();
                } else if (class638.method3449(var6, -91) || ~var6 == -93 || ~var6 == -48 || ~var6 == -47 || var6 == ':' || var6 == ',' || ~var6 == -33 || var6 == '_' || var6 == '-' || var6 == '+' || var6 == '[' || var6 == ']') {
                    class656.field8466 = class656.field8466.substring(0, class749.field10220) + class278.field3615[var3].method375(3206) + class656.field8466.substring(class749.field10220);
                    ++class749.field10220;
                }
            } else {
                class749.field10220 = class656.field8466.length();
            }
        }
        int var13 = 80 % ((12 - arg0) / 50);
        class86.field1199 = 0;
        class470.field6129 = 0;
        class135.method783(0);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZ)Z")
    public static final boolean method3031(int arg0, boolean arg1) {
        if (arg1) {
            return true;
        } else {
            ++field7104;
            return arg0 == 7 || arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)[I")
    public final int[] method261(int arg0, byte arg1) {
        if (arg1 > -76) {
            field7106 = -47;
        }
        ++field7108;
        int[] var3 = super.field7643.method2054(arg0, 9986);
        if (super.field7643.field4364) {
            class642.method3478(var3, 0, class418.field5518, class427.field5623[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(B)V")
    public static void method3032(byte arg0) {
        int var1 = -11 / ((arg0 - 4) / 62);
        field7107 = null;
        field7105 = null;
        field7101 = null;
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V")
    public class559() {
        super(0, true);
    }
}
