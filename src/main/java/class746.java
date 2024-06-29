import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public class class746 {

    @OriginalMember(owner = "client!nea", name = "j", descriptor = "I")
    public int field10983;

    @OriginalMember(owner = "client!nea", name = "c", descriptor = "B")
    public byte field10988;

    @OriginalMember(owner = "client!nea", name = "m", descriptor = "I")
    public int field10994;

    @OriginalMember(owner = "client!nea", name = "g", descriptor = "I")
    public int field10995;

    @OriginalMember(owner = "client!nea", name = "h", descriptor = "Lrda;")
    public class693 field10989;

    @OriginalMember(owner = "client!nea", name = "l", descriptor = "I")
    public int field10982;

    @OriginalMember(owner = "client!nea", name = "k", descriptor = "I")
    public int field10985;

    @OriginalMember(owner = "client!nea", name = "n", descriptor = "I")
    public int field10990;

    @OriginalMember(owner = "client!nea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11000 = new String[] { method5429(method5428("MF4\u0013u\u000b")), method5429(method5428("MF4\u0013v\u000b")), method5429(method5428("MF4\u0013q\u000b")), method5429(method5428("MF4\u0013p\u000b")), method5429(method5428("X\r{\u0013I")), method5429(method5428("MF4\u0013\bJM<I\n\u000b")), method5429(method5428("MV9Q")), method5429(method5428("MF4\u0013w\u000b")) };

    @OriginalMember(owner = "client!nea", name = "i", descriptor = "Lhl;")
    public static class556 field10996 = new class556(98, 2);

    @OriginalMember(owner = "client!nea", name = "o", descriptor = "Z")
    public static boolean field10999 = true;

    @OriginalMember(owner = "client!nea", name = "r", descriptor = "I")
    public static int field10987;

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "I")
    public static int field10991;

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "I")
    public static int field10992;

    @OriginalMember(owner = "client!nea", name = "f", descriptor = "I")
    public static int field10993;

    @OriginalMember(owner = "client!nea", name = "d", descriptor = "I")
    public static int field10997;

    @OriginalMember(owner = "client!nea", name = "e", descriptor = "Lgga;")
    public class306 field10986;

    @OriginalMember(owner = "client!nea", name = "p", descriptor = "Ljg;")
    public class357 field10984;

    @OriginalMember(owner = "client!nea", name = "s", descriptor = "Lfia;")
    public class602 field10981;

    @OriginalMember(owner = "client!nea", name = "q", descriptor = "Lit;")
    public class675 field10998;

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(I)Z", line = 9)
    public final boolean method5423(int arg0) {
        try {
            field10987++;
            if (arg0 < 60) {
                return true;
            } else {
                return this.field10988 == 2 || this.field10988 == 3;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11000[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "(Z)V", line = 22)
    public static final void method5424(boolean arg0) {
        try {
            class213.field3359 = class57.method572(0.4F, (byte) -59, 35, arg0, 8, 8, 4, 2048);
            field10991++;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11000[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(Z)V", line = 34)
    public static final void method5425(boolean arg0) {
        try {
            if (arg0) {
                class442.field6893 = "";
                class89.field1328 = "";
                field10992++;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11000[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "(I)V", line = 48)
    public static final void method5426(int arg0) {
        try {
            field10993++;
            if (class9.field104 == arg0) {
                class9.field104 = 11;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11000[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(B)V", line = 66)
    public static void method5427(byte arg0) {
        try {
            if (arg0 > 78) {
                field10996 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11000[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(BIIIIIILrda;)V", line = 75)
    public class746(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class693 arg7) {
        try {
            this.field10983 = arg1;
            this.field10988 = arg0;
            this.field10994 = arg6;
            this.field10995 = arg2;
            this.field10989 = arg7;
            this.field10982 = arg4;
            this.field10985 = arg3;
            this.field10990 = arg5;
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field11000[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 == null ? field11000[6] : field11000[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!nea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5428(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x34);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5429(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 35;
                    break;
                case 1:
                    var10005 = 35;
                    break;
                case 2:
                    var10005 = 85;
                    break;
                case 3:
                    var10005 = 61;
                    break;
                default:
                    var10005 = 52;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
