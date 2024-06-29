import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class28 {

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "I")
    public static int field381 = 0;

    @OriginalMember(owner = "client!ln", name = "k", descriptor = "I")
    public static int field385 = 64;

    @OriginalMember(owner = "client!ln", name = "l", descriptor = "Ljava/lang/String;")
    public static String field386 = null;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!ln", name = "i", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!ln", name = "j", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!ln", name = "m", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "Lcg;")
    public static class49 field378;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V", line = 4)
    public static final void method251(int arg0) {
        field377++;
        class338.method2385((byte) 85);
        class122.method1032((byte) 106);
        class209.method1560((byte) 35);
        class324.method2251(false);
        class209.method1559(-101);
        class224.method1633(false);
        class224.method1638(true);
        class286.method1954(-1);
        class32.method297(-4039);
        class53.method482(arg0 ^ 0xFFFFC245);
        class119.method1013(-116);
        class171.method1348(arg0 ^ 0xFFFFFFC1);
        class95.method818(-112);
        class77.method707((byte) 118);
        class204.method1531(arg0 ^ 0x63);
        class137.method1118((byte) -91);
        class203.method1526(-27860);
        class162.method1289(1);
        if (class331.field5280 != 0) {
            for (int var1 = 0; var1 < class215.field3615.length; var1++) {
                class215.field3615[var1] = null;
            }
            class200.field3408 = 0;
        }
        class155.method1241(false);
        class195.method1468(32212);
        class40.method341((byte) 59);
        class122.method1034(-119);
        class123.field2133.method470(12);
        if (!class43.field680) {
            ((class153) class62.field953).method1231((byte) 46);
        }
        class39.field581.method2399((byte) -101);
        class266.field4288.method454(0);
        class105.field1752.method454(~arg0);
        class27.field369.method454(~arg0);
        class207.field3517.method454(0);
        class92.field1446.method454(0);
        class179.field3030.method454(arg0 ^ arg0);
        class262.field4248.method454(0);
        class321.field5091.method454(0);
        class26.field366.method454(~arg0);
        class86.field1374.method454(0);
        class24.field344.method454(0);
        class127.field2208.method470(arg0 + 13);
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)V", line = 68)
    public static void method252(int arg0) {
        field386 = null;
        int var1 = 103 / ((arg0 + 65) / 38);
        field378 = null;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILjava/lang/String;)I", line = 88)
    public static final int method253(int arg0, String arg1) {
        field375++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + class94.method810((byte) 124, arg1.charAt(var4)) - var3;
        }
        if (arg0 != -1) {
            method259((class49) null, false, 16, -92);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;", line = 111)
    public static final String method254(byte arg0, Throwable arg1) throws IOException {
        String var2;
        if ((arg1 instanceof class344)) {
            class344 var3 = (class344) arg1;
            var2 = var3.field5480 + " | ";
            arg1 = var3.field5479;
        } else {
            var2 = "";
        }
        field376++;
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        if (arg0 > -51) {
            field385 = -110;
        }
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var2 + "| " + var8;
            }
            int var11 = var9.indexOf(40);
            int var12 = var9.indexOf(41, var11 + 1);
            String var13;
            if (var11 == -1) {
                var13 = var9;
            } else {
                var13 = var9.substring(0, var11);
            }
            String var14 = var13.trim();
            String var15 = var14.substring(var14.lastIndexOf(32) + 1);
            String var16 = var15.substring(var15.lastIndexOf(9) + 1);
            String var17 = var2 + var16;
            if (var11 != -1 && var12 != -1) {
                int var18 = var9.indexOf(".java:", var11);
                if (var18 >= 0) {
                    var17 = var17 + var9.substring(var18 + 5, var12);
                }
            }
            var2 = var17 + ' ';
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)V", line = 182)
    public static final void method255(int arg0, int arg1) {
        field380++;
        int var2 = 14 % ((arg1 - 24) / 59);
        class8.field96.method469(-11815, arg0);
        class48.field736.method469(-11815, arg0);
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(II)Lba;", line = 196)
    public static final class184 method256(int arg0, int arg1) {
        field382++;
        class184 var2 = (class184) class254.field4089.method2400((long) arg0, 99);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != 40) {
            field387 = -36;
        }
        byte[] var3 = class21.field328.method441(false, class85.method765((byte) -59, arg0), class322.method2213(arg0, -56));
        class184 var4 = new class184();
        if (var3 != null) {
            var4.method1423(-24217, new class336(var3));
        }
        class254.field4089.method2396(0, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILu;)I", line = 221)
    public static final int method257(int arg0, class278 arg1) {
        field384++;
        class12 var2 = arg1.field4413;
        if (var2.field179 != null) {
            var2 = var2.method122(-81);
            if (var2 == null) {
                return -1;
            }
        }
        if (arg0 != 22401) {
            return -116;
        }
        int var3 = var2.field154;
        class346 var4 = arg1.method980((byte) 73);
        if (arg1.field2000 == var4.field5521) {
            var3 = var2.field182;
        } else if (arg1.field2000 == var4.field5503 || arg1.field2000 == var4.field5506 || arg1.field2000 == var4.field5504 || arg1.field2000 == var4.field5499) {
            var3 = var2.field203;
        } else if (arg1.field2000 == var4.field5522 || arg1.field2000 == var4.field5527 || arg1.field2000 == var4.field5494 || arg1.field2000 == var4.field5518) {
            var3 = var2.field168;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(I)V", line = 260)
    public static final void method258(int arg0) {
        class110.field1865 = new class331();
        field379++;
        if (arg0 != 0) {
            field381 = -26;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lcg;ZII)Ln;", line = 280)
    public static final class309 method259(class49 arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            return (class309) null;
        } else {
            field383++;
            return class325.method2262(arg2, (byte) 99, arg0, arg3) ? class246.method1730((byte) -122) : null;
        }
    }
}
