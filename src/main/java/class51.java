import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class51 extends class20 {

    @OriginalMember(owner = "client!gg", name = "y", descriptor = "[Lch;")
    public static class114[] field806 = new class114[4];

    @OriginalMember(owner = "client!gg", name = "C", descriptor = "[S")
    public static short[] field810 = new short[500];

    @OriginalMember(owner = "client!gg", name = "D", descriptor = "I")
    public static int field811 = 0;

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!gg", name = "x", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!gg", name = "A", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!gg", name = "B", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "Lwc;")
    public static class185 field802;

    @OriginalMember(owner = "client!gg", name = "w", descriptor = "Lgg;")
    public class51 field804;

    @OriginalMember(owner = "client!gg", name = "z", descriptor = "Lgg;")
    public class51 field807;

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "Ljava/lang/String;")
    public static String field800;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "[[[Laa;")
    public static class36[][][] field799;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILth;)I", line = 17)
    public static final int method394(int arg0, class57 arg1) {
        field801++;
        int var2 = arg0;
        if (arg1.method452(class172.field2752, (byte) -19)) {
            var2 = arg0 + 1;
        }
        if (arg1.method452(class12.field105, (byte) -122)) {
            var2++;
        }
        if (arg1.method452(class210.field3323, (byte) 106)) {
            var2++;
        }
        if (arg1.method452(class63.field1131, (byte) -127)) {
            var2++;
        }
        if (arg1.method452(class327.field5200, (byte) -128)) {
            var2++;
        }
        if (arg1.method452(class54.field894, (byte) 48)) {
            var2++;
        }
        if (arg1.method452(class190.field3050, (byte) 80)) {
            var2++;
        }
        if (arg1.method452(class50.field790, (byte) 64)) {
            var2++;
        }
        if (arg1.method452(class200.field3191, (byte) -123)) {
            var2++;
        }
        if (arg1.method452(class234.field3885, (byte) -128)) {
            var2++;
        }
        if (arg1.method452(class116.field1938, (byte) -119)) {
            var2++;
        }
        if (arg1.method452(class10.field82, (byte) -125)) {
            var2++;
        }
        if (arg1.method452(class131.field2225, (byte) 125)) {
            var2++;
        }
        if (arg1.method452(class113.field1851, (byte) -122)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(Z)V", line = 73)
    public final void method395(boolean arg0) {
        field808++;
        if (this.field804 == null) {
            return;
        }
        this.field804.field807 = this.field807;
        if (arg0) {
            this.field807 = (class51) null;
        }
        this.field807.field804 = this.field804;
        this.field807 = null;
        this.field804 = null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILqm;)Lqi;", line = 91)
    public static final class317 method396(int arg0, class227 arg1) {
        field805++;
        if (arg0 > -120) {
            field802 = (class185) null;
        }
        return new class317(arg1.method1769(-30726), arg1.method1769(-30726), arg1.method1769(-30726), arg1.method1769(-30726), arg1.method1736(255), arg1.method1736(255), arg1.method1720((byte) -12));
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZLwf;)V", line = 107)
    public static final void method397(boolean arg0, class250 arg1) {
        field809++;
        if (arg0) {
            field806 = (class114[]) null;
        }
        int var2 = arg1.field4134;
        if (var2 == 324) {
            if (class350.field5549 == -1) {
                class350.field5549 = arg1.field4178;
                class304.field4882 = arg1.field4107;
            }
            if (class241.field3978.field1935) {
                arg1.field4178 = class350.field5549;
            } else {
                arg1.field4178 = class304.field4882;
            }
        } else if (var2 == 325) {
            if (class350.field5549 == -1) {
                class350.field5549 = arg1.field4178;
                class304.field4882 = arg1.field4107;
            }
            if (class241.field3978.field1935) {
                arg1.field4178 = class304.field4882;
            } else {
                arg1.field4178 = class350.field5549;
            }
        } else if (var2 == 327) {
            arg1.field4084 = 150;
            arg1.field4139 = (int) (Math.sin((double) class332.field5261 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field4197 = 5;
            arg1.field4238 = -1;
        } else if (var2 == 328) {
            if (class6.field55.field4349 == null) {
                arg1.field4238 = 0;
                arg1.field4222 = 0;
            } else {
                arg1.field4084 = 150;
                arg1.field4139 = (int) (Math.sin((double) class332.field5261 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field4197 = 5;
                arg1.field4238 = 2047;
                arg1.field4222 = class71.method610(class6.field55.field4349, (byte) -124);
                arg1.field4116 = class6.field55.field3554;
                arg1.field4114 = 0;
                arg1.field4063 = class6.field55.field3544;
                arg1.field4135 = class6.field55.field3532;
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)V", line = 183)
    public static void method398(int arg0) {
        field800 = null;
        field806 = null;
        field810 = null;
        if (arg0 == 150) {
            field802 = null;
            field799 = (class36[][][]) null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B[B)[B", line = 200)
    public static final byte[] method399(byte arg0, byte[] arg1) {
        if (arg0 < 122) {
            method398(-38);
        }
        field803++;
        if (arg1 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg1.length];
            class242.method1841(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }
}
