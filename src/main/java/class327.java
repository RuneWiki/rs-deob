import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class327 implements class93 {

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field4548 = 0;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "[[B")
    public static byte[][] field4547 = new byte[50][];

    @OriginalMember(owner = "client!df", name = "d", descriptor = "Leda;")
    public static class116 field4549 = new class116(53, 2);

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field4551 = 0;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([ILdc;JZ)Ljava/lang/String;")
    public final String method693(int[] arg0, class303 arg1, long arg2, boolean arg3) {
        field4550++;
        if (class7.field67 == arg1) {
            class363 var6 = class103.field1706.method3096(arg0[0], (byte) 123);
            return var6.method2184((int) arg2, (byte) -86);
        } else if (class40.field541 == arg1 || class432.field6162 == arg1) {
            class432 var7 = class430.field6132.method42((int) arg2, false);
            return var7.field6194;
        } else if (class99.field1476 == arg1 || class620.field8837 == arg1 || class550.field8065 == arg1) {
            return class103.field1706.method3096(arg0[0], (byte) 122).method2184((int) arg2, (byte) 23);
        } else {
            if (arg3) {
                field4551 = 92;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Z[BII)[B")
    public static final byte[] method1949(boolean arg0, byte[] arg1, int arg2, int arg3) {
        field4546++;
        byte[] var4 = new byte[arg3];
        class553.method3242(arg1, arg2, var4, 0, arg3);
        if (!arg0) {
            field4549 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public static void method1950(int arg0) {
        field4549 = null;
        if (arg0 != -29564) {
            field4547 = null;
        }
        field4547 = null;
    }
}
