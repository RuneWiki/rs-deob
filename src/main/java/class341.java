import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class341 {

    @OriginalMember(owner = "client!wu", name = "j", descriptor = "I")
    public int field4511 = -1;

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "Z")
    public static boolean field4503 = false;

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "I")
    public int field4504;

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "I")
    public int field4506;

    @OriginalMember(owner = "client!wu", name = "f", descriptor = "I")
    public int field4507;

    @OriginalMember(owner = "client!wu", name = "g", descriptor = "I")
    public int field4508;

    @OriginalMember(owner = "client!wu", name = "h", descriptor = "I")
    public int field4509;

    @OriginalMember(owner = "client!wu", name = "i", descriptor = "I")
    public int field4510;

    @OriginalMember(owner = "client!wu", name = "k", descriptor = "I")
    public int field4512;

    @OriginalMember(owner = "client!wu", name = "l", descriptor = "I")
    public int field4513;

    @OriginalMember(owner = "client!wu", name = "m", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "[[Z")
    public static boolean[][] field4502;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILjn;)I", line = 7)
    public static final int method1961(int arg0, class668 arg1) {
        field4514++;
        int var2 = arg0;
        if (arg1.method3802(class589.field8540, (byte) -94)) {
            var2 = arg0 + 1;
        }
        if (arg1.method3802(class7.field75, (byte) 101)) {
            var2++;
        }
        if (arg1.method3802(class630.field9023, (byte) 107)) {
            var2++;
        }
        if (arg1.method3802(class244.field3332, (byte) 127)) {
            var2++;
        }
        if (arg1.method3802(class499.field6978, (byte) -71)) {
            var2++;
        }
        if (arg1.method3802(class359.field4785, (byte) 121)) {
            var2++;
        }
        if (arg1.method3802(class137.field1739, (byte) -61)) {
            var2++;
        }
        if (arg1.method3802(class320.field4214, (byte) 126)) {
            var2++;
        }
        if (arg1.method3802(class427.field6131, (byte) 116)) {
            var2++;
        }
        if (arg1.method3802(class512.field7511, (byte) 121)) {
            var2++;
        }
        if (arg1.method3802(class533.field7784, (byte) -43)) {
            var2++;
        }
        if (arg1.method3802(class610.field8748, (byte) 110)) {
            var2++;
        }
        if (arg1.method3802(class182.field2224, (byte) 104)) {
            var2++;
        }
        if (arg1.method3802(class66.field1030, (byte) 114)) {
            var2++;
        }
        if (arg1.method3802(class357.field4764, (byte) -120)) {
            var2++;
        }
        if (arg1.method3802(class155.field1897, (byte) 108)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)V", line = 94)
    public static void method1962(byte arg0) {
        if (arg0 == 126) {
            field4502 = null;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIB[B)[B", line = 107)
    public static final byte[] method1963(int arg0, int arg1, byte arg2, byte[] arg3) {
        if (arg2 > -49) {
            return null;
        } else {
            field4505++;
            byte[] var4 = new byte[arg1];
            class252.method1545(arg3, arg0, var4, 0, arg1);
            return var4;
        }
    }
}
