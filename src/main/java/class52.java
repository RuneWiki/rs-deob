import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class52 {

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field1044 = 0;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field1045 = 255;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "Z")
    public static boolean field1046 = false;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1053 = "Please wait...";

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    public static int field1047 = -1;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "[Lti;")
    public static class248[] field1049;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)Lob;", line = 9)
    public static final class323 method452(int arg0) {
        field1054++;
        if (arg0 != 12603) {
            return (class323) null;
        }
        class323 var1;
        if (class241.field4016) {
            var1 = new class3(class91.field1617, class12.field368, class321.field5218[0], class232.field3804[0], class9.field284[0], class76.field1367[0], class309.field5053[0], class323.field5225);
        } else {
            var1 = new class211(class91.field1617, class12.field368, class321.field5218[0], class232.field3804[0], class9.field284[0], class76.field1367[0], class309.field5053[0], class323.field5225);
        }
        class213.method1470(false);
        return var1;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/String;IZI)Z", line = 28)
    public static final boolean method453(String arg0, int arg1, boolean arg2, int arg3) {
        field1050++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var4 = false;
        int var5 = 0;
        boolean var6 = false;
        int var7 = arg0.length();
        if (arg3 != -6935) {
            field1044 = -79;
        }
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var6 = true;
                    continue;
                }
                if (var9 == '+' && arg2) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (arg1 <= var11) {
                return false;
            }
            if (var6) {
                var11 = -var11;
            }
            int var10 = arg1 * var5 + var11;
            if ((var10 / arg1) != var5) {
                return false;
            }
            var4 = true;
            var5 = var10;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IB)I", line = 110)
    public static final int method454(int arg0, byte arg1) {
        field1048++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg1 >= -100) {
            return 109;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)V", line = 155)
    public static void method455(int arg0) {
        field1049 = null;
        field1053 = null;
        if (arg0 != -44) {
            method452(-95);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(III)Lqo;", line = 167)
    public static final class332 method456(int arg0, int arg1, int arg2) {
        class312 var3 = class353.field5644[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class332 var4 = var3.field5082;
            var3.field5082 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILqc;)V", line = 179)
    public static final void method457(int arg0, class6 arg1) {
        field1051++;
        if (class267.field4371 == arg1.field161 || arg1.field166 == -1 || arg1.field180 != 0 || (arg1.field210 + 1) > class258.method1807(arg1.field166, arg0 ^ 0xFFFFBD0F).field4877[arg1.field220]) {
            int var2 = arg1.field161 - arg1.field172;
            int var3 = class267.field4371 - arg1.field172;
            int var4 = arg1.field183 * 128 + (arg1.method49((byte) -117) * 64);
            int var5 = arg1.field187 * 128 + arg1.method49((byte) 57) * 64;
            int var6 = arg1.field219 * 128 + arg1.method49((byte) 110) * 64;
            int var7 = arg1.field165 * 128 + (arg1.method49((byte) -107) * 64);
            arg1.field199 = ((var2 - var3) * var4 + var3 * var6) / var2;
            arg1.field213 = ((var2 - var3) * var5 + var3 * var7) / var2;
        }
        arg1.field121 = 0;
        if (arg0 != -17068) {
            field1053 = (String) null;
        }
        if (arg1.field151 == 0) {
            arg1.field144 = 1024;
        }
        if (arg1.field151 == 1) {
            arg1.field144 = 1536;
        }
        if (arg1.field151 == 2) {
            arg1.field144 = 0;
        }
        if (arg1.field151 == 3) {
            arg1.field144 = 512;
        }
        arg1.field216 = arg1.field144;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILjava/lang/String;)V", line = 249)
    public static final void method458(int arg0, String arg1) {
        int var2 = -106 % ((arg0 + 60) / 54);
        System.out.println("Error: " + class231.method1615("\n", arg1, -109, "%0a"));
        field1055++;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILg;)V", line = 258)
    public static final void method459(int arg0, class181 arg1) {
        field1052++;
        if (arg0 != 128) {
            field1053 = (String) null;
        }
        if (client.field4594 == arg1.field3071) {
            class213.field3524[arg1.field3094] = true;
        }
    }
}
