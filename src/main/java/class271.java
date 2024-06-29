import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class271 extends class544 implements class397 {

    @OriginalMember(owner = "client!hs", name = "q", descriptor = "I")
    public static int field3513 = 100;

    @OriginalMember(owner = "client!hs", name = "A", descriptor = "Lcea;")
    public static class180 field3523;

    @OriginalMember(owner = "client!hs", name = "p", descriptor = "C")
    public char field3512;

    @OriginalMember(owner = "client!hs", name = "m", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!hs", name = "n", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!hs", name = "o", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!hs", name = "r", descriptor = "I")
    public int field3514;

    @OriginalMember(owner = "client!hs", name = "s", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!hs", name = "t", descriptor = "I")
    public int field3516;

    @OriginalMember(owner = "client!hs", name = "v", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!hs", name = "w", descriptor = "I")
    public int field3519;

    @OriginalMember(owner = "client!hs", name = "x", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!hs", name = "y", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!hs", name = "z", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!hs", name = "B", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!hs", name = "u", descriptor = "J")
    public long field3517;

    static {
        new class180("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
        field3523 = new class180("shake:", "schütteln:", "tremblement:", "tremor:");
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 8)
    public static final String method1510(String arg0, int arg1) {
        field3511++;
        StringBuffer var2 = new StringBuffer();
        int var3 = arg0.length();
        if (arg1 != 100) {
            method1512(58, (byte) -110, -74);
        }
        for (int var4 = 0; var4 < var3; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 == '%' && (var4 + 2) < var3) {
                char var6 = arg0.charAt(var4 + 1);
                boolean var7 = false;
                int var8;
                if (var6 >= '0' && var6 <= '9') {
                    var8 = var6 - 48;
                } else if (var6 >= 'a' && var6 <= 'f') {
                    var8 = var6 + 10 - 97;
                } else {
                    if (var6 < 'A' || var6 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var8 = 10 - (65 - var6);
                }
                int var9 = var8 * 16;
                char var10 = arg0.charAt(var4 + 2);
                int var11;
                if (var10 >= '0' && var10 <= '9') {
                    var11 = var10 + var9 - 48;
                } else if (var10 >= 'a' && var10 <= 'f') {
                    var11 = var10 + var9 + 10 - 97;
                } else {
                    if (var10 < 'A' || var10 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var11 = var10 + var9 + '\n' - 65;
                }
                var4 += 2;
                if (var11 != 0 && class569.method3321((byte) var11, -29624)) {
                    var2.append(class67.method376((byte) -50, (byte) var11));
                }
            } else if (var5 == '+') {
                var2.append(' ');
            } else {
                var2.append(var5);
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "(B)V", line = 87)
    public static void method1511(byte arg0) {
        if (arg0 > 120) {
            field3523 = null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IBI)V", line = 100)
    public static final void method1512(int arg0, byte arg1, int arg2) {
        field3518++;
        class557 var3 = class93.method564(7, arg1 - 14042, arg2);
        if (arg1 == -31) {
            var3.method3257(1948);
            var3.field8207 = arg0;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)I", line = 120)
    public final int method1513(byte arg0) {
        field3515++;
        if (arg0 >= -32) {
            this.field3512 = (char) 65429;
        }
        return this.field3516;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)C", line = 131)
    public final char method1514(int arg0) {
        field3520++;
        if (arg0 != 16729) {
            this.field3514 = -71;
        }
        return this.field3512;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Z)I", line = 143)
    public final int method1515(boolean arg0) {
        if (arg0) {
            field3510++;
            return this.field3514;
        } else {
            return 4;
        }
    }

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "(I)I", line = 155)
    public final int method1516(int arg0) {
        field3509++;
        if (arg0 > -57) {
            this.method1513((byte) 8);
        }
        return this.field3519;
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)J", line = 166)
    public final long method1517(int arg0) {
        field3521++;
        int var2 = -93 % ((19 - arg0) / 38);
        return this.field3517;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILmd;)I", line = 179)
    public static final int method1518(int arg0, class463 arg1) {
        field3522++;
        if (arg1.field6461 == 0) {
            return 0;
        }
        int var2 = 105 / ((arg0 - 6) / 59);
        if (arg1.field6479 != -1) {
            class463 var3 = null;
            if (arg1.field6479 < 32768) {
                class415 var4 = (class415) class309.field3938.method2645((long) arg1.field6479, (byte) -110);
                if (var4 != null) {
                    var3 = var4.field5390;
                }
            } else if (arg1.field6479 >= 32768) {
                var3 = class459.field6329[arg1.field6479 - 32768];
            }
            if (var3 != null) {
                int var5 = arg1.field8661 - var3.field8661;
                int var6 = arg1.field8652 - var3.field8652;
                if (var5 != 0 || var6 != 0) {
                    arg1.method2705((int) (Math.atan2((double) var5, (double) var6) * 2607.5945876176133D) & 0x3FFF, false);
                }
            }
        }
        if ((arg1 instanceof class545)) {
            class545 var10 = (class545) arg1;
            if (var10.field7984 != -1 && (var10.field6486 == 0 || var10.field6487 > 0)) {
                var10.method2705(var10.field7984, false);
                var10.field7984 = -1;
            }
        } else if (arg1 instanceof class459) {
            class459 var7 = (class459) arg1;
            if (var7.field6315 != -1 && (var7.field6486 == 0 || var7.field6487 > 0)) {
                int var8 = var7.field8661 - (var7.field6315 - class632.field9113 - class632.field9113) * 64;
                int var9 = var7.field8652 - ((var7.field6323 - class119.field1504 - class119.field1504) * 64);
                if (var8 != 0 || var9 != 0) {
                    var7.method2705((int) (Math.atan2((double) var8, (double) var9) * 2607.5945876176133D) & 0x3FFF, false);
                }
                var7.field6315 = -1;
            }
        }
        return arg1.method2695(5041);
    }
}
