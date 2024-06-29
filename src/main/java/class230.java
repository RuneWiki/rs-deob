import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class230 extends class74 {

    @OriginalMember(owner = "client!sb", name = "S", descriptor = "[Lkc;")
    public static class286[] field3592 = new class286[14];

    @OriginalMember(owner = "client!sb", name = "M", descriptor = "I")
    private int field3586;

    @OriginalMember(owner = "client!sb", name = "N", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!sb", name = "Q", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!sb", name = "T", descriptor = "I")
    private int field3593;

    @OriginalMember(owner = "client!sb", name = "U", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!sb", name = "V", descriptor = "I")
    private int field3595;

    @OriginalMember(owner = "client!sb", name = "W", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!sb", name = "R", descriptor = "Luf;")
    public static class176 field3591;

    @OriginalMember(owner = "client!sb", name = "P", descriptor = "Z")
    public static boolean field3589;

    @OriginalMember(owner = "client!sb", name = "O", descriptor = "[I")
    public static int[] field3588;

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(I)V")
    private class230(int arg0) {
        super(0, false);
        this.method1521(arg0, 119);
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)V")
    private final void method1521(int arg0, int arg1) {
        this.field3593 = 4080 & arg0 >> 12;
        if (arg1 > 36) {
            this.field3595 = 4080 & arg0 >> 4;
            ++field3587;
            this.field3586 = (arg0 & 255) << 4;
        }
    }

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "(I)V")
    public static void method1522(int arg0) {
        field3591 = null;
        if (arg0 != 17950) {
            field3589 = false;
        }
        field3588 = null;
        field3592 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLf;I)V")
    public final void method80(byte arg0, class37 arg1, int arg2) {
        if (arg0 == -79) {
            ++field3590;
            if (~arg2 == -1) {
                this.method1521(arg1.method336(arg0 ^ -23309), 68);
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
    public class230() {
        this(0);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IB)[[I")
    public final int[][] method82(int arg0, byte arg1) {
        ++field3594;
        int[][] var3 = super.field1248.method269(false, arg0);
        if (super.field1248.field550) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class178.field2662; ++var7) {
                var5[var7] = this.field3593;
                var4[var7] = this.field3595;
                var6[var7] = this.field3586;
            }
        }
        if (arg1 >= -112) {
            this.method80((byte) -41, (class37) null, 119);
        }
        return var3;
    }
}
