import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public abstract class class299 {

    @OriginalMember(owner = "client!ol", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4711 = new String[] { method2525(method2524("Q:,7)")), method2525(method2524("_4")), method2525(method2524("Q:,6)")) };

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "Lwia;")
    public static class790 field4708 = new class790(74, 4);

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "[I")
    public static int[] field4709 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lda;)V")
    public static final void method2520(class67 arg0) {
        class210.field3216 = arg0;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)V")
    public static void method2521(boolean arg0) {
        try {
            field4708 = null;
            if (arg0) {
                field4709 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4711[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)Lmja;")
    public static final class440 method2522(int arg0) {
        try {
            field4710++;
            try {
                int var1 = -108 / ((5 - arg0) / 32);
                return (class440) Class.forName(field4711[1]).getDeclaredConstructor().newInstance();
            } catch (Throwable var3) {
                return new class24();
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4711[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "()V")
    public static final void method2523() {
        if (class443.field6508 != null) {
            for (int var0 = 0; var0 < class443.field6508.length; var0++) {
                for (int var1 = 0; var1 < class132.field1543; var1++) {
                    for (int var2 = 0; var2 < class216.field3296; var2++) {
                        if (class443.field6508[var0][var1][var2] != null) {
                            class443.field6508[var0][var1][var2].method810(-1);
                        }
                        class443.field6508[var0][var1][var2] = null;
                    }
                }
            }
        }
        class443.field6508 = null;
        class184.field2541 = null;
        if (class80.field907 != null) {
            for (int var3 = 0; var3 < class80.field907.length; var3++) {
                for (int var4 = 0; var4 < class132.field1543; var4++) {
                    for (int var5 = 0; var5 < class216.field3296; var5++) {
                        if (class80.field907[var3][var4][var5] != null) {
                            class80.field907[var3][var4][var5].method810(-1);
                        }
                        class80.field907[var3][var4][var5] = null;
                    }
                }
            }
        }
        class80.field907 = null;
        class195.field2617 = null;
        class734.field10683 = null;
        class555.field8261 = null;
        class91.field1038 = null;
        class11.field135 = null;
        class259.field4002 = null;
        class549.field8190 = null;
        class296.field4542 = null;
        class361.method2934((byte) 16);
        if (class400.field5975 != null) {
            for (int var6 = 0; var6 < class272.field4124; var6++) {
                class400.field5975[var6] = null;
            }
            class272.field4124 = 0;
        }
        class106.field1228 = null;
        class273.field4136 = null;
        class74.field862 = null;
        if (class776.field11278 != null) {
            for (int var7 = 0; var7 < class776.field11278.length; var7++) {
                class776.field11278[var7] = null;
            }
            class416.field6133 = 0;
        }
        if (class238.field3604 != null) {
            for (int var8 = 0; var8 < class238.field3604.length; var8++) {
                class238.field3604[var8] = null;
            }
            class116.field1384 = 0;
        }
        if (class96.field1076 != null) {
            for (int var9 = 0; var9 < class559.field8328; var9++) {
                class96.field1076[var9] = null;
            }
            for (int var10 = 0; var10 < class501.field7246; var10++) {
                for (int var11 = 0; var11 < class132.field1543; var11++) {
                    for (int var12 = 0; var12 < class216.field3296; var12++) {
                        class546.field8158[var10][var11][var12] = 0L;
                    }
                }
            }
            class559.field8328 = 0;
        }
        class104.method918(0);
        class675.field9785 = class675.field9788;
        class675.field9785.method1874(27105);
        class574.field8476 = null;
        class614.field8972 = null;
        class218.field3366 = null;
        if (class108.field1259 != null) {
            class554.method4167();
            class606.field8877.method536(1);
            class606.field8877.method510(0);
        }
        if (class180.field2498 != null) {
            class180.field2498 = null;
        }
        class606.field8877 = null;
    }

    @OriginalMember(owner = "client!ol", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2524(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ol", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2525(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 62;
                    break;
                case 1:
                    var10005 = 86;
                    break;
                case 2:
                    var10005 = 2;
                    break;
                case 3:
                    var10005 = 123;
                    break;
                default:
                    var10005 = 1;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
