import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class102 extends class264 {

    @OriginalMember(owner = "client!uk", name = "jb", descriptor = "[I")
    public static int[] field1523 = new int[100];

    @OriginalMember(owner = "client!uk", name = "fb", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!uk", name = "hb", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!uk", name = "ib", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!uk", name = "kb", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!uk", name = "gb", descriptor = "Ljava/awt/Image;")
    public static Image field1520;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(II)V", line = 6)
    public static final void method646(int arg0, int arg1) {
        if (arg1 <= 19) {
            method646(35, 120);
        }
        field1522++;
        if (class213.field3393 == arg0 && arg0 != 0) {
            class25 var2 = class101.field1508[arg0];
            var2.method16(class276.field4706);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZLni;Lni;)V", line = 31)
    public static final void method647(boolean arg0, class202 arg1, class202 arg2) {
        class81.field1264 = arg2;
        class228.field3788 = arg1;
        field1521++;
        if (arg0) {
            method647(false, (class202) null, (class202) null);
        }
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "(B)V", line = 44)
    public static void method648(byte arg0) {
        int var1 = -114 / ((arg0 + 38) / 43);
        field1520 = null;
        field1523 = null;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "([BI)[B", line = 60)
    public static final byte[] method649(byte[] arg0, int arg1) {
        field1519++;
        if (arg0 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg0.length];
            class42.method296(arg0, 0, var2, arg1, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(II)[I", line = 76)
    public final int[] method5(int arg0, int arg1) {
        field1524++;
        if (arg0 > -58) {
            field1523 = (int[]) null;
        }
        return class251.field4159;
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "()V", line = 87)
    public class102() {
        super(0, true);
    }
}
