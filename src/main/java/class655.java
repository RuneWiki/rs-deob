import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public class class655 extends class46 {

    @OriginalMember(owner = "client!pda", name = "s", descriptor = "Ljava/lang/String;")
    public String field9460;

    @OriginalMember(owner = "client!pda", name = "C", descriptor = "Lgq;")
    public class540 field9457;

    @OriginalMember(owner = "client!pda", name = "I", descriptor = "[Ljava/lang/String;")
    private static final String[] field9472 = new String[] { method4809(method4808("\u0010\u0010;W?")), method4809(method4808("\u0005Ky\u0015")), method4809(method4808("\u001bZtW\u000eC")), method4809(method4808("\u001bZtW\u0005C")), method4809(method4808("\u001bZtW\tC")), method4809(method4808("\u001bZtW~\u0002P|\r|C")), method4809(method4808("\u001bZtW\u000bC")), method4809(method4808("\u001bZtW\nC")), method4809(method4808("\u001bZtW\bC")), method4809(method4808("\u001bZtW\u0004C")) };

    @OriginalMember(owner = "client!pda", name = "F", descriptor = "Lel;")
    public static class573 field9458 = new class573(122, 0);

    @OriginalMember(owner = "client!pda", name = "H", descriptor = "I")
    public static int field9463 = 0;

    @OriginalMember(owner = "client!pda", name = "D", descriptor = "Lwia;")
    public static class790 field9465 = new class790(66, 7);

    @OriginalMember(owner = "client!pda", name = "G", descriptor = "I")
    public static int field9468 = 0;

    @OriginalMember(owner = "client!pda", name = "r", descriptor = "Lni;")
    public static class547 field9467 = new class547(method4809(method4808("'wC<")), 0);

    @OriginalMember(owner = "client!pda", name = "t", descriptor = "Lum;")
    public static class550 field9469 = new class550("", 10);

    @OriginalMember(owner = "client!pda", name = "B", descriptor = "Z")
    public static boolean field9471 = false;

    @OriginalMember(owner = "client!pda", name = "y", descriptor = "I")
    public static int field9455;

    @OriginalMember(owner = "client!pda", name = "w", descriptor = "I")
    public static int field9456;

    @OriginalMember(owner = "client!pda", name = "E", descriptor = "I")
    public int field9459;

    @OriginalMember(owner = "client!pda", name = "u", descriptor = "I")
    public static int field9461;

    @OriginalMember(owner = "client!pda", name = "A", descriptor = "I")
    public static int field9462;

    @OriginalMember(owner = "client!pda", name = "z", descriptor = "I")
    public static int field9464;

    @OriginalMember(owner = "client!pda", name = "x", descriptor = "I")
    public static int field9466;

    @OriginalMember(owner = "client!pda", name = "v", descriptor = "I")
    public static int field9470;

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(Lsg;I)Z")
    public final boolean method4801(class417 arg0, int arg1) {
        try {
            field9456++;
            int var3 = this.method4803(33);
            arg0.method362((byte) 72);
            this.field9459--;
            if (this.field9459 != arg1) {
                return this.method4803(-89) != var3;
            }
            this.method1824(1);
            this.method362((byte) 72);
            class184.field2547--;
            class71.field775.method1556(arg0.field6154, this, 1);
            return false;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field9472[7] + (arg0 == null ? field9472[1] : field9472[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(IIIIIB)V")
    public static final void method4802(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        try {
            if (class289.field4305.field838.method4492(false) != 0 && arg2 != 0 && class86.field958 < 50 && arg4 != -1) {
                class534.field7826[class86.field958++] = new class305((byte) 1, arg4, arg2, arg0, arg3, 0, arg1, null);
            }
            if (arg5 != -95) {
                field9471 = false;
            }
            field9466++;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field9472[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "(I)I")
    public final int method4803(int arg0) {
        try {
            field9461++;
            int var2 = -75 / ((arg0 + 44) / 45);
            return this.field9457.field7916.field529 == this.field9457.field7916 ? -1 : ((class417) this.field9457.field7916.field529).field6146;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9472[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(IZIII)V")
    public static final void method4804(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        try {
            if (class289.field4305.field812.method1610(false) == 0) {
                class123.method1069(false, false);
            } else {
                class149.field1840 = class289.field4305.field812.method1610(false);
                class640.method4693(0, -13558, true);
            }
            field9455++;
            class376.field5731 = arg1;
            class362.field5548 = arg3;
            if (arg4 == -22781) {
                class306.field4782 = arg2;
                class161.method1379(arg0);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field9472[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(I)V")
    public static void method4805(int arg0) {
        try {
            field9469 = null;
            field9467 = null;
            field9465 = null;
            if (arg0 == 32591) {
                field9458 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9472[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class655(String arg0) {
        try {
            this.field9460 = arg0;
            this.field9457 = new class540();
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9472[5] + (arg0 == null ? field9472[1] : field9472[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "(Lsg;I)Z")
    public final boolean method4806(class417 arg0, int arg1) {
        try {
            field9464++;
            boolean var3 = true;
            arg0.method362((byte) 72);
            for (class417 var4 = (class417) this.field9457.method4068(false); var4 != null; var4 = (class417) this.field9457.method4072(-113)) {
                if (class315.method2649(arg0.field6146, false, var4.field6146)) {
                    class109.method959(var4, arg0, (byte) 71);
                    this.field9459++;
                    if (var3) {
                        return false;
                    }
                    return true;
                }
                var3 = false;
            }
            this.field9457.method4067((byte) -94, arg0);
            this.field9459++;
            return arg1 == 122 ? var3 : false;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field9472[4] + (arg0 == null ? field9472[1] : field9472[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(Ljava/io/File;B)[B")
    public static final byte[] method4807(File arg0, byte arg1) {
        try {
            if (arg1 != -52) {
                method4807(null, (byte) 84);
            }
            field9462++;
            return class463.method3521((int) arg0.length(), 10, arg0);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9472[2] + (arg0 == null ? field9472[1] : field9472[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4808(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x42);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4809(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 107;
                    break;
                case 1:
                    var10005 = 62;
                    break;
                case 2:
                    var10005 = 21;
                    break;
                case 3:
                    var10005 = 121;
                    break;
                default:
                    var10005 = 66;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
