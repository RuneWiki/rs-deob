import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class69 extends class382 {

    @OriginalMember(owner = "client!jt", name = "n", descriptor = "I")
    public static int field1393 = 1;

    @OriginalMember(owner = "client!jt", name = "j", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!jt", name = "k", descriptor = "I")
    public int field1390;

    @OriginalMember(owner = "client!jt", name = "l", descriptor = "I")
    public int field1391;

    @OriginalMember(owner = "client!jt", name = "m", descriptor = "I")
    public int field1392;

    @OriginalMember(owner = "client!jt", name = "p", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!jt", name = "q", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!jt", name = "r", descriptor = "I")
    public int field1397;

    @OriginalMember(owner = "client!jt", name = "s", descriptor = "I")
    public int field1398;

    @OriginalMember(owner = "client!jt", name = "t", descriptor = "I")
    public int field1399;

    @OriginalMember(owner = "client!jt", name = "o", descriptor = "Ljava/lang/String;")
    public String field1394;

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(B)V", line = 3)
    public static final void method599(byte arg0) {
        if (arg0 != -117) {
            method600(8, 84);
        }
        field1389++;
        class177.field2870 = class476.method2847(8, true, 0.4F, 35, 2048, 8, -6481, 4);
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(II)V", line = 16)
    public static final void method600(int arg0, int arg1) {
        field1395++;
        class18 var2 = class140.method1047(arg1, arg0, false);
        var2.method123(20983);
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(II)I", line = 37)
    public static final int method601(int arg0, int arg1) {
        if (arg0 == -27128) {
            field1396++;
            return arg1 >>> 7;
        } else {
            return -4;
        }
    }
}
