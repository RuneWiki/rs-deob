import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class168 {

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "B")
    public byte field2718;

    @OriginalMember(owner = "client!aq", name = "e", descriptor = "I")
    public int field2716;

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "I")
    public int field2712;

    @OriginalMember(owner = "client!aq", name = "k", descriptor = "S")
    public short field2714;

    @OriginalMember(owner = "client!aq", name = "g", descriptor = "S")
    public short field2715;

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "I")
    public int field2713;

    @OriginalMember(owner = "client!aq", name = "i", descriptor = "Z")
    public boolean field2722;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "S")
    public short field2717;

    @OriginalMember(owner = "client!aq", name = "f", descriptor = "I")
    public int field2719;

    @OriginalMember(owner = "client!aq", name = "l", descriptor = "I")
    public int field2711;

    @OriginalMember(owner = "client!aq", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2723 = new String[] { method1569(method1568("-tb9c")), method1569(method1568("-tbD\"\"l8Fc")) };

    @OriginalMember(owner = "client!aq", name = "h", descriptor = "I")
    public static int field2721 = 64;

    @OriginalMember(owner = "client!aq", name = "j", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(B)I")
    public static final int method1567(byte arg0) {
        try {
            field2720++;
            if (class184.field2931 == 1) {
                return class82.field1244;
            } else {
                int var1 = -112 / ((arg0 + 12) / 61);
                return class263.field4279;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2723[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        try {
            this.field2718 = (byte) arg8;
            this.field2716 = arg11;
            this.field2712 = arg2;
            this.field2714 = (short) arg4;
            this.field2715 = (short) arg5;
            this.field2713 = arg3;
            this.field2722 = arg10;
            this.field2717 = (short) arg6;
            this.field2719 = arg1;
            this.field2711 = arg0;
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field2723[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!aq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1568(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!aq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1569(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 76;
                    break;
                case 1:
                    var10005 = 5;
                    break;
                case 2:
                    var10005 = 76;
                    break;
                case 3:
                    var10005 = 120;
                    break;
                default:
                    var10005 = 75;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
