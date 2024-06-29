import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class422 extends class756 implements class322 {

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    private int field6657;

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6664 = new String[] { method3358(method3357(" d:='")), method3358(method3357(":sx\u0012")), method3358(method3357("/(:Pr")), method3358(method3357(" d:?'")), method3358(method3357(" d:8'")), method3358(method3357(" d:Bf:o`@'")), method3358(method3357(" d:9'")), method3358(method3357(" d:;'")), method3358(method3357(" d::'")) };

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "Lko;")
    public static class532 field6658 = new class532("", 17);

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "Lvn;")
    public static class330 field6663 = new class330(36, 7);

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field6656;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field6659;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field6660;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public static int field6661;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field6662;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)V", line = 4)
    public static final void method3355(int arg0) {
        try {
            if (arg0 != 1) {
                field6663 = null;
            }
            ++field6660;
            class117 var1 = class185.field2948.field2660;
            while (var1.method1164(arg0 ^ 9, class185.field2948.field2663) >= 15) {
                int var2 = var1.method1163(15, -98);
                if (~var2 == -32768) {
                    break;
                }
                boolean var3 = false;
                class19 var4 = (class19) class176.field2797.method737((byte) -39, (long) var2);
                if (var4 == null) {
                    class426 var5 = new class426();
                    var5.field1129 = var2;
                    var4 = new class19(var5);
                    class176.field2797.method738(var4, (long) var2, -12002);
                    var3 = true;
                    class78.field1214[class421.field6647++] = var4;
                }
                class426 var6 = var4.field194;
                class263.field4278[class632.field9088++] = var2;
                var6.field1106 = class245.field3794;
                if (var6.field6716 != null && var6.field6716.method1528(0)) {
                    class277.method2376(var6, (byte) 114);
                }
                int var7 = (1975517191 & var1.method1163(3, -118) - -4) << 11;
                var6.method3382(0, class395.field6267.method3142(var1.method1163(14, 98), (byte) 80));
                int var8 = var1.method1163(5, -93);
                if (~var8 < -16) {
                    var8 -= 32;
                }
                int var9 = var1.method1163(1, -82);
                int var10 = var1.method1163(2, -115);
                int var11 = var1.method1163(5, 97);
                if (var11 > 15) {
                    var11 -= 32;
                }
                int var12 = var1.method1163(1, -80);
                if (~var12 == -2) {
                    class794.field11606[class149.field2088++] = var2;
                }
                var6.method803((byte) -127, var6.field6716.field2572);
                var6.field1145 = var6.field6716.field2624 << 3;
                if (var3) {
                    var6.method808(true, -95, var7);
                }
                var6.method3381(class438.field6846.field1201[0] + var11, var9 == 1, class438.field6846.field1200[0] + var8, var6.method804(true), var10, 19);
                if (var6.field6716.method1528(0)) {
                    class615.method4474(var6, (class362) null, (byte) -74, 0, var6.field9975, var6.field1201[0], (class738) null, var6.field1200[0]);
                }
            }
            var1.method1160(7);
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field6664[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIZ[B)V", line = 87)
    public final void method623(int arg0, int arg1, boolean arg2, byte[] arg3) {
        try {
            this.method5470(arg3, arg1);
            if (arg2) {
                method3355(-50);
            }
            ++field6662;
            this.field6657 = arg0;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field6664[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field6664[2] : field6664[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)J", line = 100)
    public final long method620(int arg0) {
        try {
            ++field6661;
            if (arg0 != 1963) {
                field6663 = null;
            }
            return super.field11114.getAddress();
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6664[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)I", line = 111)
    public final int method621(int arg0) {
        try {
            ++field6659;
            if (arg0 > -7) {
                this.method619(90);
            }
            return 0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6664[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)I", line = 124)
    public final int method619(int arg0) {
        try {
            ++field6656;
            if (arg0 != -14976) {
                this.method623(-108, 84, false, (byte[]) null);
            }
            return this.field6657;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6664[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lvf;I[BI)V", line = 142)
    public class422(class159 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        try {
            this.field6657 = arg1;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field6664[5] + (arg0 != null ? field6664[2] : field6664[1]) + ',' + arg1 + ',' + (arg2 != null ? field6664[2] : field6664[1]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V", line = 153)
    public static void method3356(byte arg0) {
        try {
            field6663 = null;
            field6658 = null;
            if (arg0 != 35) {
                method3356((byte) 1);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6664[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3357(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 15);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3358(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 84;
                    break;
                case 1:
                    var10005 = 6;
                    break;
                case 2:
                    var10005 = 20;
                    break;
                case 3:
                    var10005 = 126;
                    break;
                default:
                    var10005 = 15;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
