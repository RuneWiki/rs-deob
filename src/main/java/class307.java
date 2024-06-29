import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public abstract class class307 {

    @OriginalMember(owner = "client!gga", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4835 = new String[] { method2609(method2608("/-H9'")), method2609(method2608("3d\u00079\u001c|")), method2609(method2608(":v\n{")), method2609(method2608("3d\u00079\u0019|")), method2609(method2608("3d\u00079\u0018|")), method2609(method2608("3d\u00079\u001e|")) };

    @OriginalMember(owner = "client!gga", name = "d", descriptor = "[I")
    public static int[] field4832 = new int[14];

    @OriginalMember(owner = "client!gga", name = "c", descriptor = "[[Ljava/lang/String;")
    public static String[][] field4833 = new String[][] { { method2609(method2608("\u00192")), method2609(method2608("\u00191")), method2609(method2608("\u00072")), "F" }, { method2609(method2608("\u00192")), method2609(method2608("\u00191")), method2609(method2608("\u00190")), method2609(method2608("\u00072")), method2609(method2608("\u00071")), "F" }, { method2609(method2608("\u00192")), method2609(method2608("\u00191")), method2609(method2608("\u00190")), method2609(method2608("\u00197")), method2609(method2608("\u00072")), method2609(method2608("\u00071")), method2609(method2608("\u00070")), "F" } };

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!gga", name = "e", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "(I)V", line = 4)
    public static void method2604(int arg0) {
        try {
            field4833 = null;
            field4832 = null;
            if (arg0 != 14) {
                method2604(65);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4835[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(I)V", line = 15)
    public static final void method2605(int arg0) {
        try {
            class728.field10554.method970(-109);
            if (arg0 == 14) {
                field4830++;
                class251.field3894.method4069((byte) -72);
                class313.field4963.method4069((byte) -44);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4835[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(II)I", line = 38)
    public static final int method2606(int arg0, int arg1) {
        try {
            if (arg0 >= -109) {
                method2604(56);
            }
            field4834++;
            return arg1 >>> 8;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4835[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(IIILcn;)V", line = 49)
    public static final void method2607(int arg0, int arg1, int arg2, class541 arg3) {
        try {
            int var4 = -83 / ((arg1 + 65) / 50);
            field4831++;
            if (class69.field740 == null && !class216.field3297 && arg3 != null && class714.method5200(arg3, (byte) 123) != null) {
                class69.field740 = arg3;
                class533.field7816 = class714.method5200(arg3, (byte) 123);
                class31.field361 = 0;
                class338.field5270 = false;
                class322.field5074 = arg0;
                class491.field7041 = arg2;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field4835[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field4835[2] : field4835[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(BII)[B")
    public abstract byte[] method822(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "([BI)V")
    public abstract void method823(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(B)[B")
    public abstract byte[] method824(byte arg0);

    @OriginalMember(owner = "client!gga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2608(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2609(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 84;
                    break;
                case 1:
                    var10005 = 3;
                    break;
                case 2:
                    var10005 = 102;
                    break;
                case 3:
                    var10005 = 23;
                    break;
                default:
                    var10005 = 90;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
