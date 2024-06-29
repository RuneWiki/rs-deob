import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class1 extends class331 {

    @OriginalMember(owner = "client!ro", name = "K", descriptor = "I")
    public int field7 = 0;

    @OriginalMember(owner = "client!ro", name = "F", descriptor = "I")
    public static int field2 = -1;

    @OriginalMember(owner = "client!ro", name = "I", descriptor = "[Ljava/lang/String;")
    public static String[] field5 = null;

    @OriginalMember(owner = "client!ro", name = "M", descriptor = "I")
    public static int field9 = 0;

    @OriginalMember(owner = "client!ro", name = "G", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!ro", name = "H", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!ro", name = "L", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!ro", name = "J", descriptor = "Lul;")
    public static class343 field6;

    @OriginalMember(owner = "client!ro", name = "E", descriptor = "Ltq;")
    public static class376 field1;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILdg;)V", line = 6)
    public final void method1(int arg0, class236 arg1) {
        if (arg0 != 30500) {
            field9 = 85;
        }
        while (true) {
            int var3 = arg1.method1574(-53);
            if (var3 == 0) {
                field8++;
                return;
            }
            this.method3(arg1, 0, var3);
        }
    }

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "(B)V", line = 35)
    public static void method2(byte arg0) {
        if (arg0 > -80) {
            method2((byte) 97);
        }
        field6 = null;
        field5 = null;
        field1 = null;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Ldg;II)V", line = 49)
    private final void method3(class236 arg0, int arg1, int arg2) {
        field3++;
        if (arg1 == 0 && arg2 == 2) {
            this.field7 = arg0.method1617((byte) 48);
        }
    }
}
