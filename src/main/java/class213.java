import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class213 {

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "[I")
    public static int[] field3239 = new int[100];

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static int field3240 = 127;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "[Lpa;")
    public static class2[] field3238;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V", line = 19)
    public static void method1487(int arg0) {
        field3239 = null;
        field3238 = null;
        if (arg0 != -22113) {
            method1489(-7, -73, (class323[]) null, (byte) 58, false, 2);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lgi;I)V", line = 45)
    public static final void method1488(class242 arg0, int arg1) {
        field3236++;
        if (arg1 != 127) {
            field3239 = (int[]) null;
        }
        int var2 = arg0.field3773 - class102.field1381;
        int var3 = arg0.field3761 * 128 + arg0.method412((byte) 76) * 64;
        int var4 = arg0.field3733 * 128 + (arg0.method412((byte) 75) * 64);
        arg0.field3713 = 0;
        arg0.field3767 += (var3 - arg0.field3767) / var2;
        arg0.field3763 += (var4 - arg0.field3763) / var2;
        if (arg0.field3770 == 0) {
            arg0.field3806 = 1024;
        }
        if (arg0.field3770 == 1) {
            arg0.field3806 = 1536;
        }
        if (arg0.field3770 == 2) {
            arg0.field3806 = 0;
        }
        if (arg0.field3770 == 3) {
            arg0.field3806 = 512;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II[Lhi;BZI)V", line = 79)
    public static final void method1489(int arg0, int arg1, class323[] arg2, byte arg3, boolean arg4, int arg5) {
        field3237++;
        for (int var6 = 0; var6 < arg2.length; var6++) {
            class323 var7 = arg2[var6];
            if (var7 != null && var7.field5196 == arg5) {
                class281.method2034(arg0, (byte) 96, arg1, arg4, var7);
                class324.method2256(var7, -84, arg1, arg0);
                if (var7.field5187 - var7.field5174 < var7.field5188) {
                    var7.field5188 = var7.field5187 - var7.field5174;
                }
                if (var7.field5142 > var7.field5186 - var7.field5169) {
                    var7.field5142 = var7.field5186 - var7.field5169;
                }
                if (var7.field5142 < 0) {
                    var7.field5142 = 0;
                }
                if (var7.field5188 < 0) {
                    var7.field5188 = 0;
                }
                if (var7.field5107 == 0) {
                    class310.method2194(arg4, 24206, var7);
                }
            }
        }
        if (arg3 >= -29) {
            method1487(-62);
        }
    }
}
