import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class231 {

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field3446 = new String[100];

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "[Llo;")
    public static class528[] field3449 = new class528[14];

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "Lri;")
    public static class73 field3445 = new class73(32, 5);

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "Lki;")
    public static class498 field3451 = new class498(79, -1);

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "[[Lvg;")
    public static class38[][] field3450;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "()V")
    public static final void method1584() {
        class169.method1171(1, class208.field2979);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lic;ILic;)V")
    public static final void method1585(class491 arg0, int arg1, class491 arg2) {
        class158.field2335 = arg2;
        field3448++;
        if (arg1 < 123) {
            field3449 = null;
        }
        class73.field1086 = arg0;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method1586(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field3447++;
        int var7 = class42.method249(class37.field393, arg0, (byte) -72, class509.field7436);
        int var8 = class42.method249(class37.field393, arg2, (byte) -72, class509.field7436);
        int var9 = class42.method249(class494.field7297, arg3, (byte) -72, class445.field6629);
        int var10 = class42.method249(class494.field7297, arg1, (byte) -72, class445.field6629);
        int var11 = class42.method249(class37.field393, arg0 + arg5, (byte) -72, class509.field7436);
        int var12 = class42.method249(class37.field393, arg2 - arg5, (byte) -72, class509.field7436);
        if (arg6 != -6) {
            field3451 = null;
        }
        for (int var13 = var7; var13 < var11; var13++) {
            class415.method2491(var10, var9, class339.field4800[var13], arg4, -31541);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class415.method2491(var10, var9, class339.field4800[var14], arg4, -31541);
        }
        int var15 = class42.method249(class494.field7297, arg3 + arg5, (byte) -72, class445.field6629);
        int var16 = class42.method249(class494.field7297, arg1 - arg5, (byte) -72, class445.field6629);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class339.field4800[var17];
            class415.method2491(var15, var9, var18, arg4, -31541);
            class415.method2491(var10, var16, var18, arg4, -31541);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
    public static void method1587(int arg0) {
        field3450 = null;
        field3445 = null;
        field3449 = null;
        field3446 = null;
        int var1 = 94 % ((23 - arg0) / 57);
        field3451 = null;
    }
}
