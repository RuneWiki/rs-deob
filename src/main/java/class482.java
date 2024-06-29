import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class482 extends class272 {

    @OriginalMember(owner = "client!hd", name = "H", descriptor = "I")
    public static int field6790 = 0;

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "I")
    public int field6782;

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "I")
    public int field6784;

    @OriginalMember(owner = "client!hd", name = "B", descriptor = "I")
    public static int field6785;

    @OriginalMember(owner = "client!hd", name = "G", descriptor = "I")
    public static int field6789;

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "I")
    public int field6792;

    @OriginalMember(owner = "client!hd", name = "L", descriptor = "I")
    public int field6794;

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "Lvp;")
    public class112 field6783;

    @OriginalMember(owner = "client!hd", name = "D", descriptor = "Ljava/lang/String;")
    public String field6787;

    @OriginalMember(owner = "client!hd", name = "F", descriptor = "[I")
    public int[] field6788;

    @OriginalMember(owner = "client!hd", name = "K", descriptor = "[I")
    public int[] field6793;

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "[Lcp;")
    public class470[] field6786;

    @OriginalMember(owner = "client!hd", name = "I", descriptor = "[Ljava/lang/String;")
    public String[] field6791;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)V")
    public static final void method2819(int arg0, int arg1) {
        class206.field3157 = -1;
        class256.field3761 = false;
        client.field2623 = null;
        class327.field4741 = 1;
        class405.field5701 = -1;
        field6785++;
        class70.field883 = arg0;
        class222.field3376 = arg1;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BII)V")
    public static final void method2820(byte arg0, int arg1, int arg2) {
        if (class404.field5694 == 1) {
            class142.method891(class63.field831, arg1, (byte) -86, arg2);
        } else if (class404.field5694 == 2) {
            class325.method2058(7756, arg1, arg2);
        }
        field6789++;
        class404.field5694 = 0;
        if (arg0 > -78) {
            method2819(-112, -21);
        }
        class63.field831 = null;
    }
}
