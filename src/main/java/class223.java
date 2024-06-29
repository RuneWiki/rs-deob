import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class223 extends class626 {

    @OriginalMember(owner = "client!em", name = "w", descriptor = "F")
    public static float field3185;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public int field3170;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!em", name = "k", descriptor = "I")
    public int field3173;

    @OriginalMember(owner = "client!em", name = "l", descriptor = "I")
    public int field3174;

    @OriginalMember(owner = "client!em", name = "m", descriptor = "I")
    public int field3175;

    @OriginalMember(owner = "client!em", name = "n", descriptor = "I")
    public int field3176;

    @OriginalMember(owner = "client!em", name = "o", descriptor = "I")
    public int field3177;

    @OriginalMember(owner = "client!em", name = "p", descriptor = "I")
    public int field3178;

    @OriginalMember(owner = "client!em", name = "s", descriptor = "I")
    public int field3181;

    @OriginalMember(owner = "client!em", name = "t", descriptor = "I")
    public int field3182;

    @OriginalMember(owner = "client!em", name = "u", descriptor = "I")
    public int field3183;

    @OriginalMember(owner = "client!em", name = "v", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!em", name = "x", descriptor = "I")
    public int field3186;

    @OriginalMember(owner = "client!em", name = "y", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!em", name = "z", descriptor = "I")
    public int field3188;

    @OriginalMember(owner = "client!em", name = "A", descriptor = "I")
    public int field3189;

    @OriginalMember(owner = "client!em", name = "D", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!em", name = "E", descriptor = "I")
    public int field3193;

    @OriginalMember(owner = "client!em", name = "F", descriptor = "I")
    public int field3194;

    @OriginalMember(owner = "client!em", name = "G", descriptor = "I")
    public int field3195;

    @OriginalMember(owner = "client!em", name = "H", descriptor = "I")
    public int field3196;

    @OriginalMember(owner = "client!em", name = "q", descriptor = "Lhq;")
    public class157 field3179;

    @OriginalMember(owner = "client!em", name = "C", descriptor = "Ltf;")
    public class294 field3191;

    @OriginalMember(owner = "client!em", name = "r", descriptor = "Lkm;")
    public class353 field3180;

    @OriginalMember(owner = "client!em", name = "j", descriptor = "Lcj;")
    public class690 field3172;

    @OriginalMember(owner = "client!em", name = "B", descriptor = "Ljava/lang/String;")
    public static String field3190;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(III)V", line = 14)
    public static final void method1544(int arg0, int arg1, int arg2) {
        field3171++;
        class354 var3 = class501.method3012(arg1, arg2, arg2 ^ 0x7FE951A5);
        var3.method2222(-115);
        var3.field4990 = arg0;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V", line = 26)
    public static void method1545(int arg0) {
        int var1 = 36 % ((-arg0 - 40) / 63);
        field3190 = null;
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(I)V", line = 47)
    public final void method1546(int arg0) {
        this.field3172 = null;
        this.field3180 = null;
        if (arg0 > 100) {
            this.field3191 = null;
            this.field3179 = null;
            field3192++;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIB)V", line = 62)
    public static final void method1547(int arg0, int arg1, byte arg2) {
        field3187++;
        if (class154.field2309 == null || arg2 != 42) {
            return;
        }
        int var3 = class63.field1151;
        int var4 = class688.field9694;
        class96.method867(arg0, 1, arg1);
        if (class435.field6079 == 0) {
            class594.field8540 = null;
            class594.field8540 = class154.field2309.method544(class154.field2309.method644(class575.field8149, class584.field8240), class154.field2309.method551(class575.field8149, class584.field8240));
        } else if (class435.field6079 == 1 && (class724.field10127 == null || class63.field1151 != var3 || class688.field9694 != var4)) {
            class724.field10127 = new class116[class688.field9694 * class63.field1151];
            for (int var5 = 0; var5 < class724.field10127.length; var5++) {
                class724.field10127[var5] = class154.field2309.method544(class154.field2309.method644(class208.field2997, class653.field9197), class154.field2309.method551(class208.field2997, class653.field9197));
            }
            class168.field2469 = new int[class688.field9694 * class63.field1151];
            class575.field8150 = 1;
        }
        class70.field1267 = true;
    }
}
