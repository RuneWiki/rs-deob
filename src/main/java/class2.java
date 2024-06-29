import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!aa")
public class class2 extends class19 {

    @OriginalMember(owner = "mapview!aa", name = "l", descriptor = "[I")
    public static int[] field75 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "mapview!aa", name = "k", descriptor = "I")
    public static int field74 = 0;

    @OriginalMember(owner = "mapview!aa", name = "j", descriptor = "I")
    public static volatile int field73 = -1;

    @OriginalMember(owner = "mapview!aa", name = "n", descriptor = "Lk;")
    public static class21 field77 = class14.method92((byte) 57, "Combat Training");

    @OriginalMember(owner = "mapview!aa", name = "o", descriptor = "Lk;")
    public static class21 field78 = class14.method92((byte) 57, "Transportation");

    @OriginalMember(owner = "mapview!aa", name = "m", descriptor = "Ljava/awt/Image;")
    public static Image field76;

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(Lm;ILk;Lk;)[Lc;", line = 8)
    public static final class5[] method41(class25 arg0, int arg1, class21 arg2, class21 arg3) {
        if (arg1 < 60) {
            return (class5[]) null;
        } else {
            int var4 = arg0.method163(arg3, 3346);
            int var5 = arg0.method166(0, arg2, var4);
            return class30.method185(var4, (byte) 67, arg0, var5);
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(Lm;Lk;ILk;)[Le;", line = 38)
    public static final class9[] method42(class25 arg0, class21 arg1, int arg2, class21 arg3) {
        int var4 = arg0.method163(arg3, 3346);
        if (arg2 >= -69) {
            return (class9[]) null;
        } else {
            int var5 = arg0.method166(0, arg1, var4);
            return class10.method66(var4, var5, arg0, true);
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "b", descriptor = "(Z)V", line = 66)
    public static void method43(boolean arg0) {
        field76 = null;
        field75 = null;
        field77 = null;
        if (!arg0) {
            field78 = null;
        }
    }
}
