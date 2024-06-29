import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class291 extends class34 {

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
    public static int field4865 = 0;

    @OriginalMember(owner = "client!eg", name = "w", descriptor = "Lqd;")
    public static class40 field4871 = class147.method1106("Abbrechen", (byte) -82);

    @OriginalMember(owner = "client!eg", name = "y", descriptor = "I")
    public static int field4873 = -1;

    @OriginalMember(owner = "client!eg", name = "x", descriptor = "[I")
    public static int[] field4872 = new int[1000];

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "I")
    public int field4866;

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!eg", name = "v", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "Lqd;")
    public class40 field4864;

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "Lqd;")
    public class40 field4867;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(B)V", line = 15)
    public static void method2003(byte arg0) {
        if (arg0 < 74) {
            method2005(64, (byte) 74);
        }
        field4871 = null;
        field4872 = null;
    }

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "(I)Ljl;", line = 40)
    public final class256 method2004(int arg0) {
        if (arg0 == -1) {
            field4870++;
            return class91.field1646[this.field685];
        } else {
            return (class256) null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IB)Z", line = 63)
    public static final boolean method2005(int arg0, byte arg1) {
        field4869++;
        if (arg1 < 66) {
            return false;
        } else {
            return (arg0 >> 22 & 0x1) != 0;
        }
    }
}
