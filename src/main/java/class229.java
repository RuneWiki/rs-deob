import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class229 extends class398 {

    @OriginalMember(owner = "client!oe", name = "S", descriptor = "I")
    private int field3069;

    @OriginalMember(owner = "client!oe", name = "L", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field3062 = new Rectangle[100];

    @OriginalMember(owner = "client!oe", name = "R", descriptor = "[Lrj;")
    public static class12[] field3068;

    @OriginalMember(owner = "client!oe", name = "Q", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!oe", name = "U", descriptor = "[I")
    public static int[] field3071;

    @OriginalMember(owner = "client!oe", name = "T", descriptor = "Ljava/lang/String;")
    public static String field3070;

    @OriginalMember(owner = "client!oe", name = "M", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!oe", name = "N", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!oe", name = "O", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!oe", name = "J", descriptor = "Lvf;")
    public static class152 field3061;

    @OriginalMember(owner = "client!oe", name = "P", descriptor = "Lcq;")
    public static class67 field3066;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "(I)V")
    public static void method1381(int arg0) {
        field3071 = null;
        field3062 = null;
        field3066 = null;
        field3070 = null;
        field3061 = null;
        field3068 = null;
        if (arg0 != 14) {
            field3062 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(I)V")
    public class229(int arg0) {
        super(0, true);
        this.field3069 = 4096;
        this.field3069 = arg0;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
    public class229() {
        this(4096);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)[I")
    public final int[] method95(int arg0, int arg1) {
        ++field3064;
        int[] var3 = super.field5927.method305(arg0, (byte) 127);
        if (super.field5927.field591) {
            class60.method420(var3, 0, class140.field1922, this.field3069);
        }
        if (arg1 != 0) {
            field3070 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lnj;II)V")
    public final void method208(class228 arg0, int arg1, int arg2) {
        if (arg2 != -13132) {
            this.method208((class228) null, -96, -90);
        }
        ++field3063;
        if (~arg1 == -1) {
            this.field3069 = (arg0.method1348(-118) << 12) / 255;
        }
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(II)V")
    public static final void method1382(int arg0, int arg1) {
        class410.field6059 = arg1;
        ++field3065;
        class189 var2 = class93.field1340;
        synchronized (class93.field1340) {
            class93.field1340.method1141(arg0 + 6);
        }
        class189 var3 = class27.field388;
        synchronized (class27.field388) {
            if (arg0 != 250) {
                field3068 = null;
            }
            class27.field388.method1141(256);
        }
    }

    static {
        for (int var0 = 0; ~var0 > -101; ++var0) {
            field3062[var0] = new Rectangle();
        }
        field3068 = new class12[14];
        field3067 = 1;
        field3071 = new int[250];
        field3070 = "green:";
    }
}
