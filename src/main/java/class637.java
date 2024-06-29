import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class637 extends class154 {

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "I")
    public static int field8791 = 1407;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "I")
    public static int field8788;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
    public int field8789;

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
    public int field8790;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
    public static int field8793;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "Lwia;")
    public static class791 field8794;

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "Z")
    public static boolean field8792;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V", line = 4)
    public static void method3556(byte arg0) {
        if (arg0 == 33) {
            field8794 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)Lpo;", line = 23)
    public static final class585 method3557(int arg0, int arg1) {
        field8793++;
        if (arg0 == 0) {
            if ((double) class64.field891 == 3.0D) {
                return class332.field4495;
            }
            if ((double) class64.field891 == 4.0D) {
                return class418.field5707;
            }
            if ((double) class64.field891 == 6.0D) {
                return class410.field5616;
            }
            if ((double) class64.field891 >= 8.0D) {
                return class492.field6740;
            }
        } else if (arg0 == 1) {
            if ((double) class64.field891 == 3.0D) {
                return class410.field5616;
            }
            if ((double) class64.field891 == 4.0D) {
                return class492.field6740;
            }
            if ((double) class64.field891 == 6.0D) {
                return class405.field5579;
            }
            if ((double) class64.field891 >= 8.0D) {
                return class724.field9960;
            }
        } else if (arg0 == 2) {
            if ((double) class64.field891 == 3.0D) {
                return class405.field5579;
            }
            if ((double) class64.field891 == 4.0D) {
                return class724.field9960;
            }
            if ((double) class64.field891 == 6.0D) {
                return class466.field6316;
            }
            if ((double) class64.field891 >= 8.0D) {
                return class367.field4983;
            }
        }
        if (arg1 != -16680) {
            field8791 = -75;
        }
        return null;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(IBI)Z", line = 99)
    public static final boolean method3558(int arg0, byte arg1, int arg2) {
        if (arg1 != 78) {
            field8792 = false;
        }
        field8788++;
        return false;
    }
}
