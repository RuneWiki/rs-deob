import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class147 implements class409 {

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public int field2141;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
    public int field2152;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public int field2139;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public int field2145;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
    public int field2150;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public int field2144;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public int field2143;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public int field2142;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "Leda;")
    public class14 field2151;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "Z")
    public boolean field2147;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "Lcga;")
    public class141 field2148;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field2140 = 0;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "Lhr;")
    public static class57 field2153 = new class57(4, 1);

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "Z")
    public static boolean field2154 = false;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "Z")
    public static boolean field2155;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V", line = 4)
    public static void method1036(int arg0) {
        field2153 = null;
        if (arg0 != 16) {
            field2153 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)Lhr;", line = 14)
    public final class57 method478(int arg0) {
        field2146++;
        if (arg0 < 30) {
            method1036(-40);
        }
        return field2153;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BII)V", line = 41)
    public static final void method1037(byte arg0, int arg1, int arg2) {
        field2149++;
        if (arg0 != -39) {
            return;
        }
        if (class249.field3628 != 0) {
            if (arg1 < 0) {
                for (int var3 = 0; var3 < 16; var3++) {
                    class281.field3932[var3] = arg2;
                }
            } else {
                class281.field3932[arg1] = arg2;
            }
        }
        class36.field325.method1979(arg2, (byte) 117, arg1);
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(ILeda;Lcga;IIIIIIIZ)V", line = 78)
    public class147(int arg0, class14 arg1, class141 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        this.field2141 = arg3;
        this.field2152 = arg7;
        this.field2139 = arg9;
        this.field2145 = arg6;
        this.field2150 = arg5;
        this.field2144 = arg4;
        this.field2143 = arg0;
        this.field2142 = arg8;
        this.field2151 = arg1;
        this.field2147 = arg10;
        this.field2148 = arg2;
    }
}
