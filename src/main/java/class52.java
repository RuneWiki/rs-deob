import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tja")
public class class52 extends class627 {

    @OriginalMember(owner = "client!tja", name = "n", descriptor = "I")
    private int field733 = -1;

    @OriginalMember(owner = "client!tja", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field735 = new String[] { method563(method562("\r mj\u0011Q")), method563(method562("\u0002d\"j.")), method563(method562("\u0017?`(")), method563(method562("\r mj\u0012Q")), method563(method562("\r mj\u0016Q")), method563(method562("\r mj\u0017Q")), method563(method562("\r mj\u0010Q")) };

    @OriginalMember(owner = "client!tja", name = "r", descriptor = "[I")
    public static int[] field732 = new int[13];

    @OriginalMember(owner = "client!tja", name = "p", descriptor = "I")
    public static int field731 = 1;

    @OriginalMember(owner = "client!tja", name = "m", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!tja", name = "q", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!tja", name = "o", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "(BLig;Lig;)V", line = 4)
    public static final void method559(byte arg0, class687 arg1, class687 arg2) {
        try {
            field730++;
            int var3 = -107 / ((arg0 - 38) / 48);
            if (arg1.field9627 != null) {
                arg1.method4911(127);
            }
            arg1.field9626 = arg2;
            arg1.field9627 = arg2.field9627;
            arg1.field9627.field9626 = arg1;
            arg1.field9626.field9627 = arg1;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field735[3] + arg0 + ',' + (arg1 == null ? field735[2] : field735[1]) + ',' + (arg2 == null ? field735[2] : field735[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "(Ljc;I)V", line = 21)
    public final void method97(class711 arg0, int arg1) {
        try {
            field734++;
            if (arg1 >= -97) {
                this.method97(null, -3);
            }
            this.field733 = arg0.method5116((byte) -117);
            arg0.method5128(0);
            if (arg0.method5128(0) != 255) {
                arg0.field9945--;
                arg0.method5147((byte) 72);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field735[5] + (arg0 == null ? field735[2] : field735[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "(Lkj;I)V", line = 51)
    public final void method96(class26 arg0, int arg1) {
        try {
            arg0.method300(1, this.field733);
            int var3 = 71 % ((arg1 - 44) / 34);
            field729++;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field735[6] + (arg0 == null ? field735[2] : field735[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "(II)I", line = 67)
    public static int method560(int arg0, int arg1) {
        try {
            return arg0 ^ arg1;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field735[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "(I)V", line = 76)
    public static void method561(int arg0) {
        try {
            field732 = null;
            int var1 = -120 / ((arg0 + 84) / 35);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field735[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method562(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x53);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method563(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 121;
                    break;
                case 1:
                    var10005 = 74;
                    break;
                case 2:
                    var10005 = 12;
                    break;
                case 3:
                    var10005 = 68;
                    break;
                default:
                    var10005 = 83;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
