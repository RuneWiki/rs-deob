import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class270 extends class38 {

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "[Ljava/lang/String;")
    private static final String[] field4110 = new String[] { method2241(method2240("W^w\u0019\u001a")), method2241(method2240("W^w\u001a\u001a")), method2241(method2240("\\\u0014wvO")), method2241(method2240("IO54")), method2241(method2240("W^w\u001b\u001a")), method2241(method2240("W^w\u001e\u001a")), method2241(method2240("W^w\u001c\u001a")) };

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "[B")
    private byte[] field4108;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V")
    public static final void method2235(int arg0) {
        try {
            field4109++;
            class523.field7643.method46(false);
            for (int var1 = 0; var1 < 32; var1++) {
                class681.field9868[var1] = 0L;
            }
            int var2 = 0;
            if (arg0 > 115) {
                while (var2 < 32) {
                    class236.field3556[var2] = 0L;
                    var2++;
                }
                class348.field5388 = 0;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4110[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBB)V")
    public final void method254(int arg0, byte arg1, byte arg2) {
        try {
            field4105++;
            if (arg2 == 14) {
                int var4 = arg0 * 2;
                int var8 = var4 + 1;
                this.field4108[var4] = -1;
                int var5 = arg1 & 0xFF;
                this.field4108[var8] = (byte) (var5 * 3 >> 5);
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field4110[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(Z)V")
    public static final void method2236(boolean arg0) {
        try {
            field4107++;
            if (!arg0) {
                class422.method3259(3829);
                class318.method2691(1);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4110[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILsg;)Ljava/lang/String;")
    public static final String method2237(int arg0, class417 arg1) {
        try {
            if (arg0 > -65) {
                method2235(67);
            }
            field4104++;
            if (arg1.field6152 == null || arg1.field6152.length() == 0) {
                return arg1.field6149 == null || arg1.field6149.length() <= 0 ? arg1.field6139 : arg1.field6139 + class309.field4879.method2616(false, class167.field2300) + arg1.field6149;
            } else if (arg1.field6149 == null || arg1.field6149.length() <= 0) {
                return arg1.field6139 + class309.field4879.method2616(false, class167.field2300) + arg1.field6152;
            } else {
                return arg1.field6139 + class309.field4879.method2616(false, class167.field2300) + arg1.field6149 + class309.field4879.method2616(false, class167.field2300) + arg1.field6152;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4110[1] + arg0 + ',' + (arg1 == null ? field4110[3] : field4110[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(III)V")
    public static final void method2238(int arg0, int arg1, int arg2) {
        class96 var3 = class734.field10683[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class645.method4748(var3.field1080);
        class645.method4748(var3.field1090);
        if (var3.field1080 != null) {
            var3.field1080 = null;
        }
        if (var3.field1090 != null) {
            var3.field1090 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIII)[B")
    public final byte[] method2239(int arg0, int arg1, int arg2, int arg3) {
        try {
            field4106++;
            this.field4108 = new byte[arg1 * arg2 * arg3 * 2];
            this.method1867(arg2, arg3, arg1, (byte) -112);
            if (arg0 <= 99) {
                method2237(-3, null);
            }
            return this.field4108;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field4110[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
    public class270() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2240(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x32);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2241(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 39;
                    break;
                case 1:
                    var10005 = 58;
                    break;
                case 2:
                    var10005 = 89;
                    break;
                case 3:
                    var10005 = 88;
                    break;
                default:
                    var10005 = 50;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
