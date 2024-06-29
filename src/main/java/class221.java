import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class221 extends class101 {

    @OriginalMember(owner = "client!um", name = "v", descriptor = "[I")
    public int[] field3361 = new int[5];

    @OriginalMember(owner = "client!um", name = "o", descriptor = "[Led;")
    public class311[] field3354 = new class311[5];

    @OriginalMember(owner = "client!um", name = "x", descriptor = "I")
    public int field3363 = 0;

    @OriginalMember(owner = "client!um", name = "A", descriptor = "I")
    public int field3366;

    @OriginalMember(owner = "client!um", name = "G", descriptor = "I")
    public int field3372;

    @OriginalMember(owner = "client!um", name = "K", descriptor = "I")
    public int field3376;

    @OriginalMember(owner = "client!um", name = "n", descriptor = "I")
    public int field3353;

    @OriginalMember(owner = "client!um", name = "w", descriptor = "[Lvd;")
    public static class20[] field3362 = new class20[50];

    @OriginalMember(owner = "client!um", name = "F", descriptor = "Ljava/lang/String;")
    public static String field3371 = "Ok";

    @OriginalMember(owner = "client!um", name = "D", descriptor = "I")
    public static int field3369 = 0;

    @OriginalMember(owner = "client!um", name = "m", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!um", name = "p", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!um", name = "s", descriptor = "I")
    public int field3358;

    @OriginalMember(owner = "client!um", name = "t", descriptor = "I")
    public int field3359;

    @OriginalMember(owner = "client!um", name = "B", descriptor = "I")
    public int field3367;

    @OriginalMember(owner = "client!um", name = "H", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!um", name = "I", descriptor = "I")
    public int field3374;

    @OriginalMember(owner = "client!um", name = "J", descriptor = "I")
    public int field3375;

    @OriginalMember(owner = "client!um", name = "E", descriptor = "Ltm;")
    public class163 field3370;

    @OriginalMember(owner = "client!um", name = "y", descriptor = "Lbn;")
    public class187 field3364;

    @OriginalMember(owner = "client!um", name = "q", descriptor = "Lum;")
    public class221 field3356;

    @OriginalMember(owner = "client!um", name = "C", descriptor = "Le;")
    public class226 field3368;

    @OriginalMember(owner = "client!um", name = "M", descriptor = "Lrc;")
    public class228 field3378;

    @OriginalMember(owner = "client!um", name = "r", descriptor = "Lpc;")
    public class295 field3357;

    @OriginalMember(owner = "client!um", name = "N", descriptor = "Lig;")
    public class99 field3379;

    @OriginalMember(owner = "client!um", name = "u", descriptor = "Z")
    public boolean field3360;

    @OriginalMember(owner = "client!um", name = "z", descriptor = "Z")
    public boolean field3365;

    @OriginalMember(owner = "client!um", name = "L", descriptor = "Z")
    public boolean field3377;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(I)V", line = 4)
    public static void method1548(int arg0) {
        if (arg0 == 5) {
            field3371 = null;
            field3362 = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(III)V", line = 16)
    public class221(int arg0, int arg1, int arg2) {
        this.field3366 = arg2;
        this.field3376 = this.field3372 = arg0;
        this.field3353 = arg1;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IB)I", line = 32)
    public static final int method1549(int arg0, byte arg1) {
        field3355++;
        int var2 = 49 / ((54 - arg1) / 40);
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(II)I", line = 57)
    public static final int method1550(int arg0, int arg1) {
        field3352++;
        if (arg0 > arg1) {
            return 0;
        }
        class223 var2 = (class223) class295.field4520.method1320((long) arg1, 13002);
        if (var2 == null) {
            return class242.method1642(22590, arg1).field3878;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2.field3398.length; var4++) {
            if (var2.field3398[var4] == -1) {
                var3++;
            }
        }
        return var3 + class242.method1642(22590, arg1).field3878 - var2.field3398.length;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Z)V", line = 102)
    public static final void method1551(boolean arg0) {
        field3373++;
        for (class317 var1 = (class317) class205.field3082.method1109(-112); var1 != null; var1 = (class317) class205.field3082.method1115((byte) 126)) {
            class113 var2 = var1.field4779;
            if (class180.field2697 != var2.field1723 || var2.field1732) {
                var1.method714(-72);
            } else if (class304.field4641 >= var2.field1741) {
                var2.method784(class288.field4352, 0);
                if (var2.field1732) {
                    var1.method714(-83);
                } else {
                    class309.method2136(var2.field1723, var2.field1727, var2.field1730, var2.field1749, 60, var2, 0, -1L, false);
                }
            }
        }
        if (!arg0) {
            field3362 = (class20[]) null;
        }
    }
}
