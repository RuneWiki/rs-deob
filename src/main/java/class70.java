import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class70 {

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "Lcja;")
    private class46 field752 = new class46();

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "Lgq;")
    private class540 field758 = new class540();

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    private int field759;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    private int field760;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "Lqha;")
    private class112 field761;

    @OriginalMember(owner = "client!dl", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field762 = new String[] { method641(method640("(6&/a")), method641(method640("(6&V \"3|Ta")), method641(method640("(6&+a")), method641(method640("\"/d\u0006")), method641(method640("(6&(a")), method641(method640("7t&D4")), method641(method640("(6&)a")), method641(method640("(6&.a")) };

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field757 = 0;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "Lqq;")
    public static class501 field751;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "Lel;")
    public static class573 field750;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(JI)V")
    public final void method635(long arg0, int arg1) {
        try {
            field754++;
            class46 var4 = (class46) this.field761.method977(arg0, 1);
            if (var4 != null) {
                var4.method1824(1);
                var4.method362((byte) 72);
                this.field759++;
            }
            if (arg1 != 28121) {
                this.field761 = null;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field762[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lcja;IJ)V")
    public final void method636(class46 arg0, int arg1, long arg2) {
        try {
            field753++;
            if (this.field759 == 0) {
                class46 var5 = this.field758.method4064(-21877);
                var5.method1824(1);
                var5.method362((byte) 72);
                if (this.field752 == var5) {
                    class46 var6 = this.field758.method4064(-21877);
                    var6.method1824(1);
                    var6.method362((byte) 72);
                }
            } else {
                this.field759--;
            }
            this.field761.method968((byte) -111, arg2, arg0);
            if (arg1 == 0) {
                this.field758.method4067((byte) 108, arg0);
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field762[4] + (arg0 == null ? field762[3] : field762[5]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BJ)Lcja;")
    public final class46 method637(byte arg0, long arg1) {
        try {
            if (arg0 > -9) {
                return null;
            }
            field755++;
            class46 var4 = (class46) this.field761.method977(arg1, 1);
            if (var4 != null) {
                this.field758.method4067((byte) 104, var4);
            }
            return var4;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field762[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V")
    public final void method638(byte arg0) {
        try {
            if (arg0 == -112) {
                this.field758.method4069((byte) -86);
                field756++;
                this.field761.method970(arg0);
                this.field752 = new class46();
                this.field759 = this.field760;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field762[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
    public static void method639(int arg0) {
        try {
            if (arg0 != 1) {
                method639(-23);
            }
            field751 = null;
            field750 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field762[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(I)V")
    public class70(int arg0) {
        try {
            this.field759 = arg0;
            this.field760 = arg0;
            int var2;
            for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
            }
            this.field761 = new class112(var2);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field762[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dl", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method640(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x49);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dl", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method641(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 76;
                    break;
                case 1:
                    var10005 = 90;
                    break;
                case 2:
                    var10005 = 8;
                    break;
                case 3:
                    var10005 = 106;
                    break;
                default:
                    var10005 = 73;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
