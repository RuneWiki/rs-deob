import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class25 {

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "Ljava/lang/String;")
    public static String field350 = "Loaded interfaces";

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field347 = -1;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field354 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "Ln;")
    public static class309 field353;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lcg;I)V", line = 6)
    public static final void method234(class49 arg0, int arg1) {
        class224.field3749 = arg0;
        if (arg1 == 33) {
            field349++;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIIII)I", line = 29)
    public static final int method235(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg3 & 0x3;
        if ((arg5 & 0x1) == 1) {
            int var8 = arg0;
            arg0 = arg1;
            arg1 = var8;
        }
        field352++;
        if (var7 == 0) {
            return arg4;
        }
        if (arg2 < 63) {
            method236((byte) -102);
        }
        if (var7 == 1) {
            return 7 - (arg0 - 1) - arg6;
        } else if (var7 == 2) {
            return 7 - arg4 - (arg1 + -1);
        } else {
            return arg6;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V", line = 64)
    public static void method236(byte arg0) {
        field350 = null;
        if (arg0 <= 107) {
            method236((byte) 60);
        }
        field353 = null;
    }
}
