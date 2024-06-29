import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class185 {

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "Z")
    public static boolean field2364 = false;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "Lra;")
    public static class361 field2365 = new class361(50, 8);

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "[Z")
    public static boolean[] field2367 = new boolean[100];

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)Z")
    public static final boolean method1233(int arg0) {
        int var1 = 85 % ((68 - arg0) / 37);
        field2368++;
        return class291.field3758 > 0;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
    public static void method1234(byte arg0) {
        field2367 = null;
        field2365 = null;
        if (arg0 < 0) {
            method1233(125);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIII)I")
    public static final int method1235(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        field2366++;
        if (var4 == 0) {
            return arg2;
        } else if (arg1 == var4) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return 7 - arg3;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1236(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class24 var7 = new class24();
        var7.field268 = arg1 >> class291.field3760;
        var7.field266 = arg2 >> class291.field3760;
        var7.field275 = arg3 >> class291.field3760;
        var7.field270 = arg4 >> class291.field3760;
        var7.field260 = arg0;
        var7.field272 = arg1;
        var7.field277 = arg2;
        var7.field265 = arg3;
        var7.field276 = arg4;
        var7.field271 = arg5;
        var7.field267 = arg6;
        class473.field6165[class314.field4069++] = var7;
    }
}
