import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class90 {

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field1568 = 0;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field1577 = new String[1000];

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "[[B")
    public static byte[][] field1573;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "[[[I")
    public static int[][][] field1569;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public static void method688(int arg0) {
        field1577 = null;
        field1573 = null;
        if (arg0 != 0) {
            method689((class235) null, false, (class235) null);
        }
        field1569 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lhc;ZLhc;)V")
    public static final void method689(class235 arg0, boolean arg1, class235 arg2) {
        class160.field2481 = arg2;
        if (arg1) {
            field1573 = null;
        }
        class181.field2826 = arg0;
        field1570++;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIILhc;BZ)V")
    public static final void method690(int arg0, int arg1, int arg2, int arg3, class235 arg4, byte arg5, boolean arg6) {
        class179.field2783 = arg3;
        class179.field2792 = arg1;
        class84.field1422 = arg6;
        class240.field3908 = arg2;
        field1572++;
        class205.field3198 = arg4;
        class253.field4061 = 1;
        if (arg5 != 114) {
            method690(-38, 6, -67, -42, (class235) null, (byte) 34, false);
        }
        class111.field1817 = arg0;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BI)I")
    public static final int method691(byte arg0, int arg1) {
        field1576++;
        int var2 = -42 % ((72 - arg0) / 53);
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
    public static final void method692(int arg0) {
        for (int var1 = 0; var1 < class241.field3917; var1++) {
            class139 var2 = class93.method703(15226, var1);
            if (var2 != null && var2.field2123 == 0) {
                class240.field3910[var1] = 0;
                class31.field462[var1] = 0;
            }
        }
        field1575++;
        if (arg0 == 11464) {
            class183.field2842 = new class39(16);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILwc;)I")
    public static final int method693(int arg0, class236 arg1) {
        field1571++;
        int var2 = arg1.field3813;
        if (arg0 != 16) {
            method690(13, -2, 126, -57, (class235) null, (byte) -88, true);
        }
        class283 var3 = arg1.method972((byte) -71);
        if (arg1.field2250 == var3.field4496) {
            var2 = arg1.field3815;
        } else if (arg1.field2250 == var3.field4468 || arg1.field2250 == var3.field4497 || arg1.field2250 == var3.field4485 || arg1.field2250 == var3.field4495) {
            var2 = arg1.field3820;
        } else if (arg1.field2250 == var3.field4494 || arg1.field2250 == var3.field4454 || arg1.field2250 == var3.field4466 || arg1.field2250 == var3.field4483) {
            var2 = arg1.field3802;
        }
        return var2;
    }
}
