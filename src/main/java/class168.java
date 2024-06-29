import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class168 extends class756 {

    @OriginalMember(owner = "client!hq", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2313 = new String[] { method1494(method1493("\\>`r")), method1494(method1493("Z:\"\\=")), method1494(method1493("Ie\"0h")), method1494(method1493("Z:\"_=")), method1494(method1493("Z:\"[=")), method1494(method1493("Z:\"]=")), method1494(method1493("Z:\"Z=")) };

    @OriginalMember(owner = "client!hq", name = "p", descriptor = "Z")
    public static boolean field2309 = true;

    @OriginalMember(owner = "client!hq", name = "n", descriptor = "Lel;")
    public static class573 field2308 = new class573(10, 16);

    @OriginalMember(owner = "client!hq", name = "s", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!hq", name = "r", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!hq", name = "q", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!hq", name = "o", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!hq", name = "t", descriptor = "Ljava/lang/String;")
    private String field2307;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(BLib;)V", line = 11)
    public final void method38(byte arg0, class163 arg1) {
        try {
            this.field2307 = arg1.method1423(110);
            if (arg0 < 32) {
                field2309 = false;
            }
            field2310++;
            arg1.method1453((byte) 125);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field2313[1] + arg0 + ',' + (arg1 == null ? field2313[0] : field2313[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lkp;I)V", line = 25)
    public final void method41(class514 arg0, int arg1) {
        try {
            if (arg1 != 9893) {
                method1490(-88);
            }
            arg0.field7415 = this.field2307;
            field2311++;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field2313[5] + (arg0 == null ? field2313[0] : field2313[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)[I", line = 40)
    public static final int[] method1490(int arg0) {
        try {
            field2312++;
            if (arg0 < 68) {
                method1490(109);
            }
            return new int[] { class431.field6336, class647.field9376, class242.field3709 };
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field2313[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V", line = 51)
    public static final void method1491(int arg0) {
        try {
            field2306++;
            class43.field504.method1328((byte) -9);
            class704.method5137(-6224);
            class6.field68 = null;
            class533.field7812 = 0;
            class430.field6332.field2201 = 0;
            class515.field7449 = null;
            class70.field750 = null;
            class180.field2497 = 0;
            class26.method178(-1);
            class606.field8878 = 0;
            class186.field2563 = null;
            class173.field2407 = 0;
            class588.field8654 = 0;
            class751.field10922 = null;
            class89.field1009 = null;
            class16.field198 = null;
            if (arg0 <= 28) {
                field2308 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field2313[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(B)V", line = 79)
    public static void method1492(byte arg0) {
        try {
            field2308 = null;
            if (arg0 != -19) {
                field2308 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field2313[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1493(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x15);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1494(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 50;
                    break;
                case 1:
                    var10005 = 75;
                    break;
                case 2:
                    var10005 = 12;
                    break;
                case 3:
                    var10005 = 30;
                    break;
                default:
                    var10005 = 21;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
