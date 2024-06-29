import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class166 {

    @OriginalMember(owner = "client!se", name = "a", descriptor = "Lcd;")
    public static class23 field3307 = class54.method414("null", -1);

    @OriginalMember(owner = "client!se", name = "b", descriptor = "Lcd;")
    private static class23 field3308 = class54.method414("wishes to duel with you)3", -1);

    @OriginalMember(owner = "client!se", name = "e", descriptor = "Lcd;")
    public static class23 field3311 = field3308;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "Lcd;")
    public static class23 field3313 = class54.method414("", -1);

    @OriginalMember(owner = "client!se", name = "o", descriptor = "Lcd;")
    public static class23 field3321 = class54.method414(":clan:", -1);

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "J")
    public long field3317;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "Lse;")
    public class166 field3310;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "Lse;")
    public class166 field3315;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "Ljava/awt/Image;")
    public static Image field3319;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "[[S")
    public static short[][] field3316;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
    public final void method1018(int arg0) {
        if (arg0 != 15789) {
            this.method1018(-123);
        }
        field3318++;
        if (this.field3315 != null) {
            this.field3315.field3310 = this.field3310;
            this.field3310.field3315 = this.field3315;
            this.field3315 = null;
            this.field3310 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lcd;Z)Z")
    public static final boolean method1019(class23 arg0, boolean arg1) {
        if (!arg1) {
            method1019(null, false);
        }
        field3309++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class157.field3145; var2++) {
            if (arg0.method146(125, class131.field2717[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)Z")
    public final boolean method1020(int arg0) {
        field3320++;
        if (this.field3315 == null) {
            return false;
        } else {
            if (arg0 != 25066) {
                field3316 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
    public static void method1021(byte arg0) {
        field3321 = null;
        field3313 = null;
        field3316 = null;
        field3319 = null;
        field3311 = null;
        if (arg0 != 54) {
            method1021((byte) -101);
        }
        field3308 = null;
        field3307 = null;
    }
}
