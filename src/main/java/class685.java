import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class685 {

    @OriginalMember(owner = "client!dv", name = "f", descriptor = "I")
    public int field9934;

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "I")
    public int field9932;

    @OriginalMember(owner = "client!dv", name = "j", descriptor = "I")
    public int field9941;

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "I")
    public int field9936;

    @OriginalMember(owner = "client!dv", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9942 = new String[] { method5026(method5025("3g{d\u00199x!fX")), method5026(method5025("3g{\u001aX")), method5026(method5025("3g{\u0019X")), method5026(method5025(",?{v\r")), method5026(method5025("9d94")), method5026(method5025("3g{,\u001f\u0004e'1\u001e09")) };

    @OriginalMember(owner = "client!dv", name = "i", descriptor = "Z")
    public static boolean field9935 = false;

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "S")
    public static short field9939 = 256;

    @OriginalMember(owner = "client!dv", name = "g", descriptor = "I")
    public static int field9933;

    @OriginalMember(owner = "client!dv", name = "e", descriptor = "I")
    public static int field9937;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "I")
    public static int field9938;

    @OriginalMember(owner = "client!dv", name = "h", descriptor = "I")
    public static int field9940;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lib;B)Ljava/lang/String;", line = 10)
    public static final String method5023(class163 arg0, byte arg1) {
        try {
            field9938++;
            return arg1 == 124 ? class43.method293(125, 32767, arg0) : null;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9942[2] + (arg0 == null ? field9942[4] : field9942[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dv", name = "toString", descriptor = "()Ljava/lang/String;", line = 23)
    public final String toString() {
        try {
            field9937++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9942[5] + ')');
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V", line = 38)
    public static final void method5024(int arg0) {
        try {
            if (class494.field7096 < 0) {
                class348.field5385 = -1;
                class388.field5859 = -1;
                class494.field7096 = 0;
            }
            field9933++;
            if (class161.field2173 < class494.field7096) {
                class388.field5859 = -1;
                class494.field7096 = class161.field2173;
                class348.field5385 = -1;
            }
            if (class560.field8334 < 0) {
                class348.field5385 = -1;
                class388.field5859 = -1;
                class560.field8334 = 0;
            }
            if (class560.field8334 > class161.field2172) {
                class348.field5385 = -1;
                class388.field5859 = -1;
                class560.field8334 = class161.field2172;
            }
            if (arg0 != -1) {
                field9935 = false;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9942[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(IIII)V", line = 84)
    public class685(int arg0, int arg1, int arg2, int arg3) {
        try {
            this.field9934 = arg2;
            this.field9932 = arg0;
            this.field9941 = arg3;
            this.field9936 = arg1;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field9942[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!dv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5025(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x70);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5026(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 87;
                    break;
                case 1:
                    var10005 = 17;
                    break;
                case 2:
                    var10005 = 85;
                    break;
                case 3:
                    var10005 = 88;
                    break;
                default:
                    var10005 = 112;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
