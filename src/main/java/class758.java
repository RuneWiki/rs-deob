import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public abstract class class758 extends class299 {

    @OriginalMember(owner = "client!cm", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11001 = new String[] { method5497(method5496("9hl\u0013O")), method5497(method5496("9hl\u0012O")), method5497(method5496("9hl\u0015O")) };

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "Ldv;")
    public static class685 field10999 = new class685(4, 1, 1, 1);

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
    public static int field10998;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
    public static int field11000;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)V", line = 3)
    public static void method5493(int arg0) {
        try {
            if (arg0 > 67) {
                field10999 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field11001[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "(I)V", line = 17)
    public static final void method5494(int arg0) {
        try {
            field11000++;
            if (arg0 != 10268) {
                field10999 = null;
            }
            class178 var1 = class514.field7406;
            synchronized (class514.field7406) {
                class514.field7406.method1559(0);
            }
            class178 var2 = class548.field8184;
            synchronized (class548.field8184) {
                class548.field8184.method1559(0);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field11001[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(BIIII)V", line = 37)
    public static final void method5495(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field10998++;
            if (class166.field2283 == 1) {
                int var5 = arg4 / class283.field4239;
                int var6 = arg3 / class283.field4239;
                int var7 = arg2 / class335.field5236;
                if (arg0 == 50) {
                    int var8 = arg1 / class335.field5236;
                    if (var5 < class187.field2571 && var6 >= 0 && class601.field8825 > var7 && var8 >= 0) {
                        if (class187.field2571 <= var6) {
                            var6 = class187.field2571 - 1;
                        }
                        if (var5 < 0) {
                            var5 = 0;
                        }
                        if (var7 < 0) {
                            var7 = 0;
                        }
                        if (class601.field8825 <= var8) {
                            var8 = class601.field8825 - 1;
                        }
                        for (int var9 = var7; var9 <= var8; var9++) {
                            int var10 = class192.method1647(class601.field8825, class548.field8188 + var9, (byte) 127) * class187.field2571;
                            for (int var11 = var5; var11 <= var6; var11++) {
                                int var12 = class192.method1647(class187.field2571, class772.field11216 + var11, (byte) 127) + var10;
                                class1.field5[var12] = class702.field10205;
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field11001[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)Lod;")
    public abstract class532 method1814(int arg0);

    @OriginalMember(owner = "client!cm", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5496(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x67);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cm", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5497(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 90;
                    break;
                case 1:
                    var10005 = 5;
                    break;
                case 2:
                    var10005 = 66;
                    break;
                case 3:
                    var10005 = 81;
                    break;
                default:
                    var10005 = 103;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
