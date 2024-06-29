import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class613 {

    @OriginalMember(owner = "client!al", name = "j", descriptor = "I")
    public int field8766 = 128;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "I")
    public int field8770 = 128;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "I")
    public int field8764;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    public int field8765;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public int field8769;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "I")
    public int field8774;

    @OriginalMember(owner = "client!al", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8775 = new String[] { method4529(method4528("\u0001\u0019$\u0006<")), method4529(method4528("\u0001\u0019$\u0001<")), method4529(method4528("\u0001\u0019$y}\u000e\u001c~{<")), method4529(method4528("\u000e\u0000f)")), method4529(method4528("\u0001\u0019$\u0004<")), method4529(method4528("\u001b[$ki")), method4529(method4528("\u0001\u0019$\u0007<")) };

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    public static int field8768 = 1;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public static int field8767;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "I")
    public static int field8772;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public static int field8773;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "[[I")
    public static int[][] field8771;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V")
    public static void method4524(byte arg0) {
        try {
            if (arg0 != 68) {
                method4527(56, -25, -28, 102, -104, -103, (byte) -121);
            }
            field8771 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8775[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)Lal;")
    public final class613 method4525(int arg0) {
        try {
            field8773++;
            if (arg0 > -124) {
                this.field8774 = -76;
            }
            return new class613(this.field8764, this.field8766, this.field8770, this.field8765, this.field8769, this.field8774);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8775[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BLal;)V")
    public final void method4526(byte arg0, class613 arg1) {
        try {
            this.field8765 = arg1.field8765;
            this.field8770 = arg1.field8770;
            if (arg0 == -112) {
                this.field8764 = arg1.field8764;
                this.field8766 = arg1.field8766;
                field8772++;
                this.field8769 = arg1.field8769;
                this.field8774 = arg1.field8774;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8775[4] + arg0 + ',' + (arg1 == null ? field8775[3] : field8775[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method4527(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        try {
            field8767++;
            class788.field11374 = arg0;
            class717.field10227 = arg3;
            class649.field9221 = arg5;
            if (arg6 != -49) {
                field8771 = null;
            }
            class767.field10961 = arg1;
            class189.field2509 = arg2;
            class2.field29 = arg4;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field8775[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(I)V")
    public class613(int arg0) {
        try {
            this.field8764 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8775[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(IIIIII)V")
    private class613(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            this.field8765 = arg3;
            this.field8769 = arg4;
            this.field8764 = arg0;
            this.field8774 = arg5;
            this.field8766 = arg1;
            this.field8770 = arg2;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field8775[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!al", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4528(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x14);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!al", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4529(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 96;
                    break;
                case 1:
                    var10005 = 117;
                    break;
                case 2:
                    var10005 = 10;
                    break;
                case 3:
                    var10005 = 69;
                    break;
                default:
                    var10005 = 20;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
