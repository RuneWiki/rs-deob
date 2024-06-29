import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class232 {

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "[Lp;")
    public static class104[] field3346 = new class104[50];

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public int field3338;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public int field3339;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public int field3340;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public int field3341;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public int field3342;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public int field3343;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public int field3344;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public int field3345;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public int field3347;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public int field3348;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    public int field3349;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    public int field3350;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public int field3351;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
    public int field3352;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    public int field3353;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
    public int field3354;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    public int field3355;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
    public int field3356;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static final void method1514(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class229.field3259[var1] = false;
        }
        class4.field61 = 1;
        class150.field2177 = arg0;
        class32.field381 = -1;
        class212.field2972 = 0;
        class202.field2866 = -1;
        field3357++;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
    public static void method1515(int arg0) {
        field3346 = null;
        if (arg0 != -1) {
            method1514(-56);
        }
    }
}
