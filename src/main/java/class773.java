import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class773 {

    @OriginalMember(owner = "client!qc", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11242 = new String[] { method5605(method5604("\u001f>k%x")), method5605(method5604("\u001f>k&x")), method5605(method5604("\u001f>k'x")) };

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field11239 = 0;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field11238;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field11240;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field11241;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)Leh;")
    public static final class379 method5601(int arg0, int arg1) {
        try {
            field11241++;
            class379[] var2 = class544.method4110(arg1 - 182);
            for (int var3 = 0; var3 < var2.length; var3++) {
                class379 var4 = var2[var3];
                if (var4.field5768 == arg0) {
                    return var4;
                }
            }
            if (arg1 != 65) {
                field11239 = -100;
            }
            return null;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field11242[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IC)Z")
    public static final boolean method5602(int arg0, char arg1) {
        try {
            field11238++;
            if (arg0 != 695) {
                field11239 = -117;
            }
            return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field11242[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZB)V")
    public static final void method5603(boolean arg0, byte arg1) {
        try {
            if (arg1 < 100) {
                method5601(10, 27);
            }
            field11240++;
            class671.field9745++;
            class280 var2 = class610.method4508(class282.field4230, class279.field4190, (byte) 30);
            class106.method934((byte) 53, var2);
            for (class454 var3 = (class454) class661.field9563.method971(347); var3 != null; var3 = (class454) class661.field9563.method973(true)) {
                if (!var3.method1823(0)) {
                    var3 = (class454) class661.field9563.method971(347);
                    if (var3 == null) {
                        break;
                    }
                }
                if (var3.field6635 == 0) {
                    class440.method3381(var3, 0, true, arg0);
                }
            }
            if (class502.field7260 != null) {
                class115.method1013(true, class502.field7260);
                class502.field7260 = null;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field11242[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qc", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5604(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x50);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qc", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5605(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 110;
                    break;
                case 1:
                    var10005 = 93;
                    break;
                case 2:
                    var10005 = 69;
                    break;
                case 3:
                    var10005 = 100;
                    break;
                default:
                    var10005 = 80;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
