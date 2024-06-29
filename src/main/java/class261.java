import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class261 {

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public int field3838 = 0;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    public int field3842 = 0;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "Z")
    private boolean field3843 = false;

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "Z")
    public static boolean field3852 = false;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public int field3833;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public int field3836;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    private int field3837;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public int field3839;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    public int field3840;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
    public int field3844;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
    public int field3846;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
    public int field3847;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
    public int field3848;

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "I")
    public int field3849;

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "J")
    public long field3835;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BLiv;)V", line = 5)
    public final void method1673(byte arg0, class65 arg1) {
        while (true) {
            int var3 = arg1.method577(255);
            if (var3 == 0) {
                field3851++;
                int var4 = -123 / ((22 - arg0) / 57);
                return;
            }
            this.method1677(var3, arg1, true);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V", line = 34)
    public static final void method1674(int arg0) {
        class139.field1978 = new class86(arg0);
        field3850++;
        class40.field457 = 0;
        for (class189 var1 = (class189) class229.field3359.method2955(62); var1 != null; var1 = (class189) class229.field3359.method2952((byte) -79)) {
            var1.method1325();
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)V", line = 57)
    public final void method1675(boolean arg0) {
        field3834++;
        if (!arg0) {
            this.field3837 = 20;
        }
        this.field3839 = class340.field4715[this.field3837 << 3];
        this.field3833 = (int) Math.sqrt((double) (this.field3844 * this.field3844 + (this.field3840 * this.field3840) + (this.field3848 * this.field3848)));
        if (this.field3847 == 0) {
            this.field3847 = 1;
        }
        if (this.field3849 == 0) {
            this.field3835 = 2147483647L;
        } else if (this.field3849 == 1) {
            this.field3835 = (this.field3833 * 8 / this.field3847);
            this.field3835 *= this.field3835;
        } else if (this.field3849 == 2) {
            this.field3835 = (this.field3833 * 8 / this.field3847);
        }
        if (this.field3843) {
            this.field3833 *= -1;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BI)I", line = 101)
    public static final int method1676(byte arg0, int arg1) {
        field3845++;
        if (arg0 != -11) {
            field3852 = false;
        }
        if (arg1 == 6406) {
            return 1;
        } else if (arg1 == 6409) {
            return 1;
        } else if (arg1 == 32841) {
            return 1;
        } else if (arg1 == 6410) {
            return 2;
        } else if (arg1 == 6407) {
            return 3;
        } else if (arg1 == 6408) {
            return 4;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILiv;Z)V", line = 149)
    private final void method1677(int arg0, class65 arg1, boolean arg2) {
        if (!arg2) {
            this.method1677(-79, null, true);
        }
        if (arg0 == 1) {
            this.field3837 = arg1.method623((byte) -39);
        } else if (arg0 == 2) {
            arg1.method577(255);
        } else if (arg0 == 3) {
            this.field3844 = arg1.method616((byte) 127);
            this.field3840 = arg1.method616((byte) 89);
            this.field3848 = arg1.method616((byte) 81);
        } else if (arg0 == 4) {
            this.field3849 = arg1.method577(255);
            this.field3847 = arg1.method616((byte) 96);
        } else if (arg0 == 6) {
            this.field3836 = arg1.method577(255);
        } else if (arg0 == 8) {
            this.field3842 = 1;
        } else if (arg0 == 9) {
            this.field3838 = 1;
        } else if (arg0 == 10) {
            this.field3843 = true;
        }
        field3841++;
    }
}
