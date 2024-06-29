import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class60 extends class304 {

    @OriginalMember(owner = "client!wk", name = "Q", descriptor = "Lfa;")
    public static class98 field789 = new class98(128);

    @OriginalMember(owner = "client!wk", name = "T", descriptor = "I")
    public static int field792 = 0;

    @OriginalMember(owner = "client!wk", name = "V", descriptor = "Ljava/lang/String;")
    public static String field794 = null;

    @OriginalMember(owner = "client!wk", name = "Y", descriptor = "Ljava/lang/String;")
    public static String field797 = "Connecting to update server";

    @OriginalMember(owner = "client!wk", name = "R", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!wk", name = "S", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!wk", name = "U", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!wk", name = "X", descriptor = "Ljd;")
    public static class95 field796;

    @OriginalMember(owner = "client!wk", name = "W", descriptor = "[Lee;")
    public static class309[] field795;

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "()V", line = 3)
    public class60() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "(I)V", line = 7)
    public static void method418(int arg0) {
        field795 = null;
        if (arg0 == 0) {
            field789 = null;
            field794 = null;
            field797 = null;
            field796 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "(I)V", line = 25)
    public static final void method419(int arg0) {
        class267.method1873(false, (byte) -32);
        field793++;
        System.gc();
        class101.method758(arg0 ^ 0x62, arg0);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)[I", line = 53)
    public final int[] method71(int arg0, int arg1) {
        field791++;
        int[] var3 = this.field4669.method2342(arg0 ^ 0xFFFF8FB5, arg1);
        if (arg0 != 7) {
            field789 = (class98) null;
        }
        if (this.field4669.field5223) {
            class126.method946(var3, 0, class218.field3333, class84.field1225[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "(B)V", line = 82)
    public static final void method420(byte arg0) {
        if (arg0 > -110) {
            return;
        }
        field790++;
        int var1 = class229.method1618(113);
        if (var1 == 0) {
            class2.field25 = (byte[][][]) null;
            class40.method306(-25584, 0);
        } else if (var1 == 1) {
            class213.method1523((byte) 118, (byte) 0);
            class40.method306(-25584, 512);
            if (class324.field5005 != null) {
                class2.method15(20620);
            }
        } else {
            class213.method1523((byte) 116, (byte) (class211.field3240 - 4 & 0xFF));
            class40.method306(-25584, 2);
        }
    }
}
