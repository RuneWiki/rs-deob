import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public abstract class class216 {

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "Z")
    public static boolean field3021 = false;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field3020 = 50;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "[I")
    public static int[] field3019 = new int[field3020];

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "[I")
    public static int[] field3023 = new int[field3020];

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "J")
    public static long field3025 = 0L;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field3024 = new String[field3020];

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "[I")
    public static int[] field3026 = new int[field3020];

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "[I")
    public static int[] field3022 = new int[field3020];

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "[I")
    public static int[] field3027 = new int[field3020];

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "[I")
    public static int[] field3028 = new int[field3020];

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "(I)V", line = 29)
    public static void method1439(int arg0) {
        field3022 = null;
        field3027 = null;
        field3026 = null;
        field3023 = null;
        field3024 = null;
        field3019 = null;
        int var1 = 45 % ((-arg0 - 76) / 48);
        field3028 = null;
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)Z")
    public abstract boolean method697(int arg0);

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
    public abstract void method702(byte arg0);

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILea;Lac;ZII)V")
    public abstract void method699(int arg0, int arg1, class58 arg2, class216 arg3, boolean arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(ILea;)Lms;")
    public abstract class450 method696(int arg0, class58 arg1);

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lea;I)V")
    public abstract void method707(class58 arg0, int arg1);

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZILea;I)Z")
    public abstract boolean method710(boolean arg0, int arg1, class58 arg2, int arg3);
}
