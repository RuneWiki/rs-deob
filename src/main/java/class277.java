import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class277 extends class288 {

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "J")
    public long field4206;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "Ljj;")
    public static class26 field4207 = new class26(0, 0);

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "Lrc;")
    public static class9 field4211 = new class9(100);

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "Ljava/lang/String;")
    public static String field4212 = "flash2:";

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "[[B")
    public static byte[][] field4210;

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V")
    public class277() {
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(J)V")
    public class277(long arg0) {
        this.field4206 = arg0;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZ)V")
    public static final void method1787(int arg0, boolean arg1) {
        class39.field470 = new int[104];
        if (arg0 > -100) {
            method1788(-44);
        }
        class2.field30 = 99;
        class95.field1274 = new int[104];
        field4208++;
        class44.field525 = new int[104];
        class204.field2909 = new int[104];
        class287.field4478 = new int[5];
        class4.field57 = new int[104];
        byte var2;
        if (arg1) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class93.field1254 = new byte[var2][104][104];
        class27.field324 = new byte[var2][104][104];
        class64.field751 = new int[var2][105][105];
        class263.field3812 = new byte[var2][105][105];
        class143.field2044 = new byte[var2][104][104];
        class53.field602 = new byte[var2][104][104];
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)V")
    public static void method1788(int arg0) {
        field4207 = null;
        field4211 = null;
        if (arg0 != 29910) {
            field4207 = null;
        }
        field4212 = null;
        field4210 = null;
    }
}
