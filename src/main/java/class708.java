import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class708 {

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "Lrba;")
    public class459 field10193 = new class459();

    @OriginalMember(owner = "client!wca", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10198 = new String[] { method5151(method5150("\u001e\u0007HFzA")), method5151(method5150("\u0012J\u0007FC")), method5151(method5150("\u0007\u0011E\u0004")), method5151(method5150("\u001e\u0007HF{A")), method5151(method5150("\u001e\u0007HF\u007fA")), method5151(method5150("\u001e\u0007HFvA")), method5151(method5150("\u001e\u0007HF|A")), method5151(method5150("\u001e\u0007HFwA")), method5151(method5150("\u001e\u0007HF\u0002\u0000\n@\u001c\u0000A")), method5151(method5150("\u001e\u0007HFxA")), method5151(method5150("\u001e\u0007HF}A")), method5151(method5150("\u001e\u0007HFyA")) };

    @OriginalMember(owner = "client!wca", name = "g", descriptor = "Lhl;")
    public static class556 field10184 = new class556(110, 1);

    @OriginalMember(owner = "client!wca", name = "i", descriptor = "Z")
    public static boolean field10188 = true;

    @OriginalMember(owner = "client!wca", name = "e", descriptor = "I")
    public static int field10197 = 0;

    @OriginalMember(owner = "client!wca", name = "n", descriptor = "I")
    public static int field10185;

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "I")
    public static int field10186;

    @OriginalMember(owner = "client!wca", name = "f", descriptor = "I")
    public static int field10189;

    @OriginalMember(owner = "client!wca", name = "d", descriptor = "I")
    public static int field10190;

    @OriginalMember(owner = "client!wca", name = "k", descriptor = "I")
    public static int field10191;

    @OriginalMember(owner = "client!wca", name = "l", descriptor = "I")
    public static int field10192;

    @OriginalMember(owner = "client!wca", name = "m", descriptor = "I")
    public static int field10195;

    @OriginalMember(owner = "client!wca", name = "h", descriptor = "I")
    public static int field10196;

    @OriginalMember(owner = "client!wca", name = "j", descriptor = "Luga;")
    public static class218 field10187;

    @OriginalMember(owner = "client!wca", name = "c", descriptor = "Lrba;")
    private class459 field10194;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(I)V")
    public final void method5141(int arg0) {
        try {
            if (arg0 != 0) {
                method5148(114);
            }
            while (true) {
                class459 var2 = this.field10193.field7074;
                if (this.field10193 == var2) {
                    field10192++;
                    this.field10194 = null;
                    return;
                }
                var2.method3558((byte) 95);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10198[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lrba;B)V")
    public final void method5142(class459 arg0, byte arg1) {
        try {
            if (arg0.field7073 != null) {
                arg0.method3558((byte) 53);
            }
            field10196++;
            if (arg1 != -63) {
                field10197 = 72;
            }
            arg0.field7074 = this.field10193;
            arg0.field7073 = this.field10193.field7073;
            arg0.field7073.field7074 = arg0;
            arg0.field7074.field7073 = arg0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10198[9] + (arg0 == null ? field10198[2] : field10198[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(IIZ)B")
    public static final byte method5143(int arg0, int arg1, boolean arg2) {
        try {
            if (arg2) {
                field10184 = null;
            }
            field10191++;
            if (arg1 == 9) {
                return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
            } else {
                return 0;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10198[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "(I)Lrba;")
    public final class459 method5144(int arg0) {
        try {
            if (arg0 != 256) {
                method5148(68);
            }
            field10189++;
            class459 var2 = this.field10194;
            if (this.field10193 == var2) {
                this.field10194 = null;
                return null;
            } else {
                this.field10194 = var2.field7074;
                return var2;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10198[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Loi;I)V")
    public static final void method5145(class77 arg0, int arg1) {
        try {
            field10186++;
            int var2 = arg0.field1195 - class431.field6776;
            if (arg1 != 7732) {
                field10197 = 82;
            }
            int var3 = arg0.field1187 * 512 + (arg0.method804(true) * 256);
            int var4 = arg0.field1107 * 512 + arg0.method804(true) * 256;
            arg0.field9985 += (var3 - arg0.field9985) / var2;
            arg0.field9983 += (var4 - arg0.field9983) / var2;
            arg0.field1206 = 0;
            if (arg0.field1170 == 0) {
                arg0.method800(8192, arg1 - 7858);
            }
            if (arg0.field1170 == 1) {
                arg0.method800(12288, arg1 ^ 0xFFFFE1FD);
            }
            if (arg0.field1170 == 2) {
                arg0.method800(0, -104);
            }
            if (arg0.field1170 == 3) {
                arg0.method800(4096, arg1 ^ 0xFFFFE1F7);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field10198[3] + (arg0 == null ? field10198[2] : field10198[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Z)I")
    public final int method5146(boolean arg0) {
        try {
            if (arg0) {
                return -21;
            }
            field10195++;
            int var2 = 0;
            class459 var3 = this.field10193.field7074;
            while (this.field10193 != var3) {
                var3 = var3.field7074;
                var2++;
            }
            return var2;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field10198[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "(B)Lrba;")
    public final class459 method5147(byte arg0) {
        try {
            field10190++;
            class459 var2 = this.field10193.field7074;
            int var3 = 88 / ((9 - arg0) / 60);
            if (this.field10193 == var2) {
                this.field10194 = null;
                return null;
            } else {
                this.field10194 = var2.field7074;
                return var2;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field10198[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wca", name = "c", descriptor = "(I)V")
    public static void method5148(int arg0) {
        try {
            field10187 = null;
            field10184 = null;
            if (arg0 != 0) {
                method5148(58);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field10198[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wca", name = "<init>", descriptor = "()V")
    public class708() {
        try {
            this.field10193.field7074 = this.field10193;
            this.field10193.field7073 = this.field10193;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field10198[8] + ')');
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(B)Lrba;")
    public final class459 method5149(byte arg0) {
        try {
            if (arg0 != 52) {
                this.method5141(33);
            }
            field10185++;
            class459 var2 = this.field10193.field7074;
            if (this.field10193 == var2) {
                return null;
            } else {
                var2.method3558((byte) 64);
                return var2;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10198[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5150(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5151(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 105;
                    break;
                case 1:
                    var10005 = 100;
                    break;
                case 2:
                    var10005 = 41;
                    break;
                case 3:
                    var10005 = 104;
                    break;
                default:
                    var10005 = 62;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
