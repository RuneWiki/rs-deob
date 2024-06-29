import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class265 {

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "[I")
    public int[] field3357 = new int[100];

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "[Lve;")
    public class182[] field3359 = new class182[8];

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "[I")
    public int[] field3360 = new int[3];

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "[Loh;")
    public class448[] field3362 = new class448[100];

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "Lhb;")
    public static class250 field3361 = new class250(51, 7);

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
    public static int field3369 = 0;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public static int field3368 = 0;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "Z")
    public static boolean field3366 = false;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public int field3363;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "J")
    public static long field3365;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "Lqd;")
    public static class277 field3367;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "Ljava/lang/Object;")
    public Object field3364;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILjava/lang/String;C)I", line = 6)
    public static final int method1649(int arg0, String arg1, char arg2) {
        field3358++;
        int var3 = 0;
        int var4 = arg1.length();
        for (int var5 = arg0; var5 < var4; var5++) {
            if (arg1.charAt(var5) == arg2) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V", line = 44)
    public static void method1650(int arg0) {
        field3367 = null;
        if (arg0 < 86) {
            field3365 = -43L;
        }
        field3361 = null;
    }
}
