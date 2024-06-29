import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class356 implements class76 {

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "Lgh;")
    public static class44 field5567 = class103.method728(-59);

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field5571 = new String[5];

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "F")
    public static float field5572;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field5565;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public static int field5566;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static int field5568;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public static int field5569;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public static int field5570;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "[[I")
    public static int[][] field5573;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lfh;BII)[Luj;", line = 4)
    public static final class158[] method2473(class140 arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != 110) {
            method2473((class140) null, (byte) 67, 36, -96);
        }
        field5565++;
        return class134.method1020(1, arg0, arg3, arg2) ? class82.method613((byte) -55) : null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 23)
    public static final String method2474(byte arg0, int arg1) {
        field5566++;
        return arg0 == 39 ? (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF) : (String) null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V", line = 37)
    public static void method2475(byte arg0) {
        if (arg0 <= 106) {
            field5571 = (String[]) null;
        }
        field5571 = null;
        field5573 = (int[][]) null;
        field5567 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(J[IBI)Ljava/lang/String;", line = 52)
    public final String method548(long arg0, int[] arg1, byte arg2, int arg3) {
        if (arg2 != 57) {
            field5573 = (int[][]) ((int[][]) null);
        }
        field5568++;
        if (arg3 == 0) {
            class249 var6 = class82.method605((byte) 116, arg1[0]);
            return var6.method1743((int) arg0, -7);
        } else if (arg3 == 1 || arg3 == 10) {
            class362 var7 = class172.method1265((int) arg0, (byte) 96);
            return var7.field5674;
        } else if (arg3 == 6 || arg3 == 7 || arg3 == 11) {
            return class82.method605((byte) 93, arg1[0]).method1743((int) arg0, arg2 ^ 0xFFFFFFC0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lfh;I)V", line = 94)
    public static final void method2476(class140 arg0, int arg1) {
        class284.field4046 = arg0;
        class299.field4358 = class284.field4046.method1088(4, 1);
        field5569++;
        if (arg1 < 26) {
            field5567 = (class44) null;
        }
    }
}
