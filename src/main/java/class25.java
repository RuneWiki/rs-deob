import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class25 {

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "Z")
    public static boolean field287 = true;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILv;I)V")
    public static final void method179(int arg0, class152 arg1, int arg2) {
        if (arg2 != -31042) {
            return;
        }
        if (class163.field2646 != null) {
            try {
                class163.field2646.method1402(0L, (byte) -12);
                class163.field2646.method1407((byte) 104, 24, arg1.field2523, arg0);
            } catch (Exception var3) {
            }
        }
        field294++;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IB)V")
    public static final void method180(int arg0, byte arg1) {
        if (arg1 >= -125) {
            method182(-3, (class152) null);
        }
        class243.field3890--;
        field289++;
        if (class243.field3890 == arg0) {
            return;
        }
        class158.method1175(class226.field3632, arg0 + 1, class226.field3632, arg0, class243.field3890 - arg0);
        class158.method1175(class243.field3927, arg0 + 1, class243.field3927, arg0, class243.field3890 - arg0);
        class158.method1181(class82.field1186, arg0 + 1, class82.field1186, arg0, class243.field3890 - arg0);
        class158.method1174(class207.field3318, arg0 + 1, class207.field3318, arg0, class243.field3890 - arg0);
        class158.method1176(class49.field710, arg0 + 1, class49.field710, arg0, class243.field3890 - arg0);
        class158.method1181(class276.field4425, arg0 + 1, class276.field4425, arg0, class243.field3890 - arg0);
        class158.method1181(class77.field1108, arg0 + 1, class77.field1108, arg0, class243.field3890 - arg0);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "([II)[I")
    public static final int[] method181(int[] arg0, int arg1) {
        field291++;
        if (arg0 == null) {
            return null;
        }
        int[] var2 = new int[arg0.length];
        class158.method1181(arg0, 0, var2, 0, arg0.length);
        if (arg1 != -1093) {
            method182(41, (class152) null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILv;)Lr;")
    public static final class42 method182(int arg0, class152 arg1) {
        if (arg0 == -14160) {
            field288++;
            return new class42(arg1.method1090(12107), arg1.method1090(12107), arg1.method1090(arg0 + 26267), arg1.method1090(12107), arg1.method1128((byte) -102), arg1.method1128((byte) -119), arg1.method1111(255));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIZI)V")
    public static final void method183(int arg0, int arg1, boolean arg2, int arg3) {
        field292++;
        String var4 = "::tele " + arg0 + "," + (arg3 >> 6) + "," + (arg1 >> 6) + "," + (arg3 & 0x3F) + "," + (arg1 & 0x3F);
        if (!arg2) {
            field287 = false;
        }
        System.out.println(var4);
        class235.method1661((byte) -120, var4);
    }
}
