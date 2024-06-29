import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class355 extends class496 {

    @OriginalMember(owner = "client!im", name = "j", descriptor = "I")
    public int field5151;

    @OriginalMember(owner = "client!im", name = "l", descriptor = "I")
    public int field5153;

    @OriginalMember(owner = "client!im", name = "m", descriptor = "I")
    public int field5154;

    @OriginalMember(owner = "client!im", name = "n", descriptor = "I")
    public static int field5155;

    @OriginalMember(owner = "client!im", name = "p", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!im", name = "q", descriptor = "I")
    public int field5158;

    @OriginalMember(owner = "client!im", name = "t", descriptor = "I")
    public int field5161;

    @OriginalMember(owner = "client!im", name = "u", descriptor = "I")
    public int field5162;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "Lwca;")
    public class311 field5150;

    @OriginalMember(owner = "client!im", name = "r", descriptor = "Lwca;")
    public class311 field5159;

    @OriginalMember(owner = "client!im", name = "o", descriptor = "Ljava/lang/String;")
    public String field5156;

    @OriginalMember(owner = "client!im", name = "k", descriptor = "Z")
    public boolean field5152;

    @OriginalMember(owner = "client!im", name = "s", descriptor = "[Ljava/lang/Object;")
    public Object[] field5160;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIIB)V")
    public static final void method2182(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field5155++;
        if (arg0 == arg4) {
            class379.method2303(arg3, arg4, 90, arg2, arg1);
            return;
        }
        int var6 = -65 / ((arg5 - 92) / 32);
        if (class130.field1712 <= (arg3 - arg4) && class401.field5755 >= arg3 + arg4 && class483.field7334 <= arg1 - arg0 && (arg0 + arg1) <= class202.field3021) {
            class444.method2696(arg0, arg2, arg1, arg4, (byte) -126, arg3);
        } else {
            class253.method1601(arg4, (byte) 51, arg2, arg0, arg3, arg1);
        }
    }
}
