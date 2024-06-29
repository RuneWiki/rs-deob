import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class323 {

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "S")
    public short field4624;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "B")
    public byte field4620;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "Lnc;")
    public class21 field4626;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "B")
    public byte field4621;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
    public static int field4627 = 0;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "Lvv;")
    public static class212 field4623;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "Z")
    public static boolean field4619;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 10)
    public static final String method2003(int arg0, String arg1) {
        if (arg0 != 1) {
            return null;
        }
        field4617++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg1.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLne;)Z", line = 59)
    public static final boolean method2004(byte arg0, class207 arg1) {
        field4622++;
        if (arg0 == -78) {
            return class498.field7351 == arg1 || class176.field2600 == arg1 || class317.field4558 == arg1 || class511.field7465 == arg1;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I[Ljava/lang/String;IB)Ljava/lang/String;", line = 73)
    public static final String method2005(int arg0, String[] arg1, int arg2, byte arg3) {
        field4628++;
        if (arg2 == 0) {
            return "";
        } else if (arg2 == 1) {
            String var4 = arg1[arg0];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg0 + arg2;
            int var6 = 0;
            for (int var7 = arg0; var7 < var5; var7++) {
                String var11 = arg1[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            if (arg3 != 84) {
                return null;
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg0; var9 < var5; var9++) {
                String var10 = arg1[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Ljd;IIIII)V", line = 134)
    public static final void method2006(class152 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field2259 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field2265[var6] != null) {
                arg0.field2259++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field2259; var7++) {
            long var8 = class9.field123[arg1][arg2][arg3];
            while (var8 != 0L) {
                class419 var14 = class517.field7540[(int) ((var8 & 0xFFFFL) - 1L)];
                var8 >>>= 0x10;
                if (arg0.field2265[var7] == var14.field6301) {
                    continue label50;
                }
            }
            long var10 = class9.field123[arg1][arg4][arg5];
            while (var10 != 0L) {
                class419 var13 = class517.field7540[(int) ((var10 & 0xFFFFL) - 1L)];
                var10 >>>= 0x10;
                if (arg0.field2265[var7] == var13.field6301) {
                    continue label50;
                }
            }
            for (int var12 = var7; var12 < arg0.field2259 - 1; var12++) {
                arg0.field2265[var12] = arg0.field2265[var12 + 1];
            }
            arg0.field2259--;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V", line = 191)
    public static void method2007(byte arg0) {
        field4623 = null;
        int var1 = -118 / ((arg0 - 77) / 40);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Ljava/lang/String;IZ)V", line = 204)
    public static final void method2008(String arg0, int arg1, boolean arg2) {
        class423.field6356.field7271 = 1;
        field4618++;
        String var3 = arg0.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class294.field4196.field1171; var6++) {
            class339 var9 = class294.field4196.method453(0, var6);
            if ((!arg2 || var9.field4784) && var9.field4771 == -1 && var9.field4797 == -1 && var9.field4763 == 0 && var9.field4796.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class102.field1471 = -1;
                    class461.field6847 = null;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class102.field1471 = var5;
        class461.field6847 = var4;
        class279.field4022 = 0;
        String[] var7 = new String[class102.field1471];
        for (int var8 = 0; var8 < class102.field1471; var8++) {
            var7[var8] = class294.field4196.method453(0, var4[var8]).field4796;
        }
        class438.method2631(var7, (byte) -127, class461.field6847);
        class423.field6356.method2927(-2);
        class423.field6356.field7271 = 2;
        if (arg1 > -11) {
            method2007((byte) 92);
        }
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lnc;III)V", line = 278)
    public class323(class21 arg0, int arg1, int arg2, int arg3) {
        this.field4624 = (short) arg1;
        this.field4620 = (byte) arg3;
        this.field4626 = arg0;
        this.field4621 = (byte) arg2;
    }
}
