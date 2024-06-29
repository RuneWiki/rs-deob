import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class422 extends class154 {

    @OriginalMember(owner = "client!th", name = "m", descriptor = "I")
    private int field6152;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    private int field6149;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "I")
    private int field6156;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    private int field6150;

    @OriginalMember(owner = "client!th", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field6158 = new String[8];

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field6148;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    public static int field6151;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "I")
    public static int field6153;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "I")
    public static int field6154;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "I")
    public static int field6155;

    @OriginalMember(owner = "client!th", name = "r", descriptor = "I")
    public static int field6157;

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(IIIIII)V", line = 4)
    public class422(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field6152 = arg3;
        this.field6149 = arg0;
        this.field6156 = arg1;
        this.field6150 = arg2;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BLqa;Lvh;)V", line = 18)
    public static final void method2520(byte arg0, class162 arg1, class240 arg2) {
        if (arg0 != -126) {
            field6158 = null;
        }
        ++field6155;
        if (!class380.field5370) {
            arg1.method532(0);
            class234.field3250 = arg1.method482(class531.method3126(arg2, class405.field5627), true);
            class234.field3250.method3111((class177.field2513 + -class234.field3250.method126()) / 2, (class351.field4795 + -class234.field3250.method121()) / 2);
            class304.field4152 = arg1.method482(class531.method3126(arg2, class278.field3755), true);
            class304.field4152.method3111((class177.field2513 - class304.field4152.method126()) / 2, 18);
            class380.field5370 = true;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)[Ltk;", line = 39)
    public static final class228[] method2521(byte arg0) {
        if (arg0 <= 125) {
            method2521((byte) 105);
        }
        ++field6157;
        return new class228[] { class48.field658, class250.field3480, class174.field2494, class229.field3195, class135.field1953, class234.field3246, class190.field2628, class40.field552, class31.field440, class169.field2402, class58.field787, class239.field3285, class497.field7319, class509.field7469 };
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BI)V", line = 50)
    public static final void method2522(byte arg0, int arg1) {
        ++field6148;
        for (class499 var2 = class482.field7074.method981(0); var2 != null; var2 = class482.field7074.method989(0)) {
            if ((long) arg1 == (var2.field7342 >> 48 & 65535L)) {
                var2.method2946(-106);
            }
        }
        if (arg0 != 113) {
            field6158 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(III)V", line = 72)
    public final void method295(int arg0, int arg1, int arg2) {
        ++field6153;
        if (arg2 != 14619) {
            this.field6152 = -50;
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(III)V", line = 82)
    public final void method296(int arg0, int arg1, int arg2) {
        if (arg1 < -29) {
            ++field6151;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IBI)V", line = 92)
    public final void method294(int arg0, byte arg1, int arg2) {
        if (arg1 == 21) {
            ++field6154;
            int var4 = this.field6149 * arg2 >> 12;
            int var5 = this.field6150 * arg2 >> 12;
            int var6 = this.field6156 * arg0 >> 12;
            int var7 = this.field6152 * arg0 >> 12;
            class183.method1111(var6, var4, var7, var5, super.field2212, arg1 + -549645449);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)V", line = 115)
    public static void method2523(boolean arg0) {
        if (!arg0) {
            field6158 = null;
        }
    }
}
