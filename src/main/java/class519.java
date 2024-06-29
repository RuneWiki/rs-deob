import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class519 {

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "I")
    public int field7624 = -1;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "I")
    public static int field7622;

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "I")
    public int field7623;

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "I")
    public static int field7625;

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "I")
    public int field7626;

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "I")
    public int field7627;

    @OriginalMember(owner = "client!cp", name = "g", descriptor = "I")
    public int field7628;

    @OriginalMember(owner = "client!cp", name = "h", descriptor = "I")
    public int field7629;

    @OriginalMember(owner = "client!cp", name = "i", descriptor = "I")
    public int field7630;

    @OriginalMember(owner = "client!cp", name = "j", descriptor = "I")
    public static int field7631;

    @OriginalMember(owner = "client!cp", name = "l", descriptor = "I")
    public int field7633;

    @OriginalMember(owner = "client!cp", name = "m", descriptor = "I")
    public int field7634;

    @OriginalMember(owner = "client!cp", name = "k", descriptor = "Z")
    public static boolean field7632;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method3091(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7631++;
        if ((class178.field2382[0][arg2][arg0] & 0x2) != 0) {
            return true;
        } else if ((class178.field2382[arg3][arg2][arg0] & 0x10) == 0) {
            int var5 = 106 / ((28 - arg4) / 39);
            return arg1 == class136.method921((byte) -65, arg2, arg0, arg3);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)I")
    public static int method3092(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Lga;Z)V")
    public static final void method3093(class282 arg0, boolean arg1) {
        field7622++;
        if (!class44.field641) {
            return;
        }
        if (arg0.field4119 != null) {
            class282 var2 = class178.method1197(class497.field7333, class63.field894, 104);
            if (var2 != null) {
                class143 var3 = new class143();
                var3.field1903 = arg0;
                var3.field1911 = var2;
                var3.field1912 = arg0.field4119;
                class343.method2227(var3);
            }
        }
        class475.field7047++;
        class424.method2582(class374.field5694, -1);
        class538.field7879.method1073(326170192, arg0.field4029);
        if (arg1) {
            field7632 = true;
        }
        class538.field7879.method1062((byte) -39, class63.field894);
        class538.field7879.method1084(-3577, class497.field7333);
        class538.field7879.method1068(55, class361.field5539);
        class538.field7879.method1068(32, arg0.field4012);
        class538.field7879.method1084(-3577, arg0.field4031);
    }
}
