import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class139 {

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "Z")
    public static boolean field3231 = false;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "[I")
    public static int[] field3224 = new int[2000];

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "[I")
    public static int[] field3228 = new int[1000];

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "Lja;")
    public static class62 field3234 = class30.method243(43, " <col=00ff80>");

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public int field3223;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public int field3230;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    public int field3232;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public int field3233;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "J")
    public static long field3226;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "Lja;")
    public class62 field3227;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "Z")
    public boolean field3229;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V")
    public static void method1112(boolean arg0) {
        field3228 = null;
        field3224 = null;
        field3234 = null;
        if (arg0) {
            method1112(true);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
    public static final void method1113(int arg0) {
        if (arg0 != 1000) {
            method1113(-33);
        }
        field3225++;
        class148.field3501.method127((byte) -120);
        class98.field2289.method127((byte) -123);
    }
}
