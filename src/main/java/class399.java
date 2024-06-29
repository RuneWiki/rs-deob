import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class399 {

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "I")
    public static int field5679;

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "I")
    public static int field5680;

    @OriginalMember(owner = "client!uv", name = "d", descriptor = "I")
    public static int field5681;

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "I")
    public static int field5682;

    @OriginalMember(owner = "client!uv", name = "g", descriptor = "I")
    public static int field5684;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "Luv;")
    public class399 field5678;

    @OriginalMember(owner = "client!uv", name = "f", descriptor = "Luv;")
    public class399 field5683;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)V", line = 4)
    public final void method2357(int arg0) {
        if (arg0 != 3553) {
            return;
        }
        field5681++;
        if (this.field5678 != null) {
            this.field5678.field5683 = this.field5683;
            this.field5683.field5678 = this.field5678;
            this.field5678 = null;
            this.field5683 = null;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)V", line = 22)
    public static final void method2358(byte arg0) {
        if (arg0 > 40) {
            field5682++;
            class104.field1268 = true;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIIII)V", line = 34)
    public static final void method2359(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class244.field3289 = arg0;
        field5679++;
        class612.field8350 = arg4;
        class34.field338 = arg2;
        int var5 = 119 % ((arg1 - 53) / 53);
        class623.field8476 = arg3;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IZ[IZILpea;)Lmm;", line = 48)
    public static final class459 method2360(int arg0, boolean arg1, int[] arg2, boolean arg3, int arg4, class641 arg5) {
        if (arg3) {
            return null;
        }
        field5684++;
        if (!arg5.field8965 && (!class144.method986(arg4, (byte) -120) || !class144.method986(arg0, (byte) -106))) {
            return arg5.field8993 ? new class459(arg5, 34037, arg4, arg0, arg1, arg2) : new class459(arg5, arg4, arg0, class306.method1837((byte) -126, arg4), class306.method1837((byte) -120, arg0), arg2);
        } else {
            return new class459(arg5, 3553, arg4, arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(BZ)I", line = 77)
    public static final int method2361(byte arg0, boolean arg1) {
        field5680++;
        if (class376.field5407 == null) {
            return 0;
        } else if (arg0 != -6) {
            return 6;
        } else if (arg1 || class422.field5874 == null) {
            int var2 = 0;
            for (int var3 = 0; var3 < class376.field5407.length; var3++) {
                int var4 = class376.field5407[var3];
                if (class284.field3836.method1086((byte) 124, var4)) {
                    var2++;
                }
                if (class482.field6486.method1086((byte) 113, var4)) {
                    var2++;
                }
            }
            return var2;
        } else {
            return class376.field5407.length * 2;
        }
    }
}
