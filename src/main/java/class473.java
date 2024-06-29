import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class473 {

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "Llea;")
    public static class326 field6004 = new class326();

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "Lmaa;")
    public static class42 field6005 = new class42();

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "Ljava/lang/String;")
    public static String field6007 = null;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "Lrga;")
    public static class280 field6006 = new class280(35, 3);

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
    public static int field6008 = 0;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public int field5997;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    private int field5998;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field6000;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field6001;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field6002;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public int field6003;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "Lqn;")
    public class574 field5999;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILes;)V")
    public final void method2497(int arg0, class630 arg1) {
        field6001++;
        while (true) {
            int var3 = arg1.method3501(-9268);
            if (var3 == 0) {
                int var4 = -20 / ((arg0 - 48) / 51);
                return;
            }
            this.method2498(arg1, -100, var3);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Les;II)V")
    private final void method2498(class630 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field5998 = arg0.method3470(13111);
        } else if (arg2 == 2) {
            this.field6003 = arg0.method3501(-9268);
            this.field5997 = arg0.method3501(-9268);
        }
        if (arg1 >= -67) {
            field6006 = null;
        }
        field6002++;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public static void method2499(int arg0) {
        if (arg0 != 0) {
            field6006 = null;
        }
        field6007 = null;
        field6005 = null;
        field6006 = null;
        field6004 = null;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)Laga;")
    public final synchronized class661 method2500(int arg0) {
        field6000++;
        class661 var2 = (class661) this.field5999.field8011.method2418((long) this.field5998, (byte) 100);
        if (arg0 != -1) {
            return null;
        } else if (var2 == null) {
            class661 var3 = class661.method3715(this.field5999.field8005, this.field5998, 0);
            if (var3 != null) {
                this.field5999.field8011.method2409((long) this.field5998, var3, arg0 ^ 0xFFFFFFFE);
            }
            return var3;
        } else {
            return var2;
        }
    }
}
