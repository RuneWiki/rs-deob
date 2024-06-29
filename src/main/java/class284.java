import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class284 extends class390 {

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "Ljava/lang/String;")
    public String field4009;

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "[[B")
    public static byte[][] field4008 = new byte[50][];

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "I")
    public static int field4010 = 2;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "[I")
    public static int[] field4005;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(B)V", line = 3)
    public static void method1852(byte arg0) {
        int var1 = 92 / ((arg0 + 24) / 52);
        field4008 = null;
        field4005 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lnq;Lnq;I)V", line = 22)
    public static final void method1853(class268 arg0, class268 arg1, int arg2) {
        client.field2281 = arg0;
        class99.field1377 = arg1;
        if (arg2 != 1000000) {
            field4005 = null;
        }
        field4007++;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)V", line = 36)
    public static final void method1854(int arg0, int arg1) {
        field4003++;
        class239 var2 = class436.method2740(1, arg0, -323285792);
        if (arg1 != -100001) {
            field4005 = null;
        }
        var2.method1628(14478);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 49)
    public static final String method1855(byte arg0, int arg1) {
        field4006++;
        if (arg1 < 100000) {
            return "<col=ffff00>" + arg1 + "</col>";
        } else if (arg1 < 10000000) {
            return "<col=ffffff>" + arg1 / 1000 + class21.field377.method2763(75, class250.field3540) + "</col>";
        } else {
            if (arg0 > -41) {
                method1855((byte) -124, 93);
            }
            return "<col=00ff80>" + arg1 / 1000000 + class282.field3985.method2763(100, class250.field3540) + "</col>";
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V", line = 69)
    public static final void method1856(int arg0) {
        if (arg0 != -5465) {
            method1856(-1);
        }
        field4004++;
        class286.field4032.method905((byte) 78);
        class376.field5368.method905((byte) 33);
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V", line = 81)
    public class284() {
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 83)
    public class284(String arg0, int arg1) {
        this.field4009 = arg0;
    }
}
