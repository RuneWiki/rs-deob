import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class549 extends class728 {

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "[Laia;")
    public class240[] field8192;

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8194 = new String[] { method4142(method4141("\u000f\u0019\u000e\u0014T\u0012\u0016T\u0016\u0015")), method4142(method4141("\u0012\nLD")), method4142(method4141("\u0007Q\u000e\u0006@")), method4142(method4141("\u000f\u0019\u000em\u0015")), method4142(method4141("\u000f\u0019\u000el\u0015")) };

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "[Lkl;")
    public static class87[] field8193 = new class87[14];

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public static int field8191;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "[[[Z")
    public static boolean[][][] field8190;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
    public static void method4139(byte arg0) {
        try {
            field8190 = null;
            if (arg0 == 81) {
                field8193 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8194[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZ)V")
    public static final void method4140(int arg0, boolean arg1) {
        try {
            class318.method2691(1);
            field8191++;
            if (class179.method1573((byte) 101, class138.field1645)) {
                class157.field1961++;
                if (arg0 <= -18 && class157.field1961 >= 50 || arg1) {
                    class157.field1961 = 0;
                    if (!class248.field3876 && class629.field9198 != null) {
                        class375.field5713++;
                        class280 var2 = class610.method4508(class179.field2490, class279.field4190, (byte) -93);
                        class106.method934((byte) 53, var2);
                        try {
                            class443.method3401(-1);
                        } catch (IOException var4) {
                            class248.field3876 = true;
                        }
                    }
                    class318.method2691(1);
                }
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field8194[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "([Laia;)V")
    public class549(class240[] arg0) {
        try {
            this.field8192 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8194[0] + (arg0 == null ? field8194[1] : field8194[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4141(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4142(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 124;
                    break;
                case 1:
                    var10005 = 127;
                    break;
                case 2:
                    var10005 = 32;
                    break;
                case 3:
                    var10005 = 40;
                    break;
                default:
                    var10005 = 61;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
