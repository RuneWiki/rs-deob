import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class223 {

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "B")
    private byte field3373;

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
    public int field3383;

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "I")
    public int field3384;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
    public int field3382;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public int field3376;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public int field3375;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "Lvh;")
    public static class62 field3374 = new class62(5);

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3381 = "Loaded input handler";

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "F")
    public static float field3380;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "Lnk;")
    public static class16 field3379;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)I", line = 9)
    public final int method1558(int arg0) {
        if (arg0 != -1048) {
            this.field3373 = -74;
        }
        field3377++;
        return this.field3373 & 0x7;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V", line = 25)
    public static void method1559(byte arg0) {
        field3374 = null;
        if (arg0 < -61) {
            field3379 = null;
            field3381 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)I", line = 41)
    public final int method1560(int arg0) {
        field3378++;
        if (arg0 != 0) {
            this.method1558(-7);
        }
        return (this.field3373 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V", line = 61)
    public class223() {
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Llf;)V", line = 63)
    public class223(class143 arg0) {
        this.field3373 = arg0.method1028(79030408);
        this.field3383 = arg0.method1051(1);
        this.field3384 = arg0.method1057(-114);
        this.field3382 = arg0.method1057(-102);
        this.field3376 = arg0.method1057(-116);
        this.field3375 = arg0.method1057(-118);
    }
}
