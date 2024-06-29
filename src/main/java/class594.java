import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class594 {

    @OriginalMember(owner = "client!cv", name = "i", descriptor = "Ljava/lang/String;")
    public String field8717;

    @OriginalMember(owner = "client!cv", name = "h", descriptor = "Ljava/lang/String;")
    public String field8719;

    @OriginalMember(owner = "client!cv", name = "g", descriptor = "Ljava/lang/String;")
    public String field8715;

    @OriginalMember(owner = "client!cv", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8723 = new String[] { method4427(method4426("#G$sW")), method4427(method4426("#G$rW")), method4427(method4426("#G$qW")), method4427(method4426("#G$uW")), method4427(method4426(";\u001f$\u001e\u0002")), method4427(method4426(".Df\\")), method4427(method4426("#G$\f\u0016.X~\u000eW")), method4427(method4426("#G$tW")) };

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "Lel;")
    public static class573 field8716 = new class573(48, -2);

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "J")
    public static volatile long field8721 = 0L;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "I")
    public static int field8712;

    @OriginalMember(owner = "client!cv", name = "j", descriptor = "I")
    public static int field8713;

    @OriginalMember(owner = "client!cv", name = "k", descriptor = "I")
    public static int field8718;

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "I")
    public static int field8720;

    @OriginalMember(owner = "client!cv", name = "e", descriptor = "I")
    public static int field8722;

    @OriginalMember(owner = "client!cv", name = "f", descriptor = "Lfk;")
    public static class679 field8714;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(BI)V")
    public static final void method4421(byte arg0, int arg1) {
        try {
            field8712++;
            if (arg0 <= 107) {
                method4421((byte) -122, -27);
            }
            if (class334.method2801(arg1, 0)) {
                class233.method1989(class683.field9897[arg1], -1, (byte) -70);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8723[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(BLib;)Lpm;")
    public static final class610 method4422(byte arg0, class163 arg1) {
        try {
            field8718++;
            int var2 = -72 / ((-arg0 - 72) / 36);
            int var3 = arg1.method1445((byte) 114);
            return new class610(var3);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field8723[7] + arg0 + ',' + (arg1 == null ? field8723[5] : field8723[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(III)Z")
    public static final boolean method4423(int arg0, int arg1, int arg2) {
        try {
            field8720++;
            if (arg0 == 15) {
                return (arg1 & 0x37) != 0;
            } else {
                return true;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8723[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIIII)I")
    public static final int method4424(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field8722++;
            int var5 = arg2 & arg3;
            int var6 = var5 >= 8 ? arg1 : arg4;
            int var7 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg4 : arg0) : arg1;
            return ((var5 & 0x2) == 0 ? var7 : -var7) + ((var5 & 0x1) == 0 ? var6 : -var6);
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field8723[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public class594(String arg0, String arg1, String arg2) {
        try {
            this.field8717 = arg2;
            this.field8719 = arg0;
            this.field8715 = arg1;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field8723[6] + (arg0 == null ? field8723[5] : field8723[4]) + ',' + (arg1 == null ? field8723[5] : field8723[4]) + ',' + (arg2 == null ? field8723[5] : field8723[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Z)V")
    public static void method4425(boolean arg0) {
        try {
            if (!arg0) {
                method4424(13, 37, -48, -62, 73);
            }
            field8716 = null;
            field8714 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8723[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4426(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4427(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 64;
                    break;
                case 1:
                    var10005 = 49;
                    break;
                case 2:
                    var10005 = 10;
                    break;
                case 3:
                    var10005 = 48;
                    break;
                default:
                    var10005 = 127;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
