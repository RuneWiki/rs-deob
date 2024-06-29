import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class187 extends class325 {

    @OriginalMember(owner = "client!mu", name = "G", descriptor = "Ljava/lang/Object;")
    private Object field2649;

    @OriginalMember(owner = "client!mu", name = "C", descriptor = "[I")
    public static int[] field2648 = new int[25];

    @OriginalMember(owner = "client!mu", name = "S", descriptor = "[Z")
    public static boolean[] field2653 = new boolean[100];

    @OriginalMember(owner = "client!mu", name = "Q", descriptor = "Liu;")
    public static class390 field2651 = new class390(46, 4);

    @OriginalMember(owner = "client!mu", name = "V", descriptor = "I")
    public static int field2656 = -1;

    @OriginalMember(owner = "client!mu", name = "I", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!mu", name = "R", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!mu", name = "T", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!mu", name = "U", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!mu", name = "f", descriptor = "(I)V")
    public static void method1172(int arg0) {
        field2648 = null;
        field2653 = null;
        if (arg0 > 116) {
            field2651 = null;
        }
    }

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "(I)Z")
    public final boolean method728(int arg0) {
        field2654++;
        int var2 = 50 % ((arg0 - 13) / 58);
        return false;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)V")
    public static final void method1173(String arg0, String arg1, int arg2, int arg3) {
        class219.field3091 = arg1;
        class46.field693 = arg3;
        class221.field3121 = arg0;
        field2652++;
        if (class219.field3091.equals("") || class221.field3121.equals("")) {
            class384.field5705 = 3;
        } else if (class128.field1631 == -1) {
            class327.field4765 = 1;
            class384.field5705 = -3;
            class7.field124 = 0;
            class115.field1485 = 0;
            class156 var4 = new class156(arg2);
            var4.method947(-106, 10);
            var4.method969(arg2 + 19741, (int) (Math.random() * 9.9999999E7D));
            var4.method983(class422.method2505(65, class219.field3091), (byte) 104);
            var4.method969(arg2 ^ 0x4D1D, (int) (Math.random() * 9.9999999E7D));
            var4.method956(true, class221.field3121);
            var4.method969(19869, (int) (Math.random() * 9.9999999E7D));
            var4.method940(-114, class284.field4050, class230.field3224);
            class79.field1108.field2018 = 0;
            class79.field1108.method947(-54, class58.field899.field5608);
            class79.field1108.method947(-69, var4.field2018 + 2);
            class79.field1108.method961(582, arg2 + 1608339240);
            class79.field1108.method948(var4.field2041, 0, 2, var4.field2018);
        } else {
            class435.method2566(true);
        }
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(II)Lph;")
    public static final class438 method1174(int arg0, int arg1) {
        field2655++;
        int var2 = -91 / ((16 - arg1) / 36);
        class438[] var3 = class405.method2424((byte) 106);
        for (int var4 = 0; var4 < var3.length; var4++) {
            class438 var5 = var3[var4];
            if (var5.field6408 == arg0) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lqa;Ljava/lang/Object;I)V")
    public class187(class155 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field2649 = arg1;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public final Object method729(int arg0) {
        int var2 = 73 % ((arg0 + 32) / 46);
        field2650++;
        return this.field2649;
    }
}
