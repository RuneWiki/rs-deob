import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public class class186 {

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!qga", name = "c", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(B[BIIII)V")
    public static final void method1046(byte arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        field2258++;
        if (arg5 >= arg3) {
            return;
        }
        int var6 = arg4 + arg5;
        int var7 = arg3 - arg5 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg3 - arg5 & 0x3;
                if (arg0 != -104) {
                    method1046((byte) -13, null, -55, -86, -52, 78);
                }
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg1[var6++] = 1;
                }
            }
            arg1[var6++] = 1;
            arg1[var6++] = 1;
            arg1[var6++] = 1;
            arg1[var6++] = 1;
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "([BIILjava/io/File;)V")
    public static final void method1047(byte[] arg0, int arg1, int arg2, File arg3) throws IOException {
        field2257++;
        if (arg1 < 122) {
            method1048(72);
        }
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg3)));
        try {
            var4.readFully(arg0, 0, arg2);
        } catch (EOFException var5) {
        }
        var4.close();
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)V")
    public static final void method1048(int arg0) {
        if (class586.field8201 < 102) {
            class586.field8201 += 6;
        }
        field2259++;
        if (class239.field3132 != -1 && class538.method2963(-47) > class304.field4128) {
            for (int var1 = class239.field3132; var1 < class690.field9663.length; var1++) {
                if (class690.field9663[var1].startsWith("pause")) {
                    int var2 = 5;
                    try {
                        var2 = Integer.parseInt(class690.field9663[var1].substring(6));
                    } catch (Exception var13) {
                    }
                    class392.method2288("Pausing for " + var2 + " seconds...", -109);
                    class239.field3132 = var1 + 1;
                    class304.field4128 = class538.method2963(arg0 - 151) + (long) (var2 * 1000);
                    return;
                }
                class704.field9878 = class690.field9663[var1];
                class46.method277(false, false);
            }
            class239.field3132 = -1;
        }
        if (class619.field8673 != 0) {
            class52.field549 -= class619.field8673 * 5;
            if (class52.field549 >= class543.field7690) {
                class52.field549 = class543.field7690 - 1;
            }
            if (class52.field549 < 0) {
                class52.field549 = 0;
            }
            class619.field8673 = 0;
        }
        int var3 = 0;
        if (arg0 != 104) {
            return;
        }
        while (var3 < class28.field210) {
            class326 var4 = class537.field7303[var3];
            int var5 = var4.method253(true);
            char var6 = var4.method258(13313);
            int var7 = var4.method257((byte) 82);
            if (var5 == 84) {
                class46.method277(false, false);
            }
            if (var5 == 80) {
                class46.method277(true, false);
            } else if (var5 == 66 && (var7 & 0x4) != 0) {
                if (class600.field8359 != null) {
                    String var11 = "";
                    for (int var12 = class73.field784.length - 1; var12 >= 0; var12--) {
                        if (class73.field784[var12] != null && class73.field784[var12].length() > 0) {
                            var11 = var11 + class73.field784[var12] + '\n';
                        }
                    }
                    class600.field8359.setContents(new StringSelection(var11), null);
                }
            } else if (var5 == 67 && (var7 & 0x4) != 0) {
                if (class600.field8359 != null) {
                    Transferable var8 = class600.field8359.getContents(null);
                    if (var8 != null) {
                        try {
                            String var9 = (String) var8.getTransferData(DataFlavor.stringFlavor);
                            if (var9 != null) {
                                String[] var10 = class490.method2753(var9, '\n', false);
                                class726.method4074((byte) 120, var10);
                            }
                        } catch (Exception var14) {
                        }
                    }
                }
            } else if (var5 == 85 && class304.field4125 > 0) {
                class704.field9878 = class704.field9878.substring(0, class304.field4125 - 1) + class704.field9878.substring(class304.field4125);
                class304.field4125--;
            } else if (var5 == 101 && class304.field4125 < class704.field9878.length()) {
                class704.field9878 = class704.field9878.substring(0, class304.field4125) + class704.field9878.substring(class304.field4125 + 1);
            } else if (var5 == 96 && class304.field4125 > 0) {
                class304.field4125--;
            } else if (var5 == 97 && class304.field4125 < class704.field9878.length()) {
                class304.field4125++;
            } else if (var5 == 102) {
                class304.field4125 = 0;
            } else if (var5 == 103) {
                class304.field4125 = class704.field9878.length();
            } else if (var5 == 104 && class716.field9976 < class73.field784.length) {
                class716.field9976++;
                class325.method1939((byte) 127);
                class304.field4125 = class704.field9878.length();
            } else if (var5 == 105 && class716.field9976 > 0) {
                class716.field9976--;
                class325.method1939((byte) 123);
                class304.field4125 = class704.field9878.length();
            } else if (class175.method1001(var6, arg0 ^ 0x4) || var6 == '\' || var6 == '/' || var6 == '.' || var6 == ':' || var6 == ',' || var6 == ' ' || var6 == '_' || var6 == '-' || var6 == '+' || var6 == '[' || var6 == ']') {
                class704.field9878 = class704.field9878.substring(0, class304.field4125) + class537.field7303[var3].method258(13313) + class704.field9878.substring(class304.field4125);
                class304.field4125++;
            }
            var3++;
        }
        class77.field948 = 0;
        class28.field210 = 0;
        class340.method2004(2);
    }
}
