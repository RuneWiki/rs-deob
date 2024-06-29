import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class226 implements class236 {

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public int field2940;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2935 = null;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "Lbr;")
    public static class192 field2936 = new class192("", 16);

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "Lf;")
    public static class532 field2942;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "Lvv;")
    public static class696 field2934;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)Ltca;")
    public final class141 method421(int arg0) {
        field2941++;
        if (arg0 != 4) {
            field2942 = null;
        }
        return class165.field2368;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lr;B)V")
    public static final void method1408(class562 arg0, byte arg1) {
        field2937++;
        if (arg1 == -20 && class485.field6740 != class408.field5369.field385 && class153.field2168 != null && class98.method558(class408.field5369.field385, arg0, -75)) {
            class485.field6740 = class408.field5369.field385;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V")
    public static void method1409(byte arg0) {
        field2936 = null;
        field2934 = null;
        if (arg0 <= 98) {
            field2942 = null;
        }
        field2935 = null;
        field2942 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIII)V")
    public static final void method1410(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2939++;
        if (arg2 == 8 || arg2 == 16) {
            for (int var6 = 0; var6 < class113.field1433; var6++) {
                class152 var8 = class64.field805[var6];
                if (var8.field2083 == arg2 && var8.field2080 == arg0 && var8.field2077 == arg3 || var8.field2076 == arg0 && var8.field2077 == arg3) {
                    if (class113.field1433 != var6) {
                        class2.method7(class64.field805, var6 + 1, class64.field805, var6, class64.field805.length - (var6 + 1));
                    }
                    class113.field1433--;
                    return;
                }
            }
        } else {
            class207 var5 = class153.field2168[arg4][arg0][arg3];
            if (var5 != null) {
                if (arg2 == 1) {
                    var5.field2772 = 0;
                } else if (arg2 == 2) {
                    var5.field2770 = 0;
                }
            }
            class627.method3476((byte) -43);
        }
        int var7 = -94 / ((73 - arg1) / 40);
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(I)V")
    public class226(int arg0) {
        this.field2940 = arg0;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(IIIII)V")
    public static final void method1411(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class582.field7958 != null) {
            class582.field7958[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class400.field5303 != null) {
            class400.field5303[arg0][arg1] = (short) arg3;
        }
        if (class190.field2637 != null) {
            class190.field2637[arg0][arg1] = (byte) arg4;
        }
    }
}
