import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class523 extends class299 {

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7733 = new String[] { method3915(method3914("t*\u0004h\u0001")), method3915(method3914("bm\u0004\u000fT")), method3915(method3914("w6FM")), method3915(method3914("t*\u0004i\u0001")), method3915(method3914("t*\u0004c\u0001")), method3915(method3914("t*\u0004f\u0001")), method3915(method3914("t*\u0004`\u0001")), method3915(method3914("t*\u0004g\u0001")), method3915(method3914("t*\u0004b\u0001")), method3915(method3914("t*\u0004d\u0001")), method3915(method3914("t*\u0004e\u0001")) };

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
    public static int field7726 = -1;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "[I")
    public static int[] field7725 = new int[2];

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "[I")
    public static int[] field7729 = new int[1000];

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
    public static int field7722;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
    public static int field7723;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    public static int field7724;

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "I")
    public static int field7727;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "I")
    public static int field7728;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "I")
    public static int field7730;

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "I")
    public static int field7731;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
    public static int field7732;

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Les;)V")
    public class523(class404 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I[BB)I")
    public static final int method3909(int arg0, byte[] arg1, byte arg2) {
        try {
            if (arg2 > -22) {
                field7725 = null;
            }
            ++field7730;
            return class295.method2539(1, 0, arg1, arg0);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7733[0] + arg0 + ',' + (arg1 != null ? field7733[1] : field7733[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IZ)V")
    public final void method846(int arg0, boolean arg1) {
        try {
            super.field4849 = arg0;
            if (arg1) {
                field7726 = 31;
            }
            ++field7731;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7733[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "(I)V")
    public static void method3910(int arg0) {
        try {
            field7729 = null;
            field7725 = null;
            if (arg0 != 1) {
                method3910(11);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7733[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(Z)I")
    public final int method3911(boolean arg0) {
        try {
            ++field7727;
            return !arg0 ? 39 : super.field4849;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7733[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILjava/net/Socket;I)Lcca;")
    public static final class258 method3912(int arg0, Socket arg1, int arg2) throws IOException {
        try {
            if (arg2 != 0) {
                method3909(69, (byte[]) null, (byte) 22);
            }
            ++field7732;
            return new class501(arg1, arg0);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7733[3] + arg0 + ',' + (arg1 != null ? field7733[1] : field7733[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)I")
    public final int method847(int arg0) {
        try {
            ++field7724;
            if (arg0 != 0) {
                field7729 = null;
            }
            return 1;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7733[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)Z")
    public final boolean method3913(int arg0) {
        try {
            ++field7723;
            if (arg0 != 3) {
                field7725 = null;
            }
            if (super.field4850.method3245((byte) -58)) {
                return false;
            } else {
                return super.field4850.method3243(-99) == class229.field3561;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7733[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V")
    public final void method848(int arg0) {
        try {
            if (super.field4850.method3243(arg0 ^ 20411) == class229.field3561) {
                if (super.field4850.method3245((byte) -58)) {
                    super.field4849 = 0;
                }
            } else {
                super.field4849 = 1;
            }
            ++field7722;
            if (arg0 == -20456) {
                if (~super.field4849 != -1 && ~super.field4849 != -2) {
                    super.field4849 = this.method847(0);
                }
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7733[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(ILes;)V")
    public class523(int arg0, class404 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)I")
    public final int method852(int arg0, int arg1) {
        try {
            if (arg0 != 1) {
                field7725 = null;
            }
            ++field7728;
            if (super.field4850.method3245((byte) -58)) {
                return 3;
            } else {
                return super.field4850.method3243(-116) == class229.field3561 ? 1 : 3;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7733[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3914(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 41);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3915(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 25;
                    break;
                case 1:
                    var10005 = 67;
                    break;
                case 2:
                    var10005 = 42;
                    break;
                case 3:
                    var10005 = 33;
                    break;
                default:
                    var10005 = 41;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
