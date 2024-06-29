import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class301 extends class128 {

    @OriginalMember(owner = "client!c", name = "n", descriptor = "[B")
    public byte[] field4813;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "I")
    public static int field4815 = -1;

    @OriginalMember(owner = "client!c", name = "r", descriptor = "[I")
    public static int[] field4817 = new int[2500];

    @OriginalMember(owner = "client!c", name = "m", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "[[[B")
    public static byte[][][] field4814;

    @OriginalMember(owner = "client!c", name = "s", descriptor = "[[[B")
    public static byte[][][] field4818;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BI)Lgg;")
    public static final class129 method1988(byte arg0, int arg1) {
        class129 var2 = (class129) class212.field3508.method1261(0, (long) arg1);
        field4816++;
        if (var2 != null) {
            return var2;
        }
        int var3 = -111 % ((arg0 - 65) / 54);
        byte[] var4 = class229.field3697.method1680(arg1, 16, -110);
        class129 var5 = new class129();
        if (var4 != null) {
            var5.method914(-9, new class162(var4));
        }
        class212.field3508.method1264(-1, (long) arg1, var5);
        return var5;
    }

    @OriginalMember(owner = "client!c", name = "f", descriptor = "(I)V")
    public static void method1989(int arg0) {
        field4814 = null;
        if (arg0 != -1) {
            method1989(69);
        }
        field4817 = null;
        field4818 = null;
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "([B)V")
    public class301(byte[] arg0) {
        this.field4813 = arg0;
    }
}
