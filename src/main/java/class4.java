import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 extends class80 {

    @OriginalMember(owner = "client!ft", name = "P", descriptor = "Lmo;")
    public static class531 field78 = new class531(8, 7);

    @OriginalMember(owner = "client!ft", name = "S", descriptor = "Ltn;")
    public static class60 field81 = new class60();

    @OriginalMember(owner = "client!ft", name = "I", descriptor = "I")
    private int field71;

    @OriginalMember(owner = "client!ft", name = "J", descriptor = "I")
    private int field72;

    @OriginalMember(owner = "client!ft", name = "K", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!ft", name = "L", descriptor = "I")
    private int field74;

    @OriginalMember(owner = "client!ft", name = "M", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!ft", name = "N", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!ft", name = "O", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!ft", name = "Q", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!ft", name = "R", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IILnn;)V", line = 4)
    public final void method26(int arg0, int arg1, class289 arg2) {
        int var4 = 35 / ((28 - arg1) / 53);
        ++field75;
        if (~arg0 == -1) {
            this.method30(16711680, arg2.method1863(-73));
        }
    }

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "(II)[[I", line = 31)
    public final int[][] method29(int arg0, int arg1) {
        ++field77;
        if (arg0 != 255) {
            this.method30(62, 79);
        }
        int[][] var3 = super.field1589.method859(arg1, 126);
        if (super.field1589.field1884) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class137.field2308; ++var7) {
                var4[var7] = this.field71;
                var5[var7] = this.field74;
                var6[var7] = this.field72;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "()V", line = 69)
    public class4() {
        this(0);
    }

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "(II)V", line = 73)
    private final void method30(int arg0, int arg1) {
        this.field74 = 4080 & arg1 >> 4;
        this.field72 = arg1 << 4 & 4080;
        this.field71 = (arg1 & arg0) >> 12;
        ++field73;
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(I)V", line = 83)
    private class4(int arg0) {
        super(0, false);
        this.method30(16711680, arg0);
    }

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "(I)V", line = 92)
    public static void method31(int arg0) {
        field78 = null;
        if (arg0 != 0) {
            field81 = null;
        }
        field81 = null;
    }

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "(B)V", line = 104)
    public static final void method32(byte arg0) {
        ++field76;
        int var1 = class186.field2990.method1781(class133.field2236, 123);
        if (~var1 != -1) {
            if (var1 == 1) {
                class82.method774((byte) 0, (byte) 125);
                class261.method1673(false, 512);
                if (class22.field333 != null) {
                    class259.method1665(-111);
                }
            } else {
                class82.method774((byte) (255 & class184.field2958 + -4), (byte) 37);
                class261.method1673(false, 2);
            }
        } else {
            class249.field3848 = null;
            class261.method1673(false, 0);
        }
        if (arg0 >= -45) {
            method32((byte) 90);
        }
        class448.field6672 = class211.field3371;
    }
}
