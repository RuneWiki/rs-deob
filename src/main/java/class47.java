import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ef")
public class class47 {

    @OriginalMember(owner = "ef", name = "j", descriptor = "I")
    public int field977 = -1;

    @OriginalMember(owner = "ef", name = "c", descriptor = "I")
    public static int field970 = 0;

    @OriginalMember(owner = "ef", name = "l", descriptor = "Z")
    public static boolean field979 = false;

    @OriginalMember(owner = "ef", name = "b", descriptor = "Llf;")
    public static class109 field969 = class35.method275("Ausw-=hlen", 2);

    @OriginalMember(owner = "ef", name = "i", descriptor = "Ltf;")
    public static class181 field976 = new class181();

    @OriginalMember(owner = "ef", name = "p", descriptor = "Llf;")
    public static class109 field983 = class35.method275(")4slr)3ws?order=LPWM", 2);

    @OriginalMember(owner = "ef", name = "e", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "ef", name = "f", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "ef", name = "h", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "ef", name = "k", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "ef", name = "n", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "ef", name = "a", descriptor = "Lva;")
    public class194 field968;

    @OriginalMember(owner = "ef", name = "d", descriptor = "[I")
    public int[] field971;

    @OriginalMember(owner = "ef", name = "m", descriptor = "[I")
    public static int[] field980;

    @OriginalMember(owner = "ef", name = "g", descriptor = "[Llf;")
    public class109[] field974;

    @OriginalMember(owner = "ef", name = "o", descriptor = "[Ldf;")
    public static class37[] field982;

    @OriginalMember(owner = "ef", name = "a", descriptor = "(ILbg;II)[Lkf;")
    public static final class100[] method321(int arg0, class18 arg1, int arg2, int arg3) {
        if (arg0 <= 123) {
            method322(-87);
        }
        field975++;
        return class203.method1333(-21957, arg1, arg3, arg2) ? class57.method378((byte) -87) : null;
    }

    @OriginalMember(owner = "ef", name = "a", descriptor = "(I)V")
    public static void method322(int arg0) {
        field976 = null;
        field983 = null;
        if (arg0 == -1) {
            field980 = null;
            field969 = null;
            field982 = null;
        }
    }

    @OriginalMember(owner = "ef", name = "b", descriptor = "(I)V")
    public static final void method323(int arg0) {
        int var1 = -48 / ((66 - arg0) / 48);
        class147.field2840.method1088(-51);
        field981++;
    }

    @OriginalMember(owner = "ef", name = "a", descriptor = "(Z)V")
    public static final void method324(boolean arg0) {
        if (class85.field1728 != null) {
            class143 var1 = class85.field1728;
            synchronized (class85.field1728) {
                class85.field1728 = null;
            }
        }
        if (arg0) {
            field978++;
        }
    }
}
