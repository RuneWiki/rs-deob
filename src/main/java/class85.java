import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public abstract class class85 extends class8 {

    @OriginalMember(owner = "client!hl", name = "M", descriptor = "Z")
    public volatile boolean field1190 = true;

    @OriginalMember(owner = "client!hl", name = "F", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!hl", name = "H", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!hl", name = "I", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!hl", name = "K", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!hl", name = "L", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!hl", name = "G", descriptor = "Z")
    public boolean field1184;

    @OriginalMember(owner = "client!hl", name = "J", descriptor = "Z")
    public boolean field1187;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "(I)[Lem;", line = 7)
    public static final class260[] method575(int arg0) {
        field1188++;
        if (arg0 < 27) {
            return (class260[]) null;
        }
        class260[] var1 = new class260[class48.field680];
        for (int var2 = 0; var2 < class48.field680; var2++) {
            if (class232.field3690) {
                var1[var2] = new class312(class303.field4757, class243.field3832, class270.field4364[var2], class51.field732[var2], class102.field1489[var2], class184.field3046[var2], class278.field4481[var2], class205.field3370);
            } else {
                var1[var2] = new class326(class303.field4757, class243.field3832, class270.field4364[var2], class51.field732[var2], class102.field1489[var2], class184.field3046[var2], class278.field4481[var2], class205.field3370);
            }
        }
        class106.method727(true);
        return var1;
    }

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "(I)V", line = 34)
    public static final void method576(int arg0) {
        field1185++;
        if (arg0 >= -83) {
            method577(89);
        }
        class62.field913 = class150.method1094(8, 4, -1881046778, 0.4F, 8, 2048, 35, true);
    }

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "(I)V", line = 47)
    public static final void method577(int arg0) {
        class130.field2049++;
        field1183++;
        class194.field3175.method2375(75, 0);
        int var1 = -59 / ((-arg0 - 6) / 44);
        class194.field3175.method257(-2, class204.method1490((byte) 59));
        class194.field3175.method287(0, class133.field2095);
        class194.field3175.method287(0, class20.field276);
        class194.field3175.method257(-2, class185.field3065);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIZIIIIIII)V", line = 74)
    public static final void method580(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1189++;
        int var10 = arg5 - arg3;
        int var11 = arg6 - arg7;
        int var12 = (arg4 - arg1 << 16) / var11;
        int var13 = (arg9 - arg0 << 16) / var10;
        class219.method1559(arg1, 0, var12, arg0, arg3, arg2, arg8, var13, 0, arg5, arg7, arg6);
    }

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "(I)[B")
    public abstract byte[] method578(int arg0);

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "(I)I")
    public abstract int method579(int arg0);
}
