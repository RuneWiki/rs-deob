import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class312 extends class650 {

    @OriginalMember(owner = "client!hs", name = "H", descriptor = "[Ljava/lang/String;")
    private static final String[] field4292 = new String[] { method2494(method2493("\u000eX2J\u0013")), method2494(method2493("\u000eX2@\u0013")), method2494(method2493("\b^pe")), method2494(method2493("\u000eX2A\u0013")), method2494(method2493("\u001d\u00052'F")), method2494(method2493("\u000eX2N\u0013")) };

    @OriginalMember(owner = "client!hs", name = "E", descriptor = "Lsb;")
    public static class261 field4287 = new class261(15, 10);

    @OriginalMember(owner = "client!hs", name = "G", descriptor = "[I")
    public static int[] field4290 = new int[5];

    @OriginalMember(owner = "client!hs", name = "F", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!hs", name = "D", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!hs", name = "C", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "([[FI[[S)[[S")
    public static final short[][] method2489(float[][] arg0, int arg1, short[][] arg2) {
        try {
            ++field4291;
            int var3 = 0;
            int var4 = -2 % ((-23 - arg1) / 49);
            while (~var3 > ~arg0.length) {
                for (int var5 = 0; ~var5 > ~arg2[var3].length; ++var5) {
                    arg2[var3][var5] = (short) ((int) (arg0[var3][var5] * 16383.0F));
                }
                ++var3;
            }
            return arg2;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field4292[3] + (arg0 != null ? field4292[4] : field4292[2]) + ',' + arg1 + ',' + (arg2 != null ? field4292[4] : field4292[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(B)V")
    public static void method2490(byte arg0) {
        try {
            if (arg0 >= 19) {
                field4290 = null;
                field4287 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4292[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIII)V")
    public final void method2491(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            ++field4288;
            if (arg0 != 1) {
                field4287 = null;
            }
            int var6 = super.field9242.method1378();
            int var7 = ((class598) super.field3830).field8590 * class87.method867(-56) / 10 % var6;
            super.field9242.method3075(-var6 + arg4 + var7, arg2, arg3 - -var6 + -var7, arg1);
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field4292[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "(B)V")
    public static final void method2492(byte arg0) {
        try {
            ++field4289;
            if (arg0 == -91) {
                for (class617 var1 = (class617) class463.field6759.method3977((byte) -35); var1 != null; var1 = (class617) class463.field6759.method3987(arg0 + 91)) {
                    class242 var2 = var1.field8800;
                    var2.method2001((byte) 15, class393.field5721);
                    if (var2.method1995((byte) -76)) {
                        var1.method4294(0);
                        var2.method1998(arg0 + 90);
                    } else if (var2.method1996(0)) {
                        class90.method889(var2, true);
                    }
                }
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4292[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Llga;Llga;Lsm;)V")
    public class312(class47 arg0, class47 arg1, class598 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!hs", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2493(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 59);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hs", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2494(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 102;
                    break;
                case 1:
                    var10005 = 43;
                    break;
                case 2:
                    var10005 = 28;
                    break;
                case 3:
                    var10005 = 9;
                    break;
                default:
                    var10005 = 59;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
