import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uia")
public class class383 extends class376 implements class450 {

    @OriginalMember(owner = "client!uia", name = "p", descriptor = "I")
    private int field6148;

    @OriginalMember(owner = "client!uia", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6155 = new String[] { method3132(method3131("l>!:r")), method3132(method3131("byn:3~~f`1?")), method3132(method3131("yecx")), method3132(method3131("byn:N?")), method3132(method3131("byn:I?")), method3132(method3131("byn:L?")), method3132(method3131("byn:J?")), method3132(method3131("byn:H?")), method3132(method3131("byn:K?")), method3132(method3131("byn:M?")) };

    @OriginalMember(owner = "client!uia", name = "t", descriptor = "Z")
    public static boolean field6149 = false;

    @OriginalMember(owner = "client!uia", name = "s", descriptor = "I")
    public static int field6146;

    @OriginalMember(owner = "client!uia", name = "o", descriptor = "I")
    public static int field6147;

    @OriginalMember(owner = "client!uia", name = "l", descriptor = "I")
    public static int field6150;

    @OriginalMember(owner = "client!uia", name = "m", descriptor = "I")
    public static int field6151;

    @OriginalMember(owner = "client!uia", name = "q", descriptor = "I")
    public static int field6152;

    @OriginalMember(owner = "client!uia", name = "n", descriptor = "I")
    public static int field6153;

    @OriginalMember(owner = "client!uia", name = "r", descriptor = "I")
    public static int field6154;

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(IIIIIII)V", line = 4)
    public static final void method3129(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            ++field6154;
            if (class546.field8030 <= arg3 && ~arg0 >= ~class779.field11374 && ~arg2 <= ~class310.field5088 && class478.field7264 >= arg6) {
                if (arg4 == 1) {
                    class481.method3672(arg1, arg6, arg2, true, arg0, arg3);
                } else {
                    class220.method1945(arg2, arg6, arg3, arg0, arg1, arg4, arg5 ^ 1);
                }
            } else if (~arg4 != -2) {
                class785.method5646(arg4, arg6, arg2, arg1, arg3, arg0, 100);
            } else {
                class697.method5066(arg2, arg3, arg1, arg0, 100, arg6);
            }
            if (arg5 != 1) {
                field6149 = false;
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field6155[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(Z)V", line = 35)
    public static final void method3130(boolean arg0) {
        try {
            ++field6150;
            class141.method1315();
            for (int var1 = 0; ~var1 > -5; ++var1) {
                class297.field4841[var1].method4251(!arg0);
            }
            class95.method918((byte) 50);
            class688.method5007(-110);
            class678.method4936(arg0);
            System.gc();
            class662.field9437.method196();
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6155[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uia", name = "<init>", descriptor = "(Lvf;I[BIZ)V", line = 65)
    public class383(class159 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        try {
            this.field6148 = arg1;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field6155[1] + (arg0 != null ? field6155[0] : field6155[2]) + ',' + arg1 + ',' + (arg2 != null ? field6155[0] : field6155[2]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!uia", name = "<init>", descriptor = "(Lvf;ILjaclib/memory/Buffer;IZ)V", line = 77)
    public class383(class159 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        try {
            this.field6148 = arg1;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field6155[1] + (arg0 != null ? field6155[0] : field6155[2]) + ',' + arg1 + ',' + (arg2 != null ? field6155[0] : field6155[2]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(I[BII)V", line = 85)
    public final void method3028(int arg0, byte[] arg1, int arg2, int arg3) {
        try {
            this.method3097(arg1, arg0, 35040);
            ++field6147;
            int var5 = -122 % ((12 - arg3) / 50);
            this.field6148 = arg2;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field6155[3] + arg0 + ',' + (arg1 != null ? field6155[0] : field6155[2]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!uia", name = "b", descriptor = "(B)I", line = 96)
    public final int method3027(byte arg0) {
        try {
            ++field6152;
            if (arg0 <= 30) {
                this.field6148 = -32;
            }
            return super.field6097;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6155[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uia", name = "d", descriptor = "(I)V", line = 108)
    public final void method622(int arg0) {
        try {
            super.field6102.method1473(this, (byte) -103);
            if (arg0 != -26783) {
                this.method3027((byte) -58);
            }
            ++field6146;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6155[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(I)J", line = 119)
    public final long method3025(int arg0) {
        try {
            ++field6151;
            return arg0 < 14 ? -83L : 0L;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6155[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(B)I", line = 130)
    public final int method3024(byte arg0) {
        try {
            ++field6153;
            if (arg0 != 46) {
                this.field6148 = -128;
            }
            return this.field6148;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6155[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3131(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 15);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3132(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 23;
                    break;
                case 1:
                    var10005 = 16;
                    break;
                case 2:
                    var10005 = 15;
                    break;
                case 3:
                    var10005 = 20;
                    break;
                default:
                    var10005 = 15;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
