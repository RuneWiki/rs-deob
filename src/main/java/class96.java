import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class96 extends OutputStream {

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1514 = "Choose Option";

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "Ldb;")
    public static class17 field1519 = new class17(64);

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "[Ljj;")
    public static class107[] field1521 = new class107[2048];

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public static int field1522 = 0;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZLpf;)V")
    public static final void method619(boolean arg0, class294 arg1) {
        field1520++;
        if (!arg0) {
            method620(124);
        }
        class30.field438 = arg1;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
    public static void method620(int arg0) {
        field1514 = null;
        field1521 = null;
        if (arg0 != 31817) {
            field1521 = null;
        }
        field1519 = null;
    }

    @OriginalMember(owner = "client!sf", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field1516++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method621(String arg0, int arg1) {
        if (arg1 != -21983) {
            method624(-120, (String) null);
        }
        System.out.println("Error: " + class197.method1236("%0a", (byte) 84, arg0, "\n"));
        field1517++;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILjava/lang/String;C)[Ljava/lang/String;")
    public static final String[] method622(int arg0, String arg1, char arg2) {
        field1518++;
        int var3 = class167.method1044(arg2, (byte) 92, arg1);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = arg0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg1.charAt(var8) != arg2; var8++) {
            }
            var4[var5++] = arg1.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg1.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIB[B)Z")
    public static final boolean method623(int arg0, int arg1, byte arg2, byte[] arg3) {
        field1512++;
        if (arg2 >= -12) {
            field1521 = null;
        }
        class248 var4 = new class248(arg3);
        int var5 = -1;
        boolean var6 = true;
        label58: while (true) {
            int var7 = var4.method1607(0);
            if (var7 == 0) {
                return var6;
            }
            var5 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var4.method1563((byte) 3);
                    if (var11 == 0) {
                        continue label58;
                    }
                    var8 += var11 - 1;
                    int var12 = var4.method1593((byte) 27) >> 2;
                    int var13 = var8 & 0x3F;
                    int var14 = (var8 & 0xFFD) >> 6;
                    int var15 = arg1 + var14;
                    int var16 = arg0 + var13;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class288 var17 = class274.method1816(38, var5);
                        if (var12 != 22 || class213.field3188 || var17.field4346 != 0 || var17.field4375 == 1 || var17.field4370) {
                            var9 = true;
                            if (!var17.method1903((byte) -114)) {
                                var6 = false;
                                class90.field1416++;
                            }
                        }
                    }
                }
                int var10 = var4.method1563((byte) 3);
                if (var10 == 0) {
                    break;
                }
                var4.method1593((byte) 27);
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method624(int arg0, String arg1) {
        field1513++;
        if (class293.field4610 == null || arg1.length() == 0) {
            return -1;
        }
        int var2 = 0;
        if (arg0 != -1) {
            field1521 = null;
        }
        while (class293.field4610.field2734 > var2) {
            if (class265.method1761("<br>", (byte) 98, class293.field4610.field2750[var2], " ").equals(arg1)) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
    public static final void method625(byte arg0) {
        field1515++;
        class81.field1297.method1782(0);
        if (arg0 < 34) {
            field1514 = null;
        }
    }
}
